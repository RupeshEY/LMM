package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoverySearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($RecoverySearchViewList :  gw.api.database.IQueryBeanResult<RecoverySearchView>, $criteria :  RecoverySearchCriteria) : void {
    __widgetOf(this, pcf.RecoverySearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$RecoverySearchViewList, $criteria})
  }
  
  function refreshVariables ($RecoverySearchViewList :  gw.api.database.IQueryBeanResult<RecoverySearchView>, $criteria :  RecoverySearchCriteria) : void {
    __widgetOf(this, pcf.RecoverySearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$RecoverySearchViewList, $criteria})
  }
  
  
}