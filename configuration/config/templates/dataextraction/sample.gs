<html>
<head>
  <title>Matching Claims</title>
</head>
<body>

<b>Sample velocity template demonstration</b><p>

This is an html page, but I could just as easily have generated XML or another
format - note that this text is just printed verbatim.<p>

Before hitting the template, I put a claim into the velocity context under the "claim" variable.<p>

So now I can use simple expressions to print out any values accessible from claim.  For example:<p>
The claim number is: <%= claim.ClaimNumber %><p>
The description is: <%= claim.Description %><p>

I can walk over related beans, even though I did not put them into the context directly.
For example, here are the descriptions of the exposures in this claim:<p>

<% for (var key in claim.Exposures index count) { %>
  Description of exposure <%= count + 1 %> : <%= key.Incident.Description %><p>
<% } %>

</body>
</html>
