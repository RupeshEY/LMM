package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/MBean.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MBeanExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/MBean.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MBeanExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=doit) at MBean.pcf: line 75, column 44
    function action_10 () : void {
      GWMBeansData.executeBeanOperation(GWMBean, operation)
    }
    
    // 'value' attribute on TextCell (id=operation) at MBean.pcf: line 66, column 30
    function valueRoot_9 () : java.lang.Object {
      return operation
    }
    
    // 'value' attribute on TextCell (id=Value) at MBean.pcf: line 82, column 47
    function value_11 () : java.lang.Object {
      return GWMBeansData.getBeanOperationResult(operation)
    }
    
    // 'value' attribute on TextCell (id=operation) at MBean.pcf: line 66, column 30
    function value_7 () : java.lang.String {
      return operation.Name
    }
    
    property get operation () : gw.plugin.management.OperationInfo {
      return getIteratedValue(1) as gw.plugin.management.OperationInfo
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/MBean.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MBeanExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (BeanCategory :  String, GWMBeansData :  gw.api.tools.MBeansData, GWMBeanName :  String) : int {
      return 0
    }
    
    static function __constructorIndex (BeanCategory :  String, GWMBeansData :  gw.api.tools.MBeansData, GWMBeanName :  String, Result :  String) : int {
      return 1
    }
    
    // 'action' attribute on ToolbarButton (id=MBean_BackButton) at MBean.pcf: line 41, column 77
    function action_1 () : void {
      MBeans.go(Result)
    }
    
    // 'action' attribute on ToolbarButton (id=MBean_BackButton) at MBean.pcf: line 41, column 77
    function action_dest_2 () : pcf.api.Destination {
      return pcf.MBeans.createDestination(Result)
    }
    
    // 'canVisit' attribute on Page (id=MBean) at MBean.pcf: line 13, column 71
    static function canVisit_19 (BeanCategory :  String, GWMBeanName :  String, GWMBeansData :  gw.api.tools.MBeansData, Result :  String) : java.lang.Boolean {
      return perm.User.EditMBeans or perm.User.DevAllAccess
    }
    
    // 'def' attribute on PanelRef at MBean.pcf: line 89, column 61
    function def_onEnter_17 (def :  pcf.MBeanLV) : void {
      def.onEnter(BeanCategory, GWMBeansData, GWMBeanName)
    }
    
    // 'def' attribute on PanelRef at MBean.pcf: line 89, column 61
    function def_refreshVariables_18 (def :  pcf.MBeanLV) : void {
      def.refreshVariables(BeanCategory, GWMBeansData, GWMBeanName)
    }
    
    // 'initialValue' attribute on Variable at MBean.pcf: line 34, column 44
    function initialValue_0 () : gw.plugin.management.GWMBean {
      return GWMBeansData.getBeanByName(GWMBeanName)
    }
    
    // 'label' attribute on Verbatim at MBean.pcf: line 44, column 25
    function label_3 () : java.lang.String {
      return Result
    }
    
    // 'label' attribute on Verbatim at MBean.pcf: line 46, column 30
    function label_4 () : java.lang.String {
      return GWMBeanName
    }
    
    // 'parent' attribute on Page (id=MBean) at MBean.pcf: line 13, column 71
    static function parent_20 (BeanCategory :  String, GWMBeanName :  String, GWMBeansData :  gw.api.tools.MBeansData, Result :  String) : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    // 'sortBy' attribute on IteratorSort at MBean.pcf: line 60, column 30
    function sortBy_5 (operation :  gw.plugin.management.OperationInfo) : java.lang.Object {
      return operation.Name
    }
    
    // 'value' attribute on RowIterator at MBean.pcf: line 66, column 30
    function sortValue_6 (operation :  gw.plugin.management.OperationInfo) : java.lang.Object {
      return operation.Name
    }
    
    // 'validationExpression' attribute on ListViewPanel (id=MBeanOperationsLV) at MBean.pcf: line 51, column 75
    function validationExpression_14 () : java.lang.Object {
      return GWMBean.MBeanInfo.Operations.HasElements
    }
    
    // 'value' attribute on RowIterator at MBean.pcf: line 57, column 82
    function value_13 () : java.util.List<gw.plugin.management.OperationInfo> {
      return GWMBean.MBeanInfo.Operations
    }
    
    // 'visible' attribute on PanelRef at MBean.pcf: line 48, column 60
    function visible_15 () : java.lang.Boolean {
      return GWMBean.MBeanInfo.Operations.HasElements
    }
    
    // 'visible' attribute on PanelRef at MBean.pcf: line 89, column 61
    function visible_16 () : java.lang.Boolean {
      return GWMBean.MBeanInfo.Attributes.HasElements
    }
    
    property get BeanCategory () : String {
      return getVariableValue("BeanCategory", 0) as String
    }
    
    property set BeanCategory ($arg :  String) {
      setVariableValue("BeanCategory", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.MBean {
      return super.CurrentLocation as pcf.MBean
    }
    
    property get GWMBean () : gw.plugin.management.GWMBean {
      return getVariableValue("GWMBean", 0) as gw.plugin.management.GWMBean
    }
    
    property set GWMBean ($arg :  gw.plugin.management.GWMBean) {
      setVariableValue("GWMBean", 0, $arg)
    }
    
    property get GWMBeanName () : String {
      return getVariableValue("GWMBeanName", 0) as String
    }
    
    property set GWMBeanName ($arg :  String) {
      setVariableValue("GWMBeanName", 0, $arg)
    }
    
    property get GWMBeansData () : gw.api.tools.MBeansData {
      return getVariableValue("GWMBeansData", 0) as gw.api.tools.MBeansData
    }
    
    property set GWMBeansData ($arg :  gw.api.tools.MBeansData) {
      setVariableValue("GWMBeansData", 0, $arg)
    }
    
    property get Result () : String {
      return getVariableValue("Result", 0) as String
    }
    
    property set Result ($arg :  String) {
      setVariableValue("Result", 0, $arg)
    }
    
    
  }
  
  
}