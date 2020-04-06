package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/statutes/DenialPeriodDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DenialPeriodDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($WCDenialPeriod :  WCDenialPeriod) : void {
    __widgetOf(this, pcf.DenialPeriodDV, SECTION_WIDGET_CLASS).setVariables(false, {$WCDenialPeriod})
  }
  
  function refreshVariables ($WCDenialPeriod :  WCDenialPeriod) : void {
    __widgetOf(this, pcf.DenialPeriodDV, SECTION_WIDGET_CLASS).setVariables(true, {$WCDenialPeriod})
  }
  
  
}