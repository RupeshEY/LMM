package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParameterDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ScriptParameterDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParameterDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScriptParameterDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ScriptParameterDetailScreen.pcf: line 14, column 55
    function def_onEnter_1 (def :  pcf.ScriptParameterDetailDV) : void {
      def.onEnter(ScriptParameter)
    }
    
    // 'def' attribute on PanelRef at ScriptParameterDetailScreen.pcf: line 14, column 55
    function def_refreshVariables_2 (def :  pcf.ScriptParameterDetailDV) : void {
      def.refreshVariables(ScriptParameter)
    }
    
    // EditButtons at ScriptParameterDetailScreen.pcf: line 11, column 21
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    property get ScriptParameter () : entity.ScriptParameter {
      return getRequireValue("ScriptParameter", 0) as entity.ScriptParameter
    }
    
    property set ScriptParameter ($arg :  entity.ScriptParameter) {
      setRequireValue("ScriptParameter", 0, $arg)
    }
    
    
  }
  
  
}