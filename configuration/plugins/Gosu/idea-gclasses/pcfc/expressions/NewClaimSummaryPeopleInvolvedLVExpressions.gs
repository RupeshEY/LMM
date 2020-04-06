package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimSummaryPeopleInvolvedLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewClaimSummaryPeopleInvolvedLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=PeopleInvolved_Name) at NewClaimSummaryPeopleInvolvedLV.pcf: line 29, column 39
    function action_4 () : void {
      NewClaimWizard_PartyInvolvedPopup.push(Wizard, ClaimContact, false)
    }
    
    // 'action' attribute on TextCell (id=PeopleInvolved_Name) at NewClaimSummaryPeopleInvolvedLV.pcf: line 29, column 39
    function action_dest_5 () : pcf.api.Destination {
      return pcf.NewClaimWizard_PartyInvolvedPopup.createDestination(Wizard, ClaimContact, false)
    }
    
    // 'value' attribute on TextCell (id=PeopleInvolved_Phone) at NewClaimSummaryPeopleInvolvedLV.pcf: line 38, column 59
    function valueRoot_12 () : java.lang.Object {
      return ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=PeopleInvolved_Name) at NewClaimSummaryPeopleInvolvedLV.pcf: line 29, column 39
    function valueRoot_7 () : java.lang.Object {
      return ClaimContact
    }
    
    // 'value' attribute on TextCell (id=PeopleInvolved_Phone) at NewClaimSummaryPeopleInvolvedLV.pcf: line 38, column 59
    function value_10 () : java.lang.String {
      return ClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextCell (id=PeopleInvolved_Name) at NewClaimSummaryPeopleInvolvedLV.pcf: line 29, column 39
    function value_3 () : entity.Contact {
      return ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=PeopleInvolved_Roles) at NewClaimSummaryPeopleInvolvedLV.pcf: line 34, column 62
    function value_8 () : java.lang.String {
      return ClaimContact.Roles.join( ", " )
    }
    
    property get ClaimContact () : entity.ClaimContact {
      return getIteratedValue(1) as entity.ClaimContact
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimSummaryPeopleInvolvedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimSummaryPeopleInvolvedLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryPeopleInvolvedLV.pcf: line 29, column 39
    function sortValue_0 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryPeopleInvolvedLV.pcf: line 34, column 62
    function sortValue_1 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Roles.join( ", " )
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryPeopleInvolvedLV.pcf: line 38, column 59
    function sortValue_2 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on RowIterator at NewClaimSummaryPeopleInvolvedLV.pcf: line 21, column 41
    function value_13 () : entity.ClaimContact[] {
      return ClaimContactList
    }
    
    property get ClaimContactList () : ClaimContact[] {
      return getRequireValue("ClaimContactList", 0) as ClaimContact[]
    }
    
    property set ClaimContactList ($arg :  ClaimContact[]) {
      setRequireValue("ClaimContactList", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}