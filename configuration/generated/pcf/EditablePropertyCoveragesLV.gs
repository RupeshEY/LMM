package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditablePropertyCoveragesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicyLocation :  PolicyLocation, $LocationBasedRU :  LocationBasedRU) : void {
    __widgetOf(this, pcf.EditablePropertyCoveragesLV, SECTION_WIDGET_CLASS).setVariables(false, {$PolicyLocation, $LocationBasedRU})
  }
  
  function refreshVariables ($PolicyLocation :  PolicyLocation, $LocationBasedRU :  LocationBasedRU) : void {
    __widgetOf(this, pcf.EditablePropertyCoveragesLV, SECTION_WIDGET_CLASS).setVariables(true, {$PolicyLocation, $LocationBasedRU})
  }
  
  
}