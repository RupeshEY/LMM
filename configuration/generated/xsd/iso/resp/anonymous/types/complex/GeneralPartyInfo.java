/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GeneralPartyInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NameInfo = new javax.xml.namespace.QName( "", "NameInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Addr = new javax.xml.namespace.QName( "", "Addr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PreferredContact = new javax.xml.namespace.QName( "", "PreferredContact", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Communications = new javax.xml.namespace.QName( "", "Communications", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.GeneralPartyInfo" );
    }
  };

  public GeneralPartyInfo() {
    super( 57753744, TYPE.get() );
  }

  private GeneralPartyInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 57753744, state );
  }

  protected GeneralPartyInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GeneralPartyInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.GeneralPartyInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.GeneralPartyInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.NameInfo> getNameInfo() {
    return (java.util.List<xsd.iso.resp.NameInfo>) TYPE.get().getPropertyValue( this, "_NameInfo" );
  }


  public final void setNameInfo( java.util.List<xsd.iso.resp.NameInfo> value ) {
    TYPE.get().setPropertyValue( this, "_NameInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.Addr> getAddr() {
    return (java.util.List<xsd.iso.resp.Addr>) TYPE.get().getPropertyValue( this, "_Addr" );
  }


  public final void setAddr( java.util.List<xsd.iso.resp.Addr> value ) {
    TYPE.get().setPropertyValue( this, "_Addr", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.anonymous.elements.GeneralPartyInfo_PreferredContact> getPreferredContact() {
    return (java.util.List<xsd.iso.resp.anonymous.elements.GeneralPartyInfo_PreferredContact>) TYPE.get().getPropertyValue( this, "_PreferredContact" );
  }


  public final void setPreferredContact( java.util.List<xsd.iso.resp.anonymous.elements.GeneralPartyInfo_PreferredContact> value ) {
    TYPE.get().setPropertyValue( this, "_PreferredContact", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.Communications getCommunications() {
    return (xsd.iso.resp.Communications) TYPE.get().getPropertyValue( this, "_Communications" );
  }


  public final void setCommunications( xsd.iso.resp.Communications value ) {
    TYPE.get().setPropertyValue( this, "_Communications", value );
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