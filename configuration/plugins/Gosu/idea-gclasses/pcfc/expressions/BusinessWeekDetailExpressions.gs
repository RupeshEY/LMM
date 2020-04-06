package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BusinessWeekDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (businessWeek :  BusinessWeek) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=BusinessWeekDetail) at BusinessWeekDetail.pcf: line 13, column 89
    function afterCancel_2 () : void {
      BusinessWeekPage.go()
    }
    
    // 'afterCancel' attribute on Page (id=BusinessWeekDetail) at BusinessWeekDetail.pcf: line 13, column 89
    function afterCancel_dest_3 () : pcf.api.Destination {
      return pcf.BusinessWeekPage.createDestination()
    }
    
    // 'beforeCommit' attribute on Page (id=BusinessWeekDetail) at BusinessWeekDetail.pcf: line 13, column 89
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      businessWeek.removeNullZones()
    }
    
    // 'canEdit' attribute on Page (id=BusinessWeekDetail) at BusinessWeekDetail.pcf: line 13, column 89
    function canEdit_5 () : java.lang.Boolean {
      return perm.BusinessWeek.edit
    }
    
    // 'canVisit' attribute on Page (id=BusinessWeekDetail) at BusinessWeekDetail.pcf: line 13, column 89
    static function canVisit_6 (businessWeek :  BusinessWeek) : java.lang.Boolean {
      return perm.BusinessWeek.view
    }
    
    // 'def' attribute on ScreenRef at BusinessWeekDetail.pcf: line 20, column 53
    function def_onEnter_0 (def :  pcf.BusinessWeekDetailScreen) : void {
      def.onEnter(businessWeek)
    }
    
    // 'def' attribute on ScreenRef at BusinessWeekDetail.pcf: line 20, column 53
    function def_refreshVariables_1 (def :  pcf.BusinessWeekDetailScreen) : void {
      def.refreshVariables(businessWeek)
    }
    
    // 'parent' attribute on Page (id=BusinessWeekDetail) at BusinessWeekDetail.pcf: line 13, column 89
    static function parent_7 (businessWeek :  BusinessWeek) : pcf.api.Destination {
      return pcf.BusinessWeekPage.createDestination()
    }
    
    // 'title' attribute on Page (id=BusinessWeekDetail) at BusinessWeekDetail.pcf: line 13, column 89
    static function title_8 (businessWeek :  BusinessWeek) : java.lang.Object {
      return DisplayKey.get("Web.Admin.BusinessWeekDetail", businessWeek.Name)
    }
    
    override property get CurrentLocation () : pcf.BusinessWeekDetail {
      return super.CurrentLocation as pcf.BusinessWeekDetail
    }
    
    property get businessWeek () : BusinessWeek {
      return getVariableValue("businessWeek", 0) as BusinessWeek
    }
    
    property set businessWeek ($arg :  BusinessWeek) {
      setVariableValue("businessWeek", 0, $arg)
    }
    
    
  }
  
  
}