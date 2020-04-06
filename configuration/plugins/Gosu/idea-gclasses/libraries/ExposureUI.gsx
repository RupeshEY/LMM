package libraries
uses java.lang.Exception
uses java.util.Set
uses java.util.HashMap

uses gw.api.system.CCLoggerCategory
uses gw.lang.reflect.features.PropertyReference
uses gw.api.address.AddressJurisdictionHandler

@Export
enhancement ExposureUI : entity.Exposure
{
  function setInitialValues() {
    this.JurisdictionState = AddressJurisdictionHandler.getJurisdiction(this.Claim.LossLocation)
    if (this.ExposureType == TC_PIPDAMAGES) {
      // Initialize these sub-objects; necessary because they contain arrays
      this.PriorEmpData = this.Claim.newEmploymentData()
      this.NewEmpData = this.Claim.newEmploymentData()
    }
    this.ValidationLevel =  TC_NEWLOSS; 
  }

  function initializeIncident() : Incident {
    var incident : Incident = null;
    if (this.ExposureType == ExposureType.TC_BAGGAGE
        || this.ExposureType == ExposureType.TC_BODILYINJURYDAMAGE
        || this.ExposureType == ExposureType.TC_CONTENT
        || this.ExposureType == ExposureType.TC_DWELLING
        || this.ExposureType == ExposureType.TC_LIVINGEXPENSES
        || this.ExposureType == ExposureType.TC_MEDPAY
        || this.ExposureType == ExposureType.TC_OTHERSTRUCTURE
        || this.ExposureType == ExposureType.TC_PROPERTYDAMAGE
        || this.ExposureType == ExposureType.TC_TOWONLY
        || this.ExposureType == ExposureType.TC_VEHICLEDAMAGE
        || this.ExposureType == ExposureType.TC_PIPDAMAGES
        || this.ExposureType == ExposureType.TC_TRIPCANCELLATIONDELAY
        || ExposureType.TF_INCIDENTFROMCOVERAGE.getTypeKeys().contains(this.ExposureType)) {//Typefilter introduced in 9.x. In the future, we will only refer to the Typefilter and not individual values
      // Explicit incident; try to get from coverage, otherwise guess
      var coverage = this.Coverage;
      if (coverage != null) {
        incident = coverage.findOrCreateIncident(this.ExposureType);
      }
      if (incident == null) {
        incident = this.findBestIncidentForNewExposure();
      }
    } else if (this.ExposureType == ExposureType.TC_EMPLOYERLIABILITY
        || this.ExposureType == ExposureType.TC_GENERALDAMAGE
        || this.ExposureType == ExposureType.TC_LOSSOFUSEDAMAGE
        || this.ExposureType == ExposureType.TC_LOSTWAGES
        || this.ExposureType == ExposureType.TC_PERSONALPROPERTYDAMAGE
        || this.ExposureType == ExposureType.TC_WCINJURYDAMAGE
        || ExposureType.TF_INCIDENTALWAYSNEW.getTypeKeys().contains(this.ExposureType)) {//Typefilter introduced in 9.x. In the future, we will only refer to the Typefilter and not individual values
      // Implicit incident; always create new
      incident = this.newIncident();
    } else {
      var errMsg = "ExposureUI#initializeIncident() : No Incident initialization set up for Exposure of type " + this.ExposureType
      CCLoggerCategory.APPLICATION.error(errMsg)
      throw new Exception(errMsg)
    }
    this.Incident = incident;
    return incident;
  }

  function findBestIncidentForNewExposure() : Incident {
    var possible = this.PossibleIncidents;
    var best : Incident = null;
    for (incident in possible) {
      if (incident.isSuitableForExposure(this) and (best == null or incident.isBetterForNewExposure(best))) {
        best = incident;
      }
    }
    return best;
  }

  function getVehicleIncidentsWithMatchingLossParty(lossParty : LossPartyType) : VehicleIncident[] {
    var incidents = this.Claim.VehicleIncidentsOnly;    
    var result = new java.util.ArrayList<VehicleIncident>();
    for (incident in incidents) {
      if (lossParty == null || incident.VehicleLossParty == null || incident.VehicleLossParty == lossParty) {
        result.add(incident);
      }
    }
    return result.toTypedArray();
  }

  /**
   * Creates applicable benefits for this exposure, based on its exposure type
   * (determined by getBenefitsProperties()).
   */
  function createBenefits() {
    for (var prop in getBenefitsProperties()) {
      this[prop.FeatureInfo.Name] = this[prop.FeatureInfo.Name] ?: new Benefits(this)
    }
  }
  
  /**
   * Removes all new benefits that have no changed fields from this exposure.
   */
  function cleanupBenefits() {
    for (var prop in getBenefitsProperties()) {
      var benefits = this[prop.FeatureInfo.Name] as Benefits
      if (benefits.New && benefits.ChangedFields.Empty) {
        benefits.remove()
        this[prop.FeatureInfo.Name] = null
      }
    }
  }
  
  private function getBenefitsProperties() : Set<PropertyReference<Exposure, Benefits>> {
    var map = new HashMap<ExposureType, Set<PropertyReference<Exposure, Benefits>>>(){
      ExposureType.TC_LOSTWAGES -> {Exposure#TTDBenefits, Exposure#TPDBenefits, Exposure#PPDBenefits, Exposure#PTDBenefits, Exposure#DeathBenefits},
      ExposureType.TC_PIPDAMAGES -> {Exposure#CompBenefits, Exposure#DisBenefits, Exposure#PIPDeathBenefits, Exposure#RSBenefits, Exposure#SSDIBenefits}
    }
    return map.get(this.ExposureType)
  }
}