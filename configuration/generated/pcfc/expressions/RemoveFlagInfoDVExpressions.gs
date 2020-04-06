package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/summary/RemoveFlagInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RemoveFlagInfoDVExpressions {
  @javax.annotation.Generated("config/web/pcf/team/summary/RemoveFlagInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RemoveFlagInfoDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at RemoveFlagInfoDV.pcf: line 49, column 38
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      removeFlagInfo.note = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at RemoveFlagInfoDV.pcf: line 49, column 38
    function valueRoot_19 () : java.lang.Object {
      return removeFlagInfo
    }
    
    // 'value' attribute on TextInput (id=Claim) at RemoveFlagInfoDV.pcf: line 22, column 34
    function valueRoot_4 () : java.lang.Object {
      return claim
    }
    
    // 'value' attribute on TextInput (id=Claim) at RemoveFlagInfoDV.pcf: line 22, column 34
    function value_1 () : java.lang.String {
      return claim.ClaimNumber
    }
    
    // 'value' attribute on DateInput (id=FlaggedDate) at RemoveFlagInfoDV.pcf: line 34, column 36
    function value_10 () : java.util.Date {
      return claim.FlaggedDate
    }
    
    // 'value' attribute on TextAreaInput (id=FlaggedReason) at RemoveFlagInfoDV.pcf: line 41, column 38
    function value_13 () : java.lang.String {
      return claim.FlaggedReason
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at RemoveFlagInfoDV.pcf: line 49, column 38
    function value_16 () : java.lang.String {
      return removeFlagInfo.note
    }
    
    // 'value' attribute on TextInput (id=Insured) at RemoveFlagInfoDV.pcf: line 29, column 34
    function value_6 () : entity.Contact {
      return claim.Insured
    }
    
    // 'visible' attribute on TextInput (id=Claim) at RemoveFlagInfoDV.pcf: line 22, column 34
    function visible_0 () : java.lang.Boolean {
      return viaTeamScreen
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get removeFlagInfo () : RemoveFlagInfo {
      return getRequireValue("removeFlagInfo", 0) as RemoveFlagInfo
    }
    
    property set removeFlagInfo ($arg :  RemoveFlagInfo) {
      setRequireValue("removeFlagInfo", 0, $arg)
    }
    
    property get viaTeamScreen () : boolean {
      return getRequireValue("viaTeamScreen", 0) as java.lang.Boolean
    }
    
    property set viaTeamScreen ($arg :  boolean) {
      setRequireValue("viaTeamScreen", 0, $arg)
    }
    
    
  }
  
  
}