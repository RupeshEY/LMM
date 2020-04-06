package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ValidationWarningsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ValidationWarningsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($warnings :  java.lang.String[], $labelAbove :  boolean) : void {
    __widgetOf(this, pcf.ValidationWarningsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$warnings, $labelAbove})
  }
  
  function refreshVariables ($warnings :  java.lang.String[], $labelAbove :  boolean) : void {
    __widgetOf(this, pcf.ValidationWarningsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$warnings, $labelAbove})
  }
  
  
}