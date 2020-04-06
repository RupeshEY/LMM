<% uses pcf.* %>
<% uses entity.* %>
<% uses typekey.* %>
<% uses gw.api.locale.DisplayKey %>
<%@ params(mapURL : gw.api.contact.MapImageUrl) %>

          <iframe id = "mapFrame" src = "${mapURL.getMapImageUrl()}"
                        width = "100%" height = "512" frameborder = "0">
	      <p></p> </iframe>
	  