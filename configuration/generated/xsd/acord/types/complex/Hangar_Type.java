/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Hangar_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Hangar_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumHangarsInsured = new javax.xml.namespace.QName( "", "NumHangarsInsured", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumAircraft = new javax.xml.namespace.QName( "", "NumAircraft", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MaxValueAllAircraftAmt = new javax.xml.namespace.QName( "", "MaxValueAllAircraftAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumSpacesLeased = new javax.xml.namespace.QName( "", "NumSpacesLeased", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LeasedAccessDesc = new javax.xml.namespace.QName( "", "LeasedAccessDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerName = new javax.xml.namespace.QName( "", "InsurerName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HangarDesc = new javax.xml.namespace.QName( "", "HangarDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StorageItemsDesc = new javax.xml.namespace.QName( "", "StorageItemsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperationsDesc = new javax.xml.namespace.QName( "", "OperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HangarAgreementDesc = new javax.xml.namespace.QName( "", "HangarAgreementDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AircraftOwnedServiced = new javax.xml.namespace.QName( "", "AircraftOwnedServiced", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverage = new javax.xml.namespace.QName( "", "CommlCoverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuestionAnswer = new javax.xml.namespace.QName( "", "QuestionAnswer", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubLocationRef = new javax.xml.namespace.QName( "", "SubLocationRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Hangar_Type" );
    }
  };

  public Hangar_Type() {
    super( -233111089, TYPE.get() );
  }

  private Hangar_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -233111089, state );
  }

  protected Hangar_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Hangar_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.Hangar_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.Hangar_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumHangarsInsured() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumHangarsInsured" );
  }


  public final void setNumHangarsInsured( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumHangarsInsured", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumHangarsInsured getNumHangarsInsured_elem() {
    return (xsd.acord.NumHangarsInsured) TYPE.get().getPropertyValue( this, "_NumHangarsInsured_elem" );
  }


  public final void setNumHangarsInsured_elem( xsd.acord.NumHangarsInsured value ) {
    TYPE.get().setPropertyValue( this, "_NumHangarsInsured_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumAircraft() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumAircraft" );
  }


  public final void setNumAircraft( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumAircraft", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumAircraft getNumAircraft_elem() {
    return (xsd.acord.NumAircraft) TYPE.get().getPropertyValue( this, "_NumAircraft_elem" );
  }


  public final void setNumAircraft_elem( xsd.acord.NumAircraft value ) {
    TYPE.get().setPropertyValue( this, "_NumAircraft_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MaxValueAllAircraftAmt getMaxValueAllAircraftAmt() {
    return (xsd.acord.MaxValueAllAircraftAmt) TYPE.get().getPropertyValue( this, "_MaxValueAllAircraftAmt" );
  }


  public final void setMaxValueAllAircraftAmt( xsd.acord.MaxValueAllAircraftAmt value ) {
    TYPE.get().setPropertyValue( this, "_MaxValueAllAircraftAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumSpacesLeased() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumSpacesLeased" );
  }


  public final void setNumSpacesLeased( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumSpacesLeased", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumSpacesLeased getNumSpacesLeased_elem() {
    return (xsd.acord.NumSpacesLeased) TYPE.get().getPropertyValue( this, "_NumSpacesLeased_elem" );
  }


  public final void setNumSpacesLeased_elem( xsd.acord.NumSpacesLeased value ) {
    TYPE.get().setPropertyValue( this, "_NumSpacesLeased_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLeasedAccessDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LeasedAccessDesc" );
  }


  public final void setLeasedAccessDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LeasedAccessDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LeasedAccessDesc getLeasedAccessDesc_elem() {
    return (xsd.acord.LeasedAccessDesc) TYPE.get().getPropertyValue( this, "_LeasedAccessDesc_elem" );
  }


  public final void setLeasedAccessDesc_elem( xsd.acord.LeasedAccessDesc value ) {
    TYPE.get().setPropertyValue( this, "_LeasedAccessDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInsurerName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InsurerName" );
  }


  public final void setInsurerName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InsurerName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsurerName getInsurerName_elem() {
    return (xsd.acord.InsurerName) TYPE.get().getPropertyValue( this, "_InsurerName_elem" );
  }


  public final void setInsurerName_elem( xsd.acord.InsurerName value ) {
    TYPE.get().setPropertyValue( this, "_InsurerName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getHangarDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_HangarDesc" );
  }


  public final void setHangarDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_HangarDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HangarDesc getHangarDesc_elem() {
    return (xsd.acord.HangarDesc) TYPE.get().getPropertyValue( this, "_HangarDesc_elem" );
  }


  public final void setHangarDesc_elem( xsd.acord.HangarDesc value ) {
    TYPE.get().setPropertyValue( this, "_HangarDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStorageItemsDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StorageItemsDesc" );
  }


  public final void setStorageItemsDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StorageItemsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StorageItemsDesc getStorageItemsDesc_elem() {
    return (xsd.acord.StorageItemsDesc) TYPE.get().getPropertyValue( this, "_StorageItemsDesc_elem" );
  }


  public final void setStorageItemsDesc_elem( xsd.acord.StorageItemsDesc value ) {
    TYPE.get().setPropertyValue( this, "_StorageItemsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOperationsDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OperationsDesc" );
  }


  public final void setOperationsDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OperationsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OperationsDesc getOperationsDesc_elem() {
    return (xsd.acord.OperationsDesc) TYPE.get().getPropertyValue( this, "_OperationsDesc_elem" );
  }


  public final void setOperationsDesc_elem( xsd.acord.OperationsDesc value ) {
    TYPE.get().setPropertyValue( this, "_OperationsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getHangarAgreementDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_HangarAgreementDesc" );
  }


  public final void setHangarAgreementDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_HangarAgreementDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HangarAgreementDesc getHangarAgreementDesc_elem() {
    return (xsd.acord.HangarAgreementDesc) TYPE.get().getPropertyValue( this, "_HangarAgreementDesc_elem" );
  }


  public final void setHangarAgreementDesc_elem( xsd.acord.HangarAgreementDesc value ) {
    TYPE.get().setPropertyValue( this, "_HangarAgreementDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AircraftOwnedServiced> getAircraftOwnedServiced() {
    return (java.util.List<xsd.acord.AircraftOwnedServiced>) TYPE.get().getPropertyValue( this, "_AircraftOwnedServiced" );
  }


  public final void setAircraftOwnedServiced( java.util.List<xsd.acord.AircraftOwnedServiced> value ) {
    TYPE.get().setPropertyValue( this, "_AircraftOwnedServiced", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlCoverage> getCommlCoverage() {
    return (java.util.List<xsd.acord.CommlCoverage>) TYPE.get().getPropertyValue( this, "_CommlCoverage" );
  }


  public final void setCommlCoverage( java.util.List<xsd.acord.CommlCoverage> value ) {
    TYPE.get().setPropertyValue( this, "_CommlCoverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.QuestionAnswer> getQuestionAnswer() {
    return (java.util.List<xsd.acord.QuestionAnswer>) TYPE.get().getPropertyValue( this, "_QuestionAnswer" );
  }


  public final void setQuestionAnswer( java.util.List<xsd.acord.QuestionAnswer> value ) {
    TYPE.get().setPropertyValue( this, "_QuestionAnswer", value );
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