package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/PickExistingDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickExistingDocumentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/documents/PickExistingDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PickExistingDocumentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Icon) at PickExistingDocumentsLV.pcf: line 23, column 32
    function icon_6 () : java.lang.String {
      return document.Icon
    }
    
    // 'pickValue' attribute on RowIterator at PickExistingDocumentsLV.pcf: line 16, column 75
    function pickValue_25 () : Document {
      return document
    }
    
    // 'value' attribute on TextCell (id=Name) at PickExistingDocumentsLV.pcf: line 29, column 24
    function valueRoot_9 () : java.lang.Object {
      return document
    }
    
    // 'value' attribute on TextCell (id=RelatedTo) at PickExistingDocumentsLV.pcf: line 34, column 31
    function value_10 () : String {
      return document.RelatedTo as String
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at PickExistingDocumentsLV.pcf: line 40, column 45
    function value_13 () : typekey.DocumentType {
      return document.Type
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at PickExistingDocumentsLV.pcf: line 45, column 51
    function value_16 () : typekey.DocumentStatusType {
      return document.Status
    }
    
    // 'value' attribute on TextCell (id=Author) at PickExistingDocumentsLV.pcf: line 50, column 36
    function value_19 () : java.lang.String {
      return document.Author
    }
    
    // 'value' attribute on DateCell (id=DateModified) at PickExistingDocumentsLV.pcf: line 59, column 24
    function value_22 () : java.util.Date {
      return document.DateModified
    }
    
    // 'value' attribute on TextCell (id=Name) at PickExistingDocumentsLV.pcf: line 29, column 24
    function value_7 () : java.lang.String {
      return document.Name
    }
    
    property get document () : entity.Document {
      return getIteratedValue(1) as entity.Document
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/documents/PickExistingDocumentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickExistingDocumentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at PickExistingDocumentsLV.pcf: line 29, column 24
    function sortValue_0 (document :  entity.Document) : java.lang.Object {
      return document.Name
    }
    
    // 'value' attribute on RowIterator at PickExistingDocumentsLV.pcf: line 34, column 31
    function sortValue_1 (document :  entity.Document) : java.lang.Object {
      return document.RelatedTo as String
    }
    
    // 'value' attribute on RowIterator at PickExistingDocumentsLV.pcf: line 40, column 45
    function sortValue_2 (document :  entity.Document) : java.lang.Object {
      return document.Type
    }
    
    // 'value' attribute on RowIterator at PickExistingDocumentsLV.pcf: line 45, column 51
    function sortValue_3 (document :  entity.Document) : java.lang.Object {
      return document.Status
    }
    
    // 'value' attribute on RowIterator at PickExistingDocumentsLV.pcf: line 50, column 36
    function sortValue_4 (document :  entity.Document) : java.lang.Object {
      return document.Author
    }
    
    // 'value' attribute on RowIterator at PickExistingDocumentsLV.pcf: line 59, column 24
    function sortValue_5 (document :  entity.Document) : java.lang.Object {
      return document.DateModified
    }
    
    // 'value' attribute on RowIterator at PickExistingDocumentsLV.pcf: line 16, column 75
    function value_26 () : gw.api.database.IQueryBeanResult<entity.Document> {
      return DocumentList
    }
    
    property get DocumentList () : gw.api.database.IQueryBeanResult<Document> {
      return getRequireValue("DocumentList", 0) as gw.api.database.IQueryBeanResult<Document>
    }
    
    property set DocumentList ($arg :  gw.api.database.IQueryBeanResult<Document>) {
      setRequireValue("DocumentList", 0, $arg)
    }
    
    
  }
  
  
}