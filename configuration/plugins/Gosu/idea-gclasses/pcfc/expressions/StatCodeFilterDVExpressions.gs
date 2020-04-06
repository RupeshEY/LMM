package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/policy/StatCodeFilterDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StatCodeFilterDVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/policy/StatCodeFilterDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatCodeFilterDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at StatCodeFilterDV.pcf: line 73, column 37
    function def_onEnter_49 (def :  pcf.SearchOnlyInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at StatCodeFilterDV.pcf: line 73, column 37
    function def_refreshVariables_50 (def :  pcf.SearchOnlyInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on RangeInput (id=InsuranceSubLine) at StatCodeFilterDV.pcf: line 35, column 47
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      FilterCriteria.InsuranceSubLine = (__VALUE_TO_SET as typekey.InsuranceSubLine)
    }
    
    // 'value' attribute on RangeInput (id=LineNumber) at StatCodeFilterDV.pcf: line 19, column 40
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      FilterCriteria.LineNumber = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on RangeInput (id=LocationNumber) at StatCodeFilterDV.pcf: line 43, column 39
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      FilterCriteria.LocationNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=BuildingNumber) at StatCodeFilterDV.pcf: line 53, column 39
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      FilterCriteria.BuildingNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=VehicleNumber) at StatCodeFilterDV.pcf: line 61, column 39
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      FilterCriteria.VehicleNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=ClassCode) at StatCodeFilterDV.pcf: line 69, column 39
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      FilterCriteria.ClassCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=InsuranceLine) at StatCodeFilterDV.pcf: line 27, column 44
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      FilterCriteria.InsuranceLine = (__VALUE_TO_SET as typekey.InsuranceLine)
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuranceLine) at StatCodeFilterDV.pcf: line 27, column 44
    function valueRange_11 () : java.lang.Object {
      return FilterCriteria.getStatCodeValueRange("InsuranceLine")
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuranceSubLine) at StatCodeFilterDV.pcf: line 35, column 47
    function valueRange_18 () : java.lang.Object {
      return FilterCriteria.getStatCodeValueRange("InsuranceSubLine")
    }
    
    // 'valueRange' attribute on RangeInput (id=LocationNumber) at StatCodeFilterDV.pcf: line 43, column 39
    function valueRange_25 () : java.lang.Object {
      return FilterCriteria.getStatCodeValueRange("LocationNumber")
    }
    
    // 'valueRange' attribute on RangeInput (id=BuildingNumber) at StatCodeFilterDV.pcf: line 53, column 39
    function valueRange_32 () : java.lang.Object {
      return FilterCriteria.getStatCodeValueRange("BuildingNumber")
    }
    
    // 'valueRange' attribute on RangeInput (id=VehicleNumber) at StatCodeFilterDV.pcf: line 61, column 39
    function valueRange_39 () : java.lang.Object {
      return FilterCriteria.getStatCodeValueRange("VehicleNumber")
    }
    
    // 'valueRange' attribute on RangeInput (id=LineNumber) at StatCodeFilterDV.pcf: line 19, column 40
    function valueRange_4 () : java.lang.Object {
      return FilterCriteria.getStatCodeValueRange("LineNumber")
    }
    
    // 'valueRange' attribute on RangeInput (id=ClassCode) at StatCodeFilterDV.pcf: line 69, column 39
    function valueRange_46 () : java.lang.Object {
      return FilterCriteria.getStatCodeValueRange("ClassCode")
    }
    
    // 'value' attribute on RangeInput (id=LineNumber) at StatCodeFilterDV.pcf: line 19, column 40
    function valueRoot_3 () : java.lang.Object {
      return FilterCriteria
    }
    
    // 'value' attribute on RangeInput (id=LineNumber) at StatCodeFilterDV.pcf: line 19, column 40
    function value_0 () : java.lang.Integer {
      return FilterCriteria.LineNumber
    }
    
    // 'value' attribute on RangeInput (id=InsuranceSubLine) at StatCodeFilterDV.pcf: line 35, column 47
    function value_14 () : typekey.InsuranceSubLine {
      return FilterCriteria.InsuranceSubLine
    }
    
    // 'value' attribute on RangeInput (id=LocationNumber) at StatCodeFilterDV.pcf: line 43, column 39
    function value_21 () : java.lang.String {
      return FilterCriteria.LocationNumber
    }
    
    // 'value' attribute on RangeInput (id=BuildingNumber) at StatCodeFilterDV.pcf: line 53, column 39
    function value_28 () : java.lang.String {
      return FilterCriteria.BuildingNumber
    }
    
    // 'value' attribute on RangeInput (id=VehicleNumber) at StatCodeFilterDV.pcf: line 61, column 39
    function value_35 () : java.lang.String {
      return FilterCriteria.VehicleNumber
    }
    
    // 'value' attribute on RangeInput (id=ClassCode) at StatCodeFilterDV.pcf: line 69, column 39
    function value_42 () : java.lang.String {
      return FilterCriteria.ClassCode
    }
    
    // 'value' attribute on RangeInput (id=InsuranceLine) at StatCodeFilterDV.pcf: line 27, column 44
    function value_7 () : typekey.InsuranceLine {
      return FilterCriteria.InsuranceLine
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuranceLine) at StatCodeFilterDV.pcf: line 27, column 44
    function verifyValueRangeIsAllowedType_12 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuranceLine) at StatCodeFilterDV.pcf: line 27, column 44
    function verifyValueRangeIsAllowedType_12 ($$arg :  typekey.InsuranceLine[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuranceSubLine) at StatCodeFilterDV.pcf: line 35, column 47
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuranceSubLine) at StatCodeFilterDV.pcf: line 35, column 47
    function verifyValueRangeIsAllowedType_19 ($$arg :  typekey.InsuranceSubLine[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=LocationNumber) at StatCodeFilterDV.pcf: line 43, column 39
    function verifyValueRangeIsAllowedType_26 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=LocationNumber) at StatCodeFilterDV.pcf: line 43, column 39
    function verifyValueRangeIsAllowedType_26 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=BuildingNumber) at StatCodeFilterDV.pcf: line 53, column 39
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=BuildingNumber) at StatCodeFilterDV.pcf: line 53, column 39
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=VehicleNumber) at StatCodeFilterDV.pcf: line 61, column 39
    function verifyValueRangeIsAllowedType_40 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=VehicleNumber) at StatCodeFilterDV.pcf: line 61, column 39
    function verifyValueRangeIsAllowedType_40 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClassCode) at StatCodeFilterDV.pcf: line 69, column 39
    function verifyValueRangeIsAllowedType_47 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClassCode) at StatCodeFilterDV.pcf: line 69, column 39
    function verifyValueRangeIsAllowedType_47 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=LineNumber) at StatCodeFilterDV.pcf: line 19, column 40
    function verifyValueRangeIsAllowedType_5 ($$arg :  java.lang.Integer[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=LineNumber) at StatCodeFilterDV.pcf: line 19, column 40
    function verifyValueRangeIsAllowedType_5 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuranceLine) at StatCodeFilterDV.pcf: line 27, column 44
    function verifyValueRange_13 () : void {
      var __valueRangeArg = FilterCriteria.getStatCodeValueRange("InsuranceLine")
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_12(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuranceSubLine) at StatCodeFilterDV.pcf: line 35, column 47
    function verifyValueRange_20 () : void {
      var __valueRangeArg = FilterCriteria.getStatCodeValueRange("InsuranceSubLine")
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=LocationNumber) at StatCodeFilterDV.pcf: line 43, column 39
    function verifyValueRange_27 () : void {
      var __valueRangeArg = FilterCriteria.getStatCodeValueRange("LocationNumber")
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_26(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=BuildingNumber) at StatCodeFilterDV.pcf: line 53, column 39
    function verifyValueRange_34 () : void {
      var __valueRangeArg = FilterCriteria.getStatCodeValueRange("BuildingNumber")
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_33(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=VehicleNumber) at StatCodeFilterDV.pcf: line 61, column 39
    function verifyValueRange_41 () : void {
      var __valueRangeArg = FilterCriteria.getStatCodeValueRange("VehicleNumber")
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_40(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ClassCode) at StatCodeFilterDV.pcf: line 69, column 39
    function verifyValueRange_48 () : void {
      var __valueRangeArg = FilterCriteria.getStatCodeValueRange("ClassCode")
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_47(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=LineNumber) at StatCodeFilterDV.pcf: line 19, column 40
    function verifyValueRange_6 () : void {
      var __valueRangeArg = FilterCriteria.getStatCodeValueRange("LineNumber")
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_5(__valueRangeArg)
    }
    
    property get FilterCriteria () : PolicyStatCodeFilterCriteria {
      return getRequireValue("FilterCriteria", 0) as PolicyStatCodeFilterCriteria
    }
    
    property set FilterCriteria ($arg :  PolicyStatCodeFilterCriteria) {
      setRequireValue("FilterCriteria", 0, $arg)
    }
    
    
  }
  
  
}