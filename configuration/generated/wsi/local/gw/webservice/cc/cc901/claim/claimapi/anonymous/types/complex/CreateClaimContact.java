/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CreateClaimContact extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimPublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "claimPublicID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContactDTO = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "contactDTO", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Role = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "role", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateClaimContact" );
    }
  };

  public CreateClaimContact() {
    super( -2087211197, TYPE.get() );
  }

  private CreateClaimContact( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -2087211197, state );
  }

  protected CreateClaimContact( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CreateClaimContact( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateClaimContact> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateClaimContact get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimPublicID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ClaimPublicID" );
  }


  public final void setClaimPublicID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ClaimPublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateClaimContact_ClaimPublicID getClaimPublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateClaimContact_ClaimPublicID) TYPE.get().getPropertyValue( this, "_ClaimPublicID_elem" );
  }


  public final void setClaimPublicID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateClaimContact_ClaimPublicID value ) {
    TYPE.get().setPropertyValue( this, "_ClaimPublicID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateClaimContact_ContactDTO getContactDTO() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateClaimContact_ContactDTO) TYPE.get().getPropertyValue( this, "_ContactDTO" );
  }


  public final void setContactDTO( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateClaimContact_ContactDTO value ) {
    TYPE.get().setPropertyValue( this, "_ContactDTO", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ContactRole getRole() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ContactRole) TYPE.get().getPropertyValue( this, "_Role" );
  }


  public final void setRole( wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ContactRole value ) {
    TYPE.get().setPropertyValue( this, "_Role", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateClaimContact_Role getRole_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateClaimContact_Role) TYPE.get().getPropertyValue( this, "_Role_elem" );
  }


  public final void setRole_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateClaimContact_Role value ) {
    TYPE.get().setPropertyValue( this, "_Role_elem", value );
  }

}