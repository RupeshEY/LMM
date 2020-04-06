package entity;

/**
 * TripExpenseCancellationDelegate
 * Fields related to cancellation of a trip expense, shared by TripSegment and TripAccomodation
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripExpenseCancellationDelegate.eti;TripExpenseCancellationDelegate.eix;TripExpenseCancellationDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface TripExpenseCancellationDelegate extends entity.TripExpenseDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TripExpenseCancellationDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TripExpenseCancellationDelegate>("entity.TripExpenseCancellationDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CANCELONLY_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CancelOnly", "CancelOnly");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CANCELLATIONFEES_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CancellationFees", "CancellationFees");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REASONFORCANCELLATION_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ReasonForCancellation", "ReasonForCancellation");
  
  /**
   * Gets the value of the CancellationFees field.
   * Cancellation fees incurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getCancellationFees();
  
  
  /**
   * The currency related to this expense's Claim.
   * @return The associated Claim's currency.  Returns NULL if the Claim is currently
   *         unreachable (if, for example, the necessary entity connections have not
   *         yet been made).
   */
  public typekey.Currency getClaimCurrency();
  
  
  /**
   * Gets the value of the ReasonForCancellation field.
   * Reason for cancellation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReasonForCancellation();
  
  
  /**
   * Gets the value of the CancelOnly field.
   * Indicates if the expense is cancelled without the need for additional arrangements
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCancelOnly();
  
  
  /**
   * Sets the value of the CancelOnly field.
   */
  public void setCancelOnly(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CancellationFees field.
   */
  public void setCancellationFees(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReasonForCancellation field.
   */
  public void setReasonForCancellation(java.lang.String value);
  
  
  
}