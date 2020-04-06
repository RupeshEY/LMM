package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/ContactDocumentDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactDocumentDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/contacts/ContactDocumentDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactDocumentDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (documentInfo :  ContactDocumentInfo) : int {
      return 0
    }
    
    // 'action' attribute on Link (id=DownloadLink) at ContactDocumentDetailsPopup.pcf: line 31, column 68
    function action_2 () : void {
      documentInfo.download()
    }
    
    // 'columns' attribute on Layout at ContactDocumentDetailsPopup.pcf: line 42, column 25
    function columns_6 () : java.lang.Double {
      return 1
    }
    
    // 'def' attribute on InputSetRef at ContactDocumentDetailsPopup.pcf: line 44, column 63
    function def_onEnter_7 (def :  pcf.ContactDocumentDetailsInputSet) : void {
      def.onEnter(documentInfo)
    }
    
    // 'def' attribute on InputSetRef at ContactDocumentDetailsPopup.pcf: line 44, column 63
    function def_refreshVariables_8 (def :  pcf.ContactDocumentDetailsInputSet) : void {
      def.refreshVariables(documentInfo)
    }
    
    // 'icon' attribute on Link (id=DownloadLink) at ContactDocumentDetailsPopup.pcf: line 31, column 68
    function icon_3 () : java.lang.String {
      return "download_document_16.png" 
    }
    
    // 'initialValue' attribute on Variable at ContactDocumentDetailsPopup.pcf: line 17, column 51
    function initialValue_0 () : gw.contact.ContactDocumentsUIHelper {
      return new gw.contact.ContactDocumentsUIHelper()
    }
    
    // 'tooltip' attribute on Link (id=DownloadLink) at ContactDocumentDetailsPopup.pcf: line 31, column 68
    function tooltip_4 () : java.lang.String {
      return contactDocumentsActionsHelper.DownloadDocumentContentTooltip
    }
    
    // 'visible' attribute on Link (id=DownloadLink) at ContactDocumentDetailsPopup.pcf: line 31, column 68
    function visible_1 () : java.lang.Boolean {
      return documentInfo != null and documentInfo.DMS
    }
    
    // 'visible' attribute on AlertBar (id=ContentlessNoActionsText) at ContactDocumentDetailsPopup.pcf: line 38, column 38
    function visible_5 () : java.lang.Boolean {
      return !documentInfo.DMS
    }
    
    override property get CurrentLocation () : pcf.ContactDocumentDetailsPopup {
      return super.CurrentLocation as pcf.ContactDocumentDetailsPopup
    }
    
    property get contactDocumentsActionsHelper () : gw.contact.ContactDocumentsUIHelper {
      return getVariableValue("contactDocumentsActionsHelper", 0) as gw.contact.ContactDocumentsUIHelper
    }
    
    property set contactDocumentsActionsHelper ($arg :  gw.contact.ContactDocumentsUIHelper) {
      setVariableValue("contactDocumentsActionsHelper", 0, $arg)
    }
    
    property get documentInfo () : ContactDocumentInfo {
      return getVariableValue("documentInfo", 0) as ContactDocumentInfo
    }
    
    property set documentInfo ($arg :  ContactDocumentInfo) {
      setVariableValue("documentInfo", 0, $arg)
    }
    
    
  }
  
  
}