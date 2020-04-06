/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Form_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Form_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormNumber = new javax.xml.namespace.QName( "", "FormNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormName = new javax.xml.namespace.QName( "", "FormName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CopyrightOwnerCd = new javax.xml.namespace.QName( "", "CopyrightOwnerCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CopyrightOwnerNameCd = new javax.xml.namespace.QName( "", "CopyrightOwnerNameCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormDesc = new javax.xml.namespace.QName( "", "FormDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EditionDt = new javax.xml.namespace.QName( "", "EditionDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormDataArea = new javax.xml.namespace.QName( "", "FormDataArea", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IterationNumber = new javax.xml.namespace.QName( "", "IterationNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormSequencingNumber = new javax.xml.namespace.QName( "", "FormSequencingNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondFormOwner = new javax.xml.namespace.QName( "", "BondFormOwner", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondFormNumberOwner = new javax.xml.namespace.QName( "", "BondFormNumberOwner", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WebsiteURL = new javax.xml.namespace.QName( "", "WebsiteURL", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormTextContent = new javax.xml.namespace.QName( "", "FormTextContent", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AggregateRef = new javax.xml.namespace.QName( "", "AggregateRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Form_Type" );
    }
  };

  public Form_Type() {
    super( -208778226, TYPE.get() );
  }

  private Form_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -208778226, state );
  }

  protected Form_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Form_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.Form_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.Form_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormNumber" );
  }


  public final void setFormNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormNumber getFormNumber_elem() {
    return (xsd.acord.FormNumber) TYPE.get().getPropertyValue( this, "_FormNumber_elem" );
  }


  public final void setFormNumber_elem( xsd.acord.FormNumber value ) {
    TYPE.get().setPropertyValue( this, "_FormNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormName" );
  }


  public final void setFormName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormName getFormName_elem() {
    return (xsd.acord.FormName) TYPE.get().getPropertyValue( this, "_FormName_elem" );
  }


  public final void setFormName_elem( xsd.acord.FormName value ) {
    TYPE.get().setPropertyValue( this, "_FormName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCopyrightOwnerCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CopyrightOwnerCd" );
  }


  public final void setCopyrightOwnerCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CopyrightOwnerCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CopyrightOwnerCd getCopyrightOwnerCd_elem() {
    return (xsd.acord.CopyrightOwnerCd) TYPE.get().getPropertyValue( this, "_CopyrightOwnerCd_elem" );
  }


  public final void setCopyrightOwnerCd_elem( xsd.acord.CopyrightOwnerCd value ) {
    TYPE.get().setPropertyValue( this, "_CopyrightOwnerCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.CopyrightOwner getCopyrightOwnerNameCd() {
    return (xsd.acord.enums.CopyrightOwner) TYPE.get().getPropertyValue( this, "_CopyrightOwnerNameCd" );
  }


  public final void setCopyrightOwnerNameCd( xsd.acord.enums.CopyrightOwner value ) {
    TYPE.get().setPropertyValue( this, "_CopyrightOwnerNameCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CopyrightOwnerNameCd getCopyrightOwnerNameCd_elem() {
    return (xsd.acord.CopyrightOwnerNameCd) TYPE.get().getPropertyValue( this, "_CopyrightOwnerNameCd_elem" );
  }


  public final void setCopyrightOwnerNameCd_elem( xsd.acord.CopyrightOwnerNameCd value ) {
    TYPE.get().setPropertyValue( this, "_CopyrightOwnerNameCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormDesc" );
  }


  public final void setFormDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormDesc getFormDesc_elem() {
    return (xsd.acord.FormDesc) TYPE.get().getPropertyValue( this, "_FormDesc_elem" );
  }


  public final void setFormDesc_elem( xsd.acord.FormDesc value ) {
    TYPE.get().setPropertyValue( this, "_FormDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEditionDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EditionDt" );
  }


  public final void setEditionDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EditionDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EditionDt getEditionDt_elem() {
    return (xsd.acord.EditionDt) TYPE.get().getPropertyValue( this, "_EditionDt_elem" );
  }


  public final void setEditionDt_elem( xsd.acord.EditionDt value ) {
    TYPE.get().setPropertyValue( this, "_EditionDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormDataArea() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormDataArea" );
  }


  public final void setFormDataArea( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormDataArea", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormDataArea getFormDataArea_elem() {
    return (xsd.acord.FormDataArea) TYPE.get().getPropertyValue( this, "_FormDataArea_elem" );
  }


  public final void setFormDataArea_elem( xsd.acord.FormDataArea value ) {
    TYPE.get().setPropertyValue( this, "_FormDataArea_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getIterationNumber() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_IterationNumber" );
  }


  public final void setIterationNumber( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_IterationNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IterationNumber getIterationNumber_elem() {
    return (xsd.acord.IterationNumber) TYPE.get().getPropertyValue( this, "_IterationNumber_elem" );
  }


  public final void setIterationNumber_elem( xsd.acord.IterationNumber value ) {
    TYPE.get().setPropertyValue( this, "_IterationNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormSequencingNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormSequencingNumber" );
  }


  public final void setFormSequencingNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormSequencingNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormSequencingNumber getFormSequencingNumber_elem() {
    return (xsd.acord.FormSequencingNumber) TYPE.get().getPropertyValue( this, "_FormSequencingNumber_elem" );
  }


  public final void setFormSequencingNumber_elem( xsd.acord.FormSequencingNumber value ) {
    TYPE.get().setPropertyValue( this, "_FormSequencingNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBondFormOwner() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BondFormOwner" );
  }


  public final void setBondFormOwner( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BondFormOwner", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondFormOwner getBondFormOwner_elem() {
    return (xsd.acord.BondFormOwner) TYPE.get().getPropertyValue( this, "_BondFormOwner_elem" );
  }


  public final void setBondFormOwner_elem( xsd.acord.BondFormOwner value ) {
    TYPE.get().setPropertyValue( this, "_BondFormOwner_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBondFormNumberOwner() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BondFormNumberOwner" );
  }


  public final void setBondFormNumberOwner( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BondFormNumberOwner", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondFormNumberOwner getBondFormNumberOwner_elem() {
    return (xsd.acord.BondFormNumberOwner) TYPE.get().getPropertyValue( this, "_BondFormNumberOwner_elem" );
  }


  public final void setBondFormNumberOwner_elem( xsd.acord.BondFormNumberOwner value ) {
    TYPE.get().setPropertyValue( this, "_BondFormNumberOwner_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getWebsiteURL() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_WebsiteURL" );
  }


  public final void setWebsiteURL( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_WebsiteURL", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.WebsiteURL> getWebsiteURL_elem() {
    return (java.util.List<xsd.acord.WebsiteURL>) TYPE.get().getPropertyValue( this, "_WebsiteURL_elem" );
  }


  public final void setWebsiteURL_elem( java.util.List<xsd.acord.WebsiteURL> value ) {
    TYPE.get().setPropertyValue( this, "_WebsiteURL_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormTextContent() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormTextContent" );
  }


  public final void setFormTextContent( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormTextContent", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormTextContent getFormTextContent_elem() {
    return (xsd.acord.FormTextContent) TYPE.get().getPropertyValue( this, "_FormTextContent_elem" );
  }


  public final void setFormTextContent_elem( xsd.acord.FormTextContent value ) {
    TYPE.get().setPropertyValue( this, "_FormTextContent_elem", value );
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
  public final gw.xml.XmlElement getAggregateRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_AggregateRef" );
  }


  public final void setAggregateRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_AggregateRef", value );
  }

}