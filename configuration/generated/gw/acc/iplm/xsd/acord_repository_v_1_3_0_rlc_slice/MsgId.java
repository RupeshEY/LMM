/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class MsgId extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "MsgId", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.simple.UUIdType" );
    }
  };

  public MsgId() {
    super( -1380616477, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.simple.UUIdType() );
  }

  public MsgId( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.simple.UUIdType typeInstance ) {
    super( -1380616477, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private MsgId( gw.internal.xml.XmlElementState state ) {
    super( -1380616477, state );
  }

  public MsgId( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.simple.UUIdType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.simple.UUIdType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.simple.UUIdType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.MsgId.class );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValue() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String get$Value() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}