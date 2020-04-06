package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdminExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 15, column 38
    function action_14 () : void {
      pcf.UsersAndSecurity.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 17, column 37
    function action_20 () : void {
      pcf.SpecialHandling.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 19, column 38
    function action_62 () : void {
      pcf.BusinessSettings.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 21, column 32
    function action_70 () : void {
      pcf.Monitoring.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 23, column 31
    function action_80 () : void {
      pcf.Utilities.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 25, column 44
    function action_86 () : void {
      pcf.IPLMAdminLocationGroup.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 15, column 38
    function action_dest_15 () : pcf.api.Destination {
      return pcf.UsersAndSecurity.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 17, column 37
    function action_dest_21 () : pcf.api.Destination {
      return pcf.SpecialHandling.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 19, column 38
    function action_dest_63 () : pcf.api.Destination {
      return pcf.BusinessSettings.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 21, column 32
    function action_dest_71 () : pcf.api.Destination {
      return pcf.Monitoring.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 23, column 31
    function action_dest_81 () : pcf.api.Destination {
      return pcf.Utilities.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Admin.pcf: line 25, column 44
    function action_dest_87 () : pcf.api.Destination {
      return pcf.IPLMAdminLocationGroup.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=Admin) at Admin.pcf: line 11, column 67
    static function canVisit_88 () : java.lang.Boolean {
      return perm.User.viewanyadmin
    }
    
    // LocationGroup (id=Admin) at Admin.pcf: line 11, column 67
    static function firstVisitableChildDestinationMethod_96 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.UsersAndSecurity.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.SpecialHandling.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.BusinessSettings.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.Monitoring.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.Utilities.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.IPLMAdminLocationGroup.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'menuActions' attribute on LocationGroup (id=Admin) at Admin.pcf: line 11, column 67
    function menuActions_onEnter_89 (def :  pcf.AdminMenuActions) : void {
      def.onEnter()
    }
    
    // 'menuActions' attribute on LocationGroup (id=Admin) at Admin.pcf: line 11, column 67
    function menuActions_refreshVariables_90 (def :  pcf.AdminMenuActions) : void {
      def.refreshVariables()
    }
    
    // 'menuTree' attribute on LocationGroup (id=Admin) at Admin.pcf: line 11, column 67
    function menuTree_onEnter_91 (def :  pcf.AdminMenuTree) : void {
      def.onEnter()
    }
    
    // 'menuTree' attribute on LocationGroup (id=Admin) at Admin.pcf: line 11, column 67
    function menuTree_refreshVariables_92 (def :  pcf.AdminMenuTree) : void {
      def.refreshVariables()
    }
    
    // 'parent' attribute on LocationGroup (id=Admin) at Admin.pcf: line 11, column 67
    static function parent_93 () : pcf.api.Destination {
      return pcf.AdminWelcome.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Admin) at Admin.pcf: line 11, column 67
    function tabBar_onEnter_94 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Admin) at Admin.pcf: line 11, column 67
    function tabBar_refreshVariables_95 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.Admin {
      return super.CurrentLocation as pcf.Admin
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem10ExpressionsImpl extends AdminExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Monitoring.pcf: line 10, column 53
    function action_64 () : void {
      pcf.MessagingDestinationControlList.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Monitoring.pcf: line 12, column 36
    function action_66 () : void {
      pcf.WorkflowSearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Monitoring.pcf: line 14, column 35
    function action_68 () : void {
      pcf.WorkflowStats.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Monitoring.pcf: line 10, column 53
    function action_dest_65 () : pcf.api.Destination {
      return pcf.MessagingDestinationControlList.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Monitoring.pcf: line 12, column 36
    function action_dest_67 () : pcf.api.Destination {
      return pcf.WorkflowSearch.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Monitoring.pcf: line 14, column 35
    function action_dest_69 () : pcf.api.Destination {
      return pcf.WorkflowStats.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem11ExpressionsImpl extends AdminExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Utilities.pcf: line 12, column 21
    function action_72 () : void {
      pcf.ImportWizard.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Utilities.pcf: line 16, column 21
    function action_74 () : void {
      pcf.ExportData.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Utilities.pcf: line 18, column 42
    function action_76 () : void {
      pcf.ScriptParametersPage.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Utilities.pcf: line 20, column 36
    function action_78 () : void {
      pcf.DataChangePage.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Utilities.pcf: line 12, column 21
    function action_dest_73 () : pcf.api.Destination {
      return pcf.ImportWizard.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Utilities.pcf: line 16, column 21
    function action_dest_75 () : pcf.api.Destination {
      return pcf.ExportData.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Utilities.pcf: line 18, column 42
    function action_dest_77 () : pcf.api.Destination {
      return pcf.ScriptParametersPage.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at Utilities.pcf: line 20, column 36
    function action_dest_79 () : pcf.api.Destination {
      return pcf.DataChangePage.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem12ExpressionsImpl extends AdminExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at IPLMAdminLocationGroup.pcf: line 10, column 45
    function action_82 () : void {
      pcf.IPLMAdminMessageLogPage.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at IPLMAdminLocationGroup.pcf: line 12, column 47
    function action_84 () : void {
      pcf.ECFAdminClaimRetrievePage.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at IPLMAdminLocationGroup.pcf: line 10, column 45
    function action_dest_83 () : pcf.api.Destination {
      return pcf.IPLMAdminMessageLogPage.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at IPLMAdminLocationGroup.pcf: line 12, column 47
    function action_dest_85 () : pcf.api.Destination {
      return pcf.ECFAdminClaimRetrievePage.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem2ExpressionsImpl extends LocationGroupMenuItemExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem3ExpressionsImpl extends AdminExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at SpecialHandling.pcf: line 10, column 34
    function action_16 () : void {
      pcf.AccountAdmin.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at SpecialHandling.pcf: line 12, column 46
    function action_18 () : void {
      pcf.CustomerServiceTierAdmin.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at SpecialHandling.pcf: line 10, column 34
    function action_dest_17 () : pcf.api.Destination {
      return pcf.AccountAdmin.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at SpecialHandling.pcf: line 12, column 46
    function action_dest_19 () : pcf.api.Destination {
      return pcf.CustomerServiceTierAdmin.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem4ExpressionsImpl extends AdminExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 11, column 35
    function action_26 () : void {
      pcf.BusinessRules.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 13, column 38
    function action_28 () : void {
      pcf.ActivityPatterns.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 15, column 34
    function action_30 () : void {
      pcf.BusinessWeek.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 17, column 34
    function action_32 () : void {
      pcf.Catastrophes.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 19, column 43
    function action_40 () : void {
      pcf.CoverageDetermination.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 21, column 30
    function action_42 () : void {
      pcf.Holidays.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 24, column 25
    function action_44 () : void {
      pcf.ICD.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 26, column 32
    function action_46 () : void {
      pcf.KeyMetrics.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 28, column 43
    function action_48 () : void {
      pcf.ReinsuranceThresholds.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 30, column 29
    function action_58 () : void {
      pcf.WCParms.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 32, column 45
    function action_60 () : void {
      pcf.WorkloadClassifications.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 11, column 35
    function action_dest_27 () : pcf.api.Destination {
      return pcf.BusinessRules.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 13, column 38
    function action_dest_29 () : pcf.api.Destination {
      return pcf.ActivityPatterns.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 15, column 34
    function action_dest_31 () : pcf.api.Destination {
      return pcf.BusinessWeek.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 17, column 34
    function action_dest_33 () : pcf.api.Destination {
      return pcf.Catastrophes.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 19, column 43
    function action_dest_41 () : pcf.api.Destination {
      return pcf.CoverageDetermination.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 21, column 30
    function action_dest_43 () : pcf.api.Destination {
      return pcf.Holidays.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 24, column 25
    function action_dest_45 () : pcf.api.Destination {
      return pcf.ICD.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 26, column 32
    function action_dest_47 () : pcf.api.Destination {
      return pcf.KeyMetrics.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 28, column 43
    function action_dest_49 () : pcf.api.Destination {
      return pcf.ReinsuranceThresholds.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 30, column 29
    function action_dest_59 () : pcf.api.Destination {
      return pcf.WCParms.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessSettings.pcf: line 32, column 45
    function action_dest_61 () : pcf.api.Destination {
      return pcf.WorkloadClassifications.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem5ExpressionsImpl extends LocationGroupMenuItem4ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessRules.pcf: line 10, column 35
    function action_22 () : void {
      pcf.ActivityRules.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessRules.pcf: line 12, column 52
    function action_24 () : void {
      pcf.ActivityRuleExportImportStatus.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessRules.pcf: line 10, column 35
    function action_dest_23 () : pcf.api.Destination {
      return pcf.ActivityRules.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at BusinessRules.pcf: line 12, column 52
    function action_dest_25 () : pcf.api.Destination {
      return pcf.ActivityRuleExportImportStatus.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem6ExpressionsImpl extends LocationGroupMenuItem4ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem7ExpressionsImpl extends LocationGroupMenuItem4ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at CoverageDetermination.pcf: line 13, column 45
    function action_34 () : void {
      pcf.InvalidCoverageForCause.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at CoverageDetermination.pcf: line 15, column 45
    function action_36 () : void {
      pcf.IncompatibleNewExposure.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at CoverageDetermination.pcf: line 17, column 45
    function action_38 () : void {
      pcf.InvalidCoverageForFault.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at CoverageDetermination.pcf: line 13, column 45
    function action_dest_35 () : pcf.api.Destination {
      return pcf.InvalidCoverageForCause.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at CoverageDetermination.pcf: line 15, column 45
    function action_dest_37 () : pcf.api.Destination {
      return pcf.IncompatibleNewExposure.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at CoverageDetermination.pcf: line 17, column 45
    function action_dest_39 () : pcf.api.Destination {
      return pcf.InvalidCoverageForFault.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem8ExpressionsImpl extends LocationGroupMenuItem4ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem9ExpressionsImpl extends LocationGroupMenuItem4ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at WCParms.pcf: line 13, column 43
    function action_50 () : void {
      pcf.WCBenefitParameterSet.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at WCParms.pcf: line 15, column 34
    function action_52 () : void {
      pcf.WCPDBenefits.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at WCParms.pcf: line 17, column 40
    function action_54 () : void {
      pcf.WCPDWeeksAndLimits.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at WCParms.pcf: line 19, column 35
    function action_56 () : void {
      pcf.DenialPeriods.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at WCParms.pcf: line 13, column 43
    function action_dest_51 () : pcf.api.Destination {
      return pcf.WCBenefitParameterSet.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at WCParms.pcf: line 15, column 34
    function action_dest_53 () : pcf.api.Destination {
      return pcf.WCPDBenefits.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at WCParms.pcf: line 17, column 40
    function action_dest_55 () : pcf.api.Destination {
      return pcf.WCPDWeeksAndLimits.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at WCParms.pcf: line 19, column 35
    function action_dest_57 () : pcf.api.Destination {
      return pcf.DenialPeriods.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/Admin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItemExpressionsImpl extends AdminExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 10, column 41
    function action_0 () : void {
      pcf.AdminUserSearchPage.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 20, column 44
    function action_10 () : void {
      pcf.AuthorityLimitProfiles.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 22, column 32
    function action_12 () : void {
      pcf.Attributes.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 12, column 42
    function action_2 () : void {
      pcf.AdminGroupSearchPage.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 14, column 27
    function action_4 () : void {
      pcf.Roles.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 16, column 29
    function action_6 () : void {
      pcf.Regions.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 18, column 35
    function action_8 () : void {
      pcf.SecurityZones.go()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 10, column 41
    function action_dest_1 () : pcf.api.Destination {
      return pcf.AdminUserSearchPage.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 20, column 44
    function action_dest_11 () : pcf.api.Destination {
      return pcf.AuthorityLimitProfiles.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 22, column 32
    function action_dest_13 () : pcf.api.Destination {
      return pcf.Attributes.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 12, column 42
    function action_dest_3 () : pcf.api.Destination {
      return pcf.AdminGroupSearchPage.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 14, column 27
    function action_dest_5 () : pcf.api.Destination {
      return pcf.Roles.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 16, column 29
    function action_dest_7 () : pcf.api.Destination {
      return pcf.Regions.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Admin) at UsersAndSecurity.pcf: line 18, column 35
    function action_dest_9 () : pcf.api.Destination {
      return pcf.SecurityZones.createDestination()
    }
    
    
  }
  
  
}