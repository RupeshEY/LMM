/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PolInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PolInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BOPPolicy = new javax.xml.namespace.QName( "", "BOPPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlAutoPolicy = new javax.xml.namespace.QName( "", "CommlAutoPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DwellFirePolicy = new javax.xml.namespace.QName( "", "DwellFirePolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ErrorsAndOmissionsPolicy = new javax.xml.namespace.QName( "", "ErrorsAndOmissionsPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HomePolicy = new javax.xml.namespace.QName( "", "HomePolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersAutoPolicy = new javax.xml.namespace.QName( "", "PersAutoPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersInlandMarinePolicy = new javax.xml.namespace.QName( "", "PersInlandMarinePolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersPkgPolicy = new javax.xml.namespace.QName( "", "PersPkgPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersUmbrellaPolicy = new javax.xml.namespace.QName( "", "PersUmbrellaPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WatercraftPolicy = new javax.xml.namespace.QName( "", "WatercraftPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompPolicy = new javax.xml.namespace.QName( "", "WorkCompPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompProofCoveragePolicy = new javax.xml.namespace.QName( "", "WorkCompProofCoveragePolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlPkgPolicy = new javax.xml.namespace.QName( "", "CommlPkgPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlPropertyPolicy = new javax.xml.namespace.QName( "", "CommlPropertyPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GeneralLiabilityPolicy = new javax.xml.namespace.QName( "", "GeneralLiabilityPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EPLIPolicy = new javax.xml.namespace.QName( "", "EPLIPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FarmPolicy = new javax.xml.namespace.QName( "", "FarmPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CrimePolicy = new javax.xml.namespace.QName( "", "CrimePolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BoilerMachineryPolicy = new javax.xml.namespace.QName( "", "BoilerMachineryPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlUmbrellaPolicy = new javax.xml.namespace.QName( "", "CommlUmbrellaPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlIMPolicy = new javax.xml.namespace.QName( "", "CommlIMPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AircraftPolicy = new javax.xml.namespace.QName( "", "AircraftPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AirportFBOPolicy = new javax.xml.namespace.QName( "", "AirportFBOPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AviationPkgPolicy = new javax.xml.namespace.QName( "", "AviationPkgPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HangarLiabilityPolicy = new javax.xml.namespace.QName( "", "HangarLiabilityPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProductsLiabilityPolicy = new javax.xml.namespace.QName( "", "ProductsLiabilityPolicy", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.PolInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PolInfo_Type" );
    }
  };

  public PolInfo() {
    super( 1703896231, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.PolInfo_Type() );
  }

  public PolInfo( xsd.acord.types.complex.PolInfo_Type typeInstance ) {
    super( 1703896231, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PolInfo( gw.internal.xml.XmlElementState state ) {
    super( 1703896231, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.PolInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.PolInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.PolInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.PolInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.PolInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.PolInfo.class );
  }

  public static xsd.acord.PolInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.PolInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BOPPolicy getBOPPolicy() {
    return (xsd.acord.BOPPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BOPPolicy" );
  }


  public final void setBOPPolicy( xsd.acord.BOPPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BOPPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommlAutoPolicy getCommlAutoPolicy() {
    return (xsd.acord.CommlAutoPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlAutoPolicy" );
  }


  public final void setCommlAutoPolicy( xsd.acord.CommlAutoPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlAutoPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DwellFirePolicy getDwellFirePolicy() {
    return (xsd.acord.DwellFirePolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DwellFirePolicy" );
  }


  public final void setDwellFirePolicy( xsd.acord.DwellFirePolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DwellFirePolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ErrorsAndOmissionsPolicy getErrorsAndOmissionsPolicy() {
    return (xsd.acord.ErrorsAndOmissionsPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ErrorsAndOmissionsPolicy" );
  }


  public final void setErrorsAndOmissionsPolicy( xsd.acord.ErrorsAndOmissionsPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ErrorsAndOmissionsPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HomePolicy getHomePolicy() {
    return (xsd.acord.HomePolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HomePolicy" );
  }


  public final void setHomePolicy( xsd.acord.HomePolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HomePolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PersAutoPolicy getPersAutoPolicy() {
    return (xsd.acord.PersAutoPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PersAutoPolicy" );
  }


  public final void setPersAutoPolicy( xsd.acord.PersAutoPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PersAutoPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PersInlandMarinePolicy getPersInlandMarinePolicy() {
    return (xsd.acord.PersInlandMarinePolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PersInlandMarinePolicy" );
  }


  public final void setPersInlandMarinePolicy( xsd.acord.PersInlandMarinePolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PersInlandMarinePolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PersPkgPolicy getPersPkgPolicy() {
    return (xsd.acord.PersPkgPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PersPkgPolicy" );
  }


  public final void setPersPkgPolicy( xsd.acord.PersPkgPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PersPkgPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PersUmbrellaPolicy getPersUmbrellaPolicy() {
    return (xsd.acord.PersUmbrellaPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PersUmbrellaPolicy" );
  }


  public final void setPersUmbrellaPolicy( xsd.acord.PersUmbrellaPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PersUmbrellaPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WatercraftPolicy getWatercraftPolicy() {
    return (xsd.acord.WatercraftPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WatercraftPolicy" );
  }


  public final void setWatercraftPolicy( xsd.acord.WatercraftPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WatercraftPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WorkCompPolicy getWorkCompPolicy() {
    return (xsd.acord.WorkCompPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WorkCompPolicy" );
  }


  public final void setWorkCompPolicy( xsd.acord.WorkCompPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WorkCompPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WorkCompProofCoveragePolicy getWorkCompProofCoveragePolicy() {
    return (xsd.acord.WorkCompProofCoveragePolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WorkCompProofCoveragePolicy" );
  }


  public final void setWorkCompProofCoveragePolicy( xsd.acord.WorkCompProofCoveragePolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WorkCompProofCoveragePolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommlPkgPolicy getCommlPkgPolicy() {
    return (xsd.acord.CommlPkgPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlPkgPolicy" );
  }


  public final void setCommlPkgPolicy( xsd.acord.CommlPkgPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlPkgPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommlPropertyPolicy getCommlPropertyPolicy() {
    return (xsd.acord.CommlPropertyPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlPropertyPolicy" );
  }


  public final void setCommlPropertyPolicy( xsd.acord.CommlPropertyPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlPropertyPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GeneralLiabilityPolicy getGeneralLiabilityPolicy() {
    return (xsd.acord.GeneralLiabilityPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GeneralLiabilityPolicy" );
  }


  public final void setGeneralLiabilityPolicy( xsd.acord.GeneralLiabilityPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GeneralLiabilityPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EPLIPolicy getEPLIPolicy() {
    return (xsd.acord.EPLIPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EPLIPolicy" );
  }


  public final void setEPLIPolicy( xsd.acord.EPLIPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EPLIPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FarmPolicy getFarmPolicy() {
    return (xsd.acord.FarmPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FarmPolicy" );
  }


  public final void setFarmPolicy( xsd.acord.FarmPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FarmPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CrimePolicy getCrimePolicy() {
    return (xsd.acord.CrimePolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CrimePolicy" );
  }


  public final void setCrimePolicy( xsd.acord.CrimePolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CrimePolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BoilerMachineryPolicy getBoilerMachineryPolicy() {
    return (xsd.acord.BoilerMachineryPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BoilerMachineryPolicy" );
  }


  public final void setBoilerMachineryPolicy( xsd.acord.BoilerMachineryPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BoilerMachineryPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommlUmbrellaPolicy getCommlUmbrellaPolicy() {
    return (xsd.acord.CommlUmbrellaPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlUmbrellaPolicy" );
  }


  public final void setCommlUmbrellaPolicy( xsd.acord.CommlUmbrellaPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlUmbrellaPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommlIMPolicy getCommlIMPolicy() {
    return (xsd.acord.CommlIMPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlIMPolicy" );
  }


  public final void setCommlIMPolicy( xsd.acord.CommlIMPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlIMPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AircraftPolicy getAircraftPolicy() {
    return (xsd.acord.AircraftPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AircraftPolicy" );
  }


  public final void setAircraftPolicy( xsd.acord.AircraftPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AircraftPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AirportFBOPolicy getAirportFBOPolicy() {
    return (xsd.acord.AirportFBOPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AirportFBOPolicy" );
  }


  public final void setAirportFBOPolicy( xsd.acord.AirportFBOPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AirportFBOPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AviationPkgPolicy getAviationPkgPolicy() {
    return (xsd.acord.AviationPkgPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AviationPkgPolicy" );
  }


  public final void setAviationPkgPolicy( xsd.acord.AviationPkgPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AviationPkgPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HangarLiabilityPolicy getHangarLiabilityPolicy() {
    return (xsd.acord.HangarLiabilityPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HangarLiabilityPolicy" );
  }


  public final void setHangarLiabilityPolicy( xsd.acord.HangarLiabilityPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HangarLiabilityPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProductsLiabilityPolicy getProductsLiabilityPolicy() {
    return (xsd.acord.ProductsLiabilityPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProductsLiabilityPolicy" );
  }


  public final void setProductsLiabilityPolicy( xsd.acord.ProductsLiabilityPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProductsLiabilityPolicy", value );
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