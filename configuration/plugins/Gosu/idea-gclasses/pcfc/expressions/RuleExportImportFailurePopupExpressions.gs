package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleExportImportFailurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleExportImportFailurePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleExportImportFailurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleExportImportFailurePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (reason :  String) : int {
      return 0
    }
    
    // 'initialValue' attribute on Variable at RuleExportImportFailurePopup.pcf: line 16, column 22
    function initialValue_0 () : String {
      return new com.google.common.io.LineReader(new java.io.StringReader(reason)).readLine()
    }
    
    // 'value' attribute on TextInput (id=Message) at RuleExportImportFailurePopup.pcf: line 23, column 30
    function value_1 () : java.lang.String {
      return message
    }
    
    override property get CurrentLocation () : pcf.RuleExportImportFailurePopup {
      return super.CurrentLocation as pcf.RuleExportImportFailurePopup
    }
    
    property get message () : String {
      return getVariableValue("message", 0) as String
    }
    
    property set message ($arg :  String) {
      setVariableValue("message", 0, $arg)
    }
    
    property get reason () : java.lang.String {
      return getVariableValue("reason", 0) as java.lang.String
    }
    
    property set reason ($arg :  java.lang.String) {
      setVariableValue("reason", 0, $arg)
    }
    
    
  }
  
  
}