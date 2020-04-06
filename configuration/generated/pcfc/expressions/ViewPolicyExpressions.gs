package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/exitpoints/ViewPolicy.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ViewPolicyExpressions {
  @javax.annotation.Generated("config/web/pcf/exitpoints/ViewPolicy.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewPolicyExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (policySystemURL :  String, policyNumber :  String, lossDate :  java.util.Date) : int {
      return 0
    }
    
    override property get CurrentLocation () : pcf.ViewPolicy {
      return super.CurrentLocation as pcf.ViewPolicy
    }
    
    property get lossDate () : java.util.Date {
      return getVariableValue("lossDate", 0) as java.util.Date
    }
    
    property set lossDate ($arg :  java.util.Date) {
      setVariableValue("lossDate", 0, $arg)
    }
    
    property get policyNumber () : String {
      return getVariableValue("policyNumber", 0) as String
    }
    
    property set policyNumber ($arg :  String) {
      setVariableValue("policyNumber", 0, $arg)
    }
    
    property get policySystemURL () : String {
      return getVariableValue("policySystemURL", 0) as String
    }
    
    property set policySystemURL ($arg :  String) {
      setVariableValue("policySystemURL", 0, $arg)
    }
    
    
  }
  
  
}