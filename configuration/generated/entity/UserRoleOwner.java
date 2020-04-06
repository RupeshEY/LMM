package entity;

/**
 * UserRoleOwner
 * 
 *     Interface for entities which have a UserRole array for "secondary" assignments.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UserRoleOwner.eti;UserRoleOwner.eix;UserRoleOwner.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface UserRoleOwner extends entity.Editable, gw.api.assignment.UserRoleOwner {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.UserRoleOwner> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.UserRoleOwner>("entity.UserRoleOwner");
  
  
}