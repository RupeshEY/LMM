package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationRUDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyLocationRUDetailsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationRUDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationRUDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=AddBuilding) at PolicyLocationRUDetailsDV.pcf: line 47, column 44
    function action_16 () : void {
      RU.Policy.createNewBuilding(RU)
    }
    
    // 'action' attribute on Link (id=RemoveBuilding) at PolicyLocationRUDetailsDV.pcf: line 54, column 44
    function action_18 () : void {
      RU.Policy.removeBuilding(RU)
    }
    
    // 'def' attribute on ListViewInput at PolicyLocationRUDetailsDV.pcf: line 83, column 69
    function def_onEnter_31 (def :  pcf.EditableRULienholdersLV) : void {
      def.onEnter(RU, RU.Policy.Claim)
    }
    
    // 'def' attribute on InputSetRef at PolicyLocationRUDetailsDV.pcf: line 96, column 50
    function def_onEnter_33 (def :  pcf.ClassCodeInputSet) : void {
      def.onEnter(RU.ClassCode)
    }
    
    // 'def' attribute on ListViewInput at PolicyLocationRUDetailsDV.pcf: line 83, column 69
    function def_refreshVariables_32 (def :  pcf.EditableRULienholdersLV) : void {
      def.refreshVariables(RU, RU.Policy.Claim)
    }
    
    // 'def' attribute on InputSetRef at PolicyLocationRUDetailsDV.pcf: line 96, column 50
    function def_refreshVariables_34 (def :  pcf.ClassCodeInputSet) : void {
      def.refreshVariables(RU.ClassCode)
    }
    
    // 'value' attribute on TextAreaInput (id=RUDescription) at PolicyLocationRUDetailsDV.pcf: line 32, column 33
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      RU.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=RUNumber) at PolicyLocationRUDetailsDV.pcf: line 17, column 40
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      RU.RUNumber = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=BuildingNumber) at PolicyLocationRUDetailsDV.pcf: line 66, column 49
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      RU.Building.BuildingNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=BuildingNotes) at PolicyLocationRUDetailsDV.pcf: line 72, column 40
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      RU.Building.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=MiscRUType) at PolicyLocationRUDetailsDV.pcf: line 26, column 52
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      (RU as entity.LocationMiscRU).OtherRiskType = (__VALUE_TO_SET as typekey.OtherRiskType)
    }
    
    // 'onToggle' attribute on InputGroup (id=ClassCodeInputGroup) at PolicyLocationRUDetailsDV.pcf: line 94, column 69
    function setter_36 (VALUE :  java.lang.Boolean) : void {
      toggleClassCode()
    }
    
    // 'value' attribute on TypeKeyInput (id=MiscRUType) at PolicyLocationRUDetailsDV.pcf: line 26, column 52
    function valueRoot_10 () : java.lang.Object {
      return (RU as entity.LocationMiscRU)
    }
    
    // 'value' attribute on TextInput (id=BuildingNumber) at PolicyLocationRUDetailsDV.pcf: line 66, column 49
    function valueRoot_22 () : java.lang.Object {
      return RU.Building
    }
    
    // 'value' attribute on TextInput (id=RUNumber) at PolicyLocationRUDetailsDV.pcf: line 17, column 40
    function valueRoot_3 () : java.lang.Object {
      return RU
    }
    
    // 'value' attribute on TextInput (id=RUNumber) at PolicyLocationRUDetailsDV.pcf: line 17, column 40
    function value_0 () : java.lang.Integer {
      return RU.RUNumber
    }
    
    // 'value' attribute on TextAreaInput (id=RUDescription) at PolicyLocationRUDetailsDV.pcf: line 32, column 33
    function value_11 () : java.lang.String {
      return RU.Description
    }
    
    // 'value' attribute on TextInput (id=BuildingNumber) at PolicyLocationRUDetailsDV.pcf: line 66, column 49
    function value_19 () : java.lang.String {
      return RU.Building.BuildingNumber
    }
    
    // 'value' attribute on TextAreaInput (id=BuildingNotes) at PolicyLocationRUDetailsDV.pcf: line 72, column 40
    function value_23 () : java.lang.String {
      return RU.Building.Notes
    }
    
    // 'value' attribute on TypeKeyInput (id=MiscRUType) at PolicyLocationRUDetailsDV.pcf: line 26, column 52
    function value_5 () : typekey.OtherRiskType {
      return (RU as entity.LocationMiscRU).OtherRiskType
    }
    
    // 'visible' attribute on Link (id=AddBuilding) at PolicyLocationRUDetailsDV.pcf: line 47, column 44
    function visible_15 () : java.lang.Boolean {
      return RU.Building == null
    }
    
    // 'visible' attribute on Link (id=RemoveBuilding) at PolicyLocationRUDetailsDV.pcf: line 54, column 44
    function visible_17 () : java.lang.Boolean {
      return RU.Building != null
    }
    
    // 'visible' attribute on InputSet at PolicyLocationRUDetailsDV.pcf: line 36, column 99
    function visible_28 () : java.lang.Boolean {
      return RU typeis LocationBasedRU and RU.Policy.PolicyType != PolicyType.TC_WORKERSCOMP
    }
    
    // 'visible' attribute on InputDivider at PolicyLocationRUDetailsDV.pcf: line 76, column 80
    function visible_29 () : java.lang.Boolean {
      return RU.Building != null and CurrentLocation.InEditMode == false
    }
    
    // 'visible' attribute on ListViewInput at PolicyLocationRUDetailsDV.pcf: line 83, column 69
    function visible_30 () : java.lang.Boolean {
      return RU.Policy.PolicyType != PolicyType.TC_WORKERSCOMP
    }
    
    // 'childrenVisible' attribute on InputGroup (id=ClassCodeInputGroup) at PolicyLocationRUDetailsDV.pcf: line 94, column 69
    function visible_35 () : java.lang.Boolean {
      return RU.ClassCode != null
    }
    
    // 'visible' attribute on InputGroup (id=ClassCodeInputGroup) at PolicyLocationRUDetailsDV.pcf: line 94, column 69
    function visible_38 () : java.lang.Boolean {
      return RU.Policy.PolicyType == PolicyType.TC_WORKERSCOMP
    }
    
    // 'visible' attribute on TypeKeyInput (id=MiscRUType) at PolicyLocationRUDetailsDV.pcf: line 26, column 52
    function visible_4 () : java.lang.Boolean {
      return RU typeis entity.LocationMiscRU
    }
    
    property get RU () : LocationBasedRU {
      return getRequireValue("RU", 0) as LocationBasedRU
    }
    
    property set RU ($arg :  LocationBasedRU) {
      setRequireValue("RU", 0, $arg)
    }
    
    function toggleClassCode() {
      if(RU.ClassCode != null) {
        RU.removeClassCode()
      }  
      else {
        RU.addNewClassCode() 
      }
    }
    
    
  }
  
  
}