/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.contact.contactapi.faults;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class SOAPSenderException extends gw.xml.ws.WsdlFault {

  public SOAPSenderException() {
    super();
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.webservice.cc.cc800.contact.contactapi.elements.SOAPSenderException() );
  }

  public SOAPSenderException( Throwable cause ) {
    super( cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.webservice.cc.cc800.contact.contactapi.elements.SOAPSenderException() );
  }

  public SOAPSenderException( String message ) {
    super( message );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.webservice.cc.cc800.contact.contactapi.elements.SOAPSenderException() );
  }

  public SOAPSenderException( String message, Throwable cause ) {
    super( message, cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.local.gw.webservice.cc.cc800.contact.contactapi.elements.SOAPSenderException() );
  }

}