/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BldgExposures extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BldgExposures", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DirectionTypeCd = new javax.xml.namespace.QName( "", "DirectionTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Distance = new javax.xml.namespace.QName( "", "Distance", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "", "Description", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.BldgExposures" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PROXIMITY" );
    }
  };

  public BldgExposures() {
    super( -1902744693, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.PROXIMITY() );
  }

  public BldgExposures( xsd.acord.types.complex.PROXIMITY typeInstance ) {
    super( -1902744693, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BldgExposures( gw.internal.xml.XmlElementState state ) {
    super( -1902744693, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.BldgExposures> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.PROXIMITY get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.PROXIMITY.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.PROXIMITY typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.BldgExposures parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.BldgExposures.class );
  }

  public static xsd.acord.BldgExposures parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.BldgExposures.class );
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
  public final xsd.acord.enums.BuildingExposure getDirectionTypeCd() {
    return (xsd.acord.enums.BuildingExposure) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DirectionTypeCd" );
  }


  public final void setDirectionTypeCd( xsd.acord.enums.BuildingExposure value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DirectionTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DirectionTypeCd getDirectionTypeCd_elem() {
    return (xsd.acord.DirectionTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DirectionTypeCd_elem" );
  }


  public final void setDirectionTypeCd_elem( xsd.acord.DirectionTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DirectionTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Distance getDistance() {
    return (xsd.acord.Distance) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Distance" );
  }


  public final void setDistance( xsd.acord.Distance value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Distance", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Description getDescription_elem() {
    return (xsd.acord.Description) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description_elem" );
  }


  public final void setDescription_elem( xsd.acord.Description value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description_elem", value );
  }
}