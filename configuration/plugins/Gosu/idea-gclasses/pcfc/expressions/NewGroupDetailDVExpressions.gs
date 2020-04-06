package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/newgroup/NewGroupDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewGroupDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/newgroup/NewGroupDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewGroupDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 10, column 49
    function action_17 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 13, column 49
    function action_19 () : void {
      OrganizationGroupTreePopup.push(Group.makeOrganizationSelection())
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 9, column 49
    function action_30 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 12, column 49
    function action_32 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 10, column 49
    function action_dest_18 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 13, column 49
    function action_dest_20 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination(Group.makeOrganizationSelection())
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 9, column 49
    function action_dest_31 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 12, column 49
    function action_dest_33 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'def' attribute on ListViewInput at NewGroupDetailDV.pcf: line 57, column 27
    function def_onEnter_49 (def :  pcf.GroupUsersLV) : void {
      def.onEnter(Group)
    }
    
    // 'def' attribute on ListViewInput at NewGroupDetailDV.pcf: line 81, column 64
    function def_onEnter_58 (def :  pcf.LocalizedValuesLV) : void {
      def.onEnter(Group, { "Name" }, { DisplayKey.get("Web.Admin.GroupDetail.BasicDV.Name") })
    }
    
    // 'def' attribute on ListViewInput at NewGroupDetailDV.pcf: line 57, column 27
    function def_refreshVariables_50 (def :  pcf.GroupUsersLV) : void {
      def.refreshVariables(Group)
    }
    
    // 'def' attribute on ListViewInput at NewGroupDetailDV.pcf: line 81, column 64
    function def_refreshVariables_59 (def :  pcf.LocalizedValuesLV) : void {
      def.refreshVariables(Group, { "Name" }, { DisplayKey.get("Web.Admin.GroupDetail.BasicDV.Name") })
    }
    
    // 'value' attribute on TextInput (id=NameKanji) at NewGroupDetailDV.pcf: line 22, column 84
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.NameKanji = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at NewGroupDetailDV.pcf: line 29, column 40
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.GroupType = (__VALUE_TO_SET as typekey.GroupType)
    }
    
    // 'value' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.Parent = (__VALUE_TO_SET as entity.Group)
    }
    
    // 'value' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.Supervisor = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on TextInput (id=Name) at NewGroupDetailDV.pcf: line 16, column 29
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=SecurityZone) at NewGroupDetailDV.pcf: line 52, column 42
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.SecurityZone = (__VALUE_TO_SET as entity.SecurityZone)
    }
    
    // 'value' attribute on TextInput (id=LoadFactor) at NewGroupDetailDV.pcf: line 74, column 40
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.LoadFactor = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'label' attribute on TextInput (id=Name) at NewGroupDetailDV.pcf: line 16, column 29
    function label_0 () : java.lang.Object {
      return (gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP) ? DisplayKey.get("Web.Admin.GroupDetail.BasicDV.NamePhonetic") : DisplayKey.get("Web.Admin.GroupDetail.BasicDV.Name")
    }
    
    // 'validationExpression' attribute on TextInput (id=LoadFactor) at NewGroupDetailDV.pcf: line 74, column 40
    function validationExpression_51 () : java.lang.Object {
      return !(Group.LoadFactor < 0 or Group.LoadFactor > 100) ? null : DisplayKey.get("NVV.Admin.GroupBasics.AdminGroupDetails.Assignment.LoadFactor.OutOfRange")
    }
    
    // 'valueRange' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function valueRange_24 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'valueRange' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function valueRange_37 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'valueRange' attribute on RangeInput (id=SecurityZone) at NewGroupDetailDV.pcf: line 52, column 42
    function valueRange_46 () : java.lang.Object {
      return gw.api.database.Query.make(entity.SecurityZone).select()
    }
    
    // 'value' attribute on TextInput (id=Name) at NewGroupDetailDV.pcf: line 16, column 29
    function valueRoot_5 () : java.lang.Object {
      return Group
    }
    
    // 'value' attribute on TextInput (id=Name) at NewGroupDetailDV.pcf: line 16, column 29
    function value_1 () : java.lang.String {
      return Group.Name
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at NewGroupDetailDV.pcf: line 29, column 40
    function value_12 () : typekey.GroupType {
      return Group.GroupType
    }
    
    // 'value' attribute on GroupInput (id=Parent) at NewGroupDetailDV.pcf: line 37, column 25
    function value_16 () : entity.Group {
      return Group.Parent
    }
    
    // 'value' attribute on UserInput (id=Supervisor) at NewGroupDetailDV.pcf: line 44, column 34
    function value_29 () : entity.User {
      return Group.Supervisor
    }
    
    // 'value' attribute on RangeInput (id=SecurityZone) at NewGroupDetailDV.pcf: line 52, column 42
    function value_42 () : entity.SecurityZone {
      return Group.SecurityZone
    }
    
    // 'value' attribute on TextInput (id=LoadFactor) at NewGroupDetailDV.pcf: line 74, column 40
    function value_52 () : java.lang.Integer {
      return Group.LoadFactor
    }
    
    // 'value' attribute on TextInput (id=NameKanji) at NewGroupDetailDV.pcf: line 22, column 84
    function value_7 () : java.lang.String {
      return Group.NameKanji
    }
    
    // 'valueRange' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_25 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_25 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_25 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_38 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_38 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_38 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=SecurityZone) at NewGroupDetailDV.pcf: line 52, column 42
    function verifyValueRangeIsAllowedType_47 ($$arg :  entity.SecurityZone[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=SecurityZone) at NewGroupDetailDV.pcf: line 52, column 42
    function verifyValueRangeIsAllowedType_47 ($$arg :  gw.api.database.IQueryBeanResult<entity.SecurityZone>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=SecurityZone) at NewGroupDetailDV.pcf: line 52, column 42
    function verifyValueRangeIsAllowedType_47 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=Parent) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_26 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_25(__valueRangeArg)
    }
    
    // 'valueRange' attribute on UserInput (id=Supervisor) at UserWidget.xml: line 6, column 85
    function verifyValueRange_39 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_38(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=SecurityZone) at NewGroupDetailDV.pcf: line 52, column 42
    function verifyValueRange_48 () : void {
      var __valueRangeArg = gw.api.database.Query.make(entity.SecurityZone).select()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_47(__valueRangeArg)
    }
    
    // 'visible' attribute on ListViewInput at NewGroupDetailDV.pcf: line 81, column 64
    function visible_57 () : java.lang.Boolean {
      return LanguageType.getTypeKeys(false).Count > 1
    }
    
    // 'visible' attribute on TextInput (id=NameKanji) at NewGroupDetailDV.pcf: line 22, column 84
    function visible_6 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    
  }
  
  
}