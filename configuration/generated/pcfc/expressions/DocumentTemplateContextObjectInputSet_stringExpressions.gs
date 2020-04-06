package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/DocumentTemplateContextObjectInputSet.string.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentTemplateContextObjectInputSet_stringExpressions {
  @javax.annotation.Generated("config/web/pcf/document/DocumentTemplateContextObjectInputSet.string.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentTemplateContextObjectInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.string.pcf: line 26, column 22
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContextObjectValue = __VALUE_TO_SET
    }
    
    // 'label' attribute on TextInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.string.pcf: line 26, column 22
    function label_1 () : java.lang.Object {
      return dynamicWidgetInfo.DisplayName
    }
    
    // 'onChange' attribute on PostOnChange at DocumentTemplateContextObjectInputSet.string.pcf: line 29, column 42
    function onChange_0 () : void {
      documentCreationInfo.evaluateDependentDynamicWidgets(dynamicWidgetInfo.getName()); documentApplicationContext.DocumentCreationResetState.execute()
    }
    
    // 'required' attribute on TextInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.string.pcf: line 26, column 22
    function required_4 () : java.lang.Boolean {
      return !dynamicWidgetInfo.ShowNoneSelected
    }
    
    // 'value' attribute on TextInput (id=DynamicInput) at DocumentTemplateContextObjectInputSet.string.pcf: line 26, column 22
    function value_2 () : java.lang.Object {
      return ContextObjectValue
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