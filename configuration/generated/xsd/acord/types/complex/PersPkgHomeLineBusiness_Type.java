/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.acord.types.complex.PCLINEBUSINESS.class)
public class PersPkgHomeLineBusiness_Type extends xsd.acord.types.complex.PCLINEBUSINESS {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PersPkgHomeLineBusiness_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverage = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuestionAnswer = new javax.xml.namespace.QName( "", "QuestionAnswer", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_DwellRefs = new javax.xml.namespace.QName( "", "DwellRefs", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_DriverRefs = new javax.xml.namespace.QName( "", "DriverRefs", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_VehRefs = new javax.xml.namespace.QName( "", "VehRefs", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PropScheduleRefs = new javax.xml.namespace.QName( "", "PropScheduleRefs", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_WatercraftRefs = new javax.xml.namespace.QName( "", "WatercraftRefs", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_WatercraftAccessoryRefs = new javax.xml.namespace.QName( "", "WatercraftAccessoryRefs", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBCd = new javax.xml.namespace.QName( "", "LOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBSubCd = new javax.xml.namespace.QName( "", "LOBSubCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICCd = new javax.xml.namespace.QName( "", "NAICCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CompanyProductCd = new javax.xml.namespace.QName( "", "CompanyProductCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentTermAmt = new javax.xml.namespace.QName( "", "CurrentTermAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NetChangeAmt = new javax.xml.namespace.QName( "", "NetChangeAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WrittenAmt = new javax.xml.namespace.QName( "", "WrittenAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GroupId = new javax.xml.namespace.QName( "", "GroupId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PMACd = new javax.xml.namespace.QName( "", "PMACd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RateEffectiveDt = new javax.xml.namespace.QName( "", "RateEffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInterest = new javax.xml.namespace.QName( "", "AdditionalInterest", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinPremInd = new javax.xml.namespace.QName( "", "MinPremInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AuditInfo = new javax.xml.namespace.QName( "", "AuditInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HazardGradeCd = new javax.xml.namespace.QName( "", "HazardGradeCd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PersPkgHomeLineBusiness_Type" );
    }
  };

  public PersPkgHomeLineBusiness_Type() {
    super( 972463543, TYPE.get() );
  }

  private PersPkgHomeLineBusiness_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 972463543, state );
  }

  protected PersPkgHomeLineBusiness_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PersPkgHomeLineBusiness_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PersPkgHomeLineBusiness_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PersPkgHomeLineBusiness_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Coverage> getCoverage() {
    return (java.util.List<xsd.acord.Coverage>) TYPE.get().getPropertyValue( this, "_Coverage" );
  }


  public final void setCoverage( java.util.List<xsd.acord.Coverage> value ) {
    TYPE.get().setPropertyValue( this, "_Coverage", value );
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
  public final java.util.List<gw.xml.XmlElement> getDwellRefs() {
    return (java.util.List<gw.xml.XmlElement>) TYPE.get().getPropertyValue( this, "_DwellRefs" );
  }


  public final void setDwellRefs( java.util.List<gw.xml.XmlElement> value ) {
    TYPE.get().setPropertyValue( this, "_DwellRefs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.xml.XmlElement> getDriverRefs() {
    return (java.util.List<gw.xml.XmlElement>) TYPE.get().getPropertyValue( this, "_DriverRefs" );
  }


  public final void setDriverRefs( java.util.List<gw.xml.XmlElement> value ) {
    TYPE.get().setPropertyValue( this, "_DriverRefs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.xml.XmlElement> getVehRefs() {
    return (java.util.List<gw.xml.XmlElement>) TYPE.get().getPropertyValue( this, "_VehRefs" );
  }


  public final void setVehRefs( java.util.List<gw.xml.XmlElement> value ) {
    TYPE.get().setPropertyValue( this, "_VehRefs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.xml.XmlElement> getPropScheduleRefs() {
    return (java.util.List<gw.xml.XmlElement>) TYPE.get().getPropertyValue( this, "_PropScheduleRefs" );
  }


  public final void setPropScheduleRefs( java.util.List<gw.xml.XmlElement> value ) {
    TYPE.get().setPropertyValue( this, "_PropScheduleRefs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.xml.XmlElement> getWatercraftRefs() {
    return (java.util.List<gw.xml.XmlElement>) TYPE.get().getPropertyValue( this, "_WatercraftRefs" );
  }


  public final void setWatercraftRefs( java.util.List<gw.xml.XmlElement> value ) {
    TYPE.get().setPropertyValue( this, "_WatercraftRefs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.xml.XmlElement> getWatercraftAccessoryRefs() {
    return (java.util.List<gw.xml.XmlElement>) TYPE.get().getPropertyValue( this, "_WatercraftAccessoryRefs" );
  }


  public final void setWatercraftAccessoryRefs( java.util.List<gw.xml.XmlElement> value ) {
    TYPE.get().setPropertyValue( this, "_WatercraftAccessoryRefs", value );
  }

}