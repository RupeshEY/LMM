package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityPatternsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityPatternsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at ActivityPatternsLV.pcf: line 33, column 33
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.AllFilter
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at ActivityPatternsLV.pcf: line 35, column 62
    function filters_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return FilterSet.CategoryFilters.FilterOptions
    }
    
    // 'initialValue' attribute on Variable at ActivityPatternsLV.pcf: line 18, column 53
    function initialValue_0 () : gw.api.admin.ActivityPatternFilterSet {
      return new gw.api.admin.ActivityPatternFilterSet()
    }
    
    // 'sortBy' attribute on RowIterator at ActivityPatternsLV.pcf: line 44, column 138
    function sortValue_3 (ActivityPattern :  entity.ActivityPattern) : java.lang.Object {
      return ActivityPattern.Subject
    }
    
    // 'value' attribute on RowIterator at ActivityPatternsLV.pcf: line 50, column 46
    function sortValue_4 (ActivityPattern :  entity.ActivityPattern) : java.lang.Object {
      return ActivityPattern.ActivityClass
    }
    
    // 'value' attribute on RowIterator at ActivityPatternsLV.pcf: line 56, column 49
    function sortValue_5 (ActivityPattern :  entity.ActivityPattern) : java.lang.Object {
      return ActivityPattern.Category
    }
    
    // 'value' attribute on RowIterator at ActivityPatternsLV.pcf: line 62, column 45
    function sortValue_6 (ActivityPattern :  entity.ActivityPattern) : java.lang.Object {
      return ActivityPattern.Type
    }
    
    // 'value' attribute on RowIterator at ActivityPatternsLV.pcf: line 67, column 41
    function sortValue_7 (ActivityPattern :  entity.ActivityPattern) : java.lang.Object {
      return ActivityPattern.Priority
    }
    
    // 'value' attribute on RowIterator at ActivityPatternsLV.pcf: line 71, column 46
    function sortValue_8 (ActivityPattern :  entity.ActivityPattern) : java.lang.Object {
      return ActivityPattern.Mandatory
    }
    
    // 'value' attribute on RowIterator at ActivityPatternsLV.pcf: line 75, column 50
    function sortValue_9 (ActivityPattern :  entity.ActivityPattern) : java.lang.Object {
      return ActivityPattern.AutomatedOnly
    }
    
    // 'value' attribute on RowIterator at ActivityPatternsLV.pcf: line 24, column 82
    function value_33 () : gw.api.database.IQueryBeanResult<entity.ActivityPattern> {
      return ActivityPatternList
    }
    
    property get ActivityPatternList () : gw.api.database.IQueryBeanResult<ActivityPattern> {
      return getRequireValue("ActivityPatternList", 0) as gw.api.database.IQueryBeanResult<ActivityPattern>
    }
    
    property set ActivityPatternList ($arg :  gw.api.database.IQueryBeanResult<ActivityPattern>) {
      setRequireValue("ActivityPatternList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.admin.ActivityPatternFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.admin.ActivityPatternFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.admin.ActivityPatternFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/activitypatterns/ActivityPatternsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ActivityPatternsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at ActivityPatternsLV.pcf: line 44, column 138
    function action_12 () : void {
      ActivityPatternDetail.go(ActivityPattern)
    }
    
    // 'action' attribute on TextCell (id=Subject) at ActivityPatternsLV.pcf: line 44, column 138
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ActivityPatternDetail.createDestination(ActivityPattern)
    }
    
    // 'condition' attribute on ToolbarFlag at ActivityPatternsLV.pcf: line 27, column 43
    function condition_10 () : java.lang.Boolean {
      return !ActivityPattern.SystemPattern
    }
    
    // 'value' attribute on TypeKeyCell (id=ActivityClass) at ActivityPatternsLV.pcf: line 50, column 46
    function valueRoot_17 () : java.lang.Object {
      return ActivityPattern
    }
    
    // 'value' attribute on TextCell (id=Subject) at ActivityPatternsLV.pcf: line 44, column 138
    function value_11 () : java.lang.String {
      return ActivityPattern.Subject != null ? ActivityPattern.Subject : DisplayKey.get("Web.ActivityPattern.NoSubject")
    }
    
    // 'value' attribute on TypeKeyCell (id=ActivityClass) at ActivityPatternsLV.pcf: line 50, column 46
    function value_15 () : typekey.ActivityClass {
      return ActivityPattern.ActivityClass
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at ActivityPatternsLV.pcf: line 56, column 49
    function value_18 () : typekey.ActivityCategory {
      return ActivityPattern.Category
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at ActivityPatternsLV.pcf: line 62, column 45
    function value_21 () : typekey.ActivityType {
      return ActivityPattern.Type
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at ActivityPatternsLV.pcf: line 67, column 41
    function value_24 () : typekey.Priority {
      return ActivityPattern.Priority
    }
    
    // 'value' attribute on BooleanRadioCell (id=Mandatory) at ActivityPatternsLV.pcf: line 71, column 46
    function value_27 () : java.lang.Boolean {
      return ActivityPattern.Mandatory
    }
    
    // 'value' attribute on BooleanRadioCell (id=AutomatedOnly) at ActivityPatternsLV.pcf: line 75, column 50
    function value_30 () : java.lang.Boolean {
      return ActivityPattern.AutomatedOnly
    }
    
    property get ActivityPattern () : entity.ActivityPattern {
      return getIteratedValue(1) as entity.ActivityPattern
    }
    
    
  }
  
  
}