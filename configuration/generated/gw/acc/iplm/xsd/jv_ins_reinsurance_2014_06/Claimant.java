/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Claimant extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Claimant", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Party = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Party", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FullNameAndAddress = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "FullNameAndAddress", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Contact = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Contact", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Information = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Information", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BirthDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BirthDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LastDateWorked = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LastDateWorked", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DateOfDisablement = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "DateOfDisablement", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DateOfReturnToWork = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "DateOfReturnToWork", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConsequenceOfLoss = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ConsequenceOfLoss", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConsequenceOfLossOld = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ConsequenceOfLossOld", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimantType" );
    }
  };

  public Claimant() {
    super( 255418161, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimantType() );
  }

  public Claimant( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimantType typeInstance ) {
    super( 255418161, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Claimant( gw.internal.xml.XmlElementState state ) {
    super( 255418161, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimantType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimantType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ClaimantType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party getParty() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Party" );
  }


  public final void setParty( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Party", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFullNameAndAddress() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FullNameAndAddress" );
  }


  public final void setFullNameAndAddress( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FullNameAndAddress", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FullNameAndAddress getFullNameAndAddress_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FullNameAndAddress) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FullNameAndAddress_elem" );
  }


  public final void setFullNameAndAddress_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FullNameAndAddress value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FullNameAndAddress_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contact getContact() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contact) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Contact" );
  }


  public final void setContact( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contact value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Contact", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInformation() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Information" );
  }


  public final void setInformation( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Information", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Information getInformation_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Information) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Information_elem" );
  }


  public final void setInformation_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Information value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Information_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBirthDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BirthDate" );
  }


  public final void setBirthDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BirthDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BirthDate getBirthDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BirthDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BirthDate_elem" );
  }


  public final void setBirthDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BirthDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BirthDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLastDateWorked() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LastDateWorked" );
  }


  public final void setLastDateWorked( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LastDateWorked", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LastDateWorked getLastDateWorked_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LastDateWorked) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LastDateWorked_elem" );
  }


  public final void setLastDateWorked_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LastDateWorked value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LastDateWorked_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDateOfDisablement() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DateOfDisablement" );
  }


  public final void setDateOfDisablement( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DateOfDisablement", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DateOfDisablement getDateOfDisablement_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DateOfDisablement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DateOfDisablement_elem" );
  }


  public final void setDateOfDisablement_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DateOfDisablement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DateOfDisablement_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDateOfReturnToWork() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DateOfReturnToWork" );
  }


  public final void setDateOfReturnToWork( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DateOfReturnToWork", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DateOfReturnToWork getDateOfReturnToWork_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DateOfReturnToWork) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DateOfReturnToWork_elem" );
  }


  public final void setDateOfReturnToWork_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DateOfReturnToWork value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DateOfReturnToWork_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getConsequenceOfLoss() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConsequenceOfLoss" );
  }


  public final void setConsequenceOfLoss( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConsequenceOfLoss", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ConsequenceOfLoss> getConsequenceOfLoss_elem() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ConsequenceOfLoss>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConsequenceOfLoss_elem" );
  }


  public final void setConsequenceOfLoss_elem( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ConsequenceOfLoss> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConsequenceOfLoss_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getConsequenceOfLossOld() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConsequenceOfLossOld" );
  }


  public final void setConsequenceOfLossOld( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConsequenceOfLossOld", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ConsequenceOfLossOld> getConsequenceOfLossOld_elem() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ConsequenceOfLossOld>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConsequenceOfLossOld_elem" );
  }


  public final void setConsequenceOfLossOld_elem( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ConsequenceOfLossOld> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConsequenceOfLossOld_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ClaimantType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ClaimantType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ClaimantType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}
