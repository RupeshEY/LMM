package entity;

/**
 * Approvable
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Approvable.eti;Approvable.eix;Approvable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface Approvable extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Approvable> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Approvable>("entity.Approvable");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPROVALDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ApprovalDate", "ApprovalDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> APPROVALSTATUS_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("ApprovalStatus", "ApprovalStatus");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> REQUESTINGUSER_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("RequestingUser", "RequestingUserID");
  
  /**
   * Gets the value of the ApprovalDate field.
   * The date when the object was ultimately approved or rejected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getApprovalDate();
  
  
  /**
   * Gets the value of the ApprovalStatus field.
   * The approval status of the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ApprovalStatus getApprovalStatus();
  
  
  /**
   * Gets the value of the RequestingUser field.
   * The user submitting the object for approval
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getRequestingUser();
  
  
  /**
   * Sets the value of the ApprovalDate field.
   */
  public void setApprovalDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ApprovalStatus field.
   */
  public void setApprovalStatus(typekey.ApprovalStatus value);
  
  
  /**
   * Sets the value of the RequestingUser field.
   */
  public void setRequestingUser(entity.User value);
  
  
  
}