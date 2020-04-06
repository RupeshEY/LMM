package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupSearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupSearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on RowIterator at GroupSearchResultsLV.pcf: line 22, column 26
    function sortValue_0 (Group :  entity.Group) : java.lang.Object {
      return Group.Name
    }
    
    // 'sortBy' attribute on RowIterator at GroupSearchResultsLV.pcf: line 27, column 33
    function sortValue_1 (Group :  entity.Group) : java.lang.Object {
      return Group.Parent.Name
    }
    
    // 'value' attribute on RowIterator at GroupSearchResultsLV.pcf: line 32, column 42
    function sortValue_2 (Group :  entity.Group) : java.lang.Object {
      return Group.GroupType
    }
    
    // 'value' attribute on RowIterator at GroupSearchResultsLV.pcf: line 14, column 72
    function value_32 () : gw.api.database.IQueryBeanResult<entity.Group> {
      return GroupList
    }
    
    property get GroupList () : gw.api.database.IQueryBeanResult<Group> {
      return getRequireValue("GroupList", 0) as gw.api.database.IQueryBeanResult<Group>
    }
    
    property set GroupList ($arg :  gw.api.database.IQueryBeanResult<Group>) {
      setRequireValue("GroupList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends GroupSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupCell (id=Name) at GroupSearchResultsLV.pcf: line 22, column 26
    function action_14 () : void {
      GroupDetailPage.go(Group)
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 10, column 49
    function action_18 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 13, column 49
    function action_20 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Name) at GroupWidget.xml: line 10, column 49
    function action_4 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Name) at GroupWidget.xml: line 13, column 49
    function action_6 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupCell (id=Name) at GroupWidget.xml: line 7, column 52
    function action_8 () : void {
      GroupDetailPage.go(Group)
    }
    
    // 'action' attribute on GroupCell (id=Name) at GroupSearchResultsLV.pcf: line 22, column 26
    function action_dest_15 () : pcf.api.Destination {
      return pcf.GroupDetailPage.createDestination(Group)
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 10, column 49
    function action_dest_19 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 13, column 49
    function action_dest_21 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=Name) at GroupWidget.xml: line 10, column 49
    function action_dest_5 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=Name) at GroupWidget.xml: line 13, column 49
    function action_dest_7 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=Name) at GroupWidget.xml: line 7, column 52
    function action_dest_9 () : pcf.api.Destination {
      return pcf.GroupDetailPage.createDestination(Group)
    }
    
    // 'valueRange' attribute on GroupCell (id=Name) at GroupWidget.xml: line 7, column 52
    function valueRange_11 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'value' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function valueRoot_23 () : java.lang.Object {
      return Group
    }
    
    // 'value' attribute on GroupCell (id=ParentGroup) at GroupSearchResultsLV.pcf: line 27, column 33
    function value_17 () : entity.Group {
      return Group.Parent
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at GroupSearchResultsLV.pcf: line 32, column 42
    function value_29 () : typekey.GroupType {
      return Group.GroupType
    }
    
    // 'value' attribute on GroupCell (id=Name) at GroupSearchResultsLV.pcf: line 22, column 26
    function value_3 () : entity.Group {
      return Group
    }
    
    // 'valueRange' attribute on GroupCell (id=Name) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_12 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Name) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_12 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Name) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_12 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_25 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_25 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_25 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=Name) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_13 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_12(__valueRangeArg)
    }
    
    // 'valueRange' attribute on GroupCell (id=ParentGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_26 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_25(__valueRangeArg)
    }
    
    property get Group () : entity.Group {
      return getIteratedValue(1) as entity.Group
    }
    
    
  }
  
  
}