package gw.plugin.pcintegration.pc900.mapping
uses gw.api.locale.DisplayKey
uses gw.api.util.mapping.IFieldMapper
uses gw.api.util.mapping.ObjectConverter
uses gw.lang.reflect.IPropertyInfo
uses java.lang.IllegalArgumentException
uses gw.api.util.DisplayableException
uses java.lang.Throwable
uses gw.api.contact.ClaimContactRoleOwner

/**
 * This mapper should be used for mapping to virtual Contact[] properties on the Policy.  These
 * properties do not have a direct setter, so they need to be set by adding each contact to the
 * Policy with the appropriate role.
 */
@Export
class ContactArrayFieldMapper implements IFieldMapper
{
  construct()
  {
  }
  
  override function mapField( converter : ObjectConverter, 
                              source : Object, 
                              target : Object, 
                              sourceProperty : IPropertyInfo )
  {
    try 
    {
      if( !(target typeis ClaimContactRoleOwner) )
      {
        throw new IllegalArgumentException( "Cannot use ContactArrayFieldMapper to map to an entity " +
                                             "that is not a ClaimContactRoleOwner: " + (typeof target))
      }
      var targetPropertyValue = converter.convert( source[sourceProperty.Name], sourceProperty.FeatureType )
      if( targetPropertyValue == null ) 
      {
        return
      }
      if( !(targetPropertyValue typeis Contact[]) )
      {
        throw new IllegalArgumentException( "The ContactArrayFieldMapper cannot be used for the " +
                                            "non-Contact[] property:" + sourceProperty.Name )
      }
      
      var role = getRoleType( sourceProperty )
      var roleOwner = target as ClaimContactRoleOwner
      for( var contact in (targetPropertyValue as Contact[]) ) 
      {
        roleOwner.addRole( role, contact )
      }
    }
    catch( e : Throwable ) 
    {
      throw new DisplayableException( DisplayKey.get("Mapping.Error.SourceFieldMappingFailure", sourceProperty.OwnersType, sourceProperty.Description), e )
    }
  }
  
  private function getRoleType( sourceProperty : IPropertyInfo ) : ContactRole 
  {
    var role : ContactRole
    try
    {
      role = typekey.ContactRole.get(sourceProperty.Name)
    }
    catch( e : Throwable )
    {
      if( e typeis IllegalArgumentException ) {
        throw new IllegalArgumentException( "Could not map field " + sourceProperty.OwnersType + 
                                            "." +  sourceProperty.Description +
                                            " using the ContactArrayFieldMapper because the field " +
                                            "name does not correspond to a ContactRole typecode.", e)
      }
      else
      {
        throw e
      }
    }
    return role
  }
}
