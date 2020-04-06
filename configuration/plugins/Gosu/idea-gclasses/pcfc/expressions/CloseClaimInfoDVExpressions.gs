package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/CloseClaimInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CloseClaimInfoDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/CloseClaimInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloseClaimInfoDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at CloseClaimInfoDV.pcf: line 19, column 38
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      CloseClaimInfo.note = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Outcome) at CloseClaimInfoDV.pcf: line 25, column 53
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      CloseClaimInfo.outcome = (__VALUE_TO_SET as typekey.ClaimClosedOutcomeType)
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at CloseClaimInfoDV.pcf: line 19, column 38
    function valueRoot_3 () : java.lang.Object {
      return CloseClaimInfo
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at CloseClaimInfoDV.pcf: line 19, column 38
    function value_0 () : java.lang.String {
      return CloseClaimInfo.note
    }
    
    // 'value' attribute on TypeKeyInput (id=Outcome) at CloseClaimInfoDV.pcf: line 25, column 53
    function value_4 () : typekey.ClaimClosedOutcomeType {
      return CloseClaimInfo.outcome
    }
    
    property get CloseClaimInfo () : CloseClaimInfo {
      return getRequireValue("CloseClaimInfo", 0) as CloseClaimInfo
    }
    
    property set CloseClaimInfo ($arg :  CloseClaimInfo) {
      setRequireValue("CloseClaimInfo", 0, $arg)
    }
    
    
  }
  
  
}