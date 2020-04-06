package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/DocumentNoteDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentNoteDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Note :  Note) : void {
    __widgetOf(this, pcf.DocumentNoteDV, SECTION_WIDGET_CLASS).setVariables(false, {$Note})
  }
  
  function refreshVariables ($Note :  Note) : void {
    __widgetOf(this, pcf.DocumentNoteDV, SECTION_WIDGET_CLASS).setVariables(true, {$Note})
  }
  
  
}