package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/Authority.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AuthorityExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/Authority.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AuthorityExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'parent' attribute on Page (id=Authority) at Authority.pcf: line 8, column 78
    static function parent_0 () : pcf.api.Destination {
      return pcf.UsersAndSecurity.createDestination()
    }
    
    override property get CurrentLocation () : pcf.Authority {
      return super.CurrentLocation as pcf.Authority
    }
    
    
  }
  
  
}