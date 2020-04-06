/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class OutsideCountryInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "OutsideCountryInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeDrivingOutsideCountry = new javax.xml.namespace.QName( "", "LengthTimeDrivingOutsideCountry", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CountryCd = new javax.xml.namespace.QName( "", "CountryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Country = new javax.xml.namespace.QName( "", "Country", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.OutsideCountryInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.OutsideCountryInfo_Type" );
    }
  };

  public OutsideCountryInfo() {
    super( -1499769101, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.OutsideCountryInfo_Type() );
  }

  public OutsideCountryInfo( xsd.acord.types.complex.OutsideCountryInfo_Type typeInstance ) {
    super( -1499769101, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private OutsideCountryInfo( gw.internal.xml.XmlElementState state ) {
    super( -1499769101, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.OutsideCountryInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.OutsideCountryInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.OutsideCountryInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.OutsideCountryInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.OutsideCountryInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.OutsideCountryInfo.class );
  }

  public static xsd.acord.OutsideCountryInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.OutsideCountryInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LengthTimeDrivingOutsideCountry getLengthTimeDrivingOutsideCountry() {
    return (xsd.acord.LengthTimeDrivingOutsideCountry) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LengthTimeDrivingOutsideCountry" );
  }


  public final void setLengthTimeDrivingOutsideCountry( xsd.acord.LengthTimeDrivingOutsideCountry value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LengthTimeDrivingOutsideCountry", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCountryCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CountryCd" );
  }


  public final void setCountryCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CountryCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CountryCd getCountryCd_elem() {
    return (xsd.acord.CountryCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CountryCd_elem" );
  }


  public final void setCountryCd_elem( xsd.acord.CountryCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CountryCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCountry() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Country" );
  }


  public final void setCountry( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Country", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Country getCountry_elem() {
    return (xsd.acord.Country) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Country_elem" );
  }


  public final void setCountry_elem( xsd.acord.Country value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Country_elem", value );
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