/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class InsurerShareNumberOfLines extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InsurerShareNumberOfLines", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Count = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Count", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Dec = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Dec", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AnyCountDecType" );
    }
  };

  public InsurerShareNumberOfLines() {
    super( 2128254738, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AnyCountDecType() );
  }

  public InsurerShareNumberOfLines( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AnyCountDecType typeInstance ) {
    super( 2128254738, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private InsurerShareNumberOfLines( gw.internal.xml.XmlElementState state ) {
    super( 2128254738, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AnyCountDecType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AnyCountDecType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AnyCountDecType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerShareNumberOfLines.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long getCount() {
    return (java.lang.Long) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Count" );
  }


  public final void setCount( java.lang.Long value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Count", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Count getCount_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Count) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Count_elem" );
  }


  public final void setCount_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Count value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Count_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getDec() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Dec" );
  }


  public final void setDec( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Dec", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Dec getDec_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Dec) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Dec_elem" );
  }


  public final void setDec_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Dec value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Dec_elem", value );
  }
}