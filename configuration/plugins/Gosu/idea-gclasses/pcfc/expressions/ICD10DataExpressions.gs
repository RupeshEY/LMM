package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/exitpoints/ICD10Data.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ICD10DataExpressions {
  @javax.annotation.Generated("config/web/pcf/exitpoints/ICD10Data.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICD10DataExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ICDCode :  String) : int {
      return 0
    }
    
    override property get CurrentLocation () : pcf.ICD10Data {
      return super.CurrentLocation as pcf.ICD10Data
    }
    
    property get ICDCode () : String {
      return getVariableValue("ICDCode", 0) as String
    }
    
    property set ICDCode ($arg :  String) {
      setVariableValue("ICDCode", 0, $arg)
    }
    
    
  }
  
  
}