package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClusterComponentsFilterByComponentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterComponentsFilterByComponentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (data :  gw.api.tools.ClusterComponentsData) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=SelectAll) at ClusterComponentsFilterByComponentPopup.pcf: line 30, column 116
    function action_2 () : void {
      gw.api.tools.ClusterComponentsData.FilterItem.bulkSetChecked(CurrentLocation, "ItemIterator", items, true)
    }
    
    // 'action' attribute on ToolbarButton (id=Clear) at ClusterComponentsFilterByComponentPopup.pcf: line 34, column 112
    function action_3 () : void {
      gw.api.tools.ClusterComponentsData.FilterItem.bulkSetChecked(CurrentLocation, "ItemIterator", items, false)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Select) at ClusterComponentsFilterByComponentPopup.pcf: line 26, column 39
    function allCheckedRowsAction_1 (CheckedValues :  gw.api.tools.ClusterComponentsData.FilterItem[], CheckedValuesErrors :  java.util.Map) : void {
      data.updateFilter(CheckedValues.toSet()); CurrentLocation.cancel()
    }
    
    // 'initialValue' attribute on Variable at ClusterComponentsFilterByComponentPopup.pcf: line 18, column 63
    function initialValue_0 () : gw.api.tools.ClusterComponentsData.FilterItem[] {
      return data.buildFilterData().toTypedArray()
    }
    
    // 'value' attribute on RowIterator (id=ItemIterator) at ClusterComponentsFilterByComponentPopup.pcf: line 53, column 28
    function sortValue_4 (item :  gw.api.tools.ClusterComponentsData.FilterItem) : java.lang.Object {
      return item.Name ?: item.Code
    }
    
    // 'value' attribute on RowIterator (id=ItemIterator) at ClusterComponentsFilterByComponentPopup.pcf: line 60, column 28
    function sortValue_5 (item :  gw.api.tools.ClusterComponentsData.FilterItem) : java.lang.Object {
      return item.Type.DisplayName
    }
    
    // 'startChecked' attribute on RowIterator (id=ItemIterator) at ClusterComponentsFilterByComponentPopup.pcf: line 46, column 71
    function startChecked_12 (item :  gw.api.tools.ClusterComponentsData.FilterItem) : java.lang.Boolean {
      return item.Checked
    }
    
    // 'value' attribute on RowIterator (id=ItemIterator) at ClusterComponentsFilterByComponentPopup.pcf: line 46, column 71
    function value_11 () : gw.api.tools.ClusterComponentsData.FilterItem[] {
      return items
    }
    
    override property get CurrentLocation () : pcf.ClusterComponentsFilterByComponentPopup {
      return super.CurrentLocation as pcf.ClusterComponentsFilterByComponentPopup
    }
    
    property get data () : gw.api.tools.ClusterComponentsData {
      return getVariableValue("data", 0) as gw.api.tools.ClusterComponentsData
    }
    
    property set data ($arg :  gw.api.tools.ClusterComponentsData) {
      setVariableValue("data", 0, $arg)
    }
    
    property get items () : gw.api.tools.ClusterComponentsData.FilterItem[] {
      return getVariableValue("items", 0) as gw.api.tools.ClusterComponentsData.FilterItem[]
    }
    
    property set items ($arg :  gw.api.tools.ClusterComponentsData.FilterItem[]) {
      setVariableValue("items", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentsFilterByComponentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClusterComponentsFilterByComponentPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClusterComponentsFilterByComponentPopup.pcf: line 60, column 28
    function valueRoot_10 () : java.lang.Object {
      return item.Type
    }
    
    // 'value' attribute on TextCell (id=Name) at ClusterComponentsFilterByComponentPopup.pcf: line 53, column 28
    function value_6 () : java.lang.String {
      return item.Name ?: item.Code
    }
    
    // 'value' attribute on TextCell (id=Type) at ClusterComponentsFilterByComponentPopup.pcf: line 60, column 28
    function value_8 () : java.lang.String {
      return item.Type.DisplayName
    }
    
    property get item () : gw.api.tools.ClusterComponentsData.FilterItem {
      return getIteratedValue(1) as gw.api.tools.ClusterComponentsData.FilterItem
    }
    
    
  }
  
  
}