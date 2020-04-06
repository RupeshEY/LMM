/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

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
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.InsuredOrPrincipal" );
    }
  };

  public InsuredOrPrincipal() {
    super( 593823091, TYPE.get() );
  }

  private InsuredOrPrincipal( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 593823091, state );
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
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.InsuredOrPrincipal> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.InsuredOrPrincipal get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ItemIdInfo getItemIdInfo() {
    return (xsd.iso.req.ItemIdInfo) TYPE.get().getPropertyValue( this, "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.iso.req.ItemIdInfo value ) {
    TYPE.get().setPropertyValue( this, "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.GeneralPartyInfo getGeneralPartyInfo() {
    return (xsd.iso.req.GeneralPartyInfo) TYPE.get().getPropertyValue( this, "_GeneralPartyInfo" );
  }


  public final void setGeneralPartyInfo( xsd.iso.req.GeneralPartyInfo value ) {
    TYPE.get().setPropertyValue( this, "_GeneralPartyInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.InsuredOrPrincipalInfo getInsuredOrPrincipalInfo() {
    return (xsd.iso.req.InsuredOrPrincipalInfo) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipalInfo" );
  }


  public final void setInsuredOrPrincipalInfo( xsd.iso.req.InsuredOrPrincipalInfo value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipalInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.InsuredOrPrincipal_LengthTimeKnownByAgentBroker getLengthTimeKnownByAgentBroker() {
    return (xsd.iso.req.anonymous.elements.InsuredOrPrincipal_LengthTimeKnownByAgentBroker) TYPE.get().getPropertyValue( this, "_LengthTimeKnownByAgentBroker" );
  }


  public final void setLengthTimeKnownByAgentBroker( xsd.iso.req.anonymous.elements.InsuredOrPrincipal_LengthTimeKnownByAgentBroker value ) {
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