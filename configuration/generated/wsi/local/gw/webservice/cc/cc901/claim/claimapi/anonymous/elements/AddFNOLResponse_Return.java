/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class AddFNOLResponse_Return extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "return", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.AddFNOLResponse_Return" );
    }
  };

  public AddFNOLResponse_Return() {
    super( 1195140911, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public AddFNOLResponse_Return( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( 1195140911, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private AddFNOLResponse_Return( gw.internal.xml.XmlElementState state ) {
    super( 1195140911, state );
  }

  public AddFNOLResponse_Return( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.AddFNOLResponse_Return> get$Class() {
    return getClass();
  }
}