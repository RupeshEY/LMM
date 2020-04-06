package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParametersPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ScriptParametersPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParametersPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScriptParametersPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ScriptParametersPage) at ScriptParametersPage.pcf: line 9, column 68
    static function canVisit_3 () : java.lang.Boolean {
      return perm.ScriptParameter.view
    }
    
    // 'def' attribute on PanelRef at ScriptParametersPage.pcf: line 21, column 57
    function def_onEnter_1 (def :  pcf.ScriptParametersLV) : void {
      def.onEnter(ScriptParameterQuery)
    }
    
    // 'def' attribute on PanelRef at ScriptParametersPage.pcf: line 21, column 57
    function def_refreshVariables_2 (def :  pcf.ScriptParametersLV) : void {
      def.refreshVariables(ScriptParameterQuery)
    }
    
    // 'initialValue' attribute on Variable at ScriptParametersPage.pcf: line 13, column 73
    function initialValue_0 () : com.guidewire.pl.system.gosu.entity.ScriptParameterPack[] {
      return ScriptParameters.getParameterPacks()
    }
    
    // 'parent' attribute on Page (id=ScriptParametersPage) at ScriptParametersPage.pcf: line 9, column 68
    static function parent_4 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ScriptParametersPage {
      return super.CurrentLocation as pcf.ScriptParametersPage
    }
    
    property get ScriptParameterQuery () : com.guidewire.pl.system.gosu.entity.ScriptParameterPack[] {
      return getVariableValue("ScriptParameterQuery", 0) as com.guidewire.pl.system.gosu.entity.ScriptParameterPack[]
    }
    
    property set ScriptParameterQuery ($arg :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack[]) {
      setVariableValue("ScriptParameterQuery", 0, $arg)
    }
    
    
  }
  
  
}