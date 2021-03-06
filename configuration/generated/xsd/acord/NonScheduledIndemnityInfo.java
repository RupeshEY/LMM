/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class NonScheduledIndemnityInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "NonScheduledIndemnityInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ImpairmentPct = new javax.xml.namespace.QName( "", "ImpairmentPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsFinancialSummary = new javax.xml.namespace.QName( "", "ClaimsFinancialSummary", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.NonScheduledIndemnityInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.NonScheduledIndemnityInfo_Type" );
    }
  };

  public NonScheduledIndemnityInfo() {
    super( 517456033, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.NonScheduledIndemnityInfo_Type() );
  }

  public NonScheduledIndemnityInfo( xsd.acord.types.complex.NonScheduledIndemnityInfo_Type typeInstance ) {
    super( 517456033, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private NonScheduledIndemnityInfo( gw.internal.xml.XmlElementState state ) {
    super( 517456033, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.NonScheduledIndemnityInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.NonScheduledIndemnityInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.NonScheduledIndemnityInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.NonScheduledIndemnityInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }

  public static xsd.acord.NonScheduledIndemnityInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.NonScheduledIndemnityInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getImpairmentPct() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ImpairmentPct" );
  }


  public final void setImpairmentPct( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ImpairmentPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ImpairmentPct getImpairmentPct_elem() {
    return (xsd.acord.ImpairmentPct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ImpairmentPct_elem" );
  }


  public final void setImpairmentPct_elem( xsd.acord.ImpairmentPct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ImpairmentPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClaimsFinancialSummary getClaimsFinancialSummary() {
    return (xsd.acord.ClaimsFinancialSummary) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsFinancialSummary" );
  }


  public final void setClaimsFinancialSummary( xsd.acord.ClaimsFinancialSummary value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsFinancialSummary", value );
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
