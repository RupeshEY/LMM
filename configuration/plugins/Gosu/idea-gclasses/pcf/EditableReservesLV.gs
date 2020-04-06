package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableReservesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($WizardHelper :  gw.api.financials.ReserveWizardHelper, $Exposure :  Exposure, $addNew :  Boolean) : void {
    __widgetOf(this, pcf.EditableReservesLV, SECTION_WIDGET_CLASS).setVariables(false, {$WizardHelper, $Exposure, $addNew})
  }
  
  function refreshVariables ($WizardHelper :  gw.api.financials.ReserveWizardHelper, $Exposure :  Exposure, $addNew :  Boolean) : void {
    __widgetOf(this, pcf.EditableReservesLV, SECTION_WIDGET_CLASS).setVariables(true, {$WizardHelper, $Exposure, $addNew})
  }
  
  
}