package wsi.remote.gw.webservice.ab

uses javax.xml.namespace.QName
uses gw.xml.ws.WsdlConfig
uses gw.xml.ws.IWsiWebserviceConfigurationProvider

@Export
/**
 * Use this class to specify authentication for WSI web services that talk to 
 * ContactManager. In ClaimCenter 7.0 that is the ABContactPlugin.
 */
class ABConfigurationProvider implements IWsiWebserviceConfigurationProvider {

  override function configure( serviceName : QName, portName : QName, config : WsdlConfig )  {
    config.Guidewire.Authentication.Username = "ClientAppCC"
    config.Guidewire.Authentication.Password = "gw"
  }

}
