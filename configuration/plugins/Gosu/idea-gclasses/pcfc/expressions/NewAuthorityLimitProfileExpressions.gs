package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/authoritylimits/NewAuthorityLimitProfile.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewAuthorityLimitProfileExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/authoritylimits/NewAuthorityLimitProfile.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAuthorityLimitProfileExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewAuthorityLimitProfile) at NewAuthorityLimitProfile.pcf: line 14, column 105
    function afterCancel_3 () : void {
      AuthorityLimitProfiles.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewAuthorityLimitProfile) at NewAuthorityLimitProfile.pcf: line 14, column 105
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.AuthorityLimitProfiles.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewAuthorityLimitProfile) at NewAuthorityLimitProfile.pcf: line 14, column 105
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      AuthorityLimitProfiles.go()
    }
    
    // 'canVisit' attribute on Page (id=NewAuthorityLimitProfile) at NewAuthorityLimitProfile.pcf: line 14, column 105
    static function canVisit_6 () : java.lang.Boolean {
      return perm.AuthorityLimitProfile.create
    }
    
    // 'def' attribute on ScreenRef at NewAuthorityLimitProfile.pcf: line 22, column 71
    function def_onEnter_1 (def :  pcf.AuthorityLimitProfileDetailScreen) : void {
      def.onEnter(AuthorityLimitProfile)
    }
    
    // 'def' attribute on ScreenRef at NewAuthorityLimitProfile.pcf: line 22, column 71
    function def_refreshVariables_2 (def :  pcf.AuthorityLimitProfileDetailScreen) : void {
      def.refreshVariables(AuthorityLimitProfile)
    }
    
    // 'initialValue' attribute on Variable at NewAuthorityLimitProfile.pcf: line 20, column 37
    function initialValue_0 () : AuthorityLimitProfile {
      return new AuthorityLimitProfile()
    }
    
    // 'parent' attribute on Page (id=NewAuthorityLimitProfile) at NewAuthorityLimitProfile.pcf: line 14, column 105
    static function parent_7 () : pcf.api.Destination {
      return pcf.AuthorityLimitProfiles.createDestination()
    }
    
    property get AuthorityLimitProfile () : AuthorityLimitProfile {
      return getVariableValue("AuthorityLimitProfile", 0) as AuthorityLimitProfile
    }
    
    property set AuthorityLimitProfile ($arg :  AuthorityLimitProfile) {
      setVariableValue("AuthorityLimitProfile", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewAuthorityLimitProfile {
      return super.CurrentLocation as pcf.NewAuthorityLimitProfile
    }
    
    
  }
  
  
}