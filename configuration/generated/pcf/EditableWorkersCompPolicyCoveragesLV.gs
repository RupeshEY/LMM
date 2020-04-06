package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditableWorkersCompPolicyCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableWorkersCompPolicyCoveragesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Policy :  Policy) : void {
    __widgetOf(this, pcf.EditableWorkersCompPolicyCoveragesLV, SECTION_WIDGET_CLASS).setVariables(false, {$Policy})
  }
  
  function refreshVariables ($Policy :  Policy) : void {
    __widgetOf(this, pcf.EditableWorkersCompPolicyCoveragesLV, SECTION_WIDGET_CLASS).setVariables(true, {$Policy})
  }
  
  
}