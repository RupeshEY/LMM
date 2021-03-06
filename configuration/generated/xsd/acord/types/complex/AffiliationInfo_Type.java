/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AffiliationInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "AffiliationInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommercialName = new javax.xml.namespace.QName( "", "CommercialName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LegalEntityCd = new javax.xml.namespace.QName( "", "LegalEntityCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TitleRelationshipCd = new javax.xml.namespace.QName( "", "TitleRelationshipCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.AffiliationInfo_Type" );
    }
  };

  public AffiliationInfo_Type() {
    super( -1663982718, TYPE.get() );
  }

  private AffiliationInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1663982718, state );
  }

  protected AffiliationInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AffiliationInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.AffiliationInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.AffiliationInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCommercialName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CommercialName" );
  }


  public final void setCommercialName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CommercialName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommercialName getCommercialName_elem() {
    return (xsd.acord.CommercialName) TYPE.get().getPropertyValue( this, "_CommercialName_elem" );
  }


  public final void setCommercialName_elem( xsd.acord.CommercialName value ) {
    TYPE.get().setPropertyValue( this, "_CommercialName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.LegalEntity> getLegalEntityCd() {
    return (java.util.List<xsd.acord.enums.LegalEntity>) TYPE.get().getPropertyValue( this, "_LegalEntityCd" );
  }


  public final void setLegalEntityCd( java.util.List<xsd.acord.enums.LegalEntity> value ) {
    TYPE.get().setPropertyValue( this, "_LegalEntityCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.LegalEntityCd> getLegalEntityCd_elem() {
    return (java.util.List<xsd.acord.LegalEntityCd>) TYPE.get().getPropertyValue( this, "_LegalEntityCd_elem" );
  }


  public final void setLegalEntityCd_elem( java.util.List<xsd.acord.LegalEntityCd> value ) {
    TYPE.get().setPropertyValue( this, "_LegalEntityCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.TitleRelationship getTitleRelationshipCd() {
    return (xsd.acord.enums.TitleRelationship) TYPE.get().getPropertyValue( this, "_TitleRelationshipCd" );
  }


  public final void setTitleRelationshipCd( xsd.acord.enums.TitleRelationship value ) {
    TYPE.get().setPropertyValue( this, "_TitleRelationshipCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TitleRelationshipCd getTitleRelationshipCd_elem() {
    return (xsd.acord.TitleRelationshipCd) TYPE.get().getPropertyValue( this, "_TitleRelationshipCd_elem" );
  }


  public final void setTitleRelationshipCd_elem( xsd.acord.TitleRelationshipCd value ) {
    TYPE.get().setPropertyValue( this, "_TitleRelationshipCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.MiscParty> getMiscParty() {
    return (java.util.List<xsd.acord.MiscParty>) TYPE.get().getPropertyValue( this, "_MiscParty" );
  }


  public final void setMiscParty( java.util.List<xsd.acord.MiscParty> value ) {
    TYPE.get().setPropertyValue( this, "_MiscParty", value );
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
