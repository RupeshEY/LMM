/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ReferredPlacingType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferredPlacingType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UUId = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UUId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CedentReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CedentReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverHolderReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CoverHolderReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrokerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BrokerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProviderReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ServiceProviderReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlacingExchangeReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PlacingExchangeReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReinsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReinsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InsurerReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreationDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CreationDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlacingStage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PlacingStage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlacingTransactionFunction = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PlacingTransactionFunction", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractVersionDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ContractVersionDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlacingResponseVersionDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PlacingResponseVersionDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ReferredPlacingType" );
    }
  };

  public ReferredPlacingType() {
    super( 814394347, TYPE.get() );
  }

  private ReferredPlacingType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 814394347, state );
  }

  protected ReferredPlacingType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ReferredPlacingType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ReferredPlacingType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.ReferredPlacingType get$TypeInstance() {
    return this;
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.UUId getUUId_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.UUId) TYPE.get().getPropertyValue( this, "_UUId_elem" );
  }


  public final void setUUId_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.UUId value ) {
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CedentReference getCedentReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CedentReference) TYPE.get().getPropertyValue( this, "_CedentReference_elem" );
  }


  public final void setCedentReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CedentReference value ) {
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CoverHolderReference getCoverHolderReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CoverHolderReference) TYPE.get().getPropertyValue( this, "_CoverHolderReference_elem" );
  }


  public final void setCoverHolderReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CoverHolderReference value ) {
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BrokerReference getBrokerReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BrokerReference) TYPE.get().getPropertyValue( this, "_BrokerReference_elem" );
  }


  public final void setBrokerReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.BrokerReference value ) {
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ServiceProviderReference getServiceProviderReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ServiceProviderReference) TYPE.get().getPropertyValue( this, "_ServiceProviderReference_elem" );
  }


  public final void setServiceProviderReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ServiceProviderReference value ) {
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingExchangeReference getPlacingExchangeReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingExchangeReference) TYPE.get().getPropertyValue( this, "_PlacingExchangeReference_elem" );
  }


  public final void setPlacingExchangeReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingExchangeReference value ) {
    TYPE.get().setPropertyValue( this, "_PlacingExchangeReference_elem", value );
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinsurerReference getReinsurerReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinsurerReference) TYPE.get().getPropertyValue( this, "_ReinsurerReference_elem" );
  }


  public final void setReinsurerReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReinsurerReference value ) {
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerReference getInsurerReference_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerReference) TYPE.get().getPropertyValue( this, "_InsurerReference_elem" );
  }


  public final void setInsurerReference_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InsurerReference value ) {
    TYPE.get().setPropertyValue( this, "_InsurerReference_elem", value );
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CreationDate getCreationDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CreationDate) TYPE.get().getPropertyValue( this, "_CreationDate_elem" );
  }


  public final void setCreationDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CreationDate value ) {
    TYPE.get().setPropertyValue( this, "_CreationDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPlacingStage() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PlacingStage" );
  }


  public final void setPlacingStage( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PlacingStage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingStage getPlacingStage_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingStage) TYPE.get().getPropertyValue( this, "_PlacingStage_elem" );
  }


  public final void setPlacingStage_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingStage value ) {
    TYPE.get().setPropertyValue( this, "_PlacingStage_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPlacingTransactionFunction() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PlacingTransactionFunction" );
  }


  public final void setPlacingTransactionFunction( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PlacingTransactionFunction", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingTransactionFunction getPlacingTransactionFunction_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingTransactionFunction) TYPE.get().getPropertyValue( this, "_PlacingTransactionFunction_elem" );
  }


  public final void setPlacingTransactionFunction_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingTransactionFunction value ) {
    TYPE.get().setPropertyValue( this, "_PlacingTransactionFunction_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getContractVersionDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ContractVersionDate" );
  }


  public final void setContractVersionDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ContractVersionDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ContractVersionDate getContractVersionDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ContractVersionDate) TYPE.get().getPropertyValue( this, "_ContractVersionDate_elem" );
  }


  public final void setContractVersionDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ContractVersionDate value ) {
    TYPE.get().setPropertyValue( this, "_ContractVersionDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPlacingResponseVersionDateTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PlacingResponseVersionDateTime" );
  }


  public final void setPlacingResponseVersionDateTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PlacingResponseVersionDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingResponseVersionDateTime getPlacingResponseVersionDateTime_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingResponseVersionDateTime) TYPE.get().getPropertyValue( this, "_PlacingResponseVersionDateTime_elem" );
  }


  public final void setPlacingResponseVersionDateTime_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PlacingResponseVersionDateTime value ) {
    TYPE.get().setPropertyValue( this, "_PlacingResponseVersionDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ReferredPlacingType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ReferredPlacingType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.ReferredPlacingType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}