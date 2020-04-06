package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ReportView.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReportViewExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ReportView.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportViewExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (name :  String, subPath :  String) : int {
      return 0
    }
    
    // 'defaultValue' attribute on ExitPointParameter at ReportView.pcf: line 15, column 27
    function initialValue_0 () : String {
      return com.guidewire.pl.system.dependency.PLDependencies.WebController.BaseURL
    }
    
    override property get CurrentLocation () : pcf.ReportView {
      return super.CurrentLocation as pcf.ReportView
    }
    
    property get baseURL () : String {
      return getVariableValue("baseURL", 0) as String
    }
    
    property set baseURL ($arg :  String) {
      setVariableValue("baseURL", 0, $arg)
    }
    
    property get name () : String {
      return getVariableValue("name", 0) as String
    }
    
    property set name ($arg :  String) {
      setVariableValue("name", 0, $arg)
    }
    
    property get subPath () : String {
      return getVariableValue("subPath", 0) as String
    }
    
    property set subPath ($arg :  String) {
      setVariableValue("subPath", 0, $arg)
    }
    
    
  }
  
  
}