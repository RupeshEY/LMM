package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSearchOptionalInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchOptionalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearchOptionalInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function available_122 () : java.lang.Boolean {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice.DateSearchType == DateSearchType.TC_FROMLIST
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function available_132 () : java.lang.Boolean {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice.DateSearchType == DateSearchType.TC_ENTEREDRANGE
    }
    
    // 'available' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function available_161 () : java.lang.Boolean {
      return (liveClaimFlag)                                    and ( gw.api.util.CurrencyUtil.isSingleCurrencyMode() or ClaimSearchCriteria.FinancialCriterion.Currency != null)
    }
    
    // 'available' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function available_169 () : java.lang.Boolean {
      return (liveClaimFlag)                         and ( gw.api.util.CurrencyUtil.isSingleCurrencyMode() or ClaimSearchCriteria.FinancialCriterion.Currency != null)                         and (ClaimSearchCriteria.FinancialCriterion.Options.length == 0 or ClaimSearchCriteria.FinancialCriterion.ChosenOption != null)
    }
    
    // 'available' attribute on TypeKeyInput (id=State) at ClaimSearchOptionalInputSet.pcf: line 30, column 41
    function available_2 () : java.lang.Boolean {
      return liveClaimFlag
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function available_83 () : java.lang.Boolean {
      return ClaimSearchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_FROMLIST
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function available_93 () : java.lang.Boolean {
      return ClaimSearchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_ENTEREDRANGE
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function defaultSetter_103 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function defaultSetter_111 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice = (__VALUE_TO_SET as entity.DateCriterionChoice)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function defaultSetter_116 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.ArchiveDateCriterionChoice.ChosenOption = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function defaultSetter_126 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.ArchiveDateCriterionChoice.DateRangeChoice = (__VALUE_TO_SET as typekey.DateRangeChoiceType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function defaultSetter_129 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.ArchiveDateCriterionChoice.DateSearchType = (__VALUE_TO_SET as typekey.DateSearchType)
    }
    
    // 'value' attribute on RangeInput (id=ClaimStatus) at ClaimSearchOptionalInputSet.pcf: line 39, column 39
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.ClaimState = (__VALUE_TO_SET as typekey.ClaimState)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function defaultSetter_136 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.ArchiveDateCriterionChoice.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function defaultSetter_142 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.ArchiveDateCriterionChoice.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function defaultSetter_150 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.ArchiveDateCriterionChoice = (__VALUE_TO_SET as entity.DateCriterionChoice)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 16, column 74
    function defaultSetter_158 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.FinancialCriterion.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function defaultSetter_163 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.FinancialCriterion.ChosenOption = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function defaultSetter_172 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.FinancialCriterion.AmountStart = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 56, column 48
    function defaultSetter_177 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.FinancialCriterion.AmountEnd = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TypeKeyInput (id=LOB) at ClaimSearchOptionalInputSet.pcf: line 47, column 36
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.LOBCode = (__VALUE_TO_SET as typekey.LOBCode)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType) at ClaimSearchOptionalInputSet.pcf: line 55, column 37
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.LossType = (__VALUE_TO_SET as typekey.LossType)
    }
    
    // 'value' attribute on BooleanDropdownInput (id=PendingAssignment) at ClaimSearchOptionalInputSet.pcf: line 62, column 54
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.pendingAssignment = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanDropdownInput (id=IncidentReport) at ClaimSearchOptionalInputSet.pcf: line 69, column 51
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.IncidentReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanDropdownInput (id=ReinsuranceReportable) at ClaimSearchOptionalInputSet.pcf: line 76, column 58
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.ReinsuranceReportable = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanDropdownInput (id=CoverageInQuestion) at ClaimSearchOptionalInputSet.pcf: line 84, column 55
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.CoverageInQuestion = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=FlaggedType) at ClaimSearchOptionalInputSet.pcf: line 92, column 40
    function defaultSetter_58 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.FlaggedType = (__VALUE_TO_SET as typekey.FlaggedType)
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at ClaimSearchOptionalInputSet.pcf: line 30, column 41
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on TypeKeyInput (id=LitigationStatus) at ClaimSearchOptionalInputSet.pcf: line 100, column 45
    function defaultSetter_64 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.LitigationStatus = (__VALUE_TO_SET as typekey.LitigationStatus)
    }
    
    // 'value' attribute on RangeInput (id=IndicatorSearch) at ClaimSearchOptionalInputSet.pcf: line 111, column 45
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimIndicators = (__VALUE_TO_SET as typekey.ClaimIndicator[])
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function defaultSetter_77 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice.ChosenOption = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function defaultSetter_87 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice.DateRangeChoice = (__VALUE_TO_SET as typekey.DateRangeChoiceType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function defaultSetter_90 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice.DateSearchType = (__VALUE_TO_SET as typekey.DateSearchType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function defaultSetter_97 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'filter' attribute on TypeKeyInput (id=State) at ClaimSearchOptionalInputSet.pcf: line 30, column 41
    function filter_8 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'format' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function format_170 () : java.lang.String {
      return gw.api.util.CurrencyUtil.getCurrencyFormatExpression(ClaimSearchCriteria.FinancialCriterion.Currency)
    }
    
    // 'initialValue' attribute on Variable at ClaimSearchOptionalInputSet.pcf: line 14, column 23
    function initialValue_0 () : boolean {
      return ClaimSearchCriteria.ClaimSearchType == ClaimSearchType.TC_ACTIVE
    }
    
    // 'initialValue' attribute on Variable at ClaimSearchOptionalInputSet.pcf: line 19, column 23
    function initialValue_1 () : boolean {
      return ClaimSearchCriteria.ClaimSearchType == ClaimSearchType.TC_ARCHIVED
    }
    
    // DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function optionLabel_79 (VALUE :  java.lang.String) : java.lang.String {
      return gw.api.locale.DisplayKey.get(VALUE)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function valueRange_119 () : java.lang.Object {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice.Options
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimStatus) at ClaimSearchOptionalInputSet.pcf: line 39, column 39
    function valueRange_15 () : java.lang.Object {
      return gw.api.claim.ClaimUtil.getAvailableClaimStates()
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function valueRange_166 () : java.lang.Object {
      return ClaimSearchCriteria.FinancialCriterion.Options
    }
    
    // 'valueRange' attribute on RangeInput (id=IndicatorSearch) at ClaimSearchOptionalInputSet.pcf: line 111, column 45
    function valueRange_71 () : java.lang.Object {
      return ClaimIndicatorTypeKeys
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function valueRange_80 () : java.lang.Object {
      return ClaimSearchCriteria.DateCriterionChoice.Options
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function valueRoot_117 () : java.lang.Object {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 16, column 74
    function valueRoot_159 () : java.lang.Object {
      return ClaimSearchCriteria.FinancialCriterion
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at ClaimSearchOptionalInputSet.pcf: line 30, column 41
    function valueRoot_7 () : java.lang.Object {
      return ClaimSearchCriteria
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function valueRoot_78 () : java.lang.Object {
      return ClaimSearchCriteria.DateCriterionChoice
    }
    
    // 'value' attribute on RangeInput (id=ClaimStatus) at ClaimSearchOptionalInputSet.pcf: line 39, column 39
    function value_10 () : typekey.ClaimState {
      return ClaimSearchCriteria.ClaimState
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function value_100 () : java.util.Date {
      return ClaimSearchCriteria.DateCriterionChoice.EndDate
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function value_114 () : entity.DateCriterionChoice {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function value_115 () : java.lang.String {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice.ChosenOption
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function value_123 () : java.lang.Object {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function value_125 () : typekey.DateRangeChoiceType {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function value_128 () : typekey.DateSearchType {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function value_131 () : java.lang.Object {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function value_133 () : java.util.Date {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice.StartDate
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function value_139 () : java.util.Date {
      return ClaimSearchCriteria.ArchiveDateCriterionChoice.EndDate
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at ClaimSearchOptionalInputSet.pcf: line 137, column 55
    function value_153 () : entity.FinancialCriterionMC {
      return ClaimSearchCriteria.FinancialCriterion
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 16, column 74
    function value_157 () : typekey.Currency {
      return ClaimSearchCriteria.FinancialCriterion.Currency
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function value_162 () : java.lang.String {
      return ClaimSearchCriteria.FinancialCriterion.ChosenOption
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function value_171 () : java.math.BigDecimal {
      return ClaimSearchCriteria.FinancialCriterion.AmountStart
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 56, column 48
    function value_176 () : java.math.BigDecimal {
      return ClaimSearchCriteria.FinancialCriterion.AmountEnd
    }
    
    // 'value' attribute on TypeKeyInput (id=LOB) at ClaimSearchOptionalInputSet.pcf: line 47, column 36
    function value_19 () : typekey.LOBCode {
      return ClaimSearchCriteria.LOBCode
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType) at ClaimSearchOptionalInputSet.pcf: line 55, column 37
    function value_25 () : typekey.LossType {
      return ClaimSearchCriteria.LossType
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at ClaimSearchOptionalInputSet.pcf: line 30, column 41
    function value_3 () : typekey.Jurisdiction {
      return ClaimSearchCriteria.JurisdictionState
    }
    
    // 'value' attribute on BooleanDropdownInput (id=PendingAssignment) at ClaimSearchOptionalInputSet.pcf: line 62, column 54
    function value_31 () : java.lang.Boolean {
      return ClaimSearchCriteria.pendingAssignment
    }
    
    // 'value' attribute on BooleanDropdownInput (id=IncidentReport) at ClaimSearchOptionalInputSet.pcf: line 69, column 51
    function value_37 () : java.lang.Boolean {
      return ClaimSearchCriteria.IncidentReport
    }
    
    // 'value' attribute on BooleanDropdownInput (id=ReinsuranceReportable) at ClaimSearchOptionalInputSet.pcf: line 76, column 58
    function value_43 () : java.lang.Boolean {
      return ClaimSearchCriteria.ReinsuranceReportable
    }
    
    // 'value' attribute on BooleanDropdownInput (id=CoverageInQuestion) at ClaimSearchOptionalInputSet.pcf: line 84, column 55
    function value_49 () : java.lang.Boolean {
      return ClaimSearchCriteria.CoverageInQuestion
    }
    
    // 'value' attribute on TypeKeyInput (id=FlaggedType) at ClaimSearchOptionalInputSet.pcf: line 92, column 40
    function value_55 () : typekey.FlaggedType {
      return ClaimSearchCriteria.FlaggedType
    }
    
    // 'value' attribute on TypeKeyInput (id=LitigationStatus) at ClaimSearchOptionalInputSet.pcf: line 100, column 45
    function value_61 () : typekey.LitigationStatus {
      return ClaimSearchCriteria.LitigationStatus
    }
    
    // 'value' attribute on RangeInput (id=IndicatorSearch) at ClaimSearchOptionalInputSet.pcf: line 111, column 45
    function value_67 () : typekey.ClaimIndicator[] {
      return claimIndicators
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function value_75 () : entity.DateCriterionChoice {
      return ClaimSearchCriteria.DateCriterionChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function value_76 () : java.lang.String {
      return ClaimSearchCriteria.DateCriterionChoice.ChosenOption
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function value_84 () : java.lang.Object {
      return ClaimSearchCriteria.DateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function value_86 () : typekey.DateRangeChoiceType {
      return ClaimSearchCriteria.DateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function value_89 () : typekey.DateSearchType {
      return ClaimSearchCriteria.DateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function value_92 () : java.lang.Object {
      return ClaimSearchCriteria.DateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function value_94 () : java.util.Date {
      return ClaimSearchCriteria.DateCriterionChoice.StartDate
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function verifyValueRangeIsAllowedType_120 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function verifyValueRangeIsAllowedType_120 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimStatus) at ClaimSearchOptionalInputSet.pcf: line 39, column 39
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimStatus) at ClaimSearchOptionalInputSet.pcf: line 39, column 39
    function verifyValueRangeIsAllowedType_16 ($$arg :  typekey.ClaimState[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function verifyValueRangeIsAllowedType_167 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function verifyValueRangeIsAllowedType_167 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=IndicatorSearch) at ClaimSearchOptionalInputSet.pcf: line 111, column 45
    function verifyValueRangeIsAllowedType_72 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=IndicatorSearch) at ClaimSearchOptionalInputSet.pcf: line 111, column 45
    function verifyValueRangeIsAllowedType_72 ($$arg :  typekey.ClaimIndicator[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function verifyValueRangeIsAllowedType_81 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function verifyValueRangeIsAllowedType_81 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function verifyValueRange_121 () : void {
      var __valueRangeArg = ClaimSearchCriteria.ArchiveDateCriterionChoice.Options
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_120(__valueRangeArg)
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function verifyValueRange_168 () : void {
      var __valueRangeArg = ClaimSearchCriteria.FinancialCriterion.Options
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_167(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimStatus) at ClaimSearchOptionalInputSet.pcf: line 39, column 39
    function verifyValueRange_17 () : void {
      var __valueRangeArg = gw.api.claim.ClaimUtil.getAvailableClaimStates()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=IndicatorSearch) at ClaimSearchOptionalInputSet.pcf: line 111, column 45
    function verifyValueRange_73 () : void {
      var __valueRangeArg = ClaimIndicatorTypeKeys
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_72(__valueRangeArg)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at ClaimSearchOptionalInputSet.pcf: line 120, column 32
    function verifyValueRange_82 () : void {
      var __valueRangeArg = ClaimSearchCriteria.DateCriterionChoice.Options
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_81(__valueRangeArg)
    }
    
    // 'visible' attribute on DateCriterionChoiceInput (id=ArchiveDateSearch) at ClaimSearchOptionalInputSet.pcf: line 128, column 36
    function visible_113 () : java.lang.Boolean {
      return ArchivedClaimFlag
    }
    
    // 'visible' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Financial) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 11, column 72
    function visible_154 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    property get ArchivedClaimFlag () : boolean {
      return getVariableValue("ArchivedClaimFlag", 0) as java.lang.Boolean
    }
    
    property set ArchivedClaimFlag ($arg :  boolean) {
      setVariableValue("ArchivedClaimFlag", 0, $arg)
    }
    
    property get ClaimSearchCriteria () : ClaimSearchCriteria {
      return getRequireValue("ClaimSearchCriteria", 0) as ClaimSearchCriteria
    }
    
    property set ClaimSearchCriteria ($arg :  ClaimSearchCriteria) {
      setRequireValue("ClaimSearchCriteria", 0, $arg)
    }
    
    property get liveClaimFlag () : boolean {
      return getVariableValue("liveClaimFlag", 0) as java.lang.Boolean
    }
    
    property set liveClaimFlag ($arg :  boolean) {
      setVariableValue("liveClaimFlag", 0, $arg)
    }
    
    
    property get claimIndicators() : typekey.ClaimIndicator[] {
      var criteria = ClaimSearchCriteria.ClaimIndicatorCriterion
      var result = new java.util.ArrayList<typekey.ClaimIndicator>()
      for (var indicator in criteria) {
        result.add(indicator.ClaimIndicatorType)
      }
      return result.toTypedArray()
    }
      
    property set claimIndicators(value : typekey.ClaimIndicator[]) {
      var criteria = new java.util.ArrayList<ClaimIndicatorCriterion>()
      for (var indicator in value) {
        var criterion = new ClaimIndicatorCriterion()
        criterion.ClaimIndicatorType = indicator
        criteria.add(criterion)
      }
      ClaimSearchCriteria.ClaimIndicatorCriterion = criteria.toTypedArray()
    }
    
    property get ClaimIndicatorTypeKeys() : typekey.ClaimIndicator[] {
      var result = new java.util.ArrayList<typekey.ClaimIndicator>()
      var typekeys = new java.util.ArrayList<typekey.ClaimIndicator>(typekey.ClaimIndicator.getTypeKeys(false))
      //removing litigation, coverage in question, and flag indicator because there's already search
      //fields for them.
      typekeys.remove(typekey.ClaimIndicator.TC_COVERAGEINQUESTIONCLAIMINDICATOR)
      typekeys.remove(typekey.ClaimIndicator.TC_LITIGATIONCLAIMINDICATOR)
      typekeys.remove(typekey.ClaimIndicator.TC_FLAGCLAIMINDICATOR)
      for (subtypeKey in typekeys) {
        var subtype = gw.lang.reflect.TypeSystem.getByFullName("entity." + subtypeKey.Code)
        if (!subtype.Abstract){
          result.add(subtypeKey)
        }
      }
      return result.toTypedArray()
    }
          
        
    
    
  }
  
  
}