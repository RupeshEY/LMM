package gw.command

uses com.guidewire.pl.quickjump.Argument
uses com.guidewire.pl.quickjump.DefaultMethod
uses gw.api.database.Query
uses gw.api.database.spatial.SpatialPoint
uses gw.api.databuilder.ActivityBuilder
uses gw.api.databuilder.AddressBuilder
uses gw.api.databuilder.BulkInvoiceBuilder
uses gw.api.databuilder.BulkInvoiceItemBuilder
uses gw.api.databuilder.CatastropheBuilder
uses gw.api.databuilder.CatastrophePerilBuilder
uses gw.api.databuilder.CheckBuilder
uses gw.api.databuilder.CheckSetBuilder
uses gw.api.databuilder.ClaimBuilder
uses gw.api.databuilder.ExposureBuilder
uses gw.api.databuilder.InjuryIncidentBuilder
uses gw.api.databuilder.LargeLossThresholdBuilder
uses gw.api.databuilder.PaymentBuilder
uses gw.api.databuilder.PersonBuilder
uses gw.api.databuilder.PolicyBuilder
uses gw.api.databuilder.PolicyLocationBuilder
uses gw.api.databuilder.PolicyLocationSummaryBuilder
uses gw.api.databuilder.ReserveBuilder
uses gw.api.databuilder.ReserveLineBuilder
uses gw.api.databuilder.ReserveSetBuilder
uses gw.api.databuilder.UserBuilder
uses gw.api.databuilder.VehicleBuilder
uses gw.api.databuilder.VehicleIncidentBuilder
uses gw.api.financials.CheckPayeeInfo
uses gw.api.financials.CurrencyAmount
uses gw.api.util.DateUtil
uses gw.api.util.Logger
uses gw.pl.persistence.core.Bundle
uses gw.sample.heatmap.SampleCatastropheSearch
uses java.lang.Exception
uses gw.api.upgrade.Coercions
uses java.util.ArrayList
uses java.lang.Math
uses java.util.Date
uses gw.util.RandUtil
uses java.math.BigDecimal

@DefaultMethod("withDefault")
@Export
class NewClaim extends CCBaseCommand {

  var dollarAmounts : ArrayList<ArrayList<String>>
  var insuredNames : ArrayList<ArrayList<String>>
  var adjusters : ArrayList<ArrayList<String>>
  var policyNumber = 1001001
    
  private function convertCoordinate(coordinate : double) : double {
    return Math.round((coordinate) * 100000) / 100000.
  }
  
  private function setClaimFields(builder : ClaimBuilder, groupName : String, adjuster : String, cat : Catastrophe,  lossCause : typekey.LossCause, lossType: typekey.LossType,  
                address : ArrayList<String>) : ClaimBuilder {
            
    return builder
        .withNonConflictingClaimNumber()
        .withAssignedGroupFoundByName(groupName)
        .withAssignedUserFoundByName(adjuster)
        .withCatastrophe(cat)
        .withLossCause(lossCause)
        .withLossType(lossType)
        .withLossLocation( buildAddress(address) )
  }

  private function buildAddress(address : ArrayList<String>) : AddressBuilder {
    var latitude = convertCoordinate(Coercions.makePDoubleFrom(address[6]))
    var longitude = convertCoordinate(Coercions.makePDoubleFrom(address[7]))
    return AddressBuilder.uiReadyUSA()
                .withAddressLine1(address[0])
                .withCity(address[1])
                .withState(State.getState(Country.TC_US, address[2]))
                .withPostalCode(address[3])
                .withSpatialPoint(new SpatialPoint(longitude, latitude))
                .withGeocodeStatus(typekey.GeocodeStatus.get(address[4]))
  }

  private function addClaimDetails(claimBundle : Bundle, claim : Claim, exposure : Exposure) {
      if (dollarAmounts == null)
            dollarAmounts = SampleCatastropheSearch.Dollars   
      
      if (exposure == null) {
        exposure = ExposureBuilder.uiReadyVehicleDamage()
                 .onClaim(claim)
                 .withClaimAssignedUser()
                 .withClaimAssignedGroup()
                 .create(claimBundle)
      }

      ActivityBuilder.uiReadyGeneral()
              .onClaim(claim)
              .withActivityPattern(ActivityPattern.finder.getActivityPatternByCode("contact_insured"))
              .withSubject("Make initial contact with insured")
              .withCompleteStatus()
              .withTargetDate(claim.LossDate)
              .withAssignmentDate(claim.LossDate)
              .withEscalationDateNow()
              .withEscalated(true)
              .create(claimBundle) 
  
      ActivityBuilder.uiReadyGeneral()
                  .onClaim(claim)
                  .withExposure(exposure)
                  .withTargetDate(claim.LossDate)
                  .withAssignmentDate(claim.LossDate)
                  .create(claimBundle)
                  
      var reserveLine = new ReserveLineBuilder().withClaim( claim ) 
            .withExposure( exposure )
            .withCostType( CostType.TC_CLAIMCOST )
            .withCostCategory( CostCategory.TC_OTHER )
            .create(claimBundle)            
      
      var dollarAmount = dollarAmounts[random(dollarAmounts.Count)]      
      ReserveBuilder.uiReadyReserve(exposure, new CurrencyAmount(Coercions.makePIntFrom(dollarAmount[0]), TC_USD))
            .withReserveLine( reserveLine ) 
            .withCurrency(TC_USD)
            .onTransactionSet(new ReserveSetBuilder()
                    .withRequestingUser(claim.AssignedUser)
                    .withApprovalStatus(ApprovalStatus.TC_APPROVED)
                    .withApprovalDate(claim.LossDate)
                    .create(claimBundle))            
            .create(claimBundle)                

     var check = CheckBuilder.uiReadyCheckWithoutPaymentOrCheckSet(claim)
            .withStatus( TransactionStatus.TC_ISSUED )
            .withMailingAddress( new AddressBuilder()
              .withAddressLine1("2211 Bridgepointe Parkway")
              .withCity("San Mateo")
              .withState(State.TC_CA)
              .withPostalCode("94404")
              .withCountry(Country.TC_US))
            .withIssueDate(claim.LossDate)
            .create(claimBundle)   
                                                                                      
     PaymentBuilder.uiReadyPayment(claim, check, new CurrencyAmount(Coercions.makePIntFrom(dollarAmount[1]), TC_USD))
            .withStatus( TransactionStatus.TC_SUBMITTED )
            .withReportingCurrency()
            .withPaymentType( PaymentType.TC_PARTIAL )
            .withDoesNotErodeReserves(false)
            .withCurrency(TC_USD)
            .onTransactionSet( new CheckSetBuilder().onClaim( claim )
                    .withCheck( check )
                    .withRequestingUser( claim.AssignedUser )
                    .withApprovalDate(claim.LossDate)
                    .create(claimBundle))
            .withReserveLine(reserveLine)                    
            .create(claimBundle)
  }
  
  @Argument("Description", "description")
  function withDefault() {
    var claim = ClaimBuilder.uiReadyAuto()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Auto1 - TeamA")
            .withAssignedUserFoundByName("aapplegate")
            .withDescription( (Argument == null || Argument.length() == 0) ? "description" : Argument )
            .withSegment(TC_AUTO_LOW)
            .createAndCommit()
    pcf.ClaimSummary.go( claim )  
  }

  @Argument("Description", "description")
  function atAbilityToPay() {
    var claim = ClaimBuilder.uiReadyAuto()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Auto1 - TeamA")
            .withAssignedUserFoundByName("aapplegate")
            .withDescription( (Argument == null || Argument.length() == 0) ? "description" : Argument )
            .withSegment(TC_AUTO_LOW)
            .withExposure(ExposureBuilder.uiReadyVehicleDamage())
            .atAbilityToPay()
            .createAndCommit()
    pcf.ClaimSummary.go( claim )
  }

  @Argument("Description", "description")
  function dayOld() {
    var claim = ClaimBuilder.uiReadyAuto()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Auto1 - TeamA")
            .withAssignedUserFoundByName("aapplegate")
            .withDescription( (Argument == null || Argument.length() == 0) ? "description" : Argument )
            .withSegment(TC_AUTO_LOW)
            .atAbilityToPay()
            .withReportedDate( Coercions.makeDateFrom("yesterday") )
            .createAndCommit()
    pcf.ClaimSummary.go( claim )
  }

  @Argument("Description", "description")
  function homeowners() {
    var claim = ClaimBuilder.uiReadyHomeowners()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Midwest Property A")
            .withAssignedUserFoundByName("wdufraine")
            .withDescription( (Argument == null || Argument.length() == 0) ? "description" : Argument )
            .withSegment(TC_PROP_LOW)
            .createAndCommit()
    pcf.ClaimSummary.go( claim )
  }

  @Argument("Description", "description")
  function wc() {
    var claim = ClaimBuilder.uiReadyWorkersCompWithExposures()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Comp - TeamA")
            .withAssignedUserFoundByName("gickes")
            .withDescription( (Argument == null || Argument.length() == 0) ? "description" : Argument )
            .withSegment(TC_WC_MED_ONLY)
            .createAndCommit()
    pcf.ClaimSummary.go( claim )
  }
  
  @Argument("Description", "description")
  function travel() {
    var claim = ClaimBuilder.uiReadyTravelWithTripRU()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Western Travel Group")
            .withAssignedUserFoundByName("eaustin")
            .withDescription( (Argument == null || Argument.length() == 0) ? "description" : Argument )
            .withSegment(TC_TRAVEL_LOW)
            .createAndCommit()
    pcf.ClaimSummary.go( claim )
  }  

  @Argument("Description", "description")
  function autoWithVehicleIncident() {
    var claim = ClaimBuilder.uiReadyAuto()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Auto1 - TeamA")
            .withAssignedUserFoundByName("aapplegate")
            .withDescription( (Argument == null || Argument.length() == 0) ? "description" : Argument )
            .withIncident( VehicleIncidentBuilder.uiReadyVehicleIncident().withVehicle(new VehicleBuilder().uiReadyVehicle()))
            .withSegment(TC_AUTO_LOW)
            .createAndCommit()
    pcf.ClaimSummary.go( claim )  
  }


  function catClaims() {
    var catastrophe = Query.make(entity.Catastrophe).compare("Name", Equals, "CA Otto Water Catastrophe").select().AtMostOneRow
    if (catastrophe == null) {
      catastrophe = CatastropheBuilder.uiReadyCatastrophe()
              .withName("CA Otto Water Catastrophe")
              .withNumber("123")
              .withDescription("CA Otto Water Catastrophe")
              .withValidFrom(CurrentDate.addDays(-30))
              .withValidTo(CurrentDate.addDays(30))
              .withPeril(CatastrophePerilBuilder.uiReadyCatastrophePeril()
                      .withLossCause(LossCause.TC_WATERDAMAGE)
                      .withLossType(LossType.TC_PR))
              .withPeril(CatastrophePerilBuilder.uiReadyCatastrophePeril()
                      .withLossCause(LossCause.TC_GLASSBREAKAGE)
                      .withLossType(LossType.TC_AUTO))
              .withZone("CA", TC_STATE, TC_US)                
              .createAndCommit()
         
    }
    
    // Create Homeowners claims with SF loss location
    var addresses = {
           {"870 MARKET ST STE 215","SAN FRANCISCO","CA","94102-3002","exact","233445409","37.7857","-122.4059"},
           {"22 BATTERY ST STE 333","SAN FRANCISCO","CA","94111","exact","233453586","37.7916","-122.3996"},    
           {"760 MARKET STREET, STE 939","SAN FRANCISCO","CA","94102-2310","exact","233445409","37.7866","-122.4049"}, 
           {"351 VALENCIA ST","SAN FRANCISCO","CA","94103","exact","233445422","37.7673","-122.4221"},
           {"ONE EMBARCADERO CTR, 16TH FL","SAN FRANCISCO","CA","94111-3765","postalcode","233453586","37.7946","-122.4003"},
           {"SUITE 301 4306 GEARY BLVD.","SAN FRANCISCO","CA","94118","exact","233445415","37.7810","-122.4655"},
           {"450 SUTTER SUITE 1038","SAN FRANCISCO","CA","94108","exact","233453586","37.7893","-122.4078"},
           {"1580 VALENCIA ST STE 605","SAN FRANCISCO","CA","94110","exact","233445423","37.7483","-122.4203"},
           {"2100 WEBSTER ST STE. #423","SAN FRANCISCO","CA","94115","exact","233445414","37.7900","-122.4324"},
           {"246 FIRST STREET, STE.101","SAN FRANCISCO","CA","94105-2637","postalcode","233453586","37.7881","-122.3954"},   
           {"2233 IRVING ST","SAN FRANCISCO","CA","94122-1618","exact","233445430","37.7634","-122.4818"},  
           {"2619 1/2 SUTTER ST","SAN FRANCISCO","CA","94115-2924","exact","233445414","37.7848","-122.4435"},
           {"2204 UNION ST","SAN FRANCISCO","CA","94123","exact","233453593","37.7971","-122.4356"}, 
           {"545 SANSOME STREET","SAN FRANCISCO","CA","94111-2908","exact","233453586","37.7954","-122.4015"},    
           {"909 HYDE ST, SUITE 234","SAN FRANCISCO","CA","94109","exact","233445409","37.7892","-122.4170"}}
           
   var closedAddresses = {
           {"2645 OCEAN AVE","SAN FRANCISCO","CA","94132-1633","exact","233445425","37.7320","-122.4739"},
           {"1580 VALENCIA, STE 201","SAN FRANCISCO","CA","94110","exact","233445423","37.7483","-122.4203"},    
           {"156 WEST PORTAL AVE","SAN FRANCISCO","CA","94127-1306","exact","233445425","37.7392","-122.4676"},
           {"4736 MISSION ST.","SAN FRANCISCO","CA","94112","exact","233445419","37.7225","-122.4365"}, 
           {"323 6TH AVE","SAN FRANCISCO","CA","94118-2313","exact","233445415","37.7826","-122.4644"} }

    for (address in addresses) {
    gw.transaction.Transaction.runWithNewBundle( \ claimBundle -> {
      
       var claim = setClaimFields(new ClaimBuilder().uiReadyHomeowners(), "Midwest Property A", "wdufraine", 
                                catastrophe, LossCause.TC_WATERDAMAGE, LossType.TC_PR, address)
                      .withNonConflictingClaimNumber()          
                      .create(claimBundle)                        
      // addClaimDetails(claimBundle, claim)       
          
      claimBundle.commit()   

      Logger.logInfo("CAT Otto Open Claim: " + claim.ClaimNumber)
    })
    }  
    
    for (address in closedAddresses) {
      var claim = setClaimFields( new ClaimBuilder().uiReadyHomeowners(), "Midwest Property A", "wdufraine",
                              catastrophe, LossCause.TC_WATERDAMAGE, LossType.TC_PR, address)
                         .closed()
                         .createAndCommitInNewBundle()                
      Logger.logInfo("CAT Otto Closed Claim: " + claim.ClaimNumber)
    }
    
    // Create sensitive claim.  This claim should display in the HeatMap and NOT listed in Search Results LV for 
    // a user who does not have the correct permission.  
    // See http://ccriki/index.php/Denali/Tab_Bar/Administration/Catastrophes/Catastrophe_Search#r16335
    var sensitiveAddress = {"3838 CALIFORNIA STREET","SAN FRANCISCO","CA","94118-1522","exact","233445415","37.7859","-122.4577"}
        
    var sensitiveClaim = setClaimFields( new ClaimBuilder().uiReadyHomeowners(),  
                                          "Midwest Property B", "mking", catastrophe, LossCause.TC_WATERDAMAGE, LossType.TC_PR, 
                                          sensitiveAddress)
                               .withPermissionRequired(ClaimSecurityType.TC_SENSITIVECLAIM)           
                               .createAndCommit()            
  
       // Rebuild the Claim ACL according to the current security level, configuration, and claim assignees/users (security-config.xml)
    sensitiveClaim.rebuildClaimACL()
            
    Logger.logInfo("CAT Otto Sensitive Claim: " + sensitiveClaim.ClaimNumber)
         
    // Create Travel claims with SF loss location.  This claim should display in the HeatMap and NOT listed in Search Results LV.
    // See http://ccriki/index.php/Denali/Tab_Bar/Administration/Catastrophes/Catastrophe_Search#r16335
    var travelAddress = {"3500 LAWTON STREET","SAN FRANCISCO","CA","94122-3054","exact","233445431","37.7569","-122.5003"}
    var travelClaim = setClaimFields( new  ClaimBuilder().uiReadyTravel(), 
                                       "Western Travel Group", "eaustin", catastrophe, LossCause.TC_WATERDAMAGE,  LossType.TC_TRAV, 
                                       travelAddress)
                            .createAndCommit()                                              
                                
    Logger.logInfo("CAT Otto Travel Claim: " + travelClaim.ClaimNumber)    
  }

  // get a random int 0..max inclusive
  private function random(max : int) : int {
    return Math.min(  (Math.random()*(max)) as int,   max-1)
  }

  var generatePolicyLocations = true  // if true, generate policy locations for all the addresses and claims for 1/3 of the addresses
  
  function catPaulaClaims() {

    var n = ""
    var desc = "CA Paula Water Catastrophe"
    var catName = desc + n
    var catastrophe = Query.make(entity.Catastrophe).compare("Name", Equals, catName).select().AtMostOneRow
    if (catastrophe == null) {
      var cat = CatastropheBuilder.uiReadyCatastrophe()
              .withName(catName)
              .withNumber("250" + n)
              .withDescription(desc)
              .withValidFrom(CurrentDate.addDays(-30))
              .withValidTo(CurrentDate.addDays(30))
              .withPeril(CatastrophePerilBuilder.uiReadyCatastrophePeril()
                      .withLossCause(LossCause.TC_WATERDAMAGE)
                      .withLossType(LossType.TC_PR))
              .withPeril(CatastrophePerilBuilder.uiReadyCatastrophePeril()
                      .withLossCause(LossCause.TC_GLASSBREAKAGE)
                      .withLossType(LossType.TC_AUTO))
              .withZone("CA", TC_STATE, TC_US) 
              .withTopLeftLatitude(38.21660).withTopLeftLongitude(-122.83812)
              .withBottomRightLatitude(37.21722).withBottomRightLongitude(-121.71204)
              .withPolicyEffectiveDate(Date.CurrentDate.addDays(-3))
              .withPolicyRetrievalSetTime(Date.CurrentDate.addDays(-2))
              .withPolicyRetrievalCompletionTime(Date.CurrentDate.addDays(-1))
              .createAndCommit() 
       catastrophe = cat
              
       var addresses = SampleCatastropheSearch.Addresses

       insuredNames = SampleCatastropheSearch.Insureds
       adjusters = SampleCatastropheSearch.Adjusters

       try {
         UserBuilder.andyApplegate().createAndCommitInNewBundle()
       } catch (e : Exception) {
         print("ignore error if applegate already exists")
       }

       var closedAddresses = {
               {"2645 OCEAN AVE","SAN FRANCISCO","CA","94132-1633","exact","233445425","37.7320","-122.4739"},
               {"1580 VALENCIA, STE 201","SAN FRANCISCO","CA","94110","exact","233445423","37.7483","-122.4203"},    
               {"156 WEST PORTAL AVE","SAN FRANCISCO","CA","94127-1306","exact","233445425","37.7392","-122.4676"},
               {"4736 MISSION ST.","SAN FRANCISCO","CA","94112","exact","233445419","37.7225","-122.4365"}, 
               {"323 6TH AVE","SAN FRANCISCO","CA","94118-2313","exact","233445415","37.7826","-122.4644"} }

      var claimCount = generatePolicyLocations ? addresses.Count/3 : addresses.Count
      var policyCounter = 0

      for (var addrIndex in 0..|claimCount) {
        var pcPolicyNumber = ((SampleCatastropheSearch.StartingPolicyNumber + policyCounter) as String) + "-01"
//        print("Creating policy # ${pcPolicyNumber}")
        var insured = insuredNames[policyCounter % insuredNames.Count]
        policyCounter++
        var address = addresses[addrIndex]
        if (address[4] == "failure") {
          continue
        }
        gw.transaction.Transaction.runWithNewBundle( \ claimBundle -> {
          
           var adjuster = adjusters[random(adjusters.Count)]    
        
           var claim = setClaimFields(new ClaimBuilder().uiReadyHomeowners(), adjuster[1], adjuster[0], cat,
                                       LossCause.TC_WATERDAMAGE, LossType.TC_PR, address)
                     .withPolicy(PolicyBuilder.homeowners()
                                  .withPolicyNumber(pcPolicyNumber)
                                  .withNewInsured(insured[0], insured[1])
                                  .withPolicyLocation(new PolicyLocationBuilder()
                                                      .withLocationNumber("1")
                                                      .withAddress(buildAddress(address))))
                     .withReporter(PersonBuilder.uiReadyPerson()
                                   .withFirstName(insured[0])
                                   .withLastName(insured[1]))   
                     .reportedByInsured()
                     .create(claimBundle)

           var exposure = ExposureBuilder.uiReadyDwelling()
                 .onClaim(claim)
                 .withClaimAssignedUser()
                 .withClaimAssignedGroup()
                 .create(claimBundle)
          if (claim.getInsured().getPrimaryAddress() == null) {
            claim.getInsured().setPrimaryAddress(buildAddress(address).create(claimBundle))
          }
           addClaimDetails(claimBundle, claim, exposure)
           claimBundle.commit()                     
           policyNumber++         
           if (generatePolicyLocations) {
             createPolicyLocationSummary(catastrophe, insured[0] + " " + insured[1], address, claim, pcPolicyNumber)
           }
//          Logger.logInfo("CAT Paula Open Claim: " + claim.ClaimNumber)
        }) 
      }
    
      if (generatePolicyLocations) {
        for (var addrIndex in claimCount..|addresses.Count) {
          var address = addresses[addrIndex]
          var pcPolicyNumber = ((SampleCatastropheSearch.StartingPolicyNumber + policyCounter) as String) + "-01"
          var insured = insuredNames[policyCounter % insuredNames.Count]
//          print("Creating policy # ${pcPolicyNumber}")
          policyCounter++
          createPolicyLocationSummary(catastrophe, insured[0] + " " + insured[1], address, null, pcPolicyNumber)
        }
      }
  
        for (address in closedAddresses) {
          gw.transaction.Transaction.runWithNewBundle( \ claimBundle -> {
            var insured = insuredNames[random(insuredNames.Count)]
            var claim = setClaimFields(new ClaimBuilder().uiReadyHomeowners(), 
                                        "Midwest Property A", "wdufraine", cat, LossCause.TC_WATERDAMAGE, LossType.TC_PR, address )
                       .withPolicy(PolicyBuilder.homeowners()
                                    .withPolicyNumber("P"+ policyNumber)
                                    .withNewInsured(insured[0], insured[1]))
                       .withReporter(PersonBuilder.uiReadyPerson()
                                     .withFirstName(insured[0])
                                     .withLastName(insured[1]))   
                       .reportedByInsured()
                    .closed()
                    .create(claimBundle)
            if (claim.getInsured().getPrimaryAddress() == null) {
              claim.getInsured().setPrimaryAddress(buildAddress(address).create(claimBundle))
            }
            addClaimDetails(claimBundle, claim, null)
            claimBundle.commit()
            policyNumber++
            Logger.logInfo("CAT Paula Closed Claim: " + claim.ClaimNumber)
          })
      }

        // Create sensitive claim.  This claim should display in the HeatMap and NOT listed in Search Results LV for 
        // a user who does not have the correct permission.  
        // See http://ccriki/index.php/Denali/Tab_Bar/Administration/Catastrophes/Catastrophe_Search#r16335
        var sensitiveAddress = {"3838 CALIFORNIA STREET","SAN FRANCISCO","CA","94118-1522","exact","233445415","37.7859","-122.4577"}
          
        var sensitiveClaim = setClaimFields(new ClaimBuilder().uiReadyHomeowners(), 
                                           "Midwest Property B", "mking", cat, LossCause.TC_WATERDAMAGE, LossType.TC_PR, sensitiveAddress)
               .withPermissionRequired(ClaimSecurityType.TC_SENSITIVECLAIM)
               .createAndCommit()

        // Rebuild the Claim ACL according to the current security level, configuration, and claim assignees/users (security-config.xml)
        sensitiveClaim.rebuildClaimACL()
              
        Logger.logInfo("CAT Paula Sensitive Claim: " + sensitiveClaim.ClaimNumber)
           
        // Create Travel claims with SF loss location.  This claim should display in the HeatMap and NOT listed in Search Results LV.
        // See http://ccriki/index.php/Denali/Tab_Bar/Administration/Catastrophes/Catastrophe_Search#r16335
        var travelAddress = {"3500 LAWTON STREET","SAN FRANCISCO","CA","94122-3054","exact","233445431","37.7569","-122.5003"}
     

        var travelClaim = setClaimFields( new ClaimBuilder().uiReadyTravel(),  
                                           "Western Travel Group", "eaustin", cat, LossCause.TC_WATERDAMAGE, LossType.TC_TRAV, travelAddress )
                                           .createAndCommit()
                            
        Logger.logInfo("CAT Paula Claim Travel: " + travelClaim.ClaimNumber)
      }
    }
    
    var pidCounter = 0;
    
    // Create a policy location summary for the address.  If claim is non-null, make fields match the claim
    function createPolicyLocationSummary(catastrophe : Catastrophe, name : String, address : java.util.ArrayList<java.lang.String>, claim : Claim, pcPolicyNumber : String) {
      gw.transaction.Transaction.runWithNewBundle( \ plsBundle -> {
        var policyLocationSummary = new PolicyLocationSummaryBuilder()
                                        .withCatastrophe(catastrophe)
                                        .withAddressLine1(address[0])
                                        .withCity(address[1])
                                        .withState(typekey.State.get(address[2]))
                                        .withPostalCode(address[3])
                                        .withInsuredAddressLine1(address[0])  // set insured address to policy location address
                                        .withInsuredCity(address[1])
                                        .withInsuredState(typekey.State.get(address[2]))
                                        .withInsuredPostalCode(address[3])
                                        .withLatitude(convertCoordinate(Coercions.makePDoubleFrom(address[6])))
                                        .withLongitude(convertCoordinate(Coercions.makePDoubleFrom(address[7])))
                                        .withPolicySystemId("1")  // can't be null

        var totalInsured = RandUtil.randIntInRange(1, 100) * 10000
        if (claim != null) {
          var policy = claim.Policy
          var insured = claim.Policy.insured
          policyLocationSummary.withPolicyNumber(policy.PolicyNumber) 
                               .withPolicyType(policy.PolicyType)
                               .withInsuredName(name)
                               .withPhone(insured.PrimaryPhoneValue)
                               .withEmailAddress(insured.EmailAddress1)
                               .withTotalInsured((totalInsured as BigDecimal).ofCurrency(claim.Currency))
          policyLocationSummary.create(plsBundle)
        } else {
          pidCounter++
          policyLocationSummary.withPolicyNumber(pcPolicyNumber)
                               .withPolicyType(PolicyType.TC_HOMEOWNERS)
                               .withInsuredName(name)                                       
                               .withPhone("650-867-5309")
                               .withEmailAddress("jenny@guidewire.com")
                               .withTotalInsured((totalInsured as BigDecimal).ofDefaultCurrency())
          policyLocationSummary.create(plsBundle)
        }
      })
    }


  function catFireClaims() {
    var catastrophe = Query.make(entity.Catastrophe).compare("Name", Equals, "San Jose Fire Storm").select().AtMostOneRow
    if (catastrophe == null) {
      catastrophe = CatastropheBuilder.uiReadyCatastrophe()
              .withName("San Jose Fire Storm")
              .withNumber("222")
              .withDescription("San Jose Fire Storm")
              .withValidFrom(CurrentDate.addDays(-30))
              .withValidTo(CurrentDate.addDays(30))
              .withPeril(CatastrophePerilBuilder.uiReadyCatastrophePeril()
                      .withLossCause(LossCause.TC_FIRE)
                      .withLossType(LossType.TC_PR))
              .withPeril(CatastrophePerilBuilder.uiReadyCatastrophePeril()
                      .withLossCause(LossCause.TC_FIRE)
                      .withLossType(LossType.TC_AUTO))
              .withZone("CA", TC_STATE, TC_US)                
              .create() 
    }
    
    var addresses2 = {
            {"751 S. BASCOM AVENUE","SAN JOSE","CA","95128-2604","exact","233446197","37.3133","-121.9318"}, 
            {"2058 TULLY ROAD","SAN JOSE","CA","95122-1357","exact","233446025","37.3264","-121.8199"},
            {"5330 CAMDEN AVENUE","SAN JOSE","CA","95124-5828","exact","233445703","37.2415","-121.9048"},
            {"2007 WEST HEDDING STREET #100","SAN JOSE","CA","95128-1428","exact","233446204","37.3319","-121.9347"},
            {"52 HAROLD AVE","SAN JOSE","CA","95117-1026","exact","233446198","37.3243","-121.9622"},
            {"2121 CURTNER AVE","SAN JOSE","CA","95124-1308","exact","233446152","37.2725","-121.9340"},
            {"2505 SAMARITAN DRIVE, SUITE #504","SAN JOSE","CA","95124-4006","exact","233445752","37.2511","-121.9492"},
            {"1165 S DEANZA BLVD #A","SAN JOSE","CA","95129","exact","233446190","37.3041","-122.0323"},
            {"2046 CAMDEN AVE","SAN JOSE","CA","95124-2023","exact","233445700","37.2618","-121.9332"},
            {"3591 STEVENS CREEK BLVD.","SAN JOSE","CA","95117","exact","233446198","37.3233","-121.9624"},
            {"618 BLOSSOM HILL RD.","SAN JOSE","CA","95123-3048","exact","233446146","37.2506","-121.8426"},
            {"87 NORTH 67TH ST.","SAN JOSE","CA","95112","postalcode","233446200","37.3466","-121.8862"},
            {"1625 THE ALAMEDA, SUITE 515","SAN JOSE","CA","95126","exact","233446202","37.3357","-121.9171"},
            {"2512 SAMARITAN CT STE A","SAN JOSE","CA","95124-4002","exact","233445752","37.2512","-121.9499"},
            {"28 NORTH FIRST STREET STE 202","SAN JOSE","CA","95113-1210","postalcode","233446202","37.3366","-121.8909"}}
  
    for (address in addresses2) {
        var claim = setClaimFields( new ClaimBuilder().uiReadyHomeowners(), "Midwest Property A", "wdufraine", 
                                     catastrophe, LossCause.TC_FIRE, LossType.TC_PR, address)
                                     .withNonConflictingClaimNumber()
                                     .createAndCommit()
              
      Logger.logInfo("San Jose CAT Claim: " + claim.ClaimNumber)
    }
    
  }
   
   function withClaimIndicators() : String {
    var newClaim : Claim
    var yellowClaim : Claim
    var redClaim : Claim
    
    var lossDate = DateUtil.currentDate().addBusinessDays(-5)   
 
    new LargeLossThresholdBuilder()
          .withPolicyType( PolicyType.TC_PERSONALAUTO )
          .withNotificationType( LargeLossNotificationType.TC_CC )
          .withThresholdValue( new BigDecimal("20000") )
          .create()
    
    newClaim = ClaimBuilder.uiReadyAuto()
          .coverageInQuestion()
          .withNonConflictingClaimNumber()
          .withIncident(InjuryIncidentBuilder.uiReadyInjuryIncident().withSeverity(SeverityType.TC_FATAL))
          .withFlag(FlaggedType.TC_ISFLAGGED)
          .withLitigationStatus(LitigationStatus.TC_LITIGATED)
          .withLossDate(lossDate)
          .withReportedDate(lossDate)
          .create()

    var reserve = ReserveBuilder.uiReadyClaimLevelReserve(newClaim, 100000bd.ofCurrency(newClaim.Currency)).create()
    CheckBuilder.uiReadySinglePaymentCheck(reserve.ReserveLine, 10000bd).create()
        
    newClaim.SIUStatus = SIUStatus.TC_UNDER_INVESTIGATION ;

    newClaim.Bundle.commit()
    newClaim#CreateTime.set(lossDate)
    newClaim.Bundle.commit()
    print("ClaimNumber = " + newClaim.ClaimNumber)
    pcf.ClaimSummary.go(newClaim)
    
    //create a claim with yellow open days progress bar
    lossDate = DateUtil.currentDate().addBusinessDays(-10)   
 
    new LargeLossThresholdBuilder()
          .withPolicyType( PolicyType.TC_PERSONALAUTO )
          .withNotificationType( LargeLossNotificationType.TC_CC )
          .create()      
    yellowClaim = ClaimBuilder.uiReadyAuto()
          .withNonConflictingClaimNumber()
          .withLossDate(lossDate)
          .withReportedDate(lossDate)        
          .create()
    yellowClaim.Bundle.commit()
    yellowClaim#CreateTime.set(lossDate)
    yellowClaim.Bundle.commit()
    print("Yellow ClaimNumber = " + yellowClaim.ClaimNumber)  
    
    //create a claim with red open days progress bar
    lossDate = DateUtil.currentDate().addBusinessDays(-45)   
 
    new LargeLossThresholdBuilder()
          .withPolicyType( PolicyType.TC_PERSONALAUTO )
          .withNotificationType( LargeLossNotificationType.TC_CC )
          .create()      
    redClaim = ClaimBuilder.uiReadyAuto()
          .withNonConflictingClaimNumber()
          .withLossDate(lossDate)
          .withReportedDate(lossDate)        
          .create()
    redClaim.Bundle.commit()
    redClaim#CreateTime.set(lossDate)
    redClaim.Bundle.commit()
    print("Red ClaimNumber = " + redClaim.ClaimNumber)   
    return "Yellow ClaimNumber = " + yellowClaim.ClaimNumber + "; Red ClaimNumber = " + redClaim.ClaimNumber
        
  }// end withClaimIndicators
  
  @Argument("Reserve Amount", "2000")
  function withReserves() {
    var costCategory = CostCategory.TC_BODY
    var costType = CostType.TC_CLAIMCOST
    var claim = ClaimBuilder.uiReadyAuto()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Auto1 - TeamA")
            .withAssignedUserFoundByName("aapplegate")
            .withDescription( "description" )
            .withSegment(TC_AUTO_LOW)
            .withExposure(ExposureBuilder.uiReadyVehicleDamage())
            .createAndCommit()
    pcf.ClaimSummary.go( claim )
    claim.Exposures.first().setAvailableReserves(costType, costCategory , (Coercions.makeBigDecimalFrom(Argument)) *2, User.util.CurrentUser)
    claim.Bundle.commit()
  }
  
  @Argument("Check Amount", "1000")
  function withCheck() {
    var costCategory = CostCategory.TC_BODY
    var costType = CostType.TC_CLAIMCOST
    var payee = PersonBuilder.uiReadyPerson().create()
    var claim = ClaimBuilder.uiReadyAuto()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Auto1 - TeamA")
            .withAssignedUserFoundByName("aapplegate")
            .withDescription("description")
            .withSegment(TC_AUTO_LOW)
            .withExposure(ExposureBuilder.uiReadyVehicleDamage())
            .createAndCommit()
    pcf.ClaimSummary.go( claim )
    claim.Exposures.first().setAvailableReserves(costType, costCategory , (Coercions.makeBigDecimalFrom(Argument)) *2, User.util.CurrentUser)
    claim.Exposures.first().CheckCreator
        .withCheckAmount(Coercions.makeBigDecimalFrom(Argument))
        .withCostCategory(costCategory)
        .withCostType(costType)
        .withPrimaryPayee(new CheckPayeeInfo().withPayee(payee)
            .withRecipient(payee).withPayTo(payee.DisplayName).withPayeeRole(TC_OTHER).withMailingAddress(payee.PrimaryAddress))
        .createAndPrepareForCommit() 
    claim.Bundle.commit()
  }
    
  @Argument("Check Amount", "1000")
  function withRecovery() {
    var costCategory = CostCategory.TC_BODY
    var costType = CostType.TC_CLAIMCOST
    var payee = PersonBuilder.uiReadyPerson().create()
    var claim = ClaimBuilder.uiReadyAuto()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Auto1 - TeamA")
            .withAssignedUserFoundByName("aapplegate")
            .withDescription( "description"  )
            .withSegment(TC_AUTO_LOW)
            .withExposure(ExposureBuilder.uiReadyVehicleDamage())
            .createAndCommit()
    pcf.ClaimSummary.go( claim )
    claim.Exposures.first().setAvailableReserves(costType, costCategory , (Coercions.makeBigDecimalFrom(Argument)) *2, User.util.CurrentUser)
    var chk = claim.Exposures.first().CheckCreator
        .withCheckAmount(Coercions.makeBigDecimalFrom(Argument)*1.5)
        .withCostCategory(costCategory)
        .withCostType(costType)
        .withPrimaryPayee(new CheckPayeeInfo().withPayee(payee)
            .withRecipient(payee).withPayTo(payee.DisplayName).withPayeeRole(TC_OTHER).withMailingAddress(payee.PrimaryAddress))
        .createAndPrepareForCommit()
    claim.Exposures.first().createRecovery(chk.Payees.first().ClaimContact.Contact, costType, costCategory, TC_CREDIT_EXP, TC_EXPERTS, Coercions.makeBigDecimalFrom(Argument), "comment", User.util.CurrentUser)
    claim.Bundle.commit()
  }
  
  @Argument("Check Amount", "1000")
  function withRecoveryReserve() {
    var costCategory = CostCategory.TC_BODY
    var costType = CostType.TC_CLAIMCOST
    var payee = PersonBuilder.uiReadyPerson().create()
    var claim = ClaimBuilder.uiReadyAuto()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Auto1 - TeamA")
            .withAssignedUserFoundByName("aapplegate")
            .withDescription( "description"  )
            .withSegment(TC_AUTO_LOW)
            .withExposure(ExposureBuilder.uiReadyVehicleDamage())
            .createAndCommit()
    pcf.ClaimSummary.go( claim )
    claim.Exposures.first().setAvailableReserves(costType, costCategory , (Coercions.makeBigDecimalFrom(Argument)) *2, User.util.CurrentUser)
    claim.Exposures.first().CheckCreator
        .withCheckAmount(Coercions.makeBigDecimalFrom(Argument)*1.5)
        .withCostCategory(costCategory)
        .withCostType(costType)
        .withPrimaryPayee(new CheckPayeeInfo().withPayee(payee)
            .withRecipient(payee).withPayTo(payee.DisplayName).withPayeeRole(TC_OTHER).withMailingAddress(payee.PrimaryAddress))
        .createAndPrepareForCommit()
    claim.Exposures.first().setOpenRecoveryReserves(costType, costCategory, TC_CREDIT_LOSS, Coercions.makeBigDecimalFrom(Argument), User.util.CurrentUser)
    claim.Bundle.commit()
  }
  
  @Argument("Check Amount", "1000")
  function withBulkInvoiceDraft() {
    var costCategory = CostCategory.TC_BODY
    var costType = CostType.TC_CLAIMCOST
    var payee = PersonBuilder.uiReadyPerson().create()
    var claim = ClaimBuilder.uiReadyAuto()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Auto1 - TeamA")
            .withAssignedUserFoundByName("aapplegate")
            .withDescription( "description"  )
            .withSegment(TC_AUTO_LOW)
            .withExposure(ExposureBuilder.uiReadyVehicleDamage())
            .createAndCommit()
    pcf.ClaimSummary.go( claim )
    
    claim.Exposures.first().setAvailableReserves(costType, costCategory , (Coercions.makeBigDecimalFrom(Argument)) *2, User.util.CurrentUser)
    BulkInvoiceBuilder.uiReadyBulkInvoice()
        .withItem(new BulkInvoiceItemBuilder()
            .withClaim(claim)
            .withAmount((Coercions.makeBigDecimalFrom(Argument)).ofCurrency(claim.Currency))
            .withPaymentType(TC_PARTIAL)
            .withCostType(costType)
            .withCostCategory(costCategory)
            .withReserveLine(claim.Exposures.first().ReserveLines.first())
            ).createAndCommit()
    claim.Bundle.commit()
  }
  
  @Argument("Check Amount", "1000")
  function withBulkInvoiceSubmitted() {
    var costCategory = CostCategory.TC_BODY
    var costType = CostType.TC_CLAIMCOST
    var payee = PersonBuilder.uiReadyPerson().create()
    var claim = ClaimBuilder.uiReadyAuto()
            .withNonConflictingClaimNumber()
            .open()
            .assigned()
            .withAssignedGroupFoundByName("Auto1 - TeamA")
            .withAssignedUserFoundByName("aapplegate")
            .withDescription( "description"  )
            .withSegment(TC_AUTO_LOW)
            .withExposure(ExposureBuilder.uiReadyVehicleDamage())
            .createAndCommit()
    pcf.ClaimSummary.go( claim )
    
    claim.Exposures.first().setAvailableReserves(costType, costCategory , (Coercions.makeBigDecimalFrom(Argument)) *2, User.util.CurrentUser)
    var BI = BulkInvoiceBuilder.uiReadyBulkInvoice()
        .withItem(new BulkInvoiceItemBuilder()
            .withClaim(claim)
            .withAmount((Coercions.makeBigDecimalFrom(Argument)).ofCurrency(claim.Currency))
            .withPaymentType(TC_PARTIAL)
            .withCostType(costType)
            .withCostCategory(costCategory)
            .withReserveLine(claim.Exposures.first().ReserveLines.first())
            ).createAndCommit()
    BI.validate()
    BI.submitForApproval() 
    claim.Bundle.commit()
  }

}
