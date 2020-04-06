package gw.acc.iplm.controller

class SCMClaimMessagesController {

  private var _claim : Claim

  construct(claim: Claim) {
    _claim = claim
  }

  /**
   * Returns a list of distinct OCRs for all SCM Messages on this Claim.
   * Each OCR will only appear once on this list and the list will be sorted alphabetically by OCR.
   *
   * @return List of distinct OCRs
   */
  public function distinctOCRsForAllSCMMessages() : List<String> {
    return new TreeSet<String>(_claim.SCMMessages*.OCR.toList()).toList()
  }

  /**
   * Filters all the SCM Messages on this Claim by OCR number.
   * If the OCR parameter is null then all SCM Messages in the Claim will be returned.
   *
   * @param ocr Originating Claim Office Reference used to filter the messages
   * @return List of SCM Messages with a given OCR
   */
  public function scmMessagesWithOCR(ocr: String) : List<LMMessageLloydsSCM_Ext> {
    final var scmMessages = _claim.SCMMessages
    return ocr == null ? scmMessages : scmMessages.where(\msg -> msg.OCR == ocr)
  }

}