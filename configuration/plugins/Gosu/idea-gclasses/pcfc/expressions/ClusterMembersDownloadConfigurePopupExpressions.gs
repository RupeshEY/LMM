package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterMembersDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClusterMembersDownloadConfigurePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterMembersDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterMembersDownloadConfigurePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'initialValue' attribute on Variable at ClusterMembersDownloadConfigurePopup.pcf: line 16, column 47
    function initialValue_0 () : gw.api.tools.ClusterMembersData {
      return new gw.api.tools.ClusterMembersData()
    }
    
    property get ClusterMembersData () : gw.api.tools.ClusterMembersData {
      return getVariableValue("ClusterMembersData", 0) as gw.api.tools.ClusterMembersData
    }
    
    property set ClusterMembersData ($arg :  gw.api.tools.ClusterMembersData) {
      setVariableValue("ClusterMembersData", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClusterMembersDownloadConfigurePopup {
      return super.CurrentLocation as pcf.ClusterMembersDownloadConfigurePopup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterMembersDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailViewPanelExpressionsImpl extends ClusterMembersDownloadConfigurePopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=CompleteDownload) at ClusterMembersDownloadConfigurePopup.pcf: line 46, column 75
    function action_10 () : void {
      ClusterMembersData.downloadSummaryReport(IncludeHistory ? MaxHistoryRecords : 0)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeHistory) at ClusterMembersDownloadConfigurePopup.pcf: line 32, column 36
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      IncludeHistory = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=MaxHistoryRecords) at ClusterMembersDownloadConfigurePopup.pcf: line 41, column 44
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      MaxHistoryRecords = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'initialValue' attribute on Variable at ClusterMembersDownloadConfigurePopup.pcf: line 26, column 23
    function initialValue_1 () : int {
      return 100
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeHistory) at ClusterMembersDownloadConfigurePopup.pcf: line 32, column 36
    function value_2 () : java.lang.Boolean {
      return IncludeHistory
    }
    
    // 'value' attribute on TextInput (id=MaxHistoryRecords) at ClusterMembersDownloadConfigurePopup.pcf: line 41, column 44
    function value_6 () : java.lang.Integer {
      return MaxHistoryRecords
    }
    
    property get IncludeHistory () : boolean {
      return getVariableValue("IncludeHistory", 1) as java.lang.Boolean
    }
    
    property set IncludeHistory ($arg :  boolean) {
      setVariableValue("IncludeHistory", 1, $arg)
    }
    
    property get MaxHistoryRecords () : int {
      return getVariableValue("MaxHistoryRecords", 1) as java.lang.Integer
    }
    
    property set MaxHistoryRecords ($arg :  int) {
      setVariableValue("MaxHistoryRecords", 1, $arg)
    }
    
    
  }
  
  
}