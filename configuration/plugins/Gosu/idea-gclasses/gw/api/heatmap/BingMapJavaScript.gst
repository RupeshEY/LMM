<% uses gw.api.locale.DisplayKey %>

<%-- template for using Bing Maps for a heat map --%>

<% uses gw.api.heatmap.HeatMapGenerator
   uses gw.api.heatmap.IHeatMapTemplate
%>
<%@ params(heatMap : HeatMapGenerator, template : IHeatMapTemplate, mapOption : String) %>
  function initMap() {
    // set template-substituted variables
    mapName = "${ heatMap.MapName }";
    credential = "${ HeatMapGenerator.getHeatMapCredential() }";
    <% if (heatMap.SelectionMessageID != null) { %>
      selectionMessageNodeID = ":${ heatMap.SelectionMessageID }";
    <% } %>
    refreshUponSelection = ${ heatMap.RefreshUponSelection };

    zoom = ${ heatMap.Zoom };
    autoScale = ${ heatMap.AutoScale };
    centerLatLong = new Microsoft.Maps.Location( ${ heatMap.CenterLat }, ${ heatMap.CenterLng });
    _margin = ${ heatMap.Margin };
    _boundingBoxWidth = ${ heatMap.BoundingBoxWidth };
    _boundingBoxHeight = ${ heatMap.BoundingBoxHeight };
    markerSize = ${ heatMap.MarkerSize };

    MAX_ZOOM = ${ HeatMapGenerator.MAX_ZOOM };

    useKilometers = ${ heatMap.useKilometers };
    haveLegendImage = ${ heatMap.haveLegendImage() };

    popupMapWidth = ${ heatMap.popupMapWidth };
    popupMapHeight = ${ heatMap.popupMapHeight };
    popupMapElementName = ":${ heatMap.popupMapElementName }";

    cantLoadMapMessage = "${ DisplayKey.get("Web.HeatMap.CantLoadBingMaps") }";

    selectionColor = new Microsoft.Maps.Color(${ heatMap.SelectionColor.Alpha/255. },
                                    ${ heatMap.SelectionColor.Red },
                                    ${ heatMap.SelectionColor.Green },
                                    ${ heatMap.SelectionColor.Blue });
    <% if (heatMap.SelectionPoint1 != null) { %>
      selectionPoint1 = new Microsoft.Maps.Location( ${ heatMap.SelectionPoint1.getLat() },
                                       ${ heatMap.SelectionPoint1.getLong() });
      selectionPoint2 = new Microsoft.Maps.Location( ${ heatMap.SelectionPoint2.getLat() },
                                       ${ heatMap.SelectionPoint2.getLong() });
    <% } %>
    <% if (heatMap.AreaOfInterestColor != null) { %>
      areaOfInterestColor = new Microsoft.Maps.Color( ${ heatMap.AreaOfInterestColor.Alpha/255. },
                                         ${ heatMap.AreaOfInterestColor.Red },
                                         ${ heatMap.AreaOfInterestColor.Green },
                                         ${ heatMap.AreaOfInterestColor.Blue });
    <% } %>

    <% if (heatMap.AreaOfInterestPoint1 != null) { %>
      areaOfInterestPoint1 = new Microsoft.Maps.Location( ${ heatMap.AreaOfInterestPoint1.getLat() },
                                            ${ heatMap.AreaOfInterestPoint1.getLong() });
      areaOfInterestPoint2 = new Microsoft.Maps.Location( ${ heatMap.AreaOfInterestPoint2.getLat() },
                                            ${ heatMap.AreaOfInterestPoint2.getLong() });
    <% } %>
  }
