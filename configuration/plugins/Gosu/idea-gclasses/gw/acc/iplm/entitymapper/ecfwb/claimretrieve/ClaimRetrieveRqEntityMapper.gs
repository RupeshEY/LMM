package gw.acc.iplm.entitymapper.ecfwb.claimretrieve

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.pl.persistence.core.Bundle

class ClaimRetrieveRqEntityMapper {
  /**
   * Creates a {@link entity.ECFMessageClaimRetrieveRq_Ext} entity with minimal data
   *
   * @param {@link gw.pl.persistence.core.Bundle} bundle
   * @return {@link entity.ECFMessageClaimRetrieveRq_Ext}
   */
  public static function createClaimRetrieveRqEntity(claim: Claim, bundle: Bundle): ECFMessageClaimRetrieveRq_Ext {
    var claimRetrieveRq = new ECFMessageClaimRetrieveRq_Ext(bundle)

    claimRetrieveRq = mapCommonFields(claimRetrieveRq)
    claimRetrieveRq = mapClaimDetails(claimRetrieveRq, claim)
    claimRetrieveRq = mapSender(claimRetrieveRq)
    claimRetrieveRq = mapReceiver(claimRetrieveRq)
    claimRetrieveRq = mapAdminLogData(claimRetrieveRq)

    return claimRetrieveRq
  }

  private static function mapAdminLogData(claimRetrieveRq: ECFMessageClaimRetrieveRq_Ext): ECFMessageClaimRetrieveRq_Ext {
    claimRetrieveRq.MessageDirection = ECFMessageDirectionType_Ext.TC_OUTBOUND
    claimRetrieveRq.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMRETRIEVE

    return claimRetrieveRq
  }

  private static function mapCommonFields(claimRetrieveRq: ECFMessageClaimRetrieveRq_Ext): ECFMessageClaimRetrieveRq_Ext {
    claimRetrieveRq.UUID = UUID.randomUUID().toString()
    claimRetrieveRq.OriginTimeStamp = Date.Now

    return claimRetrieveRq
  }

  private static function mapClaimDetails(claimRetrieveRq: ECFMessageClaimRetrieveRq_Ext, claim: Claim) : ECFMessageClaimRetrieveRq_Ext{
    if (claim != null) {
      claimRetrieveRq.UCR = claim.UCR_Ext
      claimRetrieveRq.UMR = claim.UMR_Ext
      claimRetrieveRq.Claim = claim
    }

    return claimRetrieveRq
  }

  private static function mapSender(claimRetrieveRq: ECFMessageClaimRetrieveRq_Ext): ECFMessageClaimRetrieveRq_Ext {
    claimRetrieveRq.SenderPartyRoleCd = ECFMessageConstants.INSURER_ROLE

    return claimRetrieveRq
  }

  private static function mapReceiver(claimRetrieveRq: ECFMessageClaimRetrieveRq_Ext): ECFMessageClaimRetrieveRq_Ext {
    claimRetrieveRq.ReceiverPartyId = ECFConstants.XCHANGING_ID
    claimRetrieveRq.ReceiverPartyName = ECFConstants.XCHANGING_NAME
    claimRetrieveRq.ReceiverPartyAgency = ECFConstants.XCHANGING_AGENCY
    claimRetrieveRq.ReceiverPartyRoleCd = ECFConstants.XCHANGING_ROLE

    return claimRetrieveRq
  }
}