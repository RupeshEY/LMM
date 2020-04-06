package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InvalidCoverageForFaultExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvalidCoverageForFaultExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=InvalidCoverageForFault) at InvalidCoverageForFault.pcf: line 9, column 75
    function canEdit_4 () : java.lang.Boolean {
      return perm.System.covverifymanage
    }
    
    // 'canVisit' attribute on Page (id=InvalidCoverageForFault) at InvalidCoverageForFault.pcf: line 9, column 75
    static function canVisit_5 () : java.lang.Boolean {
      return perm.System.covverifyview
    }
    
    // 'def' attribute on PanelRef at InvalidCoverageForFault.pcf: line 28, column 67
    function def_onEnter_2 (def :  pcf.InvalidCoverageForFaultLV) : void {
      def.onEnter(InvalidCoverageForFault)
    }
    
    // 'def' attribute on PanelRef at InvalidCoverageForFault.pcf: line 28, column 67
    function def_refreshVariables_3 (def :  pcf.InvalidCoverageForFaultLV) : void {
      def.refreshVariables(InvalidCoverageForFault)
    }
    
    // 'initialValue' attribute on Variable at InvalidCoverageForFault.pcf: line 13, column 79
    function initialValue_0 () : gw.api.database.IQueryBeanResult<InvalidCoverageForFault> {
      return gw.api.database.Query.make(entity.InvalidCoverageForFault).select()
    }
    
    // EditButtons at InvalidCoverageForFault.pcf: line 21, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // Page (id=InvalidCoverageForFault) at InvalidCoverageForFault.pcf: line 9, column 75
    static function parent_6 () : pcf.api.Destination {
      return pcf.CoverageDetermination.createDestination()
    }
    
    override property get CurrentLocation () : pcf.InvalidCoverageForFault {
      return super.CurrentLocation as pcf.InvalidCoverageForFault
    }
    
    property get InvalidCoverageForFault () : gw.api.database.IQueryBeanResult<InvalidCoverageForFault> {
      return getVariableValue("InvalidCoverageForFault", 0) as gw.api.database.IQueryBeanResult<InvalidCoverageForFault>
    }
    
    property set InvalidCoverageForFault ($arg :  gw.api.database.IQueryBeanResult<InvalidCoverageForFault>) {
      setVariableValue("InvalidCoverageForFault", 0, $arg)
    }
    
    
  }
  
  
}