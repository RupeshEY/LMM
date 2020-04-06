package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/EndorsementsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EndorsementsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/EndorsementsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndorsementsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EndorsementsLV.pcf: line 32, column 43
    function sortValue_0 (Endorsement :  entity.Endorsement) : java.lang.Object {
      return Endorsement.FormNumber
    }
    
    // 'value' attribute on RowIterator at EndorsementsLV.pcf: line 37, column 44
    function sortValue_1 (Endorsement :  entity.Endorsement) : java.lang.Object {
      return Endorsement.Description
    }
    
    // 'value' attribute on RowIterator at EndorsementsLV.pcf: line 41, column 46
    function sortValue_2 (Endorsement :  entity.Endorsement) : java.lang.Object {
      return Endorsement.EffectiveDate
    }
    
    // 'value' attribute on RowIterator at EndorsementsLV.pcf: line 45, column 47
    function sortValue_3 (Endorsement :  entity.Endorsement) : java.lang.Object {
      return Endorsement.ExpirationDate
    }
    
    // 'value' attribute on RowIterator at EndorsementsLV.pcf: line 50, column 41
    function sortValue_4 (Endorsement :  entity.Endorsement) : java.lang.Object {
      return Endorsement.Comments
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at EndorsementsLV.pcf: line 25, column 40
    function toCreateAndAdd_20 () : entity.Endorsement {
      return Claim.Policy.createEndorsement()
    }
    
    // 'toRemove' attribute on RowIterator at EndorsementsLV.pcf: line 25, column 40
    function toRemove_21 (Endorsement :  entity.Endorsement) : void {
      Claim.Policy.removeEndorsement(Endorsement)
    }
    
    // 'value' attribute on RowIterator at EndorsementsLV.pcf: line 25, column 40
    function value_22 () : entity.Endorsement[] {
      return EndorsementList
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get EndorsementList () : Endorsement[] {
      return getRequireValue("EndorsementList", 0) as Endorsement[]
    }
    
    property set EndorsementList ($arg :  Endorsement[]) {
      setRequireValue("EndorsementList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/EndorsementsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EndorsementsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=FormNumber) at EndorsementsLV.pcf: line 32, column 43
    function valueRoot_7 () : java.lang.Object {
      return Endorsement
    }
    
    // 'value' attribute on DateCell (id=EffectiveDate) at EndorsementsLV.pcf: line 41, column 46
    function value_11 () : java.util.Date {
      return Endorsement.EffectiveDate
    }
    
    // 'value' attribute on DateCell (id=ExpirationDate) at EndorsementsLV.pcf: line 45, column 47
    function value_14 () : java.util.Date {
      return Endorsement.ExpirationDate
    }
    
    // 'value' attribute on TextCell (id=Comments) at EndorsementsLV.pcf: line 50, column 41
    function value_17 () : java.lang.String {
      return Endorsement.Comments
    }
    
    // 'value' attribute on TextCell (id=FormNumber) at EndorsementsLV.pcf: line 32, column 43
    function value_5 () : java.lang.String {
      return Endorsement.FormNumber
    }
    
    // 'value' attribute on TextCell (id=Description) at EndorsementsLV.pcf: line 37, column 44
    function value_8 () : java.lang.String {
      return Endorsement.Description
    }
    
    property get Endorsement () : entity.Endorsement {
      return getIteratedValue(1) as entity.Endorsement
    }
    
    
  }
  
  
}