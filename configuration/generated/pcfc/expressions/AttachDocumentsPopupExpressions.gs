package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/AttachDocumentsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AttachDocumentsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/AttachDocumentsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttachDocumentsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest, visibleToSpecialist :  boolean) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at AttachDocumentsPopup.pcf: line 28, column 65
    function def_onEnter_1 (def :  pcf.UploadDocumentScreen) : void {
      def.onEnter(DocumentApplicationContext)
    }
    
    // 'def' attribute on ScreenRef at AttachDocumentsPopup.pcf: line 28, column 65
    function def_refreshVariables_2 (def :  pcf.UploadDocumentScreen) : void {
      def.refreshVariables(DocumentApplicationContext)
    }
    
    // 'initialValue' attribute on Variable at AttachDocumentsPopup.pcf: line 26, column 56
    function initialValue_0 () : gw.document.DocumentApplicationContext {
      return new gw.document.DocumentCCContext(serviceRequest.Claim,       \ doc -> {          doc.RelatedTo = serviceRequest          serviceRequest.attachDocument(doc, visibleToSpecialist)        }, true)
    }
    
    override property get CurrentLocation () : pcf.AttachDocumentsPopup {
      return super.CurrentLocation as pcf.AttachDocumentsPopup
    }
    
    property get DocumentApplicationContext () : gw.document.DocumentApplicationContext {
      return getVariableValue("DocumentApplicationContext", 0) as gw.document.DocumentApplicationContext
    }
    
    property set DocumentApplicationContext ($arg :  gw.document.DocumentApplicationContext) {
      setVariableValue("DocumentApplicationContext", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    property get visibleToSpecialist () : boolean {
      return getVariableValue("visibleToSpecialist", 0) as java.lang.Boolean
    }
    
    property set visibleToSpecialist ($arg :  boolean) {
      setVariableValue("visibleToSpecialist", 0, $arg)
    }
    
    
  }
  
  
}