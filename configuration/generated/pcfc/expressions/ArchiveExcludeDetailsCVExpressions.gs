package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArchiveExcludeDetailsCVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveExcludeDetailsCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveExcludeDetailsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on TextAreaInput (id=AllArchived) at ArchiveExcludeDetailsCV.pcf: line 33, column 70
    function available_3 () : java.lang.Boolean {
      return gw.api.web.tools.ArchiveInfoPage.isDevMode()
    }
    
    // 'def' attribute on PanelRef (id=ArchiveSkippedDetails) at ArchiveExcludeDetailsCV.pcf: line 44, column 105
    function def_onEnter_11 (def :  pcf.ArchiveExcludeDetailsLV) : void {
      def.onEnter(archiveSkippedDetails)
    }
    
    // 'def' attribute on PanelRef (id=ArchiveExcludedBecauseOfRulesDetails) at ArchiveExcludeDetailsCV.pcf: line 70, column 135
    function def_onEnter_19 (def :  pcf.ArchiveExcludeDetailsLV) : void {
      def.onEnter(archiveExcludedBecauseOfRulesDetails)
    }
    
    // 'def' attribute on PanelRef (id=ArchiveExcludedBecauseOfFailureDetails) at ArchiveExcludeDetailsCV.pcf: line 96, column 139
    function def_onEnter_27 (def :  pcf.ArchiveExcludeDetailsLV) : void {
      def.onEnter(archiveExcludedBecauseOfFailureDetails)
    }
    
    // 'def' attribute on PanelRef (id=ArchiveSkippedDetails) at ArchiveExcludeDetailsCV.pcf: line 44, column 105
    function def_refreshVariables_12 (def :  pcf.ArchiveExcludeDetailsLV) : void {
      def.refreshVariables(archiveSkippedDetails)
    }
    
    // 'def' attribute on PanelRef (id=ArchiveExcludedBecauseOfRulesDetails) at ArchiveExcludeDetailsCV.pcf: line 70, column 135
    function def_refreshVariables_20 (def :  pcf.ArchiveExcludeDetailsLV) : void {
      def.refreshVariables(archiveExcludedBecauseOfRulesDetails)
    }
    
    // 'def' attribute on PanelRef (id=ArchiveExcludedBecauseOfFailureDetails) at ArchiveExcludeDetailsCV.pcf: line 96, column 139
    function def_refreshVariables_28 (def :  pcf.ArchiveExcludeDetailsLV) : void {
      def.refreshVariables(archiveExcludedBecauseOfFailureDetails)
    }
    
    // 'initialValue' attribute on Variable at ArchiveExcludeDetailsCV.pcf: line 13, column 54
    function initialValue_0 () : gw.api.archiving.ArchiveSkippedDetails {
      return archiveCountSummary == null? null : new gw.api.archiving.ArchiveSkippedDetails(archiveCountSummary)
    }
    
    // 'initialValue' attribute on Variable at ArchiveExcludeDetailsCV.pcf: line 17, column 69
    function initialValue_1 () : gw.api.archiving.ArchiveExcludedBecauseOfRulesDetails {
      return archiveCountSummary == null? null : new gw.api.archiving.ArchiveExcludedBecauseOfRulesDetails(archiveCountSummary)
    }
    
    // 'initialValue' attribute on Variable at ArchiveExcludeDetailsCV.pcf: line 21, column 71
    function initialValue_2 () : gw.api.archiving.ArchiveExcludedBecauseOfFailureDetails {
      return archiveCountSummary == null? null : new gw.api.archiving.ArchiveExcludedBecauseOfFailureDetails(archiveCountSummary)
    }
    
    // 'label' attribute on Label (id=TooManyUniqueResultsSkipped) at ArchiveExcludeDetailsCV.pcf: line 58, column 62
    function label_15 () : java.lang.String {
      return DisplayKey.get("Web.ServerTools.ArchiveInfo.TooManyUniqueResults", gw.api.archiving.ArchiveDetails.RESULT_SIZE_DISPLAY_LIMIT)
    }
    
    // 'value' attribute on TextAreaInput (id=AllArchived) at ArchiveExcludeDetailsCV.pcf: line 33, column 70
    function value_5 () : java.lang.String {
      return gw.api.archiving.ArchivedSummary.getArchivedRootInfoAsStringLimitedBy(archiveCountSummary.createQueryForArchived(), gw.api.archiving.ArchiveDetails.RESULT_SIZE_DISPLAY_LIMIT)
    }
    
    // 'visible' attribute on PanelRef (id=ArchiveSkippedDetails) at ArchiveExcludeDetailsCV.pcf: line 44, column 105
    function visible_10 () : java.lang.Boolean {
      return archiveCountSummary.SkippedCount > 0 && archiveSkippedDetails.canDisplay()
    }
    
    // 'visible' attribute on Label (id=NoneSkipped) at ArchiveExcludeDetailsCV.pcf: line 54, column 64
    function visible_13 () : java.lang.Boolean {
      return archiveCountSummary.SkippedCount == 0
    }
    
    // 'visible' attribute on Label (id=TooManyUniqueResultsSkipped) at ArchiveExcludeDetailsCV.pcf: line 58, column 62
    function visible_14 () : java.lang.Boolean {
      return !archiveSkippedDetails.canDisplay()
    }
    
    // 'visible' attribute on PanelRef at ArchiveExcludeDetailsCV.pcf: line 48, column 96
    function visible_16 () : java.lang.Boolean {
      return archiveCountSummary.SkippedCount == 0 || !archiveSkippedDetails.canDisplay()
    }
    
    // 'visible' attribute on Card (id=Skipped) at ArchiveExcludeDetailsCV.pcf: line 40, column 134
    function visible_17 () : java.lang.Boolean {
      return archiveCountSummary != null && (archiveCountSummary typeis gw.api.archiving.ArchiveCountSummarySinceLastRun)
    }
    
    // 'visible' attribute on PanelRef (id=ArchiveExcludedBecauseOfRulesDetails) at ArchiveExcludeDetailsCV.pcf: line 70, column 135
    function visible_18 () : java.lang.Boolean {
      return archiveCountSummary.ExcludedBecauseOfRulesCount > 0 && archiveExcludedBecauseOfRulesDetails.canDisplay()
    }
    
    // 'visible' attribute on Label (id=NoneExcludedBecauseOfRules) at ArchiveExcludeDetailsCV.pcf: line 80, column 79
    function visible_21 () : java.lang.Boolean {
      return archiveCountSummary.ExcludedBecauseOfRulesCount == 0
    }
    
    // 'visible' attribute on Label (id=TooManyUniqueResultsRules) at ArchiveExcludeDetailsCV.pcf: line 84, column 77
    function visible_22 () : java.lang.Boolean {
      return !archiveExcludedBecauseOfRulesDetails.canDisplay()
    }
    
    // 'visible' attribute on PanelRef at ArchiveExcludeDetailsCV.pcf: line 74, column 126
    function visible_24 () : java.lang.Boolean {
      return archiveCountSummary.ExcludedBecauseOfRulesCount == 0 || !archiveExcludedBecauseOfRulesDetails.canDisplay()
    }
    
    // 'visible' attribute on Card (id=ExcludedBecauseOfRules) at ArchiveExcludeDetailsCV.pcf: line 66, column 45
    function visible_25 () : java.lang.Boolean {
      return archiveCountSummary != null
    }
    
    // 'visible' attribute on PanelRef (id=ArchiveExcludedBecauseOfFailureDetails) at ArchiveExcludeDetailsCV.pcf: line 96, column 139
    function visible_26 () : java.lang.Boolean {
      return archiveCountSummary.ExcludedBecauseOfFailureCount > 0 && archiveExcludedBecauseOfFailureDetails.canDisplay()
    }
    
    // 'visible' attribute on Label (id=NoneExcludedBecauseOfFailure) at ArchiveExcludeDetailsCV.pcf: line 106, column 81
    function visible_29 () : java.lang.Boolean {
      return archiveCountSummary.ExcludedBecauseOfFailureCount == 0
    }
    
    // 'visible' attribute on Label (id=TooManyUniqueResultsFailure) at ArchiveExcludeDetailsCV.pcf: line 110, column 79
    function visible_30 () : java.lang.Boolean {
      return !archiveExcludedBecauseOfFailureDetails.canDisplay()
    }
    
    // 'visible' attribute on PanelRef at ArchiveExcludeDetailsCV.pcf: line 100, column 130
    function visible_32 () : java.lang.Boolean {
      return archiveCountSummary.ExcludedBecauseOfFailureCount == 0 || !archiveExcludedBecauseOfFailureDetails.canDisplay()
    }
    
    property get archiveCountSummary () : gw.api.archiving.ArchiveCountSummary {
      return getRequireValue("archiveCountSummary", 0) as gw.api.archiving.ArchiveCountSummary
    }
    
    property set archiveCountSummary ($arg :  gw.api.archiving.ArchiveCountSummary) {
      setRequireValue("archiveCountSummary", 0, $arg)
    }
    
    property get archiveExcludedBecauseOfFailureDetails () : gw.api.archiving.ArchiveExcludedBecauseOfFailureDetails {
      return getVariableValue("archiveExcludedBecauseOfFailureDetails", 0) as gw.api.archiving.ArchiveExcludedBecauseOfFailureDetails
    }
    
    property set archiveExcludedBecauseOfFailureDetails ($arg :  gw.api.archiving.ArchiveExcludedBecauseOfFailureDetails) {
      setVariableValue("archiveExcludedBecauseOfFailureDetails", 0, $arg)
    }
    
    property get archiveExcludedBecauseOfRulesDetails () : gw.api.archiving.ArchiveExcludedBecauseOfRulesDetails {
      return getVariableValue("archiveExcludedBecauseOfRulesDetails", 0) as gw.api.archiving.ArchiveExcludedBecauseOfRulesDetails
    }
    
    property set archiveExcludedBecauseOfRulesDetails ($arg :  gw.api.archiving.ArchiveExcludedBecauseOfRulesDetails) {
      setVariableValue("archiveExcludedBecauseOfRulesDetails", 0, $arg)
    }
    
    property get archiveSkippedDetails () : gw.api.archiving.ArchiveSkippedDetails {
      return getVariableValue("archiveSkippedDetails", 0) as gw.api.archiving.ArchiveSkippedDetails
    }
    
    property set archiveSkippedDetails ($arg :  gw.api.archiving.ArchiveSkippedDetails) {
      setVariableValue("archiveSkippedDetails", 0, $arg)
    }
    
    
  }
  
  
}