package gw.assignment

uses gw.api.assignment.CCAssignableMethodsBaseImpl
uses gw.entity.ILinkPropertyInfo
uses gw.api.locale.DisplayKey
uses gw.api.assignment.CCAssignableMethods
uses java.util.Collections

@Export
class SubrogationAssignableMethodsImpl  extends CCAssignableMethodsBaseImpl<Subrogation>{

  construct(subrogation : Subrogation) {
    super(subrogation)
  }

  override property get OwningClaim() : Claim {
    return Owner.SubrogationSummary.Claim
  }

  override property get AssignmentReviewActivityLinkProperty() : ILinkPropertyInfo {
    return entity.Activity.Type.TypeInfo.getProperty("Subrogation") as ILinkPropertyInfo
  }

  override property get AssignmentReviewActivitySubject() : String {
    return DisplayKey.get("Java.Activity.AssignReview.Subrogation", Owner)
  }

  override function pushAssignmentPopup(assignables : List<CCAssignableMethods>) {
    var subrogations = assignables.whereTypeIs(Subrogation).toTypedArray()
    AssignmentPopupUtil.pushAssignSubrogations(subrogations)
  }

  override function createAssignmentHistoryEvent(assignable : Assignable) : History {
    return null
  }

  override property get ChildrenForCascadeAssignment() : List<CCAssignableMethods> {
    return Collections.emptyList<CCAssignableMethods>()
  }
}