package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/NewHoliday.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewHolidayExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/holidays/NewHoliday.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewHolidayExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewHoliday) at NewHoliday.pcf: line 15, column 62
    function afterCancel_3 () : void {
      Holidays.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewHoliday) at NewHoliday.pcf: line 15, column 62
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.Holidays.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewHoliday) at NewHoliday.pcf: line 15, column 62
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      Holidays.go()
    }
    
    // 'beforeCommit' attribute on Page (id=NewHoliday) at NewHoliday.pcf: line 15, column 62
    function beforeCommit_6 (pickedValue :  java.lang.Object) : void {
      Holiday.removeNullZones()
    }
    
    // 'canVisit' attribute on Page (id=NewHoliday) at NewHoliday.pcf: line 15, column 62
    static function canVisit_7 () : java.lang.Boolean {
      return perm.Holiday.create
    }
    
    // 'def' attribute on ScreenRef at NewHoliday.pcf: line 23, column 43
    function def_onEnter_1 (def :  pcf.HolidayDetailScreen) : void {
      def.onEnter(Holiday)
    }
    
    // 'def' attribute on ScreenRef at NewHoliday.pcf: line 23, column 43
    function def_refreshVariables_2 (def :  pcf.HolidayDetailScreen) : void {
      def.refreshVariables(Holiday)
    }
    
    // 'initialValue' attribute on Variable at NewHoliday.pcf: line 21, column 23
    function initialValue_0 () : Holiday {
      return new Holiday()
    }
    
    // 'parent' attribute on Page (id=NewHoliday) at NewHoliday.pcf: line 15, column 62
    static function parent_8 () : pcf.api.Destination {
      return pcf.HolidaysPage.createDestination()
    }
    
    override property get CurrentLocation () : pcf.NewHoliday {
      return super.CurrentLocation as pcf.NewHoliday
    }
    
    property get Holiday () : Holiday {
      return getVariableValue("Holiday", 0) as Holiday
    }
    
    property set Holiday ($arg :  Holiday) {
      setVariableValue("Holiday", 0, $arg)
    }
    
    
  }
  
  
}