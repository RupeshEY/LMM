package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserRegionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserRegionLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserRegionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends UserRegionLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at UserRegionLV.pcf: line 27, column 43
    function valueRoot_4 () : java.lang.Object {
      return UserRegion.Region
    }
    
    // 'value' attribute on TextCell (id=Name) at UserRegionLV.pcf: line 27, column 43
    function value_2 () : java.lang.String {
      return UserRegion.Region.Name
    }
    
    // 'value' attribute on TextCell (id=Zones) at UserRegionLV.pcf: line 32, column 44
    function value_5 () : java.lang.String {
      return UserRegion.Region.Zones
    }
    
    property get UserRegion () : entity.UserRegion {
      return getIteratedValue(1) as entity.UserRegion
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/users/UserRegionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserRegionLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'conversionExpression' attribute on RowIterator at UserRegionLV.pcf: line 22, column 39
    function conversionExpression_1 (PickedValue :  Region[]) : entity.UserRegion[] {
      return gw.api.admin.UserRegionUtil.createUserRegions(PickedValue, CurrentLocation)
    }
    
    // 'pickLocation' attribute on RowIterator at UserRegionLV.pcf: line 22, column 39
    function pickLocation_8 () : void {
      UserRegionPopup.push()
    }
    
    // 'value' attribute on RowIterator at UserRegionLV.pcf: line 27, column 43
    function sortValue_0 (UserRegion :  entity.UserRegion) : java.lang.Object {
      return UserRegion.Region.Name
    }
    
    // 'toAdd' attribute on RowIterator at UserRegionLV.pcf: line 22, column 39
    function toAdd_9 (UserRegion :  entity.UserRegion) : void {
      User.addToRegions(UserRegion)
    }
    
    // 'toRemove' attribute on RowIterator at UserRegionLV.pcf: line 22, column 39
    function toRemove_10 (UserRegion :  entity.UserRegion) : void {
      User.removeFromRegions(UserRegion)
    }
    
    // 'value' attribute on RowIterator at UserRegionLV.pcf: line 22, column 39
    function value_11 () : entity.UserRegion[] {
      return User.Regions
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    
  }
  
  
}