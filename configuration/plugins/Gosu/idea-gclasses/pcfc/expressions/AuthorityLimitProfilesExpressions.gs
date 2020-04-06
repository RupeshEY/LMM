package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfiles.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AuthorityLimitProfilesExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfiles.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AuthorityLimitProfilesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=AuthorityLimitProfiles_AddButton) at AuthorityLimitProfiles.pcf: line 21, column 56
    function action_2 () : void {
      NewAuthorityLimitProfile.go()
    }
    
    // 'action' attribute on ToolbarButton (id=AuthorityLimitProfiles_AddButton) at AuthorityLimitProfiles.pcf: line 21, column 56
    function action_dest_3 () : pcf.api.Destination {
      return pcf.NewAuthorityLimitProfile.createDestination()
    }
    
    // 'canVisit' attribute on Page (id=AuthorityLimitProfiles) at AuthorityLimitProfiles.pcf: line 8, column 110
    static function canVisit_8 () : java.lang.Boolean {
      return perm.AuthorityLimitProfile.view
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AuthorityLimitProfiles_DeleteButton) at AuthorityLimitProfiles.pcf: line 28, column 56
    function checkedRowAction_5 (element :  entity.AuthorityLimitProfile, CheckedValue :  entity.AuthorityLimitProfile) : void {
      gw.api.admin.AdminUtil.deleteLimit(CheckedValue)
    }
    
    // 'def' attribute on PanelRef at AuthorityLimitProfiles.pcf: line 31, column 68
    function def_onEnter_6 (def :  pcf.AuthorityLimitProfilesLV) : void {
      def.onEnter(AllAuthorityLimitProfiles)
    }
    
    // 'def' attribute on PanelRef at AuthorityLimitProfiles.pcf: line 31, column 68
    function def_refreshVariables_7 (def :  pcf.AuthorityLimitProfilesLV) : void {
      def.refreshVariables(AllAuthorityLimitProfiles)
    }
    
    // 'initialValue' attribute on Variable at AuthorityLimitProfiles.pcf: line 12, column 77
    function initialValue_0 () : gw.api.database.IQueryBeanResult<AuthorityLimitProfile> {
      return AuthorityLimitProfile.finder.findAllNonCustomInstances()
    }
    
    // Page (id=AuthorityLimitProfiles) at AuthorityLimitProfiles.pcf: line 8, column 110
    static function parent_9 () : pcf.api.Destination {
      return pcf.UsersAndSecurity.createDestination()
    }
    
    // 'visible' attribute on ToolbarButton (id=AuthorityLimitProfiles_AddButton) at AuthorityLimitProfiles.pcf: line 21, column 56
    function visible_1 () : java.lang.Boolean {
      return perm.AuthorityLimitProfile.create
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=AuthorityLimitProfiles_DeleteButton) at AuthorityLimitProfiles.pcf: line 28, column 56
    function visible_4 () : java.lang.Boolean {
      return perm.AuthorityLimitProfile.delete
    }
    
    property get AllAuthorityLimitProfiles () : gw.api.database.IQueryBeanResult<AuthorityLimitProfile> {
      return getVariableValue("AllAuthorityLimitProfiles", 0) as gw.api.database.IQueryBeanResult<AuthorityLimitProfile>
    }
    
    property set AllAuthorityLimitProfiles ($arg :  gw.api.database.IQueryBeanResult<AuthorityLimitProfile>) {
      setVariableValue("AllAuthorityLimitProfiles", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.AuthorityLimitProfiles {
      return super.CurrentLocation as pcf.AuthorityLimitProfiles
    }
    
    
  }
  
  
}