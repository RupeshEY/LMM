package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newdocument/NewClaimNewDocumentExistsWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimNewDocumentExistsWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newdocument/NewClaimNewDocumentExistsWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimNewDocumentExistsWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Worksheet (id=NewClaimNewDocumentExistsWorksheet) at NewClaimNewDocumentExistsWorksheet.pcf: line 13, column 36
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      DocumentCreationInfo.Document.documentExistenceBeforeCommit()
    }
    
    // 'def' attribute on ScreenRef at NewClaimNewDocumentExistsWorksheet.pcf: line 26, column 67
    function def_onEnter_1 (def :  pcf.NewDocumentExistsScreen) : void {
      def.onEnter(DocumentCreationInfo, Claim)
    }
    
    // 'def' attribute on ScreenRef at NewClaimNewDocumentExistsWorksheet.pcf: line 26, column 67
    function def_refreshVariables_2 (def :  pcf.NewDocumentExistsScreen) : void {
      def.refreshVariables(DocumentCreationInfo, Claim)
    }
    
    // 'initialValue' attribute on Variable at NewClaimNewDocumentExistsWorksheet.pcf: line 24, column 48
    function initialValue_0 () : gw.document.DocumentCreationInfo {
      return gw.document.DocumentsUtil.createDocumentCreationInfo(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewClaimNewDocumentExistsWorksheet {
      return super.CurrentLocation as pcf.NewClaimNewDocumentExistsWorksheet
    }
    
    property get DocumentCreationInfo () : gw.document.DocumentCreationInfo {
      return getVariableValue("DocumentCreationInfo", 0) as gw.document.DocumentCreationInfo
    }
    
    property set DocumentCreationInfo ($arg :  gw.document.DocumentCreationInfo) {
      setVariableValue("DocumentCreationInfo", 0, $arg)
    }
    
    
  }
  
  
}