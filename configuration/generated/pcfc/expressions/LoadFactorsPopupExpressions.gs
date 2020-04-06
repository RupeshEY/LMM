package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadFactorsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupCell (id=GroupName) at GroupWidget.xml: line 10, column 49
    function action_3 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupCell (id=GroupName) at GroupWidget.xml: line 13, column 49
    function action_5 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupCell (id=GroupName) at GroupWidget.xml: line 10, column 49
    function action_dest_4 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupCell (id=GroupName) at GroupWidget.xml: line 13, column 49
    function action_dest_6 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'valueRange' attribute on GroupCell (id=GroupName) at GroupWidget.xml: line 7, column 52
    function valueRange_8 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'value' attribute on GroupCell (id=GroupName) at LoadFactorsPopup.pcf: line 37, column 32
    function value_2 () : entity.Group {
      return Group
    }
    
    // 'valueRange' attribute on GroupCell (id=GroupName) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_9 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=GroupName) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_9 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=GroupName) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupCell (id=GroupName) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_10 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    property get Group () : entity.Group {
      return getIteratedValue(2) as entity.Group
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends LoadFactorsPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at LoadFactorsPopup.pcf: line 47, column 70
    function def_onEnter_16 (def :  pcf.LoadFactorDV) : void {
      def.onEnter(SelectedGroup)
    }
    
    // 'def' attribute on PanelRef at LoadFactorsPopup.pcf: line 47, column 70
    function def_refreshVariables_17 (def :  pcf.LoadFactorDV) : void {
      def.refreshVariables(SelectedGroup)
    }
    
    // EditButtons at LoadFactorsPopup.pcf: line 50, column 31
    function label_13 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'sortBy' attribute on RowIterator at LoadFactorsPopup.pcf: line 37, column 32
    function sortValue_1 (Group :  entity.Group) : java.lang.Object {
      return Group.Name
    }
    
    // 'title' attribute on Card (id=GroupDetailsCard) at LoadFactorsPopup.pcf: line 44, column 108
    function title_18 () : java.lang.String {
      return DisplayKey.get("Web.LoadAndVacation.GroupDetails.Title", SelectedGroup.Name)
    }
    
    // 'value' attribute on RowIterator at LoadFactorsPopup.pcf: line 31, column 78
    function value_12 () : gw.api.database.IQueryBeanResult<entity.Group> {
      return LoadFactorGroupList
    }
    
    // 'visible' attribute on Toolbar (id=LoadFactorDV_tb) at LoadFactorsPopup.pcf: line 49, column 71
    function visible_14 () : java.lang.Boolean {
      return perm.Group.manageloadfactors(SelectedGroup)
    }
    
    property get SelectedGroup () : Group {
      return getCurrentSelection(1) as Group
    }
    
    property set SelectedGroup ($arg :  Group) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadFactorsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=LoadFactorsPopup) at LoadFactorsPopup.pcf: line 10, column 61
    static function canVisit_19 () : java.lang.Boolean {
      return perm.Group.viewloadfactors
    }
    
    // 'initialValue' attribute on Variable at LoadFactorsPopup.pcf: line 15, column 61
    function initialValue_0 () : gw.api.database.IQueryBeanResult<Group> {
      return findLoadFactorGroupList()
    }
    
    // 'parent' attribute on Popup (id=LoadFactorsPopup) at LoadFactorsPopup.pcf: line 10, column 61
    static function parent_20 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    override property get CurrentLocation () : pcf.LoadFactorsPopup {
      return super.CurrentLocation as pcf.LoadFactorsPopup
    }
    
    property get LoadFactorGroupList () : gw.api.database.IQueryBeanResult<Group> {
      return getVariableValue("LoadFactorGroupList", 0) as gw.api.database.IQueryBeanResult<Group>
    }
    
    property set LoadFactorGroupList ($arg :  gw.api.database.IQueryBeanResult<Group>) {
      setVariableValue("LoadFactorGroupList", 0, $arg)
    }
    
    
          function findLoadFactorGroupList() : gw.api.database.IQueryBeanResult<Group> {
            return Group.finder.findLoadFactorGroupsByUser(User.util.CurrentUser) as gw.api.database.IQueryBeanResult<Group>;
          }
        
    
    
  }
  
  
}