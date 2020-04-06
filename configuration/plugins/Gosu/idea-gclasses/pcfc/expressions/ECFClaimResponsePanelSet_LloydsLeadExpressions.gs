package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.LloydsLead.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFClaimResponsePanelSet_LloydsLeadExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.LloydsLead.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFClaimResponsePanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 18, column 66
    function def_onEnter_0 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.onEnter(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 56, column 76
    function def_onEnter_26 (def :  pcf.CatastropheCodesInputSet) : void {
      def.onEnter(ecfClaimData, claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 27, column 73
    function def_onEnter_5 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 104, column 58
    function def_onEnter_62 (def :  pcf.PublicCommentsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 107, column 59
    function def_onEnter_64 (def :  pcf.PrivateCommentsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 31, column 30
    function def_onEnter_7 (def :  pcf.LeadContactDetailsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 129, column 59
    function def_onEnter_78 (def :  pcf.ResponseInputSet) : void {
      def.onEnter(claimResponseRq, false)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 131, column 56
    function def_onEnter_80 (def :  pcf.QueryReasonsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 134, column 67
    function def_onEnter_82 (def :  pcf.ClaimParticipantRolesInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 136, column 74
    function def_onEnter_84 (def :  pcf.LeadFinancialsInputSet) : void {
      def.onEnter(ecfClaimData, claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 18, column 66
    function def_refreshVariables_1 (def :  pcf.MessageBeingRespondedToInputSet) : void {
      def.refreshVariables(ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 56, column 76
    function def_refreshVariables_27 (def :  pcf.CatastropheCodesInputSet) : void {
      def.refreshVariables(ecfClaimData, claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 27, column 73
    function def_refreshVariables_6 (def :  pcf.InsurerTransactionReferenceInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 104, column 58
    function def_refreshVariables_63 (def :  pcf.PublicCommentsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 107, column 59
    function def_refreshVariables_65 (def :  pcf.PrivateCommentsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 129, column 59
    function def_refreshVariables_79 (def :  pcf.ResponseInputSet) : void {
      def.refreshVariables(claimResponseRq, false)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 31, column 30
    function def_refreshVariables_8 (def :  pcf.LeadContactDetailsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 131, column 56
    function def_refreshVariables_81 (def :  pcf.QueryReasonsInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 134, column 67
    function def_refreshVariables_83 (def :  pcf.ClaimParticipantRolesInputSet) : void {
      def.refreshVariables(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at ECFClaimResponsePanelSet.LloydsLead.pcf: line 136, column 74
    function def_refreshVariables_85 (def :  pcf.LeadFinancialsInputSet) : void {
      def.refreshVariables(ecfClaimData, claimResponseRq)
    }
    
    // 'value' attribute on RangeInput (id=ecfRiskCode) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 45, column 42
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.RiskCode = (__VALUE_TO_SET as ECFRiskCode_Ext)
    }
    
    // 'value' attribute on RangeInput (id=causeOfLoss) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 54, column 49
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.CauseOfLossCode = (__VALUE_TO_SET as ECFCauseOfLossCode_Ext)
    }
    
    // 'value' attribute on RangeInput (id=claimScheme) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 65, column 39
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ClaimsScheme = (__VALUE_TO_SET as ECFScheme_Ext)
    }
    
    // 'value' attribute on RangeInput (id=triageCategory) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 78, column 45
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.TriageCategory = (__VALUE_TO_SET as ECFTriageCode_Ext)
    }
    
    // 'value' attribute on RangeInput (id=outstandingAmountQualifier) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 88, column 58
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.OutstandingQualifierCode = (__VALUE_TO_SET as ECFOutstandingQualifierCode_Ext)
    }
    
    // 'value' attribute on CheckBoxInput (id=simultaneousRIPIndicator) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 94, column 70
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.SimultaneousRIPIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=xcsToAgreeIndicator) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 100, column 65
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.XcsToAgreeIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=claimReference1) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 118, column 64
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.InsurerOrReinsurerClaimRef1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=claimReference2) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 127, column 64
    function defaultSetter_76 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.InsurerOrReinsurerClaimRef2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'inputConversion' attribute on RangeInput (id=triageCategory) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 78, column 45
    function inputConversion_36 (VALUE :  java.lang.String) : java.lang.Object {
      return VALUE == ecfClaimData.TriageCategory.DisplayName ? null : VALUE
    }
    
    // 'inputConversion' attribute on TextInput (id=claimReference1) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 118, column 64
    function inputConversion_67 (VALUE :  java.lang.String) : java.lang.Object {
      return VALUE == ecfClaimData.InsurerOrReinsurerClaimRef1? null : VALUE
    }
    
    // 'inputConversion' attribute on TextInput (id=claimReference2) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 127, column 64
    function inputConversion_73 (VALUE :  java.lang.String) : java.lang.Object {
      return VALUE == ecfClaimData.InsurerOrReinsurerClaimRef2? null : VALUE
    }
    
    // 'noneSelectedLabel' attribute on RangeInput (id=ecfRiskCode) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 45, column 42
    function noneSelectedLabel_13 () : java.lang.String {
      return gw.util.GosuStringUtil.isBlank(ecfClaimData.RiskCode?.UiDisplayDescription) ? DisplayKey.get("Java.NameValueView.NoneSelected") : ecfClaimData.RiskCode.UiDisplayDescription
    }
    
    // 'noneSelectedLabel' attribute on RangeInput (id=causeOfLoss) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 54, column 49
    function noneSelectedLabel_22 () : java.lang.String {
      return ecfClaimData.LossCause
    }
    
    // 'noneSelectedLabel' attribute on RangeInput (id=triageCategory) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 78, column 45
    function noneSelectedLabel_40 () : java.lang.String {
      return (ecfClaimData.TriageCategory != null and claimResponseRq.ClaimsScheme == ecfClaimData.ClaimsScheme) ? ecfClaimData.TriageCategory.DisplayName : DisplayKey.get("Java.NameValueView.NoneSelected")
    }
    
    // 'noneSelectedLabel' attribute on RangeInput (id=outstandingAmountQualifier) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 88, column 58
    function noneSelectedLabel_50 () : java.lang.String {
      return gw.util.GosuStringUtil.isBlank(ecfClaimData.OutstandingAmountQualifier?.DisplayName) ? DisplayKey.get("Java.NameValueView.NoneSelected") : ecfClaimData.OutstandingAmountQualifier.DisplayName 
    }
    
    // 'optionLabel' attribute on RangeInput (id=ecfRiskCode) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 45, column 42
    function optionLabel_14 (VALUE :  ECFRiskCode_Ext) : java.lang.String {
      return VALUE.UiDisplayDescription
    }
    
    // 'outputConversion' attribute on TextInput (id=claimReference1) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 118, column 64
    function outputConversion_68 (VALUE :  java.lang.String) : java.lang.String {
      return VALUE == null ? ecfClaimData.InsurerOrReinsurerClaimRef1 : VALUE
    }
    
    // 'outputConversion' attribute on TextInput (id=claimReference2) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 127, column 64
    function outputConversion_74 (VALUE :  java.lang.String) : java.lang.String {
      return VALUE == null ? ecfClaimData.InsurerOrReinsurerClaimRef2 : VALUE
    }
    
    // 'validationExpression' attribute on RangeInput (id=outstandingAmountQualifier) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 88, column 58
    function validationExpression_44 () : java.lang.Object {
      return claimResponseRq.validateUberPrecautionary()
    }
    
    // 'valueRange' attribute on RangeInput (id=ecfRiskCode) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 45, column 42
    function valueRange_15 () : java.lang.Object {
      return ECFRiskCode_Ext.riskCodesByCOB(ecfClaimData.ClassOfBusiness).where(\elt -> elt != ecfClaimData.RiskCode)
    }
    
    // 'valueRange' attribute on RangeInput (id=causeOfLoss) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 54, column 49
    function valueRange_23 () : java.lang.Object {
      return ECFCauseOfLossCode_Ext.getTypeKeys(false).where(\elt -> elt.Code != ecfClaimData.LossCause)
    }
    
    // 'valueRange' attribute on RangeInput (id=claimScheme) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 65, column 39
    function valueRange_32 () : java.lang.Object {
      return ECFScheme_Ext.getTypeKeys(false)
    }
    
    // 'valueRange' attribute on RangeInput (id=triageCategory) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 78, column 45
    function valueRange_41 () : java.lang.Object {
      return claimResponseRq.getAvailableTriageCategories(ecfClaimData)
    }
    
    // 'valueRange' attribute on RangeInput (id=outstandingAmountQualifier) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 88, column 58
    function valueRange_51 () : java.lang.Object {
      return ECFOutstandingQualifierCode_Ext.getTypeKeys(false).where(\elt -> elt != ecfClaimData.OutstandingAmountQualifier)
    }
    
    // 'value' attribute on RangeInput (id=ecfRiskCode) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 45, column 42
    function valueRoot_12 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on TextInput (id=underwritingYear) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 24, column 44
    function valueRoot_4 () : java.lang.Object {
      return ecfClaimData
    }
    
    // 'value' attribute on RangeInput (id=causeOfLoss) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 54, column 49
    function value_18 () : ECFCauseOfLossCode_Ext {
      return claimResponseRq.CauseOfLossCode
    }
    
    // 'value' attribute on TextInput (id=underwritingYear) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 24, column 44
    function value_2 () : java.lang.Integer {
      return ecfClaimData.UnderwritingYear
    }
    
    // 'value' attribute on RangeInput (id=claimScheme) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 65, column 39
    function value_28 () : ECFScheme_Ext {
      return claimResponseRq.ClaimsScheme
    }
    
    // 'value' attribute on RangeInput (id=triageCategory) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 78, column 45
    function value_35 () : ECFTriageCode_Ext {
      return claimResponseRq.TriageCategory
    }
    
    // 'value' attribute on RangeInput (id=outstandingAmountQualifier) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 88, column 58
    function value_45 () : ECFOutstandingQualifierCode_Ext {
      return claimResponseRq.OutstandingQualifierCode
    }
    
    // 'value' attribute on CheckBoxInput (id=simultaneousRIPIndicator) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 94, column 70
    function value_54 () : java.lang.Boolean {
      return claimResponseRq.SimultaneousRIPIndicatorBoolean
    }
    
    // 'value' attribute on CheckBoxInput (id=xcsToAgreeIndicator) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 100, column 65
    function value_58 () : java.lang.Boolean {
      return claimResponseRq.XcsToAgreeIndicatorBoolean
    }
    
    // 'value' attribute on TextInput (id=claimReference1) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 118, column 64
    function value_66 () : java.lang.String {
      return claimResponseRq.InsurerOrReinsurerClaimRef1
    }
    
    // 'value' attribute on TextInput (id=claimReference2) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 127, column 64
    function value_72 () : java.lang.String {
      return claimResponseRq.InsurerOrReinsurerClaimRef2
    }
    
    // 'value' attribute on RangeInput (id=ecfRiskCode) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 45, column 42
    function value_9 () : ECFRiskCode_Ext {
      return claimResponseRq.RiskCode
    }
    
    // 'valueRange' attribute on RangeInput (id=ecfRiskCode) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 45, column 42
    function verifyValueRangeIsAllowedType_16 ($$arg :  ECFRiskCode_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ecfRiskCode) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 45, column 42
    function verifyValueRangeIsAllowedType_16 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ecfRiskCode) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 45, column 42
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=causeOfLoss) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 54, column 49
    function verifyValueRangeIsAllowedType_24 ($$arg :  ECFCauseOfLossCode_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=causeOfLoss) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 54, column 49
    function verifyValueRangeIsAllowedType_24 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=causeOfLoss) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 54, column 49
    function verifyValueRangeIsAllowedType_24 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=claimScheme) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 65, column 39
    function verifyValueRangeIsAllowedType_33 ($$arg :  ECFScheme_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=claimScheme) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 65, column 39
    function verifyValueRangeIsAllowedType_33 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=claimScheme) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 65, column 39
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=triageCategory) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 78, column 45
    function verifyValueRangeIsAllowedType_42 ($$arg :  ECFTriageCode_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=triageCategory) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 78, column 45
    function verifyValueRangeIsAllowedType_42 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=triageCategory) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 78, column 45
    function verifyValueRangeIsAllowedType_42 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=outstandingAmountQualifier) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 88, column 58
    function verifyValueRangeIsAllowedType_52 ($$arg :  ECFOutstandingQualifierCode_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=outstandingAmountQualifier) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 88, column 58
    function verifyValueRangeIsAllowedType_52 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=outstandingAmountQualifier) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 88, column 58
    function verifyValueRangeIsAllowedType_52 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ecfRiskCode) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 45, column 42
    function verifyValueRange_17 () : void {
      var __valueRangeArg = ECFRiskCode_Ext.riskCodesByCOB(ecfClaimData.ClassOfBusiness).where(\elt -> elt != ecfClaimData.RiskCode)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=causeOfLoss) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 54, column 49
    function verifyValueRange_25 () : void {
      var __valueRangeArg = ECFCauseOfLossCode_Ext.getTypeKeys(false).where(\elt -> elt.Code != ecfClaimData.LossCause)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_24(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=claimScheme) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 65, column 39
    function verifyValueRange_34 () : void {
      var __valueRangeArg = ECFScheme_Ext.getTypeKeys(false)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_33(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=triageCategory) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 78, column 45
    function verifyValueRange_43 () : void {
      var __valueRangeArg = claimResponseRq.getAvailableTriageCategories(ecfClaimData)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_42(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=outstandingAmountQualifier) at ECFClaimResponsePanelSet.LloydsLead.pcf: line 88, column 58
    function verifyValueRange_53 () : void {
      var __valueRangeArg = ECFOutstandingQualifierCode_Ext.getTypeKeys(false).where(\elt -> elt != ecfClaimData.OutstandingAmountQualifier)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_52(__valueRangeArg)
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