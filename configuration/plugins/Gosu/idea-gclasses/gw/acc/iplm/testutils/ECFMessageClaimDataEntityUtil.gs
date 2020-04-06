package gw.acc.iplm.testutils

uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs

class ECFMessageClaimDataEntityUtil {

  public static function mapClaimContacts(ecfClaimData: ECFMessageClaimData_Ext, claimRetrieveRs: RetrieveClaimRs) {
    var contacts = new ECFMessageClaimDataContacts_Ext()
    contacts.AdjusterName = claimRetrieveRs.ClaimMovement.Claim.AdjusterName
    contacts.AdjusterReference = claimRetrieveRs.ClaimMovement.Claim.AdjusterReference
    contacts.BrokerPartyName = claimRetrieveRs.ClaimMovement.Broker?.Party.Name
    contacts.BrokerPartyId = claimRetrieveRs.ClaimMovement.Broker?.Party.FirstId
    contacts.BrokerContactName = claimRetrieveRs.ClaimMovement.Broker?.Contact?.PersonName
    contacts.BrokerContactTelephone = claimRetrieveRs.ClaimMovement.Broker?.Contact?.Telephone
    contacts.BureauLeadInsurerOrReinsurer = claimRetrieveRs.ClaimMovement.BureauLeadingInsurerOrReinsurer?.Party?.Name
    contacts.InsurerId = claimRetrieveRs.ClaimMovement.Insurer?.Party?.FirstId
    contacts.InsurerName = claimRetrieveRs.ClaimMovement.Insurer?.Party?.Name
    contacts.InsurerAgency = claimRetrieveRs.ClaimMovement.Insurer?.Party?.FirstAgency
    contacts.ReinsurerId = claimRetrieveRs.ClaimMovement.Reinsurer?.Party?.FirstId
    contacts.ReinsurerName = claimRetrieveRs.ClaimMovement.Reinsurer?.Party?.Name
    contacts.ReinsurerAgency = claimRetrieveRs.ClaimMovement.Reinsurer?.Party?.FirstAgency
    contacts.LawyerName = claimRetrieveRs.ClaimMovement.Claim.LawyerName
    contacts.LawyerReference = claimRetrieveRs.ClaimMovement.Claim.LawyerReference
    ecfClaimData.ECFContactData = contacts
  }

  public static function mapClaimContacts(ecfClaimData: ECFMessageClaimData_Ext, claimNotifyRq: ClaimNotifyEventRq) {
    var contacts = new ECFMessageClaimDataContacts_Ext()
    contacts.AdjusterName = claimNotifyRq.ClaimMovement.Claim.AdjusterName
    contacts.AdjusterReference = claimNotifyRq.ClaimMovement.Claim.AdjusterReference
    contacts.BrokerPartyName = claimNotifyRq.ClaimMovement.Broker?.Party.Name
    contacts.BrokerPartyId = claimNotifyRq.ClaimMovement.Broker?.Party.FirstId
    contacts.BrokerContactName = claimNotifyRq.ClaimMovement.Broker?.Contact?.PersonName
    contacts.BrokerContactTelephone = claimNotifyRq.ClaimMovement.Broker?.Contact?.Telephone
    contacts.BureauLeadInsurerOrReinsurer = claimNotifyRq.ClaimMovement.BureauLeadingInsurerOrReinsurer?.Party?.Name
    contacts.InsurerId = claimNotifyRq.ClaimMovement.Insurer?.Party?.FirstId
    contacts.InsurerName = claimNotifyRq.ClaimMovement.Insurer?.Party?.Name
    contacts.InsurerAgency = claimNotifyRq.ClaimMovement.Insurer?.Party?.FirstAgency
    contacts.ReinsurerId = claimNotifyRq.ClaimMovement.Reinsurer?.Party?.FirstId
    contacts.ReinsurerName = claimNotifyRq.ClaimMovement.Reinsurer?.Party?.Name
    contacts.ReinsurerAgency = claimNotifyRq.ClaimMovement.Reinsurer?.Party?.FirstAgency
    contacts.LawyerName = claimNotifyRq.ClaimMovement.Claim.LawyerName
    contacts.LawyerReference = claimNotifyRq.ClaimMovement.Claim.LawyerReference
    ecfClaimData.ECFContactData = contacts
  }

  public static function mapClaimContractMarket(ecfClaimData: ECFMessageClaimData_Ext, claimNotifyRq: ClaimNotifyEventRq) {
    var extension = claimNotifyRq.ClaimMovement.Extension
    //Insurer Details
    var insurerParty = claimNotifyRq.ClaimMovement.Insurer?.Party
    var insurerPartyName = insurerParty.Name
    var insurerPartyId = insurerParty.FirstId
    var insurerBureau = insurerParty.FirstAgency
    //Contract Market Details
    var contractMarkets = extension.Contract?.ContractMarket
    contractMarkets?.each(\contractMarket -> {
      contractMarket.InsurerOrReinsurer.each(\insurerOrReinsurer -> {
        var primaryRoleFlag = false
        if (contractMarket.Agency == insurerBureau and
            (insurerOrReinsurer.Party.FirstId == insurerPartyId
                or insurerOrReinsurer.Party.Name == insurerPartyName)) {
          primaryRoleFlag = true
        }
        var contractMarketEntity = new ECFContractMarket_Ext()
        contractMarketEntity.IsPrimaryRole = primaryRoleFlag
        contractMarketEntity.PartyID = insurerOrReinsurer.Party.FirstId
        contractMarketEntity.PartyName = insurerOrReinsurer.Party.Name
        contractMarketEntity.Bureau = ECFBureauType_Ext.get(insurerOrReinsurer.Party.FirstAgency)
        contractMarketEntity.ParticipantFunction = ECFUtils.ecfParticipantFunctionParser(insurerOrReinsurer.ParticipantFunction)
        ecfClaimData.addToECFContractMarkets(contractMarketEntity)
      })
    })
  }

  public static function mapClaimContractMarket(ecfClaimData: ECFMessageClaimData_Ext, claimRetrieveRs: RetrieveClaimRs) {
    var extension = claimRetrieveRs.ClaimMovement.Extension
    //Insurer Details
    var insurerParty = claimRetrieveRs.ClaimMovement.Insurer?.Party
    var insurerPartyName = insurerParty.Name
    var insurerPartyId = insurerParty.FirstId
    var insurerBureau = insurerParty.FirstAgency
    //Contract Market Details
    var contractMarkets = extension.Contract?.ContractMarket
    contractMarkets?.each(\contractMarket -> {
      contractMarket.InsurerOrReinsurer.each(\insurerOrReinsurer -> {
        var primaryRoleFlag = false
        if (contractMarket.Agency == insurerBureau and
            (insurerOrReinsurer.Party.FirstId == insurerPartyId
                or insurerOrReinsurer.Party.Name == insurerPartyName)) {
          primaryRoleFlag = true
        }
        var contractMarketEntity = new ECFContractMarket_Ext()
        contractMarketEntity.IsPrimaryRole = primaryRoleFlag
        contractMarketEntity.PartyID = insurerOrReinsurer.Party.FirstId
        contractMarketEntity.PartyName = insurerOrReinsurer.Party.Name
        contractMarketEntity.InsurerSharePercentage = insurerOrReinsurer.InsurerSharePercentage.Rate
        contractMarketEntity.Bureau = ECFBureauType_Ext.get(insurerOrReinsurer.Party.FirstAgency)
        contractMarketEntity.ParticipantFunction = ECFUtils.ecfParticipantFunctionParser(insurerOrReinsurer.ParticipantFunction)
        ecfClaimData.addToECFContractMarkets(contractMarketEntity)
      })
    })
  }
}