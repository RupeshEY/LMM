/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ABContactAPIFindDuplicatesResultContainer_TotalResults extends gw.internal.xml.simplevalues.IntXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPIFindDuplicatesResultContainer", "TotalResults", "pogo15" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPIFindDuplicatesResultContainer", "pogo15" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab801.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResultContainer_TotalResults" );
    }
  };

  public ABContactAPIFindDuplicatesResultContainer_TotalResults() {
    super( -1251818215, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Int() );
  }

  public ABContactAPIFindDuplicatesResultContainer_TotalResults( gw.xsd.w3c.xmlschema.types.simple.Int typeInstance ) {
    super( -1251818215, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ABContactAPIFindDuplicatesResultContainer_TotalResults( gw.internal.xml.XmlElementState state ) {
    super( -1251818215, state );
  }

  public ABContactAPIFindDuplicatesResultContainer_TotalResults( java.lang.Integer value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResultContainer_TotalResults> get$Class() {
    return getClass();
  }
}