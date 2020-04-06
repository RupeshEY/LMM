package gw.assignment
uses gw.api.locale.DisplayKey
uses gw.api.assignment.CCAssignableMethodsBaseImpl
uses gw.entity.ILinkPropertyInfo
uses gw.api.assignment.CCAssignableMethods
uses java.util.List
uses gw.pl.persistence.core.Key

@Export
class ExposureAssignableMethodsImpl extends CCAssignableMethodsBaseImpl<Exposure> {

  construct(exposure : Exposure) {
    super(exposure)
  }

  override property get OwningClaim() : Claim {
    return Owner.Claim
  }

  override property get AssignmentReviewActivityLinkProperty() : ILinkPropertyInfo {
    return entity.Activity.Type.TypeInfo.getProperty("Exposure") as ILinkPropertyInfo
  }

  override property get AssignmentReviewActivitySubject() : String {
    return DisplayKey.get("Java.Activity.AssignReview.Exposure", Owner.ClaimOrder, entity.Exposure.Type.TypeInfo.DisplayName)
  }

  override function pushAssignmentPopup(assignables : List<CCAssignableMethods>) {
    var exposures = assignables.whereTypeIs(Exposure).toTypedArray()
    AssignmentPopupUtil.pushAssignExposures(exposures)
  }

  override function createAssignmentHistoryEvent(assignable : Assignable) : History {
    var history = super.createAssignmentHistoryEvent(assignable)
    history.Exposure = Owner
    return history
  }

  override function shouldCascadeAssignment(parent : Assignable,
                                            defaultOwnerUserId : Key,
                                            defaultGroupId : Key) : boolean {
    return (Owner.State ==TC_DRAFT or Owner.State ==TC_OPEN)
            and super.shouldCascadeAssignment(parent, defaultOwnerUserId, defaultGroupId)
  }
  
  override property get ChildrenForCascadeAssignment() : List<CCAssignableMethods> {
    return Owner.Claim.Activities.where(\ a -> a.Exposure == Owner).toList()
  }
}
