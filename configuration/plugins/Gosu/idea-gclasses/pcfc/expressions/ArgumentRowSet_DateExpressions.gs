package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/ArgumentRowSet.Date.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArgumentRowSet_DateExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/ArgumentRowSet.Date.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArgumentRowSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=ArgValue) at ArgumentRowSet.Date.pcf: line 18, column 32
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      arg.DateValue = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextCell (id=ArgName) at ArgumentRowSet.Date.pcf: line 14, column 27
    function valueRoot_2 () : java.lang.Object {
      return arg
    }
    
    // 'value' attribute on TextCell (id=ArgName) at ArgumentRowSet.Date.pcf: line 14, column 27
    function value_0 () : java.lang.String {
      return arg.Name
    }
    
    // 'value' attribute on DateCell (id=ArgValue) at ArgumentRowSet.Date.pcf: line 18, column 32
    function value_3 () : java.util.Date {
      return arg.DateValue
    }
    
    property get arg () : com.guidewire.pl.quickjump.Argument {
      return getRequireValue("arg", 0) as com.guidewire.pl.quickjump.Argument
    }
    
    property set arg ($arg :  com.guidewire.pl.quickjump.Argument) {
      setRequireValue("arg", 0, $arg)
    }
    
    
  }
  
  
}