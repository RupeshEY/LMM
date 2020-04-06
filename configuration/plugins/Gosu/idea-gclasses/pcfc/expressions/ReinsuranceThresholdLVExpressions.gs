package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReinsuranceThresholdLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReinsuranceThresholdLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowIterator at ReinsuranceThresholdLV.pcf: line 21, column 87
    function checkBoxVisible_37 () : java.lang.Boolean {
      return CurrentLocation.InEditMode ? true : false
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType) at ReinsuranceThresholdLV.pcf: line 40, column 42
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReinsuranceThreshold.PolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'value' attribute on TextCell (id=ThresholdValue) at ReinsuranceThresholdLV.pcf: line 50, column 45
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReinsuranceThreshold.ThresholdValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextCell (id=ReportingThreshold) at ReinsuranceThresholdLV.pcf: line 57, column 42
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReinsuranceThreshold.ReportingThreshold = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on DateCell (id=StartDate) at ReinsuranceThresholdLV.pcf: line 63, column 51
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReinsuranceThreshold.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCell (id=EndDate) at ReinsuranceThresholdLV.pcf: line 70, column 49
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReinsuranceThreshold.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyCell (id=TreatyType) at ReinsuranceThresholdLV.pcf: line 29, column 53
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReinsuranceThreshold.TreatyType = (__VALUE_TO_SET as typekey.ReinsuranceTreatyType)
    }
    
    // 'editable' attribute on TypeKeyCell (id=PolicyType) at ReinsuranceThresholdLV.pcf: line 40, column 42
    function editable_12 () : java.lang.Boolean {
      return ReinsuranceThreshold.TreatyType != null and ReinsuranceThreshold.TreatyType != TC_WC
    }
    
    // 'filter' attribute on TypeKeyCell (id=PolicyType) at ReinsuranceThresholdLV.pcf: line 40, column 42
    function filter_18 (VALUE :  typekey.PolicyType, VALUES :  typekey.PolicyType[]) : java.lang.Boolean {
      if(ReinsuranceThreshold.TreatyType == TC_WC) { return VALUE == TC_WORKERSCOMP } else if (ReinsuranceThreshold.TreatyType == TC_PROP) { return VALUE != TC_WORKERSCOMP } else { return true }
    }
    
    // 'onChange' attribute on PostOnChange at ReinsuranceThresholdLV.pcf: line 42, column 146
    function onChange_11 () : void {
      ReinsuranceThreshold.LossType = gw.api.policy.PolicyTypeUtil.getLossTypeForPolicyType( ReinsuranceThreshold.PolicyType )
    }
    
    // 'onChange' attribute on PostOnChange at ReinsuranceThresholdLV.pcf: line 31, column 161
    function onChange_6 () : void {
      if(ReinsuranceThreshold.TreatyType == TC_WC){ ReinsuranceThreshold.PolicyType = TC_WORKERSCOMP; ReinsuranceThreshold.LossType = TC_WC }
    }
    
    // 'validationExpression' attribute on DateCell (id=EndDate) at ReinsuranceThresholdLV.pcf: line 70, column 49
    function validationExpression_31 () : java.lang.Object {
      return ReinsuranceThreshold.EndDate == null or ReinsuranceThreshold.StartDate == null or (ReinsuranceThreshold.StartDate.compareTo( ReinsuranceThreshold.EndDate ) <= 0) ? null : DisplayKey.get("LV.ReinsuranceThreshold.EndDate.ValidationError")
    }
    
    // 'value' attribute on TypeKeyCell (id=TreatyType) at ReinsuranceThresholdLV.pcf: line 29, column 53
    function valueRoot_10 () : java.lang.Object {
      return ReinsuranceThreshold
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType) at ReinsuranceThresholdLV.pcf: line 40, column 42
    function value_13 () : typekey.PolicyType {
      return ReinsuranceThreshold.PolicyType
    }
    
    // 'value' attribute on TextCell (id=ThresholdValue) at ReinsuranceThresholdLV.pcf: line 50, column 45
    function value_19 () : java.math.BigDecimal {
      return ReinsuranceThreshold.ThresholdValue
    }
    
    // 'value' attribute on TextCell (id=ReportingThreshold) at ReinsuranceThresholdLV.pcf: line 57, column 42
    function value_23 () : java.lang.Integer {
      return ReinsuranceThreshold.ReportingThreshold
    }
    
    // 'value' attribute on DateCell (id=StartDate) at ReinsuranceThresholdLV.pcf: line 63, column 51
    function value_27 () : java.util.Date {
      return ReinsuranceThreshold.StartDate
    }
    
    // 'value' attribute on DateCell (id=EndDate) at ReinsuranceThresholdLV.pcf: line 70, column 49
    function value_32 () : java.util.Date {
      return ReinsuranceThreshold.EndDate
    }
    
    // 'value' attribute on TypeKeyCell (id=TreatyType) at ReinsuranceThresholdLV.pcf: line 29, column 53
    function value_7 () : typekey.ReinsuranceTreatyType {
      return ReinsuranceThreshold.TreatyType
    }
    
    property get ReinsuranceThreshold () : entity.ReinsuranceThreshold {
      return getIteratedValue(1) as entity.ReinsuranceThreshold
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholdLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceThresholdLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ReinsuranceThresholdLV.pcf: line 29, column 53
    function sortValue_0 (ReinsuranceThreshold :  entity.ReinsuranceThreshold) : java.lang.Object {
      return ReinsuranceThreshold.TreatyType
    }
    
    // 'value' attribute on RowIterator at ReinsuranceThresholdLV.pcf: line 40, column 42
    function sortValue_1 (ReinsuranceThreshold :  entity.ReinsuranceThreshold) : java.lang.Object {
      return ReinsuranceThreshold.PolicyType
    }
    
    // 'value' attribute on RowIterator at ReinsuranceThresholdLV.pcf: line 50, column 45
    function sortValue_2 (ReinsuranceThreshold :  entity.ReinsuranceThreshold) : java.lang.Object {
      return ReinsuranceThreshold.ThresholdValue
    }
    
    // 'value' attribute on RowIterator at ReinsuranceThresholdLV.pcf: line 57, column 42
    function sortValue_3 (ReinsuranceThreshold :  entity.ReinsuranceThreshold) : java.lang.Object {
      return ReinsuranceThreshold.ReportingThreshold
    }
    
    // 'value' attribute on RowIterator at ReinsuranceThresholdLV.pcf: line 63, column 51
    function sortValue_4 (ReinsuranceThreshold :  entity.ReinsuranceThreshold) : java.lang.Object {
      return ReinsuranceThreshold.StartDate
    }
    
    // 'value' attribute on RowIterator at ReinsuranceThresholdLV.pcf: line 70, column 49
    function sortValue_5 (ReinsuranceThreshold :  entity.ReinsuranceThreshold) : java.lang.Object {
      return ReinsuranceThreshold.EndDate
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at ReinsuranceThresholdLV.pcf: line 21, column 87
    function toCreateAndAdd_38 () : entity.ReinsuranceThreshold {
      return new ReinsuranceThreshold()
    }
    
    // 'toRemove' attribute on RowIterator at ReinsuranceThresholdLV.pcf: line 21, column 87
    function toRemove_39 (ReinsuranceThreshold :  entity.ReinsuranceThreshold) : void {
      ReinsuranceThreshold.remove()
    }
    
    // 'value' attribute on RowIterator at ReinsuranceThresholdLV.pcf: line 21, column 87
    function value_40 () : gw.api.database.IQueryBeanResult<entity.ReinsuranceThreshold> {
      return ReinsuranceThresholdList
    }
    
    property get ReinsuranceThresholdList () : gw.api.database.IQueryBeanResult<ReinsuranceThreshold> {
      return getRequireValue("ReinsuranceThresholdList", 0) as gw.api.database.IQueryBeanResult<ReinsuranceThreshold>
    }
    
    property set ReinsuranceThresholdList ($arg :  gw.api.database.IQueryBeanResult<ReinsuranceThreshold>) {
      setRequireValue("ReinsuranceThresholdList", 0, $arg)
    }
    
    
  }
  
  
}