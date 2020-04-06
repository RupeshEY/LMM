package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class StatementLineItemLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($serviceRequestStatement :  ServiceRequestStatement) : void {
    __widgetOf(this, pcf.StatementLineItemLV, SECTION_WIDGET_CLASS).setVariables(false, {$serviceRequestStatement})
  }
  
  function refreshVariables ($serviceRequestStatement :  ServiceRequestStatement) : void {
    __widgetOf(this, pcf.StatementLineItemLV, SECTION_WIDGET_CLASS).setVariables(true, {$serviceRequestStatement})
  }
  
  
}