package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchRequiredInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSearchRequiredInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchRequiredInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearchRequiredInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 10, column 49
    function action_37 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 13, column 49
    function action_39 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 9, column 49
    function action_59 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 12, column 49
    function action_61 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 9, column 49
    function action_75 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 12, column 49
    function action_77 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 10, column 49
    function action_dest_38 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 13, column 49
    function action_dest_40 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 9, column 49
    function action_dest_60 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 12, column 49
    function action_dest_62 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 9, column 49
    function action_dest_76 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 12, column 49
    function action_dest_78 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'available' attribute on GroupInput (id=AssignedToGroup) at ClaimSearchRequiredInputSet.pcf: line 72, column 68
    function available_35 () : java.lang.Boolean {
      return liveClaimFlag
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchRequiredInputSet.pcf: line 55, column 54
    function def_onEnter_21 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchRequiredInputSet.pcf: line 55, column 54
    function def_onEnter_23 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchRequiredInputSet.pcf: line 58, column 54
    function def_onEnter_26 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchRequiredInputSet.pcf: line 58, column 54
    function def_onEnter_28 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchRequiredInputSet.pcf: line 55, column 54
    function def_refreshVariables_22 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchRequiredInputSet.pcf: line 55, column 54
    function def_refreshVariables_24 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchRequiredInputSet.pcf: line 58, column 54
    function def_refreshVariables_27 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimSearchRequiredInputSet.pcf: line 58, column 54
    function def_refreshVariables_29 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'value' attribute on TextInput (id=VinNumber) at ClaimSearchRequiredInputSet.pcf: line 112, column 46
    function defaultSetter_102 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.vinNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=LicensePlate) at ClaimSearchRequiredInputSet.pcf: line 119, column 49
    function defaultSetter_108 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.licensePlate = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=UMRNumber) at ClaimSearchRequiredInputSet.pcf: line 39, column 44
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.UMR_Ext = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=UCRNumber) at ClaimSearchRequiredInputSet.pcf: line 45, column 44
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.UCR_Ext = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=SearchFor) at ClaimSearchRequiredInputSet.pcf: line 52, column 54
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.NameSearchType = (__VALUE_TO_SET as typekey.ClaimSearchNameSearchType)
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at ClaimSearchRequiredInputSet.pcf: line 26, column 48
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.ClaimNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=TaxID) at ClaimSearchRequiredInputSet.pcf: line 64, column 55
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.NameCriteria.TaxId = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.AssignedToGroup.AssignedToGroup = (__VALUE_TO_SET as entity.Group)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncludeSubGroups) at ClaimSearchRequiredInputSet.pcf: line 78, column 69
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.AssignedToGroup.IncludeSubGroups = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function defaultSetter_65 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.AssignedToUser = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ClaimSearchRequiredInputSet.pcf: line 32, column 49
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.PolicyNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function defaultSetter_81 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.CreatedByUser = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on RangeInput (id=CatNumber) at ClaimSearchRequiredInputSet.pcf: line 105, column 39
    function defaultSetter_93 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'initialValue' attribute on Variable at ClaimSearchRequiredInputSet.pcf: line 18, column 23
    function initialValue_0 () : boolean {
      return ClaimSearchCriteria.ClaimSearchType == ClaimSearchType.TC_ACTIVE
    }
    
    // 'mode' attribute on InputSetRef at ClaimSearchRequiredInputSet.pcf: line 55, column 54
    function mode_25 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function valueRange_45 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'valueRange' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function valueRange_67 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'valueRange' attribute on RangeInput (id=CatNumber) at ClaimSearchRequiredInputSet.pcf: line 105, column 39
    function valueRange_95 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'value' attribute on TextInput (id=TaxID) at ClaimSearchRequiredInputSet.pcf: line 64, column 55
    function valueRoot_34 () : java.lang.Object {
      return ClaimSearchCriteria.NameCriteria
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at ClaimSearchRequiredInputSet.pcf: line 26, column 48
    function valueRoot_4 () : java.lang.Object {
      return ClaimSearchCriteria
    }
    
    // 'value' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function valueRoot_44 () : java.lang.Object {
      return ClaimSearchCriteria.AssignedToGroup
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at ClaimSearchRequiredInputSet.pcf: line 26, column 48
    function value_1 () : java.lang.String {
      return ClaimSearchCriteria.ClaimNumber
    }
    
    // 'value' attribute on TextInput (id=LicensePlate) at ClaimSearchRequiredInputSet.pcf: line 119, column 49
    function value_105 () : java.lang.String {
      return ClaimSearchCriteria.licensePlate
    }
    
    // 'value' attribute on TextInput (id=UCRNumber) at ClaimSearchRequiredInputSet.pcf: line 45, column 44
    function value_13 () : java.lang.String {
      return ClaimSearchCriteria.UCR_Ext
    }
    
    // 'value' attribute on TypeKeyInput (id=SearchFor) at ClaimSearchRequiredInputSet.pcf: line 52, column 54
    function value_17 () : typekey.ClaimSearchNameSearchType {
      return ClaimSearchCriteria.NameSearchType
    }
    
    // 'value' attribute on TextInput (id=TaxID) at ClaimSearchRequiredInputSet.pcf: line 64, column 55
    function value_31 () : java.lang.String {
      return ClaimSearchCriteria.NameCriteria.TaxId
    }
    
    // 'value' attribute on GroupInput (id=AssignedToGroup) at ClaimSearchRequiredInputSet.pcf: line 72, column 68
    function value_36 () : entity.Group {
      return ClaimSearchCriteria.AssignedToGroup.AssignedToGroup
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ClaimSearchRequiredInputSet.pcf: line 32, column 49
    function value_5 () : java.lang.String {
      return ClaimSearchCriteria.PolicyNumber
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncludeSubGroups) at ClaimSearchRequiredInputSet.pcf: line 78, column 69
    function value_52 () : java.lang.Boolean {
      return ClaimSearchCriteria.AssignedToGroup.IncludeSubGroups
    }
    
    // 'value' attribute on UserInput (id=AssignedToUser) at ClaimSearchRequiredInputSet.pcf: line 87, column 32
    function value_58 () : entity.User {
      return ClaimSearchCriteria.AssignedToUser
    }
    
    // 'value' attribute on UserInput (id=CreatedBy) at ClaimSearchRequiredInputSet.pcf: line 95, column 32
    function value_74 () : entity.User {
      return ClaimSearchCriteria.CreatedByUser
    }
    
    // 'value' attribute on TextInput (id=UMRNumber) at ClaimSearchRequiredInputSet.pcf: line 39, column 44
    function value_9 () : java.lang.String {
      return ClaimSearchCriteria.UMR_Ext
    }
    
    // 'value' attribute on RangeInput (id=CatNumber) at ClaimSearchRequiredInputSet.pcf: line 105, column 39
    function value_90 () : entity.Catastrophe {
      return ClaimSearchCriteria.Catastrophe
    }
    
    // 'value' attribute on TextInput (id=VinNumber) at ClaimSearchRequiredInputSet.pcf: line 112, column 46
    function value_99 () : java.lang.String {
      return ClaimSearchCriteria.vinNumber
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_46 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_46 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_46 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_68 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_68 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_68 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_84 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_84 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_84 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=CatNumber) at ClaimSearchRequiredInputSet.pcf: line 105, column 39
    function verifyValueRangeIsAllowedType_96 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=CatNumber) at ClaimSearchRequiredInputSet.pcf: line 105, column 39
    function verifyValueRangeIsAllowedType_96 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=CatNumber) at ClaimSearchRequiredInputSet.pcf: line 105, column 39
    function verifyValueRangeIsAllowedType_96 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedToGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_47 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_46(__valueRangeArg)
    }
    
    // 'valueRange' attribute on UserInput (id=AssignedToUser) at UserWidget.xml: line 6, column 85
    function verifyValueRange_69 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_68(__valueRangeArg)
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRange_85 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_84(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=CatNumber) at ClaimSearchRequiredInputSet.pcf: line 105, column 39
    function verifyValueRange_97 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_96(__valueRangeArg)
    }
    
    property get ClaimSearchCriteria () : ClaimSearchCriteria {
      return getRequireValue("ClaimSearchCriteria", 0) as ClaimSearchCriteria
    }
    
    property set ClaimSearchCriteria ($arg :  ClaimSearchCriteria) {
      setRequireValue("ClaimSearchCriteria", 0, $arg)
    }
    
    property get liveClaimFlag () : boolean {
      return getVariableValue("liveClaimFlag", 0) as java.lang.Boolean
    }
    
    property set liveClaimFlag ($arg :  boolean) {
      setVariableValue("liveClaimFlag", 0, $arg)
    }
    
    
  }
  
  
}