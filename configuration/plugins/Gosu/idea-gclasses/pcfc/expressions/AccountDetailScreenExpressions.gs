package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/accounts/AccountDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AccountDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/accounts/AccountDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButtonaddOtherInstruction) at AccountDetailScreen.pcf: line 103, column 103
    function action_20 () : void {
      OtherInstructionPopup.push(null, account.SpecialHandling, true, perm.System.accountmng)
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButtonaddOtherInstruction) at AccountDetailScreen.pcf: line 103, column 103
    function action_dest_21 () : pcf.api.Destination {
      return pcf.OtherInstructionPopup.createDestination(null, account.SpecialHandling, true, perm.System.accountmng)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AutomatedActivitiesDelete) at AccountDetailScreen.pcf: line 75, column 108
    function checkedRowAction_12 (element :  entity.AutomatedActivityHandler, CheckedValue :  entity.AutomatedActivityHandler) : void {
      CheckedValue.remove()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AutomatedNotificationsDelete) at AccountDetailScreen.pcf: line 44, column 111
    function checkedRowAction_4 (element :  entity.AutomatedNotificationHandler, CheckedValue :  entity.AutomatedNotificationHandler) : void {
      CheckedValue.remove()
    }
    
    // 'def' attribute on PanelRef at AccountDetailScreen.pcf: line 20, column 36
    function def_onEnter_1 (def :  pcf.AccountDV) : void {
      def.onEnter(account)
    }
    
    // 'def' attribute on PanelRef (id=AccountAutomatedNotificationsLVPanelRef) at AccountDetailScreen.pcf: line 33, column 56
    function def_onEnter_10 (def :  pcf.SpecialHandlingAutomatedNotificationsLV) : void {
      def.onEnter(account.SpecialHandling, perm.System.accountmng)
    }
    
    // 'def' attribute on PanelRef (id=AccountAutomatedActivitiesLVPanelRef) at AccountDetailScreen.pcf: line 64, column 53
    function def_onEnter_18 (def :  pcf.SpecialHandlingAutomatedActivitiesLV) : void {
      def.onEnter(account.SpecialHandling, perm.System.accountmng)
    }
    
    // 'def' attribute on PanelRef at AccountDetailScreen.pcf: line 94, column 116
    function def_onEnter_23 (def :  pcf.OtherInstructionsPanelSet) : void {
      def.onEnter(account.SpecialHandling.OtherInstructions, null, perm.System.accountmng)
    }
    
    // 'def' attribute on PanelRef (id=AccountAutomatedNotificationsLVPanelRef) at AccountDetailScreen.pcf: line 33, column 56
    function def_refreshVariables_11 (def :  pcf.SpecialHandlingAutomatedNotificationsLV) : void {
      def.refreshVariables(account.SpecialHandling, perm.System.accountmng)
    }
    
    // 'def' attribute on PanelRef (id=AccountAutomatedActivitiesLVPanelRef) at AccountDetailScreen.pcf: line 64, column 53
    function def_refreshVariables_19 (def :  pcf.SpecialHandlingAutomatedActivitiesLV) : void {
      def.refreshVariables(account.SpecialHandling, perm.System.accountmng)
    }
    
    // 'def' attribute on PanelRef at AccountDetailScreen.pcf: line 20, column 36
    function def_refreshVariables_2 (def :  pcf.AccountDV) : void {
      def.refreshVariables(account)
    }
    
    // 'def' attribute on PanelRef at AccountDetailScreen.pcf: line 94, column 116
    function def_refreshVariables_24 (def :  pcf.OtherInstructionsPanelSet) : void {
      def.refreshVariables(account.SpecialHandling.OtherInstructions, null, perm.System.accountmng)
    }
    
    // EditButtons at AccountDetailScreen.pcf: line 22, column 27
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'selectOnEnter' attribute on Card (id=AccountHandlingTab) at AccountDetailScreen.pcf: line 30, column 51
    function selectOnEnter_26 () : java.lang.Boolean {
      return showAccountHandlingCardToStart
    }
    
    // 'selectOnEnter' attribute on Card (id=AccountDetailTab) at AccountDetailScreen.pcf: line 18, column 75
    function selectOnEnter_3 () : java.lang.Boolean {
      return !showAccountHandlingCardToStart
    }
    
    // 'value' attribute on MenuItemIterator (id=AutomatedActivitiesAddMenuItemIterator) at AccountDetailScreen.pcf: line 84, column 73
    function value_16 () : java.util.List<gw.entity.IEntityType> {
      return (AutomatedActivityHandler.Type as gw.entity.IEntityType).AllSubtypes.where(\ t -> not t.Abstract).sortBy(\ t -> t.DisplayName)
    }
    
    // 'value' attribute on MenuItemIterator (id=AutomatedNotificationsAddMenuItemIterator) at AccountDetailScreen.pcf: line 53, column 73
    function value_8 () : java.util.List<gw.entity.IEntityType> {
      return (AutomatedNotificationHandler.Type as gw.entity.IEntityType).AllSubtypes.where(\ t -> not t.Abstract).sortBy(\ t -> t.DisplayName)
    }
    
    // 'visible' attribute on Card (id=AccountHandlingTab) at AccountDetailScreen.pcf: line 30, column 51
    function visible_25 () : java.lang.Boolean {
      return account.SpecialHandling != null
    }
    
    // 'visible' attribute on Toolbar (id=SpecialHandlingAutomatedNotificationsLV_tb) at AccountDetailScreen.pcf: line 38, column 46
    function visible_9 () : java.lang.Boolean {
      return perm.System.accountmng
    }
    
    property get account () : Account {
      return getRequireValue("account", 0) as Account
    }
    
    property set account ($arg :  Account) {
      setRequireValue("account", 0, $arg)
    }
    
    property get showAccountHandlingCardToStart () : boolean {
      return getRequireValue("showAccountHandlingCardToStart", 0) as java.lang.Boolean
    }
    
    property set showAccountHandlingCardToStart ($arg :  boolean) {
      setRequireValue("showAccountHandlingCardToStart", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/accounts/AccountDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends AccountDetailScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=AutomatedActivitiesAddClaimIndicatorHandler) at AccountDetailScreen.pcf: line 88, column 164
    function action_13 () : void {
      NewAutomatedActivityHandlerPopup.push(account.SpecialHandling, automatedHandlerSubtype)
    }
    
    // 'action' attribute on MenuItem (id=AutomatedActivitiesAddClaimIndicatorHandler) at AccountDetailScreen.pcf: line 88, column 164
    function action_dest_14 () : pcf.api.Destination {
      return pcf.NewAutomatedActivityHandlerPopup.createDestination(account.SpecialHandling, automatedHandlerSubtype)
    }
    
    // 'label' attribute on MenuItem (id=AutomatedActivitiesAddClaimIndicatorHandler) at AccountDetailScreen.pcf: line 88, column 164
    function label_15 () : java.lang.Object {
      return DisplayKey.get("Web.Admin.AccountDetailScreen.AutomatedActivitiesAdd.MenuItemLabel." + (automatedHandlerSubtype.DisplayName))
    }
    
    property get automatedHandlerSubtype () : gw.entity.IEntityType {
      return getIteratedValue(1) as gw.entity.IEntityType
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/accounts/AccountDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AccountDetailScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=AutomatedNotificationsAddClaimIndicatorHandler) at AccountDetailScreen.pcf: line 57, column 167
    function action_5 () : void {
      NewAutomatedNotificationHandlerPopup.push(account.SpecialHandling, automatedHandlerSubtype)
    }
    
    // 'action' attribute on MenuItem (id=AutomatedNotificationsAddClaimIndicatorHandler) at AccountDetailScreen.pcf: line 57, column 167
    function action_dest_6 () : pcf.api.Destination {
      return pcf.NewAutomatedNotificationHandlerPopup.createDestination(account.SpecialHandling, automatedHandlerSubtype)
    }
    
    // 'label' attribute on MenuItem (id=AutomatedNotificationsAddClaimIndicatorHandler) at AccountDetailScreen.pcf: line 57, column 167
    function label_7 () : java.lang.Object {
      return DisplayKey.get("Web.Admin.AccountDetailScreen.AutomatedNotificationsAdd.MenuItemLabel." + (automatedHandlerSubtype.DisplayName))
    }
    
    property get automatedHandlerSubtype () : gw.entity.IEntityType {
      return getIteratedValue(1) as gw.entity.IEntityType
    }
    
    
  }
  
  
}