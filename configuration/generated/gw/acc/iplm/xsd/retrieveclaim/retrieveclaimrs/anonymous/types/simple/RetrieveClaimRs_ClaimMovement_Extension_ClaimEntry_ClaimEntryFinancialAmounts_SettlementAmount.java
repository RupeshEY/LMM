/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.Decimal.class)
public class RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_SettlementAmount extends gw.xml.XmlTypeInstance {

  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_SettlementAmount" );
    }
  };

  public RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_SettlementAmount() {
    super( 1285485580, TYPE.get() );
  }

  public RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_SettlementAmount( java.math.BigDecimal value ) {
    this();
    setValue( value );
  }

  private RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_SettlementAmount( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1285485580, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_SettlementAmount> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.simple.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_SettlementAmount get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getValue() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal get$Value() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}
