package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPartiesInvolvedScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPartiesInvolvedScreen_400Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPartiesInvolvedScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPartiesInvolvedScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 31, column 44
    function valueRoot_10 () : java.lang.Object {
      return ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 48, column 44
    function valueRoot_19 () : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress
    }
    
    // 'value' attribute on TextCell (id=Roles) at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 35, column 82
    function value_11 () : java.lang.String {
      return util.Snapshot.getDistinctContactRoles(ClaimContact.Roles)
    }
    
    // 'value' attribute on TextCell (id=Prohibited) at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 39, column 82
    function value_13 () : java.lang.String {
      return util.Snapshot.renderValue(ClaimContact.ContactProhibited)
    }
    
    // 'value' attribute on TextCell (id=Phone) at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 43, column 76
    function value_15 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(ClaimContact.Contact)
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 48, column 44
    function value_17 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.AddressLine1
    }
    
    // 'value' attribute on TextCell (id=City) at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 53, column 44
    function value_20 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on TextCell (id=State) at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 58, column 44
    function value_23 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on TextCell (id=ZipCode) at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 63, column 44
    function value_26 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 31, column 44
    function value_8 () : dynamic.Dynamic {
      return ClaimContact.Contact.DisplayName
    }
    
    property get ClaimContact () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotPartiesInvolvedScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotPartiesInvolvedScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 73, column 78
    function def_onEnter_30 (def :  pcf.ClaimSnapshotContact400DV_Company) : void {
      def.onEnter(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 73, column 78
    function def_onEnter_32 (def :  pcf.ClaimSnapshotContact400DV_Person) : void {
      def.onEnter(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 73, column 78
    function def_onEnter_34 (def :  pcf.ClaimSnapshotContact400DV_Place) : void {
      def.onEnter(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 73, column 78
    function def_onEnter_36 (def :  pcf.ClaimSnapshotContact400DV_contact) : void {
      def.onEnter(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 73, column 78
    function def_refreshVariables_31 (def :  pcf.ClaimSnapshotContact400DV_Company) : void {
      def.refreshVariables(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 73, column 78
    function def_refreshVariables_33 (def :  pcf.ClaimSnapshotContact400DV_Person) : void {
      def.refreshVariables(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 73, column 78
    function def_refreshVariables_35 (def :  pcf.ClaimSnapshotContact400DV_Place) : void {
      def.refreshVariables(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 73, column 78
    function def_refreshVariables_37 (def :  pcf.ClaimSnapshotContact400DV_contact) : void {
      def.refreshVariables(SelectedClaimContact)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 73, column 78
    function mode_38 () : java.lang.Object {
      return util.Snapshot.getEntityType(SelectedClaimContact.Contact)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 31, column 44
    function sortValue_0 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 35, column 82
    function sortValue_1 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getDistinctContactRoles(ClaimContact.Roles)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 39, column 82
    function sortValue_2 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ClaimContact.ContactProhibited)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 43, column 76
    function sortValue_3 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getPrimaryPhone(ClaimContact.Contact)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 48, column 44
    function sortValue_4 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.AddressLine1
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 53, column 44
    function sortValue_5 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 58, column 44
    function sortValue_6 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 63, column 44
    function sortValue_7 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    // 'title' attribute on Card (id=ClaimSnapshotPartiesInvolvedCard) at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 70, column 70
    function title_39 () : java.lang.String {
      return SelectedClaimContact.Contact.DisplayName as String
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.400.pcf: line 24, column 39
    function value_29 () : dynamic.Dynamic {
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