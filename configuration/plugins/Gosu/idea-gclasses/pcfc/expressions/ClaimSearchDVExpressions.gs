package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchDV.pcf: line 31, column 65
    function def_onEnter_10 (def :  pcf.ClaimSearchRequiredInputSet) : void {
      def.onEnter(ClaimSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchDV.pcf: line 35, column 65
    function def_onEnter_12 (def :  pcf.ClaimSearchOptionalInputSet) : void {
      def.onEnter(ClaimSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchDV.pcf: line 39, column 46
    function def_onEnter_14 (def :  pcf.ClaimSearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchDV.pcf: line 31, column 65
    function def_refreshVariables_11 (def :  pcf.ClaimSearchRequiredInputSet) : void {
      def.refreshVariables(ClaimSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchDV.pcf: line 35, column 65
    function def_refreshVariables_13 (def :  pcf.ClaimSearchOptionalInputSet) : void {
      def.refreshVariables(ClaimSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchDV.pcf: line 39, column 46
    function def_refreshVariables_15 (def :  pcf.ClaimSearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on RangeInput (id=ClaimSearchType) at ClaimSearchDV.pcf: line 23, column 40
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.ClaimSearchType = (__VALUE_TO_SET as typekey.ClaimSearchType)
    }
    
    // 'onChange' attribute on PostOnChange at ClaimSearchDV.pcf: line 25, column 64
    function onChange_0 () : void {
      gw.api.util.SearchUtil.resetResultOnly()
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimSearchType) at ClaimSearchDV.pcf: line 23, column 40
    function valueRange_7 () : java.lang.Object {
      return gw.api.claim.ClaimUtil.getAvailableClaimSearchTypes()
    }
    
    // 'value' attribute on RangeInput (id=ClaimSearchType) at ClaimSearchDV.pcf: line 23, column 40
    function valueRoot_6 () : java.lang.Object {
      return ClaimSearchCriteria
    }
    
    // 'value' attribute on RangeInput (id=ClaimSearchType) at ClaimSearchDV.pcf: line 23, column 40
    function value_2 () : typekey.ClaimSearchType {
      return ClaimSearchCriteria.ClaimSearchType
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimSearchType) at ClaimSearchDV.pcf: line 23, column 40
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimSearchType) at ClaimSearchDV.pcf: line 23, column 40
    function verifyValueRangeIsAllowedType_8 ($$arg :  typekey.ClaimSearchType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimSearchType) at ClaimSearchDV.pcf: line 23, column 40
    function verifyValueRange_9 () : void {
      var __valueRangeArg = gw.api.claim.ClaimUtil.getAvailableClaimSearchTypes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'visible' attribute on RangeInput (id=ClaimSearchType) at ClaimSearchDV.pcf: line 23, column 40
    function visible_1 () : java.lang.Boolean {
      return archiveSearchEnabled
    }
    
    property get ClaimSearchCriteria () : ClaimSearchCriteria {
      return getRequireValue("ClaimSearchCriteria", 0) as ClaimSearchCriteria
    }
    
    property set ClaimSearchCriteria ($arg :  ClaimSearchCriteria) {
      setRequireValue("ClaimSearchCriteria", 0, $arg)
    }
    
    property get archiveSearchEnabled () : boolean {
      return getRequireValue("archiveSearchEnabled", 0) as java.lang.Boolean
    }
    
    property set archiveSearchEnabled ($arg :  boolean) {
      setRequireValue("archiveSearchEnabled", 0, $arg)
    }
    
    
  }
  
  
}