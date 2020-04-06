package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.coveragetype.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposureMenuItemSet_coveragetype extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim) : void {
    __widgetOf(this, pcf.NewExposureMenuItemSet_coveragetype, SECTION_WIDGET_CLASS).setVariables(false, {$claim})
  }
  
  function refreshVariables ($claim :  Claim) : void {
    __widgetOf(this, pcf.NewExposureMenuItemSet_coveragetype, SECTION_WIDGET_CLASS).setVariables(true, {$claim})
  }
  
  
}