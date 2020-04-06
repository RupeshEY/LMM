package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EndorsementDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EndorsementDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/EndorsementDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndorsementDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateInput (id=EffectiveDate) at EndorsementDetailDV.pcf: line 29, column 44
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Endorsement.EffectiveDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=ExpirationDate) at EndorsementDetailDV.pcf: line 35, column 45
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Endorsement.ExpirationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=Comments) at EndorsementDetailDV.pcf: line 41, column 39
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      Endorsement.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=FormNumber) at EndorsementDetailDV.pcf: line 17, column 41
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Endorsement.FormNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Description) at EndorsementDetailDV.pcf: line 23, column 42
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Endorsement.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=FormNumber) at EndorsementDetailDV.pcf: line 17, column 41
    function valueRoot_3 () : java.lang.Object {
      return Endorsement
    }
    
    // 'value' attribute on TextInput (id=FormNumber) at EndorsementDetailDV.pcf: line 17, column 41
    function value_0 () : java.lang.String {
      return Endorsement.FormNumber
    }
    
    // 'value' attribute on DateInput (id=ExpirationDate) at EndorsementDetailDV.pcf: line 35, column 45
    function value_12 () : java.util.Date {
      return Endorsement.ExpirationDate
    }
    
    // 'value' attribute on TextInput (id=Comments) at EndorsementDetailDV.pcf: line 41, column 39
    function value_16 () : java.lang.String {
      return Endorsement.Comments
    }
    
    // 'value' attribute on TextInput (id=Description) at EndorsementDetailDV.pcf: line 23, column 42
    function value_4 () : java.lang.String {
      return Endorsement.Description
    }
    
    // 'value' attribute on DateInput (id=EffectiveDate) at EndorsementDetailDV.pcf: line 29, column 44
    function value_8 () : java.util.Date {
      return Endorsement.EffectiveDate
    }
    
    property get Endorsement () : Endorsement {
      return getRequireValue("Endorsement", 0) as Endorsement
    }
    
    property set Endorsement ($arg :  Endorsement) {
      setRequireValue("Endorsement", 0, $arg)
    }
    
    
  }
  
  
}