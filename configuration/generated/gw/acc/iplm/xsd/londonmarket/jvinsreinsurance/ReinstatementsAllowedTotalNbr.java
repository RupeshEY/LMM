/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ReinstatementsAllowedTotalNbr extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReinstatementsAllowedTotalNbr", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Count = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Count", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyCountType" );
    }
  };

  public ReinstatementsAllowedTotalNbr() {
    super( 1794132503, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyCountType() );
  }

  public ReinstatementsAllowedTotalNbr( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyCountType typeInstance ) {
    super( 1794132503, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ReinstatementsAllowedTotalNbr( gw.internal.xml.XmlElementState state ) {
    super( 1794132503, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyCountType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyCountType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyCountType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinstatementsAllowedTotalNbr.class );
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Count getCount_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Count) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Count_elem" );
  }


  public final void setCount_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Count value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Count_elem", value );
  }
}