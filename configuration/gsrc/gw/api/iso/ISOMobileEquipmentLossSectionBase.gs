package gw.api.iso
uses gw.api.locale.DisplayKey
uses xsd.iso.req.ItemInfo
uses gw.xml.xsd.IXMLNodeWithID
uses xsd.iso.req.PropertyLossInfo
uses xsd.iso.req.ClaimsParty
uses gw.xml.XmlElement
uses java.util.List

/**
 * Creates an PropertyLossInfo loss section with an ItemInfo sub aggregate,
 * populated with information from the exposure and exposure's vehicle incident
 */
@Export
class ISOMobileEquipmentLossSectionBase extends ISOLossSection {  
 
  /**
   * Exposure level constructor, used when creating a request for just the
   * given exposure. Implicitly creates an ISOClaimSearchRequest.
   */
  construct(inExposure : Exposure) {
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
   * Override default checking. There can only be a single mobile equipment loss section
   * on a claim search request, and it cannot be mixed with other PropertyLossInfo
   * aggregates.
   */
  override function verifyCanPopulate(existingLossSections : List<ISOLossSectionBase>) : String {
    return SearchRequest.AddRequest.PropertyLossInfoSingular != null
      ? DisplayKey.get("Java.Error.ISO.NoMultiplePropertyLossInfo") : null
  }

  /**
   * Creates a PropertyLossInfo aggregate with an ItemInfo based on the exposure's
   * VehicleIncident. Links the PropertyLossInfo to the given claimant.
   */
  @Throws(ISOBadRequestException, "")
  protected function addPropertyLossInfo(claimantParty : ClaimsParty) : PropertyLossInfo {
    var lossInfo = new PropertyLossInfo()
    SearchRequest.AddRequest.PropertyLossInfoSingular = lossInfo
    lossInfo.Id = SearchRequest.getNextId()
    lossInfo.ClaimsPartyRefs = {claimantParty}
    lossInfo.ItemInfo.add(createItemInfo())
    return lossInfo
  } 
  
  /**
   * Creates an ItemInfo aggregate (sub aggregate of PropertyLossInfo) based on
   * the exposure's VehicleIncident
   */
  @Throws(ISOBadRequestException, "")
  protected function createItemInfo() : ItemInfo{
    var itemInfo = new ItemInfo()
    var vehicle = Exposure.VehicleIncident.Vehicle
    if (vehicle == null) {
      throw new ISOBadRequestException(DisplayKey.get("Java.Error.ISO.MissingProperty", "vehicle", "MobileEquipment", Exposure.Claim.ClaimNumber ))
    }
    itemInfo.ItemDefinition = createItemDefinition(vehicle, ISOConstants.MOBILE_EQUIPMENT_ITEM_TYPE)
    return itemInfo
  }

}
