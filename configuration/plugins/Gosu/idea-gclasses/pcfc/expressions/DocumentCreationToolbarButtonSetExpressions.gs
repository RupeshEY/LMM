package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/DocumentCreationToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentCreationToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/document/DocumentCreationToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentCreationToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=NewDocumentFromTemplate_CustomUpdate) at DocumentCreationToolbarButtonSet.pcf: line 17, column 54
    function action_1 () : void {
      CurrentLocation.commit()
    }
    
    // 'available' attribute on ToolbarButton (id=NewDocumentFromTemplate_CustomUpdate) at DocumentCreationToolbarButtonSet.pcf: line 17, column 54
    function available_0 () : java.lang.Boolean {
      return documentCreationInfo.File != null
    }
    
    // EditButtons at DocumentCreationToolbarButtonSet.pcf: line 19, column 30
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
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
    
    
  }
  
  
}