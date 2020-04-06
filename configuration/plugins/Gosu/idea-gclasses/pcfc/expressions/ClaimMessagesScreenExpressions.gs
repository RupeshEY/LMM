package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/ClaimMessagesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimMessagesScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/ClaimMessagesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMessagesScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef (id=ClaimNotifyPanel) at ClaimMessagesScreen.pcf: line 12, column 29
    function def_onEnter_0 (def :  pcf.ClaimMessagesLV) : void {
      def.onEnter(claim.ValidClaimNotifyRqs, true)
    }
    
    // 'def' attribute on PanelRef (id=ClaimRetrievePanel) at ClaimMessagesScreen.pcf: line 19, column 31
    function def_onEnter_2 (def :  pcf.ClaimMessagesLV) : void {
      def.onEnter(claim.ClaimRetrieveRses.where(\elt -> not elt.ResponseAcknowledgement.IsRejected and not elt.ResponseAcknowledgement.HasNoClaimData), false)
    }
    
    // 'def' attribute on PanelRef (id=ClaimNotifyPanel) at ClaimMessagesScreen.pcf: line 12, column 29
    function def_refreshVariables_1 (def :  pcf.ClaimMessagesLV) : void {
      def.refreshVariables(claim.ValidClaimNotifyRqs, true)
    }
    
    // 'def' attribute on PanelRef (id=ClaimRetrievePanel) at ClaimMessagesScreen.pcf: line 19, column 31
    function def_refreshVariables_3 (def :  pcf.ClaimMessagesLV) : void {
      def.refreshVariables(claim.ClaimRetrieveRses.where(\elt -> not elt.ResponseAcknowledgement.IsRejected and not elt.ResponseAcknowledgement.HasNoClaimData), false)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}