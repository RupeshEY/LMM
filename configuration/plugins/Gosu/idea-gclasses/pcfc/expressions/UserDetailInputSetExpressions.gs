package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/preferences/UserDetailInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserDetailInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/preferences/UserDetailInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserDetailInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on UserInput (id=BackupUser) at UserWidget.xml: line 9, column 49
    function action_43 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=BackupUser) at UserWidget.xml: line 12, column 49
    function action_45 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on UserInput (id=BackupUser) at UserWidget.xml: line 9, column 49
    function action_dest_44 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=BackupUser) at UserWidget.xml: line 12, column 49
    function action_dest_46 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'def' attribute on InputSetRef (id=Name) at UserDetailInputSet.pcf: line 20, column 54
    function def_onEnter_1 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(UserOwner)
    }
    
    // 'def' attribute on InputSetRef (id=Name) at UserDetailInputSet.pcf: line 20, column 54
    function def_onEnter_3 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(UserOwner)
    }
    
    // 'def' attribute on InputSetRef (id=Name) at UserDetailInputSet.pcf: line 20, column 54
    function def_refreshVariables_2 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(UserOwner)
    }
    
    // 'def' attribute on InputSetRef (id=Name) at UserDetailInputSet.pcf: line 20, column 54
    function def_refreshVariables_4 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(UserOwner)
    }
    
    // 'value' attribute on ConfirmPasswordInput (id=Password) at UserDetailInputSet.pcf: line 33, column 41
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.Credential.Password = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Active) at UserDetailInputSet.pcf: line 39, column 39
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.Credential.Active = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AccountLocked) at UserDetailInputSet.pcf: line 44, column 35
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.AccountLocked = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=VacationStatus) at UserDetailInputSet.pcf: line 51, column 47
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.VacationStatus = (__VALUE_TO_SET as typekey.VacationStatusType)
    }
    
    // 'value' attribute on UserInput (id=BackupUser) at UserWidget.xml: line 6, column 85
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.BackupUser = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on TextInput (id=SessionTimeout) at UserDetailInputSet.pcf: line 64, column 38
    function defaultSetter_57 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.SessionTimeoutSecs = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=ClassUserId) at UserDetailInputSet.pcf: line 73, column 48
    function defaultSetter_61 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.Credential.ClassUserId_Ext = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=AccountCode) at UserDetailInputSet.pcf: line 79, column 48
    function defaultSetter_65 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.Credential.AccountCode_Ext = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Username) at UserDetailInputSet.pcf: line 26, column 41
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.Credential.UserName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at UserDetailInputSet.pcf: line 16, column 46
    function initialValue_0 () : gw.api.name.PersonNameDelegate {
      return new gw.api.name.PersonNameDelegate(User.Contact)
    }
    
    // 'mode' attribute on InputSetRef (id=Name) at UserDetailInputSet.pcf: line 20, column 54
    function mode_5 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'required' attribute on ConfirmPasswordInput (id=Password) at UserDetailInputSet.pcf: line 33, column 41
    function required_11 () : java.lang.Boolean {
      return User.New
    }
    
    // 'valueRange' attribute on UserInput (id=BackupUser) at UserWidget.xml: line 6, column 85
    function valueRange_50 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'value' attribute on BooleanRadioInput (id=AccountLocked) at UserDetailInputSet.pcf: line 44, column 35
    function valueRoot_37 () : java.lang.Object {
      return User
    }
    
    // 'value' attribute on TextInput (id=Username) at UserDetailInputSet.pcf: line 26, column 41
    function valueRoot_9 () : java.lang.Object {
      return User.Credential
    }
    
    // 'value' attribute on ConfirmPasswordInput (id=Password) at UserDetailInputSet.pcf: line 33, column 41
    function value_10 () : java.lang.String {
      return User.Credential.Password
    }
    
    // 'value' attribute on BooleanRadioInput (id=Active) at UserDetailInputSet.pcf: line 39, column 39
    function value_30 () : java.lang.Boolean {
      return User.Credential.Active
    }
    
    // 'value' attribute on BooleanRadioInput (id=AccountLocked) at UserDetailInputSet.pcf: line 44, column 35
    function value_34 () : java.lang.Boolean {
      return User.AccountLocked
    }
    
    // 'value' attribute on TypeKeyInput (id=VacationStatus) at UserDetailInputSet.pcf: line 51, column 47
    function value_38 () : typekey.VacationStatusType {
      return User.VacationStatus
    }
    
    // 'value' attribute on UserInput (id=BackupUser) at UserDetailInputSet.pcf: line 57, column 32
    function value_42 () : entity.User {
      return User.BackupUser
    }
    
    // 'value' attribute on TextInput (id=SessionTimeout) at UserDetailInputSet.pcf: line 64, column 38
    function value_55 () : java.lang.Integer {
      return User.SessionTimeoutSecs
    }
    
    // 'value' attribute on TextInput (id=ClassUserId) at UserDetailInputSet.pcf: line 73, column 48
    function value_59 () : java.lang.String {
      return User.Credential.ClassUserId_Ext
    }
    
    // 'value' attribute on TextInput (id=Username) at UserDetailInputSet.pcf: line 26, column 41
    function value_6 () : java.lang.String {
      return User.Credential.UserName
    }
    
    // 'value' attribute on TextInput (id=AccountCode) at UserDetailInputSet.pcf: line 79, column 48
    function value_63 () : java.lang.String {
      return User.Credential.AccountCode_Ext
    }
    
    // 'valueRange' attribute on UserInput (id=BackupUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_51 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=BackupUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_51 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=BackupUser) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_51 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=BackupUser) at UserWidget.xml: line 6, column 85
    function verifyValueRange_52 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_51(__valueRangeArg)
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    property get UserOwner () : gw.api.name.NameOwner {
      return getRequireValue("UserOwner", 0) as gw.api.name.NameOwner
    }
    
    property set UserOwner ($arg :  gw.api.name.NameOwner) {
      setRequireValue("UserOwner", 0, $arg)
    }
    
    property get name () : gw.api.name.PersonNameDelegate {
      return getVariableValue("name", 0) as gw.api.name.PersonNameDelegate
    }
    
    property set name ($arg :  gw.api.name.PersonNameDelegate) {
      setVariableValue("name", 0, $arg)
    }
    
    
  }
  
  
}