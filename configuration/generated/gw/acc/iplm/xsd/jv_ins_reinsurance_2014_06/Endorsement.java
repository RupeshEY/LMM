/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Endorsement extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Endorsement", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndorsementReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EndorsementReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndorsementName = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EndorsementName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EffectiveDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndorsementExpiryDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EndorsementExpiryDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TimeZoneNarrative = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TimeZoneNarrative", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LocalStandardTimeAppliesIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LocalStandardTimeAppliesIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndorsementAgreementConditions = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EndorsementAgreementConditions", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.Endorsement_Type" );
    }
  };

  public Endorsement() {
    super( 177410920, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.Endorsement_Type() );
  }

  public Endorsement( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.Endorsement_Type typeInstance ) {
    super( 177410920, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Endorsement( gw.internal.xml.XmlElementState state ) {
    super( 177410920, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.Endorsement_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.Endorsement_Type.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.Endorsement_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Endorsement.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndorsementReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndorsementReference" );
  }


  public final void setEndorsementReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndorsementReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementReference getEndorsementReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndorsementReference_elem" );
  }


  public final void setEndorsementReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndorsementReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndorsementName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndorsementName" );
  }


  public final void setEndorsementName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndorsementName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementName getEndorsementName_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndorsementName_elem" );
  }


  public final void setEndorsementName_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndorsementName_elem", value );
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEffectiveDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EffectiveDate" );
  }


  public final void setEffectiveDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EffectiveDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EffectiveDate getEffectiveDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EffectiveDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EffectiveDate_elem" );
  }


  public final void setEffectiveDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EffectiveDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EffectiveDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndorsementExpiryDateTime() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndorsementExpiryDateTime" );
  }


  public final void setEndorsementExpiryDateTime( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndorsementExpiryDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementExpiryDateTime getEndorsementExpiryDateTime_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementExpiryDateTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndorsementExpiryDateTime_elem" );
  }


  public final void setEndorsementExpiryDateTime_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementExpiryDateTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndorsementExpiryDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTimeZoneNarrative() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeZoneNarrative" );
  }


  public final void setTimeZoneNarrative( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeZoneNarrative", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeZoneNarrative getTimeZoneNarrative_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeZoneNarrative) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeZoneNarrative_elem" );
  }


  public final void setTimeZoneNarrative_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeZoneNarrative value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeZoneNarrative_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getLocalStandardTimeAppliesIndicator() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocalStandardTimeAppliesIndicator" );
  }


  public final void setLocalStandardTimeAppliesIndicator( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocalStandardTimeAppliesIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LocalStandardTimeAppliesIndicator getLocalStandardTimeAppliesIndicator_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LocalStandardTimeAppliesIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocalStandardTimeAppliesIndicator_elem" );
  }


  public final void setLocalStandardTimeAppliesIndicator_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LocalStandardTimeAppliesIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocalStandardTimeAppliesIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementAgreementConditions getEndorsementAgreementConditions() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementAgreementConditions) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndorsementAgreementConditions" );
  }


  public final void setEndorsementAgreementConditions( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndorsementAgreementConditions value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndorsementAgreementConditions", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.Endorsement_Type_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.Endorsement_Type_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.Endorsement_Type_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}