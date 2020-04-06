package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ValidationErrorsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ValidationErrorsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ValidationErrorsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ValidationErrorsInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'labelAbove' attribute on TextInput (id=ValidationError) at ValidationErrorsInputSet.pcf: line 49, column 24
    function labelAbove_8 () : java.lang.Boolean {
      return labelAbove
    }
    
    // 'value' attribute on TextInput (id=ValidationError) at ValidationErrorsInputSet.pcf: line 49, column 24
    function value_6 () : java.lang.String {
      return error
    }
    
    property get error () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/ValidationErrorsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationErrorsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ValidationErrorsInputSet.pcf: line 17, column 61
    function initialValue_0 () : java.lang.String {
      return errors.HasElements ? errors[0] : null
    }
    
    // 'initialValue' attribute on Variable at ValidationErrorsInputSet.pcf: line 22, column 110
    function initialValue_1 () : java.lang.String[] {
      return errors.length < 2 ? {} : errors.fastList().subList(1, errors.length).toTypedArray()
    }
    
    // 'labelAbove' attribute on ContentInput at ValidationErrorsInputSet.pcf: line 26, column 36
    function labelAbove_5 () : java.lang.Boolean {
      return labelAbove
    }
    
    // 'label' attribute on Link (id=Label) at ValidationErrorsInputSet.pcf: line 38, column 29
    function label_2 () : java.lang.Object {
      return firstError
    }
    
    // 'value' attribute on InputIterator at ValidationErrorsInputSet.pcf: line 44, column 38
    function value_9 () : java.lang.String[] {
      return otherErrors
    }
    
    // 'visible' attribute on ContentInput at ValidationErrorsInputSet.pcf: line 52, column 72
    function visible_10 () : java.lang.Boolean {
      return firstError != null && !otherErrors.HasElements
    }
    
    // 'visible' attribute on ContentInput at ValidationErrorsInputSet.pcf: line 26, column 36
    function visible_3 () : java.lang.Boolean {
      return firstError != null
    }
    
    property get errors () : java.lang.String[] {
      return getRequireValue("errors", 0) as java.lang.String[]
    }
    
    property set errors ($arg :  java.lang.String[]) {
      setRequireValue("errors", 0, $arg)
    }
    
    property get firstError () : java.lang.String {
      return getVariableValue("firstError", 0) as java.lang.String
    }
    
    property set firstError ($arg :  java.lang.String) {
      setVariableValue("firstError", 0, $arg)
    }
    
    property get labelAbove () : boolean {
      return getRequireValue("labelAbove", 0) as java.lang.Boolean
    }
    
    property set labelAbove ($arg :  boolean) {
      setRequireValue("labelAbove", 0, $arg)
    }
    
    property get otherErrors () : java.lang.String[] {
      return getVariableValue("otherErrors", 0) as java.lang.String[]
    }
    
    property set otherErrors ($arg :  java.lang.String[]) {
      setVariableValue("otherErrors", 0, $arg)
    }
    
    
  }
  
  
}