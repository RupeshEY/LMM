package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs

uses java.math.BigDecimal

class ClaimDataContractMarketCreator {

  public static function createContractMarket(final claimData: ECFMessageClaimData_Ext, final xmlDto: ClaimMessageDTO){
    var claimNotifyRq = xmlDto._claimNotifyRq
    var claimRetrieveRs = xmlDto._claimRetrieveRs
    if (claimNotifyRq?.ClaimMovement?.Extension != null) {
      mapClaimNotifyContractMarket(claimData, claimNotifyRq)
    } else {
      mapRetrieveClaimContractMarket(claimData, claimRetrieveRs)
    }
  }

  private static function mapClaimNotifyContractMarket(claimData: ECFMessageClaimData_Ext, claimNotifyRq: ClaimNotifyEventRq) {
    var insurerParty = claimNotifyRq.ClaimMovement.Insurer?.Party
    var insurerPartyName = insurerParty.Name
    var insurerPartyId = insurerParty.FirstId
    var insurerBureau = insurerParty.FirstAgency

    if (claimNotifyRq.ClaimMovement.Extension != null) {
      var extension = claimNotifyRq.ClaimMovement.Extension
      var contractMarkets = extension.Contract?.ContractMarket
      contractMarkets?.each(\contractMarket -> {
        contractMarket.InsurerOrReinsurer.each(\insurerOrReinsurer -> {
          var primaryRoleFlag = false
          if (contractMarket.getAgency() == insurerBureau and
              (insurerOrReinsurer.Party.Id.first() == insurerPartyId
                  or insurerOrReinsurer.Party.Name == insurerPartyName)) {
            primaryRoleFlag = true
          }
          var contractMarket_ext = createECFContractMarket(insurerOrReinsurer.Party, primaryRoleFlag,
              insurerOrReinsurer.ParticipantFunction, insurerOrReinsurer.InsurerSharePercentage.Rate)
          claimData.addToECFContractMarkets(contractMarket_ext)
        })
      })
    }
  }

  private static function mapRetrieveClaimContractMarket(claimData: ECFMessageClaimData_Ext, claimRetrieveRs: RetrieveClaimRs) {
    var insurerParty = claimRetrieveRs.ClaimMovement.Insurer?.Party
    var insurerPartyName = insurerParty.Name
    var insurerPartyId = insurerParty.FirstId
    var insurerBureau = insurerParty.FirstAgency
    //Claim Retrieve Response Contract Market Details
    if (claimRetrieveRs.ClaimMovement.Extension != null) {
      var extension = claimRetrieveRs.ClaimMovement.Extension
      var contractMarkets = extension.Contract?.ContractMarket
      contractMarkets?.each(\contractMarket -> {
        contractMarket.InsurerOrReinsurer.each(\insurerOrReinsurer -> {
          var primaryRoleFlag = false
          if (contractMarket.getAgency() == insurerBureau and
              (insurerOrReinsurer.Party.Id.first() == insurerPartyId
                  or insurerOrReinsurer.Party.Name == insurerPartyName)) {
            primaryRoleFlag = true
          }
          var contractMarket_ext = createECFContractMarket(insurerOrReinsurer.Party, primaryRoleFlag,
              insurerOrReinsurer.ParticipantFunction, insurerOrReinsurer.InsurerSharePercentage.Rate)
          claimData.addToECFContractMarkets(contractMarket_ext)
        })
      })
    }
  }

  private static function createECFContractMarket(
      party: Party,
      primaryFlag: boolean,
      participantFunction: String,
      share: BigDecimal): ECFContractMarket_Ext {
    var contractMarket = new ECFContractMarket_Ext()
    contractMarket.IsPrimaryRole = primaryFlag
    contractMarket.PartyID = party.Id.first()
    contractMarket.PartyName = party.Name
    contractMarket.Bureau = ECFBureauType_Ext.get(party.FirstAgency)
    contractMarket.ParticipantFunction = ECFUtils.ecfParticipantFunctionParser(participantFunction)
    contractMarket.InsurerSharePercentage = share
    return contractMarket
  }

}