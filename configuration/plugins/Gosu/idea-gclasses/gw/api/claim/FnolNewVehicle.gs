package gw.api.claim

/**
 * Helper container class for retaining the state of a Vehicle to be added
 * in the FNOL Wizard.
 */
@Export 
class FnolNewVehicle
{
  // ------------------------------------------------------- Instance Variables

  private var _vehicle : Vehicle
  private var _checked : Boolean
  private var _coverages : RUCoverage[]

  // ------------------------------------------------------------- Constructors

  construct (vehicleRiskUnit : VehicleRU) {
    _vehicle = vehicleRiskUnit.Vehicle
    _checked = false
    _coverages = vehicleRiskUnit.Coverages
  }

  // ----------------------------------------------------------- Public Methods

  public property get Checked() : boolean {
    return _checked;
  }

  public property get Vehicle() : Vehicle {
    return _vehicle;
  }

  public property set Checked(ch : boolean ) {
    _checked = ch;
  }

  public property get Coverages() : RUCoverage[] {
    return _coverages;
  }

}
