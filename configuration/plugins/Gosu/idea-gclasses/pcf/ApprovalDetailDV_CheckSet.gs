package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ApprovalDetailDV_CheckSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ApprovalDetailDV_CheckSet, SECTION_WIDGET_CLASS).setVariables(false, {$Activity})
  }
  
  function refreshVariables ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ApprovalDetailDV_CheckSet, SECTION_WIDGET_CLASS).setVariables(true, {$Activity})
  }
  
  
}