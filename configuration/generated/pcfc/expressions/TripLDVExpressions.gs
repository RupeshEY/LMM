package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/TripLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TripLDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/TripLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TripLDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=TripRU_Name) at TripLDV.pcf: line 31, column 42
    function action_5 () : void {
      TripRUPopup.push( aClaim, aTripRU, CurrentLocation.InEditMode )
    }
    
    // 'action' attribute on TextCell (id=TripRU_Name) at TripLDV.pcf: line 31, column 42
    function action_dest_6 () : pcf.api.Destination {
      return pcf.TripRUPopup.createDestination( aClaim, aTripRU, CurrentLocation.InEditMode )
    }
    
    // 'checkBoxVisible' attribute on RowIterator at TripLDV.pcf: line 25, column 37
    function checkBoxVisible_18 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'value' attribute on TextCell (id=TripRU_Name) at TripLDV.pcf: line 31, column 42
    function valueRoot_8 () : java.lang.Object {
      return aTripRU
    }
    
    // 'value' attribute on DateCell (id=EndDate) at TripLDV.pcf: line 41, column 38
    function value_12 () : java.util.Date {
      return aTripRU.EndDate
    }
    
    // 'value' attribute on TypeKeyCell (id=GeographicalRegion) at TripLDV.pcf: line 46, column 53
    function value_15 () : typekey.GeographicalRegion {
      return aTripRU.GeographicalRegion
    }
    
    // 'value' attribute on TextCell (id=TripRU_Name) at TripLDV.pcf: line 31, column 42
    function value_4 () : java.lang.String {
      return aTripRU.DisplayName
    }
    
    // 'value' attribute on DateCell (id=StartDate) at TripLDV.pcf: line 36, column 40
    function value_9 () : java.util.Date {
      return aTripRU.StartDate
    }
    
    property get aTripRU () : entity.TripRU {
      return getIteratedValue(1) as entity.TripRU
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/TripLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripLDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef (id=PolicyTripCoverageLDV) at TripLDV.pcf: line 57, column 39
    function def_onEnter_22 (def :  pcf.PolicyTripCoverageLDV) : void {
      def.onEnter(selection)
    }
    
    // 'def' attribute on PanelRef (id=PolicyTripCoverageLDV) at TripLDV.pcf: line 57, column 39
    function def_refreshVariables_23 (def :  pcf.PolicyTripCoverageLDV) : void {
      def.refreshVariables(selection)
    }
    
    // 'pickLocation' attribute on RowIterator at TripLDV.pcf: line 25, column 37
    function pickLocation_19 () : void {
      TripRUPopup.push( aClaim )
    }
    
    // 'value' attribute on RowIterator at TripLDV.pcf: line 31, column 42
    function sortValue_0 (aTripRU :  entity.TripRU) : java.lang.Object {
      return aTripRU.DisplayName
    }
    
    // 'value' attribute on RowIterator at TripLDV.pcf: line 36, column 40
    function sortValue_1 (aTripRU :  entity.TripRU) : java.lang.Object {
      return aTripRU.StartDate
    }
    
    // 'value' attribute on RowIterator at TripLDV.pcf: line 41, column 38
    function sortValue_2 (aTripRU :  entity.TripRU) : java.lang.Object {
      return aTripRU.EndDate
    }
    
    // 'value' attribute on RowIterator at TripLDV.pcf: line 46, column 53
    function sortValue_3 (aTripRU :  entity.TripRU) : java.lang.Object {
      return aTripRU.GeographicalRegion
    }
    
    // 'toRemove' attribute on RowIterator at TripLDV.pcf: line 25, column 37
    function toRemove_20 (aTripRU :  entity.TripRU) : void {
      aClaim.Policy.removeFromRiskUnits( aTripRU )
    }
    
    // 'value' attribute on RowIterator at TripLDV.pcf: line 25, column 37
    function value_21 () : entity.TripRU[] {
      return aClaim.Policy.RiskUnits.whereTypeIs( TripRU )
    }
    
    // 'visible' attribute on Card (id=trip_coverages) at TripLDV.pcf: line 54, column 37
    function visible_24 () : java.lang.Boolean {
      return selection != null
    }
    
    property get aClaim () : Claim {
      return getRequireValue("aClaim", 0) as Claim
    }
    
    property set aClaim ($arg :  Claim) {
      setRequireValue("aClaim", 0, $arg)
    }
    
    property get selection () : TripRU {
      return getCurrentSelection(0) as TripRU
    }
    
    property set selection ($arg :  TripRU) {
      setCurrentSelection(0, $arg)
    }
    
    
  }
  
  
}