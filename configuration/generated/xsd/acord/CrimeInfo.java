/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CrimeInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CrimeInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessHoursStartTime = new javax.xml.namespace.QName( "", "BusinessHoursStartTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessHoursCloseTime = new javax.xml.namespace.QName( "", "BusinessHoursCloseTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AvgNumEmployees = new javax.xml.namespace.QName( "", "AvgNumEmployees", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ChecksStampedInd = new javax.xml.namespace.QName( "", "ChecksStampedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DepositFrequencyCd = new javax.xml.namespace.QName( "", "DepositFrequencyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NightDepositInd = new javax.xml.namespace.QName( "", "NightDepositInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualGrossReceiptsAmt = new javax.xml.namespace.QName( "", "AnnualGrossReceiptsAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertyDesc = new javax.xml.namespace.QName( "", "PropertyDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MaxPropertyValueAmt = new javax.xml.namespace.QName( "", "MaxPropertyValueAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MessengerProtectionInfo = new javax.xml.namespace.QName( "", "MessengerProtectionInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CrimeInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CrimeInfo_Type" );
    }
  };

  public CrimeInfo() {
    super( -1918728756, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CrimeInfo_Type() );
  }

  public CrimeInfo( xsd.acord.types.complex.CrimeInfo_Type typeInstance ) {
    super( -1918728756, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CrimeInfo( gw.internal.xml.XmlElementState state ) {
    super( -1918728756, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CrimeInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CrimeInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CrimeInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CrimeInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CrimeInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CrimeInfo.class );
  }

  public static xsd.acord.CrimeInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CrimeInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlTime getBusinessHoursStartTime() {
    return (gw.xml.date.XmlTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessHoursStartTime" );
  }


  public final void setBusinessHoursStartTime( gw.xml.date.XmlTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessHoursStartTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessHoursStartTime getBusinessHoursStartTime_elem() {
    return (xsd.acord.BusinessHoursStartTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessHoursStartTime_elem" );
  }


  public final void setBusinessHoursStartTime_elem( xsd.acord.BusinessHoursStartTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessHoursStartTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlTime getBusinessHoursCloseTime() {
    return (gw.xml.date.XmlTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessHoursCloseTime" );
  }


  public final void setBusinessHoursCloseTime( gw.xml.date.XmlTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessHoursCloseTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessHoursCloseTime getBusinessHoursCloseTime_elem() {
    return (xsd.acord.BusinessHoursCloseTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessHoursCloseTime_elem" );
  }


  public final void setBusinessHoursCloseTime_elem( xsd.acord.BusinessHoursCloseTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessHoursCloseTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getAvgNumEmployees() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AvgNumEmployees" );
  }


  public final void setAvgNumEmployees( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AvgNumEmployees", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AvgNumEmployees getAvgNumEmployees_elem() {
    return (xsd.acord.AvgNumEmployees) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AvgNumEmployees_elem" );
  }


  public final void setAvgNumEmployees_elem( xsd.acord.AvgNumEmployees value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AvgNumEmployees_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getChecksStampedInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ChecksStampedInd" );
  }


  public final void setChecksStampedInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ChecksStampedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ChecksStampedInd getChecksStampedInd_elem() {
    return (xsd.acord.ChecksStampedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ChecksStampedInd_elem" );
  }


  public final void setChecksStampedInd_elem( xsd.acord.ChecksStampedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ChecksStampedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Frequency getDepositFrequencyCd() {
    return (xsd.acord.enums.Frequency) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DepositFrequencyCd" );
  }


  public final void setDepositFrequencyCd( xsd.acord.enums.Frequency value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DepositFrequencyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DepositFrequencyCd getDepositFrequencyCd_elem() {
    return (xsd.acord.DepositFrequencyCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DepositFrequencyCd_elem" );
  }


  public final void setDepositFrequencyCd_elem( xsd.acord.DepositFrequencyCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DepositFrequencyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getNightDepositInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NightDepositInd" );
  }


  public final void setNightDepositInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NightDepositInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NightDepositInd getNightDepositInd_elem() {
    return (xsd.acord.NightDepositInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NightDepositInd_elem" );
  }


  public final void setNightDepositInd_elem( xsd.acord.NightDepositInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NightDepositInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnnualGrossReceiptsAmt getAnnualGrossReceiptsAmt() {
    return (xsd.acord.AnnualGrossReceiptsAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnnualGrossReceiptsAmt" );
  }


  public final void setAnnualGrossReceiptsAmt( xsd.acord.AnnualGrossReceiptsAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnnualGrossReceiptsAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPropertyDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyDesc" );
  }


  public final void setPropertyDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertyDesc getPropertyDesc_elem() {
    return (xsd.acord.PropertyDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyDesc_elem" );
  }


  public final void setPropertyDesc_elem( xsd.acord.PropertyDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MaxPropertyValueAmt getMaxPropertyValueAmt() {
    return (xsd.acord.MaxPropertyValueAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MaxPropertyValueAmt" );
  }


  public final void setMaxPropertyValueAmt( xsd.acord.MaxPropertyValueAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MaxPropertyValueAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.MessengerProtectionInfo> getMessengerProtectionInfo() {
    return (java.util.List<xsd.acord.MessengerProtectionInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MessengerProtectionInfo" );
  }


  public final void setMessengerProtectionInfo( java.util.List<xsd.acord.MessengerProtectionInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MessengerProtectionInfo", value );
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
