/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ServiceRequestSearchResults_Results extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchResults", "Results", "pogo2" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchResults", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchResults", "Entry", "pogo2" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchResults_Results" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.ServiceRequestSearchResults_Results" );
    }
  };

  public ServiceRequestSearchResults_Results() {
    super( -804301099, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.ServiceRequestSearchResults_Results() );
  }

  public ServiceRequestSearchResults_Results( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.ServiceRequestSearchResults_Results typeInstance ) {
    super( -804301099, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ServiceRequestSearchResults_Results( gw.internal.xml.XmlElementState state ) {
    super( -804301099, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchResults_Results> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.ServiceRequestSearchResults_Results get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.ServiceRequestSearchResults_Results.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.ServiceRequestSearchResults_Results typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchResults_Results_Entry> getEntry() {
    return (java.util.List<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchResults_Results_Entry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Entry" );
  }


  public final void setEntry( java.util.List<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchResults_Results_Entry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Entry", value );
  }

}