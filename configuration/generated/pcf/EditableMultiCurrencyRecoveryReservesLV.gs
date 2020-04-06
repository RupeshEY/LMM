package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableMultiCurrencyRecoveryReservesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($WizardHelper :  gw.api.financials.RecoveryReserveWizardHelper, $EditWrapper :  entity.TransactionEditWrapper) : void {
    __widgetOf(this, pcf.EditableMultiCurrencyRecoveryReservesLV, SECTION_WIDGET_CLASS).setVariables(false, {$WizardHelper, $EditWrapper})
  }
  
  function refreshVariables ($WizardHelper :  gw.api.financials.RecoveryReserveWizardHelper, $EditWrapper :  entity.TransactionEditWrapper) : void {
    __widgetOf(this, pcf.EditableMultiCurrencyRecoveryReservesLV, SECTION_WIDGET_CLASS).setVariables(true, {$WizardHelper, $EditWrapper})
  }
  
  
}