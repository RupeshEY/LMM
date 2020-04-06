package gw.webservice.cc.cc900.vendormanagement

uses gw.xml.ws.annotation.WsiExportable
uses java.util.List

@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/MessagesForSpecialistResults")
final class MessagesForSpecialistResults {
  /**
   * Indicates that the search returned too many results and the Results list does not contain all
   * service requests that matched the search criteria.
   */
  var _resultsAreTruncated : boolean as ResultsAreTruncated

  /**
   * The service requests that matched the search. The ordering is specified by the function that
   * returned this object. These messages will have a reference to their service request
   */
  var _results : List<gw.webservice.cc.cc900.vendormanagement.Message> as Results
}