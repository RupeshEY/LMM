package gw.vendormanagement

uses gw.api.locale.DisplayKey

@Export
enum ServiceRequestStatus {

  NONE("service_request_empty.png", \ -> ""),
  INACTIVE("service_request_gray.png", \ -> DisplayKey.get("Web.ServiceRequest.Status.Inactive")),
  ATTENTION("service_request_alert.png", \ -> DisplayKey.get("Web.ServiceRequest.Status.Attention")),
  COMPLETE("service_request_complete.png", \ -> DisplayKey.get("Web.ServiceRequest.Status.Complete")), 
  GREEN("service_request_green.png", \ -> DisplayKey.get("Web.ServiceRequest.Status.Green")),
  YELLOW("service_request_yellow.png", \ -> DisplayKey.get("Web.ServiceRequest.Status.Yellow")),
  RED("service_request_red.png", \ -> DisplayKey.get("Web.ServiceRequest.Status.Red"))
  
  var _icon : String as readonly Icon
  var _labelBlock : block() : String
  
  private construct(iconImg: String, iconLabel: block() : String) {
    _icon = iconImg
    _labelBlock = iconLabel
  }

  property get Label() : String {
    return _labelBlock()
  }
}
