package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParameterDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ScriptParameterDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParameterDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScriptParameterDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ScriptParameterPack :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=ScriptParameterDetail) at ScriptParameterDetail.pcf: line 12, column 93
    function afterCancel_3 () : void {
      pcf.ScriptParametersPage.go()
    }
    
    // 'afterCancel' attribute on Page (id=ScriptParameterDetail) at ScriptParameterDetail.pcf: line 12, column 93
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.ScriptParametersPage.createDestination()
    }
    
    // 'canEdit' attribute on Page (id=ScriptParameterDetail) at ScriptParameterDetail.pcf: line 12, column 93
    function canEdit_5 () : java.lang.Boolean {
      return perm.ScriptParameter.edit
    }
    
    // 'canVisit' attribute on Page (id=ScriptParameterDetail) at ScriptParameterDetail.pcf: line 12, column 93
    static function canVisit_6 (ScriptParameterPack :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : java.lang.Boolean {
      return perm.ScriptParameter.view
    }
    
    // 'def' attribute on ScreenRef at ScriptParameterDetail.pcf: line 23, column 59
    function def_onEnter_1 (def :  pcf.ScriptParameterDetailScreen) : void {
      def.onEnter(ScriptParameter)
    }
    
    // 'def' attribute on ScreenRef at ScriptParameterDetail.pcf: line 23, column 59
    function def_refreshVariables_2 (def :  pcf.ScriptParameterDetailScreen) : void {
      def.refreshVariables(ScriptParameter)
    }
    
    // 'initialValue' attribute on Variable at ScriptParameterDetail.pcf: line 21, column 38
    function initialValue_0 () : entity.ScriptParameter {
      return gw.lang.ScriptParameters.getOrCreateParameter(ScriptParameterPack)
    }
    
    // 'parent' attribute on Page (id=ScriptParameterDetail) at ScriptParameterDetail.pcf: line 12, column 93
    static function parent_7 (ScriptParameterPack :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : pcf.api.Destination {
      return pcf.ScriptParametersPage.createDestination()
    }
    
    // 'title' attribute on Page (id=ScriptParameterDetail) at ScriptParameterDetail.pcf: line 12, column 93
    static function title_8 (ScriptParameterPack :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : java.lang.Object {
      return DisplayKey.get("Web.Admin.ScriptParameter", ScriptParameterPack.Name)
    }
    
    override property get CurrentLocation () : pcf.ScriptParameterDetail {
      return super.CurrentLocation as pcf.ScriptParameterDetail
    }
    
    property get ScriptParameter () : entity.ScriptParameter {
      return getVariableValue("ScriptParameter", 0) as entity.ScriptParameter
    }
    
    property set ScriptParameter ($arg :  entity.ScriptParameter) {
      setVariableValue("ScriptParameter", 0, $arg)
    }
    
    property get ScriptParameterPack () : com.guidewire.pl.system.gosu.entity.ScriptParameterPack {
      return getVariableValue("ScriptParameterPack", 0) as com.guidewire.pl.system.gosu.entity.ScriptParameterPack
    }
    
    property set ScriptParameterPack ($arg :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) {
      setVariableValue("ScriptParameterPack", 0, $arg)
    }
    
    
  }
  
  
}