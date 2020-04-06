/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Fueling_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Fueling_Type", "" );
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
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Fueling_Type" );
    }
  };

  public Fueling_Type() {
    super( -1407014764, TYPE.get() );
  }

  private Fueling_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1407014764, state );
  }

  protected Fueling_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Fueling_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.Fueling_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.Fueling_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSelfServInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_SelfServInd" );
  }


  public final void setSelfServInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_SelfServInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SelfServInd getSelfServInd_elem() {
    return (xsd.acord.SelfServInd) TYPE.get().getPropertyValue( this, "_SelfServInd_elem" );
  }


  public final void setSelfServInd_elem( xsd.acord.SelfServInd value ) {
    TYPE.get().setPropertyValue( this, "_SelfServInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getInsuredFuelsInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_InsuredFuelsInd" );
  }


  public final void setInsuredFuelsInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_InsuredFuelsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsuredFuelsInd getInsuredFuelsInd_elem() {
    return (xsd.acord.InsuredFuelsInd) TYPE.get().getPropertyValue( this, "_InsuredFuelsInd_elem" );
  }


  public final void setInsuredFuelsInd_elem( xsd.acord.InsuredFuelsInd value ) {
    TYPE.get().setPropertyValue( this, "_InsuredFuelsInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFuelTruckInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_FuelTruckInd" );
  }


  public final void setFuelTruckInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_FuelTruckInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FuelTruckInd getFuelTruckInd_elem() {
    return (xsd.acord.FuelTruckInd) TYPE.get().getPropertyValue( this, "_FuelTruckInd_elem" );
  }


  public final void setFuelTruckInd_elem( xsd.acord.FuelTruckInd value ) {
    TYPE.get().setPropertyValue( this, "_FuelTruckInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getGasPumpInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_GasPumpInd" );
  }


  public final void setGasPumpInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_GasPumpInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GasPumpInd getGasPumpInd_elem() {
    return (xsd.acord.GasPumpInd) TYPE.get().getPropertyValue( this, "_GasPumpInd_elem" );
  }


  public final void setGasPumpInd_elem( xsd.acord.GasPumpInd value ) {
    TYPE.get().setPropertyValue( this, "_GasPumpInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFuelingOnPremInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_FuelingOnPremInd" );
  }


  public final void setFuelingOnPremInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_FuelingOnPremInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FuelingOnPremInd getFuelingOnPremInd_elem() {
    return (xsd.acord.FuelingOnPremInd) TYPE.get().getPropertyValue( this, "_FuelingOnPremInd_elem" );
  }


  public final void setFuelingOnPremInd_elem( xsd.acord.FuelingOnPremInd value ) {
    TYPE.get().setPropertyValue( this, "_FuelingOnPremInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAVGasSalesInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_AVGasSalesInd" );
  }


  public final void setAVGasSalesInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_AVGasSalesInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AVGasSalesInd getAVGasSalesInd_elem() {
    return (xsd.acord.AVGasSalesInd) TYPE.get().getPropertyValue( this, "_AVGasSalesInd_elem" );
  }


  public final void setAVGasSalesInd_elem( xsd.acord.AVGasSalesInd value ) {
    TYPE.get().setPropertyValue( this, "_AVGasSalesInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getJetFuelSalesInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_JetFuelSalesInd" );
  }


  public final void setJetFuelSalesInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_JetFuelSalesInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.JetFuelSalesInd getJetFuelSalesInd_elem() {
    return (xsd.acord.JetFuelSalesInd) TYPE.get().getPropertyValue( this, "_JetFuelSalesInd_elem" );
  }


  public final void setJetFuelSalesInd_elem( xsd.acord.JetFuelSalesInd value ) {
    TYPE.get().setPropertyValue( this, "_JetFuelSalesInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAutoFuelSalesInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_AutoFuelSalesInd" );
  }


  public final void setAutoFuelSalesInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_AutoFuelSalesInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AutoFuelSalesInd getAutoFuelSalesInd_elem() {
    return (xsd.acord.AutoFuelSalesInd) TYPE.get().getPropertyValue( this, "_AutoFuelSalesInd_elem" );
  }


  public final void setAutoFuelSalesInd_elem( xsd.acord.AutoFuelSalesInd value ) {
    TYPE.get().setPropertyValue( this, "_AutoFuelSalesInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFuelingDoneDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FuelingDoneDesc" );
  }


  public final void setFuelingDoneDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FuelingDoneDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FuelingDoneDesc getFuelingDoneDesc_elem() {
    return (xsd.acord.FuelingDoneDesc) TYPE.get().getPropertyValue( this, "_FuelingDoneDesc_elem" );
  }


  public final void setFuelingDoneDesc_elem( xsd.acord.FuelingDoneDesc value ) {
    TYPE.get().setPropertyValue( this, "_FuelingDoneDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGallonsAirline() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumGallonsAirline" );
  }


  public final void setNumGallonsAirline( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumGallonsAirline", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGallonsAirline getNumGallonsAirline_elem() {
    return (xsd.acord.NumGallonsAirline) TYPE.get().getPropertyValue( this, "_NumGallonsAirline_elem" );
  }


  public final void setNumGallonsAirline_elem( xsd.acord.NumGallonsAirline value ) {
    TYPE.get().setPropertyValue( this, "_NumGallonsAirline_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGallonsGenAviation() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumGallonsGenAviation" );
  }


  public final void setNumGallonsGenAviation( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumGallonsGenAviation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGallonsGenAviation getNumGallonsGenAviation_elem() {
    return (xsd.acord.NumGallonsGenAviation) TYPE.get().getPropertyValue( this, "_NumGallonsGenAviation_elem" );
  }


  public final void setNumGallonsGenAviation_elem( xsd.acord.NumGallonsGenAviation value ) {
    TYPE.get().setPropertyValue( this, "_NumGallonsGenAviation_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGallonsMilitary() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumGallonsMilitary" );
  }


  public final void setNumGallonsMilitary( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumGallonsMilitary", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGallonsMilitary getNumGallonsMilitary_elem() {
    return (xsd.acord.NumGallonsMilitary) TYPE.get().getPropertyValue( this, "_NumGallonsMilitary_elem" );
  }


  public final void setNumGallonsMilitary_elem( xsd.acord.NumGallonsMilitary value ) {
    TYPE.get().setPropertyValue( this, "_NumGallonsMilitary_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGallonsUnderground() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumGallonsUnderground" );
  }


  public final void setNumGallonsUnderground( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumGallonsUnderground", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGallonsUnderground getNumGallonsUnderground_elem() {
    return (xsd.acord.NumGallonsUnderground) TYPE.get().getPropertyValue( this, "_NumGallonsUnderground_elem" );
  }


  public final void setNumGallonsUnderground_elem( xsd.acord.NumGallonsUnderground value ) {
    TYPE.get().setPropertyValue( this, "_NumGallonsUnderground_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGallonsAboveGround() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumGallonsAboveGround" );
  }


  public final void setNumGallonsAboveGround( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumGallonsAboveGround", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGallonsAboveGround getNumGallonsAboveGround_elem() {
    return (xsd.acord.NumGallonsAboveGround) TYPE.get().getPropertyValue( this, "_NumGallonsAboveGround_elem" );
  }


  public final void setNumGallonsAboveGround_elem( xsd.acord.NumGallonsAboveGround value ) {
    TYPE.get().setPropertyValue( this, "_NumGallonsAboveGround_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSubLocationRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_SubLocationRef" );
  }


  public final void setSubLocationRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_SubLocationRef", value );
  }

}