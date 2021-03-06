/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class NonResLicense extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "NonResLicense", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonResProducerLicenseNumber = new javax.xml.namespace.QName( "", "NonResProducerLicenseNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonResProducerLicenseExpirationDt = new javax.xml.namespace.QName( "", "NonResProducerLicenseExpirationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.NonResLicense" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.NonResLicense" );
    }
  };

  public NonResLicense() {
    super( 104398896, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.NonResLicense() );
  }

  public NonResLicense( xsd.iso.req.anonymous.types.complex.NonResLicense typeInstance ) {
    super( 104398896, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private NonResLicense( gw.internal.xml.XmlElementState state ) {
    super( 104398896, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.NonResLicense> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.NonResLicense get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.NonResLicense.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.NonResLicense typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.NonResLicense parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.NonResLicense.class );
  }

  public static xsd.iso.req.NonResLicense parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.NonResLicense.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNonResProducerLicenseNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NonResProducerLicenseNumber" );
  }


  public final void setNonResProducerLicenseNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NonResProducerLicenseNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.NonResLicense_NonResProducerLicenseNumber getNonResProducerLicenseNumber_elem() {
    return (xsd.iso.req.anonymous.elements.NonResLicense_NonResProducerLicenseNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NonResProducerLicenseNumber_elem" );
  }


  public final void setNonResProducerLicenseNumber_elem( xsd.iso.req.anonymous.elements.NonResLicense_NonResProducerLicenseNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NonResProducerLicenseNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNonResProducerLicenseExpirationDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NonResProducerLicenseExpirationDt" );
  }


  public final void setNonResProducerLicenseExpirationDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NonResProducerLicenseExpirationDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.NonResLicense_NonResProducerLicenseExpirationDt getNonResProducerLicenseExpirationDt_elem() {
    return (xsd.iso.req.anonymous.elements.NonResLicense_NonResProducerLicenseExpirationDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NonResProducerLicenseExpirationDt_elem" );
  }


  public final void setNonResProducerLicenseExpirationDt_elem( xsd.iso.req.anonymous.elements.NonResLicense_NonResProducerLicenseExpirationDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NonResProducerLicenseExpirationDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProvCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StateProvCd" );
  }


  public final void setStateProvCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.NonResLicense_StateProvCd getStateProvCd_elem() {
    return (xsd.iso.req.anonymous.elements.NonResLicense_StateProvCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( xsd.iso.req.anonymous.elements.NonResLicense_StateProvCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StateProvCd_elem", value );
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
