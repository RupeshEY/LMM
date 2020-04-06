package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/ManualCheckPaymentInstructionsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ManualCheckPaymentInstructionsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/ManualCheckPaymentInstructionsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ManualCheckPaymentInstructionsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ManualCheckPaymentInstructionsDV.pcf: line 16, column 63
    function def_onEnter_0 (def :  pcf.CheckWizardCheckSummaryInputSet) : void {
      def.onEnter(Check, Wizard)
    }
    
    // 'def' attribute on InputSetRef at ManualCheckPaymentInstructionsDV.pcf: line 16, column 63
    function def_refreshVariables_1 (def :  pcf.CheckWizardCheckSummaryInputSet) : void {
      def.refreshVariables(Check, Wizard)
    }
    
    property get Check () : Check {
      return getRequireValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setRequireValue("Check", 0, $arg)
    }
    
    property get Wizard () : gw.api.financials.CheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
  }
  
  
}