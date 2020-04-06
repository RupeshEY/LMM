package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/lm/LMSuspenseQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LMSuspenseQueueLVExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/lm/LMSuspenseQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LMSuspenseQueueLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at LMSuspenseQueueLV.pcf: line 29, column 38
    function condition_9 () : java.lang.Boolean {
      return message.ApplicableToPolicy
    }
    
    // 'initialValue' attribute on Variable at LMSuspenseQueueLV.pcf: line 26, column 40
    function initialValue_8 () : LMMessageLloydsSCM_Ext {
      return messageIterator as LMMessageLloydsSCM_Ext
    }
    
    // RowIterator (id=RowIterator) at LMSuspenseQueueLV.pcf: line 22, column 51
    function initializeVariables_34 () : void {
        message = messageIterator as LMMessageLloydsSCM_Ext;

    }
    
    // 'value' attribute on TextCell (id=umr) at LMSuspenseQueueLV.pcf: line 37, column 32
    function valueRoot_12 () : java.lang.Object {
      return message
    }
    
    // 'value' attribute on TextCell (id=umr) at LMSuspenseQueueLV.pcf: line 37, column 32
    function value_10 () : java.lang.String {
      return message.UMR
    }
    
    // 'value' attribute on TextCell (id=ucr) at LMSuspenseQueueLV.pcf: line 42, column 32
    function value_13 () : java.lang.String {
      return message.UCR
    }
    
    // 'value' attribute on TextCell (id=ocr) at LMSuspenseQueueLV.pcf: line 46, column 32
    function value_16 () : java.lang.String {
      return message.OCR
    }
    
    // 'value' attribute on TextCell (id=movementReference) at LMSuspenseQueueLV.pcf: line 51, column 31
    function value_19 () : String {
      return message.MovementReferenceSequence
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at LMSuspenseQueueLV.pcf: line 55, column 41
    function value_22 () : java.lang.String {
      return message.PolicyNumber
    }
    
    // 'value' attribute on DateCell (id=lossDate) at LMSuspenseQueueLV.pcf: line 59, column 42
    function value_25 () : java.util.Date {
      return message.LossStartDate
    }
    
    // 'value' attribute on DateCell (id=dateArrived) at LMSuspenseQueueLV.pcf: line 65, column 39
    function value_28 () : java.util.Date {
      return message.CreateTime
    }
    
    // 'value' attribute on TextAreaCell (id=validationFailed) at LMSuspenseQueueLV.pcf: line 69, column 52
    function value_31 () : java.lang.String {
      return message.ValidationFailureReason
    }
    
    property get message () : LMMessageLloydsSCM_Ext {
      return getVariableValue("message", 1) as LMMessageLloydsSCM_Ext
    }
    
    property set message ($arg :  LMMessageLloydsSCM_Ext) {
      setVariableValue("message", 1, $arg)
    }
    
    property get messageIterator () : entity.LMMessageLloydsSCM_Ext {
      return getIteratedValue(1) as entity.LMMessageLloydsSCM_Ext
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/lm/LMSuspenseQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LMSuspenseQueueLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=RowIterator) at LMSuspenseQueueLV.pcf: line 37, column 32
    function sortValue_0 (messageIterator :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      var message : LMMessageLloydsSCM_Ext = (messageIterator as LMMessageLloydsSCM_Ext)
return message.UMR
    }
    
    // 'value' attribute on RowIterator (id=RowIterator) at LMSuspenseQueueLV.pcf: line 42, column 32
    function sortValue_1 (messageIterator :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      var message : LMMessageLloydsSCM_Ext = (messageIterator as LMMessageLloydsSCM_Ext)
return message.UCR
    }
    
    // 'value' attribute on RowIterator (id=RowIterator) at LMSuspenseQueueLV.pcf: line 46, column 32
    function sortValue_2 (messageIterator :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      var message : LMMessageLloydsSCM_Ext = (messageIterator as LMMessageLloydsSCM_Ext)
return message.OCR
    }
    
    // 'value' attribute on RowIterator (id=RowIterator) at LMSuspenseQueueLV.pcf: line 51, column 31
    function sortValue_3 (messageIterator :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      var message : LMMessageLloydsSCM_Ext = (messageIterator as LMMessageLloydsSCM_Ext)
return message.MovementReferenceSequence
    }
    
    // 'value' attribute on RowIterator (id=RowIterator) at LMSuspenseQueueLV.pcf: line 55, column 41
    function sortValue_4 (messageIterator :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      var message : LMMessageLloydsSCM_Ext = (messageIterator as LMMessageLloydsSCM_Ext)
return message.PolicyNumber
    }
    
    // 'value' attribute on RowIterator (id=RowIterator) at LMSuspenseQueueLV.pcf: line 59, column 42
    function sortValue_5 (messageIterator :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      var message : LMMessageLloydsSCM_Ext = (messageIterator as LMMessageLloydsSCM_Ext)
return message.LossStartDate
    }
    
    // 'value' attribute on RowIterator (id=RowIterator) at LMSuspenseQueueLV.pcf: line 65, column 39
    function sortValue_6 (messageIterator :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      var message : LMMessageLloydsSCM_Ext = (messageIterator as LMMessageLloydsSCM_Ext)
return message.CreateTime
    }
    
    // 'value' attribute on RowIterator (id=RowIterator) at LMSuspenseQueueLV.pcf: line 69, column 52
    function sortValue_7 (messageIterator :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      var message : LMMessageLloydsSCM_Ext = (messageIterator as LMMessageLloydsSCM_Ext)
return message.ValidationFailureReason
    }
    
    // 'value' attribute on RowIterator (id=RowIterator) at LMSuspenseQueueLV.pcf: line 22, column 51
    function value_35 () : entity.LMMessageLloydsSCM_Ext[] {
      return messages
    }
    
    property get messages () : entity.LMMessageLloydsSCM_Ext[] {
      return getRequireValue("messages", 0) as entity.LMMessageLloydsSCM_Ext[]
    }
    
    property set messages ($arg :  entity.LMMessageLloydsSCM_Ext[]) {
      setRequireValue("messages", 0, $arg)
    }
    
    
  }
  
  
}