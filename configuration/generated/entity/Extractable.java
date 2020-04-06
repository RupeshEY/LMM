package entity;

/**
 * Extractable
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Extractable.eti;Extractable.eix;Extractable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface Extractable extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Extractable> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Extractable>("entity.Extractable");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ArchivePartition", "ArchivePartition");
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition();
  
  
  
}