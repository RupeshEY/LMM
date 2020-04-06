package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCPDBenefitsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WCPDBenefitsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=PD_BenefitStartDate) at WCPDBenefitsLV.pcf: line 41, column 29
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      ref_WC_PD_Benefits.PD_BenefitStartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCell (id=PD_BenefitEndDate) at WCPDBenefitsLV.pcf: line 50, column 29
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      ref_WC_PD_Benefits.PD_BenefitEndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextCell (id=Min_DisabilityPercent) at WCPDBenefitsLV.pcf: line 60, column 29
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      ref_WC_PD_Benefits.Min_DisabilityPercent = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextCell (id=Max_DisabilityPercent) at WCPDBenefitsLV.pcf: line 70, column 29
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      ref_WC_PD_Benefits.Max_DisabilityPercent = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextCell (id=PD_MinBenefit) at WCPDBenefitsLV.pcf: line 80, column 29
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      ref_WC_PD_Benefits.PD_MinBenefit = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextCell (id=PD_MaxBenefit) at WCPDBenefitsLV.pcf: line 90, column 29
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      ref_WC_PD_Benefits.PD_MaxBenefit = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TypeKeyCell (id=JurisdictionState) at WCPDBenefitsLV.pcf: line 32, column 29
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      ref_WC_PD_Benefits.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'filter' attribute on TypeKeyCell (id=JurisdictionState) at WCPDBenefitsLV.pcf: line 32, column 29
    function filter_11 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'validationExpression' attribute on DateCell (id=PD_BenefitStartDate) at WCPDBenefitsLV.pcf: line 41, column 29
    function validationExpression_12 () : java.lang.Object {
      return (ref_WC_PD_Benefits.PD_BenefitStartDate > ref_WC_PD_Benefits.PD_BenefitEndDate ? DisplayKey.get("Rules.Validation.Admin.EffDateGTExpiryDate") : null)
    }
    
    // 'validationExpression' attribute on TextCell (id=Min_DisabilityPercent) at WCPDBenefitsLV.pcf: line 60, column 29
    function validationExpression_24 () : java.lang.Object {
      return (  ref_WC_PD_Benefits.Min_DisabilityPercent > ref_WC_PD_Benefits.Max_DisabilityPercent   ? DisplayKey.get("Rules.Validation.Admin.MaxLTMin"): null)
    }
    
    // 'validationExpression' attribute on TextCell (id=PD_MinBenefit) at WCPDBenefitsLV.pcf: line 80, column 29
    function validationExpression_36 () : java.lang.Object {
      return (  ref_WC_PD_Benefits.PD_MinBenefit > ref_WC_PD_Benefits.PD_MaxBenefit  ? DisplayKey.get("Rules.Validation.Admin.MaxLTMin"): null)
    }
    
    // 'validationExpression' attribute on TextCell (id=PD_MaxBenefit) at WCPDBenefitsLV.pcf: line 90, column 29
    function validationExpression_42 () : java.lang.Object {
      return (ref_WC_PD_Benefits.PD_MinBenefit > ref_WC_PD_Benefits.PD_MaxBenefit  ? DisplayKey.get("Rules.Validation.Admin.MaxLTMin"): null)
    }
    
    // 'value' attribute on TypeKeyCell (id=JurisdictionState) at WCPDBenefitsLV.pcf: line 32, column 29
    function valueRoot_10 () : java.lang.Object {
      return ref_WC_PD_Benefits
    }
    
    // 'value' attribute on DateCell (id=PD_BenefitStartDate) at WCPDBenefitsLV.pcf: line 41, column 29
    function value_13 () : java.util.Date {
      return ref_WC_PD_Benefits.PD_BenefitStartDate
    }
    
    // 'value' attribute on DateCell (id=PD_BenefitEndDate) at WCPDBenefitsLV.pcf: line 50, column 29
    function value_19 () : java.util.Date {
      return ref_WC_PD_Benefits.PD_BenefitEndDate
    }
    
    // 'value' attribute on TextCell (id=Min_DisabilityPercent) at WCPDBenefitsLV.pcf: line 60, column 29
    function value_25 () : java.math.BigDecimal {
      return ref_WC_PD_Benefits.Min_DisabilityPercent
    }
    
    // 'value' attribute on TextCell (id=Max_DisabilityPercent) at WCPDBenefitsLV.pcf: line 70, column 29
    function value_31 () : java.math.BigDecimal {
      return ref_WC_PD_Benefits.Max_DisabilityPercent
    }
    
    // 'value' attribute on TextCell (id=PD_MinBenefit) at WCPDBenefitsLV.pcf: line 80, column 29
    function value_37 () : java.math.BigDecimal {
      return ref_WC_PD_Benefits.PD_MinBenefit
    }
    
    // 'value' attribute on TextCell (id=PD_MaxBenefit) at WCPDBenefitsLV.pcf: line 90, column 29
    function value_43 () : java.math.BigDecimal {
      return ref_WC_PD_Benefits.PD_MaxBenefit
    }
    
    // 'value' attribute on TypeKeyCell (id=JurisdictionState) at WCPDBenefitsLV.pcf: line 32, column 29
    function value_7 () : typekey.Jurisdiction {
      return ref_WC_PD_Benefits.JurisdictionState
    }
    
    property get ref_WC_PD_Benefits () : entity.ref_WC_PD_benefits {
      return getIteratedValue(1) as entity.ref_WC_PD_benefits
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/wcparms/WCPDBenefitsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCPDBenefitsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at WCPDBenefitsLV.pcf: line 32, column 29
    function sortValue_0 (ref_WC_PD_Benefits :  entity.ref_WC_PD_benefits) : java.lang.Object {
      return ref_WC_PD_Benefits.JurisdictionState
    }
    
    // 'value' attribute on RowIterator at WCPDBenefitsLV.pcf: line 41, column 29
    function sortValue_1 (ref_WC_PD_Benefits :  entity.ref_WC_PD_benefits) : java.lang.Object {
      return ref_WC_PD_Benefits.PD_BenefitStartDate
    }
    
    // 'value' attribute on RowIterator at WCPDBenefitsLV.pcf: line 50, column 29
    function sortValue_2 (ref_WC_PD_Benefits :  entity.ref_WC_PD_benefits) : java.lang.Object {
      return ref_WC_PD_Benefits.PD_BenefitEndDate
    }
    
    // 'value' attribute on RowIterator at WCPDBenefitsLV.pcf: line 60, column 29
    function sortValue_3 (ref_WC_PD_Benefits :  entity.ref_WC_PD_benefits) : java.lang.Object {
      return ref_WC_PD_Benefits.Min_DisabilityPercent
    }
    
    // 'value' attribute on RowIterator at WCPDBenefitsLV.pcf: line 70, column 29
    function sortValue_4 (ref_WC_PD_Benefits :  entity.ref_WC_PD_benefits) : java.lang.Object {
      return ref_WC_PD_Benefits.Max_DisabilityPercent
    }
    
    // 'value' attribute on RowIterator at WCPDBenefitsLV.pcf: line 80, column 29
    function sortValue_5 (ref_WC_PD_Benefits :  entity.ref_WC_PD_benefits) : java.lang.Object {
      return ref_WC_PD_Benefits.PD_MinBenefit
    }
    
    // 'value' attribute on RowIterator at WCPDBenefitsLV.pcf: line 90, column 29
    function sortValue_6 (ref_WC_PD_Benefits :  entity.ref_WC_PD_benefits) : java.lang.Object {
      return ref_WC_PD_Benefits.PD_MaxBenefit
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at WCPDBenefitsLV.pcf: line 21, column 85
    function toCreateAndAdd_48 () : entity.ref_WC_PD_benefits {
      return new ref_WC_PD_benefits()
    }
    
    // 'toRemove' attribute on RowIterator at WCPDBenefitsLV.pcf: line 21, column 85
    function toRemove_49 (ref_WC_PD_Benefits :  entity.ref_WC_PD_benefits) : void {
      ref_WC_PD_Benefits.remove()
    }
    
    // 'value' attribute on RowIterator at WCPDBenefitsLV.pcf: line 21, column 85
    function value_50 () : gw.api.database.IQueryBeanResult<entity.ref_WC_PD_benefits> {
      return ref_WC_PD_BenefitsList
    }
    
    property get ref_WC_PD_BenefitsList () : gw.api.database.IQueryBeanResult<ref_WC_PD_benefits> {
      return getRequireValue("ref_WC_PD_BenefitsList", 0) as gw.api.database.IQueryBeanResult<ref_WC_PD_benefits>
    }
    
    property set ref_WC_PD_BenefitsList ($arg :  gw.api.database.IQueryBeanResult<ref_WC_PD_benefits>) {
      setRequireValue("ref_WC_PD_BenefitsList", 0, $arg)
    }
    
    
  }
  
  
}