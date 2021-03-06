/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RetentionPeriod extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "RetentionPeriod", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "StartDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EndDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TimeDuration = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TimeDuration", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyPeriodType" );
    }
  };

  public RetentionPeriod() {
    super( -1700326832, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyPeriodType() );
  }

  public RetentionPeriod( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyPeriodType typeInstance ) {
    super( -1700326832, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RetentionPeriod( gw.internal.xml.XmlElementState state ) {
    super( -1700326832, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyPeriodType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyPeriodType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyPeriodType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.RetentionPeriod.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStartDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartDate" );
  }


  public final void setStartDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.StartDate getStartDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.StartDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartDate_elem" );
  }


  public final void setStartDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.StartDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndDate" );
  }


  public final void setEndDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.EndDate getEndDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.EndDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndDate_elem" );
  }


  public final void setEndDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.EndDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long getTimeDuration() {
    return (java.lang.Long) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeDuration" );
  }


  public final void setTimeDuration( java.lang.Long value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeDuration", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TimeDuration getTimeDuration_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TimeDuration) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeDuration_elem" );
  }


  public final void setTimeDuration_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TimeDuration value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeDuration_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AnyPeriodType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AnyPeriodType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AnyPeriodType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}
