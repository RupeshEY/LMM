/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerOrReinsurer = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "InsurerOrReinsurer", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Agency = new javax.xml.namespace.QName( "", "Agency", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket" );
    }
  };

  public RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket() {
    super( 6704250, TYPE.get() );
  }

  private RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 6704250, state );
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer> getInsurerOrReinsurer() {
    return (java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer>) TYPE.get().getPropertyValue( this, "_InsurerOrReinsurer" );
  }


  public final void setInsurerOrReinsurer( java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer> value ) {
    TYPE.get().setPropertyValue( this, "_InsurerOrReinsurer", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAgency() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Agency" );
  }


  public final void setAgency( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Agency", value );
  }

}