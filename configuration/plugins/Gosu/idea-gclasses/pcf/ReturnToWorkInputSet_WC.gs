package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ReturnToWorkInputSet.WC.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReturnToWorkInputSet_WC extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Injury :  InjuryIncident, $DetailedView :  Boolean) : void {
    __widgetOf(this, pcf.ReturnToWorkInputSet_WC, SECTION_WIDGET_CLASS).setVariables(false, {$Injury, $DetailedView})
  }
  
  function refreshVariables ($Injury :  InjuryIncident, $DetailedView :  Boolean) : void {
    __widgetOf(this, pcf.ReturnToWorkInputSet_WC, SECTION_WIDGET_CLASS).setVariables(true, {$Injury, $DetailedView})
  }
  
  
}