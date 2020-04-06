package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsCrossMarketCommentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsCrossMarketCommentLVExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsCrossMarketCommentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsCrossMarketCommentLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsCrossMarketCommentLV.pcf: line 14, column 54
    function value_9 () : ECFMessageCrossMarketComment_Ext[] {
      return comments
    }
    
    property get comments () : ECFMessageCrossMarketComment_Ext[] {
      return getRequireValue("comments", 0) as ECFMessageCrossMarketComment_Ext[]
    }
    
    property set comments ($arg :  ECFMessageCrossMarketComment_Ext[]) {
      setRequireValue("comments", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsCrossMarketCommentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ECFMessageDetailsCrossMarketCommentLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Detail) at ECFMessageDetailsCrossMarketCommentLV.pcf: line 22, column 35
    function valueRoot_2 () : java.lang.Object {
      return comment
    }
    
    // 'value' attribute on TextCell (id=BureauAgency) at ECFMessageDetailsCrossMarketCommentLV.pcf: line 28, column 53
    function valueRoot_5 () : java.lang.Object {
      return comment.BureauAgency
    }
    
    // 'value' attribute on TextCell (id=Detail) at ECFMessageDetailsCrossMarketCommentLV.pcf: line 22, column 35
    function value_0 () : java.lang.String {
      return comment.Detail
    }
    
    // 'value' attribute on TextCell (id=BureauAgency) at ECFMessageDetailsCrossMarketCommentLV.pcf: line 28, column 53
    function value_3 () : java.lang.String {
      return comment.BureauAgency.DisplayName
    }
    
    // 'value' attribute on TextCell (id=SyndicateName) at ECFMessageDetailsCrossMarketCommentLV.pcf: line 34, column 42
    function value_6 () : java.lang.String {
      return comment.SyndicateName
    }
    
    property get comment () : ECFMessageCrossMarketComment_Ext {
      return getIteratedValue(1) as ECFMessageCrossMarketComment_Ext
    }
    
    
  }
  
  
}