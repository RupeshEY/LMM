/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PCClaim_LargeLossIndicator extends gw.internal.xml.simplevalues.BooleanXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaim", "LargeLossIndicator", "pogo2" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaim", "pogo2" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_LargeLossIndicator" );
    }
  };

  public PCClaim_LargeLossIndicator() {
    super( 1920725769, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Boolean() );
  }

  public PCClaim_LargeLossIndicator( gw.xsd.w3c.xmlschema.types.simple.Boolean typeInstance ) {
    super( 1920725769, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PCClaim_LargeLossIndicator( gw.internal.xml.XmlElementState state ) {
    super( 1920725769, state );
  }

  public PCClaim_LargeLossIndicator( java.lang.Boolean value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_LargeLossIndicator> get$Class() {
    return getClass();
  }
}