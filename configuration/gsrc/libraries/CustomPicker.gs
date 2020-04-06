package libraries

/**
 * Example use of the deprecated CustomPickerSearchCriteria. Should
 * not be used in any new code.
 */
@Export
class CustomPicker
{

  private construct()
  {
    // Enforces static only access
  }

  static // Sample Custom Picker search method
  function ExecuteSampleSearch( criteria: CustomPickerSearchCriteria): CustomPickerSearchResult[]
  {
    gw.api.util.Logger.logInfo( "Custom picker search got criteria: " + criteria.TextColumn );
    var result = criteria.createSearchResult();
    result.Name = "Result 1 Name";
    result.Description = "Result 1 Desc";
    var result2 = criteria.createSearchResult();
    result2.Name = "Result 2 Name";
    result2.Description = "Result 2 Desc";
    return new CustomPickerSearchResult[] {result};
  }
  

}
