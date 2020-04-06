package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearchRequiredInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivitySearchRequiredInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearchRequiredInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivitySearchRequiredInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionEnabled' attribute on AddressBookContactInput (id=ExternalOwner) at AddressBookContactWidget.xml: line 10, column 154
    function actionEnabled_58 () : java.lang.Boolean {
      return ActivitySearchCriteria.ExternalOwner != null
    }
    
    // 'action' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 9, column 49
    function action_23 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 12, column 49
    function action_25 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 9, column 49
    function action_36 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 12, column 49
    function action_38 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on AddressBookContactInput (id=ExternalOwner) at AddressBookContactWidget.xml: line 12, column 225
    function action_50 () : void {
      AddressBookPickerPopup.push(statictypeof (ActivitySearchCriteria.ExternalOwner))
    }
    
    // 'action' attribute on AddressBookContactInput (id=ExternalOwner) at AddressBookContactWidget.xml: line 14, column 151
    function action_52 () : void {
      ActivitySearchCriteria.ExternalOwner = null
    }
    
    // 'action' attribute on AddressBookContactInput (id=ExternalOwner) at AddressBookContactWidget.xml: line 10, column 154
    function action_53 () : void {
      AddressBookContactDetailPopup.push(externalContactSource.wrap(ActivitySearchCriteria.ExternalOwner),false)
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 10, column 49
    function action_6 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 13, column 49
    function action_8 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 9, column 49
    function action_dest_24 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 12, column 49
    function action_dest_26 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 9, column 49
    function action_dest_37 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 12, column 49
    function action_dest_39 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'action' attribute on AddressBookContactInput (id=ExternalOwner) at AddressBookContactWidget.xml: line 12, column 225
    function action_dest_51 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (ActivitySearchCriteria.ExternalOwner))
    }
    
    // 'action' attribute on AddressBookContactInput (id=ExternalOwner) at AddressBookContactWidget.xml: line 10, column 154
    function action_dest_54 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContactSource.wrap(ActivitySearchCriteria.ExternalOwner),false)
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 10, column 49
    function action_dest_7 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 13, column 49
    function action_dest_9 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'value' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivitySearchCriteria.AssignedToGroup.AssignedToGroup = (__VALUE_TO_SET as entity.Group)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncludeSubGroups) at ActivitySearchRequiredInputSet.pcf: line 33, column 72
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivitySearchCriteria.AssignedToGroup.IncludeSubGroups = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivitySearchCriteria.AssignedToUser = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on TextInput (id=Claims_ClaimNumber) at ActivitySearchRequiredInputSet.pcf: line 22, column 51
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivitySearchCriteria.ClaimNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivitySearchCriteria.CreatedByUser = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on AddressBookContactInput (id=ExternalOwner) at AddressBookContactWidget.xml: line 10, column 154
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      ActivitySearchCriteria.ExternalOwner = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'initialValue' attribute on Variable at ActivitySearchRequiredInputSet.pcf: line 14, column 52
    function initialValue_0 () : gw.api.contact.ExternalContactSource {
      return gw.api.contact.AddressBookUtil.newAddressBookContactSource()
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function valueRange_13 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'valueRange' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function valueRange_30 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'value' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function valueRoot_12 () : java.lang.Object {
      return ActivitySearchCriteria.AssignedToGroup
    }
    
    // 'value' attribute on TextInput (id=Claims_ClaimNumber) at ActivitySearchRequiredInputSet.pcf: line 22, column 51
    function valueRoot_4 () : java.lang.Object {
      return ActivitySearchCriteria
    }
    
    // 'value' attribute on TextInput (id=Claims_ClaimNumber) at ActivitySearchRequiredInputSet.pcf: line 22, column 51
    function value_1 () : java.lang.String {
      return ActivitySearchCriteria.ClaimNumber
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncludeSubGroups) at ActivitySearchRequiredInputSet.pcf: line 33, column 72
    function value_18 () : java.lang.Boolean {
      return ActivitySearchCriteria.AssignedToGroup.IncludeSubGroups
    }
    
    // 'value' attribute on UserInput (id=AssignedToUser) at ActivitySearchRequiredInputSet.pcf: line 40, column 32
    function value_22 () : entity.User {
      return ActivitySearchCriteria.AssignedToUser
    }
    
    // 'value' attribute on UserInput (id=CreatedBy) at ActivitySearchRequiredInputSet.pcf: line 47, column 32
    function value_35 () : entity.User {
      return ActivitySearchCriteria.CreatedByUser
    }
    
    // 'value' attribute on AddressBookContactInput (id=ExternalOwner) at ActivitySearchRequiredInputSet.pcf: line 54, column 53
    function value_48 () : entity.Contact {
      return ActivitySearchCriteria.ExternalOwner
    }
    
    // 'value' attribute on GroupInput (id=AssignedToGroup) at ActivitySearchRequiredInputSet.pcf: line 28, column 71
    function value_5 () : entity.Group {
      return ActivitySearchCriteria.AssignedToGroup.AssignedToGroup
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_14 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_14 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_14 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_31 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_31 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_31 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_44 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_44 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_44 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_15 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_14(__valueRangeArg)
    }
    
    // 'valueRange' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function verifyValueRange_32 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_31(__valueRangeArg)
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRange_45 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_44(__valueRangeArg)
    }
    
    // 'visible' attribute on AddressBookContactInput (id=ExternalOwner) at AddressBookContactWidget.xml: line 12, column 225
    function visible_49 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (ActivitySearchCriteria.ExternalOwner))" != "" && true
    }
    
    property get ActivitySearchCriteria () : ActivitySearchCriteria {
      return getRequireValue("ActivitySearchCriteria", 0) as ActivitySearchCriteria
    }
    
    property set ActivitySearchCriteria ($arg :  ActivitySearchCriteria) {
      setRequireValue("ActivitySearchCriteria", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getVariableValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setVariableValue("externalContactSource", 0, $arg)
    }
    
    
  }
  
  
}