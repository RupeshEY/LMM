package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotContact800DV.person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotContact800DV_PersonExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotContact800DV.person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotContact800DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at ClaimSnapshotContact800DV.person.pcf: line 207, column 27
    function def_onEnter_88 (def :  pcf.ClaimSnapshotContactEFT800LV) : void {
      def.onEnter(asClaimContact().Contact)
    }
    
    // 'def' attribute on ListViewInput at ClaimSnapshotContact800DV.person.pcf: line 207, column 27
    function def_refreshVariables_89 (def :  pcf.ClaimSnapshotContactEFT800LV) : void {
      def.refreshVariables(asClaimContact().Contact)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotContact800DV.person.pcf: line 148, column 38
    function encryptionExpression_62 (VALUE :  dynamic.Dynamic) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskTaxId(VALUE as String)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact800DV.person.pcf: line 29, column 46
    function sortValue_0 (Role :  dynamic.Dynamic) : java.lang.Object {
      return Role.Role
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact800DV.person.pcf: line 33, column 59
    function sortValue_1 (Role :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getRoleOwner(Role)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact800DV.person.pcf: line 37, column 65
    function sortValue_2 (Role :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Role.Active)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact800DV.person.pcf: line 42, column 46
    function sortValue_3 (Role :  dynamic.Dynamic) : java.lang.Object {
      return Role.Comments
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotContact800DV.person.pcf: line 56, column 38
    function valueRoot_17 () : java.lang.Object {
      return asClaimContact().Contact
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotContact800DV.person.pcf: line 112, column 38
    function valueRoot_44 () : java.lang.Object {
      return asClaimContact().Contact.PrimaryAddress
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact800DV.person.pcf: line 23, column 41
    function value_14 () : dynamic.Dynamic {
      return asClaimContact().Roles
    }
    
    // 'value' attribute on TextInput (id=Contact) at ClaimSnapshotContact800DV.person.pcf: line 56, column 38
    function value_15 () : dynamic.Dynamic {
      return asClaimContact().Contact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=FormerName) at ClaimSnapshotContact800DV.person.pcf: line 61, column 38
    function value_18 () : dynamic.Dynamic {
      return asClaimContact().Contact.FormerName
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone) at ClaimSnapshotContact800DV.person.pcf: line 69, column 38
    function value_21 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=WorkPhone) at ClaimSnapshotContact800DV.person.pcf: line 74, column 38
    function value_24 () : dynamic.Dynamic {
      return asClaimContact().Contact.WorkPhone
    }
    
    // 'value' attribute on TextInput (id=HomePhone) at ClaimSnapshotContact800DV.person.pcf: line 79, column 38
    function value_27 () : dynamic.Dynamic {
      return asClaimContact().Contact.HomePhone
    }
    
    // 'value' attribute on TextInput (id=CellPhone) at ClaimSnapshotContact800DV.person.pcf: line 84, column 38
    function value_30 () : dynamic.Dynamic {
      return asClaimContact().Contact.CellPhone
    }
    
    // 'value' attribute on TextInput (id=FaxPhone) at ClaimSnapshotContact800DV.person.pcf: line 89, column 38
    function value_33 () : dynamic.Dynamic {
      return asClaimContact().Contact.FaxPhone
    }
    
    // 'value' attribute on TextInput (id=EmailAddress1) at ClaimSnapshotContact800DV.person.pcf: line 97, column 38
    function value_36 () : dynamic.Dynamic {
      return asClaimContact().Contact.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=EmailAddress2) at ClaimSnapshotContact800DV.person.pcf: line 102, column 38
    function value_39 () : dynamic.Dynamic {
      return asClaimContact().Contact.EmailAddress2
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress) at ClaimSnapshotContact800DV.person.pcf: line 112, column 38
    function value_42 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=AddressType) at ClaimSnapshotContact800DV.person.pcf: line 117, column 38
    function value_45 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.AddressType
    }
    
    // 'value' attribute on TextInput (id=Description) at ClaimSnapshotContact800DV.person.pcf: line 122, column 38
    function value_48 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.Description
    }
    
    // 'value' attribute on TextInput (id=ValidUntil) at ClaimSnapshotContact800DV.person.pcf: line 127, column 38
    function value_51 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.ValidUntil
    }
    
    // 'value' attribute on TextInput (id=Occupation) at ClaimSnapshotContact800DV.person.pcf: line 135, column 38
    function value_54 () : dynamic.Dynamic {
      return asClaimContact().Contact.Occupation
    }
    
    // 'value' attribute on TextInput (id=Employer) at ClaimSnapshotContact800DV.person.pcf: line 139, column 79
    function value_57 () : java.lang.String {
      return util.Snapshot.renderValue(asClaimContact().Contact.Employer)
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID) at ClaimSnapshotContact800DV.person.pcf: line 148, column 38
    function value_59 () : dynamic.Dynamic {
      return asClaimContact().Contact.TaxID
    }
    
    // 'value' attribute on TextInput (id=TaxFilingStatus) at ClaimSnapshotContact800DV.person.pcf: line 153, column 38
    function value_63 () : dynamic.Dynamic {
      return asClaimContact().Contact.TaxFilingStatus
    }
    
    // 'value' attribute on TextInput (id=DateOfBirth) at ClaimSnapshotContact800DV.person.pcf: line 157, column 168
    function value_66 () : java.lang.String {
      return asClaimContact().Contact.DateOfBirth == null ? null : (gw.api.upgrade.Coercions.makeDateFrom(asClaimContact().Contact.DateOfBirth)).formatDate(SHORT)
    }
    
    // 'value' attribute on TextInput (id=Guardian) at ClaimSnapshotContact800DV.person.pcf: line 161, column 79
    function value_68 () : java.lang.String {
      return util.Snapshot.renderValue(asClaimContact().Contact.Guardian)
    }
    
    // 'value' attribute on TextInput (id=Gender) at ClaimSnapshotContact800DV.person.pcf: line 166, column 38
    function value_70 () : dynamic.Dynamic {
      return asClaimContact().Contact.Gender
    }
    
    // 'value' attribute on TextInput (id=MaritalStatus) at ClaimSnapshotContact800DV.person.pcf: line 171, column 38
    function value_73 () : dynamic.Dynamic {
      return asClaimContact().Contact.MaritalStatus
    }
    
    // 'value' attribute on TextInput (id=PreferredCurrency) at ClaimSnapshotContact800DV.person.pcf: line 176, column 38
    function value_76 () : dynamic.Dynamic {
      return asClaimContact().Contact.PreferredCurrency
    }
    
    // 'value' attribute on TextInput (id=LicenseNumber) at ClaimSnapshotContact800DV.person.pcf: line 184, column 38
    function value_79 () : dynamic.Dynamic {
      return asClaimContact().Contact.LicenseNumber
    }
    
    // 'value' attribute on TextInput (id=LicenseState) at ClaimSnapshotContact800DV.person.pcf: line 189, column 38
    function value_82 () : dynamic.Dynamic {
      return asClaimContact().Contact.LicenseState
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ClaimSnapshotContact800DV.person.pcf: line 199, column 38
    function value_85 () : dynamic.Dynamic {
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotContact800DV.person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotContact800DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Role) at ClaimSnapshotContact800DV.person.pcf: line 29, column 46
    function valueRoot_6 () : java.lang.Object {
      return Role
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotContact800DV.person.pcf: line 42, column 46
    function value_11 () : dynamic.Dynamic {
      return Role.Comments
    }
    
    // 'value' attribute on TextCell (id=Role) at ClaimSnapshotContact800DV.person.pcf: line 29, column 46
    function value_4 () : dynamic.Dynamic {
      return Role.Role
    }
    
    // 'value' attribute on TextCell (id=Owner) at ClaimSnapshotContact800DV.person.pcf: line 33, column 59
    function value_7 () : java.lang.String {
      return util.Snapshot.getRoleOwner(Role)
    }
    
    // 'value' attribute on TextCell (id=Active) at ClaimSnapshotContact800DV.person.pcf: line 37, column 65
    function value_9 () : java.lang.String {
      return util.Snapshot.renderValue(Role.Active)
    }
    
    property get Role () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}