package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MessageControlForDestinationListLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DestinationId :  int, $DestinationName :  String) : void {
    __widgetOf(this, pcf.MessageControlForDestinationListLV, SECTION_WIDGET_CLASS).setVariables(false, {$DestinationId, $DestinationName})
  }
  
  function refreshVariables ($DestinationId :  int, $DestinationName :  String) : void {
    __widgetOf(this, pcf.MessageControlForDestinationListLV, SECTION_WIDGET_CLASS).setVariables(true, {$DestinationId, $DestinationName})
  }
  
  
}