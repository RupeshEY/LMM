package entity;

/**
 * TransactionTAccountOperationsDelegate
 * 
 *     Delegate used by Transactions for operations on its TAccounts.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionTAccountOperationsDelegate.eti;TransactionTAccountOperationsDelegate.eix;TransactionTAccountOperationsDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface TransactionTAccountOperationsDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TransactionTAccountOperationsDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TransactionTAccountOperationsDelegate>("entity.TransactionTAccountOperationsDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LIFECYCLESTATE_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("LifeCycleState", "LifeCycleState");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("Status", "Status");
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionLifeCycleState getLifeCycleState();
  
  
  /**
   * Gets the value of the Status field.
   * Status of the transaction. Further refines the LifeCycleState. Can only change status directly to another status in the same LifeCycleState, which does not affect Taccounts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionStatus getStatus();
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.TransactionStatus value);
  
  
  
}