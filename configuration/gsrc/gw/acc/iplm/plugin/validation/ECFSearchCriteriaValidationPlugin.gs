package gw.acc.iplm.plugin.validation

uses entity.ClaimInfoCriteria
uses gw.api.locale.DisplayKey
uses gw.plugin.validation.SearchCriteriaValidationPlugin
uses org.apache.commons.lang.StringUtils


class ECFSearchCriteriaValidationPlugin extends SearchCriteriaValidationPlugin {

  /**
   * Validate the search criteria for Search/Claims/Simple Search and
   * Search/Claims/Advanced Search with source of "Archived", e.g.
   * the user provided enough data to run the search.
   * <p>
   * This has been modified to include ECF Criteria (UMR and UCR).
   *
   * @param searchCriteria the search criteria to validate
   * @return null if the criteria are valid, otherwise a user-displayable error message string
   */
  override function validateCanSearchSimple(searchCriteria: ClaimInfoCriteria): String {
    return (
        searchCriteria.ClaimNumber.HasContent or
            searchCriteria.PolicyNumber.HasContent or
            (searchCriteria.NameCriteria.isSet() and searchCriteria.NameSearchType != null)
            or StringUtils.isNotBlank(searchCriteria.UCR_Ext)
            or StringUtils.isNotBlank(searchCriteria.UMR_Ext))

        ? null
        : DisplayKey.get("Accelerator.IPLM.Web.MessageSuspenseQueue.ApplyToClaim.SimpleSearchValidation")
  }

  /**
   * Validate the search criteria for Claims/Advanced Search with source of "Active Database", e.g.
   * the user provided enough data to run the search.
   * <p>
   * This has been modified to include ECF Criteria (UMR and UCR).
   *
   * @param searchCriteria the search criteria to validate
   * @return null if the criteria are valid, otherwise a user-displayable error message string
   */
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
            searchCriteria.licensePlate.HasContent or
            StringUtils.isNotBlank(searchCriteria.UCR_Ext) or
            StringUtils.isNotBlank(searchCriteria.UMR_Ext))
        ? null
        : DisplayKey.get("Accelerator.IPLM.Web.MessageSuspenseQueue.ApplyToClaim.SearchValidation")
  }

}