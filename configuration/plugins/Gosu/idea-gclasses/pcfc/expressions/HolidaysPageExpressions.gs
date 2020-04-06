package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/holidays/HolidaysPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class HolidaysPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/holidays/HolidaysPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HolidaysPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Holidays_AddHolidayButton) at HolidaysPage.pcf: line 24, column 25
    function action_2 () : void {
      NewHoliday.go()
    }
    
    // 'action' attribute on ToolbarButton (id=Holidays_AddHolidayButton) at HolidaysPage.pcf: line 24, column 25
    function action_dest_3 () : pcf.api.Destination {
      return pcf.NewHoliday.createDestination()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Holidays_DeleteButton) at HolidaysPage.pcf: line 32, column 25
    function allCheckedRowsAction_5 (CheckedValues :  entity.Holiday[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.BaseAdminUtil.deleteHolidays(CheckedValues)
    }
    
    // 'available' attribute on ToolbarButton (id=Holidays_AddHolidayButton) at HolidaysPage.pcf: line 24, column 25
    function available_1 () : java.lang.Boolean {
      return perm.Holiday.create
    }
    
    // 'available' attribute on CheckedValuesToolbarButton (id=Holidays_DeleteButton) at HolidaysPage.pcf: line 32, column 25
    function available_4 () : java.lang.Boolean {
      return perm.Holiday.delete
    }
    
    // 'canVisit' attribute on Page (id=HolidaysPage) at HolidaysPage.pcf: line 8, column 60
    static function canVisit_8 () : java.lang.Boolean {
      return perm.Holiday.view
    }
    
    // 'def' attribute on PanelRef at HolidaysPage.pcf: line 35, column 37
    function def_onEnter_6 (def :  pcf.HolidaysLV) : void {
      def.onEnter(Holidays)
    }
    
    // 'def' attribute on PanelRef at HolidaysPage.pcf: line 35, column 37
    function def_refreshVariables_7 (def :  pcf.HolidaysLV) : void {
      def.refreshVariables(Holidays)
    }
    
    // 'initialValue' attribute on Variable at HolidaysPage.pcf: line 12, column 63
    function initialValue_0 () : gw.api.database.IQueryBeanResult<Holiday> {
      return gw.api.database.Query.make(Holiday).select()
    }
    
    // Page (id=HolidaysPage) at HolidaysPage.pcf: line 8, column 60
    static function parent_9 () : pcf.api.Destination {
      return pcf.Holidays.createDestination()
    }
    
    override property get CurrentLocation () : pcf.HolidaysPage {
      return super.CurrentLocation as pcf.HolidaysPage
    }
    
    property get Holidays () : gw.api.database.IQueryBeanResult<Holiday> {
      return getVariableValue("Holidays", 0) as gw.api.database.IQueryBeanResult<Holiday>
    }
    
    property set Holidays ($arg :  gw.api.database.IQueryBeanResult<Holiday>) {
      setVariableValue("Holidays", 0, $arg)
    }
    
    
  }
  
  
}