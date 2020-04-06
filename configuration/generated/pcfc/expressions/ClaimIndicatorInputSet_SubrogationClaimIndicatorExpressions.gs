package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.SubrogationClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimIndicatorInputSet_SubrogationClaimIndicatorExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.SubrogationClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimIndicatorInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=SubrogationStatus) at ClaimIndicatorInputSet.SubrogationClaimIndicator.pcf: line 17, column 46
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      indicator.Claim.SubrogationStatus = (__VALUE_TO_SET as typekey.SubrogationStatus)
    }
    
    // 'editable' attribute on TypeKeyInput (id=SubrogationStatus) at ClaimIndicatorInputSet.SubrogationClaimIndicator.pcf: line 17, column 46
    function editable_0 () : java.lang.Boolean {
      return indicator.Claim.SubrogationStatus == null
    }
    
    // 'filter' attribute on TypeKeyInput (id=SubrogationStatus) at ClaimIndicatorInputSet.SubrogationClaimIndicator.pcf: line 17, column 46
    function filter_6 (VALUE :  typekey.SubrogationStatus, VALUES :  typekey.SubrogationStatus[]) : java.util.List<typekey.SubrogationStatus> {
      return VALUES.where(\status -> status == TC_OPEN or status == TC_REVIEW).toList()
    }
    
    // 'value' attribute on TypeKeyInput (id=SubrogationStatus) at ClaimIndicatorInputSet.SubrogationClaimIndicator.pcf: line 17, column 46
    function valueRoot_5 () : java.lang.Object {
      return indicator.Claim
    }
    
    // 'value' attribute on TypeKeyInput (id=SubrogationStatus) at ClaimIndicatorInputSet.SubrogationClaimIndicator.pcf: line 17, column 46
    function value_1 () : typekey.SubrogationStatus {
      return indicator.Claim.SubrogationStatus
    }
    
    property get indicator () : ClaimIndicator {
      return getRequireValue("indicator", 0) as ClaimIndicator
    }
    
    property set indicator ($arg :  ClaimIndicator) {
      setRequireValue("indicator", 0, $arg)
    }
    
    
  }
  
  
}