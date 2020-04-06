package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadEncryptTable.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadEncryptTableExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadEncryptTable.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends LoadEncryptTableExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ChunkSizeCell) at LoadEncryptTable.pcf: line 89, column 54
    function valueRoot_40 () : java.lang.Object {
      return encryptChunk
    }
    
    // 'value' attribute on TextCell (id=ChunkSizeCell) at LoadEncryptTable.pcf: line 89, column 54
    function value_38 () : java.lang.Integer {
      return encryptChunk.ChunkSize
    }
    
    // 'value' attribute on TextCell (id=teStartTime) at LoadEncryptTable.pcf: line 93, column 126
    function value_41 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(encryptChunk.StartTime , "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=teEndTime) at LoadEncryptTable.pcf: line 97, column 124
    function value_43 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(encryptChunk.EndTime , "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=teDuration) at LoadEncryptTable.pcf: line 101, column 107
    function value_45 () : java.lang.String {
      return PageHelper.getDurationString(encryptChunk.StartTime, encryptChunk.EndTime)
    }
    
    property get encryptChunk () : entity.LoadEncryptChunk {
      return getIteratedValue(1) as entity.LoadEncryptChunk
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadEncryptTable.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LoadEncryptTableExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=teTableName) at LoadEncryptTable.pcf: line 29, column 47
    function valueRoot_11 () : java.lang.Object {
      return tableEncrypt
    }
    
    // 'value' attribute on TextCell (id=teEncryptCols) at LoadEncryptTable.pcf: line 33, column 54
    function value_12 () : java.lang.String {
      return tableEncrypt.ColumnsToEncrypt
    }
    
    // 'value' attribute on TextCell (id=teSelectStmt) at LoadEncryptTable.pcf: line 37, column 48
    function value_15 () : java.lang.String {
      return tableEncrypt.SelectStmt
    }
    
    // 'value' attribute on TextCell (id=teUpdateStmt) at LoadEncryptTable.pcf: line 41, column 48
    function value_18 () : java.lang.String {
      return tableEncrypt.UpdateStmt
    }
    
    // 'value' attribute on TextCell (id=geSizeOfTimedChuck) at LoadEncryptTable.pcf: line 46, column 46
    function value_21 () : java.lang.Integer {
      return tableEncrypt.SizeOfTimedChuck
    }
    
    // 'value' attribute on TextCell (id=teAffectedRowCount) at LoadEncryptTable.pcf: line 51, column 46
    function value_24 () : java.lang.Integer {
      return tableEncrypt.AffectedRowCount
    }
    
    // 'value' attribute on TextCell (id=teStartTime) at LoadEncryptTable.pcf: line 55, column 118
    function value_27 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(tableEncrypt.StartTime , "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=teEndTime) at LoadEncryptTable.pcf: line 59, column 116
    function value_29 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(tableEncrypt.EndTime , "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=teDuration) at LoadEncryptTable.pcf: line 63, column 99
    function value_31 () : java.lang.String {
      return PageHelper.getDurationString(tableEncrypt.StartTime, tableEncrypt.EndTime)
    }
    
    // 'value' attribute on TextCell (id=teTableName) at LoadEncryptTable.pcf: line 29, column 47
    function value_9 () : java.lang.String {
      return tableEncrypt.TableName
    }
    
    property get tableEncrypt () : entity.LoadEncryptTable {
      return getIteratedValue(1) as entity.LoadEncryptTable
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadEncryptTable.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadEncryptTableExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=TableEncryptRowIterator) at LoadEncryptTable.pcf: line 29, column 47
    function sortValue_0 (tableEncrypt :  entity.LoadEncryptTable) : java.lang.Object {
      return tableEncrypt.TableName
    }
    
    // 'value' attribute on RowIterator (id=TableEncryptRowIterator) at LoadEncryptTable.pcf: line 33, column 54
    function sortValue_1 (tableEncrypt :  entity.LoadEncryptTable) : java.lang.Object {
      return tableEncrypt.ColumnsToEncrypt
    }
    
    // 'value' attribute on RowIterator (id=TableEncryptRowIterator) at LoadEncryptTable.pcf: line 37, column 48
    function sortValue_2 (tableEncrypt :  entity.LoadEncryptTable) : java.lang.Object {
      return tableEncrypt.SelectStmt
    }
    
    // 'value' attribute on RowIterator (id=TableEncryptRowIterator) at LoadEncryptTable.pcf: line 41, column 48
    function sortValue_3 (tableEncrypt :  entity.LoadEncryptTable) : java.lang.Object {
      return tableEncrypt.UpdateStmt
    }
    
    // 'value' attribute on RowIterator at LoadEncryptTable.pcf: line 89, column 54
    function sortValue_34 (encryptChunk :  entity.LoadEncryptChunk) : java.lang.Object {
      return encryptChunk.ChunkSize
    }
    
    // 'value' attribute on RowIterator at LoadEncryptTable.pcf: line 93, column 126
    function sortValue_35 (encryptChunk :  entity.LoadEncryptChunk) : java.lang.Object {
      return gw.api.util.StringUtil.formatDate(encryptChunk.StartTime , "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on RowIterator at LoadEncryptTable.pcf: line 97, column 124
    function sortValue_36 (encryptChunk :  entity.LoadEncryptChunk) : java.lang.Object {
      return gw.api.util.StringUtil.formatDate(encryptChunk.EndTime , "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on RowIterator at LoadEncryptTable.pcf: line 101, column 107
    function sortValue_37 (encryptChunk :  entity.LoadEncryptChunk) : java.lang.Object {
      return PageHelper.getDurationString(encryptChunk.StartTime, encryptChunk.EndTime)
    }
    
    // 'value' attribute on RowIterator (id=TableEncryptRowIterator) at LoadEncryptTable.pcf: line 46, column 46
    function sortValue_4 (tableEncrypt :  entity.LoadEncryptTable) : java.lang.Object {
      return tableEncrypt.SizeOfTimedChuck
    }
    
    // 'value' attribute on RowIterator (id=TableEncryptRowIterator) at LoadEncryptTable.pcf: line 51, column 46
    function sortValue_5 (tableEncrypt :  entity.LoadEncryptTable) : java.lang.Object {
      return tableEncrypt.AffectedRowCount
    }
    
    // 'value' attribute on RowIterator (id=TableEncryptRowIterator) at LoadEncryptTable.pcf: line 55, column 118
    function sortValue_6 (tableEncrypt :  entity.LoadEncryptTable) : java.lang.Object {
      return gw.api.util.StringUtil.formatDate(tableEncrypt.StartTime , "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on RowIterator (id=TableEncryptRowIterator) at LoadEncryptTable.pcf: line 59, column 116
    function sortValue_7 (tableEncrypt :  entity.LoadEncryptTable) : java.lang.Object {
      return gw.api.util.StringUtil.formatDate(tableEncrypt.EndTime , "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on RowIterator (id=TableEncryptRowIterator) at LoadEncryptTable.pcf: line 63, column 99
    function sortValue_8 (tableEncrypt :  entity.LoadEncryptTable) : java.lang.Object {
      return PageHelper.getDurationString(tableEncrypt.StartTime, tableEncrypt.EndTime)
    }
    
    // 'value' attribute on RowIterator (id=TableEncryptRowIterator) at LoadEncryptTable.pcf: line 24, column 49
    function value_33 () : entity.LoadEncryptTable[] {
      return History.EncryptTables
    }
    
    // 'value' attribute on RowIterator at LoadEncryptTable.pcf: line 83, column 57
    function value_47 () : entity.LoadEncryptChunk[] {
      return selectedEncryptTable.LoadEncryptChunks
    }
    
    property get History () : LoadCommand {
      return getRequireValue("History", 0) as LoadCommand
    }
    
    property set History ($arg :  LoadCommand) {
      setRequireValue("History", 0, $arg)
    }
    
    property get PageHelper () : gw.api.tools.LoadHistoryHelper {
      return getRequireValue("PageHelper", 0) as gw.api.tools.LoadHistoryHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.LoadHistoryHelper) {
      setRequireValue("PageHelper", 0, $arg)
    }
    
    property get selectedEncryptTable () : LoadEncryptTable {
      return getCurrentSelection(0) as LoadEncryptTable
    }
    
    property set selectedEncryptTable ($arg :  LoadEncryptTable) {
      setCurrentSelection(0, $arg)
    }
    
    
  }
  
  
}