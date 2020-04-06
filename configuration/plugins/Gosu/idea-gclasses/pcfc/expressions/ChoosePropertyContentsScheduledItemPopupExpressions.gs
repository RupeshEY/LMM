package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ChoosePropertyContentsScheduledItemPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChoosePropertyContentsScheduledItemPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (incident :  PropertyContentsIncident, policyLocation :  PolicyLocation) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButton) at ChoosePropertyContentsScheduledItemPopup.pcf: line 32, column 95
    function action_2 () : void {
      CurrentLocation.cancel()
    }
    
    // 'initialValue' attribute on Variable at ChoosePropertyContentsScheduledItemPopup.pcf: line 20, column 56
    function initialValue_0 () : java.util.Set<entity.PropertyItem> {
      return incident.PropertyContentsScheduledItems.map(\ i -> i.PropertyItem).toSet()
    }
    
    // 'pickValue' attribute on CheckedValuesToolbarButton (id=AddCheckedItems) at ChoosePropertyContentsScheduledItemPopup.pcf: line 28, column 114
    function pickValue_1 (CheckedValues :  entity.PropertyItem[]) : PropertyContentsScheduledItem[] {
      return CheckedValues.map(\ item -> incident.createOrderedPropertyContentsScheduledItem(item))
    }
    
    // 'value' attribute on RowIterator (id=HighValueItems) at ChoosePropertyContentsScheduledItemPopup.pcf: line 50, column 41
    function sortValue_3 (item :  entity.PropertyItem) : java.lang.Object {
      return item.Description
    }
    
    // 'value' attribute on RowIterator (id=HighValueItems) at ChoosePropertyContentsScheduledItemPopup.pcf: line 54, column 44
    function sortValue_4 (item :  entity.PropertyItem) : java.lang.Object {
      return item.AppraisedValue
    }
    
    // 'value' attribute on RowIterator (id=HighValueItems) at ChoosePropertyContentsScheduledItemPopup.pcf: line 42, column 45
    function value_12 () : entity.PropertyItem[] {
      return policyLocation.HighValueItems
    }
    
    override property get CurrentLocation () : pcf.ChoosePropertyContentsScheduledItemPopup {
      return super.CurrentLocation as pcf.ChoosePropertyContentsScheduledItemPopup
    }
    
    property get alreadyChosen () : java.util.Set<entity.PropertyItem> {
      return getVariableValue("alreadyChosen", 0) as java.util.Set<entity.PropertyItem>
    }
    
    property set alreadyChosen ($arg :  java.util.Set<entity.PropertyItem>) {
      setVariableValue("alreadyChosen", 0, $arg)
    }
    
    property get incident () : PropertyContentsIncident {
      return getVariableValue("incident", 0) as PropertyContentsIncident
    }
    
    property set incident ($arg :  PropertyContentsIncident) {
      setVariableValue("incident", 0, $arg)
    }
    
    property get policyLocation () : PolicyLocation {
      return getVariableValue("policyLocation", 0) as PolicyLocation
    }
    
    property set policyLocation ($arg :  PolicyLocation) {
      setVariableValue("policyLocation", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/incidents/ChoosePropertyContentsScheduledItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ChoosePropertyContentsScheduledItemPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowIterator (id=HighValueItems) at ChoosePropertyContentsScheduledItemPopup.pcf: line 42, column 45
    function checkBoxVisible_11 () : java.lang.Boolean {
      return !alreadyChosen.contains(item)
    }
    
    // 'value' attribute on TextCell (id=ItemDescription) at ChoosePropertyContentsScheduledItemPopup.pcf: line 50, column 41
    function valueRoot_7 () : java.lang.Object {
      return item
    }
    
    // 'value' attribute on TextCell (id=ItemDescription) at ChoosePropertyContentsScheduledItemPopup.pcf: line 50, column 41
    function value_5 () : java.lang.String {
      return item.Description
    }
    
    // 'value' attribute on CurrencyCell (id=ItemValue) at ChoosePropertyContentsScheduledItemPopup.pcf: line 54, column 44
    function value_8 () : gw.api.financials.CurrencyAmount {
      return item.AppraisedValue
    }
    
    property get item () : entity.PropertyItem {
      return getIteratedValue(1) as entity.PropertyItem
    }
    
    
  }
  
  
}