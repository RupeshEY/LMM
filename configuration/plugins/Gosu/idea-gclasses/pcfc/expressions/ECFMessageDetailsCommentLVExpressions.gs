package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsCommentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsCommentLVExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsCommentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsCommentLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsCommentLV.pcf: line 14, column 43
    function value_3 () : ECFMessageComment_Ext[] {
      return comments
    }
    
    property get comments () : ECFMessageComment_Ext[] {
      return getRequireValue("comments", 0) as ECFMessageComment_Ext[]
    }
    
    property set comments ($arg :  ECFMessageComment_Ext[]) {
      setRequireValue("comments", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsCommentLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ECFMessageDetailsCommentLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Detail) at ECFMessageDetailsCommentLV.pcf: line 22, column 35
    function valueRoot_2 () : java.lang.Object {
      return comment
    }
    
    // 'value' attribute on TextCell (id=Detail) at ECFMessageDetailsCommentLV.pcf: line 22, column 35
    function value_0 () : java.lang.String {
      return comment.Detail
    }
    
    property get comment () : ECFMessageComment_Ext {
      return getIteratedValue(1) as ECFMessageComment_Ext
    }
    
    
  }
  
  
}