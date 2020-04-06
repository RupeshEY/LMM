package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PropertyAttributeInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyAttributeInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_RoofMaterial) at PropertyAttributeInputSet.pcf: line 33, column 41
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.RoofMaterial = (__VALUE_TO_SET as typekey.RoofMaterial)
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_ExtWallMat) at PropertyAttributeInputSet.pcf: line 40, column 39
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.ExtWallMat = (__VALUE_TO_SET as typekey.ExtWallMat)
    }
    
    // 'value' attribute on TypeKeyInput (id=OccupancyType) at PropertyAttributeInputSet.pcf: line 49, column 42
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.OccupancyType = (__VALUE_TO_SET as typekey.OccupancyType)
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_ClassType) at PropertyAttributeInputSet.pcf: line 18, column 38
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.ClassType = (__VALUE_TO_SET as typekey.ClassType)
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_LossArea) at PropertyAttributeInputSet.pcf: line 56, column 37
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.LossArea = (__VALUE_TO_SET as typekey.LossArea)
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_SprinklerType) at PropertyAttributeInputSet.pcf: line 68, column 44
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.SprinklerType = (__VALUE_TO_SET as typekey.SprinklerType)
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumSprinkler) at PropertyAttributeInputSet.pcf: line 76, column 40
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.NumSprinkler = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumSprinkOper) at PropertyAttributeInputSet.pcf: line 84, column 40
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.NumSprinkOper = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_SprinkRetServ) at PropertyAttributeInputSet.pcf: line 91, column 44
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.SprinkRetServ = (__VALUE_TO_SET as typekey.SprinkRetServ)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossLocation_Mold) at PropertyAttributeInputSet.pcf: line 99, column 34
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.MoldInvolved = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossLocation_Hazard) at PropertyAttributeInputSet.pcf: line 105, column 34
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.HazardInvolved = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumStories) at PropertyAttributeInputSet.pcf: line 26, column 38
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      FixedPropertyIncident.NumStories = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_ClassType) at PropertyAttributeInputSet.pcf: line 18, column 38
    function valueRoot_3 () : java.lang.Object {
      return FixedPropertyIncident
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_ClassType) at PropertyAttributeInputSet.pcf: line 18, column 38
    function value_0 () : typekey.ClassType {
      return FixedPropertyIncident.ClassType
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_ExtWallMat) at PropertyAttributeInputSet.pcf: line 40, column 39
    function value_12 () : typekey.ExtWallMat {
      return FixedPropertyIncident.ExtWallMat
    }
    
    // 'value' attribute on TypeKeyInput (id=OccupancyType) at PropertyAttributeInputSet.pcf: line 49, column 42
    function value_16 () : typekey.OccupancyType {
      return FixedPropertyIncident.OccupancyType
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_LossArea) at PropertyAttributeInputSet.pcf: line 56, column 37
    function value_20 () : typekey.LossArea {
      return FixedPropertyIncident.LossArea
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_SprinklerType) at PropertyAttributeInputSet.pcf: line 68, column 44
    function value_24 () : typekey.SprinklerType {
      return FixedPropertyIncident.SprinklerType
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumSprinkler) at PropertyAttributeInputSet.pcf: line 76, column 40
    function value_28 () : java.lang.Integer {
      return FixedPropertyIncident.NumSprinkler
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumSprinkOper) at PropertyAttributeInputSet.pcf: line 84, column 40
    function value_32 () : java.lang.Integer {
      return FixedPropertyIncident.NumSprinkOper
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_SprinkRetServ) at PropertyAttributeInputSet.pcf: line 91, column 44
    function value_36 () : typekey.SprinkRetServ {
      return FixedPropertyIncident.SprinkRetServ
    }
    
    // 'value' attribute on TextInput (id=PropertyAttribute_NumStories) at PropertyAttributeInputSet.pcf: line 26, column 38
    function value_4 () : java.lang.Integer {
      return FixedPropertyIncident.NumStories
    }
    
    // 'value' attribute on TypeKeyInput (id=LossLocation_Mold) at PropertyAttributeInputSet.pcf: line 99, column 34
    function value_41 () : typekey.YesNo {
      return FixedPropertyIncident.MoldInvolved
    }
    
    // 'value' attribute on TypeKeyInput (id=LossLocation_Hazard) at PropertyAttributeInputSet.pcf: line 105, column 34
    function value_45 () : typekey.YesNo {
      return FixedPropertyIncident.HazardInvolved
    }
    
    // 'value' attribute on TypeKeyInput (id=PropertyAttribute_RoofMaterial) at PropertyAttributeInputSet.pcf: line 33, column 41
    function value_8 () : typekey.RoofMaterial {
      return FixedPropertyIncident.RoofMaterial
    }
    
    // 'visible' attribute on InputSet at PropertyAttributeInputSet.pcf: line 58, column 76
    function visible_40 () : java.lang.Boolean {
      return FixedPropertyIncident.Claim.LossCause == LossCause.TC_FIRE
    }
    
    property get FixedPropertyIncident () : FixedPropertyIncident {
      return getRequireValue("FixedPropertyIncident", 0) as FixedPropertyIncident
    }
    
    property set FixedPropertyIncident ($arg :  FixedPropertyIncident) {
      setRequireValue("FixedPropertyIncident", 0, $arg)
    }
    
    
  }
  
  
}