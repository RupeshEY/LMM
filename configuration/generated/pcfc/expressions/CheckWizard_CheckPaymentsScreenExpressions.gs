package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPaymentsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckWizard_CheckPaymentsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPaymentsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckWizard_CheckPaymentsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckPaymentsScreen.pcf: line 33, column 115
    function def_onEnter_4 (def :  pcf.NewCheckPaymentPanelSet_Multi) : void {
      def.onEnter(Wizard, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckPaymentsScreen.pcf: line 33, column 115
    function def_onEnter_6 (def :  pcf.NewCheckPaymentPanelSet_Single) : void {
      def.onEnter(Wizard, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckPaymentsScreen.pcf: line 33, column 115
    function def_refreshVariables_5 (def :  pcf.NewCheckPaymentPanelSet_Multi) : void {
      def.refreshVariables(Wizard, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckPaymentsScreen.pcf: line 33, column 115
    function def_refreshVariables_7 (def :  pcf.NewCheckPaymentPanelSet_Single) : void {
      def.refreshVariables(Wizard, reserveLineInputSetHelper)
    }
    
    // 'initialValue' attribute on Variable at CheckWizard_CheckPaymentsScreen.pcf: line 16, column 59
    function initialValue_0 () : gw.api.financials.ReserveLineInputSetHelper {
      return gw.api.financials.ReserveLineInputSetStrategyForPaymentCreateAndEdit.newHelper(Wizard)
    }
    
    // 'mode' attribute on PanelRef at CheckWizard_CheckPaymentsScreen.pcf: line 33, column 115
    function mode_8 () : java.lang.Object {
      return gw.api.financials.FinancialsUtil.isAllowMultiplePayments() ? "Multi" : "Single"
    }
    
    // 'addVisible' attribute on IteratorButtons at CheckWizard_CheckPaymentsScreen.pcf: line 25, column 85
    function visible_1 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isAllowMultiplePayments()
    }
    
    // 'visible' attribute on AlertBar (id=LineItemsNotCopiedAlert) at CheckWizard_CheckPaymentsScreen.pcf: line 30, column 39
    function visible_3 () : java.lang.Boolean {
      return cloneAlertRequired()
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.financials.CheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getVariableValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setVariableValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    
    function cloneAlertRequired() : Boolean {
      if (Wizard typeis gw.api.financials.CreateCheckWizardInfo and Wizard.CheckBeingCloned != null) {
        var check = Wizard.CheckBeingCloned
        for (payment in check.Payments) {
          for (tli in payment.LineItems) {
            if (tli.isDeductibleLineItem() or tli.LineCategory==TC_FORMERDEDUCTIBLE) {
              return true
            }
          }
        }
      }
      return false
    }
          
        
    
    
  }
  
  
}