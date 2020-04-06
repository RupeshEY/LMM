package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class StatementDocumentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($currentStatement :  ServiceRequestStatement, $documentsRemovable :  boolean) : void {
    __widgetOf(this, pcf.StatementDocumentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$currentStatement, $documentsRemovable})
  }
  
  function refreshVariables ($currentStatement :  ServiceRequestStatement, $documentsRemovable :  boolean) : void {
    __widgetOf(this, pcf.StatementDocumentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$currentStatement, $documentsRemovable})
  }
  
  
}