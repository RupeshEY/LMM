package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableRecoveryReservesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($WizardHelper :  gw.api.financials.RecoveryReserveWizardHelper) : void {
    __widgetOf(this, pcf.EditableRecoveryReservesLV, SECTION_WIDGET_CLASS).setVariables(false, {$WizardHelper})
  }
  
  function refreshVariables ($WizardHelper :  gw.api.financials.RecoveryReserveWizardHelper) : void {
    __widgetOf(this, pcf.EditableRecoveryReservesLV, SECTION_WIDGET_CLASS).setVariables(true, {$WizardHelper})
  }
  
  
}