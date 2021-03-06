/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SendMessage extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestAPI", "sendMessage", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SpecialistId = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestAPI", "specialistId", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceRequestNumber = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestAPI", "serviceRequestNumber", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Title = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestAPI", "title", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Body = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestAPI", "body", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Type = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestAPI", "type", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.SendMessage" );
    }
  };

  public SendMessage() {
    super( -325488248, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.SendMessage() );
  }

  public SendMessage( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.SendMessage typeInstance ) {
    super( -325488248, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SendMessage( gw.internal.xml.XmlElementState state ) {
    super( -325488248, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.SendMessage get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.SendMessage.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.types.complex.SendMessage typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
  }

  public static wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.elements.SendMessage.class );
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
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_SpecialistId getSpecialistId_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_SpecialistId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SpecialistId_elem" );
  }


  public final void setSpecialistId_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_SpecialistId value ) {
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
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_ServiceRequestNumber getServiceRequestNumber_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_ServiceRequestNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceRequestNumber_elem" );
  }


  public final void setServiceRequestNumber_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_ServiceRequestNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceRequestNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTitle() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Title" );
  }


  public final void setTitle( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Title", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_Title getTitle_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_Title) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Title_elem" );
  }


  public final void setTitle_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_Title value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Title_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBody() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Body" );
  }


  public final void setBody( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Body", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_Body getBody_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_Body) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Body_elem" );
  }


  public final void setBody_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_Body value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Body_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestMessageType getType() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestMessageType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Type" );
  }


  public final void setType( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestMessageType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Type", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_Type getType_elem() {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_Type) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Type_elem" );
  }


  public final void setType_elem( wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.anonymous.elements.SendMessage_Type value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Type_elem", value );
  }
}
