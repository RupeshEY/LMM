/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PCClaimDetail_ClaimInfoPublicID extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaimDetail", "ClaimInfoPublicID", "pogo4" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaimDetail", "pogo4" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimDetail_ClaimInfoPublicID" );
    }
  };

  public PCClaimDetail_ClaimInfoPublicID() {
    super( 579858472, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public PCClaimDetail_ClaimInfoPublicID( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( 579858472, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PCClaimDetail_ClaimInfoPublicID( gw.internal.xml.XmlElementState state ) {
    super( 579858472, state );
  }

  public PCClaimDetail_ClaimInfoPublicID( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimDetail_ClaimInfoPublicID> get$Class() {
    return getClass();
  }
}
