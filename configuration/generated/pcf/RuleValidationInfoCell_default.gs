package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleValidationInfoCell.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleValidationInfoCell_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($rule :  Rule) : void {
    __widgetOf(this, pcf.RuleValidationInfoCell_default, SECTION_WIDGET_CLASS).setVariables(false, {$rule})
  }
  
  function refreshVariables ($rule :  Rule) : void {
    __widgetOf(this, pcf.RuleValidationInfoCell_default, SECTION_WIDGET_CLASS).setVariables(true, {$rule})
  }
  
  
}