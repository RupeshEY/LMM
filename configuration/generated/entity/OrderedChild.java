package entity;

/**
 * OrderedChild
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OrderedChild.eti;OrderedChild.eix;OrderedChild.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface OrderedChild extends entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.OrderedChild> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.OrderedChild>("entity.OrderedChild");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ORDERNUMBER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("OrderNumber", "OrderNumber");
  
  /**
   * Gets the value of the OrderNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOrderNumber();
  
  
  /**
   * Sets the value of the OrderNumber field.
   */
  public void setOrderNumber(java.lang.Integer value);
  
  
  
}