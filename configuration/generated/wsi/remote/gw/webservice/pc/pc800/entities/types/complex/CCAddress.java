/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.entities.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CCAddress extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCAddress", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ccintegration", "tns" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressBookUID = new javax.xml.namespace.QName( "", "AddressBookUID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressLine1 = new javax.xml.namespace.QName( "", "AddressLine1", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressLine1Kanji = new javax.xml.namespace.QName( "", "AddressLine1Kanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressLine2 = new javax.xml.namespace.QName( "", "AddressLine2", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressLine2Kanji = new javax.xml.namespace.QName( "", "AddressLine2Kanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressLine3 = new javax.xml.namespace.QName( "", "AddressLine3", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressType = new javax.xml.namespace.QName( "", "AddressType", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_City = new javax.xml.namespace.QName( "", "City", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CityKanji = new javax.xml.namespace.QName( "", "CityKanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Country = new javax.xml.namespace.QName( "", "Country", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_County = new javax.xml.namespace.QName( "", "County", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Description = new javax.xml.namespace.QName( "", "Description", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_HTMID = new javax.xml.namespace.QName( "", "HTMID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PostalCode = new javax.xml.namespace.QName( "", "PostalCode", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CEDEX = new javax.xml.namespace.QName( "", "CEDEX", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CEDEXBureau = new javax.xml.namespace.QName( "", "CEDEXBureau", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_State = new javax.xml.namespace.QName( "", "State", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ValidUntil = new javax.xml.namespace.QName( "", "ValidUntil", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ID = new javax.xml.namespace.QName( "", "ID", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCAddress" );
    }
  };

  public CCAddress() {
    super( 1663661794, TYPE.get() );
  }

  private CCAddress( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1663661794, state );
  }

  protected CCAddress( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CCAddress( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCAddress> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCAddress get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressBookUID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AddressBookUID" );
  }


  public final void setAddressBookUID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AddressBookUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressLine1() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AddressLine1" );
  }


  public final void setAddressLine1( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AddressLine1", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressLine1Kanji() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AddressLine1Kanji" );
  }


  public final void setAddressLine1Kanji( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AddressLine1Kanji", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressLine2() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AddressLine2" );
  }


  public final void setAddressLine2( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AddressLine2", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressLine2Kanji() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AddressLine2Kanji" );
  }


  public final void setAddressLine2Kanji( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AddressLine2Kanji", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressLine3() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AddressLine3" );
  }


  public final void setAddressLine3( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AddressLine3", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AddressType" );
  }


  public final void setAddressType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AddressType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCity() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_City" );
  }


  public final void setCity( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_City", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCityKanji() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CityKanji" );
  }


  public final void setCityKanji( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CityKanji", value );
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
  public final java.lang.String getCounty() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_County" );
  }


  public final void setCounty( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_County", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getHTMID() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_HTMID" );
  }


  public final void setHTMID( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_HTMID", value );
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
  public final java.lang.Boolean getCEDEX() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_CEDEX" );
  }


  public final void setCEDEX( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_CEDEX", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCEDEXBureau() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CEDEXBureau" );
  }


  public final void setCEDEXBureau( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CEDEXBureau", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getState() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_State" );
  }


  public final void setState( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_State", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getValidUntil() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_ValidUntil" );
  }


  public final void setValidUntil( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_ValidUntil", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ID" );
  }


  public final void setID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ID", value );
  }

}