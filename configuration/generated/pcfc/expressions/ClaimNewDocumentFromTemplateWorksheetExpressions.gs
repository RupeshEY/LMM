package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newdocument/ClaimNewDocumentFromTemplateWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewDocumentFromTemplateWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newdocument/ClaimNewDocumentFromTemplateWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentFromTemplateWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
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
    
    // 'def' attribute on ScreenRef at ClaimNewDocumentFromTemplateWorksheet.pcf: line 26, column 72
    function def_onEnter_1 (def :  pcf.NewDocumentFromTemplateScreen) : void {
      def.onEnter(Claim, docInit, null, null)
    }
    
    // 'def' attribute on ScreenRef at ClaimNewDocumentFromTemplateWorksheet.pcf: line 26, column 72
    function def_refreshVariables_2 (def :  pcf.NewDocumentFromTemplateScreen) : void {
      def.refreshVariables(Claim, docInit, null, null)
    }
    
    // 'initialValue' attribute on Variable at ClaimNewDocumentFromTemplateWorksheet.pcf: line 24, column 49
    function initialValue_0 () : util.document.DocumentInitWrapper {
      return null
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimNewDocumentFromTemplateWorksheet {
      return super.CurrentLocation as pcf.ClaimNewDocumentFromTemplateWorksheet
    }
    
    property get docInit () : util.document.DocumentInitWrapper {
      return getVariableValue("docInit", 0) as util.document.DocumentInitWrapper
    }
    
    property set docInit ($arg :  util.document.DocumentInitWrapper) {
      setVariableValue("docInit", 0, $arg)
    }
    
    
  }
  
  
}