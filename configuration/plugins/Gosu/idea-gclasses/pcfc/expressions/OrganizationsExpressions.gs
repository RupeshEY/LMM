package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/Organizations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OrganizationsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/Organizations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at Organizations.pcf: line 14, column 84
    function def_onEnter_0 (def :  pcf.OrganizationsLV) : void {
      def.onEnter(Organization.finder.findAllExternalOrganizations())
    }
    
    // 'def' attribute on PanelRef at Organizations.pcf: line 14, column 84
    function def_refreshVariables_1 (def :  pcf.OrganizationsLV) : void {
      def.refreshVariables(Organization.finder.findAllExternalOrganizations())
    }
    
    // 'parent' attribute on Page (id=Organizations) at Organizations.pcf: line 9, column 65
    static function parent_2 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    override property get CurrentLocation () : pcf.Organizations {
      return super.CurrentLocation as pcf.Organizations
    }
    
    
  }
  
  
}