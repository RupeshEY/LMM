package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newdocument/NewDocumentFromTemplateScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewDocumentFromTemplateScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newdocument/NewDocumentFromTemplateScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewDocumentFromTemplateScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at NewDocumentFromTemplateScreen.pcf: line 35, column 52
    function def_onEnter_4 (def :  pcf.NewTemplateDocumentDV) : void {
      def.onEnter(documentCCContext, docCreationInfo, docCreationInfo.Document, Claim, activity)
    }
    
    // 'def' attribute on PanelRef at NewDocumentFromTemplateScreen.pcf: line 39, column 121
    function def_onEnter_6 (def :  pcf.DocumentDetailsEditDVPanelSet) : void {
      def.onEnter(new gw.document.DocumentDetailsCCHelper(docCreationInfo.Document), true)
    }
    
    // 'def' attribute on PanelRef at NewDocumentFromTemplateScreen.pcf: line 35, column 52
    function def_refreshVariables_5 (def :  pcf.NewTemplateDocumentDV) : void {
      def.refreshVariables(documentCCContext, docCreationInfo, docCreationInfo.Document, Claim, activity)
    }
    
    // 'def' attribute on PanelRef at NewDocumentFromTemplateScreen.pcf: line 39, column 121
    function def_refreshVariables_7 (def :  pcf.DocumentDetailsEditDVPanelSet) : void {
      def.refreshVariables(new gw.document.DocumentDetailsCCHelper(docCreationInfo.Document), true)
    }
    
    // 'initialValue' attribute on Variable at NewDocumentFromTemplateScreen.pcf: line 22, column 85
    function initialValue_0 () : gw.document.DocumentCCContext {
      return new gw.document.DocumentCCContext(Claim, docInit.Init, false)
    }
    
    // 'initialValue' attribute on Variable at NewDocumentFromTemplateScreen.pcf: line 26, column 48
    function initialValue_1 () : gw.document.DocumentCreationInfo {
      return documentCCContext.createDocumentCreationInfo(template)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at NewDocumentFromTemplateScreen.pcf: line 29, column 97
    function toolbarButtonSet_onEnter_2 (def :  pcf.DocumentCreationToolbarButtonSet) : void {
      def.onEnter(documentCCContext,docCreationInfo)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at NewDocumentFromTemplateScreen.pcf: line 29, column 97
    function toolbarButtonSet_refreshVariables_3 (def :  pcf.DocumentCreationToolbarButtonSet) : void {
      def.refreshVariables(documentCCContext,docCreationInfo)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get activity () : Activity {
      return getRequireValue("activity", 0) as Activity
    }
    
    property set activity ($arg :  Activity) {
      setRequireValue("activity", 0, $arg)
    }
    
    property get docCreationInfo () : gw.document.DocumentCreationInfo {
      return getVariableValue("docCreationInfo", 0) as gw.document.DocumentCreationInfo
    }
    
    property set docCreationInfo ($arg :  gw.document.DocumentCreationInfo) {
      setVariableValue("docCreationInfo", 0, $arg)
    }
    
    property get docInit () : util.document.DocumentInitWrapper {
      return getRequireValue("docInit", 0) as util.document.DocumentInitWrapper
    }
    
    property set docInit ($arg :  util.document.DocumentInitWrapper) {
      setRequireValue("docInit", 0, $arg)
    }
    
    property get documentCCContext () : gw.document.DocumentCCContext {
      return getVariableValue("documentCCContext", 0) as gw.document.DocumentCCContext
    }
    
    property set documentCCContext ($arg :  gw.document.DocumentCCContext) {
      setVariableValue("documentCCContext", 0, $arg)
    }
    
    property get template () : gw.plugin.document.IDocumentTemplateDescriptor {
      return getRequireValue("template", 0) as gw.plugin.document.IDocumentTemplateDescriptor
    }
    
    property set template ($arg :  gw.plugin.document.IDocumentTemplateDescriptor) {
      setRequireValue("template", 0, $arg)
    }
    
    
  }
  
  
}