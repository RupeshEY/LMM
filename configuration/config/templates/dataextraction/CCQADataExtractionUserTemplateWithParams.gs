      <% for (var key in claims) { %>Claim <%= (key as Claim).claimNumber %> : <%= parameters.get("testParam1")%> : <%= parameters.get("testParam2") %><%}%>
