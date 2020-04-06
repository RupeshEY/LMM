package gw.fnolmapper.acord

uses xsd.acord.AutoLossInfo
uses xsd.acord.LiabilityLossInfo
uses xsd.acord.PropertyLossInfo
uses xsd.acord.WorkCompLossInfo
uses xsd.acord.ClaimsInjuredInfo

/**
 * Interface for mapping Exposure entities.
 */
@Export
interface IExposureMapper {
  /**
   * Creates an entity.Exposure for an Auto loss from the ACORD AutoLossInfo and the
   * corresponding VehicleIncident.
   */
  function getVehicleExposure(claim:Claim, autoLossInfo:AutoLossInfo, incident:VehicleIncident) : Exposure
  
  /**
   * Creates an entity.Exposure for a general liability loss from the ACORD LiabilityLossInfo and
   * the corresponding Incident.
   */
  function getGenLiabilityExposure(claim:Claim, glLossInfo:LiabilityLossInfo, incident:Incident) : Exposure
  
  /**
   * Creates an entity.Exposure for a property loss from the ACORD PropertyLossInfo and the corresponding
   * PropertyIncident.
   */
  function getPropertyExposure(claim:Claim, propLossInfo:PropertyLossInfo, incident:PropertyIncident) : Exposure
  
  /**
   * Creates an entity.Exposure for a worker's comp loss from the ACORD WorkCompLossInfo and the 
   * corresponding Incident.
   */
  function getWorkCompExposure(claim:Claim, wcLossInfo:WorkCompLossInfo, incident:Incident) : Exposure
  
  /**
   * Creates an entity.Exposure for a third party's bodily injury from the ACORD ClaimsInjuredInfo
   * and the corresponding InjuryIncident.
   */
  function getInjuryExposure(claim:Claim, injuryInfo:ClaimsInjuredInfo, incident:InjuryIncident) : Exposure
}
