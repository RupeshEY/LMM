package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newdocument/NewClaimNewDocumentLinkedWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimNewDocumentLinkedWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newdocument/NewClaimNewDocumentLinkedWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimNewDocumentLinkedWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at NewClaimNewDocumentLinkedWorksheet.pcf: line 25, column 63
    function def_onEnter_1 (def :  pcf.UploadDocumentScreen) : void {
      def.onEnter(DocumentApplicationContext)
    }
    
    // 'def' attribute on ScreenRef at NewClaimNewDocumentLinkedWorksheet.pcf: line 25, column 63
    function def_refreshVariables_2 (def :  pcf.UploadDocumentScreen) : void {
      def.refreshVariables(DocumentApplicationContext)
    }
    
    // 'initialValue' attribute on Variable at NewClaimNewDocumentLinkedWorksheet.pcf: line 23, column 54
    function initialValue_0 () : gw.document.DocumentApplicationContext {
      return new gw.document.DocumentCCContext(Claim, null, false)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewClaimNewDocumentLinkedWorksheet {
      return super.CurrentLocation as pcf.NewClaimNewDocumentLinkedWorksheet
    }
    
    property get DocumentApplicationContext () : gw.document.DocumentApplicationContext {
      return getVariableValue("DocumentApplicationContext", 0) as gw.document.DocumentApplicationContext
    }
    
    property set DocumentApplicationContext ($arg :  gw.document.DocumentApplicationContext) {
      setVariableValue("DocumentApplicationContext", 0, $arg)
    }
    
    
  }
  
  
}