package gw.api.heatmap

uses gw.api.admin.BaseAdminUtil
uses gw.api.database.Query
uses gw.api.database.QuerySelectColumns
uses gw.api.financials.CurrencyAmount
uses gw.api.locale.DisplayKey
uses gw.api.path.Paths
uses gw.api.search.MaxSearchResults
uses gw.api.util.LocationUtil
uses gw.cc.domain.group.GroupFilter
uses gw.entity.TypeKey
uses gw.transaction.Transaction
uses gw.pl.persistence.core.Key

uses java.lang.Math
uses java.lang.UnsupportedOperationException
uses java.util.ArrayList
uses java.util.HashMap
uses gw.api.database.IQueryBeanResult
uses java.util.List

/**
 * Provides GUI logic for the catastrophe heat map and holds state for the catastrophe search screen that persists for the life of the session.
 */
@Export
class CatastropheSearchCriteria {
  static final var CLAIM_ID = "ClaimID"
  static final var CLAIM_NUMBER = "ClaimNumber"
  static final var CLAIM_LOCATION_SUMMARY_ID = "ClaimLocationSummaryID"

  /** The heat map */
  var _map : CatastropheHeatMap as HeatMap

  /** Catastrophe dropdown setting shown in the screen (can differ from the map only when it's just changed but before the map has been updated) */
  var _selectedCatastropheKey : Key as SelectedCatastropheKey

  /** Top left/northwestern corner of the catastrophe area of interest */
  var _areaOfInterestPoint1 : LatLong as AreaOfInterestPoint1
  /** Bottom right/southeastern corner of the catastrophe area of interest */
  var _areaOfInterestPoint2 : LatLong as AreaOfInterestPoint2
  
  /** Is true if the map is being shown on the Admin Catastrophe detail page */
  var _onCatAdminPage : boolean as OnCatAdminPage

  // limits on the size of the tables
  /** Maximum number of entries to show in the CLaim and Policy Location tables */
  var _maxRows : int as MaxRows = MaxSearchResults.forClaims() 
  /** Maximum number of bind variables supported by the database, where Integer.MAX_VALUE means no known limit. */
  var _maxNumberOfBindVariables : int as MaxNumberOfBindVariables = HeatMapGenerator.getMaxNumberOfBindVariables()
  /** The lesser of MaxRows and MaxNumberOfBindVariables */
  var _maxPointsForSearch : int as MaxPointsForSearch = Math.min(MaxNumberOfBindVariables, MaxRows)

  // data for the table
  /** Data displayed in the claim table */
  var _catSearchClaimResults : IQueryBeanResult<ClaimSearchView> as CatSearchClaimResults
  /** Data displayed in the policy location table */
  var _catSearchPolicyLocationResults : List<PolicyLocationSearchResult> as CatSearchPolicyLocationResults

  /** If true, show the map on the screen */
  var _mapVisible : boolean as MapVisible = false
  /** If true, show the table(s) on the screen */
  var _tableVisible : boolean as TableVisible = false
  
  /** Identifies the catastrophe to display when entering the map by jumping from the Admin Catastrophe detail page. */
  var _gotoCatastropheKey : Key as GotoCatastropheKey

  /** True indicates the user has just entered the map page from another page.  False indicates the user was already on the map page. 
   * Note: Pebbles evaluates variables with recalculateOnRefresh=true twice
   */
  var _enterPage : boolean as EnterPage
  
  // ---

  /** 
   * Upon first entry to the map page in the session, constructs the CatastropheSearchCriteria and HeatMapGenerator objects.
   * Upon subsequent entries to the page, returns the previous CatastropheSearchCriteria and HeatMapGenerator objects to preserve
   * settings such as which catastrophe, the map position, selection rectangle, zoom level and filter settings.
   * 
   * @param AnEnterPage True indicates the user entered the map page from some other page, false indicates the user was on the map page.
   * @param gotoCatstrophe If non-null, display this catastrophe, otherwise display the saved catastrophe
   * @param mapName A handle that identifies the HeatMapGenerator instance, allowing multiple independent maps on one or across multiple
   * pages (by using different mapNames) as well as sharing a single map instance and it's settings on multiple pages (by using the same
   * mapName in multiple pages).
   */  
  static function getCriteria(AnEnterPage : boolean, gotoCatastrophe : Catastrophe, mapName : String) : CatastropheSearchCriteria {
    var context = (HeatMapGenerator.getMap(mapName) as CatastropheHeatMap).CatastropheSearchCriteria
    if (context == null) {
      // first entry to the map page in the session
      context = new CatastropheSearchCriteria()    
      context.HeatMap = new CatastropheHeatMap(mapName)
      context.HeatMap.CatastropheSearchCriteria = context
      context.HeatMap.CatastropheKey = null
    }
    context.EnterPage = AnEnterPage
    context.GotoCatastropheKey = gotoCatastrophe.ID
    context.OnCatAdminPage = mapName == "CatPolicyMap"
    if (AnEnterPage) {
      // user entered the page from elsewhere
      context.enterPage()
    }
    return context
  }
  
  /** Initalize settings when entering the map */
  function enterPage() {
    SelectedCatastropheKey = HeatMap.CatastropheKey
    var jumpToMapAndChangeCat = GotoCatastropheKey != null && GotoCatastropheKey != HeatMap.CatastropheKey
    if (jumpToMapAndChangeCat) {
      SelectedCatastropheKey = GotoCatastropheKey
    }
    if (HeatMap.MapView == null or jumpToMapAndChangeCat) {
      // initial entry to map, or jump to the map from another page and change cat
      HeatMap.MapView = CatastropheHeatMap.isPolicyLocationDownloadConfigured()
                        ? HeatMap.MapViews.ClaimCountsWithPoliciesView
                        : HeatMap.MapViews.ClaimCountsView
      HeatMap.ClaimState = null
      HeatMap.ReportedDateRange = null
      HeatMap.AssignedToGroup = null
      HeatMap.PolicyLocations = PL_WITHOUT_CLAIM
    }
    HeatMap.RefreshUponSelection = not OnCatAdminPage
  }
  
  /** The catastrophe selected by the catastrophe dropdown */
  property get SelectedCatastrophe() : Catastrophe {
    // to avoid keeping the catastrophe object in memory while user is on another page
    return Transaction.getCurrent().loadBean(SelectedCatastropheKey) as Catastrophe
  }
  
  /** Save the catastrophe key for the catastrophe shown in the catastrophe dropdown */
  property set SelectedCatastrophe(cat : Catastrophe) {
    SelectedCatastropheKey = cat.ID
  }

  /** Update the map and table when a filter option or the selection has changed */
  function updateMapAndTable() : boolean {  // return value is not meaningful
    if (EnterPage or not HeatMapGenerator.isHeatMapConfigured()) // filter out duplicate call when entering page, ignore call if map not configured
      return true

    var changingCat = HeatMap.CatastropheKey != SelectedCatastropheKey

    if (SelectedCatastrophe.TopLeftLatitude != null) {
      AreaOfInterestPoint1 = new LatLong(SelectedCatastrophe.TopLeftLatitude as double, SelectedCatastrophe.TopLeftLongitude as double)
      AreaOfInterestPoint2 = new LatLong(SelectedCatastrophe.BottomRightLatitude as double, SelectedCatastrophe.BottomRightLongitude as double)
    } else {
      AreaOfInterestPoint1 = null
      AreaOfInterestPoint2 = null
    }
    HeatMap.setAreaOfInterest(AreaOfInterestPoint1, AreaOfInterestPoint2)

    if (changingCat) {
      // do the map query
      MapVisible = SelectedCatastropheKey != null

      HeatMap.CatastropheKey = SelectedCatastropheKey

      var totalPoints = (HeatMap.hasClaims() ? HeatMap.ClaimsDataSet.MapPoints.Count : 0) +
                        (HeatMap.hasPolicyLocations() ? HeatMap.PolicyLocationDataSet.MapPoints.Count : 0)
      if (totalPoints == 0 and (SelectedCatastropheKey != null)
          and not OnCatAdminPage) { // no message on cat admin page
        LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NoDataToShow"))
      }

      // switching to a different cat, clear the table and selection, reset the center/zoom
      TableVisible = false
      HeatMap.setSelection(null, null)
      HeatMap.computeBoundingBox()
    }
    
    if (MapVisible) {  // if the map is showing, generate the HTML (and the legend in case the language has changed)
      HeatMap.AutoScale = changingCat
      HeatMap.generateLegendIcons()
      if (HeatMap.setupTemplate()) {
        HeatMap.MapFrameHTML = HeatMap.renderMapTemplate("")  // need this to pass the previous center/zoom/selection for refresh
      } else {
        LocationUtil.addRequestScopedErrorMessage(DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.CantFindTemplateClass", HeatMap.HeatMapServiceTemplateName))
      }
    }

    if (HeatMap.SelectionPoint1 != null and not OnCatAdminPage)
      tableQuery()
      
    return true
  }
  
  property get ClaimTableData() : IQueryBeanResult<ClaimSearchView> {
    var rv = CatSearchClaimResults
    if (!EnterPage)
      CatSearchClaimResults = null    // avoid tying up memory for query result when we leave the page
    return rv
  }

  /** Represents a single policy location table entry */
  static class PolicyLocationSearchResult {
    private var _PolicyLocationSummaryID : Key as PolicyLocationSummaryID
    private var _claimNumber : String as ClaimNumber
    private var _claimID : Key as ClaimID
    private var _insuredName : String as InsuredName
    private var _policyNumber : String as PolicyNumber 
    private var _addressLine1 : String as AddressLine1
    private var _city : String as City    
    private var _Phone : String as Phone
    private var _totalInsured : CurrencyAmount as TotalInsured   

    construct (aPolicyLocationSummaryID : Key, aClaimNumber : String, aClaimID : Key, anInsuredName : String, aPolicyNumber : String, anAddressLine1 : String, aCity : String, aPhone : String, aTotalInsured : CurrencyAmount) {
      PolicyLocationSummaryID = aPolicyLocationSummaryID
      ClaimNumber = aClaimNumber
      ClaimID = aClaimID
      InsuredName = anInsuredName
      PolicyNumber = aPolicyNumber
      AddressLine1 = anAddressLine1
      City = aCity
      Phone = aPhone
      TotalInsured = aTotalInsured
    }
    
    construct(aPolicyLocationSummaryID : Key, aClaimNumber : String, aClaimID : Key) {
      PolicyLocationSummaryID = aPolicyLocationSummaryID
      ClaimNumber = aClaimNumber
      ClaimID = aClaimID
    }
  }
  
  property get PolicyLocationTableData() : List<PolicyLocationSearchResult> {
    var rv = CatSearchPolicyLocationResults
    if (!EnterPage)
      CatSearchPolicyLocationResults = null    // avoid tying up memory for query result when we leave the page
    return rv
  }


  /** Keep track of previous control (filter) settings */
  class PreviousControlSettings {
    var _prevSelectionPoint1 : LatLong
    var _prevSelectionPoint2 : LatLong
    var _prevClaimState : ClaimState
    var _prevReportedDateRange : DateRangeChoiceType
    var _prevAssignedGroup : Object
    var _prevPolicyLocations : CatastropheSearchCriteria.PolicyGroupFilter
    var _prevMapView : CatastropheHeatMapViews.CatastropheHeatMapView

   
    function wereSettingsChanged() : boolean {
      return    _prevSelectionPoint1 != HeatMap.SelectionPoint1
             or _prevSelectionPoint2 != HeatMap.SelectionPoint2
             or _prevClaimState != HeatMap.ClaimState
             or _prevReportedDateRange != HeatMap.ReportedDateRange
             or _prevAssignedGroup !== HeatMap.AssignedToGroup
             or _prevPolicyLocations !== HeatMap.PolicyLocations
             or _prevMapView !== HeatMap.MapView
    }
    
    function saveCurrentSettings() {
      _prevSelectionPoint1 = HeatMap.SelectionPoint1
      _prevSelectionPoint2 = HeatMap.SelectionPoint2
      _prevClaimState = HeatMap.ClaimState
      _prevReportedDateRange = HeatMap.ReportedDateRange
      _prevAssignedGroup = HeatMap.AssignedToGroup
      _prevPolicyLocations = HeatMap.PolicyLocations
      _prevMapView = HeatMap.MapView
    }
  }
  
  var _previousSettings : PreviousControlSettings as PreviousControlSettings = new PreviousControlSettings() 
  
  /** Perform the query for the claim and policy location tables */
  private function tableQuery() {
    TableVisible = true

    var changedSelection = PreviousControlSettings.wereSettingsChanged()
    PreviousControlSettings.saveCurrentSettings()

    var showClaims = true
    var showPolicyLocations = true  
    // check for too many points to pass in a query
    if (HeatMap.hasClaims() and HeatMap.ClaimsDataSet.CountOfPointsSelected > MaxPointsForSearch) {
      if (changedSelection) {
        LocationUtil.addRequestScopedErrorMessage(DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.TooManyPoints", MaxPointsForSearch))
      }
      CatSearchClaimResults = null  // show empty table if too many results
      showClaims = false
    }
    if (HeatMap.hasPolicyLocations() and HeatMap.PolicyLocationDataSet.CountOfPointsSelected > MaxPointsForSearch) {
      if (changedSelection) {
        LocationUtil.addRequestScopedErrorMessage(DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.TooManyPolicyLocationPoints", MaxPointsForSearch))
      }
      CatSearchPolicyLocationResults = null  // show empty table if too many results
      showPolicyLocations = false
    }
    
    var claimCount = 0
    if (HeatMap.hasClaims() and showClaims) {
      CatSearchClaimResults = CCHeatMapGeneratorUtils.performHeatMapClaimSearch(HeatMap.SelectedClaims)
      // use count from query instead of from map selection to account for security filtering
      claimCount = CatSearchClaimResults.getCountLimitedBy(MaxRows+1)
      if (changedSelection and claimCount != HeatMap.ClaimsDataSet.CountOfPointsSelected) {
        LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.SecurityFiltered"))
      }
    }
    
    var policyCount = 0
    if (HeatMap.hasPolicyLocations() and showPolicyLocations) {
      CatSearchPolicyLocationResults = performHeatMapPolicyLocationSearch(HeatMap.SelectedPolicyLocations)
      policyCount = CatSearchPolicyLocationResults.Count
    }  
    
    if (claimCount == 0 and policyCount == 0) {
      TableVisible = false
      if (changedSelection) {
        LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NoResults"))    
      }
    }
  }

  /** Perform the query for the policy location table */  
  function performHeatMapPolicyLocationSearch( policyLocations : List<Key>) : List<PolicyLocationSearchResult> {
    var query1 = Query.make(PolicyLocationSummary)
                      .compareIn("ID", policyLocations?.toTypedArray())
                      .select()
                      .map( \ row -> {
                        var displayAddress = row.AddressLine1Kanji.HasContent ? row.AddressLine1Kanji : row.AddressLine1
                        var displayCity = row.CityKanji.HasContent ? row.CityKanji : row.City
                        return new PolicyLocationSearchResult(row.ID, null, null, row.InsuredName, row.PolicyNumber,
                          displayAddress, displayCity, row.PhoneValue, row.TotalInsured)
                      })

    var query2 = Query.make(Claim)
                      .join("PolicyLocationSummaryJoin")
                      .join("PolicyLocationSummary")
                      .compareIn("PolicyLocationSummary.ID", policyLocations?.toTypedArray())
                      .select({QuerySelectColumns.pathWithAlias(CLAIM_LOCATION_SUMMARY_ID, Paths.make(Claim#PolicyLocationSummaryJoin, PolicyLocationSummaryJoin#PolicyLocationSummary, PolicyLocationSummary#ID)),
                          QuerySelectColumns.pathWithAlias(CLAIM_NUMBER, Paths.make(Claim#ClaimNumber)),
                          QuerySelectColumns.pathWithAlias(CLAIM_ID, Paths.make(Claim#ID))})
                      .transformQueryRow(\row -> new PolicyLocationSearchResult(row.getColumn(CLAIM_LOCATION_SUMMARY_ID) as Key,
                          row.getColumn(CLAIM_NUMBER) as String, row.getColumn(CLAIM_ID) as Key))
                      .toList()

    // do a join the old-fashioned way: copy claim fields from query2 into query1, add more query1 entries where needed
    var map = new HashMap<Key, PolicyLocationSearchResult>(query1.Count)
    query1.each(\ q1Entry -> map.put(q1Entry.PolicyLocationSummaryID, q1Entry))
    for (q2Entry in query2) {
      var q1Entry = map.get(q2Entry.PolicyLocationSummaryID)
      if (q1Entry.ClaimID == null) {
        // copy fields
        q1Entry.ClaimID = q2Entry.ClaimID
        q1Entry.ClaimNumber = q2Entry.ClaimNumber
      } else {
        // add a new q1 entry
        var addedEntry = new PolicyLocationSearchResult(q1Entry.PolicyLocationSummaryID, q2Entry.ClaimNumber, q2Entry.ClaimID, q1Entry.InsuredName,
                                                        q1Entry.PolicyNumber, q1Entry.AddressLine1, q1Entry.City, q1Entry.Phone, q1Entry.TotalInsured)
        query1.add(addedEntry)
      }
    }
    return query1
  }
    
  static private var dateFilterChoices : List<DateRangeChoiceType>

  /** Date filter typekeys for category "claim" (filter choices are in the past) */
  static function dateFilterChoices() : List<DateRangeChoiceType> {
    if (dateFilterChoices == null) {
      var choices = DateRangeChoiceType.getTypeKeys(false)
      dateFilterChoices = choices.where(\ choice -> (choice.Categories?.toList() as ArrayList<TypeKey>)
                                                    .where(\ d -> d.Code == "claim").HasElements)
    }
    return dateFilterChoices  
  }

  /** Group filter choices */
  static function groupFilterChoices() : List<Object> {
     var choices = new ArrayList<Object>()
     choices.add(GroupFilter.ASSIGNED_TO_ANY)
     choices.add(GroupFilter.UNASSIGNED)
     choices.addAll(BaseAdminUtil.getGroupsForCurrentUser())
     return choices
  }

  /** Policy location filter choices */
  static function policyLocationFilterChoices() : List<Object> {
     var choices = new ArrayList<Object>()
     choices.add(PL_WITH_CLAIM)
     choices.add(PL_WITHOUT_CLAIM)
     return choices
  }
  
  abstract static class PolicyGroupFilter implements GroupFilter {
    override public function filter(xxx : Key) : boolean {
      throw new UnsupportedOperationException()
    }
    abstract public function filter(hasClaim : boolean) : boolean
  }

  public static final var PL_WITH_CLAIM : PolicyGroupFilter = new PolicyGroupFilter() {
    override property get Name() : String {
      return "With"
    }
    override public function toString() : String {     
      return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.PolicyLocationsWith")
    }
    override public function filter(hasClaim : boolean) : boolean {
      return hasClaim
    }
  }

  public static final var PL_WITHOUT_CLAIM : PolicyGroupFilter = new PolicyGroupFilter() {
    override property get Name() : String {
      return "Without"
    }
    override public function toString() : String {
      return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.PolicyLocationsWithout")
    }
    override public function filter(hasClaim : boolean) : boolean {
      return not hasClaim
    }
  }
}
