package entity;

/**
 * TAccountLineItemDelegate
 * The delegate for TAccountLineItem types. An entry of a specific amount of money,
 *     either crediting or debiting one T-account. A TAccountTransaction will contain a pair
 *     of balancing TAccountLineItems - a debit to one T-account and an equal credit to another.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TAccountLineItemDelegate.eti;TAccountLineItemDelegate.eix;TAccountLineItemDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface TAccountLineItemDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TAccountLineItemDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TAccountLineItemDelegate>("entity.TAccountLineItemDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AMOUNT_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Amount", "Amount");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RPTAMOUNT_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("RptAmount", "RptAmount");
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAmount();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRptAmount();
  
  
  
}