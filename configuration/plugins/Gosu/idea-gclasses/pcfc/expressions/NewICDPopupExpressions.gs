package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/icd/NewICDPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewICDPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/icd/NewICDPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewICDPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'def' attribute on PanelRef (id=ICDDVPanel) at NewICDPopup.pcf: line 27, column 26
    function def_onEnter_2 (def :  pcf.ICDDV) : void {
      def.onEnter(newICD, true)
    }
    
    // 'def' attribute on PanelRef at NewICDPopup.pcf: line 29, column 131
    function def_onEnter_4 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(newICD, { "CodeDesc" }, { DisplayKey.get("Web.Admin.ICD.CodeDescription") })
    }
    
    // 'def' attribute on PanelRef (id=ICDDVPanel) at NewICDPopup.pcf: line 27, column 26
    function def_refreshVariables_3 (def :  pcf.ICDDV) : void {
      def.refreshVariables(newICD, true)
    }
    
    // 'def' attribute on PanelRef at NewICDPopup.pcf: line 29, column 131
    function def_refreshVariables_5 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(newICD, { "CodeDesc" }, { DisplayKey.get("Web.Admin.ICD.CodeDescription") })
    }
    
    // 'initialValue' attribute on Variable at NewICDPopup.pcf: line 17, column 23
    function initialValue_0 () : ICDCode {
      return new ICDCode()
    }
    
    // EditButtons at NewICDPopup.pcf: line 22, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    override property get CurrentLocation () : pcf.NewICDPopup {
      return super.CurrentLocation as pcf.NewICDPopup
    }
    
    property get newICD () : ICDCode {
      return getVariableValue("newICD", 0) as ICDCode
    }
    
    property set newICD ($arg :  ICDCode) {
      setVariableValue("newICD", 0, $arg)
    }
    
    
  }
  
  
}