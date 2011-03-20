namespace java com.nearinfinity.blur.thrift.generated


exception BlurException {
  1:string message
}

enum ScoreType {
  SUPER,
  AGGREGATE,
  BEST,
  CONSTANT
}

struct Facet {
  1:string queryStr,
  2:i64 minimumNumberOfBlurResults
}

struct BlurQuery {
  1:string queryStr,
  2:bool superQueryOn = 1,
  3:ScoreType type = ScoreType.SUPER, 
  4:string postSuperFilter,
  5:string preSuperFilter,
  6:i64 start = 0,
  7:i32 fetch = 10, 
  8:i64 minimumNumberOfResults = 9223372036854775807,
  9:i64 maxQueryTime = 9223372036854775807,
  10:i64 uuid,
  11:string userId,
  12:bool resolveIds,
  13:list<Facet> facets
}

struct BlurQuerySuggestion {
  1:string queryStr,
  2:i64 totalResults = 0,
  3:map<string,i64> shardInfo,
  4:list<BlurException> exceptions,
  5:BlurQuery query,
  6:i64 realTime,
  7:i64 cpuTime
}

struct BlurQuerySuggestions {
  1:list<BlurQuerySuggestion> querySuggestions
}

struct BlurResult {
  1:string locationId,
  2:double score,
  3:string reason = "UNKNOWN"
}

struct BlurResults {
  1:i64 totalResults = 0,
  2:map<string,i64> shardInfo,
  3:list<BlurResult> results,
  4:list<BlurException> exceptions,
  5:BlurQuery query,
  6:i64 realTime,
  7:i64 cpuTime,
  8:list<i64> facetCounts
}

struct TableDescriptor {
  1:bool isEnabled,
  2:string analyzerDef,
  3:list<string> shardNames
}

struct Column {
  1:string name,
  2:list<string> values
}

struct ColumnFamily {
  1:string family,
  2:map<string,set<Column>> records
}

struct Row {
  1:string id,
  2:set<ColumnFamily> columnFamilies
}

struct FetchResult {
  1:bool exists,
  2:bool deleted,
  3:string table,
  4:Row row,
  5:set<Column> record
}

struct Selector {
  1:bool recordOnly,
  2:string locationId,
  3:set<string> columnFamiliesToFetch,
  4:map<string,set<string>> columnsToFetch
}

struct BlurQueryStatus {
  1:BlurQuery query,
  2:i64 realTime,
  3:i64 cpuTime,
  4:double complete,
  5:bool running,
  6:bool interrupted,
  7:i64 uuid
}

struct Schema {
  1:string table,
  2:map<string,set<string>> columnFamilies
}

enum RecordMutationType {
  DELETE_ENTIRE_RECORD,
  REPLACE_ENTIRE_RECORD,
  REPLACE_COLUMNS,
  APPEND_COLUMN_VALUES
}

struct RecordMutation {
  1:RecordMutationType recordMutationType,
  2:string family,
  3:string recordId,
  4:set<Column> record
}

enum RowMutationType {
  DELETE_ROW,
  REPLACE_ROW,
  UPDATE_ROW
}

struct RowMutation {
  1:RowMutationType rowMutationType,
  2:string rowId,
  3:list<RecordMutation> recordMutations
}

service Blur {
  list<string> shardServerList() throws (1:BlurException ex)
  list<string> controllerServerList() throws (1:BlurException ex)
  map<string,string> shardServerLayout(1:string table) throws (1:BlurException ex)

  list<string> tableList() throws (1:BlurException ex)
  TableDescriptor describe(1:string table) throws (1:BlurException ex)

  BlurResults query(1:string table, 2:BlurQuery blurQuery) throws (1:BlurException ex)
  void cancelQuery(1:string table, 2:i64 uuid) throws (1:BlurException ex)
  list<BlurQueryStatus> currentQueries(1:string table) throws (1:BlurException ex)

  BlurQuerySuggestions querySuggestions(1:string table, 2:BlurQuery blurQuery) throws (1:BlurException ex)

  Schema schema(1:string table) throws (1:BlurException ex)
  list<string> terms(1:string table, 2:string columnFamily, 3:string columnName, 4:string startWith, 5:i16 size) throws (1:BlurException ex)
  i64 recordFrequency(1:string table, 2:string columnFamily, 3:string columnName, 4:string value) throws (1:BlurException ex)

  FetchResult fetchRow(1:string table, 2:Selector selector) throws (1:BlurException ex)

  void mutate(1:list<RowMutation> mutations) throws (1:BlurException ex)
}

