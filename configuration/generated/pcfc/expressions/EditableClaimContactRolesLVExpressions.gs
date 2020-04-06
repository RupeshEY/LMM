package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/EditableClaimContactRolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableClaimContactRolesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/EditableClaimContactRolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimContactRolesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableClaimContactRolesLV.pcf: line 46, column 28
    function sortValue_0 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.Role
    }
    
    // 'value' attribute on RowIterator at EditableClaimContactRolesLV.pcf: line 56, column 29
    function sortValue_1 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.Active
    }
    
    // 'value' attribute on RowIterator at EditableClaimContactRolesLV.pcf: line 63, column 46
    function sortValue_2 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.Comments
    }
    
    // 'toAdd' attribute on RowIterator at EditableClaimContactRolesLV.pcf: line 22, column 45
    function toAdd_27 (ClaimContactRole :  entity.ClaimContactRole) : void {
      claimContact.addToRoles(ClaimContactRole)
    }
    
    // 'toRemove' attribute on RowIterator at EditableClaimContactRolesLV.pcf: line 22, column 45
    function toRemove_28 (ClaimContactRole :  entity.ClaimContactRole) : void {
      ClaimContactRole.removeRoleOnly()
    }
    
    // 'value' attribute on RowIterator at EditableClaimContactRolesLV.pcf: line 22, column 45
    function value_29 () : entity.ClaimContactRole[] {
      return claimContact.Roles
    }
    
    property get claimContact () : ClaimContact {
      return getRequireValue("claimContact", 0) as ClaimContact
    }
    
    property set claimContact ($arg :  ClaimContact) {
      setRequireValue("claimContact", 0, $arg)
    }
    
    
    function formatOwner(owner : KeyableBean) : String {
      var result : String;
      // If it's a draft claim (i.e., a "new claim wizard" claim), then just print out the "DraftClaim" display key;
      // otherwise, just use the default label (DisplayName). For injury incidents use the display name with injured party name
      if (owner typeis Claim) {
        var claim = owner;
        if (claim.State == TC_DRAFT) {
          result = DisplayKey.get("LV.Claim.EditableClaimContactRoles.DraftClaim");
        } else {
          result = owner.DisplayName;
        }
      } else if (owner typeis InjuryIncident) {
        result = (owner).DisplayNameWithInjuredParty
      } else {
        result = owner.DisplayName;
      }
      return result;
    }
          
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/contacts/EditableClaimContactRolesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableClaimContactRolesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeCell (id=Role) at EditableClaimContactRolesLV.pcf: line 46, column 28
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.Role = (__VALUE_TO_SET as typekey.ContactRole)
    }
    
    // 'value' attribute on BooleanRadioCell (id=IsActive) at EditableClaimContactRolesLV.pcf: line 56, column 29
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.Active = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableClaimContactRolesLV.pcf: line 63, column 46
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeCell (id=Owner) at EditableClaimContactRolesLV.pcf: line 35, column 52
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.Owner = (__VALUE_TO_SET as entity.ClaimContactRoleOwner)
    }
    
    // 'editable' attribute on Row at EditableClaimContactRolesLV.pcf: line 24, column 55
    function editable_26 () : java.lang.Boolean {
      return ClaimContactRole.isEditableInELV()
    }
    
    // 'optionLabel' attribute on RangeCell (id=Owner) at EditableClaimContactRolesLV.pcf: line 35, column 52
    function optionLabel_7 (VALUE :  entity.ClaimContactRoleOwner) : java.lang.String {
      return formatOwner(VALUE)
    }
    
    // 'valueRange' attribute on RangeCell (id=Role) at EditableClaimContactRolesLV.pcf: line 46, column 28
    function valueRange_15 () : java.lang.Object {
      return ClaimContactRole.Owner.AllowedContactRolesForEntity
    }
    
    // 'valueRange' attribute on RangeCell (id=Owner) at EditableClaimContactRolesLV.pcf: line 35, column 52
    function valueRange_8 () : java.lang.Object {
      return claimContact.Claim.RoleOwners
    }
    
    // 'value' attribute on RangeCell (id=Owner) at EditableClaimContactRolesLV.pcf: line 35, column 52
    function valueRoot_6 () : java.lang.Object {
      return ClaimContactRole
    }
    
    // 'value' attribute on RangeCell (id=Role) at EditableClaimContactRolesLV.pcf: line 46, column 28
    function value_11 () : typekey.ContactRole {
      return ClaimContactRole.Role
    }
    
    // 'value' attribute on BooleanRadioCell (id=IsActive) at EditableClaimContactRolesLV.pcf: line 56, column 29
    function value_18 () : java.lang.Boolean {
      return ClaimContactRole.Active
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableClaimContactRolesLV.pcf: line 63, column 46
    function value_22 () : java.lang.String {
      return ClaimContactRole.Comments
    }
    
    // 'value' attribute on RangeCell (id=Owner) at EditableClaimContactRolesLV.pcf: line 35, column 52
    function value_3 () : entity.ClaimContactRoleOwner {
      return ClaimContactRole.Owner
    }
    
    // 'valueRange' attribute on RangeCell (id=Role) at EditableClaimContactRolesLV.pcf: line 46, column 28
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Role) at EditableClaimContactRolesLV.pcf: line 46, column 28
    function verifyValueRangeIsAllowedType_16 ($$arg :  typekey.ContactRole[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Owner) at EditableClaimContactRolesLV.pcf: line 35, column 52
    function verifyValueRangeIsAllowedType_9 ($$arg :  entity.ClaimContactRoleOwner[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Owner) at EditableClaimContactRolesLV.pcf: line 35, column 52
    function verifyValueRangeIsAllowedType_9 ($$arg :  gw.api.database.IQueryBeanResult<entity.ClaimContactRoleOwner>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Owner) at EditableClaimContactRolesLV.pcf: line 35, column 52
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Owner) at EditableClaimContactRolesLV.pcf: line 35, column 52
    function verifyValueRange_10 () : void {
      var __valueRangeArg = claimContact.Claim.RoleOwners
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=Role) at EditableClaimContactRolesLV.pcf: line 46, column 28
    function verifyValueRange_17 () : void {
      var __valueRangeArg = ClaimContactRole.Owner.AllowedContactRolesForEntity
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    property get ClaimContactRole () : entity.ClaimContactRole {
      return getIteratedValue(1) as entity.ClaimContactRole
    }
    
    
  }
  
  
}