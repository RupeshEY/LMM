/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GiveUserPermissionsOnClaim_UserID extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/claim/ClaimAPI", "userID", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/claim/ClaimAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.GiveUserPermissionsOnClaim_UserID" );
    }
  };

  public GiveUserPermissionsOnClaim_UserID() {
    super( 1850839560, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public GiveUserPermissionsOnClaim_UserID( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( 1850839560, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GiveUserPermissionsOnClaim_UserID( gw.internal.xml.XmlElementState state ) {
    super( 1850839560, state );
  }

  public GiveUserPermissionsOnClaim_UserID( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.GiveUserPermissionsOnClaim_UserID> get$Class() {
    return getClass();
  }
}
