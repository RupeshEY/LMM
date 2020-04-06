package gw.acc.iplm.enhancements

uses gw.api.locale.DisplayKey


enhancement ECFExceptionEnhancement: Exception {

  property get ECFShortExceptionMessage(): String {
    var message = this.Message.substring(this.Message.indexOf(":") + 1, this.Message.length()).trim()
    if (message.contains("Invalid Content-Type:text/html")) {
      message = DisplayKey.get("Accelerator.IPLM.Exception.UnexpectedMessage")
    } else if (message.contains("Unable to connect")) {
      message = DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")
    }
    return message
  }
}
