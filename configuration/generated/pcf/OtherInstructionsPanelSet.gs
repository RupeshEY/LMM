package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherInstructionsPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($otherInstructions :  OtherInstruction[], $claimPolicyType :  PolicyType, $permEditOtherInstructions :  boolean) : void {
    __widgetOf(this, pcf.OtherInstructionsPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$otherInstructions, $claimPolicyType, $permEditOtherInstructions})
  }
  
  function refreshVariables ($otherInstructions :  OtherInstruction[], $claimPolicyType :  PolicyType, $permEditOtherInstructions :  boolean) : void {
    __widgetOf(this, pcf.OtherInstructionsPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$otherInstructions, $claimPolicyType, $permEditOtherInstructions})
  }
  
  
}