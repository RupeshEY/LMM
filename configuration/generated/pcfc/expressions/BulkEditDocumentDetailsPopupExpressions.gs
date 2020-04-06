package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkEditDocumentDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkEditDocumentDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (documentDetailsHelper :  gw.document.DocumentDetailsApplicationHelper) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at BulkEditDocumentDetailsPopup.pcf: line 26, column 80
    function def_onEnter_1 (def :  pcf.DocumentDetailsEditDVPanelSet) : void {
      def.onEnter(documentDetailsHelper, false)
    }
    
    // 'def' attribute on PanelRef at BulkEditDocumentDetailsPopup.pcf: line 26, column 80
    function def_refreshVariables_2 (def :  pcf.DocumentDetailsEditDVPanelSet) : void {
      def.refreshVariables(documentDetailsHelper, false)
    }
    
    // EditButtons at BulkEditDocumentDetailsPopup.pcf: line 20, column 45
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'value' attribute on RowIterator at BulkEditDocumentDetailsPopup.pcf: line 48, column 43
    function sortValue_3 (documentName :  String) : java.lang.Object {
      return documentName
    }
    
    // 'value' attribute on RowIterator at BulkEditDocumentDetailsPopup.pcf: line 42, column 38
    function value_6 () : String[] {
      return documentDetailsHelper.DocumentNames
    }
    
    // 'visible' attribute on PanelColumn at BulkEditDocumentDetailsPopup.pcf: line 30, column 24
    function visible_7 () : java.lang.Boolean {
      return documentDetailsHelper.AllowFieldsSubset
    }
    
    override property get CurrentLocation () : pcf.BulkEditDocumentDetailsPopup {
      return super.CurrentLocation as pcf.BulkEditDocumentDetailsPopup
    }
    
    property get documentDetailsHelper () : gw.document.DocumentDetailsApplicationHelper {
      return getVariableValue("documentDetailsHelper", 0) as gw.document.DocumentDetailsApplicationHelper
    }
    
    property set documentDetailsHelper ($arg :  gw.document.DocumentDetailsApplicationHelper) {
      setVariableValue("documentDetailsHelper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends BulkEditDocumentDetailsPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=documentName) at BulkEditDocumentDetailsPopup.pcf: line 48, column 43
    function value_4 () : java.lang.String {
      return documentName
    }
    
    property get documentName () : String {
      return getIteratedValue(1) as String
    }
    
    
  }
  
  
}