package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AuthorityLimitProfileDetailPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AuthorityLimitProfileDetailPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (AuthorityLimitProfile :  AuthorityLimitProfile) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=AuthorityLimitProfileDetailPage) at AuthorityLimitProfileDetailPage.pcf: line 13, column 107
    function afterCancel_2 () : void {
      AuthorityLimitProfiles.go()
    }
    
    // 'afterCancel' attribute on Page (id=AuthorityLimitProfileDetailPage) at AuthorityLimitProfileDetailPage.pcf: line 13, column 107
    function afterCancel_dest_3 () : pcf.api.Destination {
      return pcf.AuthorityLimitProfiles.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=AuthorityLimitProfileDetailPage) at AuthorityLimitProfileDetailPage.pcf: line 13, column 107
    function afterCommit_4 (TopLocation :  pcf.api.Location) : void {
      AuthorityLimitProfileDetailPage.go(AuthorityLimitProfile)
    }
    
    // 'canEdit' attribute on Page (id=AuthorityLimitProfileDetailPage) at AuthorityLimitProfileDetailPage.pcf: line 13, column 107
    function canEdit_5 () : java.lang.Boolean {
      return perm.AuthorityLimitProfile.edit
    }
    
    // 'canVisit' attribute on Page (id=AuthorityLimitProfileDetailPage) at AuthorityLimitProfileDetailPage.pcf: line 13, column 107
    static function canVisit_6 (AuthorityLimitProfile :  AuthorityLimitProfile) : java.lang.Boolean {
      return perm.AuthorityLimitProfile.view
    }
    
    // 'def' attribute on ScreenRef at AuthorityLimitProfileDetailPage.pcf: line 20, column 71
    function def_onEnter_0 (def :  pcf.AuthorityLimitProfileDetailScreen) : void {
      def.onEnter(AuthorityLimitProfile)
    }
    
    // 'def' attribute on ScreenRef at AuthorityLimitProfileDetailPage.pcf: line 20, column 71
    function def_refreshVariables_1 (def :  pcf.AuthorityLimitProfileDetailScreen) : void {
      def.refreshVariables(AuthorityLimitProfile)
    }
    
    // 'parent' attribute on Page (id=AuthorityLimitProfileDetailPage) at AuthorityLimitProfileDetailPage.pcf: line 13, column 107
    static function parent_7 (AuthorityLimitProfile :  AuthorityLimitProfile) : pcf.api.Destination {
      return pcf.AuthorityLimitProfiles.createDestination()
    }
    
    // 'title' attribute on Page (id=AuthorityLimitProfileDetailPage) at AuthorityLimitProfileDetailPage.pcf: line 13, column 107
    static function title_8 (AuthorityLimitProfile :  AuthorityLimitProfile) : java.lang.Object {
      return DisplayKey.get("Web.Admin.AuthorityLimitProfileDetail", AuthorityLimitProfile.Name)
    }
    
    property get AuthorityLimitProfile () : AuthorityLimitProfile {
      return getVariableValue("AuthorityLimitProfile", 0) as AuthorityLimitProfile
    }
    
    property set AuthorityLimitProfile ($arg :  AuthorityLimitProfile) {
      setVariableValue("AuthorityLimitProfile", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.AuthorityLimitProfileDetailPage {
      return super.CurrentLocation as pcf.AuthorityLimitProfileDetailPage
    }
    
    
  }
  
  
}