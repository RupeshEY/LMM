/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PersonInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GenderCd = new javax.xml.namespace.QName( "", "GenderCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_Age = new javax.xml.namespace.QName( "", "com.iso_Age", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BirthDt = new javax.xml.namespace.QName( "", "BirthDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MaritalStatusCd = new javax.xml.namespace.QName( "", "MaritalStatusCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OccupationClassCd = new javax.xml.namespace.QName( "", "OccupationClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OccupationDesc = new javax.xml.namespace.QName( "", "OccupationDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeEmployed = new javax.xml.namespace.QName( "", "LengthTimeEmployed", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeCurrentOccupation = new javax.xml.namespace.QName( "", "LengthTimeCurrentOccupation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeWithPreviousEmployer = new javax.xml.namespace.QName( "", "LengthTimeWithPreviousEmployer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_1stDoctorDt = new javax.xml.namespace.QName( "", "com.iso_1stDoctorDt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.PersonInfo" );
    }
  };

  public PersonInfo() {
    super( 202248327, TYPE.get() );
  }

  private PersonInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 202248327, state );
  }

  protected PersonInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PersonInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.PersonInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.PersonInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGenderCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_GenderCd" );
  }


  public final void setGenderCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_GenderCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PersonInfo_GenderCd getGenderCd_elem() {
    return (xsd.iso.resp.anonymous.elements.PersonInfo_GenderCd) TYPE.get().getPropertyValue( this, "_GenderCd_elem" );
  }


  public final void setGenderCd_elem( xsd.iso.resp.anonymous.elements.PersonInfo_GenderCd value ) {
    TYPE.get().setPropertyValue( this, "_GenderCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_Age() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ComIso_Age" );
  }


  public final void setComIso_Age( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_Age", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PersonInfo_ComIso_Age getComIso_Age_elem() {
    return (xsd.iso.resp.anonymous.elements.PersonInfo_ComIso_Age) TYPE.get().getPropertyValue( this, "_ComIso_Age_elem" );
  }


  public final void setComIso_Age_elem( xsd.iso.resp.anonymous.elements.PersonInfo_ComIso_Age value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_Age_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBirthDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BirthDt" );
  }


  public final void setBirthDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BirthDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PersonInfo_BirthDt getBirthDt_elem() {
    return (xsd.iso.resp.anonymous.elements.PersonInfo_BirthDt) TYPE.get().getPropertyValue( this, "_BirthDt_elem" );
  }


  public final void setBirthDt_elem( xsd.iso.resp.anonymous.elements.PersonInfo_BirthDt value ) {
    TYPE.get().setPropertyValue( this, "_BirthDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMaritalStatusCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MaritalStatusCd" );
  }


  public final void setMaritalStatusCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MaritalStatusCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PersonInfo_MaritalStatusCd getMaritalStatusCd_elem() {
    return (xsd.iso.resp.anonymous.elements.PersonInfo_MaritalStatusCd) TYPE.get().getPropertyValue( this, "_MaritalStatusCd_elem" );
  }


  public final void setMaritalStatusCd_elem( xsd.iso.resp.anonymous.elements.PersonInfo_MaritalStatusCd value ) {
    TYPE.get().setPropertyValue( this, "_MaritalStatusCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOccupationClassCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OccupationClassCd" );
  }


  public final void setOccupationClassCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OccupationClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PersonInfo_OccupationClassCd getOccupationClassCd_elem() {
    return (xsd.iso.resp.anonymous.elements.PersonInfo_OccupationClassCd) TYPE.get().getPropertyValue( this, "_OccupationClassCd_elem" );
  }


  public final void setOccupationClassCd_elem( xsd.iso.resp.anonymous.elements.PersonInfo_OccupationClassCd value ) {
    TYPE.get().setPropertyValue( this, "_OccupationClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOccupationDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OccupationDesc" );
  }


  public final void setOccupationDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OccupationDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PersonInfo_OccupationDesc getOccupationDesc_elem() {
    return (xsd.iso.resp.anonymous.elements.PersonInfo_OccupationDesc) TYPE.get().getPropertyValue( this, "_OccupationDesc_elem" );
  }


  public final void setOccupationDesc_elem( xsd.iso.resp.anonymous.elements.PersonInfo_OccupationDesc value ) {
    TYPE.get().setPropertyValue( this, "_OccupationDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PersonInfo_LengthTimeEmployed getLengthTimeEmployed() {
    return (xsd.iso.resp.anonymous.elements.PersonInfo_LengthTimeEmployed) TYPE.get().getPropertyValue( this, "_LengthTimeEmployed" );
  }


  public final void setLengthTimeEmployed( xsd.iso.resp.anonymous.elements.PersonInfo_LengthTimeEmployed value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimeEmployed", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PersonInfo_LengthTimeCurrentOccupation getLengthTimeCurrentOccupation() {
    return (xsd.iso.resp.anonymous.elements.PersonInfo_LengthTimeCurrentOccupation) TYPE.get().getPropertyValue( this, "_LengthTimeCurrentOccupation" );
  }


  public final void setLengthTimeCurrentOccupation( xsd.iso.resp.anonymous.elements.PersonInfo_LengthTimeCurrentOccupation value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimeCurrentOccupation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PersonInfo_LengthTimeWithPreviousEmployer getLengthTimeWithPreviousEmployer() {
    return (xsd.iso.resp.anonymous.elements.PersonInfo_LengthTimeWithPreviousEmployer) TYPE.get().getPropertyValue( this, "_LengthTimeWithPreviousEmployer" );
  }


  public final void setLengthTimeWithPreviousEmployer( xsd.iso.resp.anonymous.elements.PersonInfo_LengthTimeWithPreviousEmployer value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimeWithPreviousEmployer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.MiscParty getMiscParty() {
    return (xsd.iso.resp.MiscParty) TYPE.get().getPropertyValue( this, "_MiscParty" );
  }


  public final void setMiscParty( xsd.iso.resp.MiscParty value ) {
    TYPE.get().setPropertyValue( this, "_MiscParty", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PersonInfo_ComIso_1stDoctorDt getComIso_1stDoctorDt() {
    return (xsd.iso.resp.anonymous.elements.PersonInfo_ComIso_1stDoctorDt) TYPE.get().getPropertyValue( this, "_ComIso_1stDoctorDt" );
  }


  public final void setComIso_1stDoctorDt( xsd.iso.resp.anonymous.elements.PersonInfo_ComIso_1stDoctorDt value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_1stDoctorDt", value );
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
