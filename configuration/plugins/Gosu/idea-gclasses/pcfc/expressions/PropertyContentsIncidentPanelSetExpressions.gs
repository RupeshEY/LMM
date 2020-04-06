package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PropertyContentsIncidentPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends PropertyContentsIncidentPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=LineItemQuantity) at PropertyContentsIncidentPanelSet.pcf: line 144, column 46
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.NumberOfItems = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextCell (id=LineItemName) at PropertyContentsIncidentPanelSet.pcf: line 152, column 41
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=LineItemCategory) at PropertyContentsIncidentPanelSet.pcf: line 159, column 60
    function defaultSetter_64 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.ContentCategory = (__VALUE_TO_SET as typekey.ContentLineItemCategory)
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemOriginalCost) at PropertyContentsIncidentPanelSet.pcf: line 169, column 33
    function defaultSetter_69 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.PurchaseCost = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on DateCell (id=LineItemPurchaseDate) at PropertyContentsIncidentPanelSet.pcf: line 176, column 36
    function defaultSetter_75 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.DateAcquired = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextCell (id=LineItemDepreciationPercentage) at PropertyContentsIncidentPanelSet.pcf: line 198, column 32
    function defaultSetter_84 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.DepreciationPercentage = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemReplacementValue) at PropertyContentsIncidentPanelSet.pcf: line 210, column 32
    function defaultSetter_88 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.ReplacementValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemAmountAfterLimit) at PropertyContentsIncidentPanelSet.pcf: line 231, column 33
    function defaultSetter_95 (__VALUE_TO_SET :  java.lang.Object) : void {
      item.AmountAfterLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'requestValidationExpression' attribute on TextCell (id=LineItemQuantity) at PropertyContentsIncidentPanelSet.pcf: line 144, column 46
    function requestValidationExpression_54 (VALUE :  java.lang.Integer) : java.lang.Object {
      return (VALUE != null and VALUE < 1) ? DisplayKey.get("Web.PropertyContentsIncident.LineItemQuantityIllegal") : null
    }
    
    // 'requestValidationExpression' attribute on DateCell (id=LineItemPurchaseDate) at PropertyContentsIncidentPanelSet.pcf: line 176, column 36
    function requestValidationExpression_73 (VALUE :  java.util.Date) : java.lang.Object {
      return VALUE > (item.Incident.Claim.LossDate != null ? item.Incident.Claim.LossDate : java.util.Date.Today) ? DisplayKey.get("Web.PropertyContentsIncident.LineItemPurchaseDateError") : null
    }
    
    // 'value' attribute on TextCell (id=LineItemQuantity) at PropertyContentsIncidentPanelSet.pcf: line 144, column 46
    function valueRoot_57 () : java.lang.Object {
      return item
    }
    
    // 'value' attribute on TextCell (id=LineItemQuantity) at PropertyContentsIncidentPanelSet.pcf: line 144, column 46
    function value_53 () : java.lang.Integer {
      return item.NumberOfItems
    }
    
    // 'value' attribute on TextCell (id=LineItemName) at PropertyContentsIncidentPanelSet.pcf: line 152, column 41
    function value_58 () : java.lang.String {
      return item.Description
    }
    
    // 'value' attribute on TypeKeyCell (id=LineItemCategory) at PropertyContentsIncidentPanelSet.pcf: line 159, column 60
    function value_62 () : typekey.ContentLineItemCategory {
      return item.ContentCategory
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemOriginalCost) at PropertyContentsIncidentPanelSet.pcf: line 169, column 33
    function value_67 () : gw.api.financials.CurrencyAmount {
      return item.PurchaseCost
    }
    
    // 'value' attribute on DateCell (id=LineItemPurchaseDate) at PropertyContentsIncidentPanelSet.pcf: line 176, column 36
    function value_72 () : java.util.Date {
      return item.DateAcquired
    }
    
    // 'value' attribute on TextCell (id=LineItemAge) at PropertyContentsIncidentPanelSet.pcf: line 187, column 37
    function value_78 () : java.math.BigDecimal {
      return item.Age
    }
    
    // 'value' attribute on TextCell (id=LineItemDepreciationPercentage) at PropertyContentsIncidentPanelSet.pcf: line 198, column 32
    function value_82 () : java.math.BigDecimal {
      return item.DepreciationPercentage
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemReplacementValue) at PropertyContentsIncidentPanelSet.pcf: line 210, column 32
    function value_86 () : gw.api.financials.CurrencyAmount {
      return item.ReplacementValue
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemTotalACV) at PropertyContentsIncidentPanelSet.pcf: line 222, column 33
    function value_90 () : gw.api.financials.CurrencyAmount {
      return item.ActualCashValue
    }
    
    // 'value' attribute on CurrencyCell (id=LineItemAmountAfterLimit) at PropertyContentsIncidentPanelSet.pcf: line 231, column 33
    function value_93 () : gw.api.financials.CurrencyAmount {
      return item.AmountAfterLimit
    }
    
    // 'value' attribute on TextCell (id=LineItemNotes) at PropertyContentsIncidentPanelSet.pcf: line 237, column 124
    function value_98 () : java.lang.String {
      return item.ItemComment
    }
    
    // 'visible' attribute on CurrencyCell (id=LineItemOriginalCost) at PropertyContentsIncidentPanelSet.pcf: line 169, column 33
    function visible_66 () : java.lang.Boolean {
      return inEditMode
    }
    
    // 'visible' attribute on TextCell (id=LineItemNotes) at PropertyContentsIncidentPanelSet.pcf: line 237, column 124
    function visible_97 () : java.lang.Boolean {
      return !inEditMode || (gw.api.print.PrintUtil.isPrintingPDF() || gw.api.print.PrintUtil.isPrintingCSV())
    }
    
    property get item () : entity.AssessmentContentItem {
      return getIteratedValue(1) as entity.AssessmentContentItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PropertyContentsIncidentPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ScheduledItemDescription) at PropertyContentsIncidentPanelSet.pcf: line 96, column 63
    function valueRoot_22 () : java.lang.Object {
      return scheduledItem.PropertyItem
    }
    
    // 'value' attribute on TextCell (id=ScheduledItemDescription) at PropertyContentsIncidentPanelSet.pcf: line 96, column 63
    function value_20 () : java.lang.String {
      return scheduledItem.PropertyItem.Description
    }
    
    // 'value' attribute on CurrencyCell (id=ScheduledItemValue) at PropertyContentsIncidentPanelSet.pcf: line 101, column 66
    function value_23 () : gw.api.financials.CurrencyAmount {
      return scheduledItem.PropertyItem.AppraisedValue
    }
    
    property get scheduledItem () : entity.PropertyContentsScheduledItem {
      return getIteratedValue(1) as entity.PropertyContentsScheduledItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/incidents/PropertyContentsIncidentPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsIncidentPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=DesktopActivities_PrintButton) at PropertyContentsIncidentPanelSet.pcf: line 119, column 25
    function action_30 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewOnlyWithOptions("PropertyContentsLineItemsLV")
    }
    
    // 'available' attribute on ToolbarButton (id=DesktopActivities_PrintButton) at PropertyContentsIncidentPanelSet.pcf: line 119, column 25
    function available_29 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'def' attribute on InputSetRef at PropertyContentsIncidentPanelSet.pcf: line 64, column 114
    function def_onEnter_12 (def :  pcf.OtherServicesLVInputSet) : void {
      def.onEnter(incident.Claim, incident, incident.ServiceRequests.toSet(), null, {})
    }
    
    // 'def' attribute on PanelRef (id=IncidentExposuresLV) at PropertyContentsIncidentPanelSet.pcf: line 41, column 36
    function def_onEnter_6 (def :  pcf.IncidentExposuresLV) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on InputSetRef at PropertyContentsIncidentPanelSet.pcf: line 64, column 114
    function def_refreshVariables_13 (def :  pcf.OtherServicesLVInputSet) : void {
      def.refreshVariables(incident.Claim, incident, incident.ServiceRequests.toSet(), null, {})
    }
    
    // 'def' attribute on PanelRef (id=IncidentExposuresLV) at PropertyContentsIncidentPanelSet.pcf: line 41, column 36
    function def_refreshVariables_7 (def :  pcf.IncidentExposuresLV) : void {
      def.refreshVariables(incident)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at PropertyContentsIncidentPanelSet.pcf: line 33, column 47
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at PropertyContentsIncidentPanelSet.pcf: line 13, column 37
    function initialValue_0 () : entity.PolicyLocation {
      return incident.Claim.Policy.PrimaryLocation
    }
    
    // 'initialValue' attribute on Variable at PropertyContentsIncidentPanelSet.pcf: line 18, column 23
    function initialValue_1 () : boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'pickLocation' attribute on RowIterator (id=PropertyContentsScheduledItems) at PropertyContentsIncidentPanelSet.pcf: line 88, column 62
    function pickLocation_26 () : void {
      ChoosePropertyContentsScheduledItemPopup.push(incident, policyLocation)
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsScheduledItems) at PropertyContentsIncidentPanelSet.pcf: line 96, column 63
    function sortValue_16 (scheduledItem :  entity.PropertyContentsScheduledItem) : java.lang.Object {
      return scheduledItem.PropertyItem.Description
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsScheduledItems) at PropertyContentsIncidentPanelSet.pcf: line 101, column 66
    function sortValue_17 (scheduledItem :  entity.PropertyContentsScheduledItem) : java.lang.Object {
      return scheduledItem.PropertyItem.AppraisedValue
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 144, column 46
    function sortValue_31 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.NumberOfItems
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 152, column 41
    function sortValue_32 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.Description
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 159, column 60
    function sortValue_33 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.ContentCategory
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 176, column 36
    function sortValue_36 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.DateAcquired
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 187, column 37
    function sortValue_38 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.Age
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 237, column 124
    function sortValue_41 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.ItemComment
    }
    
    // '$$sumValue' attribute on RowIterator (id=PropertyContentsScheduledItems) at PropertyContentsIncidentPanelSet.pcf: line 101, column 66
    function sumValueRoot_19 (scheduledItem :  entity.PropertyContentsScheduledItem) : java.lang.Object {
      return scheduledItem.PropertyItem
    }
    
    // '$$sumValue' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 210, column 32
    function sumValueRoot_47 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PropertyContentsScheduledItems) at PropertyContentsIncidentPanelSet.pcf: line 101, column 66
    function sumValue_18 (scheduledItem :  entity.PropertyContentsScheduledItem) : java.lang.Object {
      return scheduledItem.PropertyItem.AppraisedValue
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 210, column 32
    function sumValue_46 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.ReplacementValue
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 222, column 33
    function sumValue_48 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.ActualCashValue
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 231, column 33
    function sumValue_50 (item :  entity.AssessmentContentItem) : java.lang.Object {
      return item.AmountAfterLimit
    }
    
    // 'title' attribute on TitleBar (id=ScheduledItemsTitle) at PropertyContentsIncidentPanelSet.pcf: line 71, column 250
    function title_14 () : java.lang.String {
      return policyLocation.HighValueItems.length > 0 ? DisplayKey.get("Web.PropertyContentsIncident.ScheduledItems", policyLocation.HighValueItems.length) : DisplayKey.get("Web.PropertyContentsIncident.NoScheduledItems")
    }
    
    // 'toCreateAndAdd' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 132, column 54
    function toCreateAndAdd_101 () : entity.AssessmentContentItem {
      return incident.createHomeownersContentItemLine()
    }
    
    // 'toRemove' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 132, column 54
    function toRemove_102 (item :  entity.AssessmentContentItem) : void {
      incident.removeFromContentItemLine( item )
    }
    
    // 'toRemove' attribute on RowIterator (id=PropertyContentsScheduledItems) at PropertyContentsIncidentPanelSet.pcf: line 88, column 62
    function toRemove_27 (scheduledItem :  entity.PropertyContentsScheduledItem) : void {
      incident.removeFromPropertyContentsScheduledItems(scheduledItem)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at PropertyContentsIncidentPanelSet.pcf: line 33, column 47
    function valueRoot_5 () : java.lang.Object {
      return incident
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 132, column 54
    function value_103 () : entity.AssessmentContentItem[] {
      return incident.HomeownersContentItemLines
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at PropertyContentsIncidentPanelSet.pcf: line 33, column 47
    function value_2 () : java.lang.String {
      return incident.Description
    }
    
    // 'value' attribute on RowIterator (id=PropertyContentsScheduledItems) at PropertyContentsIncidentPanelSet.pcf: line 88, column 62
    function value_28 () : entity.PropertyContentsScheduledItem[] {
      return incident.OrderedPropertyContentsScheduledItems
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessage) at PropertyContentsIncidentPanelSet.pcf: line 62, column 85
    function visible_10 () : java.lang.Boolean {
      return not incident.Claim.DraftClaim and CurrentLocation.InEditMode
    }
    
    // 'addVisible' attribute on IteratorButtons at PropertyContentsIncidentPanelSet.pcf: line 76, column 54
    function visible_15 () : java.lang.Boolean {
      return policyLocation.HighValueItems.length > incident.PropertyContentsScheduledItems.length
    }
    
    // 'visible' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 169, column 33
    function visible_34 () : java.lang.Boolean {
      return inEditMode
    }
    
    // 'visible' attribute on RowIterator (id=PropertyContentsLineItems) at PropertyContentsIncidentPanelSet.pcf: line 237, column 124
    function visible_40 () : java.lang.Boolean {
      return !inEditMode || (gw.api.print.PrintUtil.isPrintingPDF() || gw.api.print.PrintUtil.isPrintingCSV())
    }
    
    // 'visible' attribute on TextInput (id=ServiceRequestSubmitMessageFNOL) at PropertyContentsIncidentPanelSet.pcf: line 57, column 50
    function visible_8 () : java.lang.Boolean {
      return incident.Claim.DraftClaim
    }
    
    property get inEditMode () : boolean {
      return getVariableValue("inEditMode", 0) as java.lang.Boolean
    }
    
    property set inEditMode ($arg :  boolean) {
      setVariableValue("inEditMode", 0, $arg)
    }
    
    property get incident () : PropertyContentsIncident {
      return getRequireValue("incident", 0) as PropertyContentsIncident
    }
    
    property set incident ($arg :  PropertyContentsIncident) {
      setRequireValue("incident", 0, $arg)
    }
    
    property get policyLocation () : entity.PolicyLocation {
      return getVariableValue("policyLocation", 0) as entity.PolicyLocation
    }
    
    property set policyLocation ($arg :  entity.PolicyLocation) {
      setVariableValue("policyLocation", 0, $arg)
    }
    
    
  }
  
  
}