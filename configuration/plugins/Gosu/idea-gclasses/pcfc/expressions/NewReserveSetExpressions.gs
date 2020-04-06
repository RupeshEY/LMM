package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewReserveSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewReserveSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (Claim :  Claim, Exposure :  Exposure, addNew :  Boolean) : int {
      return 2
    }
    
    static function __constructorIndex (Claim :  Claim, Exposure :  Exposure, CostType :  CostType, CostCategory :  CostCategory, ReservingCurrency :  Currency) : int {
      return 3
    }
    
    static function __constructorIndex (Claim :  Claim, Reserve :  Reserve, Exposure :  Exposure) : int {
      return 1
    }
    
    // 'action' attribute on ToolbarButton (id=NewReserveSet_ShowGroupedReservesButton) at NewReserveSet.pcf: line 76, column 86
    function action_3 () : void {
      PageHelper.showGroup()
    }
    
    // 'action' attribute on ToolbarButton (id=NewReserveSet_ShowAllReservesButton) at NewReserveSet.pcf: line 83, column 84
    function action_5 () : void {
      PageHelper.showAll()
    }
    
    // 'action' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at NewReserveSet.pcf: line 92, column 43
    function action_8 () : void {
      PickExistingDocumentPopup.push(Claim)
    }
    
    // 'action' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at NewReserveSet.pcf: line 92, column 43
    function action_dest_9 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(Claim)
    }
    
    // 'afterCancel' attribute on Page (id=NewReserveSet) at NewReserveSet.pcf: line 20, column 77
    function afterCancel_17 () : void {
      ClaimFinancialsTransactions.go(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RESERVE)
    }
    
    // 'afterCancel' attribute on Page (id=NewReserveSet) at NewReserveSet.pcf: line 20, column 77
    function afterCancel_dest_18 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactions.createDestination(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RESERVE)
    }
    
    // 'afterCommit' attribute on Page (id=NewReserveSet) at NewReserveSet.pcf: line 20, column 77
    function afterCommit_19 (TopLocation :  pcf.api.Location) : void {
      ClaimFinancialsTransactions.go(Claim, gw.api.financials.ClaimFinancialsTransactionsOption.RESERVE)
    }
    
    // 'afterEnter' attribute on Page (id=NewReserveSet) at NewReserveSet.pcf: line 20, column 77
    function afterEnter_20 () : void {
      afterEnter()
    }
    
    // 'available' attribute on ToolbarButton (id=NewReserveSet_ShowGroupedReservesButton) at NewReserveSet.pcf: line 76, column 86
    function available_2 () : java.lang.Boolean {
      return PageHelper.ShowGroupButtonVisible
    }
    
    // 'available' attribute on ToolbarButton (id=NewReserveSet_ShowAllReservesButton) at NewReserveSet.pcf: line 83, column 84
    function available_4 () : java.lang.Boolean {
      return PageHelper.ShowAllButtonVisible
    }
    
    // 'available' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at NewReserveSet.pcf: line 92, column 43
    function available_6 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'beforeCommit' attribute on Page (id=NewReserveSet) at NewReserveSet.pcf: line 20, column 77
    function beforeCommit_21 (pickedValue :  java.lang.Object) : void {
      beforeCommit()
    }
    
    // 'canVisit' attribute on Page (id=NewReserveSet) at NewReserveSet.pcf: line 20, column 77
    static function canVisit_22 (Claim :  Claim, CostCategory :  CostCategory, CostType :  CostType, Exposure :  Exposure, Reserve :  Reserve, ReservingCurrency :  Currency, addNew :  Boolean) : java.lang.Boolean {
      return perm.Claim.createreserve(Claim) and perm.Claim.viewreserves(Claim) and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'def' attribute on PanelRef at NewReserveSet.pcf: line 109, column 64
    function def_onEnter_15 (def :  pcf.ReservesSummaryDV) : void {
      def.onEnter(PageHelper, Exposure, addNew)
    }
    
    // 'def' attribute on PanelRef at NewReserveSet.pcf: line 109, column 64
    function def_refreshVariables_16 (def :  pcf.ReservesSummaryDV) : void {
      def.refreshVariables(PageHelper, Exposure, addNew)
    }
    
    // 'initialValue' attribute on Variable at NewReserveSet.pcf: line 32, column 53
    function initialValue_0 () : gw.api.financials.ReserveWizardHelper {
      return gw.api.financials.ReserveWizardHelper.createReserveWizardHelper()
    }
    
    // 'initialValue' attribute on Variable at NewReserveSet.pcf: line 58, column 52
    function initialValue_1 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'label' attribute on Verbatim at NewReserveSet.pcf: line 95, column 265
    function label_11 () : java.lang.String {
      return (PageHelper.getReservesUIMode() == gw.api.financials.ReserveWizardHelper.UIMODE_SETBYNEWTOTALINCURRED) ? DisplayKey.get("JSP.NewReserveSet.Helper.TotalIncurred") : DisplayKey.get("JSP.NewReserveSet.Helper") as java.lang.String
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at NewReserveSet.pcf: line 92, column 43
    function onPick_10 (PickedValue :  Document) : void {
      PageHelper.addLinkedDocument(PickedValue)
    }
    
    // 'onResume' attribute on Page (id=NewReserveSet) at NewReserveSet.pcf: line 20, column 77
    function onResume_23 () : void {
      gw.api.system.bundle.BundleCommitCondition.verify(Claim)
    }
    
    // 'parent' attribute on Page (id=NewReserveSet) at NewReserveSet.pcf: line 20, column 77
    static function parent_24 (Claim :  Claim, CostCategory :  CostCategory, CostType :  CostType, Exposure :  Exposure, Reserve :  Reserve, ReservingCurrency :  Currency, addNew :  Boolean) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'visible' attribute on AlertBar (id=IDCSDisabledAlert) at NewReserveSet.pcf: line 99, column 68
    function visible_12 () : java.lang.Boolean {
      return not documentsActionsHelper.ContentSourceEnabled
    }
    
    // 'visible' attribute on AlertBar (id=IDCSUnavailableAlert) at NewReserveSet.pcf: line 103, column 72
    function visible_13 () : java.lang.Boolean {
      return documentsActionsHelper.ShowContentServerDownWarning
    }
    
    // 'visible' attribute on AlertBar (id=IDMSUnavailableAlert) at NewReserveSet.pcf: line 107, column 73
    function visible_14 () : java.lang.Boolean {
      return documentsActionsHelper.ShowMetadataServerDownWarning
    }
    
    // 'visible' attribute on PickerToolbarButton (id=Button_Reserve_LinkDocument) at NewReserveSet.pcf: line 92, column 43
    function visible_7 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    property get CostCategory () : CostCategory {
      return getVariableValue("CostCategory", 0) as CostCategory
    }
    
    property set CostCategory ($arg :  CostCategory) {
      setVariableValue("CostCategory", 0, $arg)
    }
    
    property get CostType () : CostType {
      return getVariableValue("CostType", 0) as CostType
    }
    
    property set CostType ($arg :  CostType) {
      setVariableValue("CostType", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewReserveSet {
      return super.CurrentLocation as pcf.NewReserveSet
    }
    
    property get Exposure () : Exposure {
      return getVariableValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setVariableValue("Exposure", 0, $arg)
    }
    
    property get PageHelper () : gw.api.financials.ReserveWizardHelper {
      return getVariableValue("PageHelper", 0) as gw.api.financials.ReserveWizardHelper
    }
    
    property set PageHelper ($arg :  gw.api.financials.ReserveWizardHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get Reserve () : Reserve {
      return getVariableValue("Reserve", 0) as Reserve
    }
    
    property set Reserve ($arg :  Reserve) {
      setVariableValue("Reserve", 0, $arg)
    }
    
    property get ReservingCurrency () : Currency {
      return getVariableValue("ReservingCurrency", 0) as Currency
    }
    
    property set ReservingCurrency ($arg :  Currency) {
      setVariableValue("ReservingCurrency", 0, $arg)
    }
    
    property get addNew () : Boolean {
      return getVariableValue("addNew", 0) as Boolean
    }
    
    property set addNew ($arg :  Boolean) {
      setVariableValue("addNew", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    /**
     * Get the new copy of Exposure in the bundle, the original having been
     * kicked out of bundle by ReserveWizardHelper.beforeCommit().
     */
    function refreshExposure( bean : Exposure) : Exposure {
      if (bean == null) {
        return bean;
      }
      return gw.transaction.Transaction.getCurrent().loadBean( bean.ID ) as Exposure
    }
    
    function afterEnter() {
      if (PageHelper.getTransactionWrappers().length == 0) {     
        PageHelper.initializeTransactionSet(Claim);                     
      }
      PageHelper.updateTransactionSet(Claim, Reserve, Exposure, CostType, CostCategory, ReservingCurrency);   
      Claim.freezeCurrency();
    }
    
    function beforeCommit() {
      gw.api.system.bundle.BundleCommitCondition.verify(Claim)
      PageHelper.beforeCommit()
      Exposure = refreshExposure(Exposure)
    }
    
    
  }
  
  
}