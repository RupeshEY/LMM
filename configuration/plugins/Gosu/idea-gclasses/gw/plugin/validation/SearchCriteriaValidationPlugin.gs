package gw.plugin.validation

uses entity.ClaimInfoCriteria
uses gw.api.locale.DisplayKey

@Export
class SearchCriteriaValidationPlugin implements ISearchCriteriaValidationPlugin {

  override function validateCanSearch(searchCriteria: ActivitySearchCriteria): String {
    if (not(
        searchCriteria.ClaimNumber.HasContent or
            searchCriteria.AssignedToGroup.Set or
            searchCriteria.AssignedToUser != null or
            searchCriteria.CreatedByUser != null or
            searchCriteria.ExternalOwner != null))
      return DisplayKey.get("Java.SearchCriteria.Validation.ActivitySearchCriteria")
    else if (searchCriteria.CompletedLate and ActivityStatus.TC_OPEN == searchCriteria.ActivityStatus)
      return DisplayKey.get("Java.Activity.Error.OpenAndCompletedLateNotAllowed")
    else if (searchCriteria.CompletedLate and searchCriteria.OverdueNow)
      return DisplayKey.get("Java.Activity.Error.OverdueNowCompletedLateNotAllowed")

    else if (searchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_ENTEREDRANGE
        and searchCriteria.DateCriterionChoice.EndDate < searchCriteria.DateCriterionChoice.StartDate) {
      return DisplayKey.get('JSP.ClaimSearch.Claims.DateSearch.InvalidDates')
    }
    return null
  }

  override function validateCanSearch(searchCriteria: BulkInvoiceSearchCriteria): String {
    if (not(
        searchCriteria.ClaimNumber.HasContent or
            searchCriteria.InvoiceNumber.HasContent or
            searchCriteria.CheckNumber.HasContent or
            searchCriteria.NameCriteria.Set)
        ) {
      return DisplayKey.get("Java.SearchCriteria.Validation.BulkInvoiceSearchCriteria")
    } else if (searchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_ENTEREDRANGE
        and searchCriteria.DateCriterionChoice.EndDate < searchCriteria.DateCriterionChoice.StartDate) {
      return DisplayKey.get('JSP.ClaimSearch.Claims.DateSearch.InvalidDates')
    } else {
      return null
    }
  }

  override function validateCanSearch(searchCriteria: ClaimAssociationSearchCriteria): String {
    return (
        searchCriteria.Title.HasContent or
            searchCriteria.ClaimNumber.HasContent or
            searchCriteria.LossDate != null or
            searchCriteria.FirstName.HasContent or
            searchCriteria.LastName.HasContent or
            searchCriteria.CompanyName.HasContent or
            searchCriteria.FirstNameKanji.HasContent or
            searchCriteria.LastNameKanji.HasContent or
            searchCriteria.NameKanji.HasContent)
        ? null
        : DisplayKey.get("Java.SearchCriteria.Validation.ClaimAssociationSearchCriteria")
  }


  override function validateCanSearchSimple(searchCriteria: ClaimInfoCriteria): String {
    return (
        searchCriteria.ClaimNumber.HasContent or
            searchCriteria.PolicyNumber.HasContent or
            (searchCriteria.NameCriteria.isSet() and searchCriteria.NameSearchType != null))
        ? null
        : DisplayKey.get("Java.SearchCriteria.Validation.ClaimSearchCriteriaSimple")
  }

  override function validateCanSearchAdvanced(searchCriteria: ClaimSearchCriteria): String {
    if (searchCriteria.ArchivedSearch) {
      if (searchCriteria.ArchiveDateCriterionChoice.DateSearchType == DateSearchType.TC_ENTEREDRANGE
          and searchCriteria.ArchiveDateCriterionChoice.EndDate < searchCriteria.ArchiveDateCriterionChoice.StartDate) {
        return DisplayKey.get('JSP.ClaimSearch.Claims.DateSearch.InvalidDates')
      }
      return validateCanSearchSimple(searchCriteria)
    }

    if (searchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_ENTEREDRANGE
        and searchCriteria.DateCriterionChoice.EndDate < searchCriteria.DateCriterionChoice.StartDate) {
      return DisplayKey.get('JSP.ClaimSearch.Claims.DateSearch.InvalidDates')
    }

    return (
        searchCriteria.ClaimNumber.HasContent or
            searchCriteria.PolicyNumber.HasContent or
            (searchCriteria.NameCriteria.Set and searchCriteria.NameSearchType != null) or
            searchCriteria.AssignedToUser != null or
            searchCriteria.AssignedToGroup.Set or
            searchCriteria.Catastrophe != null or
            searchCriteria.vinNumber.HasContent or
            searchCriteria.CreatedByUser != null or
            searchCriteria.licensePlate.HasContent)
        ? null
        : DisplayKey.get("Java.SearchCriteria.Validation.ClaimSearchCriteriaAdvanced")
  }

  override function validateCanSearch(searchCriteria: PaymentSearchCriteria): String {
    if (not(
        searchCriteria.ClaimNumber.HasContent or
            searchCriteria.ApprovedByGroup.Set or
            searchCriteria.ApprovedByUser != null or
            searchCriteria.CreatedByUser != null or
            searchCriteria.CheckNumber.HasContent or
            searchCriteria.InvoiceNumber.HasContent or
            searchCriteria.NameCriteria.Set)
        ) {
      return DisplayKey.get("Java.SearchCriteria.Validation.PaymentSearchCriteria")
    } else if (searchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_ENTEREDRANGE
        and searchCriteria.DateCriterionChoice.EndDate < searchCriteria.DateCriterionChoice.StartDate) {
      return DisplayKey.get('JSP.ClaimSearch.Claims.DateSearch.InvalidDates')
    } else {
      return null
    }
  }

  override function validateCanSearch(searchCriteria: PolicySearchCriteria): String {
    return (
        searchCriteria.validateAtLeastOneFieldSet())
        ? null
        : DisplayKey.get("Java.SearchCriteria.Validation.PolicySearchCriteria")
  }

  override function validateCanSearch(searchCriteria: RecoverySearchCriteria): String {
    return (
        searchCriteria.ClaimNumber.HasContent or
            searchCriteria.CreatedByUser != null or
            searchCriteria.NameCriteria.Set)
        ? null
        : DisplayKey.get("Java.SearchCriteria.Validation.RecoverySearchCriteria")
  }

}
