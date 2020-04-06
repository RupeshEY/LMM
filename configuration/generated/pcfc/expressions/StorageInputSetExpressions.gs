package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/generalstatus/StorageInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StorageInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/generalstatus/StorageInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StorageInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=StorageCategory) at StorageInputSet.pcf: line 29, column 44
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.StorageCategory = (__VALUE_TO_SET as typekey.StorageCategory)
    }
    
    // 'value' attribute on TypeKeyInput (id=StorageType) at StorageInputSet.pcf: line 35, column 40
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.StorageType = (__VALUE_TO_SET as typekey.StorageType)
    }
    
    // 'value' attribute on TextInput (id=StorageBoxNumber) at StorageInputSet.pcf: line 40, column 36
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.StorageBoxNum = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=DateShippedToStorage) at StorageInputSet.pcf: line 17, column 34
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.StorageDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=StorageBarCodeNumber) at StorageInputSet.pcf: line 45, column 40
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.StorageBarCodeNum = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=StorageVolumes) at StorageInputSet.pcf: line 50, column 37
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.StorageVolumes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=StorageNotes) at StorageInputSet.pcf: line 57, column 35
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.StorageNotes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=StorageLocationState) at StorageInputSet.pcf: line 23, column 34
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.StorageLocationState = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'editable' attribute on InputSet (id=StorageInputSet) at StorageInputSet.pcf: line 7, column 26
    function editable_32 () : java.lang.Boolean {
      return perm.System.StorageUpdate
    }
    
    // 'value' attribute on DateInput (id=DateShippedToStorage) at StorageInputSet.pcf: line 17, column 34
    function valueRoot_3 () : java.lang.Object {
      return claim
    }
    
    // 'value' attribute on DateInput (id=DateShippedToStorage) at StorageInputSet.pcf: line 17, column 34
    function value_0 () : java.util.Date {
      return claim.StorageDate
    }
    
    // 'value' attribute on TypeKeyInput (id=StorageType) at StorageInputSet.pcf: line 35, column 40
    function value_12 () : typekey.StorageType {
      return claim.StorageType
    }
    
    // 'value' attribute on TextInput (id=StorageBoxNumber) at StorageInputSet.pcf: line 40, column 36
    function value_16 () : java.lang.String {
      return claim.StorageBoxNum
    }
    
    // 'value' attribute on TextInput (id=StorageBarCodeNumber) at StorageInputSet.pcf: line 45, column 40
    function value_20 () : java.lang.String {
      return claim.StorageBarCodeNum
    }
    
    // 'value' attribute on TextInput (id=StorageVolumes) at StorageInputSet.pcf: line 50, column 37
    function value_24 () : java.lang.String {
      return claim.StorageVolumes
    }
    
    // 'value' attribute on TextAreaInput (id=StorageNotes) at StorageInputSet.pcf: line 57, column 35
    function value_28 () : java.lang.String {
      return claim.StorageNotes
    }
    
    // 'value' attribute on TypeKeyInput (id=StorageLocationState) at StorageInputSet.pcf: line 23, column 34
    function value_4 () : typekey.State {
      return claim.StorageLocationState
    }
    
    // 'value' attribute on TypeKeyInput (id=StorageCategory) at StorageInputSet.pcf: line 29, column 44
    function value_8 () : typekey.StorageCategory {
      return claim.StorageCategory
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}