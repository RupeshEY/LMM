package gw.command

uses gw.api.databuilder.ClaimBuilder
uses gw.api.databuilder.ExposureBuilder
uses gw.api.databuilder.ReserveBuilder
uses gw.api.databuilder.CheckBuilder
uses gw.api.util.Logger
uses com.guidewire.pl.quickjump.DefaultMethod
uses java.lang.Throwable
uses gw.api.util.CurrencyUtil
uses gw.api.databuilder.RIAgreementGroupBuilder
uses gw.api.databuilder.QuotaShareRITreatyBuilder
uses gw.api.databuilder.SurplusRITreatyBuilder
uses gw.api.databuilder.XolRIAgreementBuilder
uses gw.api.databuilder.PerEventTreatyBuilder
uses gw.api.databuilder.AnnualAggregateTreatyBuilder
uses gw.api.databuilder.FacXolRIAgreementBuilder
uses gw.api.databuilder.FacNXolRIAgreementBuilder
uses gw.testharness.ImportSampleData
uses gw.api.databuilder.FacProportionalRIAgreementBuilder
uses gw.api.databuilder.NxolRIAgreementBuilder

@DefaultMethod("withDefault")
@ImportSampleData
@Export
class CreateRIData extends CCBaseCommand  {

   /**
   * Quick Jump command:  Run CreateRIData withDefault
   * 
   * Run CreateRIData with no argument will execute withDefault()
   * This will create data for 2 Claims:
   * Property  claim: 3 exposures, 2 agreements groups
   * Workers Comp claim: 2  exposures, 1 agreement groups with 3 agreements
   */
  function withDefault() {
    try{
          
      var claim1 = createOpenPropertyClaim()
  
      setUpFinancialData(claim1.Exposures[0], claim1.Exposures[1], claim1.Exposures[2])
      setUpRIData(claim1.Exposures[0], claim1.Exposures[1], claim1.Exposures[2] )
      pcf.ClaimSummary.go( claim1 )
      Logger.logInfo("Create Reinsurance Data Completed on property claim "+claim1.ClaimNumber)       
      
      var claim2 = createOpenWCClaim()
      setUpFinancialData(claim2.Exposures[0], claim2.Exposures[1], null)
      setUpRIData(claim2.Exposures[0], claim2.Exposures[1], null )
      Logger.logInfo("Create Reinsurance Data Completed on WC claim "+claim2.ClaimNumber)
    
    }  catch ( e : Throwable ) {
       e.printStackTrace()
      throw e
    }    
  }
 
 private function createOpenPropertyClaim() :Claim { 
  var  claim = ClaimBuilder.uiReadyProperty().withNonConflictingClaimNumber().create()
  ExposureBuilder.uiReadyPropertyDamage(LossPartyType.TC_INSURED).onClaim(claim).withCoverageSubType(TC_CPBLDGCOV).create()
  ExposureBuilder.uiReadyContent().onClaim(claim).withCoverageSubType(TC_BADOCLIABILITYCOVPD).create()
  ExposureBuilder.uiReadyContent().onClaim(claim).withCoverageSubType(TC_BABOBTAILLIABCOV_PD).create()
  claim.Bundle.commit()
  return   claim
 }
  
   
 private function setUpFinancialData(exp1:Exposure, exp2: Exposure, exp3: Exposure) {
          
    ReserveBuilder.uiReadyReserve(exp1, 1000000bd.ofCurrency(exp1.ClaimCurrency)).withCostType(CostType.TC_CLAIMCOST).withCostCategory(CostCategory.TC_PROPERTY_REPAIR).create()
    ReserveBuilder.uiReadyReserve(exp1, 1000000bd.ofCurrency(exp1.ClaimCurrency)).withCostType(CostType.TC_CLAIMCOST).withCostCategory(CostCategory.TC_PROPERTY_REPAIR).create()
    CheckBuilder.uiReadySinglePaymentCheck(exp1.ReserveLines[0], 1000000bd.ofDefaultCurrency(), CurrencyUtil.getDefaultCurrency(), TransactionStatus.TC_ISSUED, TransactionStatus.TC_SUBMITTED, PaymentType.TC_PARTIAL, true)
      .create()

      
    ReserveBuilder.uiReadyReserve(exp2, 1000000bd.ofCurrency(exp2.ClaimCurrency)).withCostType(CostType.TC_CLAIMCOST).withCostCategory(CostCategory.TC_PROPERTY_REPAIR).create()
    ReserveBuilder.uiReadyReserve(exp2, 1000000bd.ofCurrency(exp2.ClaimCurrency)).withCostType(CostType.TC_CLAIMCOST).withCostCategory(CostCategory.TC_PROPERTY_REPAIR).create()
    var check = CheckBuilder.uiReadySinglePaymentCheck(exp2.ReserveLines[0], 1000000bd.ofDefaultCurrency(), CurrencyUtil.getDefaultCurrency(), TransactionStatus.TC_ISSUED, TransactionStatus.TC_SUBMITTED, PaymentType.TC_PARTIAL, true)
      .create()
    
    if (exp3 != null){
    ReserveBuilder.uiReadyReserve(exp3, 1000000bd.ofCurrency(exp3.ClaimCurrency)).withCostType(CostType.TC_CLAIMCOST).withCostCategory(CostCategory.TC_PROPERTY_REPAIR).create()
    CheckBuilder.uiReadySinglePaymentCheck(exp3.ReserveLines[0], 500000bd).create()
    }
    check.Bundle.commit()
  
  }
  
  
   private function setUpRIData (exp1:Exposure, exp2: Exposure, exp3: Exposure) {
     var currency = exp1.ClaimCurrency
     var group1 = RIAgreementGroupBuilder.uiReady()
      .withRiskName("Property RI")
      .withExposure(exp1)
      .withExposure(exp2)
      .withAgreement(QuotaShareRITreatyBuilder.uiReady(currency)
        .withRecoveryLimit(250000bd.ofCurrency(currency))
        .withCededShare(25)
        .withProportionalShare(0.05)
        .withNotificationThreshold(10000bd.ofCurrency(currency))
        .withAgreementName("25% QS $250,000"))
      .withAgreement(SurplusRITreatyBuilder.uiReady(currency)
        .withCededShare(100)
        .withProportionalShare(0.60)
        .withNotificationThreshold(10000bd.ofCurrency(currency))
        .withAttachmentPoint(1000000bd.ofCurrency(currency))
        .withAgreementName("Surplus 1"))
      .withAgreement(SurplusRITreatyBuilder.uiReady(currency)
        .withCededShare(100)
        .withProportionalShare(0.20)
        .withNotificationThreshold(10000bd.ofCurrency(currency))
        .withAttachmentPoint(4000000bd.ofCurrency(currency))
        .withAgreementName("Surplus 2"))
      .onClaim(exp1.Claim)
      .create()
     
  if (exp3 != null){
    RIAgreementGroupBuilder.uiReady()
      .withRiskName("Liability RI")
      .withExposure(exp3)
      .withAgreement(XolRIAgreementBuilder.uiReady(exp3.ClaimCurrency)
        .withAttachmentPoint(1000000bd.ofCurrency(exp3.ClaimCurrency))
        .withRecoveryLimit(3000000bd.ofCurrency(exp3.ClaimCurrency))
        .withTopOfLayer(4000000bd.ofCurrency(exp3.ClaimCurrency))
        .withNotificationThreshold(10000bd.ofCurrency(exp3.ClaimCurrency))
        .withAgreementName("Liability XOL"))
      .onClaim(exp3.Claim)
      .create()
  }
    group1.Bundle.commit()             
 
   }
   
  
  private function createOpenWCClaim() :Claim { 
  var  claim = ClaimBuilder.uiReadyWorkersCompWithExposures().withNonConflictingClaimNumber().create()
  claim.Bundle.commit()
  return   claim
 }
 /**
   * Quick Jump command:  Run CreateRIData createAgreements
   * 
   * Run CreateRIData with createAgreements will  create a auto Claim with 2 agreement groups:
   * The Treaty Agreements group will create all the treaty agreements 
   * The Facultative Agreements group will create all Fac agreements
   */
  function createAgreements() {
     var claim =  ClaimBuilder.uiReadyAuto()
       .withNonConflictingClaimNumber()
       .withExposure(ExposureBuilder.uiReadyVehicleDamage())
       .create()
     var currency = claim.Currency
     
     ExposureBuilder.uiReadyBodilyInjuryDamage().onClaim(claim).create()
        
     RIAgreementGroupBuilder.uiReady(claim)
      .withRiskName("Treaty Agreements")
      .withExposure(claim.Exposures[0])
      .withAgreement(QuotaShareRITreatyBuilder.uiReady(currency)
        .withRecoveryLimit(250000bd.ofCurrency(currency))
        .withCededShare(25)
        .withProportionalShare(0.05)
        .withNotificationThreshold(10000bd.ofCurrency(currency))
        .withAgreementName("25% QS $250,000"))
      .withAgreement(SurplusRITreatyBuilder.uiReady(currency)
        .withCededShare(100)
        .withProportionalShare(0.60)
        .withNotificationThreshold(10000bd.ofCurrency(currency))
        .withAttachmentPoint(1000000bd.ofCurrency(currency))
        .withAgreementName("Surplus 1"))
      .withAgreement(AnnualAggregateTreatyBuilder.uiReady(currency)
        .withCededShare(100)
        .withRecoveryLimit(3000000bd.ofCurrency(currency))
        .withTopOfLayer(4000000bd.ofCurrency(currency))
        .withNotificationThreshold(10000bd.ofCurrency(currency))
        .withAttachmentPoint(4000000bd.ofCurrency(currency))
        .withAgreementName("AnnualAggregateTreaty"))
      .withAgreement(XolRIAgreementBuilder.uiReady(currency)
        .withAttachmentPoint(1000000bd.ofCurrency(currency))
        .withRecoveryLimit(3000000bd.ofCurrency(currency))
        .withTopOfLayer(4000000bd.ofCurrency(currency))
        .withNotificationThreshold(10000bd.ofCurrency(currency))
        .withAgreementName("Liability XOL"))
       .withAgreement(NxolRIAgreementBuilder.uiReady(currency)
        .withAgreementNumber("NxolRIAgreement")
        .withAttachmentPoint(1000000bd.ofCurrency(currency))
        .withTopOfLayer(3000000bd.ofCurrency(currency))
        .withNotificationThreshold(750000bd.ofCurrency(currency))
        .withCededShare(50)
        .withRecoveryLimit(100bd.ofCurrency(currency)))
       .withAgreement(PerEventTreatyBuilder.uiReady(currency)
        .withAgreementNumber("PerEvent Treaty")
        .withAttachmentPoint(1000000bd.ofCurrency(currency))
        .withRecoveryLimit(3000000bd.ofCurrency(currency))
        .withTopOfLayer(4000000bd.ofCurrency(currency))
        .withNotificationThreshold(750000bd.ofCurrency(currency))
        .withCededShare(50))
       .create()
      
       var group2 = RIAgreementGroupBuilder.uiReady(claim)
       .withRiskName("Facultative Agreements")
       .withExposure(claim.Exposures[1])
       .create()
      
    
       new FacProportionalRIAgreementBuilder()
        .onRIAgreementGroup(group2)
        .withAttachmentPoint(1000000bd.ofCurrency(currency))
        .withNotificationThreshold(750000bd.ofCurrency(currency))
        .withRecoveryLimit(3000000bd.ofCurrency(currency))
        .withCededShare(50)
        .withProportionalShare(50.12345)
        .withAgreementName("FacProportionalRIAgreement")
        .create()
        
         new FacXolRIAgreementBuilder()
        .onRIAgreementGroup(group2)
        .withAttachmentPoint(1000000bd.ofCurrency(currency))
        .withTopOfLayer(3000000bd.ofCurrency(currency))
        .withNotificationThreshold(750000bd.ofCurrency(currency))
        .withRecoveryLimit(3000000bd.ofCurrency(currency))
        .withCededShare(50)
        .withAgreementName("FacXolRIAgreement")
        .create()
        
        new FacNXolRIAgreementBuilder()
        .onRIAgreementGroup(group2)
        .withAttachmentPoint(1000000bd.ofCurrency(currency))
        .withTopOfLayer(3000000bd.ofCurrency(currency))
        .withNotificationThreshold(750000bd.ofCurrency(currency))
        .withRecoveryLimit(3000000bd.ofCurrency(currency))
        .withCededShare(50)
        .withAgreementName("FacNXolRIAgreement")
        .create()
 
    group2.Bundle.commit()
    pcf.ClaimSummary.go( claim ) 
    Logger.logInfo("Create Reinsurance Agreements Completed on Auto claim "+claim.ClaimNumber)            
  }
}
