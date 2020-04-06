package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.LirmaLead.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFClaimResponsePanelSet_LirmaLeadExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.LirmaLead.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFClaimResponsePanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allowToggle' attribute on InputGroup (id=leadActionsInputGroup) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 39, column 98
    function available_72 () : java.lang.Boolean {
      return ecfClaimData.LirmaLeadCirculated
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 20, column 68
    function def_onEnter_0 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.onEnter(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 22, column 75
    function def_onEnter_2 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 28, column 64
    function def_onEnter_4 (def :  pcf.ResponseInputSet) : void {
      def.onEnter(claimResponseRq, true)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 44, column 36
    function def_onEnter_6 (def :  pcf.LeadContactDetailsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 135, column 65
    function def_onEnter_69 (def :  pcf.LirmaCommentsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 146, column 79
    function def_onEnter_76 (def :  pcf.LirmaSAPActionsInputSet) : void {
      def.onEnter(claimResponseRq, ecfClaimData)
    }
    
    // 'def' attribute on PanelRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 157, column 51
    function def_onEnter_84 (def :  pcf.LeadFinancialsAndBulkClaimPR) : void {
      def.onEnter(ecfClaimData, claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 20, column 68
    function def_refreshVariables_1 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.refreshVariables(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 22, column 75
    function def_refreshVariables_3 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 28, column 64
    function def_refreshVariables_5 (def :  pcf.ResponseInputSet) : void {
      def.refreshVariables(claimResponseRq, true)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 44, column 36
    function def_refreshVariables_7 (def :  pcf.LeadContactDetailsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 135, column 65
    function def_refreshVariables_70 (def :  pcf.LirmaCommentsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 146, column 79
    function def_refreshVariables_77 (def :  pcf.LirmaSAPActionsInputSet) : void {
      def.refreshVariables(claimResponseRq, ecfClaimData)
    }
    
    // 'def' attribute on PanelRef at ECFClaimResponsePanelSet.LirmaLead.pcf: line 157, column 51
    function def_refreshVariables_85 (def :  pcf.LeadFinancialsAndBulkClaimPR) : void {
      def.refreshVariables(ecfClaimData, claimResponseRq)
    }
    
    // 'value' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 59, column 57
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ClassOfBusiness = (__VALUE_TO_SET as ECFClassOfBusiness_Ext)
    }
    
    // 'value' attribute on RangeInput (id=claimCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 69, column 59
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.CategoryCodeTypeKey = (__VALUE_TO_SET as ECFClaimCategoryCode_Ext)
    }
    
    // 'value' attribute on RangeInput (id=claimSubCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 79, column 57
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.SubCategoryCodeTypeKey = (__VALUE_TO_SET as ECFClaimSubCatCode_Ext)
    }
    
    // 'value' attribute on CheckBoxInput (id=cedantIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 85, column 82
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.CedantInLiquidationIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=simultaneousRIPIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 91, column 78
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.SimultaneousRIPIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=minorPrecautionaryIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 97, column 81
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.MinorPrecautionaryIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=chaseUpIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 103, column 69
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ChaseUpIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 116, column 51
    function defaultSetter_53 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ChaseUpIndicatorIntervalInteger = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on RangeInput (id=contractualConditionsIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 125, column 60
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ContractConditionsApplyInd = (__VALUE_TO_SET as ECFContractConditions_Ext)
    }
    
    // 'value' attribute on CheckBoxInput (id=allUWToSeeIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 131, column 81
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.AllUnderwritersToSeeFileIndBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 59, column 57
    function optionLabel_13 (VALUE :  ECFClassOfBusiness_Ext) : java.lang.String {
      return VALUE.Description
    }
    
    // 'optionLabel' attribute on RangeInput (id=claimCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 69, column 59
    function optionLabel_21 (VALUE :  ECFClaimCategoryCode_Ext) : java.lang.String {
      return VALUE.Description
    }
    
    // 'optionLabel' attribute on RangeInput (id=claimSubCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 79, column 57
    function optionLabel_29 (VALUE :  ECFClaimSubCatCode_Ext) : java.lang.String {
      return VALUE.Description
    }
    
    // 'required' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 59, column 57
    function required_9 () : java.lang.Boolean {
      return claimResponseRq.ClassOfBusinessRequired
    }
    
    // 'onToggle' attribute on InputGroup (id=leadActionsInputGroup) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 39, column 98
    function setter_73 (VALUE :  java.lang.Boolean) : void {
      claimResponseRq.LIRMALeadActions = not claimResponseRq.LIRMALeadActions
    }
    
    // 'valueRange' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 59, column 57
    function valueRange_14 () : java.lang.Object {
      return ECFClassOfBusiness_Ext.TF_LIRMA.getTypeKeys()
    }
    
    // 'valueRange' attribute on RangeInput (id=claimCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 69, column 59
    function valueRange_22 () : java.lang.Object {
      return ECFClaimCategoryCode_Ext.AllTypeKeys
    }
    
    // 'valueRange' attribute on RangeInput (id=claimSubCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 79, column 57
    function valueRange_30 () : java.lang.Object {
      return ECFClaimSubCatCode_Ext.AllTypeKeys
    }
    
    // 'valueRange' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 116, column 51
    function valueRange_55 () : java.lang.Object {
      return gw.acc.iplm.utils.ECFConstants.CHASE_UP_PERIOD_MONTHS
    }
    
    // 'valueRange' attribute on RangeInput (id=contractualConditionsIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 125, column 60
    function valueRange_62 () : java.lang.Object {
      return ECFContractConditions_Ext.AllTypeKeys
    }
    
    // 'value' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 59, column 57
    function valueRoot_12 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on RangeInput (id=claimCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 69, column 59
    function value_17 () : ECFClaimCategoryCode_Ext {
      return claimResponseRq.CategoryCodeTypeKey
    }
    
    // 'value' attribute on RangeInput (id=claimSubCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 79, column 57
    function value_25 () : ECFClaimSubCatCode_Ext {
      return claimResponseRq.SubCategoryCodeTypeKey
    }
    
    // 'value' attribute on CheckBoxInput (id=cedantIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 85, column 82
    function value_33 () : java.lang.Boolean {
      return claimResponseRq.CedantInLiquidationIndicatorBoolean
    }
    
    // 'value' attribute on CheckBoxInput (id=simultaneousRIPIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 91, column 78
    function value_37 () : java.lang.Boolean {
      return claimResponseRq.SimultaneousRIPIndicatorBoolean
    }
    
    // 'value' attribute on CheckBoxInput (id=minorPrecautionaryIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 97, column 81
    function value_41 () : java.lang.Boolean {
      return claimResponseRq.MinorPrecautionaryIndicatorBoolean
    }
    
    // 'value' attribute on CheckBoxInput (id=chaseUpIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 103, column 69
    function value_45 () : java.lang.Boolean {
      return claimResponseRq.ChaseUpIndicatorBoolean
    }
    
    // 'value' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 116, column 51
    function value_50 () : java.lang.Integer {
      return claimResponseRq.ChaseUpIndicatorIntervalInteger
    }
    
    // 'value' attribute on RangeInput (id=contractualConditionsIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 125, column 60
    function value_58 () : ECFContractConditions_Ext {
      return claimResponseRq.ContractConditionsApplyInd
    }
    
    // 'value' attribute on CheckBoxInput (id=allUWToSeeIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 131, column 81
    function value_65 () : java.lang.Boolean {
      return claimResponseRq.AllUnderwritersToSeeFileIndBoolean
    }
    
    // 'value' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 59, column 57
    function value_8 () : ECFClassOfBusiness_Ext {
      return claimResponseRq.ClassOfBusiness
    }
    
    // 'valueRange' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 59, column 57
    function verifyValueRangeIsAllowedType_15 ($$arg :  ECFClassOfBusiness_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 59, column 57
    function verifyValueRangeIsAllowedType_15 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 59, column 57
    function verifyValueRangeIsAllowedType_15 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=claimCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 69, column 59
    function verifyValueRangeIsAllowedType_23 ($$arg :  ECFClaimCategoryCode_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=claimCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 69, column 59
    function verifyValueRangeIsAllowedType_23 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=claimCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 69, column 59
    function verifyValueRangeIsAllowedType_23 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=claimSubCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 79, column 57
    function verifyValueRangeIsAllowedType_31 ($$arg :  ECFClaimSubCatCode_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=claimSubCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 79, column 57
    function verifyValueRangeIsAllowedType_31 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=claimSubCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 79, column 57
    function verifyValueRangeIsAllowedType_31 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 116, column 51
    function verifyValueRangeIsAllowedType_56 ($$arg :  java.lang.Integer[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 116, column 51
    function verifyValueRangeIsAllowedType_56 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=contractualConditionsIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 125, column 60
    function verifyValueRangeIsAllowedType_63 ($$arg :  ECFContractConditions_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=contractualConditionsIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 125, column 60
    function verifyValueRangeIsAllowedType_63 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=contractualConditionsIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 125, column 60
    function verifyValueRangeIsAllowedType_63 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=classOfBusiness) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 59, column 57
    function verifyValueRange_16 () : void {
      var __valueRangeArg = ECFClassOfBusiness_Ext.TF_LIRMA.getTypeKeys()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_15(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=claimCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 69, column 59
    function verifyValueRange_24 () : void {
      var __valueRangeArg = ECFClaimCategoryCode_Ext.AllTypeKeys
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_23(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=claimSubCategory) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 79, column 57
    function verifyValueRange_32 () : void {
      var __valueRangeArg = ECFClaimSubCatCode_Ext.AllTypeKeys
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_31(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=chaseUpPeriodMonths) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 116, column 51
    function verifyValueRange_57 () : void {
      var __valueRangeArg = gw.acc.iplm.utils.ECFConstants.CHASE_UP_PERIOD_MONTHS
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_56(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=contractualConditionsIndicator) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 125, column 60
    function verifyValueRange_64 () : void {
      var __valueRangeArg = ECFContractConditions_Ext.AllTypeKeys
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_63(__valueRangeArg)
    }
    
    // 'childrenVisible' attribute on InputGroup (id=leadActionsInputGroup) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 39, column 98
    function visible_71 () : java.lang.Boolean {
      return claimResponseRq.LIRMALeadActions
    }
    
    // 'childrenVisible' attribute on InputGroup (id=sapActionsInputGroup) at ECFClaimResponsePanelSet.LirmaLead.pcf: line 144, column 58
    function visible_78 () : java.lang.Boolean {
      return not claimResponseRq.LIRMALeadActions
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