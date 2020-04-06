package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClassCodeInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClassCodeInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClassCodeInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClassCodeInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=Comments) at ClassCodeInputSet.pcf: line 26, column 35
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      classCode.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Code) at ClassCodeInputSet.pcf: line 14, column 31
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      classCode.Code = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClassCodeInputSet.pcf: line 20, column 38
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      classCode.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Code) at ClassCodeInputSet.pcf: line 14, column 31
    function valueRoot_3 () : java.lang.Object {
      return classCode
    }
    
    // 'value' attribute on TextInput (id=Code) at ClassCodeInputSet.pcf: line 14, column 31
    function value_0 () : java.lang.String {
      return classCode.Code
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClassCodeInputSet.pcf: line 20, column 38
    function value_4 () : java.lang.String {
      return classCode.Description
    }
    
    // 'value' attribute on TextAreaInput (id=Comments) at ClassCodeInputSet.pcf: line 26, column 35
    function value_8 () : java.lang.String {
      return classCode.Comments
    }
    
    property get classCode () : ClassCode {
      return getRequireValue("classCode", 0) as ClassCode
    }
    
    property set classCode ($arg :  ClassCode) {
      setRequireValue("classCode", 0, $arg)
    }
    
    
  }
  
  
}