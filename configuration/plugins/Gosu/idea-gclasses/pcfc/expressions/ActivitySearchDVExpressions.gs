package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivitySearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/activities/ActivitySearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivitySearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ActivitySearchDV.pcf: line 14, column 71
    function def_onEnter_0 (def :  pcf.ActivitySearchRequiredInputSet) : void {
      def.onEnter(ActivitySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at ActivitySearchDV.pcf: line 18, column 71
    function def_onEnter_2 (def :  pcf.ActivitySearchOptionalInputSet) : void {
      def.onEnter(ActivitySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at ActivitySearchDV.pcf: line 22, column 41
    function def_onEnter_4 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at ActivitySearchDV.pcf: line 14, column 71
    function def_refreshVariables_1 (def :  pcf.ActivitySearchRequiredInputSet) : void {
      def.refreshVariables(ActivitySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at ActivitySearchDV.pcf: line 18, column 71
    function def_refreshVariables_3 (def :  pcf.ActivitySearchOptionalInputSet) : void {
      def.refreshVariables(ActivitySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at ActivitySearchDV.pcf: line 22, column 41
    function def_refreshVariables_5 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    property get ActivitySearchCriteria () : ActivitySearchCriteria {
      return getRequireValue("ActivitySearchCriteria", 0) as ActivitySearchCriteria
    }
    
    property set ActivitySearchCriteria ($arg :  ActivitySearchCriteria) {
      setRequireValue("ActivitySearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}