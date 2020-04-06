package entity;

/**
 * TAccountDelegate
 * The delegate for TAccount and RITAccount.
 *     TAccounts are used in ClaimCenter to provide a rolled-up view of all financials transactions
 *     entered into the system.  Each Reserve Line (unique combination of Claim, Exposure, Cost Type and Cost Category) has
 *     22 distinct TAccounts that together represent every possible life cycle state for each of the four transaction subtypes
 *     (Payment, Reserve, Recovery and Recovery Reserve).  The Taccounts occur in pairs; a debit account (example: ReservesXX,
 *     which holds the amount of a reserve) and a matching credit account (example: Cash Out). Every life cycle state transition
 *     for a transaction (e.g., from pending-approval to awaiting-submission) affects one debit and one credit T-account equally
 *     (example: a payment debits ReservesXX and credits Cash Out).  ClaimCenter provides useful calculated values by combining
 *     the balances of various TAccounts as appropriate.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TAccountDelegate.eti;TAccountDelegate.eix;TAccountDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface TAccountDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TAccountDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TAccountDelegate>("entity.TAccountDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREDITBALANCE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CreditBalance", "CreditBalance");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREDITRPTBALANCE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CreditRptBalance", "CreditRptBalance");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEBITBALANCE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("DebitBalance", "DebitBalance");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEBITRPTBALANCE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("DebitRptBalance", "DebitRptBalance");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> NORMALBALANCE_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("NormalBalance", "NormalBalance");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMCONTRIBUTINGTXNS_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("NumContributingTxns", "NumContributingTxns");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TACCOUNTTYPE_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("TAccountType", "TAccountType");
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCreditBalance();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCreditRptBalance();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDebitBalance();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDebitRptBalance();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LedgerSide getNormalBalance();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumContributingTxns();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TAccountType getTAccountType();
  
  
  
}