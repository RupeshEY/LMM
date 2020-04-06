package gw.api.name

uses gw.api.locale.DisplayKey
uses java.util.Set

@Export
class SearchNameOwner extends NameOwnerBase {

  construct (nameCriteria : CCNameCriteria) {
    ContactName = new SearchContactNameDelegate(nameCriteria)
    AlwaysShowSeparateFields = true
  }

  construct (contact : ContactSearchCriteria) {
    ContactName = new UserSearchNameDelegate(contact)
    AlwaysShowSeparateFields = true
  }

  construct (claimAssociation : ClaimAssociationSearchCriteria) {
    ContactName = new ClaimAssociationNameDelegate(claimAssociation)
  }

  construct (searchCriteria : PolicySearchCriteria) {
    ContactName = new PolicySearchContactNameDelegate(searchCriteria)
    AlwaysShowSeparateFields = true
  }

  override property get RequiredFields() : Set <NameOwnerFieldId> {
    return NameOwnerFieldId.NO_FIELDS
  }

  override property get HiddenFields() : Set <NameOwnerFieldId> {
    return NameOwnerFieldId.HIDDEN_FOR_SEARCH
  }

  override property get ShowNameSummary() : boolean {
    return false
  }

  override function isHideIfReadOnly(fieldId : NameOwnerFieldId) : boolean {
    return false
  }

  // selects which display names to use to label name fields.  Valid values are "Payee" and "Payer";
  // other values will use the defaults from the superclass.
  var _nameLabelType : String as NameLabelType
  final static public var PAYEE : String = "Payee"
  final static public var PAYER : String = "Payer"

  override property get ContactNameLabel() : String {
    switch (NameLabelType) {
      case PAYEE: return DisplayKey.get("JSP.PaymentSearch.Payments.CompanyName")
      case PAYER: return DisplayKey.get("JSP.RecoverySearch.Recoveries.CompanyName")
      default:    return DisplayKey.get("JSP.ClaimSearch.Claims.CompanyName")
    }
  }

  override property get ContactNamePhoneticLabel() : String {
    switch (NameLabelType) {
      case PAYEE: return DisplayKey.get("JSP.PaymentSearch.Payments.CompanyNamePhonetic")
      case PAYER: return DisplayKey.get("JSP.RecoverySearch.Recoveries.CompanyNamePhonetic")
      default:    return DisplayKey.get("JSP.ClaimSearch.Claims.CompanyNamePhonetic")
    }
  }

  override property get FirstNameLabel() : String {
    switch (NameLabelType) {
      case PAYEE: return DisplayKey.get("JSP.PaymentSearch.Payments.FirstName")
      case PAYER: return DisplayKey.get("JSP.RecoverySearch.Recoveries.FirstName")
      default:    return super.FirstNameLabel
    }
  }

  override property get FirstNamePhoneticLabel() : String {
    switch (NameLabelType) {
      case PAYEE: return DisplayKey.get("JSP.PaymentSearch.Payments.FirstNamePhonetic")
      case PAYER: return DisplayKey.get("JSP.RecoverySearch.Recoveries.FirstNamePhonetic")
      default:    return super.FirstNamePhoneticLabel
    }
  }

  override property get LastNameLabel() : String {
    switch (NameLabelType) {
      case PAYEE: return DisplayKey.get("JSP.PaymentSearch.Payments.LastName")
      case PAYER: return DisplayKey.get("JSP.RecoverySearch.Recoveries.LastName")
      default:    return super.LastNameLabel
    }
  }

  override property get LastNamePhoneticLabel() : String {
    switch (NameLabelType) {
      case PAYEE: return DisplayKey.get("JSP.PaymentSearch.Payments.LastNamePhonetic")
      case PAYER: return DisplayKey.get("JSP.RecoverySearch.Recoveries.LastNamePhonetic")
      default:    return super.LastNamePhoneticLabel
    }
  }
}
