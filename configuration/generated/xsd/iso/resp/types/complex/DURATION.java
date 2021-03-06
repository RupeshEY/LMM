/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class DURATION extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "DURATION", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpirationDt = new javax.xml.namespace.QName( "", "ExpirationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartTime = new javax.xml.namespace.QName( "", "StartTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndTime = new javax.xml.namespace.QName( "", "EndTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LocalStandardTimeInd = new javax.xml.namespace.QName( "", "LocalStandardTimeInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DurationPeriod = new javax.xml.namespace.QName( "", "DurationPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContinuousInd = new javax.xml.namespace.QName( "", "ContinuousInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GB_BothDaysInclusiveInd = new javax.xml.namespace.QName( "", "GB.BothDaysInclusiveInd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.types.complex.DURATION" );
    }
  };

  public DURATION() {
    super( 1447488183, TYPE.get() );
  }

  private DURATION( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1447488183, state );
  }

  protected DURATION( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected DURATION( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.types.complex.DURATION> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.types.complex.DURATION get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEffectiveDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EffectiveDt" );
  }


  public final void setEffectiveDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.DURATION_EffectiveDt getEffectiveDt_elem() {
    return (xsd.iso.resp.anonymous.elements.DURATION_EffectiveDt) TYPE.get().getPropertyValue( this, "_EffectiveDt_elem" );
  }


  public final void setEffectiveDt_elem( xsd.iso.resp.anonymous.elements.DURATION_EffectiveDt value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExpirationDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ExpirationDt" );
  }


  public final void setExpirationDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ExpirationDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.DURATION_ExpirationDt getExpirationDt_elem() {
    return (xsd.iso.resp.anonymous.elements.DURATION_ExpirationDt) TYPE.get().getPropertyValue( this, "_ExpirationDt_elem" );
  }


  public final void setExpirationDt_elem( xsd.iso.resp.anonymous.elements.DURATION_ExpirationDt value ) {
    TYPE.get().setPropertyValue( this, "_ExpirationDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStartTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StartTime" );
  }


  public final void setStartTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StartTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.DURATION_StartTime getStartTime_elem() {
    return (xsd.iso.resp.anonymous.elements.DURATION_StartTime) TYPE.get().getPropertyValue( this, "_StartTime_elem" );
  }


  public final void setStartTime_elem( xsd.iso.resp.anonymous.elements.DURATION_StartTime value ) {
    TYPE.get().setPropertyValue( this, "_StartTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EndTime" );
  }


  public final void setEndTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EndTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.DURATION_EndTime getEndTime_elem() {
    return (xsd.iso.resp.anonymous.elements.DURATION_EndTime) TYPE.get().getPropertyValue( this, "_EndTime_elem" );
  }


  public final void setEndTime_elem( xsd.iso.resp.anonymous.elements.DURATION_EndTime value ) {
    TYPE.get().setPropertyValue( this, "_EndTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLocalStandardTimeInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LocalStandardTimeInd" );
  }


  public final void setLocalStandardTimeInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LocalStandardTimeInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.DURATION_LocalStandardTimeInd getLocalStandardTimeInd_elem() {
    return (xsd.iso.resp.anonymous.elements.DURATION_LocalStandardTimeInd) TYPE.get().getPropertyValue( this, "_LocalStandardTimeInd_elem" );
  }


  public final void setLocalStandardTimeInd_elem( xsd.iso.resp.anonymous.elements.DURATION_LocalStandardTimeInd value ) {
    TYPE.get().setPropertyValue( this, "_LocalStandardTimeInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.DurationPeriod getDurationPeriod() {
    return (xsd.iso.resp.DurationPeriod) TYPE.get().getPropertyValue( this, "_DurationPeriod" );
  }


  public final void setDurationPeriod( xsd.iso.resp.DurationPeriod value ) {
    TYPE.get().setPropertyValue( this, "_DurationPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getContinuousInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ContinuousInd" );
  }


  public final void setContinuousInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ContinuousInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.DURATION_ContinuousInd getContinuousInd_elem() {
    return (xsd.iso.resp.anonymous.elements.DURATION_ContinuousInd) TYPE.get().getPropertyValue( this, "_ContinuousInd_elem" );
  }


  public final void setContinuousInd_elem( xsd.iso.resp.anonymous.elements.DURATION_ContinuousInd value ) {
    TYPE.get().setPropertyValue( this, "_ContinuousInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.DURATION_Description getDescription_elem() {
    return (xsd.iso.resp.anonymous.elements.DURATION_Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( xsd.iso.resp.anonymous.elements.DURATION_Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGB_BothDaysInclusiveInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_GB_BothDaysInclusiveInd" );
  }


  public final void setGB_BothDaysInclusiveInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_GB_BothDaysInclusiveInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.DURATION_GB_BothDaysInclusiveInd getGB_BothDaysInclusiveInd_elem() {
    return (xsd.iso.resp.anonymous.elements.DURATION_GB_BothDaysInclusiveInd) TYPE.get().getPropertyValue( this, "_GB_BothDaysInclusiveInd_elem" );
  }


  public final void setGB_BothDaysInclusiveInd_elem( xsd.iso.resp.anonymous.elements.DURATION_GB_BothDaysInclusiveInd value ) {
    TYPE.get().setPropertyValue( this, "_GB_BothDaysInclusiveInd_elem", value );
  }

}
