/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SettlementType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "SettlementType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ApplicableValidators = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "ApplicableValidators", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UUId = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UUId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CedentReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CedentReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverHolderReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverHolderReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReinsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReinsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoInsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoInsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrokerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BrokerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProviderReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ServiceProviderReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GroupReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "GroupReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemsInGroupTotal = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ItemsInGroupTotal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProviderGroupReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ServiceProviderGroupReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProviderGroupItemsTotal = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ServiceProviderGroupItemsTotal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreationDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CreationDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FinancialAccountType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "FinancialAccountType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Cedent = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Cedent", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Reinsurer = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Reinsurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Insurer = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Insurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoInsurer = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoInsurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Broker = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Broker", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverHolder = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverHolder", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProvider = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ServiceProvider", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlacingExchange = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PlacingExchange", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AsOfDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SettlementCurrency = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "SettlementCurrency", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FinancialAccount = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "FinancialAccount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BalanceAmtItem = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BalanceAmtItem", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentMeans = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PaymentMeans", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SettlementMeansReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "SettlementMeansReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentChannel = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PaymentChannel", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IssuingBank = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "IssuingBank", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayingFinancialInstitution = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PayingFinancialInstitution", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayersFinancialInstitutionAccountNbr = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PayersFinancialInstitutionAccountNbr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReceivingFinancialInstitution = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReceivingFinancialInstitution", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayeesFinancialInstitutionAccountNbr = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PayeesFinancialInstitutionAccountNbr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SettlementDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "SettlementDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TrustFundCode = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TrustFundCode", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Sender = new javax.xml.namespace.QName( "", "Sender", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Receiver = new javax.xml.namespace.QName( "", "Receiver", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.SettlementType" );
    }
  };

  public SettlementType() {
    super( 2048689692, TYPE.get() );
  }

  private SettlementType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 2048689692, state );
  }

  protected SettlementType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SettlementType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.SettlementType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.SettlementType get$TypeInstance() {
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
  public final java.lang.String getReinsurerReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ReinsurerReference" );
  }


  public final void setReinsurerReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ReinsurerReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinsurerReference getReinsurerReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinsurerReference) TYPE.get().getPropertyValue( this, "_ReinsurerReference_elem" );
  }


  public final void setReinsurerReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinsurerReference value ) {
    TYPE.get().setPropertyValue( this, "_ReinsurerReference_elem", value );
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
  public final java.lang.String getCoInsurerReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CoInsurerReference" );
  }


  public final void setCoInsurerReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CoInsurerReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoInsurerReference getCoInsurerReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoInsurerReference) TYPE.get().getPropertyValue( this, "_CoInsurerReference_elem" );
  }


  public final void setCoInsurerReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CoInsurerReference value ) {
    TYPE.get().setPropertyValue( this, "_CoInsurerReference_elem", value );
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
  public final java.lang.String getGroupReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_GroupReference" );
  }


  public final void setGroupReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_GroupReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.GroupReference getGroupReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.GroupReference) TYPE.get().getPropertyValue( this, "_GroupReference_elem" );
  }


  public final void setGroupReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.GroupReference value ) {
    TYPE.get().setPropertyValue( this, "_GroupReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ItemsInGroupTotal getItemsInGroupTotal() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ItemsInGroupTotal) TYPE.get().getPropertyValue( this, "_ItemsInGroupTotal" );
  }


  public final void setItemsInGroupTotal( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ItemsInGroupTotal value ) {
    TYPE.get().setPropertyValue( this, "_ItemsInGroupTotal", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServiceProviderGroupReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ServiceProviderGroupReference" );
  }


  public final void setServiceProviderGroupReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ServiceProviderGroupReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProviderGroupReference getServiceProviderGroupReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProviderGroupReference) TYPE.get().getPropertyValue( this, "_ServiceProviderGroupReference_elem" );
  }


  public final void setServiceProviderGroupReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProviderGroupReference value ) {
    TYPE.get().setPropertyValue( this, "_ServiceProviderGroupReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProviderGroupItemsTotal getServiceProviderGroupItemsTotal() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProviderGroupItemsTotal) TYPE.get().getPropertyValue( this, "_ServiceProviderGroupItemsTotal" );
  }


  public final void setServiceProviderGroupItemsTotal( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProviderGroupItemsTotal value ) {
    TYPE.get().setPropertyValue( this, "_ServiceProviderGroupItemsTotal", value );
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
  public final java.lang.String getFinancialAccountType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FinancialAccountType" );
  }


  public final void setFinancialAccountType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FinancialAccountType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FinancialAccountType getFinancialAccountType_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FinancialAccountType) TYPE.get().getPropertyValue( this, "_FinancialAccountType_elem" );
  }


  public final void setFinancialAccountType_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FinancialAccountType value ) {
    TYPE.get().setPropertyValue( this, "_FinancialAccountType_elem", value );
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Broker getBroker() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Broker) TYPE.get().getPropertyValue( this, "_Broker" );
  }


  public final void setBroker( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Broker value ) {
    TYPE.get().setPropertyValue( this, "_Broker", value );
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SettlementCurrency getSettlementCurrency() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SettlementCurrency) TYPE.get().getPropertyValue( this, "_SettlementCurrency" );
  }


  public final void setSettlementCurrency( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SettlementCurrency value ) {
    TYPE.get().setPropertyValue( this, "_SettlementCurrency", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FinancialAccount> getFinancialAccount() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FinancialAccount>) TYPE.get().getPropertyValue( this, "_FinancialAccount" );
  }


  public final void setFinancialAccount( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FinancialAccount> value ) {
    TYPE.get().setPropertyValue( this, "_FinancialAccount", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BalanceAmtItem getBalanceAmtItem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BalanceAmtItem) TYPE.get().getPropertyValue( this, "_BalanceAmtItem" );
  }


  public final void setBalanceAmtItem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BalanceAmtItem value ) {
    TYPE.get().setPropertyValue( this, "_BalanceAmtItem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPaymentMeans() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PaymentMeans" );
  }


  public final void setPaymentMeans( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PaymentMeans", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PaymentMeans getPaymentMeans_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PaymentMeans) TYPE.get().getPropertyValue( this, "_PaymentMeans_elem" );
  }


  public final void setPaymentMeans_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PaymentMeans value ) {
    TYPE.get().setPropertyValue( this, "_PaymentMeans_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSettlementMeansReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SettlementMeansReference" );
  }


  public final void setSettlementMeansReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SettlementMeansReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SettlementMeansReference getSettlementMeansReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SettlementMeansReference) TYPE.get().getPropertyValue( this, "_SettlementMeansReference_elem" );
  }


  public final void setSettlementMeansReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SettlementMeansReference value ) {
    TYPE.get().setPropertyValue( this, "_SettlementMeansReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPaymentChannel() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PaymentChannel" );
  }


  public final void setPaymentChannel( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PaymentChannel", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PaymentChannel getPaymentChannel_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PaymentChannel) TYPE.get().getPropertyValue( this, "_PaymentChannel_elem" );
  }


  public final void setPaymentChannel_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PaymentChannel value ) {
    TYPE.get().setPropertyValue( this, "_PaymentChannel_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.IssuingBank getIssuingBank() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.IssuingBank) TYPE.get().getPropertyValue( this, "_IssuingBank" );
  }


  public final void setIssuingBank( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.IssuingBank value ) {
    TYPE.get().setPropertyValue( this, "_IssuingBank", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PayingFinancialInstitution getPayingFinancialInstitution() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PayingFinancialInstitution) TYPE.get().getPropertyValue( this, "_PayingFinancialInstitution" );
  }


  public final void setPayingFinancialInstitution( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PayingFinancialInstitution value ) {
    TYPE.get().setPropertyValue( this, "_PayingFinancialInstitution", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPayersFinancialInstitutionAccountNbr() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PayersFinancialInstitutionAccountNbr" );
  }


  public final void setPayersFinancialInstitutionAccountNbr( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PayersFinancialInstitutionAccountNbr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PayersFinancialInstitutionAccountNbr getPayersFinancialInstitutionAccountNbr_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PayersFinancialInstitutionAccountNbr) TYPE.get().getPropertyValue( this, "_PayersFinancialInstitutionAccountNbr_elem" );
  }


  public final void setPayersFinancialInstitutionAccountNbr_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PayersFinancialInstitutionAccountNbr value ) {
    TYPE.get().setPropertyValue( this, "_PayersFinancialInstitutionAccountNbr_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReceivingFinancialInstitution getReceivingFinancialInstitution() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReceivingFinancialInstitution) TYPE.get().getPropertyValue( this, "_ReceivingFinancialInstitution" );
  }


  public final void setReceivingFinancialInstitution( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReceivingFinancialInstitution value ) {
    TYPE.get().setPropertyValue( this, "_ReceivingFinancialInstitution", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPayeesFinancialInstitutionAccountNbr() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PayeesFinancialInstitutionAccountNbr" );
  }


  public final void setPayeesFinancialInstitutionAccountNbr( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PayeesFinancialInstitutionAccountNbr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PayeesFinancialInstitutionAccountNbr getPayeesFinancialInstitutionAccountNbr_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PayeesFinancialInstitutionAccountNbr) TYPE.get().getPropertyValue( this, "_PayeesFinancialInstitutionAccountNbr_elem" );
  }


  public final void setPayeesFinancialInstitutionAccountNbr_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PayeesFinancialInstitutionAccountNbr value ) {
    TYPE.get().setPropertyValue( this, "_PayeesFinancialInstitutionAccountNbr_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSettlementDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SettlementDate" );
  }


  public final void setSettlementDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SettlementDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SettlementDate getSettlementDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SettlementDate) TYPE.get().getPropertyValue( this, "_SettlementDate_elem" );
  }


  public final void setSettlementDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SettlementDate value ) {
    TYPE.get().setPropertyValue( this, "_SettlementDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTrustFundCode() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TrustFundCode" );
  }


  public final void setTrustFundCode( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TrustFundCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TrustFundCode getTrustFundCode_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TrustFundCode) TYPE.get().getPropertyValue( this, "_TrustFundCode_elem" );
  }


  public final void setTrustFundCode_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TrustFundCode value ) {
    TYPE.get().setPropertyValue( this, "_TrustFundCode_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.SettlementType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.SettlementType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.SettlementType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.SettlementType_Sender getSender() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.SettlementType_Sender) TYPE.get().getPropertyValue( this, "_Sender" );
  }


  public final void setSender( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.SettlementType_Sender value ) {
    TYPE.get().setPropertyValue( this, "_Sender", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.SettlementType_Receiver getReceiver() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.SettlementType_Receiver) TYPE.get().getPropertyValue( this, "_Receiver" );
  }


  public final void setReceiver( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.SettlementType_Receiver value ) {
    TYPE.get().setPropertyValue( this, "_Receiver", value );
  }

}