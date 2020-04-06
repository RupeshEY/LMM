package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.IluLead.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFClaimResponsePanelSet_IluLeadExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.IluLead.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFClaimResponsePanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 19, column 68
    function def_onEnter_0 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.onEnter(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 22, column 75
    function def_onEnter_2 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 76, column 62
    function def_onEnter_35 (def :  pcf.PublicCommentsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 79, column 63
    function def_onEnter_37 (def :  pcf.PrivateCommentsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 84, column 65
    function def_onEnter_39 (def :  pcf.ResponseInputSet) : void {
      def.onEnter(claimResponseRq, false)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 26, column 32
    function def_onEnter_4 (def :  pcf.LeadContactDetailsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 87, column 69
    function def_onEnter_41 (def :  pcf.ClaimParticipantRolesInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFClaimResponsePanelSet.IluLead.pcf: line 93, column 74
    function def_onEnter_43 (def :  pcf.LeadFinancialsAndBulkClaimPR) : void {
      def.onEnter(ecfClaimData, claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 19, column 68
    function def_refreshVariables_1 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.refreshVariables(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 22, column 75
    function def_refreshVariables_3 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 76, column 62
    function def_refreshVariables_36 (def :  pcf.PublicCommentsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 79, column 63
    function def_refreshVariables_38 (def :  pcf.PrivateCommentsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 84, column 65
    function def_refreshVariables_40 (def :  pcf.ResponseInputSet) : void {
      def.refreshVariables(claimResponseRq, false)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 87, column 69
    function def_refreshVariables_42 (def :  pcf.ClaimParticipantRolesInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on PanelRef at ECFClaimResponsePanelSet.IluLead.pcf: line 93, column 74
    function def_refreshVariables_44 (def :  pcf.LeadFinancialsAndBulkClaimPR) : void {
      def.refreshVariables(ecfClaimData, claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.IluLead.pcf: line 26, column 32
    function def_refreshVariables_5 (def :  pcf.LeadContactDetailsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'value' attribute on CheckBoxInput (id=cedantIndicator) at ECFClaimResponsePanelSet.IluLead.pcf: line 46, column 77
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.CedantInLiquidationIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=simultaneousRIPIndicator) at ECFClaimResponsePanelSet.IluLead.pcf: line 53, column 74
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.SimultaneousRIPIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=chaseUpIndicator) at ECFClaimResponsePanelSet.IluLead.pcf: line 59, column 65
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ChaseUpIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.IluLead.pcf: line 72, column 48
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ChaseUpIndicatorIntervalInteger = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.IluLead.pcf: line 40, column 53
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ClassOfBusiness = (__VALUE_TO_SET as ECFClassOfBusiness_Ext)
    }
    
    // 'required' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.IluLead.pcf: line 40, column 53
    function required_7 () : java.lang.Boolean {
      return claimResponseRq.ClassOfBusinessRequired
    }
    
    // 'valueRange' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.IluLead.pcf: line 40, column 53
    function valueRange_11 () : java.lang.Object {
      return ECFClassOfBusiness_Ext.TF_ILU.TypeKeys
    }
    
    // 'valueRange' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.IluLead.pcf: line 72, column 48
    function valueRange_32 () : java.lang.Object {
      return gw.acc.iplm.utils.ECFConstants.CHASE_UP_PERIOD_MONTHS
    }
    
    // 'value' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.IluLead.pcf: line 40, column 53
    function valueRoot_10 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on CheckBoxInput (id=cedantIndicator) at ECFClaimResponsePanelSet.IluLead.pcf: line 46, column 77
    function value_14 () : java.lang.Boolean {
      return claimResponseRq.CedantInLiquidationIndicatorBoolean
    }
    
    // 'value' attribute on CheckBoxInput (id=simultaneousRIPIndicator) at ECFClaimResponsePanelSet.IluLead.pcf: line 53, column 74
    function value_18 () : java.lang.Boolean {
      return claimResponseRq.SimultaneousRIPIndicatorBoolean
    }
    
    // 'value' attribute on CheckBoxInput (id=chaseUpIndicator) at ECFClaimResponsePanelSet.IluLead.pcf: line 59, column 65
    function value_22 () : java.lang.Boolean {
      return claimResponseRq.ChaseUpIndicatorBoolean
    }
    
    // 'value' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.IluLead.pcf: line 72, column 48
    function value_27 () : java.lang.Integer {
      return claimResponseRq.ChaseUpIndicatorIntervalInteger
    }
    
    // 'value' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.IluLead.pcf: line 40, column 53
    function value_6 () : ECFClassOfBusiness_Ext {
      return claimResponseRq.ClassOfBusiness
    }
    
    // 'valueRange' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.IluLead.pcf: line 40, column 53
    function verifyValueRangeIsAllowedType_12 ($$arg :  ECFClassOfBusiness_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.IluLead.pcf: line 40, column 53
    function verifyValueRangeIsAllowedType_12 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.IluLead.pcf: line 40, column 53
    function verifyValueRangeIsAllowedType_12 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.IluLead.pcf: line 72, column 48
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.lang.Integer[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.IluLead.pcf: line 72, column 48
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.IluLead.pcf: line 40, column 53
    function verifyValueRange_13 () : void {
      var __valueRangeArg = ECFClassOfBusiness_Ext.TF_ILU.TypeKeys
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_12(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.IluLead.pcf: line 72, column 48
    function verifyValueRange_34 () : void {
      var __valueRangeArg = gw.acc.iplm.utils.ECFConstants.CHASE_UP_PERIOD_MONTHS
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_33(__valueRangeArg)
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("claimResponseRq", 0, $arg)
    }
    
    property get ecfClaimData () : ECFMessageClaimData_Ext {
      return getRequireValue("ecfClaimData", 0) as ECFMessageClaimData_Ext
    }
    
    property set ecfClaimData ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("ecfClaimData", 0, $arg)
    }
    
    
  }
  
  
}