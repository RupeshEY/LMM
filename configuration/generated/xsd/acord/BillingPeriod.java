/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BillingPeriod extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BillingPeriod", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpirationDt = new javax.xml.namespace.QName( "", "ExpirationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartTime = new javax.xml.namespace.QName( "", "StartTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndTime = new javax.xml.namespace.QName( "", "EndTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LocalStandardTimeInd = new javax.xml.namespace.QName( "", "LocalStandardTimeInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DurationPeriod = new javax.xml.namespace.QName( "", "DurationPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContinuousInd = new javax.xml.namespace.QName( "", "ContinuousInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GB_BothDaysInclusiveInd = new javax.xml.namespace.QName( "", "GB.BothDaysInclusiveInd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.BillingPeriod" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.DURATION" );
    }
  };

  public BillingPeriod() {
    super( -1658516696, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.DURATION() );
  }

  public BillingPeriod( xsd.acord.types.complex.DURATION typeInstance ) {
    super( -1658516696, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BillingPeriod( gw.internal.xml.XmlElementState state ) {
    super( -1658516696, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.BillingPeriod> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.DURATION get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.DURATION.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.DURATION typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.BillingPeriod parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.BillingPeriod.class );
  }

  public static xsd.acord.BillingPeriod parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.BillingPeriod.class );
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
  public final java.lang.String getEffectiveDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EffectiveDt" );
  }


  public final void setEffectiveDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EffectiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EffectiveDt getEffectiveDt_elem() {
    return (xsd.acord.EffectiveDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EffectiveDt_elem" );
  }


  public final void setEffectiveDt_elem( xsd.acord.EffectiveDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EffectiveDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExpirationDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExpirationDt" );
  }


  public final void setExpirationDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExpirationDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExpirationDt getExpirationDt_elem() {
    return (xsd.acord.ExpirationDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExpirationDt_elem" );
  }


  public final void setExpirationDt_elem( xsd.acord.ExpirationDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExpirationDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlTime getStartTime() {
    return (gw.xml.date.XmlTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartTime" );
  }


  public final void setStartTime( gw.xml.date.XmlTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StartTime getStartTime_elem() {
    return (xsd.acord.StartTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartTime_elem" );
  }


  public final void setStartTime_elem( xsd.acord.StartTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlTime getEndTime() {
    return (gw.xml.date.XmlTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndTime" );
  }


  public final void setEndTime( gw.xml.date.XmlTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EndTime getEndTime_elem() {
    return (xsd.acord.EndTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndTime_elem" );
  }


  public final void setEndTime_elem( xsd.acord.EndTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getLocalStandardTimeInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocalStandardTimeInd" );
  }


  public final void setLocalStandardTimeInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocalStandardTimeInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LocalStandardTimeInd getLocalStandardTimeInd_elem() {
    return (xsd.acord.LocalStandardTimeInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocalStandardTimeInd_elem" );
  }


  public final void setLocalStandardTimeInd_elem( xsd.acord.LocalStandardTimeInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocalStandardTimeInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DurationPeriod getDurationPeriod() {
    return (xsd.acord.DurationPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DurationPeriod" );
  }


  public final void setDurationPeriod( xsd.acord.DurationPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DurationPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getContinuousInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContinuousInd" );
  }


  public final void setContinuousInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContinuousInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContinuousInd getContinuousInd_elem() {
    return (xsd.acord.ContinuousInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContinuousInd_elem" );
  }


  public final void setContinuousInd_elem( xsd.acord.ContinuousInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContinuousInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Description getDescription_elem() {
    return (xsd.acord.Description) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description_elem" );
  }


  public final void setDescription_elem( xsd.acord.Description value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getGB_BothDaysInclusiveInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GB_BothDaysInclusiveInd" );
  }


  public final void setGB_BothDaysInclusiveInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GB_BothDaysInclusiveInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GB_BothDaysInclusiveInd getGB_BothDaysInclusiveInd_elem() {
    return (xsd.acord.GB_BothDaysInclusiveInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GB_BothDaysInclusiveInd_elem" );
  }


  public final void setGB_BothDaysInclusiveInd_elem( xsd.acord.GB_BothDaysInclusiveInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GB_BothDaysInclusiveInd_elem", value );
  }
}