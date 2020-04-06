/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class LineCondition extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LineCondition", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConditionDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ConditionDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConditionToBeMetDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ConditionToBeMetDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConditionNotMetConsequenceDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ConditionNotMetConsequenceDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TermsUntilConditionMetDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TermsUntilConditionMetDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.LineConditionType" );
    }
  };

  public LineCondition() {
    super( -1661243496, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.LineConditionType() );
  }

  public LineCondition( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.LineConditionType typeInstance ) {
    super( -1661243496, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private LineCondition( gw.internal.xml.XmlElementState state ) {
    super( -1661243496, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.LineConditionType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.LineConditionType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.LineConditionType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LineCondition.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getConditionDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConditionDescription" );
  }


  public final void setConditionDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConditionDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ConditionDescription getConditionDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ConditionDescription) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConditionDescription_elem" );
  }


  public final void setConditionDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ConditionDescription value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConditionDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getConditionToBeMetDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConditionToBeMetDate" );
  }


  public final void setConditionToBeMetDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConditionToBeMetDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ConditionToBeMetDate getConditionToBeMetDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ConditionToBeMetDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConditionToBeMetDate_elem" );
  }


  public final void setConditionToBeMetDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ConditionToBeMetDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConditionToBeMetDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getConditionNotMetConsequenceDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConditionNotMetConsequenceDescription" );
  }


  public final void setConditionNotMetConsequenceDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConditionNotMetConsequenceDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ConditionNotMetConsequenceDescription getConditionNotMetConsequenceDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ConditionNotMetConsequenceDescription) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConditionNotMetConsequenceDescription_elem" );
  }


  public final void setConditionNotMetConsequenceDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ConditionNotMetConsequenceDescription value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConditionNotMetConsequenceDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTermsUntilConditionMetDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TermsUntilConditionMetDescription" );
  }


  public final void setTermsUntilConditionMetDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TermsUntilConditionMetDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TermsUntilConditionMetDescription getTermsUntilConditionMetDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TermsUntilConditionMetDescription) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TermsUntilConditionMetDescription_elem" );
  }


  public final void setTermsUntilConditionMetDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TermsUntilConditionMetDescription value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TermsUntilConditionMetDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.LineConditionType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.LineConditionType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.LineConditionType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}