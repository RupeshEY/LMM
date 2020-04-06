package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPersonNameInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookPersonNameInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPersonNameInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookPersonNameInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AddressBookPersonNameInputSet.pcf: line 14, column 54
    function def_onEnter_1 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.PersonNameDelegate(person)))
    }
    
    // 'def' attribute on InputSetRef at AddressBookPersonNameInputSet.pcf: line 14, column 54
    function def_onEnter_3 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.PersonNameDelegate(person)))
    }
    
    // 'def' attribute on InputSetRef at AddressBookPersonNameInputSet.pcf: line 14, column 54
    function def_refreshVariables_2 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.PersonNameDelegate(person)))
    }
    
    // 'def' attribute on InputSetRef at AddressBookPersonNameInputSet.pcf: line 14, column 54
    function def_refreshVariables_4 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.PersonNameDelegate(person)))
    }
    
    // 'value' attribute on TextInput (id=FormerName) at AddressBookPersonNameInputSet.pcf: line 22, column 36
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.FormerName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'label' attribute on Label at AddressBookPersonNameInputSet.pcf: line 11, column 48
    function label_0 () : java.lang.String {
      return person.getSubtype().DisplayName
    }
    
    // 'mode' attribute on InputSetRef at AddressBookPersonNameInputSet.pcf: line 14, column 54
    function mode_5 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'value' attribute on TextInput (id=FormerName) at AddressBookPersonNameInputSet.pcf: line 22, column 36
    function valueRoot_9 () : java.lang.Object {
      return person
    }
    
    // 'value' attribute on TextInput (id=FormerName) at AddressBookPersonNameInputSet.pcf: line 22, column 36
    function value_6 () : java.lang.String {
      return person.FormerName
    }
    
    // 'visible' attribute on InputSet at AddressBookPersonNameInputSet.pcf: line 16, column 45
    function visible_10 () : java.lang.Boolean {
      return person.Subtype == TC_PERSON
    }
    
    property get person () : Person {
      return getRequireValue("person", 0) as Person
    }
    
    property set person ($arg :  Person) {
      setRequireValue("person", 0, $arg)
    }
    
    
  }
  
  
}