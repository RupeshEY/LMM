/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PendingResponseInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PendingResponseInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgRqUID = new javax.xml.namespace.QName( "", "MsgRqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgNameCd = new javax.xml.namespace.QName( "", "MsgNameCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionRequestDt = new javax.xml.namespace.QName( "", "TransactionRequestDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NotificationDt = new javax.xml.namespace.QName( "", "NotificationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PendingResponseExpDt = new javax.xml.namespace.QName( "", "PendingResponseExpDt", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.PendingResponseInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.PendingResponseInfo" );
    }
  };

  public PendingResponseInfo() {
    super( -1772784568, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.PendingResponseInfo() );
  }

  public PendingResponseInfo( xsd.iso.req.anonymous.types.complex.PendingResponseInfo typeInstance ) {
    super( -1772784568, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PendingResponseInfo( gw.internal.xml.XmlElementState state ) {
    super( -1772784568, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.PendingResponseInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.PendingResponseInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.PendingResponseInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.PendingResponseInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.PendingResponseInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.PendingResponseInfo.class );
  }

  public static xsd.iso.req.PendingResponseInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.PendingResponseInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMsgRqUID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgRqUID" );
  }


  public final void setMsgRqUID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgRqUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.MsgRqUID getMsgRqUID_elem() {
    return (xsd.iso.req.MsgRqUID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgRqUID_elem" );
  }


  public final void setMsgRqUID_elem( xsd.iso.req.MsgRqUID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgRqUID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMsgNameCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgNameCd" );
  }


  public final void setMsgNameCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgNameCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.MsgNameCd getMsgNameCd_elem() {
    return (xsd.iso.req.MsgNameCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgNameCd_elem" );
  }


  public final void setMsgNameCd_elem( xsd.iso.req.MsgNameCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgNameCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransactionRequestDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionRequestDt" );
  }


  public final void setTransactionRequestDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionRequestDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.TransactionRequestDt getTransactionRequestDt_elem() {
    return (xsd.iso.req.TransactionRequestDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionRequestDt_elem" );
  }


  public final void setTransactionRequestDt_elem( xsd.iso.req.TransactionRequestDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionRequestDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlDate getNotificationDt() {
    return (gw.xml.date.XmlDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NotificationDt" );
  }


  public final void setNotificationDt( gw.xml.date.XmlDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NotificationDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.NotificationDt getNotificationDt_elem() {
    return (xsd.iso.req.NotificationDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NotificationDt_elem" );
  }


  public final void setNotificationDt_elem( xsd.iso.req.NotificationDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NotificationDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlDate getPendingResponseExpDt() {
    return (gw.xml.date.XmlDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PendingResponseExpDt" );
  }


  public final void setPendingResponseExpDt( gw.xml.date.XmlDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PendingResponseExpDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.PendingResponseExpDt getPendingResponseExpDt_elem() {
    return (xsd.iso.req.PendingResponseExpDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PendingResponseExpDt_elem" );
  }


  public final void setPendingResponseExpDt_elem( xsd.iso.req.PendingResponseExpDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PendingResponseExpDt_elem", value );
  }
}