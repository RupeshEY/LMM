package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecoverySearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoverySearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at RecoverySearchDV.pcf: line 14, column 71
    function def_onEnter_0 (def :  pcf.RecoverySearchRequiredInputSet) : void {
      def.onEnter(RecoverySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at RecoverySearchDV.pcf: line 18, column 71
    function def_onEnter_2 (def :  pcf.RecoverySearchOptionalInputSet) : void {
      def.onEnter(RecoverySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at RecoverySearchDV.pcf: line 22, column 41
    function def_onEnter_4 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at RecoverySearchDV.pcf: line 14, column 71
    function def_refreshVariables_1 (def :  pcf.RecoverySearchRequiredInputSet) : void {
      def.refreshVariables(RecoverySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at RecoverySearchDV.pcf: line 18, column 71
    function def_refreshVariables_3 (def :  pcf.RecoverySearchOptionalInputSet) : void {
      def.refreshVariables(RecoverySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at RecoverySearchDV.pcf: line 22, column 41
    function def_refreshVariables_5 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    property get RecoverySearchCriteria () : RecoverySearchCriteria {
      return getRequireValue("RecoverySearchCriteria", 0) as RecoverySearchCriteria
    }
    
    property set RecoverySearchCriteria ($arg :  RecoverySearchCriteria) {
      setRequireValue("RecoverySearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}