package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BusinessWeekPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=BusinessWeek_AddBusinessWeek) at BusinessWeekPage.pcf: line 26, column 25
    function action_2 () : void {
      NewBusinessWeek.go()
    }
    
    // 'action' attribute on ToolbarButton (id=BusinessWeek_AddBusinessWeek) at BusinessWeekPage.pcf: line 26, column 25
    function action_dest_3 () : pcf.api.Destination {
      return pcf.NewBusinessWeek.createDestination()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=BusinessWeek_DeleteButton) at BusinessWeekPage.pcf: line 33, column 25
    function allCheckedRowsAction_5 (CheckedValues :  entity.BusinessWeek[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.BaseAdminUtil.deleteBusinessWeeks(CheckedValues)
    }
    
    // 'available' attribute on ToolbarButton (id=BusinessWeek_AddBusinessWeek) at BusinessWeekPage.pcf: line 26, column 25
    function available_1 () : java.lang.Boolean {
      return perm.BusinessWeek.create
    }
    
    // 'available' attribute on CheckedValuesToolbarButton (id=BusinessWeek_DeleteButton) at BusinessWeekPage.pcf: line 33, column 25
    function available_4 () : java.lang.Boolean {
      return perm.BusinessWeek.delete
    }
    
    // 'canEdit' attribute on Page (id=BusinessWeekPage) at BusinessWeekPage.pcf: line 9, column 64
    function canEdit_16 () : java.lang.Boolean {
      return perm.BusinessWeek.edit
    }
    
    // 'canVisit' attribute on Page (id=BusinessWeekPage) at BusinessWeekPage.pcf: line 9, column 64
    static function canVisit_17 () : java.lang.Boolean {
      return perm.BusinessWeek.view
    }
    
    // 'initialValue' attribute on Variable at BusinessWeekPage.pcf: line 13, column 68
    function initialValue_0 () : gw.api.database.IQueryBeanResult<BusinessWeek> {
      return gw.api.database.Query.make(BusinessWeek).select()
    }
    
    // Page (id=BusinessWeekPage) at BusinessWeekPage.pcf: line 9, column 64
    static function parent_18 () : pcf.api.Destination {
      return pcf.BusinessWeek.createDestination()
    }
    
    // 'value' attribute on RowIterator at BusinessWeekPage.pcf: line 49, column 42
    function sortValue_6 (businessWeek :  entity.BusinessWeek) : java.lang.Object {
      return businessWeek.Name
    }
    
    // 'value' attribute on RowIterator at BusinessWeekPage.pcf: line 42, column 83
    function value_15 () : gw.api.database.IQueryBeanResult<entity.BusinessWeek> {
      return businessWeeks
    }
    
    override property get CurrentLocation () : pcf.BusinessWeekPage {
      return super.CurrentLocation as pcf.BusinessWeekPage
    }
    
    property get businessWeeks () : gw.api.database.IQueryBeanResult<BusinessWeek> {
      return getVariableValue("businessWeeks", 0) as gw.api.database.IQueryBeanResult<BusinessWeek>
    }
    
    property set businessWeeks ($arg :  gw.api.database.IQueryBeanResult<BusinessWeek>) {
      setVariableValue("businessWeeks", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends BusinessWeekPageExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at BusinessWeekPage.pcf: line 49, column 42
    function action_8 () : void {
      BusinessWeekDetail.go(businessWeek)
    }
    
    // 'action' attribute on TextCell (id=Name) at BusinessWeekPage.pcf: line 49, column 42
    function action_dest_9 () : pcf.api.Destination {
      return pcf.BusinessWeekDetail.createDestination(businessWeek)
    }
    
    // 'value' attribute on TextCell (id=Name) at BusinessWeekPage.pcf: line 49, column 42
    function valueRoot_11 () : java.lang.Object {
      return businessWeek
    }
    
    // 'value' attribute on TextCell (id=Zones) at BusinessWeekPage.pcf: line 54, column 43
    function value_12 () : java.lang.String {
      return businessWeek.Zones
    }
    
    // 'value' attribute on TextCell (id=Name) at BusinessWeekPage.pcf: line 49, column 42
    function value_7 () : java.lang.String {
      return businessWeek.Name
    }
    
    property get businessWeek () : entity.BusinessWeek {
      return getIteratedValue(1) as entity.BusinessWeek
    }
    
    
  }
  
  
}