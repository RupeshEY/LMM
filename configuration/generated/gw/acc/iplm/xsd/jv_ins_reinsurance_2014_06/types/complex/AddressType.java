/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AddressType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AddressType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumberAndStreet = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "NumberAndStreet", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CityName = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CityName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PostalCode = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PostalCode", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Subentity = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Subentity", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubentityDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "SubentityDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Country = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Country", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CrestaZone = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CrestaZone", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WebSiteURL = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "WebSiteURL", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AddressType" );
    }
  };

  public AddressType() {
    super( 200027605, TYPE.get() );
  }

  private AddressType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 200027605, state );
  }

  protected AddressType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AddressType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AddressType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AddressType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNumberAndStreet() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NumberAndStreet" );
  }


  public final void setNumberAndStreet( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NumberAndStreet", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NumberAndStreet getNumberAndStreet_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NumberAndStreet) TYPE.get().getPropertyValue( this, "_NumberAndStreet_elem" );
  }


  public final void setNumberAndStreet_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NumberAndStreet value ) {
    TYPE.get().setPropertyValue( this, "_NumberAndStreet_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCityName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CityName" );
  }


  public final void setCityName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CityName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CityName getCityName_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CityName) TYPE.get().getPropertyValue( this, "_CityName_elem" );
  }


  public final void setCityName_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CityName value ) {
    TYPE.get().setPropertyValue( this, "_CityName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPostalCode() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PostalCode" );
  }


  public final void setPostalCode( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PostalCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PostalCode getPostalCode_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PostalCode) TYPE.get().getPropertyValue( this, "_PostalCode_elem" );
  }


  public final void setPostalCode_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PostalCode value ) {
    TYPE.get().setPropertyValue( this, "_PostalCode_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSubentity() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Subentity" );
  }


  public final void setSubentity( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Subentity", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Subentity getSubentity_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Subentity) TYPE.get().getPropertyValue( this, "_Subentity_elem" );
  }


  public final void setSubentity_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Subentity value ) {
    TYPE.get().setPropertyValue( this, "_Subentity_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSubentityDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SubentityDescription" );
  }


  public final void setSubentityDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SubentityDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SubentityDescription getSubentityDescription_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SubentityDescription) TYPE.get().getPropertyValue( this, "_SubentityDescription_elem" );
  }


  public final void setSubentityDescription_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SubentityDescription value ) {
    TYPE.get().setPropertyValue( this, "_SubentityDescription_elem", value );
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Country getCountry_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Country) TYPE.get().getPropertyValue( this, "_Country_elem" );
  }


  public final void setCountry_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Country value ) {
    TYPE.get().setPropertyValue( this, "_Country_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCrestaZone() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CrestaZone" );
  }


  public final void setCrestaZone( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CrestaZone", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CrestaZone getCrestaZone_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CrestaZone) TYPE.get().getPropertyValue( this, "_CrestaZone_elem" );
  }


  public final void setCrestaZone_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CrestaZone value ) {
    TYPE.get().setPropertyValue( this, "_CrestaZone_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getWebSiteURL() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_WebSiteURL" );
  }


  public final void setWebSiteURL( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_WebSiteURL", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.WebSiteURL getWebSiteURL_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.WebSiteURL) TYPE.get().getPropertyValue( this, "_WebSiteURL_elem" );
  }


  public final void setWebSiteURL_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.WebSiteURL value ) {
    TYPE.get().setPropertyValue( this, "_WebSiteURL_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.AddressType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.AddressType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.AddressType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}