/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PCClaimDetail_RemainingReserves extends gw.internal.xml.simplevalues.DecimalXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaimDetail", "RemainingReserves", "pogo4" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaimDetail", "pogo4" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimDetail_RemainingReserves" );
    }
  };

  public PCClaimDetail_RemainingReserves() {
    super( -248138489, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Decimal() );
  }

  public PCClaimDetail_RemainingReserves( gw.xsd.w3c.xmlschema.types.simple.Decimal typeInstance ) {
    super( -248138489, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PCClaimDetail_RemainingReserves( gw.internal.xml.XmlElementState state ) {
    super( -248138489, state );
  }

  public PCClaimDetail_RemainingReserves( java.math.BigDecimal value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimDetail_RemainingReserves> get$Class() {
    return getClass();
  }
}