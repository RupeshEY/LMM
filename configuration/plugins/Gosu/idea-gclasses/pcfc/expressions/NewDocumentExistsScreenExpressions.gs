package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/NewDocumentExistsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewDocumentExistsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/documents/NewDocumentExistsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewDocumentExistsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at NewDocumentExistsScreen.pcf: line 19, column 82
    function def_onEnter_1 (def :  pcf.DocumentExistenceDetailsInputSet) : void {
      def.onEnter(DocumentCreationInfo.Document)
    }
    
    // 'def' attribute on InputSetRef at NewDocumentExistsScreen.pcf: line 19, column 82
    function def_refreshVariables_2 (def :  pcf.DocumentExistenceDetailsInputSet) : void {
      def.refreshVariables(DocumentCreationInfo.Document)
    }
    
    // EditButtons at NewDocumentExistsScreen.pcf: line 14, column 21
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get DocumentCreationInfo () : gw.document.DocumentCreationInfo {
      return getRequireValue("DocumentCreationInfo", 0) as gw.document.DocumentCreationInfo
    }
    
    property set DocumentCreationInfo ($arg :  gw.document.DocumentCreationInfo) {
      setRequireValue("DocumentCreationInfo", 0, $arg)
    }
    
    
  }
  
  
}