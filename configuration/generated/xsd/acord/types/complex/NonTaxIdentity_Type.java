/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class NonTaxIdentity_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "NonTaxIdentity_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonTaxIdTypeCd = new javax.xml.namespace.QName( "", "NonTaxIdTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonTaxId = new javax.xml.namespace.QName( "", "NonTaxId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrimaryNonTaxInd = new javax.xml.namespace.QName( "", "PrimaryNonTaxInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProv = new javax.xml.namespace.QName( "", "StateProv", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CountryCd = new javax.xml.namespace.QName( "", "CountryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Country = new javax.xml.namespace.QName( "", "Country", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.NonTaxIdentity_Type" );
    }
  };

  public NonTaxIdentity_Type() {
    super( 1999404054, TYPE.get() );
  }

  private NonTaxIdentity_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1999404054, state );
  }

  protected NonTaxIdentity_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected NonTaxIdentity_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.NonTaxIdentity_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.NonTaxIdentity_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.NonTaxIdType getNonTaxIdTypeCd() {
    return (xsd.acord.enums.NonTaxIdType) TYPE.get().getPropertyValue( this, "_NonTaxIdTypeCd" );
  }


  public final void setNonTaxIdTypeCd( xsd.acord.enums.NonTaxIdType value ) {
    TYPE.get().setPropertyValue( this, "_NonTaxIdTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NonTaxIdTypeCd getNonTaxIdTypeCd_elem() {
    return (xsd.acord.NonTaxIdTypeCd) TYPE.get().getPropertyValue( this, "_NonTaxIdTypeCd_elem" );
  }


  public final void setNonTaxIdTypeCd_elem( xsd.acord.NonTaxIdTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_NonTaxIdTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNonTaxId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NonTaxId" );
  }


  public final void setNonTaxId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NonTaxId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NonTaxId getNonTaxId_elem() {
    return (xsd.acord.NonTaxId) TYPE.get().getPropertyValue( this, "_NonTaxId_elem" );
  }


  public final void setNonTaxId_elem( xsd.acord.NonTaxId value ) {
    TYPE.get().setPropertyValue( this, "_NonTaxId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getPrimaryNonTaxInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_PrimaryNonTaxInd" );
  }


  public final void setPrimaryNonTaxInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_PrimaryNonTaxInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PrimaryNonTaxInd getPrimaryNonTaxInd_elem() {
    return (xsd.acord.PrimaryNonTaxInd) TYPE.get().getPropertyValue( this, "_PrimaryNonTaxInd_elem" );
  }


  public final void setPrimaryNonTaxInd_elem( xsd.acord.PrimaryNonTaxInd value ) {
    TYPE.get().setPropertyValue( this, "_PrimaryNonTaxInd_elem", value );
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
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}