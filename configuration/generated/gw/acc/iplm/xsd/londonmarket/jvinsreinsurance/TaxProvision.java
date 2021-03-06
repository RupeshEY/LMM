/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class TaxProvision extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxProvision", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxClass = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxClass", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxAuthorityLocation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxAuthorityLocation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxTypeDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxTypeDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxRateBasis = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxRateBasis", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxPayerPartyRole = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxPayerPartyRole", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TaxProvisionType" );
    }
  };

  public TaxProvision() {
    super( 1872151353, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TaxProvisionType() );
  }

  public TaxProvision( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TaxProvisionType typeInstance ) {
    super( 1872151353, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private TaxProvision( gw.internal.xml.XmlElementState state ) {
    super( 1872151353, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TaxProvisionType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TaxProvisionType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TaxProvisionType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTaxClass() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxClass" );
  }


  public final void setTaxClass( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxClass", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxClass getTaxClass_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxClass) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxClass_elem" );
  }


  public final void setTaxClass_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxClass value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxClass_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTaxType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxType" );
  }


  public final void setTaxType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxType getTaxType_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxType_elem" );
  }


  public final void setTaxType_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxAuthorityLocation getTaxAuthorityLocation() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxAuthorityLocation) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxAuthorityLocation" );
  }


  public final void setTaxAuthorityLocation( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxAuthorityLocation value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxAuthorityLocation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTaxTypeDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxTypeDescription" );
  }


  public final void setTaxTypeDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxTypeDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxTypeDescription getTaxTypeDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxTypeDescription) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxTypeDescription_elem" );
  }


  public final void setTaxTypeDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxTypeDescription value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxTypeDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTaxRateBasis() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxRateBasis" );
  }


  public final void setTaxRateBasis( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxRateBasis", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxRateBasis getTaxRateBasis_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxRateBasis) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxRateBasis_elem" );
  }


  public final void setTaxRateBasis_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxRateBasis value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxRateBasis_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTaxPayerPartyRole() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxPayerPartyRole" );
  }


  public final void setTaxPayerPartyRole( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxPayerPartyRole", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxPayerPartyRole getTaxPayerPartyRole_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxPayerPartyRole) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxPayerPartyRole_elem" );
  }


  public final void setTaxPayerPartyRole_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxPayerPartyRole value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxPayerPartyRole_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.TaxProvisionType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.TaxProvisionType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.TaxProvisionType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}
