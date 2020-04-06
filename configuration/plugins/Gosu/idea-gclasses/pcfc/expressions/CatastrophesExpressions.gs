package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/Catastrophes.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastrophesExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/Catastrophes.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastrophesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Catastrophes_AddCatastropheButton) at Catastrophes.pcf: line 20, column 25
    function action_1 () : void {
      ECFNewCatastrophePopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=Catastrophes_AddCatastropheButton) at Catastrophes.pcf: line 20, column 25
    function action_dest_2 () : pcf.api.Destination {
      return pcf.ECFNewCatastrophePopup.createDestination()
    }
    
    // 'canVisit' attribute on Page (id=Catastrophes) at Catastrophes.pcf: line 8, column 64
    static function canVisit_9 () : java.lang.Boolean {
      return perm.Catastrophe.view
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=Catastrophes_DeactivateButton) at Catastrophes.pcf: line 27, column 44
    function checkedRowAction_4 (element :  entity.Catastrophe, CheckedValue :  entity.Catastrophe) : void {
      CheckedValue.Active = false
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=Catastrophes_ActivateButton) at Catastrophes.pcf: line 35, column 44
    function checkedRowAction_6 (element :  entity.Catastrophe, CheckedValue :  entity.Catastrophe) : void {
      CheckedValue.Active = true
    }
    
    // 'def' attribute on PanelRef at Catastrophes.pcf: line 38, column 49
    function def_onEnter_7 (def :  pcf.CatastropheAdminLV) : void {
      def.onEnter(Catastrophes)
    }
    
    // 'def' attribute on PanelRef at Catastrophes.pcf: line 38, column 49
    function def_refreshVariables_8 (def :  pcf.CatastropheAdminLV) : void {
      def.refreshVariables(Catastrophes)
    }
    
    // 'initialValue' attribute on Variable at Catastrophes.pcf: line 12, column 67
    function initialValue_0 () : gw.api.database.IQueryBeanResult<Catastrophe> {
      return gw.api.database.Query.make(entity.Catastrophe).select()
    }
    
    // Page (id=Catastrophes) at Catastrophes.pcf: line 8, column 64
    static function parent_10 () : pcf.api.Destination {
      return pcf.BusinessSettings.createDestination()
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=Catastrophes_DeactivateButton) at Catastrophes.pcf: line 27, column 44
    function visible_3 () : java.lang.Boolean {
      return perm.Catastrophe.edit
    }
    
    property get Catastrophes () : gw.api.database.IQueryBeanResult<Catastrophe> {
      return getVariableValue("Catastrophes", 0) as gw.api.database.IQueryBeanResult<Catastrophe>
    }
    
    property set Catastrophes ($arg :  gw.api.database.IQueryBeanResult<Catastrophe>) {
      setVariableValue("Catastrophes", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.Catastrophes {
      return super.CurrentLocation as pcf.Catastrophes
    }
    
    
  }
  
  
}