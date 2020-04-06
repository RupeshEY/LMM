package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RegionDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/regions/RegionDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 1
    }
    
    static function __constructorIndex (Region :  Region) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Page (id=RegionDetail) at RegionDetail.pcf: line 12, column 77
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      Region.removeNullZones()
    }
    
    // 'canEdit' attribute on Page (id=RegionDetail) at RegionDetail.pcf: line 12, column 77
    function canEdit_4 () : java.lang.Boolean {
      return Region==null || perm.Region.edit
    }
    
    // 'canVisit' attribute on Page (id=RegionDetail) at RegionDetail.pcf: line 12, column 77
    static function canVisit_5 (Region :  Region) : java.lang.Boolean {
      return (Region!=null and perm.Region.view) || (Region==null and perm.Region.create)
    }
    
    // 'def' attribute on ScreenRef at RegionDetail.pcf: line 22, column 41
    function def_onEnter_1 (def :  pcf.RegionDetailScreen) : void {
      def.onEnter(Region)
    }
    
    // 'def' attribute on ScreenRef at RegionDetail.pcf: line 22, column 41
    function def_refreshVariables_2 (def :  pcf.RegionDetailScreen) : void {
      def.refreshVariables(Region)
    }
    
    // 'initialValue' attribute on Variable at RegionDetail.pcf: line 20, column 22
    function initialValue_0 () : Region {
      return Region == null ? new Region() : Region
    }
    
    // 'parent' attribute on Page (id=RegionDetail) at RegionDetail.pcf: line 12, column 77
    static function parent_6 (Region :  Region) : pcf.api.Destination {
      return pcf.RegionsPage.createDestination()
    }
    
    // 'title' attribute on Page (id=RegionDetail) at RegionDetail.pcf: line 12, column 77
    static function title_7 (Region :  Region) : java.lang.Object {
      return DisplayKey.get("Web.Admin.RegionDetail", Region.Name)
    }
    
    override property get CurrentLocation () : pcf.RegionDetail {
      return super.CurrentLocation as pcf.RegionDetail
    }
    
    property get Region () : Region {
      return getVariableValue("Region", 0) as Region
    }
    
    property set Region ($arg :  Region) {
      setVariableValue("Region", 0, $arg)
    }
    
    
  }
  
  
}