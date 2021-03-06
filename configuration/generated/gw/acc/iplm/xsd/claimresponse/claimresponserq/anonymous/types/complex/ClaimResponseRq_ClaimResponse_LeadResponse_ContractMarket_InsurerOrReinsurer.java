/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AgreementPartyModifiedIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "AgreementPartyModifiedIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Party = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Party", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Contact = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Contact", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponserq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer" );
    }
  };

  public ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer() {
    super( 1657244565, TYPE.get() );
  }

  private ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1657244565, state );
  }

  protected ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimresponse.claimresponserq.enums.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer_AgreementPartyModifiedIndicator getAgreementPartyModifiedIndicator() {
    return (gw.acc.iplm.xsd.claimresponse.claimresponserq.enums.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer_AgreementPartyModifiedIndicator) TYPE.get().getPropertyValue( this, "_AgreementPartyModifiedIndicator" );
  }


  public final void setAgreementPartyModifiedIndicator( gw.acc.iplm.xsd.claimresponse.claimresponserq.enums.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer_AgreementPartyModifiedIndicator value ) {
    TYPE.get().setPropertyValue( this, "_AgreementPartyModifiedIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer_AgreementPartyModifiedIndicator getAgreementPartyModifiedIndicator_elem() {
    return (gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer_AgreementPartyModifiedIndicator) TYPE.get().getPropertyValue( this, "_AgreementPartyModifiedIndicator_elem" );
  }


  public final void setAgreementPartyModifiedIndicator_elem( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_ContractMarket_InsurerOrReinsurer_AgreementPartyModifiedIndicator value ) {
    TYPE.get().setPropertyValue( this, "_AgreementPartyModifiedIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party getParty() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party) TYPE.get().getPropertyValue( this, "_Party" );
  }


  public final void setParty( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party value ) {
    TYPE.get().setPropertyValue( this, "_Party", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contact getContact() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contact) TYPE.get().getPropertyValue( this, "_Contact" );
  }


  public final void setContact( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contact value ) {
    TYPE.get().setPropertyValue( this, "_Contact", value );
  }

}
