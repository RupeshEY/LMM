package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCBenefitParameterSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCBenefitParameterSetExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/wcparms/WCBenefitParameterSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCBenefitParameterSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=AddWCBenefitParameterSet) at WCBenefitParameterSet.pcf: line 26, column 59
    function action_1 () : void {
      WCBenefitParameterSetPopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=AddWCBenefitParameterSet) at WCBenefitParameterSet.pcf: line 26, column 59
    function action_dest_2 () : pcf.api.Destination {
      return pcf.WCBenefitParameterSetPopup.createDestination()
    }
    
    // 'canEdit' attribute on Page (id=WCBenefitParameterSet) at WCBenefitParameterSet.pcf: line 9, column 73
    function canEdit_5 () : java.lang.Boolean {
      return perm.System.wcrefmanage
    }
    
    // 'canVisit' attribute on Page (id=WCBenefitParameterSet) at WCBenefitParameterSet.pcf: line 9, column 73
    static function canVisit_6 () : java.lang.Boolean {
      return perm.System.wcrefview
    }
    
    // 'def' attribute on PanelRef at WCBenefitParameterSet.pcf: line 34, column 63
    function def_onEnter_3 (def :  pcf.WCBenefitParameterSetLV) : void {
      def.onEnter(WCBenefitParameterSet)
    }
    
    // 'def' attribute on PanelRef at WCBenefitParameterSet.pcf: line 34, column 63
    function def_refreshVariables_4 (def :  pcf.WCBenefitParameterSetLV) : void {
      def.refreshVariables(WCBenefitParameterSet)
    }
    
    // 'initialValue' attribute on Variable at WCBenefitParameterSet.pcf: line 15, column 77
    function initialValue_0 () : gw.api.database.IQueryBeanResult<WCBenefitParameterSet> {
      return gw.api.database.Query.make(entity.WCBenefitParameterSet).select()
    }
    
    // Page (id=WCBenefitParameterSet) at WCBenefitParameterSet.pcf: line 9, column 73
    static function parent_7 () : pcf.api.Destination {
      return pcf.WCParms.createDestination()
    }
    
    override property get CurrentLocation () : pcf.WCBenefitParameterSet {
      return super.CurrentLocation as pcf.WCBenefitParameterSet
    }
    
    property get WCBenefitParameterSet () : gw.api.database.IQueryBeanResult<WCBenefitParameterSet> {
      return getVariableValue("WCBenefitParameterSet", 0) as gw.api.database.IQueryBeanResult<WCBenefitParameterSet>
    }
    
    property set WCBenefitParameterSet ($arg :  gw.api.database.IQueryBeanResult<WCBenefitParameterSet>) {
      setVariableValue("WCBenefitParameterSet", 0, $arg)
    }
    
    
  }
  
  
}