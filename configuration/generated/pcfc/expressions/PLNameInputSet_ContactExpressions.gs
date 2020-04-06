package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/name/PLNameInputSet.Contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PLNameInputSet_ContactExpressions {
  @javax.annotation.Generated("config/web/pcf/name/PLNameInputSet.Contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PLNameInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at PLNameInputSet.Contact.pcf: line 13, column 54
    function def_onEnter_0 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(nameOwner)
    }
    
    // 'def' attribute on InputSetRef at PLNameInputSet.Contact.pcf: line 13, column 54
    function def_onEnter_2 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(nameOwner)
    }
    
    // 'def' attribute on InputSetRef at PLNameInputSet.Contact.pcf: line 13, column 54
    function def_refreshVariables_1 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(nameOwner)
    }
    
    // 'def' attribute on InputSetRef at PLNameInputSet.Contact.pcf: line 13, column 54
    function def_refreshVariables_3 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(nameOwner)
    }
    
    // 'mode' attribute on InputSetRef at PLNameInputSet.Contact.pcf: line 13, column 54
    function mode_4 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    property get nameOwner () : gw.api.name.NameOwner {
      return getRequireValue("nameOwner", 0) as gw.api.name.NameOwner
    }
    
    property set nameOwner ($arg :  gw.api.name.NameOwner) {
      setRequireValue("nameOwner", 0, $arg)
    }
    
    
  }
  
  
}