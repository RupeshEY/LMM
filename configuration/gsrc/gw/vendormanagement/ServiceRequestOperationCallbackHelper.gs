package gw.vendormanagement

uses pcf.api.Location
uses gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler

@Export
class ServiceRequestOperationCallbackHelper {
  var _beforeCommitAction : block() as BeforeCommitAction

  function performServiceRequestOperation(currentLoc : Location, sr : ServiceRequest, sro : ServiceRequestOperation, stateHandler : ServiceRequestStateHandler = null) {
    doPerform(currentLoc, \-> sr.performOperation(sro, null, false, stateHandler))
  }

  function performInvoiceOperation(currentLoc : Location, inv : ServiceRequestInvoice, sro : ServiceRequestOperation, stateHandler : ServiceRequestStateHandler = null) {
    doPerform(currentLoc, \-> inv.performOperation(sro, null, false, stateHandler))
  }

  private function doPerform(currentLoc : Location, action : block()) {
    if (!currentLoc.InEditMode) {
      currentLoc.startEditing()
    }
    _beforeCommitAction = action
    currentLoc.commit()
    _beforeCommitAction = \-> {}
  }
}
