package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newdocument/ClaimNewDocumentMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewDocumentMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newdocument/ClaimNewDocumentMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=ClaimNewDocumentMenuItemSet_Create) at ClaimNewDocumentMenuItemSet.pcf: line 18, column 85
    function action_2 () : void {
      ClaimNewDocumentFromTemplateWorksheet.goInWorkspace(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimNewDocumentMenuItemSet_Link) at ClaimNewDocumentMenuItemSet.pcf: line 23, column 83
    function action_5 () : void {
      ClaimNewDocumentLinkedWorksheet.goInWorkspace(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimNewDocumentMenuItemSet_IndicateExists) at ClaimNewDocumentMenuItemSet.pcf: line 28, column 93
    function action_8 () : void {
      ClaimNewDocumentExistsWorksheet.goInWorkspace(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimNewDocumentMenuItemSet_Create) at ClaimNewDocumentMenuItemSet.pcf: line 18, column 85
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimNewDocumentFromTemplateWorksheet.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimNewDocumentMenuItemSet_Link) at ClaimNewDocumentMenuItemSet.pcf: line 23, column 83
    function action_dest_6 () : pcf.api.Destination {
      return pcf.ClaimNewDocumentLinkedWorksheet.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimNewDocumentMenuItemSet_IndicateExists) at ClaimNewDocumentMenuItemSet.pcf: line 28, column 93
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimNewDocumentExistsWorksheet.createDestination(Claim)
    }
    
    // 'available' attribute on MenuItem (id=ClaimNewDocumentMenuItemSet_Create) at ClaimNewDocumentMenuItemSet.pcf: line 18, column 85
    function available_1 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentTemplateActionsAvailable
    }
    
    // 'available' attribute on MenuItem (id=ClaimNewDocumentMenuItemSet_Link) at ClaimNewDocumentMenuItemSet.pcf: line 23, column 83
    function available_4 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable and documentsActionsHelper.DocumentContentActionsAvailable
    }
    
    // 'available' attribute on MenuItem (id=ClaimNewDocumentMenuItemSet_IndicateExists) at ClaimNewDocumentMenuItemSet.pcf: line 28, column 93
    function available_7 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'initialValue' attribute on Variable at ClaimNewDocumentMenuItemSet.pcf: line 13, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    
  }
  
  
}