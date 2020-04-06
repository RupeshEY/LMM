package entity;

/**
 * CommonContactContact
 * 
 *       Allows code to operate on those common properties held by either {@link ContactContact} or <code>ABContactContact</code>.
 *       This is a shared delegate/interface that allows code-sharing in cases where code might be used by both ContactManager
 *       and another Guidewire application.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CommonContactContact.eti;CommonContactContact.eix;CommonContactContact.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface CommonContactContact extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.CommonContactContact> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.CommonContactContact>("entity.CommonContactContact");
  
  /**
   * This will return the bidirectional relationship type  from the other contact in this relationship
   * to the primaryContact
   * @param otherContact either source or target
   * @param bidiRel relatioship from primaryContact to otherContact
   * @return the bidiRel for the otherContact
   */
  public typekey.ContactBidiRel getOtherBidiRel(entity.CommonContact otherContact, typekey.ContactBidiRel bidiRel);
  
  
  
}