package gw.acc.iplm.services.claim.contacts.builder

uses gw.api.databuilder.DataBuilder
uses gw.api.databuilder.ValueGenerator

public class ECFContractMarket_ExtBuilder extends DataBuilder<ECFContractMarket_Ext, ECFContractMarket_ExtBuilder>{

  construct() {
    super(ECFContractMarket_Ext)
  }

  public function withBureau(value:ECFBureauType_Ext) : ECFContractMarket_ExtBuilder {
    set(ECFContractMarket_Ext#Bureau, value)
    return this
  }

  public function withECFMessageClaimNotifyRq_ExtBuilder(builder: ValueGenerator<entity.ECFMessageClaimData_Ext>) : ECFContractMarket_ExtBuilder {
    set(ECFContractMarket_Ext#ECFMessageClaimData_Ext, builder)
    return this
  }

  public function withECFMessageClaimNotifyRq_Ext(value:entity.ECFMessageClaimData_Ext) : ECFContractMarket_ExtBuilder {
    set(ECFContractMarket_Ext#ECFMessageClaimData_Ext, value)
    return this
  }

  public function withIsPrimaryRole(value:Boolean) : ECFContractMarket_ExtBuilder {
    set(ECFContractMarket_Ext#IsPrimaryRole, value)
    return this
  }

  public function withParticipantFunction(value:typekey.ECFParticipantFunction_Ext) : ECFContractMarket_ExtBuilder {
    set(ECFContractMarket_Ext#ParticipantFunction, value)
    return this
  }

  public function withPartyID(value:String) : ECFContractMarket_ExtBuilder {
    set(ECFContractMarket_Ext#PartyID, value)
    return this
  }

  public function withPartyName(value:String) : ECFContractMarket_ExtBuilder {
    set(ECFContractMarket_Ext#PartyName, value)
    return this
  }
}