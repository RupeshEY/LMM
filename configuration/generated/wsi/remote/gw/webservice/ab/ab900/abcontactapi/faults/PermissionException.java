/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.faults;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class PermissionException extends gw.xml.ws.WsdlFault {

  public PermissionException() {
    super();
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.PermissionException() );
  }

  public PermissionException( Throwable cause ) {
    super( cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.PermissionException() );
  }

  public PermissionException( String message ) {
    super( message );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.PermissionException() );
  }

  public PermissionException( String message, Throwable cause ) {
    super( message, cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.PermissionException() );
  }

}
