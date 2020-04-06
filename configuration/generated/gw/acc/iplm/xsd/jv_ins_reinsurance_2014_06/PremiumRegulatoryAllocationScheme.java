/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PremiumRegulatoryAllocationScheme extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumRegulatoryAllocationScheme", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AllocationCodeListDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AllocationCodeListDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Allocation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Allocation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Agency = new javax.xml.namespace.QName( "", "Agency", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.PremiumRegulatoryAllocationSchemeType" );
    }
  };

  public PremiumRegulatoryAllocationScheme() {
    super( -648050482, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.PremiumRegulatoryAllocationSchemeType() );
  }

  public PremiumRegulatoryAllocationScheme( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.PremiumRegulatoryAllocationSchemeType typeInstance ) {
    super( -648050482, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PremiumRegulatoryAllocationScheme( gw.internal.xml.XmlElementState state ) {
    super( -648050482, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.PremiumRegulatoryAllocationSchemeType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.PremiumRegulatoryAllocationSchemeType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.PremiumRegulatoryAllocationSchemeType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRegulatoryAllocationScheme.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAllocationCodeListDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AllocationCodeListDescription" );
  }


  public final void setAllocationCodeListDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AllocationCodeListDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AllocationCodeListDescription getAllocationCodeListDescription_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AllocationCodeListDescription) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AllocationCodeListDescription_elem" );
  }


  public final void setAllocationCodeListDescription_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AllocationCodeListDescription value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AllocationCodeListDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Allocation> getAllocation() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Allocation>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Allocation" );
  }


  public final void setAllocation( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Allocation> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Allocation", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.PremiumRegulatoryAllocationSchemeType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.PremiumRegulatoryAllocationSchemeType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.PremiumRegulatoryAllocationSchemeType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAgency() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Agency" );
  }


  public final void setAgency( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Agency", value );
  }
}