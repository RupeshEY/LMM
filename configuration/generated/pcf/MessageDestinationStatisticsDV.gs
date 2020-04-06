package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessageDestinationStatisticsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MessageDestinationStatisticsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($destId :  java.lang.Integer) : void {
    __widgetOf(this, pcf.MessageDestinationStatisticsDV, SECTION_WIDGET_CLASS).setVariables(false, {$destId})
  }
  
  function refreshVariables ($destId :  java.lang.Integer) : void {
    __widgetOf(this, pcf.MessageDestinationStatisticsDV, SECTION_WIDGET_CLASS).setVariables(true, {$destId})
  }
  
  
}