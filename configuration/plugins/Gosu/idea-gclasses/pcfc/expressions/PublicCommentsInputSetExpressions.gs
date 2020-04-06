package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/PublicCommentsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PublicCommentsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/PublicCommentsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PublicCommentsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=PublicCommentInput) at PublicCommentsInputSet.pcf: line 36, column 51
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.NewPublicComments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at PublicCommentsInputSet.pcf: line 15, column 19
    function initialValue_0 () : int {
      return claimResponseRq.PublicComments.Count + claimResponseRq.ClaimDataResponded.PublicComments.Count
    }
    
    // 'regex' attribute on TextAreaInput (id=PublicCommentInput) at PublicCommentsInputSet.pcf: line 36, column 51
    function regex_10 () : java.lang.String {
      return "[a-zA-Z0-9,.\\-_+<>!?%&@*()\\\\/'\":;=\\n ]*"
    }
    
    // 'validationExpression' attribute on TextAreaInput (id=PublicCommentInput) at PublicCommentsInputSet.pcf: line 36, column 51
    function validationExpression_4 () : java.lang.Object {
      return claimResponseRq.validatePublicComments()
    }
    
    // 'value' attribute on TextInput (id=PreviousPublicComments) at PublicCommentsInputSet.pcf: line 22, column 75
    function valueRoot_3 () : java.lang.Object {
      return claimResponseRq.ClaimDataResponded
    }
    
    // 'value' attribute on TextAreaInput (id=PublicCommentInput) at PublicCommentsInputSet.pcf: line 36, column 51
    function valueRoot_9 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on TextInput (id=PreviousPublicComments) at PublicCommentsInputSet.pcf: line 22, column 75
    function value_1 () : java.lang.String {
      return claimResponseRq.ClaimDataResponded.FormattedPublicComments
    }
    
    // 'value' attribute on TextInput (id=RemainingPublicCommentsCount) at PublicCommentsInputSet.pcf: line 43, column 180
    function value_11 () : java.lang.String {
      return DisplayKey.get("Accelerator.IPLM.Web.ClaimResponse.CommentLinesRemaining",claimResponseRq.RemainingPublicLineCount,claimResponseRq.PublicCommentsLimit)
    }
    
    // 'value' attribute on TextAreaInput (id=PublicCommentInput) at PublicCommentsInputSet.pcf: line 36, column 51
    function value_5 () : java.lang.String {
      return claimResponseRq.NewPublicComments
    }
    
    // 'visible' attribute on InputSet (id=PublicCommentEditableInputSet) at PublicCommentsInputSet.pcf: line 25, column 55
    function visible_13 () : java.lang.Boolean {
      return claimResponseRq.PublicCommentEditable
    }
    
    // 'visible' attribute on TextInput (id=PublicCommentNotEditable) at PublicCommentsInputSet.pcf: line 50, column 60
    function visible_14 () : java.lang.Boolean {
      return not claimResponseRq.PublicCommentEditable
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("claimResponseRq", 0, $arg)
    }
    
    property get publicCommentCount () : int {
      return getVariableValue("publicCommentCount", 0) as java.lang.Integer
    }
    
    property set publicCommentCount ($arg :  int) {
      setVariableValue("publicCommentCount", 0, $arg)
    }
    
    
  }
  
  
}