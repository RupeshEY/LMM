/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class InsurerShareLimitAmount extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InsurerShareLimitAmount", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amt = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Amt", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyAmtType" );
    }
  };

  public InsurerShareLimitAmount() {
    super( -700480899, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyAmtType() );
  }

  public InsurerShareLimitAmount( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyAmtType typeInstance ) {
    super( -700480899, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private InsurerShareLimitAmount( gw.internal.xml.XmlElementState state ) {
    super( -700480899, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyAmtType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyAmtType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyAmtType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerShareLimitAmount.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getAmt() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Amt" );
  }


  public final void setAmt( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Amt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt getAmt_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Amt_elem" );
  }


  public final void setAmt_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Amt_elem", value );
  }
}