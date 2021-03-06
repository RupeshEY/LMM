/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class MatchInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "MatchInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumMatches = new javax.xml.namespace.QName( "", "NumMatches", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumPersonMatches = new javax.xml.namespace.QName( "", "NumPersonMatches", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehMatches = new javax.xml.namespace.QName( "", "NumVehMatches", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalMatchInfo = new javax.xml.namespace.QName( "", "AdditionalMatchInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.MatchInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.MatchInfo_Type" );
    }
  };

  public MatchInfo() {
    super( -1487323873, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.MatchInfo_Type() );
  }

  public MatchInfo( xsd.acord.types.complex.MatchInfo_Type typeInstance ) {
    super( -1487323873, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private MatchInfo( gw.internal.xml.XmlElementState state ) {
    super( -1487323873, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.MatchInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.MatchInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.MatchInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.MatchInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.MatchInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.MatchInfo.class );
  }

  public static xsd.acord.MatchInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.MatchInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumMatches() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumMatches" );
  }


  public final void setNumMatches( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumMatches", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumMatches getNumMatches_elem() {
    return (xsd.acord.NumMatches) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumMatches_elem" );
  }


  public final void setNumMatches_elem( xsd.acord.NumMatches value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumMatches_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumPersonMatches() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumPersonMatches" );
  }


  public final void setNumPersonMatches( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumPersonMatches", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumPersonMatches getNumPersonMatches_elem() {
    return (xsd.acord.NumPersonMatches) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumPersonMatches_elem" );
  }


  public final void setNumPersonMatches_elem( xsd.acord.NumPersonMatches value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumPersonMatches_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehMatches() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehMatches" );
  }


  public final void setNumVehMatches( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehMatches", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehMatches getNumVehMatches_elem() {
    return (xsd.acord.NumVehMatches) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehMatches_elem" );
  }


  public final void setNumVehMatches_elem( xsd.acord.NumVehMatches value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehMatches_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AdditionalMatchInfo> getAdditionalMatchInfo() {
    return (java.util.List<xsd.acord.AdditionalMatchInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AdditionalMatchInfo" );
  }


  public final void setAdditionalMatchInfo( java.util.List<xsd.acord.AdditionalMatchInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AdditionalMatchInfo", value );
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
