package gw.processes

/**
 * Batch process for downloading catastrophe policy location data from the policy system.
 * This code works with PolicyCenter, you may need to modify it to work with other policy systems.
 */
@Export
public class CatastrophePolicyLocationDownload extends CatastrophePolicyLocationDownloadBase {

  public construct() {
    super("CatastrophePolicyLocationDownload")
  }

  /** Set parameters used by CatastrophePolicyLocationDownloadBase */
  override function setParameters() {

    // Parameter passed to the policy system
    ProductCodes = new String[] { "Homeowners", "CommercialProperty" /* "PersonalAuto", "BusinessOwners", "WorkersComp" */ }

    // list of TIV (total insured value) types returned by the policy system to include in the TIV.  In PolicyCenter, these are in RICoverageGroupType.tti
    TIVTypes = new String[] { "Property" /*, "Liability", "AutoPD", "AutoLiability", "WorkersComp" */ }
  }
}