/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class FenceConstructionCd extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "FenceConstructionCd", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CodeListRef = new javax.xml.namespace.QName( "", "CodeListRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.FenceConstructionCd" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ConstructionType" );
    }
  };

  public FenceConstructionCd() {
    super( -1165667921, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ConstructionType() );
  }

  public FenceConstructionCd( xsd.acord.types.complex.ConstructionType typeInstance ) {
    super( -1165667921, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private FenceConstructionCd( gw.internal.xml.XmlElementState state ) {
    super( -1165667921, state );
  }

  public FenceConstructionCd( xsd.acord.enums.ConstructionType value ) {
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
  public final java.lang.Class<? extends xsd.acord.FenceConstructionCd> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ConstructionType get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ConstructionType.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ConstructionType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.FenceConstructionCd parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.FenceConstructionCd.class );
  }

  public static xsd.acord.FenceConstructionCd parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.FenceConstructionCd.class );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ConstructionType getValue() {
    return (xsd.acord.enums.ConstructionType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ConstructionType get$Value() {
    return (xsd.acord.enums.ConstructionType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( xsd.acord.enums.ConstructionType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( xsd.acord.enums.ConstructionType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getCodeListRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CodeListRef" );
  }


  public final void setCodeListRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CodeListRef", value );
  }
}
