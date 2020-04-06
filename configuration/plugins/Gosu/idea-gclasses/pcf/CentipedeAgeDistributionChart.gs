package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/CentipedeAgeDistributionChart.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CentipedeAgeDistributionChart extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($pageHelper :  gw.api.cache2.CacheInfoPageHelper, $snapshot :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot, $height :  int, $width :  int) : void {
    __widgetOf(this, pcf.CentipedeAgeDistributionChart, SECTION_WIDGET_CLASS).setVariables(false, {$pageHelper, $snapshot, $height, $width})
  }
  
  function refreshVariables ($pageHelper :  gw.api.cache2.CacheInfoPageHelper, $snapshot :  com.guidewire.pl.system.cache2.CacheStatisticsSnapshot, $height :  int, $width :  int) : void {
    __widgetOf(this, pcf.CentipedeAgeDistributionChart, SECTION_WIDGET_CLASS).setVariables(true, {$pageHelper, $snapshot, $height, $width})
  }
  
  
}