package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCPDWeeksAndLimitsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCPDWeeksAndLimitsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Page (id=WCPDWeeksAndLimits) at WCPDWeeksAndLimits.pcf: line 10, column 70
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      verifyBenefits()
    }
    
    // 'canEdit' attribute on Page (id=WCPDWeeksAndLimits) at WCPDWeeksAndLimits.pcf: line 10, column 70
    function canEdit_5 () : java.lang.Boolean {
      return perm.System.wcrefmanage
    }
    
    // 'canVisit' attribute on Page (id=WCPDWeeksAndLimits) at WCPDWeeksAndLimits.pcf: line 10, column 70
    static function canVisit_6 () : java.lang.Boolean {
      return perm.System.wcrefview
    }
    
    // 'def' attribute on PanelRef at WCPDWeeksAndLimits.pcf: line 29, column 63
    function def_onEnter_2 (def :  pcf.WCPDWeeksAndLimitsLV) : void {
      def.onEnter(ref_WC_PD_WeeksAndLimits)
    }
    
    // 'def' attribute on PanelRef at WCPDWeeksAndLimits.pcf: line 29, column 63
    function def_refreshVariables_3 (def :  pcf.WCPDWeeksAndLimitsLV) : void {
      def.refreshVariables(ref_WC_PD_WeeksAndLimits)
    }
    
    // 'initialValue' attribute on Variable at WCPDWeeksAndLimits.pcf: line 14, column 80
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ref_WC_PD_WeeksAndLimits> {
      return gw.api.database.Query.make(entity.ref_WC_PD_WeeksAndLimits).select()
    }
    
    // EditButtons at WCPDWeeksAndLimits.pcf: line 22, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // Page (id=WCPDWeeksAndLimits) at WCPDWeeksAndLimits.pcf: line 10, column 70
    static function parent_7 () : pcf.api.Destination {
      return pcf.WCParms.createDestination()
    }
    
    override property get CurrentLocation () : pcf.WCPDWeeksAndLimits {
      return super.CurrentLocation as pcf.WCPDWeeksAndLimits
    }
    
    property get ref_WC_PD_WeeksAndLimits () : gw.api.database.IQueryBeanResult<ref_WC_PD_WeeksAndLimits> {
      return getVariableValue("ref_WC_PD_WeeksAndLimits", 0) as gw.api.database.IQueryBeanResult<ref_WC_PD_WeeksAndLimits>
    }
    
    property set ref_WC_PD_WeeksAndLimits ($arg :  gw.api.database.IQueryBeanResult<ref_WC_PD_WeeksAndLimits>) {
      setVariableValue("ref_WC_PD_WeeksAndLimits", 0, $arg)
    }
    
    function verifyBenefits() {
      var foundError = false
      var bundle = gw.transaction.Transaction.getCurrent()
      
      var modifiedEntries = bundle.getInsertedAndUpdatedBeansOfType(entity.ref_WC_PD_WeeksAndLimits)
      var modifiedAndRemoved = bundle.getAllModifiedBeansOfType(entity.ref_WC_PD_WeeksAndLimits)
        
      var modifiedByState = modifiedEntries.partition(\ r -> r.JurisdictionState)
      for (state in modifiedByState.Keys) {
        var modifiedBenefitsWithState = modifiedByState[state] 
        var unmodifiedBenefitsWithState = new java.util.ArrayList<ref_WC_PD_WeeksAndLimits>()
        for (ref in gw.api.database.Query.make(entity.ref_WC_PD_WeeksAndLimits).compare("JurisdictionState", Equals, state).select()) {
          if (!modifiedAndRemoved.contains(ref)) {
            unmodifiedBenefitsWithState.add(ref)
          }
        }
        for (ref in modifiedBenefitsWithState index i) {
          var overlapsWithModified = ref.findOverlaps(modifiedBenefitsWithState.toList().subList(i + 1, modifiedBenefitsWithState.Count))
          var overlapsWithUnmodified = ref.findOverlaps(unmodifiedBenefitsWithState)
          if (overlapsWithModified or overlapsWithUnmodified) {
            foundError = true
          }
        }   
      }
        
      if (foundError) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.WCParams.PDBenefits.ConflictWarning"))
      }
    }
    
    
  }
  
  
}