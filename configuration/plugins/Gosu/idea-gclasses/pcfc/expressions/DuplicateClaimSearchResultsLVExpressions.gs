package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/DuplicateClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DuplicateClaimSearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/DuplicateClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateClaimSearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at DuplicateClaimSearchResultsLV.pcf: line 14, column 20
    function initialValue_0 () : User {
      return User.util.CurrentUser
    }
    
    // 'sortBy' attribute on RowIterator at DuplicateClaimSearchResultsLV.pcf: line 32, column 43
    function sortValue_1 (Claim :  entity.Claim) : java.lang.Object {
      return Claim.Flagged
    }
    
    // 'value' attribute on RowIterator at DuplicateClaimSearchResultsLV.pcf: line 83, column 43
    function sortValue_10 (Claim :  entity.Claim) : java.lang.Object {
      return Claim.State
    }
    
    // 'value' attribute on RowIterator at DuplicateClaimSearchResultsLV.pcf: line 37, column 38
    function sortValue_2 (Claim :  entity.Claim) : java.lang.Object {
      return Claim.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at DuplicateClaimSearchResultsLV.pcf: line 42, column 39
    function sortValue_3 (Claim :  entity.Claim) : java.lang.Object {
      return Claim.InsuredDenorm
    }
    
    // 'value' attribute on RowIterator at DuplicateClaimSearchResultsLV.pcf: line 46, column 46
    function sortValue_4 (Claim :  entity.Claim) : java.lang.Object {
      return Claim.Policy.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at DuplicateClaimSearchResultsLV.pcf: line 52, column 63
    function sortValue_6 (Claim :  entity.Claim) : java.lang.Object {
      return Claim.ClaimantDenorm
    }
    
    // 'value' attribute on RowIterator at DuplicateClaimSearchResultsLV.pcf: line 74, column 35
    function sortValue_8 (Claim :  entity.Claim) : java.lang.Object {
      return Claim.LossDate
    }
    
    // 'value' attribute on RowIterator at DuplicateClaimSearchResultsLV.pcf: line 78, column 48
    function sortValue_9 (Claim :  entity.Claim) : java.lang.Object {
      return Claim.AssigneeDisplayString
    }
    
    // 'value' attribute on RowIterator at DuplicateClaimSearchResultsLV.pcf: line 19, column 34
    function value_44 () : entity.Claim[] {
      return ClaimList
    }
    
    // 'visible' attribute on RowIterator at DuplicateClaimSearchResultsLV.pcf: line 52, column 63
    function visible_5 () : java.lang.Boolean {
      return (CurrentUser.LossType == LossType.TC_WC)
    }
    
    // 'visible' attribute on RowIterator at DuplicateClaimSearchResultsLV.pcf: line 56, column 62
    function visible_7 () : java.lang.Boolean {
      return (CurrentUser.LossType != LossType.TC_WC)
    }
    
    property get ClaimList () : Claim[] {
      return getRequireValue("ClaimList", 0) as Claim[]
    }
    
    property set ClaimList ($arg :  Claim[]) {
      setRequireValue("ClaimList", 0, $arg)
    }
    
    property get CurrentUser () : User {
      return getVariableValue("CurrentUser", 0) as User
    }
    
    property set CurrentUser ($arg :  User) {
      setVariableValue("CurrentUser", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/DuplicateClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Link (id=Claimant) at DuplicateClaimSearchResultsLV.pcf: line 64, column 37
    function label_30 () : java.lang.Object {
      return claimantName
    }
    
    // 'visible' attribute on Link (id=ClaimantSeperator) at DuplicateClaimSearchResultsLV.pcf: line 68, column 111
    function visible_31 () : java.lang.Boolean {
      return claimantList.length > 1 and claimantName != claimantList[claimantList.length - 1]
    }
    
    property get claimantName () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/DuplicateClaimSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DuplicateClaimSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at DuplicateClaimSearchResultsLV.pcf: line 37, column 38
    function action_16 () : void {
      DuplicateClaimLossDetailsPopup.push(Claim)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at DuplicateClaimSearchResultsLV.pcf: line 37, column 38
    function action_dest_17 () : pcf.api.Destination {
      return pcf.DuplicateClaimLossDetailsPopup.createDestination(Claim)
    }
    
    // 'initialValue' attribute on Variable at DuplicateClaimSearchResultsLV.pcf: line 23, column 26
    function initialValue_11 () : String[] {
      return Claim.getClaimantNames()
    }
    
    // RowIterator at DuplicateClaimSearchResultsLV.pcf: line 19, column 34
    function initializeVariables_43 () : void {
        claimantList = Claim.getClaimantNames();

    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at DuplicateClaimSearchResultsLV.pcf: line 32, column 43
    function valueRoot_14 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextCell (id=PolicyID) at DuplicateClaimSearchResultsLV.pcf: line 46, column 46
    function valueRoot_25 () : java.lang.Object {
      return Claim.Policy
    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at DuplicateClaimSearchResultsLV.pcf: line 32, column 43
    function value_12 () : java.lang.Boolean {
      return Claim.CurrentlyFlagged
    }
    
    // 'value' attribute on TextCell (id=ClaimNumber) at DuplicateClaimSearchResultsLV.pcf: line 37, column 38
    function value_15 () : java.lang.String {
      return Claim.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at DuplicateClaimSearchResultsLV.pcf: line 42, column 39
    function value_20 () : entity.Contact {
      return Claim.InsuredDenorm
    }
    
    // 'value' attribute on TextCell (id=PolicyID) at DuplicateClaimSearchResultsLV.pcf: line 46, column 46
    function value_23 () : java.lang.String {
      return Claim.Policy.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=InjuredWorker) at DuplicateClaimSearchResultsLV.pcf: line 52, column 63
    function value_27 () : entity.Contact {
      return Claim.ClaimantDenorm
    }
    
    // 'value' attribute on LinkIterator (id=ClaimantName) at DuplicateClaimSearchResultsLV.pcf: line 61, column 44
    function value_32 () : java.lang.String[] {
      return claimantList
    }
    
    // 'value' attribute on DateCell (id=LossDate) at DuplicateClaimSearchResultsLV.pcf: line 74, column 35
    function value_34 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on TextCell (id=Assignee) at DuplicateClaimSearchResultsLV.pcf: line 78, column 48
    function value_37 () : java.lang.String {
      return Claim.AssigneeDisplayString
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at DuplicateClaimSearchResultsLV.pcf: line 83, column 43
    function value_40 () : typekey.ClaimState {
      return Claim.State
    }
    
    // 'visible' attribute on TextCell (id=InjuredWorker) at DuplicateClaimSearchResultsLV.pcf: line 52, column 63
    function visible_26 () : java.lang.Boolean {
      return (CurrentUser.LossType == LossType.TC_WC)
    }
    
    // 'visible' attribute on LinkCell (id=Claimant) at DuplicateClaimSearchResultsLV.pcf: line 56, column 62
    function visible_33 () : java.lang.Boolean {
      return (CurrentUser.LossType != LossType.TC_WC)
    }
    
    property get Claim () : entity.Claim {
      return getIteratedValue(1) as entity.Claim
    }
    
    property get claimantList () : String[] {
      return getVariableValue("claimantList", 1) as String[]
    }
    
    property set claimantList ($arg :  String[]) {
      setVariableValue("claimantList", 1, $arg)
    }
    
    
  }
  
  
}