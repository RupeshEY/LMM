package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.entitymapper.ecfwb.claimnotify.ClaimMovementAmountItemMapper
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component_ComponentClaimLineDetails
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component_ComponentClaimLineDetails
uses gw.pl.currency.MonetaryAmount
uses typekey.Currency

/**
 * Creates the entities for the BulkClaimInformation in the ClaimNotifyEventRq message
 */
class ClaimDataBulkClaimCreator {

  private static final var OUTSTANDING_AMOUNT = "Outstanding_Amount"
  private static final var PREVIOUSLY_PAID_AMOUNT = "Previously_Paid_Amount"
  private static final var INCURRED_AMOUNT = "Previously_Paid_Amount"
  private static final var VAT_AMOUNT = "Vat_Amount"
  private static final var PAID_IMPORTED_SERVICES_AMOUNT = "Paid_Imported_Services_Amount"
  private static final var PAID_THIS_TIME_AMOUNT = "Paid_This_Time_Amount"
  private final var _claimDataMsg: ECFMessageClaimData_Ext
  private final var _bulkClaims: List<ECFMessageBulkClaim_Ext> = {}
  private final var _claimMessageDTO: ClaimMessageDTO
  private var _cnBulkClaimInfo: ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation
  private var _crBulkClaimInfo: RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation


  public construct(final claimDataMsg: ECFMessageClaimData_Ext,
                   final claimMessageDTO: ClaimMessageDTO) {
    _claimDataMsg = claimDataMsg
    _claimMessageDTO = claimMessageDTO
  }

  public function createBulkClaims() {
    _cnBulkClaimInfo = _claimMessageDTO.ClaimNotifyEventRq.ClaimMovement.Extension.ClaimEntry.BulkClaimInformation
    _crBulkClaimInfo = _claimMessageDTO.ClaimRetrieveRs.ClaimMovement.Extension.ClaimEntry.BulkClaimInformation

    if (_cnBulkClaimInfo != null or _crBulkClaimInfo != null) {
      _claimDataMsg.BulkClaimNoOfItems = _cnBulkClaimInfo.NoOfItems?:_crBulkClaimInfo.NoOfItems
      _claimDataMsg.BulkClaimHeaderUCR = _cnBulkClaimInfo.HeaderUCR?:_crBulkClaimInfo.HeaderUCR
      _claimDataMsg.BulkClaimHeaderTR = _cnBulkClaimInfo.HeaderTransactionReference?:_crBulkClaimInfo.HeaderTransactionReference
    }

    createBulkEntities()
  }

  private function createBulkEntities() {
    var cnBulkcomponents = _cnBulkClaimInfo.Component
    var crBulkcomponents = _crBulkClaimInfo.Component

    if (cnBulkcomponents != null) {
      for (cnBulkComponent in cnBulkcomponents) {
        createCNBulkComponent(cnBulkComponent)
      }
    }
    if (crBulkcomponents != null) {
      for (crBulkComponent in crBulkcomponents) {
        createCRBulkComponent(crBulkComponent)
      }
    }
  }

  private function createCNBulkComponent(cnBulkComponent: ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component) {
    final var componentClaimLineDetails = cnBulkComponent.ComponentClaimLineDetails
    for (componentClaimLineDetail in componentClaimLineDetails) {
      var bulkClaim = _bulkClaims.firstWhere(\bulkClm ->
          bulkClm.TR == componentClaimLineDetail.ComponentTR
              and bulkClm.UCR == componentClaimLineDetail.ComponentUCR)
      if (bulkClaim == null) {
        bulkClaim = new ECFMessageBulkClaim_Ext()
        bulkClaim.UCR = componentClaimLineDetail.ComponentUCR
        bulkClaim.TR = componentClaimLineDetail.ComponentTR
        bulkClaim.LossName = componentClaimLineDetail.ComponentLossName
        bulkClaim.LossDate = ECFUtils.getDateFromXMLDate(componentClaimLineDetail.ComponentLossDate)
        bulkClaim.ECFMsg = _claimDataMsg

        _bulkClaims.add(bulkClaim)
      }
      if (isAddedBulkClaimDetail(componentClaimLineDetail, componentClaimLineDetails, null, null)) {
        continue
      }

      final var bulkClaimDetail = new ECFMessageBulkClaimDetail_Ext()
      final var ccy = Currency.get(cnBulkComponent.Ccy)
      bulkClaimDetail.Currency = ccy
      if (componentClaimLineDetail.ComponentSettlementAmount != null) {
        bulkClaimDetail.SettlementAmount = new MonetaryAmount(componentClaimLineDetail.ComponentSettlementAmount, ccy)
      }
      bulkClaimDetail.SettlementCurrency = Currency.get(componentClaimLineDetail.ComponentTargetCurrency.Ccy)
      final var movementItem = componentClaimLineDetail.ClaimMovementAmtItem
      createBulkComponentAmount(bulkClaimDetail, movementItem, ccy)
      bulkClaimDetail.ImportedServicesNarrative = componentClaimLineDetail.ImportedServicesNarrative
      bulkClaimDetail.ComponentLineNo = componentClaimLineDetail.ComponentLineNo?.longValue()
      bulkClaimDetail.BulkClaim = bulkClaim
    }
  }

  private function createCRBulkComponent(crBulkComponent: RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component) {
    final var componentClaimLineDetails = crBulkComponent.ComponentClaimLineDetails
    for (componentClaimLineDetail in componentClaimLineDetails) {
      var bulkClaim = _bulkClaims.firstWhere(\bulkClm ->
          bulkClm.TR == componentClaimLineDetail.ComponentTR
              and bulkClm.UCR == componentClaimLineDetail.ComponentUCR)
      if (bulkClaim == null) {
        bulkClaim = new ECFMessageBulkClaim_Ext()
        bulkClaim.UCR = componentClaimLineDetail.ComponentUCR
        bulkClaim.TR = componentClaimLineDetail.ComponentTR
        bulkClaim.LossName = componentClaimLineDetail.ComponentLossName
        bulkClaim.LossDate = ECFUtils.getDateFromXMLDate(componentClaimLineDetail.ComponentLossDate)
        bulkClaim.ECFMsg = _claimDataMsg

        _bulkClaims.add(bulkClaim)
      }
      if (isAddedBulkClaimDetail(null, null, componentClaimLineDetail, componentClaimLineDetails)) {
        continue
      }

      final var bulkClaimDetail = new ECFMessageBulkClaimDetail_Ext()
      final var ccy = Currency.get(crBulkComponent.Ccy)
      bulkClaimDetail.Currency = ccy
      if (componentClaimLineDetail.ComponentSettlementAmount != null) {
        bulkClaimDetail.SettlementAmount = new MonetaryAmount(componentClaimLineDetail.ComponentSettlementAmount, ccy)
      }
      bulkClaimDetail.SettlementCurrency = Currency.get(componentClaimLineDetail.ComponentTargetCurrency?[0].Ccy)
      final var movementItem = componentClaimLineDetail.ClaimMovementAmtItem
      createBulkComponentAmount(bulkClaimDetail, movementItem, ccy)
      bulkClaimDetail.ImportedServicesNarrative = componentClaimLineDetail.ImportedServicesNarrative?[0]
      bulkClaimDetail.BulkClaim = bulkClaim
    }
  }

  private function createBulkComponentAmount(bulkClaimDetail: ECFMessageBulkClaimDetail_Ext,
                                             movementItem: List<ClaimMovementAmtItem>,
                                             ccy: Currency): void {
    bulkClaimDetail.OutstandingAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(movementItem, OUTSTANDING_AMOUNT, ccy)
    bulkClaimDetail.PreviouslyPaidAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(movementItem, PREVIOUSLY_PAID_AMOUNT, ccy)
    bulkClaimDetail.IncurredAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(movementItem, INCURRED_AMOUNT, ccy)
    bulkClaimDetail.VatAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(movementItem, VAT_AMOUNT, ccy)
    bulkClaimDetail.PaidThisTimeAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(movementItem, PAID_THIS_TIME_AMOUNT, ccy)
    bulkClaimDetail.ImportedServicesAmount = ClaimMovementAmountItemMapper.getClaimAmtMovementValue(movementItem, PAID_IMPORTED_SERVICES_AMOUNT, ccy)
  }

  /**
   * Checks for duplicate ComponentClaimLineDetail elements and checks if has been processed already
   */
  private function isAddedBulkClaimDetail(final cnDetail: ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component_ComponentClaimLineDetails,
                                          final cnDetails: List<ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component_ComponentClaimLineDetails>,
                                          final crDetail: RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component_ComponentClaimLineDetails,
                                          final crDetails: List<RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation_Component_ComponentClaimLineDetails>): boolean {
    if (cnDetail != null and cnDetails != null) {
      final var duplicateLineDetail = cnDetails.firstWhere(\bulkDetail -> {
        return bulkDetail.ComponentUCR == cnDetail.ComponentUCR
            and bulkDetail.ComponentTR == cnDetail.ComponentTR
            and bulkDetail != cnDetail
      })
      if (duplicateLineDetail != null) {
        final var isAddedBulkClaimDetail = cnDetails.indexOf(cnDetail)
            > cnDetails.indexOf(duplicateLineDetail)
        return isAddedBulkClaimDetail
      }
    }

    if (crDetail != null and crDetails != null) {
      final var duplicateLineDetail = crDetails.firstWhere(\bulkDetail -> {
        return bulkDetail.ComponentUCR == crDetail.ComponentUCR
            and bulkDetail.ComponentTR == crDetail.ComponentTR
            and bulkDetail != crDetail
      })
      if (duplicateLineDetail != null) {
        final var isAddedBulkClaimDetail = crDetails.indexOf(crDetail)
            > cnDetails.indexOf(duplicateLineDetail)
        return isAddedBulkClaimDetail
      }
    }

    return false
  }
}