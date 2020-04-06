package util.lvwrapper

@Export
class ClaimInAssociationLVWrapper
{
  private var _claimAssociation : ClaimInAssociation;
  
  construct(claimAssociation : ClaimInAssociation)
  {
    _claimAssociation = claimAssociation;    
  }
  
  property get IsPrimaryClaim() : boolean {
    return _claimAssociation.PrimaryClaim;
  }  
  
  property set IsPrimaryClaim(isPrimary : boolean) {
    _claimAssociation.setAndEnsureOnlyPrimaryClaim( isPrimary );
  }

}
