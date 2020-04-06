package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/PeopleInvolvedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PeopleInvolvedLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/PeopleInvolvedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PeopleInvolvedLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at PeopleInvolvedLV.pcf: line 27, column 39
    function action_7 () : void {
      ClaimPartiesInvolvedDetail.drilldown(ClaimContact, claim)
    }
    
    // 'action' attribute on TextCell (id=Name) at PeopleInvolvedLV.pcf: line 27, column 39
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ClaimPartiesInvolvedDetail.createDestination(ClaimContact, claim)
    }
    
    // 'value' attribute on TextCell (id=Name) at PeopleInvolvedLV.pcf: line 27, column 39
    function valueRoot_10 () : java.lang.Object {
      return ClaimContact
    }
    
    // 'value' attribute on TextCell (id=Phone) at PeopleInvolvedLV.pcf: line 39, column 24
    function valueRoot_15 () : java.lang.Object {
      return ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Roles) at PeopleInvolvedLV.pcf: line 34, column 24
    function value_11 () : java.lang.String {
      return ClaimContact.Roles.join( ", " )
    }
    
    // 'value' attribute on TextCell (id=Phone) at PeopleInvolvedLV.pcf: line 39, column 24
    function value_13 () : java.lang.String {
      return ClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextCell (id=Name) at PeopleInvolvedLV.pcf: line 27, column 39
    function value_6 () : entity.Contact {
      return ClaimContact.Contact
    }
    
    property get ClaimContact () : entity.ClaimContact {
      return getIteratedValue(1) as entity.ClaimContact
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/PeopleInvolvedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeopleInvolvedLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on RowIterator at PeopleInvolvedLV.pcf: line 27, column 39
    function sortValue_0 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at PeopleInvolvedLV.pcf: line 27, column 39
    function sortValue_1 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.SecondarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at PeopleInvolvedLV.pcf: line 27, column 39
    function sortValue_2 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.TertiarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at PeopleInvolvedLV.pcf: line 27, column 39
    function sortValue_3 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.QuaternarySortValue
    }
    
    // 'value' attribute on RowIterator at PeopleInvolvedLV.pcf: line 34, column 24
    function sortValue_4 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Roles.join( ", " )
    }
    
    // 'value' attribute on RowIterator at PeopleInvolvedLV.pcf: line 39, column 24
    function sortValue_5 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on RowIterator at PeopleInvolvedLV.pcf: line 18, column 41
    function value_16 () : entity.ClaimContact[] {
      return ClaimContactList
    }
    
    property get ClaimContactList () : ClaimContact[] {
      return getRequireValue("ClaimContactList", 0) as ClaimContact[]
    }
    
    property set ClaimContactList ($arg :  ClaimContact[]) {
      setRequireValue("ClaimContactList", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}