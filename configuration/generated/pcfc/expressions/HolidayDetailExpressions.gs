package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class HolidayDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/holidays/HolidayDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HolidayDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Holiday :  Holiday) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=HolidayDetail) at HolidayDetail.pcf: line 13, column 79
    function afterCancel_2 () : void {
      Holidays.go()
    }
    
    // 'afterCancel' attribute on Page (id=HolidayDetail) at HolidayDetail.pcf: line 13, column 79
    function afterCancel_dest_3 () : pcf.api.Destination {
      return pcf.Holidays.createDestination()
    }
    
    // 'beforeCommit' attribute on Page (id=HolidayDetail) at HolidayDetail.pcf: line 13, column 79
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      Holiday.removeNullZones()
    }
    
    // 'canEdit' attribute on Page (id=HolidayDetail) at HolidayDetail.pcf: line 13, column 79
    function canEdit_5 () : java.lang.Boolean {
      return perm.Holiday.edit
    }
    
    // 'canVisit' attribute on Page (id=HolidayDetail) at HolidayDetail.pcf: line 13, column 79
    static function canVisit_6 (Holiday :  Holiday) : java.lang.Boolean {
      return perm.Holiday.view
    }
    
    // 'def' attribute on ScreenRef at HolidayDetail.pcf: line 20, column 43
    function def_onEnter_0 (def :  pcf.HolidayDetailScreen) : void {
      def.onEnter(Holiday)
    }
    
    // 'def' attribute on ScreenRef at HolidayDetail.pcf: line 20, column 43
    function def_refreshVariables_1 (def :  pcf.HolidayDetailScreen) : void {
      def.refreshVariables(Holiday)
    }
    
    // 'parent' attribute on Page (id=HolidayDetail) at HolidayDetail.pcf: line 13, column 79
    static function parent_7 (Holiday :  Holiday) : pcf.api.Destination {
      return pcf.HolidaysPage.createDestination()
    }
    
    // 'title' attribute on Page (id=HolidayDetail) at HolidayDetail.pcf: line 13, column 79
    static function title_8 (Holiday :  Holiday) : java.lang.Object {
      return DisplayKey.get("Web.Admin.HolidayDetail", Holiday.Name)
    }
    
    override property get CurrentLocation () : pcf.HolidayDetail {
      return super.CurrentLocation as pcf.HolidayDetail
    }
    
    property get Holiday () : Holiday {
      return getVariableValue("Holiday", 0) as Holiday
    }
    
    property set Holiday ($arg :  Holiday) {
      setVariableValue("Holiday", 0, $arg)
    }
    
    
  }
  
  
}