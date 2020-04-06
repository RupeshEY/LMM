package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentsDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClusterComponentsDownloadConfigurePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentsDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterComponentsDownloadConfigurePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=download) at ClusterComponentsDownloadConfigurePopup.pcf: line 33, column 75
    function action_5 () : void {
      gw.api.tools.ClusterComponentsData.downloadReport(maxDaysInHistory * 24)
    }
    
    // 'value' attribute on TextInput (id=maxDays) at ClusterComponentsDownloadConfigurePopup.pcf: line 25, column 40
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      maxDaysInHistory = (__VALUE_TO_SET as java.lang.Long)
    }
    
    // 'initialValue' attribute on Variable at ClusterComponentsDownloadConfigurePopup.pcf: line 14, column 20
    function initialValue_0 () : long {
      return 1
    }
    
    // 'requestValidationExpression' attribute on TextInput (id=maxDays) at ClusterComponentsDownloadConfigurePopup.pcf: line 25, column 40
    function requestValidationExpression_2 (VALUE :  java.lang.Long) : java.lang.Object {
      return VALUE >= 0 ? null : DisplayKey.get("Validator.PositiveInteger", VALUE)
    }
    
    // 'value' attribute on TextInput (id=maxDays) at ClusterComponentsDownloadConfigurePopup.pcf: line 25, column 40
    function value_1 () : java.lang.Long {
      return maxDaysInHistory
    }
    
    override property get CurrentLocation () : pcf.ClusterComponentsDownloadConfigurePopup {
      return super.CurrentLocation as pcf.ClusterComponentsDownloadConfigurePopup
    }
    
    property get maxDaysInHistory () : long {
      return getVariableValue("maxDaysInHistory", 0) as java.lang.Long
    }
    
    property set maxDaysInHistory ($arg :  long) {
      setVariableValue("maxDaysInHistory", 0, $arg)
    }
    
    
  }
  
  
}