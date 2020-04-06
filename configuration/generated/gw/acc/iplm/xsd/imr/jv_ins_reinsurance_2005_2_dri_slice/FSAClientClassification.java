/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class FSAClientClassification extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "FSAClientClassification", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FSAClientClass = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "FSAClientClass", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DistanceMarketingDirectiveIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "DistanceMarketingDirectiveIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.FSAClientClassificationType" );
    }
  };

  public FSAClientClassification() {
    super( -1624919624, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.FSAClientClassificationType() );
  }

  public FSAClientClassification( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.FSAClientClassificationType typeInstance ) {
    super( -1624919624, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private FSAClientClassification( gw.internal.xml.XmlElementState state ) {
    super( -1624919624, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.FSAClientClassificationType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.FSAClientClassificationType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.FSAClientClassificationType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }

  public static gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClassification.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFSAClientClass() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FSAClientClass" );
  }


  public final void setFSAClientClass( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FSAClientClass", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClass getFSAClientClass_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClass) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FSAClientClass_elem" );
  }


  public final void setFSAClientClass_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.FSAClientClass value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FSAClientClass_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getDistanceMarketingDirectiveIndicator() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DistanceMarketingDirectiveIndicator" );
  }


  public final void setDistanceMarketingDirectiveIndicator( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DistanceMarketingDirectiveIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DistanceMarketingDirectiveIndicator getDistanceMarketingDirectiveIndicator_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DistanceMarketingDirectiveIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DistanceMarketingDirectiveIndicator_elem" );
  }


  public final void setDistanceMarketingDirectiveIndicator_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DistanceMarketingDirectiveIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DistanceMarketingDirectiveIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.FSAClientClassificationType_Extension getExtension() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.FSAClientClassificationType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.FSAClientClassificationType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}