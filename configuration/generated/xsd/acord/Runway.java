/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Runway extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Runway", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RunwayConstCd = new javax.xml.namespace.QName( "", "RunwayConstCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RunwayConstDesc = new javax.xml.namespace.QName( "", "RunwayConstDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Length = new javax.xml.namespace.QName( "", "Length", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Width = new javax.xml.namespace.QName( "", "Width", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RunwayMaintainDesc = new javax.xml.namespace.QName( "", "RunwayMaintainDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.Runway" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Runway_Type" );
    }
  };

  public Runway() {
    super( 1226245880, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.Runway_Type() );
  }

  public Runway( xsd.acord.types.complex.Runway_Type typeInstance ) {
    super( 1226245880, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Runway( gw.internal.xml.XmlElementState state ) {
    super( 1226245880, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.Runway> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.Runway_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.Runway_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.Runway_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.Runway parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.Runway.class );
  }

  public static xsd.acord.Runway parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.Runway.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.RunwayConstruction getRunwayConstCd() {
    return (xsd.acord.enums.RunwayConstruction) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RunwayConstCd" );
  }


  public final void setRunwayConstCd( xsd.acord.enums.RunwayConstruction value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RunwayConstCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RunwayConstCd getRunwayConstCd_elem() {
    return (xsd.acord.RunwayConstCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RunwayConstCd_elem" );
  }


  public final void setRunwayConstCd_elem( xsd.acord.RunwayConstCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RunwayConstCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRunwayConstDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RunwayConstDesc" );
  }


  public final void setRunwayConstDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RunwayConstDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RunwayConstDesc getRunwayConstDesc_elem() {
    return (xsd.acord.RunwayConstDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RunwayConstDesc_elem" );
  }


  public final void setRunwayConstDesc_elem( xsd.acord.RunwayConstDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RunwayConstDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Length getLength() {
    return (xsd.acord.Length) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Length" );
  }


  public final void setLength( xsd.acord.Length value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Length", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Width getWidth() {
    return (xsd.acord.Width) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Width" );
  }


  public final void setWidth( xsd.acord.Width value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Width", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRunwayMaintainDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RunwayMaintainDesc" );
  }


  public final void setRunwayMaintainDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RunwayMaintainDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RunwayMaintainDesc getRunwayMaintainDesc_elem() {
    return (xsd.acord.RunwayMaintainDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RunwayMaintainDesc_elem" );
  }


  public final void setRunwayMaintainDesc_elem( xsd.acord.RunwayMaintainDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RunwayMaintainDesc_elem", value );
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