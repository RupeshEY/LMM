package gw.reins
uses java.lang.IllegalArgumentException
uses gw.entity.IEntityType

@Export
class RIAgreementUtil {

  /**
   * The RIArrangementType of this Reinsurance Agreement: Treaty or Facultative,
   * which is fully implied by the agreement subtype.
   */
  public static function getArrangementType( riAgreementType : Type ) : RIArrangementType {
    if ( not gw.api.util.TypeUtil.isNominallyOrStructurallyAssignable(RIAgreement.Type, riAgreementType) ) {
      throw new IllegalArgumentException( "RIAgreementUtil.getArrangementType arg must be a subtype of RIAgreement.")
    }
    
    // Use categories on the typekeys in the RIAgreement subtype typelist to determine
    // Treaty versus Facultative subtypes.
    var riAgrEntityType = riAgreementType as IEntityType
    if ( riAgrEntityType.SubtypeTypeKey.hasCategory(RIArrangementType.TC_TREATY) ) {
      return RIArrangementType.TC_TREATY
    } else if ( riAgrEntityType.SubtypeTypeKey.hasCategory(RIArrangementType.TC_FACULTATIVE) ) {
      return RIArrangementType.TC_FACULTATIVE
    } else {
      if ( not riAgreementType.Abstract ) {
        throw new IllegalArgumentException("A new RIAgreement subtype '${riAgrEntityType}' must have a category of 'facultative' or 'treaty' added to its typekey in the RIAgreement.ttx file.")
      }
    }
    return null
  }
}
