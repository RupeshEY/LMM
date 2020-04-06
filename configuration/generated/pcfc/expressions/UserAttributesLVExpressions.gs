package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserAttributesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends UserAttributesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at UserAttributesLV.pcf: line 43, column 38
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Attribute.State = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'value' attribute on TextCell (id=Value) at UserAttributesLV.pcf: line 49, column 42
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      Attribute.Value = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'outputConversion' attribute on TextCell (id=Name) at UserAttributesLV.pcf: line 31, column 45
    function outputConversion_6 (VALUE :  java.lang.String) : java.lang.String {
      return Attribute.Attribute.Name
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at UserAttributesLV.pcf: line 43, column 38
    function valueRoot_15 () : java.lang.Object {
      return Attribute
    }
    
    // 'value' attribute on TextCell (id=Name) at UserAttributesLV.pcf: line 31, column 45
    function valueRoot_8 () : java.lang.Object {
      return Attribute.Attribute
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at UserAttributesLV.pcf: line 43, column 38
    function value_12 () : typekey.State {
      return Attribute.State
    }
    
    // 'value' attribute on TextCell (id=Value) at UserAttributesLV.pcf: line 49, column 42
    function value_16 () : java.lang.Integer {
      return Attribute.Value
    }
    
    // 'value' attribute on TextCell (id=Name) at UserAttributesLV.pcf: line 31, column 45
    function value_5 () : java.lang.String {
      return Attribute.Attribute.Name
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at UserAttributesLV.pcf: line 37, column 50
    function value_9 () : typekey.UserAttributeType {
      return Attribute.Attribute.Type
    }
    
    property get Attribute () : entity.AttributeUser {
      return getIteratedValue(1) as entity.AttributeUser
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAttributesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'conversionExpression' attribute on RowIterator at UserAttributesLV.pcf: line 23, column 42
    function conversionExpression_4 (PickedValue :  Attribute[]) : entity.AttributeUser[] {
      return gw.api.admin.UserAttributeUtil.createAttributeUsers(PickedValue, CurrentLocation)
    }
    
    // 'pickLocation' attribute on RowIterator at UserAttributesLV.pcf: line 23, column 42
    function pickLocation_20 () : void {
      UserAttributesPopup.push()
    }
    
    // 'value' attribute on RowIterator at UserAttributesLV.pcf: line 31, column 45
    function sortValue_0 (Attribute :  entity.AttributeUser) : java.lang.Object {
      return Attribute.Attribute.Name
    }
    
    // 'value' attribute on RowIterator at UserAttributesLV.pcf: line 37, column 50
    function sortValue_1 (Attribute :  entity.AttributeUser) : java.lang.Object {
      return Attribute.Attribute.Type
    }
    
    // 'value' attribute on RowIterator at UserAttributesLV.pcf: line 43, column 38
    function sortValue_2 (Attribute :  entity.AttributeUser) : java.lang.Object {
      return Attribute.State
    }
    
    // 'value' attribute on RowIterator at UserAttributesLV.pcf: line 49, column 42
    function sortValue_3 (Attribute :  entity.AttributeUser) : java.lang.Object {
      return Attribute.Value
    }
    
    // 'toAdd' attribute on RowIterator at UserAttributesLV.pcf: line 23, column 42
    function toAdd_21 (Attribute :  entity.AttributeUser) : void {
      User.addToAttributes(Attribute)
    }
    
    // 'toRemove' attribute on RowIterator at UserAttributesLV.pcf: line 23, column 42
    function toRemove_22 (Attribute :  entity.AttributeUser) : void {
      User.removeFromAttributes(Attribute)
    }
    
    // 'value' attribute on RowIterator at UserAttributesLV.pcf: line 23, column 42
    function value_23 () : entity.AttributeUser[] {
      return User.Attributes
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    
  }
  
  
}