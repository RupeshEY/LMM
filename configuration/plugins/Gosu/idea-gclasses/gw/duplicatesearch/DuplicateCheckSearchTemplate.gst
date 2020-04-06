<% uses gw.plugin.Plugins %>
<% uses gw.plugin.util.IEncryption %>
<%@ params(helper : gw.api.util.DuplicateSearchHelper, check : Check, checkBeingCloned : Check) %>
<%
/*
 * GScript template used to create the SQL query for finding duplicate checks
 * INPUT:  helper -- an instance of gw.api.util.DuplicateSearchHelper that has utility methods for constructing SQL
 *         check -- the check we are testing for duplicates
 *         checkBeingCloned -- if the check we are creating is a clone of an existing check then this is the
              existing check. Otherwise null.
 * OUTPUT: The SQL that should produce a list of check IDs that match this check, or an empty list if none match
 * 
 * The query below is basically looking for checks written to the same person for the same amount on this claim.
 * However the details are fairly complex. A check B is considered to be a duplicate of check A if:
 * - Check A and check B have the same PayTo field
 *   OR Check B has a payee with the same TaxID as one of the payees on check A
 * - Check A and check B are on the same claim
 * - Check A and check B have the same gross amount
 * - Check A and check B have the same currency
 * - The service periods (ServicePdStart to ServicePdEnd) for check A and check B overlap
 * - OR both check A and check B have incomplete service periods (one or both fields null)
 * - If Check A is being created as a clone of another check then Check B must not be the check
 *   from which A is being cloned (or of any of its recurrences). This is how the checkBeingCloned
 *   argument is used
 *
 * The tax ID field is encrypted using the defined encryption plugin. If encyption is not enabled on the
 * tax ID field for contacts, be sure the encryption plugin is not enabled or searches involving the
 * the tax ID field will not work.
 */

var encryptionPlugin = Plugins.get(IEncryption)
var needsOr = false
var checkIdsToIgnore = calculateCheckIdsToIgnore()
%>

Select cc_check_head.ID
FROM cc_check cc_check_head
INNER JOIN (
  cc_transaction cc_transaction_1
    INNER JOIN cc_transactionlineitem cc_transactionlineitem_2
      ON cc_transaction_1.id=cc_transactionlineitem_2.TransactionID
   )
ON cc_check_head.id=cc_transaction_1.CheckID
AND cc_transaction_1.Retired = 0
WHERE (
<%
  var emptyWhere = true
  if (check.PayTo.size > 0) {
%>
  cc_check_head.PayToDenorm = <%= helper.makeParam("Check.PayTo", check.PayTo) %>
<%
    needsOr = true
    emptyWhere = false
  }

  // Complex part of the query. If we have payees, join in (through claim contact) all contacts that have the
  // checkpayee role (id=10011) and search on the contact tax ID list passed in to the template.
  if (check.Payees.length > 0) {
    if (needsOr) {
%> OR
<% } %>
    cc_check_head.ID IN (
    Select cc_checkpayee_head.CheckID
    FROM cc_checkpayee cc_checkpayee_head
    INNER JOIN (
      cc_claimcontact cc_claimcontact_1
        INNER JOIN cc_contact cc_contact_3
          ON cc_contact_3.id=cc_claimcontact_1.ContactID
          AND cc_contact_3.Retired = 0
          AND cc_contact_3.TaxID IN (
            <%= check.Payees.map(\ c -> helper.makeParam("Contact.TaxID", c.Payee.TaxID)).join(", ") %>
          )
          INNER JOIN cc_claimcontactrole cc_claimcontactrole_2
            ON cc_claimcontact_1.id=cc_claimcontactrole_2.ClaimContactID
            AND cc_claimcontactrole_2.Role =
            <%=
              helper.makeParam("ClaimContactRole.Role", ContactRole.TC_CHECKPAYEE)
            %>
    ) ON cc_claimcontact_1.id=cc_checkpayee_head.ClaimContactID
      AND cc_claimcontact_1.Retired = 0  WHERE  cc_checkpayee_head.CheckID = cc_check_head.ID
  )
<%
    emptyWhere = false
  }

  if (emptyWhere) {
%>
  1=1
<% } %>
)
<%
if (checkIdsToIgnore != null) {
%>
AND cc_check_head.Id not in (<%= genCheckIdParameter() %>, <%= checkIdsToIgnore.map(\ k -> helper.makeParam("Check.ID", k)).join(", ") %>)
<%
} else {
  if(!check.New) {
%>
AND cc_check_head.Id != <%= genCheckIdParameter() %>
<%
  }
}
if (check.ServicePdStart != null and check.ServicePdEnd != null) {
%>
AND cc_check_head.ServicePdEnd >= <%= helper.makeParam("Check.ServicePdEnd", check.ServicePdStart) %>
AND cc_check_head.ServicePdStart <= <%= helper.makeParam("Check.ServicePdStart", check.ServicePdEnd) %>
<% } else {%>
AND (cc_check_head.ServicePdStart IS NULL OR cc_check_head.ServicePdEnd IS NULL)
<% } %>
AND
<%= helper.makeParam("Transaction.Currency", check.Currency) %>
IN (SELECT currency FROM cc_transaction cc_transaction_head WHERE cc_transaction_head.checkid = cc_check_head.id)
AND
  cc_check_head.Retired = 0
AND
  cc_check_head.ClaimID = <%= helper.makeParam("Check.ClaimID", check.Claim.ID) %>
GROUP BY
  cc_check_head.ID
<% // This 'having' is to test the check sum amount.  To remove, remove the 'group by' and the 'having' line below.
%>
HAVING
  SUM(cc_transactionlineitem_2.TransactionAmount) = <%= helper.makeParam("TransactionLineItem.TransactionAmount", check.getGrossAmount()) %>
<%
function calculateCheckIdsToIgnore() : gw.pl.persistence.core.Key[] {
  var result : gw.pl.persistence.core.Key[] = null
  if (checkBeingCloned != null) {
    var checksToExclude = checkBeingCloned.RecurringCheck != null ?
      checkBeingCloned.RecurringCheck.Checks : new Check[] {checkBeingCloned}
    if (checksToExclude.length > 0) {
      result = checksToExclude.map(\ c -> c.ID)
    }
  }
  return result
}

//
// Utility functions
//

function genCheckIdParameter() : String {
  return helper.makeParam("Check.ID", check.ID )
}

%>
