<% uses pcf.* %>
<% uses entity.* %>
<% uses typekey.* %>
<% uses gw.api.locale.DisplayKey %>
<%@ params(criteria : gw.api.heatmap.CatastropheSearchCriteria) %>
<iframe id="mapFrame" src="./../../../../MapOverlay.do?map.html=&mapName=${criteria.HeatMap.MapName}" width="100%" height="${criteria.HeatMap.InitialHeight}" frameborder="0"> <p>${gw.api.locale.DisplayKey.get('Web.HeatMap.BrowserDoesntSupportIframes')}</p> </iframe>