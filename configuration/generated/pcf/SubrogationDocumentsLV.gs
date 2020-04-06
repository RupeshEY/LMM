package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SubrogationDocumentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($documents :  Document[]) : void {
    __widgetOf(this, pcf.SubrogationDocumentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$documents})
  }
  
  function refreshVariables ($documents :  Document[]) : void {
    __widgetOf(this, pcf.SubrogationDocumentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$documents})
  }
  
  
}