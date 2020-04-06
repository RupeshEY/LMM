package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckWizard_PaymentDeductionsPagePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckWizard_PaymentDeductionsPagePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Wizard :  gw.api.financials.CheckWizardInfo, Check :  Check) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=CheckWizard_PaymentDeductionsPagePopup_RecalculateButton) at CheckWizard_PaymentDeductionsPagePopup.pcf: line 29, column 105
    function action_1 () : void {
      Wizard.computeDeductions(Check)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_PaymentDeductionsPagePopup.pcf: line 32, column 51
    function def_onEnter_2 (def :  pcf.PaymentDeductionsDV) : void {
      def.onEnter(Check, Wizard)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_PaymentDeductionsPagePopup.pcf: line 32, column 51
    function def_refreshVariables_3 (def :  pcf.PaymentDeductionsDV) : void {
      def.refreshVariables(Check, Wizard)
    }
    
    // EditButtons at CheckWizard_PaymentDeductionsPagePopup.pcf: line 24, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    property get Check () : Check {
      return getVariableValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setVariableValue("Check", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.CheckWizard_PaymentDeductionsPagePopup {
      return super.CurrentLocation as pcf.CheckWizard_PaymentDeductionsPagePopup
    }
    
    property get Wizard () : gw.api.financials.CheckWizardInfo {
      return getVariableValue("Wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setVariableValue("Wizard", 0, $arg)
    }
    
    
  }
  
  
}