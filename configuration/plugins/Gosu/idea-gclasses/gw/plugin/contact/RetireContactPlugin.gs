package gw.plugin.contact
uses java.util.Set
uses gw.entity.IEntityPropertyInfo
uses java.util.HashSet

/**
 * Implementation of IRetireContactPlugin
 */
@Export
class RetireContactPlugin implements IRetireContactPlugin {

  /**
   * If there are any extensions with FK to Contact that can be retired without having
   * to check the instance, then add that property to this set.
   */  
  private final var SAFE_PROPERTY_SET : Set<IEntityPropertyInfo> = new HashSet<IEntityPropertyInfo>( { 
    ContactAddress.Type.TypeInfo.getProperty("Contact") as IEntityPropertyInfo,
    ContactCategoryScore.Type.TypeInfo.getProperty("Contact") as IEntityPropertyInfo,
    ContactTag.Type.TypeInfo.getProperty("Contact") as IEntityPropertyInfo,
    EFTData.Type.TypeInfo.getProperty("Contact") as IEntityPropertyInfo,
    OfficialID.Type.TypeInfo.getProperty("Contact") as IEntityPropertyInfo,
    Review.Type.TypeInfo.getProperty("Contact") as IEntityPropertyInfo,
    ContactFingerprint.Type.TypeInfo.getProperty("Contact") as IEntityPropertyInfo
  })
  

  /**
   * The set of properties representing the safe FKs to Contact, i.e. the FKs from entities
   * that can be retired when the Contact is retired without any further validation. In general
   * entities which have FKs to Contact that are not in this set will prevent the a Contact being
   * retired if there's an instance of that entity with the FK link to the Contact. To override
   * that behavior the entity can implement the ContactRetireBean interface.
   * 
   * @see ContactRetireBean
   * @see ContactRetireHelper#retireContact
   */
  override property get SafePropertiesForContactRetirement() : Set<IEntityPropertyInfo> {
    return SAFE_PROPERTY_SET
  }
}
