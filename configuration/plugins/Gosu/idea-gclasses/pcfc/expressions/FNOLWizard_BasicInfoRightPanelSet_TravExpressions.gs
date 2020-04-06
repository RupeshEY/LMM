package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_BasicInfoRightPanelSet_TravExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_BasicInfoRightPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'columns' attribute on Layout at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 32, column 23
    function columns_2 () : java.lang.Double {
      return 1
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 18, column 31
    function initialValue_0 () : entity.TripRU[] {
      return Claim.Policy.RiskUnits.whereTypeIs(TripRU)
    }
    
    // 'sortBy' attribute on IteratorSort at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 40, column 26
    function sortBy_3 (Trip :  entity.TripRU) : java.lang.Object {
      return Trip.StartDate
    }
    
    // 'value' attribute on InputIterator at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 100, column 47
    function value_29 () : entity.PolicyCoverage[] {
      return Claim.Policy.Coverages.sortBy(\ coverage -> coverage.Type)
    }
    
    // 'visible' attribute on Label (id=NoTripsFound) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 26, column 42
    function visible_1 () : java.lang.Boolean {
      return Trips.length < 1
    }
    
    // 'visible' attribute on DetailViewPanel at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 93, column 54
    function visible_30 () : java.lang.Boolean {
      return Claim.Policy.Coverages.length > 0
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Trips () : entity.TripRU[] {
      return getVariableValue("Trips", 0) as entity.TripRU[]
    }
    
    property set Trips ($arg :  entity.TripRU[]) {
      setVariableValue("Trips", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 77, column 36
    function valueRoot_15 () : java.lang.Object {
      return anRUCoverage
    }
    
    // 'value' attribute on TextCell (id=CoverageType) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 77, column 36
    function value_13 () : typekey.CoverageType {
      return anRUCoverage.Type
    }
    
    // 'value' attribute on TextCell (id=CoverageDetails) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 81, column 36
    function value_16 () : java.lang.String {
      return anRUCoverage.DetailsSummary
    }
    
    property get anRUCoverage () : entity.RUCoverage {
      return getIteratedValue(2) as entity.RUCoverage
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends FNOLWizard_BasicInfoRightPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextInput (id=CoverageDetails) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 105, column 46
    function label_24 () : java.lang.Object {
      return coverage.Type
    }
    
    // 'value' attribute on TextInput (id=CoverageDetails) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 105, column 46
    function valueRoot_28 () : java.lang.Object {
      return coverage
    }
    
    // 'value' attribute on TextInput (id=CoverageDetails) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 105, column 46
    function value_25 () : java.lang.String {
      return coverage.DetailsSummary
    }
    
    property get coverage () : entity.PolicyCoverage {
      return getIteratedValue(1) as entity.PolicyCoverage
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FNOLWizard_BasicInfoRightPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Trip) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 50, column 41
    function valueRoot_6 () : java.lang.Object {
      return Trip
    }
    
    // 'value' attribute on RowIterator at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 71, column 51
    function value_19 () : entity.RUCoverage[] {
      return Trip.Coverages
    }
    
    // 'value' attribute on TextInput (id=Trip) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 50, column 41
    function value_4 () : java.lang.String {
      return Trip.DisplayName
    }
    
    // 'value' attribute on TypeKeyInput (id=GeographicalRegion) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 56, column 58
    function value_8 () : typekey.GeographicalRegion {
      return Trip.GeographicalRegion
    }
    
    // 'visible' attribute on Label at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 59, column 55
    function visible_12 () : java.lang.Boolean {
      return Trip.Coverages.length > 0
    }
    
    // 'visible' attribute on DetailViewPanel (id=TripIncidentDV) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 44, column 41
    function visible_21 () : java.lang.Boolean {
      return Trips.length > 0
    }
    
    // 'visible' attribute on PanelDivider at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 89, column 42
    function visible_22 () : java.lang.Boolean {
      return Trips.length > 1
    }
    
    // 'visible' attribute on TypeKeyInput (id=GeographicalRegion) at FNOLWizard_BasicInfoRightPanelSet.Trav.pcf: line 56, column 58
    function visible_7 () : java.lang.Boolean {
      return Trip.GeographicalRegion != null
    }
    
    property get Trip () : entity.TripRU {
      return getIteratedValue(1) as entity.TripRU
    }
    
    
  }
  
  
}