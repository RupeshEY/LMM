package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/PayLoadDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PayLoadDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Message :  Message) : void {
    __widgetOf(this, pcf.PayLoadDV, SECTION_WIDGET_CLASS).setVariables(false, {$Message})
  }
  
  function refreshVariables ($Message :  Message) : void {
    __widgetOf(this, pcf.PayLoadDV, SECTION_WIDGET_CLASS).setVariables(true, {$Message})
  }
  
  
}