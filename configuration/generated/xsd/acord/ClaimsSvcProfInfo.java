/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimsSvcProfInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ClaimsSvcProfInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SvcCore = new javax.xml.namespace.QName( "", "SvcCore", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgSuptCd = new javax.xml.namespace.QName( "", "MsgSuptCd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ClaimsSvcProfInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ClaimsSvcProfInfo_Type" );
    }
  };

  public ClaimsSvcProfInfo() {
    super( -56151300, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ClaimsSvcProfInfo_Type() );
  }

  public ClaimsSvcProfInfo( xsd.acord.types.complex.ClaimsSvcProfInfo_Type typeInstance ) {
    super( -56151300, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimsSvcProfInfo( gw.internal.xml.XmlElementState state ) {
    super( -56151300, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ClaimsSvcProfInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ClaimsSvcProfInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ClaimsSvcProfInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ClaimsSvcProfInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }

  public static xsd.acord.ClaimsSvcProfInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ClaimsSvcProfInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SvcCore getSvcCore() {
    return (xsd.acord.SvcCore) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SvcCore" );
  }


  public final void setSvcCore( xsd.acord.SvcCore value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SvcCore", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.SvcMsg> getMsgSuptCd() {
    return (java.util.List<xsd.acord.enums.SvcMsg>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgSuptCd" );
  }


  public final void setMsgSuptCd( java.util.List<xsd.acord.enums.SvcMsg> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgSuptCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.MsgSuptCd> getMsgSuptCd_elem() {
    return (java.util.List<xsd.acord.MsgSuptCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgSuptCd_elem" );
  }


  public final void setMsgSuptCd_elem( java.util.List<xsd.acord.MsgSuptCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgSuptCd_elem", value );
  }

}