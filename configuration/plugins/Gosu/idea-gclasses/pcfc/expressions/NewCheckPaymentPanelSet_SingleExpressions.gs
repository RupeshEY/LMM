package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/NewCheckPaymentPanelSet.Single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewCheckPaymentPanelSet_SingleExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/NewCheckPaymentPanelSet.Single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPaymentPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at NewCheckPaymentPanelSet.Single.pcf: line 20, column 104
    function def_onEnter_0 (def :  pcf.NewPaymentDetailDV_default) : void {
      def.onEnter(Wizard.Check.findOrCreatePayment(), Wizard, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at NewCheckPaymentPanelSet.Single.pcf: line 20, column 104
    function def_refreshVariables_1 (def :  pcf.NewPaymentDetailDV_default) : void {
      def.refreshVariables(Wizard.Check.findOrCreatePayment(), Wizard, reserveLineInputSetHelper)
    }
    
    property get Wizard () : gw.api.financials.CheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getRequireValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setRequireValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    
  }
  
  
}