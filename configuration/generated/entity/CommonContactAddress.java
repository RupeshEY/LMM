package entity;

/**
 * CommonContactAddress
 * 
 *       This is a shared delegate/interface which allows code to operate on those columns held by either
 *       ContactAddress or ABContactAddress entities. This allows code-sharing in cases where code might
 *       be used by both ContactManager and another Guidewire application.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CommonContactAddress.eti;CommonContactAddress.eix;CommonContactAddress.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface CommonContactAddress extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.CommonContactAddress> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.CommonContactAddress>("entity.CommonContactAddress");
  
  
}