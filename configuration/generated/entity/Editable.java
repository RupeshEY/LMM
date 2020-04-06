package entity;

/**
 * Editable
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Editable.eti;Editable.eix;Editable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface Editable extends entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Editable> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Editable>("entity.Editable");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CreateTime", "CreateTime");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("CreateUser", "CreateUserID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("UpdateTime", "UpdateTime");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("UpdateUser", "UpdateUserID");
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public java.lang.Integer getBeanVersion();
  
  
  /**
   * Gets the value of the CreateTime field.
   * Timestamp when the object was created
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime();
  
  
  /**
   * Gets the value of the CreateUser field.
   * User who created the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreateUser();
  
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public gw.pl.persistence.core.Key getID();
  
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public java.lang.String getPublicID();
  
  
  /**
   * Gets the value of the UpdateTime field.
   * Timestamp when the object was last updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime();
  
  
  /**
   * Gets the value of the UpdateUser field.
   * User who last updated the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUpdateUser();
  
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew();
  
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh();
  
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove();
  
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id);
  
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch();
  
  
  
}