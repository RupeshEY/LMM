package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/name/GlobalPersonNameInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GlobalPersonNameInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/name/GlobalPersonNameInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlobalPersonNameInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.default.pcf: line 37, column 78
    function available_16 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.FIRSTNAME)
    }
    
    // 'available' attribute on TextInput (id=MiddleName) at GlobalPersonNameInputSet.default.pcf: line 45, column 79
    function available_29 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.MIDDLENAME)
    }
    
    // 'available' attribute on TextInput (id=Particle) at GlobalPersonNameInputSet.default.pcf: line 53, column 154
    function available_40 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.PARTICLE)
    }
    
    // 'available' attribute on TypeKeyInput (id=Prefix) at GlobalPersonNameInputSet.default.pcf: line 29, column 75
    function available_5 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.PREFIX)
    }
    
    // 'available' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.default.pcf: line 61, column 77
    function available_51 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.LASTNAME)
    }
    
    // 'available' attribute on TypeKeyInput (id=Suffix) at GlobalPersonNameInputSet.default.pcf: line 70, column 75
    function available_64 () : java.lang.Boolean {
      return nameOwner.isAvailable(gw.api.name.NameOwnerFieldId.SUFFIX)
    }
    
    // 'value' attribute on TypeKeyInput (id=Prefix) at GlobalPersonNameInputSet.default.pcf: line 29, column 75
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.PersonName.Prefix = (__VALUE_TO_SET as typekey.NamePrefix)
    }
    
    // 'value' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.default.pcf: line 37, column 78
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.PersonName.FirstName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=MiddleName) at GlobalPersonNameInputSet.default.pcf: line 45, column 79
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.PersonName.MiddleName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Particle) at GlobalPersonNameInputSet.default.pcf: line 53, column 154
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.PersonName.Particle = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.default.pcf: line 61, column 77
    function defaultSetter_62 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.PersonName.LastName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Suffix) at GlobalPersonNameInputSet.default.pcf: line 70, column 75
    function defaultSetter_73 (__VALUE_TO_SET :  java.lang.Object) : void {
      nameOwner.PersonName.Suffix = (__VALUE_TO_SET as typekey.NameSuffix)
    }
    
    // 'editable' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.default.pcf: line 37, column 78
    function editable_17 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.FIRSTNAME)
    }
    
    // 'editable' attribute on TextInput (id=MiddleName) at GlobalPersonNameInputSet.default.pcf: line 45, column 79
    function editable_30 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.MIDDLENAME)
    }
    
    // 'editable' attribute on TextInput (id=Particle) at GlobalPersonNameInputSet.default.pcf: line 53, column 154
    function editable_41 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.PARTICLE)
    }
    
    // 'editable' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.default.pcf: line 61, column 77
    function editable_52 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.LASTNAME)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Prefix) at GlobalPersonNameInputSet.default.pcf: line 29, column 75
    function editable_6 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.PREFIX)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Suffix) at GlobalPersonNameInputSet.default.pcf: line 70, column 75
    function editable_65 () : java.lang.Boolean {
      return nameOwner.isEditable(gw.api.name.NameOwnerFieldId.SUFFIX)
    }
    
    // 'initialValue' attribute on Variable at GlobalPersonNameInputSet.default.pcf: line 15, column 23
    function initialValue_0 () : boolean {
      nameOwner.InEditMode = CurrentLocation.InEditMode; return 0 as boolean
    }
    
    // 'label' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.default.pcf: line 37, column 78
    function label_19 () : java.lang.Object {
      return nameOwner.FirstNameLabel
    }
    
    // 'label' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.default.pcf: line 61, column 77
    function label_54 () : java.lang.Object {
      return nameOwner.LastNameLabel
    }
    
    // 'required' attribute on TypeKeyInput (id=Prefix) at GlobalPersonNameInputSet.default.pcf: line 29, column 75
    function required_12 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.PREFIX)
    }
    
    // 'required' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.default.pcf: line 37, column 78
    function required_25 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.FIRSTNAME)
    }
    
    // 'required' attribute on TextInput (id=MiddleName) at GlobalPersonNameInputSet.default.pcf: line 45, column 79
    function required_36 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.MIDDLENAME)
    }
    
    // 'required' attribute on TextInput (id=Particle) at GlobalPersonNameInputSet.default.pcf: line 53, column 154
    function required_47 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.PARTICLE)
    }
    
    // 'required' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.default.pcf: line 61, column 77
    function required_60 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.LASTNAME)
    }
    
    // 'required' attribute on TypeKeyInput (id=Suffix) at GlobalPersonNameInputSet.default.pcf: line 70, column 75
    function required_71 () : java.lang.Boolean {
      return nameOwner.isRequired(gw.api.name.NameOwnerFieldId.SUFFIX)
    }
    
    // 'value' attribute on TypeKeyInput (id=Prefix) at GlobalPersonNameInputSet.default.pcf: line 29, column 75
    function valueRoot_15 () : java.lang.Object {
      return nameOwner.PersonName
    }
    
    // 'value' attribute on TextInput (id=NameSummary) at GlobalPersonNameInputSet.default.pcf: line 20, column 44
    function value_2 () : java.lang.String {
      return new gw.api.name.NameFormatter().format(nameOwner.PersonName, " ")
    }
    
    // 'value' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.default.pcf: line 37, column 78
    function value_20 () : java.lang.String {
      return nameOwner.PersonName.FirstName
    }
    
    // 'value' attribute on TextInput (id=MiddleName) at GlobalPersonNameInputSet.default.pcf: line 45, column 79
    function value_32 () : java.lang.String {
      return nameOwner.PersonName.MiddleName
    }
    
    // 'value' attribute on TextInput (id=Particle) at GlobalPersonNameInputSet.default.pcf: line 53, column 154
    function value_43 () : java.lang.String {
      return nameOwner.PersonName.Particle
    }
    
    // 'value' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.default.pcf: line 61, column 77
    function value_55 () : java.lang.String {
      return nameOwner.PersonName.LastName
    }
    
    // 'value' attribute on TypeKeyInput (id=Suffix) at GlobalPersonNameInputSet.default.pcf: line 70, column 75
    function value_67 () : typekey.NameSuffix {
      return nameOwner.PersonName.Suffix
    }
    
    // 'value' attribute on TypeKeyInput (id=Prefix) at GlobalPersonNameInputSet.default.pcf: line 29, column 75
    function value_8 () : typekey.NamePrefix {
      return nameOwner.PersonName.Prefix
    }
    
    // 'visible' attribute on TextInput (id=NameSummary) at GlobalPersonNameInputSet.default.pcf: line 20, column 44
    function visible_1 () : java.lang.Boolean {
      return nameOwner.ShowNameSummary
    }
    
    // 'visible' attribute on TextInput (id=FirstName) at GlobalPersonNameInputSet.default.pcf: line 37, column 78
    function visible_18 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.FIRSTNAME)
    }
    
    // 'visible' attribute on TextInput (id=MiddleName) at GlobalPersonNameInputSet.default.pcf: line 45, column 79
    function visible_31 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.MIDDLENAME)
    }
    
    // 'visible' attribute on TextInput (id=Particle) at GlobalPersonNameInputSet.default.pcf: line 53, column 154
    function visible_42 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.PARTICLE) or (CurrentLocation.InEditMode and nameOwner.PersonName.Particle.HasContent)
    }
    
    // 'visible' attribute on TextInput (id=LastName) at GlobalPersonNameInputSet.default.pcf: line 61, column 77
    function visible_53 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.LASTNAME)
    }
    
    // 'visible' attribute on TypeKeyInput (id=Suffix) at GlobalPersonNameInputSet.default.pcf: line 70, column 75
    function visible_66 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.SUFFIX)
    }
    
    // 'visible' attribute on TypeKeyInput (id=Prefix) at GlobalPersonNameInputSet.default.pcf: line 29, column 75
    function visible_7 () : java.lang.Boolean {
      return nameOwner.isVisible(gw.api.name.NameOwnerFieldId.PREFIX)
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