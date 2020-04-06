package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotDocumentsScreen_300Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotDocumentsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotDocumentsScreen.300.pcf: line 27, column 42
    function sortValue_0 (Document :  dynamic.Dynamic) : java.lang.Object {
      return Document.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotDocumentsScreen.300.pcf: line 32, column 42
    function sortValue_1 (Document :  dynamic.Dynamic) : java.lang.Object {
      return Document.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotDocumentsScreen.300.pcf: line 37, column 42
    function sortValue_2 (Document :  dynamic.Dynamic) : java.lang.Object {
      return Document.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotDocumentsScreen.300.pcf: line 42, column 42
    function sortValue_3 (Document :  dynamic.Dynamic) : java.lang.Object {
      return Document.Author
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotDocumentsScreen.300.pcf: line 46, column 71
    function sortValue_4 (Document :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Document.DateModified)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotDocumentsScreen.300.pcf: line 21, column 37
    function value_19 () : dynamic.Dynamic {
      return ((SnapshotParam).Documents).where(\ d -> Claim.canViewDocumentSnapshot(User.util.CurrentUser, d))
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotDocumentsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotDocumentsScreen.300.pcf: line 27, column 42
    function valueRoot_7 () : java.lang.Object {
      return Document
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotDocumentsScreen.300.pcf: line 37, column 42
    function value_11 () : dynamic.Dynamic {
      return Document.Status
    }
    
    // 'value' attribute on TextCell (id=Author) at ClaimSnapshotDocumentsScreen.300.pcf: line 42, column 42
    function value_14 () : dynamic.Dynamic {
      return Document.Author
    }
    
    // 'value' attribute on TextCell (id=DateModified) at ClaimSnapshotDocumentsScreen.300.pcf: line 46, column 71
    function value_17 () : java.lang.String {
      return util.Snapshot.renderValue(Document.DateModified)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotDocumentsScreen.300.pcf: line 27, column 42
    function value_5 () : dynamic.Dynamic {
      return Document.Name
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotDocumentsScreen.300.pcf: line 32, column 42
    function value_8 () : dynamic.Dynamic {
      return Document.Type
    }
    
    property get Document () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}