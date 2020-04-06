package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUsersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimUsersLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUsersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimUsersLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimUsersLV.pcf: line 31, column 43
    function sortValue_0 (ClaimUserModel :  entity.ClaimUserModel) : java.lang.Object {
      return ClaimUserModel.User.Contact
    }
    
    // 'sortBy' attribute on RowIterator at ClaimUsersLV.pcf: line 37, column 41
    function sortValue_1 (ClaimUserModel :  entity.ClaimUserModel) : java.lang.Object {
      return ClaimUserModel.Group.Name
    }
    
    // 'value' attribute on RowIterator at ClaimUsersLV.pcf: line 43, column 69
    function sortValue_2 (ClaimUserModel :  entity.ClaimUserModel) : java.lang.Object {
      return ClaimUserModel.Assignments
    }
    
    // 'value' attribute on RowIterator at ClaimUsersLV.pcf: line 49, column 69
    function sortValue_3 (ClaimUserModel :  entity.ClaimUserModel) : java.lang.Object {
      return ClaimUserModel.Roles
    }
    
    // 'value' attribute on RowIterator at ClaimUsersLV.pcf: line 54, column 66
    function sortValue_4 (ClaimUserModel :  entity.ClaimUserModel) : java.lang.Object {
      return ClaimUserModel.User.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on RowIterator at ClaimUsersLV.pcf: line 60, column 62
    function sortValue_5 (ClaimUserModel :  entity.ClaimUserModel) : java.lang.Object {
      return ClaimUserModel.User.Contact.EmailAddress1
    }
    
    // 'value' attribute on RowIterator at ClaimUsersLV.pcf: line 20, column 43
    function value_34 () : entity.ClaimUserModel[] {
      return ClaimUserModelList
    }
    
    property get ClaimUserModelList () : ClaimUserModel[] {
      return getRequireValue("ClaimUserModelList", 0) as ClaimUserModel[]
    }
    
    property set ClaimUserModelList ($arg :  ClaimUserModel[]) {
      setRequireValue("ClaimUserModelList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUsersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimUsersLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 10, column 49
    function action_11 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 13, column 49
    function action_13 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 10, column 49
    function action_dest_12 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 13, column 49
    function action_dest_14 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'condition' attribute on ToolbarFlag at ClaimUsersLV.pcf: line 23, column 36
    function condition_6 () : java.lang.Boolean {
      return ClaimUserModel.hasUserRoles()
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function valueRange_17 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'value' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function valueRoot_16 () : java.lang.Object {
      return ClaimUserModel
    }
    
    // 'value' attribute on TextCell (id=Phone) at ClaimUsersLV.pcf: line 54, column 66
    function valueRoot_30 () : java.lang.Object {
      return ClaimUserModel.User.Contact
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimUsersLV.pcf: line 31, column 43
    function valueRoot_9 () : java.lang.Object {
      return ClaimUserModel.User
    }
    
    // 'value' attribute on GroupCell (id=Group) at ClaimUsersLV.pcf: line 37, column 41
    function value_10 () : entity.Group {
      return ClaimUserModel.Group
    }
    
    // 'value' attribute on TextCell (id=Assignments) at ClaimUsersLV.pcf: line 43, column 69
    function value_22 () : gw.api.admin.DisplayableComparableCollection {
      return ClaimUserModel.Assignments
    }
    
    // 'value' attribute on TextCell (id=Roles) at ClaimUsersLV.pcf: line 49, column 69
    function value_25 () : gw.api.admin.DisplayableComparableCollection {
      return ClaimUserModel.Roles
    }
    
    // 'value' attribute on TextCell (id=Phone) at ClaimUsersLV.pcf: line 54, column 66
    function value_28 () : java.lang.String {
      return ClaimUserModel.User.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextCell (id=Email) at ClaimUsersLV.pcf: line 60, column 62
    function value_31 () : java.lang.String {
      return ClaimUserModel.User.Contact.EmailAddress1
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimUsersLV.pcf: line 31, column 43
    function value_7 () : entity.UserContact {
      return ClaimUserModel.User.Contact
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_18 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_18 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_19 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    property get ClaimUserModel () : entity.ClaimUserModel {
      return getIteratedValue(1) as entity.ClaimUserModel
    }
    
    
  }
  
  
}