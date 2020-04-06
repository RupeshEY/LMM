package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearchRequiredInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoverySearchRequiredInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($RecoverySearchCriteria :  RecoverySearchCriteria) : void {
    __widgetOf(this, pcf.RecoverySearchRequiredInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$RecoverySearchCriteria})
  }
  
  function refreshVariables ($RecoverySearchCriteria :  RecoverySearchCriteria) : void {
    __widgetOf(this, pcf.RecoverySearchRequiredInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$RecoverySearchCriteria})
  }
  
  
}