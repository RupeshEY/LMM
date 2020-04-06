<% uses pcf.* %>
<% uses entity.* %>
<% uses typekey.* %>
<% uses gw.api.locale.DisplayKey %>
<%@ params(directions : gw.api.contact.DrivingDirections) %>

          <iframe id = "mapFrame" src = "${directions.getMapOverviewUrl().getMapImageUrl()}"
                        width = "100%" height = "512" frameborder = "0">
	      <p></p> </iframe>
	  