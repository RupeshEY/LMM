package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.FlagClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimIndicatorInputSet_FlagClaimIndicator extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($indicator :  ClaimIndicator) : void {
    __widgetOf(this, pcf.ClaimIndicatorInputSet_FlagClaimIndicator, SECTION_WIDGET_CLASS).setVariables(false, {$indicator})
  }
  
  function refreshVariables ($indicator :  ClaimIndicator) : void {
    __widgetOf(this, pcf.ClaimIndicatorInputSet_FlagClaimIndicator, SECTION_WIDGET_CLASS).setVariables(true, {$indicator})
  }
  
  
}