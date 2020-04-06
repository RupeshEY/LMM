package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/acl/ECFUploadDocumentACLPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFUploadDocumentACLPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/acl/ECFUploadDocumentACLPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFUploadDocumentACLPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (aDocument :  Document) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButton) at ECFUploadDocumentACLPopup.pcf: line 27, column 121
    function action_1 () : void {
      CurrentLocation.commit()
    }
    
    // 'action' attribute on ToolbarButton (id=cancelButton) at ECFUploadDocumentACLPopup.pcf: line 31, column 116
    function action_2 () : void {
      CurrentLocation.cancel()
    }
    
    // 'afterCommit' attribute on Popup (id=ECFUploadDocumentACLPopup) at ECFUploadDocumentACLPopup.pcf: line 12, column 94
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      aDocument.uploadToIMR(partySet)
    }
    
    // 'def' attribute on ListViewInput at ECFUploadDocumentACLPopup.pcf: line 39, column 31
    function def_onEnter_3 (def :  pcf.ECFACLPartyLV) : void {
      def.onEnter(partySet)
    }
    
    // 'def' attribute on ListViewInput at ECFUploadDocumentACLPopup.pcf: line 39, column 31
    function def_refreshVariables_4 (def :  pcf.ECFACLPartyLV) : void {
      def.refreshVariables(partySet)
    }
    
    // 'initialValue' attribute on Variable at ECFUploadDocumentACLPopup.pcf: line 18, column 77
    function initialValue_0 () : java.util.List<ECFMessageDocumentUploadAccessParty_Ext> {
      return new gw.acc.iplm.entitymapper.imr.docupload.DocumentUploadRqAccessPartyMapper().createUploadAccessParties(aDocument)
    }
    
    override property get CurrentLocation () : pcf.ECFUploadDocumentACLPopup {
      return super.CurrentLocation as pcf.ECFUploadDocumentACLPopup
    }
    
    property get aDocument () : entity.Document {
      return getVariableValue("aDocument", 0) as entity.Document
    }
    
    property set aDocument ($arg :  entity.Document) {
      setVariableValue("aDocument", 0, $arg)
    }
    
    property get partySet () : java.util.List<ECFMessageDocumentUploadAccessParty_Ext> {
      return getVariableValue("partySet", 0) as java.util.List<ECFMessageDocumentUploadAccessParty_Ext>
    }
    
    property set partySet ($arg :  java.util.List<ECFMessageDocumentUploadAccessParty_Ext>) {
      setVariableValue("partySet", 0, $arg)
    }
    
    
  }
  
  
}