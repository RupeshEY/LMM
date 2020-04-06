package gw.api.iso


uses gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap.ISOXmlWebService
uses gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap.soapheaders.VaildateSchemaHeaders
uses gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap.soapheaders.SubmitToISOHeaders
uses gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.ISOLogin
uses gw.xml.ws.WsdlConfig

/**
 * Provides a utility for sending a request to the ISO web service
 *
 * @author jhuang
 */
@Export
class ISOPayloadHelper {
  public static function sendToISO(xml : String, properties : ISOProperties) : String {
    try {
      var service = new ISOXmlWebService()
      var overrideUrl = properties.getConnectionURL()
      service.Config.ServerOverrideUrl = overrideUrl
      setAuthenticationProperties(service.Config, properties)
      var isoLogin = new ISOLogin()
      isoLogin.setUserName(properties.getCustomerLoginId())
      isoLogin.setPassword(properties.getCustomerPassword())
      return properties.shouldExpectResponses() ? service.SubmitToISO(xml, createHeaders(isoLogin)) : service.VaildateSchema(xml, createTestHeaders(isoLogin))
    }
    catch (e : Exception) {
      throw new ISOCommunicationException("Could not connect to ISO SOAP service", e, true)
    }
  }

  private static function setAuthenticationProperties(config : WsdlConfig, properties : ISOProperties) {
    //set the ISO Basic Authentication Properties if they are defined in ISO.properties
    var basicAuthenticationUsername = properties.getISO_Http_Authentication_Basic_Username()
    var basicAuthenticationPassword = properties.getISO_Http_Authentication_Basic_Password()
    if (basicAuthenticationUsername != null and basicAuthenticationPassword != null) {
      config.Http.Authentication.Basic.Username = basicAuthenticationUsername
      config.Http.Authentication.Basic.Password = basicAuthenticationPassword
    }
  }

  private static function createHeaders(isoLogin : ISOLogin) : SubmitToISOHeaders {
    var headers = new SubmitToISOHeaders()
    headers.setISOLogin(isoLogin)
    return headers
  }
  private static function createTestHeaders(isoLogin : ISOLogin) : VaildateSchemaHeaders {
    var testHeaders = new VaildateSchemaHeaders()
    testHeaders.setISOLogin(isoLogin)
    return testHeaders
  }

}
