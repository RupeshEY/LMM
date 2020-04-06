package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CovTermPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CovTermPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (CovTermParam :  CovTerm, EditMode :  Boolean) : int {
      return 1
    }
    
    static function __constructorIndex (Coverage :  Coverage, CovTermType :  typekey.CovTerm, EditMode :  Boolean) : int {
      return 0
    }
    
    // 'def' attribute on InputSetRef (id=CovTermTypeDetailsInputSet) at CovTermPopup.pcf: line 68, column 81
    function def_onEnter_21 (def :  pcf.CovTermTypeDetailsInputSet_Classification) : void {
      def.onEnter(CovTerm)
    }
    
    // 'def' attribute on InputSetRef (id=CovTermTypeDetailsInputSet) at CovTermPopup.pcf: line 68, column 81
    function def_onEnter_23 (def :  pcf.CovTermTypeDetailsInputSet_Financial) : void {
      def.onEnter(CovTerm)
    }
    
    // 'def' attribute on InputSetRef (id=CovTermTypeDetailsInputSet) at CovTermPopup.pcf: line 68, column 81
    function def_onEnter_25 (def :  pcf.CovTermTypeDetailsInputSet_Numeric) : void {
      def.onEnter(CovTerm)
    }
    
    // 'def' attribute on InputSetRef (id=CovTermTypeDetailsInputSet) at CovTermPopup.pcf: line 68, column 81
    function def_refreshVariables_22 (def :  pcf.CovTermTypeDetailsInputSet_Classification) : void {
      def.refreshVariables(CovTerm)
    }
    
    // 'def' attribute on InputSetRef (id=CovTermTypeDetailsInputSet) at CovTermPopup.pcf: line 68, column 81
    function def_refreshVariables_24 (def :  pcf.CovTermTypeDetailsInputSet_Financial) : void {
      def.refreshVariables(CovTerm)
    }
    
    // 'def' attribute on InputSetRef (id=CovTermTypeDetailsInputSet) at CovTermPopup.pcf: line 68, column 81
    function def_refreshVariables_26 (def :  pcf.CovTermTypeDetailsInputSet_Numeric) : void {
      def.refreshVariables(CovTerm)
    }
    
    // 'value' attribute on TypeKeyInput (id=ModelRestriction) at CovTermPopup.pcf: line 50, column 51
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      CovTerm.ModelRestriction = (__VALUE_TO_SET as typekey.CovTermModelRest)
    }
    
    // 'value' attribute on TypeKeyInput (id=ModelAggregation) at CovTermPopup.pcf: line 56, column 50
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      CovTerm.ModelAggregation = (__VALUE_TO_SET as typekey.CovTermModelAgg)
    }
    
    // 'value' attribute on RangeInput (id=CovTermPattern) at CovTermPopup.pcf: line 44, column 49
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      CovTerm.CovTermPattern = (__VALUE_TO_SET as typekey.CovTermPattern)
    }
    
    // 'initialValue' attribute on Variable at CovTermPopup.pcf: line 30, column 30
    function initialValue_0 () : entity.CovTerm {
      return CovTermParam != null ? CovTermParam : Coverage.createAndAddNewCovTerm(CovTermType)
    }
    
    // EditButtons at CovTermPopup.pcf: line 34, column 52
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on InputSetRef (id=CovTermTypeDetailsInputSet) at CovTermPopup.pcf: line 68, column 81
    function mode_27 () : java.lang.Object {
      return CovTerm.Subtype.Code.toString().remove("CovTerm")
    }
    
    // 'startInEditMode' attribute on Popup (id=CovTermPopup) at CovTermPopup.pcf: line 10, column 65
    function startInEditMode_28 () : java.lang.Boolean {
      return EditMode
    }
    
    // 'valueRange' attribute on RangeInput (id=CovTermPattern) at CovTermPopup.pcf: line 44, column 49
    function valueRange_7 () : java.lang.Object {
      return CovTermPattern.getTypeKeys(false).where(\ c -> c.Categories.contains(CovTerm.Coverage.Type))
    }
    
    // 'value' attribute on RangeInput (id=CovTermPattern) at CovTermPopup.pcf: line 44, column 49
    function valueRoot_6 () : java.lang.Object {
      return CovTerm
    }
    
    // 'value' attribute on TypeKeyInput (id=ModelRestriction) at CovTermPopup.pcf: line 50, column 51
    function value_10 () : typekey.CovTermModelRest {
      return CovTerm.ModelRestriction
    }
    
    // 'value' attribute on TypeKeyInput (id=ModelAggregation) at CovTermPopup.pcf: line 56, column 50
    function value_14 () : typekey.CovTermModelAgg {
      return CovTerm.ModelAggregation
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at CovTermPopup.pcf: line 63, column 42
    function value_18 () : typekey.CovTerm {
      return CovTerm.Subtype
    }
    
    // 'value' attribute on RangeInput (id=CovTermPattern) at CovTermPopup.pcf: line 44, column 49
    function value_3 () : typekey.CovTermPattern {
      return CovTerm.CovTermPattern
    }
    
    // 'valueRange' attribute on RangeInput (id=CovTermPattern) at CovTermPopup.pcf: line 44, column 49
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=CovTermPattern) at CovTermPopup.pcf: line 44, column 49
    function verifyValueRangeIsAllowedType_8 ($$arg :  typekey.CovTermPattern[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=CovTermPattern) at CovTermPopup.pcf: line 44, column 49
    function verifyValueRange_9 () : void {
      var __valueRangeArg = CovTermPattern.getTypeKeys(false).where(\ c -> c.Categories.contains(CovTerm.Coverage.Type))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'editVisible' attribute on EditButtons at CovTermPopup.pcf: line 34, column 52
    function visible_1 () : java.lang.Boolean {
      return !Coverage.Policy.Verified
    }
    
    property get CovTerm () : entity.CovTerm {
      return getVariableValue("CovTerm", 0) as entity.CovTerm
    }
    
    property set CovTerm ($arg :  entity.CovTerm) {
      setVariableValue("CovTerm", 0, $arg)
    }
    
    property get CovTermParam () : CovTerm {
      return getVariableValue("CovTermParam", 0) as CovTerm
    }
    
    property set CovTermParam ($arg :  CovTerm) {
      setVariableValue("CovTermParam", 0, $arg)
    }
    
    property get CovTermType () : typekey.CovTerm {
      return getVariableValue("CovTermType", 0) as typekey.CovTerm
    }
    
    property set CovTermType ($arg :  typekey.CovTerm) {
      setVariableValue("CovTermType", 0, $arg)
    }
    
    property get Coverage () : Coverage {
      return getVariableValue("Coverage", 0) as Coverage
    }
    
    property set Coverage ($arg :  Coverage) {
      setVariableValue("Coverage", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.CovTermPopup {
      return super.CurrentLocation as pcf.CovTermPopup
    }
    
    property get EditMode () : Boolean {
      return getVariableValue("EditMode", 0) as Boolean
    }
    
    property set EditMode ($arg :  Boolean) {
      setVariableValue("EditMode", 0, $arg)
    }
    
    
  }
  
  
}