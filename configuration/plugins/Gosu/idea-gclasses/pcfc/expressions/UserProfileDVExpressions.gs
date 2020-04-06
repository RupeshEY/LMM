package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserProfileDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserProfileDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserProfileDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserProfileDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=UserContactInputSet) at UserProfileDV.pcf: line 20, column 35
    function def_onEnter_1 (def :  pcf.UserPreferencesContactInputSet) : void {
      def.onEnter(User, User.Contact.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=GlobalizationPreferences) at UserProfileDV.pcf: line 43, column 40
    function def_onEnter_13 (def :  pcf.UserPreferencesInputSet) : void {
      def.onEnter(User)
    }
    
    // 'def' attribute on InputSetRef (id=GlobalizationPreferences) at UserProfileDV.pcf: line 43, column 40
    function def_refreshVariables_14 (def :  pcf.UserPreferencesInputSet) : void {
      def.refreshVariables(User)
    }
    
    // 'def' attribute on InputSetRef (id=UserContactInputSet) at UserProfileDV.pcf: line 20, column 35
    function def_refreshVariables_2 (def :  pcf.UserPreferencesContactInputSet) : void {
      def.refreshVariables(User, User.Contact.AddressOwner)
    }
    
    // 'value' attribute on TypeKeyInput (id=Experience) at UserProfileDV.pcf: line 40, column 49
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.ExperienceLevel = (__VALUE_TO_SET as typekey.UserExperienceType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ExternalUser) at UserProfileDV.pcf: line 49, column 36
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.ExternalUser = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyType) at UserProfileDV.pcf: line 58, column 41
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.PolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType) at UserProfileDV.pcf: line 64, column 38
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.LossType = (__VALUE_TO_SET as typekey.LossType)
    }
    
    // 'value' attribute on TypeKeyInput (id=QuickClaim) at UserProfileDV.pcf: line 74, column 40
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.QuickClaim = (__VALUE_TO_SET as typekey.QuickClaimDefault)
    }
    
    // 'value' attribute on TextInput (id=EmployeeID) at UserProfileDV.pcf: line 26, column 46
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.Contact.EmployeeNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'label' attribute on Label at UserProfileDV.pcf: line 15, column 47
    function label_0 () : java.lang.String {
      return linkStatus.LinkStatusMessage
    }
    
    // 'onChange' attribute on PostOnChange at UserProfileDV.pcf: line 66, column 44
    function onChange_23 () : void {
      User.QuickClaim=null
    }
    
    // 'value' attribute on TypeKeyInput (id=Experience) at UserProfileDV.pcf: line 40, column 49
    function valueRoot_12 () : java.lang.Object {
      return User
    }
    
    // 'value' attribute on TextInput (id=EmployeeID) at UserProfileDV.pcf: line 26, column 46
    function valueRoot_6 () : java.lang.Object {
      return User.Contact
    }
    
    // 'value' attribute on BooleanRadioInput (id=ExternalUser) at UserProfileDV.pcf: line 49, column 36
    function value_15 () : java.lang.Boolean {
      return User.ExternalUser
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyType) at UserProfileDV.pcf: line 58, column 41
    function value_19 () : typekey.PolicyType {
      return User.PolicyType
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType) at UserProfileDV.pcf: line 64, column 38
    function value_24 () : typekey.LossType {
      return User.LossType
    }
    
    // 'value' attribute on TypeKeyInput (id=QuickClaim) at UserProfileDV.pcf: line 74, column 40
    function value_29 () : typekey.QuickClaimDefault {
      return User.QuickClaim
    }
    
    // 'value' attribute on TextInput (id=EmployeeID) at UserProfileDV.pcf: line 26, column 46
    function value_3 () : java.lang.String {
      return User.Contact.EmployeeNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=ProximitySearchStatus) at UserProfileDV.pcf: line 31, column 52
    function value_7 () : typekey.ProximitySearchStatus {
      return gw.api.geocode.GeocodeScriptHelper.categorizeGeocodeStatus(User.Contact.PrimaryAddress.GeocodeStatus)
    }
    
    // 'value' attribute on TypeKeyInput (id=Experience) at UserProfileDV.pcf: line 40, column 49
    function value_9 () : typekey.UserExperienceType {
      return User.ExperienceLevel
    }
    
    // 'visible' attribute on TypeKeyInput (id=QuickClaim) at UserProfileDV.pcf: line 74, column 40
    function visible_28 () : java.lang.Boolean {
      return User.LossType!=null
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getRequireValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setRequireValue("linkStatus", 0, $arg)
    }
    
    
  }
  
  
}