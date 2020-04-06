package entity;

/**
 * OrdereddLoaderObject
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OrdereddLoaderObject.eti;OrdereddLoaderObject.eix;OrdereddLoaderObject.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface OrdereddLoaderObject extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.OrdereddLoaderObject> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.OrdereddLoaderObject>("entity.OrdereddLoaderObject");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXECUTIONORDER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ExecutionOrder", "ExecutionOrder");
  
  /**
   * Gets the value of the ExecutionOrder field.
   * Order of execution (1-N).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExecutionOrder();
  
  
  /**
   * Sets the value of the ExecutionOrder field.
   */
  public void setExecutionOrder(java.lang.Integer value);
  
  
  
}