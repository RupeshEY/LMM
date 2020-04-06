package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsCommentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsCommentDVExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsCommentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsCommentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput (id=BrokerComments) at ECFMessageDetailsCommentDV.pcf: line 16, column 27
    function def_onEnter_0 (def :  pcf.ECFMessageDetailsCommentLV) : void {
      def.onEnter(claimDataMsg?.BrokerComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessageBrokerComment_Ext[claimDataMsg?.BrokerComments?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=CrossMarketPrivateComments) at ECFMessageDetailsCommentDV.pcf: line 56, column 27
    function def_onEnter_10 (def :  pcf.ECFMessageDetailsCrossMarketCommentLV) : void {
      def.onEnter(claimDataMsg?.CrossMarketPrivateComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessageCrossMarketPrivateComment_Ext[claimDataMsg?.CrossMarketPrivateComments?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=AggregateDetails) at ECFMessageDetailsCommentDV.pcf: line 64, column 27
    function def_onEnter_12 (def :  pcf.ECFMessageDetailsCommentLV) : void {
      def.onEnter(claimDataMsg?.AggregateDetails?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessageAggregateDetail_Ext[claimDataMsg?.AggregateDetails?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=PublicComments) at ECFMessageDetailsCommentDV.pcf: line 24, column 27
    function def_onEnter_2 (def :  pcf.ECFMessageDetailsCommentLV) : void {
      def.onEnter(claimDataMsg?.PublicComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessagePublicComment_Ext[claimDataMsg?.PublicComments?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=PrivateComments) at ECFMessageDetailsCommentDV.pcf: line 32, column 27
    function def_onEnter_4 (def :  pcf.ECFMessageDetailsCommentLV) : void {
      def.onEnter(claimDataMsg?.PrivateComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessagePrivateComment_Ext[claimDataMsg?.PrivateComments?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=SlipLeadComments) at ECFMessageDetailsCommentDV.pcf: line 40, column 27
    function def_onEnter_6 (def :  pcf.ECFMessageDetailsCommentLV) : void {
      def.onEnter(claimDataMsg?.SlipLeadComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessageSlipLeadComment_Ext[claimDataMsg?.SlipLeadComments?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=CrossMarketPublicComments) at ECFMessageDetailsCommentDV.pcf: line 48, column 27
    function def_onEnter_8 (def :  pcf.ECFMessageDetailsCrossMarketCommentLV) : void {
      def.onEnter(claimDataMsg?.CrossMarketPublicComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessageCrossMarketPublicComment_Ext[claimDataMsg?.CrossMarketPublicComments?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=BrokerComments) at ECFMessageDetailsCommentDV.pcf: line 16, column 27
    function def_refreshVariables_1 (def :  pcf.ECFMessageDetailsCommentLV) : void {
      def.refreshVariables(claimDataMsg?.BrokerComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessageBrokerComment_Ext[claimDataMsg?.BrokerComments?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=CrossMarketPrivateComments) at ECFMessageDetailsCommentDV.pcf: line 56, column 27
    function def_refreshVariables_11 (def :  pcf.ECFMessageDetailsCrossMarketCommentLV) : void {
      def.refreshVariables(claimDataMsg?.CrossMarketPrivateComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessageCrossMarketPrivateComment_Ext[claimDataMsg?.CrossMarketPrivateComments?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=AggregateDetails) at ECFMessageDetailsCommentDV.pcf: line 64, column 27
    function def_refreshVariables_13 (def :  pcf.ECFMessageDetailsCommentLV) : void {
      def.refreshVariables(claimDataMsg?.AggregateDetails?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessageAggregateDetail_Ext[claimDataMsg?.AggregateDetails?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=PublicComments) at ECFMessageDetailsCommentDV.pcf: line 24, column 27
    function def_refreshVariables_3 (def :  pcf.ECFMessageDetailsCommentLV) : void {
      def.refreshVariables(claimDataMsg?.PublicComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessagePublicComment_Ext[claimDataMsg?.PublicComments?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=PrivateComments) at ECFMessageDetailsCommentDV.pcf: line 32, column 27
    function def_refreshVariables_5 (def :  pcf.ECFMessageDetailsCommentLV) : void {
      def.refreshVariables(claimDataMsg?.PrivateComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessagePrivateComment_Ext[claimDataMsg?.PrivateComments?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=SlipLeadComments) at ECFMessageDetailsCommentDV.pcf: line 40, column 27
    function def_refreshVariables_7 (def :  pcf.ECFMessageDetailsCommentLV) : void {
      def.refreshVariables(claimDataMsg?.SlipLeadComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessageSlipLeadComment_Ext[claimDataMsg?.SlipLeadComments?.length]))
    }
    
    // 'def' attribute on ListViewInput (id=CrossMarketPublicComments) at ECFMessageDetailsCommentDV.pcf: line 48, column 27
    function def_refreshVariables_9 (def :  pcf.ECFMessageDetailsCrossMarketCommentLV) : void {
      def.refreshVariables(claimDataMsg?.CrossMarketPublicComments?.orderBy(\e -> e?.LineNumber)?.toArray(new ECFMessageCrossMarketPublicComment_Ext[claimDataMsg?.CrossMarketPublicComments?.length]))
    }
    
    property get claimDataMsg () : ECFMessageClaimData_Ext {
      return getRequireValue("claimDataMsg", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimDataMsg ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("claimDataMsg", 0, $arg)
    }
    
    
  }
  
  
}