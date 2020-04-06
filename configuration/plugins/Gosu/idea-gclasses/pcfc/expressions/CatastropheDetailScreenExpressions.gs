package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastropheDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=FindUnmatchedClaimsButton) at CatastropheDetailScreen.pcf: line 31, column 84
    function action_5 () : void {
      findRelatedClaims()
    }
    
    // 'action' attribute on ToolbarButton (id=ShowCatMapButton) at CatastropheDetailScreen.pcf: line 38, column 80
    function action_8 () : void {
      CatastropheSearch.go(catastrophe)
    }
    
    // 'action' attribute on ToolbarButton (id=ShowCatMapButton) at CatastropheDetailScreen.pcf: line 38, column 80
    function action_dest_9 () : pcf.api.Destination {
      return pcf.CatastropheSearch.createDestination(catastrophe)
    }
    
    // 'available' attribute on ToolbarButton (id=FindUnmatchedClaimsButton) at CatastropheDetailScreen.pcf: line 31, column 84
    function available_3 () : java.lang.Boolean {
      return catastrophe.Active
    }
    
    // 'available' attribute on ToolbarButton (id=ShowCatMapButton) at CatastropheDetailScreen.pcf: line 38, column 80
    function available_6 () : java.lang.Boolean {
      return catastrophe.hasAssociatedClaims()
    }
    
    // 'def' attribute on PanelRef at CatastropheDetailScreen.pcf: line 23, column 49
    function def_onEnter_11 (def :  pcf.AdminCatastropheDV) : void {
      def.onEnter(catastrophe)
    }
    
    // 'def' attribute on PanelRef at CatastropheDetailScreen.pcf: line 47, column 62
    function def_onEnter_13 (def :  pcf.AdminCatastrophePolicyPanelSet) : void {
      def.onEnter(catastrophe)
    }
    
    // 'def' attribute on PanelRef at CatastropheDetailScreen.pcf: line 23, column 49
    function def_refreshVariables_12 (def :  pcf.AdminCatastropheDV) : void {
      def.refreshVariables(catastrophe)
    }
    
    // 'def' attribute on PanelRef at CatastropheDetailScreen.pcf: line 47, column 62
    function def_refreshVariables_14 (def :  pcf.AdminCatastrophePolicyPanelSet) : void {
      def.refreshVariables(catastrophe)
    }
    
    // EditButtons at CatastropheDetailScreen.pcf: line 16, column 46
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'editVisible' attribute on EditButtons at CatastropheDetailScreen.pcf: line 16, column 46
    function visible_0 () : java.lang.Boolean {
      return perm.Catastrophe.edit
    }
    
    // 'visible' attribute on Card (id=Policy) at CatastropheDetailScreen.pcf: line 45, column 148
    function visible_15 () : java.lang.Boolean {
      return gw.api.heatmap.HeatMapGenerator.isHeatMapConfigured() and gw.api.heatmap.CatastropheHeatMap.isPolicyLocationDownloadConfigured()
    }
    
    // 'visible' attribute on ToolbarButton (id=FindUnmatchedClaimsButton) at CatastropheDetailScreen.pcf: line 31, column 84
    function visible_4 () : java.lang.Boolean {
      return (showRelatedClaimsFinder and !CurrentLocation.InEditMode)
    }
    
    // 'visible' attribute on ToolbarButton (id=ShowCatMapButton) at CatastropheDetailScreen.pcf: line 38, column 80
    function visible_7 () : java.lang.Boolean {
      return gw.api.heatmap.HeatMapGenerator.isHeatMapConfigured()
    }
    
    property get catastrophe () : Catastrophe {
      return getRequireValue("catastrophe", 0) as Catastrophe
    }
    
    property set catastrophe ($arg :  Catastrophe) {
      setRequireValue("catastrophe", 0, $arg)
    }
    
    property get showRelatedClaimsFinder () : boolean {
      return getRequireValue("showRelatedClaimsFinder", 0) as java.lang.Boolean
    }
    
    property set showRelatedClaimsFinder ($arg :  boolean) {
      setRequireValue("showRelatedClaimsFinder", 0, $arg)
    }
    
    function findRelatedClaims() {
      gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
        bundle.add(catastrophe).ScheduleBatch = true
      })
      gw.api.util.LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("Web.Admin.AdminCatastrophe.MatchedClaimsAvailableNextDay"))
    }
    
    
  }
  
  
}