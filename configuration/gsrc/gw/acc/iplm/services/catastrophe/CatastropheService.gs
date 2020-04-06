package gw.acc.iplm.services.catastrophe

uses gw.acc.iplm.utils.ECFConstants
uses gw.api.database.Query
uses gw.api.database.Relop
uses org.apache.commons.lang3.StringUtils


class CatastropheService {

  /**
   * Given a catastrophe with LCO or PCS code, it searches for all Claims that have latest ECFMessage received with
   * same catastrophe code and associate them
   * @param catastrophe - Catastrophe object to be associated with Claim(s)
   */
  public function associateCatastropheWithECFClaims(catastrophe: Catastrophe) {
    final var catastropheCode = catastrophe?.LCOCode?:catastrophe?.PCSCatastropheNumber

    if (StringUtils.isNotBlank(catastropheCode)) {
      var relatedClaims = getAllClaimsByCatastropheCode(catastropheCode)
      associateCatastropheToClaims(catastrophe, relatedClaims)
    }
  }

  private function getAllClaimsByCatastropheCode(catastropheCode: String) : List<Claim> {
    var allClaims = Query.make(Claim).compare(Claim#UCR_Ext, Relop.NotEquals, null).select().toList()
    return allClaims.where(\elt -> elt.LatestMessageClaimData.LcoCatastropheCode.Code == catastropheCode or elt.LatestMessageClaimData.PcsCatastropheCode.Code == catastropheCode)
  }

  private function associateCatastropheToClaims(catastrophe: Catastrophe, relatedClaims: List<Claim>) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      relatedClaims.each(\claim -> {
        claim = bundle.add(claim)
        claim.Catastrophe = catastrophe
      })
    }, ECFConstants.ECF_SUPER_USER)
  }

}