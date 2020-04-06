package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.path.Paths
uses gw.api.database.QuerySelectColumns
uses gw.api.database.Query
@javax.annotation.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.LitigationClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimIndicatorInputSet_LitigationClaimIndicatorExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.LitigationClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimIndicatorInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=LitigationStatusEdit) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 36, column 45
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      indicator.Claim.LitigationStatus = (__VALUE_TO_SET as typekey.LitigationStatus)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 51, column 48
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      indicator.Claim.FirstNoticeSuit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'initialValue' attribute on Variable at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 15, column 30
    function initialValue_0 () : java.util.Date {
      return findLitigationStart()
    }
    
    // 'initialValue' attribute on Variable at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 20, column 23
    function initialValue_1 () : boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'label' attribute on TextInput (id=DaysAfterFNOL) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 46, column 38
    function label_18 () : java.lang.Object {
      return (indicator.Claim.LossType == LossType.TC_WC) ? DisplayKey.get("Web.Claim.LitigationClaimIndicator.DaysAfterFirstReportOfInjury"): DisplayKey.get("Web.Claim.LitigationClaimIndicator.DaysAfterFNOL")
    }
    
    // 'optionIcon' attribute on RangeRadioInput (id=LitigationStatusView) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 29, column 30
    function optionIcon_7 (VALUE :  typekey.LitigationStatus) : java.lang.String {
      return VALUE == TC_LITIGATED or VALUE == TC_COMPLETE ? indicator.Icon : null
    }
    
    // 'optionLabel' attribute on RangeRadioInput (id=LitigationStatusView) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 29, column 30
    function optionLabel_8 (VALUE :  typekey.LitigationStatus) : java.lang.String {
      return indicator.HoverText
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=LitigationStatusView) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 29, column 30
    function valueRange_9 () : java.lang.Object {
      return LitigationStatus.getTypeKeys(false)
    }
    
    // 'value' attribute on RangeRadioInput (id=LitigationStatusView) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 29, column 30
    function valueRoot_6 () : java.lang.Object {
      return indicator.Claim
    }
    
    // 'value' attribute on DateInput (id=LitigationIdentified) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 41, column 32
    function value_16 () : java.util.Date {
      return litigationStart
    }
    
    // 'value' attribute on TextInput (id=DaysAfterFNOL) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 46, column 38
    function value_19 () : java.lang.Integer {
      return calculateDaysAfterFNOL(litigationStart)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FirstNoticeSuit) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 51, column 48
    function value_22 () : java.lang.Boolean {
      return indicator.Claim.FirstNoticeSuit
    }
    
    // 'value' attribute on DateInput (id=NextTrialDate) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 56, column 36
    function value_26 () : java.util.Date {
      return findNextTrialDate()
    }
    
    // 'value' attribute on RangeRadioInput (id=LitigationStatusView) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 29, column 30
    function value_3 () : typekey.LitigationStatus {
      return indicator.Claim.LitigationStatus
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=LitigationStatusView) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 29, column 30
    function verifyValueRangeIsAllowedType_10 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=LitigationStatusView) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 29, column 30
    function verifyValueRangeIsAllowedType_10 ($$arg :  typekey.LitigationStatus[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=LitigationStatusView) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 29, column 30
    function verifyValueRange_11 () : void {
      var __valueRangeArg = LitigationStatus.getTypeKeys(false)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_10(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeRadioInput (id=LitigationStatusView) at ClaimIndicatorInputSet.LitigationClaimIndicator.pcf: line 29, column 30
    function visible_2 () : java.lang.Boolean {
      return !inEditMode
    }
    
    property get inEditMode () : boolean {
      return getVariableValue("inEditMode", 0) as java.lang.Boolean
    }
    
    property set inEditMode ($arg :  boolean) {
      setVariableValue("inEditMode", 0, $arg)
    }
    
    property get indicator () : ClaimIndicator {
      return getRequireValue("indicator", 0) as ClaimIndicator
    }
    
    property set indicator ($arg :  ClaimIndicator) {
      setRequireValue("indicator", 0, $arg)
    }
    
    property get litigationStart () : java.util.Date {
      return getVariableValue("litigationStart", 0) as java.util.Date
    }
    
    property set litigationStart ($arg :  java.util.Date) {
      setVariableValue("litigationStart", 0, $arg)
    }
    
    
          function findLitigationStart(): java.util.Date {
            var finder = Query.make(entity.Matter).compare("Claim", Equals, indicator.Claim).select()
            finder.orderBy(QuerySelectColumns.path(Paths.make(Matter#CreateTime)))
            finder.setPageSize(1)
            var firstMatter = finder.getFirstResult()
            return firstMatter.CreateTime
          }
    
          function calculateDaysAfterFNOL(litigationStartTime: java.util.Date): java.lang.Integer {
            var result: java.lang.Integer = null
            if (litigationStartTime != null and indicator.Claim.ReportedDate != null) {
              result = gw.api.util.DateUtil.differenceInDays(indicator.Claim.ReportedDate, litigationStartTime)
              if (result < 0) {
                result = 0
              }
            }
            return result
          }
    
          function findNextTrialDate(): java.util.Date {
            var startOfDay = java.util.Date.CurrentDate.trimToMidnight()
            var finder = Query.make(entity.Matter).compare("Claim", Equals, indicator.Claim)
              .compare("CloseDate", Equals, null)
              .compare("TrialDate", NotEquals, null)
              .compare("TrialDate", GreaterThanOrEquals, startOfDay).select()
            finder.orderBy(QuerySelectColumns.path(Paths.make(Matter#TrialDate)))
            finder.setPageSize(1)
            var earliestTrialMatter = finder.getFirstResult()
            return earliestTrialMatter.TrialDate
          }
    
    
  }
  
  
}