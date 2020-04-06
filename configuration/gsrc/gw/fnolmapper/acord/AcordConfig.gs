package gw.fnolmapper.acord

uses gw.api.fnolmapper.FNOLMapperConfig
uses gw.util.TypeKeyMap
uses gw.entity.ITypeList
uses gw.entity.TypeKey
uses gw.api.util.TypecodeMapper
uses gw.fnolmapper.acord.impl.AcordMapperFactory
uses org.slf4j.Logger

/**
 * Configuration class for accessing common configurable ACORD functionality.
 */
 @Export
class AcordConfig {
  
  public static final var ACCORD_CONFIG_DIR:String = "acord"
  public static final var ACORD_MAPPER_NS:String = "acord"
  
  var mapperConfig:FNOLMapperConfig
  var typecodeMapper:TypecodeMapper
  
  construct() {
    mapperConfig = new FNOLMapperConfig(ACCORD_CONFIG_DIR)
    typecodeMapper = mapperConfig.getTypecodeMapper()
  }
  
  /**
   * Returns an instance of the desired implementation of IMapperFactory.
   */
  protected function createMapperFactory() : IMapperFactory {
    return new AcordMapperFactory(this)
  }
  
  public function getLogger() : Logger {
    return mapperConfig.getLogger()
  }
  
  /**
   * Returns the instance of IMapperFactory.
   */
  property get MapperFactory() : IMapperFactory {
    return createMapperFactory()
  }
  
  //gets the type list converter for PolicyType
  function getPolicyTypeMap() : TypeKeyMap<PolicyType> {
    return getTypeKeyMap(PolicyType as ITypeList<PolicyType>)
  }

  //gets the type list converter for CoverageType
  function getCoverageTypeMap() : TypeKeyMap<CoverageType> {
    return getTypeKeyMap(CoverageType as ITypeList<CoverageType>)
  }
  
  //gets the type list converter for LossType
  function getLossTypeMap() : TypeKeyMap<LossType> {
    return getTypeKeyMap(LossType as ITypeList<LossType>)
  }
  
  //gets the type list converter for BodyPartType
  function getBodyPartTypeMap() : TypeKeyMap<BodyPartType> {
    return getTypeKeyMap(BodyPartType as ITypeList<BodyPartType>)
  }

  //gets the type list converter for MaritalStatus
  function getMaritalStatusTypeMap() : TypeKeyMap<MaritalStatus> {
    return getTypeKeyMap(MaritalStatus as ITypeList<MaritalStatus>)
  }
  
  //get the type list converter for EmploymentStatus
  function getEmploymentStatusTypeMap() : TypeKeyMap<EmploymentStatusType> {
    return getTypeKeyMap(EmploymentStatusType as ITypeList<EmploymentStatusType>)
  }
  
  //gets the type list converter for AddressType
  function getAddressTypeMap() : TypeKeyMap<AddressType> {
    return  getTypeKeyMap(AddressType as ITypeList<AddressType>)
  }
  
  //gets the type list converter for ContactRole
  function getContactRoleMap() : TypeKeyMap<ContactRole> {
    return getTypeKeyMap(ContactRole as ITypeList<ContactRole>)
  }
  
  //gets the type list converter for LOBCode
  function getLOBTypeMap() : TypeKeyMap<LOBCode> {
    return getTypeKeyMap(LOBCode as ITypeList<LOBCode>)
  }
  
  //get the type list converter for PersonRelationType
  function getPersonRelationTypeMap() : TypeKeyMap<PersonRelationType> {
    return getTypeKeyMap(PersonRelationType as ITypeList<PersonRelationType>)
  }
  
  /**
   * Returns a TypeKeyMap for the given TypeList
   */
  private function getTypeKeyMap<T extends TypeKey>(typeList:ITypeList<T>):TypeKeyMap<T> {
    var tkm = new TypeKeyMap<T>(typeList, ACORD_MAPPER_NS, typecodeMapper)
    //if has a "catch-all" typekey will be configured here
    tkm.DefaultKey = mapperConfig.DefaultKey
    return tkm
  }
}
