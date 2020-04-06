package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/checks/PaymentSearchRequiredInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PaymentSearchRequiredInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/search/checks/PaymentSearchRequiredInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentSearchRequiredInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on UserInput (id=ApprovedByUser) at UserWidget.xml: line 9, column 49
    function action_22 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=ApprovedByUser) at UserWidget.xml: line 12, column 49
    function action_24 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 9, column 49
    function action_35 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 12, column 49
    function action_37 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on GroupInput (id=ApprovedByGroup) at GroupWidget.xml: line 10, column 49
    function action_5 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupInput (id=ApprovedByGroup) at GroupWidget.xml: line 13, column 49
    function action_7 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on UserInput (id=ApprovedByUser) at UserWidget.xml: line 9, column 49
    function action_dest_23 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=ApprovedByUser) at UserWidget.xml: line 12, column 49
    function action_dest_25 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 9, column 49
    function action_dest_36 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 12, column 49
    function action_dest_38 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'action' attribute on GroupInput (id=ApprovedByGroup) at GroupWidget.xml: line 10, column 49
    function action_dest_6 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupInput (id=ApprovedByGroup) at GroupWidget.xml: line 13, column 49
    function action_dest_8 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchRequiredInputSet.pcf: line 58, column 54
    function def_onEnter_55 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(PaymentSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchRequiredInputSet.pcf: line 58, column 54
    function def_onEnter_57 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(PaymentSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchRequiredInputSet.pcf: line 61, column 54
    function def_onEnter_60 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(PaymentSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchRequiredInputSet.pcf: line 61, column 54
    function def_onEnter_62 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(PaymentSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchRequiredInputSet.pcf: line 58, column 54
    function def_refreshVariables_56 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(PaymentSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchRequiredInputSet.pcf: line 58, column 54
    function def_refreshVariables_58 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(PaymentSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchRequiredInputSet.pcf: line 61, column 54
    function def_refreshVariables_61 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(PaymentSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchRequiredInputSet.pcf: line 61, column 54
    function def_refreshVariables_63 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(PaymentSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'value' attribute on GroupInput (id=ApprovedByGroup) at GroupWidget.xml: line 7, column 52
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      PaymentSearchCriteria.ApprovedByGroup.AssignedToGroup = (__VALUE_TO_SET as entity.Group)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncludeSubGroups) at PaymentSearchRequiredInputSet.pcf: line 29, column 71
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      PaymentSearchCriteria.ApprovedByGroup.IncludeSubGroups = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at PaymentSearchRequiredInputSet.pcf: line 18, column 50
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      PaymentSearchCriteria.ClaimNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on UserInput (id=ApprovedByUser) at UserWidget.xml: line 6, column 85
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      PaymentSearchCriteria.ApprovedByUser = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      PaymentSearchCriteria.CreatedByUser = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at PaymentSearchRequiredInputSet.pcf: line 49, column 50
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      PaymentSearchCriteria.CheckNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=InvoiceNumber) at PaymentSearchRequiredInputSet.pcf: line 55, column 52
    function defaultSetter_53 (__VALUE_TO_SET :  java.lang.Object) : void {
      PaymentSearchCriteria.InvoiceNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=TaxID) at PaymentSearchRequiredInputSet.pcf: line 67, column 57
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      PaymentSearchCriteria.NameCriteria.TaxId = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'mode' attribute on InputSetRef at PaymentSearchRequiredInputSet.pcf: line 58, column 54
    function mode_59 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'valueRange' attribute on GroupInput (id=ApprovedByGroup) at GroupWidget.xml: line 7, column 52
    function valueRange_12 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedByUser) at UserWidget.xml: line 6, column 85
    function valueRange_29 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'value' attribute on GroupInput (id=ApprovedByGroup) at GroupWidget.xml: line 7, column 52
    function valueRoot_11 () : java.lang.Object {
      return PaymentSearchCriteria.ApprovedByGroup
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at PaymentSearchRequiredInputSet.pcf: line 18, column 50
    function valueRoot_3 () : java.lang.Object {
      return PaymentSearchCriteria
    }
    
    // 'value' attribute on TextInput (id=TaxID) at PaymentSearchRequiredInputSet.pcf: line 67, column 57
    function valueRoot_68 () : java.lang.Object {
      return PaymentSearchCriteria.NameCriteria
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at PaymentSearchRequiredInputSet.pcf: line 18, column 50
    function value_0 () : java.lang.String {
      return PaymentSearchCriteria.ClaimNumber
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncludeSubGroups) at PaymentSearchRequiredInputSet.pcf: line 29, column 71
    function value_17 () : java.lang.Boolean {
      return PaymentSearchCriteria.ApprovedByGroup.IncludeSubGroups
    }
    
    // 'value' attribute on UserInput (id=ApprovedByUser) at PaymentSearchRequiredInputSet.pcf: line 36, column 32
    function value_21 () : entity.User {
      return PaymentSearchCriteria.ApprovedByUser
    }
    
    // 'value' attribute on UserInput (id=CreatedBy) at PaymentSearchRequiredInputSet.pcf: line 43, column 32
    function value_34 () : entity.User {
      return PaymentSearchCriteria.CreatedByUser
    }
    
    // 'value' attribute on GroupInput (id=ApprovedByGroup) at PaymentSearchRequiredInputSet.pcf: line 24, column 70
    function value_4 () : entity.Group {
      return PaymentSearchCriteria.ApprovedByGroup.AssignedToGroup
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at PaymentSearchRequiredInputSet.pcf: line 49, column 50
    function value_47 () : java.lang.String {
      return PaymentSearchCriteria.CheckNumber
    }
    
    // 'value' attribute on TextInput (id=InvoiceNumber) at PaymentSearchRequiredInputSet.pcf: line 55, column 52
    function value_51 () : java.lang.String {
      return PaymentSearchCriteria.InvoiceNumber
    }
    
    // 'value' attribute on TextInput (id=TaxID) at PaymentSearchRequiredInputSet.pcf: line 67, column 57
    function value_65 () : java.lang.String {
      return PaymentSearchCriteria.NameCriteria.TaxId
    }
    
    // 'valueRange' attribute on GroupInput (id=ApprovedByGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_13 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=ApprovedByGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_13 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=ApprovedByGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedByUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_30 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedByUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_30 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedByUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_30 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_43 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_43 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_43 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=ApprovedByGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_14 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedByUser) at UserWidget.xml: line 6, column 85
    function verifyValueRange_31 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_30(__valueRangeArg)
    }
    
    // 'valueRange' attribute on UserInput (id=CreatedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRange_44 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_43(__valueRangeArg)
    }
    
    property get PaymentSearchCriteria () : PaymentSearchCriteria {
      return getRequireValue("PaymentSearchCriteria", 0) as PaymentSearchCriteria
    }
    
    property set PaymentSearchCriteria ($arg :  PaymentSearchCriteria) {
      setRequireValue("PaymentSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}