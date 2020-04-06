package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TabBarExpressions {
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=AddressBookTab) at AddressBook.pcf: line 12, column 39
    function action_70 () : void {
      pcf.AddressBookSearch.go()
    }
    
    // 'location' attribute on Tab (id=AddressBookTab) at AddressBook.pcf: line 12, column 39
    function action_dest_71 () : pcf.api.Destination {
      return pcf.AddressBookSearch.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 13, column 39
    function action_0 () : void {
      pcf.DesktopActivities.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 25, column 47
    function action_12 () : void {
      pcf.DesktopAwaitingAssignment.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 28, column 45
    function action_15 () : void {
      pcf.DesktopQueuedActivities.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 30, column 42
    function action_22 () : void {
      pcf.DesktopCalendarGroup.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 32, column 29
    function action_24 () : void {
      pcf.BulkPay.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 35, column 45
    function action_26 () : void {
      pcf.ECFMessageSuspenseQueue.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 16, column 35
    function action_3 () : void {
      pcf.DesktopClaims.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 19, column 38
    function action_6 () : void {
      pcf.DesktopExposures.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 22, column 41
    function action_9 () : void {
      pcf.DesktopSubrogations.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 13, column 39
    function action_dest_1 () : pcf.api.Destination {
      return pcf.DesktopActivities.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 22, column 41
    function action_dest_10 () : pcf.api.Destination {
      return pcf.DesktopSubrogations.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 25, column 47
    function action_dest_13 () : pcf.api.Destination {
      return pcf.DesktopAwaitingAssignment.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 28, column 45
    function action_dest_16 () : pcf.api.Destination {
      return pcf.DesktopQueuedActivities.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 30, column 42
    function action_dest_23 () : pcf.api.Destination {
      return pcf.DesktopCalendarGroup.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 32, column 29
    function action_dest_25 () : pcf.api.Destination {
      return pcf.BulkPay.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 35, column 45
    function action_dest_27 () : pcf.api.Destination {
      return pcf.ECFMessageSuspenseQueue.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 16, column 35
    function action_dest_4 () : pcf.api.Destination {
      return pcf.DesktopClaims.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 19, column 38
    function action_dest_7 () : pcf.api.Destination {
      return pcf.DesktopExposures.createDestination()
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 22, column 41
    function label_11 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Subrogations", gw.api.desktop.DesktopCounts.getDesktopCounts().ActiveSubrogations)
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 25, column 47
    function label_14 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.UnassignedItems", gw.api.desktop.DesktopCounts.getDesktopCounts().AwaitingAssignment)
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 28, column 45
    function label_17 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.ActivityQueues", gw.api.desktop.DesktopCounts.getDesktopCounts().Queues)
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 13, column 39
    function label_2 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Activities", gw.api.desktop.DesktopCounts.getDesktopCounts().Activities)
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 35, column 45
    function label_28 () : java.lang.Object {
      return DisplayKey.get("Accelerator.IPLM.Web.Desktop.SuspenseQueue.DesktopTitle", gw.acc.iplm.desktop.DesktopMessageSuspenseQueue.getSuspendedMessagesCount(User.util.CurrentUser))
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 16, column 35
    function label_5 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Claims", gw.api.desktop.DesktopCounts.getDesktopCounts().Claims)
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 19, column 38
    function label_8 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Exposures", gw.api.desktop.DesktopCounts.getDesktopCounts().Exposures)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=langs) at TabBar.pcf: line 120, column 29
    function action_102 () : void {
      gw.api.admin.BaseAdminUtil.setCurrentUsersLanguage(lang)
    }
    
    // 'available' attribute on MenuItem (id=langs) at TabBar.pcf: line 120, column 29
    function available_101 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.getCurrentUserLanguage() != lang
    }
    
    // 'checked' attribute on MenuItem (id=langs) at TabBar.pcf: line 120, column 29
    function checked_104 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.getCurrentLanguageType() == lang
    }
    
    // 'label' attribute on MenuItem (id=langs) at TabBar.pcf: line 120, column 29
    function label_103 () : java.lang.Object {
      return gw.api.util.LocaleUtil.getLanguageLabel(lang)
    }
    
    property get lang () : typekey.LanguageType {
      return getIteratedValue(1) as typekey.LanguageType
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=locales) at TabBar.pcf: line 138, column 29
    function action_108 () : void {
      gw.api.admin.BaseAdminUtil.setCurrentUsersLocale(locale)
    }
    
    // 'available' attribute on MenuItem (id=locales) at TabBar.pcf: line 138, column 29
    function available_107 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.getCurrentUserLocale() != locale
    }
    
    // 'checked' attribute on MenuItem (id=locales) at TabBar.pcf: line 138, column 29
    function checked_110 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.getCurrentLocaleType() == locale
    }
    
    // 'label' attribute on MenuItem (id=locales) at TabBar.pcf: line 138, column 29
    function label_109 () : java.lang.Object {
      return gw.api.util.LocaleUtil.getLocaleLabel(locale)
    }
    
    property get locale () : typekey.LocaleType {
      return getIteratedValue(1) as typekey.LocaleType
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuClaim) at TabBar.pcf: line 44, column 55
    function action_41 () : void {
      pcf.Claim.go(claimSessionRecentView.Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuClaim) at TabBar.pcf: line 44, column 55
    function action_dest_42 () : pcf.api.Destination {
      return pcf.Claim.createDestination(claimSessionRecentView.Claim)
    }
    
    // 'label' attribute on MenuItem (id=ClaimMenuClaim) at TabBar.pcf: line 44, column 55
    function label_43 () : java.lang.Object {
      return claimSessionRecentView.DisplayName
    }
    
    property get claimSessionRecentView () : entity.ClaimRecentView {
      return getIteratedValue(1) as entity.ClaimRecentView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem2ExpressionsImpl extends SearchTabMenuItemExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 12, column 21
    function action_49 () : void {
      pcf.SimpleClaimSearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 16, column 21
    function action_51 () : void {
      pcf.ClaimSearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 20, column 21
    function action_53 () : void {
      pcf.FreeTextClaimSearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 23, column 43
    function action_55 () : void {
      pcf.CatastropheSearch.go(null)
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 12, column 21
    function action_dest_50 () : pcf.api.Destination {
      return pcf.SimpleClaimSearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 16, column 21
    function action_dest_52 () : pcf.api.Destination {
      return pcf.ClaimSearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 20, column 21
    function action_dest_54 () : pcf.api.Destination {
      return pcf.FreeTextClaimSearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 23, column 43
    function action_dest_56 () : pcf.api.Destination {
      return pcf.CatastropheSearch.createDestination(null)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItemExpressionsImpl extends DesktopTabMenuItemExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at DesktopCalendarGroup.pcf: line 13, column 21
    function action_18 () : void {
      pcf.Calendar.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at DesktopCalendarGroup.pcf: line 17, column 21
    function action_20 () : void {
      pcf.SupervisorCalendar.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at DesktopCalendarGroup.pcf: line 13, column 21
    function action_dest_19 () : pcf.api.Destination {
      return pcf.Calendar.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at DesktopCalendarGroup.pcf: line 17, column 21
    function action_dest_21 () : pcf.api.Destination {
      return pcf.SupervisorCalendar.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 14, column 21
    function action_57 () : void {
      pcf.ClaimSearchesGroup.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 18, column 21
    function action_59 () : void {
      pcf.ActivitySearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 22, column 21
    function action_61 () : void {
      pcf.PaymentSearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 26, column 21
    function action_63 () : void {
      pcf.RecoverySearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 30, column 21
    function action_65 () : void {
      pcf.BulkInvoiceSearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 14, column 21
    function action_dest_58 () : pcf.api.Destination {
      return pcf.ClaimSearchesGroup.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 18, column 21
    function action_dest_60 () : pcf.api.Destination {
      return pcf.ActivitySearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 22, column 21
    function action_dest_62 () : pcf.api.Destination {
      return pcf.PaymentSearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 26, column 21
    function action_dest_64 () : pcf.api.Destination {
      return pcf.RecoverySearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 30, column 21
    function action_dest_66 () : pcf.api.Destination {
      return pcf.BulkInvoiceSearch.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TabBarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TabBarLink (id=HelpTabBarLink) at TabBar.pcf: line 145, column 60
    function action_114 () : void {
      Help.push()
    }
    
    // 'action' attribute on HiddenLink (id=ProfilerHiddenLink) at TabBar.pcf: line 162, column 26
    function action_117 () : void {
      ProfilerPopup.push()
    }
    
    // 'action' attribute on HiddenLink (id=InternalToolsHiddenLink) at TabBar.pcf: line 166, column 26
    function action_119 () : void {
      InternalTools.go()
    }
    
    // 'action' attribute on Tab (id=DesktopTab) at TabBar.pcf: line 14, column 42
    function action_30 () : void {
      Desktop.go()
    }
    
    // 'action' attribute on MenuItem (id=ClaimTab_FNOLWizard) at TabBar.pcf: line 25, column 38
    function action_33 () : void {
      FNOLWizard.go()
    }
    
    // 'action' attribute on Tab (id=ClaimTab) at TabBar.pcf: line 20, column 66
    function action_46 () : void {
      ClaimTabForward.go()
    }
    
    // 'action' attribute on Tab (id=SearchTab) at TabBar.pcf: line 52, column 41
    function action_68 () : void {
      Search.go()
    }
    
    // 'action' attribute on Tab (id=AddressBookTab) at TabBar.pcf: line 58, column 44
    function action_73 () : void {
      AddressBook.go()
    }
    
    // 'action' attribute on Tab (id=DashboardTab) at TabBar.pcf: line 63, column 117
    function action_76 () : void {
      DashboardGroup.go()
    }
    
    // 'action' attribute on Tab (id=TeamTab) at TabBar.pcf: line 69, column 39
    function action_79 () : void {
      Team.go()
    }
    
    // 'action' attribute on Tab (id=ReportTab) at TabBar.pcf: line 74, column 122
    function action_82 () : void {
      Reports.go()
    }
    
    // 'action' attribute on MenuItem (id=AdminTab_Admin) at TabBar.pcf: line 85, column 43
    function action_85 () : void {
      AdminWelcome.go()
    }
    
    // 'action' attribute on MenuItem (id=AdminTab_PrintUserGroupTree) at TabBar.pcf: line 91, column 40
    function action_88 () : void {
      gw.api.print.PrintUserGroupTreeViewAction.printUserGroupTree()
    }
    
    // 'action' attribute on Tab (id=AdminTab) at TabBar.pcf: line 80, column 65
    function action_90 () : void {
      AdminWelcome.go()
    }
    
    // 'action' attribute on Tab (id=VacationTab) at TabBar.pcf: line 98, column 43
    function action_99 () : void {
      Vacation.go()
    }
    
    // 'action' attribute on Tab (id=VacationTab) at TabBar.pcf: line 98, column 43
    function action_dest_100 () : pcf.api.Destination {
      return pcf.Vacation.createDestination()
    }
    
    // 'action' attribute on TabBarLink (id=HelpTabBarLink) at TabBar.pcf: line 145, column 60
    function action_dest_115 () : pcf.api.Destination {
      return pcf.Help.createDestination()
    }
    
    // 'action' attribute on HiddenLink (id=ProfilerHiddenLink) at TabBar.pcf: line 162, column 26
    function action_dest_118 () : pcf.api.Destination {
      return pcf.ProfilerPopup.createDestination()
    }
    
    // 'action' attribute on HiddenLink (id=InternalToolsHiddenLink) at TabBar.pcf: line 166, column 26
    function action_dest_120 () : pcf.api.Destination {
      return pcf.InternalTools.createDestination()
    }
    
    // 'action' attribute on Tab (id=DesktopTab) at TabBar.pcf: line 14, column 42
    function action_dest_31 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    // 'action' attribute on MenuItem (id=ClaimTab_FNOLWizard) at TabBar.pcf: line 25, column 38
    function action_dest_34 () : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination()
    }
    
    // 'action' attribute on Tab (id=ClaimTab) at TabBar.pcf: line 20, column 66
    function action_dest_47 () : pcf.api.Destination {
      return pcf.ClaimTabForward.createDestination()
    }
    
    // 'action' attribute on Tab (id=SearchTab) at TabBar.pcf: line 52, column 41
    function action_dest_69 () : pcf.api.Destination {
      return pcf.Search.createDestination()
    }
    
    // 'action' attribute on Tab (id=AddressBookTab) at TabBar.pcf: line 58, column 44
    function action_dest_74 () : pcf.api.Destination {
      return pcf.AddressBook.createDestination()
    }
    
    // 'action' attribute on Tab (id=DashboardTab) at TabBar.pcf: line 63, column 117
    function action_dest_77 () : pcf.api.Destination {
      return pcf.DashboardGroup.createDestination()
    }
    
    // 'action' attribute on Tab (id=TeamTab) at TabBar.pcf: line 69, column 39
    function action_dest_80 () : pcf.api.Destination {
      return pcf.Team.createDestination()
    }
    
    // 'action' attribute on Tab (id=ReportTab) at TabBar.pcf: line 74, column 122
    function action_dest_83 () : pcf.api.Destination {
      return pcf.Reports.createDestination()
    }
    
    // 'action' attribute on MenuItem (id=AdminTab_Admin) at TabBar.pcf: line 85, column 43
    function action_dest_86 () : pcf.api.Destination {
      return pcf.AdminWelcome.createDestination()
    }
    
    // 'action' attribute on Tab (id=AdminTab) at TabBar.pcf: line 80, column 65
    function action_dest_91 () : pcf.api.Destination {
      return pcf.AdminWelcome.createDestination()
    }
    
    // 'afterFailure' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function afterFailure_36 (searchCriteria :  java.lang.Object, searchText :  java.lang.String) : void {
      (searchCriteria as gw.cc.claim.ClaimSearchCriteriaWrapper).resetWithClaimNumber(searchText)
    }
    
    // 'label' attribute on TabBarLogout (id=LogoutTabBarLink) at TabBar.pcf: line 158, column 21
    function label_116 () : java.lang.Object {
      return DisplayKey.get("Web.TabBar.Logout", entity.User.util.CurrentUser)
    }
    
    // 'label' attribute on Tab (id=ClaimTab) at TabBar.pcf: line 20, column 66
    function label_48 () : java.lang.Object {
      return gw.api.claim.ClaimUtil.getCurrentClaimNumber() != null ? DisplayKey.get("Web.TabBar.ClaimWithNumber", gw.api.claim.ClaimUtil.getCurrentClaimNumber()) : DisplayKey.get("Web.TabBar.Claim")
    }
    
    // 'onFailure' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function onFailure_37 (searchText :  java.lang.String) : pcf.api.Location {
      return ClaimSearch.go()
    }
    
    // 'onResult' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function onResult_38 (result :  java.lang.Object) : void {
      ClaimInfoForward.go(result as ClaimInfo)
    }
    
    // 'property' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function property_39 () : gw.lang.reflect.IPropertyInfo {
      return Claim.Type.TypeInfo.getProperty("ClaimNumber")
    }
    
    // 'search' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function search_40 (searchText :  java.lang.String) : java.lang.Object {
      return gw.api.claim.ClaimNumberSearchUtil.search(searchText)
    }
    
    // 'systemAlertBar' attribute on TabBar (id=TabBar) at TabBar.pcf: line 7, column 39
    function systemAlertBar_onEnter_121 (def :  pcf.SystemAlertBar) : void {
      def.onEnter()
    }
    
    // 'systemAlertBar' attribute on TabBar (id=TabBar) at TabBar.pcf: line 7, column 39
    function systemAlertBar_refreshVariables_122 (def :  pcf.SystemAlertBar) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on MenuItemIterator at TabBar.pcf: line 112, column 46
    function value_105 () : typekey.LanguageType[] {
      return gw.api.util.LocaleUtil.getAllLanguages()?.toTypedArray()
    }
    
    // 'value' attribute on MenuItemIterator at TabBar.pcf: line 130, column 44
    function value_111 () : typekey.LocaleType[] {
      return gw.api.util.LocaleUtil.getAllLocales()?.toTypedArray()
    }
    
    // 'value' attribute on MenuItemIterator (id=ClaimMenuIt) at TabBar.pcf: line 40, column 46
    function value_44 () : entity.ClaimRecentView[] {
      return gw.api.claim.ClaimUtil.getRecentlyViewedClaims()
    }
    
    // 'visible' attribute on MenuItem (id=languageSwitcher) at TabBar.pcf: line 108, column 62
    function visible_106 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.canSwitchLanguage()
    }
    
    // 'visible' attribute on MenuItem (id=localeSwitcher) at TabBar.pcf: line 126, column 60
    function visible_112 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.canSwitchLocale()
    }
    
    // 'visible' attribute on TabBarLink (id=LanguageTabBarLink) at TabBar.pcf: line 104, column 104
    function visible_113 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.canSwitchLanguage() || gw.api.util.LocaleUtil.canSwitchLocale()
    }
    
    // 'visible' attribute on Tab (id=DesktopTab) at TabBar.pcf: line 14, column 42
    function visible_29 () : java.lang.Boolean {
      return perm.System.viewdesktop
    }
    
    // 'visible' attribute on MenuItem (id=ClaimTab_FNOLWizard) at TabBar.pcf: line 25, column 38
    function visible_32 () : java.lang.Boolean {
      return perm.Claim.create
    }
    
    // 'visible' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function visible_35 () : java.lang.Boolean {
      return perm.Claim.genericviewclaim
    }
    
    // 'visible' attribute on Tab (id=ClaimTab) at TabBar.pcf: line 20, column 66
    function visible_45 () : java.lang.Boolean {
      return perm.Claim.create or perm.Claim.genericviewclaim
    }
    
    // 'visible' attribute on Tab (id=SearchTab) at TabBar.pcf: line 52, column 41
    function visible_67 () : java.lang.Boolean {
      return perm.System.viewsearch
    }
    
    // 'visible' attribute on Tab (id=AddressBookTab) at TabBar.pcf: line 58, column 44
    function visible_72 () : java.lang.Boolean {
      return perm.Contact.viewsearchab
    }
    
    // 'visible' attribute on Tab (id=DashboardTab) at TabBar.pcf: line 63, column 117
    function visible_75 () : java.lang.Boolean {
      return perm.User.viewanyedb and !gw.api.plugin.PluginUtils.isPluginStarted(gw.plugin.cognos.CognosPlugin)
    }
    
    // 'visible' attribute on Tab (id=TeamTab) at TabBar.pcf: line 69, column 39
    function visible_78 () : java.lang.Boolean {
      return perm.System.viewteam
    }
    
    // 'visible' attribute on Tab (id=ReportTab) at TabBar.pcf: line 74, column 122
    function visible_81 () : java.lang.Boolean {
      return perm.System.reporting_view and gw.api.plugin.PluginUtils.isPluginStarted(gw.plugin.cognos.CognosPlugin)
    }
    
    // 'visible' attribute on MenuItem (id=AdminTab_Admin) at TabBar.pcf: line 85, column 43
    function visible_84 () : java.lang.Boolean {
      return perm.User.viewanyadmin
    }
    
    // 'visible' attribute on MenuItem (id=AdminTab_PrintUserGroupTree) at TabBar.pcf: line 91, column 40
    function visible_87 () : java.lang.Boolean {
      return perm.Group.viewtree
    }
    
    // 'visible' attribute on Tab (id=AdminTab) at TabBar.pcf: line 80, column 65
    function visible_89 () : java.lang.Boolean {
      return (perm.User.viewanyadmin or perm.Group.viewtree)
    }
    
    // 'visible' attribute on Tab (id=VacationTab) at TabBar.pcf: line 98, column 43
    function visible_98 () : java.lang.Boolean {
      return perm.System.viewvacation
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 10, column 40
    function action_92 () : void {
      pcf.VacationActivities.go()
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 12, column 36
    function action_94 () : void {
      pcf.VacationClaims.go()
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 14, column 39
    function action_96 () : void {
      pcf.VacationExposures.go()
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 10, column 40
    function action_dest_93 () : pcf.api.Destination {
      return pcf.VacationActivities.createDestination()
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 12, column 36
    function action_dest_95 () : pcf.api.Destination {
      return pcf.VacationClaims.createDestination()
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 14, column 39
    function action_dest_97 () : pcf.api.Destination {
      return pcf.VacationExposures.createDestination()
    }
    
    
  }
  
  
}