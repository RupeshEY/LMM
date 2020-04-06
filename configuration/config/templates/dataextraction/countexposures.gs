<% for (var key in exposures) { %><%= (key as Exposure).claim.claimNumber %>
<%= (key as Exposure).displayName %>
<%= (key as Exposure).CreateTime.getTime() %>
<% } %>