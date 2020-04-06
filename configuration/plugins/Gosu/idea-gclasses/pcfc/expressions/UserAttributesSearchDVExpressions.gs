package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserAttributesSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAttributesSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at UserAttributesSearchDV.pcf: line 28, column 41
    function def_onEnter_8 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at UserAttributesSearchDV.pcf: line 28, column 41
    function def_refreshVariables_9 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on TextInput (id=Name) at UserAttributesSearchDV.pcf: line 16, column 47
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.AttributeName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at UserAttributesSearchDV.pcf: line 24, column 48
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.AttributeType = (__VALUE_TO_SET as typekey.UserAttributeType)
    }
    
    // 'value' attribute on TextInput (id=Name) at UserAttributesSearchDV.pcf: line 16, column 47
    function valueRoot_3 () : java.lang.Object {
      return SearchCriteria
    }
    
    // 'value' attribute on TextInput (id=Name) at UserAttributesSearchDV.pcf: line 16, column 47
    function value_0 () : java.lang.String {
      return SearchCriteria.AttributeName
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at UserAttributesSearchDV.pcf: line 24, column 48
    function value_4 () : typekey.UserAttributeType {
      return SearchCriteria.AttributeType
    }
    
    property get SearchCriteria () : gw.api.admin.AttributeSearchCriteria {
      return getRequireValue("SearchCriteria", 0) as gw.api.admin.AttributeSearchCriteria
    }
    
    property set SearchCriteria ($arg :  gw.api.admin.AttributeSearchCriteria) {
      setRequireValue("SearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}