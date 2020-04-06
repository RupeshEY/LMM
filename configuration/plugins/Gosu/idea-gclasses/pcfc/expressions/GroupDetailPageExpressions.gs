package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/GroupDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupDetailPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/GroupDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupDetailPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Group :  Group) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=GroupDetailPage) at GroupDetailPage.pcf: line 10, column 82
    function canEdit_21 () : java.lang.Boolean {
      return perm.Group.edit
    }
    
    // 'canVisit' attribute on Page (id=GroupDetailPage) at GroupDetailPage.pcf: line 10, column 82
    static function canVisit_22 (Group :  Group) : java.lang.Boolean {
      return perm.Group.view
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=GroupDetailDV_ClearBackupUserButton) at GroupDetailPage.pcf: line 52, column 96
    function checkedRowAction_6 (element :  entity.GroupUser, CheckedValue :  entity.GroupUser) : void {
      CheckedValue.User.BackupUser = null
    }
    
    // 'def' attribute on PanelRef at GroupDetailPage.pcf: line 73, column 276
    function def_onEnter_15 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(Group, { "Name" }, { (gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP) ? DisplayKey.get("Web.Admin.GroupDetail.BasicDV.NamePhonetic") : DisplayKey.get("Web.Admin.GroupDetail.BasicDV.Name") })
    }
    
    // 'def' attribute on PanelRef at GroupDetailPage.pcf: line 80, column 40
    function def_onEnter_17 (def :  pcf.GroupQueuesDV) : void {
      def.onEnter(Group)
    }
    
    // 'def' attribute on PanelRef at GroupDetailPage.pcf: line 89, column 40
    function def_onEnter_19 (def :  pcf.GroupRegionLV) : void {
      def.onEnter(Group)
    }
    
    // 'def' attribute on PanelRef at GroupDetailPage.pcf: line 36, column 41
    function def_onEnter_4 (def :  pcf.GroupDetailDV) : void {
      def.onEnter(Group)
    }
    
    // 'def' attribute on ListViewInput at GroupDetailPage.pcf: line 43, column 35
    function def_onEnter_7 (def :  pcf.GroupUsersLV) : void {
      def.onEnter(Group)
    }
    
    // 'def' attribute on PanelRef at GroupDetailPage.pcf: line 73, column 276
    function def_refreshVariables_16 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(Group, { "Name" }, { (gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP) ? DisplayKey.get("Web.Admin.GroupDetail.BasicDV.NamePhonetic") : DisplayKey.get("Web.Admin.GroupDetail.BasicDV.Name") })
    }
    
    // 'def' attribute on PanelRef at GroupDetailPage.pcf: line 80, column 40
    function def_refreshVariables_18 (def :  pcf.GroupQueuesDV) : void {
      def.refreshVariables(Group)
    }
    
    // 'def' attribute on PanelRef at GroupDetailPage.pcf: line 89, column 40
    function def_refreshVariables_20 (def :  pcf.GroupRegionLV) : void {
      def.refreshVariables(Group)
    }
    
    // 'def' attribute on PanelRef at GroupDetailPage.pcf: line 36, column 41
    function def_refreshVariables_5 (def :  pcf.GroupDetailDV) : void {
      def.refreshVariables(Group)
    }
    
    // 'def' attribute on ListViewInput at GroupDetailPage.pcf: line 43, column 35
    function def_refreshVariables_8 (def :  pcf.GroupUsersLV) : void {
      def.refreshVariables(Group)
    }
    
    // 'value' attribute on TextInput (id=LoadFactor) at GroupDetailPage.pcf: line 69, column 48
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.LoadFactor = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'initialValue' attribute on Variable at GroupDetailPage.pcf: line 19, column 21
    function initialValue_0 () : Group {
      return Group
    }
    
    // 'initialValue' attribute on Variable at GroupDetailPage.pcf: line 23, column 71
    function initialValue_1 () : gw.api.database.IQueryBeanResult<AssignableQueue> {
      return AssignableQueue.finder.findVisibleQueuesForUser(User.util.CurrentUser) as gw.api.database.IQueryBeanResult<AssignableQueue>
    }
    
    // 'parent' attribute on Page (id=GroupDetailPage) at GroupDetailPage.pcf: line 10, column 82
    static function parent_23 (Group :  Group) : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    // 'title' attribute on Page (id=GroupDetailPage) at GroupDetailPage.pcf: line 10, column 82
    static function title_24 (Group :  Group) : java.lang.Object {
      return DisplayKey.get("Web.Admin.GroupDetail", Group.DisplayName)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at GroupDetailPage.pcf: line 28, column 66
    function toolbarButtonSet_onEnter_2 (def :  pcf.GroupDetailToolbarButtonSet) : void {
      def.onEnter(Group)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at GroupDetailPage.pcf: line 28, column 66
    function toolbarButtonSet_refreshVariables_3 (def :  pcf.GroupDetailToolbarButtonSet) : void {
      def.refreshVariables(Group)
    }
    
    // 'validationExpression' attribute on TextInput (id=LoadFactor) at GroupDetailPage.pcf: line 69, column 48
    function validationExpression_9 () : java.lang.Object {
      return !(Group.LoadFactor < 0 or Group.LoadFactor > 100) ? null : DisplayKey.get("NVV.Admin.GroupBasics.AdminGroupDetails.Assignment.LoadFactor.OutOfRange")
    }
    
    // 'value' attribute on TextInput (id=LoadFactor) at GroupDetailPage.pcf: line 69, column 48
    function valueRoot_14 () : java.lang.Object {
      return Group
    }
    
    // 'value' attribute on TextInput (id=LoadFactor) at GroupDetailPage.pcf: line 69, column 48
    function value_10 () : java.lang.Integer {
      return Group.LoadFactor
    }
    
    property get AssignableQueues () : gw.api.database.IQueryBeanResult<AssignableQueue> {
      return getVariableValue("AssignableQueues", 0) as gw.api.database.IQueryBeanResult<AssignableQueue>
    }
    
    property set AssignableQueues ($arg :  gw.api.database.IQueryBeanResult<AssignableQueue>) {
      setVariableValue("AssignableQueues", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.GroupDetailPage {
      return super.CurrentLocation as pcf.GroupDetailPage
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    property get Parent () : Group {
      return getVariableValue("Parent", 0) as Group
    }
    
    property set Parent ($arg :  Group) {
      setVariableValue("Parent", 0, $arg)
    }
    
    
  }
  
  
}