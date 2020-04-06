package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/ReopenClaimInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReopenClaimInfoDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/ReopenClaimInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenClaimInfoDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at ReopenClaimInfoDV.pcf: line 18, column 39
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReopenClaimInfo.note = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Reason) at ReopenClaimInfoDV.pcf: line 24, column 50
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReopenClaimInfo.reopenReason = (__VALUE_TO_SET as typekey.ClaimReopenedReason)
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at ReopenClaimInfoDV.pcf: line 18, column 39
    function valueRoot_3 () : java.lang.Object {
      return ReopenClaimInfo
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at ReopenClaimInfoDV.pcf: line 18, column 39
    function value_0 () : java.lang.String {
      return ReopenClaimInfo.note
    }
    
    // 'value' attribute on TypeKeyInput (id=Reason) at ReopenClaimInfoDV.pcf: line 24, column 50
    function value_4 () : typekey.ClaimReopenedReason {
      return ReopenClaimInfo.reopenReason
    }
    
    property get ReopenClaimInfo () : ReopenClaimInfo {
      return getRequireValue("ReopenClaimInfo", 0) as ReopenClaimInfo
    }
    
    property set ReopenClaimInfo ($arg :  ReopenClaimInfo) {
      setRequireValue("ReopenClaimInfo", 0, $arg)
    }
    
    
  }
  
  
}