/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ABContactAPIPendingContactChange_UserDisplayName extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPIPendingContactChange", "UserDisplayName", "pogo4" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPIPendingContactChange", "pogo4" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab801.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPIPendingContactChange_UserDisplayName" );
    }
  };

  public ABContactAPIPendingContactChange_UserDisplayName() {
    super( 991438471, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public ABContactAPIPendingContactChange_UserDisplayName( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( 991438471, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ABContactAPIPendingContactChange_UserDisplayName( gw.internal.xml.XmlElementState state ) {
    super( 991438471, state );
  }

  public ABContactAPIPendingContactChange_UserDisplayName( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPIPendingContactChange_UserDisplayName> get$Class() {
    return getClass();
  }
}
