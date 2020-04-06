package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ValidationErrorsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ValidationErrorsInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($errors :  java.lang.String[], $labelAbove :  boolean) : void {
    __widgetOf(this, pcf.ValidationErrorsInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$errors, $labelAbove})
  }
  
  function refreshVariables ($errors :  java.lang.String[], $labelAbove :  boolean) : void {
    __widgetOf(this, pcf.ValidationErrorsInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$errors, $labelAbove})
  }
  
  
}