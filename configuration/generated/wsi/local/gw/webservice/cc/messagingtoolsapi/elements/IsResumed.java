/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.messagingtoolsapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class IsResumed extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "isResumed", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DestID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "destID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Direction = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "direction", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.IsResumed" );
    }
  };

  public IsResumed() {
    super( 975410748, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.IsResumed() );
  }

  public IsResumed( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.IsResumed typeInstance ) {
    super( 975410748, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private IsResumed( gw.internal.xml.XmlElementState state ) {
    super( 975410748, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.IsResumed get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.IsResumed.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.IsResumed typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
  }

  public static wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.messagingtoolsapi.elements.IsResumed.class );
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
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.IsResumed_DestID getDestID_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.IsResumed_DestID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DestID_elem" );
  }


  public final void setDestID_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.IsResumed_DestID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DestID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection getDirection() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Direction" );
  }


  public final void setDirection( wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Direction", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.IsResumed_Direction getDirection_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.IsResumed_Direction) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Direction_elem" );
  }


  public final void setDirection_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.IsResumed_Direction value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Direction_elem", value );
  }
}
