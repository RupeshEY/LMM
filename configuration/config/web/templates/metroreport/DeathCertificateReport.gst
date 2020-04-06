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
  <mrb:Order>
		<mrb:RequestType>H</mrb:RequestType>
    <mrb:ForceDup><%=metroReport.ForceDuplicate?"Yes":"No"%></mrb:ForceDup>
    <mrb:ClaimNumber><%=claim.ClaimNumber%></mrb:ClaimNumber>
    <mrb:RequestersPolicy><%=claim.Policy.PolicyNumber%></mrb:RequestersPolicy>
    <mrb:GLB>4</mrb:GLB>
		<mrb:DPPA>6</mrb:DPPA>
		<mrb:Loss>
			<mrb:Date><%=translator.formatCustDate(claim.LossDate)%></mrb:Date>
			<mrb:Time><%=translator.formatCustTime(claim.LossDate)%></mrb:Time>
      <mrb:Location><%=claim.LossLocation.AddressLine1%></mrb:Location>
      <mrb:City><%=claim.LossLocation.City%></mrb:City>
      <mrb:County><%=translator.formatNullToEmptyString(claim.LossLocation.County)%></mrb:County>
      <mrb:State><%=claim.LossLocation.State%></mrb:State>
      <mrb:Zip><%=translator.formatNullToEmptyString(claim.LossLocation.PostalCode)%></mrb:Zip>
      <mrb:Description1><%=claim.Description%></mrb:Description1>
		</mrb:Loss>
		<% if ( claim.LossType == TC_WC ) { %>
      <mrb:Insured>                                                                                
        <mrb:CompanyName><%=claim.Insured.Company.Name%></mrb:CompanyName>
        <mrb:Address1><%=translator.formatNullToEmptyString(claim.Insured.PrimaryAddress.AddressLine1)%></mrb:Address1>
        <mrb:Address2><%=translator.formatNullToEmptyString(claim.Insured.PrimaryAddress.AddressLine2)%></mrb:Address2>
        <mrb:City><%=translator.formatNullToEmptyString(claim.Insured.PrimaryAddress.City)%></mrb:City>
        <mrb:Zip><%=translator.formatNullToEmptyString(claim.Insured.PrimaryAddress.PostalCode)%></mrb:Zip>
        <mrb:Phone><%=translator.formatPhoneNumber(claim.Insured.PrimaryPhoneValue)%></mrb:Phone>
        <mrb:DOD><%=translator.formatCustDate(metroReport.DateOfDeath)%></mrb:DOD>
        <mrb:Injury_Death><%=translator.formatInjuryOrDeathFlag(metroReport.DateOfDeath)%></mrb:Injury_Death>
      </mrb:Insured>
      <mrb:Driver1>
        <mrb:Last><%=claim.claimant.LastName%></mrb:Last>
        <mrb:First><%=claim.claimant.FirstName%></mrb:First>
        <mrb:Middle><%=translator.formatNullToEmptyString(claim.claimant.MiddleName)%></mrb:Middle>
        <mrb:Address1><%=translator.formatDriverAddress(claim.claimant.PrimaryAddress)%></mrb:Address1>
        <mrb:City><%=translator.formatNullToEmptyString(claim.claimant.PrimaryAddress.City)%></mrb:City>
        <mrb:Zip><%=translator.formatNullToEmptyString(claim.claimant.PrimaryAddress.PostalCode)%></mrb:Zip>
      </mrb:Driver1>
    <% } %>
		<mrb:InvestigatingAgency>
      <mrb:AgencyName><%=translator.formatNullToEmptyString(metroReport.AgentName)%></mrb:AgencyName>
      <mrb:AgencyType><%=translator.formatNullToEmptyString(metroReport.MetroAgency.DisplayName)%></mrb:AgencyType>
      <mrb:Precinct><%=translator.formatNullToEmptyString(metroReport.Precinct)%></mrb:Precinct>
      <mrb:ReportNumber><%=translator.formatNullToEmptyString(metroReport.ReportNumber)%></mrb:ReportNumber>
      <mrb:OfficerName><%=translator.formatNullToEmptyString(metroReport.OfficerName)%></mrb:OfficerName>
      <mrb:DateReported><%=translator.formatCustDate(metroReport.DateReported)%></mrb:DateReported>
      <mrb:City><%=metroReport.AgentCity%></mrb:City>
      <mrb:State><%=metroReport.AgentState%></mrb:State>
		</mrb:InvestigatingAgency>
		<mrb:RequesterName>
      <mrb:First><%=metroReport.CreateUser.Contact.FirstName%></mrb:First>
      <mrb:Middle><%=translator.formatNullToEmptyString(metroReport.CreateUser.Contact.MiddleName)%></mrb:Middle>
      <mrb:Last><%=metroReport.CreateUser.Contact.LastName%></mrb:Last>
			<mrb:EmailAddress><%=metroReport.CreateUser.Contact.EmailAddress1%></mrb:EmailAddress>
			<mrb:Phone><%=translator.formatPhoneNumber(metroReport.CreateUser.Contact.PrimaryPhoneValue)%></mrb:Phone>
		</mrb:RequesterName>
    <mrb:OrderingCompany>
      <mrb:NAIC><%=metroProperties.getCustNAIC()%></mrb:NAIC>
      <mrb:CompanyName><%=metroProperties.getCustCompanyName()%></mrb:CompanyName>
      <mrb:Address1><%=metroProperties.getCustAddress1()%></mrb:Address1>
      <mrb:Address2><%=metroProperties.getCustAddress2()%></mrb:Address2>
      <mrb:City><%=metroProperties.getCustCity()%></mrb:City>
      <mrb:State><%=metroProperties.getCustState()%></mrb:State>
      <mrb:Zip><%=metroProperties.getCustZip()%></mrb:Zip>
    </mrb:OrderingCompany>
	</mrb:Order>
</mrb:MetroRequest>
--<%=metroProperties.getMetroBoundary()%>--