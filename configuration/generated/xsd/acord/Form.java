/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Form extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Form", "" );
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
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.Form" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Form_Type" );
    }
  };

  public Form() {
    super( -200204232, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.Form_Type() );
  }

  public Form( xsd.acord.types.complex.Form_Type typeInstance ) {
    super( -200204232, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Form( gw.internal.xml.XmlElementState state ) {
    super( -200204232, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.Form> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.Form_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.Form_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.Form_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.Form parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.Form.class );
  }

  public static xsd.acord.Form parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.Form.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormNumber" );
  }


  public final void setFormNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormNumber getFormNumber_elem() {
    return (xsd.acord.FormNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormNumber_elem" );
  }


  public final void setFormNumber_elem( xsd.acord.FormNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormName" );
  }


  public final void setFormName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormName getFormName_elem() {
    return (xsd.acord.FormName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormName_elem" );
  }


  public final void setFormName_elem( xsd.acord.FormName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCopyrightOwnerCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CopyrightOwnerCd" );
  }


  public final void setCopyrightOwnerCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CopyrightOwnerCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CopyrightOwnerCd getCopyrightOwnerCd_elem() {
    return (xsd.acord.CopyrightOwnerCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CopyrightOwnerCd_elem" );
  }


  public final void setCopyrightOwnerCd_elem( xsd.acord.CopyrightOwnerCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CopyrightOwnerCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.CopyrightOwner getCopyrightOwnerNameCd() {
    return (xsd.acord.enums.CopyrightOwner) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CopyrightOwnerNameCd" );
  }


  public final void setCopyrightOwnerNameCd( xsd.acord.enums.CopyrightOwner value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CopyrightOwnerNameCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CopyrightOwnerNameCd getCopyrightOwnerNameCd_elem() {
    return (xsd.acord.CopyrightOwnerNameCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CopyrightOwnerNameCd_elem" );
  }


  public final void setCopyrightOwnerNameCd_elem( xsd.acord.CopyrightOwnerNameCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CopyrightOwnerNameCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormDesc" );
  }


  public final void setFormDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormDesc getFormDesc_elem() {
    return (xsd.acord.FormDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormDesc_elem" );
  }


  public final void setFormDesc_elem( xsd.acord.FormDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEditionDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EditionDt" );
  }


  public final void setEditionDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EditionDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EditionDt getEditionDt_elem() {
    return (xsd.acord.EditionDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EditionDt_elem" );
  }


  public final void setEditionDt_elem( xsd.acord.EditionDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EditionDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormDataArea() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormDataArea" );
  }


  public final void setFormDataArea( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormDataArea", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormDataArea getFormDataArea_elem() {
    return (xsd.acord.FormDataArea) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormDataArea_elem" );
  }


  public final void setFormDataArea_elem( xsd.acord.FormDataArea value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormDataArea_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getIterationNumber() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IterationNumber" );
  }


  public final void setIterationNumber( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IterationNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IterationNumber getIterationNumber_elem() {
    return (xsd.acord.IterationNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IterationNumber_elem" );
  }


  public final void setIterationNumber_elem( xsd.acord.IterationNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IterationNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormSequencingNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormSequencingNumber" );
  }


  public final void setFormSequencingNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormSequencingNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormSequencingNumber getFormSequencingNumber_elem() {
    return (xsd.acord.FormSequencingNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormSequencingNumber_elem" );
  }


  public final void setFormSequencingNumber_elem( xsd.acord.FormSequencingNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormSequencingNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBondFormOwner() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BondFormOwner" );
  }


  public final void setBondFormOwner( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BondFormOwner", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondFormOwner getBondFormOwner_elem() {
    return (xsd.acord.BondFormOwner) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BondFormOwner_elem" );
  }


  public final void setBondFormOwner_elem( xsd.acord.BondFormOwner value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BondFormOwner_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBondFormNumberOwner() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BondFormNumberOwner" );
  }


  public final void setBondFormNumberOwner( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BondFormNumberOwner", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondFormNumberOwner getBondFormNumberOwner_elem() {
    return (xsd.acord.BondFormNumberOwner) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BondFormNumberOwner_elem" );
  }


  public final void setBondFormNumberOwner_elem( xsd.acord.BondFormNumberOwner value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BondFormNumberOwner_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getWebsiteURL() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WebsiteURL" );
  }


  public final void setWebsiteURL( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WebsiteURL", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.WebsiteURL> getWebsiteURL_elem() {
    return (java.util.List<xsd.acord.WebsiteURL>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WebsiteURL_elem" );
  }


  public final void setWebsiteURL_elem( java.util.List<xsd.acord.WebsiteURL> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WebsiteURL_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormTextContent() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormTextContent" );
  }


  public final void setFormTextContent( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormTextContent", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormTextContent getFormTextContent_elem() {
    return (xsd.acord.FormTextContent) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormTextContent_elem" );
  }


  public final void setFormTextContent_elem( xsd.acord.FormTextContent value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormTextContent_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getAggregateRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AggregateRef" );
  }


  public final void setAggregateRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AggregateRef", value );
  }
}
