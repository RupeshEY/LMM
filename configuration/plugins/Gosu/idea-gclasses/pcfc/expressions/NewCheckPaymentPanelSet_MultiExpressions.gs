package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/NewCheckPaymentPanelSet.Multi.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewCheckPaymentPanelSet_MultiExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/NewCheckPaymentPanelSet.Multi.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends NewCheckPaymentPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at NewCheckPaymentPanelSet.Multi.pcf: line 22, column 66
    function def_onEnter_0 (def :  pcf.NewCheckPaymentsLV) : void {
      def.onEnter(Wizard.Check.Payments, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewCheckPaymentPanelSet.Multi.pcf: line 28, column 82
    function def_onEnter_2 (def :  pcf.NewPaymentDetailDV_default) : void {
      def.onEnter(Payment, Wizard, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on PanelRef at NewCheckPaymentPanelSet.Multi.pcf: line 22, column 66
    function def_refreshVariables_1 (def :  pcf.NewCheckPaymentsLV) : void {
      def.refreshVariables(Wizard.Check.Payments, Wizard)
    }
    
    // 'def' attribute on PanelRef at NewCheckPaymentPanelSet.Multi.pcf: line 28, column 82
    function def_refreshVariables_3 (def :  pcf.NewPaymentDetailDV_default) : void {
      def.refreshVariables(Payment, Wizard, reserveLineInputSetHelper)
    }
    
    property get Payment () : Payment {
      return getCurrentSelection(1) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/NewCheckPaymentPanelSet.Multi.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPaymentPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
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