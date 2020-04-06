package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/planofaction/EditableNegotiationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableNegotiationsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/EditableNegotiationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableNegotiationsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableNegotiationsLV.pcf: line 32, column 37
    function sortValue_0 (Negotiation :  entity.Negotiation) : java.lang.Object {
      return Negotiation.Name
    }
    
    // 'value' attribute on RowIterator at EditableNegotiationsLV.pcf: line 38, column 43
    function sortValue_1 (Negotiation :  entity.Negotiation) : java.lang.Object {
      return Negotiation.CreateTime
    }
    
    // 'toRemove' attribute on RowIterator at EditableNegotiationsLV.pcf: line 23, column 40
    function toRemove_9 (Negotiation :  entity.Negotiation) : void {
      claim.removeFromNegotiations(Negotiation)
    }
    
    // 'value' attribute on RowIterator at EditableNegotiationsLV.pcf: line 23, column 40
    function value_10 () : entity.Negotiation[] {
      return NegotiationList
    }
    
    property get NegotiationList () : Negotiation[] {
      return getRequireValue("NegotiationList", 0) as Negotiation[]
    }
    
    property set NegotiationList ($arg :  Negotiation[]) {
      setRequireValue("NegotiationList", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/planofaction/EditableNegotiationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableNegotiationsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at EditableNegotiationsLV.pcf: line 26, column 27
    function condition_2 () : java.lang.Boolean {
      return perm.Evaluation.edit(claim)
    }
    
    // 'value' attribute on TextCell (id=Name) at EditableNegotiationsLV.pcf: line 32, column 37
    function valueRoot_5 () : java.lang.Object {
      return Negotiation
    }
    
    // 'value' attribute on TextCell (id=Name) at EditableNegotiationsLV.pcf: line 32, column 37
    function value_3 () : java.lang.String {
      return Negotiation.Name
    }
    
    // 'value' attribute on DateCell (id=CreateTime) at EditableNegotiationsLV.pcf: line 38, column 43
    function value_6 () : java.util.Date {
      return Negotiation.CreateTime
    }
    
    property get Negotiation () : entity.Negotiation {
      return getIteratedValue(1) as entity.Negotiation
    }
    
    
  }
  
  
}