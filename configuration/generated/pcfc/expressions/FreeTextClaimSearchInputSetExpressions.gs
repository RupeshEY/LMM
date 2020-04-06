package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FreeTextClaimSearchInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FreeTextClaimSearchInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Phone) at FreeTextClaimSearchInputSet.pcf: line 34, column 55
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.NameCriteria.Phone = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Address) at FreeTextClaimSearchInputSet.pcf: line 40, column 65
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.AddressCriteria.AddressLine1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=City) at FreeTextClaimSearchInputSet.pcf: line 46, column 57
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.AddressCriteria.City = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Role) at FreeTextClaimSearchInputSet.pcf: line 22, column 53
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.FreeTextNameSearchType = (__VALUE_TO_SET as typekey.FreTxtClmSrchNameSrchTyp)
    }
    
    // 'value' attribute on TextInput (id=FullName) at FreeTextClaimSearchInputSet.pcf: line 27, column 54
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.NameCriteria.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'requestValidationExpression' attribute on TextInput (id=Phone) at FreeTextClaimSearchInputSet.pcf: line 34, column 55
    function requestValidationExpression_9 (VALUE :  java.lang.String) : java.lang.Object {
      return gw.api.util.PhoneUtil.isViableNumberWithExtension(VALUE) ? null : DisplayKey.get("JSP.ClaimSearch.Search.Phone.Invalid", VALUE)
    }
    
    // 'value' attribute on TextInput (id=Address) at FreeTextClaimSearchInputSet.pcf: line 40, column 65
    function valueRoot_16 () : java.lang.Object {
      return ClaimSearchCriteria.AddressCriteria
    }
    
    // 'value' attribute on TypeKeyInput (id=Role) at FreeTextClaimSearchInputSet.pcf: line 22, column 53
    function valueRoot_3 () : java.lang.Object {
      return ClaimSearchCriteria
    }
    
    // 'value' attribute on TextInput (id=FullName) at FreeTextClaimSearchInputSet.pcf: line 27, column 54
    function valueRoot_7 () : java.lang.Object {
      return ClaimSearchCriteria.NameCriteria
    }
    
    // 'value' attribute on TypeKeyInput (id=Role) at FreeTextClaimSearchInputSet.pcf: line 22, column 53
    function value_0 () : typekey.FreTxtClmSrchNameSrchTyp {
      return ClaimSearchCriteria.FreeTextNameSearchType
    }
    
    // 'value' attribute on TextInput (id=Address) at FreeTextClaimSearchInputSet.pcf: line 40, column 65
    function value_13 () : java.lang.String {
      return ClaimSearchCriteria.AddressCriteria.AddressLine1
    }
    
    // 'value' attribute on TextInput (id=City) at FreeTextClaimSearchInputSet.pcf: line 46, column 57
    function value_17 () : java.lang.String {
      return ClaimSearchCriteria.AddressCriteria.City
    }
    
    // 'value' attribute on TextInput (id=FullName) at FreeTextClaimSearchInputSet.pcf: line 27, column 54
    function value_4 () : java.lang.String {
      return ClaimSearchCriteria.NameCriteria.Name
    }
    
    // 'value' attribute on TextInput (id=Phone) at FreeTextClaimSearchInputSet.pcf: line 34, column 55
    function value_8 () : java.lang.String {
      return ClaimSearchCriteria.NameCriteria.Phone
    }
    
    property get ClaimSearchCriteria () : ClaimSearchCriteria {
      return getRequireValue("ClaimSearchCriteria", 0) as ClaimSearchCriteria
    }
    
    property set ClaimSearchCriteria ($arg :  ClaimSearchCriteria) {
      setRequireValue("ClaimSearchCriteria", 0, $arg)
    }
    
    property get searchType () : String {
      return getVariableValue("searchType", 0) as String
    }
    
    property set searchType ($arg :  String) {
      setVariableValue("searchType", 0, $arg)
    }
    
    
  }
  
  
}