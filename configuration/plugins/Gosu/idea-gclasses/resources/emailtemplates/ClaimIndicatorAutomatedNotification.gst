<%@ params(trigger : ClaimIndicatorTrigger, clm : Claim) %>
<% var triggeringValue = (trigger.TriggeringValue ? "on" : "off") %>
On ${ java.util.Date.CurrentDate.formatDateTime(MEDIUM, MEDIUM) }, the ${ trigger.ClaimIndicator.DisplayName } indicator for Claim ${ clm.ClaimNumber } was turned ${ triggeringValue }.