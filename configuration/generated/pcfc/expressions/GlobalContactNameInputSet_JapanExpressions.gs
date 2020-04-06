package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/name/GlobalContactNameInputSet.Japan.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GlobalContactNameInputSet_JapanExpressions {
  @javax.annotation.Generated("config/web/pcf/name/GlobalContactNameInputSet.Japan.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlobalContactNameInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on TextInput (id=NameKanji) at GlobalContactNameInputSet.Japan.pcf: line 36, column 78
    function available_20 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.NAMEKANJI)
    }
    
    // 'available' attribute on TextInput (id=Name) at GlobalContactNameInputSet.Japan.pcf: line 28, column 76
    function available_7 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.NP_NAME)
    }
    
    // 'value' attribute on TextInput (id=Name) at GlobalContactNameInputSet.Japan.pcf: line 28, column 76
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.ContactName.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=NameKanji) at GlobalContactNameInputSet.Japan.pcf: line 36, column 78
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.ContactName.NameKanji = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextInput (id=NameKanji) at GlobalContactNameInputSet.Japan.pcf: line 36, column 78
    function editable_21 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.NAMEKANJI)
    }
    
    // 'editable' attribute on TextInput (id=Name) at GlobalContactNameInputSet.Japan.pcf: line 28, column 76
    function editable_8 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.NP_NAME)
    }
    
    // 'initialValue' attribute on Variable at GlobalContactNameInputSet.Japan.pcf: line 15, column 23
    function initialValue_0 () : boolean {
      nameOwner.InEditMode = CurrentLocation.InEditMode; return 0 as boolean
    }
    
    // 'label' attribute on TextInput (id=Name) at GlobalContactNameInputSet.Japan.pcf: line 28, column 76
    function label_10 () : java.lang.Object {
      return nameOwner.ContactNamePhoneticLabel
    }
    
    // 'label' attribute on TextInput (id=NameSummary) at GlobalContactNameInputSet.Japan.pcf: line 20, column 44
    function label_2 () : java.lang.Object {
      return nameOwner.ContactNameLabel
    }
    
    // 'required' attribute on TextInput (id=Name) at GlobalContactNameInputSet.Japan.pcf: line 28, column 76
    function required_16 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.NP_NAME)
    }
    
    // 'required' attribute on TextInput (id=NameKanji) at GlobalContactNameInputSet.Japan.pcf: line 36, column 78
    function required_29 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.NAMEKANJI)
    }
    
    // 'value' attribute on TextInput (id=Name) at GlobalContactNameInputSet.Japan.pcf: line 28, column 76
    function valueRoot_19 () : java.lang.Object {
      return nameOwner.ContactName
    }
    
    // 'value' attribute on TextInput (id=Name) at GlobalContactNameInputSet.Japan.pcf: line 28, column 76
    function value_11 () : java.lang.String {
      return nameOwner.ContactName.Name
    }
    
    // 'value' attribute on TextInput (id=NameKanji) at GlobalContactNameInputSet.Japan.pcf: line 36, column 78
    function value_24 () : java.lang.String {
      return nameOwner.ContactName.NameKanji
    }
    
    // 'value' attribute on TextInput (id=NameSummary) at GlobalContactNameInputSet.Japan.pcf: line 20, column 44
    function value_3 () : java.lang.String {
      return nameOwner.ContactName.NameKanji.HasContent ? nameOwner.ContactName.NameKanji : nameOwner.ContactName.Name
    }
    
    // 'visible' attribute on TextInput (id=NameSummary) at GlobalContactNameInputSet.Japan.pcf: line 20, column 44
    function visible_1 () : java.lang.Boolean {
      return nameOwner.ShowNameSummary
    }
    
    // 'visible' attribute on TextInput (id=NameKanji) at GlobalContactNameInputSet.Japan.pcf: line 36, column 78
    function visible_22 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.NAMEKANJI)
    }
    
    // 'visible' attribute on TextInput (id=Name) at GlobalContactNameInputSet.Japan.pcf: line 28, column 76
    function visible_9 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.NP_NAME)
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