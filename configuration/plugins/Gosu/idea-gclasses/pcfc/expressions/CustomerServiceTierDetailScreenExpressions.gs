package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CustomerServiceTierDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerServiceTierDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButtonaddOtherInstruction) at CustomerServiceTierDetailScreen.pcf: line 128, column 115
    function action_31 () : void {
      OtherInstructionPopup.push(null, aCustomerServiceTierSpecialHandling, true, perm.System.custsvctiermng)
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButtonaddOtherInstruction) at CustomerServiceTierDetailScreen.pcf: line 128, column 115
    function action_dest_32 () : pcf.api.Destination {
      return pcf.OtherInstructionPopup.createDestination(null, aCustomerServiceTierSpecialHandling, true, perm.System.custsvctiermng)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AutomatedNotificationsDelete) at CustomerServiceTierDetailScreen.pcf: line 70, column 123
    function checkedRowAction_15 (element :  entity.AutomatedNotificationHandler, CheckedValue :  entity.AutomatedNotificationHandler) : void {
      CheckedValue.remove()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AutomatedActivitiesDelete) at CustomerServiceTierDetailScreen.pcf: line 100, column 120
    function checkedRowAction_23 (element :  entity.AutomatedActivityHandler, CheckedValue :  entity.AutomatedActivityHandler) : void {
      CheckedValue.remove()
    }
    
    // 'def' attribute on PanelRef (id=CustomerServiceTierAutomatedNotificationsLVPanelRef) at CustomerServiceTierDetailScreen.pcf: line 59, column 68
    function def_onEnter_21 (def :  pcf.SpecialHandlingAutomatedNotificationsLV) : void {
      def.onEnter(aCustomerServiceTierSpecialHandling, perm.System.custsvctiermng)
    }
    
    // 'def' attribute on PanelRef at CustomerServiceTierDetailScreen.pcf: line 89, column 119
    function def_onEnter_29 (def :  pcf.SpecialHandlingAutomatedActivitiesLV) : void {
      def.onEnter(aCustomerServiceTierSpecialHandling, perm.System.custsvctiermng)
    }
    
    // 'def' attribute on PanelRef at CustomerServiceTierDetailScreen.pcf: line 119, column 132
    function def_onEnter_34 (def :  pcf.OtherInstructionsPanelSet) : void {
      def.onEnter(aCustomerServiceTierSpecialHandling.OtherInstructions, null, perm.System.custsvctiermng)
    }
    
    // 'def' attribute on PanelRef (id=CustomerServiceTierAutomatedNotificationsLVPanelRef) at CustomerServiceTierDetailScreen.pcf: line 59, column 68
    function def_refreshVariables_22 (def :  pcf.SpecialHandlingAutomatedNotificationsLV) : void {
      def.refreshVariables(aCustomerServiceTierSpecialHandling, perm.System.custsvctiermng)
    }
    
    // 'def' attribute on PanelRef at CustomerServiceTierDetailScreen.pcf: line 89, column 119
    function def_refreshVariables_30 (def :  pcf.SpecialHandlingAutomatedActivitiesLV) : void {
      def.refreshVariables(aCustomerServiceTierSpecialHandling, perm.System.custsvctiermng)
    }
    
    // 'def' attribute on PanelRef at CustomerServiceTierDetailScreen.pcf: line 119, column 132
    function def_refreshVariables_35 (def :  pcf.OtherInstructionsPanelSet) : void {
      def.refreshVariables(aCustomerServiceTierSpecialHandling.OtherInstructions, null, perm.System.custsvctiermng)
    }
    
    // 'value' attribute on RangeInput (id=Code) at CustomerServiceTierDetailScreen.pcf: line 40, column 57
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      aCustomerServiceTierSpecialHandling.CustomerServiceTier = (__VALUE_TO_SET as typekey.CustomerServiceTier)
    }
    
    // 'initialValue' attribute on Variable at CustomerServiceTierDetailScreen.pcf: line 18, column 47
    function initialValue_0 () : List<CustomerServiceTier> {
      return getAvailableServiceTiers()
    }
    
    // EditButtons at CustomerServiceTierDetailScreen.pcf: line 27, column 27
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'selectOnEnter' attribute on Card (id=CustomerServiceTierSpecialHandlingCard) at CustomerServiceTierDetailScreen.pcf: line 56, column 63
    function selectOnEnter_37 () : java.lang.Boolean {
      return showSpecialHandlingCardToStart
    }
    
    // 'valueRange' attribute on RangeInput (id=Code) at CustomerServiceTierDetailScreen.pcf: line 40, column 57
    function valueRange_9 () : java.lang.Object {
      return availableServiceTiers
    }
    
    // 'value' attribute on TextInput (id=Description) at CustomerServiceTierDetailScreen.pcf: line 47, column 94
    function valueRoot_14 () : java.lang.Object {
      return aCustomerServiceTierSpecialHandling.CustomerServiceTier
    }
    
    // 'value' attribute on RangeInput (id=Code) at CustomerServiceTierDetailScreen.pcf: line 40, column 57
    function valueRoot_8 () : java.lang.Object {
      return aCustomerServiceTierSpecialHandling
    }
    
    // 'value' attribute on TextInput (id=Description) at CustomerServiceTierDetailScreen.pcf: line 47, column 94
    function value_12 () : java.lang.String {
      return aCustomerServiceTierSpecialHandling.CustomerServiceTier.Description
    }
    
    // 'value' attribute on MenuItemIterator (id=AutomatedNotificationsAddMenuItemIterator) at CustomerServiceTierDetailScreen.pcf: line 79, column 73
    function value_19 () : java.util.List<gw.entity.IEntityType> {
      return (AutomatedNotificationHandler.Type as gw.entity.IEntityType).AllSubtypes.where(\ t -> not t.Abstract).sortBy(\ t -> t.DisplayName)
    }
    
    // 'value' attribute on MenuItemIterator (id=AutomatedActivitiesAddMenuItemIterator) at CustomerServiceTierDetailScreen.pcf: line 109, column 73
    function value_27 () : java.util.List<gw.entity.IEntityType> {
      return (AutomatedActivityHandler.Type as gw.entity.IEntityType).AllSubtypes.where(\ t -> not t.Abstract).sortBy(\ t -> t.DisplayName)
    }
    
    // 'value' attribute on RangeInput (id=Code) at CustomerServiceTierDetailScreen.pcf: line 40, column 57
    function value_4 () : typekey.CustomerServiceTier {
      return aCustomerServiceTierSpecialHandling.CustomerServiceTier
    }
    
    // 'valueRange' attribute on RangeInput (id=Code) at CustomerServiceTierDetailScreen.pcf: line 40, column 57
    function verifyValueRangeIsAllowedType_10 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Code) at CustomerServiceTierDetailScreen.pcf: line 40, column 57
    function verifyValueRangeIsAllowedType_10 ($$arg :  typekey.CustomerServiceTier[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Code) at CustomerServiceTierDetailScreen.pcf: line 40, column 57
    function verifyValueRange_11 () : void {
      var __valueRangeArg = availableServiceTiers
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_10(__valueRangeArg)
    }
    
    // 'visible' attribute on Toolbar at CustomerServiceTierDetailScreen.pcf: line 26, column 63
    function visible_2 () : java.lang.Boolean {
      return aCustomerServiceTierSpecialHandling.New
    }
    
    // 'visible' attribute on Toolbar (id=SpecialHandlingAutomatedNotificationsLV_tb) at CustomerServiceTierDetailScreen.pcf: line 64, column 50
    function visible_20 () : java.lang.Boolean {
      return perm.System.custsvctiermng
    }
    
    // 'visible' attribute on Card (id=CustomerServiceTierSpecialHandlingCard) at CustomerServiceTierDetailScreen.pcf: line 56, column 63
    function visible_36 () : java.lang.Boolean {
      return aCustomerServiceTierSpecialHandling != null
    }
    
    property get aCustomerServiceTierSpecialHandling () : CustomerServiceTierSpecialHandling {
      return getRequireValue("aCustomerServiceTierSpecialHandling", 0) as CustomerServiceTierSpecialHandling
    }
    
    property set aCustomerServiceTierSpecialHandling ($arg :  CustomerServiceTierSpecialHandling) {
      setRequireValue("aCustomerServiceTierSpecialHandling", 0, $arg)
    }
    
    property get availableServiceTiers () : List<CustomerServiceTier> {
      return getVariableValue("availableServiceTiers", 0) as List<CustomerServiceTier>
    }
    
    property set availableServiceTiers ($arg :  List<CustomerServiceTier>) {
      setVariableValue("availableServiceTiers", 0, $arg)
    }
    
    property get showSpecialHandlingCardToStart () : boolean {
      return getRequireValue("showSpecialHandlingCardToStart", 0) as java.lang.Boolean
    }
    
    property set showSpecialHandlingCardToStart ($arg :  boolean) {
      setRequireValue("showSpecialHandlingCardToStart", 0, $arg)
    }
    
    
          function getAvailableServiceTiers() : java.util.List<CustomerServiceTier> {
            var result = new java.util.HashSet(CustomerServiceTier.getTypeKeys(false))
            gw.api.database.Query.make(CustomerServiceTierSpecialHandling).select().each( \ elt -> result.remove(elt.CustomerServiceTier))
    
            return result.toList() as java.util.List<CustomerServiceTier>
          }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends CustomerServiceTierDetailScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=AutomatedActivitiesAddClaimIndicatorHandler) at CustomerServiceTierDetailScreen.pcf: line 113, column 176
    function action_24 () : void {
      NewAutomatedActivityHandlerPopup.push(aCustomerServiceTierSpecialHandling, automatedHandlerSubtype)
    }
    
    // 'action' attribute on MenuItem (id=AutomatedActivitiesAddClaimIndicatorHandler) at CustomerServiceTierDetailScreen.pcf: line 113, column 176
    function action_dest_25 () : pcf.api.Destination {
      return pcf.NewAutomatedActivityHandlerPopup.createDestination(aCustomerServiceTierSpecialHandling, automatedHandlerSubtype)
    }
    
    // 'label' attribute on MenuItem (id=AutomatedActivitiesAddClaimIndicatorHandler) at CustomerServiceTierDetailScreen.pcf: line 113, column 176
    function label_26 () : java.lang.Object {
      return DisplayKey.get("Web.Admin.CustomerServiceTierDetailScreen.AutomatedActivitiesAdd.MenuItemLabel." + (automatedHandlerSubtype.DisplayName))
    }
    
    property get automatedHandlerSubtype () : gw.entity.IEntityType {
      return getIteratedValue(1) as gw.entity.IEntityType
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CustomerServiceTierDetailScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=AutomatedNotificationsAddClaimIndicatorHandler) at CustomerServiceTierDetailScreen.pcf: line 83, column 179
    function action_16 () : void {
      NewAutomatedNotificationHandlerPopup.push(aCustomerServiceTierSpecialHandling, automatedHandlerSubtype)
    }
    
    // 'action' attribute on MenuItem (id=AutomatedNotificationsAddClaimIndicatorHandler) at CustomerServiceTierDetailScreen.pcf: line 83, column 179
    function action_dest_17 () : pcf.api.Destination {
      return pcf.NewAutomatedNotificationHandlerPopup.createDestination(aCustomerServiceTierSpecialHandling, automatedHandlerSubtype)
    }
    
    // 'label' attribute on MenuItem (id=AutomatedNotificationsAddClaimIndicatorHandler) at CustomerServiceTierDetailScreen.pcf: line 83, column 179
    function label_18 () : java.lang.Object {
      return DisplayKey.get("Web.Admin.CustomerServiceTierDetailScreen.AutomatedNotificationsAdd.MenuItemLabel." + (automatedHandlerSubtype.DisplayName))
    }
    
    property get automatedHandlerSubtype () : gw.entity.IEntityType {
      return getIteratedValue(1) as gw.entity.IEntityType
    }
    
    
  }
  
  
}