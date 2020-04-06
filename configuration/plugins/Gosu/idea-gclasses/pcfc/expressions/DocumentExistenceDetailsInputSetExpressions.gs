package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentExistenceDetailsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentExistenceDetailsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=Section) at DocumentExistenceDetailsInputSet.pcf: line 30, column 44
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Section = (__VALUE_TO_SET as typekey.DocumentSection)
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at DocumentExistenceDetailsInputSet.pcf: line 43, column 55
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on TextInput (id=Name) at DocumentExistenceDetailsInputSet.pcf: line 19, column 30
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Author) at DocumentExistenceDetailsInputSet.pcf: line 70, column 32
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Author = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Recipient) at DocumentExistenceDetailsInputSet.pcf: line 75, column 35
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Recipient = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InBound) at DocumentExistenceDetailsInputSet.pcf: line 81, column 33
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Inbound = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at DocumentExistenceDetailsInputSet.pcf: line 88, column 47
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Status = (__VALUE_TO_SET as typekey.DocumentStatusType)
    }
    
    // 'value' attribute on TypeKeyInput (id=SecurityType) at DocumentExistenceDetailsInputSet.pcf: line 94, column 49
    function defaultSetter_50 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.SecurityType = (__VALUE_TO_SET as typekey.DocumentSecurityType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at DocumentExistenceDetailsInputSet.pcf: line 101, column 41
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Type = (__VALUE_TO_SET as typekey.DocumentType)
    }
    
    // 'value' attribute on TextInput (id=Description) at DocumentExistenceDetailsInputSet.pcf: line 24, column 37
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      Document.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on RangeInput (id=RelatedTo) at DocumentExistenceDetailsInputSet.pcf: line 43, column 55
    function editable_13 () : java.lang.Boolean {
      return new gw.document.DocumentDetailsCCHelper(Document).RelatedToEditable
    }
    
    // 'initialValue' attribute on Variable at DocumentExistenceDetailsInputSet.pcf: line 13, column 32
    function initialValue_0 () : ServiceRequest[] {
      return Document.RelatedServiceRequests.toTypedArray()
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=RelatedTo) at DocumentExistenceDetailsInputSet.pcf: line 43, column 55
    function optionGroupLabel_21 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=RelatedTo) at DocumentExistenceDetailsInputSet.pcf: line 43, column 55
    function optionLabel_22 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'value' attribute on RowIterator at DocumentExistenceDetailsInputSet.pcf: line 61, column 28
    function sortValue_26 (ServiceRequest :  entity.ServiceRequest) : java.lang.Object {
      return ServiceRequest.DisplayName
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at DocumentExistenceDetailsInputSet.pcf: line 43, column 55
    function valueRange_23 () : java.lang.Object {
      return Document.Claim.RelatedToCandidates
    }
    
    // 'value' attribute on TextInput (id=Name) at DocumentExistenceDetailsInputSet.pcf: line 19, column 30
    function valueRoot_4 () : java.lang.Object {
      return Document
    }
    
    // 'value' attribute on TextInput (id=Name) at DocumentExistenceDetailsInputSet.pcf: line 19, column 30
    function value_1 () : java.lang.String {
      return Document.Name
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at DocumentExistenceDetailsInputSet.pcf: line 43, column 55
    function value_15 () : gw.pl.persistence.core.Bean {
      return Document.RelatedTo
    }
    
    // 'value' attribute on RowIterator at DocumentExistenceDetailsInputSet.pcf: line 55, column 47
    function value_30 () : entity.ServiceRequest[] {
      return relatedServiceRequests
    }
    
    // 'value' attribute on TextInput (id=Author) at DocumentExistenceDetailsInputSet.pcf: line 70, column 32
    function value_32 () : java.lang.String {
      return Document.Author
    }
    
    // 'value' attribute on TextInput (id=Recipient) at DocumentExistenceDetailsInputSet.pcf: line 75, column 35
    function value_36 () : java.lang.String {
      return Document.Recipient
    }
    
    // 'value' attribute on BooleanRadioInput (id=InBound) at DocumentExistenceDetailsInputSet.pcf: line 81, column 33
    function value_40 () : java.lang.Boolean {
      return Document.Inbound
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at DocumentExistenceDetailsInputSet.pcf: line 88, column 47
    function value_44 () : typekey.DocumentStatusType {
      return Document.Status
    }
    
    // 'value' attribute on TypeKeyInput (id=SecurityType) at DocumentExistenceDetailsInputSet.pcf: line 94, column 49
    function value_48 () : typekey.DocumentSecurityType {
      return Document.SecurityType
    }
    
    // 'value' attribute on TextInput (id=Description) at DocumentExistenceDetailsInputSet.pcf: line 24, column 37
    function value_5 () : java.lang.String {
      return Document.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at DocumentExistenceDetailsInputSet.pcf: line 101, column 41
    function value_52 () : typekey.DocumentType {
      return Document.Type
    }
    
    // 'value' attribute on TypeKeyInput (id=Section) at DocumentExistenceDetailsInputSet.pcf: line 30, column 44
    function value_9 () : typekey.DocumentSection {
      return Document.Section
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at DocumentExistenceDetailsInputSet.pcf: line 43, column 55
    function verifyValueRangeIsAllowedType_24 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at DocumentExistenceDetailsInputSet.pcf: line 43, column 55
    function verifyValueRangeIsAllowedType_24 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at DocumentExistenceDetailsInputSet.pcf: line 43, column 55
    function verifyValueRange_25 () : void {
      var __valueRangeArg = Document.Claim.RelatedToCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_24(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=RelatedTo) at DocumentExistenceDetailsInputSet.pcf: line 43, column 55
    function visible_14 () : java.lang.Boolean {
      return relatedServiceRequests.Count <= 1
    }
    
    // 'visible' attribute on ListViewInput at DocumentExistenceDetailsInputSet.pcf: line 46, column 53
    function visible_31 () : java.lang.Boolean {
      return relatedServiceRequests.Count > 1
    }
    
    property get Document () : Document {
      return getRequireValue("Document", 0) as Document
    }
    
    property set Document ($arg :  Document) {
      setRequireValue("Document", 0, $arg)
    }
    
    property get relatedServiceRequests () : ServiceRequest[] {
      return getVariableValue("relatedServiceRequests", 0) as ServiceRequest[]
    }
    
    property set relatedServiceRequests ($arg :  ServiceRequest[]) {
      setVariableValue("relatedServiceRequests", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DocumentExistenceDetailsInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestDisplayName) at DocumentExistenceDetailsInputSet.pcf: line 61, column 28
    function valueRoot_29 () : java.lang.Object {
      return ServiceRequest
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestDisplayName) at DocumentExistenceDetailsInputSet.pcf: line 61, column 28
    function value_27 () : java.lang.String {
      return ServiceRequest.DisplayName
    }
    
    property get ServiceRequest () : entity.ServiceRequest {
      return getIteratedValue(1) as entity.ServiceRequest
    }
    
    
  }
  
  
}