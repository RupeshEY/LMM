/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class TaxApplications extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "TaxApplications", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxApplication = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "TaxApplication", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Type = new javax.xml.namespace.QName( "", "Type", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_GeographicalOrigin = new javax.xml.namespace.QName( "", "GeographicalOrigin", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.TaxApplicationsType" );
    }
  };

  public TaxApplications() {
    super( 494187841, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.TaxApplicationsType() );
  }

  public TaxApplications( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.TaxApplicationsType typeInstance ) {
    super( 494187841, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private TaxApplications( gw.internal.xml.XmlElementState state ) {
    super( 494187841, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.TaxApplicationsType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.TaxApplicationsType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.TaxApplicationsType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplications.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplication> getTaxApplication() {
    return (java.util.List<gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplication>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxApplication" );
  }


  public final void setTaxApplication( java.util.List<gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxApplication> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxApplication", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Type" );
  }


  public final void setType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Type", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGeographicalOrigin() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GeographicalOrigin" );
  }


  public final void setGeographicalOrigin( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GeographicalOrigin", value );
  }
}
