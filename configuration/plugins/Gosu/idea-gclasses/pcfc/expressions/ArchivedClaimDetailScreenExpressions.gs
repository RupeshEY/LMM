package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/archive/ArchivedClaimDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArchivedClaimDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/archive/ArchivedClaimDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchivedClaimDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=Restore) at ArchivedClaimDetailScreen.pcf: line 22, column 64
    function action_2 () : void {
      restoreAction()
    }
    
    // 'available' attribute on ToolbarButton (id=Restore) at ArchivedClaimDetailScreen.pcf: line 22, column 64
    function available_1 () : java.lang.Boolean {
      return Page.canRestore() and perm.ClaimInfo.edit(ClaimInfo)
    }
    
    // 'def' attribute on PanelRef at ArchivedClaimDetailScreen.pcf: line 28, column 60
    function def_onEnter_4 (def :  pcf.ArchivedClaimDV) : void {
      def.onEnter(ClaimInfo, ArchivedClaimInfo)
    }
    
    // 'def' attribute on PanelRef at ArchivedClaimDetailScreen.pcf: line 28, column 60
    function def_refreshVariables_5 (def :  pcf.ArchivedClaimDV) : void {
      def.refreshVariables(ClaimInfo, ArchivedClaimInfo)
    }
    
    // 'initialValue' attribute on Variable at ArchivedClaimDetailScreen.pcf: line 16, column 54
    function initialValue_0 () : gw.api.claim.ClaimArchiveRestoreHelper {
      return new gw.api.claim.ClaimArchiveRestoreHelper(ClaimInfo)
    }
    
    // EditButtons at ArchivedClaimDetailScreen.pcf: line 25, column 32
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    property get ArchivedClaimInfo () : ArchivedClaimInfo {
      return getRequireValue("ArchivedClaimInfo", 0) as ArchivedClaimInfo
    }
    
    property set ArchivedClaimInfo ($arg :  ArchivedClaimInfo) {
      setRequireValue("ArchivedClaimInfo", 0, $arg)
    }
    
    property get ClaimInfo () : ClaimInfo {
      return getRequireValue("ClaimInfo", 0) as ClaimInfo
    }
    
    property set ClaimInfo ($arg :  ClaimInfo) {
      setRequireValue("ClaimInfo", 0, $arg)
    }
    
    property get Page () : gw.api.claim.ClaimArchiveRestoreHelper {
      return getVariableValue("Page", 0) as gw.api.claim.ClaimArchiveRestoreHelper
    }
    
    property set Page ($arg :  gw.api.claim.ClaimArchiveRestoreHelper) {
      setVariableValue("Page", 0, $arg)
    }
    
    function restoreAction() {
      if (!ArchivedClaimInfo.Comment.HasContent)
        throw new gw.api.util.DisplayableException(DisplayKey.get("Java.Validation.MissingRequired", DisplayKey.get("Web.ArchivedClaim.Comment")));
      
      var claim = Page.restore(ArchivedClaimInfo.Comment);
      pcf.ClaimForward.go(claim)
    }
    
    
  }
  
  
}