/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PropertyScheduleModifications extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PropertyScheduleModifications", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BlanketNumber = new javax.xml.namespace.QName( "", "BlanketNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BlanketInd = new javax.xml.namespace.QName( "", "BlanketInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExhibitedInd = new javax.xml.namespace.QName( "", "ExhibitedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InVaultInd = new javax.xml.namespace.QName( "", "InVaultInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProfessionalCommercialUseInd = new javax.xml.namespace.QName( "", "ProfessionalCommercialUseInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QualifierTypeCd = new javax.xml.namespace.QName( "", "QualifierTypeCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.PropertyScheduleModifications" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.PropertyScheduleModifications" );
    }
  };

  public PropertyScheduleModifications() {
    super( 234235949, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.PropertyScheduleModifications() );
  }

  public PropertyScheduleModifications( xsd.iso.req.anonymous.types.complex.PropertyScheduleModifications typeInstance ) {
    super( 234235949, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PropertyScheduleModifications( gw.internal.xml.XmlElementState state ) {
    super( 234235949, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.PropertyScheduleModifications> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.PropertyScheduleModifications get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.PropertyScheduleModifications.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.PropertyScheduleModifications typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }

  public static xsd.iso.req.PropertyScheduleModifications parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.PropertyScheduleModifications.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBlanketNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketNumber" );
  }


  public final void setBlanketNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyScheduleModifications_BlanketNumber getBlanketNumber_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyScheduleModifications_BlanketNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketNumber_elem" );
  }


  public final void setBlanketNumber_elem( xsd.iso.req.anonymous.elements.PropertyScheduleModifications_BlanketNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBlanketInd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketInd" );
  }


  public final void setBlanketInd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyScheduleModifications_BlanketInd getBlanketInd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyScheduleModifications_BlanketInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketInd_elem" );
  }


  public final void setBlanketInd_elem( xsd.iso.req.anonymous.elements.PropertyScheduleModifications_BlanketInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExhibitedInd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExhibitedInd" );
  }


  public final void setExhibitedInd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExhibitedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyScheduleModifications_ExhibitedInd getExhibitedInd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyScheduleModifications_ExhibitedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExhibitedInd_elem" );
  }


  public final void setExhibitedInd_elem( xsd.iso.req.anonymous.elements.PropertyScheduleModifications_ExhibitedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExhibitedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInVaultInd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InVaultInd" );
  }


  public final void setInVaultInd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InVaultInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyScheduleModifications_InVaultInd getInVaultInd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyScheduleModifications_InVaultInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InVaultInd_elem" );
  }


  public final void setInVaultInd_elem( xsd.iso.req.anonymous.elements.PropertyScheduleModifications_InVaultInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InVaultInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProfessionalCommercialUseInd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfessionalCommercialUseInd" );
  }


  public final void setProfessionalCommercialUseInd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfessionalCommercialUseInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyScheduleModifications_ProfessionalCommercialUseInd getProfessionalCommercialUseInd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyScheduleModifications_ProfessionalCommercialUseInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfessionalCommercialUseInd_elem" );
  }


  public final void setProfessionalCommercialUseInd_elem( xsd.iso.req.anonymous.elements.PropertyScheduleModifications_ProfessionalCommercialUseInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfessionalCommercialUseInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getQualifierTypeCd() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_QualifierTypeCd" );
  }


  public final void setQualifierTypeCd( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_QualifierTypeCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.PropertyScheduleModifications_QualifierTypeCd> getQualifierTypeCd_elem() {
    return (java.util.List<xsd.iso.req.anonymous.elements.PropertyScheduleModifications_QualifierTypeCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_QualifierTypeCd_elem" );
  }


  public final void setQualifierTypeCd_elem( java.util.List<xsd.iso.req.anonymous.elements.PropertyScheduleModifications_QualifierTypeCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_QualifierTypeCd_elem", value );
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