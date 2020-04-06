/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Registration_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Registration_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RegistrationTypeCd = new javax.xml.namespace.QName( "", "RegistrationTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RegistrationId = new javax.xml.namespace.QName( "", "RegistrationId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RegistrationTerm = new javax.xml.namespace.QName( "", "RegistrationTerm", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProv = new javax.xml.namespace.QName( "", "StateProv", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CountryCd = new javax.xml.namespace.QName( "", "CountryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Country = new javax.xml.namespace.QName( "", "Country", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LastRegisteredYear = new javax.xml.namespace.QName( "", "LastRegisteredYear", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Registration_Type" );
    }
  };

  public Registration_Type() {
    super( -1194624967, TYPE.get() );
  }

  private Registration_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1194624967, state );
  }

  protected Registration_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Registration_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.Registration_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.Registration_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRegistrationTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RegistrationTypeCd" );
  }


  public final void setRegistrationTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RegistrationTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RegistrationTypeCd getRegistrationTypeCd_elem() {
    return (xsd.acord.RegistrationTypeCd) TYPE.get().getPropertyValue( this, "_RegistrationTypeCd_elem" );
  }


  public final void setRegistrationTypeCd_elem( xsd.acord.RegistrationTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_RegistrationTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRegistrationId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RegistrationId" );
  }


  public final void setRegistrationId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RegistrationId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RegistrationId getRegistrationId_elem() {
    return (xsd.acord.RegistrationId) TYPE.get().getPropertyValue( this, "_RegistrationId_elem" );
  }


  public final void setRegistrationId_elem( xsd.acord.RegistrationId value ) {
    TYPE.get().setPropertyValue( this, "_RegistrationId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RegistrationTerm getRegistrationTerm() {
    return (xsd.acord.RegistrationTerm) TYPE.get().getPropertyValue( this, "_RegistrationTerm" );
  }


  public final void setRegistrationTerm( xsd.acord.RegistrationTerm value ) {
    TYPE.get().setPropertyValue( this, "_RegistrationTerm", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProvCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StateProvCd" );
  }


  public final void setStateProvCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StateProvCd getStateProvCd_elem() {
    return (xsd.acord.StateProvCd) TYPE.get().getPropertyValue( this, "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( xsd.acord.StateProvCd value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProv() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StateProv" );
  }


  public final void setStateProv( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StateProv", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StateProv getStateProv_elem() {
    return (xsd.acord.StateProv) TYPE.get().getPropertyValue( this, "_StateProv_elem" );
  }


  public final void setStateProv_elem( xsd.acord.StateProv value ) {
    TYPE.get().setPropertyValue( this, "_StateProv_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCountryCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CountryCd" );
  }


  public final void setCountryCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CountryCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CountryCd getCountryCd_elem() {
    return (xsd.acord.CountryCd) TYPE.get().getPropertyValue( this, "_CountryCd_elem" );
  }


  public final void setCountryCd_elem( xsd.acord.CountryCd value ) {
    TYPE.get().setPropertyValue( this, "_CountryCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCountry() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Country" );
  }


  public final void setCountry( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Country", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Country getCountry_elem() {
    return (xsd.acord.Country) TYPE.get().getPropertyValue( this, "_Country_elem" );
  }


  public final void setCountry_elem( xsd.acord.Country value ) {
    TYPE.get().setPropertyValue( this, "_Country_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLastRegisteredYear() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LastRegisteredYear" );
  }


  public final void setLastRegisteredYear( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LastRegisteredYear", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LastRegisteredYear getLastRegisteredYear_elem() {
    return (xsd.acord.LastRegisteredYear) TYPE.get().getPropertyValue( this, "_LastRegisteredYear_elem" );
  }


  public final void setLastRegisteredYear_elem( xsd.acord.LastRegisteredYear value ) {
    TYPE.get().setPropertyValue( this, "_LastRegisteredYear_elem", value );
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