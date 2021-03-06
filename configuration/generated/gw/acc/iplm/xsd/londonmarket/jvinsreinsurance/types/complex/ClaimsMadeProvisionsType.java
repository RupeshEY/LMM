/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimsMadeProvisionsType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ClaimsMadeProvisionsType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExtendedReporting = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ExtendedReporting", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContinuityDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ContinuityDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PendingAndPriorLitigationDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PendingAndPriorLitigationDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageRetroactiveDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverageRetroactiveDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ClaimsMadeProvisionsType" );
    }
  };

  public ClaimsMadeProvisionsType() {
    super( -374353274, TYPE.get() );
  }

  private ClaimsMadeProvisionsType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -374353274, state );
  }

  protected ClaimsMadeProvisionsType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimsMadeProvisionsType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ClaimsMadeProvisionsType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ClaimsMadeProvisionsType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ExtendedReporting getExtendedReporting() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ExtendedReporting) TYPE.get().getPropertyValue( this, "_ExtendedReporting" );
  }


  public final void setExtendedReporting( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ExtendedReporting value ) {
    TYPE.get().setPropertyValue( this, "_ExtendedReporting", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getContinuityDateTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ContinuityDateTime" );
  }


  public final void setContinuityDateTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ContinuityDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ContinuityDateTime getContinuityDateTime_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ContinuityDateTime) TYPE.get().getPropertyValue( this, "_ContinuityDateTime_elem" );
  }


  public final void setContinuityDateTime_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ContinuityDateTime value ) {
    TYPE.get().setPropertyValue( this, "_ContinuityDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPendingAndPriorLitigationDateTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PendingAndPriorLitigationDateTime" );
  }


  public final void setPendingAndPriorLitigationDateTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PendingAndPriorLitigationDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PendingAndPriorLitigationDateTime getPendingAndPriorLitigationDateTime_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PendingAndPriorLitigationDateTime) TYPE.get().getPropertyValue( this, "_PendingAndPriorLitigationDateTime_elem" );
  }


  public final void setPendingAndPriorLitigationDateTime_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PendingAndPriorLitigationDateTime value ) {
    TYPE.get().setPropertyValue( this, "_PendingAndPriorLitigationDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageRetroactiveDateTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CoverageRetroactiveDateTime" );
  }


  public final void setCoverageRetroactiveDateTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CoverageRetroactiveDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CoverageRetroactiveDateTime getCoverageRetroactiveDateTime_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CoverageRetroactiveDateTime) TYPE.get().getPropertyValue( this, "_CoverageRetroactiveDateTime_elem" );
  }


  public final void setCoverageRetroactiveDateTime_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CoverageRetroactiveDateTime value ) {
    TYPE.get().setPropertyValue( this, "_CoverageRetroactiveDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ClaimsMadeProvisionsType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ClaimsMadeProvisionsType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ClaimsMadeProvisionsType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
