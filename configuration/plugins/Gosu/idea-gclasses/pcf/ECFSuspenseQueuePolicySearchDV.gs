package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/policysearch/ECFSuspenseQueuePolicySearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFSuspenseQueuePolicySearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PolicySearchCriteria :  PolicySearchCriteria) : void {
    __widgetOf(this, pcf.ECFSuspenseQueuePolicySearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$PolicySearchCriteria})
  }
  
  function refreshVariables ($PolicySearchCriteria :  PolicySearchCriteria) : void {
    __widgetOf(this, pcf.ECFSuspenseQueuePolicySearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$PolicySearchCriteria})
  }
  
  
}