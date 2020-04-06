package entity;

/**
 * DecentralizedEntity
 * 
 *     A delegate containing the foreign key for decentralized admin entities.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DecentralizedEntity.eti;DecentralizedEntity.eix;DecentralizedEntity.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface DecentralizedEntity extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DecentralizedEntity> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DecentralizedEntity>("entity.DecentralizedEntity");
  
  public static final com.guidewire.commons.metadata.types.LinkDynPropertyInfo ORGANIZATION_DYNPROP = com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods.ORGANIZATION_DYNPROP;
  
  public static final com.guidewire.commons.metadata.types.LinkPropertyInfoCache ORGANIZATION_PROP = com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods.ORGANIZATION_PROP;
  
  public entity.Organization getOrganization();
  
  
  public gw.pl.persistence.core.Key getOrganizationID();
  
  
  public void setOrganization(entity.Organization value);
  
  
  public void setOrganizationID(gw.pl.persistence.core.Key value);
  
  
  
}