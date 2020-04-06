package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZoneDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SecurityZoneDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/securityzones/SecurityZoneDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityZoneDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Name) at SecurityZoneDetailDV.pcf: line 18, column 36
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      SecurityZone.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at SecurityZoneDetailDV.pcf: line 24, column 43
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      SecurityZone.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Name) at SecurityZoneDetailDV.pcf: line 18, column 36
    function valueRoot_3 () : java.lang.Object {
      return SecurityZone
    }
    
    // 'value' attribute on TextInput (id=Name) at SecurityZoneDetailDV.pcf: line 18, column 36
    function value_0 () : java.lang.String {
      return SecurityZone.Name
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at SecurityZoneDetailDV.pcf: line 24, column 43
    function value_4 () : java.lang.String {
      return SecurityZone.Description
    }
    
    property get SecurityZone () : SecurityZone {
      return getRequireValue("SecurityZone", 0) as SecurityZone
    }
    
    property set SecurityZone ($arg :  SecurityZone) {
      setRequireValue("SecurityZone", 0, $arg)
    }
    
    
  }
  
  
}