/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Statement_InvoiceStatus extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/Statement", "InvoiceStatus", "pogo11" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/Statement", "pogo11" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.Statement_InvoiceStatus" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.simple.ServiceRequestInvoiceStatus" );
    }
  };

  public Statement_InvoiceStatus() {
    super( 1338362009, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.simple.ServiceRequestInvoiceStatus() );
  }

  public Statement_InvoiceStatus( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.simple.ServiceRequestInvoiceStatus typeInstance ) {
    super( 1338362009, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Statement_InvoiceStatus( gw.internal.xml.XmlElementState state ) {
    super( 1338362009, state );
  }

  public Statement_InvoiceStatus( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestInvoiceStatus value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.Statement_InvoiceStatus> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.simple.ServiceRequestInvoiceStatus get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.simple.ServiceRequestInvoiceStatus.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.simple.ServiceRequestInvoiceStatus typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestInvoiceStatus getValue() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestInvoiceStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestInvoiceStatus get$Value() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestInvoiceStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestInvoiceStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestInvoiceStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}
