package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactDocumentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactDocumentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDocumentsLV.pcf: line 13, column 51
    function initialValue_0 () : gw.contact.ContactDocumentsUIHelper {
      return new gw.contact.ContactDocumentsUIHelper()
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDocumentsLV.pcf: line 18, column 44
    function initialValue_1 () : entity.ContactDocumentInfo[] {
      return contactDocumentHelper.isVendorDocumentsSupported(contact) ? contactDocumentHelper.retrieveContactDocuments(contact.AddressBookUID)?.toTypedArray() : {}
    }
    
    // 'sortBy' attribute on RowIterator at AddressBookContactDocumentsLV.pcf: line 41, column 23
    function sortValue_2 (documentInfo :  entity.ContactDocumentInfo) : java.lang.Object {
      return documentInfo.Name
    }
    
    // 'value' attribute on RowIterator at AddressBookContactDocumentsLV.pcf: line 73, column 45
    function sortValue_3 (documentInfo :  entity.ContactDocumentInfo) : java.lang.Object {
      return documentInfo.Type
    }
    
    // 'value' attribute on RowIterator at AddressBookContactDocumentsLV.pcf: line 78, column 51
    function sortValue_4 (documentInfo :  entity.ContactDocumentInfo) : java.lang.Object {
      return documentInfo.Status
    }
    
    // 'value' attribute on RowIterator at AddressBookContactDocumentsLV.pcf: line 83, column 40
    function sortValue_5 (documentInfo :  entity.ContactDocumentInfo) : java.lang.Object {
      return documentInfo.Author
    }
    
    // 'value' attribute on RowIterator at AddressBookContactDocumentsLV.pcf: line 92, column 24
    function sortValue_6 (documentInfo :  entity.ContactDocumentInfo) : java.lang.Object {
      return documentInfo.DateModified
    }
    
    // 'sortBy' attribute on RowIterator at AddressBookContactDocumentsLV.pcf: line 99, column 86
    function sortValue_8 (documentInfo :  entity.ContactDocumentInfo) : java.lang.Object {
      return documentInfo.Obsolete
    }
    
    // 'value' attribute on RowIterator at AddressBookContactDocumentsLV.pcf: line 24, column 41
    function value_37 () : ContactDocumentInfo[] {
      return contactDocumentInfos
    }
    
    // 'visible' attribute on RowIterator at AddressBookContactDocumentsLV.pcf: line 99, column 86
    function visible_7 () : java.lang.Boolean {
      return contactDocumentInfos?.hasMatch(\ docInfo -> docInfo.Obsolete)
    }
    
    property get contact () : Contact {
      return getRequireValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
      setRequireValue("contact", 0, $arg)
    }
    
    property get contactDocumentHelper () : gw.contact.ContactDocumentsUIHelper {
      return getVariableValue("contactDocumentHelper", 0) as gw.contact.ContactDocumentsUIHelper
    }
    
    property set contactDocumentHelper ($arg :  gw.contact.ContactDocumentsUIHelper) {
      setVariableValue("contactDocumentHelper", 0, $arg)
    }
    
    property get contactDocumentInfos () : entity.ContactDocumentInfo[] {
      return getVariableValue("contactDocumentInfos", 0) as entity.ContactDocumentInfo[]
    }
    
    property set contactDocumentInfos ($arg :  entity.ContactDocumentInfo[]) {
      setVariableValue("contactDocumentInfos", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddressBookContactDocumentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=NameLink) at AddressBookContactDocumentsLV.pcf: line 48, column 97
    function action_12 () : void {
      documentInfo.download()
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at AddressBookContactDocumentsLV.pcf: line 58, column 84
    function action_15 () : void {
      ContactDocumentDetailsPopup.push(documentInfo)
    }
    
    // 'action' attribute on Link (id=DownloadLink) at AddressBookContactDocumentsLV.pcf: line 66, column 66
    function action_19 () : void {
      documentInfo.download()
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at AddressBookContactDocumentsLV.pcf: line 58, column 84
    function action_dest_16 () : pcf.api.Destination {
      return pcf.ContactDocumentDetailsPopup.createDestination(documentInfo)
    }
    
    // 'available' attribute on Link (id=NameLink) at AddressBookContactDocumentsLV.pcf: line 48, column 97
    function available_11 () : java.lang.Boolean {
      return gw.document.DocumentsUtil.isDocumentMimeTypeAllowed(documentInfo.MimeType) 
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Icon) at AddressBookContactDocumentsLV.pcf: line 35, column 32
    function icon_10 () : java.lang.String {
      return documentInfo.Icon
    }
    
    // 'icon' attribute on Link (id=DownloadLink) at AddressBookContactDocumentsLV.pcf: line 66, column 66
    function icon_20 () : java.lang.String {
      return "download_document_16.png" 
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDocumentsLV.pcf: line 28, column 53
    function initialValue_9 () : gw.contact.ContactDocumentsUIHelper {
      return new gw.contact.ContactDocumentsUIHelper()
    }
    
    // RowIterator at AddressBookContactDocumentsLV.pcf: line 24, column 41
    function initializeVariables_36 () : void {
        contactDocumentsActionsHelper = new gw.contact.ContactDocumentsUIHelper();

    }
    
    // 'label' attribute on Link (id=NameLink) at AddressBookContactDocumentsLV.pcf: line 48, column 97
    function label_13 () : java.lang.Object {
      return documentInfo.Name
    }
    
    // 'tooltip' attribute on Link (id=NameLink) at AddressBookContactDocumentsLV.pcf: line 48, column 97
    function tooltip_14 () : java.lang.String {
      return contactDocumentsActionsHelper.isViewDocumentContentTooltip(documentInfo)
    }
    
    // 'tooltip' attribute on Link (id=ViewPropertiesLink) at AddressBookContactDocumentsLV.pcf: line 58, column 84
    function tooltip_17 () : java.lang.String {
      return contactDocumentsActionsHelper.ViewDocumentPropertiesTooltip
    }
    
    // 'tooltip' attribute on Link (id=DownloadLink) at AddressBookContactDocumentsLV.pcf: line 66, column 66
    function tooltip_21 () : java.lang.String {
      return contactDocumentsActionsHelper.DownloadDocumentContentTooltip
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at AddressBookContactDocumentsLV.pcf: line 73, column 45
    function valueRoot_24 () : java.lang.Object {
      return documentInfo
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at AddressBookContactDocumentsLV.pcf: line 73, column 45
    function value_22 () : typekey.DocumentType {
      return documentInfo.Type
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at AddressBookContactDocumentsLV.pcf: line 78, column 51
    function value_25 () : typekey.DocumentStatusType {
      return documentInfo.Status
    }
    
    // 'value' attribute on TextCell (id=Author) at AddressBookContactDocumentsLV.pcf: line 83, column 40
    function value_28 () : java.lang.String {
      return documentInfo.Author
    }
    
    // 'value' attribute on DateCell (id=DateModified) at AddressBookContactDocumentsLV.pcf: line 92, column 24
    function value_31 () : java.util.Date {
      return documentInfo.DateModified
    }
    
    // 'visible' attribute on Link (id=DownloadLink) at AddressBookContactDocumentsLV.pcf: line 66, column 66
    function visible_18 () : java.lang.Boolean {
      return documentInfo != null and documentInfo.DMS
    }
    
    // 'visible' attribute on Link (id=Hidden) at AddressBookContactDocumentsLV.pcf: line 103, column 46
    function visible_34 () : java.lang.Boolean {
      return documentInfo.Obsolete
    }
    
    // 'visible' attribute on LinkCell (id=HiddenDocument) at AddressBookContactDocumentsLV.pcf: line 99, column 86
    function visible_35 () : java.lang.Boolean {
      return contactDocumentInfos?.hasMatch(\ docInfo -> docInfo.Obsolete)
    }
    
    property get contactDocumentsActionsHelper () : gw.contact.ContactDocumentsUIHelper {
      return getVariableValue("contactDocumentsActionsHelper", 1) as gw.contact.ContactDocumentsUIHelper
    }
    
    property set contactDocumentsActionsHelper ($arg :  gw.contact.ContactDocumentsUIHelper) {
      setVariableValue("contactDocumentsActionsHelper", 1, $arg)
    }
    
    property get documentInfo () : entity.ContactDocumentInfo {
      return getIteratedValue(1) as entity.ContactDocumentInfo
    }
    
    
  }
  
  
}