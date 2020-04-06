package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.util.LocaleUtil
uses gw.api.util.LocationUtil
@javax.annotation.Generated("config/web/pcf/i18n/LocalizedValuesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LocalizedValuesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/i18n/LocalizedValuesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LocalizedValuesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=column0) at LocalizedValuesLV.pcf: line 43, column 41
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      entity[fieldNames[0] + "_" + language.Code] = __VALUE_TO_SET
    }
    
    // 'value' attribute on TextCell (id=column1) at LocalizedValuesLV.pcf: line 51, column 46
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      entity[fieldNames[1] + "_" + language.Code] = __VALUE_TO_SET
    }
    
    // 'value' attribute on TextCell (id=column2) at LocalizedValuesLV.pcf: line 59, column 46
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      entity[fieldNames[2] + "_" + language.Code] = __VALUE_TO_SET
    }
    
    // 'editable' attribute on Row at LocalizedValuesLV.pcf: line 32, column 80
    function editable_35 () : java.lang.Boolean {
      return language != gw.api.util.LocaleUtil.getCurrentLanguageType()
    }
    
    // 'label' attribute on TextCell (id=column0) at LocalizedValuesLV.pcf: line 43, column 41
    function label_13 () : java.lang.Object {
      return columnNames[0]
    }
    
    // 'label' attribute on TextCell (id=column1) at LocalizedValuesLV.pcf: line 51, column 46
    function label_21 () : java.lang.Object {
      return columnNames[1]
    }
    
    // 'label' attribute on TextCell (id=column2) at LocalizedValuesLV.pcf: line 59, column 46
    function label_29 () : java.lang.Object {
      return columnNames[2]
    }
    
    // 'validationExpression' attribute on TextCell (id=column0) at LocalizedValuesLV.pcf: line 43, column 41
    function validationExpression_12 () : java.lang.Object {
      return copyValueIfNotSet(language, 0)
    }
    
    // 'validationExpression' attribute on TextCell (id=column1) at LocalizedValuesLV.pcf: line 51, column 46
    function validationExpression_19 () : java.lang.Object {
      return copyValueIfNotSet(language, 1)
    }
    
    // 'validationExpression' attribute on TextCell (id=column2) at LocalizedValuesLV.pcf: line 59, column 46
    function validationExpression_27 () : java.lang.Object {
      return copyValueIfNotSet(language, 2)
    }
    
    // 'value' attribute on TextCell (id=Language) at LocalizedValuesLV.pcf: line 36, column 154
    function value_10 () : java.lang.String {
      return language.DisplayName + (language == defaultLanguage ? DisplayKey.get("Web.Admin.LocalizedValuesLV.Default") : "")
    }
    
    // 'value' attribute on TextCell (id=column0) at LocalizedValuesLV.pcf: line 43, column 41
    function value_14 () : java.lang.Object {
      return entity[fieldNames[0] + "_" + language.Code]
    }
    
    // 'value' attribute on TextCell (id=column1) at LocalizedValuesLV.pcf: line 51, column 46
    function value_22 () : java.lang.Object {
      return entity[fieldNames[1] + "_" + language.Code]
    }
    
    // 'value' attribute on TextCell (id=column2) at LocalizedValuesLV.pcf: line 59, column 46
    function value_30 () : java.lang.Object {
      return entity[fieldNames[2] + "_" + language.Code]
    }
    
    // 'visible' attribute on TextCell (id=column1) at LocalizedValuesLV.pcf: line 51, column 46
    function visible_20 () : java.lang.Boolean {
      return fieldNames.Count > 1
    }
    
    // 'visible' attribute on TextCell (id=column2) at LocalizedValuesLV.pcf: line 59, column 46
    function visible_28 () : java.lang.Boolean {
      return fieldNames.Count > 2
    }
    
    property get language () : typekey.LanguageType {
      return getIteratedValue(1) as typekey.LanguageType
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/i18n/LocalizedValuesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocalizedValuesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at LocalizedValuesLV.pcf: line 23, column 28
    function initialValue_0 () : LanguageType {
      return gw.api.util.LocaleUtil.getDefaultLanguageType()
    }
    
    // 'label' attribute on RowIterator (id=LocalizedFields) at LocalizedValuesLV.pcf: line 43, column 41
    function label_2 () : java.lang.Object {
      return columnNames[0]
    }
    
    // 'label' attribute on RowIterator (id=LocalizedFields) at LocalizedValuesLV.pcf: line 51, column 46
    function label_5 () : java.lang.Object {
      return columnNames[1]
    }
    
    // 'label' attribute on RowIterator (id=LocalizedFields) at LocalizedValuesLV.pcf: line 59, column 46
    function label_8 () : java.lang.Object {
      return columnNames[2]
    }
    
    // 'value' attribute on RowIterator (id=LocalizedFields) at LocalizedValuesLV.pcf: line 36, column 154
    function sortValue_1 (language :  typekey.LanguageType) : java.lang.Object {
      return language.DisplayName + (language == defaultLanguage ? DisplayKey.get("Web.Admin.LocalizedValuesLV.Default") : "")
    }
    
    // 'value' attribute on RowIterator (id=LocalizedFields) at LocalizedValuesLV.pcf: line 43, column 41
    function sortValue_3 (language :  typekey.LanguageType) : java.lang.Object {
      return entity[fieldNames[0] + "_" + language.Code]
    }
    
    // 'value' attribute on RowIterator (id=LocalizedFields) at LocalizedValuesLV.pcf: line 51, column 46
    function sortValue_6 (language :  typekey.LanguageType) : java.lang.Object {
      return entity[fieldNames[1] + "_" + language.Code]
    }
    
    // 'value' attribute on RowIterator (id=LocalizedFields) at LocalizedValuesLV.pcf: line 59, column 46
    function sortValue_9 (language :  typekey.LanguageType) : java.lang.Object {
      return entity[fieldNames[2] + "_" + language.Code]
    }
    
    // 'value' attribute on RowIterator (id=LocalizedFields) at LocalizedValuesLV.pcf: line 30, column 42
    function value_36 () : typekey.LanguageType[] {
      return gw.api.util.LocaleUtil.getAllLanguages()?.toTypedArray()
    }
    
    // 'visible' attribute on RowIterator (id=LocalizedFields) at LocalizedValuesLV.pcf: line 51, column 46
    function visible_4 () : java.lang.Boolean {
      return fieldNames.Count > 1
    }
    
    // 'visible' attribute on RowIterator (id=LocalizedFields) at LocalizedValuesLV.pcf: line 59, column 46
    function visible_7 () : java.lang.Boolean {
      return fieldNames.Count > 2
    }
    
    property get columnNames () : String[] {
      return getRequireValue("columnNames", 0) as String[]
    }
    
    property set columnNames ($arg :  String[]) {
      setRequireValue("columnNames", 0, $arg)
    }
    
    property get defaultLanguage () : LanguageType {
      return getVariableValue("defaultLanguage", 0) as LanguageType
    }
    
    property set defaultLanguage ($arg :  LanguageType) {
      setVariableValue("defaultLanguage", 0, $arg)
    }
    
    property get entity () : Object {
      return getRequireValue("entity", 0) as Object
    }
    
    property set entity ($arg :  Object) {
      setRequireValue("entity", 0, $arg)
    }
    
    property get fieldNames () : String[] {
      return getRequireValue("fieldNames", 0) as String[]
    }
    
    property set fieldNames ($arg :  String[]) {
      setRequireValue("fieldNames", 0, $arg)
    }
    
    
    function copyValueIfNotSet(language: LanguageType, columnNumber: int): String {
      var localizedFieldName = fieldNames[columnNumber] + "_" + language.Code
      var value = entity[localizedFieldName] as String
      var copyFromValue = entity[fieldNames[columnNumber]] as String
    
      if (not value.HasContent and copyFromValue.HasContent) {
        LocationUtil.addRequestScopedWarningMessage(DisplayKey.get("Web.Admin.LocalizedValuesLV.ValuesCopiedMessage", columnNames[columnNumber]))
        entity[localizedFieldName] = copyFromValue
      }
      
      entity[fieldNames[columnNumber] + "_" + LocaleUtil.getCurrentLanguageType().Code] = copyFromValue // workaround for PL-23047
      return null
    }
    
    
  }
  
  
}