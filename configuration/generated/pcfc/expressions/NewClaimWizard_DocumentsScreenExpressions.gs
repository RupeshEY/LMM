package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_DocumentsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_DocumentsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_DocumentsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_DocumentsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshAsyncContent) at NewClaimWizard_DocumentsScreen.pcf: line 30, column 91
    function action_4 () : void {
      
    }
    
    // 'available' attribute on ToolbarButton (id=RefreshAsyncContent) at NewClaimWizard_DocumentsScreen.pcf: line 30, column 91
    function available_2 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentContentServerAvailable
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_DocumentsScreen.pcf: line 35, column 82
    function def_onEnter_5 (def :  pcf.NewClaimDocumentsLV) : void {
      def.onEnter(claimDocuments , Claim, documentsActionsHelper)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_DocumentsScreen.pcf: line 35, column 82
    function def_refreshVariables_6 (def :  pcf.NewClaimDocumentsLV) : void {
      def.refreshVariables(claimDocuments , Claim, documentsActionsHelper)
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_DocumentsScreen.pcf: line 16, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_DocumentsScreen.pcf: line 21, column 33
    function initialValue_1 () : entity.Document[] {
      return gw.document.DocumentsUtil.getAllDocumentsForClaim(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=RefreshAsyncContent) at NewClaimWizard_DocumentsScreen.pcf: line 30, column 91
    function visible_3 () : java.lang.Boolean {
      return documentsActionsHelper.isShowAsynchronousRefreshAction(claimDocuments)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get claimDocuments () : entity.Document[] {
      return getVariableValue("claimDocuments", 0) as entity.Document[]
    }
    
    property set claimDocuments ($arg :  entity.Document[]) {
      setVariableValue("claimDocuments", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    
  }
  
  
}