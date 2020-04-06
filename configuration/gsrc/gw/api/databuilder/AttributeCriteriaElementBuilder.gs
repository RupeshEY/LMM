package gw.api.databuilder


@Export
class AttributeCriteriaElementBuilder extends DataBuilder<AttributeCriteriaElement, AttributeCriteriaElementBuilder> {

  construct() {
    super( AttributeCriteriaElement )
  } 

  function withAttributeCriteriaElementField( field : String ) : AttributeCriteriaElementBuilder {
    set( AttributeCriteriaElement.Type.TypeInfo.getProperty( "AttributeField" ), field )
    return this
  }
  
  function withAttributeCriteriaElementType( type : typekey.UserAttributeType ) : AttributeCriteriaElementBuilder {
    set( AttributeCriteriaElement.Type.TypeInfo.getProperty( "AttributeType" ), type )
    return this
  }
  
  function withAttributeCriteriaElementValue( value : String ) : AttributeCriteriaElementBuilder {
    set( AttributeCriteriaElement.Type.TypeInfo.getProperty( "AttributeValue" ), value )
    return this
  }      
}
