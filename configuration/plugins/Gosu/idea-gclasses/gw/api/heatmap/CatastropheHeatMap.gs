package gw.api.heatmap

uses gw.api.locale.DisplayKey
uses gw.api.heatmap.HeatMapGenerator
uses gw.api.heatmap.HeatMapLegend
uses gw.api.heatmap.LatLong
uses gw.api.suite.GuidewireSuiteUtil
uses gw.api.util.CurrencyUtil
uses gw.pl.persistence.core.Key
uses java.awt.Color
uses java.io.ByteArrayOutputStream
uses javax.servlet.http.HttpServletRequest
uses javax.servlet.http.HttpServletResponse
uses java.util.Date
uses javax.imageio.ImageIO
uses gw.api.system.CCConfigParameters
uses gw.transaction.Transaction
uses java.util.List


@Export
class CatastropheHeatMap extends HeatMapGenerator {
  
  /** Database key for the selected catastrophe */
  var catKey : Key as CatastropheKey  
  /** Claim Status setting to filter on */
  var claimState : ClaimState as ClaimState
  /** Claim Reported Date to filter on */
  var reportedDateRange : DateRangeChoiceType as ReportedDateRange
  /** Claim Assigned To Group to filter on */
  var assignedGroup : Object as AssignedToGroup
  /** Policy Location filter setting (all, with, without) */
  var _policyLocations : CatastropheSearchCriteria.PolicyGroupFilter as PolicyLocations
  /** The list of Map Views */
  var _views : CatastropheHeatMapViews as MapViews
  /** The current Map View */
  var _view : CatastropheHeatMapViews.CatastropheHeatMapView as MapView
  
  /** The claims data set */
  var _claimsDataSet : CatastropheClaimDataSet as ClaimsDataSet
  /** The policy location data set */
  var _policyLocationDataSet : CatastrophePolicyLocationDataSet as PolicyLocationDataSet
  /** Class containing GUI logic that's outside the heat map itself */
  var _catastropheSearchCriteria : CatastropheSearchCriteria as CatastropheSearchCriteria
  
  /** The second legend in .png format */
  public var Legend2Image : byte[]

  /**
   * Constructor. 
   * @param mapName The name of the map, used as a handle to identify the state associated with a map
   * and to distinguish between multiple maps.  Multiple maps can be on a single screen
   * or on different screens.
   * <p>
   * The map name must be unique across all screens to create independent maps.
   * If a map name is reused on two screens, then the map state (e.g. query, centerpoint, zoom level)
   * will be shared across those screens.
   */
  construct(aMapName : String) {
    super(aMapName)
    setSize(800, 400)
    // '-inputEl' suffix added in html, 'mapSelectionMessage' should match CatSearchScreen.pcf input
    SelectionMessageID = "mapSelectionMessage-inputEl"
    AreaOfInterestColor = new Color(181, 181, 181)  // medium grey
    MapViews = new CatastropheHeatMapViews(this)
    ClaimsDataSet = new CatastropheClaimDataSet(this)
    PolicyLocationDataSet = new CatastrophePolicyLocationDataSet(this)
  }

  /**
   * Set the map view and initialize parameters for that map view.
   */
  property set MapView(aView : CatastropheHeatMapViews.CatastropheHeatMapView) {
    _view = aView
    _view.setParms()
  }

  /** Set the Map View dropdown, representing the Claim Counts view as null */
  property set MapViewDropdown(aView : CatastropheHeatMapViews.CatastropheHeatMapView) {
    MapView = aView != null ? aView : MapViews.ClaimCountsView 
  }
  /** Get the Map View dropdown, returning the Claim Counts view for null */
  property get MapViewDropdown() : CatastropheHeatMapViews.CatastropheHeatMapView {
    return MapView != MapViews.ClaimCountsView ? MapView : null 
  }
  
  /** Returns true if the current map view shows claims. */
  function hasClaims() : boolean {
    return MapView != null && MapViews.ClaimViews.contains(MapView)
  }

  /** Returns true if the current map view shows policy locations. */
  function hasPolicyLocations() : boolean {
    return MapView != null && MapViews.PolicyLocationViews.contains(MapView)
  }

  /** Generate the message shown when the user selects an area on the map. */
  override property get SelectionMessage() : String {
    return MapView.SelectionMessage
  }

  /**
   * Generate the legend icon (or icons, for the Claims and Policy Locations view) for the selected map view.
   */
  function generateLegendIcons() {
    setLegendImage(new HeatMapLegend().generateLegendIcon(DataSets[0].ColorMap, MapView.LegendTitle))
    if (MapView.Legend2Title != null) {
      var renderedImage = new HeatMapLegend().generateLegendIcon(DataSets[1].ColorMap, MapView.Legend2Title)
      var out = new ByteArrayOutputStream()
      ImageIO.write(renderedImage, "png", out)
      Legend2Image = out.toByteArray()
    } else {
      Legend2Image = null
    }
  }

  /**
   * Extend the web request handler to serve up a second icon, used in the Claims and Policy Locations views.
   */
  override function handleRequest(servletRequest : HttpServletRequest, servletResponse : HttpServletResponse) {
    super.handleRequest(servletRequest, servletResponse)
    if (servletRequest.getParameter("legend2") != null) {
      // send the 2nd legend icon
      if (Legend2Image != null) {
        servletResponse.setHeader("Content-Type", "image/png");
        servletResponse.getOutputStream().write(Legend2Image)
      }
    } 
  }
  
  /**
   * Generate tooltips.  This is called each time the user clicks on the map.
   * 
   * @param point latitude and longitude of the point the user clicked.
   */
  override function getToolTip(point : LatLong) : String {
    var tooltip : String

    // look for claims/policies in an area the size of a marker
    var scale = MAX_ZOOM - Zoom
    var ttY = latToY(point.Lat)
    var ttX = lngToX(point.Long)
    var lowOffset = (MarkerSize << scale)/2
    var highOffset = ((MarkerSize) << scale) - lowOffset

    var ttTopLeft = new LatLong(yToLat(ttY + highOffset), xToLng(ttX - lowOffset))
    var ttBottomRight = new LatLong(yToLat(ttY - lowOffset), xToLng(ttX + highOffset))

    var claimPoints = hasClaims() ? ClaimsDataSet.generateSelectedSetOfPoints(ttTopLeft, ttBottomRight) : null
    var plPoints = hasPolicyLocations() ? PolicyLocationDataSet.generateSelectedSetOfPoints(ttTopLeft, ttBottomRight) : null
    var clCount = claimPoints.Count
    var plCount = plPoints.Count

    if (clCount + plCount > 1) {
      // show tooltip for multiple claims/policy locations
      tooltip = showMultiplePointTooltip(clCount, plCount)
    } else if (clCount == 1) {
      // show claim tooltip
      tooltip = showClaimTooltip(claimPoints[0] as CatastropheClaimLatLong)
    } else if (plCount == 1) {
      // show policy location tooltip
      tooltip = showPolicyLocationTooltip(plPoints[0] as CatastrophePolicyLocationLatLong)
    } else {
      tooltip = wrapToolTip("", null)
    }
    return tooltip
  }

  /**
   * Show a tooltip for multiple claims/policy locations
   * 
   * @param clCount the number of claims at the clicked point
   * @param plCount the number of policy locations at the clicked point
   */
  function showMultiplePointTooltip(clCount : int, plCount : int) : String {
    var tooltip : String
      if (clCount > 0 and plCount > 0) {
        if (clCount == 1) {
          tooltip = plCount == 1 ? DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.MultipleClaimsAndPolicyLocationsSS", clCount, plCount)
                                 : DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.MultipleClaimsAndPolicyLocationsSP", clCount, plCount)
        } else {
          tooltip = plCount == 1 ? DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.MultipleClaimsAndPolicyLocationsPS", clCount, plCount)
                                 : DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.MultipleClaimsAndPolicyLocationsPP", clCount, plCount)
        }
      } else if (clCount > 0) {
        tooltip = DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.MultipleClaims", clCount)
      } else {
        tooltip = DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.MultiplePolicyLocations", plCount)
      }
    return wrapToolTip(tooltip, null)
  }
  
  /**
   * Show a claim tooltip
   * 
   * @param claimPoint the selected claim 
   */
  function showClaimTooltip(claimPoint : CatastropheClaimLatLong) : String {
    var tooltip : String     
    var position : LatLong
     
    var claim : Claim
    Transaction.runWithNewBundle(\ bundle -> { claim = bundle.loadBean(claimPoint.ClaimID) as Claim })

    if (claim == null || claim.Retired) {      
      tooltip = DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.ClaimRemoved")
    } else {
      var ll = claim.LossLocation;
      position = new LatLong(claimPoint.Lat, claimPoint.Long)
    
      var claimNumberPart = 
          claim.State == TC_DRAFT
          ? claim.ClaimNumber + "<br>"
          : "<a href=\"javascript:void(0)\" onmousedown=\"window.parent.parent.location='./ClaimSummaryLink.do?claimNumber=" + claim.ClaimNumber + "'\">" +
              claim.ClaimNumber + "</a> " + "<br>"
            
      var names = claim.ClaimantNames.Count > 0
                  ? claim.ClaimantNames.join(DisplayKey.get("Web.Claim.Claimant.Seperator"))
                  : claim.reporter
      var namesAddrPart = names + "<br>" +
                ll.DisplayName  +
              " <br>"        
            
      var amount = CurrencyUtil.renderAsCurrency(claim.ClaimRpt.TotalIncurredNet)
      tooltip = claim.ClaimantNames.Count > 0
                ? DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.ClaimTooltipClaimant", claimNumberPart, namesAddrPart, amount)
                : DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.ClaimTooltipReporter", claimNumberPart, namesAddrPart, amount)
    }
    return wrapToolTip(tooltip, position)
  }
  
  /**
   * Show a policy location tooltip
   * 
   * @param policyLocationPoint the selected policy location
   */
  function showPolicyLocationTooltip(policyLocationPoint : CatastrophePolicyLocationLatLong) : String {
    var tooltip : String
    var position : LatLong 
    var cat : Catastrophe
    var pls : PolicyLocationSummary
    Transaction.runWithNewBundle(\ bundle -> {
      cat = bundle.loadBean(CatastropheKey) as Catastrophe
      pls = bundle.loadBean(policyLocationPoint.PolicyLocationSummaryID) as PolicyLocationSummary
    })

    if (pls != null) { 
      var maybeLink = pls.PolicyNumber
      if (canJumpToPolicySystem()) {
        var url = getPolicySystemURLWithParms(pls.PolicyNumber, cat.PolicyEffectiveDate)
        maybeLink =  "<a href=\"javascript:window.open('" + url + "', 'PolicyCenter', 'menubar=yes,resizable=yes,scrollbars=yes', true).focus()\">" + pls.PolicyNumber + "</a>"
      }
      position = new LatLong(policyLocationPoint.Lat, policyLocationPoint.Long)
      tooltip = DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.PolicyLocationTooltip", 
                maybeLink + "<br>",
                pls.InsuredName + "<br>" +
                pls.DisplayName +
                " <br>",
                CurrencyUtil.renderAsCurrency(pls.TotalInsured))
    } else {
      tooltip = DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.PolicyLocationRemoved")
    }
    return wrapToolTip(tooltip, position)  
  }

  /**
   * Returns true if CC is configured to download policy locations from PolicyCenter or another policy system.
   * Default is: "pc" in suite-config.xml is set and the BatchProcess type for the Catastrophe Policy Location Download batch process
   * has at least one category, such as UIRunnable or Schedulable.  If Schedulable is set, then add a CronSchedule in scheduler-config.xml.
   */
  public static function isPolicyLocationDownloadConfigured() : boolean {
    return CCConfigParameters.HeatMapPolicyLocationDemo.Value or 
      (getPolicySystemURL() != null and BatchProcessType.TC_CATASTROPHEPOLICYLOCATIONDOWNLOAD.Categories.Count > 0)
  }
  
  /**
   * Return true if it's possible to open the policy in the policy system in a browser window.
   * Return false to disable jumping to the policy system.
   */
  public static function canJumpToPolicySystem() : boolean {
    return getPolicySystemURL() != null
  }
  
  /**
   * Return the URL for jumping to the policy system in a browser window.
   * Override for policy systems other than PolicyCenter
   */
  public static function getPolicySystemURL() : String {    
    return GuidewireSuiteUtil.getProductInfo("pc").Url
  }
  
  /**
   * Get the policy system URL with the policy number and effective date substituted into it.
   * Override for policy systems other than PolicyCenter.
   * 
   * @param policyNumber the policy number
   * @param effectiveDate the effective or as-of date to display
   */
  public function getPolicySystemURLWithParms(policyNumber : String, effectiveDate : Date) : String {    
    return "${getPolicySystemURL()}/PolicyAsLossDate.do?policyNumber=${policyNumber}&asOfDate=${effectiveDate}"
  }

  /**
   * Substitutes values into the HTML and JavaScript templates for the heat map page.
   * 
   * @param mapOption a value passed back from the browser indicating to use a variation of the map's HTML
   */
  override function renderMapTemplate(mapOption : String) : String {
    return CatastropheHeatMapHTML.renderToString(this, HeatMapTemplate, mapOption)
  }

  /**
   * Generates a list of the claims inside the selection rectangle.
   */
  property get SelectedClaims() : List<Key> {
    return ClaimsDataSet.generateSelectedSetOfPoints(SelectionPoint1, SelectionPoint2).map(\ l -> (l as CatastropheClaimLatLong).ClaimID)
  }
  
  /**
   * Generates a list of the policy locations inside the selection rectangle.
   */
  property get SelectedPolicyLocations() : List<Key> {
    return PolicyLocationDataSet.generateSelectedSetOfPoints(SelectionPoint1, SelectionPoint2).map(\ l -> (l as CatastrophePolicyLocationLatLong).PolicyLocationSummaryID)
  }

}