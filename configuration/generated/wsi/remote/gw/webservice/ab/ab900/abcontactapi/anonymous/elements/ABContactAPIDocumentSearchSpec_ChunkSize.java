/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ABContactAPIDocumentSearchSpec_ChunkSize extends gw.internal.xml.simplevalues.IntXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "ChunkSize", "pogo21" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "pogo21" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ChunkSize" );
    }
  };

  public ABContactAPIDocumentSearchSpec_ChunkSize() {
    super( -701573416, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Int() );
  }

  public ABContactAPIDocumentSearchSpec_ChunkSize( gw.xsd.w3c.xmlschema.types.simple.Int typeInstance ) {
    super( -701573416, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ABContactAPIDocumentSearchSpec_ChunkSize( gw.internal.xml.XmlElementState state ) {
    super( -701573416, state );
  }

  public ABContactAPIDocumentSearchSpec_ChunkSize( java.lang.Integer value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ChunkSize> get$Class() {
    return getClass();
  }
}
