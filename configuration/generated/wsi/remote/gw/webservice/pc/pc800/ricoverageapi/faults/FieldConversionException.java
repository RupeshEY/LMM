/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.ricoverageapi.faults;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class FieldConversionException extends gw.xml.ws.WsdlFault {

  public FieldConversionException() {
    super();
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.gw.webservice.pc.pc800.ricoverageapi.elements.FieldConversionException() );
  }

  public FieldConversionException( Throwable cause ) {
    super( cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.gw.webservice.pc.pc800.ricoverageapi.elements.FieldConversionException() );
  }

  public FieldConversionException( String message ) {
    super( message );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.gw.webservice.pc.pc800.ricoverageapi.elements.FieldConversionException() );
  }

  public FieldConversionException( String message, Throwable cause ) {
    super( message, cause );
    setCode( gw.xml.ws.WsdlFault.FaultCode.Sender );
    setDetail( new wsi.remote.gw.webservice.pc.pc800.ricoverageapi.elements.FieldConversionException() );
  }

}
