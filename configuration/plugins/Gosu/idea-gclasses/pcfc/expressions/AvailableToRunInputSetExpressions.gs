package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/AvailableToRunInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AvailableToRunInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/AvailableToRunInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AvailableToRunInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Value) at AvailableToRunInputSet.pcf: line 14, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      version.Rule.AvailableToRun = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Value) at AvailableToRunInputSet.pcf: line 14, column 43
    function valueRoot_3 () : java.lang.Object {
      return version.Rule
    }
    
    // 'value' attribute on BooleanRadioInput (id=Value) at AvailableToRunInputSet.pcf: line 14, column 43
    function value_0 () : java.lang.Boolean {
      return version.Rule.AvailableToRun
    }
    
    // 'value' attribute on TextInput (id=Note) at AvailableToRunInputSet.pcf: line 20, column 45
    function value_5 () : java.lang.String {
      return version.Rule.AvailableToRun ? DisplayKey.get('BizRules.RuleDetailsPage.AvailableToRun.Note.WillRun') : DisplayKey.get('BizRules.RuleDetailsPage.AvailableToRun.Note.WillNotRun')
    }
    
    // 'visible' attribute on TextInput (id=Note) at AvailableToRunInputSet.pcf: line 20, column 45
    function visible_4 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    property get version () : RuleVersion {
      return getRequireValue("version", 0) as RuleVersion
    }
    
    property set version ($arg :  RuleVersion) {
      setRequireValue("version", 0, $arg)
    }
    
    
  }
  
  
}