package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LeadContactDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LeadContactDetailsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LeadContactDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LeadContactDetailsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Email) at LeadContactDetailsInputSet.pcf: line 39, column 75
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ContactEmail = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=PersonName) at LeadContactDetailsInputSet.pcf: line 20, column 44
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ContactName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Telephone) at LeadContactDetailsInputSet.pcf: line 29, column 49
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ContactTelephone = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'regex' attribute on TextInput (id=Email) at LeadContactDetailsInputSet.pcf: line 39, column 75
    function regex_15 () : java.lang.String {
      return gw.acc.iplm.validation.util.ECFValidationConstants.EMAIL_REGEX
    }
    
    // 'regex' attribute on TextInput (id=Telephone) at LeadContactDetailsInputSet.pcf: line 29, column 49
    function regex_8 () : java.lang.String {
      return gw.acc.iplm.validation.util.ECFValidationConstants.PHONE_REGEX
    }
    
    // 'value' attribute on TextInput (id=PersonName) at LeadContactDetailsInputSet.pcf: line 20, column 44
    function valueRoot_3 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on TextInput (id=PersonName) at LeadContactDetailsInputSet.pcf: line 20, column 44
    function value_0 () : java.lang.String {
      return claimResponseRq.ContactName
    }
    
    // 'value' attribute on TextInput (id=Email) at LeadContactDetailsInputSet.pcf: line 39, column 75
    function value_10 () : java.lang.String {
      return claimResponseRq.ContactEmail
    }
    
    // 'value' attribute on TextInput (id=Telephone) at LeadContactDetailsInputSet.pcf: line 29, column 49
    function value_4 () : java.lang.String {
      return claimResponseRq.ContactTelephone
    }
    
    // 'visible' attribute on TextInput (id=Email) at LeadContactDetailsInputSet.pcf: line 39, column 75
    function visible_9 () : java.lang.Boolean {
      return claimResponseRq.BureauType != ECFBureauType_Ext.TC_LIRMA
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("claimResponseRq", 0, $arg)
    }
    
    
  }
  
  
}