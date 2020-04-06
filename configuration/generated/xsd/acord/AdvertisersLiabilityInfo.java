/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class AdvertisersLiabilityInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "AdvertisersLiabilityInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdMediaCd = new javax.xml.namespace.QName( "", "AdMediaCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualCostAmt = new javax.xml.namespace.QName( "", "AnnualCostAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OtherOrPriorPolicyRef = new javax.xml.namespace.QName( "", "OtherOrPriorPolicyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.AdvertisersLiabilityInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.AdvertisersLiabilityInfo_Type" );
    }
  };

  public AdvertisersLiabilityInfo() {
    super( 1861158151, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.AdvertisersLiabilityInfo_Type() );
  }

  public AdvertisersLiabilityInfo( xsd.acord.types.complex.AdvertisersLiabilityInfo_Type typeInstance ) {
    super( 1861158151, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private AdvertisersLiabilityInfo( gw.internal.xml.XmlElementState state ) {
    super( 1861158151, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.AdvertisersLiabilityInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.AdvertisersLiabilityInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.AdvertisersLiabilityInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.AdvertisersLiabilityInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }

  public static xsd.acord.AdvertisersLiabilityInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.AdvertisersLiabilityInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.AdMedia getAdMediaCd() {
    return (xsd.acord.enums.AdMedia) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AdMediaCd" );
  }


  public final void setAdMediaCd( xsd.acord.enums.AdMedia value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AdMediaCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AdMediaCd getAdMediaCd_elem() {
    return (xsd.acord.AdMediaCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AdMediaCd_elem" );
  }


  public final void setAdMediaCd_elem( xsd.acord.AdMediaCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AdMediaCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnnualCostAmt getAnnualCostAmt() {
    return (xsd.acord.AnnualCostAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnnualCostAmt" );
  }


  public final void setAnnualCostAmt( xsd.acord.AnnualCostAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnnualCostAmt", value );
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
  public final gw.xml.XmlElement getOtherOrPriorPolicyRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherOrPriorPolicyRef" );
  }


  public final void setOtherOrPriorPolicyRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherOrPriorPolicyRef", value );
  }
}