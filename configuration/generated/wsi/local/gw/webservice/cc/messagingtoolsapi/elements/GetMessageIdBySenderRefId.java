/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.messagingtoolsapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GetMessageIdBySenderRefId extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "getMessageIdBySenderRefId", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SenderRefID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "senderRefID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DestID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "destID", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetMessageIdBySenderRefId" );
    }
  };

  public GetMessageIdBySenderRefId() {
    super( 868114565, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetMessageIdBySenderRefId() );
  }

  public GetMessageIdBySenderRefId( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetMessageIdBySenderRefId typeInstance ) {
    super( 868114565, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GetMessageIdBySenderRefId( gw.internal.xml.XmlElementState state ) {
    super( 868114565, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetMessageIdBySenderRefId get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetMessageIdBySenderRefId.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetMessageIdBySenderRefId typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.GetMessageIdBySenderRefId.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSenderRefID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SenderRefID" );
  }


  public final void setSenderRefID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SenderRefID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetMessageIdBySenderRefId_SenderRefID getSenderRefID_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetMessageIdBySenderRefId_SenderRefID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SenderRefID_elem" );
  }


  public final void setSenderRefID_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetMessageIdBySenderRefId_SenderRefID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SenderRefID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getDestID() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DestID" );
  }


  public final void setDestID( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DestID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetMessageIdBySenderRefId_DestID getDestID_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetMessageIdBySenderRefId_DestID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DestID_elem" );
  }


  public final void setDestID_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetMessageIdBySenderRefId_DestID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DestID_elem", value );
  }
}