package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.reins.RIAgreementDetailsRow
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculator
uses gw.api.financials.FinancialsCalculations
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReinsuranceAgreementDetailsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CurrencyCell (id=TotalCededReserves) at ReinsuranceAgreementDetails.pcf: line 192, column 52
    function valueRoot_100 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=NetPaid) at ReinsuranceAgreementDetails.pcf: line 167, column 161
    function valueRoot_75 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getNetPayments().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType)
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves) at ReinsuranceAgreementDetails.pcf: line 170, column 162
    function valueRoot_78 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType)
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 173, column 221
    function valueRoot_81 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesNonAdjustments().withExposure(CostTypeRow.Exposure).withRIAgreement(reinsuranceAgreement).withCostType(CostTypeRow.CostType)
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 177, column 52
    function valueRoot_85 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 181, column 52
    function valueRoot_89 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=CededReserves) at ReinsuranceAgreementDetails.pcf: line 184, column 222
    function valueRoot_92 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesNonAdjustments().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedCededReserves) at ReinsuranceAgreementDetails.pcf: line 188, column 52
    function valueRoot_96 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on RowIterator at ReinsuranceAgreementDetails.pcf: line 199, column 60
    function value_131 () : gw.reins.RIAgreementDetailsRow[] {
      return CostTypeRow.NextLevelRows.sortBy(\ r -> r.CostCategory )
    }
    
    // 'value' attribute on TextCell (id=DisplayName) at ReinsuranceAgreementDetails.pcf: line 164, column 76
    function value_71 () : java.lang.String {
      return "  " + CostTypeRow.CostType.DisplayName
    }
    
    // 'value' attribute on CurrencyCell (id=NetPaid) at ReinsuranceAgreementDetails.pcf: line 167, column 161
    function value_73 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getNetPayments().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves) at ReinsuranceAgreementDetails.pcf: line 170, column 162
    function value_76 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 173, column 221
    function value_79 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesNonAdjustments().withExposure(CostTypeRow.Exposure).withRIAgreement(reinsuranceAgreement).withCostType(CostTypeRow.CostType).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 177, column 52
    function value_83 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 181, column 52
    function value_87 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=CededReserves) at ReinsuranceAgreementDetails.pcf: line 184, column 222
    function value_90 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesNonAdjustments().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedCededReserves) at ReinsuranceAgreementDetails.pcf: line 188, column 52
    function value_94 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=TotalCededReserves) at ReinsuranceAgreementDetails.pcf: line 192, column 52
    function value_98 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withExposure(CostTypeRow.Exposure).withCostType(CostTypeRow.CostType).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'visible' attribute on CurrencyCell (id=AdjustedPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 177, column 52
    function visible_82 () : java.lang.Boolean {
      return shouldShowAdjustments()
    }
    
    property get CostTypeRow () : gw.reins.RIAgreementDetailsRow {
      return getIteratedValue(2) as gw.reins.RIAgreementDetailsRow
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends IteratorEntry2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CurrencyCell (id=NetPaid) at ReinsuranceAgreementDetails.pcf: line 206, column 218
    function valueRoot_105 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getNetPayments().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory)
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves) at ReinsuranceAgreementDetails.pcf: line 209, column 219
    function valueRoot_108 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory)
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 212, column 278
    function valueRoot_111 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesNonAdjustments().withExposure(CostCategoryRow.Exposure).withRIAgreement(reinsuranceAgreement).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory)
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 216, column 54
    function valueRoot_115 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 220, column 54
    function valueRoot_119 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=CededReserves) at ReinsuranceAgreementDetails.pcf: line 223, column 279
    function valueRoot_122 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesNonAdjustments().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedCededReserves) at ReinsuranceAgreementDetails.pcf: line 227, column 54
    function valueRoot_126 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=TotalCededReserves) at ReinsuranceAgreementDetails.pcf: line 231, column 54
    function valueRoot_130 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on TextCell (id=DisplayName) at ReinsuranceAgreementDetails.pcf: line 203, column 88
    function value_101 () : java.lang.String {
      return "    " + CostCategoryRow.CostCategory.DisplayName
    }
    
    // 'value' attribute on CurrencyCell (id=NetPaid) at ReinsuranceAgreementDetails.pcf: line 206, column 218
    function value_103 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getNetPayments().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves) at ReinsuranceAgreementDetails.pcf: line 209, column 219
    function value_106 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 212, column 278
    function value_109 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesNonAdjustments().withExposure(CostCategoryRow.Exposure).withRIAgreement(reinsuranceAgreement).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 216, column 54
    function value_113 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 220, column 54
    function value_117 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=CededReserves) at ReinsuranceAgreementDetails.pcf: line 223, column 279
    function value_120 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesNonAdjustments().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedCededReserves) at ReinsuranceAgreementDetails.pcf: line 227, column 54
    function value_124 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=TotalCededReserves) at ReinsuranceAgreementDetails.pcf: line 231, column 54
    function value_128 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withExposure(CostCategoryRow.Exposure).withCostType(CostCategoryRow.CostType).withCostCategory(CostCategoryRow.CostCategory).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'visible' attribute on CurrencyCell (id=AdjustedPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 216, column 54
    function visible_112 () : java.lang.Boolean {
      return shouldShowAdjustments()
    }
    
    property get CostCategoryRow () : gw.reins.RIAgreementDetailsRow {
      return getIteratedValue(3) as gw.reins.RIAgreementDetailsRow
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReinsuranceAgreementDetailsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on CurrencyCell (id=PaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 123, column 184
    function label_45 () : java.lang.Object {
      return shouldShowAdjustments() ? DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceAgreementDetails.Calculated") : DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceAgreementDetails.RIRecoverable")
    }
    
    // 'label' attribute on CurrencyCell (id=CededReserves) at ReinsuranceAgreementDetails.pcf: line 140, column 185
    function label_58 () : java.lang.Object {
      return shouldShowAdjustments() ? DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceAgreementDetails.Calculated") : DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceAgreementDetails.OpenCededReserves")
    }
    
    // 'value' attribute on CurrencyCell (id=NetPaid) at ReinsuranceAgreementDetails.pcf: line 113, column 124
    function valueRoot_41 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getNetPayments().withExposure(ExposureRow.Exposure)
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves) at ReinsuranceAgreementDetails.pcf: line 118, column 125
    function valueRoot_44 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withExposure(ExposureRow.Exposure)
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 123, column 184
    function valueRoot_49 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesNonAdjustments().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 129, column 50
    function valueRoot_53 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 135, column 50
    function valueRoot_57 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=CededReserves) at ReinsuranceAgreementDetails.pcf: line 140, column 185
    function valueRoot_62 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesNonAdjustments().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedCededReserves) at ReinsuranceAgreementDetails.pcf: line 146, column 50
    function valueRoot_66 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=TotalCededReserves) at ReinsuranceAgreementDetails.pcf: line 152, column 50
    function valueRoot_70 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on RowIterator at ReinsuranceAgreementDetails.pcf: line 159, column 58
    function value_132 () : gw.reins.RIAgreementDetailsRow[] {
      return ExposureRow.NextLevelRows.sortBy(\ r -> r.CostType)
    }
    
    // 'value' attribute on TextCell (id=DisplayName) at ReinsuranceAgreementDetails.pcf: line 107, column 189
    function value_37 () : java.lang.String {
      return ExposureRow.Exposure.DisplayName + (ExposureRow.Exposure.Coverage.Type == null ? "" :  " - "  +  ExposureRow.Exposure.Coverage.Type.DisplayName)
    }
    
    // 'value' attribute on CurrencyCell (id=NetPaid) at ReinsuranceAgreementDetails.pcf: line 113, column 124
    function value_39 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getNetPayments().withExposure(ExposureRow.Exposure).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves) at ReinsuranceAgreementDetails.pcf: line 118, column 125
    function value_42 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withExposure(ExposureRow.Exposure).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 123, column 184
    function value_46 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesNonAdjustments().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 129, column 50
    function value_51 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 135, column 50
    function value_55 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=CededReserves) at ReinsuranceAgreementDetails.pcf: line 140, column 185
    function value_59 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesNonAdjustments().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedCededReserves) at ReinsuranceAgreementDetails.pcf: line 146, column 50
    function value_64 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=TotalCededReserves) at ReinsuranceAgreementDetails.pcf: line 152, column 50
    function value_68 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withExposure(ExposureRow.Exposure).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'visible' attribute on CurrencyCell (id=AdjustedPaymentRecoverable) at ReinsuranceAgreementDetails.pcf: line 129, column 50
    function visible_50 () : java.lang.Boolean {
      return shouldShowAdjustments()
    }
    
    property get ExposureRow () : gw.reins.RIAgreementDetailsRow {
      return getIteratedValue(1) as gw.reins.RIAgreementDetailsRow
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceAgreementDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceAgreementDetailsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (reinsuranceAgreement :  RIAgreement, claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=DeleteButton) at ReinsuranceAgreementDetails.pcf: line 37, column 119
    function action_5 () : void {
      ensureInEditMode(); beforeCommitAction = \ -> deleteAgreementAndGroupIfLastAgreement(); CurrentLocation.commit()
    }
    
    // 'beforeCommit' attribute on Page (id=ReinsuranceAgreementDetails) at ReinsuranceAgreementDetails.pcf: line 12, column 108
    function beforeCommit_210 (pickedValue :  java.lang.Object) : void {
      removeOrVerifyNewAgreementGroups(reinsuranceAgreement); if(reinsuranceAgreement.isFieldChanged("NotificationThreshold") == true) {claim.setReinsuranceNotificationIfGrossTotalIncurredOverThreshold()};if(beforeCommitAction != null) {beforeCommitAction()}
    }
    
    // 'canEdit' attribute on Page (id=ReinsuranceAgreementDetails) at ReinsuranceAgreementDetails.pcf: line 12, column 108
    function canEdit_211 () : java.lang.Boolean {
      return perm.System.riedit and reinsuranceAgreement.isUserEditable
    }
    
    // 'canVisit' attribute on Page (id=ReinsuranceAgreementDetails) at ReinsuranceAgreementDetails.pcf: line 12, column 108
    static function canVisit_212 (claim :  Claim, reinsuranceAgreement :  RIAgreement) : java.lang.Boolean {
      return perm.System.riedit or perm.System.riview
    }
    
    // 'confirmMessage' attribute on ToolbarButton (id=DeleteButton) at ReinsuranceAgreementDetails.pcf: line 37, column 119
    function confirmMessage_6 () : java.lang.String {
      return reinsuranceAgreement.RIAgreementGroup.Agreements.Count == 1 ? DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceAgreementDetails.DeleteWillRemoveGroup") : DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceAgreementDetails.DeleteConfirm")
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_onEnter_10 (def :  pcf.AgreementDetailsDV_ExcessOfLossRITreaty) : void {
      def.onEnter(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_onEnter_12 (def :  pcf.AgreementDetailsDV_FacExcessOfLossRIAgreement) : void {
      def.onEnter(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_onEnter_14 (def :  pcf.AgreementDetailsDV_FacNetExcessOfLossRIAgreement) : void {
      def.onEnter(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_onEnter_16 (def :  pcf.AgreementDetailsDV_FacProportionalRIAgreement) : void {
      def.onEnter(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_onEnter_18 (def :  pcf.AgreementDetailsDV_NetExcessOfLossRITreaty) : void {
      def.onEnter(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_onEnter_20 (def :  pcf.AgreementDetailsDV_PerEventRITreaty) : void {
      def.onEnter(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_onEnter_22 (def :  pcf.AgreementDetailsDV_QuotaShareRITreaty) : void {
      def.onEnter(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_onEnter_24 (def :  pcf.AgreementDetailsDV_SurplusRITreaty) : void {
      def.onEnter(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_onEnter_26 (def :  pcf.AgreementDetailsDV_default) : void {
      def.onEnter(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_onEnter_8 (def :  pcf.AgreementDetailsDV_AnnualAggregateRITreaty) : void {
      def.onEnter(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_refreshVariables_11 (def :  pcf.AgreementDetailsDV_ExcessOfLossRITreaty) : void {
      def.refreshVariables(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_refreshVariables_13 (def :  pcf.AgreementDetailsDV_FacExcessOfLossRIAgreement) : void {
      def.refreshVariables(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_refreshVariables_15 (def :  pcf.AgreementDetailsDV_FacNetExcessOfLossRIAgreement) : void {
      def.refreshVariables(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_refreshVariables_17 (def :  pcf.AgreementDetailsDV_FacProportionalRIAgreement) : void {
      def.refreshVariables(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_refreshVariables_19 (def :  pcf.AgreementDetailsDV_NetExcessOfLossRITreaty) : void {
      def.refreshVariables(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_refreshVariables_21 (def :  pcf.AgreementDetailsDV_PerEventRITreaty) : void {
      def.refreshVariables(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_refreshVariables_23 (def :  pcf.AgreementDetailsDV_QuotaShareRITreaty) : void {
      def.refreshVariables(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_refreshVariables_25 (def :  pcf.AgreementDetailsDV_SurplusRITreaty) : void {
      def.refreshVariables(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_refreshVariables_27 (def :  pcf.AgreementDetailsDV_default) : void {
      def.refreshVariables(reinsuranceAgreement)
    }
    
    // 'def' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function def_refreshVariables_9 (def :  pcf.AgreementDetailsDV_AnnualAggregateRITreaty) : void {
      def.refreshVariables(reinsuranceAgreement)
    }
    
    // 'initialValue' attribute on Variable at ReinsuranceAgreementDetails.pcf: line 24, column 23
    function initialValue_0 () : block() {
      return null
    }
    
    // EditButtons (id=EditButtons) at ReinsuranceAgreementDetails.pcf: line 31, column 29
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'label' attribute on RowIterator (id=ExposureIterator) at ReinsuranceAgreementDetails.pcf: line 123, column 184
    function label_31 () : java.lang.Object {
      return shouldShowAdjustments() ? DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceAgreementDetails.Calculated") : DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceAgreementDetails.RIRecoverable")
    }
    
    // 'label' attribute on RowIterator (id=ExposureIterator) at ReinsuranceAgreementDetails.pcf: line 140, column 185
    function label_34 () : java.lang.Object {
      return shouldShowAdjustments() ? DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceAgreementDetails.Calculated") : DisplayKey.get("Web.Claim.Reinsurance.ReinsuranceAgreementDetails.OpenCededReserves")
    }
    
    // 'mode' attribute on PanelRef (id=AgreementDetailsRef) at ReinsuranceAgreementDetails.pcf: line 42, column 46
    function mode_28 () : java.lang.Object {
      return reinsuranceAgreement.Subtype
    }
    
    // 'parent' attribute on Page (id=ReinsuranceAgreementDetails) at ReinsuranceAgreementDetails.pcf: line 12, column 108
    static function parent_213 (claim :  Claim, reinsuranceAgreement :  RIAgreement) : pcf.api.Destination {
      return pcf.ReinsuranceSummary.createDestination(reinsuranceAgreement.Claim)
    }
    
    // 'value' attribute on RowIterator (id=ExposureIterator) at ReinsuranceAgreementDetails.pcf: line 107, column 189
    function sortValue_30 (ExposureRow :  gw.reins.RIAgreementDetailsRow) : java.lang.Object {
      return ExposureRow.Exposure.DisplayName + (ExposureRow.Exposure.Coverage.Type == null ? "" :  " - "  +  ExposureRow.Exposure.Coverage.Type.DisplayName)
    }
    
    // 'startEditing' attribute on Page (id=ReinsuranceAgreementDetails) at ReinsuranceAgreementDetails.pcf: line 12, column 108
    function startEditing_214 () : void {
      createNewAgreementGroup()
    }
    
    // 'value' attribute on CurrencyCell (id=NetPaidFooter) at ReinsuranceAgreementDetails.pcf: line 245, column 142
    function valueRoot_136 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getNetPayments().withClaim(claim).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReservesFooter) at ReinsuranceAgreementDetails.pcf: line 249, column 143
    function valueRoot_139 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withClaim(claim).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 253, column 164
    function valueRoot_142 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesNonAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 258, column 48
    function valueRoot_146 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 263, column 48
    function valueRoot_150 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withClaim(claim).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=CededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 267, column 165
    function valueRoot_153 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesNonAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 272, column 48
    function valueRoot_157 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=TotalCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 277, column 48
    function valueRoot_161 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withClaim(claim).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostNetPaidFooter) at ReinsuranceAgreementDetails.pcf: line 286, column 178
    function valueRoot_164 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getNetPayments().withClaim(claim).withRIAgreement(reinsuranceAgreement).withCostType(CostType.TC_CLAIMCOST)
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostOpenReservesFooter) at ReinsuranceAgreementDetails.pcf: line 289, column 179
    function valueRoot_167 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withClaim(claim).withRIAgreement(reinsuranceAgreement).withCostType(CostType.TC_CLAIMCOST)
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 292, column 200
    function valueRoot_170 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesNonAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).withCostType(CostType.TC_CLAIMCOST)
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostAdjustedPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 296, column 48
    function valueRoot_174 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).withCostType(CostType.TC_CLAIMCOST)
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostTotalPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 300, column 48
    function valueRoot_178 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withClaim(claim).withCostType(CostType.TC_CLAIMCOST).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 303, column 201
    function valueRoot_181 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesNonAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).withCostType(CostType.TC_CLAIMCOST)
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostAdjustedCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 307, column 48
    function valueRoot_185 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments().withClaim(claim).withCostType(CostType.TC_CLAIMCOST).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostTotalCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 311, column 48
    function valueRoot_189 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withClaim(claim).withCostType(CostType.TC_CLAIMCOST).withRIAgreement(reinsuranceAgreement)
    }
    
    // 'value' attribute on RowIterator (id=ExposureIterator) at ReinsuranceAgreementDetails.pcf: line 101, column 56
    function value_133 () : gw.reins.RIAgreementDetailsRow[] {
      return detailsRows().sortBy(\ r -> r.Exposure.DisplayName )
    }
    
    // 'value' attribute on CurrencyCell (id=NetPaidFooter) at ReinsuranceAgreementDetails.pcf: line 245, column 142
    function value_134 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getNetPayments().withClaim(claim).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReservesFooter) at ReinsuranceAgreementDetails.pcf: line 249, column 143
    function value_137 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withClaim(claim).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=PaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 253, column 164
    function value_140 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesNonAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 258, column 48
    function value_144 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 263, column 48
    function value_148 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withClaim(claim).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=CededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 267, column 165
    function value_151 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesNonAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=AdjustedCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 272, column 48
    function value_155 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=TotalCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 277, column 48
    function value_159 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withClaim(claim).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostNetPaidFooter) at ReinsuranceAgreementDetails.pcf: line 286, column 178
    function value_162 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getNetPayments().withClaim(claim).withRIAgreement(reinsuranceAgreement).withCostType(CostType.TC_CLAIMCOST).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostOpenReservesFooter) at ReinsuranceAgreementDetails.pcf: line 289, column 179
    function value_165 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withClaim(claim).withRIAgreement(reinsuranceAgreement).withCostType(CostType.TC_CLAIMCOST).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 292, column 200
    function value_168 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesNonAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).withCostType(CostType.TC_CLAIMCOST).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostAdjustedPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 296, column 48
    function value_172 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).withCostType(CostType.TC_CLAIMCOST).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostTotalPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 300, column 48
    function value_176 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalRecoverables().withClaim(claim).withCostType(CostType.TC_CLAIMCOST).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 303, column 201
    function value_179 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesNonAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).withCostType(CostType.TC_CLAIMCOST).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostAdjustedCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 307, column 48
    function value_183 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments().withClaim(claim).withCostType(CostType.TC_CLAIMCOST).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=ClaimCostTotalCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 311, column 48
    function value_187 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getRIOpenCededReserves().withClaim(claim).withCostType(CostType.TC_CLAIMCOST).withRIAgreement(reinsuranceAgreement).Amount
    }
    
    // 'value' attribute on CurrencyCell (id=ExpensesNetPaidFooter) at ReinsuranceAgreementDetails.pcf: line 322, column 95
    function value_190 () : gw.api.financials.CurrencyAmount {
      return getRIExpenses(gw.api.financials.FinancialsCalculations.getNetPayments())
    }
    
    // 'value' attribute on CurrencyCell (id=ExpensesOpenReservesFooter) at ReinsuranceAgreementDetails.pcf: line 327, column 96
    function value_192 () : gw.api.financials.CurrencyAmount {
      return getRIExpenses(gw.api.financials.FinancialsCalculations.getOpenReserves())
    }
    
    // 'value' attribute on CurrencyCell (id=ExpensesPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 332, column 117
    function value_194 () : gw.api.financials.CurrencyAmount {
      return getRIExpenses(gw.api.financials.FinancialsCalculations.getRITotalRecoverablesNonAdjustments())
    }
    
    // 'value' attribute on CurrencyCell (id=ExpensesAdjustedPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 338, column 48
    function value_197 () : gw.api.financials.CurrencyAmount {
      return getRIExpenses(gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments())
    }
    
    // 'value' attribute on CurrencyCell (id=ExpensesTotalPaymentRecoverableFooter) at ReinsuranceAgreementDetails.pcf: line 344, column 48
    function value_200 () : gw.api.financials.CurrencyAmount {
      return getRIExpenses(gw.api.financials.FinancialsCalculations.getRITotalRecoverables())
    }
    
    // 'value' attribute on CurrencyCell (id=ExpensesCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 349, column 118
    function value_202 () : gw.api.financials.CurrencyAmount {
      return getRIExpenses(gw.api.financials.FinancialsCalculations.getRITotalCededReservesNonAdjustments())
    }
    
    // 'value' attribute on CurrencyCell (id=ExpensesAdjustedCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 355, column 48
    function value_205 () : gw.api.financials.CurrencyAmount {
      return getRIExpenses(gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments())
    }
    
    // 'value' attribute on CurrencyCell (id=ExpensesTotalCededReservesFooter) at ReinsuranceAgreementDetails.pcf: line 361, column 48
    function value_208 () : gw.api.financials.CurrencyAmount {
      return getRIExpenses(gw.api.financials.FinancialsCalculations.getRIOpenCededReserves())
    }
    
    // 'cancelVisible' attribute on EditButtons (id=EditButtons) at ReinsuranceAgreementDetails.pcf: line 31, column 29
    function visible_1 () : java.lang.Boolean {
      return perm.System.riedit
    }
    
    // 'visible' attribute on Row (id=HeaderRow2) at ReinsuranceAgreementDetails.pcf: line 74, column 45
    function visible_29 () : java.lang.Boolean {
      return shouldShowAdjustments()
    }
    
    // 'visible' attribute on ToolbarButton (id=DeleteButton) at ReinsuranceAgreementDetails.pcf: line 37, column 119
    function visible_4 () : java.lang.Boolean {
      return (not CurrentLocation.InEditMode) and perm.System.riedit and reinsuranceAgreement.isUserDeletable
    }
    
    // 'visible' attribute on Toolbar at ReinsuranceAgreementDetails.pcf: line 27, column 58
    function visible_7 () : java.lang.Boolean {
      return not gw.api.print.PrintUtil.PrintingPDF
    }
    
    override property get CurrentLocation () : pcf.ReinsuranceAgreementDetails {
      return super.CurrentLocation as pcf.ReinsuranceAgreementDetails
    }
    
    property get beforeCommitAction () : block() {
      return getVariableValue("beforeCommitAction", 0) as block()
    }
    
    property set beforeCommitAction ($arg :  block()) {
      setVariableValue("beforeCommitAction", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get reinsuranceAgreement () : RIAgreement {
      return getVariableValue("reinsuranceAgreement", 0) as RIAgreement
    }
    
    property set reinsuranceAgreement ($arg :  RIAgreement) {
      setVariableValue("reinsuranceAgreement", 0, $arg)
    }
    
    
    
    function ensureInEditMode() {
      if(!CurrentLocation.InEditMode) {
        CurrentLocation.startEditing()
      }
    }
    
    function detailsRows() : RIAgreementDetailsRow[] {
      return RIAgreementDetailsRow.createRows(reinsuranceAgreement)
    }
    
    /**
     * Expenses calculations are simply the payments for the exposures claim minus the claim cost.  However, to get the correct indication that there are or are not 
     * applicable transactions, it makes sense to sum up the various expenses.  I wanted to be sure that we get the correct amount, so I've built a check against
     * the simple calculation
     */
    function getRIExpenses(calculation : FinancialsCalculator) : CurrencyAmount {
      var val = calculation.withClaim(claim).withCostType(CostType.TC_AOEXPENSE).withRIAgreement(reinsuranceAgreement).Amount
      val = add(val, calculation.withCostType(CostType.TC_DCCEXPENSE).Amount)
      val = add(val, calculation.withCostType(CostType.TC_UNSPECIFIED).Amount)
    
      calculation.clear()
      var agreementTotal = calculation.withClaim(claim).withRIAgreement(reinsuranceAgreement).Amount
      var claimCostAmount = calculation.withCostType(CostType.TC_CLAIMCOST).Amount
      var confirmVal = subtract(agreementTotal, claimCostAmount)
      if (val == null and confirmVal != null and !confirmVal.Amount.IsZero) {
        return confirmVal
      } else if (val != null and confirmVal != null and val.Amount.compareTo(confirmVal) != 0) {
        return confirmVal
      }
      return val
    }
    
    /**
     * Expenses calculations are simply the payments for the exposures claim minus the claim cost.  However, to get the correct indication that there are or are not 
     * applicable transactions, it makes sense to sum up the various expenses.  I wanted to be sure that we get the correct amount, so I've built a check against
     * the simple calculation
     */
    function getExpenses(calculation : FinancialsCalculator) : CurrencyAmount {
      var val = calculation.withClaim(claim).withCostType(CostType.TC_AOEXPENSE).Amount
      val = add(val, calculation.withCostType(CostType.TC_DCCEXPENSE).Amount)
      val = add(val, calculation.withCostType(CostType.TC_UNSPECIFIED).Amount)
    
      calculation.clear()
      var total = calculation.withClaim(claim).withRIAgreementGroup(reinsuranceAgreement.RIAgreementGroup).Amount
      var claimCostTotal = calculation.withCostType(CostType.TC_CLAIMCOST).Amount
      var confirmVal = subtract(total, claimCostTotal)
      if (val == null and confirmVal != null and !confirmVal.Amount.IsZero) {
        return confirmVal
      } else if (val != null and confirmVal != null and val.Amount.compareTo(confirmVal) != 0) {
        return confirmVal
      }
      return val
    }
    
    function shouldShowAdjustments() : Boolean {
      var recoverablesAdj = gw.api.financials.FinancialsCalculations.getRITotalRecoverablesAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).Amount
      var cededResAdj = gw.api.financials.FinancialsCalculations.getRITotalCededReservesAdjustments().withClaim(claim).withRIAgreement(reinsuranceAgreement).Amount
      return (recoverablesAdj != null and !recoverablesAdj.Amount.IsZero)
             or
             (cededResAdj != null and !cededResAdj.Amount.IsZero)
    }
    
    function getExposures() : Exposure[] {
      return reinsuranceAgreement.RIAgreementGroup.Exposures;
    }
    function subtract(start : CurrencyAmount, amount : CurrencyAmount) : CurrencyAmount {
      if (amount != null) {
        return add(start, amount.negateStrict())
      }
      return start
    }
    
    function add(start : CurrencyAmount, amount : CurrencyAmount) : CurrencyAmount {
      if (start == null) {
        return amount
      }
      if (amount != null) {
        return start.addStrict(amount)
      }
      return start
    }
    
    function deleteAgreementAndGroupIfLastAgreement() {
      reinsuranceAgreement.delete()
      claim.setReinsuranceNotificationIfGrossTotalIncurredOverThreshold()
    }
    
    function createNewAgreementGroup() {
      claim.addToRIAgreementGroups( new RIAgreementGroup() )
    }
    
    function removeOrVerifyNewAgreementGroups( agreement : RIAgreement ) {
      for (group in claim.RIAgreementGroups) {
        if (group.New and group != agreement.RIAgreementGroup) {
          group.deleteIfNecessary()
        } else if (group.New and group == agreement.RIAgreementGroup
                   and group.Exposures.length == 0) {
          throw new gw.api.util.DisplayableException(
            DisplayKey.get("Java.Financials.Exception.NoExposuresOnRIAgreementGroup",  group.DisplayName ))
        }
      }
    }
    
    
  }
  
  
}