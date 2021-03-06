/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Certification_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Certification_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CertificationCd = new javax.xml.namespace.QName( "", "CertificationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PilotRatingCd = new javax.xml.namespace.QName( "", "PilotRatingCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CertifiedInd = new javax.xml.namespace.QName( "", "CertifiedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherCertification = new javax.xml.namespace.QName( "", "OtherCertification", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherRating = new javax.xml.namespace.QName( "", "OtherRating", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CertificationDt = new javax.xml.namespace.QName( "", "CertificationDt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Certification_Type" );
    }
  };

  public Certification_Type() {
    super( -1916840506, TYPE.get() );
  }

  private Certification_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1916840506, state );
  }

  protected Certification_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Certification_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.Certification_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.Certification_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.CertificationType getCertificationCd() {
    return (xsd.acord.enums.CertificationType) TYPE.get().getPropertyValue( this, "_CertificationCd" );
  }


  public final void setCertificationCd( xsd.acord.enums.CertificationType value ) {
    TYPE.get().setPropertyValue( this, "_CertificationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CertificationCd getCertificationCd_elem() {
    return (xsd.acord.CertificationCd) TYPE.get().getPropertyValue( this, "_CertificationCd_elem" );
  }


  public final void setCertificationCd_elem( xsd.acord.CertificationCd value ) {
    TYPE.get().setPropertyValue( this, "_CertificationCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PilotRating getPilotRatingCd() {
    return (xsd.acord.enums.PilotRating) TYPE.get().getPropertyValue( this, "_PilotRatingCd" );
  }


  public final void setPilotRatingCd( xsd.acord.enums.PilotRating value ) {
    TYPE.get().setPropertyValue( this, "_PilotRatingCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PilotRatingCd getPilotRatingCd_elem() {
    return (xsd.acord.PilotRatingCd) TYPE.get().getPropertyValue( this, "_PilotRatingCd_elem" );
  }


  public final void setPilotRatingCd_elem( xsd.acord.PilotRatingCd value ) {
    TYPE.get().setPropertyValue( this, "_PilotRatingCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getCertifiedInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_CertifiedInd" );
  }


  public final void setCertifiedInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_CertifiedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CertifiedInd getCertifiedInd_elem() {
    return (xsd.acord.CertifiedInd) TYPE.get().getPropertyValue( this, "_CertifiedInd_elem" );
  }


  public final void setCertifiedInd_elem( xsd.acord.CertifiedInd value ) {
    TYPE.get().setPropertyValue( this, "_CertifiedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOtherCertification() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OtherCertification" );
  }


  public final void setOtherCertification( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OtherCertification", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OtherCertification getOtherCertification_elem() {
    return (xsd.acord.OtherCertification) TYPE.get().getPropertyValue( this, "_OtherCertification_elem" );
  }


  public final void setOtherCertification_elem( xsd.acord.OtherCertification value ) {
    TYPE.get().setPropertyValue( this, "_OtherCertification_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOtherRating() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OtherRating" );
  }


  public final void setOtherRating( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OtherRating", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OtherRating getOtherRating_elem() {
    return (xsd.acord.OtherRating) TYPE.get().getPropertyValue( this, "_OtherRating_elem" );
  }


  public final void setOtherRating_elem( xsd.acord.OtherRating value ) {
    TYPE.get().setPropertyValue( this, "_OtherRating_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCertificationDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CertificationDt" );
  }


  public final void setCertificationDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CertificationDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CertificationDt getCertificationDt_elem() {
    return (xsd.acord.CertificationDt) TYPE.get().getPropertyValue( this, "_CertificationDt_elem" );
  }


  public final void setCertificationDt_elem( xsd.acord.CertificationDt value ) {
    TYPE.get().setPropertyValue( this, "_CertificationDt_elem", value );
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
