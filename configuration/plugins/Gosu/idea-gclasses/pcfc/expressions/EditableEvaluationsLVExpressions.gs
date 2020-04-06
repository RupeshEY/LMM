package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/EditableEvaluationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableEvaluationsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/EditableEvaluationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableEvaluationsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableEvaluationsLV.pcf: line 32, column 36
    function sortValue_0 (Evaluation :  entity.Evaluation) : java.lang.Object {
      return Evaluation.Name
    }
    
    // 'value' attribute on RowIterator at EditableEvaluationsLV.pcf: line 38, column 42
    function sortValue_1 (Evaluation :  entity.Evaluation) : java.lang.Object {
      return Evaluation.CreateTime
    }
    
    // 'value' attribute on RowIterator at EditableEvaluationsLV.pcf: line 42, column 38
    function sortValue_2 (Evaluation :  entity.Evaluation) : java.lang.Object {
      return Evaluation.Amount
    }
    
    // 'toRemove' attribute on RowIterator at EditableEvaluationsLV.pcf: line 23, column 39
    function toRemove_13 (Evaluation :  entity.Evaluation) : void {
      claim.removeFromEvaluations(Evaluation)
    }
    
    // 'value' attribute on RowIterator at EditableEvaluationsLV.pcf: line 23, column 39
    function value_14 () : entity.Evaluation[] {
      return EvaluationList
    }
    
    property get EvaluationList () : Evaluation[] {
      return getRequireValue("EvaluationList", 0) as Evaluation[]
    }
    
    property set EvaluationList ($arg :  Evaluation[]) {
      setRequireValue("EvaluationList", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/EditableEvaluationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableEvaluationsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at EditableEvaluationsLV.pcf: line 26, column 27
    function condition_3 () : java.lang.Boolean {
      return perm.Evaluation.edit(claim)
    }
    
    // 'value' attribute on TextCell (id=Name) at EditableEvaluationsLV.pcf: line 32, column 36
    function valueRoot_6 () : java.lang.Object {
      return Evaluation
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at EditableEvaluationsLV.pcf: line 42, column 38
    function value_10 () : gw.api.financials.CurrencyAmount {
      return Evaluation.Amount
    }
    
    // 'value' attribute on TextCell (id=Name) at EditableEvaluationsLV.pcf: line 32, column 36
    function value_4 () : java.lang.String {
      return Evaluation.Name
    }
    
    // 'value' attribute on DateCell (id=CreateTime) at EditableEvaluationsLV.pcf: line 38, column 42
    function value_7 () : java.util.Date {
      return Evaluation.CreateTime
    }
    
    property get Evaluation () : entity.Evaluation {
      return getIteratedValue(1) as entity.Evaluation
    }
    
    
  }
  
  
}