package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/MatterActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MatterActivitiesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ActivityList :  gw.api.database.IQueryBeanResult<Activity>, $Claim :  Claim) : void {
    __widgetOf(this, pcf.MatterActivitiesLV, SECTION_WIDGET_CLASS).setVariables(false, {$ActivityList, $Claim})
  }
  
  function refreshVariables ($ActivityList :  gw.api.database.IQueryBeanResult<Activity>, $Claim :  Claim) : void {
    __widgetOf(this, pcf.MatterActivitiesLV, SECTION_WIDGET_CLASS).setVariables(true, {$ActivityList, $Claim})
  }
  
  
}