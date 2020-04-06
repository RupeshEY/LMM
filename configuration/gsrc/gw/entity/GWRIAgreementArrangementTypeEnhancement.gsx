package gw.entity
uses gw.reins.RIAgreementUtil

/**
 * Fill in
 */
@Export
enhancement GWRIAgreementArrangementTypeEnhancement : entity.RIAgreement {
  
  /**
   * The RIArrangementType of this Reinsurance Agreement: Treaty or Facultative,
   * which is fully implied by the agreement's subtype.
   */
  property get ArrangementType() : RIArrangementType {
    return RIAgreementUtil.getArrangementType( typeof this )
  }
}
