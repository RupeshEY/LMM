/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BordereauType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ApplicableValidators = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "ApplicableValidators", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UUId = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UUId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CedentReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CedentReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverHolderReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverHolderReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrokerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BrokerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProviderReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ServiceProviderReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlacingExchangeReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PlacingExchangeReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreationDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CreationDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BordereauType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Explanation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Explanation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Cedent = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Cedent", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Reinsurer = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Reinsurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Insurer = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Insurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoInsurer = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoInsurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverHolder = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverHolder", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Broker = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Broker", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProvider = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ServiceProvider", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlacingExchange = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PlacingExchange", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OriginalInsurerOrReinsurer = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "OriginalInsurerOrReinsurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AsOfDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BordereauPeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AccountPeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AccountPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BordereauAmendedIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauAmendedIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SupportingIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "SupportingIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CorrectionIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CorrectionIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredTechAccount = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferredTechAccount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredBordereau = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferredBordereau", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Contract = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Contract", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferenceCurrency = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferenceCurrency", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BordereauSection = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauSection", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Sender = new javax.xml.namespace.QName( "", "Sender", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Receiver = new javax.xml.namespace.QName( "", "Receiver", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauType" );
    }
  };

  public BordereauType() {
    super( -1767072946, TYPE.get() );
  }

  private BordereauType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1767072946, state );
  }

  protected BordereauType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BordereauType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ApplicableValidators getApplicableValidators() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ApplicableValidators) TYPE.get().getPropertyValue( this, "_ApplicableValidators" );
  }


  public final void setApplicableValidators( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ApplicableValidators value ) {
    TYPE.get().setPropertyValue( this, "_ApplicableValidators", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUUId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_UUId" );
  }


  public final void setUUId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_UUId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId getUUId_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId) TYPE.get().getPropertyValue( this, "_UUId_elem" );
  }


  public final void setUUId_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId value ) {
    TYPE.get().setPropertyValue( this, "_UUId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCedentReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CedentReference" );
  }


  public final void setCedentReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CedentReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CedentReference getCedentReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CedentReference) TYPE.get().getPropertyValue( this, "_CedentReference_elem" );
  }


  public final void setCedentReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CedentReference value ) {
    TYPE.get().setPropertyValue( this, "_CedentReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverHolderReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CoverHolderReference" );
  }


  public final void setCoverHolderReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CoverHolderReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverHolderReference getCoverHolderReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverHolderReference) TYPE.get().getPropertyValue( this, "_CoverHolderReference_elem" );
  }


  public final void setCoverHolderReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverHolderReference value ) {
    TYPE.get().setPropertyValue( this, "_CoverHolderReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBrokerReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BrokerReference" );
  }


  public final void setBrokerReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BrokerReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BrokerReference getBrokerReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BrokerReference) TYPE.get().getPropertyValue( this, "_BrokerReference_elem" );
  }


  public final void setBrokerReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BrokerReference value ) {
    TYPE.get().setPropertyValue( this, "_BrokerReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInsurerReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InsurerReference" );
  }


  public final void setInsurerReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InsurerReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerReference getInsurerReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerReference) TYPE.get().getPropertyValue( this, "_InsurerReference_elem" );
  }


  public final void setInsurerReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.InsurerReference value ) {
    TYPE.get().setPropertyValue( this, "_InsurerReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServiceProviderReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ServiceProviderReference" );
  }


  public final void setServiceProviderReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ServiceProviderReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProviderReference getServiceProviderReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProviderReference) TYPE.get().getPropertyValue( this, "_ServiceProviderReference_elem" );
  }


  public final void setServiceProviderReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProviderReference value ) {
    TYPE.get().setPropertyValue( this, "_ServiceProviderReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPlacingExchangeReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PlacingExchangeReference" );
  }


  public final void setPlacingExchangeReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PlacingExchangeReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PlacingExchangeReference getPlacingExchangeReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PlacingExchangeReference) TYPE.get().getPropertyValue( this, "_PlacingExchangeReference_elem" );
  }


  public final void setPlacingExchangeReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PlacingExchangeReference value ) {
    TYPE.get().setPropertyValue( this, "_PlacingExchangeReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCreationDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CreationDate" );
  }


  public final void setCreationDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CreationDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CreationDate getCreationDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CreationDate) TYPE.get().getPropertyValue( this, "_CreationDate_elem" );
  }


  public final void setCreationDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CreationDate value ) {
    TYPE.get().setPropertyValue( this, "_CreationDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBordereauType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BordereauType" );
  }


  public final void setBordereauType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BordereauType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauType getBordereauType_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauType) TYPE.get().getPropertyValue( this, "_BordereauType_elem" );
  }


  public final void setBordereauType_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauType value ) {
    TYPE.get().setPropertyValue( this, "_BordereauType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExplanation() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Explanation" );
  }


  public final void setExplanation( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Explanation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Explanation getExplanation_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Explanation) TYPE.get().getPropertyValue( this, "_Explanation_elem" );
  }


  public final void setExplanation_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Explanation value ) {
    TYPE.get().setPropertyValue( this, "_Explanation_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Cedent getCedent() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Cedent) TYPE.get().getPropertyValue( this, "_Cedent" );
  }


  public final void setCedent( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Cedent value ) {
    TYPE.get().setPropertyValue( this, "_Cedent", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Reinsurer getReinsurer() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Reinsurer) TYPE.get().getPropertyValue( this, "_Reinsurer" );
  }


  public final void setReinsurer( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Reinsurer value ) {
    TYPE.get().setPropertyValue( this, "_Reinsurer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Insurer getInsurer() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Insurer) TYPE.get().getPropertyValue( this, "_Insurer" );
  }


  public final void setInsurer( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Insurer value ) {
    TYPE.get().setPropertyValue( this, "_Insurer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoInsurer getCoInsurer() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoInsurer) TYPE.get().getPropertyValue( this, "_CoInsurer" );
  }


  public final void setCoInsurer( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoInsurer value ) {
    TYPE.get().setPropertyValue( this, "_CoInsurer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverHolder getCoverHolder() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverHolder) TYPE.get().getPropertyValue( this, "_CoverHolder" );
  }


  public final void setCoverHolder( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoverHolder value ) {
    TYPE.get().setPropertyValue( this, "_CoverHolder", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Broker getBroker() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Broker) TYPE.get().getPropertyValue( this, "_Broker" );
  }


  public final void setBroker( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Broker value ) {
    TYPE.get().setPropertyValue( this, "_Broker", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProvider getServiceProvider() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProvider) TYPE.get().getPropertyValue( this, "_ServiceProvider" );
  }


  public final void setServiceProvider( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProvider value ) {
    TYPE.get().setPropertyValue( this, "_ServiceProvider", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PlacingExchange getPlacingExchange() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PlacingExchange) TYPE.get().getPropertyValue( this, "_PlacingExchange" );
  }


  public final void setPlacingExchange( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PlacingExchange value ) {
    TYPE.get().setPropertyValue( this, "_PlacingExchange", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.OriginalInsurerOrReinsurer getOriginalInsurerOrReinsurer() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.OriginalInsurerOrReinsurer) TYPE.get().getPropertyValue( this, "_OriginalInsurerOrReinsurer" );
  }


  public final void setOriginalInsurerOrReinsurer( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.OriginalInsurerOrReinsurer value ) {
    TYPE.get().setPropertyValue( this, "_OriginalInsurerOrReinsurer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAsOfDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AsOfDate" );
  }


  public final void setAsOfDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AsOfDate getAsOfDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AsOfDate) TYPE.get().getPropertyValue( this, "_AsOfDate_elem" );
  }


  public final void setAsOfDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AsOfDate value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauPeriod getBordereauPeriod() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauPeriod) TYPE.get().getPropertyValue( this, "_BordereauPeriod" );
  }


  public final void setBordereauPeriod( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauPeriod value ) {
    TYPE.get().setPropertyValue( this, "_BordereauPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AccountPeriod getAccountPeriod() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AccountPeriod) TYPE.get().getPropertyValue( this, "_AccountPeriod" );
  }


  public final void setAccountPeriod( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AccountPeriod value ) {
    TYPE.get().setPropertyValue( this, "_AccountPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBordereauAmendedIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BordereauAmendedIndicator" );
  }


  public final void setBordereauAmendedIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BordereauAmendedIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmendedIndicator getBordereauAmendedIndicator_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmendedIndicator) TYPE.get().getPropertyValue( this, "_BordereauAmendedIndicator_elem" );
  }


  public final void setBordereauAmendedIndicator_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauAmendedIndicator value ) {
    TYPE.get().setPropertyValue( this, "_BordereauAmendedIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSupportingIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SupportingIndicator" );
  }


  public final void setSupportingIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SupportingIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SupportingIndicator getSupportingIndicator_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SupportingIndicator) TYPE.get().getPropertyValue( this, "_SupportingIndicator_elem" );
  }


  public final void setSupportingIndicator_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SupportingIndicator value ) {
    TYPE.get().setPropertyValue( this, "_SupportingIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCorrectionIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CorrectionIndicator" );
  }


  public final void setCorrectionIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CorrectionIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CorrectionIndicator getCorrectionIndicator_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CorrectionIndicator) TYPE.get().getPropertyValue( this, "_CorrectionIndicator_elem" );
  }


  public final void setCorrectionIndicator_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CorrectionIndicator value ) {
    TYPE.get().setPropertyValue( this, "_CorrectionIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredTechAccount getReferredTechAccount() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredTechAccount) TYPE.get().getPropertyValue( this, "_ReferredTechAccount" );
  }


  public final void setReferredTechAccount( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredTechAccount value ) {
    TYPE.get().setPropertyValue( this, "_ReferredTechAccount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredBordereau getReferredBordereau() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredBordereau) TYPE.get().getPropertyValue( this, "_ReferredBordereau" );
  }


  public final void setReferredBordereau( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredBordereau value ) {
    TYPE.get().setPropertyValue( this, "_ReferredBordereau", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contract getContract() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contract) TYPE.get().getPropertyValue( this, "_Contract" );
  }


  public final void setContract( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contract value ) {
    TYPE.get().setPropertyValue( this, "_Contract", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferenceCurrency getReferenceCurrency() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferenceCurrency) TYPE.get().getPropertyValue( this, "_ReferenceCurrency" );
  }


  public final void setReferenceCurrency( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferenceCurrency value ) {
    TYPE.get().setPropertyValue( this, "_ReferenceCurrency", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauSection> getBordereauSection() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauSection>) TYPE.get().getPropertyValue( this, "_BordereauSection" );
  }


  public final void setBordereauSection( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauSection> value ) {
    TYPE.get().setPropertyValue( this, "_BordereauSection", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.BordereauType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.BordereauType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.BordereauType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.BordereauType_Sender getSender() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.BordereauType_Sender) TYPE.get().getPropertyValue( this, "_Sender" );
  }


  public final void setSender( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.BordereauType_Sender value ) {
    TYPE.get().setPropertyValue( this, "_Sender", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.BordereauType_Receiver getReceiver() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.BordereauType_Receiver) TYPE.get().getPropertyValue( this, "_Receiver" );
  }


  public final void setReceiver( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.BordereauType_Receiver value ) {
    TYPE.get().setPropertyValue( this, "_Receiver", value );
  }

}
