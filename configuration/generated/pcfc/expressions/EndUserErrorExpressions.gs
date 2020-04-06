package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/EndUserError.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EndUserErrorExpressions {
  @javax.annotation.Generated("config/web/pcf/util/EndUserError.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndUserErrorExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Message :  String) : int {
      return 0
    }
    
    // 'label' attribute on Verbatim at EndUserError.pcf: line 20, column 26
    function label_0 () : java.lang.String {
      return Message
    }
    
    // 'parent' attribute on Page (id=EndUserError) at EndUserError.pcf: line 10, column 68
    static function parent_1 (Message :  String) : pcf.api.Destination {
      return pcf.ErrorGroup.createDestination()
    }
    
    override property get CurrentLocation () : pcf.EndUserError {
      return super.CurrentLocation as pcf.EndUserError
    }
    
    property get Message () : String {
      return getVariableValue("Message", 0) as String
    }
    
    property set Message ($arg :  String) {
      setVariableValue("Message", 0, $arg)
    }
    
    
  }
  
  
}