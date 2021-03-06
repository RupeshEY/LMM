/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class StatementCreationInstructions extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "StatementCreationInstructions", "pogo19" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "pogo19" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amount = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "Amount", "pogo19" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "Description", "pogo19" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentsToUpload = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "DocumentsToUpload", "pogo19" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentsToUploadNames = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "DocumentsToUploadNames", "pogo19" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExistingDocumentsToLinkPublicIds = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "ExistingDocumentsToLinkPublicIds", "pogo19" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuoteNumberOfDaysToPerformService = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "QuoteNumberOfDaysToPerformService", "pogo19" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferenceNumber = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/StatementCreationInstructions", "ReferenceNumber", "pogo19" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.StatementCreationInstructions" );
    }
  };

  public StatementCreationInstructions() {
    super( 1863216864, TYPE.get() );
  }

  private StatementCreationInstructions( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1863216864, state );
  }

  protected StatementCreationInstructions( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected StatementCreationInstructions( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.StatementCreationInstructions> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.StatementCreationInstructions get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getAmount() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_Amount" );
  }


  public final void setAmount( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_Amount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_Amount getAmount_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_Amount) TYPE.get().getPropertyValue( this, "_Amount_elem" );
  }


  public final void setAmount_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_Amount value ) {
    TYPE.get().setPropertyValue( this, "_Amount_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_Description getDescription_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_DocumentsToUpload getDocumentsToUpload() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_DocumentsToUpload) TYPE.get().getPropertyValue( this, "_DocumentsToUpload" );
  }


  public final void setDocumentsToUpload( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_DocumentsToUpload value ) {
    TYPE.get().setPropertyValue( this, "_DocumentsToUpload", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_DocumentsToUploadNames getDocumentsToUploadNames() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_DocumentsToUploadNames) TYPE.get().getPropertyValue( this, "_DocumentsToUploadNames" );
  }


  public final void setDocumentsToUploadNames( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_DocumentsToUploadNames value ) {
    TYPE.get().setPropertyValue( this, "_DocumentsToUploadNames", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_ExistingDocumentsToLinkPublicIds getExistingDocumentsToLinkPublicIds() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_ExistingDocumentsToLinkPublicIds) TYPE.get().getPropertyValue( this, "_ExistingDocumentsToLinkPublicIds" );
  }


  public final void setExistingDocumentsToLinkPublicIds( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_ExistingDocumentsToLinkPublicIds value ) {
    TYPE.get().setPropertyValue( this, "_ExistingDocumentsToLinkPublicIds", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getQuoteNumberOfDaysToPerformService() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_QuoteNumberOfDaysToPerformService" );
  }


  public final void setQuoteNumberOfDaysToPerformService( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_QuoteNumberOfDaysToPerformService", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_QuoteNumberOfDaysToPerformService getQuoteNumberOfDaysToPerformService_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_QuoteNumberOfDaysToPerformService) TYPE.get().getPropertyValue( this, "_QuoteNumberOfDaysToPerformService_elem" );
  }


  public final void setQuoteNumberOfDaysToPerformService_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_QuoteNumberOfDaysToPerformService value ) {
    TYPE.get().setPropertyValue( this, "_QuoteNumberOfDaysToPerformService_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReferenceNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ReferenceNumber" );
  }


  public final void setReferenceNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ReferenceNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_ReferenceNumber getReferenceNumber_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_ReferenceNumber) TYPE.get().getPropertyValue( this, "_ReferenceNumber_elem" );
  }


  public final void setReferenceNumber_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.StatementCreationInstructions_ReferenceNumber value ) {
    TYPE.get().setPropertyValue( this, "_ReferenceNumber_elem", value );
  }

}
