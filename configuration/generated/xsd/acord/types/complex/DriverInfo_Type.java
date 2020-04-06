/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class DriverInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "DriverInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersonInfo = new javax.xml.namespace.QName( "", "PersonInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DriversLicense = new javax.xml.namespace.QName( "", "DriversLicense", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_License = new javax.xml.namespace.QName( "", "License", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DrivingRecordRatingInfo = new javax.xml.namespace.QName( "", "DrivingRecordRatingInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditScoreInfo = new javax.xml.namespace.QName( "", "CreditScoreInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuestionAnswer = new javax.xml.namespace.QName( "", "QuestionAnswer", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.DriverInfo_Type" );
    }
  };

  public DriverInfo_Type() {
    super( 483775580, TYPE.get() );
  }

  private DriverInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 483775580, state );
  }

  protected DriverInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected DriverInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.DriverInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.DriverInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PersonInfo getPersonInfo() {
    return (xsd.acord.PersonInfo) TYPE.get().getPropertyValue( this, "_PersonInfo" );
  }


  public final void setPersonInfo( xsd.acord.PersonInfo value ) {
    TYPE.get().setPropertyValue( this, "_PersonInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.DriversLicense> getDriversLicense() {
    return (java.util.List<xsd.acord.DriversLicense>) TYPE.get().getPropertyValue( this, "_DriversLicense" );
  }


  public final void setDriversLicense( java.util.List<xsd.acord.DriversLicense> value ) {
    TYPE.get().setPropertyValue( this, "_DriversLicense", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.License> getLicense() {
    return (java.util.List<xsd.acord.License>) TYPE.get().getPropertyValue( this, "_License" );
  }


  public final void setLicense( java.util.List<xsd.acord.License> value ) {
    TYPE.get().setPropertyValue( this, "_License", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.DrivingRecordRatingInfo> getDrivingRecordRatingInfo() {
    return (java.util.List<xsd.acord.DrivingRecordRatingInfo>) TYPE.get().getPropertyValue( this, "_DrivingRecordRatingInfo" );
  }


  public final void setDrivingRecordRatingInfo( java.util.List<xsd.acord.DrivingRecordRatingInfo> value ) {
    TYPE.get().setPropertyValue( this, "_DrivingRecordRatingInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CreditScoreInfo getCreditScoreInfo() {
    return (xsd.acord.CreditScoreInfo) TYPE.get().getPropertyValue( this, "_CreditScoreInfo" );
  }


  public final void setCreditScoreInfo( xsd.acord.CreditScoreInfo value ) {
    TYPE.get().setPropertyValue( this, "_CreditScoreInfo", value );
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

}