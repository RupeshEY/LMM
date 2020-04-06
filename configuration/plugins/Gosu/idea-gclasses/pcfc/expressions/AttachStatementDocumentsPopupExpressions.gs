package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/AttachStatementDocumentsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AttachStatementDocumentsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/AttachStatementDocumentsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttachStatementDocumentsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (createdStatement :  ServiceRequestStatement) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at AttachStatementDocumentsPopup.pcf: line 25, column 65
    function def_onEnter_1 (def :  pcf.UploadDocumentScreen) : void {
      def.onEnter(DocumentApplicationContext)
    }
    
    // 'def' attribute on ScreenRef at AttachStatementDocumentsPopup.pcf: line 25, column 65
    function def_refreshVariables_2 (def :  pcf.UploadDocumentScreen) : void {
      def.refreshVariables(DocumentApplicationContext)
    }
    
    // 'initialValue' attribute on Variable at AttachStatementDocumentsPopup.pcf: line 23, column 56
    function initialValue_0 () : gw.document.DocumentApplicationContext {
      return new gw.document.DocumentCCContext(createdStatement.ServiceRequest.Claim,       \ doc -> {          doc.RelatedTo = createdStatement.ServiceRequest          createdStatement.attachDocument(doc)        }, true)
    }
    
    override property get CurrentLocation () : pcf.AttachStatementDocumentsPopup {
      return super.CurrentLocation as pcf.AttachStatementDocumentsPopup
    }
    
    property get DocumentApplicationContext () : gw.document.DocumentApplicationContext {
      return getVariableValue("DocumentApplicationContext", 0) as gw.document.DocumentApplicationContext
    }
    
    property set DocumentApplicationContext ($arg :  gw.document.DocumentApplicationContext) {
      setVariableValue("DocumentApplicationContext", 0, $arg)
    }
    
    property get createdStatement () : ServiceRequestStatement {
      return getVariableValue("createdStatement", 0) as ServiceRequestStatement
    }
    
    property set createdStatement ($arg :  ServiceRequestStatement) {
      setVariableValue("createdStatement", 0, $arg)
    }
    
    
  }
  
  
}