package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUserAssignmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimUserAssignmentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AssignableList :  Assignable[]) : void {
    __widgetOf(this, pcf.ClaimUserAssignmentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$AssignableList})
  }
  
  function refreshVariables ($AssignableList :  Assignable[]) : void {
    __widgetOf(this, pcf.ClaimUserAssignmentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$AssignableList})
  }
  
  
}