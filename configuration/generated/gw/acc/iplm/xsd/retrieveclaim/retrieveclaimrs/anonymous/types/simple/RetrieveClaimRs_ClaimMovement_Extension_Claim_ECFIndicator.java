/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.String.class)
public class RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator extends gw.xml.XmlTypeInstance {

  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator" );
    }
  };

  public RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator() {
    super( 2138617895, TYPE.get() );
  }

  public RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator value ) {
    this();
    setValue( value );
  }

  private RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 2138617895, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator getValue() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator get$Value() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_Claim_ECFIndicator value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}