<html>
<head>
  <title>View User Sample</title>
</head>
<body>
<p><b>Sample View User Display</b></p>

<p>This is a sample Velocity template for viewing information
about the current user using the "ViewUser_Gosu.do" action.</p>

<p>Current User Name: <b><%= user.Contact.FirstName %> <%= user.Contact.LastName %></b></p>

<p>Current User Login: <b><%= user.Credential.UserName %></b></p>

<% if ((activities != null) && (activities.size() > 0)) { %>
<p><b>User's Activities:</b></p>
<% for (var key in activities) { %>
  <li>Activity <%= (key as Activity).Subject %><p>
<% } %>
<% } %>

<% if ((claims != null) && (claims.size() > 0)) { %>
<p><b>User's Claims:</b></p>
<% for (var key in claims) { %>
  <li>Claim <%= (key as Claim).ClaimNumber %><p>
<% } %>
<% } %>

</body>
</html>
