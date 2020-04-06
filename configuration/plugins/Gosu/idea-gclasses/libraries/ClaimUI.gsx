package libraries

@Export
enhancement ClaimUI : entity.Claim
{
  function setInitialValues() {
    if (this.LossType == TC_AUTO) {
      if (this.Policy.PolicyType == PolicyType.TC_BUSINESSAUTO) {
        this.LOBCode = LOBCode.TC_BUSINESSAUTOLINE
      } else {
        this.LOBCode = LOBCode.TC_PERSONALAUTOLINE
      }
    } else if (this.LossType == TC_TRAV ) {
      this.LOBCode = TC_TRAVEL 
    } else if (this.LossType == TC_GL) {
      this.LOBCode = TC_GLLINE
   } else if (this.LossType == TC_PR) {
      if (this.Policy.PolicyType == PolicyType.TC_HOMEOWNERS) {
        this.LOBCode = LOBCode.TC_HOMEOWNERSLINE_HOE
      } else {
        this.LOBCode = TC_CPLINE
      }
   } else if (this.LossType == TC_WC) {
      if(this.LocationCode != null and (this.AddressOwner.Address == null or this.AddressOwner.Address.New)) {
        this.AddressOwner.Address = this.LocationCode.Address
      }
      this.ClaimWorkComp = new ClaimWorkComp(this);
      this.LOBCode = typekey.LOBCode.TC_WORKERSCOMPLINE
      var claimInjuryIncident = this.ensureClaimInjuryIncident();
      claimInjuryIncident.GeneralInjuryType = typekey.InjuryType.TC_SPECIFIC;
      claimInjuryIncident.DetailedInjuryType = typekey.DetailedInjuryType.TC_59;
      if (claimInjuryIncident.BodyParts.length == 0) {
        var newBodyPart = claimInjuryIncident.newBodyPart();
        newBodyPart.PrimaryBodyPart = typekey.BodyPartType.TC_MULTIPLE;
        newBodyPart.DetailedBodyPart = typekey.DetailedBodyPartType.TC_65;
        claimInjuryIncident.addToBodyParts( newBodyPart );
      }
      this.EmploymentData = this.newEmploymentData()
    }
    if(this.ReportedDate == null) {
      this.ReportedDate = gw.api.util.DateUtil.currentDate()
    }
    this.SIUStatus = TC_NO_REFERRAL
    this.IncidentReport = false
  }

  function areInitialValuesSet() : boolean {
    return this.LOBCode != null
  }

  function cancelTrips(checkedTripRU : entity.TripRU[]) {
    for (eachTripRU in checkedTripRU){
      var newTripIncident = new TripIncident()
      newTripIncident.TripRU = eachTripRU
      this.addToIncidents( newTripIncident )
    }
  }
  function undoTripCancellation(checkedTripRU : entity.TripRU[]) {
    for (eachTripRU in checkedTripRU){
      for(eachTripIncident in this.TripIncidentsOnly)
      {
        if(eachTripIncident.TripRU == eachTripRU)
        {
          this.removeFromIncidents( eachTripIncident )
        }
      }
    }
  }
}