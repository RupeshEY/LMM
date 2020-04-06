package gw.webservice.cc.cc900.vendormanagement

uses gw.xml.ws.annotation.WsiExportable
uses java.util.List

/**
 * An object containing the results of a search for service requests. Each service request is
 * represented by a ServiceRequestSummary object containing summary information about that
 * service request. The primary purpose of this class is to wrap the list of results with a flag
 * indicating whether additional results were not included because they exceeded the maximum
 * result count.
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestSearchResults")
final class ServiceRequestSearchResults {

  /**
   * Indicates that the search returned too many results and the Results list does not contain all
   * service requests that matched the search criteria.
   */
  var _resultsAreTruncated : boolean as ResultsAreTruncated

  /**
   * The service requests that matched the search. The ordering is specified by the function that
   * returned this object.
   */
  var _results : List<ServiceRequestSummary> as Results

}
