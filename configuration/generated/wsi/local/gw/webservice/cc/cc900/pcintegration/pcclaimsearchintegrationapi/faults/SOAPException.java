/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.faults;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class SOAPException extends gw.xml.ws.WsdlFault {

  public SOAPException() {
    super();
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.elements.SOAPException() );
  }

  public SOAPException( Throwable cause ) {
    super( cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.elements.SOAPException() );
  }

  public SOAPException( String message ) {
    super( message );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.elements.SOAPException() );
  }

  public SOAPException( String message, Throwable cause ) {
    super( message, cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.elements.SOAPException() );
  }

}
