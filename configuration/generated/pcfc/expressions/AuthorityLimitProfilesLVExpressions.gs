package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AuthorityLimitProfilesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AuthorityLimitProfilesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at AuthorityLimitProfilesLV.pcf: line 29, column 47
    function sortValue_0 (AuthorityLimitProfile :  entity.AuthorityLimitProfile) : java.lang.Object {
      return AuthorityLimitProfile.Name
    }
    
    // 'value' attribute on RowIterator at AuthorityLimitProfilesLV.pcf: line 35, column 24
    function sortValue_1 (AuthorityLimitProfile :  entity.AuthorityLimitProfile) : java.lang.Object {
      return AuthorityLimitProfile.Description
    }
    
    // 'value' attribute on RowIterator at AuthorityLimitProfilesLV.pcf: line 20, column 88
    function value_10 () : gw.api.database.IQueryBeanResult<entity.AuthorityLimitProfile> {
      return AuthorityLimitProfileList
    }
    
    property get AuthorityLimitProfileList () : gw.api.database.IQueryBeanResult<AuthorityLimitProfile> {
      return getRequireValue("AuthorityLimitProfileList", 0) as gw.api.database.IQueryBeanResult<AuthorityLimitProfile>
    }
    
    property set AuthorityLimitProfileList ($arg :  gw.api.database.IQueryBeanResult<AuthorityLimitProfile>) {
      setRequireValue("AuthorityLimitProfileList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfilesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AuthorityLimitProfilesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at AuthorityLimitProfilesLV.pcf: line 29, column 47
    function action_3 () : void {
      AuthorityLimitProfileDetailPage.go(AuthorityLimitProfile)
    }
    
    // 'action' attribute on TextCell (id=Name) at AuthorityLimitProfilesLV.pcf: line 29, column 47
    function action_dest_4 () : pcf.api.Destination {
      return pcf.AuthorityLimitProfileDetailPage.createDestination(AuthorityLimitProfile)
    }
    
    // 'value' attribute on TextCell (id=Name) at AuthorityLimitProfilesLV.pcf: line 29, column 47
    function valueRoot_6 () : java.lang.Object {
      return AuthorityLimitProfile
    }
    
    // 'value' attribute on TextCell (id=Name) at AuthorityLimitProfilesLV.pcf: line 29, column 47
    function value_2 () : java.lang.String {
      return AuthorityLimitProfile.Name
    }
    
    // 'value' attribute on TextCell (id=Description) at AuthorityLimitProfilesLV.pcf: line 35, column 24
    function value_7 () : java.lang.String {
      return AuthorityLimitProfile.Description
    }
    
    property get AuthorityLimitProfile () : entity.AuthorityLimitProfile {
      return getIteratedValue(1) as entity.AuthorityLimitProfile
    }
    
    
  }
  
  
}