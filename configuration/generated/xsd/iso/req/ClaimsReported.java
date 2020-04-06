/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimsReported extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ClaimsReported", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReportedDt = new javax.xml.namespace.QName( "", "ReportedDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReportNumber = new javax.xml.namespace.QName( "", "ReportNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ReportedByRef = new javax.xml.namespace.QName( "", "ReportedByRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ReportedToRef = new javax.xml.namespace.QName( "", "ReportedToRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.ClaimsReported" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ClaimsReported" );
    }
  };

  public ClaimsReported() {
    super( -1844159512, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.ClaimsReported() );
  }

  public ClaimsReported( xsd.iso.req.anonymous.types.complex.ClaimsReported typeInstance ) {
    super( -1844159512, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimsReported( gw.internal.xml.XmlElementState state ) {
    super( -1844159512, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.ClaimsReported> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.ClaimsReported get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.ClaimsReported.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.ClaimsReported typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.ClaimsReported parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.ClaimsReported.class );
  }

  public static xsd.iso.req.ClaimsReported parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.ClaimsReported.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReportedDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportedDt" );
  }


  public final void setReportedDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportedDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsReported_ReportedDt getReportedDt_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsReported_ReportedDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportedDt_elem" );
  }


  public final void setReportedDt_elem( xsd.iso.req.anonymous.elements.ClaimsReported_ReportedDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportedDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReportNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportNumber" );
  }


  public final void setReportNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsReported_ReportNumber getReportNumber_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsReported_ReportNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportNumber_elem" );
  }


  public final void setReportNumber_elem( xsd.iso.req.anonymous.elements.ClaimsReported_ReportNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportNumber_elem", value );
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
  public final gw.xml.XmlElement getReportedByRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportedByRef" );
  }


  public final void setReportedByRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportedByRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getReportedToRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportedToRef" );
  }


  public final void setReportedToRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportedToRef", value );
  }
}