package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSearchExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
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
    
    // 'canVisit' attribute on Page (id=ClaimSearch) at ClaimSearch.pcf: line 9, column 76
    static function canVisit_3 (ErrorMessage :  String) : java.lang.Boolean {
      return perm.Claim.genericviewclaim and perm.System.viewsearch
    }
    
    // 'def' attribute on ScreenRef at ClaimSearch.pcf: line 23, column 56
    function def_onEnter_1 (def :  pcf.ClaimSearchScreen) : void {
      def.onEnter(isArchivingAvailable())
    }
    
    // 'def' attribute on ScreenRef at ClaimSearch.pcf: line 23, column 56
    function def_refreshVariables_2 (def :  pcf.ClaimSearchScreen) : void {
      def.refreshVariables(isArchivingAvailable())
    }
    
    // 'initialValue' attribute on Variable at ClaimSearch.pcf: line 21, column 32
    function initialValue_0 () : java.lang.String {
      return populateErrorMessage()
    }
    
    // Page (id=ClaimSearch) at ClaimSearch.pcf: line 9, column 76
    static function parent_4 (ErrorMessage :  String) : pcf.api.Destination {
      return pcf.ClaimSearchesGroup.createDestination()
    }
    
    property get CheckedErrorMessage () : java.lang.String {
      return getVariableValue("CheckedErrorMessage", 0) as java.lang.String
    }
    
    property set CheckedErrorMessage ($arg :  java.lang.String) {
      setVariableValue("CheckedErrorMessage", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSearch {
      return super.CurrentLocation as pcf.ClaimSearch
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
    
          function isArchivingAvailable() : boolean {
            return gw.api.claim.ClaimUtil.isArchivingEnabled() and gw.api.claim.ClaimUtil.isArchivingAvailable()
          }
        
    
    
  }
  
  
}