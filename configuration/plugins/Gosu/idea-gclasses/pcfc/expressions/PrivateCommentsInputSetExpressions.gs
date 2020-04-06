package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/PrivateCommentsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PrivateCommentsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/PrivateCommentsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrivateCommentsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=PrivateCommentInput) at PrivateCommentsInputSet.pcf: line 36, column 52
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.NewPrivateComments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at PrivateCommentsInputSet.pcf: line 15, column 19
    function initialValue_0 () : int {
      return claimResponseRq.PrivateComments.Count + claimResponseRq.ClaimDataResponded.PrivateComments.Count
    }
    
    // 'regex' attribute on TextAreaInput (id=PrivateCommentInput) at PrivateCommentsInputSet.pcf: line 36, column 52
    function regex_10 () : java.lang.String {
      return "[a-zA-Z0-9,.\\-_+<>!?%&@*()\\\\/'\":;=\\n ]*"
    }
    
    // 'validationExpression' attribute on TextAreaInput (id=PrivateCommentInput) at PrivateCommentsInputSet.pcf: line 36, column 52
    function validationExpression_4 () : java.lang.Object {
      return claimResponseRq.validatePrivateComments()
    }
    
    // 'value' attribute on TextInput (id=PreviousPrivateComments) at PrivateCommentsInputSet.pcf: line 22, column 76
    function valueRoot_3 () : java.lang.Object {
      return claimResponseRq.ClaimDataResponded
    }
    
    // 'value' attribute on TextAreaInput (id=PrivateCommentInput) at PrivateCommentsInputSet.pcf: line 36, column 52
    function valueRoot_9 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on TextInput (id=PreviousPrivateComments) at PrivateCommentsInputSet.pcf: line 22, column 76
    function value_1 () : java.lang.String {
      return claimResponseRq.ClaimDataResponded.FormattedPrivateComments
    }
    
    // 'value' attribute on TextInput (id=RemainingPrivateCommentsCount) at PrivateCommentsInputSet.pcf: line 43, column 182
    function value_11 () : java.lang.String {
      return DisplayKey.get("Accelerator.IPLM.Web.ClaimResponse.CommentLinesRemaining",claimResponseRq.RemainingPrivateLineCount,claimResponseRq.PrivateCommentsLimit)
    }
    
    // 'value' attribute on TextAreaInput (id=PrivateCommentInput) at PrivateCommentsInputSet.pcf: line 36, column 52
    function value_5 () : java.lang.String {
      return claimResponseRq.NewPrivateComments
    }
    
    // 'visible' attribute on InputSet (id=PrivateCommentEditableInputSet) at PrivateCommentsInputSet.pcf: line 25, column 56
    function visible_13 () : java.lang.Boolean {
      return claimResponseRq.PrivateCommentEditable
    }
    
    // 'visible' attribute on TextInput (id=PrivateCommentNotEditable) at PrivateCommentsInputSet.pcf: line 50, column 61
    function visible_14 () : java.lang.Boolean {
      return not claimResponseRq.PrivateCommentEditable
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("claimResponseRq", 0, $arg)
    }
    
    property get privateCommentCount () : int {
      return getVariableValue("privateCommentCount", 0) as java.lang.Integer
    }
    
    property set privateCommentCount ($arg :  int) {
      setVariableValue("privateCommentCount", 0, $arg)
    }
    
    
  }
  
  
}