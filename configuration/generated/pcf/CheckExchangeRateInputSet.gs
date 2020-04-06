package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/CheckExchangeRateInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckExchangeRateInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($check :  Check, $widgetLabel :  java.lang.String) : void {
    __widgetOf(this, pcf.CheckExchangeRateInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$check, $widgetLabel})
  }
  
  function refreshVariables ($check :  Check, $widgetLabel :  java.lang.String) : void {
    __widgetOf(this, pcf.CheckExchangeRateInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$check, $widgetLabel})
  }
  
  
}