package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/archive/ArchivedClaim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArchivedClaimExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/archive/ArchivedClaim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchivedClaimExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ClaimInfo :  ClaimInfo) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=ArchivedClaim) at ArchivedClaim.pcf: line 12, column 65
    function canEdit_3 () : java.lang.Boolean {
      return perm.ClaimInfo.edit(ClaimInfo)
    }
    
    // 'canVisit' attribute on Page (id=ArchivedClaim) at ArchivedClaim.pcf: line 12, column 65
    static function canVisit_4 (ClaimInfo :  ClaimInfo) : java.lang.Boolean {
      return perm.ClaimInfo.view(ClaimInfo)
    }
    
    // 'def' attribute on ScreenRef at ArchivedClaim.pcf: line 23, column 70
    function def_onEnter_1 (def :  pcf.ArchivedClaimDetailScreen) : void {
      def.onEnter(ClaimInfo, ArchivedClaimInfo)
    }
    
    // 'def' attribute on ScreenRef at ArchivedClaim.pcf: line 23, column 70
    function def_refreshVariables_2 (def :  pcf.ArchivedClaimDetailScreen) : void {
      def.refreshVariables(ClaimInfo, ArchivedClaimInfo)
    }
    
    // 'initialValue' attribute on Variable at ArchivedClaim.pcf: line 21, column 33
    function initialValue_0 () : ArchivedClaimInfo {
      return new ArchivedClaimInfo()
    }
    
    // Page (id=ArchivedClaim) at ArchivedClaim.pcf: line 12, column 65
    static function parent_5 (ClaimInfo :  ClaimInfo) : pcf.api.Destination {
      return pcf.ClaimInfoGroup.createDestination(ClaimInfo)
    }
    
    property get ArchivedClaimInfo () : ArchivedClaimInfo {
      return getVariableValue("ArchivedClaimInfo", 0) as ArchivedClaimInfo
    }
    
    property set ArchivedClaimInfo ($arg :  ArchivedClaimInfo) {
      setVariableValue("ArchivedClaimInfo", 0, $arg)
    }
    
    property get ClaimInfo () : ClaimInfo {
      return getVariableValue("ClaimInfo", 0) as ClaimInfo
    }
    
    property set ClaimInfo ($arg :  ClaimInfo) {
      setVariableValue("ClaimInfo", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ArchivedClaim {
      return super.CurrentLocation as pcf.ArchivedClaim
    }
    
    
  }
  
  
}