package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 25, column 21
    function action_10 () : void {
      pcf.ClaimWorkplan.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 86, column 45
    function action_101 () : void {
      pcf.ClaimSnapshotGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 90, column 21
    function action_108 () : void {
      pcf.ClaimCalendarGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 94, column 21
    function action_122 () : void {
      pcf.IPLMLocationGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 29, column 21
    function action_23 () : void {
      pcf.ClaimLossDetailsGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 33, column 21
    function action_25 () : void {
      pcf.ClaimExposures.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 45, column 45
    function action_32 () : void {
      pcf.ReinsuranceSummary.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 49, column 21
    function action_38 () : void {
      pcf.ClaimPartiesGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 53, column 21
    function action_55 () : void {
      pcf.ClaimPolicyGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 57, column 21
    function action_63 () : void {
      pcf.ClaimFinancialsGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 61, column 21
    function action_65 () : void {
      pcf.ClaimNotes.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 65, column 21
    function action_67 () : void {
      pcf.ClaimDocuments.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 69, column 21
    function action_73 () : void {
      pcf.ClaimPlanOfActionGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 71, column 47
    function action_75 () : void {
      pcf.ClaimServiceRequests.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 21, column 21
    function action_8 () : void {
      pcf.ClaimSummaryGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 75, column 21
    function action_81 () : void {
      pcf.ClaimSubrogationGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 79, column 21
    function action_83 () : void {
      pcf.ClaimMatters.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 83, column 21
    function action_85 () : void {
      pcf.ClaimHistory.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 86, column 45
    function action_dest_102 () : pcf.api.Destination {
      return pcf.ClaimSnapshotGroup.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 90, column 21
    function action_dest_109 () : pcf.api.Destination {
      return pcf.ClaimCalendarGroup.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 25, column 21
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ClaimWorkplan.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 94, column 21
    function action_dest_123 () : pcf.api.Destination {
      return pcf.IPLMLocationGroup.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 29, column 21
    function action_dest_24 () : pcf.api.Destination {
      return pcf.ClaimLossDetailsGroup.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 33, column 21
    function action_dest_26 () : pcf.api.Destination {
      return pcf.ClaimExposures.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 45, column 45
    function action_dest_33 () : pcf.api.Destination {
      return pcf.ReinsuranceSummary.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 49, column 21
    function action_dest_39 () : pcf.api.Destination {
      return pcf.ClaimPartiesGroup.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 53, column 21
    function action_dest_56 () : pcf.api.Destination {
      return pcf.ClaimPolicyGroup.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 57, column 21
    function action_dest_64 () : pcf.api.Destination {
      return pcf.ClaimFinancialsGroup.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 61, column 21
    function action_dest_66 () : pcf.api.Destination {
      return pcf.ClaimNotes.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 65, column 21
    function action_dest_68 () : pcf.api.Destination {
      return pcf.ClaimDocuments.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 69, column 21
    function action_dest_74 () : pcf.api.Destination {
      return pcf.ClaimPlanOfActionGroup.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 71, column 47
    function action_dest_76 () : pcf.api.Destination {
      return pcf.ClaimServiceRequests.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 75, column 21
    function action_dest_82 () : pcf.api.Destination {
      return pcf.ClaimSubrogationGroup.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 79, column 21
    function action_dest_84 () : pcf.api.Destination {
      return pcf.ClaimMatters.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 83, column 21
    function action_dest_86 () : pcf.api.Destination {
      return pcf.ClaimHistory.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 21, column 21
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimSummaryGroup.createDestination(Claim)
    }
    
    // 'afterEnter' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    function afterEnter_124 () : void {
      gw.api.claim.ClaimUtil.addToSessionList(Claim); gw.api.claim.ClaimUtil.markClaimAsViewed(Claim);
    }
    
    // 'browserTitle' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    function browserTitle_125 () : java.lang.String {
      return DisplayKey.get("Web.Claim.WindowTitle", Claim.ClaimNumber)
    }
    
    // LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    static function firstVisitableChildDestinationMethod_134 (Claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ClaimSummaryGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimWorkplan.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimLossDetailsGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimExposures.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      for (var Exposure in (Claim.OrderedExposures)) {
        dest = pcf.TopLevelExposureDetail.createDestination(Exposure)
        if (dest.canVisitSelf()) {
          return dest
        }
      }
      dest = pcf.ReinsuranceSummary.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimPartiesGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimPolicyGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimFinancialsGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimNotes.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimDocuments.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimPlanOfActionGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimServiceRequests.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimSubrogationGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimMatters.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimHistory.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimSnapshotGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimCalendarGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.IPLMLocationGroup.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'infoBar' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    function infoBar_onEnter_126 (def :  pcf.ClaimInfoBar) : void {
      def.onEnter(Claim)
    }
    
    // 'infoBar' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    function infoBar_refreshVariables_127 (def :  pcf.ClaimInfoBar) : void {
      def.refreshVariables(Claim)
    }
    
    // 'label' attribute on LocationGroup (id=Claim) at Claim.pcf: line 86, column 45
    function label_103 () : java.lang.Object {
      return (Claim.LossType == LossType.TC_WC ) ? DisplayKey.get("JSP.ClaimPageLinks.PageLink.FirstReportOfInjurySnapshot") : DisplayKey.get("JSP.ClaimPageLinks.PageLink.Snapshot")  
    }
    
    // 'menuActions' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    function menuActions_onEnter_128 (def :  pcf.ClaimMenuActions) : void {
      def.onEnter(Claim)
    }
    
    // 'menuActions' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    function menuActions_refreshVariables_129 (def :  pcf.ClaimMenuActions) : void {
      def.refreshVariables(Claim)
    }
    
    // 'parent' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    static function parent_130 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimForward.createDestination(Claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    function tabBar_onEnter_131 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    function tabBar_refreshVariables_132 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    // 'title' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    static function title_133 (Claim :  Claim) : java.lang.Object {
      return DisplayKey.get("Web.ClaimFile.LocationGroup.Title", Claim.ClaimNumber)
    }
    
    // 'value' attribute on LocationRefIterator at Claim.pcf: line 38, column 94
    function value_1 () : entity.Exposure[] {
      return Claim.OrderedExposures
    }
    
    // 'visible' attribute on LocationRefIterator at Claim.pcf: line 38, column 94
    function visible_0 () : java.lang.Boolean {
      return (Claim.ExposureListVisibleInClaimFile) or (Claim.LossType == LossType.TC_WC)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.Claim {
      return super.CurrentLocation as pcf.Claim
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends LocationGroupMenuItem2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimLossDetailsGroup.pcf: line 32, column 57
    function action_19 () : void {
      pcf.LossDetailsExposureDetail.go(Exposure)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimLossDetailsGroup.pcf: line 32, column 57
    function action_dest_20 () : pcf.api.Destination {
      return pcf.LossDetailsExposureDetail.createDestination(Exposure)
    }
    
    // 'label' attribute on LocationGroup (id=Claim) at ClaimLossDetailsGroup.pcf: line 32, column 57
    function label_21 () : java.lang.Object {
      return DisplayKey.get("JSP.ClaimPageLinks.DynamicPageLinks.Exposure", Exposure.ExposureType)
    }
    
    property get Exposure () : entity.Exposure {
      return getIteratedValue(2) as entity.Exposure
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 41, column 54
    function action_28 () : void {
      pcf.TopLevelExposureDetail.go(Exposure)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at Claim.pcf: line 41, column 54
    function action_dest_29 () : pcf.api.Destination {
      return pcf.TopLevelExposureDetail.createDestination(Exposure)
    }
    
    // 'label' attribute on LocationGroup (id=Claim) at Claim.pcf: line 41, column 54
    function label_30 () : java.lang.Object {
      return DisplayKey.get("JSP.ClaimPageLinks.DynamicPageLinks.Exposure", Exposure.ExposureType)
    }
    
    property get Exposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get Exposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem10ExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at IPLMLocationGroup.pcf: line 17, column 43
    function action_116 () : void {
      pcf.ECFLocationGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at IPLMLocationGroup.pcf: line 20, column 43
    function action_120 () : void {
      pcf.SCMLocationGroup.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at IPLMLocationGroup.pcf: line 17, column 43
    function action_dest_117 () : pcf.api.Destination {
      return pcf.ECFLocationGroup.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at IPLMLocationGroup.pcf: line 20, column 43
    function action_dest_121 () : pcf.api.Destination {
      return pcf.SCMLocationGroup.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 1) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem11ExpressionsImpl extends LocationGroupMenuItem10ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ECFLocationGroup.pcf: line 17, column 44
    function action_110 () : void {
      pcf.ClaimTransactions.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ECFLocationGroup.pcf: line 20, column 40
    function action_112 () : void {
      pcf.ClaimMessages.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ECFLocationGroup.pcf: line 23, column 47
    function action_114 () : void {
      pcf.ClaimRetrieveRequest.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ECFLocationGroup.pcf: line 17, column 44
    function action_dest_111 () : pcf.api.Destination {
      return pcf.ClaimTransactions.createDestination(claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ECFLocationGroup.pcf: line 20, column 40
    function action_dest_113 () : pcf.api.Destination {
      return pcf.ClaimMessages.createDestination(claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ECFLocationGroup.pcf: line 23, column 47
    function action_dest_115 () : pcf.api.Destination {
      return pcf.ClaimRetrieveRequest.createDestination(claim)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 2) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem12ExpressionsImpl extends LocationGroupMenuItem10ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at SCMLocationGroup.pcf: line 17, column 43
    function action_118 () : void {
      pcf.SCMClaimMessages.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at SCMLocationGroup.pcf: line 17, column 43
    function action_dest_119 () : pcf.api.Destination {
      return pcf.SCMClaimMessages.createDestination(claim)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 2) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem2ExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimLossDetailsGroup.pcf: line 16, column 43
    function action_12 () : void {
      pcf.ClaimLossDetails.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimLossDetailsGroup.pcf: line 20, column 21
    function action_14 () : void {
      pcf.ClaimAssociations.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimLossDetailsGroup.pcf: line 24, column 21
    function action_16 () : void {
      pcf.SIDetails.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimLossDetailsGroup.pcf: line 16, column 43
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimLossDetailsGroup.pcf: line 20, column 21
    function action_dest_15 () : pcf.api.Destination {
      return pcf.ClaimAssociations.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimLossDetailsGroup.pcf: line 24, column 21
    function action_dest_17 () : pcf.api.Destination {
      return pcf.SIDetails.createDestination(Claim)
    }
    
    // 'value' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    function value_22 () : entity.Exposure[] {
      return Claim.OrderedExposures
    }
    
    // 'visible' attribute on LocationGroup (id=Claim) at Claim.pcf: line 12, column 94
    function visible_18 () : java.lang.Boolean {
      return Claim.ExposureListVisibleInLossDetails and (Claim.LossType != LossType.TC_WC)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 1) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem3ExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPartiesGroup.pcf: line 17, column 21
    function action_34 () : void {
      pcf.ClaimContacts.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPartiesGroup.pcf: line 21, column 21
    function action_36 () : void {
      pcf.ClaimUsers.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPartiesGroup.pcf: line 17, column 21
    function action_dest_35 () : pcf.api.Destination {
      return pcf.ClaimContacts.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPartiesGroup.pcf: line 21, column 21
    function action_dest_37 () : pcf.api.Destination {
      return pcf.ClaimUsers.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 1) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem4ExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 17, column 21
    function action_40 () : void {
      pcf.ClaimPolicyGeneral.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 21, column 21
    function action_42 () : void {
      pcf.ClaimPolicyVehicles.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 25, column 21
    function action_44 () : void {
      pcf.ClaimPolicyTrips.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 29, column 21
    function action_46 () : void {
      pcf.ClaimPolicyLocations.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 33, column 21
    function action_49 () : void {
      pcf.ClaimPolicyEndorsements.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 36, column 47
    function action_51 () : void {
      pcf.ClaimPolicyStatCodes.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 40, column 21
    function action_53 () : void {
      pcf.ClaimPolicyAggregateLimits.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 17, column 21
    function action_dest_41 () : pcf.api.Destination {
      return pcf.ClaimPolicyGeneral.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 21, column 21
    function action_dest_43 () : pcf.api.Destination {
      return pcf.ClaimPolicyVehicles.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 25, column 21
    function action_dest_45 () : pcf.api.Destination {
      return pcf.ClaimPolicyTrips.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 29, column 21
    function action_dest_47 () : pcf.api.Destination {
      return pcf.ClaimPolicyLocations.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 33, column 21
    function action_dest_50 () : pcf.api.Destination {
      return pcf.ClaimPolicyEndorsements.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 36, column 47
    function action_dest_52 () : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodes.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 40, column 21
    function action_dest_54 () : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimits.createDestination(Claim)
    }
    
    // 'label' attribute on LocationGroup (id=Claim) at ClaimPolicyGroup.pcf: line 29, column 21
    function label_48 () : java.lang.Object {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Classcodes") ? DisplayKey.get("JSP.ClaimPolicy.Policy.Navigation.WCLocations") : DisplayKey.get("JSP.ClaimPolicy.Policy.Navigation.Locations")
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 1) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem5ExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimFinancialsGroup.pcf: line 17, column 21
    function action_57 () : void {
      pcf.ClaimFinancialsSummary.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimFinancialsGroup.pcf: line 21, column 21
    function action_59 () : void {
      pcf.ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimFinancialsGroup.pcf: line 25, column 21
    function action_61 () : void {
      pcf.ClaimFinancialsChecks.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimFinancialsGroup.pcf: line 17, column 21
    function action_dest_58 () : pcf.api.Destination {
      return pcf.ClaimFinancialsSummary.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimFinancialsGroup.pcf: line 21, column 21
    function action_dest_60 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactions.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimFinancialsGroup.pcf: line 25, column 21
    function action_dest_62 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecks.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 1) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem6ExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPlanOfActionGroup.pcf: line 17, column 21
    function action_69 () : void {
      pcf.ClaimEvaluations.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPlanOfActionGroup.pcf: line 21, column 21
    function action_71 () : void {
      pcf.ClaimNegotiations.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPlanOfActionGroup.pcf: line 17, column 21
    function action_dest_70 () : pcf.api.Destination {
      return pcf.ClaimEvaluations.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimPlanOfActionGroup.pcf: line 21, column 21
    function action_dest_72 () : pcf.api.Destination {
      return pcf.ClaimNegotiations.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 1) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem7ExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSubrogationGroup.pcf: line 16, column 45
    function action_77 () : void {
      pcf.SubrogationGeneral.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSubrogationGroup.pcf: line 19, column 45
    function action_79 () : void {
      pcf.SubrogationParties.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSubrogationGroup.pcf: line 16, column 45
    function action_dest_78 () : pcf.api.Destination {
      return pcf.SubrogationGeneral.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSubrogationGroup.pcf: line 19, column 45
    function action_dest_80 () : pcf.api.Destination {
      return pcf.SubrogationParties.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 1) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem8ExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 16, column 51
    function action_87 () : void {
      pcf.ClaimSnapshotLossDetails.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 20, column 21
    function action_89 () : void {
      pcf.ClaimSnapshotPartiesInvolved.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 24, column 21
    function action_91 () : void {
      pcf.ClaimSnapshotPolicy.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 28, column 21
    function action_93 () : void {
      pcf.ClaimSnapshotExposures.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 32, column 21
    function action_95 () : void {
      pcf.ClaimSnapshotNotes.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 36, column 21
    function action_97 () : void {
      pcf.ClaimSnapshotDocuments.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 40, column 21
    function action_99 () : void {
      pcf.ClaimSnapshotExtraFields.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 40, column 21
    function action_dest_100 () : pcf.api.Destination {
      return pcf.ClaimSnapshotExtraFields.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 16, column 51
    function action_dest_88 () : pcf.api.Destination {
      return pcf.ClaimSnapshotLossDetails.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 20, column 21
    function action_dest_90 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPartiesInvolved.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 24, column 21
    function action_dest_92 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPolicy.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 28, column 21
    function action_dest_94 () : pcf.api.Destination {
      return pcf.ClaimSnapshotExposures.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 32, column 21
    function action_dest_96 () : pcf.api.Destination {
      return pcf.ClaimSnapshotNotes.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSnapshotGroup.pcf: line 36, column 21
    function action_dest_98 () : pcf.api.Destination {
      return pcf.ClaimSnapshotDocuments.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 1) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem9ExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimCalendarGroup.pcf: line 17, column 21
    function action_104 () : void {
      pcf.ClaimCalendar.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimCalendarGroup.pcf: line 21, column 21
    function action_106 () : void {
      pcf.SupervisorClaimCalendar.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimCalendarGroup.pcf: line 17, column 21
    function action_dest_105 () : pcf.api.Destination {
      return pcf.ClaimCalendar.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimCalendarGroup.pcf: line 21, column 21
    function action_dest_107 () : pcf.api.Destination {
      return pcf.SupervisorClaimCalendar.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 1) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/Claim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItemExpressionsImpl extends ClaimExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSummaryGroup.pcf: line 16, column 39
    function action_2 () : void {
      pcf.ClaimSummary.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSummaryGroup.pcf: line 19, column 38
    function action_4 () : void {
      pcf.ClaimStatus.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSummaryGroup.pcf: line 22, column 42
    function action_6 () : void {
      pcf.ClaimKeyMetrics.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSummaryGroup.pcf: line 16, column 39
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimSummary.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSummaryGroup.pcf: line 19, column 38
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ClaimStatus.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=Claim) at ClaimSummaryGroup.pcf: line 22, column 42
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ClaimKeyMetrics.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 1) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 1, $arg)
    }
    
    
  }
  
  
}