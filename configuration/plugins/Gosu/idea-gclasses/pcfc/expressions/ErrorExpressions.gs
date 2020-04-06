package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/Error.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ErrorExpressions {
  @javax.annotation.Generated("config/web/pcf/util/Error.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ErrorExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Message :  String, Exception :  String, StackTrace :  String) : int {
      return 0
    }
    
    // 'label' attribute on Label at Error.pcf: line 30, column 30
    function label_0 () : java.lang.String {
      return Message
    }
    
    // 'parent' attribute on Page (id=Error) at Error.pcf: line 10, column 51
    static function parent_10 (Exception :  String, Message :  String, StackTrace :  String) : pcf.api.Destination {
      return pcf.ErrorGroup.createDestination()
    }
    
    // 'value' attribute on TextAreaInput (id=Exception) at Error.pcf: line 37, column 42
    function value_2 () : java.lang.String {
      return Exception
    }
    
    // 'value' attribute on TextAreaInput (id=StackTrace) at Error.pcf: line 46, column 43
    function value_7 () : java.lang.String {
      return StackTrace
    }
    
    // 'visible' attribute on TextAreaInput (id=Exception) at Error.pcf: line 37, column 42
    function visible_1 () : java.lang.Boolean {
      return Exception != null
    }
    
    // 'visible' attribute on InputDivider at Error.pcf: line 39, column 43
    function visible_5 () : java.lang.Boolean {
      return StackTrace != null
    }
    
    override property get CurrentLocation () : pcf.Error {
      return super.CurrentLocation as pcf.Error
    }
    
    property get Exception () : String {
      return getVariableValue("Exception", 0) as String
    }
    
    property set Exception ($arg :  String) {
      setVariableValue("Exception", 0, $arg)
    }
    
    property get Message () : String {
      return getVariableValue("Message", 0) as String
    }
    
    property set Message ($arg :  String) {
      setVariableValue("Message", 0, $arg)
    }
    
    property get StackTrace () : String {
      return getVariableValue("StackTrace", 0) as String
    }
    
    property set StackTrace ($arg :  String) {
      setVariableValue("StackTrace", 0, $arg)
    }
    
    
  }
  
  
}