package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/icd/ICDDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ICDDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/icd/ICDDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=ICD_Code) at ICDDV.pcf: line 27, column 29
    function action_4 () : void {
      ICD10Data.push( anICD.CodeTrimmed )
    }
    
    // 'action' attribute on TextInput (id=ICD_Code) at ICDDV.pcf: line 27, column 29
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ICD10Data.createDestination( anICD.CodeTrimmed )
    }
    
    // 'value' attribute on TextInput (id=Description) at ICDDV.pcf: line 32, column 33
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      anICD.CodeDesc = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Body_System) at ICDDV.pcf: line 38, column 44
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      anICD.BodySystem = (__VALUE_TO_SET as typekey.ICDBodySystem)
    }
    
    // 'value' attribute on CheckBoxInput (id=Chronic) at ICDDV.pcf: line 45, column 32
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      anICD.Chronic = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=Available_Date) at ICDDV.pcf: line 53, column 41
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      anICD.AvailabilityDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=End_Date) at ICDDV.pcf: line 60, column 35
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      anICD.ExpiryDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=ICD_Code) at ICDDV.pcf: line 27, column 29
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      anICD.Code = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextInput (id=ICD_Code) at ICDDV.pcf: line 27, column 29
    function editable_1 () : java.lang.Boolean {
      return anICD.Code == null or perm.System.editrefdata
    }
    
    // 'initialValue' attribute on Variable at ICDDV.pcf: line 18, column 19
    function initialValue_0 () : int {
      return isNew == true? 0 : 1
    }
    
    // 'requestValidationExpression' attribute on TextInput (id=ICD_Code) at ICDDV.pcf: line 27, column 29
    function requestValidationExpression_6 (VALUE :  java.lang.String) : java.lang.Object {
      return gw.api.database.Query.make(entity.ICDCode).compare("Code", Equals, VALUE).select().Count > threshold ? DisplayKey.get("Web.Admin.ICD.ICDCode.DuplicateValidation") : null
    }
    
    // 'validationExpression' attribute on DateInput (id=Available_Date) at ICDDV.pcf: line 53, column 41
    function validationExpression_22 () : java.lang.Object {
      return anICD.AvailabilityDate > anICD.ExpiryDate ? DisplayKey.get("Web.Admin.ICD.AvailableFrom.Validation") : null
    }
    
    // 'value' attribute on TextInput (id=ICD_Code) at ICDDV.pcf: line 27, column 29
    function valueRoot_9 () : java.lang.Object {
      return anICD
    }
    
    // 'value' attribute on TextInput (id=Description) at ICDDV.pcf: line 32, column 33
    function value_10 () : java.lang.String {
      return anICD.CodeDesc
    }
    
    // 'value' attribute on TypeKeyInput (id=Body_System) at ICDDV.pcf: line 38, column 44
    function value_14 () : typekey.ICDBodySystem {
      return anICD.BodySystem
    }
    
    // 'value' attribute on CheckBoxInput (id=Chronic) at ICDDV.pcf: line 45, column 32
    function value_18 () : java.lang.Boolean {
      return anICD.Chronic
    }
    
    // 'value' attribute on TextInput (id=ICD_Code) at ICDDV.pcf: line 27, column 29
    function value_2 () : java.lang.String {
      return anICD.Code
    }
    
    // 'value' attribute on DateInput (id=Available_Date) at ICDDV.pcf: line 53, column 41
    function value_23 () : java.util.Date {
      return anICD.AvailabilityDate
    }
    
    // 'value' attribute on DateInput (id=End_Date) at ICDDV.pcf: line 60, column 35
    function value_28 () : java.util.Date {
      return anICD.ExpiryDate
    }
    
    property get anICD () : ICDCode {
      return getRequireValue("anICD", 0) as ICDCode
    }
    
    property set anICD ($arg :  ICDCode) {
      setRequireValue("anICD", 0, $arg)
    }
    
    property get isNew () : boolean {
      return getRequireValue("isNew", 0) as java.lang.Boolean
    }
    
    property set isNew ($arg :  boolean) {
      setRequireValue("isNew", 0, $arg)
    }
    
    property get threshold () : int {
      return getVariableValue("threshold", 0) as java.lang.Integer
    }
    
    property set threshold ($arg :  int) {
      setVariableValue("threshold", 0, $arg)
    }
    
    
  }
  
  
}