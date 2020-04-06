package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/scriptparameters/NewScriptParameter.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewScriptParameterExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/scriptparameters/NewScriptParameter.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewScriptParameterExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewScriptParameter) at NewScriptParameter.pcf: line 14, column 70
    function afterCancel_3 () : void {
      pcf.ScriptParametersPage.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewScriptParameter) at NewScriptParameter.pcf: line 14, column 70
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.ScriptParametersPage.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewScriptParameter) at NewScriptParameter.pcf: line 14, column 70
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      pcf.ScriptParametersPage.go()
    }
    
    // 'canVisit' attribute on Page (id=NewScriptParameter) at NewScriptParameter.pcf: line 14, column 70
    static function canVisit_6 () : java.lang.Boolean {
      return perm.ScriptParameter.create
    }
    
    // 'def' attribute on ScreenRef at NewScriptParameter.pcf: line 22, column 59
    function def_onEnter_1 (def :  pcf.ScriptParameterDetailScreen) : void {
      def.onEnter(ScriptParameter)
    }
    
    // 'def' attribute on ScreenRef at NewScriptParameter.pcf: line 22, column 59
    function def_refreshVariables_2 (def :  pcf.ScriptParameterDetailScreen) : void {
      def.refreshVariables(ScriptParameter)
    }
    
    // 'initialValue' attribute on Variable at NewScriptParameter.pcf: line 20, column 31
    function initialValue_0 () : ScriptParameter {
      return new ScriptParameter()
    }
    
    // 'parent' attribute on Page (id=NewScriptParameter) at NewScriptParameter.pcf: line 14, column 70
    static function parent_7 () : pcf.api.Destination {
      return pcf.ScriptParametersPage.createDestination()
    }
    
    override property get CurrentLocation () : pcf.NewScriptParameter {
      return super.CurrentLocation as pcf.NewScriptParameter
    }
    
    property get ScriptParameter () : ScriptParameter {
      return getVariableValue("ScriptParameter", 0) as ScriptParameter
    }
    
    property set ScriptParameter ($arg :  ScriptParameter) {
      setVariableValue("ScriptParameter", 0, $arg)
    }
    
    
  }
  
  
}