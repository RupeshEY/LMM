/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimsParty extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GeneralPartyInfo = new javax.xml.namespace.QName( "", "GeneralPartyInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersonInfo = new javax.xml.namespace.QName( "", "PersonInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsPartyInfo = new javax.xml.namespace.QName( "", "ClaimsPartyInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsDriverInfo = new javax.xml.namespace.QName( "", "ClaimsDriverInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsInjuredInfo = new javax.xml.namespace.QName( "", "ClaimsInjuredInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartyInvestigationInfo = new javax.xml.namespace.QName( "", "PartyInvestigationInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_PartyScoringInfo = new javax.xml.namespace.QName( "", "com.iso_PartyScoringInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_ClaimsPartyVehInfo = new javax.xml.namespace.QName( "", "com.iso_ClaimsPartyVehInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_ClaimDirectorRules = new javax.xml.namespace.QName( "", "com.iso_ClaimDirectorRules", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_AppendDS = new javax.xml.namespace.QName( "", "com.iso_AppendDS", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_CSLNInd = new javax.xml.namespace.QName( "", "com.iso_CSLNInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AuthorizedRepRef = new javax.xml.namespace.QName( "", "AuthorizedRepRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ClaimsParty" );
    }
  };

  public ClaimsParty() {
    super( -1080246659, TYPE.get() );
  }

  private ClaimsParty( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1080246659, state );
  }

  protected ClaimsParty( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimsParty( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.ClaimsParty> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.ClaimsParty get$TypeInstance() {
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
  public final xsd.iso.req.PersonInfo getPersonInfo() {
    return (xsd.iso.req.PersonInfo) TYPE.get().getPropertyValue( this, "_PersonInfo" );
  }


  public final void setPersonInfo( xsd.iso.req.PersonInfo value ) {
    TYPE.get().setPropertyValue( this, "_PersonInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ClaimsPartyInfo getClaimsPartyInfo() {
    return (xsd.iso.req.ClaimsPartyInfo) TYPE.get().getPropertyValue( this, "_ClaimsPartyInfo" );
  }


  public final void setClaimsPartyInfo( xsd.iso.req.ClaimsPartyInfo value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsPartyInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ClaimsDriverInfo getClaimsDriverInfo() {
    return (xsd.iso.req.ClaimsDriverInfo) TYPE.get().getPropertyValue( this, "_ClaimsDriverInfo" );
  }


  public final void setClaimsDriverInfo( xsd.iso.req.ClaimsDriverInfo value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsDriverInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ClaimsInjuredInfo> getClaimsInjuredInfo() {
    return (java.util.List<xsd.iso.req.ClaimsInjuredInfo>) TYPE.get().getPropertyValue( this, "_ClaimsInjuredInfo" );
  }


  public final void setClaimsInjuredInfo( java.util.List<xsd.iso.req.ClaimsInjuredInfo> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsInjuredInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.PartyInvestigationInfo getPartyInvestigationInfo() {
    return (xsd.iso.req.PartyInvestigationInfo) TYPE.get().getPropertyValue( this, "_PartyInvestigationInfo" );
  }


  public final void setPartyInvestigationInfo( xsd.iso.req.PartyInvestigationInfo value ) {
    TYPE.get().setPropertyValue( this, "_PartyInvestigationInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ComIso_PartyScoringInfo getComIso_PartyScoringInfo() {
    return (xsd.iso.req.ComIso_PartyScoringInfo) TYPE.get().getPropertyValue( this, "_ComIso_PartyScoringInfo" );
  }


  public final void setComIso_PartyScoringInfo( xsd.iso.req.ComIso_PartyScoringInfo value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_PartyScoringInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsParty_ComIso_ClaimsPartyVehInfo getComIso_ClaimsPartyVehInfo() {
    return (xsd.iso.req.anonymous.elements.ClaimsParty_ComIso_ClaimsPartyVehInfo) TYPE.get().getPropertyValue( this, "_ComIso_ClaimsPartyVehInfo" );
  }


  public final void setComIso_ClaimsPartyVehInfo( xsd.iso.req.anonymous.elements.ClaimsParty_ComIso_ClaimsPartyVehInfo value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_ClaimsPartyVehInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ComIso_ClaimDirectorRules> getComIso_ClaimDirectorRules() {
    return (java.util.List<xsd.iso.req.ComIso_ClaimDirectorRules>) TYPE.get().getPropertyValue( this, "_ComIso_ClaimDirectorRules" );
  }


  public final void setComIso_ClaimDirectorRules( java.util.List<xsd.iso.req.ComIso_ClaimDirectorRules> value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_ClaimDirectorRules", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ComIso_AppendDS> getComIso_AppendDS() {
    return (java.util.List<xsd.iso.req.ComIso_AppendDS>) TYPE.get().getPropertyValue( this, "_ComIso_AppendDS" );
  }


  public final void setComIso_AppendDS( java.util.List<xsd.iso.req.ComIso_AppendDS> value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_AppendDS", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsParty_ComIso_CSLNInd getComIso_CSLNInd() {
    return (xsd.iso.req.anonymous.elements.ClaimsParty_ComIso_CSLNInd) TYPE.get().getPropertyValue( this, "_ComIso_CSLNInd" );
  }


  public final void setComIso_CSLNInd( xsd.iso.req.anonymous.elements.ClaimsParty_ComIso_CSLNInd value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_CSLNInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getAuthorizedRepRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_AuthorizedRepRef" );
  }


  public final void setAuthorizedRepRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_AuthorizedRepRef", value );
  }

}