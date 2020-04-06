package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/print/ClaimContactPrintDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimContactPrintDetailsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/print/ClaimContactPrintDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContactPrintDetailsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, selectedClaimContact :  ClaimContact) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at ClaimContactPrintDetails.pcf: line 25, column 54
    function def_onEnter_1 (def :  pcf.ContactBasicsDV_Company) : void {
      def.onEnter(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContactPrintDetails.pcf: line 27, column 56
    function def_onEnter_10 (def :  pcf.AddressesPanelSet) : void {
      def.onEnter(selectedClaimContact)
    }
    
    // 'def' attribute on ListViewInput at ClaimContactPrintDetails.pcf: line 31, column 78
    function def_onEnter_12 (def :  pcf.ClaimContactRelatedContactsLV) : void {
      def.onEnter(selectedClaimContact, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContactPrintDetails.pcf: line 25, column 54
    function def_onEnter_3 (def :  pcf.ContactBasicsDV_Person) : void {
      def.onEnter(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContactPrintDetails.pcf: line 25, column 54
    function def_onEnter_5 (def :  pcf.ContactBasicsDV_Place) : void {
      def.onEnter(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContactPrintDetails.pcf: line 25, column 54
    function def_onEnter_7 (def :  pcf.ContactBasicsDV_default) : void {
      def.onEnter(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContactPrintDetails.pcf: line 27, column 56
    function def_refreshVariables_11 (def :  pcf.AddressesPanelSet) : void {
      def.refreshVariables(selectedClaimContact)
    }
    
    // 'def' attribute on ListViewInput at ClaimContactPrintDetails.pcf: line 31, column 78
    function def_refreshVariables_13 (def :  pcf.ClaimContactRelatedContactsLV) : void {
      def.refreshVariables(selectedClaimContact, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContactPrintDetails.pcf: line 25, column 54
    function def_refreshVariables_2 (def :  pcf.ContactBasicsDV_Company) : void {
      def.refreshVariables(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContactPrintDetails.pcf: line 25, column 54
    function def_refreshVariables_4 (def :  pcf.ContactBasicsDV_Person) : void {
      def.refreshVariables(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContactPrintDetails.pcf: line 25, column 54
    function def_refreshVariables_6 (def :  pcf.ContactBasicsDV_Place) : void {
      def.refreshVariables(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ClaimContactPrintDetails.pcf: line 25, column 54
    function def_refreshVariables_8 (def :  pcf.ContactBasicsDV_default) : void {
      def.refreshVariables(selectedClaimContact, true, linkStatus, claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimContactPrintDetails.pcf: line 20, column 54
    function initialValue_0 () : gw.api.contact.ContactSystemLinkStatus {
      return selectedClaimContact.Contact==null ? null : gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(selectedClaimContact.Contact)
    }
    
    // 'mode' attribute on PanelRef at ClaimContactPrintDetails.pcf: line 25, column 54
    function mode_9 () : java.lang.Object {
      return selectedClaimContact.Contact.Subtype
    }
    
    // 'parent' attribute on Page (id=ClaimContactPrintDetails) at ClaimContactPrintDetails.pcf: line 8, column 65
    static function parent_14 (claim :  Claim, selectedClaimContact :  ClaimContact) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimContactPrintDetails {
      return super.CurrentLocation as pcf.ClaimContactPrintDetails
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getVariableValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setVariableValue("linkStatus", 0, $arg)
    }
    
    property get selectedClaimContact () : ClaimContact {
      return getVariableValue("selectedClaimContact", 0) as ClaimContact
    }
    
    property set selectedClaimContact ($arg :  ClaimContact) {
      setVariableValue("selectedClaimContact", 0, $arg)
    }
    
    
  }
  
  
}