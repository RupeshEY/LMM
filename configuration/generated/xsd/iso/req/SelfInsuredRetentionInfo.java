/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SelfInsuredRetentionInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SelfInsuredRetentionInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SelfInsuredRetentionTypeCd = new javax.xml.namespace.QName( "", "SelfInsuredRetentionTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SelfInsuredRetentionAmt = new javax.xml.namespace.QName( "", "SelfInsuredRetentionAmt", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.SelfInsuredRetentionInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.SelfInsuredRetentionInfo" );
    }
  };

  public SelfInsuredRetentionInfo() {
    super( -1901058484, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.SelfInsuredRetentionInfo() );
  }

  public SelfInsuredRetentionInfo( xsd.iso.req.anonymous.types.complex.SelfInsuredRetentionInfo typeInstance ) {
    super( -1901058484, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SelfInsuredRetentionInfo( gw.internal.xml.XmlElementState state ) {
    super( -1901058484, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.SelfInsuredRetentionInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.SelfInsuredRetentionInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.SelfInsuredRetentionInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.SelfInsuredRetentionInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }

  public static xsd.iso.req.SelfInsuredRetentionInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.SelfInsuredRetentionInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSelfInsuredRetentionTypeCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionTypeCd" );
  }


  public final void setSelfInsuredRetentionTypeCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.SelfInsuredRetentionInfo_SelfInsuredRetentionTypeCd getSelfInsuredRetentionTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.SelfInsuredRetentionInfo_SelfInsuredRetentionTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionTypeCd_elem" );
  }


  public final void setSelfInsuredRetentionTypeCd_elem( xsd.iso.req.anonymous.elements.SelfInsuredRetentionInfo_SelfInsuredRetentionTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.SelfInsuredRetentionInfo_SelfInsuredRetentionAmt getSelfInsuredRetentionAmt() {
    return (xsd.iso.req.anonymous.elements.SelfInsuredRetentionInfo_SelfInsuredRetentionAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionAmt" );
  }


  public final void setSelfInsuredRetentionAmt( xsd.iso.req.anonymous.elements.SelfInsuredRetentionInfo_SelfInsuredRetentionAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionAmt", value );
  }
}