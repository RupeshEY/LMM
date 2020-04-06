package gw.api.claim

uses com.google.common.collect.Multimaps
uses com.google.common.collect.TreeMultimap
uses gw.pl.persistence.core.Bundle
uses java.util.Set
uses java.util.Collection

@Export
class FnolServiceRequestHelper {

  private construct() { }

  /**
   * Clean the service requests that where added and then removed from the new claim. Also,
   * runs the finish setup for all of the claim service requests that will be committed with
   * the new claim
   */
  static function cleanAndFinishServiceRequests(wizard: NewClaimWizardInfo) {
    wizard.Claim.cleanAndFinishServiceRequests(wizard.UnusedServiceRequests, \ sr -> {
      wizard.VehicleIncidentOtherServiceRequests.remove(sr)
      wizard.PropertyOtherServiceRequests.remove(sr)
    })
  }

  /**
   * Removes the newly created services associated to the given incident 
   * when is being removed from the claim
   */
  static function removeIncidentServiceRequests(incident: Incident, wizard: NewClaimWizardInfo = null) {
    
    incident.ServiceRequests.each(\ sr -> {
      if (wizard != null) {
        wizard.VehicleIncidentOtherServiceRequests.remove(sr)
        wizard.PropertyOtherServiceRequests.remove(sr)
      }
      sr.remove()
    })
  }
}
