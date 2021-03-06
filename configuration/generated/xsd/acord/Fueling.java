/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Fueling extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Fueling", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SelfServInd = new javax.xml.namespace.QName( "", "SelfServInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredFuelsInd = new javax.xml.namespace.QName( "", "InsuredFuelsInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FuelTruckInd = new javax.xml.namespace.QName( "", "FuelTruckInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GasPumpInd = new javax.xml.namespace.QName( "", "GasPumpInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FuelingOnPremInd = new javax.xml.namespace.QName( "", "FuelingOnPremInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AVGasSalesInd = new javax.xml.namespace.QName( "", "AVGasSalesInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_JetFuelSalesInd = new javax.xml.namespace.QName( "", "JetFuelSalesInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AutoFuelSalesInd = new javax.xml.namespace.QName( "", "AutoFuelSalesInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FuelingDoneDesc = new javax.xml.namespace.QName( "", "FuelingDoneDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumGallonsAirline = new javax.xml.namespace.QName( "", "NumGallonsAirline", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumGallonsGenAviation = new javax.xml.namespace.QName( "", "NumGallonsGenAviation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumGallonsMilitary = new javax.xml.namespace.QName( "", "NumGallonsMilitary", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumGallonsUnderground = new javax.xml.namespace.QName( "", "NumGallonsUnderground", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumGallonsAboveGround = new javax.xml.namespace.QName( "", "NumGallonsAboveGround", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubLocationRef = new javax.xml.namespace.QName( "", "SubLocationRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.Fueling" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Fueling_Type" );
    }
  };

  public Fueling() {
    super( 1585142392, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.Fueling_Type() );
  }

  public Fueling( xsd.acord.types.complex.Fueling_Type typeInstance ) {
    super( 1585142392, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Fueling( gw.internal.xml.XmlElementState state ) {
    super( 1585142392, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.Fueling> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.Fueling_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.Fueling_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.Fueling_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.Fueling parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.Fueling.class );
  }

  public static xsd.acord.Fueling parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.Fueling.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSelfServInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SelfServInd" );
  }


  public final void setSelfServInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SelfServInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SelfServInd getSelfServInd_elem() {
    return (xsd.acord.SelfServInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SelfServInd_elem" );
  }


  public final void setSelfServInd_elem( xsd.acord.SelfServInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SelfServInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getInsuredFuelsInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuredFuelsInd" );
  }


  public final void setInsuredFuelsInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuredFuelsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsuredFuelsInd getInsuredFuelsInd_elem() {
    return (xsd.acord.InsuredFuelsInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuredFuelsInd_elem" );
  }


  public final void setInsuredFuelsInd_elem( xsd.acord.InsuredFuelsInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuredFuelsInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFuelTruckInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FuelTruckInd" );
  }


  public final void setFuelTruckInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FuelTruckInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FuelTruckInd getFuelTruckInd_elem() {
    return (xsd.acord.FuelTruckInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FuelTruckInd_elem" );
  }


  public final void setFuelTruckInd_elem( xsd.acord.FuelTruckInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FuelTruckInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getGasPumpInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GasPumpInd" );
  }


  public final void setGasPumpInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GasPumpInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GasPumpInd getGasPumpInd_elem() {
    return (xsd.acord.GasPumpInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GasPumpInd_elem" );
  }


  public final void setGasPumpInd_elem( xsd.acord.GasPumpInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GasPumpInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFuelingOnPremInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FuelingOnPremInd" );
  }


  public final void setFuelingOnPremInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FuelingOnPremInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FuelingOnPremInd getFuelingOnPremInd_elem() {
    return (xsd.acord.FuelingOnPremInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FuelingOnPremInd_elem" );
  }


  public final void setFuelingOnPremInd_elem( xsd.acord.FuelingOnPremInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FuelingOnPremInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAVGasSalesInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AVGasSalesInd" );
  }


  public final void setAVGasSalesInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AVGasSalesInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AVGasSalesInd getAVGasSalesInd_elem() {
    return (xsd.acord.AVGasSalesInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AVGasSalesInd_elem" );
  }


  public final void setAVGasSalesInd_elem( xsd.acord.AVGasSalesInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AVGasSalesInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getJetFuelSalesInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_JetFuelSalesInd" );
  }


  public final void setJetFuelSalesInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_JetFuelSalesInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.JetFuelSalesInd getJetFuelSalesInd_elem() {
    return (xsd.acord.JetFuelSalesInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_JetFuelSalesInd_elem" );
  }


  public final void setJetFuelSalesInd_elem( xsd.acord.JetFuelSalesInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_JetFuelSalesInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAutoFuelSalesInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AutoFuelSalesInd" );
  }


  public final void setAutoFuelSalesInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AutoFuelSalesInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AutoFuelSalesInd getAutoFuelSalesInd_elem() {
    return (xsd.acord.AutoFuelSalesInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AutoFuelSalesInd_elem" );
  }


  public final void setAutoFuelSalesInd_elem( xsd.acord.AutoFuelSalesInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AutoFuelSalesInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFuelingDoneDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FuelingDoneDesc" );
  }


  public final void setFuelingDoneDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FuelingDoneDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FuelingDoneDesc getFuelingDoneDesc_elem() {
    return (xsd.acord.FuelingDoneDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FuelingDoneDesc_elem" );
  }


  public final void setFuelingDoneDesc_elem( xsd.acord.FuelingDoneDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FuelingDoneDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGallonsAirline() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGallonsAirline" );
  }


  public final void setNumGallonsAirline( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGallonsAirline", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGallonsAirline getNumGallonsAirline_elem() {
    return (xsd.acord.NumGallonsAirline) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGallonsAirline_elem" );
  }


  public final void setNumGallonsAirline_elem( xsd.acord.NumGallonsAirline value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGallonsAirline_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGallonsGenAviation() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGallonsGenAviation" );
  }


  public final void setNumGallonsGenAviation( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGallonsGenAviation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGallonsGenAviation getNumGallonsGenAviation_elem() {
    return (xsd.acord.NumGallonsGenAviation) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGallonsGenAviation_elem" );
  }


  public final void setNumGallonsGenAviation_elem( xsd.acord.NumGallonsGenAviation value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGallonsGenAviation_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGallonsMilitary() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGallonsMilitary" );
  }


  public final void setNumGallonsMilitary( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGallonsMilitary", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGallonsMilitary getNumGallonsMilitary_elem() {
    return (xsd.acord.NumGallonsMilitary) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGallonsMilitary_elem" );
  }


  public final void setNumGallonsMilitary_elem( xsd.acord.NumGallonsMilitary value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGallonsMilitary_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGallonsUnderground() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGallonsUnderground" );
  }


  public final void setNumGallonsUnderground( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGallonsUnderground", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGallonsUnderground getNumGallonsUnderground_elem() {
    return (xsd.acord.NumGallonsUnderground) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGallonsUnderground_elem" );
  }


  public final void setNumGallonsUnderground_elem( xsd.acord.NumGallonsUnderground value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGallonsUnderground_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGallonsAboveGround() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGallonsAboveGround" );
  }


  public final void setNumGallonsAboveGround( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGallonsAboveGround", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGallonsAboveGround getNumGallonsAboveGround_elem() {
    return (xsd.acord.NumGallonsAboveGround) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGallonsAboveGround_elem" );
  }


  public final void setNumGallonsAboveGround_elem( xsd.acord.NumGallonsAboveGround value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGallonsAboveGround_elem", value );
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
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSubLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubLocationRef" );
  }


  public final void setSubLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubLocationRef", value );
  }
}
