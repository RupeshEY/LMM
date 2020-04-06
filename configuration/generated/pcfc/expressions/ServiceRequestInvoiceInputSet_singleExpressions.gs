package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ServiceRequestInvoiceInputSet_singleExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ServiceRequestInvoiceInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=NameLink) at ServiceRequestInvoiceInputSet.single.pcf: line 73, column 91
    function action_13 () : void {
      document.downloadContent()
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at ServiceRequestInvoiceInputSet.single.pcf: line 84, column 81
    function action_17 () : void {
      DocumentDetailsPopup.push(document, false)
    }
    
    // 'action' attribute on Link (id=ViewPropertiesLink) at ServiceRequestInvoiceInputSet.single.pcf: line 84, column 81
    function action_dest_18 () : pcf.api.Destination {
      return pcf.DocumentDetailsPopup.createDestination(document, false)
    }
    
    // 'available' attribute on Link (id=NameLink) at ServiceRequestInvoiceInputSet.single.pcf: line 73, column 91
    function available_12 () : java.lang.Boolean {
      return documentsActionsHelper.isViewDocumentContentAvailable(document)
    }
    
    // 'available' attribute on Link (id=ViewPropertiesLink) at ServiceRequestInvoiceInputSet.single.pcf: line 84, column 81
    function available_16 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Icon) at ServiceRequestInvoiceInputSet.single.pcf: line 60, column 36
    function icon_11 () : java.lang.String {
      return document.Icon
    }
    
    // 'icon' attribute on Link (id=ViewPropertiesLink) at ServiceRequestInvoiceInputSet.single.pcf: line 84, column 81
    function icon_19 () : java.lang.String {
      return documentsActionsHelper.DocumentMetadataActionsAvailable ? "info_16.png" : "info_16_disabled.png"
    }
    
    // 'initialValue' attribute on Variable at ServiceRequestInvoiceInputSet.single.pcf: line 53, column 30
    function initialValue_10 () : Document {
      return statementDocumentLinkPair.Second
    }
    
    // RowIterator at ServiceRequestInvoiceInputSet.single.pcf: line 49, column 125
    function initializeVariables_21 () : void {
        document = statementDocumentLinkPair.Second;

    }
    
    // 'label' attribute on Link (id=NameLink) at ServiceRequestInvoiceInputSet.single.pcf: line 73, column 91
    function label_14 () : java.lang.Object {
      return document.Name
    }
    
    // 'tooltip' attribute on Link (id=NameLink) at ServiceRequestInvoiceInputSet.single.pcf: line 73, column 91
    function tooltip_15 () : java.lang.String {
      return documentsActionsHelper.getViewDocumentContentTooltip(document)
    }
    
    // 'tooltip' attribute on Link (id=ViewPropertiesLink) at ServiceRequestInvoiceInputSet.single.pcf: line 84, column 81
    function tooltip_20 () : java.lang.String {
      return documentsActionsHelper.ViewDocumentPropertiesTooltip
    }
    
    property get document () : Document {
      return getVariableValue("document", 1) as Document
    }
    
    property set document ($arg :  Document) {
      setVariableValue("document", 1, $arg)
    }
    
    property get statementDocumentLinkPair () : gw.util.Pair<entity.ServiceRequestStatementDocumentLink, entity.Document> {
      return getIteratedValue(1) as gw.util.Pair<entity.ServiceRequestStatementDocumentLink, entity.Document>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestInvoiceInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ServiceRequestInvoiceInputSet.single.pcf: line 17, column 44
    function initialValue_0 () : entity.ServiceRequestInvoice {
      return Wizard.Check.ServiceRequestInvoices.single()
    }
    
    // 'initialValue' attribute on Variable at ServiceRequestInvoiceInputSet.single.pcf: line 21, column 52
    function initialValue_1 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'value' attribute on TextInput (id=ServiceRequestNumber) at ServiceRequestInvoiceInputSet.single.pcf: line 31, column 60
    function valueRoot_6 () : java.lang.Object {
      return invoice.ServiceRequest
    }
    
    // 'value' attribute on CurrencyInput (id=ServiceRequestInvoiceAmount) at ServiceRequestInvoiceInputSet.single.pcf: line 35, column 31
    function valueRoot_9 () : java.lang.Object {
      return invoice
    }
    
    // 'value' attribute on TextInput (id=ServiceRequestInvoiceReferenceNumber) at ServiceRequestInvoiceInputSet.single.pcf: line 27, column 189
    function value_2 () : java.lang.String {
      return invoice.ReferenceNumber.HasContent ? invoice.ReferenceNumber : DisplayKey.get("NVV.Financials.NewCheck.Check.ServiceRequestInvoice.InvoiceReferenceNumberMissing")
    }
    
    // 'value' attribute on RowIterator at ServiceRequestInvoiceInputSet.single.pcf: line 49, column 125
    function value_22 () : java.util.List<gw.util.Pair<entity.ServiceRequestStatementDocumentLink, entity.Document>> {
      return invoice.ViewableDocumentLinksAndDocuments
    }
    
    // 'value' attribute on TextInput (id=ServiceRequestNumber) at ServiceRequestInvoiceInputSet.single.pcf: line 31, column 60
    function value_4 () : java.lang.String {
      return invoice.ServiceRequest.ServiceRequestNumber
    }
    
    // 'value' attribute on CurrencyInput (id=ServiceRequestInvoiceAmount) at ServiceRequestInvoiceInputSet.single.pcf: line 35, column 31
    function value_7 () : gw.api.financials.CurrencyAmount {
      return invoice.Amount
    }
    
    // 'visible' attribute on ListViewInput (id=ServiceRequestInvoiceDocuments) at ServiceRequestInvoiceInputSet.single.pcf: line 41, column 31
    function visible_23 () : java.lang.Boolean {
      return showDocuments
    }
    
    property get Wizard () : gw.api.financials.CheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get invoice () : entity.ServiceRequestInvoice {
      return getVariableValue("invoice", 0) as entity.ServiceRequestInvoice
    }
    
    property set invoice ($arg :  entity.ServiceRequestInvoice) {
      setVariableValue("invoice", 0, $arg)
    }
    
    property get showDocuments () : boolean {
      return getRequireValue("showDocuments", 0) as java.lang.Boolean
    }
    
    property set showDocuments ($arg :  boolean) {
      setRequireValue("showDocuments", 0, $arg)
    }
    
    
  }
  
  
}