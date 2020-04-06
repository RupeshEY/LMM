package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ValidationWarningsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ValidationWarningsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ValidationWarningsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ValidationWarningsInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'labelAbove' attribute on TextInput (id=ValidationWarning) at ValidationWarningsInputSet.pcf: line 49, column 26
    function labelAbove_8 () : java.lang.Boolean {
      return labelAbove
    }
    
    // 'value' attribute on TextInput (id=ValidationWarning) at ValidationWarningsInputSet.pcf: line 49, column 26
    function value_6 () : java.lang.String {
      return warning
    }
    
    property get warning () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/ValidationWarningsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationWarningsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ValidationWarningsInputSet.pcf: line 17, column 65
    function initialValue_0 () : java.lang.String {
      return warnings.HasElements ? warnings[0] : null
    }
    
    // 'initialValue' attribute on Variable at ValidationWarningsInputSet.pcf: line 22, column 116
    function initialValue_1 () : java.lang.String[] {
      return warnings.length < 2 ? {} : warnings.fastList().subList(1, warnings.length).toTypedArray()
    }
    
    // 'labelAbove' attribute on ContentInput at ValidationWarningsInputSet.pcf: line 26, column 38
    function labelAbove_5 () : java.lang.Boolean {
      return labelAbove
    }
    
    // 'label' attribute on Link (id=Label) at ValidationWarningsInputSet.pcf: line 38, column 31
    function label_2 () : java.lang.Object {
      return firstWarning
    }
    
    // 'value' attribute on InputIterator at ValidationWarningsInputSet.pcf: line 44, column 38
    function value_9 () : java.lang.String[] {
      return otherWarnings
    }
    
    // 'visible' attribute on ContentInput at ValidationWarningsInputSet.pcf: line 52, column 76
    function visible_10 () : java.lang.Boolean {
      return firstWarning != null && !otherWarnings.HasElements
    }
    
    // 'visible' attribute on ContentInput at ValidationWarningsInputSet.pcf: line 26, column 38
    function visible_3 () : java.lang.Boolean {
      return firstWarning != null
    }
    
    property get firstWarning () : java.lang.String {
      return getVariableValue("firstWarning", 0) as java.lang.String
    }
    
    property set firstWarning ($arg :  java.lang.String) {
      setVariableValue("firstWarning", 0, $arg)
    }
    
    property get labelAbove () : boolean {
      return getRequireValue("labelAbove", 0) as java.lang.Boolean
    }
    
    property set labelAbove ($arg :  boolean) {
      setRequireValue("labelAbove", 0, $arg)
    }
    
    property get otherWarnings () : java.lang.String[] {
      return getVariableValue("otherWarnings", 0) as java.lang.String[]
    }
    
    property set otherWarnings ($arg :  java.lang.String[]) {
      setVariableValue("otherWarnings", 0, $arg)
    }
    
    property get warnings () : java.lang.String[] {
      return getRequireValue("warnings", 0) as java.lang.String[]
    }
    
    property set warnings ($arg :  java.lang.String[]) {
      setRequireValue("warnings", 0, $arg)
    }
    
    
  }
  
  
}