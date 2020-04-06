package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupInput (id=NameReadOnly) at GroupWidget.xml: line 13, column 49
    function action_10 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 10, column 49
    function action_31 () : void {
      GroupSearchPopup.push(Group)
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 13, column 49
    function action_33 () : void {
      OrganizationGroupTreePopup.push(Group.makeOrganizationSelection(), Group)
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function action_36 () : void {
      GroupDetailPage.go(Group.Parent)
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupDetailDV.pcf: line 47, column 41
    function action_45 () : void {
      GroupDetailPage.go(Group.Parent)
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 9, column 49
    function action_50 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 12, column 49
    function action_52 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function action_54 () : void {
      UserDetailPage.go(Group.Supervisor)
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at GroupDetailDV.pcf: line 55, column 34
    function action_62 () : void {
      UserDetailPage.go(Group.Supervisor)
    }
    
    // 'action' attribute on RangeInput (id=SecurityZone) at GroupDetailDV.pcf: line 64, column 42
    function action_67 () : void {
      SecurityZoneDetail.go(Group.SecurityZone)
    }
    
    // 'action' attribute on GroupInput (id=NameReadOnly) at GroupWidget.xml: line 10, column 49
    function action_8 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupInput (id=NameReadOnly) at GroupWidget.xml: line 13, column 49
    function action_dest_11 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 10, column 49
    function action_dest_32 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination(Group)
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 13, column 49
    function action_dest_34 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination(Group.makeOrganizationSelection(), Group)
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function action_dest_37 () : pcf.api.Destination {
      return pcf.GroupDetailPage.createDestination(Group.Parent)
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupDetailDV.pcf: line 47, column 41
    function action_dest_46 () : pcf.api.Destination {
      return pcf.GroupDetailPage.createDestination(Group.Parent)
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 9, column 49
    function action_dest_51 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 12, column 49
    function action_dest_53 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function action_dest_55 () : pcf.api.Destination {
      return pcf.UserDetailPage.createDestination(Group.Supervisor)
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at GroupDetailDV.pcf: line 55, column 34
    function action_dest_63 () : pcf.api.Destination {
      return pcf.UserDetailPage.createDestination(Group.Supervisor)
    }
    
    // 'action' attribute on RangeInput (id=SecurityZone) at GroupDetailDV.pcf: line 64, column 42
    function action_dest_68 () : pcf.api.Destination {
      return pcf.SecurityZoneDetail.createDestination(Group.SecurityZone)
    }
    
    // 'action' attribute on GroupInput (id=NameReadOnly) at GroupWidget.xml: line 10, column 49
    function action_dest_9 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'value' attribute on TextInput (id=NameKanji) at GroupDetailDV.pcf: line 30, column 84
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.NameKanji = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at GroupDetailDV.pcf: line 37, column 40
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.GroupType = (__VALUE_TO_SET as typekey.GroupType)
    }
    
    // 'value' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.Parent = (__VALUE_TO_SET as entity.Group)
    }
    
    // 'value' attribute on TextInput (id=Name) at GroupDetailDV.pcf: line 17, column 29
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function defaultSetter_57 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.Supervisor = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on RangeInput (id=SecurityZone) at GroupDetailDV.pcf: line 64, column 42
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.SecurityZone = (__VALUE_TO_SET as entity.SecurityZone)
    }
    
    // 'label' attribute on TextInput (id=Name) at GroupDetailDV.pcf: line 17, column 29
    function label_0 () : java.lang.Object {
      return (gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP) ? DisplayKey.get("Web.Admin.GroupDetail.BasicDV.NamePhonetic") : DisplayKey.get("Web.Admin.GroupDetail.BasicDV.Name")
    }
    
    // 'valueRange' attribute on GroupInput (id=NameReadOnly) at GroupWidget.xml: line 7, column 52
    function valueRange_14 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'valueRange' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function valueRange_59 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'valueRange' attribute on RangeInput (id=SecurityZone) at GroupDetailDV.pcf: line 64, column 42
    function valueRange_72 () : java.lang.Object {
      return gw.api.database.Query.make(entity.SecurityZone).select()
    }
    
    // 'value' attribute on TextInput (id=Name) at GroupDetailDV.pcf: line 17, column 29
    function valueRoot_5 () : java.lang.Object {
      return Group
    }
    
    // 'value' attribute on TextInput (id=Name) at GroupDetailDV.pcf: line 17, column 29
    function value_1 () : java.lang.String {
      return Group.Name
    }
    
    // 'value' attribute on TextInput (id=NameKanji) at GroupDetailDV.pcf: line 30, column 84
    function value_20 () : java.lang.String {
      return Group.NameKanji
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at GroupDetailDV.pcf: line 37, column 40
    function value_25 () : typekey.GroupType {
      return Group.GroupType
    }
    
    // 'value' attribute on GroupInput (id=Parent) at GroupDetailDV.pcf: line 47, column 41
    function value_30 () : entity.Group {
      return Group.Parent
    }
    
    // 'value' attribute on UserInput (id=Supervisor) at GroupDetailDV.pcf: line 55, column 34
    function value_49 () : entity.User {
      return Group.Supervisor
    }
    
    // 'value' attribute on RangeInput (id=SecurityZone) at GroupDetailDV.pcf: line 64, column 42
    function value_66 () : entity.SecurityZone {
      return Group.SecurityZone
    }
    
    // 'value' attribute on GroupInput (id=NameReadOnly) at GroupDetailDV.pcf: line 22, column 51
    function value_7 () : entity.Group {
      return Group
    }
    
    // 'valueRange' attribute on GroupInput (id=NameReadOnly) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_15 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=NameReadOnly) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_15 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=NameReadOnly) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_15 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_42 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_42 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_42 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_60 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_60 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_60 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=SecurityZone) at GroupDetailDV.pcf: line 64, column 42
    function verifyValueRangeIsAllowedType_73 ($$arg :  entity.SecurityZone[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=SecurityZone) at GroupDetailDV.pcf: line 64, column 42
    function verifyValueRangeIsAllowedType_73 ($$arg :  gw.api.database.IQueryBeanResult<entity.SecurityZone>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=SecurityZone) at GroupDetailDV.pcf: line 64, column 42
    function verifyValueRangeIsAllowedType_73 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=NameReadOnly) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_16 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_15(__valueRangeArg)
    }
    
    // 'valueRange' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_43 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_42(__valueRangeArg)
    }
    
    // 'valueRange' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function verifyValueRange_61 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_60(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=SecurityZone) at GroupDetailDV.pcf: line 64, column 42
    function verifyValueRange_74 () : void {
      var __valueRangeArg = gw.api.database.Query.make(entity.SecurityZone).select()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_73(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=NameKanji) at GroupDetailDV.pcf: line 30, column 84
    function visible_19 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP
    }
    
    // 'visible' attribute on GroupInput (id=Parent) at GroupDetailDV.pcf: line 47, column 41
    function visible_29 () : java.lang.Boolean {
      return Group.Parent != null
    }
    
    // 'visible' attribute on GroupInput (id=NameReadOnly) at GroupDetailDV.pcf: line 22, column 51
    function visible_6 () : java.lang.Boolean {
      return not CurrentLocation.InEditMode
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    
  }
  
  
}