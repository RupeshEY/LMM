package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MessageControlForSOOListLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DestinationId :  int, $SOOKeyValue :  long) : void {
    __widgetOf(this, pcf.MessageControlForSOOListLV, SECTION_WIDGET_CLASS).setVariables(false, {$DestinationId, $SOOKeyValue})
  }
  
  function refreshVariables ($DestinationId :  int, $SOOKeyValue :  long) : void {
    __widgetOf(this, pcf.MessageControlForSOOListLV, SECTION_WIDGET_CLASS).setVariables(true, {$DestinationId, $SOOKeyValue})
  }
  
  
}