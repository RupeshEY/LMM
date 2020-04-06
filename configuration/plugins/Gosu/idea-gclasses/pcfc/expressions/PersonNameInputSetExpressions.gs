package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/PersonNameInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PersonNameInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/PersonNameInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PersonNameInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at PersonNameInputSet.pcf: line 23, column 54
    function def_onEnter_1 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandlePersonNameDelegate(contactHandle)))
    }
    
    // 'def' attribute on InputSetRef at PersonNameInputSet.pcf: line 23, column 54
    function def_onEnter_3 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandlePersonNameDelegate(contactHandle)))
    }
    
    // 'def' attribute on InputSetRef at PersonNameInputSet.pcf: line 23, column 54
    function def_refreshVariables_2 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandlePersonNameDelegate(contactHandle)))
    }
    
    // 'def' attribute on InputSetRef at PersonNameInputSet.pcf: line 23, column 54
    function def_refreshVariables_4 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandlePersonNameDelegate(contactHandle)))
    }
    
    // 'value' attribute on TextInput (id=FormerName) at PersonNameInputSet.pcf: line 31, column 36
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.FormerName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'label' attribute on Label at PersonNameInputSet.pcf: line 20, column 48
    function label_0 () : java.lang.String {
      return Person.getSubtype().DisplayName
    }
    
    // 'mode' attribute on InputSetRef at PersonNameInputSet.pcf: line 23, column 54
    function mode_5 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'value' attribute on TextInput (id=FormerName) at PersonNameInputSet.pcf: line 31, column 36
    function valueRoot_9 () : java.lang.Object {
      return Person
    }
    
    // 'value' attribute on TextInput (id=FormerName) at PersonNameInputSet.pcf: line 31, column 36
    function value_6 () : java.lang.String {
      return Person.FormerName
    }
    
    // 'visible' attribute on InputSet at PersonNameInputSet.pcf: line 25, column 45
    function visible_10 () : java.lang.Boolean {
      return Person.Subtype == TC_PERSON
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
          property get Person() : Person { return contactHandle.Contact as Person; }
        
    
    
  }
  
  
}