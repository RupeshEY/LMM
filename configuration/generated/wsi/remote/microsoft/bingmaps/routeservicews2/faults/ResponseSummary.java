/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservicews2.faults;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class ResponseSummary extends gw.xml.ws.WsdlFault {

  public ResponseSummary() {
    super();
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.microsoft.bingmaps.routeservice.ResponseSummary() );
  }

  public ResponseSummary( Throwable cause ) {
    super( cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.microsoft.bingmaps.routeservice.ResponseSummary() );
  }

  public ResponseSummary( String message ) {
    super( message );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.microsoft.bingmaps.routeservice.ResponseSummary() );
  }

  public ResponseSummary( String message, Throwable cause ) {
    super( message, cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.microsoft.bingmaps.routeservice.ResponseSummary() );
  }

}