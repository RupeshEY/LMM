/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

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
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.GeneralPartyInfo" );
    }
  };

  public GeneralPartyInfo() {
    super( -1143313314, TYPE.get() );
  }

  private GeneralPartyInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1143313314, state );
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
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.GeneralPartyInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.GeneralPartyInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.NameInfo> getNameInfo() {
    return (java.util.List<xsd.iso.req.NameInfo>) TYPE.get().getPropertyValue( this, "_NameInfo" );
  }


  public final void setNameInfo( java.util.List<xsd.iso.req.NameInfo> value ) {
    TYPE.get().setPropertyValue( this, "_NameInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.Addr> getAddr() {
    return (java.util.List<xsd.iso.req.Addr>) TYPE.get().getPropertyValue( this, "_Addr" );
  }


  public final void setAddr( java.util.List<xsd.iso.req.Addr> value ) {
    TYPE.get().setPropertyValue( this, "_Addr", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.GeneralPartyInfo_PreferredContact> getPreferredContact() {
    return (java.util.List<xsd.iso.req.anonymous.elements.GeneralPartyInfo_PreferredContact>) TYPE.get().getPropertyValue( this, "_PreferredContact" );
  }


  public final void setPreferredContact( java.util.List<xsd.iso.req.anonymous.elements.GeneralPartyInfo_PreferredContact> value ) {
    TYPE.get().setPropertyValue( this, "_PreferredContact", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Communications getCommunications() {
    return (xsd.iso.req.Communications) TYPE.get().getPropertyValue( this, "_Communications" );
  }


  public final void setCommunications( xsd.iso.req.Communications value ) {
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