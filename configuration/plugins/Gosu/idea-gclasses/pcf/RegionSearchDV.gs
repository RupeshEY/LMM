package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regionsearch/RegionSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RegionSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SearchCriteria :  gw.api.admin.RegionSearchCriteria) : void {
    __widgetOf(this, pcf.RegionSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$SearchCriteria})
  }
  
  function refreshVariables ($SearchCriteria :  gw.api.admin.RegionSearchCriteria) : void {
    __widgetOf(this, pcf.RegionSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$SearchCriteria})
  }
  
  
}