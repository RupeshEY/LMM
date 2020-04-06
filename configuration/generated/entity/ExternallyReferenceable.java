package entity;

/**
 * ExternallyReferenceable
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExternallyReferenceable.eti;ExternallyReferenceable.eix;ExternallyReferenceable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface ExternallyReferenceable extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ExternallyReferenceable> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ExternallyReferenceable>("entity.ExternallyReferenceable");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REFCODE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("RefCode", "RefCode");
  
  /**
   * Gets the value of the RefCode field.
   * The reference code for this entity on an external system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRefCode();
  
  
  /**
   * Sets the value of the RefCode field.
   */
  public void setRefCode(java.lang.String value);
  
  
  
}