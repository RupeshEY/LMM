package gw.api.heatmap
uses gw.api.locale.DisplayKey
uses gw.api.financials.CurrencyAmount
uses gw.api.util.CurrencyUtil
uses java.math.BigDecimal
uses java.awt.Color

/** Defines the map views visible on the catastrophe heat map */
@Export
class CatastropheHeatMapViews {
  
  /** Constructor */
  construct(aHeatMap : CatastropheHeatMap) {
    HeatMap = aHeatMap
    policyColorMap = new RangeColorMap({ new Color(250,158,135) })
    policyColorMap.Labels[0] = ""
  }

  /** Color map for dollar amounts, maps 0..1000 to Colors[0], 1001..2000 to Colors[1], and so forth */
  class AmountColorMap extends RangeColorMap {
    construct(anIncrement : int, aScale : int) {
      super(RangeColorMap.DEFAULT_COUNT_MAP.Colors, anIncrement, aScale) 
    }
  
    override function formatAmount(value : int) : String {
      return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.LegendAmount", value)
    }

    override function getColorForValue(value : int) : Color {
      return value == 0 ? Colors[0] : super.getColorForValue(value)
    }
  }

  var countColorMap = RangeColorMap.DEFAULT_COUNT_MAP
  var amountColorMap = new AmountColorMap(1000, 1000)
  var tivAmountColorMap = new AmountColorMap(100000, 1000)
  var policyColorMap : RangeColorMap

  /** The CatastropheHeatMap associated with these map views */
  var _heatMap : CatastropheHeatMap as HeatMap

  /** Abstract class that defines a single heat map */
  abstract class CatastropheHeatMapView {
    /** Name of the map view, for example, "Claims" */
    abstract property get FilterOptionLabel() : String
    /** Main legend title */
    abstract property get LegendTitle() : String
    /** Secondary legend title */
    property get Legend2Title() : String { return null }
    /** Message displayed when the user selects an area on the map, for example "99 claims selected". */
    abstract property get SelectionMessage() : String
    /** Call this method to initialize the map view */
    abstract function setParms()
  }
  
  /** The Claims view */
  public final var ClaimCountsView : CatastropheHeatMapView = new CatastropheHeatMapView() { 
    override property get FilterOptionLabel() : String { return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.Claims") }
    override property get LegendTitle() : String { return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumberOfClaims") }
    override property get SelectionMessage() : String {
      var count = HeatMap.ClaimsDataSet.CountOfPointsSelected
      return count == 1 ? DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumClaimsSelectedS", count)
                        : DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumClaimsSelectedP", count)
    }
    override function setParms() { 
      HeatMap.DataSets = { HeatMap.ClaimsDataSet }
      HeatMap.ClaimsDataSet.ColorMap = countColorMap
    }
  }

  /** The Claim total Incurred view */
  public final var ClaimTotalView : CatastropheHeatMapView = new CatastropheHeatMapView() { 
    override property get FilterOptionLabel() : String { return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.ClaimTotalIncurred") }
    override property get LegendTitle() : String { return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.TotalIncurred") }
    override property get SelectionMessage() : String { 
      var totalIncurred = CurrencyUtil.renderAsCurrency(new CurrencyAmount(new BigDecimal(HeatMap.ClaimsDataSet.SumOfSelectedPoints), CurrencyUtil.getDefaultCurrency()))
      var count = HeatMap.ClaimsDataSet.CountOfPointsSelected
      return count == 1 ? DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumClaimsSelectedWithIncurredS", count, totalIncurred)
                        : DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumClaimsSelectedWithIncurredP", count, totalIncurred)
    }
    override function setParms() { 
      HeatMap.DataSets = { HeatMap.ClaimsDataSet }
      HeatMap.ClaimsDataSet.ColorMap = amountColorMap
    }
  }

  /** The Claims with Policy Locations view */
  public final var ClaimCountsWithPoliciesView : CatastropheHeatMapView = new CatastropheHeatMapView() { 
    override property get FilterOptionLabel() : String { return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.ClaimsAndPolicyLocations") }
    override property get LegendTitle() : String { return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumberOfClaims") }
     override property get Legend2Title() : String { return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.PolicyLocations") }
    override property get SelectionMessage() : String { 
      var clCount = HeatMap.ClaimsDataSet.CountOfPointsSelected
      var plCount = HeatMap.PolicyLocationDataSet.CountOfPointsSelected
      if (clCount == 1) {
        return plCount == 1 ? DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumClaimsAndPoliciesSelectedSS", clCount, plCount)
                            : DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumClaimsAndPoliciesSelectedSP", clCount, plCount)
      } else {
        return plCount == 1 ? DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumClaimsAndPoliciesSelectedPS", clCount, plCount)
                            : DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumClaimsAndPoliciesSelectedPP", clCount, plCount)
      }
    }
    override function setParms() { 
      HeatMap.DataSets = { HeatMap.ClaimsDataSet, HeatMap.PolicyLocationDataSet }
      HeatMap.ClaimsDataSet.ColorMap = countColorMap
      HeatMap.PolicyLocationDataSet.ColorMap = policyColorMap
    }
  }

  /* The Policy Locations view */
  public final var PolicyCountsView : CatastropheHeatMapView = new CatastropheHeatMapView() {
    override property get FilterOptionLabel() : String { return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.PolicyLocations") }
    override property get LegendTitle() : String { return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumberOfPolicies") }
    override property get SelectionMessage() : String { 
      var count = HeatMap.PolicyLocationDataSet.CountOfPointsSelected
      return count == 1 ? DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumPoliciesSelectedS", count)
                        : DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumPoliciesSelectedP", count)
    }
    override function setParms() { 
      HeatMap.DataSets = { HeatMap.PolicyLocationDataSet }
      HeatMap.PolicyLocationDataSet.ColorMap = countColorMap
    }
  }
  
  /** The Total Insured Value view */
  public final var PolicyTotalView : CatastropheHeatMapView = new CatastropheHeatMapView() {
    override property get FilterOptionLabel() : String { return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.TotalInsuredValue") }
    override property get LegendTitle() : String { return DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.TotalInsured") }
    override property get SelectionMessage() : String { 
      var totalInsured = CurrencyUtil.renderAsCurrency(new CurrencyAmount(new BigDecimal(HeatMap.PolicyLocationDataSet.SumOfSelectedPoints), CurrencyUtil.getDefaultCurrency()))
      var count = HeatMap.PolicyLocationDataSet.CountOfPointsSelected
      return count == 1 ? DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumPoliciesSelectedWithInsuredS", count, totalInsured)
                        : DisplayKey.get("JSP.ClaimSearch.Search.ClaimSearch.Catastrophe.NumPoliciesSelectedWithInsuredP", count, totalInsured)
    }
    override function setParms() { 
      HeatMap.DataSets = { HeatMap.PolicyLocationDataSet }
      HeatMap.PolicyLocationDataSet.ColorMap = tivAmountColorMap
    }
  }

  /** The list of views that show claims */
  var _claimViews : CatastropheHeatMapView[] as ClaimViews = { ClaimCountsView, ClaimCountsWithPoliciesView, ClaimTotalView }
  /** The list of views that show policy locations */
  var _policyLocationViews : CatastropheHeatMapView[] as PolicyLocationViews = { ClaimCountsWithPoliciesView, PolicyCountsView, PolicyTotalView }

  /** The list of all available views.  Null is used in the Map View dropdown to represent ClaimCountView. */
  var _availableViews : CatastropheHeatMapView[] as AvailableViews = CatastropheHeatMap.isPolicyLocationDownloadConfigured()
   ? { /*ClaimCountsView,*/ ClaimTotalView, ClaimCountsWithPoliciesView, PolicyCountsView, PolicyTotalView }
   : { /*ClaimCountsView,*/ ClaimTotalView }

}