package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckWizard_CheckInstructionsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckWizard_CheckInstructionsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at CheckWizard_CheckInstructionsScreen.pcf: line 26, column 41
    function action_3 () : void {
      PickExistingDocumentPopup.push(claim)
    }
    
    // 'action' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at CheckWizard_CheckInstructionsScreen.pcf: line 26, column 41
    function action_dest_4 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(claim)
    }
    
    // 'available' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at CheckWizard_CheckInstructionsScreen.pcf: line 26, column 41
    function available_1 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckInstructionsScreen.pcf: line 61, column 120
    function def_onEnter_13 (def :  pcf.NewPaymentInstructionsDV_default) : void {
      def.onEnter(wizard.CheckGroupProxy, wizard)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckInstructionsScreen.pcf: line 61, column 120
    function def_onEnter_15 (def :  pcf.NewPaymentInstructionsDV_single) : void {
      def.onEnter(wizard.CheckGroupProxy, wizard)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckInstructionsScreen.pcf: line 61, column 120
    function def_refreshVariables_14 (def :  pcf.NewPaymentInstructionsDV_default) : void {
      def.refreshVariables(wizard.CheckGroupProxy, wizard)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckInstructionsScreen.pcf: line 61, column 120
    function def_refreshVariables_16 (def :  pcf.NewPaymentInstructionsDV_single) : void {
      def.refreshVariables(wizard.CheckGroupProxy, wizard)
    }
    
    // 'icon' attribute on Link (id=InvoiceWithNoQuoteAlert) at CheckWizard_CheckInstructionsScreen.pcf: line 52, column 43
    function icon_10 () : java.lang.String {
      return gw.vendormanagement.ServiceRequestStatus.ATTENTION.Icon
    }
    
    // 'initialValue' attribute on Variable at CheckWizard_CheckInstructionsScreen.pcf: line 16, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'mode' attribute on PanelRef at CheckWizard_CheckInstructionsScreen.pcf: line 61, column 120
    function mode_17 () : java.lang.Object {
      return wizard.isRecurrenceEditable() and !wizard.Check.containsDeductible() ? "" : "single"
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at CheckWizard_CheckInstructionsScreen.pcf: line 26, column 41
    function onPick_5 (PickedValue :  Document) : void {
      gw.api.financials.TransactionSetLinkDocumentHelper.linkDocument(PickedValue, wizard.CheckGroupProxy.CheckSet)
    }
    
    // 'visible' attribute on ContentInput at CheckWizard_CheckInstructionsScreen.pcf: line 49, column 178
    function visible_11 () : java.lang.Boolean {
      return wizard.Check.LinkedToServiceRequests  and  wizard.Check.GrossAmount.compareTo(wizard.Check.ServiceRequestInvoices.sum( \ invoice -> invoice.Amount)) != 0
    }
    
    // 'visible' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at CheckWizard_CheckInstructionsScreen.pcf: line 26, column 41
    function visible_2 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    // 'visible' attribute on Verbatim (id=DeductionsChangedWarning) at CheckWizard_CheckInstructionsScreen.pcf: line 32, column 23
    function visible_6 () : java.lang.Boolean {
      return wizard.isDeductionWarningNeeded()
    }
    
    // 'visible' attribute on AlertBar (id=IDCSDisabledAlert) at CheckWizard_CheckInstructionsScreen.pcf: line 36, column 66
    function visible_7 () : java.lang.Boolean {
      return not documentsActionsHelper.ContentSourceEnabled
    }
    
    // 'visible' attribute on AlertBar (id=IDCSUnavailableAlert) at CheckWizard_CheckInstructionsScreen.pcf: line 40, column 70
    function visible_8 () : java.lang.Boolean {
      return documentsActionsHelper.ShowContentServerDownWarning
    }
    
    // 'visible' attribute on AlertBar (id=IDMSUnavailableAlert) at CheckWizard_CheckInstructionsScreen.pcf: line 44, column 71
    function visible_9 () : java.lang.Boolean {
      return documentsActionsHelper.ShowMetadataServerDownWarning
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get wizard () : gw.api.financials.CheckWizardInfo {
      return getRequireValue("wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setRequireValue("wizard", 0, $arg)
    }
    
    
  }
  
  
}