package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/icd/ICDPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ICDPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/icd/ICDPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (anICD :  ICDCode) : int {
      return 1
    }
    
    // 'def' attribute on PanelRef (id=ICDDVPanel) at ICDPopup.pcf: line 29, column 26
    function def_onEnter_3 (def :  pcf.ICDDV) : void {
      def.onEnter(anICD, false)
    }
    
    // 'def' attribute on PanelRef at ICDPopup.pcf: line 31, column 129
    function def_onEnter_5 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(anICD, { "CodeDesc"}, { DisplayKey.get("Web.Admin.ICD.CodeDescription") })
    }
    
    // 'def' attribute on PanelRef (id=ICDDVPanel) at ICDPopup.pcf: line 29, column 26
    function def_refreshVariables_4 (def :  pcf.ICDDV) : void {
      def.refreshVariables(anICD, false)
    }
    
    // 'def' attribute on PanelRef at ICDPopup.pcf: line 31, column 129
    function def_refreshVariables_6 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(anICD, { "CodeDesc"}, { DisplayKey.get("Web.Admin.ICD.CodeDescription") })
    }
    
    // 'initialValue' attribute on Variable at ICDPopup.pcf: line 18, column 23
    function initialValue_0 () : ICDCode {
      return new ICDCode()
    }
    
    // EditButtons at ICDPopup.pcf: line 24, column 30
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at ICDPopup.pcf: line 24, column 30
    function pickValue_1 () : ICDCode {
      return anICD
    }
    
    override property get CurrentLocation () : pcf.ICDPopup {
      return super.CurrentLocation as pcf.ICDPopup
    }
    
    property get anICD () : ICDCode {
      return getVariableValue("anICD", 0) as ICDCode
    }
    
    property set anICD ($arg :  ICDCode) {
      setVariableValue("anICD", 0, $arg)
    }
    
    
  }
  
  
}