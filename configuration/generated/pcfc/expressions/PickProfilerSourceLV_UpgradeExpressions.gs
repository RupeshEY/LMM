package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickProfilerSourceLV_UpgradeExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PickProfilerSourceLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickValue' attribute on RowIterator at PickProfilerSourceLV.Upgrade.pcf: line 19, column 82
    function pickValue_12 () : java.lang.Object {
      return upgradeInstance.ProfilerData
    }
    
    // 'value' attribute on DateCell (id=UpgradeStartTime) at PickProfilerSourceLV.Upgrade.pcf: line 33, column 46
    function valueRoot_5 () : java.lang.Object {
      return upgradeInstance
    }
    
    // 'value' attribute on DateCell (id=UpgradeStartTime) at PickProfilerSourceLV.Upgrade.pcf: line 33, column 46
    function value_3 () : java.util.Date {
      return upgradeInstance.StartTime
    }
    
    // 'value' attribute on DateCell (id=UpgradeEndTime) at PickProfilerSourceLV.Upgrade.pcf: line 39, column 44
    function value_6 () : java.util.Date {
      return upgradeInstance.EndTime
    }
    
    // 'value' attribute on TextCell (id=UpgradeDuration) at PickProfilerSourceLV.Upgrade.pcf: line 44, column 42
    function value_9 () : java.lang.Integer {
      return upgradeInstance.ExecDuration
    }
    
    property get upgradeInstance () : entity.UpgradeInstance {
      return getIteratedValue(1) as entity.UpgradeInstance
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickProfilerSourceLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.Upgrade.pcf: line 33, column 46
    function sortValue_0 (upgradeInstance :  entity.UpgradeInstance) : java.lang.Object {
      return upgradeInstance.StartTime
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.Upgrade.pcf: line 39, column 44
    function sortValue_1 (upgradeInstance :  entity.UpgradeInstance) : java.lang.Object {
      return upgradeInstance.EndTime
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.Upgrade.pcf: line 44, column 42
    function sortValue_2 (upgradeInstance :  entity.UpgradeInstance) : java.lang.Object {
      return upgradeInstance.ExecDuration
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.Upgrade.pcf: line 19, column 82
    function value_13 () : gw.api.database.IQueryBeanResult<entity.UpgradeInstance> {
      return gw.api.database.Query.make(UpgradeInstance).compare("ProfilerData", NotEquals, null).select()
    }
    
    
  }
  
  
}