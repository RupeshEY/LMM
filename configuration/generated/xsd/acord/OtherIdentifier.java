/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class OtherIdentifier extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "OtherIdentifier", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherIdTypeCd = new javax.xml.namespace.QName( "", "OtherIdTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherId = new javax.xml.namespace.QName( "", "OtherId", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.OtherIdentifier" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.OtherIdentifier_Type" );
    }
  };

  public OtherIdentifier() {
    super( -764842011, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.OtherIdentifier_Type() );
  }

  public OtherIdentifier( xsd.acord.types.complex.OtherIdentifier_Type typeInstance ) {
    super( -764842011, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private OtherIdentifier( gw.internal.xml.XmlElementState state ) {
    super( -764842011, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.OtherIdentifier> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.OtherIdentifier_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.OtherIdentifier_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.OtherIdentifier_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.OtherIdentifier parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.OtherIdentifier.class );
  }

  public static xsd.acord.OtherIdentifier parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.OtherIdentifier.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.IdentifierType> getOtherIdTypeCd() {
    return (java.util.List<xsd.acord.enums.IdentifierType>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherIdTypeCd" );
  }


  public final void setOtherIdTypeCd( java.util.List<xsd.acord.enums.IdentifierType> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherIdTypeCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.OtherIdTypeCd> getOtherIdTypeCd_elem() {
    return (java.util.List<xsd.acord.OtherIdTypeCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherIdTypeCd_elem" );
  }


  public final void setOtherIdTypeCd_elem( java.util.List<xsd.acord.OtherIdTypeCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherIdTypeCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOtherId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherId" );
  }


  public final void setOtherId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OtherId getOtherId_elem() {
    return (xsd.acord.OtherId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherId_elem" );
  }


  public final void setOtherId_elem( xsd.acord.OtherId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherId_elem", value );
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
