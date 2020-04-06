package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ecf/ClaimDataSuspenseQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimDataSuspenseQueueLVExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ecf/ClaimDataSuspenseQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimDataSuspenseQueueLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 50, column 37
    function sortValue_0 (message :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      var claimDataMsg : ECFMessageClaimData_Ext = (message as ECFMessageClaimData_Ext)
return claimDataMsg.UMR
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 55, column 37
    function sortValue_1 (message :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      var claimDataMsg : ECFMessageClaimData_Ext = (message as ECFMessageClaimData_Ext)
return claimDataMsg.UCR
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 97, column 57
    function sortValue_10 (message :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      var claimDataMsg : ECFMessageClaimData_Ext = (message as ECFMessageClaimData_Ext)
return claimDataMsg.ValidationFailureReason
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 59, column 36
    function sortValue_2 (message :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      var claimDataMsg : ECFMessageClaimData_Ext = (message as ECFMessageClaimData_Ext)
return claimDataMsg.TR
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 63, column 46
    function sortValue_3 (message :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      var claimDataMsg : ECFMessageClaimData_Ext = (message as ECFMessageClaimData_Ext)
return claimDataMsg.PolicyNumber
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 69, column 50
    function sortValue_4 (message :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      var claimDataMsg : ECFMessageClaimData_Ext = (message as ECFMessageClaimData_Ext)
return claimDataMsg.ActionCode
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 73, column 45
    function sortValue_5 (message :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      var claimDataMsg : ECFMessageClaimData_Ext = (message as ECFMessageClaimData_Ext)
return claimDataMsg.InsuredName
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 78, column 52
    function sortValue_6 (message :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      var claimDataMsg : ECFMessageClaimData_Ext = (message as ECFMessageClaimData_Ext)
return claimDataMsg.TransactionType
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 82, column 47
    function sortValue_7 (message :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      var claimDataMsg : ECFMessageClaimData_Ext = (message as ECFMessageClaimData_Ext)
return claimDataMsg.LossStartDate
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 88, column 44
    function sortValue_8 (message :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      var claimDataMsg : ECFMessageClaimData_Ext = (message as ECFMessageClaimData_Ext)
return claimDataMsg.CreateTime
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 93, column 55
    function sortValue_9 (message :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      var claimDataMsg : ECFMessageClaimData_Ext = (message as ECFMessageClaimData_Ext)
return claimDataMsg.ClassOfBusiness
    }
    
    // 'value' attribute on RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 22, column 52
    function value_53 () : entity.ECFMessageClaimData_Ext[] {
      return claimDataMessages
    }
    
    property get claimDataMessages () : entity.ECFMessageClaimData_Ext[] {
      return getRequireValue("claimDataMessages", 0) as entity.ECFMessageClaimData_Ext[]
    }
    
    property set claimDataMessages ($arg :  entity.ECFMessageClaimData_Ext[]) {
      setRequireValue("claimDataMessages", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ecf/ClaimDataSuspenseQueueLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimDataSuspenseQueueLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=DetailsButton) at ClaimDataSuspenseQueueLV.pcf: line 45, column 37
    function action_15 () : void {
      ECFMessageDetailsPopup.push(claimDataMsg)
    }
    
    // 'action' attribute on Link (id=DetailsButton) at ClaimDataSuspenseQueueLV.pcf: line 45, column 37
    function action_dest_16 () : pcf.api.Destination {
      return pcf.ECFMessageDetailsPopup.createDestination(claimDataMsg)
    }
    
    // 'condition' attribute on ToolbarFlag at ClaimDataSuspenseQueueLV.pcf: line 29, column 38
    function condition_12 () : java.lang.Boolean {
      return claimDataMsg.ApplicableToPolicy
    }
    
    // 'condition' attribute on ToolbarFlag at ClaimDataSuspenseQueueLV.pcf: line 32, column 37
    function condition_13 () : java.lang.Boolean {
      return claimDataMsg.ApplicableToClaim
    }
    
    // 'condition' attribute on ToolbarFlag at ClaimDataSuspenseQueueLV.pcf: line 35, column 34
    function condition_14 () : java.lang.Boolean {
      return claimDataMsg.MessageType == ECFMessageType_Ext.TC_RETRIEVECLAIM and (claimDataMsg.ResponseAcknowledgement.IsRejected or claimDataMsg.ResponseAcknowledgement.HasNoClaimData) and not claimDataMsg.ApplicableToPolicy
    }
    
    // 'initialValue' attribute on Variable at ClaimDataSuspenseQueueLV.pcf: line 26, column 41
    function initialValue_11 () : ECFMessageClaimData_Ext {
      return message as ECFMessageClaimData_Ext
    }
    
    // RowIterator (id=ECFMessageSuspenseQueueRowIterator) at ClaimDataSuspenseQueueLV.pcf: line 22, column 52
    function initializeVariables_52 () : void {
        claimDataMsg = message as ECFMessageClaimData_Ext;

    }
    
    // 'outputConversion' attribute on TextCell (id=ActionCode) at ClaimDataSuspenseQueueLV.pcf: line 69, column 50
    function outputConversion_30 (VALUE :  typekey.ECFActionCode_Ext) : java.lang.String {
      return (VALUE != null) ? VALUE.toString() : claimDataMsg.XmlActionCode
    }
    
    // 'value' attribute on TextCell (id=umr) at ClaimDataSuspenseQueueLV.pcf: line 50, column 37
    function valueRoot_19 () : java.lang.Object {
      return claimDataMsg
    }
    
    // 'value' attribute on TextCell (id=umr) at ClaimDataSuspenseQueueLV.pcf: line 50, column 37
    function value_17 () : java.lang.String {
      return claimDataMsg.UMR
    }
    
    // 'value' attribute on TextCell (id=ucr) at ClaimDataSuspenseQueueLV.pcf: line 55, column 37
    function value_20 () : java.lang.String {
      return claimDataMsg.UCR
    }
    
    // 'value' attribute on TextCell (id=tr) at ClaimDataSuspenseQueueLV.pcf: line 59, column 36
    function value_23 () : java.lang.String {
      return claimDataMsg.TR
    }
    
    // 'value' attribute on TextCell (id=InsurerRiskReference) at ClaimDataSuspenseQueueLV.pcf: line 63, column 46
    function value_26 () : java.lang.String {
      return claimDataMsg.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ActionCode) at ClaimDataSuspenseQueueLV.pcf: line 69, column 50
    function value_29 () : typekey.ECFActionCode_Ext {
      return claimDataMsg.ActionCode
    }
    
    // 'value' attribute on TextCell (id=insuredName) at ClaimDataSuspenseQueueLV.pcf: line 73, column 45
    function value_33 () : java.lang.String {
      return claimDataMsg.InsuredName
    }
    
    // 'value' attribute on TypeKeyCell (id=messageType) at ClaimDataSuspenseQueueLV.pcf: line 78, column 52
    function value_36 () : ECFClaimTransactionType_Ext {
      return claimDataMsg.TransactionType
    }
    
    // 'value' attribute on DateCell (id=lossDate) at ClaimDataSuspenseQueueLV.pcf: line 82, column 47
    function value_40 () : java.util.Date {
      return claimDataMsg.LossStartDate
    }
    
    // 'value' attribute on DateCell (id=dateArrived) at ClaimDataSuspenseQueueLV.pcf: line 88, column 44
    function value_43 () : java.util.Date {
      return claimDataMsg.CreateTime
    }
    
    // 'value' attribute on TypeKeyCell (id=LOB) at ClaimDataSuspenseQueueLV.pcf: line 93, column 55
    function value_46 () : typekey.ECFClassOfBusiness_Ext {
      return claimDataMsg.ClassOfBusiness
    }
    
    // 'value' attribute on TextAreaCell (id=validationFailed) at ClaimDataSuspenseQueueLV.pcf: line 97, column 57
    function value_49 () : java.lang.String {
      return claimDataMsg.ValidationFailureReason
    }
    
    // 'valueType' attribute on TypeKeyCell (id=messageType) at ClaimDataSuspenseQueueLV.pcf: line 78, column 52
    function verifyValueType_39 () : void {
      var __valueTypeArg : ECFClaimTransactionType_Ext
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : gw.entity.TypeKey = __valueTypeArg
    }
    
    property get claimDataMsg () : ECFMessageClaimData_Ext {
      return getVariableValue("claimDataMsg", 1) as ECFMessageClaimData_Ext
    }
    
    property set claimDataMsg ($arg :  ECFMessageClaimData_Ext) {
      setVariableValue("claimDataMsg", 1, $arg)
    }
    
    property get message () : entity.ECFMessageClaimData_Ext {
      return getIteratedValue(1) as entity.ECFMessageClaimData_Ext
    }
    
    
  }
  
  
}