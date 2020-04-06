package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckInstructionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ManualCheckWizard_CheckInstructionsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckInstructionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ManualCheckWizard_CheckInstructionsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at ManualCheckWizard_CheckInstructionsScreen.pcf: line 26, column 41
    function action_3 () : void {
      PickExistingDocumentPopup.push(Claim)
    }
    
    // 'action' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at ManualCheckWizard_CheckInstructionsScreen.pcf: line 26, column 41
    function action_dest_4 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(Claim)
    }
    
    // 'available' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at ManualCheckWizard_CheckInstructionsScreen.pcf: line 26, column 41
    function available_1 () : java.lang.Boolean {
      return documentActionsUIHelper.DocumentMetadataActionsAvailable
    }
    
    // 'def' attribute on PanelRef at ManualCheckWizard_CheckInstructionsScreen.pcf: line 34, column 79
    function def_onEnter_7 (def :  pcf.ManualCheckPaymentInstructionsDV) : void {
      def.onEnter(Wizard.CheckGroupProxy, Wizard)
    }
    
    // 'def' attribute on PanelRef at ManualCheckWizard_CheckInstructionsScreen.pcf: line 34, column 79
    function def_refreshVariables_8 (def :  pcf.ManualCheckPaymentInstructionsDV) : void {
      def.refreshVariables(Wizard.CheckGroupProxy, Wizard)
    }
    
    // 'initialValue' attribute on Variable at ManualCheckWizard_CheckInstructionsScreen.pcf: line 16, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at ManualCheckWizard_CheckInstructionsScreen.pcf: line 26, column 41
    function onPick_5 (PickedValue :  Document) : void {
      gw.api.financials.TransactionSetLinkDocumentHelper.linkDocument(PickedValue, Wizard.CheckGroupProxy.CheckSet)
    }
    
    // 'visible' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at ManualCheckWizard_CheckInstructionsScreen.pcf: line 26, column 41
    function visible_2 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    // 'visible' attribute on Verbatim (id=DeductionsChangedWarning) at ManualCheckWizard_CheckInstructionsScreen.pcf: line 32, column 23
    function visible_6 () : java.lang.Boolean {
      return Wizard.isDeductionWarningNeeded()
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
    
    property get documentActionsUIHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentActionsUIHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentActionsUIHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentActionsUIHelper", 0, $arg)
    }
    
    
  }
  
  
}