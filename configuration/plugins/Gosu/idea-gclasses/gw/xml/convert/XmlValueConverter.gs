package gw.xml.convert
uses gw.lang.reflect.features.PropertyReference
uses gw.xml.XmlSimpleValue
uses gw.internal.xml.xsd.typeprovider.XmlSchemaTypeToGosuTypeMappings
uses gw.entity.TypeKey
uses gw.lang.reflect.TypeSystem

@Export
class XmlValueConverter {

  construct() {

  }

  function populateField<T extends KeyableBean>(bean:T, prop:PropertyReference<T, Object >, xmlValue:String) {
    populateField(bean, prop.FeatureInfo.Name, xmlValue)
  }
  
  function populateField<T extends KeyableBean>(bean:T, fieldName:String, xmlValue:String) {
    var columnType = (typeof bean).TypeInfo.getProperty(fieldName).FeatureType
    var pair = XmlSchemaTypeToGosuTypeMappings.gosuToSchema(columnType)
    var fieldValue : XmlSimpleValue = pair.Second.deserialize(xmlValue)
//    if (not TypeKey.Type.isAssignableFrom(columnType)) {
//      fieldValue = pair.Second.deserialize(xmlValue)
//    } else {
//      TypeSystem.getByFullName("typekey.${columnType.RelativeName}")
//      fieldValue = pair.Second.deserialize(xmlValue)
//    }
    bean.setFieldValue(fieldName, fieldValue.GosuValue)
  }
}
