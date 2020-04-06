package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimLossDetailsDV_PrExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimLossDetailsDV.Pr.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimLossDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at NewClaimLossDetailsDV.Pr.pcf: line 159, column 27
    function def_onEnter_86 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at NewClaimLossDetailsDV.Pr.pcf: line 172, column 27
    function def_onEnter_88 (def :  pcf.EditableInjuryIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on InputSetRef at NewClaimLossDetailsDV.Pr.pcf: line 183, column 54
    function def_onEnter_90 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at NewClaimLossDetailsDV.Pr.pcf: line 190, column 27
    function def_onEnter_92 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at NewClaimLossDetailsDV.Pr.pcf: line 202, column 27
    function def_onEnter_94 (def :  pcf.PriorClaimsLV) : void {
      def.onEnter(Claim.findPriorClaimsByPolicyNumber(Claim.Policy.PolicyNumber, {ClaimState.TC_DRAFT}))
    }
    
    // 'def' attribute on ListViewInput at NewClaimLossDetailsDV.Pr.pcf: line 210, column 27
    function def_onEnter_96 (def :  pcf.MetroReportsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at NewClaimLossDetailsDV.Pr.pcf: line 159, column 27
    function def_refreshVariables_87 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at NewClaimLossDetailsDV.Pr.pcf: line 172, column 27
    function def_refreshVariables_89 (def :  pcf.EditableInjuryIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on InputSetRef at NewClaimLossDetailsDV.Pr.pcf: line 183, column 54
    function def_refreshVariables_91 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at NewClaimLossDetailsDV.Pr.pcf: line 190, column 27
    function def_refreshVariables_93 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput at NewClaimLossDetailsDV.Pr.pcf: line 202, column 27
    function def_refreshVariables_95 (def :  pcf.PriorClaimsLV) : void {
      def.refreshVariables(Claim.findPriorClaimsByPolicyNumber(Claim.Policy.PolicyNumber, {ClaimState.TC_DRAFT}))
    }
    
    // 'def' attribute on ListViewInput at NewClaimLossDetailsDV.Pr.pcf: line 210, column 27
    function def_refreshVariables_97 (def :  pcf.MetroReportsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'value' attribute on RangeInput (id=Claim_PermissionRequired) at NewClaimLossDetailsDV.Pr.pcf: line 50, column 48
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.PermissionRequired = (__VALUE_TO_SET as typekey.ClaimSecurityType)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at NewClaimLossDetailsDV.Pr.pcf: line 59, column 36
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at NewClaimLossDetailsDV.Pr.pcf: line 69, column 39
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at NewClaimLossDetailsDV.Pr.pcf: line 78, column 72
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.PropertyFireDamage.Arson = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=LocationOfTheft) at NewClaimLossDetailsDV.Pr.pcf: line 85, column 51
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LocationOfTheft = (__VALUE_TO_SET as typekey.LocationOfTheft)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at NewClaimLossDetailsDV.Pr.pcf: line 93, column 41
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at NewClaimLossDetailsDV.Pr.pcf: line 99, column 41
    function defaultSetter_51 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at NewClaimLossDetailsDV.Pr.pcf: line 110, column 48
    function defaultSetter_57 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Fault = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on DateInput (id=Notification_ReportedDate) at NewClaimLossDetailsDV.Pr.pcf: line 127, column 37
    function defaultSetter_68 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at NewClaimLossDetailsDV.Pr.pcf: line 132, column 40
    function defaultSetter_72 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FirstNoticeSuit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at NewClaimLossDetailsDV.Pr.pcf: line 138, column 46
    function defaultSetter_76 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HowReported = (__VALUE_TO_SET as typekey.HowReportedType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_IncidentReport) at NewClaimLossDetailsDV.Pr.pcf: line 144, column 39
    function defaultSetter_80 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.IncidentReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_CoverageQuestion) at NewClaimLossDetailsDV.Pr.pcf: line 150, column 43
    function defaultSetter_84 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.CoverageInQuestion = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LOBCode) at NewClaimLossDetailsDV.Pr.pcf: line 36, column 38
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LOBCode = (__VALUE_TO_SET as typekey.LOBCode)
    }
    
    // 'initialValue' attribute on Variable at NewClaimLossDetailsDV.Pr.pcf: line 14, column 53
    function initialValue_0 () : gw.api.claim.CommercialPropertyHelper {
      return new gw.api.claim.CommercialPropertyHelper(Claim)
    }
    
    // 'onChange' attribute on PostOnChange at NewClaimLossDetailsDV.Pr.pcf: line 71, column 80
    function onChange_25 () : void {
      CommercialPropertyHelper.createDamageTypesPerLossCause()
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate) at NewClaimLossDetailsDV.Pr.pcf: line 117, column 33
    function validationExpression_59 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=Notification_ReportedDate) at NewClaimLossDetailsDV.Pr.pcf: line 127, column 37
    function validationExpression_64 () : java.lang.Object {
      return Claim.ReportedDate == null || Claim.ReportedDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at NewClaimLossDetailsDV.Pr.pcf: line 50, column 48
    function valueRange_18 () : java.lang.Object {
      return gw.api.claim.ClaimUtil.getAvailableTypes()
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at NewClaimLossDetailsDV.Pr.pcf: line 93, column 41
    function valueRange_46 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LOBCode) at NewClaimLossDetailsDV.Pr.pcf: line 36, column 38
    function valueRoot_10 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=Policy_PolicyNumber) at NewClaimLossDetailsDV.Pr.pcf: line 21, column 44
    function valueRoot_3 () : java.lang.Object {
      return Claim.Policy
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at NewClaimLossDetailsDV.Pr.pcf: line 78, column 72
    function valueRoot_35 () : java.lang.Object {
      return Claim.PropertyFireDamage
    }
    
    // 'value' attribute on TextInput (id=Policy_PolicyNumber) at NewClaimLossDetailsDV.Pr.pcf: line 21, column 44
    function value_1 () : java.lang.String {
      return Claim.Policy.PolicyNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossType) at NewClaimLossDetailsDV.Pr.pcf: line 42, column 39
    function value_11 () : typekey.LossType {
      return Claim.LossType
    }
    
    // 'value' attribute on RangeInput (id=Claim_PermissionRequired) at NewClaimLossDetailsDV.Pr.pcf: line 50, column 48
    function value_14 () : typekey.ClaimSecurityType {
      return Claim.PermissionRequired
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at NewClaimLossDetailsDV.Pr.pcf: line 59, column 36
    function value_21 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at NewClaimLossDetailsDV.Pr.pcf: line 69, column 39
    function value_26 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at NewClaimLossDetailsDV.Pr.pcf: line 78, column 72
    function value_31 () : java.lang.Boolean {
      return Claim.PropertyFireDamage.Arson
    }
    
    // 'value' attribute on TypeKeyInput (id=LocationOfTheft) at NewClaimLossDetailsDV.Pr.pcf: line 85, column 51
    function value_37 () : typekey.LocationOfTheft {
      return Claim.LocationOfTheft
    }
    
    // 'value' attribute on TypeKeyInput (id=Policy_Status) at NewClaimLossDetailsDV.Pr.pcf: line 26, column 43
    function value_4 () : typekey.PolicyStatus {
      return Claim.Policy.Status
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at NewClaimLossDetailsDV.Pr.pcf: line 93, column 41
    function value_42 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at NewClaimLossDetailsDV.Pr.pcf: line 99, column 41
    function value_49 () : typekey.FaultRating {
      return Claim.FaultRating
    }
    
    // 'value' attribute on TextInput (id=Notification_AtFaultPercentage) at NewClaimLossDetailsDV.Pr.pcf: line 110, column 48
    function value_54 () : java.math.BigDecimal {
      return Claim.Fault
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at NewClaimLossDetailsDV.Pr.pcf: line 117, column 33
    function value_60 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on DateInput (id=Notification_ReportedDate) at NewClaimLossDetailsDV.Pr.pcf: line 127, column 37
    function value_65 () : java.util.Date {
      return Claim.ReportedDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LOBCode) at NewClaimLossDetailsDV.Pr.pcf: line 36, column 38
    function value_7 () : typekey.LOBCode {
      return Claim.LOBCode
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at NewClaimLossDetailsDV.Pr.pcf: line 132, column 40
    function value_70 () : java.lang.Boolean {
      return Claim.FirstNoticeSuit
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at NewClaimLossDetailsDV.Pr.pcf: line 138, column 46
    function value_74 () : typekey.HowReportedType {
      return Claim.HowReported
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_IncidentReport) at NewClaimLossDetailsDV.Pr.pcf: line 144, column 39
    function value_78 () : java.lang.Boolean {
      return Claim.IncidentReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_CoverageQuestion) at NewClaimLossDetailsDV.Pr.pcf: line 150, column 43
    function value_82 () : java.lang.Boolean {
      return Claim.CoverageInQuestion
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at NewClaimLossDetailsDV.Pr.pcf: line 50, column 48
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at NewClaimLossDetailsDV.Pr.pcf: line 50, column 48
    function verifyValueRangeIsAllowedType_19 ($$arg :  typekey.ClaimSecurityType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at NewClaimLossDetailsDV.Pr.pcf: line 93, column 41
    function verifyValueRangeIsAllowedType_47 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at NewClaimLossDetailsDV.Pr.pcf: line 93, column 41
    function verifyValueRangeIsAllowedType_47 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at NewClaimLossDetailsDV.Pr.pcf: line 93, column 41
    function verifyValueRangeIsAllowedType_47 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at NewClaimLossDetailsDV.Pr.pcf: line 50, column 48
    function verifyValueRange_20 () : void {
      var __valueRangeArg = gw.api.claim.ClaimUtil.getAvailableTypes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at NewClaimLossDetailsDV.Pr.pcf: line 93, column 41
    function verifyValueRange_48 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_47(__valueRangeArg)
    }
    
    // 'visible' attribute on BooleanRadioInput (id=ArsonInvolved) at NewClaimLossDetailsDV.Pr.pcf: line 78, column 72
    function visible_30 () : java.lang.Boolean {
      return CommercialPropertyHelper.PropertyFireDamage.Present
    }
    
    // 'visible' attribute on TypeKeyInput (id=LocationOfTheft) at NewClaimLossDetailsDV.Pr.pcf: line 85, column 51
    function visible_36 () : java.lang.Boolean {
      return Claim.LossCause == TC_BURGLARY
    }
    
    // 'visible' attribute on TextInput (id=Notification_AtFaultPercentage) at NewClaimLossDetailsDV.Pr.pcf: line 110, column 48
    function visible_53 () : java.lang.Boolean {
      return  Claim.FaultRating == TC_1 
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get CommercialPropertyHelper () : gw.api.claim.CommercialPropertyHelper {
      return getVariableValue("CommercialPropertyHelper", 0) as gw.api.claim.CommercialPropertyHelper
    }
    
    property set CommercialPropertyHelper ($arg :  gw.api.claim.CommercialPropertyHelper) {
      setVariableValue("CommercialPropertyHelper", 0, $arg)
    }
    
    
  }
  
  
}