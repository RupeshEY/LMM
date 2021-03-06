/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ExposureInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ExposureInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExposureCd = new javax.xml.namespace.QName( "", "ExposureCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertyClassCd = new javax.xml.namespace.QName( "", "PropertyClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertySubClassCd = new javax.xml.namespace.QName( "", "PropertySubClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PerformedForCd = new javax.xml.namespace.QName( "", "PerformedForCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuranceRequestedInd = new javax.xml.namespace.QName( "", "InsuranceRequestedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OffPremisesInd = new javax.xml.namespace.QName( "", "OffPremisesInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumBasisCd = new javax.xml.namespace.QName( "", "PremiumBasisCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Exposure = new javax.xml.namespace.QName( "", "Exposure", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalReceiptsPct = new javax.xml.namespace.QName( "", "TotalReceiptsPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DayCd = new javax.xml.namespace.QName( "", "DayCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClienteleAgeCd = new javax.xml.namespace.QName( "", "ClienteleAgeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuestionAnswer = new javax.xml.namespace.QName( "", "QuestionAnswer", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubLocationRef = new javax.xml.namespace.QName( "", "SubLocationRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ExposureInfo_Type" );
    }
  };

  public ExposureInfo_Type() {
    super( -264009699, TYPE.get() );
  }

  private ExposureInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -264009699, state );
  }

  protected ExposureInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ExposureInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ExposureInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ExposureInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Exposures getExposureCd() {
    return (xsd.acord.enums.Exposures) TYPE.get().getPropertyValue( this, "_ExposureCd" );
  }


  public final void setExposureCd( xsd.acord.enums.Exposures value ) {
    TYPE.get().setPropertyValue( this, "_ExposureCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExposureCd getExposureCd_elem() {
    return (xsd.acord.ExposureCd) TYPE.get().getPropertyValue( this, "_ExposureCd_elem" );
  }


  public final void setExposureCd_elem( xsd.acord.ExposureCd value ) {
    TYPE.get().setPropertyValue( this, "_ExposureCd_elem", value );
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
  public final xsd.acord.Description getDescription_elem() {
    return (xsd.acord.Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( xsd.acord.Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Risk getPropertyClassCd() {
    return (xsd.acord.enums.Risk) TYPE.get().getPropertyValue( this, "_PropertyClassCd" );
  }


  public final void setPropertyClassCd( xsd.acord.enums.Risk value ) {
    TYPE.get().setPropertyValue( this, "_PropertyClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertyClassCd getPropertyClassCd_elem() {
    return (xsd.acord.PropertyClassCd) TYPE.get().getPropertyValue( this, "_PropertyClassCd_elem" );
  }


  public final void setPropertyClassCd_elem( xsd.acord.PropertyClassCd value ) {
    TYPE.get().setPropertyValue( this, "_PropertyClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SubRisk getPropertySubClassCd() {
    return (xsd.acord.enums.SubRisk) TYPE.get().getPropertyValue( this, "_PropertySubClassCd" );
  }


  public final void setPropertySubClassCd( xsd.acord.enums.SubRisk value ) {
    TYPE.get().setPropertyValue( this, "_PropertySubClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertySubClassCd getPropertySubClassCd_elem() {
    return (xsd.acord.PropertySubClassCd) TYPE.get().getPropertyValue( this, "_PropertySubClassCd_elem" );
  }


  public final void setPropertySubClassCd_elem( xsd.acord.PropertySubClassCd value ) {
    TYPE.get().setPropertyValue( this, "_PropertySubClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PerformedFor getPerformedForCd() {
    return (xsd.acord.enums.PerformedFor) TYPE.get().getPropertyValue( this, "_PerformedForCd" );
  }


  public final void setPerformedForCd( xsd.acord.enums.PerformedFor value ) {
    TYPE.get().setPropertyValue( this, "_PerformedForCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PerformedForCd getPerformedForCd_elem() {
    return (xsd.acord.PerformedForCd) TYPE.get().getPropertyValue( this, "_PerformedForCd_elem" );
  }


  public final void setPerformedForCd_elem( xsd.acord.PerformedForCd value ) {
    TYPE.get().setPropertyValue( this, "_PerformedForCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getInsuranceRequestedInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_InsuranceRequestedInd" );
  }


  public final void setInsuranceRequestedInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_InsuranceRequestedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsuranceRequestedInd getInsuranceRequestedInd_elem() {
    return (xsd.acord.InsuranceRequestedInd) TYPE.get().getPropertyValue( this, "_InsuranceRequestedInd_elem" );
  }


  public final void setInsuranceRequestedInd_elem( xsd.acord.InsuranceRequestedInd value ) {
    TYPE.get().setPropertyValue( this, "_InsuranceRequestedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.Boolean> getOffPremisesInd() {
    return (java.util.List<java.lang.Boolean>) TYPE.get().getPropertyValue( this, "_OffPremisesInd" );
  }


  public final void setOffPremisesInd( java.util.List<java.lang.Boolean> value ) {
    TYPE.get().setPropertyValue( this, "_OffPremisesInd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.OffPremisesInd> getOffPremisesInd_elem() {
    return (java.util.List<xsd.acord.OffPremisesInd>) TYPE.get().getPropertyValue( this, "_OffPremisesInd_elem" );
  }


  public final void setOffPremisesInd_elem( java.util.List<xsd.acord.OffPremisesInd> value ) {
    TYPE.get().setPropertyValue( this, "_OffPremisesInd_elem", value );
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
  public final java.math.BigDecimal getTotalReceiptsPct() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_TotalReceiptsPct" );
  }


  public final void setTotalReceiptsPct( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_TotalReceiptsPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalReceiptsPct getTotalReceiptsPct_elem() {
    return (xsd.acord.TotalReceiptsPct) TYPE.get().getPropertyValue( this, "_TotalReceiptsPct_elem" );
  }


  public final void setTotalReceiptsPct_elem( xsd.acord.TotalReceiptsPct value ) {
    TYPE.get().setPropertyValue( this, "_TotalReceiptsPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.Days> getDayCd() {
    return (java.util.List<xsd.acord.enums.Days>) TYPE.get().getPropertyValue( this, "_DayCd" );
  }


  public final void setDayCd( java.util.List<xsd.acord.enums.Days> value ) {
    TYPE.get().setPropertyValue( this, "_DayCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.DayCd> getDayCd_elem() {
    return (java.util.List<xsd.acord.DayCd>) TYPE.get().getPropertyValue( this, "_DayCd_elem" );
  }


  public final void setDayCd_elem( java.util.List<xsd.acord.DayCd> value ) {
    TYPE.get().setPropertyValue( this, "_DayCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.ClienteleAge> getClienteleAgeCd() {
    return (java.util.List<xsd.acord.enums.ClienteleAge>) TYPE.get().getPropertyValue( this, "_ClienteleAgeCd" );
  }


  public final void setClienteleAgeCd( java.util.List<xsd.acord.enums.ClienteleAge> value ) {
    TYPE.get().setPropertyValue( this, "_ClienteleAgeCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClienteleAgeCd> getClienteleAgeCd_elem() {
    return (java.util.List<xsd.acord.ClienteleAgeCd>) TYPE.get().getPropertyValue( this, "_ClienteleAgeCd_elem" );
  }


  public final void setClienteleAgeCd_elem( java.util.List<xsd.acord.ClienteleAgeCd> value ) {
    TYPE.get().setPropertyValue( this, "_ClienteleAgeCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.QuestionAnswer> getQuestionAnswer() {
    return (java.util.List<xsd.acord.QuestionAnswer>) TYPE.get().getPropertyValue( this, "_QuestionAnswer" );
  }


  public final void setQuestionAnswer( java.util.List<xsd.acord.QuestionAnswer> value ) {
    TYPE.get().setPropertyValue( this, "_QuestionAnswer", value );
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
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSubLocationRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_SubLocationRef" );
  }


  public final void setSubLocationRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_SubLocationRef", value );
  }

}
