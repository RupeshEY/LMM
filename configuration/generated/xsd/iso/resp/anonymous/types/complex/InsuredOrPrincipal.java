/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class InsuredOrPrincipal extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GeneralPartyInfo = new javax.xml.namespace.QName( "", "GeneralPartyInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipalInfo = new javax.xml.namespace.QName( "", "InsuredOrPrincipalInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeKnownByAgentBroker = new javax.xml.namespace.QName( "", "LengthTimeKnownByAgentBroker", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.InsuredOrPrincipal" );
    }
  };

  public InsuredOrPrincipal() {
    super( -526936795, TYPE.get() );
  }

  private InsuredOrPrincipal( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -526936795, state );
  }

  protected InsuredOrPrincipal( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected InsuredOrPrincipal( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.InsuredOrPrincipal> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.InsuredOrPrincipal get$TypeInstance() {
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
  public final xsd.iso.resp.InsuredOrPrincipalInfo getInsuredOrPrincipalInfo() {
    return (xsd.iso.resp.InsuredOrPrincipalInfo) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipalInfo" );
  }


  public final void setInsuredOrPrincipalInfo( xsd.iso.resp.InsuredOrPrincipalInfo value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipalInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.InsuredOrPrincipal_LengthTimeKnownByAgentBroker getLengthTimeKnownByAgentBroker() {
    return (xsd.iso.resp.anonymous.elements.InsuredOrPrincipal_LengthTimeKnownByAgentBroker) TYPE.get().getPropertyValue( this, "_LengthTimeKnownByAgentBroker" );
  }


  public final void setLengthTimeKnownByAgentBroker( xsd.iso.resp.anonymous.elements.InsuredOrPrincipal_LengthTimeKnownByAgentBroker value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimeKnownByAgentBroker", value );
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
