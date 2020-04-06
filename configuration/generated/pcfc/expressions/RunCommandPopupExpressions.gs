package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/RunCommandPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RunCommandPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/RunCommandPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RunCommandPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on RowSetRef at RunCommandPopup.pcf: line 37, column 126
    function def_onEnter_0 (def :  pcf.ArgumentRowSet_Date) : void {
      def.onEnter(arg)
    }
    
    // 'def' attribute on RowSetRef at RunCommandPopup.pcf: line 37, column 126
    function def_onEnter_2 (def :  pcf.ArgumentRowSet_Generic) : void {
      def.onEnter(arg)
    }
    
    // 'def' attribute on RowSetRef at RunCommandPopup.pcf: line 37, column 126
    function def_onEnter_4 (def :  pcf.ArgumentRowSet_String) : void {
      def.onEnter(arg)
    }
    
    // 'def' attribute on RowSetRef at RunCommandPopup.pcf: line 37, column 126
    function def_refreshVariables_1 (def :  pcf.ArgumentRowSet_Date) : void {
      def.refreshVariables(arg)
    }
    
    // 'def' attribute on RowSetRef at RunCommandPopup.pcf: line 37, column 126
    function def_refreshVariables_3 (def :  pcf.ArgumentRowSet_Generic) : void {
      def.refreshVariables(arg)
    }
    
    // 'def' attribute on RowSetRef at RunCommandPopup.pcf: line 37, column 126
    function def_refreshVariables_5 (def :  pcf.ArgumentRowSet_String) : void {
      def.refreshVariables(arg)
    }
    
    // 'mode' attribute on RowSetRef at RunCommandPopup.pcf: line 37, column 126
    function mode_6 () : java.lang.Object {
      return arg.IsDate ? "Date" : (arg.Suggestions.HasElements ? "String" : "Generic")
    }
    
    property get arg () : com.guidewire.pl.quickjump.Argument<java.lang.Object> {
      return getIteratedValue(1) as com.guidewire.pl.quickjump.Argument<java.lang.Object>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/RunCommandPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RunCommandPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (command :  com.guidewire.pl.quickjump.BaseCommand, methodInfo :  gw.lang.reflect.IMethodInfo) : int {
      return 0
    }
    
    // 'afterCommit' attribute on Popup (id=RunCommandPopup) at RunCommandPopup.pcf: line 11, column 59
    function afterCommit_8 (TopLocation :  pcf.api.Location) : void {
      methodInfo.CallHandler.handleCall( command, new Object[0] )
    }
    
    // 'title' attribute on Popup (id=RunCommandPopup) at RunCommandPopup.pcf: line 11, column 59
    static function title_9 (command :  com.guidewire.pl.quickjump.BaseCommand, methodInfo :  gw.lang.reflect.IMethodInfo) : java.lang.Object {
      return "Parameters for " + methodInfo.Name
    }
    
    // 'value' attribute on RowIterator at RunCommandPopup.pcf: line 34, column 105
    function value_7 () : java.util.List<com.guidewire.pl.quickjump.Argument<java.lang.Object>> {
      return command.Arguments
    }
    
    override property get CurrentLocation () : pcf.RunCommandPopup {
      return super.CurrentLocation as pcf.RunCommandPopup
    }
    
    property get command () : com.guidewire.pl.quickjump.BaseCommand {
      return getVariableValue("command", 0) as com.guidewire.pl.quickjump.BaseCommand
    }
    
    property set command ($arg :  com.guidewire.pl.quickjump.BaseCommand) {
      setVariableValue("command", 0, $arg)
    }
    
    property get methodInfo () : gw.lang.reflect.IMethodInfo {
      return getVariableValue("methodInfo", 0) as gw.lang.reflect.IMethodInfo
    }
    
    property set methodInfo ($arg :  gw.lang.reflect.IMethodInfo) {
      setVariableValue("methodInfo", 0, $arg)
    }
    
    
  }
  
  
}