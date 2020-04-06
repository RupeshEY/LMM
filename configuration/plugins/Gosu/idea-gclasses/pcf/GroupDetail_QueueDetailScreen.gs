package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupDetail_QueueDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupDetail_QueueDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AssignableQueue :  AssignableQueue, $Group :  Group) : void {
    __widgetOf(this, pcf.GroupDetail_QueueDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$AssignableQueue, $Group})
  }
  
  function refreshVariables ($AssignableQueue :  AssignableQueue, $Group :  Group) : void {
    __widgetOf(this, pcf.GroupDetail_QueueDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$AssignableQueue, $Group})
  }
  
  
}