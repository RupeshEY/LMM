package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveItemListScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveItemListScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($archiveDetailsData :  gw.api.archiving.ArchiveDetailsData) : void {
    __widgetOf(this, pcf.ArchiveItemListScreen, SECTION_WIDGET_CLASS).setVariables(false, {$archiveDetailsData})
  }
  
  function refreshVariables ($archiveDetailsData :  gw.api.archiving.ArchiveDetailsData) : void {
    __widgetOf(this, pcf.ArchiveItemListScreen, SECTION_WIDGET_CLASS).setVariables(true, {$archiveDetailsData})
  }
  
  
}