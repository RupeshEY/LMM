package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ConditionValidationToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ConditionValidationToolbarButtonSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($scopedValidatable :  gw.bizrules.pcf.ScopedValidatable) : void {
    __widgetOf(this, pcf.ConditionValidationToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(false, {$scopedValidatable})
  }
  
  function refreshVariables ($scopedValidatable :  gw.bizrules.pcf.ScopedValidatable) : void {
    __widgetOf(this, pcf.ConditionValidationToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(true, {$scopedValidatable})
  }
  
  
}