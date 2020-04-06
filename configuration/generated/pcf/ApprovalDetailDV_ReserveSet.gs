package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ApprovalDetailDV.ReserveSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ApprovalDetailDV_ReserveSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ApprovalDetailDV_ReserveSet, SECTION_WIDGET_CLASS).setVariables(false, {$Activity})
  }
  
  function refreshVariables ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ApprovalDetailDV_ReserveSet, SECTION_WIDGET_CLASS).setVariables(true, {$Activity})
  }
  
  
}