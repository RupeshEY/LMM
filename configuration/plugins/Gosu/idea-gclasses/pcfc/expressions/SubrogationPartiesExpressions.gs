package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.subrogation.financials.AdversePartyWrapper
@javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SubrogationPartiesExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardViewPanelExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=CreateRecoveryReserve) at SubrogationParties.pcf: line 91, column 163
    function action_19 () : void {
      createRecoveryReserve(claim, adversePartyRow)
    }
    
    // 'action' attribute on ToolbarButton (id=CreateFromTemplate) at SubrogationParties.pcf: line 296, column 89
    function action_88 () : void {
      ClaimNewDocumentFromTemplateWorksheet.goInWorkspace(claim, claim.SubrogationSummary.getDocumentInitForUI(subroadverseparty))
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at SubrogationParties.pcf: line 301, column 89
    function action_91 () : void {
      ClaimNewDocumentLinkedWorksheet.goInWorkspace(claim, claim.SubrogationSummary.getDocumentInitForUI(subroadverseparty))
    }
    
    // 'action' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationParties.pcf: line 307, column 104
    function action_94 () : void {
      PickExistingDocumentPopup.push(claim)
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshAsyncContent) at SubrogationParties.pcf: line 314, column 101
    function action_99 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=CreateFromTemplate) at SubrogationParties.pcf: line 296, column 89
    function action_dest_89 () : pcf.api.Destination {
      return pcf.ClaimNewDocumentFromTemplateWorksheet.createDestination(claim, claim.SubrogationSummary.getDocumentInitForUI(subroadverseparty))
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at SubrogationParties.pcf: line 301, column 89
    function action_dest_92 () : pcf.api.Destination {
      return pcf.ClaimNewDocumentLinkedWorksheet.createDestination(claim, claim.SubrogationSummary.getDocumentInitForUI(subroadverseparty))
    }
    
    // 'action' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationParties.pcf: line 307, column 104
    function action_dest_95 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(claim)
    }
    
    // 'available' attribute on ToolbarButton (id=CreateFromTemplate) at SubrogationParties.pcf: line 296, column 89
    function available_87 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentTemplateActionsAvailable
    }
    
    // 'available' attribute on ToolbarButton (id=AttachDocument) at SubrogationParties.pcf: line 301, column 89
    function available_90 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable and documentsActionsHelper.DocumentContentActionsAvailable
    }
    
    // 'available' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationParties.pcf: line 307, column 104
    function available_93 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'available' attribute on ToolbarButton (id=RefreshAsyncContent) at SubrogationParties.pcf: line 314, column 101
    function available_97 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentContentServerAvailable
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 290, column 60
    function def_onEnter_100 (def :  pcf.SubrogationDocumentsLV) : void {
      def.onEnter(subroDocuments)
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 72, column 65
    function def_onEnter_14 (def :  pcf.SubrogationPartyDetailDV) : void {
      def.onEnter(subroadverseparty)
    }
    
    // 'def' attribute on InputSetRef at SubrogationParties.pcf: line 278, column 58
    function def_onEnter_82 (def :  pcf.DeductibleInputSet) : void {
      def.onEnter(claim, true)
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 288, column 46
    function def_onEnter_85 (def :  pcf.DocumentAlertPanelSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 290, column 60
    function def_refreshVariables_101 (def :  pcf.SubrogationDocumentsLV) : void {
      def.refreshVariables(subroDocuments)
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 72, column 65
    function def_refreshVariables_15 (def :  pcf.SubrogationPartyDetailDV) : void {
      def.refreshVariables(subroadverseparty)
    }
    
    // 'def' attribute on InputSetRef at SubrogationParties.pcf: line 278, column 58
    function def_refreshVariables_83 (def :  pcf.DeductibleInputSet) : void {
      def.refreshVariables(claim, true)
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 288, column 46
    function def_refreshVariables_86 (def :  pcf.DocumentAlertPanelSet) : void {
      def.refreshVariables()
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 61, column 39
    function initialValue_10 () : SubroAdverseParty {
      return adversePartyRow.AdverseParty
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 66, column 32
    function initialValue_11 () : Document[] {
      return claim.SubrogationSummary.getRelatedDocuments(subroadverseparty)
    }
    
    // EditButtons at SubrogationParties.pcf: line 75, column 63
    function label_13 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationParties.pcf: line 307, column 104
    function onPick_96 (PickedValue :  Document) : void {
      claim.SubrogationSummary.linkDocumentForUI(PickedValue, subroadverseparty)
    }
    
    // 'title' attribute on Card (id=DetailAdverseViewTitleCard) at SubrogationParties.pcf: line 70, column 60
    function title_17 () : java.lang.String {
      return DisplayKey.get("Web.Subrogation.SubrogationParties.DetailViewTitle", subroadverseparty.AdverseParty)
    }
    
    // 'title' attribute on Card (id=AdversePartyFinancialsCard) at SubrogationParties.pcf: line 82, column 210
    function title_84 () : java.lang.String {
      return subroadverseparty != null ? DisplayKey.get("Web.Subrogation.SubrogationParties.FinancialsTab") : DisplayKey.get("Web.Subrogation.SubrogationParties.ClaimFinancialsTab")
    }
    
    // 'editVisible' attribute on EditButtons at SubrogationParties.pcf: line 75, column 63
    function visible_12 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    // 'visible' attribute on Card (id=DetailAdverseViewTitleCard) at SubrogationParties.pcf: line 70, column 60
    function visible_16 () : java.lang.Boolean {
      return adversePartyRow.AdverseParty != null
    }
    
    // 'visible' attribute on ToolbarButton (id=CreateRecoveryReserve) at SubrogationParties.pcf: line 91, column 163
    function visible_18 () : java.lang.Boolean {
      return subroadverseparty == null and gw.api.system.CCConfigParameters.UseRecoveryReserves.Value and perm.Claim.createrecoveryreserve(claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=RefreshAsyncContent) at SubrogationParties.pcf: line 314, column 101
    function visible_98 () : java.lang.Boolean {
      return documentsActionsHelper.isShowAsynchronousRefreshAction(subroDocuments)
    }
    
    property get subroDocuments () : Document[] {
      return getVariableValue("subroDocuments", 2) as Document[]
    }
    
    property set subroDocuments ($arg :  Document[]) {
      setVariableValue("subroDocuments", 2, $arg)
    }
    
    property get subroadverseparty () : SubroAdverseParty {
      return getVariableValue("subroadverseparty", 2) as SubroAdverseParty
    }
    
    property set subroadverseparty ($arg :  SubroAdverseParty) {
      setVariableValue("subroadverseparty", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends SubrogationRecoveriesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 4)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=CreateDate) at SubrogationParties.pcf: line 242, column 52
    function valueRoot_68 () : java.lang.Object {
      return recovery
    }
    
    // 'value' attribute on DateCell (id=CreateDate) at SubrogationParties.pcf: line 242, column 52
    function value_66 () : java.util.Date {
      return recovery.CreateTime
    }
    
    // 'value' attribute on TextCell (id=ReserveLine) at SubrogationParties.pcf: line 247, column 55
    function value_69 () : entity.ReserveLine {
      return recovery.ReserveLine
    }
    
    // 'value' attribute on CurrencyCell (id=RecoveryAmount) at SubrogationParties.pcf: line 251, column 57
    function value_72 () : gw.api.financials.CurrencyAmount {
      return recovery.ReservingAmount
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at SubrogationParties.pcf: line 256, column 62
    function value_75 () : typekey.TransactionStatus {
      return recovery.Status
    }
    
    property get recovery () : entity.Recovery {
      return getIteratedValue(4) as entity.Recovery
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SubrogationFinancialsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 4)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'useSubHeaderStyle' attribute on Row at SubrogationParties.pcf: line 154, column 58
    function useSubHeaderStyle_42 () : java.lang.Boolean {
      return fsRow.Level == 1
    }
    
    // 'value' attribute on TextCell (id=Label) at SubrogationParties.pcf: line 157, column 44
    function valueRoot_25 () : java.lang.Object {
      return fsRow
    }
    
    // 'value' attribute on TextCell (id=Label) at SubrogationParties.pcf: line 157, column 44
    function value_23 () : java.lang.String {
      return fsRow.Label
    }
    
    // 'value' attribute on CurrencyCell (id=Paid) at SubrogationParties.pcf: line 160, column 116
    function value_26 () : gw.api.financials.CurrencyAmount {
      return fsRow.getCalculations()[gw.subrogation.financials.SubrogationCalculationsEnum.PAID]
    }
    
    // 'value' attribute on CurrencyCell (id=RecoveryAmount) at SubrogationParties.pcf: line 163, column 122
    function value_28 () : gw.api.financials.CurrencyAmount {
      return fsRow.getCalculations()[gw.subrogation.financials.SubrogationCalculationsEnum.RECOVERIES]
    }
    
    // 'value' attribute on CurrencyCell (id=NetPaidAmount) at SubrogationParties.pcf: line 166, column 120
    function value_30 () : gw.api.financials.CurrencyAmount {
      return fsRow.getCalculations()[gw.subrogation.financials.SubrogationCalculationsEnum.NET_PAID]
    }
    
    // 'value' attribute on CurrencyCell (id=DeductibleAmount) at SubrogationParties.pcf: line 169, column 122
    function value_32 () : gw.api.financials.CurrencyAmount {
      return fsRow.getCalculations()[gw.subrogation.financials.SubrogationCalculationsEnum.DEDUCTIBLE]
    }
    
    // 'value' attribute on CurrencyCell (id=ExpectedRecoveryAmount) at SubrogationParties.pcf: line 172, column 129
    function value_34 () : gw.api.financials.CurrencyAmount {
      return fsRow.getCalculations()[gw.subrogation.financials.SubrogationCalculationsEnum.EXPECTED_RECOVERY]
    }
    
    // 'value' attribute on CurrencyCell (id=SubroRecoveredAmount) at SubrogationParties.pcf: line 175, column 134
    function value_36 () : gw.api.financials.CurrencyAmount {
      return fsRow.getCalculations()[gw.subrogation.financials.SubrogationCalculationsEnum.SUBROGATION_RECOVERIES]
    }
    
    // 'value' attribute on CurrencyCell (id=PendingAmount) at SubrogationParties.pcf: line 178, column 119
    function value_38 () : gw.api.financials.CurrencyAmount {
      return fsRow.getCalculations()[gw.subrogation.financials.SubrogationCalculationsEnum.PENDING]
    }
    
    // 'value' attribute on CurrencyCell (id=AvailableRecoveryReserves) at SubrogationParties.pcf: line 181, column 134
    function value_40 () : gw.api.financials.CurrencyAmount {
      return fsRow.getCalculations()[gw.subrogation.financials.SubrogationCalculationsEnum.OPEN_RECOVERY_RESERVES]
    }
    
    property get fsRow () : gw.subrogation.financials.AbstractSubroFinsNode {
      return getIteratedValue(4) as gw.subrogation.financials.AbstractSubroFinsNode
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends SubrogationPartiesExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 55, column 76
    function def_onEnter_8 (def :  pcf.EditableSubrogationPartiesLV) : void {
      def.onEnter(adversePartyWrappers, claim)
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 55, column 76
    function def_refreshVariables_9 (def :  pcf.EditableSubrogationPartiesLV) : void {
      def.refreshVariables(adversePartyWrappers, claim)
    }
    
    // 'selectionOnEnter' attribute on ListDetailPanel at SubrogationParties.pcf: line 53, column 71
    function selectionOnEnter_103 () : java.lang.Object {
      return adversePartyWrappers.firstWhere(\ wrapper -> wrapper == selectedWrapper)
    }
    
    property get adversePartyRow () : gw.subrogation.financials.AdversePartyWrapper {
      return getCurrentSelection(1) as gw.subrogation.financials.AdversePartyWrapper
    }
    
    property set adversePartyRow ($arg :  gw.subrogation.financials.AdversePartyWrapper) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationFinancialsLVExpressionsImpl extends CardViewPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 103, column 69
    function initialValue_20 () : gw.subrogation.financials.SubroFinsResult {
      return gw.subrogation.financials.SubrogationFinancialsHelper.getSubroFinancialsRows(claim, subroadverseparty)
    }
    
    // 'value' attribute on TextCell (id=AvailableRecoveryReservesHeader) at SubrogationParties.pcf: line 146, column 345
    function value_21 () : java.lang.String {
      if(gw.api.system.CCConfigParameters.UseRecoveryReserves.getValue()) { return subroadverseparty == null ? DisplayKey.get("Web.Subrogation.Financials.Header.OpenRecoveryReserves") : DisplayKey.get("Web.Subrogation.Financials.Header.ApportionedOpenRecoveryReserves") } else { return "" }
    }
    
    // 'value' attribute on RowIterator at SubrogationParties.pcf: line 152, column 101
    function value_43 () : java.util.List<gw.subrogation.financials.AbstractSubroFinsNode> {
      return subroFinsResult.Nodes
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPaid) at SubrogationParties.pcf: line 192, column 113
    function value_44 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.PAID]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalRecovered) at SubrogationParties.pcf: line 195, column 119
    function value_46 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.RECOVERIES]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalNetPaid) at SubrogationParties.pcf: line 198, column 117
    function value_48 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.NET_PAID]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalDeductible) at SubrogationParties.pcf: line 201, column 119
    function value_50 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.DEDUCTIBLE]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalExpectedRecovery) at SubrogationParties.pcf: line 204, column 126
    function value_52 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.EXPECTED_RECOVERY]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalSubroRecovered) at SubrogationParties.pcf: line 207, column 131
    function value_54 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.SUBROGATION_RECOVERIES]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPending) at SubrogationParties.pcf: line 210, column 116
    function value_56 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.PENDING]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalAvailableRecoveryReserves) at SubrogationParties.pcf: line 213, column 131
    function value_58 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.OPEN_RECOVERY_RESERVES]
    }
    
    // 'visible' attribute on Row at SubrogationParties.pcf: line 186, column 66
    function visible_60 () : java.lang.Boolean {
      return subroFinsResult.Totals.size() > 0
    }
    
    property get subroFinsResult () : gw.subrogation.financials.SubroFinsResult {
      return getVariableValue("subroFinsResult", 3) as gw.subrogation.financials.SubroFinsResult
    }
    
    property set subroFinsResult ($arg :  gw.subrogation.financials.SubroFinsResult) {
      setVariableValue("subroFinsResult", 3, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationPartiesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : int {
      return 1
    }
    
    // 'afterCommit' attribute on Page (id=SubrogationParties) at SubrogationParties.pcf: line 11, column 76
    function afterCommit_104 (TopLocation :  pcf.api.Location) : void {
      adversePartyWrappers = gw.subrogation.financials.SubrogationFinancialsHelper.getSelectableAdversePartiesWithTotalRow(claim)
    }
    
    // 'afterReturnFromPopup' attribute on Page (id=SubrogationParties) at SubrogationParties.pcf: line 11, column 76
    function afterReturnFromPopup_105 (popupCommitted :  boolean) : void {
      if(claim.SubrogationSummary.SubroAdverseParties.Count == 0) { CurrentLocation.cancel() }
    }
    
    // 'canVisit' attribute on Page (id=SubrogationParties) at SubrogationParties.pcf: line 11, column 76
    static function canVisit_107 (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : java.lang.Boolean {
      return perm.Claim.view(claim) and perm.System.viewsubrodetails
    }
    
    // 'conversionExpression' attribute on AddButton (id=AddNewSubroAdverseParty) at SubrogationParties.pcf: line 42, column 51
    function conversionExpression_4 (PickedValue :  entity.SubroAdverseParty) : gw.subrogation.financials.AdversePartyWrapper {
      return new gw.subrogation.financials.AdversePartyWrapper(PickedValue)
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 22, column 83
    function initialValue_0 () : java.util.List<gw.subrogation.financials.AdversePartyWrapper> {
      return gw.subrogation.financials.SubrogationFinancialsHelper.getSelectableAdversePartiesWithTotalRow(claim)
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 26, column 61
    function initialValue_1 () : gw.subrogation.financials.AdversePartyWrapper {
      return null
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 30, column 52
    function initialValue_2 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // Page (id=SubrogationParties) at SubrogationParties.pcf: line 11, column 76
    static function parent_108 (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : pcf.api.Destination {
      return pcf.ClaimSubrogationGroup.createDestination(claim)
    }
    
    // 'pickLocation' attribute on AddButton (id=AddNewSubroAdverseParty) at SubrogationParties.pcf: line 42, column 51
    function pickLocation_5 () : void {
      NewSubroAdversePartyPopup.push(claim)
    }
    
    // 'showRemoveConfirmMessage' attribute on IteratorButtons at SubrogationParties.pcf: line 47, column 117
    function showConfirmMessage_7 () : java.lang.Boolean {
      return not claim.SubrogationSummary.Subrogations*.SubroAdversePartyOverrides.IsEmpty
    }
    
    // 'visible' attribute on AddButton (id=AddNewSubroAdverseParty) at SubrogationParties.pcf: line 42, column 51
    function visible_3 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    override property get CurrentLocation () : pcf.SubrogationParties {
      return super.CurrentLocation as pcf.SubrogationParties
    }
    
    property get adversePartyWrappers () : java.util.List<gw.subrogation.financials.AdversePartyWrapper> {
      return getVariableValue("adversePartyWrappers", 0) as java.util.List<gw.subrogation.financials.AdversePartyWrapper>
    }
    
    property set adversePartyWrappers ($arg :  java.util.List<gw.subrogation.financials.AdversePartyWrapper>) {
      setVariableValue("adversePartyWrappers", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get selectedWrapper () : gw.subrogation.financials.AdversePartyWrapper {
      return getVariableValue("selectedWrapper", 0) as gw.subrogation.financials.AdversePartyWrapper
    }
    
    property set selectedWrapper ($arg :  gw.subrogation.financials.AdversePartyWrapper) {
      setVariableValue("selectedWrapper", 0, $arg)
    }
    
    
    function createRecoveryReserve(aClaim : Claim, currentWrapper : AdversePartyWrapper) {
      CurrentLocation.startEditing()
    
      var success =  false
      try {
        aClaim.AutoSetOpenRecoveryReserve()
        CurrentLocation.commit()
        CurrentLocation.go(aClaim, currentWrapper)
        success = true
      } finally {
        if (!success) {
          CurrentLocation.cancel()
        }
      }
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationRecoveriesLVExpressionsImpl extends CardViewPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 231, column 58
    function initialValue_61 () : java.util.List<Recovery> {
      return subroadverseparty != null ? subroadverseparty.getSubroRecoveriesForParty() : claim.SubroClaimCostRecoveries
    }
    
    // 'value' attribute on RowIterator at SubrogationParties.pcf: line 242, column 52
    function sortValue_62 (recovery :  entity.Recovery) : java.lang.Object {
      return recovery.CreateTime
    }
    
    // 'value' attribute on RowIterator at SubrogationParties.pcf: line 247, column 55
    function sortValue_63 (recovery :  entity.Recovery) : java.lang.Object {
      return recovery.ReserveLine
    }
    
    // 'value' attribute on RowIterator at SubrogationParties.pcf: line 251, column 57
    function sortValue_64 (recovery :  entity.Recovery) : java.lang.Object {
      return recovery.ReservingAmount
    }
    
    // 'value' attribute on RowIterator at SubrogationParties.pcf: line 256, column 62
    function sortValue_65 (recovery :  entity.Recovery) : java.lang.Object {
      return recovery.Status
    }
    
    // 'value' attribute on RowIterator at SubrogationParties.pcf: line 236, column 69
    function value_78 () : java.util.List<entity.Recovery> {
      return recoveries
    }
    
    // 'value' attribute on CurrencyCell (id=RecoveryAmountTotalFooter) at SubrogationParties.pcf: line 269, column 93
    function value_79 () : gw.api.financials.CurrencyAmount {
      return recoveries.sumCurrencyAmount(\ rec -> rec.ReservingAmount )
    }
    
    // 'visible' attribute on Row at SubrogationParties.pcf: line 261, column 174
    function visible_81 () : java.lang.Boolean {
      return recoveries.size() > 0 and !recoveries.hasMatch(\ rec -> rec.ReserveLine.ReservingCurrency != recoveries[0].ReserveLine.ReservingCurrency )
    }
    
    property get recoveries () : java.util.List<Recovery> {
      return getVariableValue("recoveries", 3) as java.util.List<Recovery>
    }
    
    property set recoveries ($arg :  java.util.List<Recovery>) {
      setVariableValue("recoveries", 3, $arg)
    }
    
    
  }
  
  
}