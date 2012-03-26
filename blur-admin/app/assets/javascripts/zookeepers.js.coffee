$(document).ready ->
  ONLINE='btn-success'
  OFFLINE='btn-danger'
  WARNING='btn-warning'
  NA=''
  
  # Updates all fields on the dashboard
  load_dashboard = () ->
    $.getJSON Routes.dashboard_path(), (data) ->
      # Updates the fields for each zookeeper
      for index, storedZK of Zookeeper.instances
        safe = false
        for ZK in data.zookeeper_data
          if ZK.id == storedZK.id
            safe = true
            break
        if !safe
          delete Zookeeper.instances[index]
      $('.updated').removeClass('updated')
      $.each( data.zookeeper_data, ->
        zookeeper_table = $('.zookeeper_info').find("#" + this.id )
        new_table = !zookeeper_table.length > 0
        if new_table
          zookeeper_new = $($('.zookeeper_info')[0]).clone()
          zookeeper_table = zookeeper_new.find('table')
          zookeeper_table.attr('id', this.id)
        zookeeper_table.closest('.zookeeper_info').addClass('updated')
        # Updates the header showing the zookeeper status
        current_zookeeper = zookeeper_table.find(".zookeeper-title")
        if this.status == 1
          zookeeper_table.closest(".zookeeper_info")
                          .addClass('online')
                          .removeClass('offline')
          current_zookeeper.removeClass(OFFLINE)
                          .addClass(ONLINE)
                          .find('.zookeeper-status')
                          .html('<div> - Online</div>')
        else
          zookeeper_table.closest(".zookeeper_info")
                          .addClass('offline')
                          .removeClass('online')
          current_zookeeper.removeClass(ONLINE)
                          .addClass(OFFLINE)
                          .find('.zookeeper-status')
                          .html('<div> - Offline</div>')

        # Updates the warning for long queries
        query_message = '<div></div>'
        if parseInt(this.long_running_queries) > 0
          if parseInt(this.long_running_queries,10) == 1
            query_message = '<div><a href="' + Routes.blur_queries_path({id: this.id}) + '" class="long_running_queries">1</a> query has been running for more than a minute</div>'
          else
            query_message = '<div><a href="' + Routes.blur_queries_path({id: this.id}) + '" class="long_running_queries">' + parseInt(this.long_running_queries) + '</a> queries have been running for more than a minute</div>'
        zookeeper_table.find('.warning').html(query_message)

        # Updates the fields for the zookeeper's shards
        status_shards = zookeeper_table.find(".stat-shard")
        bv_shards = zookeeper_table.find(".bv-shard")

        if this.shard_total == 0
          bv_shards.find('.shards-bv')
                  .removeClass(ONLINE)
                  .removeClass(OFFLINE)
                  .addClass(NA)
                  .html('<div>No Shards Available</div>')
        else if parseInt(this.shard_version, 10) == 1
          bv_shards.find('.shards-bv')
                  .removeClass(OFFLINE)
                  .removeClass(NA)
                  .addClass(ONLINE)
                  .html('<div>Consistent Blur Versions</div>')
        else if parseInt(this.shard_version, 10) > 1
          bv_shards.find('.shards-bv')
                  .removeClass(ONLINE)
                  .removeClass(NA)
                  .addClass(OFFLINE)
                  .html('<div>Inconsistent Blur Versions</div>')

        number_shards_online = parseInt(this.shard_total,10) - parseInt(this.shard_offline_node,10)
        status_shards.find('.shards-online .number').html(number_shards_online)
        if parseInt(this.shard_offline_node,10) == 0
          status_shards.find('.shards-offline .number').html('')
        else
          status_shards.find('.shards-offline .number').html(parseInt(this.shard_offline_node,10))
        if(this.shard_total>0)
          status_shards.find('.shards-online').css('width',(number_shards_online/this.shard_total*100)+'%')

        # Updates the fields for the zookeeper's controllers
        status_controllers = zookeeper_table.find(".stat-cont")
        bv_controllers = zookeeper_table.find(".bv-cont")

        if this.controller_total == 0
          bv_controllers.find('.controllers-bv')
                        .removeClass(ONLINE)
                        .removeClass(OFFLINE)
                        .addClass(NA)
                        .html('<div>No Controllers Available</div>')
        else if parseInt(this.controller_version, 10) == 1
          bv_controllers.find('.controllers-bv')
                        .removeClass(NA)
                        .removeClass(OFFLINE)
                        .addClass(ONLINE)
                        .html('<div>Consistent Blur Versions</div>')
        else if parseInt(this.controller_version, 10) > 1
          bv_controllers.find('.controllers-bv')
                        .removeClass(NA)
                        .removeClass(ONLINE)
                        .addClass(OFFLINE)
                        .html('<div>Inconsistent Blur Versions</div>')

        number_controllers_online = parseInt(this.controller_total,10) - parseInt(this.controller_offline_node,10)
        status_controllers.find('.controllers-online .number').html(number_controllers_online)

        if parseInt(this.controller_offline_node,10) == 0
          status_controllers.find('.controllers-offline .number').html('')
        else
          status_controllers.find('.controllers-offline .number').html(parseInt(this.controller_offline_node,10))
        if(this.controller_total>0)
          status_shards.find('.controllers-online').css('width',(number_controllers_online/this.controller_total*100)+'%')

        if new_table
          $('#zookeepers').append(zookeeper_new)
          Zookeeper.push
            id: this.id
            name: this.name

        $('#zookeepers_wrapper').show()
      )


      ###
      #HDFS Update
      ###
      $.each( data.hdfs_data, ->
        hdfs_table = $('.hdfs_info').find("#" + this.id )
        new_table = !hdfs_table.length > 0
        if new_table
          hdfs_new = $($('.hdfs_info')[0]).clone()
          hdfs_table = hdfs_new.find('table')
          hdfs_table.attr('id', this.id)
        hdfs_table.closest('.hdfs_info').addClass('updated')
        status = 'online'

        if this.stats == null
          this.stats = {}

        # Update block counts
        corr_blocks= hdfs_table.find(".blocks-corr")
        corr_blocks.find('> .number').html(this.stats.corrupt_blocks)
        missing_blocks = hdfs_table.find(".blocks-miss")
        missing_blocks.find('> .number').html(this.stats.missing_blocks)

        # Update the block colors
        if this.stats && this.stats.corrupt_blocks == 0
          corr_blocks.addClass(ONLINE).removeClass(OFFLINE).removeClass(NA)
        else if this.stats.corrupt_blocks > 0
          status = 'offline'
          corr_blocks.removeClass(ONLINE).addClass(OFFLINE).removeClass(NA)
        else
          corr_blocks.removeClass(ONLINE).removeClass(OFFLINE).addClass(NA)

        if this.stats.missing_blocks == 0
          missing_blocks.addClass(ONLINE).removeClass(OFFLINE).removeClass(NA)
        else if this.stats.missing_blocks > 0
          status = 'offline'
          missing_blocks.removeClass(ONLINE).addClass(OFFLINE).removeClass(NA)
        else
          missing_blocks.removeClass(ONLINE).removeClass(OFFLINE).addClass(NA)
      
        # Update node counts
        live_nodes= hdfs_table.find(".nodes-live")
        live_nodes.find('.number').html(this.stats.live_nodes)
        dead_nodes= hdfs_table.find(".nodes-dead")
        dead_nodes.find('.number').html(this.stats.dead_nodes)
        nodes_total = this.stats.live_nodes+this.stats.dead_nodes;
        if(nodes_total > 0)
          dead_nodes.css('width',(this.stats.live_nodes/nodes_total*100)+'%')
        under_nodes= hdfs_table.find(".nodes-under")
        under_nodes.find('> .number').html(this.stats.under_replicated)

        # Update node colors
        if this.stats.under_replicated == 0
          under_nodes.addClass(ONLINE).removeClass(WARNING)
        else
          under_nodes.removeClass(ONLINE).addClass(WARNING)
          if status != 'offline'
              status = 'warning'


        #update the table css
        if status == 'offline'
          hdfs_table.find('.hdfs-title').addClass(OFFLINE).removeClass(ONLINE).removeClass(WARNING)
        else if status == 'wrning'
          hdfs_table.find('.hdfs-title').removeClass(OFFLINE).removeClass(ONLINE).addClass(WARNING)
        else
          hdfs_table.find('.hdfs-title').removeClass(OFFLINE).addClass(ONLINE).removeClass(WARNING)
        hdfs_table.closest('.hdfs_info').removeClass('online').removeClass('offline').removeClass('wrning').addClass(status)

        if new_table
          $('#hdfses').append(hdfs_new)

        $('#hdfs_dash_wrapper').show()
      )
      $('.zookeeper_info:not(.updated), .hdfs_info:not(.updated)').remove()

      # Sets auto updates to run every 5 secs
      setTimeout(load_dashboard, 5000)

  if (typeof Zookeeper != 'undefined' && Zookeeper.instances)
    $('#env_link, #tables_link, #queries_link, #search_link').click (evt) ->
      self = this
      if Zookeeper.instances.length == 0
        alert 'There are no Zookeeper Instances registered yet.  This page will not work until then.'
        return false
      else if Zookeeper.instances.length == 1
        return
      else
        select_box = "<div style='text-align:center'><select id='zookeeper_selector' style='font-size: 20px'><option value=''></option>"
        $.each(Zookeeper.instances, () ->
          select_box += "<option value='" + this.id + "'>" + this.name + "</option>"
        )
        select_box += "</select></div>"
        $().popup
          body: select_box
          title: 'Select a Zookeeper Instance to use:'
          shown: () ->
            $('#zookeeper_selector').change ->
              window.location = Routes.zookeeper_path({id: $(this).val()}); 
        return false

  load_dashboard()

  $('.zookeeper_info').live 'click', ->
    window.location = Routes.zookeeper_path({id: $(this).children('table').attr('id')})

