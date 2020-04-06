package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/DocumentAlertPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentAlertPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/documents/DocumentAlertPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentAlertPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at DocumentAlertPanelSet.pcf: line 10, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'visible' attribute on Verbatim (id=IDCSDisabledAlert) at DocumentAlertPanelSet.pcf: line 16, column 68
    function visible_1 () : java.lang.Boolean {
      return not documentsActionsHelper.ContentSourceEnabled
    }
    
    // 'visible' attribute on Verbatim (id=IDCSUnavailableAlert) at DocumentAlertPanelSet.pcf: line 23, column 72
    function visible_2 () : java.lang.Boolean {
      return documentsActionsHelper.ShowContentServerDownWarning
    }
    
    // 'visible' attribute on Verbatim (id=IDMSUnavailableAlert) at DocumentAlertPanelSet.pcf: line 30, column 73
    function visible_3 () : java.lang.Boolean {
      return documentsActionsHelper.ShowMetadataServerDownWarning
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    
  }
  
  
}