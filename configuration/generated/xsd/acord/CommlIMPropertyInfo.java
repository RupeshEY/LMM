/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CommlIMPropertyInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommlIMPropertyInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertyClassCd = new javax.xml.namespace.QName( "", "PropertyClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertyClassCdDesc = new javax.xml.namespace.QName( "", "PropertyClassCdDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertySubClassCd = new javax.xml.namespace.QName( "", "PropertySubClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClassCd = new javax.xml.namespace.QName( "", "ClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverage = new javax.xml.namespace.QName( "", "CommlCoverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditOrSurcharge = new javax.xml.namespace.QName( "", "CreditOrSurcharge", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumInfo = new javax.xml.namespace.QName( "", "PremiumInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AccountsReceivableInfo = new javax.xml.namespace.QName( "", "AccountsReceivableInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BuildersRiskInstallationInfo = new javax.xml.namespace.QName( "", "BuildersRiskInstallationInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EDPInfo = new javax.xml.namespace.QName( "", "EDPInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EquipmentInfo = new javax.xml.namespace.QName( "", "EquipmentInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransportationInfo = new javax.xml.namespace.QName( "", "TransportationInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommunicationsInfo = new javax.xml.namespace.QName( "", "CommunicationsInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertySummaryInfo = new javax.xml.namespace.QName( "", "PropertySummaryInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentTermAmt = new javax.xml.namespace.QName( "", "CurrentTermAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NetChangeAmt = new javax.xml.namespace.QName( "", "NetChangeAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WrittenAmt = new javax.xml.namespace.QName( "", "WrittenAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubLocationRef = new javax.xml.namespace.QName( "", "SubLocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CommlIMLocationRef = new javax.xml.namespace.QName( "", "CommlIMLocationRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CommlIMPropertyInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommlIMPropertyInfo_Type" );
    }
  };

  public CommlIMPropertyInfo() {
    super( -1013298093, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CommlIMPropertyInfo_Type() );
  }

  public CommlIMPropertyInfo( xsd.acord.types.complex.CommlIMPropertyInfo_Type typeInstance ) {
    super( -1013298093, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CommlIMPropertyInfo( gw.internal.xml.XmlElementState state ) {
    super( -1013298093, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CommlIMPropertyInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CommlIMPropertyInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CommlIMPropertyInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CommlIMPropertyInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }

  public static xsd.acord.CommlIMPropertyInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CommlIMPropertyInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Risk getPropertyClassCd() {
    return (xsd.acord.enums.Risk) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyClassCd" );
  }


  public final void setPropertyClassCd( xsd.acord.enums.Risk value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertyClassCd getPropertyClassCd_elem() {
    return (xsd.acord.PropertyClassCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyClassCd_elem" );
  }


  public final void setPropertyClassCd_elem( xsd.acord.PropertyClassCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPropertyClassCdDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyClassCdDesc" );
  }


  public final void setPropertyClassCdDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyClassCdDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertyClassCdDesc getPropertyClassCdDesc_elem() {
    return (xsd.acord.PropertyClassCdDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyClassCdDesc_elem" );
  }


  public final void setPropertyClassCdDesc_elem( xsd.acord.PropertyClassCdDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyClassCdDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SubRisk getPropertySubClassCd() {
    return (xsd.acord.enums.SubRisk) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertySubClassCd" );
  }


  public final void setPropertySubClassCd( xsd.acord.enums.SubRisk value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertySubClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertySubClassCd getPropertySubClassCd_elem() {
    return (xsd.acord.PropertySubClassCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertySubClassCd_elem" );
  }


  public final void setPropertySubClassCd_elem( xsd.acord.PropertySubClassCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertySubClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClassCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClassCd" );
  }


  public final void setClassCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClassCd getClassCd_elem() {
    return (xsd.acord.ClassCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClassCd_elem" );
  }


  public final void setClassCd_elem( xsd.acord.ClassCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlCoverage> getCommlCoverage() {
    return (java.util.List<xsd.acord.CommlCoverage>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlCoverage" );
  }


  public final void setCommlCoverage( java.util.List<xsd.acord.CommlCoverage> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlCoverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CreditOrSurcharge> getCreditOrSurcharge() {
    return (java.util.List<xsd.acord.CreditOrSurcharge>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreditOrSurcharge" );
  }


  public final void setCreditOrSurcharge( java.util.List<xsd.acord.CreditOrSurcharge> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreditOrSurcharge", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PremiumInfo getPremiumInfo() {
    return (xsd.acord.PremiumInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremiumInfo" );
  }


  public final void setPremiumInfo( xsd.acord.PremiumInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremiumInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AccountsReceivableInfo> getAccountsReceivableInfo() {
    return (java.util.List<xsd.acord.AccountsReceivableInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AccountsReceivableInfo" );
  }


  public final void setAccountsReceivableInfo( java.util.List<xsd.acord.AccountsReceivableInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AccountsReceivableInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.BuildersRiskInstallationInfo> getBuildersRiskInstallationInfo() {
    return (java.util.List<xsd.acord.BuildersRiskInstallationInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BuildersRiskInstallationInfo" );
  }


  public final void setBuildersRiskInstallationInfo( java.util.List<xsd.acord.BuildersRiskInstallationInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BuildersRiskInstallationInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.EDPInfo> getEDPInfo() {
    return (java.util.List<xsd.acord.EDPInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EDPInfo" );
  }


  public final void setEDPInfo( java.util.List<xsd.acord.EDPInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EDPInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.EquipmentInfo> getEquipmentInfo() {
    return (java.util.List<xsd.acord.EquipmentInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EquipmentInfo" );
  }


  public final void setEquipmentInfo( java.util.List<xsd.acord.EquipmentInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EquipmentInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.TransportationInfo> getTransportationInfo() {
    return (java.util.List<xsd.acord.TransportationInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransportationInfo" );
  }


  public final void setTransportationInfo( java.util.List<xsd.acord.TransportationInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransportationInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommunicationsInfo> getCommunicationsInfo() {
    return (java.util.List<xsd.acord.CommunicationsInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommunicationsInfo" );
  }


  public final void setCommunicationsInfo( java.util.List<xsd.acord.CommunicationsInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommunicationsInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.PropertySummaryInfo> getPropertySummaryInfo() {
    return (java.util.List<xsd.acord.PropertySummaryInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertySummaryInfo" );
  }


  public final void setPropertySummaryInfo( java.util.List<xsd.acord.PropertySummaryInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertySummaryInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CurrentTermAmt getCurrentTermAmt() {
    return (xsd.acord.CurrentTermAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CurrentTermAmt" );
  }


  public final void setCurrentTermAmt( xsd.acord.CurrentTermAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CurrentTermAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NetChangeAmt getNetChangeAmt() {
    return (xsd.acord.NetChangeAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NetChangeAmt" );
  }


  public final void setNetChangeAmt( xsd.acord.NetChangeAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NetChangeAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WrittenAmt getWrittenAmt() {
    return (xsd.acord.WrittenAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WrittenAmt" );
  }


  public final void setWrittenAmt( xsd.acord.WrittenAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WrittenAmt", value );
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
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSubLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubLocationRef" );
  }


  public final void setSubLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubLocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getCommlIMLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlIMLocationRef" );
  }


  public final void setCommlIMLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlIMLocationRef", value );
  }
}