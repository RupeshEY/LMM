/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ServiceRequestSummary_ClaimNumber extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestSummary", "ClaimNumber", "pogo3" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestSummary", "pogo3" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSummary_ClaimNumber" );
    }
  };

  public ServiceRequestSummary_ClaimNumber() {
    super( 1164635453, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public ServiceRequestSummary_ClaimNumber( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( 1164635453, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ServiceRequestSummary_ClaimNumber( gw.internal.xml.XmlElementState state ) {
    super( 1164635453, state );
  }

  public ServiceRequestSummary_ClaimNumber( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSummary_ClaimNumber> get$Class() {
    return getClass();
  }
}
