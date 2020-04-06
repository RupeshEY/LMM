/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CommlVehSchedule extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommlVehSchedule", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehs = new javax.xml.namespace.QName( "", "NumVehs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlVeh = new javax.xml.namespace.QName( "", "CommlVeh", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CommlVehSchedule" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommlVehSchedule_Type" );
    }
  };

  public CommlVehSchedule() {
    super( -1664252988, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CommlVehSchedule_Type() );
  }

  public CommlVehSchedule( xsd.acord.types.complex.CommlVehSchedule_Type typeInstance ) {
    super( -1664252988, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CommlVehSchedule( gw.internal.xml.XmlElementState state ) {
    super( -1664252988, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CommlVehSchedule> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CommlVehSchedule_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CommlVehSchedule_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CommlVehSchedule_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CommlVehSchedule parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CommlVehSchedule.class );
  }

  public static xsd.acord.CommlVehSchedule parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CommlVehSchedule.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehs() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehs" );
  }


  public final void setNumVehs( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehs getNumVehs_elem() {
    return (xsd.acord.NumVehs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehs_elem" );
  }


  public final void setNumVehs_elem( xsd.acord.NumVehs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehs_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlVeh> getCommlVeh() {
    return (java.util.List<xsd.acord.CommlVeh>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlVeh" );
  }


  public final void setCommlVeh( java.util.List<xsd.acord.CommlVeh> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlVeh", value );
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