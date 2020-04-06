package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businesssettings/BusinessSettings.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BusinessSettingsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/businesssettings/BusinessSettings.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessSettingsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 17, column 34
    function action_10 () : void {
      pcf.Catastrophes.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 19, column 43
    function action_18 () : void {
      pcf.CoverageDetermination.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 21, column 30
    function action_20 () : void {
      pcf.Holidays.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 24, column 25
    function action_22 () : void {
      pcf.ICD.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 26, column 32
    function action_24 () : void {
      pcf.KeyMetrics.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 28, column 43
    function action_26 () : void {
      pcf.ReinsuranceThresholds.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 30, column 29
    function action_36 () : void {
      pcf.WCParms.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 32, column 45
    function action_38 () : void {
      pcf.WorkloadClassifications.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 11, column 35
    function action_4 () : void {
      pcf.BusinessRules.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 13, column 38
    function action_6 () : void {
      pcf.ActivityPatterns.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 15, column 34
    function action_8 () : void {
      pcf.BusinessWeek.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 17, column 34
    function action_dest_11 () : pcf.api.Destination {
      return pcf.Catastrophes.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 19, column 43
    function action_dest_19 () : pcf.api.Destination {
      return pcf.CoverageDetermination.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 21, column 30
    function action_dest_21 () : pcf.api.Destination {
      return pcf.Holidays.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 24, column 25
    function action_dest_23 () : pcf.api.Destination {
      return pcf.ICD.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 26, column 32
    function action_dest_25 () : pcf.api.Destination {
      return pcf.KeyMetrics.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 28, column 43
    function action_dest_27 () : pcf.api.Destination {
      return pcf.ReinsuranceThresholds.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 30, column 29
    function action_dest_37 () : pcf.api.Destination {
      return pcf.WCParms.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 32, column 45
    function action_dest_39 () : pcf.api.Destination {
      return pcf.WorkloadClassifications.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 11, column 35
    function action_dest_5 () : pcf.api.Destination {
      return pcf.BusinessRules.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 13, column 38
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ActivityPatterns.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 15, column 34
    function action_dest_9 () : pcf.api.Destination {
      return pcf.BusinessWeek.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 8, column 68
    static function canVisit_40 () : java.lang.Boolean {
      return canViewAnyBusinessSettings()
    }
    
    // LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 8, column 68
    static function firstVisitableChildDestinationMethod_44 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.BusinessRules.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ActivityPatterns.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.BusinessWeek.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.Catastrophes.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.CoverageDetermination.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.Holidays.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ICD.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.KeyMetrics.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ReinsuranceThresholds.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.WCParms.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.WorkloadClassifications.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 8, column 68
    static function parent_41 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 8, column 68
    function tabBar_onEnter_42 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=BusinessSettings) at BusinessSettings.pcf: line 8, column 68
    function tabBar_refreshVariables_43 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.BusinessSettings {
      return super.CurrentLocation as pcf.BusinessSettings
    }
    
    static function canViewAnyBusinessSettings() : boolean {
      return perm.ActivityPattern.view 
          or perm.BusinessWeek.view 
          or perm.Catastrophe.view 
          or perm.System.covverifyview 
          or perm.Holiday.view 
          or perm.System.viewrefdata 
          or perm.ClaimMetricLimit.view 
          or perm.System.reinsthresholdview 
          or perm.System.wcrefview 
          or (gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlcview)
          or perm.ActivityRule.view
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/businesssettings/BusinessSettings.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem2ExpressionsImpl extends BusinessSettingsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/businesssettings/BusinessSettings.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem3ExpressionsImpl extends BusinessSettingsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at CoverageDetermination.pcf: line 13, column 45
    function action_12 () : void {
      pcf.InvalidCoverageForCause.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at CoverageDetermination.pcf: line 15, column 45
    function action_14 () : void {
      pcf.IncompatibleNewExposure.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at CoverageDetermination.pcf: line 17, column 45
    function action_16 () : void {
      pcf.InvalidCoverageForFault.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at CoverageDetermination.pcf: line 13, column 45
    function action_dest_13 () : pcf.api.Destination {
      return pcf.InvalidCoverageForCause.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at CoverageDetermination.pcf: line 15, column 45
    function action_dest_15 () : pcf.api.Destination {
      return pcf.IncompatibleNewExposure.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at CoverageDetermination.pcf: line 17, column 45
    function action_dest_17 () : pcf.api.Destination {
      return pcf.InvalidCoverageForFault.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/businesssettings/BusinessSettings.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem4ExpressionsImpl extends BusinessSettingsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/businesssettings/BusinessSettings.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem5ExpressionsImpl extends BusinessSettingsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at WCParms.pcf: line 13, column 43
    function action_28 () : void {
      pcf.WCBenefitParameterSet.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at WCParms.pcf: line 15, column 34
    function action_30 () : void {
      pcf.WCPDBenefits.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at WCParms.pcf: line 17, column 40
    function action_32 () : void {
      pcf.WCPDWeeksAndLimits.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at WCParms.pcf: line 19, column 35
    function action_34 () : void {
      pcf.DenialPeriods.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at WCParms.pcf: line 13, column 43
    function action_dest_29 () : pcf.api.Destination {
      return pcf.WCBenefitParameterSet.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at WCParms.pcf: line 15, column 34
    function action_dest_31 () : pcf.api.Destination {
      return pcf.WCPDBenefits.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at WCParms.pcf: line 17, column 40
    function action_dest_33 () : pcf.api.Destination {
      return pcf.WCPDWeeksAndLimits.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at WCParms.pcf: line 19, column 35
    function action_dest_35 () : pcf.api.Destination {
      return pcf.DenialPeriods.createDestination()
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/businesssettings/BusinessSettings.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItemExpressionsImpl extends BusinessSettingsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessRules.pcf: line 10, column 35
    function action_0 () : void {
      pcf.ActivityRules.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessRules.pcf: line 12, column 52
    function action_2 () : void {
      pcf.ActivityRuleExportImportStatus.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessRules.pcf: line 10, column 35
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ActivityRules.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessSettings) at BusinessRules.pcf: line 12, column 52
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ActivityRuleExportImportStatus.createDestination()
    }
    
    
  }
  
  
}