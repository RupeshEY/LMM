package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/AvailableToRunInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AvailableToRunInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($version :  RuleVersion) : void {
    __widgetOf(this, pcf.AvailableToRunInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$version})
  }
  
  function refreshVariables ($version :  RuleVersion) : void {
    __widgetOf(this, pcf.AvailableToRunInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$version})
  }
  
  
}