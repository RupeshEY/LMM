package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.util.Set
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BaggageIncidentDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageIncidentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=DesktopActivities_PrintButton) at BaggageIncidentDV.pcf: line 172, column 27
    function action_80 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewOnlyWithOptions("BaggageContentsLineItemsLV")
    }
    
    // 'available' attribute on ToolbarButton (id=DesktopActivities_PrintButton) at BaggageIncidentDV.pcf: line 172, column 27
    function available_79 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'def' attribute on InputSetRef at BaggageIncidentDV.pcf: line 96, column 65
    function def_onEnter_43 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(aBaggageIncident.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=AppraisalServiceInputSet) at BaggageIncidentDV.pcf: line 152, column 40
    function def_onEnter_75 (def :  pcf.AppraisalServiceInputSet) : void {
      def.onEnter(AppraisalServiceRequest, aBaggageIncident, unusedServiceRequests, appraisalIncidentCode)
    }
    
    // 'def' attribute on InputSetRef at BaggageIncidentDV.pcf: line 154, column 146
    function def_onEnter_77 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.onEnter(Claim, aBaggageIncident, otherServiceRequests, otherServiceRequests, unusedServiceRequests, {})
    }
    
    // 'def' attribute on InputSetRef at BaggageIncidentDV.pcf: line 96, column 65
    function def_refreshVariables_44 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(aBaggageIncident.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=AppraisalServiceInputSet) at BaggageIncidentDV.pcf: line 152, column 40
    function def_refreshVariables_76 (def :  pcf.AppraisalServiceInputSet) : void {
      def.refreshVariables(AppraisalServiceRequest, aBaggageIncident, unusedServiceRequests, appraisalIncidentCode)
    }
    
    // 'def' attribute on InputSetRef at BaggageIncidentDV.pcf: line 154, column 146
    function def_refreshVariables_78 (def :  pcf.OtherServicesLVInputGroupInputSet) : void {
      def.refreshVariables(Claim, aBaggageIncident, otherServiceRequests, otherServiceRequests, unusedServiceRequests, {})
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyDescription) at BaggageIncidentDV.pcf: line 50, column 48
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.PropertyDesc = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=RelatedToTrip) at BaggageIncidentDV.pcf: line 57, column 36
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.RelatedTripRU = (__VALUE_TO_SET as entity.TripRU)
    }
    
    // 'value' attribute on BooleanRadioInput (id=DelayOnly) at BaggageIncidentDV.pcf: line 65, column 44
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.DelayOnly = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=BaggageMissingFrom) at BaggageIncidentDV.pcf: line 75, column 54
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.BaggageMissingFrom = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=BaggageRecoveredOn) at BaggageIncidentDV.pcf: line 83, column 54
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.BaggageRecoveredOn = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at BaggageIncidentDV.pcf: line 91, column 47
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=CarrierCompensated) at BaggageIncidentDV.pcf: line 105, column 53
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.CarrierCompensated = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=CarrierCompensatedAmount) at BaggageIncidentDV.pcf: line 113, column 64
    function defaultSetter_53 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.CarrierCompensatedAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=EstimatedReceived) at BaggageIncidentDV.pcf: line 122, column 35
    function defaultSetter_57 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.EstimatesReceived = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on CurrencyInput (id=EstimateCost) at BaggageIncidentDV.pcf: line 130, column 65
    function defaultSetter_63 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.EstRepairCost = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at BaggageIncidentDV.pcf: line 136, column 65
    function defaultSetter_69 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.EstRepairTime = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=BaggageType) at BaggageIncidentDV.pcf: line 41, column 41
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      aBaggageIncident.BaggageType = (__VALUE_TO_SET as typekey.BaggageType)
    }
    
    // 'initialValue' attribute on Variable at BaggageIncidentDV.pcf: line 16, column 21
    function initialValue_0 () : Claim {
      return aBaggageIncident.Claim
    }
    
    // 'initialValue' attribute on Variable at BaggageIncidentDV.pcf: line 21, column 23
    function initialValue_1 () : boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'initialValue' attribute on Variable at BaggageIncidentDV.pcf: line 25, column 30
    function initialValue_2 () : java.util.Date {
      return gw.api.util.DateUtil.currentDate()
    }
    
    // 'initialValue' attribute on Variable at BaggageIncidentDV.pcf: line 29, column 22
    function initialValue_3 () : String {
      return gw.vendormanagement.SpecialistServiceCodeConstants.CONTENTSINSPECTAPPRAISAL
    }
    
    // 'initialValue' attribute on Variable at BaggageIncidentDV.pcf: line 33, column 51
    function initialValue_4 () : java.util.Set<ServiceRequest> {
      return createOtherServiceRequests()
    }
    
    // 'label' attribute on TextAreaInput (id=Description) at BaggageIncidentDV.pcf: line 91, column 47
    function label_37 () : java.lang.Object {
      return aBaggageIncident.DelayOnly == true ? DisplayKey.get("Web.BaggageIncident.DelayDescription") : DisplayKey.get("Web.BaggageIncident.DamageDescription")
    }
    
    // 'required' attribute on TextAreaInput (id=PropertyDescription) at BaggageIncidentDV.pcf: line 50, column 48
    function required_10 () : java.lang.Boolean {
      return aBaggageIncident.BaggageType == TC_OTHER 
    }
    
    // 'value' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 197, column 48
    function sortValue_81 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.NumberOfItems
    }
    
    // 'value' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 204, column 43
    function sortValue_82 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.Description
    }
    
    // 'value' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 211, column 62
    function sortValue_83 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.ContentCategory
    }
    
    // 'value' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 228, column 38
    function sortValue_86 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.DateAcquired
    }
    
    // 'value' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 239, column 39
    function sortValue_88 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.Age
    }
    
    // 'value' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 288, column 56
    function sortValue_90 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.ProofOfOwnershipProvided
    }
    
    // 'value' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 294, column 126
    function sortValue_92 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.ItemComment
    }
    
    // '$$sumValue' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 262, column 34
    function sumValueRoot_98 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item
    }
    
    // 'footerSumValue' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 283, column 35
    function sumValue_101 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.AmountAfterLimit
    }
    
    // 'footerSumValue' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 262, column 34
    function sumValue_97 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.ReplacementValue
    }
    
    // 'footerSumValue' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 274, column 35
    function sumValue_99 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.ActualCashValue
    }
    
    // 'toCreateAndAdd' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 185, column 56
    function toCreateAndAdd_156 () : entity.AssessmentContentItem {
      return aBaggageIncident.createTravelContentItemLine()
    }
    
    // 'toRemove' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 185, column 56
    function toRemove_157 (item :  entity.AssessmentContentItem) : void {
      aBaggageIncident.removeFromContentItemLine( item )
    }
    
    // 'validationExpression' attribute on DateInput (id=BaggageMissingFrom) at BaggageIncidentDV.pcf: line 75, column 54
    function validationExpression_25 () : java.lang.Object {
      return aBaggageIncident.BaggageMissingFrom > gw.api.util.DateUtil.currentDate() or aBaggageIncident.BaggageMissingFrom > aBaggageIncident.BaggageRecoveredOn ? DisplayKey.get("Web.BaggageIncident.BaggageMissingFrom.Validation") : null
    }
    
    // 'validationExpression' attribute on DateInput (id=BaggageRecoveredOn) at BaggageIncidentDV.pcf: line 83, column 54
    function validationExpression_31 () : java.lang.Object {
      return aBaggageIncident.BaggageRecoveredOn > gw.api.util.DateUtil.currentDate() ? DisplayKey.get("Web.BaggageIncident.BaggageRecoveredOn.Validation") : null
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToTrip) at BaggageIncidentDV.pcf: line 57, column 36
    function valueRange_18 () : java.lang.Object {
      return aBaggageIncident.Claim.Policy.RiskUnits.whereTypeIs(TripRU)
    }
    
    // 'value' attribute on TypeKeyInput (id=BaggageType) at BaggageIncidentDV.pcf: line 41, column 41
    function valueRoot_8 () : java.lang.Object {
      return aBaggageIncident
    }
    
    // 'value' attribute on RangeInput (id=RelatedToTrip) at BaggageIncidentDV.pcf: line 57, column 36
    function value_14 () : entity.TripRU {
      return aBaggageIncident.RelatedTripRU
    }
    
    // 'value' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 185, column 56
    function value_158 () : entity.AssessmentContentItem[] {
      return aBaggageIncident.TravelContentItemLines
    }
    
    // 'value' attribute on BooleanRadioInput (id=DelayOnly) at BaggageIncidentDV.pcf: line 65, column 44
    function value_21 () : java.lang.Boolean {
      return aBaggageIncident.DelayOnly
    }
    
    // 'value' attribute on DateInput (id=BaggageMissingFrom) at BaggageIncidentDV.pcf: line 75, column 54
    function value_26 () : java.util.Date {
      return aBaggageIncident.BaggageMissingFrom
    }
    
    // 'value' attribute on DateInput (id=BaggageRecoveredOn) at BaggageIncidentDV.pcf: line 83, column 54
    function value_32 () : java.util.Date {
      return aBaggageIncident.BaggageRecoveredOn
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at BaggageIncidentDV.pcf: line 91, column 47
    function value_38 () : java.lang.String {
      return aBaggageIncident.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=CarrierCompensated) at BaggageIncidentDV.pcf: line 105, column 53
    function value_45 () : java.lang.Boolean {
      return aBaggageIncident.CarrierCompensated
    }
    
    // 'value' attribute on TypeKeyInput (id=BaggageType) at BaggageIncidentDV.pcf: line 41, column 41
    function value_5 () : typekey.BaggageType {
      return aBaggageIncident.BaggageType
    }
    
    // 'value' attribute on CurrencyInput (id=CarrierCompensatedAmount) at BaggageIncidentDV.pcf: line 113, column 64
    function value_50 () : gw.api.financials.CurrencyAmount {
      return aBaggageIncident.CarrierCompensatedAmount
    }
    
    // 'value' attribute on TypeKeyInput (id=EstimatedReceived) at BaggageIncidentDV.pcf: line 122, column 35
    function value_55 () : typekey.YesNo {
      return aBaggageIncident.EstimatesReceived
    }
    
    // 'value' attribute on CurrencyInput (id=EstimateCost) at BaggageIncidentDV.pcf: line 130, column 65
    function value_60 () : gw.api.financials.CurrencyAmount {
      return aBaggageIncident.EstRepairCost
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at BaggageIncidentDV.pcf: line 136, column 65
    function value_66 () : java.lang.String {
      return aBaggageIncident.EstRepairTime
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyDescription) at BaggageIncidentDV.pcf: line 50, column 48
    function value_9 () : java.lang.String {
      return aBaggageIncident.PropertyDesc
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToTrip) at BaggageIncidentDV.pcf: line 57, column 36
    function verifyValueRangeIsAllowedType_19 ($$arg :  entity.TripRU[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToTrip) at BaggageIncidentDV.pcf: line 57, column 36
    function verifyValueRangeIsAllowedType_19 ($$arg :  gw.api.database.IQueryBeanResult<entity.TripRU>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToTrip) at BaggageIncidentDV.pcf: line 57, column 36
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToTrip) at BaggageIncidentDV.pcf: line 57, column 36
    function verifyValueRange_20 () : void {
      var __valueRangeArg = aBaggageIncident.Claim.Policy.RiskUnits.whereTypeIs(TripRU)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'visible' attribute on CurrencyInput (id=CarrierCompensatedAmount) at BaggageIncidentDV.pcf: line 113, column 64
    function visible_49 () : java.lang.Boolean {
      return aBaggageIncident.CarrierCompensated == true
    }
    
    // 'visible' attribute on CurrencyInput (id=EstimateCost) at BaggageIncidentDV.pcf: line 130, column 65
    function visible_59 () : java.lang.Boolean {
      return aBaggageIncident.EstimatesReceived == TC_YES
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessageFNOL) at BaggageIncidentDV.pcf: line 144, column 37
    function visible_71 () : java.lang.Boolean {
      return Claim.DraftClaim
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessage) at BaggageIncidentDV.pcf: line 149, column 72
    function visible_73 () : java.lang.Boolean {
      return not Claim.DraftClaim and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 221, column 35
    function visible_84 () : java.lang.Boolean {
      return inEditMode
    }
    
    // 'visible' attribute on RowIterator (id=ContentsLineItems) at BaggageIncidentDV.pcf: line 294, column 126
    function visible_91 () : java.lang.Boolean {
      return !inEditMode || (gw.api.print.PrintUtil.isPrintingPDF() || gw.api.print.PrintUtil.isPrintingCSV())
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    property get aBaggageIncident () : BaggageIncident {
      return getRequireValue("aBaggageIncident", 0) as BaggageIncident
    }
    
    property set aBaggageIncident ($arg :  BaggageIncident) {
      setRequireValue("aBaggageIncident", 0, $arg)
    }
    
    property get appraisalIncidentCode () : String {
      return getVariableValue("appraisalIncidentCode", 0) as String
    }
    
    property set appraisalIncidentCode ($arg :  String) {
      setVariableValue("appraisalIncidentCode", 0, $arg)
    }
    
    property get currDate () : java.util.Date {
      return getVariableValue("currDate", 0) as java.util.Date
    }
    
    property set currDate ($arg :  java.util.Date) {
      setVariableValue("currDate", 0, $arg)
    }
    
    property get inEditMode () : boolean {
      return getVariableValue("inEditMode", 0) as java.lang.Boolean
    }
    
    property set inEditMode ($arg :  boolean) {
      setVariableValue("inEditMode", 0, $arg)
    }
    
    property get otherServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("otherServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set otherServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("otherServiceRequests", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
    function findServiceRequest(serviceCode : String) : ServiceRequest {
      return aBaggageIncident.ServiceRequests.firstWhere(\ sr ->
          sr.Instruction.Services.Count == 1
              and sr.Instruction.Services.single().Service.Code == serviceCode
              and (otherServiceRequests == null or not otherServiceRequests.contains(sr))
      )
    }
    
    property get AppraisalServiceRequest() : ServiceRequest {
      return findServiceRequest(appraisalIncidentCode)
    }
    
    function createOtherServiceRequests() :  Set<ServiceRequest> {
      return aBaggageIncident.ServiceRequests.where(\sr -> sr != AppraisalServiceRequest).toSet()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/BaggageIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends BaggageIncidentDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=LineItemQuantity) at BaggageIncidentDV.pcf: line 197, column 48
    function defaultSetter_107 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.NumberOfItems = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextCell (id=LineItemDescription) at BaggageIncidentDV.pcf: line 204, column 43
    function defaultSetter_111 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=LineItemCategory) at BaggageIncidentDV.pcf: line 211, column 62
    function defaultSetter_115 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.ContentCategory = (__VALUE_TO_SET as typekey.ContentLineItemCategory)
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemOriginalCost) at BaggageIncidentDV.pcf: line 221, column 35
    function defaultSetter_120 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.PurchaseCost = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on DateCell (id=LineItemPurchaseDate) at BaggageIncidentDV.pcf: line 228, column 38
    function defaultSetter_126 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.DateAcquired = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextCell (id=LineItemDepreciationPercentage) at BaggageIncidentDV.pcf: line 250, column 34
    function defaultSetter_135 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.DepreciationPercentage = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemReplacementValue) at BaggageIncidentDV.pcf: line 262, column 34
    function defaultSetter_139 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.ReplacementValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemAmountAfterLimit) at BaggageIncidentDV.pcf: line 283, column 35
    function defaultSetter_146 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.AmountAfterLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on BooleanRadioCell (id=LineItemProofOfOwnershipProvided) at BaggageIncidentDV.pcf: line 288, column 56
    function defaultSetter_150 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.ProofOfOwnershipProvided = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'requestValidationExpression' attribute on TextCell (id=LineItemQuantity) at BaggageIncidentDV.pcf: line 197, column 48
    function requestValidationExpression_105 (VALUE :  java.lang.Integer) : java.lang.Object {
      return (VALUE != null and VALUE < 1) ? DisplayKey.get("Web.PropertyContentsIncident.LineItemQuantityIllegal") : null
    }
    
    // 'requestValidationExpression' attribute on DateCell (id=LineItemPurchaseDate) at BaggageIncidentDV.pcf: line 228, column 38
    function requestValidationExpression_124 (VALUE :  java.util.Date) : java.lang.Object {
      return VALUE > (item.Incident.Claim.LossDate != null ? item.Incident.Claim.LossDate : java.util.Date.Today) ? DisplayKey.get("Web.PropertyContentsIncident.LineItemPurchaseDateError") : null
    }
    
    // 'value' attribute on TextCell (id=LineItemQuantity) at BaggageIncidentDV.pcf: line 197, column 48
    function valueRoot_108 () : java.lang.Object {
      return item
    }
    
    // 'value' attribute on TextCell (id=LineItemQuantity) at BaggageIncidentDV.pcf: line 197, column 48
    function value_104 () : java.lang.Integer {
      return item.NumberOfItems
    }
    
    // 'value' attribute on TextCell (id=LineItemDescription) at BaggageIncidentDV.pcf: line 204, column 43
    function value_109 () : java.lang.String {
      return item.Description
    }
    
    // 'value' attribute on TypeKeyCell (id=LineItemCategory) at BaggageIncidentDV.pcf: line 211, column 62
    function value_113 () : typekey.ContentLineItemCategory {
      return item.ContentCategory
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemOriginalCost) at BaggageIncidentDV.pcf: line 221, column 35
    function value_118 () : gw.api.financials.CurrencyAmount {
      return item.PurchaseCost
    }
    
    // 'value' attribute on DateCell (id=LineItemPurchaseDate) at BaggageIncidentDV.pcf: line 228, column 38
    function value_123 () : java.util.Date {
      return item.DateAcquired
    }
    
    // 'value' attribute on TextCell (id=LineItemAge) at BaggageIncidentDV.pcf: line 239, column 39
    function value_129 () : java.math.BigDecimal {
      return item.Age
    }
    
    // 'value' attribute on TextCell (id=LineItemDepreciationPercentage) at BaggageIncidentDV.pcf: line 250, column 34
    function value_133 () : java.math.BigDecimal {
      return item.DepreciationPercentage
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemReplacementValue) at BaggageIncidentDV.pcf: line 262, column 34
    function value_137 () : gw.api.financials.CurrencyAmount {
      return item.ReplacementValue
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemTotalACV) at BaggageIncidentDV.pcf: line 274, column 35
    function value_141 () : gw.api.financials.CurrencyAmount {
      return item.ActualCashValue
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemAmountAfterLimit) at BaggageIncidentDV.pcf: line 283, column 35
    function value_144 () : gw.api.financials.CurrencyAmount {
      return item.AmountAfterLimit
    }
    
    // 'value' attribute on BooleanRadioCell (id=LineItemProofOfOwnershipProvided) at BaggageIncidentDV.pcf: line 288, column 56
    function value_148 () : java.lang.Boolean {
      return item.ProofOfOwnershipProvided
    }
    
    // 'value' attribute on TextCell (id=LineItemNotes) at BaggageIncidentDV.pcf: line 294, column 126
    function value_153 () : java.lang.String {
      return item.ItemComment
    }
    
    // 'visible' attribute on CurrencyCell (id=LineItemOriginalCost) at BaggageIncidentDV.pcf: line 221, column 35
    function visible_117 () : java.lang.Boolean {
      return inEditMode
    }
    
    // 'visible' attribute on TextCell (id=LineItemNotes) at BaggageIncidentDV.pcf: line 294, column 126
    function visible_152 () : java.lang.Boolean {
      return !inEditMode || (gw.api.print.PrintUtil.isPrintingPDF() || gw.api.print.PrintUtil.isPrintingCSV())
    }
    
    property get item () : entity.AssessmentContentItem {
      return getIteratedValue(1) as entity.AssessmentContentItem
    }
    
    
  }
  
  
}