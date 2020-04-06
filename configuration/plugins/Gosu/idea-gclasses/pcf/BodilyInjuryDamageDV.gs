package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/BodilyInjuryDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BodilyInjuryDamageDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.BodilyInjuryDamageDV, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure})
  }
  
  function refreshVariables ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.BodilyInjuryDamageDV, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure})
  }
  
  
}