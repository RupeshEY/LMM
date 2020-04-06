package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/EditableClaimUserRolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableClaimUserRolesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/EditableClaimUserRolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimUserRolesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableClaimUserRolesLV.pcf: line 33, column 41
    function sortValue_0 (UserRoleAssignment :  entity.UserRoleAssignment) : java.lang.Object {
      return UserRoleAssignment.Role
    }
    
    // 'value' attribute on RowIterator at EditableClaimUserRolesLV.pcf: line 41, column 40
    function sortValue_1 (UserRoleAssignment :  entity.UserRoleAssignment) : java.lang.Object {
      return UserRoleAssignment.Exposure
    }
    
    // 'value' attribute on RowIterator at EditableClaimUserRolesLV.pcf: line 46, column 46
    function sortValue_2 (UserRoleAssignment :  entity.UserRoleAssignment) : java.lang.Object {
      return UserRoleAssignment.Active
    }
    
    // 'value' attribute on RowIterator at EditableClaimUserRolesLV.pcf: line 51, column 48
    function sortValue_3 (UserRoleAssignment :  entity.UserRoleAssignment) : java.lang.Object {
      return UserRoleAssignment.Comments
    }
    
    // 'toAdd' attribute on RowIterator at EditableClaimUserRolesLV.pcf: line 25, column 47
    function toAdd_23 (UserRoleAssignment :  entity.UserRoleAssignment) : void {
      ClaimUserModel.addToUserRoleAssignments(UserRoleAssignment)
    }
    
    // 'toRemove' attribute on RowIterator at EditableClaimUserRolesLV.pcf: line 25, column 47
    function toRemove_24 (UserRoleAssignment :  entity.UserRoleAssignment) : void {
      ClaimUserModel.removeFromUserRoleAssignments(UserRoleAssignment)
    }
    
    // 'value' attribute on RowIterator at EditableClaimUserRolesLV.pcf: line 25, column 47
    function value_25 () : entity.UserRoleAssignment[] {
      return ClaimUserModel.UserRoleAssignments
    }
    
    property get ClaimUserModel () : ClaimUserModel {
      return getRequireValue("ClaimUserModel", 0) as ClaimUserModel
    }
    
    property set ClaimUserModel ($arg :  ClaimUserModel) {
      setRequireValue("ClaimUserModel", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/EditableClaimUserRolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableClaimUserRolesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeCell (id=Exposure) at EditableClaimUserRolesLV.pcf: line 41, column 40
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      UserRoleAssignment.Exposure = (__VALUE_TO_SET as entity.Exposure)
    }
    
    // 'value' attribute on BooleanRadioCell (id=Active) at EditableClaimUserRolesLV.pcf: line 46, column 46
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      UserRoleAssignment.Active = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableClaimUserRolesLV.pcf: line 51, column 48
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      UserRoleAssignment.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=Role) at EditableClaimUserRolesLV.pcf: line 33, column 41
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      UserRoleAssignment.Role = (__VALUE_TO_SET as typekey.UserRole)
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableClaimUserRolesLV.pcf: line 41, column 40
    function valueRange_12 () : java.lang.Object {
      return claim.Exposures
    }
    
    // 'value' attribute on TypeKeyCell (id=Role) at EditableClaimUserRolesLV.pcf: line 33, column 41
    function valueRoot_7 () : java.lang.Object {
      return UserRoleAssignment
    }
    
    // 'value' attribute on BooleanRadioCell (id=Active) at EditableClaimUserRolesLV.pcf: line 46, column 46
    function value_15 () : java.lang.Boolean {
      return UserRoleAssignment.Active
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableClaimUserRolesLV.pcf: line 51, column 48
    function value_19 () : java.lang.String {
      return UserRoleAssignment.Comments
    }
    
    // 'value' attribute on TypeKeyCell (id=Role) at EditableClaimUserRolesLV.pcf: line 33, column 41
    function value_4 () : typekey.UserRole {
      return UserRoleAssignment.Role
    }
    
    // 'value' attribute on RangeCell (id=Exposure) at EditableClaimUserRolesLV.pcf: line 41, column 40
    function value_8 () : entity.Exposure {
      return UserRoleAssignment.Exposure
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableClaimUserRolesLV.pcf: line 41, column 40
    function verifyValueRangeIsAllowedType_13 ($$arg :  entity.Exposure[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableClaimUserRolesLV.pcf: line 41, column 40
    function verifyValueRangeIsAllowedType_13 ($$arg :  gw.api.database.IQueryBeanResult<entity.Exposure>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableClaimUserRolesLV.pcf: line 41, column 40
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Exposure) at EditableClaimUserRolesLV.pcf: line 41, column 40
    function verifyValueRange_14 () : void {
      var __valueRangeArg = claim.Exposures
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    property get UserRoleAssignment () : entity.UserRoleAssignment {
      return getIteratedValue(1) as entity.UserRoleAssignment
    }
    
    
  }
  
  
}