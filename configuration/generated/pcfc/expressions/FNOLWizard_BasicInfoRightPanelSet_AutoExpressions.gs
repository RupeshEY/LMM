package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_BasicInfoRightPanelSet_AutoExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_BasicInfoRightPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_BasicInfoRightPanelSet.Auto.pcf: line 17, column 45
    function initialValue_0 () : gw.api.claim.FnolNewVehicle[] {
      return getVehicles(Claim)
    }
    
    // 'value' attribute on PanelIterator at FNOLWizard_BasicInfoRightPanelSet.Auto.pcf: line 27, column 49
    function value_13 () : gw.api.claim.FnolNewVehicle[] {
      return Vehicles
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Vehicles () : gw.api.claim.FnolNewVehicle[] {
      return getVariableValue("Vehicles", 0) as gw.api.claim.FnolNewVehicle[]
    }
    
    property set Vehicles ($arg :  gw.api.claim.FnolNewVehicle[]) {
      setVariableValue("Vehicles", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    function getVehicles(c : Claim) : gw.api.claim.FnolNewVehicle[] {
      var vehicleList = Wizard.VehicleHelper.getVehicles(c)
      if (countSelected(vehicleList) == 0 and !Wizard.VehicleHelper.AutoSelectedMarker) {
        Wizard.VehicleHelper.AutoSelectedMarker = true
        defaultCheckSelectedRiskUnits(vehicleList)
      }
      vehicleList.sort(\ f, f2 -> f.Vehicle.DisplayName < f2.Vehicle.DisplayName)
      return vehicleList
    }
    
    function defaultCheckSelectedRiskUnits(vehicleList : gw.api.claim.FnolNewVehicle[]) {
      if (allowAutoSelect()) {
        vehicleList.each( \ v -> {v.Checked = true} )
      }
    }
    
    function countSelected(vehicleList : gw.api.claim.FnolNewVehicle[]) : int {
      var count = 0
      vehicleList.each( \ v -> {if (v.Checked) { count = count + 1}} )
      return count
    }
    
    function allowAutoSelect() : boolean {
      return gw.api.policy.PolicyTabUtil.isTabAvailable(Claim, PolicyTab.TC_VEHICLES) 
        and Claim.Policy.hasVehicleData()
        and Claim.Policy.PolicyType == PolicyType.TC_BUSINESSAUTO
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextInput (id=coverage) at FNOLWizard_BasicInfoRightPanelSet.Auto.pcf: line 44, column 50
    function label_1 () : java.lang.Object {
      return coverage.Type
    }
    
    // 'value' attribute on TextInput (id=coverage) at FNOLWizard_BasicInfoRightPanelSet.Auto.pcf: line 44, column 50
    function valueRoot_5 () : java.lang.Object {
      return coverage
    }
    
    // 'value' attribute on TextInput (id=coverage) at FNOLWizard_BasicInfoRightPanelSet.Auto.pcf: line 44, column 50
    function value_2 () : java.lang.String {
      return coverage.DetailsSummary
    }
    
    property get coverage () : entity.RUCoverage {
      return getIteratedValue(2) as entity.RUCoverage
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Auto.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FNOLWizard_BasicInfoRightPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on InputGroup (id=InsuredVehicleInputGroup) at FNOLWizard_BasicInfoRightPanelSet.Auto.pcf: line 36, column 123
    function label_8 () : java.lang.Object {
      return InsuredVehicle.Vehicle.DisplayName
    }
    
    // 'onToggle' attribute on InputGroup (id=InsuredVehicleInputGroup) at FNOLWizard_BasicInfoRightPanelSet.Auto.pcf: line 36, column 123
    function setter_9 (VALUE :  java.lang.Boolean) : void {
      InsuredVehicle.Checked = !InsuredVehicle.Checked; Wizard.VehicleHelper.syncVehicleIncidents(Claim)
    }
    
    // 'value' attribute on InputGroup (id=InsuredVehicleInputGroup) at FNOLWizard_BasicInfoRightPanelSet.Auto.pcf: line 36, column 123
    function valueRoot_11 () : java.lang.Object {
      return InsuredVehicle
    }
    
    // 'value' attribute on InputIterator at FNOLWizard_BasicInfoRightPanelSet.Auto.pcf: line 40, column 47
    function value_6 () : entity.RUCoverage[] {
      return InsuredVehicle.Coverages.sort(\ r, r2 -> r.Type < r2.Type)
    }
    
    // 'childrenVisible' attribute on InputGroup (id=InsuredVehicleInputGroup) at FNOLWizard_BasicInfoRightPanelSet.Auto.pcf: line 36, column 123
    function visible_7 () : java.lang.Boolean {
      return InsuredVehicle.Checked
    }
    
    property get InsuredVehicle () : gw.api.claim.FnolNewVehicle {
      return getIteratedValue(1) as gw.api.claim.FnolNewVehicle
    }
    
    
  }
  
  
}