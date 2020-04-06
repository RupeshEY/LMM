package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/DocumentTemplateContextObjectIteratorInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentTemplateContextObjectIteratorInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/document/DocumentTemplateContextObjectIteratorInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentTemplateContextObjectIteratorInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'editable' attribute on InputSet (id=DocumentTemplateContextObjectIteratorInputSet) at DocumentTemplateContextObjectIteratorInputSet.default.pcf: line 8, column 20
    function editable_10 () : java.lang.Boolean {
      return documentApplicationContext.DocumentCreationReadOnly
    }
    
    // 'value' attribute on InputIterator at DocumentTemplateContextObjectIteratorInputSet.default.pcf: line 20, column 72
    function value_9 () : gw.document.DocumentCreationInfo.DynamicWidgetInfo[] {
      return documentCreationInfo.getDynamicWidgetInformation()
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
    
    
    function getMode(dynamicWidgetInfo : gw.document.DocumentCreationInfo.DynamicWidgetInfo) : String {
            return dynamicWidgetInfo.Type.toLowerCase();
          }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/document/DocumentTemplateContextObjectIteratorInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DocumentTemplateContextObjectIteratorInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at DocumentTemplateContextObjectIteratorInputSet.default.pcf: line 24, column 43
    function def_onEnter_0 (def :  pcf.DocumentTemplateContextObjectInputSet_contact) : void {
      def.onEnter(documentApplicationContext, documentCreationInfo, DynamicWidgetInfo)
    }
    
    // 'def' attribute on InputSetRef at DocumentTemplateContextObjectIteratorInputSet.default.pcf: line 24, column 43
    function def_onEnter_2 (def :  pcf.DocumentTemplateContextObjectInputSet_default) : void {
      def.onEnter(documentApplicationContext, documentCreationInfo, DynamicWidgetInfo)
    }
    
    // 'def' attribute on InputSetRef at DocumentTemplateContextObjectIteratorInputSet.default.pcf: line 24, column 43
    function def_onEnter_4 (def :  pcf.DocumentTemplateContextObjectInputSet_string) : void {
      def.onEnter(documentApplicationContext, documentCreationInfo, DynamicWidgetInfo)
    }
    
    // 'def' attribute on InputSetRef at DocumentTemplateContextObjectIteratorInputSet.default.pcf: line 24, column 43
    function def_onEnter_6 (def :  pcf.DocumentTemplateContextObjectInputSet_text) : void {
      def.onEnter(documentApplicationContext, documentCreationInfo, DynamicWidgetInfo)
    }
    
    // 'def' attribute on InputSetRef at DocumentTemplateContextObjectIteratorInputSet.default.pcf: line 24, column 43
    function def_refreshVariables_1 (def :  pcf.DocumentTemplateContextObjectInputSet_contact) : void {
      def.refreshVariables(documentApplicationContext, documentCreationInfo, DynamicWidgetInfo)
    }
    
    // 'def' attribute on InputSetRef at DocumentTemplateContextObjectIteratorInputSet.default.pcf: line 24, column 43
    function def_refreshVariables_3 (def :  pcf.DocumentTemplateContextObjectInputSet_default) : void {
      def.refreshVariables(documentApplicationContext, documentCreationInfo, DynamicWidgetInfo)
    }
    
    // 'def' attribute on InputSetRef at DocumentTemplateContextObjectIteratorInputSet.default.pcf: line 24, column 43
    function def_refreshVariables_5 (def :  pcf.DocumentTemplateContextObjectInputSet_string) : void {
      def.refreshVariables(documentApplicationContext, documentCreationInfo, DynamicWidgetInfo)
    }
    
    // 'def' attribute on InputSetRef at DocumentTemplateContextObjectIteratorInputSet.default.pcf: line 24, column 43
    function def_refreshVariables_7 (def :  pcf.DocumentTemplateContextObjectInputSet_text) : void {
      def.refreshVariables(documentApplicationContext, documentCreationInfo, DynamicWidgetInfo)
    }
    
    // 'mode' attribute on InputSetRef at DocumentTemplateContextObjectIteratorInputSet.default.pcf: line 24, column 43
    function mode_8 () : java.lang.Object {
      return getMode(DynamicWidgetInfo)
    }
    
    property get DynamicWidgetInfo () : gw.document.DocumentCreationInfo.DynamicWidgetInfo {
      return getIteratedValue(1) as gw.document.DocumentCreationInfo.DynamicWidgetInfo
    }
    
    
  }
  
  
}