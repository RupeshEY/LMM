/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class UpdateExpectedQuoteCompletionDate extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "updateExpectedQuoteCompletionDate", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SpecialistId = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "specialistId", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceRequestNumber = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "serviceRequestNumber", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpectedCompletionDate = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "expectedCompletionDate", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ChangeReason = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "changeReason", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.UpdateExpectedQuoteCompletionDate" );
    }
  };

  public UpdateExpectedQuoteCompletionDate() {
    super( -303800753, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.UpdateExpectedQuoteCompletionDate() );
  }

  public UpdateExpectedQuoteCompletionDate( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.UpdateExpectedQuoteCompletionDate typeInstance ) {
    super( -303800753, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private UpdateExpectedQuoteCompletionDate( gw.internal.xml.XmlElementState state ) {
    super( -303800753, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.UpdateExpectedQuoteCompletionDate get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.UpdateExpectedQuoteCompletionDate.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.UpdateExpectedQuoteCompletionDate typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.elements.UpdateExpectedQuoteCompletionDate.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSpecialistId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SpecialistId" );
  }


  public final void setSpecialistId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SpecialistId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_SpecialistId getSpecialistId_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_SpecialistId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SpecialistId_elem" );
  }


  public final void setSpecialistId_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_SpecialistId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SpecialistId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServiceRequestNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceRequestNumber" );
  }


  public final void setServiceRequestNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceRequestNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_ServiceRequestNumber getServiceRequestNumber_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_ServiceRequestNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceRequestNumber_elem" );
  }


  public final void setServiceRequestNumber_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_ServiceRequestNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceRequestNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getExpectedCompletionDate() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExpectedCompletionDate" );
  }


  public final void setExpectedCompletionDate( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExpectedCompletionDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_ExpectedCompletionDate getExpectedCompletionDate_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_ExpectedCompletionDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExpectedCompletionDate_elem" );
  }


  public final void setExpectedCompletionDate_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_ExpectedCompletionDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExpectedCompletionDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getChangeReason() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ChangeReason" );
  }


  public final void setChangeReason( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ChangeReason", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_ChangeReason getChangeReason_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_ChangeReason) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ChangeReason_elem" );
  }


  public final void setChangeReason_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.UpdateExpectedQuoteCompletionDate_ChangeReason value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ChangeReason_elem", value );
  }
}
