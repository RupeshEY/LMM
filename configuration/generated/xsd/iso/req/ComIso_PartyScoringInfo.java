/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ComIso_PartyScoringInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "com.iso_PartyScoringInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_APDScore = new javax.xml.namespace.QName( "", "com.iso_APDScore", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumMatches = new javax.xml.namespace.QName( "", "NumMatches", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_SearchableElementCd = new javax.xml.namespace.QName( "", "com.iso_SearchableElementCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_ScoredMatch = new javax.xml.namespace.QName( "", "com.iso_ScoredMatch", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.ComIso_PartyScoringInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ComIso_PartyScoringInfo" );
    }
  };

  public ComIso_PartyScoringInfo() {
    super( -1999341420, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.ComIso_PartyScoringInfo() );
  }

  public ComIso_PartyScoringInfo( xsd.iso.req.anonymous.types.complex.ComIso_PartyScoringInfo typeInstance ) {
    super( -1999341420, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ComIso_PartyScoringInfo( gw.internal.xml.XmlElementState state ) {
    super( -1999341420, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.ComIso_PartyScoringInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.ComIso_PartyScoringInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.ComIso_PartyScoringInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.ComIso_PartyScoringInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }

  public static xsd.iso.req.ComIso_PartyScoringInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.ComIso_PartyScoringInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_APDScore() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_APDScore" );
  }


  public final void setComIso_APDScore( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_APDScore", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_PartyScoringInfo_ComIso_APDScore getComIso_APDScore_elem() {
    return (xsd.iso.req.anonymous.elements.ComIso_PartyScoringInfo_ComIso_APDScore) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_APDScore_elem" );
  }


  public final void setComIso_APDScore_elem( xsd.iso.req.anonymous.elements.ComIso_PartyScoringInfo_ComIso_APDScore value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_APDScore_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNumMatches() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumMatches" );
  }


  public final void setNumMatches( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumMatches", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_PartyScoringInfo_NumMatches getNumMatches_elem() {
    return (xsd.iso.req.anonymous.elements.ComIso_PartyScoringInfo_NumMatches) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumMatches_elem" );
  }


  public final void setNumMatches_elem( xsd.iso.req.anonymous.elements.ComIso_PartyScoringInfo_NumMatches value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumMatches_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getComIso_SearchableElementCd() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_SearchableElementCd" );
  }


  public final void setComIso_SearchableElementCd( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_SearchableElementCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.ComIso_PartyScoringInfo_ComIso_SearchableElementCd> getComIso_SearchableElementCd_elem() {
    return (java.util.List<xsd.iso.req.anonymous.elements.ComIso_PartyScoringInfo_ComIso_SearchableElementCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_SearchableElementCd_elem" );
  }


  public final void setComIso_SearchableElementCd_elem( java.util.List<xsd.iso.req.anonymous.elements.ComIso_PartyScoringInfo_ComIso_SearchableElementCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_SearchableElementCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ComIso_ScoredMatch> getComIso_ScoredMatch() {
    return (java.util.List<xsd.iso.req.ComIso_ScoredMatch>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_ScoredMatch" );
  }


  public final void setComIso_ScoredMatch( java.util.List<xsd.iso.req.ComIso_ScoredMatch> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_ScoredMatch", value );
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