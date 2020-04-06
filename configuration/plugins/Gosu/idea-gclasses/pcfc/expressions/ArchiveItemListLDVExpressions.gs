package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArchiveItemListLDVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveItemListLDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ArchiveItemListLDV.pcf: line 16, column 83
    function initialValue_0 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return archiveDetailsData.QueryForRootInfos.select()
    }
    
    // 'initialValue' attribute on Variable at ArchiveItemListLDV.pcf: line 20, column 43
    function initialValue_1 () : gw.pl.persistence.core.Bean {
      return query.FirstResult
    }
    
    // 'selectionOnEnter' attribute on ListDetailPanel (id=ArchiveItemListLDV) at ArchiveItemListLDV.pcf: line 9, column 33
    function selectionOnEnter_23 () : java.lang.Object {
      return firstResult
    }
    
    // 'title' attribute on Card (id=FailureDetailsCV) at ArchiveItemListLDV.pcf: line 63, column 63
    function title_18 () : java.lang.String {
      return DisplayKey.get("Web.ServerTools.ArchiveInfo.FailureDetails", com.guidewire.pl.system.dependency.PLDependencies.getDomainGraphSupport().getInformationalString(rootInfoObj as RootInfo))
    }
    
    // 'title' attribute on Card (id=ArchiveTraceCV) at ArchiveItemListLDV.pcf: line 76, column 133
    function title_22 () : java.lang.String {
      return DisplayKey.get("Web.ServerTools.ArchiveInfo.TraceDetails", com.guidewire.pl.system.dependency.PLDependencies.getDomainGraphSupport().getInformationalString(rootInfoObj as RootInfo))
    }
    
    // 'value' attribute on TextInput (id=FailureDetails) at ArchiveItemListLDV.pcf: line 69, column 94
    function valueRoot_16 () : java.lang.Object {
      return (rootInfoObj as RootInfo).ArchiveFailureDetails
    }
    
    // 'value' attribute on RowIterator at ArchiveItemListLDV.pcf: line 33, column 89
    function value_13 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return query
    }
    
    // 'value' attribute on TextInput (id=FailureDetails) at ArchiveItemListLDV.pcf: line 69, column 94
    function value_14 () : java.lang.String {
      return (rootInfoObj as RootInfo).ArchiveFailureDetails.ArchiveFailureDetails
    }
    
    // 'value' attribute on TextInput (id=TraceDetails) at ArchiveItemListLDV.pcf: line 82, column 137
    function value_19 () : java.lang.String {
      return com.guidewire.pl.system.internal.InternalMethods.asRootInfoInternal((rootInfoObj as RootInfo)).getTraceDetails()
    }
    
    // 'visible' attribute on Card (id=FailureDetailsCV) at ArchiveItemListLDV.pcf: line 63, column 63
    function visible_17 () : java.lang.Boolean {
      return archiveDetailsData.ExcludedBecauseOfFailure
    }
    
    // 'visible' attribute on RowIterator at ArchiveItemListLDV.pcf: line 49, column 52
    function visible_2 () : java.lang.Boolean {
      return !archiveDetailsData.Skipped
    }
    
    // 'visible' attribute on Card (id=ArchiveTraceCV) at ArchiveItemListLDV.pcf: line 76, column 133
    function visible_21 () : java.lang.Boolean {
      return com.guidewire.pl.system.internal.InternalMethods.asRootInfoInternal((rootInfoObj as RootInfo)).hasTraceDetails() 
    }
    
    property get archiveDetailsData () : gw.api.archiving.ArchiveDetailsData {
      return getRequireValue("archiveDetailsData", 0) as gw.api.archiving.ArchiveDetailsData
    }
    
    property set archiveDetailsData ($arg :  gw.api.archiving.ArchiveDetailsData) {
      setRequireValue("archiveDetailsData", 0, $arg)
    }
    
    property get firstResult () : gw.pl.persistence.core.Bean {
      return getVariableValue("firstResult", 0) as gw.pl.persistence.core.Bean
    }
    
    property set firstResult ($arg :  gw.pl.persistence.core.Bean) {
      setVariableValue("firstResult", 0, $arg)
    }
    
    property get query () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("query", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set query ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("query", 0, $arg)
    }
    
    property get rootInfoObj () : KeyableBean {
      return getCurrentSelection(0) as KeyableBean
    }
    
    property set rootInfoObj ($arg :  KeyableBean) {
      setCurrentSelection(0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ArchiveItemListLDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonCell (id=DebugItem) at ArchiveItemListLDV.pcf: line 55, column 52
    function action_10 () : void {
      gw.transaction.Transaction.runWithNewBundle(\ bundle -> { var rootInfo = bundle.add(rootInfoElem as KeyableBean) as RootInfo; rootInfo.resetToPreArchivedState() }); com.guidewire.pl.system.internal.InternalMethods.asRootInfoInternal((rootInfoElem as RootInfo)).runArchiveWithTrace()
    }
    
    // 'action' attribute on TextCell (id=Item) at ArchiveItemListLDV.pcf: line 43, column 145
    function action_5 () : void {
      gw.api.web.tools.ArchiveInfoPage.goToPage(rootInfoElem as RootInfo)
    }
    
    // 'action' attribute on ButtonCell (id=Reset) at ArchiveItemListLDV.pcf: line 49, column 52
    function action_8 () : void {
      gw.transaction.Transaction.runWithNewBundle(\ bundle -> { var rootInfo = bundle.add(rootInfoElem as KeyableBean) as RootInfo; rootInfo.resetToPreArchivedState() }); if (archiveDetailsData.QueryForRootInfos.select().Count == 0) {CurrentLocation.cancel()}
    }
    
    // 'canPick' attribute on RowIterator at ArchiveItemListLDV.pcf: line 33, column 89
    function canPick_11 () : java.lang.Boolean {
      return archiveDetailsData.ExcludedBecauseOfFailure
    }
    
    // 'checkBoxVisible' attribute on RowIterator at ArchiveItemListLDV.pcf: line 33, column 89
    function checkBoxVisible_12 () : java.lang.Boolean {
      return archiveDetailsData.ExcludedBecauseOfRules or archiveDetailsData.ExcludedBecauseOfFailure
    }
    
    // 'value' attribute on TextCell (id=Item) at ArchiveItemListLDV.pcf: line 43, column 145
    function value_4 () : java.lang.String {
      return com.guidewire.pl.system.dependency.PLDependencies.getDomainGraphSupport().getInformationalString(rootInfoElem as RootInfo)
    }
    
    // 'visible' attribute on ButtonCell (id=Reset) at ArchiveItemListLDV.pcf: line 49, column 52
    function visible_7 () : java.lang.Boolean {
      return !archiveDetailsData.Skipped
    }
    
    property get rootInfoElem () : gw.pl.persistence.core.Bean {
      return getIteratedValue(1) as gw.pl.persistence.core.Bean
    }
    
    
  }
  
  
}