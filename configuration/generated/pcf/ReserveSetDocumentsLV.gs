package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/ReserveSetDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReserveSetDocumentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ReserveWizardHelper :  gw.api.financials.ReserveWizardHelper) : void {
    __widgetOf(this, pcf.ReserveSetDocumentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ReserveWizardHelper})
  }
  
  function refreshVariables ($ReserveWizardHelper :  gw.api.financials.ReserveWizardHelper) : void {
    __widgetOf(this, pcf.ReserveSetDocumentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ReserveWizardHelper})
  }
  
  
}