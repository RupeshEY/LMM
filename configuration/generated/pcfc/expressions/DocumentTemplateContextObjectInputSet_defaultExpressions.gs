package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/DocumentTemplateContextObjectInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentTemplateContextObjectInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/document/DocumentTemplateContextObjectInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentTemplateContextObjectInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.default.pcf: line 28, column 22
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContextObjectValue = __VALUE_TO_SET
    }
    
    // 'label' attribute on RangeInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.default.pcf: line 28, column 22
    function label_1 () : java.lang.Object {
      return dynamicWidgetInfo.DisplayName
    }
    
    // 'onChange' attribute on PostOnChange at DocumentTemplateContextObjectInputSet.default.pcf: line 31, column 42
    function onChange_0 () : void {
      documentCreationInfo.evaluateDependentDynamicWidgets(dynamicWidgetInfo.getName()); documentApplicationContext.DocumentCreationResetState.execute()
    }
    
    // 'optionLabel' attribute on RangeInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.default.pcf: line 28, column 22
    function optionLabel_7 (VALUE :  java.lang.Object) : java.lang.String {
      return (VALUE == null ? null : (((typeof VALUE).TypeInfo.getProperty("DisplayName") == null) ? (((typeof VALUE).TypeInfo.getProperty("Name") == null) ? VALUE : VALUE["Name"]) : VALUE["DisplayName"])) as String
    }
    
    // 'required' attribute on RangeInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.default.pcf: line 28, column 22
    function required_4 () : java.lang.Boolean {
      return !dynamicWidgetInfo.ShowNoneSelected
    }
    
    // 'valueRange' attribute on RangeInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.default.pcf: line 28, column 22
    function valueRange_8 () : java.lang.Object {
      return documentCreationInfo.getPossibleContextObjectValues(dynamicWidgetInfo.Name)
    }
    
    // 'value' attribute on RangeInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.default.pcf: line 28, column 22
    function value_2 () : java.lang.Object {
      return ContextObjectValue
    }
    
    // 'valueRange' attribute on RangeInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.default.pcf: line 28, column 22
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.lang.Object[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.default.pcf: line 28, column 22
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.default.pcf: line 28, column 22
    function verifyValueRange_10 () : void {
      var __valueRangeArg = documentCreationInfo.getPossibleContextObjectValues(dynamicWidgetInfo.Name)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    property get documentApplicationContext () : gw.document.DocumentApplicationContext {
      return getRequireValue("documentApplicationContext", 0) as gw.document.DocumentApplicationContext
    }
    
    property set documentApplicationContext ($arg :  gw.document.DocumentApplicationContext) {
      setRequireValue("documentApplicationContext", 0, $arg)
    }
    
    property get documentCreationInfo () : gw.document.DocumentCreationInfo {
      return getRequireValue("documentCreationInfo", 0) as gw.document.DocumentCreationInfo
    }
    
    property set documentCreationInfo ($arg :  gw.document.DocumentCreationInfo) {
      setRequireValue("documentCreationInfo", 0, $arg)
    }
    
    property get dynamicWidgetInfo () : gw.document.DocumentCreationInfo.DynamicWidgetInfo {
      return getRequireValue("dynamicWidgetInfo", 0) as gw.document.DocumentCreationInfo.DynamicWidgetInfo
    }
    
    property set dynamicWidgetInfo ($arg :  gw.document.DocumentCreationInfo.DynamicWidgetInfo) {
      setRequireValue("dynamicWidgetInfo", 0, $arg)
    }
    
    property get ContextObjectValue(): Object {
      return documentCreationInfo.getContextObjectValue(dynamicWidgetInfo.Name)
    }
    
    property set ContextObjectValue(value : Object){
      documentCreationInfo.setContextObjectValue(dynamicWidgetInfo.Name, value)
    }
    
    
  }
  
  
}