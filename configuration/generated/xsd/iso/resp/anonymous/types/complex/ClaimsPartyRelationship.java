/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimsPartyRelationship extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsPartyRole1Cd = new javax.xml.namespace.QName( "", "ClaimsPartyRole1Cd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsPartyRole2Cd = new javax.xml.namespace.QName( "", "ClaimsPartyRole2Cd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsParty1Ref = new javax.xml.namespace.QName( "", "ClaimsParty1Ref", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsParty2Ref = new javax.xml.namespace.QName( "", "ClaimsParty2Ref", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.ClaimsPartyRelationship" );
    }
  };

  public ClaimsPartyRelationship() {
    super( -882432797, TYPE.get() );
  }

  private ClaimsPartyRelationship( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -882432797, state );
  }

  protected ClaimsPartyRelationship( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimsPartyRelationship( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.ClaimsPartyRelationship> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.ClaimsPartyRelationship get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ClaimsPartyRelationship_ClaimsPartyRole1Cd getClaimsPartyRole1Cd() {
    return (xsd.iso.resp.anonymous.elements.ClaimsPartyRelationship_ClaimsPartyRole1Cd) TYPE.get().getPropertyValue( this, "_ClaimsPartyRole1Cd" );
  }


  public final void setClaimsPartyRole1Cd( xsd.iso.resp.anonymous.elements.ClaimsPartyRelationship_ClaimsPartyRole1Cd value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsPartyRole1Cd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ClaimsPartyRelationship_ClaimsPartyRole2Cd getClaimsPartyRole2Cd() {
    return (xsd.iso.resp.anonymous.elements.ClaimsPartyRelationship_ClaimsPartyRole2Cd) TYPE.get().getPropertyValue( this, "_ClaimsPartyRole2Cd" );
  }


  public final void setClaimsPartyRole2Cd( xsd.iso.resp.anonymous.elements.ClaimsPartyRelationship_ClaimsPartyRole2Cd value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsPartyRole2Cd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getClaimsParty1Ref() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_ClaimsParty1Ref" );
  }


  public final void setClaimsParty1Ref( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsParty1Ref", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getClaimsParty2Ref() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_ClaimsParty2Ref" );
  }


  public final void setClaimsParty2Ref( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsParty2Ref", value );
  }

}