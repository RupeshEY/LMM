package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAuthorityLimitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserAuthorityLimitsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAuthorityLimitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAuthorityLimitsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at UserAuthorityLimitsDV.pcf: line 49, column 244
    function def_onEnter_19 (def :  pcf.EditableAuthorityLimitsLV) : void {
      def.onEnter(User)
    }
    
    // 'def' attribute on ListViewInput at UserAuthorityLimitsDV.pcf: line 49, column 244
    function def_refreshVariables_20 (def :  pcf.EditableAuthorityLimitsLV) : void {
      def.refreshVariables(User)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at UserAuthorityLimitsDV.pcf: line 38, column 99
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      User.AuthorityProfile.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on RangeInput (id=AuthorityLimitsProfile) at UserAuthorityLimitsDV.pcf: line 21, column 50
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      AuthorityLimitsProfile = (__VALUE_TO_SET as entity.AuthorityLimitProfile)
    }
    
    // 'editable' attribute on RangeInput (id=AuthorityLimitsProfile) at UserAuthorityLimitsDV.pcf: line 21, column 50
    function editable_0 () : java.lang.Boolean {
      return User.AuthorityProfile == null  or (User.AuthorityProfile != null and !User.AuthorityProfile.isFieldChanged("Limits"))
    }
    
    // 'editable' attribute on ListViewInput at UserAuthorityLimitsDV.pcf: line 49, column 244
    function editable_17 () : java.lang.Boolean {
      return User.AuthorityProfile != null and User.AuthorityProfile.Custom
    }
    
    // 'editable' attribute on DetailViewPanel (id=UserAuthorityLimitsDV) at UserAuthorityLimitsDV.pcf: line 7, column 32
    function editable_21 () : java.lang.Boolean {
      return perm.AuthorityLimitProfile.edit
    }
    
    // 'validationExpression' attribute on ListViewInput at UserAuthorityLimitsDV.pcf: line 49, column 244
    function validationExpression_18 () : java.lang.Object {
      return User.AuthorityProfile != null and !gw.plugin.authoritylimits.AuthorityLimitsConfiguration.resolveAuthorityLimits(User.AuthorityProfile) ? gw.plugin.authoritylimits.AuthorityLimitsConfiguration.ErrorString : null
    }
    
    // 'valueRange' attribute on RangeInput (id=AuthorityLimitsProfile) at UserAuthorityLimitsDV.pcf: line 21, column 50
    function valueRange_5 () : java.lang.Object {
      return gw.api.admin.UserAuthorityLimitUtil.getProfiles(User)
    }
    
    // 'value' attribute on TextInput (id=Description) at UserAuthorityLimitsDV.pcf: line 29, column 52
    function valueRoot_10 () : java.lang.Object {
      return User.AuthorityProfile
    }
    
    // 'value' attribute on RangeInput (id=AuthorityLimitsProfile) at UserAuthorityLimitsDV.pcf: line 21, column 50
    function value_1 () : entity.AuthorityLimitProfile {
      return AuthorityLimitsProfile
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at UserAuthorityLimitsDV.pcf: line 38, column 99
    function value_12 () : typekey.Currency {
      return User.AuthorityProfile.Currency
    }
    
    // 'value' attribute on TextInput (id=Description) at UserAuthorityLimitsDV.pcf: line 29, column 52
    function value_8 () : java.lang.String {
      return User.AuthorityProfile.Description
    }
    
    // 'valueRange' attribute on RangeInput (id=AuthorityLimitsProfile) at UserAuthorityLimitsDV.pcf: line 21, column 50
    function verifyValueRangeIsAllowedType_6 ($$arg :  entity.AuthorityLimitProfile[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AuthorityLimitsProfile) at UserAuthorityLimitsDV.pcf: line 21, column 50
    function verifyValueRangeIsAllowedType_6 ($$arg :  gw.api.database.IQueryBeanResult<entity.AuthorityLimitProfile>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AuthorityLimitsProfile) at UserAuthorityLimitsDV.pcf: line 21, column 50
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AuthorityLimitsProfile) at UserAuthorityLimitsDV.pcf: line 21, column 50
    function verifyValueRange_7 () : void {
      var __valueRangeArg = gw.api.admin.UserAuthorityLimitUtil.getProfiles(User)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at UserAuthorityLimitsDV.pcf: line 38, column 99
    function visible_11 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode() and User.AuthorityProfile.Custom
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    
    property get AuthorityLimitsProfile() : AuthorityLimitProfile {
        var p = User.AuthorityProfile
        if (p == null) {
          var x = gw.api.admin.UserAuthorityLimitUtil.getProfiles(User)
          if (x != null && !x.IsEmpty) {
            p = x[0]
            User.changeAuthorityProfile(p)
          }
        }
        return p
      }
      
      property set AuthorityLimitsProfile(profile : AuthorityLimitProfile) {
        User.changeAuthorityProfile(profile)
      }
    
        
    
    
  }
  
  
}