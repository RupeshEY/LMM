/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ProfitCommission extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProfitCommission", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProfitCommissionPercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProfitCommissionPercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UnearnedPremiumReserveProfitCommissionPercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UnearnedPremiumReserveProfitCommissionPercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProfitCommissionBasis = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProfitCommissionBasis", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProfitCommissionCalculationType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProfitCommissionCalculationType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProfitCommissionCarryforward = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProfitCommissionCarryforward", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CalculationPeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CalculationPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FirstCalculationDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "FirstCalculationDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProvisionFrequency = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProvisionFrequency", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ProfitCommissionType" );
    }
  };

  public ProfitCommission() {
    super( 1076128926, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ProfitCommissionType() );
  }

  public ProfitCommission( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ProfitCommissionType typeInstance ) {
    super( 1076128926, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ProfitCommission( gw.internal.xml.XmlElementState state ) {
    super( 1076128926, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ProfitCommissionType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ProfitCommissionType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ProfitCommissionType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommission.class );
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionPercentage getProfitCommissionPercentage() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionPercentage) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfitCommissionPercentage" );
  }


  public final void setProfitCommissionPercentage( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionPercentage value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfitCommissionPercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.UnearnedPremiumReserveProfitCommissionPercentage getUnearnedPremiumReserveProfitCommissionPercentage() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.UnearnedPremiumReserveProfitCommissionPercentage) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UnearnedPremiumReserveProfitCommissionPercentage" );
  }


  public final void setUnearnedPremiumReserveProfitCommissionPercentage( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.UnearnedPremiumReserveProfitCommissionPercentage value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UnearnedPremiumReserveProfitCommissionPercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProfitCommissionBasis() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfitCommissionBasis" );
  }


  public final void setProfitCommissionBasis( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfitCommissionBasis", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionBasis getProfitCommissionBasis_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionBasis) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfitCommissionBasis_elem" );
  }


  public final void setProfitCommissionBasis_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionBasis value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfitCommissionBasis_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProfitCommissionCalculationType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfitCommissionCalculationType" );
  }


  public final void setProfitCommissionCalculationType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfitCommissionCalculationType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionCalculationType getProfitCommissionCalculationType_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionCalculationType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfitCommissionCalculationType_elem" );
  }


  public final void setProfitCommissionCalculationType_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionCalculationType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfitCommissionCalculationType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProfitCommissionCarryforward() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfitCommissionCarryforward" );
  }


  public final void setProfitCommissionCarryforward( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfitCommissionCarryforward", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionCarryforward getProfitCommissionCarryforward_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionCarryforward) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfitCommissionCarryforward_elem" );
  }


  public final void setProfitCommissionCarryforward_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProfitCommissionCarryforward value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfitCommissionCarryforward_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationPeriod getCalculationPeriod() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CalculationPeriod" );
  }


  public final void setCalculationPeriod( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CalculationPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFirstCalculationDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FirstCalculationDate" );
  }


  public final void setFirstCalculationDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FirstCalculationDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.FirstCalculationDate getFirstCalculationDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.FirstCalculationDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FirstCalculationDate_elem" );
  }


  public final void setFirstCalculationDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.FirstCalculationDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FirstCalculationDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProvisionFrequency() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProvisionFrequency" );
  }


  public final void setProvisionFrequency( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProvisionFrequency", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProvisionFrequency getProvisionFrequency_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProvisionFrequency) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProvisionFrequency_elem" );
  }


  public final void setProvisionFrequency_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ProvisionFrequency value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProvisionFrequency_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ProfitCommissionType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ProfitCommissionType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ProfitCommissionType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}