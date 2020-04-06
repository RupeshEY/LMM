package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/Login.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoginExpressions {
  @javax.annotation.Generated("config/web/pcf/util/Login.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoginExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (target :  pcf.api.Destination, entryException :  java.lang.Exception) : int {
      return 0
    }
    
    // 'afterEnter' attribute on LoginPage (id=Login) at Login.pcf: line 12, column 26
    function afterEnter_4 () : void {
      loginForm.checkDirectHTTPLogin()
    }
    
    // 'def' attribute on PanelRef at Login.pcf: line 30, column 35
    function def_onEnter_2 (def :  pcf.LoginDV) : void {
      def.onEnter(loginForm)
    }
    
    // 'def' attribute on PanelRef at Login.pcf: line 30, column 35
    function def_refreshVariables_3 (def :  pcf.LoginDV) : void {
      def.refreshVariables(loginForm)
    }
    
    // 'initialValue' attribute on Variable at Login.pcf: line 24, column 37
    function initialValue_0 () : gw.api.util.LoginForm {
      return new gw.api.util.LoginForm(target, entryException)
    }
    
    // 'label' attribute on Verbatim at Login.pcf: line 28, column 36
    function label_1 () : java.lang.String {
      return loginForm.Message
    }
    
    override property get CurrentLocation () : pcf.Login {
      return super.CurrentLocation as pcf.Login
    }
    
    property get entryException () : java.lang.Exception {
      return getVariableValue("entryException", 0) as java.lang.Exception
    }
    
    property set entryException ($arg :  java.lang.Exception) {
      setVariableValue("entryException", 0, $arg)
    }
    
    property get loginForm () : gw.api.util.LoginForm {
      return getVariableValue("loginForm", 0) as gw.api.util.LoginForm
    }
    
    property set loginForm ($arg :  gw.api.util.LoginForm) {
      setVariableValue("loginForm", 0, $arg)
    }
    
    property get target () : pcf.api.Destination {
      return getVariableValue("target", 0) as pcf.api.Destination
    }
    
    property set target ($arg :  pcf.api.Destination) {
      setVariableValue("target", 0, $arg)
    }
    
    
  }
  
  
}