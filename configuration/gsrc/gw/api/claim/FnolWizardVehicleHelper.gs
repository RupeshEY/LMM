package gw.api.claim

uses java.util.IdentityHashMap
uses java.util.Map
uses java.util.HashMap

@Export
class FnolWizardVehicleHelper
{
  /**
   * Set of available vehicles
   */
  private var _vehicleMap : IdentityHashMap<Vehicle, FnolNewVehicle>
  
  /**
   * Flag indicating that auto-selection of vehicles for vehicle incident
   * creation in "Basic Info" step has taken place (applies to commercial
   * auto only)
   */
  private var _autoSelectFlag : boolean
  
  construct() {
    _vehicleMap = new IdentityHashMap<Vehicle, FnolNewVehicle>();
    _autoSelectFlag = false
  }
  
  public property set AutoSelectedMarker(b: boolean) {
    _autoSelectFlag = b
  }
  
  public property get AutoSelectedMarker() : boolean {
    return _autoSelectFlag
  }
  
  public function resetVehicles() {
    _vehicleMap.clear()
  }
  
  public function getVehicles(claim : Claim) : FnolNewVehicle[] {
    // Clear out vehicles currently stashed away
    resetVehicles()
    
    // build the list of avaiable vehicles (stashed inside helper
    // wrappers)
    initVehicleIncidents(claim)

    // fetch that list of vehicles and return them
    // in an array
    var vehicleCollection = _vehicleMap.values()
    return vehicleCollection.toTypedArray()
  }
  
  public function syncVehicleIncidents(claim : Claim) {
    var checkedVehicles = this.SelectedVehicles    
    var existingVehicleIncidents = claim.VehicleIncidentsOnly
    var existingInsuredVehiclesWithIncidents = new HashMap<Vehicle, VehicleIncident>()
    var vehicleCollection = checkedVehicles.values()
    var bundle = claim.getBundle()
    
    //creating the existingVehicleIncidents HashMap
    existingVehicleIncidents.each( \ evi -> {
      //only add the vehicle incident that belongs to the policy
      if ( _vehicleMap.containsKey( evi.getVehicle() ) ) {
        existingInsuredVehiclesWithIncidents.put( evi.Vehicle, evi )
      }      
    })
   

    // for each vehicle in our set, if the checked vehicle is already in the claim's vehicle incidents list
    // then remove the vehicle from the set of existing VehicleIncidents
    vehicleCollection.each( \ checkedVehicle -> {      
      
      if (existingInsuredVehiclesWithIncidents.containsKey( checkedVehicle.Vehicle )) {
        existingInsuredVehiclesWithIncidents.remove(checkedVehicle.Vehicle)
      }
      
      // if not matched, this is a newly checked vehicle so create an incident
      else {
        var newIncident = new VehicleIncident(bundle)
        newIncident.Vehicle  = checkedVehicle.Vehicle
        claim.addToIncidents(newIncident)
      }      
    })
    
    // now all the leftover vehicles in existingVehicleIncidents are the incidents that exist but not checked currently,
    // remove vehicle incidents
    existingInsuredVehiclesWithIncidents.eachValue( \ vi -> {
      claim.removeFromIncidents(vi)
      gw.api.claim.FnolServiceRequestHelper.removeIncidentServiceRequests(vi)
    })
  }
  
  private property get SelectedVehicles() : Map<Vehicle, FnolNewVehicle> {
    var vehicleCollection = _vehicleMap.values()
    var result = new HashMap<Vehicle, FnolNewVehicle>()

    // for each checked vehicle, put that vehicle in our
    // set of results to return
    vehicleCollection.each( \ nfv -> {
      if (nfv.Checked) {
        result.put(nfv.Vehicle, nfv)
      }
    })
    
    return (result)
  }
  
  private function initVehicleIncidents(claim : Claim) {
    
    // add all vehicles covered in our policy
    var coveredVehicles = claim.Policy.Vehicles
    coveredVehicles.each( \ cv -> addVehicle( cv ) )

    // get a set of only vehicle incidents
    var existingVehicleIncidents = claim.VehicleIncidentsOnly
    
    // for each vehicle incident, if the that vehicle is not marked (checked),
    // mark that vehicle
    existingVehicleIncidents.each( \ evi -> {
      var newFnolVehicle = _vehicleMap.get(evi.Vehicle)
      if (newFnolVehicle != null && !newFnolVehicle.Checked) {
          newFnolVehicle.Checked = true
        }
    })       
  }
  
  private function addVehicle(vehicleRiskUnit : VehicleRU) {
    if ( !_vehicleMap.containsKey(vehicleRiskUnit.Vehicle) ) {
      _vehicleMap.put(vehicleRiskUnit.Vehicle, new FnolNewVehicle(vehicleRiskUnit))
    }
  }     
}
