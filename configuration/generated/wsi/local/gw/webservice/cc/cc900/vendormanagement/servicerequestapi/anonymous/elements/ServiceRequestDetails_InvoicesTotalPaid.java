/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ServiceRequestDetails_InvoicesTotalPaid extends gw.internal.xml.simplevalues.DecimalXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestDetails", "InvoicesTotalPaid", "pogo8" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestDetails", "pogo8" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestDetails_InvoicesTotalPaid" );
    }
  };

  public ServiceRequestDetails_InvoicesTotalPaid() {
    super( -645532642, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Decimal() );
  }

  public ServiceRequestDetails_InvoicesTotalPaid( gw.xsd.w3c.xmlschema.types.simple.Decimal typeInstance ) {
    super( -645532642, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ServiceRequestDetails_InvoicesTotalPaid( gw.internal.xml.XmlElementState state ) {
    super( -645532642, state );
  }

  public ServiceRequestDetails_InvoicesTotalPaid( java.math.BigDecimal value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestDetails_InvoicesTotalPaid> get$Class() {
    return getClass();
  }
}
