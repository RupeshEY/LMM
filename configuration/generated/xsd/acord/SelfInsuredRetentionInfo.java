/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SelfInsuredRetentionInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SelfInsuredRetentionInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SelfInsuredRetentionTypeCd = new javax.xml.namespace.QName( "", "SelfInsuredRetentionTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SelfInsuredRetentionAmt = new javax.xml.namespace.QName( "", "SelfInsuredRetentionAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.SelfInsuredRetentionInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SelfInsuredRetentionInfo_Type" );
    }
  };

  public SelfInsuredRetentionInfo() {
    super( -967060734, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.SelfInsuredRetentionInfo_Type() );
  }

  public SelfInsuredRetentionInfo( xsd.acord.types.complex.SelfInsuredRetentionInfo_Type typeInstance ) {
    super( -967060734, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SelfInsuredRetentionInfo( gw.internal.xml.XmlElementState state ) {
    super( -967060734, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.SelfInsuredRetentionInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.SelfInsuredRetentionInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.SelfInsuredRetentionInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.SelfInsuredRetentionInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }

  public static xsd.acord.SelfInsuredRetentionInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.SelfInsuredRetentionInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SelfInsuredRetentionType getSelfInsuredRetentionTypeCd() {
    return (xsd.acord.enums.SelfInsuredRetentionType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionTypeCd" );
  }


  public final void setSelfInsuredRetentionTypeCd( xsd.acord.enums.SelfInsuredRetentionType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SelfInsuredRetentionTypeCd getSelfInsuredRetentionTypeCd_elem() {
    return (xsd.acord.SelfInsuredRetentionTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionTypeCd_elem" );
  }


  public final void setSelfInsuredRetentionTypeCd_elem( xsd.acord.SelfInsuredRetentionTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SelfInsuredRetentionAmt getSelfInsuredRetentionAmt() {
    return (xsd.acord.SelfInsuredRetentionAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionAmt" );
  }


  public final void setSelfInsuredRetentionAmt( xsd.acord.SelfInsuredRetentionAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SelfInsuredRetentionAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}