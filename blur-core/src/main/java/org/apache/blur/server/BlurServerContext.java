/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.blur.server;

import java.net.SocketAddress;

import org.apache.blur.log.Log;
import org.apache.blur.log.LogFactory;
import org.apache.blur.thirdparty.thrift_0_9_0.server.ServerContext;
import org.apache.blur.thrift.generated.User;

public class BlurServerContext implements ServerContext {
  
  private static final Log LOG = LogFactory.getLog(BlurServerContext.class);
  
  private User _user;
  private final SocketAddress _localSocketAddress;
  private final SocketAddress _remoteSocketAddress;
  private final String _connectionString;

  public BlurServerContext(SocketAddress localSocketAddress, SocketAddress remoteSocketAddress) {
    _localSocketAddress = localSocketAddress;
    _remoteSocketAddress = remoteSocketAddress;
    _connectionString = _localSocketAddress.toString() + "\t" + _remoteSocketAddress.toString();
  }
  
  public void setUser(User user) {
    LOG.info("User [{0}] for context [{1}]", user, this);
    _user = user;
  }

  public User getUser() {
    return _user;
  }
  
  public SocketAddress getRocalSocketAddress() {
    return _localSocketAddress;
  }

  public SocketAddress getRemoteSocketAddress() {
    return _remoteSocketAddress;
  }

  public String getConnectionString() {
    return _connectionString;
  }

}
