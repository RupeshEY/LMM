/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ServiceRequestDetails_AdjusterDetail extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestDetails", "AdjusterDetail", "pogo8" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestDetails", "pogo8" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Address = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ContactDetail", "Address", "pogo9" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContactSummary = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ContactDetail", "ContactSummary", "pogo9" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestDetails_AdjusterDetail" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ContactDetail" );
    }
  };

  public ServiceRequestDetails_AdjusterDetail() {
    super( 2128808090, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ContactDetail() );
  }

  public ServiceRequestDetails_AdjusterDetail( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ContactDetail typeInstance ) {
    super( 2128808090, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ServiceRequestDetails_AdjusterDetail( gw.internal.xml.XmlElementState state ) {
    super( 2128808090, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestDetails_AdjusterDetail> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ContactDetail get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ContactDetail.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ContactDetail typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddress() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Address" );
  }


  public final void setAddress( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Address", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ContactDetail_Address getAddress_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ContactDetail_Address) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Address_elem" );
  }


  public final void setAddress_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ContactDetail_Address value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Address_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ContactDetail_ContactSummary getContactSummary() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ContactDetail_ContactSummary) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContactSummary" );
  }


  public final void setContactSummary( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ContactDetail_ContactSummary value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContactSummary", value );
  }
}
