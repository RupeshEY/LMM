package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/name/GlobalPersonNameInputSet.Japan.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GlobalPersonNameInputSet_JapanExpressions {
  @javax.annotation.Generated("config/web/pcf/name/GlobalPersonNameInputSet.Japan.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlobalPersonNameInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.Japan.pcf: line 36, column 78
    function available_18 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.FIRSTNAME)
    }
    
    // 'available' attribute on TextInput (id=LastNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 44, column 82
    function available_31 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.LASTNAMEKANJI)
    }
    
    // 'available' attribute on TextInput (id=FirstNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 52, column 83
    function available_44 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.FIRSTNAMEKANJI)
    }
    
    // 'available' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.Japan.pcf: line 28, column 77
    function available_5 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.LASTNAME)
    }
    
    // 'value' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.Japan.pcf: line 28, column 77
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.PersonName.LastName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.Japan.pcf: line 36, column 78
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.PersonName.FirstName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=LastNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 44, column 82
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.PersonName.LastNameKanji = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=FirstNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 52, column 83
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.PersonName.FirstNameKanji = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.Japan.pcf: line 36, column 78
    function editable_19 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.FIRSTNAME)
    }
    
    // 'editable' attribute on TextInput (id=LastNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 44, column 82
    function editable_32 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.LASTNAMEKANJI)
    }
    
    // 'editable' attribute on TextInput (id=FirstNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 52, column 83
    function editable_45 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.FIRSTNAMEKANJI)
    }
    
    // 'editable' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.Japan.pcf: line 28, column 77
    function editable_6 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.LASTNAME)
    }
    
    // 'initialValue' attribute on Variable at GlobalPersonNameInputSet.Japan.pcf: line 15, column 23
    function initialValue_0 () : boolean {
      nameOwner.InEditMode = CurrentLocation.InEditMode; return 0 as boolean
    }
    
    // 'label' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.Japan.pcf: line 36, column 78
    function label_21 () : java.lang.Object {
      return nameOwner.FirstNamePhoneticLabel
    }
    
    // 'label' attribute on TextInput (id=LastNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 44, column 82
    function label_34 () : java.lang.Object {
      return nameOwner.LastNameLabel
    }
    
    // 'label' attribute on TextInput (id=FirstNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 52, column 83
    function label_47 () : java.lang.Object {
      return nameOwner.FirstNameLabel
    }
    
    // 'label' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.Japan.pcf: line 28, column 77
    function label_8 () : java.lang.Object {
      return nameOwner.LastNamePhoneticLabel
    }
    
    // 'required' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.Japan.pcf: line 28, column 77
    function required_14 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.LASTNAME)
    }
    
    // 'required' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.Japan.pcf: line 36, column 78
    function required_27 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.FIRSTNAME)
    }
    
    // 'required' attribute on TextInput (id=LastNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 44, column 82
    function required_40 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.LASTNAMEKANJI)
    }
    
    // 'required' attribute on TextInput (id=FirstNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 52, column 83
    function required_53 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.FIRSTNAMEKANJI)
    }
    
    // 'value' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.Japan.pcf: line 28, column 77
    function valueRoot_17 () : java.lang.Object {
      return nameOwner.PersonName
    }
    
    // 'value' attribute on TextInput (id=NameSummary) at GlobalPersonNameInputSet.Japan.pcf: line 20, column 44
    function value_2 () : java.lang.String {
      return new gw.api.name.NameFormatter().format(nameOwner.PersonName, " ")
    }
    
    // 'value' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.Japan.pcf: line 36, column 78
    function value_22 () : java.lang.String {
      return nameOwner.PersonName.FirstName
    }
    
    // 'value' attribute on TextInput (id=LastNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 44, column 82
    function value_35 () : java.lang.String {
      return nameOwner.PersonName.LastNameKanji
    }
    
    // 'value' attribute on TextInput (id=FirstNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 52, column 83
    function value_48 () : java.lang.String {
      return nameOwner.PersonName.FirstNameKanji
    }
    
    // 'value' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.Japan.pcf: line 28, column 77
    function value_9 () : java.lang.String {
      return nameOwner.PersonName.LastName
    }
    
    // 'visible' attribute on TextInput (id=NameSummary) at GlobalPersonNameInputSet.Japan.pcf: line 20, column 44
    function visible_1 () : java.lang.Boolean {
      return nameOwner.ShowNameSummary
    }
    
    // 'visible' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.Japan.pcf: line 36, column 78
    function visible_20 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.FIRSTNAME)
    }
    
    // 'visible' attribute on TextInput (id=LastNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 44, column 82
    function visible_33 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.LASTNAMEKANJI)
    }
    
    // 'visible' attribute on TextInput (id=FirstNameKanji) at GlobalPersonNameInputSet.Japan.pcf: line 52, column 83
    function visible_46 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.FIRSTNAMEKANJI)
    }
    
    // 'visible' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.Japan.pcf: line 28, column 77
    function visible_7 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.LASTNAME)
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