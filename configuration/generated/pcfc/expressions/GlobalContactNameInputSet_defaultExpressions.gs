package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/name/GlobalContactNameInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GlobalContactNameInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/name/GlobalContactNameInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlobalContactNameInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on TextInput (id=Name) at GlobalContactNameInputSet.default.pcf: line 22, column 44
    function available_1 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.NP_NAME)
    }
    
    // 'value' attribute on TextInput (id=Name) at GlobalContactNameInputSet.default.pcf: line 22, column 44
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.ContactName.Name  = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextInput (id=Name) at GlobalContactNameInputSet.default.pcf: line 22, column 44
    function editable_2 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.NP_NAME)
    }
    
    // 'initialValue' attribute on Variable at GlobalContactNameInputSet.default.pcf: line 15, column 23
    function initialValue_0 () : boolean {
      nameOwner.InEditMode = CurrentLocation.InEditMode; return 0 as boolean
    }
    
    // 'label' attribute on TextInput (id=Name) at GlobalContactNameInputSet.default.pcf: line 22, column 44
    function label_3 () : java.lang.Object {
      return nameOwner.ContactNameLabel
    }
    
    // 'required' attribute on TextInput (id=Name) at GlobalContactNameInputSet.default.pcf: line 22, column 44
    function required_8 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.NP_NAME)
    }
    
    // 'value' attribute on TextInput (id=Name) at GlobalContactNameInputSet.default.pcf: line 22, column 44
    function valueRoot_11 () : java.lang.Object {
      return nameOwner.ContactName
    }
    
    // 'value' attribute on TextInput (id=Name) at GlobalContactNameInputSet.default.pcf: line 22, column 44
    function value_4 () : java.lang.String {
      return nameOwner.ContactName.Name 
    }
    
    property get nameOwner () : gw.api.name.NameOwner {
      return getRequireValue("nameOwner", 0) as gw.api.name.NameOwner
    }
    
    property set nameOwner ($arg :  gw.api.name.NameOwner) {
      setRequireValue("nameOwner", 0, $arg)
    }
    
    property get saveEditMode () : boolean {
      return getVariableValue("saveEditMode", 0) as java.lang.Boolean
    }
    
    property set saveEditMode ($arg :  boolean) {
      setVariableValue("saveEditMode", 0, $arg)
    }
    
    
  }
  
  
}