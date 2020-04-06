package gw.plugin.policy.reinsurance.pc900

uses entity.RIAgreement
uses gw.api.locale.DisplayKey
uses gw.api.system.PLLoggerCategory
uses gw.api.upgrade.Coercions
uses gw.api.util.DisplayableException
uses gw.api.util.LocaleUtil
uses gw.api.util.Logger
uses gw.pl.persistence.core.Bundle
uses gw.plugin.InitializablePlugin
uses gw.plugin.policy.reinsurance.IReinsurancePlugin
uses gw.plugin.policy.reinsurance.impl.ReinsurancePluginHelper
uses wsi.remote.gw.webservice.pc.pc900.ricoverageapi.RICoverageAPI
uses wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIRiskInfo_Agreements_Entry
uses wsi.remote.gw.webservice.pc.pc900.ricoverageapi.faults.BadIdentifierException
uses wsi.remote.gw.webservice.pc.pc900.ricoverageapi.types.complex.RIRiskInfo

uses java.lang.IllegalArgumentException
uses java.lang.Throwable
uses java.util.ArrayList
uses java.util.Collection
uses java.util.Date
uses java.util.HashSet
uses java.util.Map

/**
 * Implementation of the IReinsurancePlugin which talks to PolicyCenter to retrieve the
 * reinsurance information.
 * <p>
 * Use this class as a template for a plugin implementation that talks to an external
 * system via a webservice. You'll want to rewrite getPCRiskInformation() and setFields().
 */
@Export
class PCReinsurancePlugin implements IReinsurancePlugin, InitializablePlugin {

  private var _logger = Logger.forCategory(PLLoggerCategory.PLUGIN, "Reinsurance")

  private property get API() : RICoverageAPI {
     return new RICoverageAPI()
  }
  
  /**
   * Must have 'username' and 'password' for authenticating
   * to PolicyCenter.
   */
  override function setParameters(params : Map) {
  }

  protected function getPCRiskInformation(policyNumber:String, riskUnitID : String, covType : CoverageType,
                                          lossDate : Date ) : RIRiskInfo {
    var riskInfo : RIRiskInfo
    try {
      var reinsuranceAPI = API
      if (riskUnitID == null) {
        riskInfo = reinsuranceAPI.findRIPolicyRisk(policyNumber, covType.Code, lossDate)
      } else {
        riskInfo = reinsuranceAPI.findRIRiskByCoverableID(policyNumber, riskUnitID, covType.Code, lossDate)
      }
    } catch ( bie : BadIdentifierException ) {
      _logger.info(constructErrorMessageForRIWS(policyNumber, covType, lossDate, riskUnitID), bie)
      riskInfo = new()
      riskInfo.RIRiskID = null
    } catch (se : Throwable) {
      var msg = constructErrorMessageForRIWS(policyNumber, covType, lossDate, riskUnitID)
      _logger.error(msg, se)
      throw new DisplayableException(msg, se)
    }
    return riskInfo
  }

  private function constructErrorMessageForRIWS(policyNumber:String, covType : CoverageType, lossDate : Date,  riskUnitID : String) : String {
    if (riskUnitID == null) {
      return DisplayKey.get("Web.Plugin.PCReinsurance.CannotRetrieveRiskInfo", policyNumber, covType, lossDate)
    } else {
      return DisplayKey.get("Web.Plugin.PCReinsurance.CannotRetrieveRiskInfo.WithRiskUnitID", policyNumber, covType, lossDate, riskUnitID)
    }
  }

  /**
   * Called when an Exposure is saved, or the button to Retrieve Reinsurance is clicked.
   * This method should retrieve Reinsurance Agreement
   * information for this exposure, and then setup or update RIAgreement and RIAgreementGroup
   * entities. The ReinsurancePluginHelper class and its methods can help with these tasks.
   *
   * Possible values to consider when retrieving reinsurance inside this method's
   * implementation:
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
    if (!exp.Claim.Policy.Verified or exp.Coverage == null or exp.Retired) {
      if (exp.RIGroupSetExternally) {
        ReinsurancePluginHelper.unlinkFromExistingAgreementGroup(exp)
      }
      return
    }
    
    var riskUnitID = ReinsurancePluginHelper.getRiskUnitPolicySystemID(exp)
    // get remote agreements
    var riskInfo = getPCRiskInformation( exp.Claim.Policy.PolicyNumber , riskUnitID, exp.PrimaryCoverage, exp.Claim.LossDate)
    if (riskInfo.RIRiskID == null) {
      ReinsurancePluginHelper.unlinkFromExistingAgreementGroup(exp)
      return
    }

    if (riskInfo.Agreements != null and riskInfo.Agreements.Entry.Count > 0) {

      // match with existing, or create new RIAgreement Group
      var agrGroupToUpdate = ReinsurancePluginHelper.linkToExistingAgreementGroup( exp, riskInfo.RIRiskID )
      if (agrGroupToUpdate == null ) {
        // create new Group 
        agrGroupToUpdate = ReinsurancePluginHelper.createAgreementGroup( exp, riskInfo.RIRiskID, riskInfo.Description)
      }
      // match agreements and copy, or create new, or retire old
      updateAgreementGroup( exp.Bundle, agrGroupToUpdate, riskInfo.Agreements.Entry)
    } else if (exp.RIGroupSetExternally) {
      ReinsurancePluginHelper.unlinkFromExistingAgreementGroup(exp)
    }
  }

  
  /**
   * Syncronizes an {@code RIAgreementGroup} with the retrieved agreements.
   * @param bundle The bundle to use (when creating new agreements)
   * @param agrGroup The agreement group
   * @param policyAgreements The agreements retrieved from the policy system
   */
  internal static function updateAgreementGroup(bundle : Bundle, agrGroup : RIAgreementGroup, policyAgreements : Collection<RIRiskInfo_Agreements_Entry>) {
    //create map of existing agreement number -> RIAgreement
    var existingAgreements = new HashSet<RIAgreement>()
    if (agrGroup != null) {
      for (existingAgmt in agrGroup.Agreements) {
          existingAgreements.add(existingAgmt)
      }
    }
    // AgreementNumber uniquely identifies each agreement 99% of the time. The 1% occurs when a NonProp's
    // coverage range (AttachmentPoint -> TopOfLayer) is completely contained within another NonProp's range.
    // If npAgr1.AP < npAgr2.AP and npAgr2.ToL < npAgr1.ToL, then npAgr1.AgreementNumber will appear twice.
    // This does not happen if the ranges merely overlap. If this 1% case does not happen in your RI programs,
    // then AgreementNumber will be unique 100% of the time.
    var duplicateAgreementNumbers = getDuplicateAgreementNumbers(existingAgreements, policyAgreements)
    
    // process non-duplicates
    processAgreementsByAgreementNumber(agrGroup, existingAgreements, policyAgreements.where(\ r -> !duplicateAgreementNumbers.contains(r.AgreementNumber)), bundle)
    
    // process duplicates which have a strong match
    var remainingDuplicateAgreements = new HashSet<RIRiskInfo_Agreements_Entry>()
    for (policyAgreement in policyAgreements) {
      if (!duplicateAgreementNumbers.contains(policyAgreement.AgreementNumber)) {
        continue
      }
      var agrToUpdate = existingAgreements.firstWhere(\ r -> isAStrongMatch(r, policyAgreement))
      if (agrToUpdate == null) {
        remainingDuplicateAgreements.add(policyAgreement)
        continue
      }
      existingAgreements.remove(agrToUpdate)
      setFields(policyAgreement, agrToUpdate)
    }
    
    // process duplicates which do not have strong matches.  Use the first available that has the same agreement number or 
    // treat it as a new agreement
    processAgreementsByAgreementNumber(agrGroup, existingAgreements, remainingDuplicateAgreements, bundle)

    // Only unmatched Agreements remain, so delete these agreements that were removed in the Policy system.
    for (removedAgreement in existingAgreements) {
        if (Logger.forCategory("APPLICATION").isDebugEnabled()) {
            Logger.forCategory("APPLICATION").debug("Removing agreement: " + removedAgreement.getDisplayName())
        }
        // this deletes or disassociates the agreement as appropriate
        removedAgreement.delete()
    }
  }

  private static function processAgreementsByAgreementNumber( agrGroup : RIAgreementGroup, existingAgreements : Collection<RIAgreement>, policyAgreements : Collection<RIRiskInfo_Agreements_Entry>, bundle : Bundle) {
    for (policyAgreement in policyAgreements) {
      var agrToUpdate = existingAgreements.firstWhere(\ r -> r.AgreementNumber == policyAgreement.AgreementNumber)
      
      if (agrToUpdate == null) {
          // NEW agreement
        if (policyAgreement.Type == null) {
          throw new IllegalArgumentException("Unable to get Reinsurance data without type information in ReinsuranceAgreementInfo/Type")
        }
        agrToUpdate = ReinsurancePluginHelper.createNewAgreement( policyAgreement.Type as String, agrGroup.Claim, bundle)
        agrGroup.addToAgreements(agrToUpdate)
      } else {
        existingAgreements.remove(agrToUpdate)
      }
      // UPDATE fields on the agreement
      setFields( policyAgreement, agrToUpdate )      
    }
  }

  private static function getDuplicateAgreementNumbers(agreements : Collection<RIAgreement>, policyAgreements : Collection<RIRiskInfo_Agreements_Entry>) : Collection<String> {
    var result = new ArrayList<String>()
    var usedAgreementNumbers = new HashSet<String>()
    for (agreement in agreements) {
      if (usedAgreementNumbers.contains(agreement.AgreementNumber)) {
        result.add(agreement.AgreementNumber)
      } else {
        usedAgreementNumbers.add(agreement.AgreementNumber)
      }
    }
    usedAgreementNumbers.clear()
    for (agreement in policyAgreements) {
      if (usedAgreementNumbers.contains(agreement.AgreementNumber)) {
        result.add(agreement.AgreementNumber)
      } else {
        usedAgreementNumbers.add(agreement.AgreementNumber)
      }
    }
    
    return result
  }
    
  /**
   * Agreements are matched based on having the same AgreementNumber as well as AttachmentPoint.  Furthermore, for
   * NonProportionalAgreements, the TopLayer must match for them to be considered the same Agreement
   */
  private static function isAStrongMatch(agreement : RIAgreement, policyAgreement : RIRiskInfo_Agreements_Entry) : Boolean {
    if (!(agreement.AgreementNumber == policyAgreement.AgreementNumber) or
        agreement.AttachmentPoint == null or
        agreement.AttachmentPoint.Amount.compareTo(policyAgreement.AttachmentPoint) != 0) {
          return false
    }
    if (agreement typeis NonProportionalRIAgreement and
        agreement.TopOfLayer !=  null) {
      return agreement.TopOfLayer.Amount.compareTo(policyAgreement.TopOfLayer) == 0
    }
    return true
  }


  /**
   * Copies fields from the incoming agreement to the new or existing RIAgreement.
   * Modify this method if you add extension fields to RIAgreements in PC and CC.
   */
  private static function setFields( source : RIRiskInfo_Agreements_Entry, destination : RIAgreement ) {
    destination.AgreementNumber = source.AgreementNumber
    destination.AgreementName = source.Name

    // source.Currency is a special object (enum wrapped as xs:element), and hence we cannot use the standard properties
    // available on enums to fetch the value.
    // sourceCurrency is a string representing the currency code (e.g. "usd", "eur" etc.)
    var sourceCurrency = source.Currency.GosuValue
    // If source currency is not null, set it on the new agreement. Else, we let the new agreement's
    // currency remain set to the default value, i.e. Claim Currency.
    if(sourceCurrency != null) {
      destination.Currency = Currency.get(sourceCurrency)
    }

    var amount = source.NotificationThreshold
    if ( destination.NotificationThreshold != Coercions.makeCurrencyAmountFrom(amount) ) {
      destination.NotificationThreshold = Coercions.makeCurrencyAmountFrom(amount)
      //reset notification bit
      destination.ExceedsNotificationThreshold = false
    }
    destination.AttachmentPoint = Coercions.makeCurrencyAmountFrom(source.AttachmentPoint)
    destination.TopOfLayer = Coercions.makeCurrencyAmountFrom(source.TopOfLayer)
    destination.RecoveryLimit = Coercions.makeCurrencyAmountFrom(source.RecoveryLimit)
    destination.CededShare = source.CededShare

    if (destination typeis ProportionalRIAgreement) {
      destination.ProportionalShare = source.ProportionalPercentage
    }
  }

}
