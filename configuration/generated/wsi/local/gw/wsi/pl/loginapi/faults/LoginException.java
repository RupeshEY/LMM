/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.loginapi.faults;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class LoginException extends gw.xml.ws.WsdlFault {

  public LoginException() {
    super();
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.wsi.pl.loginapi.elements.LoginException() );
  }

  public LoginException( Throwable cause ) {
    super( cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.wsi.pl.loginapi.elements.LoginException() );
  }

  public LoginException( String message ) {
    super( message );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.wsi.pl.loginapi.elements.LoginException() );
  }

  public LoginException( String message, Throwable cause ) {
    super( message, cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.wsi.pl.loginapi.elements.LoginException() );
  }

}