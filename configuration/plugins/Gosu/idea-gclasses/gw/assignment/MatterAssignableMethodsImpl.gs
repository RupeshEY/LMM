package gw.assignment
uses gw.api.locale.DisplayKey
uses gw.api.assignment.CCAssignableMethodsBaseImpl
uses gw.entity.ILinkPropertyInfo
uses gw.api.assignment.CCAssignableMethods
uses gw.pl.persistence.core.Key
uses java.util.List

@Export
class MatterAssignableMethodsImpl extends CCAssignableMethodsBaseImpl<Matter> {

  construct(matter : Matter) {
    super(matter)
  }

  override property get OwningClaim() : Claim {
    return Owner.Claim
  }

  override property get AssignmentReviewActivityLinkProperty() : ILinkPropertyInfo {
    return entity.Activity.Type.TypeInfo.getProperty("Matter") as ILinkPropertyInfo
  }

  override property get AssignmentReviewActivitySubject() : String {
    return DisplayKey.get("Java.Activity.AssignReview.Matter", Owner.Name)
  }

  override function pushAssignmentPopup(assignables : List<CCAssignableMethods>) {
    var matters = assignables.whereTypeIs(Matter).toTypedArray()
    AssignmentPopupUtil.pushAssignMatters(matters)
  }

  override function createAssignmentHistoryEvent(assignable : Assignable) : History {
    var history = super.createAssignmentHistoryEvent(assignable)
    history.Matter = Owner
    return history
  }
  
  override function shouldCascadeAssignment(parent : Assignable,
                                            defaultOwnerUserId : Key,
                                            defaultGroupId : Key) : boolean {
    return not Owner.Closed and super.shouldCascadeAssignment(parent, defaultOwnerUserId, defaultGroupId)
  }
  
  override property get ChildrenForCascadeAssignment() : List<CCAssignableMethods> {
    return Owner.Claim.Activities.where(\ a -> a.Matter == Owner).toList()
  }
}
