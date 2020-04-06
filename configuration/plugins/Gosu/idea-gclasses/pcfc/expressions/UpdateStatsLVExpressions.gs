package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/UpdateStatsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UpdateStatsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/UpdateStatsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends UpdateStatsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=LVGetZip) at UpdateStatsLV.pcf: line 32, column 44
    function action_1 () : void {
      PageHelper.downloadDatabaseUpdateStats(Row)
    }
    
    // 'action' attribute on Link (id=LVDelete) at UpdateStatsLV.pcf: line 44, column 44
    function action_3 () : void {
      PageHelper.deleteDatabaseUpdateStats(Row)
    }
    
    // 'value' attribute on TextCell (id=LVDescription) at UpdateStatsLV.pcf: line 50, column 36
    function valueRoot_6 () : java.lang.Object {
      return Row
    }
    
    // 'value' attribute on DateCell (id=LVStartTime) at UpdateStatsLV.pcf: line 63, column 24
    function value_10 () : java.util.Date {
      return Row.StartTime
    }
    
    // 'value' attribute on DateCell (id=LVEndTime) at UpdateStatsLV.pcf: line 71, column 24
    function value_13 () : java.util.Date {
      return Row.EndTime
    }
    
    // 'value' attribute on TextCell (id=LVDescription) at UpdateStatsLV.pcf: line 50, column 36
    function value_4 () : java.lang.String {
      return Row.Description
    }
    
    // 'value' attribute on BooleanRadioCell (id=LVIncremental) at UpdateStatsLV.pcf: line 55, column 36
    function value_7 () : java.lang.Boolean {
      return Row.Incremental
    }
    
    // 'visible' attribute on Link (id=LVGetZip) at UpdateStatsLV.pcf: line 32, column 44
    function visible_0 () : java.lang.Boolean {
      return Row.EndTime != null
    }
    
    property get Row () : entity.DatabaseUpdateStats {
      return getIteratedValue(1) as entity.DatabaseUpdateStats
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/UpdateStatsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpdateStatsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at UpdateStatsLV.pcf: line 19, column 48
    function value_16 () : entity.DatabaseUpdateStats[] {
      return PageHelper.AvailDatabaseUpdateStats
    }
    
    property get PageHelper () : gw.api.tools.UpdateStatsDVHelper {
      return getRequireValue("PageHelper", 0) as gw.api.tools.UpdateStatsDVHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.UpdateStatsDVHelper) {
      setRequireValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  
}