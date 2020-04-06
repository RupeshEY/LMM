package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newdocument/ClaimNewDocumentLinkedWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewDocumentLinkedWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newdocument/ClaimNewDocumentLinkedWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentLinkedWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (Claim :  Claim, docInit :  util.document.DocumentInitWrapper) : int {
      return 1
    }
    
    // 'def' attribute on ScreenRef at ClaimNewDocumentLinkedWorksheet.pcf: line 30, column 63
    function def_onEnter_2 (def :  pcf.UploadDocumentScreen) : void {
      def.onEnter(DocumentApplicationContext)
    }
    
    // 'def' attribute on ScreenRef at ClaimNewDocumentLinkedWorksheet.pcf: line 30, column 63
    function def_refreshVariables_3 (def :  pcf.UploadDocumentScreen) : void {
      def.refreshVariables(DocumentApplicationContext)
    }
    
    // 'initialValue' attribute on Variable at ClaimNewDocumentLinkedWorksheet.pcf: line 24, column 49
    function initialValue_0 () : util.document.DocumentInitWrapper {
      return null
    }
    
    // 'initialValue' attribute on Variable at ClaimNewDocumentLinkedWorksheet.pcf: line 28, column 54
    function initialValue_1 () : gw.document.DocumentApplicationContext {
      return new gw.document.DocumentCCContext(Claim, docInit.Init, false)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimNewDocumentLinkedWorksheet {
      return super.CurrentLocation as pcf.ClaimNewDocumentLinkedWorksheet
    }
    
    property get DocumentApplicationContext () : gw.document.DocumentApplicationContext {
      return getVariableValue("DocumentApplicationContext", 0) as gw.document.DocumentApplicationContext
    }
    
    property set DocumentApplicationContext ($arg :  gw.document.DocumentApplicationContext) {
      setVariableValue("DocumentApplicationContext", 0, $arg)
    }
    
    property get docInit () : util.document.DocumentInitWrapper {
      return getVariableValue("docInit", 0) as util.document.DocumentInitWrapper
    }
    
    property set docInit ($arg :  util.document.DocumentInitWrapper) {
      setVariableValue("docInit", 0, $arg)
    }
    
    
  }
  
  
}