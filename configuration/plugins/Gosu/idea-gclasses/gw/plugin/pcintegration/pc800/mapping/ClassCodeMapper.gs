package gw.plugin.pcintegration.pc800.mapping
uses gw.plugin.integration.mapping.IFieldMapper
uses gw.lang.reflect.IPropertyInfo
uses java.lang.IllegalArgumentException
uses gw.api.util.mapping.ObjectConverter

/**
 * Maps ClassCodes from PC out-of-the-box format to CC out-of-the-box format.
 * Currently only copies the code without change and checks that the length is
 * range.  Also see the validator for EmploymentClassification in fieldvalidators.xml.
 * Custom configurations probably should not use this mapper.
 */
@Export
class ClassCodeMapper implements IFieldMapper {

  construct() {
  }

  override function mapField( converter : ObjectConverter, 
                              source : Object, 
                              target : Object, 
                              sourceProperty : IPropertyInfo ) {  
    var sourceVal = source[sourceProperty.Name] as String
    if (sourceVal != null) {
      var min = 4
      var max = 10
      if (sourceVal.length < min || sourceVal.length > max) {
        throw new IllegalArgumentException("Expected source value '${sourceVal}' to be a string with length between ${min} and ${max}")
      }
      target[sourceProperty.Name] = sourceVal
    }
  }
}
