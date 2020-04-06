package gw.plugin.pcintegration.pc800

uses gw.api.util.TypeUtil
uses gw.lang.reflect.IPropertyInfo
uses gw.api.util.mapping.IFieldMapper
uses gw.plugin.integration.mapping.NullFieldMapper
uses gw.api.util.mapping.NameTranslatorImpl

uses java.io.File
uses gw.lang.reflect.TypeSystem
uses gw.lang.reflect.IType
uses gw.api.system.CCLoggerCategory
uses gw.lang.reflect.java.JavaTypes

/**
 * An extension of the default NameTranslator that ignores the PublicID field.
 */
@Export
class PolicyNameTranslatorImpl extends NameTranslatorImpl {
  construct( file : File, sourceNamespace : String, targetNamespace : String ) {
    super( file, sourceNamespace, targetNamespace )
  }
  
  override function getFieldMapper( entity : IType, propertyInfo : IPropertyInfo ) : IFieldMapper {
    if("PublicID" == propertyInfo.Name)  {
      return new NullFieldMapper()
    } 
    else if ("ID" == propertyInfo.Name) {
      return new NullFieldMapper()
    }
    else if (propertyInfo.Name.startsWith("$")) {
      return new NullFieldMapper()
    }
    else {
      return super.getFieldMapper(entity, propertyInfo)
    }
  }

  /**
   * Tries to find the entity with the given name, if not found and the name starts with "CC" then
   * tries to find the entity with the "CC" truncated from the name.
   */
  override function translateEntityName(entityName : String) : String {
    // the argument is a block that answers the string to be logged
    var logResultsAtDebug = CCLoggerCategory.PLUGIN.DebugEnabled
        ? \ msgBlock: ():String -> CCLoggerCategory.PLUGIN.debug(msgBlock()) // evaluate and log the results
        : \ msgBlock: ():String -> {} // not at debug level: don't even evaluate the message creation block

    var targetEntityName = super.translateEntityName( entityName )
    var targetEntityType = TypeSystem.getByFullNameIfValid( _targetNamespace + "." + targetEntityName )
    if (targetEntityType != null) {
      logResultsAtDebug(\ -> "translating from=" + entityName + " to=" + targetEntityName)
    }
    else if(targetEntityName.startsWith( "CC" ) ) {
      targetEntityType = TypeSystem.getByFullNameIfValid( _targetNamespace + "." + targetEntityName.substring( 2 ) )
      if( targetEntityType != null && !targetEntityType.Array && !TypeUtil.isNominallyOrStructurallyAssignable(JavaTypes.LIST(), targetEntityType) )  {
        targetEntityName = targetEntityName.substring( 2 )
        logResultsAtDebug(\ -> "translating from=" + entityName + " to=" + targetEntityName)
      }
      else {
        logResultsAtDebug(\ -> "translating from=" + entityName + " does not exist")
        return null;
      }
    }
    else {
      logResultsAtDebug(\ -> "translating from=" + entityName + " does not exist")
      return null
    }
    return targetEntityName
  }
}
