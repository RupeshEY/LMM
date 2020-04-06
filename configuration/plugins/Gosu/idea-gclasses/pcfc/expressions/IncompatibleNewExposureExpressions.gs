package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IncompatibleNewExposureExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncompatibleNewExposureExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=IncompatibleNewExposure) at IncompatibleNewExposure.pcf: line 9, column 75
    function canEdit_4 () : java.lang.Boolean {
      return perm.System.covverifymanage
    }
    
    // 'canVisit' attribute on Page (id=IncompatibleNewExposure) at IncompatibleNewExposure.pcf: line 9, column 75
    static function canVisit_5 () : java.lang.Boolean {
      return perm.System.covverifyview
    }
    
    // 'def' attribute on PanelRef at IncompatibleNewExposure.pcf: line 28, column 67
    function def_onEnter_2 (def :  pcf.IncompatibleNewExposureLV) : void {
      def.onEnter(IncompatibleNewExposure)
    }
    
    // 'def' attribute on PanelRef at IncompatibleNewExposure.pcf: line 28, column 67
    function def_refreshVariables_3 (def :  pcf.IncompatibleNewExposureLV) : void {
      def.refreshVariables(IncompatibleNewExposure)
    }
    
    // 'initialValue' attribute on Variable at IncompatibleNewExposure.pcf: line 13, column 79
    function initialValue_0 () : gw.api.database.IQueryBeanResult<IncompatibleNewExposure> {
      return gw.api.database.Query.make(entity.IncompatibleNewExposure).select()
    }
    
    // EditButtons at IncompatibleNewExposure.pcf: line 21, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // Page (id=IncompatibleNewExposure) at IncompatibleNewExposure.pcf: line 9, column 75
    static function parent_6 () : pcf.api.Destination {
      return pcf.CoverageDetermination.createDestination()
    }
    
    override property get CurrentLocation () : pcf.IncompatibleNewExposure {
      return super.CurrentLocation as pcf.IncompatibleNewExposure
    }
    
    property get IncompatibleNewExposure () : gw.api.database.IQueryBeanResult<IncompatibleNewExposure> {
      return getVariableValue("IncompatibleNewExposure", 0) as gw.api.database.IQueryBeanResult<IncompatibleNewExposure>
    }
    
    property set IncompatibleNewExposure ($arg :  gw.api.database.IQueryBeanResult<IncompatibleNewExposure>) {
      setVariableValue("IncompatibleNewExposure", 0, $arg)
    }
    
    
  }
  
  
}