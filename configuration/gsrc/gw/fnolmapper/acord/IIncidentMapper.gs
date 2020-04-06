package gw.fnolmapper.acord
uses xsd.acord.AutoLossInfo
uses xsd.acord.LiabilityLossInfo
uses xsd.acord.PropertyLossInfo
uses xsd.acord.ClaimsInjuredInfo
uses xsd.acord.WorkCompLossInfo

/**
 * Interface for defining mapping methods for Incidents.
 */
@Export
interface IIncidentMapper {
  /**
   * Gets a VehicleIncident from an ACORD AutoLossInfo.
   */
  function getVehicleIncident(claim:Claim, autoLossInfo:AutoLossInfo) : VehicleIncident
  
  /**
   * Gets an Incident for a general liability loss from the ACORD
   * LiabilityLossInfo.
   */
  function getGenLiabilityIncident(claim:Claim, glLossInfo:LiabilityLossInfo) : Incident
  
  /**
   * Gets a PropertyIncident for a property loss from the ACORD 
   * PropertyLossInfo.
   */
  function getPropertyIncident(claim:Claim, propLossInfo:PropertyLossInfo) : PropertyIncident
 
  /**
   * Gets an InjuryIncident for a third party bodily injury from the ACORD
   * ClaimsInjuredInfo.
   */
  function getInjuryIncident(claim:Claim, injuryInfo:ClaimsInjuredInfo) : InjuryIncident
  
  /**
   * Gets an InjuryIncident for a worker's comp loss from the ACORD
   * WorkCompLossInfo.
   */
  function getWorkCompIncident(claim:Claim, wcLossInfo:WorkCompLossInfo) : InjuryIncident
}
