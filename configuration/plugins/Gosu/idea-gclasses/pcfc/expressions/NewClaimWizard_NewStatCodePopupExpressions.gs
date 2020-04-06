package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_NewStatCodePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_NewStatCodePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_NewStatCodePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_NewStatCodePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Policy :  Policy) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewStatCodePopup.pcf: line 27, column 43
    function def_onEnter_3 (def :  pcf.StatCodeDetailDV) : void {
      def.onEnter(StatCode)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewStatCodePopup.pcf: line 27, column 43
    function def_refreshVariables_4 (def :  pcf.StatCodeDetailDV) : void {
      def.refreshVariables(StatCode)
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_NewStatCodePopup.pcf: line 19, column 24
    function initialValue_0 () : StatCode {
      return Policy.createStatCode()
    }
    
    // EditButtons at NewClaimWizard_NewStatCodePopup.pcf: line 24, column 33
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewClaimWizard_NewStatCodePopup.pcf: line 24, column 33
    function pickValue_1 () : StatCode {
      return StatCode
    }
    
    override property get CurrentLocation () : pcf.NewClaimWizard_NewStatCodePopup {
      return super.CurrentLocation as pcf.NewClaimWizard_NewStatCodePopup
    }
    
    property get Policy () : Policy {
      return getVariableValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setVariableValue("Policy", 0, $arg)
    }
    
    property get StatCode () : StatCode {
      return getVariableValue("StatCode", 0) as StatCode
    }
    
    property set StatCode ($arg :  StatCode) {
      setVariableValue("StatCode", 0, $arg)
    }
    
    
  }
  
  
}