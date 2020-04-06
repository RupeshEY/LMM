package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableReservesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableReservesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'autoAdd' attribute on RowIterator at EditableReservesLV.pcf: line 29, column 51
    function autoAdd_27 () : java.lang.Boolean {
      return addNew
    }
    
    // 'footerLabel' attribute on RowIterator at EditableReservesLV.pcf: line 49, column 29
    function label_10 () : java.lang.Object {
      return WizardHelper.ReservingCurrenciesMatch ? DisplayKey.get("LV.Financials.Total") : null
    }
    
    // 'label' attribute on RowIterator at EditableReservesLV.pcf: line 181, column 28
    function label_8 () : java.lang.Object {
      return gw.api.system.CCConfigParameters.SetReservesByTotalIncurred.Value ? DisplayKey.get("LV.Financials.ReserveSet.Reserves.NewTotalIncurred") : DisplayKey.get("LV.Financials.ReserveSet.Reserves.NewAvailableReserves")
    }
    
    // 'value' attribute on RowIterator at EditableReservesLV.pcf: line 49, column 29
    function sortValue_0 (ReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      var valueVariable : String = (ReserveWrapper.Transaction.Exposure.DisplayName)
return valueVariable
    }
    
    // 'value' attribute on RowIterator at EditableReservesLV.pcf: line 62, column 28
    function sortValue_1 (ReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return ReserveWrapper.Transaction.Exposure
    }
    
    // 'value' attribute on RowIterator at EditableReservesLV.pcf: line 72, column 45
    function sortValue_2 (ReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return ReserveWrapper.Transaction.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at EditableReservesLV.pcf: line 83, column 28
    function sortValue_3 (ReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return ReserveWrapper.Transaction.CostType
    }
    
    // 'value' attribute on RowIterator at EditableReservesLV.pcf: line 98, column 28
    function sortValue_4 (ReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return ReserveWrapper.Transaction.CostCategory
    }
    
    // 'value' attribute on RowIterator at EditableReservesLV.pcf: line 114, column 28
    function sortValue_6 (ReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return ReserveWrapper.Transaction.ReservingCurrency
    }
    
    // '$$sumValue' attribute on RowIterator at EditableReservesLV.pcf: line 181, column 28
    function sumValueRoot_24 (ReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return ReserveWrapper
    }
    
    // 'footerSumValue' attribute on RowIterator at EditableReservesLV.pcf: line 181, column 28
    function sumValue_23 (ReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return ReserveWrapper.NewAmountInReservingCurrency
    }
    
    // 'footerSumValue' attribute on RowIterator at EditableReservesLV.pcf: line 204, column 29
    function sumValue_26 (ReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return WizardHelper.getChangeReservingAmount(ReserveWrapper)
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at EditableReservesLV.pcf: line 29, column 51
    function toCreateAndAdd_118 () : entity.TransactionEditWrapper {
      return WizardHelper.addNewTransactionWrapper(Exposure)
    }
    
    // 'toRemove' attribute on RowIterator at EditableReservesLV.pcf: line 29, column 51
    function toRemove_119 (ReserveWrapper :  entity.TransactionEditWrapper) : void {
      WizardHelper.removeTransaction(ReserveWrapper)
    }
    
    // 'value' attribute on TextCell (id=AvailableReservesSum) at EditableReservesLV.pcf: line 131, column 53
    function valueRoot_15 () : java.lang.Object {
      return WizardHelper
    }
    
    // 'value' attribute on RowIterator at EditableReservesLV.pcf: line 29, column 51
    function value_120 () : entity.TransactionEditWrapper[] {
      return WizardHelper.TransactionWrappers
    }
    
    // 'value' attribute on TextCell (id=AvailableReservesSum) at EditableReservesLV.pcf: line 131, column 53
    function value_13 () : gw.api.financials.IMoney {
      return WizardHelper.AvailableReservesSum
    }
    
    // 'value' attribute on TextCell (id=TotalIncurredSum) at EditableReservesLV.pcf: line 150, column 92
    function value_17 () : gw.api.financials.IMoney {
      return WizardHelper.TotalIncurredSum
    }
    
    // 'value' attribute on TextCell (id=PendingApprovalReservesSum) at EditableReservesLV.pcf: line 167, column 53
    function value_20 () : gw.api.financials.IMoney {
      return WizardHelper.PendingApprovalReservesSum
    }
    
    // 'visible' attribute on RowIterator at EditableReservesLV.pcf: line 114, column 28
    function visible_5 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    // 'visible' attribute on RowIterator at EditableReservesLV.pcf: line 143, column 28
    function visible_7 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.SetReservesByTotalIncurred.Value
    }
    
    // 'visible' attribute on RowIterator at EditableReservesLV.pcf: line 29, column 51
    function visible_9 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode() and not gw.api.system.CCConfigParameters.SetReservesByTotalIncurred.Value
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get WizardHelper () : gw.api.financials.ReserveWizardHelper {
      return getRequireValue("WizardHelper", 0) as gw.api.financials.ReserveWizardHelper
    }
    
    property set WizardHelper ($arg :  gw.api.financials.ReserveWizardHelper) {
      setRequireValue("WizardHelper", 0, $arg)
    }
    
    property get addNew () : Boolean {
      return getRequireValue("addNew", 0) as Boolean
    }
    
    property set addNew ($arg :  Boolean) {
      setRequireValue("addNew", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableReservesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on BooleanRadioCell (id=MultiCurrencyPopup_link) at EditableReservesLV.pcf: line 194, column 143
    function action_107 () : void {
      NewReserveMultiCurrencyPopup.push(WizardHelper, ReserveWrapper)
    }
    
    // 'action' attribute on BooleanRadioCell (id=MultiCurrencyPopup_link) at EditableReservesLV.pcf: line 194, column 143
    function action_dest_108 () : pcf.api.Destination {
      return pcf.NewReserveMultiCurrencyPopup.createDestination(WizardHelper, ReserveWrapper)
    }
    
    // 'available' attribute on BooleanRadioCell (id=MultiCurrencyPopup_link) at EditableReservesLV.pcf: line 194, column 143
    function available_104 () : java.lang.Boolean {
      return (not ReserveWrapper.Transaction.Exposure.Closed) and (ReserveWrapper.Transaction.ReservingCurrency == ReserveWrapper.Transaction.Claim.Currency)
    }
    
    // 'condition' attribute on ToolbarFlag at EditableReservesLV.pcf: line 36, column 28
    function condition_29 () : java.lang.Boolean {
      return WizardHelper.isTransactionFullyEditable(ReserveWrapper.Transaction)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableReservesLV.pcf: line 212, column 29
    function defaultSetter_114 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReserveWrapper.Transaction.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=Exposure_Readonly) at EditableReservesLV.pcf: line 49, column 29
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      valueVariable = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeCell (id=Exposure) at EditableReservesLV.pcf: line 62, column 28
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReserveWrapper.Transaction.Exposure = (__VALUE_TO_SET as entity.Exposure)
    }
    
    // 'value' attribute on RangeCell (id=CostType) at EditableReservesLV.pcf: line 83, column 28
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReserveWrapper.Transaction.CostType = (__VALUE_TO_SET as typekey.CostType)
    }
    
    // 'value' attribute on RangeCell (id=CostCategory) at EditableReservesLV.pcf: line 98, column 28
    function defaultSetter_64 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReserveWrapper.Transaction.CostCategory = (__VALUE_TO_SET as typekey.CostCategory)
    }
    
    // 'value' attribute on RangeCell (id=ReservingCurrency) at EditableReservesLV.pcf: line 114, column 28
    function defaultSetter_75 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReserveWrapper.Transaction.ReservingCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'editable' attribute on CurrencyCell (id=NewAmount) at EditableReservesLV.pcf: line 181, column 28
    function editable_97 () : java.lang.Boolean {
      return not ReserveWrapper.Transaction.Exposure.Closed
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=MultiCurrencyPopup_link) at EditableReservesLV.pcf: line 194, column 143
    function iconLabel_109 () : java.lang.String {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency ? DisplayKey.get("LV.Financials.ReserveSet.Reserves.MultiCurrency.ToolTipWhenExplicitReservingCurrencyEnabled") : DisplayKey.get("LV.Financials.ReserveSet.Reserves.MultiCurrency.ToolTip")
    }
    
    // 'initialValue' attribute on Variable at EditableReservesLV.pcf: line 33, column 24
    function initialValue_28 () : String {
      return ReserveWrapper.Transaction.Exposure.DisplayName
    }
    
    // RowIterator at EditableReservesLV.pcf: line 29, column 51
    function initializeVariables_117 () : void {
        valueVariable = ReserveWrapper.Transaction.Exposure.DisplayName;

    }
    
    // 'label' attribute on CurrencyCell (id=NewAmount) at EditableReservesLV.pcf: line 181, column 28
    function label_98 () : java.lang.Object {
      return gw.api.system.CCConfigParameters.SetReservesByTotalIncurred.Value ? DisplayKey.get("LV.Financials.ReserveSet.Reserves.NewTotalIncurred") : DisplayKey.get("LV.Financials.ReserveSet.Reserves.NewAvailableReserves")
    }
    
    // 'onChange' attribute on PostOnChange at EditableReservesLV.pcf: line 64, column 80
    function onChange_36 () : void {
      WizardHelper.updateWrapperOnChangePost(ReserveWrapper)
    }
    
    // 'onChange' attribute on PostOnChange at EditableReservesLV.pcf: line 85, column 80
    function onChange_49 () : void {
      WizardHelper.updateWrapperOnChangePost(ReserveWrapper)
    }
    
    // 'onChange' attribute on PostOnChange at EditableReservesLV.pcf: line 100, column 80
    function onChange_59 () : void {
      WizardHelper.updateWrapperOnChangePost(ReserveWrapper)
    }
    
    // 'onChange' attribute on PostOnChange at EditableReservesLV.pcf: line 116, column 80
    function onChange_69 () : void {
      WizardHelper.updateWrapperOnChangePost(ReserveWrapper)
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposure_Readonly) at EditableReservesLV.pcf: line 49, column 29
    function outputConversion_33 (VALUE :  java.lang.String) : java.lang.String {
      return VALUE == null ? DisplayKey.get("Web.Financials.Exposure.ClaimLevel") : VALUE
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableReservesLV.pcf: line 62, column 28
    function valueRange_43 () : java.lang.Object {
      return WizardHelper.getValidExposures(ReserveWrapper.Transaction)
    }
    
    // 'valueRange' attribute on RangeCell (id=CostType) at EditableReservesLV.pcf: line 83, column 28
    function valueRange_56 () : java.lang.Object {
      return WizardHelper.getValidCostTypes(ReserveWrapper.Transaction)
    }
    
    // 'valueRange' attribute on RangeCell (id=CostCategory) at EditableReservesLV.pcf: line 98, column 28
    function valueRange_66 () : java.lang.Object {
      return WizardHelper.getValidCostCategories(ReserveWrapper.Transaction)
    }
    
    // 'valueRange' attribute on RangeCell (id=ReservingCurrency) at EditableReservesLV.pcf: line 114, column 28
    function valueRange_77 () : java.lang.Object {
      return WizardHelper.getValidReservingCurrencies(ReserveWrapper.Transaction)
    }
    
    // 'value' attribute on CurrencyCell (id=NewAmount) at EditableReservesLV.pcf: line 181, column 28
    function valueRoot_103 () : java.lang.Object {
      return ReserveWrapper
    }
    
    // 'value' attribute on RangeCell (id=Exposure) at EditableReservesLV.pcf: line 62, column 28
    function valueRoot_42 () : java.lang.Object {
      return ReserveWrapper.Transaction
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at EditableReservesLV.pcf: line 72, column 45
    function valueRoot_48 () : java.lang.Object {
      return ReserveWrapper.Transaction.Exposure
    }
    
    // 'value' attribute on TextCell (id=AvailableReservesSum) at EditableReservesLV.pcf: line 131, column 53
    function valueRoot_82 () : java.lang.Object {
      return WizardHelper
    }
    
    // 'value' attribute on CurrencyCell (id=ChangeAmount) at EditableReservesLV.pcf: line 204, column 29
    function value_110 () : gw.api.financials.IMoney {
      return WizardHelper.getChangeReservingAmount(ReserveWrapper)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableReservesLV.pcf: line 212, column 29
    function value_112 () : java.lang.String {
      return ReserveWrapper.Transaction.Comments
    }
    
    // 'value' attribute on TextCell (id=Exposure_Readonly) at EditableReservesLV.pcf: line 49, column 29
    function value_31 () : java.lang.String {
      return valueVariable
    }
    
    // 'value' attribute on RangeCell (id=Exposure) at EditableReservesLV.pcf: line 62, column 28
    function value_38 () : entity.Exposure {
      return ReserveWrapper.Transaction.Exposure
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at EditableReservesLV.pcf: line 72, column 45
    function value_46 () : typekey.CoverageType {
      return ReserveWrapper.Transaction.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RangeCell (id=CostType) at EditableReservesLV.pcf: line 83, column 28
    function value_51 () : typekey.CostType {
      return ReserveWrapper.Transaction.CostType
    }
    
    // 'value' attribute on RangeCell (id=CostCategory) at EditableReservesLV.pcf: line 98, column 28
    function value_61 () : typekey.CostCategory {
      return ReserveWrapper.Transaction.CostCategory
    }
    
    // 'value' attribute on RangeCell (id=ReservingCurrency) at EditableReservesLV.pcf: line 114, column 28
    function value_72 () : typekey.Currency {
      return ReserveWrapper.Transaction.ReservingCurrency
    }
    
    // 'value' attribute on TextCell (id=AvailableReservesSum) at EditableReservesLV.pcf: line 131, column 53
    function value_80 () : gw.api.financials.IMoney {
      return WizardHelper.AvailableReservesSum
    }
    
    // 'value' attribute on CurrencyCell (id=AvailableReserves) at EditableReservesLV.pcf: line 125, column 28
    function value_83 () : gw.api.financials.IMoney {
      return WizardHelper.getAvailableReservesReservingAmount(ReserveWrapper.Transaction)
    }
    
    // 'value' attribute on TextCell (id=TotalIncurredSum) at EditableReservesLV.pcf: line 150, column 92
    function value_86 () : gw.api.financials.IMoney {
      return WizardHelper.TotalIncurredSum
    }
    
    // 'value' attribute on CurrencyCell (id=TotalIncurred) at EditableReservesLV.pcf: line 143, column 28
    function value_90 () : gw.api.financials.IMoney {
      return WizardHelper.getGrossTotalIncurredReservingAmount(ReserveWrapper.Transaction)
    }
    
    // 'value' attribute on TextCell (id=PendingApprovalReservesSum) at EditableReservesLV.pcf: line 167, column 53
    function value_92 () : gw.api.financials.IMoney {
      return WizardHelper.PendingApprovalReservesSum
    }
    
    // 'value' attribute on CurrencyCell (id=PendingReserves) at EditableReservesLV.pcf: line 161, column 28
    function value_95 () : gw.api.financials.IMoney {
      return WizardHelper.getPendingApprovalReservesReservingAmount(ReserveWrapper.Transaction)
    }
    
    // 'value' attribute on CurrencyCell (id=NewAmount) at EditableReservesLV.pcf: line 181, column 28
    function value_99 () : gw.api.financials.IMutableMoney {
      return ReserveWrapper.NewAmountInReservingCurrency
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableReservesLV.pcf: line 62, column 28
    function verifyValueRangeIsAllowedType_44 ($$arg :  entity.Exposure[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableReservesLV.pcf: line 62, column 28
    function verifyValueRangeIsAllowedType_44 ($$arg :  gw.api.database.IQueryBeanResult<entity.Exposure>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableReservesLV.pcf: line 62, column 28
    function verifyValueRangeIsAllowedType_44 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CostType) at EditableReservesLV.pcf: line 83, column 28
    function verifyValueRangeIsAllowedType_57 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CostType) at EditableReservesLV.pcf: line 83, column 28
    function verifyValueRangeIsAllowedType_57 ($$arg :  typekey.CostType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CostCategory) at EditableReservesLV.pcf: line 98, column 28
    function verifyValueRangeIsAllowedType_67 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CostCategory) at EditableReservesLV.pcf: line 98, column 28
    function verifyValueRangeIsAllowedType_67 ($$arg :  typekey.CostCategory[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=ReservingCurrency) at EditableReservesLV.pcf: line 114, column 28
    function verifyValueRangeIsAllowedType_78 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=ReservingCurrency) at EditableReservesLV.pcf: line 114, column 28
    function verifyValueRangeIsAllowedType_78 ($$arg :  typekey.Currency[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableReservesLV.pcf: line 62, column 28
    function verifyValueRange_45 () : void {
      var __valueRangeArg = WizardHelper.getValidExposures(ReserveWrapper.Transaction)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_44(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=CostType) at EditableReservesLV.pcf: line 83, column 28
    function verifyValueRange_58 () : void {
      var __valueRangeArg = WizardHelper.getValidCostTypes(ReserveWrapper.Transaction)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_57(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=CostCategory) at EditableReservesLV.pcf: line 98, column 28
    function verifyValueRange_68 () : void {
      var __valueRangeArg = WizardHelper.getValidCostCategories(ReserveWrapper.Transaction)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_67(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=ReservingCurrency) at EditableReservesLV.pcf: line 114, column 28
    function verifyValueRange_79 () : void {
      var __valueRangeArg = WizardHelper.getValidReservingCurrencies(ReserveWrapper.Transaction)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_78(__valueRangeArg)
    }
    
    // 'visible' attribute on BooleanRadioCell (id=MultiCurrencyPopup_link) at EditableReservesLV.pcf: line 194, column 143
    function visible_105 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode() and not gw.api.system.CCConfigParameters.SetReservesByTotalIncurred.Value
    }
    
    // 'visible' attribute on RangeCell (id=ReservingCurrency) at EditableReservesLV.pcf: line 114, column 28
    function visible_71 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    // 'visible' attribute on TextCell (id=TotalIncurredSum) at EditableReservesLV.pcf: line 150, column 92
    function visible_85 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.SetReservesByTotalIncurred.Value
    }
    
    property get ReserveWrapper () : entity.TransactionEditWrapper {
      return getIteratedValue(1) as entity.TransactionEditWrapper
    }
    
    property get valueVariable () : String {
      return getVariableValue("valueVariable", 1) as String
    }
    
    property set valueVariable ($arg :  String) {
      setVariableValue("valueVariable", 1, $arg)
    }
    
    
  }
  
  
}