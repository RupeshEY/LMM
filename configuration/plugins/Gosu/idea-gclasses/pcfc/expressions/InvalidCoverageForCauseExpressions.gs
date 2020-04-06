package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InvalidCoverageForCauseExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvalidCoverageForCauseExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=InvalidCoverageForCause) at InvalidCoverageForCause.pcf: line 9, column 75
    function canEdit_4 () : java.lang.Boolean {
      return perm.System.covverifymanage
    }
    
    // 'canVisit' attribute on Page (id=InvalidCoverageForCause) at InvalidCoverageForCause.pcf: line 9, column 75
    static function canVisit_5 () : java.lang.Boolean {
      return perm.System.covverifyview
    }
    
    // 'def' attribute on PanelRef at InvalidCoverageForCause.pcf: line 28, column 67
    function def_onEnter_2 (def :  pcf.InvalidCoverageForCauseLV) : void {
      def.onEnter(InvalidCoverageForCause)
    }
    
    // 'def' attribute on PanelRef at InvalidCoverageForCause.pcf: line 28, column 67
    function def_refreshVariables_3 (def :  pcf.InvalidCoverageForCauseLV) : void {
      def.refreshVariables(InvalidCoverageForCause)
    }
    
    // 'initialValue' attribute on Variable at InvalidCoverageForCause.pcf: line 13, column 79
    function initialValue_0 () : gw.api.database.IQueryBeanResult<InvalidCoverageForCause> {
      return gw.api.database.Query.make(entity.InvalidCoverageForCause).select()
    }
    
    // EditButtons at InvalidCoverageForCause.pcf: line 21, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // Page (id=InvalidCoverageForCause) at InvalidCoverageForCause.pcf: line 9, column 75
    static function parent_6 () : pcf.api.Destination {
      return pcf.CoverageDetermination.createDestination()
    }
    
    override property get CurrentLocation () : pcf.InvalidCoverageForCause {
      return super.CurrentLocation as pcf.InvalidCoverageForCause
    }
    
    property get InvalidCoverageForCause () : gw.api.database.IQueryBeanResult<InvalidCoverageForCause> {
      return getVariableValue("InvalidCoverageForCause", 0) as gw.api.database.IQueryBeanResult<InvalidCoverageForCause>
    }
    
    property set InvalidCoverageForCause ($arg :  gw.api.database.IQueryBeanResult<InvalidCoverageForCause>) {
      setVariableValue("InvalidCoverageForCause", 0, $arg)
    }
    
    
  }
  
  
}