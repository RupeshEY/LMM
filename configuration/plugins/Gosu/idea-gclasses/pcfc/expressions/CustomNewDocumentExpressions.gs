package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/exitpoints/CustomNewDocument.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CustomNewDocumentExpressions {
  @javax.annotation.Generated("config/web/pcf/exitpoints/CustomNewDocument.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomNewDocumentExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (ClaimID :  String, Option :  java.lang.Double) : int {
      return 1
    }
    
    property get ClaimID () : String {
      return getVariableValue("ClaimID", 0) as String
    }
    
    property set ClaimID ($arg :  String) {
      setVariableValue("ClaimID", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.CustomNewDocument {
      return super.CurrentLocation as pcf.CustomNewDocument
    }
    
    property get Option () : java.lang.Double {
      return getVariableValue("Option", 0) as java.lang.Double
    }
    
    property set Option ($arg :  java.lang.Double) {
      setVariableValue("Option", 0, $arg)
    }
    
    
  }
  
  
}