package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableRecoveryReservesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRecoveryReservesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'footerLabel' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 41, column 29
    function label_9 () : java.lang.Object {
      return WizardHelper.ReservingCurrenciesMatch ? DisplayKey.get("LV.Financials.Total") : null
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 41, column 29
    function sortValue_0 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      var valueVariable : String = (RecoveryReserveWrapper.Transaction.Exposure.DisplayName)
return valueVariable
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 55, column 39
    function sortValue_1 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return RecoveryReserveWrapper.Transaction.Exposure
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 64, column 45
    function sortValue_2 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return RecoveryReserveWrapper.Transaction.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 73, column 40
    function sortValue_3 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return RecoveryReserveWrapper.Transaction.CostType
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 86, column 44
    function sortValue_4 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return RecoveryReserveWrapper.Transaction.CostCategory
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 98, column 28
    function sortValue_5 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return (RecoveryReserveWrapper.Transaction as RecoveryReserve).RecoveryCategory
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 112, column 73
    function sortValue_7 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return RecoveryReserveWrapper.Transaction.ReservingCurrency
    }
    
    // '$$sumValue' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 143, column 28
    function sumValueRoot_16 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return RecoveryReserveWrapper
    }
    
    // 'footerSumValue' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 143, column 28
    function sumValue_15 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return RecoveryReserveWrapper.NewAmountInReservingCurrency
    }
    
    // 'footerSumValue' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 164, column 49
    function sumValue_18 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return WizardHelper.getChangeReservingAmount(RecoveryReserveWrapper)
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 22, column 51
    function toCreateAndAdd_104 () : entity.TransactionEditWrapper {
      return WizardHelper.addNewTransactionWrapper()
    }
    
    // 'toRemove' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 22, column 51
    function toRemove_105 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : void {
      WizardHelper.removeTransaction(RecoveryReserveWrapper)
    }
    
    // 'value' attribute on TextCell (id=OpenRecoveryReservesSum) at EditableRecoveryReservesLV.pcf: line 129, column 53
    function valueRoot_14 () : java.lang.Object {
      return WizardHelper
    }
    
    // 'value' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 22, column 51
    function value_106 () : entity.TransactionEditWrapper[] {
      return WizardHelper.TransactionWrappers
    }
    
    // 'value' attribute on TextCell (id=OpenRecoveryReservesSum) at EditableRecoveryReservesLV.pcf: line 129, column 53
    function value_12 () : gw.api.financials.IMoney {
      return WizardHelper.OpenRecoveryReservesSum
    }
    
    // 'visible' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 112, column 73
    function visible_6 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    // 'visible' attribute on RowIterator at EditableRecoveryReservesLV.pcf: line 22, column 51
    function visible_8 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    property get WizardHelper () : gw.api.financials.RecoveryReserveWizardHelper {
      return getRequireValue("WizardHelper", 0) as gw.api.financials.RecoveryReserveWizardHelper
    }
    
    property set WizardHelper ($arg :  gw.api.financials.RecoveryReserveWizardHelper) {
      setRequireValue("WizardHelper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableRecoveryReservesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on BooleanRadioCell (id=MultiCurrencyPopup_link) at EditableRecoveryReservesLV.pcf: line 156, column 69
    function action_93 () : void {
      NewRecoveryReserveMultiCurrencyPopup.push(WizardHelper, RecoveryReserveWrapper)
    }
    
    // 'action' attribute on BooleanRadioCell (id=MultiCurrencyPopup_link) at EditableRecoveryReservesLV.pcf: line 156, column 69
    function action_dest_94 () : pcf.api.Destination {
      return pcf.NewRecoveryReserveMultiCurrencyPopup.createDestination(WizardHelper, RecoveryReserveWrapper)
    }
    
    // 'available' attribute on BooleanRadioCell (id=MultiCurrencyPopup_link) at EditableRecoveryReservesLV.pcf: line 156, column 69
    function available_90 () : java.lang.Boolean {
      return RecoveryReserveWrapper.Transaction.ReservingCurrency == RecoveryReserveWrapper.Transaction.Claim.Currency
    }
    
    // 'condition' attribute on ToolbarFlag at EditableRecoveryReservesLV.pcf: line 29, column 28
    function condition_20 () : java.lang.Boolean {
      return WizardHelper.isTransactionFullyEditable(RecoveryReserveWrapper.Transaction)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableRecoveryReservesLV.pcf: line 171, column 29
    function defaultSetter_100 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoveryReserveWrapper.Transaction.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=Exposure_Readonly) at EditableRecoveryReservesLV.pcf: line 41, column 29
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      valueVariable = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeCell (id=Exposure) at EditableRecoveryReservesLV.pcf: line 55, column 39
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoveryReserveWrapper.Transaction.Exposure = (__VALUE_TO_SET as entity.Exposure)
    }
    
    // 'value' attribute on RangeCell (id=CostType) at EditableRecoveryReservesLV.pcf: line 73, column 40
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoveryReserveWrapper.Transaction.CostType = (__VALUE_TO_SET as typekey.CostType)
    }
    
    // 'value' attribute on RangeCell (id=CostCategory) at EditableRecoveryReservesLV.pcf: line 86, column 44
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoveryReserveWrapper.Transaction.CostCategory = (__VALUE_TO_SET as typekey.CostCategory)
    }
    
    // 'value' attribute on RangeCell (id=RecoveryCategory) at EditableRecoveryReservesLV.pcf: line 98, column 28
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      (RecoveryReserveWrapper.Transaction as RecoveryReserve).RecoveryCategory = (__VALUE_TO_SET as typekey.RecoveryCategory)
    }
    
    // 'value' attribute on RangeCell (id=ReservingCurrency) at EditableRecoveryReservesLV.pcf: line 112, column 73
    function defaultSetter_77 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoveryReserveWrapper.Transaction.ReservingCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=MultiCurrencyPopup_link) at EditableRecoveryReservesLV.pcf: line 156, column 69
    function iconLabel_95 () : java.lang.String {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency ? DisplayKey.get("LV.Financials.RecoveryReserveSet.RecoveryReserves.MultiCurrency.ToolTipWhenExplicitReservingCurrencyEnabled") : DisplayKey.get("LV.Financials.RecoveryReserveSet.RecoveryReserves.MultiCurrency.ToolTip")
    }
    
    // 'initialValue' attribute on Variable at EditableRecoveryReservesLV.pcf: line 26, column 24
    function initialValue_19 () : String {
      return RecoveryReserveWrapper.Transaction.Exposure.DisplayName
    }
    
    // RowIterator at EditableRecoveryReservesLV.pcf: line 22, column 51
    function initializeVariables_103 () : void {
        valueVariable = RecoveryReserveWrapper.Transaction.Exposure.DisplayName;

    }
    
    // 'onChange' attribute on PostOnChange at EditableRecoveryReservesLV.pcf: line 57, column 88
    function onChange_27 () : void {
      WizardHelper.updateWrapperOnChangePost(RecoveryReserveWrapper)
    }
    
    // 'onChange' attribute on PostOnChange at EditableRecoveryReservesLV.pcf: line 75, column 88
    function onChange_41 () : void {
      WizardHelper.updateWrapperOnChangePost(RecoveryReserveWrapper)
    }
    
    // 'onChange' attribute on PostOnChange at EditableRecoveryReservesLV.pcf: line 88, column 88
    function onChange_51 () : void {
      WizardHelper.updateWrapperOnChangePost(RecoveryReserveWrapper)
    }
    
    // 'onChange' attribute on PostOnChange at EditableRecoveryReservesLV.pcf: line 100, column 88
    function onChange_61 () : void {
      WizardHelper.updateWrapperOnChangePost(RecoveryReserveWrapper)
    }
    
    // 'onChange' attribute on PostOnChange at EditableRecoveryReservesLV.pcf: line 114, column 88
    function onChange_71 () : void {
      WizardHelper.updateWrapperOnChangePost(RecoveryReserveWrapper)
    }
    
    // 'optionLabel' attribute on RangeCell (id=Exposure) at EditableRecoveryReservesLV.pcf: line 55, column 39
    function optionLabel_34 (VALUE :  entity.Exposure) : java.lang.String {
      return VALUE.DisplayName
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposure_Readonly) at EditableRecoveryReservesLV.pcf: line 41, column 29
    function outputConversion_24 (VALUE :  java.lang.String) : java.lang.String {
      return VALUE == null ? DisplayKey.get("Web.Financials.Exposure.ClaimLevel") : VALUE
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableRecoveryReservesLV.pcf: line 55, column 39
    function valueRange_35 () : java.lang.Object {
      return WizardHelper.getValidExposures(RecoveryReserveWrapper.Transaction)
    }
    
    // 'valueRange' attribute on RangeCell (id=CostType) at EditableRecoveryReservesLV.pcf: line 73, column 40
    function valueRange_48 () : java.lang.Object {
      return WizardHelper.getValidCostTypes(RecoveryReserveWrapper.Transaction)
    }
    
    // 'valueRange' attribute on RangeCell (id=CostCategory) at EditableRecoveryReservesLV.pcf: line 86, column 44
    function valueRange_58 () : java.lang.Object {
      return WizardHelper.getValidCostCategories(RecoveryReserveWrapper.Transaction)
    }
    
    // 'valueRange' attribute on RangeCell (id=RecoveryCategory) at EditableRecoveryReservesLV.pcf: line 98, column 28
    function valueRange_68 () : java.lang.Object {
      return WizardHelper.getValidRecoveryCategories(RecoveryReserveWrapper.Transaction)
    }
    
    // 'valueRange' attribute on RangeCell (id=ReservingCurrency) at EditableRecoveryReservesLV.pcf: line 112, column 73
    function valueRange_79 () : java.lang.Object {
      return WizardHelper.getValidReservingCurrencies(RecoveryReserveWrapper.Transaction)
    }
    
    // 'value' attribute on RangeCell (id=Exposure) at EditableRecoveryReservesLV.pcf: line 55, column 39
    function valueRoot_33 () : java.lang.Object {
      return RecoveryReserveWrapper.Transaction
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at EditableRecoveryReservesLV.pcf: line 64, column 45
    function valueRoot_40 () : java.lang.Object {
      return RecoveryReserveWrapper.Transaction.Exposure
    }
    
    // 'value' attribute on RangeCell (id=RecoveryCategory) at EditableRecoveryReservesLV.pcf: line 98, column 28
    function valueRoot_67 () : java.lang.Object {
      return (RecoveryReserveWrapper.Transaction as RecoveryReserve)
    }
    
    // 'value' attribute on TextCell (id=OpenRecoveryReservesSum) at EditableRecoveryReservesLV.pcf: line 129, column 53
    function valueRoot_84 () : java.lang.Object {
      return WizardHelper
    }
    
    // 'value' attribute on CurrencyCell (id=NewOpenRecoveryReserves) at EditableRecoveryReservesLV.pcf: line 143, column 28
    function valueRoot_89 () : java.lang.Object {
      return RecoveryReserveWrapper
    }
    
    // 'value' attribute on TextCell (id=Exposure_Readonly) at EditableRecoveryReservesLV.pcf: line 41, column 29
    function value_22 () : java.lang.String {
      return valueVariable
    }
    
    // 'value' attribute on RangeCell (id=Exposure) at EditableRecoveryReservesLV.pcf: line 55, column 39
    function value_29 () : entity.Exposure {
      return RecoveryReserveWrapper.Transaction.Exposure
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at EditableRecoveryReservesLV.pcf: line 64, column 45
    function value_38 () : typekey.CoverageType {
      return RecoveryReserveWrapper.Transaction.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RangeCell (id=CostType) at EditableRecoveryReservesLV.pcf: line 73, column 40
    function value_43 () : typekey.CostType {
      return RecoveryReserveWrapper.Transaction.CostType
    }
    
    // 'value' attribute on RangeCell (id=CostCategory) at EditableRecoveryReservesLV.pcf: line 86, column 44
    function value_53 () : typekey.CostCategory {
      return RecoveryReserveWrapper.Transaction.CostCategory
    }
    
    // 'value' attribute on RangeCell (id=RecoveryCategory) at EditableRecoveryReservesLV.pcf: line 98, column 28
    function value_63 () : typekey.RecoveryCategory {
      return (RecoveryReserveWrapper.Transaction as RecoveryReserve).RecoveryCategory
    }
    
    // 'value' attribute on RangeCell (id=ReservingCurrency) at EditableRecoveryReservesLV.pcf: line 112, column 73
    function value_74 () : typekey.Currency {
      return RecoveryReserveWrapper.Transaction.ReservingCurrency
    }
    
    // 'value' attribute on TextCell (id=OpenRecoveryReservesSum) at EditableRecoveryReservesLV.pcf: line 129, column 53
    function value_82 () : gw.api.financials.IMoney {
      return WizardHelper.OpenRecoveryReservesSum
    }
    
    // 'value' attribute on CurrencyCell (id=OpenRecoveryReserves) at EditableRecoveryReservesLV.pcf: line 123, column 28
    function value_85 () : gw.api.financials.IMoney {
      return WizardHelper.getOpenRecoveryReservesReservingAmount(RecoveryReserveWrapper.Transaction)
    }
    
    // 'value' attribute on CurrencyCell (id=NewOpenRecoveryReserves) at EditableRecoveryReservesLV.pcf: line 143, column 28
    function value_87 () : gw.api.financials.IMutableMoney {
      return RecoveryReserveWrapper.NewAmountInReservingCurrency
    }
    
    // 'value' attribute on CurrencyCell (id=ChangeAmount) at EditableRecoveryReservesLV.pcf: line 164, column 49
    function value_96 () : gw.api.financials.IMoney {
      return WizardHelper.getChangeReservingAmount(RecoveryReserveWrapper)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableRecoveryReservesLV.pcf: line 171, column 29
    function value_98 () : java.lang.String {
      return RecoveryReserveWrapper.Transaction.Comments
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableRecoveryReservesLV.pcf: line 55, column 39
    function verifyValueRangeIsAllowedType_36 ($$arg :  entity.Exposure[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableRecoveryReservesLV.pcf: line 55, column 39
    function verifyValueRangeIsAllowedType_36 ($$arg :  gw.api.database.IQueryBeanResult<entity.Exposure>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableRecoveryReservesLV.pcf: line 55, column 39
    function verifyValueRangeIsAllowedType_36 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CostType) at EditableRecoveryReservesLV.pcf: line 73, column 40
    function verifyValueRangeIsAllowedType_49 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CostType) at EditableRecoveryReservesLV.pcf: line 73, column 40
    function verifyValueRangeIsAllowedType_49 ($$arg :  typekey.CostType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CostCategory) at EditableRecoveryReservesLV.pcf: line 86, column 44
    function verifyValueRangeIsAllowedType_59 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=CostCategory) at EditableRecoveryReservesLV.pcf: line 86, column 44
    function verifyValueRangeIsAllowedType_59 ($$arg :  typekey.CostCategory[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=RecoveryCategory) at EditableRecoveryReservesLV.pcf: line 98, column 28
    function verifyValueRangeIsAllowedType_69 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=RecoveryCategory) at EditableRecoveryReservesLV.pcf: line 98, column 28
    function verifyValueRangeIsAllowedType_69 ($$arg :  typekey.RecoveryCategory[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=ReservingCurrency) at EditableRecoveryReservesLV.pcf: line 112, column 73
    function verifyValueRangeIsAllowedType_80 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=ReservingCurrency) at EditableRecoveryReservesLV.pcf: line 112, column 73
    function verifyValueRangeIsAllowedType_80 ($$arg :  typekey.Currency[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableRecoveryReservesLV.pcf: line 55, column 39
    function verifyValueRange_37 () : void {
      var __valueRangeArg = WizardHelper.getValidExposures(RecoveryReserveWrapper.Transaction)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_36(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=CostType) at EditableRecoveryReservesLV.pcf: line 73, column 40
    function verifyValueRange_50 () : void {
      var __valueRangeArg = WizardHelper.getValidCostTypes(RecoveryReserveWrapper.Transaction)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_49(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=CostCategory) at EditableRecoveryReservesLV.pcf: line 86, column 44
    function verifyValueRange_60 () : void {
      var __valueRangeArg = WizardHelper.getValidCostCategories(RecoveryReserveWrapper.Transaction)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_59(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=RecoveryCategory) at EditableRecoveryReservesLV.pcf: line 98, column 28
    function verifyValueRange_70 () : void {
      var __valueRangeArg = WizardHelper.getValidRecoveryCategories(RecoveryReserveWrapper.Transaction)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_69(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=ReservingCurrency) at EditableRecoveryReservesLV.pcf: line 112, column 73
    function verifyValueRange_81 () : void {
      var __valueRangeArg = WizardHelper.getValidReservingCurrencies(RecoveryReserveWrapper.Transaction)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_80(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeCell (id=ReservingCurrency) at EditableRecoveryReservesLV.pcf: line 112, column 73
    function visible_73 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    // 'visible' attribute on BooleanRadioCell (id=MultiCurrencyPopup_link) at EditableRecoveryReservesLV.pcf: line 156, column 69
    function visible_91 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    property get RecoveryReserveWrapper () : entity.TransactionEditWrapper {
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