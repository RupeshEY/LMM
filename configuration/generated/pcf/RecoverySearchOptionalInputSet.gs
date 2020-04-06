package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearchOptionalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoverySearchOptionalInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($RecoverySearchCriteria :  RecoverySearchCriteria) : void {
    __widgetOf(this, pcf.RecoverySearchOptionalInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$RecoverySearchCriteria})
  }
  
  function refreshVariables ($RecoverySearchCriteria :  RecoverySearchCriteria) : void {
    __widgetOf(this, pcf.RecoverySearchOptionalInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$RecoverySearchCriteria})
  }
  
  
}