package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableMultiCurrencyReservesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($WizardHelper :  gw.api.financials.ReserveWizardHelper, $EditWrapper :  entity.TransactionEditWrapper) : void {
    __widgetOf(this, pcf.EditableMultiCurrencyReservesLV, SECTION_WIDGET_CLASS).setVariables(false, {$WizardHelper, $EditWrapper})
  }
  
  function refreshVariables ($WizardHelper :  gw.api.financials.ReserveWizardHelper, $EditWrapper :  entity.TransactionEditWrapper) : void {
    __widgetOf(this, pcf.EditableMultiCurrencyReservesLV, SECTION_WIDGET_CLASS).setVariables(true, {$WizardHelper, $EditWrapper})
  }
  
  
}