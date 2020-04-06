package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArchiveClaimRetrievePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveClaimRetrievePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (restoreSet :  gw.api.claim.ClaimArchiveRestoreSet) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Restore) at ArchiveClaimRetrievePopup.pcf: line 29, column 25
    function action_1 () : void {
      restoreAction()
    }
    
    // 'action' attribute on ToolbarButton (id=Done) at ArchiveClaimRetrievePopup.pcf: line 34, column 25
    function action_2 () : void {
      CurrentLocation.cancel()
    }
    
    // 'def' attribute on PanelRef at ArchiveClaimRetrievePopup.pcf: line 37, column 55
    function def_onEnter_3 (def :  pcf.RetrieveClaimInfoDV) : void {
      def.onEnter(retrieveClaimInfo)
    }
    
    // 'def' attribute on PanelRef at ArchiveClaimRetrievePopup.pcf: line 37, column 55
    function def_refreshVariables_4 (def :  pcf.RetrieveClaimInfoDV) : void {
      def.refreshVariables(retrieveClaimInfo)
    }
    
    // 'initialValue' attribute on Variable at ArchiveClaimRetrievePopup.pcf: line 20, column 33
    function initialValue_0 () : ArchivedClaimInfo {
      return new ArchivedClaimInfo()
    }
    
    // 'value' attribute on RowIterator at ArchiveClaimRetrievePopup.pcf: line 96, column 49
    function sortValue_10 (ClaimInfoSearchView :  entity.ClaimInfoSearchView) : java.lang.Object {
      return ClaimInfoSearchView.ArchiveState
    }
    
    // 'value' attribute on RowIterator at ArchiveClaimRetrievePopup.pcf: line 57, column 56
    function sortValue_5 (ClaimInfoSearchView :  entity.ClaimInfoSearchView) : java.lang.Object {
      return ClaimInfoSearchView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at ArchiveClaimRetrievePopup.pcf: line 62, column 51
    function sortValue_6 (ClaimInfoSearchView :  entity.ClaimInfoSearchView) : java.lang.Object {
      return ClaimInfoSearchView.Insured
    }
    
    // 'value' attribute on RowIterator at ArchiveClaimRetrievePopup.pcf: line 66, column 57
    function sortValue_7 (ClaimInfoSearchView :  entity.ClaimInfoSearchView) : java.lang.Object {
      return ClaimInfoSearchView.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ArchiveClaimRetrievePopup.pcf: line 87, column 53
    function sortValue_8 (ClaimInfoSearchView :  entity.ClaimInfoSearchView) : java.lang.Object {
      return ClaimInfoSearchView.LossDate
    }
    
    // 'value' attribute on RowIterator at ArchiveClaimRetrievePopup.pcf: line 91, column 61
    function sortValue_9 (ClaimInfoSearchView :  entity.ClaimInfoSearchView) : java.lang.Object {
      return ClaimInfoSearchView.ArchivedAdjuster
    }
    
    // 'value' attribute on RowIterator at ArchiveClaimRetrievePopup.pcf: line 46, column 52
    function value_36 () : entity.ClaimInfoSearchView[] {
      return restoreSet.getClaimInfoSearchViews()
    }
    
    override property get CurrentLocation () : pcf.ArchiveClaimRetrievePopup {
      return super.CurrentLocation as pcf.ArchiveClaimRetrievePopup
    }
    
    property get restoreSet () : gw.api.claim.ClaimArchiveRestoreSet {
      return getVariableValue("restoreSet", 0) as gw.api.claim.ClaimArchiveRestoreSet
    }
    
    property set restoreSet ($arg :  gw.api.claim.ClaimArchiveRestoreSet) {
      setVariableValue("restoreSet", 0, $arg)
    }
    
    property get retrieveClaimInfo () : ArchivedClaimInfo {
      return getVariableValue("retrieveClaimInfo", 0) as ArchivedClaimInfo
    }
    
    property set retrieveClaimInfo ($arg :  ArchivedClaimInfo) {
      setVariableValue("retrieveClaimInfo", 0, $arg)
    }
    
    /**
     * Restores and commits the archived claims
     */
    function restoreAction() {
      if(not retrieveClaimInfo.Comment.HasContent) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Java.Validation.MissingRequired", DisplayKey.get("Web.ArchivedClaim.Comment")))
      }
      restoreSet.restore(retrieveClaimInfo)
      CurrentLocation.commit()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Link (id=Claimant) at ArchiveClaimRetrievePopup.pcf: line 77, column 41
    function label_23 () : java.lang.Object {
      return claimantName
    }
    
    // 'visible' attribute on Link (id=ClaimantSeperator) at ArchiveClaimRetrievePopup.pcf: line 81, column 115
    function visible_24 () : java.lang.Boolean {
      return claimantList.length > 1 and claimantName != claimantList[claimantList.length - 1]
    }
    
    property get claimantName () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ArchiveClaimRetrievePopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=IDOrder) at ArchiveClaimRetrievePopup.pcf: line 57, column 56
    function action_13 () : void {
      SimpleClaimForward.go(ClaimInfoSearchView.ClaimInfo)
    }
    
    // 'action' attribute on TextCell (id=IDOrder) at ArchiveClaimRetrievePopup.pcf: line 57, column 56
    function action_dest_14 () : pcf.api.Destination {
      return pcf.SimpleClaimForward.createDestination(ClaimInfoSearchView.ClaimInfo)
    }
    
    // 'initialValue' attribute on Variable at ArchiveClaimRetrievePopup.pcf: line 50, column 40
    function initialValue_11 () : java.lang.String[] {
      return ClaimInfoSearchView.getClaimantNames()
    }
    
    // RowIterator at ArchiveClaimRetrievePopup.pcf: line 46, column 52
    function initializeVariables_35 () : void {
        claimantList = ClaimInfoSearchView.getClaimantNames();

    }
    
    // 'value' attribute on TextCell (id=IDOrder) at ArchiveClaimRetrievePopup.pcf: line 57, column 56
    function valueRoot_16 () : java.lang.Object {
      return ClaimInfoSearchView
    }
    
    // 'value' attribute on TextCell (id=IDOrder) at ArchiveClaimRetrievePopup.pcf: line 57, column 56
    function value_12 () : java.lang.String {
      return ClaimInfoSearchView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at ArchiveClaimRetrievePopup.pcf: line 62, column 51
    function value_17 () : entity.ContactInfoView {
      return ClaimInfoSearchView.Insured
    }
    
    // 'value' attribute on TextCell (id=PolicyID) at ArchiveClaimRetrievePopup.pcf: line 66, column 57
    function value_20 () : java.lang.String {
      return ClaimInfoSearchView.PolicyNumber
    }
    
    // 'value' attribute on LinkIterator (id=ClaimantInfoName) at ArchiveClaimRetrievePopup.pcf: line 74, column 48
    function value_25 () : java.lang.String[] {
      return claimantList
    }
    
    // 'value' attribute on DateCell (id=LossDate) at ArchiveClaimRetrievePopup.pcf: line 87, column 53
    function value_26 () : java.util.Date {
      return ClaimInfoSearchView.LossDate
    }
    
    // 'value' attribute on TextCell (id=Assignee) at ArchiveClaimRetrievePopup.pcf: line 91, column 61
    function value_29 () : java.lang.String {
      return ClaimInfoSearchView.ArchivedAdjuster
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at ArchiveClaimRetrievePopup.pcf: line 96, column 49
    function value_32 () : typekey.ArchiveState {
      return ClaimInfoSearchView.ArchiveState
    }
    
    property get ClaimInfoSearchView () : entity.ClaimInfoSearchView {
      return getIteratedValue(1) as entity.ClaimInfoSearchView
    }
    
    property get claimantList () : java.lang.String[] {
      return getVariableValue("claimantList", 1) as java.lang.String[]
    }
    
    property set claimantList ($arg :  java.lang.String[]) {
      setVariableValue("claimantList", 1, $arg)
    }
    
    
  }
  
  
}