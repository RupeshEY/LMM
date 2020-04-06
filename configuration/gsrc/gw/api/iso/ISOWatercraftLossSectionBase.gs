package gw.api.iso
uses gw.api.locale.DisplayKey
uses xsd.iso.req.Watercraft
uses gw.xml.xsd.IXMLNodeWithID
uses xsd.iso.req.PropertyLossInfo
uses xsd.iso.req.ClaimsParty
uses gw.xml.XmlElement
uses java.util.List

/**
 * Base class for creating a PropertyLossInfo loss section with a Watercraft
 * sub aggregate, based on the exposure's VehicleIncident.
 */
@Export
class ISOWatercraftLossSectionBase extends ISOLossSection {  
 
  /**
   * Exposure level constructor, used when creating a request for just the
   * given exposure. Implicitly creates an ISOClaimSearchRequest.
   */
  construct(inExposure : Exposure)  {
    super(inExposure)
  } 
  
  /**
   * Claim level constructor, for adding a new loss section to an existing
   * claim level request.
   */
  construct(inSearchRequest : ISOClaimSearchRequest, inExposure : Exposure) {
    super(inSearchRequest, inExposure)
  }
  
  /**
   * The type of loss section aggregate created by this object - PropertyLossInfo
   * in this case.
   */
  override property get LossSectionAggregateType() : Type {
    return PropertyLossInfo
  }
  
  /**
   * Override the standard createLossSection method to create a PropertyLossInfo
   * aggregate. The ClaimsParty represents the claimant and is linked to the
   * new PropertyLossInfo aggregate
   */
  protected override function createLossSection(claimantParty : ClaimsParty) : XmlElement {
    return addPropertyLossInfo(claimantParty)
  }

  /**
   * This type of loss section could have an associated investigation info,
   * so override to return true
   */
  protected override property get ShouldAddInvestigationInfo() : boolean {
    return true
  }

  /**
   * Override default checking. There can only be a single watercraft loss section
   * on a claim search request, and it cannot be mixed with other PropertyLossInfo
   * aggregates.
   */
  override function verifyCanPopulate(existingLossSections : List<ISOLossSectionBase>) : String {
    return SearchRequest.AddRequest.PropertyLossInfoSingular != null
      ? DisplayKey.get("Java.Error.ISO.NoMultiplePropertyLossInfo") : null
  }

  /**
   * Creates a PropertyLossInfo aggregate with a Watercraft sub aggregate based
   * on the exposure's VehicleIncident. Links the PropertyLossInfo to the given
   * claimant.
   */
  protected function addPropertyLossInfo(claimantParty : ClaimsParty) : PropertyLossInfo {
    var lossInfo = new PropertyLossInfo()
    SearchRequest.AddRequest.PropertyLossInfoSingular = lossInfo
    lossInfo.Id = SearchRequest.getNextId()
    lossInfo.ClaimsPartyRefs = {claimantParty}
    lossInfo.Watercraft.add(createWatercraft())
    return lossInfo
  } 

  /**
   * Creates a Watercraft aggregate (sub aggregate of PropertyLossInfo) based
   * on the exposure's VehicleIncident
   */  
  @Throws(ISOBadRequestException, "")
  protected function createWatercraft() : Watercraft{
    var watercraft = new Watercraft()
    var vehicle = Exposure.VehicleIncident.Vehicle
    if (vehicle == null) {
      throw new ISOBadRequestException(DisplayKey.get("Java.Error.ISO.MissingProperty", "vehicle", "boat", Exposure.Claim.ClaimNumber ))
    }
    var boatType = vehicle.BoatType
    if (boatType != null) {
      watercraft.WaterUnitTypeCd = SearchRequest.Translate.optionallyTranslateTypeCode(boatType)
      watercraft.WaterUnitTypeCd_elem.Codelistref = SearchRequest.findOrCreateCodeList(ISOCodeList.WATER_UNIT_TYPE_CODE.Id)
    }
    watercraft.ItemDefinition.add(createItemDefinition(vehicle, ISOConstants.WATERCRAFT_ITEM_TYPE))
    var registrationState = vehicle.State
    if (registrationState != null) {
      watercraft.Registration.StateProvCd = registrationState.Code
    }
    return watercraft
  }
}
