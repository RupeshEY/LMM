package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/NameInputSet.Contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NameInputSet_ContactExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/NameInputSet.Contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at NameInputSet.Contact.pcf: line 13, column 54
    function def_onEnter_0 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.AddressSearchNameOwner(searchCriteria))
    }
    
    // 'def' attribute on InputSetRef at NameInputSet.Contact.pcf: line 13, column 54
    function def_onEnter_2 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.AddressSearchNameOwner(searchCriteria))
    }
    
    // 'def' attribute on InputSetRef at NameInputSet.Contact.pcf: line 13, column 54
    function def_refreshVariables_1 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.AddressSearchNameOwner(searchCriteria))
    }
    
    // 'def' attribute on InputSetRef at NameInputSet.Contact.pcf: line 13, column 54
    function def_refreshVariables_3 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.AddressSearchNameOwner(searchCriteria))
    }
    
    // 'mode' attribute on InputSetRef at NameInputSet.Contact.pcf: line 13, column 54
    function mode_4 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    property get searchCriteria () : ContactSearchCriteria {
      return getRequireValue("searchCriteria", 0) as ContactSearchCriteria
    }
    
    property set searchCriteria ($arg :  ContactSearchCriteria) {
      setRequireValue("searchCriteria", 0, $arg)
    }
    
    
  }
  
  
}