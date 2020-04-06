package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/OrganizationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OrganizationDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/OrganizationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Organization :  Organization) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=OrganizationDetail_DeleteButton) at OrganizationDetail.pcf: line 31, column 27
    function action_3 () : void {
      gw.api.admin.BaseAdminUtil.deleteOrganization(Organization); OrganizationSearchPage.go()
    }
    
    // 'available' attribute on ToolbarButton (id=OrganizationDetail_DeleteButton) at OrganizationDetail.pcf: line 31, column 27
    function available_2 () : java.lang.Boolean {
      return Organization.SafeToDelete
    }
    
    // 'def' attribute on PanelRef at OrganizationDetail.pcf: line 38, column 85
    function def_onEnter_4 (def :  pcf.OrganizationDetail_BasicDV) : void {
      def.onEnter(Organization.RootGroup, Organization)
    }
    
    // 'def' attribute on PanelRef at OrganizationDetail.pcf: line 38, column 85
    function def_refreshVariables_5 (def :  pcf.OrganizationDetail_BasicDV) : void {
      def.refreshVariables(Organization.RootGroup, Organization)
    }
    
    // 'initialValue' attribute on Variable at OrganizationDetail.pcf: line 19, column 21
    function initialValue_0 () : Group {
      return Organization.RootGroup
    }
    
    // EditButtons at OrganizationDetail.pcf: line 23, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=OrganizationDetail) at OrganizationDetail.pcf: line 10, column 89
    static function parent_6 (Organization :  Organization) : pcf.api.Destination {
      return pcf.Organizations.createDestination()
    }
    
    // 'title' attribute on Page (id=OrganizationDetail) at OrganizationDetail.pcf: line 10, column 89
    static function title_7 (Organization :  Organization) : java.lang.Object {
      return DisplayKey.get("Web.Admin.OrganizationDetail", Organization.Name)
    }
    
    override property get CurrentLocation () : pcf.OrganizationDetail {
      return super.CurrentLocation as pcf.OrganizationDetail
    }
    
    property get Organization () : Organization {
      return getVariableValue("Organization", 0) as Organization
    }
    
    property set Organization ($arg :  Organization) {
      setVariableValue("Organization", 0, $arg)
    }
    
    property get Parent () : Group {
      return getVariableValue("Parent", 0) as Group
    }
    
    property set Parent ($arg :  Group) {
      setVariableValue("Parent", 0, $arg)
    }
    
    
  }
  
  
}