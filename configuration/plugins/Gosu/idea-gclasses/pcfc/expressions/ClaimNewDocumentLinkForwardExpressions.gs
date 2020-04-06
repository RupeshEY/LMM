package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/quickjump/contextualforward/ClaimNewDocumentLinkForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewDocumentLinkForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/quickjump/contextualforward/ClaimNewDocumentLinkForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentLinkForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ClaimInfo :  ClaimInfo) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimNewDocumentLinkForward.pcf: line 14, column 51
    function action_0 () : void {
      pcf.ArchivedClaim.go(ClaimInfo)
    }
    
    // 'action' attribute on ForwardCondition at ClaimNewDocumentLinkForward.pcf: line 17, column 51
    function action_3 () : void {
      pcf.ClaimNewDocumentLinkedWorksheet.goInWorkspace(ClaimInfo.Claim);
    }
    
    // 'action' attribute on ForwardCondition at ClaimNewDocumentLinkForward.pcf: line 14, column 51
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ArchivedClaim.createDestination(ClaimInfo)
    }
    
    // 'condition' attribute on ForwardCondition at ClaimNewDocumentLinkForward.pcf: line 14, column 51
    function condition_2 () : java.lang.Boolean {
      return ClaimInfo.ArchiveState != null
    }
    
    // 'condition' attribute on ForwardCondition at ClaimNewDocumentLinkForward.pcf: line 17, column 51
    function condition_4 () : java.lang.Boolean {
      return ClaimInfo.ArchiveState == null
    }
    
    property get ClaimInfo () : ClaimInfo {
      return getVariableValue("ClaimInfo", 0) as ClaimInfo
    }
    
    property set ClaimInfo ($arg :  ClaimInfo) {
      setVariableValue("ClaimInfo", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimNewDocumentLinkForward {
      return super.CurrentLocation as pcf.ClaimNewDocumentLinkForward
    }
    
    
  }
  
  
}