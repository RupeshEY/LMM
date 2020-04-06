package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCPDBenefits.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCPDBenefitsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/wcparms/WCPDBenefits.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCPDBenefitsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Page (id=WCPDBenefits) at WCPDBenefits.pcf: line 10, column 64
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      verifyBenefits()
    }
    
    // 'canEdit' attribute on Page (id=WCPDBenefits) at WCPDBenefits.pcf: line 10, column 64
    function canEdit_5 () : java.lang.Boolean {
      return perm.System.wcrefmanage
    }
    
    // 'canVisit' attribute on Page (id=WCPDBenefits) at WCPDBenefits.pcf: line 10, column 64
    static function canVisit_6 () : java.lang.Boolean {
      return perm.System.wcrefview
    }
    
    // 'def' attribute on PanelRef at WCPDBenefits.pcf: line 29, column 51
    function def_onEnter_2 (def :  pcf.WCPDBenefitsLV) : void {
      def.onEnter(ref_WC_PD_Benefits)
    }
    
    // 'def' attribute on PanelRef at WCPDBenefits.pcf: line 29, column 51
    function def_refreshVariables_3 (def :  pcf.WCPDBenefitsLV) : void {
      def.refreshVariables(ref_WC_PD_Benefits)
    }
    
    // 'initialValue' attribute on Variable at WCPDBenefits.pcf: line 14, column 74
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ref_WC_PD_benefits> {
      return gw.api.database.Query.make(entity.ref_WC_PD_benefits).select()
    }
    
    // EditButtons at WCPDBenefits.pcf: line 22, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // Page (id=WCPDBenefits) at WCPDBenefits.pcf: line 10, column 64
    static function parent_7 () : pcf.api.Destination {
      return pcf.WCParms.createDestination()
    }
    
    override property get CurrentLocation () : pcf.WCPDBenefits {
      return super.CurrentLocation as pcf.WCPDBenefits
    }
    
    property get ref_WC_PD_Benefits () : gw.api.database.IQueryBeanResult<ref_WC_PD_benefits> {
      return getVariableValue("ref_WC_PD_Benefits", 0) as gw.api.database.IQueryBeanResult<ref_WC_PD_benefits>
    }
    
    property set ref_WC_PD_Benefits ($arg :  gw.api.database.IQueryBeanResult<ref_WC_PD_benefits>) {
      setVariableValue("ref_WC_PD_Benefits", 0, $arg)
    }
    
    function verifyBenefits() {
      var foundError = false
      var bundle = gw.transaction.Transaction.getCurrent()
    
      var modifiedEntries = bundle.getInsertedAndUpdatedBeansOfType(entity.ref_WC_PD_benefits)
      var modifiedAndRemoved = bundle.getAllModifiedBeansOfType(entity.ref_WC_PD_benefits)
        
      var modifiedByState = modifiedEntries.partition(\ r -> r.JurisdictionState)
      for (state in modifiedByState.Keys) {
        var modifiedBenefitsWithState = modifiedByState[state] 
        var unmodifiedBenefitsWithState = new java.util.ArrayList<ref_WC_PD_benefits>()
        for (ref in gw.api.database.Query.make(entity.ref_WC_PD_benefits).compare("JurisdictionState", Equals, state).select()) {
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