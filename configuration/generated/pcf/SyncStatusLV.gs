package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SyncStatusLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DestinationMessageStatisticsList :  gw.api.admin.DestinationMessageStatistics[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.SyncStatusLV, SECTION_WIDGET_CLASS).setVariables(false, {$DestinationMessageStatisticsList, $Claim})
  }
  
  function refreshVariables ($DestinationMessageStatisticsList :  gw.api.admin.DestinationMessageStatistics[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.SyncStatusLV, SECTION_WIDGET_CLASS).setVariables(true, {$DestinationMessageStatisticsList, $Claim})
  }
  
  
}