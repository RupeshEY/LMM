package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotContact300DV.contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotContact300DV_contactExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotContact300DV.contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotContact300DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotContact300DV.contact.pcf: line 134, column 38
    function encryptionExpression_55 (VALUE :  dynamic.Dynamic) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskTaxId(VALUE as String)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact300DV.contact.pcf: line 29, column 46
    function sortValue_0 (Role :  dynamic.Dynamic) : java.lang.Object {
      return Role.Role
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact300DV.contact.pcf: line 33, column 59
    function sortValue_1 (Role :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getRoleOwner(Role)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact300DV.contact.pcf: line 37, column 65
    function sortValue_2 (Role :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Role.Active)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact300DV.contact.pcf: line 42, column 46
    function sortValue_3 (Role :  dynamic.Dynamic) : java.lang.Object {
      return Role.Comments
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotContact300DV.contact.pcf: line 63, column 38
    function valueRoot_19 () : java.lang.Object {
      return asClaimContact().Contact
    }
    
    // 'value' attribute on TextInput (id=County) at ClaimSnapshotContact300DV.contact.pcf: line 105, column 38
    function valueRoot_39 () : java.lang.Object {
      return asClaimContact().Contact.PrimaryAddress
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact300DV.contact.pcf: line 23, column 41
    function value_14 () : dynamic.Dynamic {
      return asClaimContact().Roles
    }
    
    // 'value' attribute on TextInput (id=contact) at ClaimSnapshotContact300DV.contact.pcf: line 55, column 70
    function value_15 () : java.lang.String {
      return util.Snapshot.renderValue(asClaimContact().Contact)
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotContact300DV.contact.pcf: line 63, column 38
    function value_17 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=WorkPhone) at ClaimSnapshotContact300DV.contact.pcf: line 68, column 38
    function value_20 () : dynamic.Dynamic {
      return asClaimContact().Contact.WorkPhone
    }
    
    // 'value' attribute on TextInput (id=HomePhone) at ClaimSnapshotContact300DV.contact.pcf: line 73, column 38
    function value_23 () : dynamic.Dynamic {
      return asClaimContact().Contact.HomePhone
    }
    
    // 'value' attribute on TextInput (id=FaxPhone) at ClaimSnapshotContact300DV.contact.pcf: line 78, column 38
    function value_26 () : dynamic.Dynamic {
      return asClaimContact().Contact.FaxPhone
    }
    
    // 'value' attribute on TextInput (id=EmailAddress1) at ClaimSnapshotContact300DV.contact.pcf: line 86, column 38
    function value_29 () : dynamic.Dynamic {
      return asClaimContact().Contact.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=EmailAddress2) at ClaimSnapshotContact300DV.contact.pcf: line 91, column 38
    function value_32 () : dynamic.Dynamic {
      return asClaimContact().Contact.EmailAddress2
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotContact300DV.contact.pcf: line 100, column 85
    function value_35 () : java.lang.String {
      return util.Snapshot.renderValue(asClaimContact().Contact.PrimaryAddress)
    }
    
    // 'value' attribute on TextInput (id=County) at ClaimSnapshotContact300DV.contact.pcf: line 105, column 38
    function value_37 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.County
    }
    
    // 'value' attribute on TextInput (id=Country) at ClaimSnapshotContact300DV.contact.pcf: line 110, column 38
    function value_40 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.Country
    }
    
    // 'value' attribute on TextInput (id=AddressType) at ClaimSnapshotContact300DV.contact.pcf: line 115, column 38
    function value_43 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.AddressType
    }
    
    // 'value' attribute on TextInput (id=Description) at ClaimSnapshotContact300DV.contact.pcf: line 120, column 38
    function value_46 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.Description
    }
    
    // 'value' attribute on TextInput (id=ValidUntil) at ClaimSnapshotContact300DV.contact.pcf: line 125, column 38
    function value_49 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.ValidUntil
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotContact300DV.contact.pcf: line 134, column 38
    function value_52 () : dynamic.Dynamic {
      return asClaimContact().Contact.TaxID
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ClaimSnapshotContact300DV.contact.pcf: line 143, column 38
    function value_56 () : dynamic.Dynamic {
      return asClaimContact().Contact.Notes
    }
    
    property get ClaimContactParam () : dynamic.Dynamic {
      return getRequireValue("ClaimContactParam", 0) as dynamic.Dynamic
    }
    
    property set ClaimContactParam ($arg :  dynamic.Dynamic) {
      setRequireValue("ClaimContactParam", 0, $arg)
    }
    
    
          function asClaimContact() : dynamic.Dynamic {
            return ClaimContactParam;
          }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotContact300DV.contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotContact300DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Role) at ClaimSnapshotContact300DV.contact.pcf: line 29, column 46
    function valueRoot_6 () : java.lang.Object {
      return Role
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotContact300DV.contact.pcf: line 42, column 46
    function value_11 () : dynamic.Dynamic {
      return Role.Comments
    }
    
    // 'value' attribute on TextCell (id=Role) at ClaimSnapshotContact300DV.contact.pcf: line 29, column 46
    function value_4 () : dynamic.Dynamic {
      return Role.Role
    }
    
    // 'value' attribute on TextCell (id=Owner) at ClaimSnapshotContact300DV.contact.pcf: line 33, column 59
    function value_7 () : java.lang.String {
      return util.Snapshot.getRoleOwner(Role)
    }
    
    // 'value' attribute on TextCell (id=Active) at ClaimSnapshotContact300DV.contact.pcf: line 37, column 65
    function value_9 () : java.lang.String {
      return util.Snapshot.renderValue(Role.Active)
    }
    
    property get Role () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}