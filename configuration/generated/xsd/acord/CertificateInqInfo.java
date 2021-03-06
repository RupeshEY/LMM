/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CertificateInqInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CertificateInqInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartialPolicy = new javax.xml.namespace.QName( "", "PartialPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "", "Location", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IncludeAllHoldersInd = new javax.xml.namespace.QName( "", "IncludeAllHoldersInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInterest = new javax.xml.namespace.QName( "", "AdditionalInterest", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Form = new javax.xml.namespace.QName( "", "Form", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LiabilityCoverageLimits = new javax.xml.namespace.QName( "", "LiabilityCoverageLimits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RecipientInfo = new javax.xml.namespace.QName( "", "RecipientInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CertificateInqInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CertificateInqInfo_Type" );
    }
  };

  public CertificateInqInfo() {
    super( 320749975, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CertificateInqInfo_Type() );
  }

  public CertificateInqInfo( xsd.acord.types.complex.CertificateInqInfo_Type typeInstance ) {
    super( 320749975, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CertificateInqInfo( gw.internal.xml.XmlElementState state ) {
    super( 320749975, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CertificateInqInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CertificateInqInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CertificateInqInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CertificateInqInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CertificateInqInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CertificateInqInfo.class );
  }

  public static xsd.acord.CertificateInqInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CertificateInqInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.PartialPolicy> getPartialPolicy() {
    return (java.util.List<xsd.acord.PartialPolicy>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartialPolicy" );
  }


  public final void setPartialPolicy( java.util.List<xsd.acord.PartialPolicy> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartialPolicy", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuredOrPrincipal> getInsuredOrPrincipal() {
    return (java.util.List<xsd.acord.InsuredOrPrincipal>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( java.util.List<xsd.acord.InsuredOrPrincipal> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuredOrPrincipal", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Location getLocation() {
    return (xsd.acord.Location) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Location" );
  }


  public final void setLocation( xsd.acord.Location value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Location", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getIncludeAllHoldersInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IncludeAllHoldersInd" );
  }


  public final void setIncludeAllHoldersInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IncludeAllHoldersInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IncludeAllHoldersInd getIncludeAllHoldersInd_elem() {
    return (xsd.acord.IncludeAllHoldersInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IncludeAllHoldersInd_elem" );
  }


  public final void setIncludeAllHoldersInd_elem( xsd.acord.IncludeAllHoldersInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IncludeAllHoldersInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AdditionalInterest> getAdditionalInterest() {
    return (java.util.List<xsd.acord.AdditionalInterest>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AdditionalInterest" );
  }


  public final void setAdditionalInterest( java.util.List<xsd.acord.AdditionalInterest> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AdditionalInterest", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Form> getForm() {
    return (java.util.List<xsd.acord.Form>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Form" );
  }


  public final void setForm( java.util.List<xsd.acord.Form> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Form", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.LiabilityCoverageLimits> getLiabilityCoverageLimits() {
    return (java.util.List<xsd.acord.LiabilityCoverageLimits>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LiabilityCoverageLimits" );
  }


  public final void setLiabilityCoverageLimits( java.util.List<xsd.acord.LiabilityCoverageLimits> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LiabilityCoverageLimits", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.RecipientInfo> getRecipientInfo() {
    return (java.util.List<xsd.acord.RecipientInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RecipientInfo" );
  }


  public final void setRecipientInfo( java.util.List<xsd.acord.RecipientInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RecipientInfo", value );
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
