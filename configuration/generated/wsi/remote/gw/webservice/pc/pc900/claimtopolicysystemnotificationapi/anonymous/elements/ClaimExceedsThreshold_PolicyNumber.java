/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.claimtopolicysystemnotificationapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimExceedsThreshold_PolicyNumber extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/ccintegration/ClaimToPolicySystemNotificationAPI", "policyNumber", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/ccintegration/ClaimToPolicySystemNotificationAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.claimtopolicysystemnotificationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.claimtopolicysystemnotificationapi.anonymous.elements.ClaimExceedsThreshold_PolicyNumber" );
    }
  };

  public ClaimExceedsThreshold_PolicyNumber() {
    super( 956191934, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public ClaimExceedsThreshold_PolicyNumber( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( 956191934, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimExceedsThreshold_PolicyNumber( gw.internal.xml.XmlElementState state ) {
    super( 956191934, state );
  }

  public ClaimExceedsThreshold_PolicyNumber( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.claimtopolicysystemnotificationapi.anonymous.elements.ClaimExceedsThreshold_PolicyNumber> get$Class() {
    return getClass();
  }
}
