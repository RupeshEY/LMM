package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentUserLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssignmentUserLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentUserLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentUserLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at AssignmentUserLV.pcf: line 23, column 53
    function initialValue_0 () : gw.api.contact.DrivingDirectionsCache {
      return pageHelper.getDrivingDirectionsCache()
    }
    
    // 'value' attribute on RowIterator at AssignmentUserLV.pcf: line 59, column 36
    function sortValue_3 (gUser :  entity.GroupUser) : java.lang.Object {
      return gUser.User
    }
    
    // 'sortBy' attribute on RowIterator at AssignmentUserLV.pcf: line 64, column 32
    function sortValue_4 (gUser :  entity.GroupUser) : java.lang.Object {
      return gUser.Group.Name
    }
    
    // 'sortBy' attribute on RowIterator at AssignmentUserLV.pcf: line 69, column 39
    function sortValue_5 (gUser :  entity.GroupUser) : java.lang.Object {
      return gUser.Group.Parent.Name
    }
    
    // 'value' attribute on RowIterator at AssignmentUserLV.pcf: line 50, column 76
    function value_88 () : gw.api.database.IQueryBeanResult<entity.GroupUser> {
      return searchResults
    }
    
    // 'visible' attribute on TextCell (id=Group3) at AssignmentUserLV.pcf: line 35, column 45
    function visible_1 () : java.lang.Boolean {
      return perm.System.viewworkload
    }
    
    // 'visible' attribute on RowIterator at AssignmentUserLV.pcf: line 122, column 74
    function visible_12 () : java.lang.Boolean {
      return pageHelper.displayDirectionsColumns(searchCriteria)
    }
    
    // 'visible' attribute on EmptyCell (id=Group4) at AssignmentUserLV.pcf: line 40, column 55
    function visible_2 () : java.lang.Boolean {
      return searchCriteria.isProximitySearch()
    }
    
    // 'visible' attribute on RowIterator at AssignmentUserLV.pcf: line 79, column 45
    function visible_6 () : java.lang.Boolean {
      return perm.System.viewactcal
    }
    
    property get directions () : gw.api.contact.DrivingDirectionsCache {
      return getVariableValue("directions", 0) as gw.api.contact.DrivingDirectionsCache
    }
    
    property set directions ($arg :  gw.api.contact.DrivingDirectionsCache) {
      setVariableValue("directions", 0, $arg)
    }
    
    property get pageHelper () : gw.api.contact.ProximitySearchPageHelper {
      return getRequireValue("pageHelper", 0) as gw.api.contact.ProximitySearchPageHelper
    }
    
    property set pageHelper ($arg :  gw.api.contact.ProximitySearchPageHelper) {
      setRequireValue("pageHelper", 0, $arg)
    }
    
    property get searchCriteria () : ContactSearchCriteria {
      return getRequireValue("searchCriteria", 0) as ContactSearchCriteria
    }
    
    property set searchCriteria ($arg :  ContactSearchCriteria) {
      setRequireValue("searchCriteria", 0, $arg)
    }
    
    property get searchResults () : gw.api.database.IQueryBeanResult<GroupUser> {
      return getRequireValue("searchResults", 0) as gw.api.database.IQueryBeanResult<GroupUser>
    }
    
    property set searchResults ($arg :  gw.api.database.IQueryBeanResult<GroupUser>) {
      setRequireValue("searchResults", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentUserLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AssignmentUserLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on UserCell (id=User) at UserWidget.xml: line 9, column 49
    function action_16 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserCell (id=User) at UserWidget.xml: line 12, column 49
    function action_18 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 10, column 49
    function action_28 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 13, column 49
    function action_30 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 10, column 49
    function action_40 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 13, column 49
    function action_42 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on BooleanRadioCell (id=ActivityCalendar) at AssignmentUserLV.pcf: line 79, column 45
    function action_52 () : void {
      UserAssignmentCalendarPopup.push(gUser.User)
    }
    
    // 'action' attribute on TextCell (id=Directions) at AssignmentUserLV.pcf: line 137, column 74
    function action_84 () : void {
      AddressBookDirectionsPopup.push(directions.getCached(searchCriteria.ProximitySearchCenter, gUser.User.Contact.PrimaryAddress))
    }
    
    // 'action' attribute on UserCell (id=User) at UserWidget.xml: line 9, column 49
    function action_dest_17 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserCell (id=User) at UserWidget.xml: line 12, column 49
    function action_dest_19 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 10, column 49
    function action_dest_29 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 13, column 49
    function action_dest_31 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 10, column 49
    function action_dest_41 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 13, column 49
    function action_dest_43 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'action' attribute on BooleanRadioCell (id=ActivityCalendar) at AssignmentUserLV.pcf: line 79, column 45
    function action_dest_53 () : pcf.api.Destination {
      return pcf.UserAssignmentCalendarPopup.createDestination(gUser.User)
    }
    
    // 'action' attribute on TextCell (id=Directions) at AssignmentUserLV.pcf: line 137, column 74
    function action_dest_85 () : pcf.api.Destination {
      return pcf.AddressBookDirectionsPopup.createDestination(directions.getCached(searchCriteria.ProximitySearchCenter, gUser.User.Contact.PrimaryAddress))
    }
    
    // 'pickValue' attribute on RowIterator at AssignmentUserLV.pcf: line 50, column 76
    function pickValue_87 () : gw.api.assignment.Assignee {
      return new gw.api.assignment.UserAssignee(gUser)
    }
    
    // 'valueRange' attribute on UserCell (id=User) at UserWidget.xml: line 6, column 85
    function valueRange_22 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function valueRange_34 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'value' attribute on UserCell (id=User) at UserWidget.xml: line 6, column 85
    function valueRoot_21 () : java.lang.Object {
      return gUser
    }
    
    // 'value' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function valueRoot_45 () : java.lang.Object {
      return gUser.Group
    }
    
    // 'value' attribute on TextCell (id=ActivityCount) at AssignmentUserLV.pcf: line 86, column 47
    function valueRoot_57 () : java.lang.Object {
      return gUser.User
    }
    
    // 'value' attribute on UserCell (id=User) at AssignmentUserLV.pcf: line 59, column 36
    function value_15 () : entity.User {
      return gUser.User
    }
    
    // 'value' attribute on GroupCell (id=Group) at AssignmentUserLV.pcf: line 64, column 32
    function value_27 () : entity.Group {
      return gUser.Group
    }
    
    // 'value' attribute on GroupCell (id=ParentGroup) at AssignmentUserLV.pcf: line 69, column 39
    function value_39 () : entity.Group {
      return gUser.Group.Parent
    }
    
    // 'value' attribute on TextCell (id=ActivityCount) at AssignmentUserLV.pcf: line 86, column 47
    function value_55 () : java.lang.Integer {
      return gUser.User.OpenActivityCount
    }
    
    // 'value' attribute on TextCell (id=ClaimCount) at AssignmentUserLV.pcf: line 93, column 47
    function value_59 () : java.lang.Integer {
      return gUser.User.OpenClaimCount
    }
    
    // 'value' attribute on TextCell (id=ExposureCount) at AssignmentUserLV.pcf: line 100, column 47
    function value_63 () : java.lang.Integer {
      return gUser.User.OpenExposureCount
    }
    
    // 'value' attribute on TextCell (id=MatterCount) at AssignmentUserLV.pcf: line 107, column 47
    function value_67 () : java.lang.Integer {
      return gUser.User.OpenMatterCount
    }
    
    // 'value' attribute on TextCell (id=GCDistance) at AssignmentUserLV.pcf: line 115, column 57
    function value_71 () : java.lang.String {
      return searchCriteria.ProximitySearchCenter == null ? "" : gUser.User.Contact.PrimaryAddress.getDistanceFromAsString(searchCriteria.ProximitySearchCenter)
    }
    
    // 'value' attribute on TextCell (id=DrivingDistance) at AssignmentUserLV.pcf: line 122, column 74
    function value_75 () : java.lang.String {
      return directions.getCached(searchCriteria.ProximitySearchCenter, gUser.User.Contact.PrimaryAddress).getTotalDistanceString()
    }
    
    // 'value' attribute on TextCell (id=DrivingTime) at AssignmentUserLV.pcf: line 129, column 74
    function value_79 () : java.lang.String {
      return directions.getCached(searchCriteria.ProximitySearchCenter, gUser.User.Contact.PrimaryAddress).getTotalTimeInMinutes()
    }
    
    // 'valueRange' attribute on UserCell (id=User) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_23 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=User) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_23 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=User) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_23 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_35 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_35 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_35 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_47 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_47 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_47 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserCell (id=User) at UserWidget.xml: line 6, column 85
    function verifyValueRange_24 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_23(__valueRangeArg)
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_36 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_35(__valueRangeArg)
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_48 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_47(__valueRangeArg)
    }
    
    // 'visible' attribute on BooleanRadioCell (id=ActivityCalendar) at AssignmentUserLV.pcf: line 79, column 45
    function visible_51 () : java.lang.Boolean {
      return perm.System.viewactcal
    }
    
    // 'visible' attribute on TextCell (id=ActivityCount) at AssignmentUserLV.pcf: line 86, column 47
    function visible_54 () : java.lang.Boolean {
      return perm.System.viewworkload
    }
    
    // 'visible' attribute on TextCell (id=GCDistance) at AssignmentUserLV.pcf: line 115, column 57
    function visible_70 () : java.lang.Boolean {
      return searchCriteria.isProximitySearch()
    }
    
    // 'valueVisible' attribute on TextCell (id=GCDistance) at AssignmentUserLV.pcf: line 115, column 57
    function visible_72 () : java.lang.Boolean {
      return gUser.User.Contact.PrimaryAddress.hasLocationInformation()
    }
    
    // 'visible' attribute on TextCell (id=DrivingDistance) at AssignmentUserLV.pcf: line 122, column 74
    function visible_74 () : java.lang.Boolean {
      return pageHelper.displayDirectionsColumns(searchCriteria)
    }
    
    // 'valueVisible' attribute on TextCell (id=DrivingDistance) at AssignmentUserLV.pcf: line 122, column 74
    function visible_76 () : java.lang.Boolean {
      return directions.haveCached(searchCriteria.ProximitySearchCenter, gUser.User.Contact.PrimaryAddress)
    }
    
    property get gUser () : entity.GroupUser {
      return getIteratedValue(1) as entity.GroupUser
    }
    
    
  }
  
  
}