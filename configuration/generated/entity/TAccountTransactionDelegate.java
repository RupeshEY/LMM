package entity;

/**
 * TAccountTransactionDelegate
 * Delegate for the TAccountTransaction types (normal/plain and RI).
 *     Contains the TAccountLineItems that change a pair of T-accounts to account for a transaction as it moves
 *     through its LifeCycle States. For example, when a reserve becomes committed, it is debited (removed from) Pending Approval ReservesXX
 *     T-Account and added (credited) to the ReservesXX T-Account.  Each TAccountTransaction has a link to its succeeding TAccountTransaction,
 *     thus providing a history of the life of the associated transaction. It may have 2 or 4 TAccountLineItemDelegates: 2 to undo previous contributions,
 *     and 2 to effect the new contributions. If one of the previous or target states does not have a T-account (i.e. New, Rejected), then there will
 *     be only 2 line items.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TAccountTransactionDelegate.eti;TAccountTransactionDelegate.eix;TAccountTransactionDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface TAccountTransactionDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TAccountTransactionDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TAccountTransactionDelegate>("entity.TAccountTransactionDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMENTS_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Comments", "Comments");
  
  /**
   * Gets the value of the Comments field.
   * Comments about the transaction, such as the LifeCycleState transition for which it was created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  
}