package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/organizationsearch/OrganizationSearchPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OrganizationSearchPageExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/organizationsearch/OrganizationSearchPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationSearchPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on Forward (id=OrganizationSearchPage) at OrganizationSearchPage.pcf: line 7, column 34
    function action_0 () : void {
      Organizations.go()
    }
    
    // 'action' attribute on Forward (id=OrganizationSearchPage) at OrganizationSearchPage.pcf: line 7, column 34
    function action_dest_1 () : pcf.api.Destination {
      return pcf.Organizations.createDestination()
    }
    
    override property get CurrentLocation () : pcf.OrganizationSearchPage {
      return super.CurrentLocation as pcf.OrganizationSearchPage
    }
    
    
  }
  
  
}