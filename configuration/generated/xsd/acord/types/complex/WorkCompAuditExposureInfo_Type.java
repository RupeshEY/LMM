/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class WorkCompAuditExposureInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "WorkCompAuditExposureInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AuditPeriod = new javax.xml.namespace.QName( "", "AuditPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RatingClassificationCd = new javax.xml.namespace.QName( "", "RatingClassificationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RatingClassificationDescCd = new javax.xml.namespace.QName( "", "RatingClassificationDescCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverage = new javax.xml.namespace.QName( "", "CommlCoverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumBasisCd = new javax.xml.namespace.QName( "", "PremiumBasisCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Exposure = new javax.xml.namespace.QName( "", "Exposure", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_EmployeeRef = new javax.xml.namespace.QName( "", "EmployeeRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.WorkCompAuditExposureInfo_Type" );
    }
  };

  public WorkCompAuditExposureInfo_Type() {
    super( -1756761648, TYPE.get() );
  }

  private WorkCompAuditExposureInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1756761648, state );
  }

  protected WorkCompAuditExposureInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected WorkCompAuditExposureInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.WorkCompAuditExposureInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.WorkCompAuditExposureInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AuditPeriod getAuditPeriod() {
    return (xsd.acord.AuditPeriod) TYPE.get().getPropertyValue( this, "_AuditPeriod" );
  }


  public final void setAuditPeriod( xsd.acord.AuditPeriod value ) {
    TYPE.get().setPropertyValue( this, "_AuditPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRatingClassificationCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RatingClassificationCd" );
  }


  public final void setRatingClassificationCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RatingClassificationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RatingClassificationCd getRatingClassificationCd_elem() {
    return (xsd.acord.RatingClassificationCd) TYPE.get().getPropertyValue( this, "_RatingClassificationCd_elem" );
  }


  public final void setRatingClassificationCd_elem( xsd.acord.RatingClassificationCd value ) {
    TYPE.get().setPropertyValue( this, "_RatingClassificationCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRatingClassificationDescCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RatingClassificationDescCd" );
  }


  public final void setRatingClassificationDescCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RatingClassificationDescCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RatingClassificationDescCd getRatingClassificationDescCd_elem() {
    return (xsd.acord.RatingClassificationDescCd) TYPE.get().getPropertyValue( this, "_RatingClassificationDescCd_elem" );
  }


  public final void setRatingClassificationDescCd_elem( xsd.acord.RatingClassificationDescCd value ) {
    TYPE.get().setPropertyValue( this, "_RatingClassificationDescCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlCoverage> getCommlCoverage() {
    return (java.util.List<xsd.acord.CommlCoverage>) TYPE.get().getPropertyValue( this, "_CommlCoverage" );
  }


  public final void setCommlCoverage( java.util.List<xsd.acord.CommlCoverage> value ) {
    TYPE.get().setPropertyValue( this, "_CommlCoverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PremiumBase getPremiumBasisCd() {
    return (xsd.acord.enums.PremiumBase) TYPE.get().getPropertyValue( this, "_PremiumBasisCd" );
  }


  public final void setPremiumBasisCd( xsd.acord.enums.PremiumBase value ) {
    TYPE.get().setPropertyValue( this, "_PremiumBasisCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PremiumBasisCd getPremiumBasisCd_elem() {
    return (xsd.acord.PremiumBasisCd) TYPE.get().getPropertyValue( this, "_PremiumBasisCd_elem" );
  }


  public final void setPremiumBasisCd_elem( xsd.acord.PremiumBasisCd value ) {
    TYPE.get().setPropertyValue( this, "_PremiumBasisCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getExposure() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_Exposure" );
  }


  public final void setExposure( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_Exposure", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Exposure getExposure_elem() {
    return (xsd.acord.Exposure) TYPE.get().getPropertyValue( this, "_Exposure_elem" );
  }


  public final void setExposure_elem( xsd.acord.Exposure value ) {
    TYPE.get().setPropertyValue( this, "_Exposure_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getEmployeeRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_EmployeeRef" );
  }


  public final void setEmployeeRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_EmployeeRef", value );
  }

}