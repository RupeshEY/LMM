/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PremiumReserve extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumReserve", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReservePercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReservePercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumReserveBasis = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumReserveBasis", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InterestPercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InterestPercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InterestBasis = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InterestBasis", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InterestDueDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InterestDueDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InterestDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InterestDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxOnPremiumReserveInterestPercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxOnPremiumReserveInterestPercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RetentionPeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "RetentionPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PremiumReserveType" );
    }
  };

  public PremiumReserve() {
    super( -470255500, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PremiumReserveType() );
  }

  public PremiumReserve( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PremiumReserveType typeInstance ) {
    super( -470255500, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PremiumReserve( gw.internal.xml.XmlElementState state ) {
    super( -470255500, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PremiumReserveType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PremiumReserveType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PremiumReserveType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserve.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReservePercentage getReservePercentage() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReservePercentage) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReservePercentage" );
  }


  public final void setReservePercentage( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReservePercentage value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReservePercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPremiumReserveBasis() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremiumReserveBasis" );
  }


  public final void setPremiumReserveBasis( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremiumReserveBasis", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserveBasis getPremiumReserveBasis_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserveBasis) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremiumReserveBasis_elem" );
  }


  public final void setPremiumReserveBasis_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumReserveBasis value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremiumReserveBasis_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestPercentage getInterestPercentage() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestPercentage) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InterestPercentage" );
  }


  public final void setInterestPercentage( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestPercentage value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InterestPercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInterestBasis() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InterestBasis" );
  }


  public final void setInterestBasis( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InterestBasis", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestBasis getInterestBasis_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestBasis) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InterestBasis_elem" );
  }


  public final void setInterestBasis_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestBasis value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InterestBasis_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInterestDueDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InterestDueDate" );
  }


  public final void setInterestDueDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InterestDueDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestDueDate getInterestDueDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestDueDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InterestDueDate_elem" );
  }


  public final void setInterestDueDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestDueDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InterestDueDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInterestDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InterestDescription" );
  }


  public final void setInterestDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InterestDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestDescription getInterestDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestDescription) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InterestDescription_elem" );
  }


  public final void setInterestDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InterestDescription value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InterestDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxOnPremiumReserveInterestPercentage getTaxOnPremiumReserveInterestPercentage() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxOnPremiumReserveInterestPercentage) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxOnPremiumReserveInterestPercentage" );
  }


  public final void setTaxOnPremiumReserveInterestPercentage( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxOnPremiumReserveInterestPercentage value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxOnPremiumReserveInterestPercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod getRetentionPeriod() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RetentionPeriod" );
  }


  public final void setRetentionPeriod( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RetentionPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.PremiumReserveType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.PremiumReserveType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.PremiumReserveType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}
