/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

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
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.Form" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.Form" );
    }
  };

  public Form() {
    super( -1351320446, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.Form() );
  }

  public Form( xsd.iso.req.anonymous.types.complex.Form typeInstance ) {
    super( -1351320446, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Form( gw.internal.xml.XmlElementState state ) {
    super( -1351320446, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.Form> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.Form get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.Form.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.Form typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.Form parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.Form.class );
  }

  public static xsd.iso.req.Form parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.Form.class );
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
  public final xsd.iso.req.anonymous.elements.Form_FormNumber getFormNumber_elem() {
    return (xsd.iso.req.anonymous.elements.Form_FormNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormNumber_elem" );
  }


  public final void setFormNumber_elem( xsd.iso.req.anonymous.elements.Form_FormNumber value ) {
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
  public final xsd.iso.req.anonymous.elements.Form_FormName getFormName_elem() {
    return (xsd.iso.req.anonymous.elements.Form_FormName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormName_elem" );
  }


  public final void setFormName_elem( xsd.iso.req.anonymous.elements.Form_FormName value ) {
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
  public final xsd.iso.req.anonymous.elements.Form_CopyrightOwnerCd getCopyrightOwnerCd_elem() {
    return (xsd.iso.req.anonymous.elements.Form_CopyrightOwnerCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CopyrightOwnerCd_elem" );
  }


  public final void setCopyrightOwnerCd_elem( xsd.iso.req.anonymous.elements.Form_CopyrightOwnerCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CopyrightOwnerCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCopyrightOwnerNameCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CopyrightOwnerNameCd" );
  }


  public final void setCopyrightOwnerNameCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CopyrightOwnerNameCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.Form_CopyrightOwnerNameCd getCopyrightOwnerNameCd_elem() {
    return (xsd.iso.req.anonymous.elements.Form_CopyrightOwnerNameCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CopyrightOwnerNameCd_elem" );
  }


  public final void setCopyrightOwnerNameCd_elem( xsd.iso.req.anonymous.elements.Form_CopyrightOwnerNameCd value ) {
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
  public final xsd.iso.req.anonymous.elements.Form_FormDesc getFormDesc_elem() {
    return (xsd.iso.req.anonymous.elements.Form_FormDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormDesc_elem" );
  }


  public final void setFormDesc_elem( xsd.iso.req.anonymous.elements.Form_FormDesc value ) {
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
  public final xsd.iso.req.anonymous.elements.Form_EditionDt getEditionDt_elem() {
    return (xsd.iso.req.anonymous.elements.Form_EditionDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EditionDt_elem" );
  }


  public final void setEditionDt_elem( xsd.iso.req.anonymous.elements.Form_EditionDt value ) {
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
  public final xsd.iso.req.anonymous.elements.Form_FormDataArea getFormDataArea_elem() {
    return (xsd.iso.req.anonymous.elements.Form_FormDataArea) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormDataArea_elem" );
  }


  public final void setFormDataArea_elem( xsd.iso.req.anonymous.elements.Form_FormDataArea value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormDataArea_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIterationNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IterationNumber" );
  }


  public final void setIterationNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IterationNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.Form_IterationNumber getIterationNumber_elem() {
    return (xsd.iso.req.anonymous.elements.Form_IterationNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IterationNumber_elem" );
  }


  public final void setIterationNumber_elem( xsd.iso.req.anonymous.elements.Form_IterationNumber value ) {
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
  public final xsd.iso.req.anonymous.elements.Form_FormSequencingNumber getFormSequencingNumber_elem() {
    return (xsd.iso.req.anonymous.elements.Form_FormSequencingNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormSequencingNumber_elem" );
  }


  public final void setFormSequencingNumber_elem( xsd.iso.req.anonymous.elements.Form_FormSequencingNumber value ) {
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
  public final xsd.iso.req.anonymous.elements.Form_BondFormOwner getBondFormOwner_elem() {
    return (xsd.iso.req.anonymous.elements.Form_BondFormOwner) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BondFormOwner_elem" );
  }


  public final void setBondFormOwner_elem( xsd.iso.req.anonymous.elements.Form_BondFormOwner value ) {
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
  public final xsd.iso.req.anonymous.elements.Form_BondFormNumberOwner getBondFormNumberOwner_elem() {
    return (xsd.iso.req.anonymous.elements.Form_BondFormNumberOwner) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BondFormNumberOwner_elem" );
  }


  public final void setBondFormNumberOwner_elem( xsd.iso.req.anonymous.elements.Form_BondFormNumberOwner value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BondFormNumberOwner_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}
