package gw.command
uses gw.api.databuilder.ServiceRequestBuilder
uses com.guidewire.pl.quickjump.DefaultMethod

@DefaultMethod("quoteAndService")
@Export
class NewServiceRequest extends CCBaseCommand {

  private function showServiceRequest(serviceRequest : ServiceRequest) {
    // going to pcf.Claim first forces the ClaimServiceRequests LV to refresh; the visit to pcf.Claim
    // does not seem to be visible to the user
    pcf.Claim.go(serviceRequest.Claim)
    pcf.ClaimServiceRequests.go(serviceRequest.Claim,serviceRequest)
  }

  function quoteOnly() {
    var serviceRequest = ServiceRequestBuilder.uiReadyQuoteOnly()
            .onClaim(CurrentClaim)
            .createAndCommit()
    showServiceRequest(serviceRequest)
  }

  function quoteAndService() {
    var serviceRequest = ServiceRequestBuilder.uiReadyAutoRepair()
            .onClaim(CurrentClaim)
            .createAndCommit()
    showServiceRequest(serviceRequest)
  }

  function serviceOnly() {
    var serviceRequest = ServiceRequestBuilder.uiReadyServiceOnly()
            .onClaim(CurrentClaim)
            .createAndCommit()
    showServiceRequest(serviceRequest)
  }

}
