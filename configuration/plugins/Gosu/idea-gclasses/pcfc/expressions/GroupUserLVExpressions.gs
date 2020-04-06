package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/GroupUserLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupUserLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/GroupUserLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUserLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at GroupUserLV.pcf: line 22, column 36
    function sortValue_0 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.User
    }
    
    // 'sortBy' attribute on RowIterator at GroupUserLV.pcf: line 27, column 36
    function sortValue_1 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.Group.Name
    }
    
    // 'sortBy' attribute on RowIterator at GroupUserLV.pcf: line 32, column 43
    function sortValue_2 (GroupUser :  entity.GroupUser) : java.lang.Object {
      return GroupUser.Group.Parent.Name
    }
    
    // 'value' attribute on RowIterator at GroupUserLV.pcf: line 15, column 76
    function value_31 () : gw.api.database.IQueryBeanResult<entity.GroupUser> {
      return GroupUsers
    }
    
    property get GroupUsers () : gw.api.database.IQueryBeanResult<GroupUser> {
      return getRequireValue("GroupUsers", 0) as gw.api.database.IQueryBeanResult<GroupUser>
    }
    
    property set GroupUsers ($arg :  gw.api.database.IQueryBeanResult<GroupUser>) {
      setRequireValue("GroupUsers", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/GroupUserLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends GroupUserLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 10, column 49
    function action_19 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 13, column 49
    function action_21 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 10, column 49
    function action_7 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 13, column 49
    function action_9 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 13, column 49
    function action_dest_10 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 10, column 49
    function action_dest_20 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 13, column 49
    function action_dest_22 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=Group) at GroupWidget.xml: line 10, column 49
    function action_dest_8 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'pickValue' attribute on RowIterator at GroupUserLV.pcf: line 15, column 76
    function pickValue_30 () : GroupUser {
      return GroupUser
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function valueRange_13 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'value' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function valueRoot_24 () : java.lang.Object {
      return GroupUser.Group
    }
    
    // 'value' attribute on TextCell (id=User) at GroupUserLV.pcf: line 22, column 36
    function valueRoot_5 () : java.lang.Object {
      return GroupUser
    }
    
    // 'value' attribute on GroupCell (id=ParentGroup) at GroupUserLV.pcf: line 32, column 43
    function value_18 () : entity.Group {
      return GroupUser.Group.Parent
    }
    
    // 'value' attribute on TextCell (id=User) at GroupUserLV.pcf: line 22, column 36
    function value_3 () : entity.User {
      return GroupUser.User
    }
    
    // 'value' attribute on GroupCell (id=Group) at GroupUserLV.pcf: line 27, column 36
    function value_6 () : entity.Group {
      return GroupUser.Group
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_14 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_14 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_14 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_26 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_26 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_26 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Group) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_15 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_14(__valueRangeArg)
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_27 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_26(__valueRangeArg)
    }
    
    property get GroupUser () : entity.GroupUser {
      return getIteratedValue(1) as entity.GroupUser
    }
    
    
  }
  
  
}