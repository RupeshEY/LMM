/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CrimeInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CrimeInfo_Type", "" );
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
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CrimeInfo_Type" );
    }
  };

  public CrimeInfo_Type() {
    super( -1482307328, TYPE.get() );
  }

  private CrimeInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1482307328, state );
  }

  protected CrimeInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CrimeInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.CrimeInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.CrimeInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlTime getBusinessHoursStartTime() {
    return (gw.xml.date.XmlTime) TYPE.get().getPropertyValue( this, "_BusinessHoursStartTime" );
  }


  public final void setBusinessHoursStartTime( gw.xml.date.XmlTime value ) {
    TYPE.get().setPropertyValue( this, "_BusinessHoursStartTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessHoursStartTime getBusinessHoursStartTime_elem() {
    return (xsd.acord.BusinessHoursStartTime) TYPE.get().getPropertyValue( this, "_BusinessHoursStartTime_elem" );
  }


  public final void setBusinessHoursStartTime_elem( xsd.acord.BusinessHoursStartTime value ) {
    TYPE.get().setPropertyValue( this, "_BusinessHoursStartTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlTime getBusinessHoursCloseTime() {
    return (gw.xml.date.XmlTime) TYPE.get().getPropertyValue( this, "_BusinessHoursCloseTime" );
  }


  public final void setBusinessHoursCloseTime( gw.xml.date.XmlTime value ) {
    TYPE.get().setPropertyValue( this, "_BusinessHoursCloseTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessHoursCloseTime getBusinessHoursCloseTime_elem() {
    return (xsd.acord.BusinessHoursCloseTime) TYPE.get().getPropertyValue( this, "_BusinessHoursCloseTime_elem" );
  }


  public final void setBusinessHoursCloseTime_elem( xsd.acord.BusinessHoursCloseTime value ) {
    TYPE.get().setPropertyValue( this, "_BusinessHoursCloseTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getAvgNumEmployees() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_AvgNumEmployees" );
  }


  public final void setAvgNumEmployees( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_AvgNumEmployees", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AvgNumEmployees getAvgNumEmployees_elem() {
    return (xsd.acord.AvgNumEmployees) TYPE.get().getPropertyValue( this, "_AvgNumEmployees_elem" );
  }


  public final void setAvgNumEmployees_elem( xsd.acord.AvgNumEmployees value ) {
    TYPE.get().setPropertyValue( this, "_AvgNumEmployees_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getChecksStampedInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ChecksStampedInd" );
  }


  public final void setChecksStampedInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ChecksStampedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ChecksStampedInd getChecksStampedInd_elem() {
    return (xsd.acord.ChecksStampedInd) TYPE.get().getPropertyValue( this, "_ChecksStampedInd_elem" );
  }


  public final void setChecksStampedInd_elem( xsd.acord.ChecksStampedInd value ) {
    TYPE.get().setPropertyValue( this, "_ChecksStampedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Frequency getDepositFrequencyCd() {
    return (xsd.acord.enums.Frequency) TYPE.get().getPropertyValue( this, "_DepositFrequencyCd" );
  }


  public final void setDepositFrequencyCd( xsd.acord.enums.Frequency value ) {
    TYPE.get().setPropertyValue( this, "_DepositFrequencyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DepositFrequencyCd getDepositFrequencyCd_elem() {
    return (xsd.acord.DepositFrequencyCd) TYPE.get().getPropertyValue( this, "_DepositFrequencyCd_elem" );
  }


  public final void setDepositFrequencyCd_elem( xsd.acord.DepositFrequencyCd value ) {
    TYPE.get().setPropertyValue( this, "_DepositFrequencyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getNightDepositInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_NightDepositInd" );
  }


  public final void setNightDepositInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_NightDepositInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NightDepositInd getNightDepositInd_elem() {
    return (xsd.acord.NightDepositInd) TYPE.get().getPropertyValue( this, "_NightDepositInd_elem" );
  }


  public final void setNightDepositInd_elem( xsd.acord.NightDepositInd value ) {
    TYPE.get().setPropertyValue( this, "_NightDepositInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnnualGrossReceiptsAmt getAnnualGrossReceiptsAmt() {
    return (xsd.acord.AnnualGrossReceiptsAmt) TYPE.get().getPropertyValue( this, "_AnnualGrossReceiptsAmt" );
  }


  public final void setAnnualGrossReceiptsAmt( xsd.acord.AnnualGrossReceiptsAmt value ) {
    TYPE.get().setPropertyValue( this, "_AnnualGrossReceiptsAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPropertyDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PropertyDesc" );
  }


  public final void setPropertyDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PropertyDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertyDesc getPropertyDesc_elem() {
    return (xsd.acord.PropertyDesc) TYPE.get().getPropertyValue( this, "_PropertyDesc_elem" );
  }


  public final void setPropertyDesc_elem( xsd.acord.PropertyDesc value ) {
    TYPE.get().setPropertyValue( this, "_PropertyDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MaxPropertyValueAmt getMaxPropertyValueAmt() {
    return (xsd.acord.MaxPropertyValueAmt) TYPE.get().getPropertyValue( this, "_MaxPropertyValueAmt" );
  }


  public final void setMaxPropertyValueAmt( xsd.acord.MaxPropertyValueAmt value ) {
    TYPE.get().setPropertyValue( this, "_MaxPropertyValueAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.MessengerProtectionInfo> getMessengerProtectionInfo() {
    return (java.util.List<xsd.acord.MessengerProtectionInfo>) TYPE.get().getPropertyValue( this, "_MessengerProtectionInfo" );
  }


  public final void setMessengerProtectionInfo( java.util.List<xsd.acord.MessengerProtectionInfo> value ) {
    TYPE.get().setPropertyValue( this, "_MessengerProtectionInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}
