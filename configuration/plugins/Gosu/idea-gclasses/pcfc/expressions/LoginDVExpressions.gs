package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/login/LoginDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoginDVExpressions {
  @javax.annotation.Generated("config/web/pcf/login/LoginDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoginDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on LoginSubmitButton (id=submit) at LoginDV.pcf: line 27, column 65
    function action_8 () : void {
      LoginForm.login()
    }
    
    // 'value' attribute on TextInput (id=username) at LoginDV.pcf: line 16, column 37
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      LoginForm.Username = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on PasswordInput (id=password) at LoginDV.pcf: line 22, column 37
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      LoginForm.Password = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=username) at LoginDV.pcf: line 16, column 37
    function valueRoot_3 () : java.lang.Object {
      return LoginForm
    }
    
    // 'value' attribute on TextInput (id=username) at LoginDV.pcf: line 16, column 37
    function value_0 () : java.lang.String {
      return LoginForm.Username
    }
    
    // 'value' attribute on PasswordInput (id=password) at LoginDV.pcf: line 22, column 37
    function value_4 () : java.lang.String {
      return LoginForm.Password
    }
    
    property get LoginForm () : gw.api.util.LoginForm {
      return getRequireValue("LoginForm", 0) as gw.api.util.LoginForm
    }
    
    property set LoginForm ($arg :  gw.api.util.LoginForm) {
      setRequireValue("LoginForm", 0, $arg)
    }
    
    
  }
  
  
}