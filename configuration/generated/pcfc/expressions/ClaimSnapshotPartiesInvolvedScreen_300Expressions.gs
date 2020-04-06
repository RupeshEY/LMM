package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPartiesInvolvedScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPartiesInvolvedScreen_300Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPartiesInvolvedScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPartiesInvolvedScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPartiesInvolvedScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 47, column 44
    function valueRoot_18 () : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress
    }
    
    // 'value' attribute on TextCell (id=Roles) at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 34, column 82
    function value_10 () : java.lang.String {
      return util.Snapshot.getDistinctContactRoles(ClaimContact.Roles)
    }
    
    // 'value' attribute on TextCell (id=Prohibited) at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 38, column 129
    function value_12 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(ClaimContact, "ContactProhibited") )
    }
    
    // 'value' attribute on TextCell (id=Phone) at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 42, column 76
    function value_14 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(ClaimContact.Contact)
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 47, column 44
    function value_16 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.AddressLine1
    }
    
    // 'value' attribute on TextCell (id=City) at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 52, column 44
    function value_19 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on TextCell (id=State) at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 57, column 44
    function value_22 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on TextCell (id=ZipCode) at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 62, column 44
    function value_25 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 30, column 72
    function value_8 () : java.lang.String {
      return util.Snapshot.renderValue(ClaimContact.Contact)
    }
    
    property get ClaimContact () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPartiesInvolvedScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotPartiesInvolvedScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 72, column 78
    function def_onEnter_29 (def :  pcf.ClaimSnapshotContact300DV_company) : void {
      def.onEnter(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 72, column 78
    function def_onEnter_31 (def :  pcf.ClaimSnapshotContact300DV_contact) : void {
      def.onEnter(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 72, column 78
    function def_onEnter_33 (def :  pcf.ClaimSnapshotContact300DV_person) : void {
      def.onEnter(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 72, column 78
    function def_refreshVariables_30 (def :  pcf.ClaimSnapshotContact300DV_company) : void {
      def.refreshVariables(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 72, column 78
    function def_refreshVariables_32 (def :  pcf.ClaimSnapshotContact300DV_contact) : void {
      def.refreshVariables(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 72, column 78
    function def_refreshVariables_34 (def :  pcf.ClaimSnapshotContact300DV_person) : void {
      def.refreshVariables(SelectedClaimContact)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 72, column 78
    function mode_35 () : java.lang.Object {
      return util.Snapshot.getEntityType(SelectedClaimContact.Contact)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 30, column 72
    function sortValue_0 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ClaimContact.Contact)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 34, column 82
    function sortValue_1 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getDistinctContactRoles(ClaimContact.Roles)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 38, column 129
    function sortValue_2 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue( util.Snapshot.getPropertyValue(ClaimContact, "ContactProhibited") )
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 42, column 76
    function sortValue_3 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getPrimaryPhone(ClaimContact.Contact)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 47, column 44
    function sortValue_4 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.AddressLine1
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 52, column 44
    function sortValue_5 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 57, column 44
    function sortValue_6 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 62, column 44
    function sortValue_7 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    // 'title' attribute on Card (id=ClaimSnapshotPartiesInvolvedCard) at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 69, column 75
    function title_36 () : java.lang.String {
      return util.Snapshot.renderValue(SelectedClaimContact.Contact)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.300.pcf: line 25, column 39
    function value_28 () : dynamic.Dynamic {
      return SnapshotParam.Contacts
    }
    
    property get SelectedClaimContact () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set SelectedClaimContact ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}