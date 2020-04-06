package entity;

/**
 * CommonContact
 * 
 *       This is a shared delegate/interface which allows code to operate on those common
 *       properties held by either Contact or ABContact entities. This allows code-sharing in cases where code might
 *       be used by both ContactManager and another Guidewire application.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CommonContact.eti;CommonContact.eix;CommonContact.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface CommonContact extends gw.pl.persistence.core.Bean, com.guidewire.pl.domain.contact.CommonContactAdapter {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.CommonContact> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.CommonContact>("entity.CommonContact");
  
  /**
   * Gets the contact related to this contact via the given relationship.
   * @param relationship a "zeroorone" cardinality relationship
   * @throws IllegalArgumentException if the given relationship does not have "zeroorone" cardinality
   * @return the related contact, or null if no contact is related to this contact via the given relationship.
   */
  public entity.CommonContact getCommonContactByRelationship(typekey.ContactBidiRel relationship);
  
  
  /**
   * Gets the contacts related to this contact via the given relationship.
   * @param relationship a relationship
   * @return the related contacts, or an empty array if no contacts are related to this contact via the given relationship.
   */
  public entity.CommonContact[] getCommonContactsByRelationship(typekey.ContactBidiRel relationship);
  
  
  /**
   * Sets the contact related to this contact via the given relationship.
   * @param relationship a "zeroorone" cardinality relationship
   * @param contact the related contact
   * @throws IllegalArgumentException if the given relationship does not have "zeroorone" cardinality
   */
  public void setCommonContactByRelationship(typekey.ContactBidiRel relationship, entity.CommonContact contact);
  
  
  /**
   * Validates all relationships to make sure they adhere to type and cardinality constraints.
   * @return 
   */
  public com.guidewire.pl.web.validation.InternalValidationResult validateRelationships();
  
  
  
}