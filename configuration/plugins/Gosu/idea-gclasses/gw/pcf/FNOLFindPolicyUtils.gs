package gw.pcf
uses gw.api.locale.DisplayKey
uses gw.api.claim.NewClaimWizardInfo
uses gw.api.claim.NewClaimMode
uses gw.api.claim.NewClaimPolicySearchCriteriaAndSummary
uses gw.api.util.SearchUtil
uses gw.api.database.IQueryBeanResult
uses gw.api.util.DisplayableException
uses java.util.Date

@Export
class FNOLFindPolicyUtils {

  construct(aWizard : NewClaimWizardInfo, aClaim : Claim) {
    Wizard = aWizard
    Claim = aClaim
    SelectedPolicySummary = Wizard.PolicySummary
    PolicySearchCriteria = initPolicySearchCriteria()
    ClaimModeArray = Wizard.getAvailableClaimModes( Wizard.PolicySummary.PolicyType )
    PrevLossDate = Claim.LossDate
  }

  var Wizard : NewClaimWizardInfo
  var Claim : Claim
  var selectedPolicySummary : PolicySummary as SelectedPolicySummary
  var policySearchCriteria : PolicySearchCriteria as PolicySearchCriteria
  var claimModeArray : NewClaimMode[] as ClaimModeArray
  var policySummaryList : IQueryBeanResult<entity.PolicySummary> as PolicySummaryList
  
  var prevPolicySummary : PolicySummary as PrevPolicySummary
  var prevClaimLossDate : Date as PrevLossDate


  final function initPolicySearchCriteria() : PolicySearchCriteria {
    if (Wizard.PolicySearchCriteria != null) {
      return Wizard.PolicySearchCriteria;
    } else {
      var searchCriteria = new PolicySearchCriteria();
      var currentUser: User = User.util.getCurrentUser()
      searchCriteria.PolicyType = currentUser.PolicyType;  //set user default
      return searchCriteria
    }
  }

  function onClaimModeSelectionMade() {
    setClaimFirstAndFinalStatus()
    removeAutoCreatedExposuresAndIncidents()
    Claim.LossType = Wizard.LossType
    if (Wizard.Check != null) {
      Wizard.Check.ReadyToPay = false
    }
  }
  
  function setClaimFirstAndFinalStatus(){
    if ("AutoFirstAndFinal" == Wizard.ClaimMode.QuickClaimMode.Mode) {
      Claim.FirstAndFinal = true
    } else {
      // if switching to Quick Claim Auto or normal Auto modes, if the reporter field
      // is not a Person then clear it
      if (Claim.reporter != null and not (Claim.reporter typeis Person)) {
        Claim.reporter = null
      }
    }
  }

  function removeAutoCreatedExposuresAndIncidents() {
    for(exposure in Claim.Exposures) {
      Wizard.removeExposureFromAssignments(exposure)
      Claim.removeFromExposures(exposure)
    }
    for(incident in Claim.Incidents) {
      Claim.removeFromIncidents(incident)
      gw.api.claim.FnolServiceRequestHelper.removeIncidentServiceRequests(incident)
    }
  }

  function resetVariables() {
    SelectedPolicySummary = null;
    Claim.ClaimNumber = null;
    Wizard.QuickClaim = null;
    Wizard.PolicyDescription = null
    Claim.LossType = null;
  }

  function selectPolicyRow(policySummary : PolicySummary, location : pcf.api.Wizard) {
    if (policySummary.Status.equals(PolicyStatus.TC_ARCHIVED)) {
      throw new DisplayableException(DisplayKey.get("Wizard.NewClaimWizard.SelectedArchivedPolicy"))
    }
 
    var needReset : boolean = false;
    if ((Claim.Policy != null) &&
        (Claim.Policy.PolicyNumber != policySummary.PolicyNumber)){
        Wizard.resetClaimForPolicyChange()
        resetVariables()
    }
  
    SelectedPolicySummary = policySummary
    Wizard.setPolicyDescription( policySummary )
    if (PolicySearchCriteria.LossDate != null) {
      var lossDate = new gw.api.claim.ClaimLossDateProxy(Claim)
      lossDate.LossDate = PolicySearchCriteria.LossDate
    }
    
    Wizard.savePolicySearch(PolicySearchCriteria, policySummary);
    ClaimModeArray = Wizard.getAvailableClaimModes(policySummary.PolicyType);

    //set user default claim loss type and quick claim mode
    var lossTypeFound : boolean = false;
    var currentUser: User = User.util.getCurrentUser()
    if ((currentUser as User).LossType != null) {
      for (lossType in Wizard.getAvailableLossTypes(policySummary.PolicyType)) {
        //if user default loss type is in the list of available loss types, the Wizard loss Type will be set to the default,
        //set needReset and claimMode accordingly
        if ((currentUser as User).LossType == lossType) {
          if (Wizard.LossType != null and Wizard.LossType != (currentUser as User).LossType) {
            needReset = true;
          }
          Wizard.setClaimMode((currentUser as User).LossType, (currentUser as User).QuickClaim as String);
          lossTypeFound = true;
          break;
        }
      }
    }

    if (!lossTypeFound) {
      if (Wizard.LossType != null and Wizard.LossType != ClaimModeArray[0].LossType) {
        needReset = true;
      }
      Wizard.ClaimMode = ClaimModeArray[0];
    }
    Claim.LossType = Wizard.LossType;
    if (needReset) {
      //if the claim loss type has changed, then must reset the wizard by reentering the wizard.
      var lossDate = PolicySearchCriteria.LossDate;
      var searchCriteriaAndSummary = new NewClaimPolicySearchCriteriaAndSummary(PolicySearchCriteria, SelectedPolicySummary);
      var oldClaimMode = Wizard.ClaimMode
      var oldPageMode = Wizard.PageMode
      location.cancel();
      pcf.FNOLWizard.go(searchCriteriaAndSummary, oldClaimMode, lossDate, oldPageMode);
    } else {
      Wizard.resetSteps()
      Wizard.setHighWaterMarkAsCurrentStep();
    }
  }

  function gotoClaimFile(location : pcf.api.Wizard, oldClaim : Claim) {
    location.cancel()
    pcf.ClaimForward.go(oldClaim)
  }

  function isClaimHistoryVisible() : boolean {
    return
      SelectedPolicySummary.PolicyType == PolicyType.TC_PERSONALAUTO
      or SelectedPolicySummary.PolicyType == PolicyType.TC_TRAVEL_PER
      or SelectedPolicySummary.PolicyType == PolicyType.TC_HOMEOWNERS
  }
  
  function search(policySearchResult : IQueryBeanResult<PolicySummary>, location : pcf.api.Wizard) {
    resetVariables();
    SearchUtil.search();
    if (policySearchResult.getCount() == 1) {
      selectPolicyRow(policySearchResult.getFirstResult(), location);
    }
  }
  
  function performSearch() : IQueryBeanResult<entity.PolicySummary> {
    PolicySummaryList = PolicySearchCriteria.performSearch()
    return PolicySummaryList
  }

  function saveSearch(myPolicySearchCriteria : PolicySearchCriteria, myPolicySummaryList : IQueryBeanResult<entity.PolicySummary>) {
    PolicySearchCriteria = myPolicySearchCriteria
    PolicySummaryList = myPolicySummaryList
  }
  
  // loss date processing for 'Next' button
  // return possibly updated policy summary
  function handleLossDateOutOfRange(ps : PolicySummary, wizardLocation : pcf.api.Wizard) : PolicySummary {
    var claimLossDate = Wizard.Claim.LossDate

    var lossDateChanged = claimLossDate != PrevLossDate
    var changes = lossDateChanged
      || ps.PolicyNumber != PrevPolicySummary.PolicyNumber
      || ps.EffectiveDate != PrevPolicySummary.EffectiveDate
      || ps.ExpirationDate != PrevPolicySummary.ExpirationDate
    PrevLossDate = claimLossDate
    PrevPolicySummary = ps

    if (changes) {
      ps.LossDate = Wizard.Claim.LossDate
      var outOfRange = false

      if (ps.LossDate < ps.EffectiveDate) {
        ps.LossDate = ps.EffectiveDate
        outOfRange = true
      } else if (ps.LossDate > ps.ExpirationDate) {
        ps.LossDate = ps.ExpirationDate
        outOfRange = true
      }

      if (outOfRange) { 
        // check other policy summaries
        var closestAsOfDate = claimLossDate.addYears(-100)
        var closestDays = claimLossDate.daysBetween(closestAsOfDate)
        var bestPSum = ps
        var inRangeMatch = false
        
        for (pSum in PolicySummaryList) {
          if (pSum.PolicyNumber == ps.PolicyNumber) {
            if (claimLossDate >= pSum.EffectiveDate and claimLossDate < pSum.ExpirationDate) {
              SelectedPolicySummary = pSum
              Wizard.setPolicyDescription( pSum )
              closestAsOfDate = claimLossDate
              bestPSum = pSum
              inRangeMatch = true
              break
            }
            if (claimLossDate < pSum.EffectiveDate and (claimLossDate.daysBetween(pSum.EffectiveDate)) < closestDays) {
              closestAsOfDate = pSum.EffectiveDate
              closestDays = claimLossDate.daysBetween(closestAsOfDate)
              bestPSum = pSum
            }
            if (claimLossDate > pSum.ExpirationDate and (claimLossDate.daysBetween(pSum.ExpirationDate)) < closestDays) {
              // The policy retrieval plugin for PC will not return a policy if lossDate == policySummary.ExpirationDate and
              // ExpirationDate is usually exclusive by industry standard, so change to 11:59 PM of day before ExpirationDate
              closestAsOfDate = pSum.ExpirationDate.addSeconds(-1)
              closestDays = claimLossDate.daysBetween(closestAsOfDate)
              bestPSum = pSum
            }
          }
        }
        
        var prevEffectiveDate = ps.EffectiveDate
        ps = bestPSum
        PrevPolicySummary = ps
        ps.LossDate = closestAsOfDate
        SelectedPolicySummary = ps
        Wizard.setPolicyDescription( ps )
        
        if (inRangeMatch) {
          switchPolicyPeriod(ps, wizardLocation)
          throw new DisplayableException(DisplayKey.get("Wizard.NewClaimWizard.LossDateInOtherPolicyPeriod"))
        } else if (ps.EffectiveDate == prevEffectiveDate) {
          throw new DisplayableException(DisplayKey.get("Wizard.NewClaimWizard.LossDateOutOfRange"))
       } else {
          switchPolicyPeriod(ps, wizardLocation)
          throw new DisplayableException(DisplayKey.get("Wizard.NewClaimWizard.LossDateOutOfRangeUseOtherPolicyPeriod"))   
       }
      } // if out of range
    } // if changes
    //user went back and changed the loss date, or it was never part of the search criteria to begin with, so refresh
    //the policy summary and mark the policy for reset.
    if(lossDateChanged) {
      var quickClaimMode = Wizard.QuickClaim
      PolicySearchCriteria.LossDate = claimLossDate
      PolicySearchCriteria.PolicyNumber = ps.PolicyNumber
      PolicySummaryList = PolicySearchCriteria.performSearch()
      if (PolicySummaryList.getCount() == 1) {
        var newPs = PolicySummaryList.AtMostOneRow
        if (!Wizard.AtHighWaterMark) {
          Wizard.resetClaimForPolicyChange()
          resetVariables()
          selectPolicyRow(newPs, wizardLocation)
        }
        //selectPolicyRow can cancel the location, evicting newPs from its bundle.  Don't set it in this case.
        if (newPs.Bundle != null) {
          ps = newPs
          Wizard.setPolicyDescription(newPs)
        }
      }
      Wizard.setForcePolicyReset(true) // to ensure that the policy is re-retrieved
      Wizard.QuickClaim = quickClaimMode
    }
    
    // success, go to the next step
    Wizard.savePolicySearch(Wizard.PolicySearchCriteria, ps)      // save in case we return to the policy search step again
    PolicySummaryList = null  // no longer needed past this step
    return ps
  }
  
  // switch to a policy period other than the one the user selected
  // code is the same as the user clicking unselect, then select (but not repeating the search)
  function switchPolicyPeriod(ps : PolicySummary, wizardLocation : pcf.api.Wizard) {
    resetVariables()
    Wizard.resetSteps()
    selectPolicyRow(ps, wizardLocation)
  }
}
