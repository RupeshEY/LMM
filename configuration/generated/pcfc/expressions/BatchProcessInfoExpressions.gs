package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/BatchProcessInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BatchProcessInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/BatchProcessInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BatchProcessInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 1
    }
    
    static function __constructorIndex (batchProcessTypes :  BatchProcessType[]) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=BatchProcessInfo) at BatchProcessInfo.pcf: line 11, column 82
    static function canVisit_3 (batchProcessTypes :  BatchProcessType[]) : java.lang.Boolean {
      return (perm.User.ViewBatchProcess or perm.User.DevAllAccess)
    }
    
    // 'def' attribute on ScreenRef at BatchProcessInfo.pcf: line 21, column 52
    function def_onEnter_1 (def :  pcf.BatchProcessScreen) : void {
      def.onEnter(batchProcessTypes)
    }
    
    // 'def' attribute on ScreenRef at BatchProcessInfo.pcf: line 21, column 52
    function def_refreshVariables_2 (def :  pcf.BatchProcessScreen) : void {
      def.refreshVariables(batchProcessTypes)
    }
    
    // 'initialValue' attribute on Variable at BatchProcessInfo.pcf: line 19, column 34
    function initialValue_0 () : BatchProcessType[] {
      return BatchProcessType.getTypeKeys( false )?.toTypedArray()
    }
    
    // Page (id=BatchProcessInfo) at BatchProcessInfo.pcf: line 11, column 82
    static function parent_4 (batchProcessTypes :  BatchProcessType[]) : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    override property get CurrentLocation () : pcf.BatchProcessInfo {
      return super.CurrentLocation as pcf.BatchProcessInfo
    }
    
    property get batchProcessTypes () : BatchProcessType[] {
      return getVariableValue("batchProcessTypes", 0) as BatchProcessType[]
    }
    
    property set batchProcessTypes ($arg :  BatchProcessType[]) {
      setVariableValue("batchProcessTypes", 0, $arg)
    }
    
    
  }
  
  
}