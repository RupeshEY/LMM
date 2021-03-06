/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ChimneyCleaning extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ChimneyCleaning", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FrequencyCd = new javax.xml.namespace.QName( "", "FrequencyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProfessionallyCleanedInd = new javax.xml.namespace.QName( "", "ProfessionallyCleanedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LastCleanedDt = new javax.xml.namespace.QName( "", "LastCleanedDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CertifiedInd = new javax.xml.namespace.QName( "", "CertifiedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AshContainerDesc = new javax.xml.namespace.QName( "", "AshContainerDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AshStorageDesc = new javax.xml.namespace.QName( "", "AshStorageDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_InspectorRef = new javax.xml.namespace.QName( "", "InspectorRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ChimneyCleaning" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ChimneyCleaning_Type" );
    }
  };

  public ChimneyCleaning() {
    super( 1881386206, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ChimneyCleaning_Type() );
  }

  public ChimneyCleaning( xsd.acord.types.complex.ChimneyCleaning_Type typeInstance ) {
    super( 1881386206, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ChimneyCleaning( gw.internal.xml.XmlElementState state ) {
    super( 1881386206, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ChimneyCleaning> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ChimneyCleaning_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ChimneyCleaning_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ChimneyCleaning_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ChimneyCleaning parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ChimneyCleaning.class );
  }

  public static xsd.acord.ChimneyCleaning parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ChimneyCleaning.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Frequency getFrequencyCd() {
    return (xsd.acord.enums.Frequency) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FrequencyCd" );
  }


  public final void setFrequencyCd( xsd.acord.enums.Frequency value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FrequencyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FrequencyCd getFrequencyCd_elem() {
    return (xsd.acord.FrequencyCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FrequencyCd_elem" );
  }


  public final void setFrequencyCd_elem( xsd.acord.FrequencyCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FrequencyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getProfessionallyCleanedInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfessionallyCleanedInd" );
  }


  public final void setProfessionallyCleanedInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfessionallyCleanedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProfessionallyCleanedInd getProfessionallyCleanedInd_elem() {
    return (xsd.acord.ProfessionallyCleanedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfessionallyCleanedInd_elem" );
  }


  public final void setProfessionallyCleanedInd_elem( xsd.acord.ProfessionallyCleanedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfessionallyCleanedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLastCleanedDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LastCleanedDt" );
  }


  public final void setLastCleanedDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LastCleanedDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LastCleanedDt getLastCleanedDt_elem() {
    return (xsd.acord.LastCleanedDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LastCleanedDt_elem" );
  }


  public final void setLastCleanedDt_elem( xsd.acord.LastCleanedDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LastCleanedDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getCertifiedInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CertifiedInd" );
  }


  public final void setCertifiedInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CertifiedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CertifiedInd getCertifiedInd_elem() {
    return (xsd.acord.CertifiedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CertifiedInd_elem" );
  }


  public final void setCertifiedInd_elem( xsd.acord.CertifiedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CertifiedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAshContainerDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AshContainerDesc" );
  }


  public final void setAshContainerDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AshContainerDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AshContainerDesc getAshContainerDesc_elem() {
    return (xsd.acord.AshContainerDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AshContainerDesc_elem" );
  }


  public final void setAshContainerDesc_elem( xsd.acord.AshContainerDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AshContainerDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAshStorageDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AshStorageDesc" );
  }


  public final void setAshStorageDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AshStorageDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AshStorageDesc getAshStorageDesc_elem() {
    return (xsd.acord.AshStorageDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AshStorageDesc_elem" );
  }


  public final void setAshStorageDesc_elem( xsd.acord.AshStorageDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AshStorageDesc_elem", value );
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
  public final gw.xml.XmlElement getInspectorRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InspectorRef" );
  }


  public final void setInspectorRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InspectorRef", value );
  }
}
