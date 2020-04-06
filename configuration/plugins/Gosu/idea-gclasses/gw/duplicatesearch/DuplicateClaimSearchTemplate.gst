<%@ params(helper : gw.api.util.DuplicateSearchHelper, claim : Claim) %>
<%
/*********************************************************************************************************************
 * GScript template used to create the SQL query for finding duplicate claims
 *
 * INPUT: helper -- an instance of DuplicateSearchHelper, which has utility methods for constructing SQL
 *        claim -- the claim we are testing for duplicates
 * OUTPUT: The SQL that should produce a list of claim IDs that match this claim, or an empty list if none match
 *
 * The query below considers a claim to be a duplicate if either
 * 1) The claim has the same policy and has a loss date within +/- 3 days of this claim's loss date
 * OR
 * 2) The claim's insured has the same name and the loss date is within +/- 3 days of this claim's loss date
 *********************************************************************************************************************
 */
%>
Select cc_claim_head.ID col0
  FROM cc_claim cc_claim_head
  WHERE
  cc_claim_head.retired = 0
  AND cc_claim_head.LossDate BETWEEN
    <%= genClaimLossDateThreeDaysPriorParameter() %>
  AND
    <%= genClaimLossDateThreeDaysAfterParameter() %>
  AND
    cc_claim_head.ID != <%= genClaimIdParameter() %>
  AND
   (cc_claim_head.PolicyID IN (
    Select cc_policy_head.ID col0
    FROM
      cc_policy cc_policy_head
    WHERE
      cc_policy_head.PolicyNumber = <%= genClaimPolicyNumberParameter() %>
    AND
      cc_policy_head.Retired = 0))

<%
  //Only include the union if the insured is a person with both a non-null first and last name
  // or the insured is not a person and has a non-null name.
  var includeUnion = false
  if (claim.Insured != null) {
      if (claim.Insured typeis Person) {
         if (claim.Insured.FirstName != null and claim.Insured.LastName != null) {
            includeUnion = true
         }
      } else {
         if (claim.Insured.Name != null) {
            includeUnion = true
         }
      }
  }
  if (includeUnion) {
%>
   UNION
    Select cc_claim_head.ID col0
    FROM
      cc_claim cc_claim_head INNER JOIN cc_contact cc_contact_2 ON cc_claim_head.InsuredDenormID = cc_contact_2.ID
    WHERE
      cc_claim_head.LossDate
      BETWEEN
        <%= genClaimLossDateThreeDaysPriorParameter() %>
      AND
        <%= genClaimLossDateThreeDaysAfterParameter() %>
      AND
        cc_claim_head.ID != <%= genClaimIdParameter() %>

<%

  //
  // If the contact subtype is person than search on the person fields, else search on the company fields
  //

  if (claim.Insured typeis Person) {
    var person = claim.Insured
    if (person.FirstName != null and person.LastName != null) {
  %>
      AND
        cc_contact_2.FirstNameDenorm = <%= helper.makeParam("Person.FirstName", person.FirstName) %>
      AND
        cc_contact_2.LastNameDenorm = <%= helper.makeParam("Person.LastName", person.LastName) %>
    <% } %>
<% } else {
    if (claim.Insured.Name != null) { %>
      AND
        cc_contact_2.NameDenorm = <%= helper.makeParam("Contact.Name", claim.Insured.Name) %>
    <% } %>
<% } %>
    AND cc_contact_2.Retired = 0 AND cc_claim_head.Retired = 0
<%
}

//
// Utility functions
//

function genClaimPolicyNumberParameter() : String {
  return helper.makeParam("Policy.PolicyNumber", claim.Policy.PolicyNumber)
}

function genClaimLossDateThreeDaysPriorParameter() : String {
  return helper.makeParam("Claim.LossDate", claim.LossDate.addDays(-3))
}

function genClaimLossDateThreeDaysAfterParameter() : String {
  return helper.makeParam("Claim.LossDate", claim.LossDate.addDays(3))
}

function genClaimIdParameter() :String {
  return helper.makeParam("Claim.ID", claim.ID)
}
%>
