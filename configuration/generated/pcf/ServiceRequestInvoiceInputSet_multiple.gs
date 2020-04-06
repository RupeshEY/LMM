package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestInvoiceInputSet_multiple extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Wizard :  gw.api.financials.CheckWizardInfo, $showDocuments :  boolean) : void {
    __widgetOf(this, pcf.ServiceRequestInvoiceInputSet_multiple, SECTION_WIDGET_CLASS).setVariables(false, {$Wizard, $showDocuments})
  }
  
  function refreshVariables ($Wizard :  gw.api.financials.CheckWizardInfo, $showDocuments :  boolean) : void {
    __widgetOf(this, pcf.ServiceRequestInvoiceInputSet_multiple, SECTION_WIDGET_CLASS).setVariables(true, {$Wizard, $showDocuments})
  }
  
  
}