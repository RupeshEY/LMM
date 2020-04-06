package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/ECFDocumentSearchMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFDocumentSearchMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/documents/ECFDocumentSearchMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFDocumentSearchMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MenuItemIterator (id=transactionReferenceIterator) at ECFDocumentSearchMenuItemSet.pcf: line 17, column 38
    function value_2 () : List<String> {
      return transactionReferences
    }
    
    // 'valueType' attribute on MenuItemIterator (id=transactionReferenceIterator) at ECFDocumentSearchMenuItemSet.pcf: line 17, column 38
    function verifyValueTypeIsAllowedType_3 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on MenuItemIterator (id=transactionReferenceIterator) at ECFDocumentSearchMenuItemSet.pcf: line 17, column 38
    function verifyValueTypeIsAllowedType_3 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on MenuItemIterator (id=transactionReferenceIterator) at ECFDocumentSearchMenuItemSet.pcf: line 17, column 38
    function verifyValueType_4 () : void {
      var __valueTypeArg : List<String>
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the valueType is not a valid type for use with an iterator
      // The valueType for an iterator must be an array or extend from List or IQueryBeanResult
      verifyValueTypeIsAllowedType_3(__valueTypeArg)
    }
    
    property get claim () : entity.Claim {
      return getRequireValue("claim", 0) as entity.Claim
    }
    
    property set claim ($arg :  entity.Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get transactionReferences () : List<String> {
      return getRequireValue("transactionReferences", 0) as List<String>
    }
    
    property set transactionReferences ($arg :  List<String>) {
      setRequireValue("transactionReferences", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/documents/ECFDocumentSearchMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ECFDocumentSearchMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=transactionReferenceID) at ECFDocumentSearchMenuItemSet.pcf: line 21, column 129
    function action_0 () : void {
      new gw.acc.iplm.controller.IMRMessageController().sendRepositorySearchRequestForClaim(claim, transactionReference as String)
    }
    
    // 'label' attribute on MenuItem (id=transactionReferenceID) at ECFDocumentSearchMenuItemSet.pcf: line 21, column 129
    function label_1 () : java.lang.Object {
      return DisplayKey.get("Accelerator.IPLM.Web.DocumentsLV.Button.IMRDocumentSearch.TR", transactionReference)
    }
    
    property get transactionReference () : java.lang.Object {
      return getIteratedValue(1) as java.lang.Object
    }
    
    
  }
  
  
}