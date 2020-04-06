package entity;

/**
 * ProductModelDelegate
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ProductModelDelegate.eti;ProductModelDelegate.eix;ProductModelDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface ProductModelDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ProductModelDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ProductModelDelegate>("entity.ProductModelDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SOURCEFILE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("SourceFile", "SourceFile");
  
  /**
   * Gets the value of the SourceFile field.
   * The source file in which the entity is defined
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSourceFile();
  
  
  /**
   * Sets the value of the SourceFile field.
   */
  public void setSourceFile(java.lang.String value);
  
  
  
}