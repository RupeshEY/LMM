<%@ params(metroReport : MetroReport, claim : entity.Claim)%>
<% var translator = new com.guidewire.cc.system.integration.messaging.metro.MetroTranslate() as com.guidewire.cc.system.integration.messaging.metro.MetroTranslate %>
<% var metroProperties = com.guidewire.cc.system.integration.messaging.metro.MetroProperties.getInstance() as com.guidewire.cc.system.integration.messaging.metro.MetroProperties %>
--<%=metroProperties.getMetroBoundary()%>
Content-Disposition: form-data; name="onegate_set"

<%=metroProperties.getOnegateSet()%>
--<%=metroProperties.getMetroBoundary()%>
Content-Disposition: form-data; name="user"

<%=metroProperties.getMetroUserName()%>
--<%=metroProperties.getMetroBoundary()%>
Content-Disposition: form-data; name="passwd"

<%=metroProperties.getMetroPassWord()%>
--<%=metroProperties.getMetroBoundary()%>
Content-Disposition: form-data; name="xml_file"; filename="Order.xml"
Content-Type: application/octet-stream

<?xml  version="1.0" encoding="UTF-8" ?>
<mrb:MetroRequest xmlns:mrb="http://www.metroreporting.com">
	<mrb:Account><%=metroProperties.getCustAccount()%></mrb:Account>
	<mrb:BillingAccount><%=metroProperties.getCustBillingAccount()%></mrb:BillingAccount>
	<mrb:RequestDate><%=translator.formatCustDate(metroReport.SentDate)%></mrb:RequestDate>
	<mrb:RequestID></mrb:RequestID>
	<mrb:OrderInquiry>
		<mrb:ClaimNumber><%=claim.ClaimNumber%></mrb:ClaimNumber>
    <mrb:TransID><%=metroReport.MetroTransactionID%></mrb:TransID>
	</mrb:OrderInquiry>
</mrb:MetroRequest>
--<%=metroProperties.getMetroBoundary()%>--
