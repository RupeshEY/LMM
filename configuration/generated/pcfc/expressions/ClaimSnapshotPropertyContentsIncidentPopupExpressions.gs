package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPropertyContentsIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPropertyContentsIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, IncidentParam :  dynamic.Dynamic) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 58, column 43
    function def_onEnter_10 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_700) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 58, column 43
    function def_onEnter_12 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_800) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 58, column 43
    function def_onEnter_14 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_default) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 58, column 43
    function def_onEnter_8 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_600) : void {
      def.onEnter(Claim, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 58, column 43
    function def_refreshVariables_11 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_700) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 58, column 43
    function def_refreshVariables_13 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_800) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 58, column 43
    function def_refreshVariables_15 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_default) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 58, column 43
    function def_refreshVariables_9 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_600) : void {
      def.refreshVariables(Claim, Snapshot)
    }
    
    // 'icon' attribute on TitleBar at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 34, column 82
    function icon_4 () : java.lang.String {
      return gw.api.claim.IncidentIconSet.PROPERTY_CONTENTS.DefaultHeaderIcon
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 19, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return gw.api.snapshot.ClaimSnapshotUtil.getSnapshot(Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 23, column 22
    function initialValue_1 () : String {
      return gw.api.snapshot.ClaimSnapshotUtil.getPageVersion(Snapshot)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 27, column 31
    function initialValue_2 () : dynamic.Dynamic {
      return IncidentParam
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 31, column 31
    function initialValue_3 () : dynamic.Dynamic {
      return ((Snapshot).Policy.PrimaryLocation)
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsScheduledItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 84, column 46
    function sortValue_17 (scheduledItem :  dynamic.Dynamic) : java.lang.Object {
      return scheduledItem.PropertyItem.Description
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsScheduledItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 90, column 46
    function sortValue_18 (scheduledItem :  dynamic.Dynamic) : java.lang.Object {
      return scheduledItem.PropertyItem.AppraisedValue
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 118, column 46
    function sortValue_28 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.NumberOfItems
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 126, column 46
    function sortValue_29 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.Description
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 132, column 46
    function sortValue_30 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.ContentCategory
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 148, column 39
    function sortValue_33 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.DateAcquired
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 155, column 46
    function sortValue_34 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.Age
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 202, column 126
    function sortValue_37 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.ItemComment
    }
    
    // '$$sumValue' attribute on RowIterator (id=PropertyContentsScheduledItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 90, column 46
    function sumValueRoot_20 (scheduledItem :  dynamic.Dynamic) : java.lang.Object {
      return scheduledItem.PropertyItem
    }
    
    // '$$sumValue' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 175, column 35
    function sumValueRoot_42 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.ReplacementValue
    }
    
    // '$$sumValue' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 185, column 35
    function sumValueRoot_44 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.ActualCashValue
    }
    
    // '$$sumValue' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 195, column 35
    function sumValueRoot_46 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.AmountAfterLimit
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PropertyContentsScheduledItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 90, column 46
    function sumValue_19 (scheduledItem :  dynamic.Dynamic) : java.lang.Object {
      return scheduledItem.PropertyItem.AppraisedValue
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 175, column 35
    function sumValue_41 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.ReplacementValue.Amount
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 185, column 35
    function sumValue_43 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.ActualCashValue.Amount
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 195, column 35
    function sumValue_45 (item :  dynamic.Dynamic) : java.lang.Object {
      return item.AmountAfterLimit.Amount
    }
    
    // 'title' attribute on TitleBar (id=ScheduledItemsTitle) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 65, column 258
    function title_16 () : java.lang.String {
      return ((policyLocation.HighValueItems).length > 0) ? DisplayKey.get("Web.PropertyContentsIncident.ScheduledItems", (policyLocation.HighValueItems).length) : DisplayKey.get("Web.PropertyContentsIncident.NoScheduledItems")
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 50, column 50
    function valueRoot_7 () : java.lang.Object {
      return incident
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsScheduledItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 75, column 41
    function value_27 () : dynamic.Dynamic {
      return incident.PropertyContentsScheduledItems
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 50, column 50
    function value_5 () : dynamic.Dynamic {
      return incident.Description
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 108, column 41
    function value_85 () : dynamic.Dynamic {
      return incident.ContentItemLine
    }
    
    // 'visible' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 142, column 35
    function visible_31 () : java.lang.Boolean {
      return InEditMode
    }
    
    // 'visible' attribute on RowIterator (id=PropertyContentsLineItems) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 202, column 126
    function visible_36 () : java.lang.Boolean {
      return !InEditMode || (gw.api.print.PrintUtil.isPrintingPDF() || gw.api.print.PrintUtil.isPrintingCSV())
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSnapshotPropertyContentsIncidentPopup {
      return super.CurrentLocation as pcf.ClaimSnapshotPropertyContentsIncidentPopup
    }
    
    property get IncidentParam () : dynamic.Dynamic {
      return getVariableValue("IncidentParam", 0) as dynamic.Dynamic
    }
    
    property set IncidentParam ($arg :  dynamic.Dynamic) {
      setVariableValue("IncidentParam", 0, $arg)
    }
    
    property get Snapshot () : dynamic.Dynamic {
      return getVariableValue("Snapshot", 0) as dynamic.Dynamic
    }
    
    property set Snapshot ($arg :  dynamic.Dynamic) {
      setVariableValue("Snapshot", 0, $arg)
    }
    
    property get Version () : String {
      return getVariableValue("Version", 0) as String
    }
    
    property set Version ($arg :  String) {
      setVariableValue("Version", 0, $arg)
    }
    
    property get incident () : dynamic.Dynamic {
      return getVariableValue("incident", 0) as dynamic.Dynamic
    }
    
    property set incident ($arg :  dynamic.Dynamic) {
      setVariableValue("incident", 0, $arg)
    }
    
    property get policyLocation () : dynamic.Dynamic {
      return getVariableValue("policyLocation", 0) as dynamic.Dynamic
    }
    
    property set policyLocation ($arg :  dynamic.Dynamic) {
      setVariableValue("policyLocation", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotPropertyContentsIncidentPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=LineItemQuantity) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 118, column 46
    function valueRoot_50 () : java.lang.Object {
      return item
    }
    
    // 'value' attribute on TextCell (id=LineItemQuantity) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 118, column 46
    function value_48 () : dynamic.Dynamic {
      return item.NumberOfItems
    }
    
    // 'value' attribute on TextCell (id=LineItemName) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 126, column 46
    function value_51 () : dynamic.Dynamic {
      return item.Description
    }
    
    // 'value' attribute on TextCell (id=LineItemCategory) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 132, column 46
    function value_54 () : dynamic.Dynamic {
      return item.ContentCategory
    }
    
    // 'value' attribute on TextCell (id=LineItemOriginalCost) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 142, column 35
    function value_58 () : dynamic.Dynamic {
      return item.PurchaseCost
    }
    
    // 'value' attribute on TextCell (id=LineItemPurchaseDate) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 148, column 39
    function value_62 () : dynamic.Dynamic {
      return item.DateAcquired
    }
    
    // 'value' attribute on TextCell (id=LineItemAge) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 155, column 46
    function value_65 () : dynamic.Dynamic {
      return item.Age
    }
    
    // 'value' attribute on TextCell (id=LineItemDepreciationPercentage) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 165, column 35
    function value_69 () : dynamic.Dynamic {
      return item.DepreciationPercentage
    }
    
    // 'value' attribute on TextCell (id=LineItemReplacementValue) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 175, column 35
    function value_72 () : dynamic.Dynamic {
      return item.ReplacementValue
    }
    
    // 'value' attribute on TextCell (id=LineItemTotalACV) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 185, column 35
    function value_75 () : dynamic.Dynamic {
      return item.ActualCashValue
    }
    
    // 'value' attribute on TextCell (id=LineItemAmountAfterLimit) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 195, column 35
    function value_78 () : dynamic.Dynamic {
      return item.AmountAfterLimit 
    }
    
    // 'value' attribute on TextCell (id=LineItemNotes) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 202, column 126
    function value_82 () : dynamic.Dynamic {
      return item.ItemComment
    }
    
    // 'visible' attribute on TextCell (id=LineItemOriginalCost) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 142, column 35
    function visible_57 () : java.lang.Boolean {
      return InEditMode
    }
    
    // 'visible' attribute on TextCell (id=LineItemNotes) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 202, column 126
    function visible_81 () : java.lang.Boolean {
      return !InEditMode || (gw.api.print.PrintUtil.isPrintingPDF() || gw.api.print.PrintUtil.isPrintingCSV())
    }
    
    property get item () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotPropertyContentsIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPropertyContentsIncidentPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ScheduledItemDescription) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 84, column 46
    function valueRoot_23 () : java.lang.Object {
      return scheduledItem.PropertyItem
    }
    
    // 'value' attribute on TextCell (id=ScheduledItemDescription) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 84, column 46
    function value_21 () : dynamic.Dynamic {
      return scheduledItem.PropertyItem.Description
    }
    
    // 'value' attribute on TextCell (id=ScheduledItemValue) at ClaimSnapshotPropertyContentsIncidentPopup.pcf: line 90, column 46
    function value_24 () : dynamic.Dynamic {
      return scheduledItem.PropertyItem.AppraisedValue
    }
    
    property get scheduledItem () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}