package entity;

/**
 * OrderedItemDelegate
 * 
 *         Used for array entities which need to maintain creation order, typically for display in the UI.
 *         Should be used in conjunction with an index on the array owner foreign key and the retired field
 *         to ensure that each item in the array has a unique order.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OrderedItemDelegate.eti;OrderedItemDelegate.eix;OrderedItemDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface OrderedItemDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.OrderedItemDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.OrderedItemDelegate>("entity.OrderedItemDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ITEMORDER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ItemOrder", "ItemOrder");
  
  /**
   * Gets the value of the ItemOrder field.
   * Used to order items in creation order, must be unique per incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getItemOrder();
  
  
  /**
   * Sets the value of the ItemOrder field.
   */
  public void setItemOrder(java.lang.Integer value);
  
  
  
}