package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.database.Query
@javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReinsuranceThresholdsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceThresholdListDetailExpressionsImpl extends ReinsuranceThresholdsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ReinsuranceThresholds.pcf: line 22, column 62
    function def_onEnter_2 (def :  pcf.ReinsuranceThresholdLV) : void {
      def.onEnter(ReinsuranceThreshold)
    }
    
    // 'def' attribute on ListViewInput at ReinsuranceThresholds.pcf: line 47, column 37
    function def_onEnter_5 (def :  pcf.ReinsuranceThresholdLossCausesLV) : void {
      def.onEnter(selectedReinsuranceThreshold)
    }
    
    // 'def' attribute on ListViewInput at ReinsuranceThresholds.pcf: line 57, column 37
    function def_onEnter_7 (def :  pcf.ReinsuranceThresholdCoveragesLV) : void {
      def.onEnter(selectedReinsuranceThreshold)
    }
    
    // 'def' attribute on PanelRef at ReinsuranceThresholds.pcf: line 22, column 62
    function def_refreshVariables_3 (def :  pcf.ReinsuranceThresholdLV) : void {
      def.refreshVariables(ReinsuranceThreshold)
    }
    
    // 'def' attribute on ListViewInput at ReinsuranceThresholds.pcf: line 47, column 37
    function def_refreshVariables_6 (def :  pcf.ReinsuranceThresholdLossCausesLV) : void {
      def.refreshVariables(selectedReinsuranceThreshold)
    }
    
    // 'def' attribute on ListViewInput at ReinsuranceThresholds.pcf: line 57, column 37
    function def_refreshVariables_8 (def :  pcf.ReinsuranceThresholdCoveragesLV) : void {
      def.refreshVariables(selectedReinsuranceThreshold)
    }
    
    // EditButtons at ReinsuranceThresholds.pcf: line 24, column 27
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'label' attribute on Label at ReinsuranceThresholds.pcf: line 38, column 94
    function label_4 () : java.lang.String {
      return DisplayKey.get("LV.ReinsuranceThreshold.DetailedInfo") 
    }
    
    property get selectedReinsuranceThreshold () : ReinsuranceThreshold {
      return getCurrentSelection(2) as ReinsuranceThreshold
    }
    
    property set selectedReinsuranceThreshold ($arg :  ReinsuranceThreshold) {
      setCurrentSelection(2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceThresholdsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Page (id=ReinsuranceThresholds) at ReinsuranceThresholds.pcf: line 10, column 73
    function beforeCommit_9 (pickedValue :  java.lang.Object) : void {
      verifyThreshold()
    }
    
    // 'canEdit' attribute on Page (id=ReinsuranceThresholds) at ReinsuranceThresholds.pcf: line 10, column 73
    function canEdit_10 () : java.lang.Boolean {
      return perm.System.reinsthresholdedit
    }
    
    // 'canVisit' attribute on Page (id=ReinsuranceThresholds) at ReinsuranceThresholds.pcf: line 10, column 73
    static function canVisit_11 () : java.lang.Boolean {
      return perm.System.reinsthresholdview
    }
    
    // Page (id=ReinsuranceThresholds) at ReinsuranceThresholds.pcf: line 10, column 73
    static function parent_12 () : pcf.api.Destination {
      return pcf.BusinessSettings.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ReinsuranceThresholds {
      return super.CurrentLocation as pcf.ReinsuranceThresholds
    }
    
    
    function verifyThreshold() {
      var foundError = false
      var bundle = gw.transaction.Transaction.getCurrent()
      
      var modifiedEntries = bundle.getInsertedAndUpdatedBeansOfType(entity.ReinsuranceThreshold)
      var modifiedAndRemoved = bundle.getAllModifiedBeansOfType(entity.ReinsuranceThreshold)
        
      var modifiedByTreaty = modifiedEntries.partition(\ r -> r.TreatyType)
      for (treaty in modifiedByTreaty.Keys) {
        // map of thresholds organized by treaty. 
        var modifiedThresholdWithTreaty = modifiedByTreaty[treaty]
        var modifiedByPolicy = modifiedThresholdWithTreaty.partition( \ r -> r.PolicyType )
        for (policy in modifiedByPolicy.Keys) {
          var modifiedThresholdWithPolicy = modifiedByPolicy[policy]
          var unmodifiedThresholdWithTreatyAndPolicy = new java.util.ArrayList<ReinsuranceThreshold>()
          
          // find all reinsurance thresholds with the same treaty
          for (ref in Query.make(entity.ReinsuranceThreshold).compare("TreatyType", Equals, treaty).compare("PolicyType", Equals, policy).select()) {
            //if the list of modified thresholds does not contain the threshold, add it to the unmodified list
            if (!modifiedAndRemoved.contains(ref)) {
              unmodifiedThresholdWithTreatyAndPolicy.add(ref)
            }
          }
          
          for (ref in modifiedThresholdWithPolicy index i) {
            var overlapsWithModified = ref.findOverlaps(modifiedThresholdWithPolicy.toList().subList(i + 1, modifiedThresholdWithPolicy.Count))
            var overlapsWithUnmodified = ref.findOverlaps(unmodifiedThresholdWithTreatyAndPolicy)
            if (overlapsWithModified or overlapsWithUnmodified) {
              foundError = true
            }
          }   
        }
      }
      
      if (foundError) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.ReinsuranceThresholds.ConflictWarning"))
      }
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/reinsthreshold/ReinsuranceThresholds.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceThresholdsScreenExpressionsImpl extends ReinsuranceThresholdsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ReinsuranceThresholds.pcf: line 16, column 78
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ReinsuranceThreshold> {
      return gw.api.database.Query.make(entity.ReinsuranceThreshold).select()
    }
    
    property get ReinsuranceThreshold () : gw.api.database.IQueryBeanResult<ReinsuranceThreshold> {
      return getVariableValue("ReinsuranceThreshold", 1) as gw.api.database.IQueryBeanResult<ReinsuranceThreshold>
    }
    
    property set ReinsuranceThreshold ($arg :  gw.api.database.IQueryBeanResult<ReinsuranceThreshold>) {
      setVariableValue("ReinsuranceThreshold", 1, $arg)
    }
    
    
  }
  
  
}