/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AddInvoiceToClaim extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SpecialistId = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "specialistId", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimNumber = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "claimNumber", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IncidentId = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "incidentId", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExposureId = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "exposureId", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Services = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "services", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreationInstructions = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "creationInstructions", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.AddInvoiceToClaim" );
    }
  };

  public AddInvoiceToClaim() {
    super( 719955488, TYPE.get() );
  }

  private AddInvoiceToClaim( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 719955488, state );
  }

  protected AddInvoiceToClaim( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AddInvoiceToClaim( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.AddInvoiceToClaim> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.AddInvoiceToClaim get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSpecialistId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SpecialistId" );
  }


  public final void setSpecialistId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SpecialistId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_SpecialistId getSpecialistId_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_SpecialistId) TYPE.get().getPropertyValue( this, "_SpecialistId_elem" );
  }


  public final void setSpecialistId_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_SpecialistId value ) {
    TYPE.get().setPropertyValue( this, "_SpecialistId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ClaimNumber" );
  }


  public final void setClaimNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ClaimNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_ClaimNumber getClaimNumber_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_ClaimNumber) TYPE.get().getPropertyValue( this, "_ClaimNumber_elem" );
  }


  public final void setClaimNumber_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_ClaimNumber value ) {
    TYPE.get().setPropertyValue( this, "_ClaimNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIncidentId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_IncidentId" );
  }


  public final void setIncidentId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_IncidentId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_IncidentId getIncidentId_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_IncidentId) TYPE.get().getPropertyValue( this, "_IncidentId_elem" );
  }


  public final void setIncidentId_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_IncidentId value ) {
    TYPE.get().setPropertyValue( this, "_IncidentId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExposureId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ExposureId" );
  }


  public final void setExposureId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ExposureId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_ExposureId getExposureId_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_ExposureId) TYPE.get().getPropertyValue( this, "_ExposureId_elem" );
  }


  public final void setExposureId_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_ExposureId value ) {
    TYPE.get().setPropertyValue( this, "_ExposureId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_Services getServices() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_Services) TYPE.get().getPropertyValue( this, "_Services" );
  }


  public final void setServices( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_Services value ) {
    TYPE.get().setPropertyValue( this, "_Services", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_CreationInstructions getCreationInstructions() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_CreationInstructions) TYPE.get().getPropertyValue( this, "_CreationInstructions" );
  }


  public final void setCreationInstructions( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddInvoiceToClaim_CreationInstructions value ) {
    TYPE.get().setPropertyValue( this, "_CreationInstructions", value );
  }

}