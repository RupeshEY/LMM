package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/checks/CheckSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckSearchResultsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CheckSearchViewList :  gw.api.database.IQueryBeanResult<CheckSearchView>, $criteria :  PaymentSearchCriteria) : void {
    __widgetOf(this, pcf.CheckSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(false, {$CheckSearchViewList, $criteria})
  }
  
  function refreshVariables ($CheckSearchViewList :  gw.api.database.IQueryBeanResult<CheckSearchView>, $criteria :  PaymentSearchCriteria) : void {
    __widgetOf(this, pcf.CheckSearchResultsLV, SECTION_WIDGET_CLASS).setVariables(true, {$CheckSearchViewList, $criteria})
  }
  
  
}