/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ABContactAPIFindDuplicatesResult_VendorType extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIFindDuplicatesResult", "VendorType", "pogo16" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIFindDuplicatesResult", "pogo16" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResult_VendorType" );
    }
  };

  public ABContactAPIFindDuplicatesResult_VendorType() {
    super( 129995768, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public ABContactAPIFindDuplicatesResult_VendorType( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( 129995768, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ABContactAPIFindDuplicatesResult_VendorType( gw.internal.xml.XmlElementState state ) {
    super( 129995768, state );
  }

  public ABContactAPIFindDuplicatesResult_VendorType( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResult_VendorType> get$Class() {
    return getClass();
  }
}
