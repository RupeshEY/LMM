<html>
<head>
  <title>Find Claim Sample</title>
</head>
<body>
<p><b>Sample Find Claim Display</b></p>

<p>This is a sample Velocity template for extracting
data via the FindClaim_Gosu.do action.</p>

<p><b>Total Claims Found: <%= claims.size() %></b></p>

<ul>
<% for (var key in claims) { %>
  <li>Claim <%= (key as Claim).claimNumber %><p>
<% } %>
</ul>

</body>
</html>