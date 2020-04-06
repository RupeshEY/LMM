package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FreeTextClaimSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FreeTextClaimSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at FreeTextClaimSearchDV.pcf: line 17, column 65
    function def_onEnter_0 (def :  pcf.FreeTextClaimSearchInputSet) : void {
      def.onEnter(ClaimSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at FreeTextClaimSearchDV.pcf: line 21, column 71
    function def_onEnter_2 (def :  pcf.FreeTextClaimSearchFilterInputSet) : void {
      def.onEnter(ClaimSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at FreeTextClaimSearchDV.pcf: line 25, column 46
    function def_onEnter_4 (def :  pcf.ClaimSearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at FreeTextClaimSearchDV.pcf: line 17, column 65
    function def_refreshVariables_1 (def :  pcf.FreeTextClaimSearchInputSet) : void {
      def.refreshVariables(ClaimSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at FreeTextClaimSearchDV.pcf: line 21, column 71
    function def_refreshVariables_3 (def :  pcf.FreeTextClaimSearchFilterInputSet) : void {
      def.refreshVariables(ClaimSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at FreeTextClaimSearchDV.pcf: line 25, column 46
    function def_refreshVariables_5 (def :  pcf.ClaimSearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    property get ClaimSearchCriteria () : ClaimSearchCriteria {
      return getRequireValue("ClaimSearchCriteria", 0) as ClaimSearchCriteria
    }
    
    property set ClaimSearchCriteria ($arg :  ClaimSearchCriteria) {
      setRequireValue("ClaimSearchCriteria", 0, $arg)
    }
    
    property get archiveSearchEnabled () : boolean {
      return getRequireValue("archiveSearchEnabled", 0) as java.lang.Boolean
    }
    
    property set archiveSearchEnabled ($arg :  boolean) {
      setRequireValue("archiveSearchEnabled", 0, $arg)
    }
    
    
  }
  
  
}