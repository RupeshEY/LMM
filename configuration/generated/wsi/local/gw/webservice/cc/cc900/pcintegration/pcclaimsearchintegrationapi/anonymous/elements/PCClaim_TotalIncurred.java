/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PCClaim_TotalIncurred extends gw.internal.xml.simplevalues.DecimalXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaim", "TotalIncurred", "pogo2" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaim", "pogo2" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_TotalIncurred" );
    }
  };

  public PCClaim_TotalIncurred() {
    super( 1283004354, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Decimal() );
  }

  public PCClaim_TotalIncurred( gw.xsd.w3c.xmlschema.types.simple.Decimal typeInstance ) {
    super( 1283004354, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PCClaim_TotalIncurred( gw.internal.xml.XmlElementState state ) {
    super( 1283004354, state );
  }

  public PCClaim_TotalIncurred( java.math.BigDecimal value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_TotalIncurred> get$Class() {
    return getClass();
  }
}