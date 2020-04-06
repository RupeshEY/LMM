package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/QuickCheckWizard_QuickCheckBasicsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuickCheckWizard_QuickCheckBasicsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/QuickCheckWizard_QuickCheckBasicsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickCheckWizard_QuickCheckBasicsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at QuickCheckWizard_QuickCheckBasicsScreen.pcf: line 21, column 104
    function def_onEnter_1 (def :  pcf.QuickCheckBasicsDV) : void {
      def.onEnter(Wizard.Check.findOrCreatePayment(), Wizard, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at QuickCheckWizard_QuickCheckBasicsScreen.pcf: line 21, column 104
    function def_refreshVariables_2 (def :  pcf.QuickCheckBasicsDV) : void {
      def.refreshVariables(Wizard.Check.findOrCreatePayment(), Wizard, reserveLineInputSetHelper)
    }
    
    // 'initialValue' attribute on Variable at QuickCheckWizard_QuickCheckBasicsScreen.pcf: line 16, column 59
    function initialValue_0 () : gw.api.financials.ReserveLineInputSetHelper {
      return gw.api.financials.ReserveLineInputSetStrategyForPaymentCreateAndEdit.newHelper(Wizard)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.financials.QuickCreateCheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.QuickCreateCheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.QuickCreateCheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getVariableValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setVariableValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    
  }
  
  
}