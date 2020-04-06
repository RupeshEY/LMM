package gw.plugin.policy.reinsurance.impl

uses gw.api.locale.DisplayKey
uses gw.plugin.policy.reinsurance.IReinsurancePlugin
uses gw.api.util.Logger
uses java.util.ArrayList
uses java.util.Collection
uses gw.pl.persistence.core.Bundle
uses gw.api.testdata.TestDataUtil
uses java.util.HashMap
uses gw.api.database.Query
uses gw.api.util.DisplayableException

/**
 * Demonstration implementation of the IReinsurancePlugin. The Reinsurance data
 * which would usually come from the RI / Policy system is obtained from
 * RIDataGenerator.gs
 */
@Export
class ReinsuranceDemoPlugin implements IReinsurancePlugin {

  var _data = new RIDataGenerator()

  construct() {

  }

  /**
   * Returns the agreements for the given policy number (in a non-persistent bundle).
   */
  private function getDemoAgreements(policyNumber:String, coverageType: CoverageType) : Collection<RIAgreement> {
    var bundle = TestDataUtil.createNonPersistentBundle()
    var agreements = new ArrayList<RIAgreement>()
    _data.getBuildersForPolicy(policyNumber, coverageType).each(\ builder -> {
        agreements.add(builder.create( bundle ))  
    })
    return agreements
  }

  /**
   * Called when an Exposure is saved, or the button to Retrieve Reinsurance is clicked.
   * This method should retrieve Reinsurance Agreement
   * information for this exposure, and then setup or update RIAgreement and RIAgreementGroup
   * entities. The ReinsurancePluginHelper class and its methods can help with these tasks.
   *
   * Possible values to consider when retrieving reinsurance:
   * <ul>
   * <li>Policy Number - exposure.Claim.Policy.PolicyNumber</li>
   * <li>Coverage Type - exposure.PrimaryCoverage</li>
   * <li>Risk's PolicySystemID - exposure.Coverage.RiskUnit.PolicySystemID</li>
   * <li>Date of Loss - exposure.Claim.LossDate</li>
   * </ul>
   *
   * @param exp the Exposure to update with Reinsurance information
   */
  public override function retrieveAndSyncReinsurance( exp : Exposure ) {

    if (!exp.Claim.Policy.Verified or exp.Retired) {
      if (exp.RIGroupSetExternally) {
        ReinsurancePluginHelper.unlinkFromExistingAgreementGroup(exp)
      }
      return
    }

    // get "remote" agreements
    var policyAgreements = getDemoAgreements( exp.Claim.Policy.PolicyNumber, exp.PrimaryCoverage )
    
    if (policyAgreements.HasElements) {
      var policyAgreementGroup = policyAgreements.first().RIAgreementGroup

      // match with existing, or create new RIAgreement Group
      var agrGroupToUpdate = ReinsurancePluginHelper.linkToExistingAgreementGroup( exp, policyAgreementGroup.ExternalRiskID )
      if (agrGroupToUpdate == null ) {
        // create new Group 
        agrGroupToUpdate = ReinsurancePluginHelper.createAgreementGroup( exp, policyAgreementGroup.ExternalRiskID, policyAgreementGroup.RiskName)
      }
      // match agreements and copy, or create new, or retire old
      syncAgreementGroup( exp.Bundle, agrGroupToUpdate, policyAgreements)
    }
  }


  /**
   * Syncronizes an {@code RIAgreementGroup} with the retrieved agreements.
   * @param bundle The bundle to use (when creating new agreements)
   * @param agrGroup The agreement group
   * @param policyAgreements The agreements retrieved from the policy system
   */
  public static function syncAgreementGroup(bundle : Bundle, agrGroup : RIAgreementGroup, policyAgreements : Collection<RIAgreement>) {
    //create map of existing agreement number -> RIAgreement
    var existingAgreements = new HashMap<String, RIAgreement>()
    if (agrGroup != null) {
      for (existingAgmt in agrGroup.Agreements) {
          existingAgreements.put(existingAgmt.AgreementNumber, existingAgmt)
      }
    }
    for (policyAgreement in policyAgreements) {
        var policyAgrNumber = policyAgreement.AgreementNumber
        
        var agrToUpdate : RIAgreement
        if (existingAgreements.containsKey(policyAgrNumber)) {
            // MATCH found, remove matched agreement from existing list
            agrToUpdate = existingAgreements.remove(policyAgrNumber)
        } else {
            // NEW agreement
            agrToUpdate = ReinsurancePluginHelper.createNewAgreement( (typeof policyAgreement).RelativeName, agrGroup.Claim, bundle)
            agrGroup.addToAgreements(agrToUpdate)
        }

        // UPDATE fields on the agreement
        setFields( policyAgreement, agrToUpdate )
    }
    // Only unmatched Agreements remain, so delete these agreements that were removed in the Policy system.
    // Check if transactions exist on the given RIAgreement before removing.
    for (removedAgreement in existingAgreements.values()) {
        if (Logger.forCategory("APPLICATION").isDebugEnabled()) {
            Logger.forCategory("APPLICATION").debug("Removing agreement: " + removedAgreement.getDisplayName())
        }
        if (not Query.make(RITransaction).compare("RIAgreement", Equals, removedAgreement.ID).select().Empty) {
          throw new DisplayableException(DisplayKey.get("Financials.Reinsurance.Error.RetrieveReinsuranceExistingTransactions", removedAgreement.AgreementNumber))
        }
        removedAgreement.remove()
    }
  }

  static function setFields( source : RIAgreement, destination : RIAgreement ) {
    destination.AgreementNumber = source.AgreementNumber
    destination.AgreementName = source.AgreementName

    if ( destination.NotificationThreshold != source.NotificationThreshold ) {
      destination.NotificationThreshold = source.NotificationThreshold
      //reset notification bit
      destination.ExceedsNotificationThreshold = false
    }
    destination.AttachmentPoint = source.AttachmentPoint
    destination.TopOfLayer = source.TopOfLayer
    destination.RecoveryLimit = source.RecoveryLimit
    destination.CededShare = source.CededShare

    if (source typeis ProportionalRIAgreement and destination typeis ProportionalRIAgreement) {
      destination.ProportionalShare = source.ProportionalShare
    }
  }
}
