package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveItemListScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArchiveItemListScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveItemListScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveItemListScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ResetAll) at ArchiveItemListScreen.pcf: line 17, column 50
    function action_1 () : void {
      archiveDetailsData.resetExcludedFlag(); CurrentLocation.cancel()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ResetSelected) at ArchiveItemListScreen.pcf: line 23, column 50
    function allCheckedRowsAction_3 (CheckedValues :  gw.pl.persistence.core.Bean[], CheckedValuesErrors :  java.util.Map) : void {
      gw.transaction.Transaction.runWithNewBundle(\ bundle -> { CheckedValues.each(\ k -> {var rootInfo = bundle.add(k as KeyableBean) as RootInfo; rootInfo.resetToPreArchivedState() })}); if (archiveDetailsData.QueryForRootInfos.select().Count == 0) {CurrentLocation.cancel()}
    }
    
    // 'def' attribute on PanelRef at ArchiveItemListScreen.pcf: line 11, column 52
    function def_onEnter_4 (def :  pcf.ArchiveItemListLDV) : void {
      def.onEnter(archiveDetailsData)
    }
    
    // 'def' attribute on PanelRef at ArchiveItemListScreen.pcf: line 11, column 52
    function def_refreshVariables_5 (def :  pcf.ArchiveItemListLDV) : void {
      def.refreshVariables(archiveDetailsData)
    }
    
    // 'visible' attribute on ToolbarButton (id=ResetAll) at ArchiveItemListScreen.pcf: line 17, column 50
    function visible_0 () : java.lang.Boolean {
      return !archiveDetailsData.Skipped
    }
    
    property get archiveDetailsData () : gw.api.archiving.ArchiveDetailsData {
      return getRequireValue("archiveDetailsData", 0) as gw.api.archiving.ArchiveDetailsData
    }
    
    property set archiveDetailsData ($arg :  gw.api.archiving.ArchiveDetailsData) {
      setRequireValue("archiveDetailsData", 0, $arg)
    }
    
    
  }
  
  
}