package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newdocument/NewClaimNewDocumentFromTemplateWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimNewDocumentFromTemplateWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newdocument/NewClaimNewDocumentFromTemplateWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimNewDocumentFromTemplateWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at NewClaimNewDocumentFromTemplateWorksheet.pcf: line 21, column 141
    function def_onEnter_0 (def :  pcf.NewDocumentFromTemplateScreen) : void {
      def.onEnter(Claim, null, gw.document.DocumentsUtil.fetchDocumentTemplate(null, null, CurrentLocation), null)
    }
    
    // 'def' attribute on ScreenRef at NewClaimNewDocumentFromTemplateWorksheet.pcf: line 21, column 141
    function def_refreshVariables_1 (def :  pcf.NewDocumentFromTemplateScreen) : void {
      def.refreshVariables(Claim, null, gw.document.DocumentsUtil.fetchDocumentTemplate(null, null, CurrentLocation), null)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewClaimNewDocumentFromTemplateWorksheet {
      return super.CurrentLocation as pcf.NewClaimNewDocumentFromTemplateWorksheet
    }
    
    
  }
  
  
}