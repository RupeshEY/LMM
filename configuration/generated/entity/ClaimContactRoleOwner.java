package entity;

/**
 * ClaimContactRoleOwner
 * Interface for entities that can "own" ClaimContactRoles. Marking an entity as a
 *   ClaimContactRoleOwner means that it can be associated with ContactRoles. In practical terms, this means the entity
 *   will get ContactRole-based accessors that can then be used as items in NVVs. This gives a customers a way to add
 *   arbitrary Contacts to an entity, and have those roles appear in Parties Involved.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimContactRoleOwner.eti;ClaimContactRoleOwner.eix;ClaimContactRoleOwner.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface ClaimContactRoleOwner extends entity.Editable, gw.api.contact.ClaimContactRoleOwner {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimContactRoleOwner> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimContactRoleOwner>("entity.ClaimContactRoleOwner");
  
  /**
   * Determines whether this owner can be edited.
   */
  public boolean canEdit();
  
  
  /**
   * Determines whether or not the given role can be added to this ClaimContactRoleOwner. If not, returns a failure
   * object describing the problem.
   * @param role 
   * @param contact 
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkAddRole(typekey.ContactRole role, entity.Contact contact);
  
  
  /**
   * Determines whether or not the given role can be removed the given number of times.
   * @param role 
   * @param count number of instances of the role to be removed
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkRemoveRole(typekey.ContactRole role, int count);
  
  
  /**
   * Checks the addition of the given role to the given contact, after it has occurred. To check the validity
   * of adding a role before it has occurred, use
   * {@link ClaimContactRoleOwner#checkAddRole(typekey.ContactRole, entity.Contact)}
   * instead.
   * @param role 
   * @param contact 
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleAdded(typekey.ContactRole role, entity.Contact contact);
  
  
  /**
   * Checks the removal of the given role, after it has occurred. To check the validity
   * of removing a role before it has occurred, use
   * {@link ClaimContactRoleOwner#checkRemoveRole(typekey.ContactRole, int)}
   * instead.
   * @param role 
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleRemoved(typekey.ContactRole role);
  
  
  /**
   */
  public void clearRoleCache();
  
  
  /**
   */
  public java.util.List<typekey.ContactRole> getAllowedContactRolesForEntity();
  
  
  /**
   * Get the directly related ClaimContact with the given exclusive role.
   * @param role An exclusive role
   * @throws IllegalArgumentException if the role is not exclusive
   * @return ClaimContact or null if none exists
   */
  public entity.ClaimContact getClaimContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException;
  
  
  /**
   * Gets the ClaimContactRole in the given exclusive role.
   * @param role An exclusive role
   * @throws IllegalArgumentException if the role is not exclusive
   * @return ClaimContactRole or null if none exists.
   */
  public entity.ClaimContactRole getClaimContactRoleByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException;
  
  
  /**
   * Gets the directly related ClaimContactRoles in the given role.
   * @param role 
   */
  public entity.ClaimContactRole[] getClaimContactRolesByRole(typekey.ContactRole role);
  
  
  /**
   * Gets the directly related ClaimContacts with the given role.
   * @param role 
   */
  public entity.ClaimContact[] getClaimContactsByRole(typekey.ContactRole role);
  
  
  public entity.ClaimContact[] getClaimContactsByRoles(typekey.ContactRole[] roles);
  
  
  /**
   * Gets the directly related ClaimContacts for all roles - all claim contacts owned by this
   * object.
   * <br>If you need all contacts, including those that are indirectly related to the Claim, use
   * {@link entity.Claim#getContacts()}
   */
  public entity.ClaimContact[] getClaimContactsForAllRoles();
  
  
  /**
   * Gets the contact serving in an exclusive role on this entity. This method should only be used with Exclusive
   * roles. As an alternative to calling this method, you can read the value of the property with the name of the role.
   * @param role 
   * @throws IllegalArgumentException if the role is not exclusive
   * @return Contact or null if none exists
   */
  public entity.Contact getContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException;
  
  
  /**
   * Gets the directly related Contact in the given role on this entity. This method returns only contacts attached
   * directly to the entity. Contacts attached to the entity's sub-objects are not returned.
   * @param role 
   */
  public entity.Contact[] getContactsByRole(typekey.ContactRole role);
  
  
  public entity.Contact[] getContactsByRoles(typekey.ContactRole[] role);
  
  
  /**
   * 
   * @param role 
   */
  public entity.Contact[] getContactsExcludeRole(typekey.ContactRole role);
  
  
  public entity.Contact[] getContactsExcludeRoles(typekey.ContactRole[] roles);
  
  
  /**
   * Return all the non-exclusive claim contact roles for this owner
   * @return a list of claim contact role objects, possibly empty but never null
   */
  public entity.ClaimContactRole[] getNonExclusiveRoles();
  
  
  /**
   * Return all non-exclusive contact roles which are suitable for this owner's type and the
   * given contact. Used in the UI to restrict the user to suitable choices when adding a new
   * contact/role pair to the role owner
   * @param contact a contact, possibly null
   * @return an array of suitable roles, or an empty array if there are none
   */
  public typekey.ContactRole[] getSuitableNonExclusiveRolesFor(entity.Contact contact);
  
  
  /**
   * Determines whether some data on the contact in the given role has changed.
   * @param role 
   */
  public boolean isContactInRoleChanged(typekey.ContactRole role);
  
  
  /**
   * Determines whether the contact in the given role is a different contact than the one originally
   * in the role.
   * @param role 
   */
  public boolean isContactInRoleDifferent(typekey.ContactRole role);
  
  
  /**
   * Determines whether or not the given role has the 'Exclusive' constraint on this object.
   * @param role a contact role, cannot be null
   */
  public boolean isExclusiveRole(typekey.ContactRole role);
  
  
  /**
   * Determines whether or not the given role has the given constraint on this object.
   * @param role 
   * @param constraintType 
   */
  public boolean isRoleConstrained(typekey.ContactRole role, com.guidewire.cc.domain.contact.config.RoleConstraintType constraintType);
  
  
  /**
   * Removes all roles associated with this ClaimContactRoleOwner.
   */
  public void removeAllRoles();
  
  
  /**
   * Removes the given role from the given Contact. Does nothing if the Contact does not have the role. This method
   * should only be used with Required or ZeroToMore roles.
   * @param role Role that is not exclusive
   * @param contact 
   * @throws IllegalArgumentException if the role is exclusive or prohibited, or the Contact is null or not of the
   * right type for the given role. For exclusive roles, use
   * {@link ClaimContactRoleOwner#setContactByRole(ContactRole, Contact)} instead.
   */
  public void removeRole(typekey.ContactRole role, entity.Contact contact);
  
  
  /**
   * Validates the ClaimContactRole assignments for this ClaimContactRoleOwner. Checks all applicable RoleConstraints.
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure[] validateRoles();
  
  
  
}