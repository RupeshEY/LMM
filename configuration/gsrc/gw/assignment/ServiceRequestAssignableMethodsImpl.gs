package gw.assignment
uses gw.api.locale.DisplayKey
uses gw.api.assignment.CCAssignableMethodsBaseImpl
uses gw.entity.ILinkPropertyInfo
uses gw.api.assignment.CCAssignableMethods
uses java.util.List

@Export
class ServiceRequestAssignableMethodsImpl extends CCAssignableMethodsBaseImpl<ServiceRequest> {

  construct(serviceRequest : ServiceRequest) {
    super(serviceRequest)
  }

  override property get OwningClaim() : Claim {
    return Owner.Claim
  }

  override property get AssignmentReviewActivityLinkProperty() : ILinkPropertyInfo {
    return entity.Activity.Type.TypeInfo.getProperty("ServiceRequest") as ILinkPropertyInfo
  }

  override property get AssignmentReviewActivitySubject() : String {
    return DisplayKey.get("Java.Activity.AssignReview.ServiceRequest", Owner)
  }

  override function pushAssignmentPopup(assignables : List<CCAssignableMethods>) {
    var serviceRequests = assignables.whereTypeIs(ServiceRequest).toTypedArray()
    AssignmentPopupUtil.pushAssignServiceRequests(serviceRequests)
  }

  override function createAssignmentHistoryEvent(assignable : Assignable) : History {
    return null
  }

  override property get ChildrenForCascadeAssignment() : List<CCAssignableMethods> {
    return Owner.Claim.Activities.where(\ a -> a.ServiceRequest == Owner).toList()
  }
}
