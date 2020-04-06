package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleValidationInfoCell.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleValidationInfoCell_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleValidationInfoCell.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleValidationInfoCellExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'visible' attribute on Link (id=Invalid) at RuleValidationInfoCell.default.pcf: line 21, column 50
    function visible_0 () : java.lang.Boolean {
      return rule.Valid == Boolean.FALSE
    }
    
    // 'visible' attribute on Link (id=Unknown) at RuleValidationInfoCell.default.pcf: line 26, column 41
    function visible_1 () : java.lang.Boolean {
      return rule.Valid == null
    }
    
    // 'visible' attribute on ContentInput at RuleValidationInfoCell.default.pcf: line 16, column 32
    function visible_2 () : java.lang.Boolean {
      return rule != null
    }
    
    property get rule () : Rule {
      return getRequireValue("rule", 0) as Rule
    }
    
    property set rule ($arg :  Rule) {
      setRequireValue("rule", 0, $arg)
    }
    
    
  }
  
  
}