package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/acl/ECFACLPartyLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ECFACLPartyLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($partySet :  java.util.List<ECFMessageDocumentUploadAccessParty_Ext>) : void {
    __widgetOf(this, pcf.ECFACLPartyLV, SECTION_WIDGET_CLASS).setVariables(false, {$partySet})
  }
  
  function refreshVariables ($partySet :  java.util.List<ECFMessageDocumentUploadAccessParty_Ext>) : void {
    __widgetOf(this, pcf.ECFACLPartyLV, SECTION_WIDGET_CLASS).setVariables(true, {$partySet})
  }
  
  
}