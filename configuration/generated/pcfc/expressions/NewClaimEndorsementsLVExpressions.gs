package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimEndorsementsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimEndorsementsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimEndorsementsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewClaimEndorsementsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=FormNumber) at NewClaimEndorsementsLV.pcf: line 33, column 43
    function action_6 () : void {
      NewClaimWizard_EndorsementDetailPopup.push(Policy, Endorsement)
    }
    
    // 'action' attribute on TextCell (id=FormNumber) at NewClaimEndorsementsLV.pcf: line 33, column 43
    function action_dest_7 () : pcf.api.Destination {
      return pcf.NewClaimWizard_EndorsementDetailPopup.createDestination(Policy, Endorsement)
    }
    
    // 'value' attribute on TextCell (id=FormNumber) at NewClaimEndorsementsLV.pcf: line 33, column 43
    function valueRoot_9 () : java.lang.Object {
      return Endorsement
    }
    
    // 'value' attribute on TextCell (id=Description) at NewClaimEndorsementsLV.pcf: line 38, column 44
    function value_10 () : java.lang.String {
      return Endorsement.Description
    }
    
    // 'value' attribute on DateCell (id=EffectiveDate) at NewClaimEndorsementsLV.pcf: line 42, column 46
    function value_13 () : java.util.Date {
      return Endorsement.EffectiveDate
    }
    
    // 'value' attribute on DateCell (id=ExpirationDate) at NewClaimEndorsementsLV.pcf: line 46, column 47
    function value_16 () : java.util.Date {
      return Endorsement.ExpirationDate
    }
    
    // 'value' attribute on TextCell (id=Comments) at NewClaimEndorsementsLV.pcf: line 51, column 41
    function value_19 () : java.lang.String {
      return Endorsement.Comments
    }
    
    // 'value' attribute on TextCell (id=FormNumber) at NewClaimEndorsementsLV.pcf: line 33, column 43
    function value_5 () : java.lang.String {
      return Endorsement.FormNumber
    }
    
    property get Endorsement () : entity.Endorsement {
      return getIteratedValue(1) as entity.Endorsement
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimEndorsementsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimEndorsementsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at NewClaimEndorsementsLV.pcf: line 25, column 40
    function pickLocation_22 () : void {
      NewClaimWizard_NewEndorsementPopup.push(Policy)
    }
    
    // 'value' attribute on RowIterator at NewClaimEndorsementsLV.pcf: line 33, column 43
    function sortValue_0 (Endorsement :  entity.Endorsement) : java.lang.Object {
      return Endorsement.FormNumber
    }
    
    // 'value' attribute on RowIterator at NewClaimEndorsementsLV.pcf: line 38, column 44
    function sortValue_1 (Endorsement :  entity.Endorsement) : java.lang.Object {
      return Endorsement.Description
    }
    
    // 'value' attribute on RowIterator at NewClaimEndorsementsLV.pcf: line 42, column 46
    function sortValue_2 (Endorsement :  entity.Endorsement) : java.lang.Object {
      return Endorsement.EffectiveDate
    }
    
    // 'value' attribute on RowIterator at NewClaimEndorsementsLV.pcf: line 46, column 47
    function sortValue_3 (Endorsement :  entity.Endorsement) : java.lang.Object {
      return Endorsement.ExpirationDate
    }
    
    // 'value' attribute on RowIterator at NewClaimEndorsementsLV.pcf: line 51, column 41
    function sortValue_4 (Endorsement :  entity.Endorsement) : java.lang.Object {
      return Endorsement.Comments
    }
    
    // 'toRemove' attribute on RowIterator at NewClaimEndorsementsLV.pcf: line 25, column 40
    function toRemove_23 (Endorsement :  entity.Endorsement) : void {
      Policy.removeEndorsement(Endorsement)
    }
    
    // 'value' attribute on RowIterator at NewClaimEndorsementsLV.pcf: line 25, column 40
    function value_24 () : entity.Endorsement[] {
      return EndorsementList
    }
    
    property get EndorsementList () : Endorsement[] {
      return getRequireValue("EndorsementList", 0) as Endorsement[]
    }
    
    property set EndorsementList ($arg :  Endorsement[]) {
      setRequireValue("EndorsementList", 0, $arg)
    }
    
    property get Policy () : Policy {
      return getRequireValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setRequireValue("Policy", 0, $arg)
    }
    
    
  }
  
  
}