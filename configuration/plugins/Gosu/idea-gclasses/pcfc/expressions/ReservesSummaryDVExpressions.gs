package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/ReservesSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReservesSummaryDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/ReservesSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReservesSummaryDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at ReservesSummaryDV.pcf: line 26, column 27
    function def_onEnter_3 (def :  pcf.EditableReservesLV) : void {
      def.onEnter(NewReserveSet,Exposure, addNew)
    }
    
    // 'def' attribute on ListViewInput at ReservesSummaryDV.pcf: line 41, column 40
    function def_onEnter_6 (def :  pcf.ReserveSetDocumentsLV) : void {
      def.onEnter(NewReserveSet)
    }
    
    // 'def' attribute on ListViewInput at ReservesSummaryDV.pcf: line 26, column 27
    function def_refreshVariables_4 (def :  pcf.EditableReservesLV) : void {
      def.refreshVariables(NewReserveSet,Exposure, addNew)
    }
    
    // 'def' attribute on ListViewInput at ReservesSummaryDV.pcf: line 41, column 40
    function def_refreshVariables_7 (def :  pcf.ReserveSetDocumentsLV) : void {
      def.refreshVariables(NewReserveSet)
    }
    
    // 'value' attribute on TextValue (id=filterText) at ReservesSummaryDV.pcf: line 31, column 43
    function valueRoot_2 () : java.lang.Object {
      return NewReserveSet
    }
    
    // 'value' attribute on ToolbarInput (id=filterText) at ReservesSummaryDV.pcf: line 31, column 43
    function value_0 () : java.lang.String {
      return NewReserveSet.FilterText
    }
    
    // 'visible' attribute on ListViewInput at ReservesSummaryDV.pcf: line 41, column 40
    function visible_5 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get NewReserveSet () : gw.api.financials.ReserveWizardHelper {
      return getRequireValue("NewReserveSet", 0) as gw.api.financials.ReserveWizardHelper
    }
    
    property set NewReserveSet ($arg :  gw.api.financials.ReserveWizardHelper) {
      setRequireValue("NewReserveSet", 0, $arg)
    }
    
    property get addNew () : Boolean {
      return getRequireValue("addNew", 0) as Boolean
    }
    
    property set addNew ($arg :  Boolean) {
      setRequireValue("addNew", 0, $arg)
    }
    
    
  }
  
  
}