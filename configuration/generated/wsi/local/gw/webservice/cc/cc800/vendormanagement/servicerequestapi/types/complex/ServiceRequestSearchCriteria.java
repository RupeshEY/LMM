/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ServiceRequestSearchCriteria extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "ServiceRequestSearchCriteria", "pogo" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CanceledWithinDays = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "CanceledWithinDays", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimNumber = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "ClaimNumber", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OnlyActive = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "OnlyActive", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OnlyCanceledAndDeclined = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "OnlyCanceledAndDeclined", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OnlyCompleteWaitingForInvoice = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "OnlyCompleteWaitingForInvoice", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OnlyInactive = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "OnlyInactive", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OnlyOverdue = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "OnlyOverdue", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OnlyRecentlyCanceled = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "OnlyRecentlyCanceled", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OnlyUnpaidInvoices = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "OnlyUnpaidInvoices", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OnlyWaiting = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "OnlyWaiting", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OnlyWaitingForQuote = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "OnlyWaitingForQuote", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceRequestReferenceNumber = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestSearchCriteria", "ServiceRequestReferenceNumber", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchCriteria" );
    }
  };

  public ServiceRequestSearchCriteria() {
    super( 630292372, TYPE.get() );
  }

  private ServiceRequestSearchCriteria( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 630292372, state );
  }

  protected ServiceRequestSearchCriteria( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ServiceRequestSearchCriteria( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchCriteria> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchCriteria get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getCanceledWithinDays() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_CanceledWithinDays" );
  }


  public final void setCanceledWithinDays( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_CanceledWithinDays", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_CanceledWithinDays getCanceledWithinDays_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_CanceledWithinDays) TYPE.get().getPropertyValue( this, "_CanceledWithinDays_elem" );
  }


  public final void setCanceledWithinDays_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_CanceledWithinDays value ) {
    TYPE.get().setPropertyValue( this, "_CanceledWithinDays_elem", value );
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
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_ClaimNumber getClaimNumber_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_ClaimNumber) TYPE.get().getPropertyValue( this, "_ClaimNumber_elem" );
  }


  public final void setClaimNumber_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_ClaimNumber value ) {
    TYPE.get().setPropertyValue( this, "_ClaimNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOnlyActive() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OnlyActive" );
  }


  public final void setOnlyActive( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OnlyActive", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyActive getOnlyActive_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyActive) TYPE.get().getPropertyValue( this, "_OnlyActive_elem" );
  }


  public final void setOnlyActive_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyActive value ) {
    TYPE.get().setPropertyValue( this, "_OnlyActive_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOnlyCanceledAndDeclined() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OnlyCanceledAndDeclined" );
  }


  public final void setOnlyCanceledAndDeclined( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OnlyCanceledAndDeclined", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyCanceledAndDeclined getOnlyCanceledAndDeclined_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyCanceledAndDeclined) TYPE.get().getPropertyValue( this, "_OnlyCanceledAndDeclined_elem" );
  }


  public final void setOnlyCanceledAndDeclined_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyCanceledAndDeclined value ) {
    TYPE.get().setPropertyValue( this, "_OnlyCanceledAndDeclined_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOnlyCompleteWaitingForInvoice() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OnlyCompleteWaitingForInvoice" );
  }


  public final void setOnlyCompleteWaitingForInvoice( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OnlyCompleteWaitingForInvoice", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyCompleteWaitingForInvoice getOnlyCompleteWaitingForInvoice_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyCompleteWaitingForInvoice) TYPE.get().getPropertyValue( this, "_OnlyCompleteWaitingForInvoice_elem" );
  }


  public final void setOnlyCompleteWaitingForInvoice_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyCompleteWaitingForInvoice value ) {
    TYPE.get().setPropertyValue( this, "_OnlyCompleteWaitingForInvoice_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOnlyInactive() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OnlyInactive" );
  }


  public final void setOnlyInactive( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OnlyInactive", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyInactive getOnlyInactive_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyInactive) TYPE.get().getPropertyValue( this, "_OnlyInactive_elem" );
  }


  public final void setOnlyInactive_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyInactive value ) {
    TYPE.get().setPropertyValue( this, "_OnlyInactive_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOnlyOverdue() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OnlyOverdue" );
  }


  public final void setOnlyOverdue( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OnlyOverdue", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyOverdue getOnlyOverdue_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyOverdue) TYPE.get().getPropertyValue( this, "_OnlyOverdue_elem" );
  }


  public final void setOnlyOverdue_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyOverdue value ) {
    TYPE.get().setPropertyValue( this, "_OnlyOverdue_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOnlyRecentlyCanceled() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OnlyRecentlyCanceled" );
  }


  public final void setOnlyRecentlyCanceled( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OnlyRecentlyCanceled", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyRecentlyCanceled getOnlyRecentlyCanceled_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyRecentlyCanceled) TYPE.get().getPropertyValue( this, "_OnlyRecentlyCanceled_elem" );
  }


  public final void setOnlyRecentlyCanceled_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyRecentlyCanceled value ) {
    TYPE.get().setPropertyValue( this, "_OnlyRecentlyCanceled_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOnlyUnpaidInvoices() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OnlyUnpaidInvoices" );
  }


  public final void setOnlyUnpaidInvoices( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OnlyUnpaidInvoices", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyUnpaidInvoices getOnlyUnpaidInvoices_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyUnpaidInvoices) TYPE.get().getPropertyValue( this, "_OnlyUnpaidInvoices_elem" );
  }


  public final void setOnlyUnpaidInvoices_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyUnpaidInvoices value ) {
    TYPE.get().setPropertyValue( this, "_OnlyUnpaidInvoices_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOnlyWaiting() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OnlyWaiting" );
  }


  public final void setOnlyWaiting( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OnlyWaiting", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyWaiting getOnlyWaiting_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyWaiting) TYPE.get().getPropertyValue( this, "_OnlyWaiting_elem" );
  }


  public final void setOnlyWaiting_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyWaiting value ) {
    TYPE.get().setPropertyValue( this, "_OnlyWaiting_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOnlyWaitingForQuote() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OnlyWaitingForQuote" );
  }


  public final void setOnlyWaitingForQuote( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OnlyWaitingForQuote", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyWaitingForQuote getOnlyWaitingForQuote_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyWaitingForQuote) TYPE.get().getPropertyValue( this, "_OnlyWaitingForQuote_elem" );
  }


  public final void setOnlyWaitingForQuote_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_OnlyWaitingForQuote value ) {
    TYPE.get().setPropertyValue( this, "_OnlyWaitingForQuote_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServiceRequestReferenceNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ServiceRequestReferenceNumber" );
  }


  public final void setServiceRequestReferenceNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ServiceRequestReferenceNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_ServiceRequestReferenceNumber getServiceRequestReferenceNumber_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_ServiceRequestReferenceNumber) TYPE.get().getPropertyValue( this, "_ServiceRequestReferenceNumber_elem" );
  }


  public final void setServiceRequestReferenceNumber_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.ServiceRequestSearchCriteria_ServiceRequestReferenceNumber value ) {
    TYPE.get().setPropertyValue( this, "_ServiceRequestReferenceNumber_elem", value );
  }

}
