package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FreeTextClaimSearchExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FreeTextClaimSearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (ErrorMessage :  String) : int {
      return 1
    }
    
    // 'canVisit' attribute on Page (id=FreeTextClaimSearch) at FreeTextClaimSearch.pcf: line 9, column 76
    static function canVisit_3 (ErrorMessage :  String) : java.lang.Boolean {
      return perm.Claim.genericviewclaim and perm.System.viewsearch and gw.api.system.PLConfigParameters.FreeTextSearchEnabled.Value
    }
    
    // 'def' attribute on ScreenRef at FreeTextClaimSearch.pcf: line 23, column 46
    function def_onEnter_1 (def :  pcf.FreeTextClaimSearchScreen) : void {
      def.onEnter(true)
    }
    
    // 'def' attribute on ScreenRef at FreeTextClaimSearch.pcf: line 23, column 46
    function def_refreshVariables_2 (def :  pcf.FreeTextClaimSearchScreen) : void {
      def.refreshVariables(true)
    }
    
    // 'initialValue' attribute on Variable at FreeTextClaimSearch.pcf: line 21, column 32
    function initialValue_0 () : java.lang.String {
      return populateErrorMessage()
    }
    
    // Page (id=FreeTextClaimSearch) at FreeTextClaimSearch.pcf: line 9, column 76
    static function parent_4 (ErrorMessage :  String) : pcf.api.Destination {
      return pcf.ClaimSearchesGroup.createDestination()
    }
    
    property get CheckedErrorMessage () : java.lang.String {
      return getVariableValue("CheckedErrorMessage", 0) as java.lang.String
    }
    
    property set CheckedErrorMessage ($arg :  java.lang.String) {
      setVariableValue("CheckedErrorMessage", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.FreeTextClaimSearch {
      return super.CurrentLocation as pcf.FreeTextClaimSearch
    }
    
    property get ErrorMessage () : String {
      return getVariableValue("ErrorMessage", 0) as String
    }
    
    property set ErrorMessage ($arg :  String) {
      setVariableValue("ErrorMessage", 0, $arg)
    }
    
    function populateErrorMessage() : String{
            if(ErrorMessage != null) {
              gw.api.util.LocationUtil.addRequestScopedErrorMessage(ErrorMessage)
            }
            return ErrorMessage
          }
    
    
  }
  
  
}