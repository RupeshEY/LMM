/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class MiscParty extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GeneralPartyInfo = new javax.xml.namespace.QName( "", "GeneralPartyInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_SIUInfo = new javax.xml.namespace.QName( "", "com.iso_SIUInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_AddInfo = new javax.xml.namespace.QName( "", "com.iso_AddInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscPartyInfo = new javax.xml.namespace.QName( "", "MiscPartyInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.MiscParty" );
    }
  };

  public MiscParty() {
    super( -84312586, TYPE.get() );
  }

  private MiscParty( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -84312586, state );
  }

  protected MiscParty( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected MiscParty( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.MiscParty> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.MiscParty get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.ItemIdInfo getItemIdInfo() {
    return (xsd.iso.resp.ItemIdInfo) TYPE.get().getPropertyValue( this, "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.iso.resp.ItemIdInfo value ) {
    TYPE.get().setPropertyValue( this, "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.GeneralPartyInfo getGeneralPartyInfo() {
    return (xsd.iso.resp.GeneralPartyInfo) TYPE.get().getPropertyValue( this, "_GeneralPartyInfo" );
  }


  public final void setGeneralPartyInfo( xsd.iso.resp.GeneralPartyInfo value ) {
    TYPE.get().setPropertyValue( this, "_GeneralPartyInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.MiscParty_ComIso_SIUInfo getComIso_SIUInfo() {
    return (xsd.iso.resp.anonymous.elements.MiscParty_ComIso_SIUInfo) TYPE.get().getPropertyValue( this, "_ComIso_SIUInfo" );
  }


  public final void setComIso_SIUInfo( xsd.iso.resp.anonymous.elements.MiscParty_ComIso_SIUInfo value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_SIUInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.MiscParty_ComIso_AddInfo getComIso_AddInfo() {
    return (xsd.iso.resp.anonymous.elements.MiscParty_ComIso_AddInfo) TYPE.get().getPropertyValue( this, "_ComIso_AddInfo" );
  }


  public final void setComIso_AddInfo( xsd.iso.resp.anonymous.elements.MiscParty_ComIso_AddInfo value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_AddInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.MiscPartyInfo> getMiscPartyInfo() {
    return (java.util.List<xsd.iso.resp.MiscPartyInfo>) TYPE.get().getPropertyValue( this, "_MiscPartyInfo" );
  }


  public final void setMiscPartyInfo( java.util.List<xsd.iso.resp.MiscPartyInfo> value ) {
    TYPE.get().setPropertyValue( this, "_MiscPartyInfo", value );
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
