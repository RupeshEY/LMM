<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:iso="http://iso.com" xmlns:msxsl="urn:schemas-microsoft-com:xslt" extension-element-prefixes="iso msxsl">
	<!--
*********************************************************************************
*	 
*	      Name="Display_General_Info" Template
*
*			Builds the initiating common claim records  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_General_Info">
		<xsl:variable name="RouteRef" select="ClaimsOccurrence/@id"/>
		<xsl:variable name="PFReported2Ref" select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'Emergency']/@id"/>
		<xsl:variable name="InsReported2Ref" select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/@id"/>
		<!--it uses the code actual value.
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name" >Return Reason Code</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="MatchReportTypeCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="MA01_NICBRef" select="ClaimsOccurrence/com.iso_NICBReferralInd"/>
		<xsl:if test="count($MA01_NICBRef) &gt; 0">
			<xsl:call-template name="Insert_Data2">
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="ClaimsOccurrence/com.iso_MoldInd"/>-->
					<xsl:if test="$MA01_NICBRef='Y'">This claim was referred to the NICB</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:variable name="MatchReportTypeCd" select="MatchReportTypeCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Return Reason </xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$MatchReportTypeCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/MatchReportTypeCds/*[@code=$MatchReportTypeCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name"> Company</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/ItemIdInfo/AgencyId"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">RRE Code</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsOccurrence/com.iso_RRECd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="TINNum" select="ClaimsOccurrence/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId"/>
		<xsl:if test="count($TINNum) &gt; 0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					TIN:
					</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:number value="substring($TINNum,1,2)" format="01-"/>
						<xsl:number value="substring($TINNum,3,7)" format="0000001"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Site Id</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsOccurrence/com.iso_SiteId"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Claim Number</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsOccurrence/ItemIdInfo/InsurerId"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="FormatDt" select="ClaimsOccurrence/LossDt"/>
		<xsl:variable name="LossTime" select="ClaimsOccurrence/LossTime"/>
		<xsl:if test="count($FormatDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Date/Time of Loss</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($FormatDt,6,2)" format="01/"/>
					<xsl:number value="substring($FormatDt,9,2)" format="01/"/>
					<xsl:number value="substring($FormatDt,1,4)" format="0001"/>&#160;
					<!--<xsl:value-of select="ClaimsOccurrence/LossTime"/>-->
					<xsl:choose>
						<xsl:when test="count($LossTime) > 0">
							<xsl:value-of select="$LossTime"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="'00:00'"/>
						</xsl:otherwise>
					</xsl:choose>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Policy Number</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="Policy/PolicyNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="PolicyTypeCd" select="Policy/LOBCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Policy Type</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$PolicyTypeCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/POLICY-TYPES/*[@code=$PolicyTypeCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="SelfInsInd" select="ClaimsOccurrence/com.iso_SelfInsuredInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Self Insured</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:if test="$SelfInsInd='Y'">YES</xsl:if>
				<xsl:if test="$SelfInsInd='N'">NO</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="IncepDt" select="Policy/ContractTerm/EffectiveDt"/>
		<xsl:variable name="ExpDt" select="Policy/ContractTerm/ExpirationDt"/>
		<xsl:if test="count($IncepDt) &gt; 0">
			<!--<xsl:if test="string-length(normalize-space($BuyerNode)) &gt; 0">-->
			<!--	<xsl:variable name="SplitZip" select="$BuyerNode/GeneralPartyInfo/Addr/PostalCode"/>
				<xsl:call-template name="Insert_Addr">
					<xsl:with-param name="Title">Address</xsl:with-param>
					<xsl:with-param name="Addr1">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/Addr1"/>
					</xsl:with-param>
					<xsl:with-param name="Addr2">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/Addr2"/>
					</xsl:with-param>
				</xsl:call-template>-->
			<!--
				<xsl:call-template name="Insert_inception">
				
					<xsl:with-param name="Title">Inception Date</xsl:with-param>
					<xsl:with-param name="incept">
						<xsl:number value="substring($IncepDt,6,2)" format="01/"/>
						<xsl:number value="substring($IncepDt,9,2)" format="01/"/>
						<xsl:number value="substring($IncepDt,1,4)" format="0001"/>
					</xsl:with-param>
					<xsl:with-param name="Title1">Expiration Date</xsl:with-param>
					<xsl:with-param name="expir">
						<xsl:number value="substring($ExpDt,6,2)" format="01/"/>
						<xsl:number value="substring($ExpDt,9,2)" format="01/"/>
						<xsl:number value="substring($ExpDt,1,4)" format="0001"/>					
					</xsl:with-param>

				</xsl:call-template>
					-->
			<tr>
				<td align="left">&#160;&#160;
						<b>
						<font size="2" face="Arial">
							Inception Date:
							</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:number value="substring($IncepDt,6,2)" format="01/"/>
						<xsl:number value="substring($IncepDt,9,2)" format="01/"/>
						<xsl:number value="substring($IncepDt,1,4)" format="0001"/>
					</font>
					<xsl:if test="count($ExpDt) &gt; 0">
						<b>
							<font size="2" face="Arial">
							&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Expiration Date:
							</font>
						</b>
						<font size="2" face="Arial">
							<xsl:number value="substring($ExpDt,6,2)" format="01/"/>
							<xsl:number value="substring($ExpDt,9,2)" format="01/"/>
							<xsl:number value="substring($ExpDt,1,4)" format="0001"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<!--
		<xsl:variable name="IncepDt" select="Policy/ContractTerm/EffectiveDt"/>
		<xsl:if test="count($IncepDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Inception Date</xsl:with-param>
				<xsl:with-param name="Data_Value">-->
		<!--<xsl:value-of select="Policy/ContractTerm/EffectiveDt"/>-->
		<!--					<xsl:number value="substring($IncepDt,6,2)" format="01/"/>
					<xsl:number value="substring($IncepDt,9,2)" format="01/"/>
					<xsl:number value="substring($IncepDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="ExpDt" select="Policy/ContractTerm/ExpirationDt"/>
		<xsl:if test="count($ExpDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Expiration Date</xsl:with-param>
				<xsl:with-param name="Data_Value">-->
		<!--<xsl:value-of select="Policy/ContractTerm/ExpirationDt"/>-->
		<!--					<xsl:number value="substring($ExpDt,6,2)" format="01/"/>
					<xsl:number value="substring($ExpDt,9,2)" format="01/"/>
					<xsl:number value="substring($ExpDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>-->
		<xsl:variable name="RenewInd" select="ClaimsOccurrence/PolicyRenewalInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Policy Renewed?</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="ClaimsOccurrence/PolicyRenewalInd"/>-->
				<xsl:if test="$RenewInd =0">NO</xsl:if>
				<xsl:if test="$RenewInd =1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="AssignedRisk" select="Policy/AssignedRiskInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Assigned Risk?</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="Policy/AssignedRiskInd"/>-->
				<xsl:if test="$AssignedRisk=0">NO</xsl:if>
				<xsl:if test="$AssignedRisk=1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="RecDt" select="ClaimsOccurrence/ClaimsReported[@ReportedToRef = $InsReported2Ref]/ReportedDt"/>
		<xsl:if test="count($RecDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Company Received Date</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="ClaimsOccurrence/ClaimsReported[@ReportedToRef = $InsReported2Ref]/ReportedDt"/>-->
					<xsl:number value="substring($RecDt,6,2)" format="01/"/>
					<xsl:number value="substring($RecDt,9,2)" format="01/"/>
					<xsl:number value="substring($RecDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="isoReceiveDt" select="ClaimsOccurrence/com.iso_ReceiveDt"/>
		<xsl:if test="count($isoReceiveDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">ISO Received Date</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($isoReceiveDt,6,2)" format="01/"/>
					<xsl:number value="substring($isoReceiveDt,9,2)" format="01/"/>
					<xsl:number value="substring($isoReceiveDt,1,4)" format="0001"/>&#160;
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Loss Description</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsOccurrence/IncidentDesc"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MA01FirstDt" select="ClaimsPayment[PaymentTypeCd = 'FCP']/PaymentDt"/>
		<xsl:if test="count($MA01FirstDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">First Claim Payment Date</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($MA01FirstDt,6,2)" format="01/"/>
					<xsl:number value="substring($MA01FirstDt,9,2)" format="01/"/>
					<xsl:number value="substring($MA01FirstDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Agency Notified </xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'Emergency']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Report Case No.</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsOccurrence/ClaimsReported[@ReportedToRef = $PFReported2Ref]/ReportNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<!-- combine in one line-->
		<xsl:if test="count(ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'Emergency']/GeneralPartyInfo/NameInfo/CommlName/CommercialName) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
			<b>
						<font size="2" face="Arial">
				Agency Notified:
				</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:value-of select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'Emergency']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
					</font>
					<xsl:if test="count(ClaimsOccurrence/ClaimsReported[@ReportedToRef = $PFReported2Ref]/ReportNumber) &gt;0">
						<b>
							<font size="2" face="Arial">
					&#160;&#160;&#160;&#160;Report Case No.:
					</font>
						</b>
						<font size="2" face="Arial">
							<xsl:value-of select="ClaimsOccurrence/ClaimsReported[@ReportedToRef = $PFReported2Ref]/ReportNumber"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<!-- end -->
		<!--
		<xsl:variable name="CAT" select="ClaimsOccurrence/CatastropheLossInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">CAT Related?</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:if test="$CAT=0">NO</xsl:if>
				<xsl:if test="$CAT=1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">CAT #</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsOccurrence/Catastrophe/CatastropheCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<!--move in one line-->
		<xsl:variable name="CAT" select="ClaimsOccurrence/CatastropheLossInd"/>
		<xsl:if test="count($CAT) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
			<b>
						<font size="2" face="Arial">
				CAT Related?:
				</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:if test="$CAT=0">NO</xsl:if>
						<xsl:if test="$CAT=1">YES</xsl:if>
					</font>
					<xsl:if test="count(ClaimsOccurrence/Catastrophe/CatastropheCd) &gt; 0">
						<b>
							<font size="2" face="Arial">
					&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;CAT Number:
					</font>
						</b>
						<font size="2" face="Arial">
							<xsl:value-of select="ClaimsOccurrence/Catastrophe/CatastropheCd"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<!--end-->
		<xsl:variable name="FundInd" select="WorkCompLossInfo/SecondInjuryFundInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">8F Fund Claim?</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="WorkCompLossInfo/SecondInjuryFundInd"/>-->
				<xsl:if test="$FundInd=0">NO</xsl:if>
				<xsl:if test="$FundInd=1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Vessel/Call Number</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="WorkCompLossInfo/VesselCallId"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MoldInd" select="ClaimsOccurrence/com.iso_MoldInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Mold Involvement</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="ClaimsOccurrence/com.iso_MoldInd"/>-->
				<xsl:if test="$MoldInd='N'">NO</xsl:if>
				<xsl:if test="$MoldInd='Y'">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="RemarkText[@idref = $RouteRef]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="SplitZip" select="ClaimsOccurrence/Addr/PostalCode"/>
		<xsl:call-template name="Insert_Addr">
			<xsl:with-param name="Title">Location of Loss</xsl:with-param>
			<xsl:with-param name="Addr1">
				<xsl:value-of select="ClaimsOccurrence/Addr/Addr1"/>
			</xsl:with-param>
			<xsl:with-param name="Addr2">
				<xsl:value-of select="ClaimsOccurrence/Addr/Addr2"/>
			</xsl:with-param>
			<xsl:with-param name="City">
				<xsl:value-of select="ClaimsOccurrence/Addr/City"/>
			</xsl:with-param>
			<xsl:with-param name="State">
				<xsl:value-of select="ClaimsOccurrence/Addr/StateProvCd"/>
			</xsl:with-param>
			<xsl:with-param name="ZipCode">
				<xsl:value-of select="substring($SplitZip, 1, 5)"/>
				<xsl:if test="string-length($SplitZip) &gt; 5">-</xsl:if>
				<xsl:value-of select="substring($SplitZip, 6, 9)"/>
				<!--<xsl:value-of select="ClaimsOccurrence/Addr/PostalCode"/>-->
			</xsl:with-param>
			<xsl:with-param name="Country">
				<xsl:value-of select="ClaimsOccurrence/Addr/CountryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MassTortInd" select="ClaimsOccurrence/com.iso_MassTortInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Mass Tort</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:if test="$MassTortInd='Y'">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:if test="count(Policy/MiscParty/com.iso_AddInfo/com.iso_EntityId) &gt;0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">NMVTIS Operator Id</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="Policy/MiscParty/com.iso_AddInfo/com.iso_EntityId"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!-- start Physical or Mailing Address information -->
		<xsl:variable name="physicaladdr" select="Policy/MiscParty/com.iso_SIUInfo/GeneralPartyInfo/Addr[AddrTypeCd='PhysicalRisk']"/>
		<xsl:variable name="physicalzip" select="Policy/MiscParty/com.iso_SIUInfo/GeneralPartyInfo/Addr[AddrTypeCd='PhysicalRisk']/PostalCode"/>
		<xsl:call-template name="Insert_Addr">
			<xsl:with-param name="Title">Physical Risk</xsl:with-param>
			<xsl:with-param name="Addr1">
				<xsl:value-of select="$physicaladdr/Addr1"/>
			</xsl:with-param>
			<xsl:with-param name="Addr2">
				<xsl:value-of select="$physicaladdr/Addr2"/>
			</xsl:with-param>
			<xsl:with-param name="City">
				<xsl:value-of select="$physicaladdr/City"/>
			</xsl:with-param>
			<xsl:with-param name="State">
				<xsl:value-of select="$physicaladdr/StateProvCd"/>
			</xsl:with-param>
			<xsl:with-param name="ZipCode">
				<xsl:value-of select="substring($physicalzip, 1, 5)"/>
				<xsl:if test="string-length($physicalzip) &gt; 5">-</xsl:if>
				<xsl:value-of select="substring($physicalzip, 6, 9)"/>
			</xsl:with-param>
			<xsl:with-param name="Country">
				<xsl:value-of select="$physicaladdr/CountryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="mailingaddr" select="Policy/MiscParty/com.iso_SIUInfo/GeneralPartyInfo/Addr[AddrTypeCd='MailingAddress']"/>
		<xsl:variable name="mailingzip" select="Policy/MiscParty/com.iso_SIUInfo/GeneralPartyInfo/Addr[AddrTypeCd='MailingAddress']/PostalCode"/>
		<xsl:call-template name="Insert_Addr">
			<xsl:with-param name="Title">Mailing Address</xsl:with-param>
			<xsl:with-param name="Addr1">
				<xsl:value-of select="$mailingaddr/Addr1"/>
			</xsl:with-param>
			<xsl:with-param name="Addr2">
				<xsl:value-of select="$mailingaddr/Addr2"/>
			</xsl:with-param>
			<xsl:with-param name="City">
				<xsl:value-of select="$mailingaddr/City"/>
			</xsl:with-param>
			<xsl:with-param name="State">
				<xsl:value-of select="$mailingaddr/StateProvCd"/>
			</xsl:with-param>
			<xsl:with-param name="ZipCode">
				<xsl:value-of select="substring($mailingzip, 1, 5)"/>
				<xsl:if test="string-length($mailingzip) &gt; 5">-</xsl:if>
				<xsl:value-of select="substring($mailingzip, 6, 9)"/>
			</xsl:with-param>
			<xsl:with-param name="Country">
				<xsl:value-of select="$mailingaddr/CountryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:if test="count(Policy/MiscParty/com.iso_SIUInfo/com.iso_InsurerFraudRingInvestigation) &gt;0">
			<tr>
				<td align="left" colspan="4">
					<xsl:if test="Policy/MiscParty/com.iso_SIUInfo/com.iso_InsurerFraudRingInvestigation = 'Y'">
						<font size="2" face="Arial">&#160;&#160;<xsl:value-of select="'> CLAIM ASSOCIATED WITH INSURER FRAUD RING INVESTIGATION'"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="count(Policy/MiscParty/com.iso_SIUInfo/com.iso_CommlName) &gt;0 or count(Policy/MiscParty/com.iso_SIUInfo/com.iso_SurName) &gt;0 or count(Policy/MiscParty/com.iso_SIUInfo/com.iso_GivenName) &gt;0">
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">SIU Information</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="count(Policy/MiscParty/com.iso_SIUInfo/com.iso_CommlName) &gt;0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">SIU Company</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="Policy/MiscParty/com.iso_SIUInfo/com.iso_CommlName"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="count(Policy/MiscParty/com.iso_SIUInfo/com.iso_SurName) &gt;0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Investigator Name</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="Policy/MiscParty/com.iso_SIUInfo/com.iso_GivenName"/>
					<xsl:if test="string-length(Policy/MiscParty/com.iso_SIUInfo/com.iso_OtherGivenName) != 0 ">
					&#160;<xsl:value-of select="Policy/MiscParty/com.iso_SIUInfo/com.iso_OtherGivenName"/>
					</xsl:if>
					<xsl:if test="string-length(Policy/MiscParty/com.iso_SIUInfo/com.iso_SurName) != 0 ">
					&#160;<xsl:value-of select="Policy/MiscParty/com.iso_SIUInfo/com.iso_SurName"/>
					</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="SIUBusinessNum" select="Policy/MiscParty/com.iso_SIUInfo/com.iso_SIUPhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>
		<xsl:if test="count($SIUBusinessNum) &gt;0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Business Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($SIUBusinessNum,4,3)" format="(001"/>
					<xsl:number value="substring($SIUBusinessNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($SIUBusinessNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="SIUCellNum" select="Policy/MiscParty/com.iso_SIUInfo/com.iso_SIUPhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>
		<xsl:if test="count($SIUCellNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Cell Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($SIUCellNum,4,3)" format="(001"/>
					<xsl:number value="substring($SIUCellNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($SIUCellNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--  end Physical or Mailing Address information -->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">APD Score</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="com.iso_APDFastcheckInd"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">ClaimDirector Score Requested Indicator</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="com.iso_ClaimDirectorInd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">ClaimDirector Score</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorScore"/>
			</xsl:with-param>
		</xsl:call-template
		-->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">ClaimDirector Handling Char Indicator</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_CharacteristicFoundInd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">ClaimDirector Life of Claim Exceeded Indicator</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_ExceededLifeOfClaimInd"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">ClaimDirector E-Mail Notification Sent</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_EmailSentInd"/>
			</xsl:with-param>
		</xsl:call-template>
	-->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Automatic Update Indicator</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsOccurrence/com.iso_AutoUpdateInd"/>
			</xsl:with-param>
		</xsl:call-template>
	</xsl:template>
	<!--start CCOR-->
	<!--
*********************************************************************************
*	 
*	      Display_sum_Vehicle_Info Template
*
*			Display the Loss,Coverage on Summary record
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Sum_Vehicle_Info">
		<xsl:param name="VehLossNode"/>
		<xsl:param name="ClaimPartyNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:param name="ClaimsPartyId"/>
		<xsl:param name="AdjusterNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="ClaimsPayNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:variable name="MV01Id" select="$VehLossNode/@id"/>
		<xsl:variable name="CoverageType" select="$AdjusterNode/CoverageCd"/>
		<xsl:variable name="LossType" select="$AdjusterNode/LossCauseCd"/>
		<xsl:variable name="vehCMS" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CMS[@itemRef=$MV01Id]"/>
		<xsl:variable name="CMSSalId" select="$InvestigationNode/SalvageInfo/@id"/>
		<xsl:variable name="salvageCMS" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CMS[@itemRef=$CMSSalId]"/>
		<!--
		<xsl:call-template name="Insert_Adjuster">
			<xsl:with-param name="CoverageType">
				<xsl:value-of select="$CoverageType"/>
			</xsl:with-param>
			<xsl:with-param name="LossType">
				<xsl:value-of select="$LossType"/>
			</xsl:with-param>
			
		</xsl:call-template>
		-->
		<tr>
			<td width="100" nowrap="nowrap">
				<font face="arial" size="2">
					<b>Coverage:</b>
				</font>
			</td>
			<td width="250" align="left" nowrap="nowrap">
				<font face="arial" size="2">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageType]"/>
				</font>
			</td>
			<td width="100" nowrap="nowrap">
				<font face="arial" size="2">
					<b>Loss Type:</b>
				</font>
			</td>
			<td align="left" nowrap="nowrap">
				<font face="arial" size="2">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=$LossType]"/>
				</font>
			</td>
		</tr>
		<xsl:if test="count($vehCMS) &gt; 0">
			<tr>
				<td colspan="4" valign="top">
					<font face="arial" size="2" color="red">
						<b>Missing CMS Required Field:</b>
					</font>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<font face="arial" size="2">
						<!--<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageCode]"/>-->
						<xsl:for-each select="$vehCMS/com.iso_CMSWarning">
							<!--<xsl:value-of select="."/>-->
							<xsl:variable name="CMSWarning" select="."/>
							<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/CMSWarningCds/*[@code=$CMSWarning]"/>
							<!--<xsl:value-of select="position()!=last()">-->
							<xsl:if test="position()!=last()">
								<xsl:text>, </xsl:text>
							</xsl:if>
						</xsl:for-each>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--Slvage Missing CMS fileds-->
		<xsl:if test="count($salvageCMS) &gt; 0">
			<tr>
				<td colspan="4" valign="top">
					<font face="arial" size="2" color="red">
						<b>Missing CMS Required Field:</b>
					</font>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<font face="arial" size="2">
						<!--<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageCode]"/>-->
						<xsl:for-each select="$salvageCMS/com.iso_CMSWarning">
							<!--<xsl:value-of select="."/>-->
							<xsl:variable name="CMSWarning" select="."/>
							<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/CMSWarningCds/*[@code=$CMSWarning]"/>
							<!--<xsl:value-of select="position()!=last()">-->
							<xsl:if test="position()!=last()">
								<xsl:text>, </xsl:text>
							</xsl:if>
						</xsl:for-each>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--end salvage Missing CMS fileds-->
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Name="Display_summary_Involved_Party" Template
*
*			 
*	 
*********************************************************************************
-->
	<xsl:template name="Display_sum_Involved_Party">
		<xsl:param name="DeathMasterNode"/>
		<xsl:variable name="CPId" select="@id"/>
		<xsl:variable name="ClaimsPartyRoleCd" select="ClaimsPartyInfo/ClaimsPartyRoleCd"/>
		<xsl:variable name="MO01Id1" select="@id"/>
		<xsl:variable name="SumHeader2" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsPartyRef = $MO01Id1]"/>
		<xsl:variable name="KeyHeader2" select="../com.iso_KeyReasonInfo[@ClaimsPartyRef = $MO01Id1]"/>
		<!-- start prop coverage-->
		<xsl:variable name="PropLossNode" select="../PropertyLossInfo/@ClaimsPartyRefs"/>
		<xsl:variable name="MPId" select="../PropertyLossInfo/@id"/>
		<xsl:variable name="PropAdjuster" select="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MPId]"/>
		<xsl:variable name="PropCoverageCode" select="$PropAdjuster/LossCauseCd"/>
		<xsl:variable name="PropLossCode" select="$PropAdjuster/CoverageCd"/>
		<xsl:variable name="WaterCraftId" select="../PropertyLossInfo/Watercraft/@id"/>
		<xsl:variable name="WaterAdjuster" select="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $WaterCraftId]"/>
		<xsl:variable name="WaterCraftCoverage" select="$WaterAdjuster/CoverageCd"/>
		<xsl:variable name="WaterCraftLoss" select="$WaterAdjuster/LossCauseCd"/>
		<!--end Property coverage-->
		<!--start Auto-->
		<xsl:variable name="AutoLossNode" select="../AutoLossInfo/@ClaimsPartyRefs"/>
		<xsl:variable name="MV01Id1" select="../AutoLossInfo/@id"/>
		<xsl:variable name="AutoAdjuster" select="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MV01Id1]"/>
		<xsl:variable name="AutoCoverageCode" select="$AutoAdjuster/CoverageCd"/>
		<xsl:variable name="AutoLossCode" select="$AutoAdjuster/LossCauseCd"/>
		<!--End Auto-->
		<!--start Casualty-->
		<xsl:variable name="MC01Id1" select="ClaimsInjuredInfo/@id"/>
		<xsl:variable name="ClaimsInjuredInfo" select="ClaimsInjuredInfo"/>
		<xsl:variable name="CasLossNode" select="ClaimsInjuredInfo"/>
		<xsl:variable name="CasAdjuster" select="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MC01Id1]"/>
		<xsl:variable name="CasCoverageCode" select="$CasAdjuster/CoverageCd"/>
		<xsl:variable name="CasLossCode" select="$CasAdjuster/LossCauseCd"/>
		<xsl:variable name="casCMS" select="../com.iso_AddCovInfo/com.iso_CMS[@itemRef=$MC01Id1]"/>
		<!--missing CMS required fields-->
		<!--End Casualty-->
		<table>
			<tr>
				<td/>
			</tr>
			<tr>
				<td colspan="5">
					<b> </b>
				</td>
			</tr>
			<tr>
				<td>
					<xsl:choose>
						<xsl:when test="string-length(GeneralPartyInfo/NameInfo/PersonName) != 0">
							<xsl:call-template name="Insert_Sum_Data">
								<xsl:with-param name="Data_Value">
									<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
									<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/OtherGivenName) != 0 ">
							&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
									</xsl:if>
									<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/Surname) != 0 ">
							&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>,&#160;&#160;
							</xsl:if>
								</xsl:with-param>
								<xsl:with-param name="Data_Code_Value">
									<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/MiscPartyRoleCds/*[@code=$ClaimsPartyRoleCd]"/>
								</xsl:with-param>
							</xsl:call-template>
						</xsl:when>
						<xsl:otherwise>
							<xsl:call-template name="Insert_Sum_Data">
								<xsl:with-param name="Data_Value">
									<xsl:value-of select="GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>,&#160;&#160;
						</xsl:with-param>
								<xsl:with-param name="Data_Code_Value">
									<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/MiscPartyRoleCds/*[@code=$ClaimsPartyRoleCd]"/>
								</xsl:with-param>
							</xsl:call-template>
						</xsl:otherwise>
					</xsl:choose>
					<!--
			<xsl:if test="count($SumHeader2) = 0  and count($KeyHeader2) = 0">
				<tr><td colspan="5" width="660"><font face="Arial" size="2">No matches for this party</font><hr></hr></td>
				</tr>
			</xsl:if>
			-->
					<!--Medicare Eligible-->
					<xsl:variable name="MedEligInd" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_MedicareEligibleInd"/>
					<!--<xsl:if test="count($MedEligInd) &gt; 0">-->
					<xsl:if test="$MedEligInd = 'Y'">
						<tr>
							<td>
								<font face="Arial" size="2">** This Person is Medicare Eligible. **</font>
							</td>
						</tr>
					</xsl:if>
					<!--end Medicare Eligible-->
					<xsl:choose>
						<xsl:when test="count($SumHeader2) = 0  and count($KeyHeader2) = 0">
							<tr>
								<td colspan="5" width="660">
									<font face="Arial" size="2">No matches for this party</font>
								</td>
							</tr>
						</xsl:when>
						<xsl:when test="count($SumHeader2) = 0">
							<tr>
								<td colspan="5" width="660">
									<font face="Arial" size="2">No matches for this party</font>
								</td>
							</tr>
						</xsl:when>
					</xsl:choose>
					<!--<xsl:if test="count($SumHeader2) &gt; 0 or count($KeyHeader2) &gt; 0">-->
					<table border="0" width="650" cellpadding="0" cellspacing="0">
						<!--</xsl:for-each>-->
						<xsl:if test="count(../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MC01Id1]) &gt; 0">
							<xsl:for-each select="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MC01Id1]">
								<xsl:variable name="CoverageCode" select="CoverageCd"/>
								<xsl:variable name="LossCode" select="LossCauseCd"/>
								<tr>
									<td width="100" nowrap="nowrap">
										<font face="arial" size="2">
											<b>Coverage:</b>
										</font>
									</td>
									<td width="250" align="left" nowrap="nowrap">
										<font face="arial" size="2">
											<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageCode]"/>
											<!--<xsl:if test="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MC01Id1]">
											<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CasCoverageCode]"/>
										</xsl:if>-->
										</font>
									</td>
									<td width="100" nowrap="nowrap">
										<font face="arial" size="2">
											<b>Loss Type:</b>
										</font>
									</td>
									<td align="left" nowrap="nowrap">
										<font face="arial" size="2">
											<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=$LossCode]"/>
											<!--<xsl:if test="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MC01Id1]">
												<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=$CasLossCode]"/>
											</xsl:if>
											-->
										</font>
									</td>
								</tr>
								<xsl:if test="count($casCMS) &gt; 0">
									<tr>
										<td colspan="4" valign="top">
											<font face="arial" size="2" color="red">
												<b>Missing CMS Required Field:</b>
											</font>
										</td>
									</tr>
									<tr>
										<td colspan="4">
											<font face="arial" size="2">
												<!--<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageCode]"/>-->
												<xsl:for-each select="$casCMS/com.iso_CMSWarning">
													<!--<xsl:value-of select="."/>-->
													<xsl:variable name="CMSWarning" select="."/>
													<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/CMSWarningCds/*[@code=$CMSWarning]"/>
													<!--<xsl:value-of select="position()!=last()">-->
													<xsl:if test="position()!=last()">
														<xsl:text>, </xsl:text>
													</xsl:if>
												</xsl:for-each>
											</font>
										</td>
									</tr>
								</xsl:if>
							</xsl:for-each>
							<!--CMS-->
							<!--
							<tr>
								<td width="100" nowrap="nowrap">
									<font face="arial" size="2">
										<b>Missing CMS:</b>
									</font>
								</td>
								<xsl:for-each select="../com.iso_AddCovInfo/com.iso_CMS[@itemRef=$MC01Id1]/com.iso_CMSWarning">
									<td>
										<font face="arial" size="2">
											<xsl:value-of select="."/>,
										</font>
									</td>
								</xsl:for-each>
							</tr>
							-->
							<!--end CMS-->
						</xsl:if>
						<!--Property Watercraft Coverage and loss Type-->
						<xsl:if test="count(../PropertyLossInfo/Watercraft/ItemDefinition) &gt; 0">
							<xsl:if test="count(../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $WaterCraftId or @AssignmentRef = $MPId]) &gt; 0">
								<tr>
									<td width="100" nowrap="nowrap">
										<font face="arial" size="2">
											<b>Coverage:</b>
										</font>
									</td>
									<td width="250" align="left" nowrap="nowrap">
										<font face="arial" size="2">
											<xsl:if test="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $WaterCraftId or @AssignmentRef = $MPId][$PropLossNode = $MO01Id1]">
												<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=	$WaterCraftCoverage or @code=$PropLossCode]"/>
											</xsl:if>
										</font>
									</td>
									<td width="100" nowrap="nowrap">
										<font face="arial" size="2">
											<b>Loss Type:</b>
										</font>
									</td>
									<td align="left" nowrap="nowrap">
										<font face="arial" size="2">
											<xsl:if test="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $WaterCraftId or @AssignmentRef = $MPId]	[$PropLossNode = $MO01Id1]">
												<!--<xsl:value-of select="$PropCoverageCode"/>-->
												<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=	$WaterCraftLoss or @code=$PropCoverageCode]"/>
											</xsl:if>
										</font>
									</td>
								</tr>
							</xsl:if>
						</xsl:if>
						<!--Property-->
						<xsl:if test="count(../PropertyLossInfo/ClaimsSubjectInsuranceInfo) &gt; 0">
							<xsl:if test="count(../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MPId][$PropLossNode = 	$MO01Id1]) &gt; 0">
								<tr>
									<td width="100" nowrap="nowrap">
										<font face="arial" size="2">
											<b>Coverage:</b>
										</font>
									</td>
									<td width="250" align="left" nowrap="nowrap">
										<font face="arial" size="2">
									PROPERTY
									<!--
									<xsl:if test="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MPId][$PropLossNode = 	$MO01Id1]">
										<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=	$PropCoverageCode]"/>
									</xsl:if>
									-->
										</font>
									</td>
									<td width="100" nowrap="nowrap">
										<font face="arial" size="2">
											<b>Loss Type:</b>
										</font>
									</td>
									<td align="left" nowrap="nowrap">
										<font face="arial" size="2">
											<xsl:if test="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MPId][$PropLossNode 	= $MO01Id1]">
												<!--<xsl:value-of select="$PropCoverageCode"/>-->
												<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=	$PropCoverageCode]"/>
											</xsl:if>
										</font>
									</td>
								</tr>
							</xsl:if>
						</xsl:if>
						<xsl:if test="count(../AutoLossInfo[contains(@ClaimsPartyRefs, $MO01Id1)]) &gt; 0">
							<xsl:call-template name="Build_Sum_Vehicle_Info">
								<xsl:with-param name="ClaimsPartyId" select="$MO01Id1"/>
							</xsl:call-template>
						</xsl:if>
						<!--
					<xsl:if test="count(../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MV01Id1][$AutoLossNode = $MO01Id1]) &gt; 0">
					<xsl:if test="count(../ClaimsPayment[@idref = $MV01Id1]) &gt; 0">
					<tr>
						<td width="100" nowrap="nowrap"><font face="arial" size="2"><b>Coverage:</b></font></td>
						<td width="250" align="left" nowrap="nowrap">
							<font face="arial" size="2">
								<xsl:if test="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MV01Id1][$AutoLossNode = $MO01Id1]">
									<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$AutoCoverageCode]"/>
								</xsl:if>
							</font>
						</td>
						<td width="100" nowrap="nowrap"><font face="arial" size="2"><b>Loss Type:</b></font></td>
							<td align="left" nowrap="nowrap">
								<font face="arial" size="2">
									<xsl:if test="../AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MV01Id1][$AutoLossNode = $MO01Id1]">
										<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=$AutoLossCode]"/>
									</xsl:if>
								</font>
							</td>
					</tr>
					</xsl:if>
					</xsl:if>
					-->
					</table>
					<!--</xsl:if>-->
					<xsl:if test="count($SumHeader2) = 0  and count($KeyHeader2) = 0">
						<hr/>
					</xsl:if>
				</td>
			</tr>
			<tr>
				<td>&#160;</td>
			</tr>
			<xsl:if test="count($SumHeader2) &gt; 0 or count($KeyHeader2) &gt; 0">
				<tr>
					<td>
						<table width="650" border="1" cellpadding="3" cellspacing="0" style="border: 1px solid #d0d0d0;">
							<tr>
								<td colspan="11">
									<img src="{$imgBase}cs_headlines.gif" width="659" height="140"/>
								</td>
							</tr>
							<tr>
								<td width="140" align="center">
									<font face="Veradane" size="3">
										<b># of Matches</b>
									</font>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIULossType" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsPartyRef = $MO01Id1]/com.iso_TotalLossType"/>
									<xsl:choose>
										<xsl:when test="$SIULossType > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIULossType "/>-->
												<xsl:number value="$SIULossType" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUInvolvement" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsPartyRef = $MO01Id1]/com.iso_TotalSIUInvolvement"/>
									<xsl:choose>
										<xsl:when test="$SIUInvolvement > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUInvolvement"/>-->
												<xsl:number value="$SIUInvolvement" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalName" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsPartyRef = $MO01Id1]/com.iso_TotalName"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalName > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalName"/>-->
												<xsl:number value="$SIUTotalName" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalAddr" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsPartyRef = $MO01Id1]/com.iso_TotalAddress"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalAddr > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalAddr"/>-->
												<xsl:number value="$SIUTotalAddr" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalSSN" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsPartyRef = $MO01Id1]/com.iso_TotalSSN"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalSSN > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalSSN"/>-->
												<xsl:number value="$SIUTotalSSN" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalPhone" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsPartyRef = $MO01Id1]/com.iso_TotalPhone"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalPhone > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalPhone"/>-->
												<xsl:number value="$SIUTotalPhone" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalDrivLic" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsPartyRef = $MO01Id1]/com.iso_TotalDriversLic"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalDrivLic > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalDrivLic"/>-->
												<xsl:number value="$SIUTotalDrivLic" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalVIN" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsPartyRef = $MO01Id1]/com.iso_TotalVIN"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalVIN > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalVIN"/>-->
												<xsl:number value="$SIUTotalVIN" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalLicPlate" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsPartyRef = $MO01Id1]/com.iso_TotalLicPlate"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalLicPlate > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalLicPlate"/>-->
												<xsl:number value="$SIUTotalLicPlate" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<!--key ind-->
								<td width="222" valign="top" rowclass="cell_border" align="left" rowspan="30">
									<xsl:variable name="ipKeyInd" select="../com.iso_KeyReasonInfo[@ClaimsPartyRef = $MO01Id1]/com.iso_KeyReasonCd"/>
									<xsl:if test="$ipKeyInd = 01">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Prior SIU Involvement'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 02">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Professional Discipline/Sanctions (AMA, etc)'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 03">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Prior Claims History'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 04">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'30-day Pre/Post Policy Inception/Cancellation'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 05">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Invalid SSN'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 06">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Death master file hit on SSN'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 07">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Delayed Report'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 08">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Appearance of NICB Forewarn Notice - contact the NICB at (847)544-7002 for information'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 09">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Mail Drop exists on insured, claimant or searchable service provider address'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 10">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Undocumented loss (no police/incident reports)'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 11">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Date of hire/termination to date of loss (WC)'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 12">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Day of loss; Monday or Friday; day after a holiday'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 13">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Property loss location different than insured’s address'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 14">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Prior salvage'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 15">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'VIN failed edit'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
								</td>
							</tr>
							<!--file number-->
							<tr>
								<td class="cell_top_solid" align="center">
									<font face="Veradane">
										<b>ISO File Number</b>
									</font>
								</td>
								<td class="cell_border_solid" align="center" colspan="9">&#160;</td>
							</tr>
							<!-- match reason-->
							<xsl:for-each select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsPartyRef = $MO01Id1]">
								<tr>
									<td class="cell_border" align="center">
										<xsl:call-template name="Insert_Anchor_Link">
											<xsl:with-param name="LinkName">
												<xsl:value-of select="com.iso_SumIdentifier"/>
											</xsl:with-param>
											<xsl:with-param name="AnchorName">
												<xsl:value-of select="com.iso_SumIdentifier"/>
											</xsl:with-param>
										</xsl:call-template>
									</td>
									<xsl:variable name="SumCode" select="com.iso_SumReasonCd"/>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumCode = 'LT'">
													&#160;<font size="2" face="Arial">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
													&#160;
												</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumCode = 'SI'">
													&#160;<font size="2" face="Arial">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
													&#160;
												</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumCode = 'N'">
													&#160;<font size="2" face="Arial">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
													&#160;
												</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumCode = 'A'">
													&#160;<font size="2" face="Arial">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
													&#160;
												</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumCode = 'S'">
													&#160;<font size="2" face="Arial">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
													&#160;
												</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumCode = 'P'">
													&#160;<font size="2" face="Arial">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
													&#160;
												</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumCode = 'D'">
													&#160;<font size="2" face="Arial">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
													&#160;
												</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumCode = 'V'">
													&#160;<font size="2" face="Arial">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
													&#160;
												</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumCode = 'L'">
													&#160;<font size="2" face="Arial">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
													&#160;
												</xsl:otherwise>
										</xsl:choose>
									</td>
								</tr>
							</xsl:for-each>
						</table>
					</td>
				</tr>
			</xsl:if>
		</table>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Name="Display_summary_service provider" Template
*
*			 
*	 
*********************************************************************************
-->
	<xsl:template name="Display_sum_service_provider">
		<xsl:variable name="CPId" select="@id"/>
		<xsl:variable name="ClaimsPartyRoleCd" select="ClaimsPartyInfo/ClaimsPartyRoleCd"/>
		<xsl:variable name="MSP01Id1" select="@id"/>
		<xsl:variable name="SumHeader3" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsParty2Ref = $MSP01Id1]"/>
		<xsl:variable name="KeyHeader3" select="../com.iso_KeyReasonInfo[@ClaimsParty2Ref = $MSP01Id1]"/>
		<table>
			<tr>
				<td>&#160;</td>
			</tr>
			<tr>
				<td colspan="5">
					<b> </b>
				</td>
			</tr>
			<tr>
				<td>
					<xsl:choose>
						<xsl:when test="string-length(GeneralPartyInfo/NameInfo/PersonName) != 0">
							<xsl:call-template name="Insert_Sum_Data">
								<xsl:with-param name="Data_Value">
									<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
									<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/OtherGivenName) != 0 ">
							&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
									</xsl:if>
									<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/Surname) != 0 ">
							&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>,&#160;&#160;
							</xsl:if>
									<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/MiscPartyRoleCds/*[@code=$ClaimsPartyRoleCd]"/>
								</xsl:with-param>
							</xsl:call-template>
						</xsl:when>
						<xsl:otherwise>
							<xsl:call-template name="Insert_Sum_Data">
								<xsl:with-param name="Data_Value">
									<xsl:value-of select="GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>,&#160;&#160;
							<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/MiscPartyRoleCds/*[@code=$ClaimsPartyRoleCd]"/>
								</xsl:with-param>
							</xsl:call-template>
						</xsl:otherwise>
					</xsl:choose>
					<!--
					<xsl:if test="count($SumHeader3) = 0  and count($KeyHeader3) = 0">
						<tr><td colspan="5" width="660"><font face="Arial" size="2">No matches for this party</font><hr></hr></td>
						
						</tr>
						
					</xsl:if>
					-->
					<xsl:choose>
						<xsl:when test="count($SumHeader3) = 0  and count($KeyHeader3) = 0">
							<tr>
								<td colspan="5" width="660">
									<font face="Arial" size="2">No matches for this party</font>
									<hr/>
								</td>
							</tr>
						</xsl:when>
						<xsl:when test="count($SumHeader3) = 0">
							<tr>
								<td colspan="5" width="660">
									<font face="Arial" size="2">No matches for this party</font>
								</td>
							</tr>
						</xsl:when>
					</xsl:choose>
				</td>
			</tr>
			<!--<td>&#160;</td></tr>-->
			<tr>
				<td>&#160;</td>
			</tr>
			<tr>
				<td>
					<xsl:if test="count($SumHeader3) &gt; 0 or count($KeyHeader3) &gt; 0">
						<table width="650" border="1" cellpadding="3" cellspacing="0" style="border: 1px solid #d0d0d0;">
							<tr>
								<td colspan="11">
									<img src="{$imgBase}cs_headlines.gif" width="650" height="140"/>
								</td>
							</tr>
							<tr>
								<td width="140" align="center">
									<font face="Veradane">
										<b># of Matches</b>
									</font>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIULossType" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsParty2Ref = $MSP01Id1]/com.iso_TotalLossType"/>
									<xsl:choose>
										<xsl:when test="$SIULossType > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIULossType "/>-->
												<xsl:number value="$SIULossType" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUInvolvement" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsParty2Ref = $MSP01Id1]/com.iso_TotalSIUInvolvement"/>
									<xsl:choose>
										<xsl:when test="$SIUInvolvement > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUInvolvement"/>-->
												<xsl:number value="$SIUInvolvement" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalName" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsParty2Ref = $MSP01Id1]/com.iso_TotalName"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalName > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalName"/>-->
												<xsl:number value="$SIUTotalName" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalAddr" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsParty2Ref = $MSP01Id1]/com.iso_TotalAddress"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalAddr > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalAddr"/>-->
												<xsl:number value="$SIUTotalAddr" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalSSN" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsParty2Ref = $MSP01Id1]/com.iso_TotalSSN"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalSSN > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalSSN"/>-->
												<xsl:number value="$SIUTotalSSN" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalPhone" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsParty2Ref = $MSP01Id1]/com.iso_TotalPhone"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalPhone > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalPhone"/>-->
												<xsl:number value="$SIUTotalPhone" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalDrivLic" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsParty2Ref = $MSP01Id1]/com.iso_TotalDriversLic"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalDrivLic > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalDrivLic"/>-->
												<xsl:number value="$SIUTotalDrivLic" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalVIN" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsParty2Ref = $MSP01Id1]/com.iso_TotalVIN"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalVIN > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalVIN"/>-->
												<xsl:number value="$SIUTotalVIN" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<td width="32" class="cell_border" align="center">
									<xsl:variable name="SIUTotalLicPlate" select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsParty2Ref = $MSP01Id1]/com.iso_TotalLicPlate"/>
									<xsl:choose>
										<xsl:when test="$SIUTotalLicPlate > 0">
										&#160;<font face="arial" size="2">
												<!--<xsl:value-of select="$SIUTotalLicPlate"/>-->
												<xsl:number value="$SIUTotalLicPlate" format="1"/>
											</font>
										</xsl:when>
										<xsl:otherwise>
										&#160;
									</xsl:otherwise>
									</xsl:choose>
								</td>
								<!--key ind-->
								<td width="222" rowspan="35" valign="top" class="cell_border" align="left">
									<xsl:variable name="ipKeyInd" select="../com.iso_KeyReasonInfo[@ClaimsParty2Ref = $MSP01Id1]/com.iso_KeyReasonCd"/>
									<xsl:if test="$ipKeyInd = 01">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Prior SIU Involvement'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 02">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Professional Discipline/Sanctions (AMA, etc)'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 03">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Prior Claims History'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 04">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'30-day Pre/Post Policy Inception/Cancellation'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 05">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Invalid SSN'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 06">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Death master file hit on SSN'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 07">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Delayed Report'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 08">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Appearance of NICB Forewarn Notice'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 09">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Mail Drop exists on insured, claimant or searchable service provider address'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 10">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Undocumented loss (no police/incident reports)'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 11">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Date of hire/termination to date of loss (WC)'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 12">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Day of loss; Monday or Friday; day after a holiday'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 13">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Property loss location different than insured’s address'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 14">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'Prior salvage'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
									<xsl:if test="$ipKeyInd = 15">
										<li>
											<font face="arial" size="2">
												<xsl:value-of select="'VIN failed edit'"/>
											</font>
										</li>
										<br/>
									</xsl:if>
								</td>
							</tr>
							<!--file number-->
							<tr>
								<td class="cell_top_solid" align="center">
									<font face="Veradane">
										<b>ISO File Number</b>
									</font>
								</td>
								<td class="cell_border_solid" align="center" colspan="9">&#160;</td>
							</tr>
							<!-- match reason-->
							<xsl:for-each select="../MatchDetails/com.iso_SumReasonInfo[@ClaimsParty2Ref = $MSP01Id1]">
								<tr>
									<td class="cell_border" align="center">
										<xsl:call-template name="Insert_Anchor_Link">
											<xsl:with-param name="LinkName">
												<xsl:value-of select="com.iso_SumIdentifier"/>
											</xsl:with-param>
											<xsl:with-param name="AnchorName">
												<xsl:value-of select="com.iso_SumIdentifier"/>
											</xsl:with-param>
										</xsl:call-template>
									</td>
									<xsl:variable name="SumspCode" select="com.iso_SumReasonCd"/>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumspCode = 'LT'">
										&#160;<font face="arial" size="2">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
										&#160;
									</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumspCode = 'SI'">
										&#160;<font face="arial" size="2">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
										&#160;
									</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumspCode = 'N'">
										&#160;<font face="arial" size="2">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
										&#160;
									</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumspCode = 'A'">
										&#160;<font face="arial" size="2">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
										&#160;
									</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumspCode = 'S'">
										&#160;<font face="arial" size="2">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
										&#160;
									</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumspCode = 'P'">
										&#160;<font face="arial" size="2">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
										&#160;
									</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumspCode = 'D'">
										&#160;<font face="arial" size="2">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
										&#160;
									</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumspCode = 'V'">
										&#160;<font face="arial" size="2">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
										&#160;
									</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="cell_border" align="center">
										<xsl:choose>
											<xsl:when test="$SumspCode = 'L'">
										&#160;<font face="arial" size="2">
													<xsl:value-of select="'X'"/>
												</font>
											</xsl:when>
											<xsl:otherwise>
										&#160;
									</xsl:otherwise>
										</xsl:choose>
									</td>
								</tr>
							</xsl:for-each>
							<!-- <td width="32" class="cell_border" align="center">&#160;&#160;</td>-->
							<!--key indicator-->
							<!--<tr>
							<td width="222" rowspan="25" valign="top" class="cell_border" align="left">
								<li>Prior claim history</li>
							</td>	
							</tr>-->
						</table>
					</xsl:if>
				</td>
			</tr>
		</table>
	</xsl:template>
	<!--end CCOR-->
	<!--
*********************************************************************************
*	 
*	      Name="Display_Involved_Party" Template
*
*			Builds the initiating involved party Claims  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Involved_Party">
		<xsl:param name="DeathMasterNode"/>
		<xsl:variable name="CPId" select="@id"/>
		<xsl:variable name="ClaimsPartyRoleCd" select="ClaimsPartyInfo/ClaimsPartyRoleCd"/>
		<tr>
			<td colspan="5">
				<hr noshade="noshade" size="1"/>
			</td>
		</tr>
		<xsl:call-template name="Insert_Header_Using_Code_List">
			<xsl:with-param name="Data_Name">Involved Party</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$ClaimsPartyRoleCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/MiscPartyRoleCds/*[@code=$ClaimsPartyRoleCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:choose>
			<xsl:when test="string-length(GeneralPartyInfo/NameInfo/PersonName) != 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
						<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/OtherGivenName) != 0 ">
						&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
						</xsl:if>
						<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/Surname) != 0 ">
						&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>
						</xsl:if>
					</xsl:with-param>
				</xsl:call-template>
				<!--displaying first name,last anme and middle name in one line please see above code
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">First Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Middle Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
					</xsl:with-param>
				</xsl:call-template>
				-->
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Business Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
		<xsl:variable name="SplitZip" select="GeneralPartyInfo/Addr/PostalCode"/>
		<xsl:call-template name="Insert_Addr">
			<xsl:with-param name="Title">Address</xsl:with-param>
			<xsl:with-param name="Addr1">
				<xsl:value-of select="GeneralPartyInfo/Addr/Addr1"/>
			</xsl:with-param>
			<xsl:with-param name="Addr2">
				<xsl:value-of select="GeneralPartyInfo/Addr/Addr2"/>
			</xsl:with-param>
			<xsl:with-param name="City">
				<xsl:value-of select="GeneralPartyInfo/Addr/City"/>
			</xsl:with-param>
			<xsl:with-param name="State">
				<xsl:value-of select="GeneralPartyInfo/Addr/StateProvCd"/>
			</xsl:with-param>
			<xsl:with-param name="ZipCode">
				<!--<xsl:value-of select="GeneralPartyInfo/Addr/PostalCode"/>-->
				<xsl:value-of select="substring($SplitZip, 1, 5)"/>
				<xsl:if test="string-length($SplitZip) &gt; 5">-</xsl:if>
				<xsl:value-of select="substring($SplitZip, 6, 9)"/>
			</xsl:with-param>
			<xsl:with-param name="Country">
				<xsl:value-of select="GeneralPartyInfo/Addr/CountryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MO01BirthDate" select="PersonInfo/BirthDt"/>
		<xsl:if test="count($MO01BirthDate) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">DOB</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="PersonInfo/BirthDt"/>-->
					<xsl:number value="substring($MO01BirthDate,6,2)" format="01/"/>
					<xsl:number value="substring($MO01BirthDate,9,2)" format="01/"/>
					<xsl:number value="substring($MO01BirthDate,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="CMSDeathDt" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/EventInfo[EventCd = 'Death']/EventDt"/>
		<xsl:if test="count($CMSDeathDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Date Of Death</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($CMSDeathDt,6,2)" format="01/"/>
					<xsl:number value="substring($CMSDeathDt,9,2)" format="01/"/>
					<xsl:number value="substring($CMSDeathDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="Gender" select="PersonInfo/GenderCd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Gender</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="PersonInfo/GenderCd"/>-->
				<xsl:if test="$Gender = 'M'">MALE</xsl:if>
				<xsl:if test="$Gender = 'F'">FEMALE</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="HomeNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>
		<xsl:if test="count($HomeNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Home Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>-->
					<!--<xsl:number value="substring(GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd ='Home']/PhoneNumber,4,3)" format="(001"/><xsl:number value="substring(GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber,8,3)" format=") 001-"/><xsl:number value="substring(GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber,11,4)" format="0001"/>-->
					<xsl:number value="substring($HomeNum,4,3)" format="(001"/>
					<xsl:number value="substring($HomeNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($HomeNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="BusinessNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>
		<xsl:if test="count($BusinessNum) &gt;0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Business Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>-->
					<xsl:number value="substring($BusinessNum,4,3)" format="(001"/>
					<xsl:number value="substring($BusinessNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($BusinessNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="CellNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>
		<xsl:if test="count($CellNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Cellular Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>-->
					<xsl:number value="substring($CellNum,4,3)" format="(001"/>
					<xsl:number value="substring($CellNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($CellNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:variable name="PagerNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Pager']/PhoneNumber"/>
		<xsl:if test="count($PagerNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Pager Number</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($PagerNum,4,3)" format="(001"/>
					<xsl:number value="substring($PagerNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($PagerNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Pager PIN</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="substring($PagerNum, 16)"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="PagerNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Pager']/PhoneNumber"/>
		<xsl:if test="count($PagerNum) &gt; 0">
			<tr>
				<td align="left" colspan="1">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					Pager:
					</font>
					</b>
				</td>
				<td align="left" colspan="1">
					<font size="2" face="Arial">
						<xsl:number value="substring($PagerNum,4,3)" format="(001"/>
						<xsl:number value="substring($PagerNum,8,3)" format=") 001-"/>
						<xsl:number value="substring($PagerNum,11,4)" format="0001"/>
					</font>
					<b>
						<font size="2" face="Arial">
				&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
				&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;PIN:
				</font>
					</b>
					<font size="2" face="Arial">
						<xsl:value-of select="substring($PagerNum, 16,7)"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--
		<xsl:variable name="SSNNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId"/>
		<xsl:variable name="SSNValidationCd" select="PartyInvestigationInfo/SSNValidationCd"/>
		<xsl:if test="count($SSNNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">SSN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($SSNNum,1,3)" format="001-"/>
					<xsl:number value="substring($SSNNum,4,2)" format="01-"/>
					<xsl:number value="substring($SSNNum,6,4)" format="0001"/>
					(<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SSNValidationCds/*[@code=$SSNValidationCd]"/>)
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">SSN From</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">SSN To</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">SSN State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
	-->
		<xsl:variable name="SSNNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId"/>
		<xsl:variable name="SSNValidationCd" select="PartyInvestigationInfo/SSNValidationCd"/>
		<xsl:variable name="MaskSSN" select="substring($SSNNum,1,5)"/>
		<!--
		<xsl:if test="count($SSNNum) &gt; 0">
			<xsl:choose>
				<xsl:when test="$SSNValidationCd = 'V'">
			
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">SSN</xsl:with-param>
					
					<xsl:with-param name="Data_Value">
						<xsl:number value="substring($SSNNum,1,3)" format="001-"/>
						<xsl:number value="substring($SSNNum,4,2)" format="01-"/>
						<xsl:number value="substring($SSNNum,6,4)" format="0001"/>
						&#160;was &#160;<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SSNValidationCds/*[@code=$SSNValidationCd]"/>
					</xsl:with-param>
				</xsl:call-template>
			
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">SSN From</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">SSN To</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">SSN State</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd"/>
				</xsl:with-param>
			</xsl:call-template>
			</xsl:when>
			</xsl:choose>
		</xsl:if>
-->
		<xsl:if test="count($SSNNum) &gt; 0">
			<tr>
				<td align="left">&#160;&#160;
					<b>
						<font size="2" face="Arial">
							<xsl:variable name="ChkSt" select="GeneralPartyInfo/Addr/StateProvCd"/>
							<xsl:choose>
								<xsl:when test="$ChkSt = 'AB' or $ChkSt ='BC' or $ChkSt ='MB' or $ChkSt ='NB' or $ChkSt ='NF' or $ChkSt ='NS' or  $ChkSt ='PE' or $ChkSt ='ON' or $ChkSt ='QC' or $ChkSt ='SK' or $ChkSt ='NT' or $ChkSt ='YT'">
								SIN:
								</xsl:when>
								<xsl:otherwise>
								SSN:
								</xsl:otherwise>
							</xsl:choose>
						</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:choose>
							<xsl:when test="$MaskSSN != 00000">
								<xsl:number value="substring($SSNNum,1,3)" format="001-"/>
								<xsl:number value="substring($SSNNum,4,2)" format="01-"/>
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="format-number(substring($SSNNum,1,3), 'XXX-')"/>
								<xsl:value-of select="format-number(substring($SSNNum,4,2), 'XX-')"/>
							</xsl:otherwise>
						</xsl:choose>
						<xsl:number value="substring($SSNNum,6,4)" format="0001"/>
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SSNValidationCds/*[@code=$SSNValidationCd]"/>
						<xsl:if test="$SSNValidationCd != 'I'">
							<xsl:choose>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt) &gt;0 and count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt) &gt;0">
								between&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>&#160;and&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
								</xsl:when>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt) &gt;0">
								&#160;in&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>
								</xsl:when>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt) &gt;0">
								&#160;in&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
								</xsl:when>
							</xsl:choose>
							<xsl:if test="count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd) &gt;0">
							&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd"/>
							</xsl:if>
						</xsl:if>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Death Master Last Name</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$DeathMasterNode/GeneralPartyInfo/NameInfo/PersonName/Surname"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Death Master First Name</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$DeathMasterNode/GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="DeathDt" select="$DeathMasterNode/ClaimsInjuredInfo/EventInfo[EventCd = 'Death']/EventDt"/>
		<xsl:if test="count($DeathDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Date of Death</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($DeathDt,6,2)" format="01/"/>
					<xsl:number value="substring($DeathDt,9,2)" format="01/"/>
					<xsl:number value="substring($DeathDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">City of Death</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$DeathMasterNode/GeneralPartyInfo/Addr/City"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">State of Death</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$DeathMasterNode/GeneralPartyInfo/Addr/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="DeathFName" select="$DeathMasterNode/GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
		<xsl:variable name="DeathLName" select="$DeathMasterNode/GeneralPartyInfo/NameInfo/PersonName/Surname"/>
		<xsl:variable name="DeathDt" select="$DeathMasterNode/ClaimsInjuredInfo/EventInfo[EventCd = 'Death']/EventDt"/>
		<xsl:variable name="DeathCity" select="$DeathMasterNode/GeneralPartyInfo/Addr/City"/>
		<xsl:variable name="DeathSt" select="$DeathMasterNode/GeneralPartyInfo/Addr/StateProvCd"/>
		<xsl:if test="count($DeathFName) &gt;0 or count($DeathLName) &gt;0 or count($DeathDt) &gt;0 or count($DeathCity) &gt;0 or count($DeathSt) &gt;0">
			<tr>
				<td>&#160;</td>
				<td align="left" nowrap="nowrap" colspan="4">
					<font face="Arial" size="2">
					***  SSN of Decedent ***
				</font>
				</td>
			</tr>
			<xsl:if test="count($DeathFName) &gt;0 or count($DeathLName) &gt;0">
				<tr>
					<td>&#160;</td>
					<td align="left" nowrap="nowrap" colspan="4">
						<font face="Arial" size="2">
							<b>Decedent Name:&#160;&#160;&#160;&#160;&#160;</b>
							<xsl:value-of select="$DeathFName"/>&#160;<xsl:value-of select="$DeathLName"/>
						</font>
					</td>
				</tr>
			</xsl:if>
			<xsl:if test="count($DeathDt) &gt;0">
				<tr>
					<td>&#160;</td>
					<td align="left" nowrap="nowrap" colspan="4">
						<font face="Arial" size="2">
							<b>Date of Death:&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;</b>
							<xsl:number value="substring($DeathDt,6,2)" format="01/"/>
							<xsl:number value="substring($DeathDt,9,2)" format="01/"/>
							<xsl:number value="substring($DeathDt,1,4)" format="0001"/>
						</font>
					</td>
				</tr>
			</xsl:if>
			<xsl:if test="count($DeathCity) &gt;0 or count($DeathSt) &gt;0">
				<tr>
					<td>&#160;</td>
					<td align="left" nowrap="nowrap" colspan="4">
						<font face="Arial" size="2">
							<b>City/State of Death:&#160;</b>
							<xsl:value-of select="$DeathCity"/>
							<xsl:value-of select="$DeathSt"/>
						</font>
					</td>
				</tr>
			</xsl:if>
		</xsl:if>
		<!--
		<xsl:variable name="TINNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId"/>
		<xsl:variable name="TINValidationCd" select="PartyInvestigationInfo/TINValidationCd"/>
		<xsl:if test="count($TINNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">TIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($TINNum,1,2)" format="01-"/>
					<xsl:number value="substring($TINNum,3,7)" format="0000001"/>
					(<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TINValidationCds/*[@code=$TINValidationCd]"/>)
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">TIN Issuing City</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxIdSource"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">TIN Issuing State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="TINNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId"/>
		<xsl:variable name="TINValidationCd" select="PartyInvestigationInfo/TINValidationCd"/>
		<xsl:if test="count($TINNum) &gt; 0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					TIN:
					</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:number value="substring($TINNum,1,2)" format="01-"/>
						<xsl:number value="substring($TINNum,3,7)" format="0000001"/>
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TINValidationCds/*[@code=$TINValidationCd]"/>
						<xsl:if test="count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxIdSource) &gt;0 or count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/StateProvCd) &gt;0">
						&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxIdSource"/>&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/StateProvCd"/>
						</xsl:if>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="HICN" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_HICN"/>
		<xsl:if test="count($HICN) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">HICN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$HICN"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="StopCMSQuery" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_StopCMSQuery"/>
		<xsl:if test="count($StopCMSQuery) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Stop CMS Query</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:if test="$StopCMSQuery='Y'">YES</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Drivers License</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsDriverInfo/DriversLicense/DriversLicenseNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Drivers License State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsDriverInfo/DriversLicense/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="DriverLicNum" select="ClaimsDriverInfo/DriversLicense/DriversLicenseNumber"/>
		<xsl:variable name="DriverSt" select="ClaimsDriverInfo/DriversLicense/StateProvCd"/>
		<xsl:if test="count($DriverLicNum) &gt; 0">
			<tr>
				<td align="left" colspan="1">&#160;&#160;
					<b>
						<font size="2" face="Arial">
						Drivers License:
						</font>
					</b>
				</td>
				<td align="left" colspan="1">
					<font size="2" face="Arial">
						<xsl:value-of select="$DriverLicNum"/>
					</font>
					<xsl:if test="count($DriverSt) &gt; 0">
						<b>
							<font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;State:
						</font>
						</b>
						<font size="2" face="Arial">
							<xsl:value-of select="$DriverSt"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Occupation</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="PersonInfo/OccupationDesc"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Med./Prof. License</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/NonTaxIdentity[NonTaxIdTypeCd = 'ProfLicense']/NonTaxId"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:variable name="MedEligInd" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_MedicareEligibleInd"/>
		<xsl:if test="count($MedEligInd) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Medicare Eligible</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:if test="$MedEligInd='Y'">Yes</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		-->
		<xsl:variable name="NotSendToCMS" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_NotSendToCMS"/>
		<xsl:if test="count($NotSendToCMS) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Do not send this party to CMS</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:if test="$NotSendToCMS='Y'">YES</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="../RemarkText[@idref = $CPId]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="CDFoundInd" select="../com.iso_ClaimDirectorInd"/>
		<!--Medicare Eligible-->
		<xsl:variable name="MedEligFoundInd" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_MedicareEligibleInd"/>
		<!--<xsl:if test="$CDFoundInd = 1 and count($MedEligFoundInd) &gt; 0">-->
		<xsl:if test="$CDFoundInd = 1 and $MedEligFoundInd= 'Y'">
			<tr>
				<td colspan="5">
					<font face="Arial" size="2">** This Person is Medicare Eligible. **</font>
				</td>
			</tr>
		</xsl:if>
		<!--end Medicare Eligible-->
		<xsl:variable name="SIUInvolved" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_SIUInvolved"/>
		<xsl:variable name="SIUNotPaid" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_ClaimNotPaid"/>
		<xsl:variable name="SIUEnforceAction" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_EnforcementActionSubject"/>
		<xsl:variable name="SIUFraudBureau" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_CriteriaForFraudBureau"/>
		<xsl:variable name="SIUNICBAlert" select="../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_NICBAlert"/>
		<!--<xsl:if test="count($SIUInvolved) &gt;0 or count($SIUNotPaid) &gt;0 or count($SIUEnforceAction) &gt;0 or count($SIUFraudBureau) &gt;0 or count($SIUNICBAlert) &gt;0">-->
		<xsl:if test="$SIUInvolved ='Y' or $SIUNotPaid = 'Y' or $SIUEnforceAction = 'Y' or $SIUFraudBureau = 'Y' or $SIUNICBAlert = 'Y'">
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Investigation Details</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="$SIUInvolved = 'Y'">
			<tr>
				<td align="left" colspan="4">
					<font size="2" face="Arial">
						&#160;&#160;<xsl:value-of select="'>  PARTY SUBJECT TO SIU INVESTIGATION'"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="$SIUNotPaid = 'Y'">
			<tr>
				<td align="left" colspan="4">
					<font size="2" face="Arial">
						&#160;&#160;<xsl:value-of select="'>  CLAIM OR PART OF CLAIM FOR THIS PARTY WAS NOT PAID AFTER INVESTIGATION'"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="$SIUEnforceAction = 'Y'">
			<tr>
				<td align="left" colspan="4">
					<font size="2" face="Arial">
						&#160;&#160;<xsl:value-of select="'>  PARTY WAS SUBJECT TO AN ENFORCEMENT ACTION (CRIMINAL INDICTMENT, PROFESSIONAL DISCIPLINARY ACTION)'"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="$SIUFraudBureau = 'Y'">
			<tr>
				<td align="left" colspan="4">
					<font size="2" face="Arial">
						&#160;&#160;<xsl:value-of select="'>  CLAIM FOR THIS PARTY MEETS CRITERIA FOR STATE FRAUD BUREAU REPORTING'"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="$SIUNICBAlert = 'Y'">
			<tr>
				<td align="left" colspan="4">
					<font size="2" face="Arial">
						&#160;&#160;<xsl:value-of select="'>  THERE IS AN NICB ALERT ASSOCIATED WITH THIS PARTY'"/>
					</font>
				</td>
			</tr>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Name="Display_MK01" Template
*
*			Builds the initiating AKA/Prior records  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Alias">
		<xsl:param name="DeathMasterNode" select="EmptyNode"/>
		<xsl:variable name="CPId" select="@id"/>
		<xsl:call-template name="Insert_Header">
			<xsl:with-param name="Data_Name">Also Known As (AKA)</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="Deathma" select=" ../ClaimsPartyRelationship[@ClaimsParty1Ref = $CPId][ClaimsPartyRole2Cd = 'DeathMaster']/@ClaimsParty2Ref"/>
		<xsl:variable name="Deathma1" select="../ClaimsParty[@id = $Deathma and ClaimsPartyInfo/ClaimsPartyRoleCd = 'DeathMaster']"/>
		<xsl:choose>
			<xsl:when test="string-length(GeneralPartyInfo/NameInfo/PersonName) != 0">
				<!--
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Last Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">First Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Middle Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
					</xsl:with-param>
				</xsl:call-template>
				-->
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
						<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/OtherGivenName) != 0 ">
						&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
						</xsl:if>
						<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/Surname) != 0 ">
						&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>
						</xsl:if>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Business Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
		<xsl:variable name="BirthDate" select="PersonInfo/BirthDt"/>
		<xsl:if test="count($BirthDate) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">DOB</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="PersonInfo/BirthDt"/>-->
					<xsl:number value="substring($BirthDate,6,2)" format="01/"/>
					<xsl:number value="substring($BirthDate,9,2)" format="01/"/>
					<xsl:number value="substring($BirthDate,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Gender</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="PersonInfo/GenderCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="Gender" select="PersonInfo/GenderCd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Gender</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="PersonInfo/GenderCd"/>-->
				<xsl:if test="$Gender = 'M'">MALE</xsl:if>
				<xsl:if test="$Gender = 'F'">FEMALE</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="SplitZip" select="GeneralPartyInfo/Addr/PostalCode"/>
		<xsl:call-template name="Insert_Addr">
			<xsl:with-param name="Title">Address</xsl:with-param>
			<xsl:with-param name="Addr1">
				<xsl:value-of select="GeneralPartyInfo/Addr/Addr1"/>
			</xsl:with-param>
			<xsl:with-param name="Addr2">
				<xsl:value-of select="GeneralPartyInfo/Addr/Addr2"/>
			</xsl:with-param>
			<xsl:with-param name="City">
				<xsl:value-of select="GeneralPartyInfo/Addr/City"/>
			</xsl:with-param>
			<xsl:with-param name="State">
				<xsl:value-of select="GeneralPartyInfo/Addr/StateProvCd"/>
			</xsl:with-param>
			<xsl:with-param name="ZipCode">
				<xsl:value-of select="substring($SplitZip, 1, 5)"/>
				<xsl:if test="string-length($SplitZip) &gt; 5">-</xsl:if>
				<xsl:value-of select="substring($SplitZip, 6, 9)"/>
				<!--<xsl:value-of select="GeneralPartyInfo/Addr/PostalCode"/>-->
			</xsl:with-param>
			<xsl:with-param name="Country">
				<xsl:value-of select="GeneralPartyInfo/Addr/CountryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:variable name="SSNNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId"/>
		<xsl:variable name= "SSNValidationCd" select="PartyInvestigationInfo/SSNValidationCd"/>
		<xsl:if test="count($SSNNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">SSN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($SSNNum,1,3)" format="001-"/>
					<xsl:number value="substring($SSNNum,4,2)" format="01-"/>
					<xsl:number value="substring($SSNNum,6,4)" format="0001"/>
					(<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SSNValidationCds/*[@code=$SSNValidationCd]"/>)
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">SSN From</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">SSN To</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">SSN State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="SSNNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId"/>
		<xsl:variable name="SSNValidationCd" select="PartyInvestigationInfo/SSNValidationCd"/>
		<xsl:variable name="MaskSSN" select="substring($SSNNum,1,5)"/>
		<xsl:if test="count($SSNNum) &gt; 0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					SSN:
					</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:choose>
							<xsl:when test="$MaskSSN != 00000">
								<xsl:number value="substring($SSNNum,1,3)" format="001-"/>
								<xsl:number value="substring($SSNNum,4,2)" format="01-"/>
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="format-number(substring($SSNNum,1,3), 'XXX-')"/>
								<xsl:value-of select="format-number(substring($SSNNum,4,2), 'XX-')"/>
							</xsl:otherwise>
						</xsl:choose>
						<xsl:number value="substring($SSNNum,6,4)" format="0001"/>
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SSNValidationCds/*[@code=$SSNValidationCd]"/>
						<xsl:if test="$SSNValidationCd != 'I'">
							<xsl:choose>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt) &gt;0 and count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt) &gt;0">
							between&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>&#160;and&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
								</xsl:when>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt) &gt;0">
							&#160;in&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>
								</xsl:when>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt) &gt;0">
							&#160;in&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
								</xsl:when>
							</xsl:choose>
							<xsl:if test="count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd) &gt;0">
						&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd"/>
							</xsl:if>
						</xsl:if>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Death Master Last Name</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$DeathMasterNode/GeneralPartyInfo/NameInfo/PersonName/Surname"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Death Master First Name</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$DeathMasterNode/GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MK01DeathDt" select="$DeathMasterNode/ClaimsInjuredInfo/EventInfo[EventCd = 'Death']/EventDt"/>
		<xsl:if test="($MK01DeathDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Date of Death</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($MK01DeathDt,6,2)" format="01/"/>
					<xsl:number value="substring($MK01DeathDt,9,2)" format="01/"/>
					<xsl:number value="substring($MK01DeathDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">City of Death</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$DeathMasterNode/GeneralPartyInfo/Addr/City"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">State of Death</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$DeathMasterNode/GeneralPartyInfo/Addr/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="DeathFName" select="$Deathma1/GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
		<xsl:variable name="DeathLName" select="$Deathma1/GeneralPartyInfo/NameInfo/PersonName/Surname"/>
		<xsl:variable name="DeathDt" select="$Deathma1/ClaimsInjuredInfo/EventInfo[EventCd = 'Death']/EventDt"/>
		<xsl:variable name="DeathCity" select="$Deathma1/GeneralPartyInfo/Addr/City"/>
		<xsl:variable name="DeathSt" select="$Deathma1/GeneralPartyInfo/Addr/StateProvCd"/>
		<xsl:if test="count($DeathFName) &gt;0 or count($DeathLName) &gt;0 or count($DeathDt) &gt;0 or count($DeathCity) &gt;0 or count($DeathSt) &gt;0">
			<tr>
				<td>&#160;</td>
				<td align="left" nowrap="nowrap" colspan="4">
					<font face="Arial" size="2">
					***  SSN of Decedent ***
				</font>
				</td>
			</tr>
			<xsl:if test="count($DeathFName) &gt;0 or count($DeathLName) &gt;0">
				<tr>
					<td>&#160;</td>
					<td align="left" nowrap="nowrap" colspan="4">
						<font face="Arial" size="2">
							<b>Decedent Name:&#160;&#160;&#160;&#160;&#160;</b>
							<xsl:value-of select="$DeathFName"/>&#160;<xsl:value-of select="$DeathLName"/>
						</font>
					</td>
				</tr>
			</xsl:if>
			<xsl:if test="count($DeathDt) &gt;0">
				<tr>
					<td>&#160;</td>
					<td align="left" nowrap="nowrap" colspan="4">
						<font face="Arial" size="2">
							<b>Date of Death:&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;</b>
							<xsl:number value="substring($DeathDt,6,2)" format="01/"/>
							<xsl:number value="substring($DeathDt,9,2)" format="01/"/>
							<xsl:number value="substring($DeathDt,1,4)" format="0001"/>
						</font>
					</td>
				</tr>
			</xsl:if>
			<xsl:if test="count($DeathCity) &gt;0 or count($DeathSt) &gt;0">
				<tr>
					<td>&#160;</td>
					<td align="left" nowrap="nowrap" colspan="4">
						<font face="Arial" size="2">
							<b>City/State of Death:&#160;</b>
							<xsl:value-of select="$DeathCity"/>
							<xsl:value-of select="$DeathSt"/>
						</font>
					</td>
				</tr>
			</xsl:if>
		</xsl:if>
		<!--
		<xsl:variable name="TINNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId"/>
		<xsl:variable name="TINValidationCd" select="PartyInvestigationInfo/TINValidationCd"/>
		<xsl:if test="count($TINNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">TIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($TINNum,1,2)" format="01-"/>
					<xsl:number value="substring($TINNum,3,7)" format="0000001"/>
					(<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TINValidationCds/*[@code=$TINValidationCd]"/>)
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">TIN Issuing City</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxIdSource"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">TIN Issuing State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="TINNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId"/>
		<xsl:variable name="TINValidationCd" select="PartyInvestigationInfo/TINValidationCd"/>
		<xsl:if test="count($TINNum) &gt; 0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					TIN:
					</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:number value="substring($TINNum,1,2)" format="01-"/>
						<xsl:number value="substring($TINNum,3,7)" format="0000001"/>
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TINValidationCds/*[@code=$TINValidationCd]"/>
						<xsl:if test="count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxIdSource) &gt;0 or count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/StateProvCd) &gt;0">
						&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxIdSource"/>&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/StateProvCd"/>
						</xsl:if>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Med./Prof. License</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/NonTaxIdentity[NonTaxIdTypeCd = 'ProfLicense']/NonTaxId"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="AKA_HomeNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>
		<xsl:if test="count($AKA_HomeNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Home Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>-->
					<xsl:number value="substring($AKA_HomeNum,4,3)" format="(001"/>
					<xsl:number value="substring($AKA_HomeNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($AKA_HomeNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="AKA_BusinessNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>
		<xsl:if test="count($AKA_BusinessNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Business Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>-->
					<xsl:number value="substring($AKA_BusinessNum,4,3)" format="(001"/>
					<xsl:number value="substring($AKA_BusinessNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($AKA_BusinessNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="AKA_CellNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>
		<xsl:if test="count($AKA_CellNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Cellular Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>-->
					<xsl:number value="substring($AKA_CellNum,4,3)" format="(001"/>
					<xsl:number value="substring($AKA_CellNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($AKA_CellNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Name="Display_Service_Provider" Template
*
*			Builds the initiating service provider records  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Service_Provider">
		<xsl:variable name="CPId" select="@id"/>
		<xsl:variable name="ClaimsPartyRoleCd" select="ClaimsPartyInfo/ClaimsPartyRoleCd"/>
		<xsl:call-template name="Insert_Header_Using_Code_List">
			<xsl:with-param name="Data_Name">Service Provider</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$ClaimsPartyRoleCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/MiscPartyRoleCds/*[@code=$ClaimsPartyRoleCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:choose>
			<xsl:when test="string-length(GeneralPartyInfo/NameInfo/PersonName) != 0">
				<!--
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Last Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">First Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Middle Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
					</xsl:with-param>
				</xsl:call-template>
				-->
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
						<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/OtherGivenName) != 0 ">
						&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
						</xsl:if>
						<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/Surname) != 0 ">
						&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>
						</xsl:if>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Business Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
		<xsl:variable name="MSP1BirthDt" select="PersonInfo/BirthDt"/>
		<xsl:if test="($MSP1BirthDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">DOB</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="PersonInfo/BirthDt"/>-->
					<xsl:number value="substring($MSP1BirthDt,6,2)" format="01/"/>
					<xsl:number value="substring($MSP1BirthDt,9,2)" format="01/"/>
					<xsl:number value="substring($MSP1BirthDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Gender</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="PersonInfo/GenderCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="Gender" select="PersonInfo/GenderCd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Gender</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="PersonInfo/GenderCd"/>-->
				<xsl:if test="$Gender = 'M'">MALE</xsl:if>
				<xsl:if test="$Gender = 'F'">FEMALE</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Drivers License Number</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsDriverInfo/DriversLicense/DriversLicenseNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Drivers License State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="ClaimsDriverInfo/DriversLicense/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="DriverLicNum" select="ClaimsDriverInfo/DriversLicense/DriversLicenseNumber"/>
		<xsl:variable name="DriverSt" select="ClaimsDriverInfo/DriversLicense/StateProvCd"/>
		<xsl:if test="count($DriverLicNum) &gt; 0">
			<tr>
				<td align="left" colspan="1">&#160;&#160;
					<b>
						<font size="2" face="Arial">
						Drivers License:
						</font>
					</b>
				</td>
				<td align="left" colspan="1">
					<font size="2" face="Arial">
						<xsl:value-of select="$DriverLicNum"/>
					</font>
					<xsl:if test="count($DriverSt) &gt; 0">
						<b>
							<font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;State:
						</font>
						</b>
						<font size="2" face="Arial">
							<xsl:value-of select="$DriverSt"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="SplitZip" select="GeneralPartyInfo/Addr/PostalCode"/>
		<xsl:call-template name="Insert_Addr">
			<xsl:with-param name="Title">Address</xsl:with-param>
			<xsl:with-param name="Addr1">
				<xsl:value-of select="GeneralPartyInfo/Addr/Addr1"/>
			</xsl:with-param>
			<xsl:with-param name="Addr2">
				<xsl:value-of select="GeneralPartyInfo/Addr/Addr2"/>
			</xsl:with-param>
			<xsl:with-param name="City">
				<xsl:value-of select="GeneralPartyInfo/Addr/City"/>
			</xsl:with-param>
			<xsl:with-param name="State">
				<xsl:value-of select="GeneralPartyInfo/Addr/StateProvCd"/>
			</xsl:with-param>
			<xsl:with-param name="ZipCode">
				<!--<xsl:value-of select="GeneralPartyInfo/Addr/PostalCode"/>-->
				<xsl:value-of select="substring($SplitZip, 1, 5)"/>
				<xsl:if test="string-length($SplitZip) &gt; 5">-</xsl:if>
				<xsl:value-of select="substring($SplitZip, 6, 9)"/>
			</xsl:with-param>
			<xsl:with-param name="Country">
				<xsl:value-of select="GeneralPartyInfo/Addr/CountryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Med./Prof. License</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/NonTaxIdentity[NonTaxIdTypeCd = 'ProfLicense']/NonTaxId"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="SP_HomeNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>
		<xsl:if test="count($SP_HomeNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Home Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>-->
					<xsl:number value="substring($SP_HomeNum,4,3)" format="(001"/>
					<xsl:number value="substring($SP_HomeNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($SP_HomeNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="SP_BusinessNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>
		<xsl:if test="count($SP_BusinessNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Business Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>-->
					<xsl:number value="substring($SP_BusinessNum,4,3)" format="(001"/>
					<xsl:number value="substring($SP_BusinessNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($SP_BusinessNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="SP_CellNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>
		<xsl:if test="count($SP_CellNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Cellular Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>-->
					<xsl:number value="substring($SP_CellNum,4,3)" format="(001"/>
					<xsl:number value="substring($SP_CellNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($SP_CellNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:variable name="PagerNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Pager']/PhoneNumber"/>
		<xsl:if test="count($PagerNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Pager</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($PagerNum,4,3)" format="(001"/>
					<xsl:number value="substring($PagerNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($PagerNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Pager PIN</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="substring($PagerNum, 16)"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="PagerNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Pager']/PhoneNumber"/>
		<xsl:if test="count($PagerNum) &gt; 0">
			<tr>
				<td align="left" colspan="1">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					Pager:
					</font>
					</b>
				</td>
				<td align="left" colspan="1">
					<font size="2" face="Arial">
						<xsl:number value="substring($PagerNum,4,3)" format="(001"/>
						<xsl:number value="substring($PagerNum,8,3)" format=") 001-"/>
						<xsl:number value="substring($PagerNum,11,4)" format="0001"/>
					</font>
					<b>
						<font size="2" face="Arial">
				&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
				&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;PIN:
				</font>
					</b>
					<font size="2" face="Arial">
						<xsl:value-of select="substring($PagerNum,16,7)"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--
		<xsl:variable name="SSNNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId"/>
		<xsl:variable name="SSNValidationCd" select="PartyInvestigationInfo/SSNValidationCd"/>
		<xsl:if test="count($SSNNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">SSN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($SSNNum,1,3)" format="001-"/>
					<xsl:number value="substring($SSNNum,4,2)" format="01-"/>
					<xsl:number value="substring($SSNNum,6,4)" format="0001"/>
					(<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SSNValidationCds/*[@code=$SSNValidationCd]"/>)
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">SSN From</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">SSN To</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">SSN State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="SSNNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId"/>
		<xsl:variable name="SSNValidationCd" select="PartyInvestigationInfo/SSNValidationCd"/>
		<xsl:variable name="MaskSSN" select="substring($SSNNum,1,5)"/>
		<xsl:if test="count($SSNNum) &gt; 0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					SSN:
					</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:choose>
							<xsl:when test="$MaskSSN != 00000">
								<xsl:number value="substring($SSNNum,1,3)" format="001-"/>
								<xsl:number value="substring($SSNNum,4,2)" format="01-"/>
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="format-number(substring($SSNNum,1,3), 'XXX-')"/>
								<xsl:value-of select="format-number(substring($SSNNum,4,2), 'XX-')"/>
							</xsl:otherwise>
						</xsl:choose>
						<xsl:number value="substring($SSNNum,6,4)" format="0001"/>
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SSNValidationCds/*[@code=$SSNValidationCd]"/>
						<xsl:if test="$SSNValidationCd != 'I'">
							<xsl:choose>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt) &gt;0 and count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt) &gt;0">
							between&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>&#160;and&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
								</xsl:when>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt) &gt;0">
							&#160;in&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>
								</xsl:when>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt) &gt;0">
							&#160;in&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
								</xsl:when>
							</xsl:choose>
							<xsl:if test="count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd) &gt;0">
						&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd"/>
							</xsl:if>
						</xsl:if>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--
		<xsl:variable name="TINNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId"/>
		<xsl:variable name="TINValidationCd" select="PartyInvestigationInfo/TINValidationCd"/>
		<xsl:if test="count($TINNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">TIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($TINNum,1,2)" format="01-"/>
					<xsl:number value="substring($TINNum,3,7)" format="0000001"/>
					(<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TINValidationCds/*[@code=$TINValidationCd]"/>)
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">TIN Issuing City</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxIdSource"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">TIN Issuing State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="TINNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId"/>
		<xsl:variable name="TINValidationCd" select="PartyInvestigationInfo/TINValidationCd"/>
		<xsl:if test="count($TINNum) &gt; 0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					TIN:
					</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:number value="substring($TINNum,1,2)" format="01-"/>
						<xsl:number value="substring($TINNum,3,7)" format="0000001"/>
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TINValidationCds/*[@code=$TINValidationCd]"/>
						<xsl:if test="count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxIdSource) &gt;0 or count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/StateProvCd) &gt;0">
						&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxIdSource"/>&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/StateProvCd"/>
						</xsl:if>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--Investigation Details-->
		<xsl:variable name="SIUInvolved" select="../com.iso_SIUParty[@ClaimsParty2Ref = $CPId]/com.iso_SIUInvolved"/>
		<xsl:variable name="SIUNotPaid" select="../com.iso_SIUParty[@ClaimsParty2Ref = $CPId]/com.iso_ClaimNotPaid"/>
		<xsl:variable name="SIUEnforceAction" select="../com.iso_SIUParty[@ClaimsParty2Ref = $CPId]/com.iso_EnforcementActionSubject"/>
		<xsl:variable name="SIUFraudBureau" select="../com.iso_SIUParty[@ClaimsParty2Ref = $CPId]/com.iso_CriteriaForFraudBureau"/>
		<xsl:variable name="SIUNICBAlert" select="../com.iso_SIUParty[@ClaimsParty2Ref = $CPId]/com.iso_NICBAlert"/>
		<!--<xsl:if test="count($SIUInvolved) &gt;0 or count($SIUNotPaid) &gt;0 or count($SIUEnforceAction) &gt;0 or count($SIUFraudBureau) &gt;0 or count($SIUNICBAlert) &gt;0">-->
		<xsl:if test="$SIUInvolved ='Y' or $SIUNotPaid = 'Y' or $SIUEnforceAction = 'Y' or $SIUFraudBureau = 'Y' or $SIUNICBAlert = 'Y'">
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Investigation Details</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="$SIUInvolved = 'Y'">
			<tr>
				<td align="left" colspan="4">
					<font size="2" face="Arial">
						&#160;&#160;<xsl:value-of select="'>  PARTY SUBJECT TO SIU INVESTIGATION'"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="$SIUNotPaid = 'Y'">
			<tr>
				<td align="left" colspan="4">
					<font size="2" face="Arial">
						&#160;&#160;<xsl:value-of select="'>  CLAIM OR PART OF CLAIM FOR THIS PARTY WAS NOT PAID AFTER INVESTIGATION'"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="$SIUEnforceAction = 'Y'">
			<tr>
				<td align="left" colspan="4">
					<font size="2" face="Arial">
						&#160;&#160;<xsl:value-of select="'>  PARTY WAS SUBJECT TO AN ENFORCEMENT ACTION (CRIMINAL INDICTMENT, PROFESSIONAL DISCIPLINARY ACTION)'"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="$SIUFraudBureau = 'Y'">
			<tr>
				<td align="left" colspan="4">
					<font size="2" face="Arial">
						&#160;&#160;<xsl:value-of select="'>  CLAIM FOR THIS PARTY MEETS CRITERIA FOR STATE FRAUD BUREAU REPORTING'"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="$SIUNICBAlert = 'Y'">
			<tr>
				<td align="left" colspan="4">
					<font size="2" face="Arial">
						&#160;&#160;<xsl:value-of select="'>  THERE IS AN NICB ALERT ASSOCIATED WITH THIS PARTY'"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--end investigation details-->
	</xsl:template>
	<!--	
*********************************************************************************
*	 
*	      Name="Display_Additional_Claimant_Information" Template
*
*			Builds the Additional Claimant Information  
*
*		GAURAV : Added on 11/05/09
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Additional_Claimant_Information">
		<xsl:variable name="CPId" select="@id"/>
		<tr>
			<td colspan="5">
				<hr noshade="noshade" size="1"/>
			</td>
		</tr>
		<xsl:variable name="ClaimsPartyRoleCd" select="ClaimsPartyInfo/ClaimsPartyRoleCd"/>
		<xsl:call-template name="Insert_Header_Using_Code_List">
			<xsl:with-param name="Data_Name">Additional Claimant Information</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$ClaimsPartyRoleCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<!-- <xsl:value-of select="$xmlCodeList/ClaimsearchCodes/MiscPartyRoleCds/*[@code=$ClaimsPartyRoleCd]"/> -->
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/MiscPartyRoleCds/*[@code=$ClaimsPartyRoleCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:choose>
			<xsl:when test="string-length(GeneralPartyInfo/NameInfo/PersonName) != 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
						<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/OtherGivenName) != 0 ">
						&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
						</xsl:if>
						<xsl:if test="string-length(GeneralPartyInfo/NameInfo/PersonName/Surname) != 0 ">
						&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>
						</xsl:if>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Business Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
		<xsl:variable name="SplitZip" select="GeneralPartyInfo/Addr/PostalCode"/>
		<xsl:call-template name="Insert_Addr">
			<xsl:with-param name="Title">Address</xsl:with-param>
			<xsl:with-param name="Addr1">
				<xsl:value-of select="GeneralPartyInfo/Addr/Addr1"/>
			</xsl:with-param>
			<xsl:with-param name="Addr2">
				<xsl:value-of select="GeneralPartyInfo/Addr/Addr2"/>
			</xsl:with-param>
			<xsl:with-param name="City">
				<xsl:value-of select="GeneralPartyInfo/Addr/City"/>
			</xsl:with-param>
			<xsl:with-param name="State">
				<xsl:value-of select="GeneralPartyInfo/Addr/StateProvCd"/>
			</xsl:with-param>
			<xsl:with-param name="ZipCode">
				<!--<xsl:value-of select="GeneralPartyInfo/Addr/PostalCode"/>-->
				<xsl:value-of select="substring($SplitZip, 1, 5)"/>
				<xsl:if test="string-length($SplitZip) &gt; 5">-</xsl:if>
				<xsl:value-of select="substring($SplitZip, 6, 9)"/>
			</xsl:with-param>
			<xsl:with-param name="Country">
				<xsl:value-of select="GeneralPartyInfo/Addr/CountryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="SSNNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId"/>
		<xsl:variable name="SSNValidationCd" select="PartyInvestigationInfo/SSNValidationCd"/>
		<xsl:variable name="MaskSSN" select="substring($SSNNum,1,5)"/>
		<xsl:if test="count($SSNNum) &gt; 0">
			<tr>
				<td align="left">&#160;&#160;
					<b>
						<font size="2" face="Arial">
							<xsl:variable name="ChkSt" select="GeneralPartyInfo/Addr/StateProvCd"/>
							<xsl:choose>
								<xsl:when test="$ChkSt = 'AB' or $ChkSt ='BC' or $ChkSt ='MB' or $ChkSt ='NB' or $ChkSt ='NF' or $ChkSt ='NS' or  $ChkSt ='PE' or $ChkSt ='ON' or $ChkSt ='QC' or $ChkSt ='SK' or $ChkSt ='NT' or $ChkSt ='YT'">
								SIN:
								</xsl:when>
								<xsl:otherwise>
								SSN:
								</xsl:otherwise>
							</xsl:choose>
						</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:choose>
							<xsl:when test="$MaskSSN != 00000">
								<xsl:number value="substring($SSNNum,1,3)" format="001-"/>
								<xsl:number value="substring($SSNNum,4,2)" format="01-"/>
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="format-number(substring($SSNNum,1,3), 'XXX-')"/>
								<xsl:value-of select="format-number(substring($SSNNum,4,2), 'XX-')"/>
							</xsl:otherwise>
						</xsl:choose>
						<xsl:number value="substring($SSNNum,6,4)" format="0001"/>
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SSNValidationCds/*[@code=$SSNValidationCd]"/>
						<xsl:if test="$SSNValidationCd != 'I'">
							<xsl:choose>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt) &gt;0 and count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt) &gt;0">
								between&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>&#160;and&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
								</xsl:when>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt) &gt;0">
								&#160;in&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/EffectiveDt"/>
								</xsl:when>
								<xsl:when test="count(PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt) &gt;0">
								&#160;in&#160;<xsl:value-of select="PartyInvestigationInfo/SocialSecurityIssuancePeriod/ExpirationDt"/>
								</xsl:when>
							</xsl:choose>
							<xsl:if test="count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd) &gt;0">
							&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/StateProvCd"/>
							</xsl:if>
						</xsl:if>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="TINNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId"/>
		<xsl:variable name="TINValidationCd" select="PartyInvestigationInfo/TINValidationCd"/>
		<xsl:if test="count($TINNum) &gt; 0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					TIN:
					</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:number value="substring($TINNum,1,2)" format="01-"/>
						<xsl:number value="substring($TINNum,3,7)" format="0000001"/>
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TINValidationCds/*[@code=$TINValidationCd]"/>
						<xsl:if test="count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxIdSource) &gt;0 or count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/StateProvCd) &gt;0">
						&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxIdSource"/>&#160;in&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/StateProvCd"/>
						</xsl:if>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="HomeNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>
		<xsl:if test="count($HomeNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Home Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($HomeNum,4,3)" format="(001"/>
					<xsl:number value="substring($HomeNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($HomeNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Casualy_Info Template
*
*			Display the initiating casualty records
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Casualy_Info">
		<xsl:param name="ClaimsInjNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="AdjusterNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="ClaimsPayNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="CMS_cov"/>
		<xsl:variable name="MC01Id" select="$ClaimsInjNode/@id"/>
		<xsl:variable name="InjInfoId" select="$AdjusterNode/@AssignmentRef"/>
		<!--<xsl:value-of select="$CMS_cov[@itemRef = $InjInfoId]"/>-->
		<xsl:call-template name="Insert_Header">
			<xsl:with-param name="Data_Name">Casualty Coverage Information</xsl:with-param>
		</xsl:call-template>
		<xsl:if test="string-length(normalize-space($AdjusterNode)) &gt; 0">
			<xsl:variable name="CoverageType" select="$AdjusterNode/CoverageCd"/>
			<xsl:variable name="LossType" select="$AdjusterNode/LossCauseCd"/>
			<xsl:call-template name="Insert_Adjuster">
				<xsl:with-param name="CoverageType">
					<xsl:value-of select="$CoverageType"/>
				</xsl:with-param>
				<xsl:with-param name="LossType">
					<xsl:value-of select="$LossType"/>
				</xsl:with-param>
				<xsl:with-param name="CoverageType_Value">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageType]"/>
				</xsl:with-param>
				<xsl:with-param name="LossType_Value">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=$LossType]"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--*********************************** GAURAV : Updated for Date Claim Closed *********************************** -->
		<xsl:variable name="ClaimStatusCd" select="$ClaimRoot/ClaimsPayment[@idref = $InjInfoId]/ClaimsPaymentCovInfo/ClaimStatusCd"/>
		<xsl:if test="string-length($ClaimStatusCd) != 0">
			<tr>
				<td align="left">&#160;&#160;
					<b>
						<font size="2" face="Arial">Claim Status:</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ClaimStatusCds/*[@code=$ClaimStatusCd]"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="MC01CloseDt" select="$ClaimsInjNode/../ClaimsPartyInfo/ClosedDt[contains(@idref,$MC01Id)]"/>
		<xsl:if test="count($MC01CloseDt) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
					<b>
						<font size="2" face="Arial">Date Claim Closed:</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:number value="substring($MC01CloseDt,6,2)" format="01/"/>
						<xsl:number value="substring($MC01CloseDt,9,2)" format="01/"/>
						<xsl:number value="substring($MC01CloseDt,1,4)" format="0001"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--*********************************** GAURAV : Updated for Date Claim Closed *********************************** -->
		<xsl:if test="string-length(normalize-space($AdjusterNode)) &gt; 0">
			<xsl:call-template name="Insert_Adjuster">
				<xsl:with-param name="AdjustingCompany">
					<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
				</xsl:with-param>
				<xsl:with-param name="AdjusterFirstName">
					<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
				</xsl:with-param>
				<xsl:with-param name="AdjusterMiddleName">
					<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
				</xsl:with-param>
				<xsl:with-param name="AdjusterLastName">
					<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/Surname"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="AdjNum" select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>
			<xsl:if test="count($AdjNum) &gt; 0">
				<xsl:call-template name="Insert_Adjuster">
					<xsl:with-param name="AdjusterPhone">
						<!--<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>-->
						<xsl:number value="substring($AdjNum,4,3)" format="(001"/>
						<xsl:number value="substring($AdjNum,8,3)" format=") 001-"/>
						<xsl:number value="substring($AdjNum,11,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Alleged Injury / Property Damage</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimsInjNode[@id=$InjInfoId]/ClaimsInjury/InjuryNatureDesc"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="PartOfBodyCd" select="$ClaimsInjNode[@id=$InjInfoId]/ClaimsInjury/BodyPartCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Part of Body</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$PartOfBodyCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/BodyPartCds/*[@code=$PartOfBodyCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Part of Body</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimsInjNode/ClaimsInjury/BodyPartCd"/>
			</xsl:with-param>
		</xsl:call-template>-->
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Nature of Injury</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimsInjNode[@id=$InjInfoId]/ICDDiagnosticCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<!-- ICD9 code-->
		<xsl:variable name="ICD9Cd" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef= $InjInfoId]/ICDDiagnosticCd"/>
		<xsl:if test="count($ICD9Cd) &gt; 0">
			<tr>
				<td align="left" nowrap="nowrap">
				&#160;&#160;
					
						<font size="2" face="Arial">
						<b>
							<xsl:value-of select="'ICD9'"/>:</b>
					</font>
				</td>
				<td align="left" nowrap="nowrap">
					<font size="2" face="Arial">
						<xsl:for-each select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/ICDDiagnosticCd">
							<xsl:value-of select="."/>
							<br/>
						</xsl:for-each>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--end ICD9 code-->
		<xsl:if test="count($ClaimsInjNode[@id=$InjInfoId]/ClaimsInjury/InjuryNatureDesc) = 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Alleged Injury / Property Damage</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/InjuryNatureDesc"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Cause Of Injury</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/com.iso_CauseofInjuryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="TortThresholdTypeCd" select="$ClaimRoot/LitigationInfo[@PlaintiffRefs=$InjInfoId]/ThresholdTypeCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Tort Threshold</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$TortThresholdTypeCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TortThresholdTypeCds/*[@code=$TortThresholdTypeCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Tort Threshold State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/LitigationInfo[@PlaintiffRefs=$InjInfoId]/ThresholdStateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--<xsl:variable name="MC01SuitInd" select="$ClaimsInjNode/../ClaimsPartyInfo/SuitFiledInd"/>-->
		<xsl:variable name="MC01SuitInd" select="$ClaimsInjNode[@id=$InjInfoId]/../ClaimsPartyInfo/SuitFiledInd[@idref=$InjInfoId]"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Suit filed?</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="$ClaimsInjNode/../ClaimsPartyInfo/SuitFiledInd"/>-->
				<xsl:if test="$MC01SuitInd=0">NO</xsl:if>
				<xsl:if test="$MC01SuitInd=1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MC01EstLoss" select="$ClaimRoot/ClaimsOccurrence/ProbableIncurredAmt[contains(@idref,$InjInfoId)]/Amt"/>
		<!--GAURAV : Updated Est. Loss Amt for idref. -->
		<xsl:if test="count($MC01EstLoss) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Estimated Loss</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$ClaimRoot/ClaimsOccurrence/ProbableIncurredAmt/Amt"/>-->
					<xsl:value-of select="format-number($MC01EstLoss, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="MC01ResAmt" select="$ClaimRoot/ClaimsPayment[@idref = $InjInfoId][PaymentTypeCd = 'LossResv']/TotalPaymentAmt/Amt"/>
		<xsl:if test="count($MC01ResAmt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Reserve Amount</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$ClaimRoot/ClaimsPayment[@idref = $MC01Id][PaymentTypeCd = 'LossResv']/TotalPaymentAmt/Amt"/>-->
					<xsl:value-of select="format-number($MC01ResAmt, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="MC01SettleAmt" select="$ClaimRoot/ClaimsPayment[@idref = $InjInfoId][not(PaymentTypeCd = 'LossResv')]/TotalPaymentAmt/Amt"/>
		<xsl:if test="$MC01SettleAmt &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Settlement Amount</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="format-number($MC01SettleAmt, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:variable name="MC01LossStartDt" select="$ClaimsInjNode/TimeLostPeriod/EffectiveDt"/>
		<xsl:if test="count($MC01LossStartDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Loss Time Start Date</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($MC01LossStartDt,6,2)" format="01/"/>
					<xsl:number value="substring($MC01LossStartDt,9,2)" format="01/"/>
					<xsl:number value="substring($MC01LossStartDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="MC01LossEndDt" select="$ClaimsInjNode/TimeLostPeriod/ExpirationDt"/>
		<xsl:if test="count($MC01LossEndDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Loss Time End Date</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($MC01LossEndDt,6,2)" format="01/"/>
					<xsl:number value="substring($MC01LossEndDt,9,2)" format="01/"/>
					<xsl:number value="substring($MC01LossEndDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		-->
		<xsl:variable name="MC01LossStartDt" select="$ClaimsInjNode[@id=$InjInfoId]/TimeLostPeriod/EffectiveDt"/>
		<xsl:variable name="MC01LossEndDt" select="$ClaimsInjNode[@id=$InjInfoId]/TimeLostPeriod/ExpirationDt"/>
		<xsl:if test="count($MC01LossStartDt) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					Loss Time Start Date:
					</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:number value="substring($MC01LossStartDt,6,2)" format="01/"/>
						<xsl:number value="substring($MC01LossStartDt,9,2)" format="01/"/>
						<xsl:number value="substring($MC01LossStartDt,1,4)" format="0001"/>
					</font>
					<xsl:if test="count($MC01LossEndDt) &gt;0">
						<b>
							<font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						Loss Time End Date:
						</font>
						</b>
						<font size="2" face="Arial">
							<xsl:number value="substring($MC01LossEndDt,6,2)" format="01/"/>
							<xsl:number value="substring($MC01LossEndDt,9,2)" format="01/"/>
							<xsl:number value="substring($MC01LossEndDt,1,4)" format="0001"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="ChkTotLossDays" select="$ClaimsInjNode[@id=$InjInfoId]/TimeLostPeriod/DurationPeriod/NumUnits"/>
		<xsl:if test="string-length(normalize-space($ChkTotLossDays)) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Total Lost Days</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="string(number($ChkTotLossDays))"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Court Filed</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/LitigationInfo/CourtName"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MC01CourtDt" select="$ClaimRoot/LitigationInfo/EventInfo[EventCd = 'SuitFiled']/EventDt"/>
		<xsl:if test="count($MC01CourtDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Court Filed Date</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($MC01CourtDt,6,2)" format="01/"/>
					<xsl:number value="substring($MC01CourtDt,9,2)" format="01/"/>
					<xsl:number value="substring($MC01CourtDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		-->
		<xsl:variable name="MC01CourtFiled" select="$ClaimRoot/LitigationInfo[@PlaintiffRefs = $InjInfoId]/CourtName"/>
		<xsl:variable name="MC01CourtDt" select="$ClaimRoot/LitigationInfo[@PlaintiffRefs = $InjInfoId]/EventInfo[EventCd = 'SuitFiled']/EventDt"/>
		<xsl:if test="count($MC01CourtFiled) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					Court Filed:
					</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:value-of select="$MC01CourtFiled"/>
					</font>
					<xsl:if test="count($MC01CourtDt) &gt;0">
						<b>
							<font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						Court Filed Date:
						</font>
						</b>
						<font size="2" face="Arial">
							<xsl:number value="substring($MC01CourtDt,6,2)" format="01/"/>
							<xsl:number value="substring($MC01CourtDt,9,2)" format="01/"/>
							<xsl:number value="substring($MC01CourtDt,1,4)" format="0001"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="CourtCty" select="$ClaimRoot/LitigationInfo[@PlaintiffRefs = $InjInfoId]/Addr/County"/>
		<xsl:variable name="CourtSt" select="$ClaimRoot/LitigationInfo[@PlaintiffRefs = $InjInfoId]/Addr/StateProvCd"/>
		<xsl:if test="count($CourtCty) &gt;0 or count($CourtSt) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					Court County/State:
					</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:value-of select="$CourtCty"/>&#160;&#160;
	
					</font>
					<font size="2" face="Arial">
						<xsl:value-of select="$CourtSt"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--
		<tr>
			<xsl:if test="count($CourtCty) &gt;0">
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					Court County:
					</font>
					</b>
				</td>
			</xsl:if>
			<td align="left">
				<font size="2" face="Arial">
					<xsl:value-of select="$CourtCty"/>
				</font>
				<xsl:if test="count($CourtSt) &gt;0">
					<b>
						<font size="2" face="Arial">
					&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
					&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
					Court State:
					</font>
					</b>
					<font size="2" face="Arial">
						<xsl:value-of select="$CourtSt"/>
					</font>
				</xsl:if>
			</td>
		</tr>
		-->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Docket Number</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/LitigationInfo[@PlaintiffRefs = $InjInfoId]/DocketNum"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Product Liability</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$InjInfoId]/com.iso_ProdLiabInd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="ProdLiab" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$InjInfoId]/com.iso_ProdLiabInd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Product Liability</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$ProdLiab"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ProdLiabCds/*[@code=$ProdLiab]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Product Manufacturer</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$InjInfoId]/com.iso_ProdMfr"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Product Generic Name</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$InjInfoId]/com.iso_GenName"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Product Brand Name</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$InjInfoId]/com.iso_BrandName"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Product Alleged Harm</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$InjInfoId]/com.iso_allegedHarm"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $InjInfoId]"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--display CMS information-->
		<xsl:variable name="CMSIncDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/com.iso_CMSIncidentDt"/>
		<xsl:variable name="CMSVenueSt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/Addr/StateProvCd"/>
		<xsl:variable name="CMSNFLT" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/com.iso_NoFLTLimit"/>
		<xsl:variable name="CMSExDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/com.iso_ExhaustDt"/>
		<xsl:variable name="CMSORMInd" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/com.iso_ORMInd"/>
		<xsl:variable name="CMSORMDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/com.iso_ORMDt"/>
		<xsl:variable name="CMSTPOCDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/com.iso_TPOCDt"/>
		<xsl:variable name="CMSTPOCAmt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/com.iso_TPOCAmt"/>
		<xsl:variable name="CMSTPOCStartDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/com.iso_TPOCStartDt"/>
		<xsl:if test="string-length(normalize-space($CMSIncDt)) &gt; 0 or string-length(normalize-space($CMSVenueSt)) &gt; 0 or string-length(normalize-space($CMSNFLT)) &gt; 0 or string-length(normalize-space($CMSExDt)) &gt; 0 or string-length(normalize-space($CMSORMInd)) &gt; 0 or string-length(normalize-space($CMSORMDt)) &gt; 0 or string-length(normalize-space($CMSTPOCDt)) &gt; 0 or string-length(normalize-space($CMSTPOCAmt)) &gt; 0 or string-length(normalize-space($CMSTPOCStartDt)) &gt; 0">
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">CMS Information</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="DeleteFromCMS" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/com.iso_DeleteFromCMS"/>
		<xsl:if test="$DeleteFromCMS= 'Y'">
			<tr>
				<td nowrap="nowrap">
					<b>
						<font face="Arial" size="2">&#160;&#160;* This Claimant Coverage from CMS is deleted.</font>
					</b>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="NotSendCovCMS" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$InjInfoId]/com.iso_NotSendCovCMS"/>
		<xsl:if test="$NotSendCovCMS= 'Y'">
			<tr>
				<td nowrap="nowrap">
					<b>
						<font face="Arial" size="2">&#160;&#160;* This Claimant Coverage will not be sent to CMS.</font>
					</b>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="count($CMSIncDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Date Of Incident</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($CMSIncDt,6,2)" format="01/"/>
					<xsl:number value="substring($CMSIncDt,9,2)" format="01/"/>
					<xsl:number value="substring($CMSIncDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">State Of Venue</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$CMSVenueSt"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:if test="count($CMSNFLT) &gt;0 or count($CMSExDt) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					No Fault Insurance Limit:
					</font>
					</b>
				</td>
				<td align="left">
					<xsl:variable name="NoFlt" select="$CMSNFLT div 100"/>
					<xsl:choose>
						<xsl:when test="$CMSNFLT mod 100 = 0">
							<font size="2" face="Arial">
								<xsl:value-of select='format-number($NoFlt, "$###,###,###.00")'/>
							</font>
						</xsl:when>
						<xsl:otherwise>
							<font size="2" face="Arial">
								<xsl:value-of select='format-number($NoFlt, "$###,###,###.00")'/>
							</font>
						</xsl:otherwise>
					</xsl:choose>
					<!--
					<xsl:variable name="NoFlt" select="$CMSNFLT div 100"/>
					<font size="2" face="Arial">
						<xsl:value-of select='format-number($NoFlt, "$###,###,###.##")' />
					</font>
					-->
					<xsl:if test="count($CMSExDt) &gt;0">
						<b>
							<font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						Exhaust Date:
						</font>
						</b>
						<font size="2" face="Arial">
							<xsl:number value="substring($CMSExDt,6,2)" format="01/"/>
							<xsl:number value="substring($CMSExDt,9,2)" format="01/"/>
							<xsl:number value="substring($CMSExDt,1,4)" format="0001"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="count($CMSORMInd) &gt;0 or count($CMSORMDt) &gt;0">
			<tr>
				<tr>
					<td align="left" nowrap="nowrap">&#160;&#160;
				<b>
							<font size="2" face="Arial">
					On-Going Responsibility
					 </font>
						</b>
					</td>
				</tr>
				<tr>
					<td align="left" nowrap="nowrap">&#160;&#160;
				<b>
							<font size="2" face="Arial">
					 for Medicals(ORM):
					</font>
						</b>
					</td>
					<td align="left" nowrap="nowrap">
						<font size="2" face="Arial">
							<xsl:if test="$CMSORMInd='N'">NO</xsl:if>
							<xsl:if test="$CMSORMInd='Y'">YES</xsl:if>
						</font>
						<xsl:if test="count($CMSORMDt) &gt;0">
							<b>
								<font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;
						ORM Termination Date:
						</font>
							</b>
							<font size="2" face="Arial">
								<xsl:number value="substring($CMSORMDt,6,2)" format="01/"/>
								<xsl:number value="substring($CMSORMDt,9,2)" format="01/"/>
								<xsl:number value="substring($CMSORMDt,1,4)" format="0001"/>
							</font>
						</xsl:if>
					</td>
				</tr>
			</tr>
		</xsl:if>
		<!-- StartTPOC will display 5 times(MAX)-->
		<xsl:if test="count($CMSTPOCDt) &gt;0 or count($CMSTPOCAmt) &gt;0 or count($CMSTPOCStartDt) &gt;0">
			<xsl:variable name="CMSTPOC" select="$CMS_cov[@itemRef = $InjInfoId]"/>
			<xsl:for-each select="$CMSTPOC/com.iso_TPOCDt">
				<xsl:variable name="TPOCid" select="@id"/>
				<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid])) &gt;0">
					<tr>
						<td align="left" nowrap="nowrap">
							<b>
								<font size="2" face="Arial">
									<xsl:value-of select="$TPOCid"/>.&#160;Total Payment Obligation to
								</font>
							</b>
						</td>
					</tr>
				</xsl:if>
				<tr>
					<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid])) &gt;0">
						<td align="left" nowrap="nowrap">&#160;&#160;&#160;
								<b>
								<font size="2" face="Arial">
									 the Claimant(TPOC) Date:
									</font>
							</b>
						</td>
						<td align="left">
							<font size="2" face="Arial">
								<!--<xsl:value-of select="$CMSTPOC/com.iso_TPOCDt[@id=$TPOCid]"/>-->
								<xsl:number value="substring($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid],6,2)" format="01/"/>
								<xsl:number value="substring($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid],9,2)" format="01/"/>
								<xsl:number value="substring($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid],1,4)" format="0001"/>
							</font>
							<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCAmt[@id=$TPOCid])) &gt;0">
								<!--<td  nowrap="nowrap"  align="left">-->
								<b>
									<font size="2" face="Arial">
									&#160;&#160;&#160;&#160;&#160;&#160;
&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
TPOC Amount:
									</font>
								</b>
								<xsl:variable name="TPOCAmt" select="$CMSTPOC/com.iso_TPOCAmt[@id=$TPOCid] div 100"/>
								<xsl:choose>
									<xsl:when test="$TPOCAmt mod 100 = 0">
										<font size="2" face="Arial">
											<xsl:value-of select='format-number($TPOCAmt, "$###,###,###.##")'/>.00
									</font>
									</xsl:when>
									<xsl:otherwise>
										<font size="2" face="Arial">
											<xsl:value-of select='format-number($TPOCAmt, "$###,###,###.##")'/>
										</font>
									</xsl:otherwise>
								</xsl:choose>
								<!--</td>-->
							</xsl:if>
						</td>
					</xsl:if>
					<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid])) &gt;0">
						<tr>
							<td align="left">&#160;&#160;&#160;
								<b>
									<font size="2" face="Arial">
											Funding Delayed Beyond
										</font>
								</b>
							</td>
						</tr>
					</xsl:if>
					<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid])) &gt;0">
						<tr>
							<td align="left">&#160;&#160;&#160;
									<b>
									<font size="2" face="Arial">
									TPOC Start Date:
										</font>
								</b>
							</td>
							<td align="left">
								<font size="2" face="Arial">
									<!--<xsl:value-of select="$CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid]"/>-->
									<xsl:number value="substring($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid],6,2)" format="01/"/>
									<xsl:number value="substring($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid],9,2)" format="01/"/>
									<xsl:number value="substring($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid],1,4)" format="0001"/>
								</font>
							</td>
						</tr>
					</xsl:if>
				</tr>
			</xsl:for-each>
		</xsl:if>
		<!-- End TPOC will display 5 times(MAX)-->
		<!--CMS warnings-->
		<xsl:variable name="CDCasInd" select="$ClaimRoot/com.iso_ClaimDirectorInd"/>
		<xsl:variable name="casCDCMS" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CMS[@itemRef=$InjInfoId]"/>
		<xsl:if test="$CDCasInd= 1 and count($casCDCMS) &gt; 0">
			<tr>
				<td colspan="4" valign="top">
					<font face="arial" size="2" color="red">
						<b>Missing CMS Required Field:</b>
					</font>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<font face="arial" size="2">
						<!--<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageCode]"/>-->
						<xsl:for-each select="$casCDCMS/com.iso_CMSWarning">
							<!--<xsl:value-of select="."/>-->
							<xsl:variable name="CMSWarning" select="."/>
							<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/CMSWarningCds/*[@code=$CMSWarning]"/>
							<!--<xsl:value-of select="position()!=last()">-->
							<xsl:if test="position()!=last()">
								<xsl:text>, </xsl:text>
							</xsl:if>
						</xsl:for-each>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!-- End CMS Warnings-->
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Property Template
*
*			Display the initiating building property records
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Property">
		<xsl:param name="PropLossNode"/>
		<xsl:param name="ClaimsPartyNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="AdjusterNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="ClaimsPayNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:variable name="MP01Id" select="$PropLossNode/@id"/>
		<xsl:variable name="ChkUP01" select="$PropLossNode/ClaimsSubjectInsuranceInfo/SubjectInsuranceCd"/>
		<xsl:if test="count($ChkUP01) &gt;0">
			<xsl:call-template name="Insert_Header">
				<!--<xsl:with-param name="Data_Name">Building and Loss Property Information</xsl:with-param>-->
				<xsl:with-param name="Data_Name">Property Coverage Information</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="LossType" select="$AdjusterNode/LossCauseCd"/>
		<xsl:call-template name="Insert_Adjuster">
			<xsl:with-param name="LossType">
				<xsl:value-of select="$LossType"/>
			</xsl:with-param>
			<xsl:with-param name="LossType_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=$LossType]"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Claim Status</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo/ClaimsPayment/ClaimsPaymentCovInfo/ClaimStatusCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<!--*********************************** GAURAV : Updated for Date Claim Closed *********************************** -->
		<xsl:variable name="ClaimStatusCd" select="$PropLossNode/ClaimsSubjectInsuranceInfo/ClaimsPayment/ClaimsPaymentCovInfo/ClaimStatusCd"/>
		<xsl:if test="count($ClaimStatusCd) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
					<b>
						<font size="2" face="Arial">Claim Status:</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ClaimStatusCds/*[@code=$ClaimStatusCd]"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="MP01DtClose" select="$ClaimsPartyNode/ClaimsPartyInfo/ClosedDt[contains(@idref,$MP01Id)]"/>
		<xsl:if test="count($MP01DtClose) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
					<b>
						<font size="2" face="Arial">Date Claim Closed:</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:number value="substring($MP01DtClose,6,2)" format="01/"/>
						<xsl:number value="substring($MP01DtClose,9,2)" format="01/"/>
						<xsl:number value="substring($MP01DtClose,1,4)" format="0001"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--*********************************** GAURAV : Updated for Date Claim Closed *********************************** -->
		<xsl:call-template name="Insert_Adjuster">
			<!--
			<xsl:with-param name="LossType">
				<xsl:value-of select="$LossType"/>
			</xsl:with-param>
			-->
			<xsl:with-param name="AdjustingCompany">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
			</xsl:with-param>
			<xsl:with-param name="AdjusterFirstName">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
			</xsl:with-param>
			<xsl:with-param name="AdjusterMiddleName">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
			</xsl:with-param>
			<xsl:with-param name="AdjusterLastName">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/Surname"/>
			</xsl:with-param>
			<!--
			<xsl:with-param name="LossType_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=$LossType]"/>
			</xsl:with-param>
			-->
		</xsl:call-template>
		<xsl:variable name="AdjNum" select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>
		<xsl:if test="count($AdjNum) &gt; 0">
			<xsl:call-template name="Insert_Adjuster">
				<xsl:with-param name="AdjusterPhone">
					<!--<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>-->
					<xsl:number value="substring($AdjNum,4,3)" format="(001"/>
					<xsl:number value="substring($AdjNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($AdjNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Mortgage  Loan Number</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimsPartyNode/ClaimsPartyInfo/AccountNumberId[@idref=$MP01Id]"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--		<xsl:variable name="SuitInd" select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd"/>-->
		<xsl:variable name="SuitInd" select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd[@idref=$MP01Id]"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Suit Indicator</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd"/>-->
				<xsl:if test="$SuitInd=0">NO</xsl:if>
				<xsl:if test="$SuitInd=1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="BldgTypeCd" select="$PropLossNode/RealEstateTypeCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Property Type</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$BldgTypeCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/BldgTypeCds/*[@code=$BldgTypeCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="SchedPropInd" select="$PropLossNode/LossKindCd"/>
		<xsl:if test="count($SchedPropInd) &gt; 0">
			<xsl:call-template name="Insert_PropSchdInd">
				<xsl:with-param name="Data_Value">
					<xsl:if test="$SchedPropInd='Y'">* Scheduled Property Exists on this claim</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Scheduled Property Description</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/ObjectLossDesc"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Other Property Description</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/RealEstateTypeOtherDesc"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="OccupancyTypeCd" select="$PropLossNode/OccupancyTypeCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Occupancy Type</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$OccupancyTypeCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/OccupancyTypeCds/*[@code=$OccupancyTypeCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="Fireincendiary" select="$PropLossNode/IncendiaryFireInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Incendiary Fire Flag</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="$PropLossNode/IncendiaryFireInd"/>-->
				<xsl:if test="$Fireincendiary=0 or $Fireincendiary='N'">NO</xsl:if>
				<xsl:if test="$Fireincendiary=1 or $Fireincendiary='Y'">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="TheftLocationCd" select="$PropLossNode/TheftLocationCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Theft Location</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$TheftLocationCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TheftLocationCds/*[@code=$TheftLocationCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:if test="count($PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd) &gt; 0">
			<xsl:call-template name="Insert_SmallHeader">
				<xsl:with-param name="Data_Name">Property Lost/Stolen</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:for-each select="$PropLossNode/PropertySchedule">
		<xsl:choose>
			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'AudioVisual']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'Audio / Visual'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'AudioVisual']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>

			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'Art']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'Art / Antique'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'Art']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'Cash']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'Cash'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'Cash']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'Clothing']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'Clothing'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'Clothing']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'ComputerEquip']">
					<xsl:call-template name="Insert_PropLost">
						<xsl:with-param name="Display_Name">
							<xsl:value-of select="'ComputerEquip'"/>
							<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
								<xsl:value-of select="'(Scheduled)'"/>
							</xsl:if>
						</xsl:with-param>
						<xsl:with-param name="Display_Value">
							<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'ComputerEquip']"/><xsl:value-of select="IsSummaryInd"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:when>
				<xsl:when test="ItemDefinition/ItemTypeCd[. = 'Furs']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'Furs'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'Furs']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'Guns']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'Guns'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'Guns']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'Jewelry']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'Jewelry'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'Jewelry']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'Silverware']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'Silverware'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'Silverware']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'SportsEquip']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'SportsEquip'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'SportsEquip']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'Tools']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'Tools'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'Tools']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'OfficeEquip']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'OfficeEquip'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'OfficeEquip']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="ItemDefinition/ItemTypeCd[. = 'Other']">
				<xsl:call-template name="Insert_PropLost">
					<xsl:with-param name="Display_Name">
						<xsl:value-of select="'Other'"/>
						<xsl:if test="IsSummaryInd = 'S' or IsSummaryInd= 'B'">
							<xsl:value-of select="'(Scheduled)'"/>
						</xsl:if>
					</xsl:with-param>
					<xsl:with-param name="Display_Value">
						<xsl:value-of select="ItemDefinition/ItemTypeCd[. = 'Other']"/><xsl:value-of select="IsSummaryInd"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
		</xsl:choose>
	</xsl:for-each>
		<!--
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Audio / Visual</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'AudioVisual']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Art / Antique</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'Art']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Cash</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'Cash']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Clothing</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'Clothing']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Computer Equipment</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'ComputerEquip']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Furs</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'Furs']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Guns</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'Guns']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Jewelry</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'Jewelry']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Silverware</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'Silverware']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Sports Equipment</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'SportsEquip']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Tools</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'Tools']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Office Equipment</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'OfficeEquip']"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_PropLost">
			<xsl:with-param name="Display_Name">Other</xsl:with-param>
			<xsl:with-param name="Display_Value">
				<xsl:value-of select="$PropLossNode/PropertySchedule/ItemDefinition/ItemTypeCd[. = 'Other']"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="PolicyBldgTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/InsuranceAmt/Amt"/>
		<xsl:variable name="PolicyCntTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/InsuranceAmt/Amt"/>
		<xsl:variable name="PolicyOccTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/InsuranceAmt/Amt"/>
		<xsl:variable name="PolicyStockTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/InsuranceAmt/Amt"/>
		<xsl:variable name="PolicyOtherTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/InsuranceAmt/Amt"/>
		<xsl:variable name="LossBldgTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ProbableIncurredAmt/Amt"/>
		<xsl:variable name="LossContTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ProbableIncurredAmt/Amt"/>
		<xsl:variable name="LossOccTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ProbableIncurredAmt/Amt"/>
		<xsl:variable name="LossStockTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ProbableIncurredAmt/Amt"/>
		<xsl:variable name="LossOtherTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ProbableIncurredAmt/Amt"/>
		<xsl:variable name="ResvBldgTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="ResvContTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="ResvOccTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="ResvStockTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="ResvOtherTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="PaidBldgTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="PaidContTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="PaidOccTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="PaidStockTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="PaidOtherTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:if test="string-length(normalize-space($PolicyBldgTitle)) &gt; 0 or string-length(normalize-space($PolicyCntTitle)) &gt; 0 or string-length(normalize-space($PolicyOccTitle)) &gt; 0 or string-length(normalize-space($PolicyStockTitle)) &gt; 0 or string-length(normalize-space($PolicyOtherTitle)) &gt; 0 or string-length(normalize-space($LossBldgTitle)) &gt; 0 or string-length(normalize-space($LossContTitle)) &gt; 0 or string-length(normalize-space($LossOccTitle)) &gt; 0 or string-length(normalize-space($LossStockTitle)) &gt; 0 or string-length(normalize-space($LossOtherTitle)) &gt; 0 or string-length(normalize-space($ResvBldgTitle)) &gt; 0 or string-length(normalize-space($ResvContTitle)) &gt; 0 or string-length(normalize-space($ResvOccTitle)) &gt; 0 or string-length(normalize-space($ResvStockTitle)) &gt; 0 or string-length(normalize-space($ResvOtherTitle)) &gt; 0 or string-length(normalize-space($PaidBldgTitle)) &gt; 0 or string-length(normalize-space($PaidContTitle)) &gt; 0 or string-length(normalize-space($PaidOccTitle)) &gt; 0 or string-length(normalize-space($PaidStockTitle)) &gt; 0 or string-length(normalize-space($PaidOtherTitle)) &gt; 0">
			<!--
			<xsl:call-template name="Insert_SmallHeader">
				<xsl:with-param name="Data_Name">Policy Amount</xsl:with-param>
				<xsl:with-param name="Data_Value"/>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Building</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/InsuranceAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Contents</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/InsuranceAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Use &amp; Occupancy</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/InsuranceAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Stock</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/InsuranceAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Other</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/InsuranceAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			-->
			<!--start08/07 -->
			<tr>
				<td align="left" nowrap="nowrap" colspan="5">
					<table border="1" cellspacing="1" cellpadding="1" width="500">
						<tr>
							<td align="center" nowrap="nowrap" width="100">&#160;</td>
							<td align="center" nowrap="nowrap">
								<font face="Arial" size="2">
									<b>Building</b>
								</font>
							</td>
							<td align="center" nowrap="nowrap">
								<font face="Arial" size="2">
									<b>Contents</b>
								</font>
							</td>
							<td align="center" nowrap="nowrap">
								<font face="Arial" size="2">
									<b>Occupancy</b>
								</font>
							</td>
							<td align="center" nowrap="nowrap">
								<font face="Arial" size="2">
									<b>Stock</b>
								</font>
							</td>
							<td align="center" nowrap="nowrap">
								<font face="Arial" size="2">
									<b>Other</b>
								</font>
							</td>
						</tr>
						<tr>
							<td align="left" nowrap="nowrap">
								<font face="Arial" size="2">
									<b>Policy</b>
								</font>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'BLDG']/InsuranceAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="PolicyBldAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'BLDG']/InsuranceAmt/Amt"/>
											<xsl:value-of select="format-number($PolicyBldAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'BLDG']/InsuranceAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'C']/InsuranceAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="PolicyContAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'C']/InsuranceAmt/Amt"/>
											<xsl:value-of select="format-number($PolicyContAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'C']/InsuranceAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'UseOccupancy']/InsuranceAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="PolicyOccAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'UseOccupancy']/InsuranceAmt/Amt"/>
											<xsl:value-of select="format-number($PolicyOccAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'UseOccupancy']/InsuranceAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
								<!--
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'STOCK']/InsuranceAmt/Amt) = 0">-->
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd =	'STOCK' or SubjectInsuranceCd =	'Stock']/InsuranceAmt/Amt) = 0">

										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
										<!--
											<xsl:variable name="PolicyStckAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'STOCK']/InsuranceAmt/Amt"/>-->
											<xsl:variable name="PolicyStckAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd = 'Stock']/InsuranceAmt/Amt"/>
											<xsl:value-of select="format-number($PolicyStckAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'STOCK']/InsuranceAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'OT']/InsuranceAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="PolicyOTAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'OT']/InsuranceAmt/Amt"/>
											<xsl:value-of select="format-number($PolicyOTAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'OT']/InsuranceAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
						</tr>
						<tr>
							<td align="left" nowrap="nowrap">
								<font face="Arial" size="2">
									<b>Estimated Loss</b>
								</font>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'BLDG']/ProbableIncurredAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="LossBldAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'BLDG']/ProbableIncurredAmt/Amt"/>
											<xsl:value-of select="format-number($LossBldAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'BLDG']/ProbableIncurredAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'C']/ProbableIncurredAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="LossContAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'C']/ProbableIncurredAmt/Amt"/>
											<xsl:value-of select="format-number($LossContAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'C']/ProbableIncurredAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'UseOccupancy']/ProbableIncurredAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="LossOccAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'UseOccupancy']/ProbableIncurredAmt/Amt"/>
											<xsl:value-of select="format-number($LossOccAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'UseOccupancy']/ProbableIncurredAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ProbableIncurredAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="LossStckAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ProbableIncurredAmt/Amt"/>
											<xsl:value-of select="format-number($LossStckAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'STOCK']/ProbableIncurredAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'OT']/ProbableIncurredAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="LossOTAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'OT']/ProbableIncurredAmt/Amt"/>
											<xsl:value-of select="format-number($LossOTAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'OT']/ProbableIncurredAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
						</tr>
						<tr>
							<td align="left" nowrap="nowrap">
								<font face="Arial" size="2">
									<b>Reserve</b>
								</font>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'BLDG']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="ResBldAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
											<xsl:value-of select="format-number($ResBldAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'BLDG']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'C']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="ResContAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
											<xsl:value-of select="format-number($ResContAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'C']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="ResOccAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 	'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
											<xsl:value-of select="format-number($ResOccAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'STOCK' or SubjectInsuranceCd =	'Stock']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="ResStckAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
											<xsl:value-of select="format-number($ResStckAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'STOCK']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'OT']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="ResOTAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
											<xsl:value-of select="format-number($ResOTAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'OT']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
						</tr>
						<tr>
							<td align="left" nowrap="nowrap">
								<font face="Arial" size="2">
									<b>Paid</b>
								</font>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'BLDG']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="PaidBldAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
											<xsl:value-of select="format-number($PaidBldAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'BLDG']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'C']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="PaidContAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
											<xsl:value-of select="format-number($PaidContAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'C']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="PaidOccAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 	'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
											<xsl:value-of select="format-number($PaidOccAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'STOCK' or SubjectInsuranceCd =	'Stock']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="PaidStckAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
											<xsl:value-of select="format-number($PaidStckAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'STOCK']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td align="center" nowrap="nowrap">
								<xsl:choose>
									<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'OT']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
										<xsl:value-of select="'--'"/>
									</xsl:when>
									<xsl:otherwise>
										<font face="Arial" size="2">
											<xsl:variable name="PaidOTAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo		[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
											<xsl:value-of select="format-number($PaidOTAmt, '###,###')"/>
											<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 		'OT']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
										</font>
									</xsl:otherwise>
								</xsl:choose>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<!--end 08/07-->
		</xsl:if>
		<!--
		<xsl:variable name="LossBldgTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ProbableIncurredAmt/Amt"/>
		<xsl:variable name="LossContTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ProbableIncurredAmt/Amt"/>
		<xsl:variable name="LossOccTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ProbableIncurredAmt/Amt"/>
		<xsl:variable name="LossStockTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/ProbableIncurredAmt/Amt"/>
		<xsl:variable name="LossOtherTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ProbableIncurredAmt/Amt"/>
		<xsl:if test="string-length(normalize-space($LossBldgTitle)) &gt; 0 or string-length(normalize-space($LossContTitle)) &gt; 0 or string-length(normalize-space($LossOccTitle)) &gt; 0 or string-length(normalize-space($LossStockTitle)) &gt; 0 or string-length(normalize-space($LossOtherTitle)) &gt; 0 ">
			<xsl:call-template name="Insert_SmallHeader">
				<xsl:with-param name="Data_Name">Loss Estimate</xsl:with-param>
				<xsl:with-param name="Data_Value"/>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Building</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ProbableIncurredAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Contents</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ProbableIncurredAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Use &amp; Occupancy</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ProbableIncurredAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Stock</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/ProbableIncurredAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Other</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ProbableIncurredAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="ResvBldgTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="ResvContTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="ResvOccTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="ResvStockTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="ResvOtherTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:if test="string-length(normalize-space($ResvBldgTitle)) &gt; 0 or string-length(normalize-space($ResvContTitle)) &gt; 0 or string-length(normalize-space($ResvOccTitle)) &gt; 0 or string-length(normalize-space($ResvStockTitle)) &gt; 0 or string-length(normalize-space($ResvOtherTitle)) &gt; 0 ">
			<xsl:call-template name="Insert_SmallHeader">
				<xsl:with-param name="Data_Name">Amount Reserved for Loss</xsl:with-param>
				<xsl:with-param name="Data_Value"/>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Building</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Contents</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Use &amp; Occupancy</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Stock</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Other</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="PaidBldgTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="PaidContTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="PaidOccTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="PaidStockTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:variable name="PaidOtherTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
		<xsl:if test="string-length(normalize-space($PaidBldgTitle)) &gt; 0 or string-length(normalize-space($PaidContTitle)) &gt; 0 or string-length(normalize-space($PaidOccTitle)) &gt; 0 or string-length(normalize-space($PaidStockTitle)) &gt; 0 or string-length(normalize-space($PaidOtherTitle)) &gt; 0 ">
			<xsl:call-template name="Insert_SmallHeader">
				<xsl:with-param name="Data_Name">Amount Paid on Loss</xsl:with-param>
				<xsl:with-param name="Data_Value"/>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Building</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Contents</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Use &amp; Occupancy</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Stock</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Other</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		-->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $MP01Id]"/>
			</xsl:with-param>
		</xsl:call-template>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Water_Mobile_Property Template
*
*			Display the initiating boat/mobile equipment records
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Water_Mobile_Property">
		<xsl:param name="PropLossNode"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:param name="ClaimsPartyNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="AdjusterNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="ClaimsPayNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:variable name="WaterCraftId" select="$PropLossNode/Watercraft/@id"/>
		<xsl:variable name="MobileId" select="$PropLossNode/ItemInfo/@id"/>
		<xsl:variable name="PropLossInfoId" select="$PropLossNode/@id"/>
		<!--Investigation Node = <xsl:value-of select="$InvestigationNode"/>-->
		<xsl:call-template name="Insert_Header">
			<xsl:with-param name="Data_Name">Boat or Mobile Equipment Loss Information</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="CoverageType" select="$AdjusterNode/CoverageCd"/>
		<xsl:variable name="LossType" select="$AdjusterNode/LossCauseCd"/>
		<xsl:call-template name="Insert_Adjuster">
			<xsl:with-param name="CoverageType">
				<xsl:value-of select="$CoverageType"/>
			</xsl:with-param>
			<xsl:with-param name="LossType">
				<xsl:value-of select="$LossType"/>
			</xsl:with-param>
			<xsl:with-param name="CoverageType_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageType]"/>
			</xsl:with-param>
			<xsl:with-param name="LossType_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=$LossType]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="ClaimStatusCd" select="$ClaimsPayNode/ClaimsPaymentCovInfo/ClaimStatusCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Claim Status</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$ClaimStatusCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ClaimStatusCds/*[@code=$ClaimStatusCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Adjuster">
			<!--
			<xsl:with-param name="CoverageType">
				<xsl:value-of select="$CoverageType"/>
			</xsl:with-param>
			<xsl:with-param name="LossType">
				<xsl:value-of select="$LossType"/>
			</xsl:with-param>
			-->
			<xsl:with-param name="AdjustingCompany">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
			</xsl:with-param>
			<xsl:with-param name="AdjusterFirstName">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
			</xsl:with-param>
			<xsl:with-param name="AdjusterMiddleName">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
			</xsl:with-param>
			<xsl:with-param name="AdjusterLastName">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/Surname"/>
			</xsl:with-param>
			<!--
			<xsl:with-param name="CoverageType_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageType]"/>
			</xsl:with-param>
			<xsl:with-param name="LossType_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=$LossType]"/>
			</xsl:with-param>
			-->
		</xsl:call-template>
		<xsl:variable name="AdjNum" select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>
		<xsl:if test="count($AdjNum) &gt; 0">
			<xsl:call-template name="Insert_Adjuster">
				<xsl:with-param name="AdjusterPhone">
					<!--<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>-->
					<xsl:number value="substring($AdjNum,4,3)" format="(001"/>
					<xsl:number value="substring($AdjNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($AdjNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="SuitInd" select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Suit Indicator</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd"/>-->
				<xsl:if test="$SuitInd=0">NO</xsl:if>
				<xsl:if test="$SuitInd=1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $WaterCraftId or @idref = $MobileId or @idref = $PropLossInfoId]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="Boatinfo" select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']"/>
		<xsl:if test="count($Boatinfo) &gt; 0">
			<xsl:call-template name="Insert_SmallHeader">
				<xsl:with-param name="Data_Name">Boat Information</xsl:with-param>
				<xsl:with-param name="Data_Value"/>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="BoatModelyr" select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/ModelYear"/>
		<xsl:variable name="BoatMfg" select="$PropLossNode/Watercraft/ItemDefinition	[ItemTypeCd = 'Watercraft']/Manufacturer"/>
		<xsl:variable name="BoatModel" select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/Model"/>
		<xsl:if test="count($BoatModelyr) &gt; 0 or count($BoatMfg) &gt; 0 or count($BoatModel) &gt;0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Boat</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/ModelYear"/>&#160;<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition	[ItemTypeCd = 'Watercraft']/Manufacturer"/>&#160;<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/Model"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:call-template name="Insert_SmallHeader">
			<xsl:with-param name="Data_Name">Boat Information</xsl:with-param>
			<xsl:with-param name="Data_Value"/>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Boat Year</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/ModelYear"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Boat Make</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/Manufacturer"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Boat Model</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/Model"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="BoatTypeCd" select="$PropLossNode/Watercraft/WaterUnitTypeCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Boat Type</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$BoatTypeCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/WaterUnitTypeCds/*[@code=$BoatTypeCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Boat Type</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/WaterUnitTypeCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Boat Length</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/Length/NumUnits"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="PrimaryPropulsionCd" select="$PropLossNode/Watercraft/PropulsionTypeCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Primary Propulsion</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$PrimaryPropulsionCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/PropulsionTypeCds/*[@code=$PrimaryPropulsionCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="HullMaterialCd" select="$PropLossNode/Watercraft/HullMaterialTypeCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Outer Hull Construction Material</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$HullMaterialCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/PropulsionTypeCds/*[@code=$HullMaterialCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">HIN</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/SerialIdNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Registration</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/Registration/RegistrationNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">State of Registry</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/Registration/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Last Year Registered</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/Registration/LastRegisteredYear"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Engine Manufacturer</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Engine']/Manufacturer"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Engine Serial No.</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Engine']/SerialIdNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Engine HP</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/Horsepower/NumUnits"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Outdrive Serial No.</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Outdrive']/SerialIdNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MobileYear" select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/ModelYear"/>
		<xsl:variable name="MobileMake" select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/Manufacturer"/>
		<xsl:variable name="MobileModel" select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/Model"/>
		<xsl:variable name="MobileVehStyle" select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/BodyTypeCd"/>
		<xsl:variable name="MobileVIN" select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/SerialIdNumber"/>
		<xsl:variable name="MobileEngSerial" select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/EngineSerialNumber"/>
		<xsl:variable name="MobileChasisNum" select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/ChassisSerialNumber"/>
		<xsl:variable name="MobileTransNum" select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/TransmissionSerialNumber"/>
		<xsl:if test="count($MobileYear) &gt; 0 or count($MobileMake) &gt; 0 or count($MobileModel) &gt; 0 or count($MobileVehStyle) &gt; 0 or count($MobileVIN) &gt; 0 or count($MobileEngSerial) &gt; 0 or count($MobileChasisNum) &gt; 0 or count($MobileTransNum) &gt; 0">
			<xsl:call-template name="Insert_SmallHeader">
				<xsl:with-param name="Data_Name">Mobile Equipment Information</xsl:with-param>
				<xsl:with-param name="Data_Value"/>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Item Year</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/ModelYear"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Make</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/Manufacturer"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Model</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/Model"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Vehicle Style</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/BodyTypeCd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">VIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/SerialIdNumber"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Engine Serial No.</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/EngineSerialNumber"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Chassis Serial No.</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/ChassisSerialNumber"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Transmission No.</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/TransmissionSerialNumber"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="TheftType" select="$InvestigationNode/com.iso_TheftTypeInd"/>
		<xsl:variable name="MP03RecDt" select="$InvestigationNode/RecoveryInfo/RecoveryDt"/>
		<xsl:variable name="MP03RecAgency" select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
		<xsl:variable name="MP03RecAgencyCity" select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']/GeneralPartyInfo/Addr/City"/>
		<xsl:variable name="MP03RecAgencySt" select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']/GeneralPartyInfo/Addr/City"/>
		<xsl:variable name="MP03RecAgencyCountry" select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']/GeneralPartyInfo/Addr/City"/>
		<xsl:variable name="Rec_PhoneNum" select="$InvestigationNode/RecoveryInfo/Communications/PhoneInfo/PhoneNumber"/>
		<!--<xsl:variable name="RecoveryCond" select="$InvestigationNode/RecoveryInfo/RecoveryStatusCd[not(@codelistref)]"/>-->
		<xsl:variable name="RecoveryCond" select="$InvestigationNode/RecoveryInfo/RecoveryStatusCd[not(@codelistref)]"/>
		<xsl:variable name="RecoveryClass" select="$InvestigationNode/RecoveryInfo/RecoveryStatusCd[@codelistref]"/>
		<xsl:if test="count($TheftType) &gt; 0 or  count($MP03RecDt) &gt; 0 or count($MP03RecAgency) &gt; 0 or count($MP03RecAgencyCity) &gt; 0 or count($MP03RecAgencySt) &gt; 0 or count($MP03RecAgencyCountry) &gt; 0 or count($Rec_PhoneNum) &gt; 0 or count($RecoveryCond) &gt; 0 or count($RecoveryClass) &gt; 0">
			<xsl:call-template name="Insert_SmallHeader">
				<xsl:with-param name="Data_Name">Theft Recovery Information</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data_Using_Code_List">
				<xsl:with-param name="Data_Name">Theft Type</xsl:with-param>
				<xsl:with-param name="Data_Code">
					<xsl:value-of select="$TheftType"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Code_Value">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TheftTypeCds/*[@code=$TheftType]"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:if test="count($MP03RecDt) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Date of Recovery</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<!--<xsl:value-of select="$InvestigationNode/RecoveryInfo/RecoveryDt"/>-->
						<xsl:number value="substring($MP03RecDt,6,2)" format="01/"/>
						<xsl:number value="substring($MP03RecDt,9,2)" format="01/"/>
						<xsl:number value="substring($MP03RecDt,1,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovering Agency</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovery Agency City</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd ='RecoveringAgency']/GeneralPartyInfo/Addr/City"/>-->
					<xsl:value-of select="$InvestigationNode/RecoveryInfo/Addr/City"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovery Location State</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/RecoveryInfo/Addr/StateProvCd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovery Location Country</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/RecoveryInfo/Addr/CountryCd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:if test="count($Rec_PhoneNum) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Recovery Location Phone</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<!--<xsl:value-of select="$InvestigationNode/RecoveryInfo/Communications/PhoneInfo/PhoneNumber"/>-->
						<xsl:number value="substring($Rec_PhoneNum,4,3)" format="(001"/>
						<xsl:number value="substring($Rec_PhoneNum,8,3)" format=") 001-"/>
						<xsl:number value="substring($Rec_PhoneNum,11,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
				<!-- condition recovery code for WTX only -->
	<xsl:if test="$InvestigationNode/RecoveryInfo/RecoveryStatusCd[@codelistref ='RecoveryConditionCdList']">
		<xsl:variable name="RecoveryCondWTX" select="$InvestigationNode/RecoveryInfo/RecoveryStatusCd[@codelistref ='RecoveryConditionCdList']"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Condition of Recovered Vehicle</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$RecoveryCondWTX"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/RecoveryConditionCds/*[@code=$RecoveryCondWTX]"/>
			</xsl:with-param>
		</xsl:call-template>
	</xsl:if>

			<xsl:call-template name="Insert_Data_Using_Code_List">
				<xsl:with-param name="Data_Name">Condition of Recovered Vehicle</xsl:with-param>
				<xsl:with-param name="Data_Code">
					<xsl:value-of select="$RecoveryCond"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Code_Value">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/RecoveryConditionCds/*[@code=$RecoveryCond]"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data_Using_Code_List">
				<xsl:with-param name="Data_Name">Recovery Classification</xsl:with-param>
				<xsl:with-param name="Data_Code">
					<xsl:value-of select="$RecoveryClass"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Code_Value">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/RecoveryClassificationCds/*[@code=$RecoveryClass]"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Water_Mobile_Salvage Template
*
*			Display the boat/mobile equipment Salvage records
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Water_Mobile_Salvage">
		<xsl:param name="PropLossNode"/>
		<xsl:param name="ClaimsPartyNode"/>
		<xsl:param name="BuyerNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="AdjusterNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="ClaimsPayNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:variable name="WaterCraftId" select="$PropLossNode/Watercraft/@id"/>
		<xsl:variable name="MobileId" select="$PropLossNode/ItemInfo/@id"/>
		<xsl:variable name="MP08Id" select="InvestigationInfo/SalvageInfo/@id"/>
		<xsl:variable name="MP08SalDt" select="$ClaimRoot/InvestigationInfo/SalvageInfo/SalvageDt"/>
		<xsl:if test="count($MP08SalDt) &gt; 0">
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Boat or Mobile Equipment Salvage Information</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">VIN </xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft' or ItemTypeCd = 'MoblEquip' ]/SerialIdNumber"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">VIN Missing?</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="InvestigationInfo/VINMissingInd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Engine Missing?</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="InvestigationInfo/EngineMissingInd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Trans Missing?</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="InvestigationInfo/TransmissionMissingInd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:if test="count($MP08SalDt) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Date of Salvage</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:number value="substring($MP08SalDt,6,2)" format="01/"/>
						<xsl:number value="substring($MP08SalDt,9,2)" format="01/"/>
						<xsl:number value="substring($MP08SalDt,1,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Actual Cash Value Prior to Loss</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/InvestigationInfo/SalvageInfo/ItemValuePriorToLossAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Value Received</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/InvestigationInfo/SalvageInfo/ItemValueReceivedAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Appraised Value</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/InvestigationInfo/SalvageInfo/ItemAppraisedValueAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="OwnerRetainSal1" select="$ClaimRoot/InvestigationInfo/SalvageInfo/OwnerRetainingSalvageInd"/>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Owner Retaining Salvage?</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:if test="$OwnerRetainSal1=0">NO</xsl:if>
					<xsl:if test="$OwnerRetainSal1=1">YES</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:choose>
				<xsl:when test="string-length(normalize-space($BuyerNode/GeneralPartyInfo/NameInfo/PersonName)) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Last Name</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="$BuyerNode/GeneralPartyInfo/NameInfo/PersonName/Surname"/>
						</xsl:with-param>
					</xsl:call-template>
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">First Name</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="$BuyerNode/GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
						</xsl:with-param>
					</xsl:call-template>
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Middle Name</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="$BuyerNode/GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:when>
				<xsl:otherwise>
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Business Name</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="$BuyerNode/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:otherwise>
			</xsl:choose>
			<xsl:if test="string-length(normalize-space($BuyerNode)) &gt; 0">
				<xsl:variable name="SplitZip" select="$BuyerNode/GeneralPartyInfo/Addr/PostalCode"/>
				<xsl:call-template name="Insert_Addr">
					<xsl:with-param name="Title">Address</xsl:with-param>
					<xsl:with-param name="Addr1">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/Addr1"/>
					</xsl:with-param>
					<xsl:with-param name="Addr2">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/Addr2"/>
					</xsl:with-param>
					<xsl:with-param name="City">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/City"/>
					</xsl:with-param>
					<xsl:with-param name="State">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/StateProvCd"/>
					</xsl:with-param>
					<xsl:with-param name="ZipCode">
						<xsl:value-of select="substring($SplitZip, 1, 5)"/>
						<xsl:if test="string-length($SplitZip) &gt; 5">-</xsl:if>
						<xsl:value-of select="substring($SplitZip, 6, 9)"/>
					</xsl:with-param>
					<xsl:with-param name="Country">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/CountryCd"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:variable name="BusinessNum" select="$BuyerNode/GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 	'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>
				<xsl:if test="count($BusinessNum) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Business Phone</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:number value="substring($BusinessNum,4,3)" format="(001"/>
							<xsl:number value="substring($BusinessNum,8,3)" format=") 001-"/>
							<xsl:number value="substring($BusinessNum,11,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
			</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $WaterCraftId or @idref = $MobileId]"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Vehicle_Recall_Info Template
*
*			Display the Vehicle Recall Info
*	 
*			GAURAV : MV15 Info
*********************************************************************************
-->
	<xsl:template name="Display_Vehicle_Recall_Info">
		<xsl:param name="VehRecNode"/>
		<xsl:variable name="mfg" select="./Manufacturer"/>
		<xsl:variable name="mod" select="./Model"/>
		<xsl:variable name="mod_yr" select="./ModelYear"/>
		<xsl:variable name="prod_mfg" select="./com.iso_ProdMfr"/>
		<xsl:variable name="nid" select="./com.iso_NHTSAid"/>
		<xsl:variable name="rec_dt" select="./com.iso_RecallDt"/>
		<xsl:variable name="veh_af" select="./com.iso_VehAffected"/>
		<xsl:variable name="comp" select="./com.iso_Component"/>
		<xsl:variable name="rec_sum" select="./com.iso_RecallSum"/>
		<xsl:variable name="consq" select="./com.iso_Consqs"/>
		<tr>
			<td align="left" colspan="5">
				<table border="0" cellspacing="2" cellpadding="2" width="675">
					<tr>
						<xsl:if test="count($mfg) &gt;0 or count($mod) &gt;0">
							<td align="left">
								<xsl:call-template name="Insert_Simple_Data_Label">
									<xsl:with-param name="Data_Name">Make / Models</xsl:with-param>
								</xsl:call-template>
								&#160;&#160;
								<xsl:call-template name="Insert_Simple_Data_Value">
									<xsl:with-param name="Data_Value">
										<xsl:value-of select="./Manufacturer"/>
									</xsl:with-param>
								</xsl:call-template>
								&#160;/&#160;
								<xsl:call-template name="Insert_Simple_Data_Value">
									<xsl:with-param name="Data_Value">
										<xsl:value-of select="./Model"/>
									</xsl:with-param>
								</xsl:call-template>
							</td>
						</xsl:if>
						<xsl:if test="count($mod_yr) &gt;0">
							<td align="left">
								<xsl:call-template name="Insert_Simple_Data">
									<xsl:with-param name="Data_Name">Model / Build Year</xsl:with-param>
									<xsl:with-param name="Data_Value">
										<xsl:value-of select="./ModelYear"/>
									</xsl:with-param>
								</xsl:call-template>
								<br/>
							</td>
						</xsl:if>
					</tr>
					<xsl:if test="count($prod_mfg) &gt;0">
						<tr>
							<td align="left" colspan="2">
								<xsl:call-template name="Insert_Simple_Data">
									<xsl:with-param name="Data_Name">Manufacturer</xsl:with-param>
									<xsl:with-param name="Data_Value">
										<xsl:value-of select="./com.iso_ProdMfr"/>
									</xsl:with-param>
								</xsl:call-template>
							</td>
						</tr>
					</xsl:if>
					<tr>
						<xsl:if test="count($nid) &gt;0">
							<td align="left">
								<xsl:call-template name="Insert_Simple_Data">
									<xsl:with-param name="Data_Name">NHTSA CAMPAIGN ID Number</xsl:with-param>
									<xsl:with-param name="Data_Value">
										<xsl:value-of select="./com.iso_NHTSAid"/>
									</xsl:with-param>
								</xsl:call-template>
							</td>
						</xsl:if>
						<xsl:if test="count($rec_dt) &gt;0">
							<td align="left">
								<xsl:call-template name="Insert_Simple_Data">
									<xsl:with-param name="Data_Name">Recall Date</xsl:with-param>
									<xsl:with-param name="Data_Value">
										<xsl:value-of select="./com.iso_RecallDt"/>
									</xsl:with-param>
								</xsl:call-template>
							</td>
						</xsl:if>
					</tr>
					<xsl:if test="count($veh_af) &gt;0">
						<tr>
							<td align="left" colspan="2">
								<xsl:call-template name="Insert_Simple_Data">
									<xsl:with-param name="Data_Name">Potential Number of Units affected</xsl:with-param>
									<xsl:with-param name="Data_Value">
										<xsl:value-of select="./com.iso_VehAffected"/>
									</xsl:with-param>
								</xsl:call-template>
							</td>
						</tr>
					</xsl:if>
					<xsl:if test="count($comp) &gt;0">
						<tr>
							<td align="left" colspan="2">
								<xsl:call-template name="Insert_Simple_Data">
									<xsl:with-param name="Data_Name">Component</xsl:with-param>
									<xsl:with-param name="Data_Value">
										<xsl:value-of select="./com.iso_Component"/>
									</xsl:with-param>
								</xsl:call-template>
							</td>
						</tr>
					</xsl:if>
					<xsl:if test="count($rec_sum) &gt;0">
						<tr>
							<td align="left" colspan="2">
								<xsl:call-template name="Insert_Simple_Data">
									<xsl:with-param name="Data_Name">Summary</xsl:with-param>
									<xsl:with-param name="Data_Value">
										<xsl:value-of select="./com.iso_RecallSum"/>
									</xsl:with-param>
								</xsl:call-template>
							</td>
						</tr>
					</xsl:if>
					<xsl:if test="count($consq) &gt;0">
						<tr>
							<td align="left" colspan="2">
								<xsl:call-template name="Insert_Simple_Data">
									<xsl:with-param name="Data_Name">Consequence</xsl:with-param>
									<xsl:with-param name="Data_Value">
										<xsl:value-of select="./com.iso_Consqs"/>
									</xsl:with-param>
								</xsl:call-template>
							</td>
						</tr>
					</xsl:if>
					<tr>
						<td align="left" colspan="2">&#160;</td>
					</tr>
				</table>
			</td>
		</tr>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_NMVTIS_Info Template
*
*			Display NMVTIS Info
*	 
*			GAURAV : NMVTIS Info
*********************************************************************************
-->
	<xsl:template name="Display_NMVTIS_Info">
		<xsl:param name="NMVTISNode"/>
		<xsl:call-template name="Insert_Header">
			<xsl:with-param name="Data_Name">NMVTIS Information</xsl:with-param>
		</xsl:call-template>
		<tr>
			<td style="width:245px;">
				<font size="2" face="Arial">
					<b>&#160;&#160;&#160;Date Vehicle Determined to be <br/> &#160;&#160;&#160;Total Loss</b>
				</font>
			</td>
			<td>
				<font size="2" face="Arial">
					<xsl:variable name="FormatDt" select="./com.iso_TotalLossDt"/>
					<xsl:number value="substring($FormatDt,6,2)" format="01/"/>
					<xsl:number value="substring($FormatDt,9,2)" format="01/"/>
					<xsl:number value="substring($FormatDt,1,4)" format="0001"/>
				</font>
			</td>
		</tr>
		<tr>
			<td style="width:245px;">
				<font size="2" face="Arial">
					<b>&#160;&#160;&#160;Name of Owner at Designated <br/> &#160;&#160;&#160;Total Loss Date</b>
				</font>
			</td>
			<td>
				<font size="2" face="Arial">
					<xsl:choose>
						<xsl:when test="string-length(./com.iso_TotalLossName/NameInfo/PersonName) != 0">
							<xsl:value-of select="./com.iso_TotalLossName/NameInfo/PersonName/GivenName"/>
							<xsl:if test="string-length(./com.iso_TotalLossName/NameInfo/PersonName/OtherGivenName) != 0 ">
				&#160;<xsl:value-of select="./com.iso_TotalLossName/NameInfo/PersonName/OtherGivenName"/>
							</xsl:if>
							<xsl:if test="string-length(./com.iso_TotalLossName/NameInfo/PersonName/Surname) != 0 ">
				&#160;<xsl:value-of select="./com.iso_TotalLossName/NameInfo/PersonName/Surname"/>
							</xsl:if>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="./com.iso_TotalLossName/NameInfo/CommlName/CommercialName"/>
						</xsl:otherwise>
					</xsl:choose>
				</font>
			</td>
		</tr>
		<tr>
			<td style="width:245px;">
				<font size="2" face="Arial">
					<b>&#160;&#160;&#160;Name of Owner at Time Report <br/> &#160;&#160;&#160;Filed</b>
				</font>
			</td>
			<td>
				<font size="2" face="Arial">
					<xsl:choose>
						<xsl:when test="string-length(./com.iso_ReportFiledName/NameInfo/PersonName) != 0">
							<xsl:value-of select="./com.iso_ReportFiledName/NameInfo/PersonName/GivenName"/>
							<xsl:if test="string-length(./com.iso_ReportFiledName/NameInfo/PersonName/OtherGivenName) != 0 ">
				&#160;<xsl:value-of select="./com.iso_ReportFiledName/NameInfo/PersonName/OtherGivenName"/>
							</xsl:if>
							<xsl:if test="string-length(./com.iso_ReportFiledName/NameInfo/PersonName/Surname) != 0 ">
				&#160;<xsl:value-of select="./com.iso_ReportFiledName/NameInfo/PersonName/Surname"/>
							</xsl:if>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="./com.iso_ReportFiledName/NameInfo/CommlName/CommercialName"/>
						</xsl:otherwise>
					</xsl:choose>
				</font>
			</td>
		</tr>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Vehicle_Info Template
*
*			Display the initiating vehicle records
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Vehicle_Info">
		<xsl:param name="VehLossNode"/>
		<xsl:param name="ClaimPartyNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:param name="ClaimsPartyId"/>
		<xsl:param name="AdjusterNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="ClaimsPayNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="CMS_veh_cov"/>
		<xsl:variable name="MV01Id" select="$VehLossNode/@id"/>
		<xsl:variable name="NewVINRec" select="$ClaimRoot/RecoveryInfo[@ItemRef = $MV01Id]/com.iso_VehRecoveryInd[@ItemRef = $MV01Id] or $InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/com.iso_VehRecoveryInd[@ItemRef = $MV01Id]"/>
		<!--<xsl:call-template name="Insert_Header">-->
		<xsl:call-template name="Insert_Recovery_Header">
			<xsl:with-param name="Data_Name">Vehicle Coverage Information</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:if test="$NewVINRec = 'Y'">
					&#160;&#160;-&#160;&#160;New Recovery
				</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="CoverageType" select="$AdjusterNode/CoverageCd"/>
		<xsl:variable name="LossType" select="$AdjusterNode/LossCauseCd"/>
		<xsl:call-template name="Insert_Adjuster">
			<xsl:with-param name="CoverageType">
				<xsl:value-of select="$CoverageType"/>
			</xsl:with-param>
			<xsl:with-param name="LossType">
				<xsl:value-of select="$LossType"/>
			</xsl:with-param>
			<xsl:with-param name="AdjustingCompany">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
			</xsl:with-param>
			<xsl:with-param name="AdjusterFirstName">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
			</xsl:with-param>
			<xsl:with-param name="AdjusterMiddleName">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
			</xsl:with-param>
			<xsl:with-param name="AdjusterLastName">
				<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/NameInfo/PersonName/Surname"/>
			</xsl:with-param>
			<xsl:with-param name="CoverageType_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageType]"/>
			</xsl:with-param>
			<xsl:with-param name="LossType_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=$LossType]"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--*********************************** GAURAV : Updated for Date Claim Closed *********************************** -->
		<xsl:variable name="ClaimStatusCd" select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id]/ClaimsPaymentCovInfo/ClaimStatusCd"/>
		<xsl:if test="count($ClaimStatusCd) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					Claim Status:
					</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ClaimStatusCds/*[@code=$ClaimStatusCd]"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="MV01CloseDt" select="$ClaimPartyNode/ClaimsPartyInfo/ClosedDt[contains(@idref,$MV01Id)]"/>
		<xsl:if test="count($MV01CloseDt) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
					<b>
						<font size="2" face="Arial">Date Claim Closed:</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:number value="substring($MV01CloseDt,6,2)" format="01/"/>
						<xsl:number value="substring($MV01CloseDt,9,2)" format="01/"/>
						<xsl:number value="substring($MV01CloseDt,1,4)" format="0001"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--*********************************** GAURAV : Updated for Date Claim Closed *********************************** -->
		<xsl:variable name="AdjNum" select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>
		<xsl:if test="count($AdjNum) &gt; 0">
			<xsl:call-template name="Insert_Adjuster">
				<xsl:with-param name="AdjusterPhone">
					<!--<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>-->
					<xsl:number value="substring($AdjNum,4,3)" format="(001"/>
					<xsl:number value="substring($AdjNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($AdjNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="ChkVIN" select="$InvestigationNode/ValidVINInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">VIN</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/VehIdentificationNumber"/>
				<xsl:if test="$ChkVIN =0"> (Fail)</xsl:if>
				<xsl:if test="$ChkVIN =1"> (Pass)</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MV01EDR" select="$VehLossNode/com.iso_EDRInd"/>
		<xsl:if test="string-length(normalize-space($MV01EDR)) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Event Data Recorder</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:if test="$MV01EDR=0">NO</xsl:if>
					<xsl:if test="$MV01EDR &gt; 0">YES</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Vehicle</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/ModelYear"/>&#160;<xsl:value-of select="$VehLossNode/VehInfo/Manufacturer"/>&#160;<xsl:value-of select="$VehLossNode/VehInfo/Model"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Vehicle Year</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/ModelYear"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Vehicle Make</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/Manufacturer"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Vehicle Model</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/Model"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Vehicle Style</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/VehBodyTypeCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="VehStyleCd" select="$VehLossNode/VehInfo/VehBodyTypeCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Vehicle Style</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$VehStyleCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/VehBodyTypeCds/*[@code=$VehStyleCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="VehType" select="$VehLossNode/VehInfo/VehTypeCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Vehicle Type</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$VehType"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/VehTypeCds/*[@code=$VehType]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="VehDispisiton" select="$InvestigationNode/VehDispositionCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Vehicle Disposition</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$VehDispisiton"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/VehDispositionCds/*[@code=$VehDispisiton]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="VehColorCd" select="$VehLossNode/VehInfo/ColorCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Vehicle Color</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$VehColorCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ColorCds/*[@code=$VehColorCd]"/>
			</xsl:with-param>
			<!--
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/ColorCd"/>
			</xsl:with-param>
			-->
		</xsl:call-template>
		<!--<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">VIN Validation</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$InvestigationNode/ValidVINInd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<!--
		<xsl:variable name="ChkVIN" select="$InvestigationNode/ValidVINInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">VIN Validation</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:if test="$ChkVIN =0">NO</xsl:if>
				<xsl:if test="$ChkVIN =1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Engine Serial No.</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/EngineSerialNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Transmission Serial No.</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/TransmissionSerialNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Chassis Serial No.</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/ChassisSerialNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Vehicle Odometer Reading</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/PersVehInfo/OdometerReading/NumUnits"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">License Type</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/Registration/RegistrationTypeCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="VehRegTypeCd" select="$VehLossNode/VehInfo/Registration/RegistrationTypeCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">License Type</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$VehRegTypeCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/RegistrationTypeCds/*[@code=$VehRegTypeCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">License Plate</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/Registration/RegistrationNumber"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">License Plate State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/Registration/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="LicNum" select="$VehLossNode/VehInfo/Registration/RegistrationNumber"/>
		<xsl:variable name="LicSt" select="$VehLossNode/VehInfo/Registration/StateProvCd"/>
		<xsl:if test="count($LicNum) &gt; 0">
			<tr>
				<td align="left" colspan="1">&#160;&#160;
					<b>
						<font size="2" face="Arial">
						License Plate:
						</font>
					</b>
				</td>
				<td align="left" colspan="1">
					<font size="2" face="Arial">
						<xsl:value-of select="$LicNum"/>
					</font>
					<xsl:if test="count($LicSt) &gt; 0">
						<b>
							<font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						License Plate State:
						</font>
						</b>
						<font size="2" face="Arial">
							<xsl:value-of select="$LicSt"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Last Year Registered</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/Registration/LastRegisteredYear"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="AntiTheftType" select="$VehLossNode/VehInfo/PersVehInfo/AntiTheftDeviceCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Anti-Theft Device Type</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$AntiTheftType"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/AntiTheftDeviceCds/*[@code=$AntiTheftType]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="PointOfImpact" select="$VehLossNode/ImpactPointCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Point of Impact</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$PointOfImpact"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/PointOfImpactCds/*[@code=$PointOfImpact]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="DriverAirbagStatus" select="$VehLossNode/AirbagInfo[AirbagTypeCd = 'Driver']/AirbagStatusCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Driver Airbag Status</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$DriverAirbagStatus"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/AirbagStatusCds/*[@code=$DriverAirbagStatus]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="PassengerAirbagStatus" select="$VehLossNode/AirbagInfo[AirbagTypeCd = 'Passenger']/AirbagStatusCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Passenger Airbag Status</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$PassengerAirbagStatus"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/AirbagStatusCds/*[@code=$PassengerAirbagStatus]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="LeftSideAirbagStatus" select="$VehLossNode/AirbagInfo[AirbagTypeCd = 'LeftSide']/AirbagStatusCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Left Side Airbag Status</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$LeftSideAirbagStatus"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/AirbagStatusCds/*[@code=$LeftSideAirbagStatus]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="RightSideAirbagStatus" select="$VehLossNode/AirbagInfo[AirbagTypeCd = 'RightSide']/AirbagStatusCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Right Side Airbag Status</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$RightSideAirbagStatus"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/AirbagStatusCds/*[@code=$RightSideAirbagStatus]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="TheftType" select="$InvestigationNode/com.iso_TheftTypeInd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Theft Type</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$TheftType"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TheftTypeCds/*[@code=$TheftType]"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--<xsl:variable name="SuitIndicator" select="$ClaimsPayNode/ClaimsPartyInfo/SuitFiledInd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Suit Indicator</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$SuitIndicator"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/Indicators/*[@code=$SuitIndicator]"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<!--<xsl:variable name="SuiteInd" select="$ClaimPartyNode/ClaimsPartyInfo/SuitFiledInd"/>-->
		<xsl:variable name="SuiteInd" select="$ClaimPartyNode/ClaimsPartyInfo/SuitFiledInd[@idref=$MV01Id]"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Suit Indicator</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd"/>-->
				<xsl:if test="$SuiteInd=0">NO</xsl:if>
				<xsl:if test="$SuiteInd=1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MV01EstLoss" select="$ClaimRoot/ClaimsOccurrence/ProbableIncurredAmt[contains(@idref,$MV01Id)]/Amt"/>
		<!--GAURAV : Updated Est. Loss Amt for idref. -->
		<xsl:if test="count($MV01EstLoss) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Estimated Loss</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$ClaimRoot/ClaimsOccurrence/ProbableIncurredAmt/Amt"/>-->
					<xsl:value-of select="format-number($MV01EstLoss, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="MV01ResLoss" select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id and PaymentTypeCd = 'LossResv']/TotalPaymentAmt/Amt"/>
		<xsl:if test="count($MV01ResLoss) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Reserve Amount</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id and PaymentTypeCd = 'LossResv']/TotalPaymentAmt/Amt"/>-->
					<xsl:value-of select="format-number($MV01ResLoss, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="MV01SettleLoss" select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)]/TotalPaymentAmt/Amt"/>
		<xsl:if test="$MV01SettleLoss &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Settlement Amount</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="format-number($MV01SettleLoss, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="MV01RecoveryDt" select="$ClaimRoot/RecoveryInfo[@ItemRef = $MV01Id]/RecoveryDt | $InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/RecoveryDt"/>
		<xsl:if test="string-length(normalize-space($MV01RecoveryDt)) &gt; 0">
			<xsl:call-template name="Insert_SmallHeader">
				<xsl:with-param name="Data_Name">Theft Recovery Information</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="count($MV01RecoveryDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Date of Recovery</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$InvestigationNode/RecoveryInfo/RecoveryDt"/>-->
					<xsl:number value="substring($MV01RecoveryDt,6,2)" format="01/"/>
					<xsl:number value="substring($MV01RecoveryDt,9,2)" format="01/"/>
					<xsl:number value="substring($MV01RecoveryDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Recovering Agency</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Recovery Agency City</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']/GeneralPartyInfo/Addr/City"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Recovering Agency</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/Addr/CommercialName | $ClaimRoot/RecoveryInfo[@ItemRef = $MV01Id]/Addr/CommercialName"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Recovery Agency City</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/Addr/City | $ClaimRoot/RecoveryInfo[@ItemRef = $MV01Id]/Addr/City"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Recovery Location State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']/GeneralPartyInfo/Addr/StateProvCd"/>-->
				<xsl:value-of select="$InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/Addr/StateProvCd | $ClaimRoot/RecoveryInfo[@ItemRef = $MV01Id]/Addr/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Recovery Location Country</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/Addr/CountryCd | $ClaimRoot/RecoveryInfo[@ItemRef = $MV01Id]/Addr/CountryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="RecNum" select="$InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/Communications/PhoneInfo/PhoneNumber | $ClaimRoot/RecoveryInfo[@ItemRef = $MV01Id]/Communications/PhoneInfo/PhoneNumber"/>
		<xsl:if test="count($RecNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovery Location Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$InvestigationNode/RecoveryInfo/Communications/PhoneInfo/PhoneNumber"/>-->
					<xsl:number value="substring($RecNum,4,3)" format="(001"/>
					<xsl:number value="substring($RecNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($RecNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	<!-- condition recovery code for WTX only -->
	<xsl:if test="$InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/RecoveryStatusCd[@codelistref ='RecoveryConditionCdList']">
		<xsl:variable name="RecoveryCondWTX" select="$InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/RecoveryStatusCd[@codelistref ='RecoveryConditionCdList']"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Condition of Recovered Vehicle</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$RecoveryCondWTX"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/RecoveryConditionCds/*[@code=$RecoveryCondWTX]"/>
			</xsl:with-param>
		</xsl:call-template>
	</xsl:if>
	<xsl:variable name="RecoveryCond" select="$InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/RecoveryStatusCd[not(@codelistref)] | $ClaimRoot/RecoveryInfo[@ItemRef = $MV01Id]/RecoveryStatusCd[not(@codelistref)]"/>
	<!--<xsl:variable name="RecoveryCond" select="$InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/RecoveryStatusCd[not(@codelistref)] or $InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/RecoveryStatusCd[@codelistref ='RecoveryConditionCdList'] or $ClaimRoot/RecoveryInfo[@ItemRef = $MV01Id]/RecoveryStatusCd[not(@codelistref)]"/>-->

		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Condition of Recovered Vehicle</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$RecoveryCond"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/RecoveryConditionCds/*[@code=$RecoveryCond]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="RecoveryClass" select="$InvestigationNode/RecoveryInfo[@ItemRef = $MV01Id]/RecoveryStatusCd[@codelistref] | $ClaimRoot/RecoveryInfo[@ItemRef = $MV01Id]/RecoveryStatusCd[@codelistref]"/>
		<xsl:if test="$RecoveryClass &gt;0">
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Recovery Classification</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$RecoveryClass"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/RecoveryClassificationCds/*[@code=$RecoveryClass]"/>
			</xsl:with-param>
		</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $MV01Id]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MV01NCIC" select="$InvestigationNode/NCICStatusCd"/>
		<xsl:if test="string-length(normalize-space($MV01NCIC)) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">NCIC Status</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:if test="$MV01NCIC='A'">Active</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--CMS Info-->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Alleged Injury / Property Damage</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/InjuryNatureDesc"/>
			</xsl:with-param>
		</xsl:call-template>
		<!-- ICD9 code-->
		<xsl:variable name="ICD9Cd" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef= 	$MV01Id]/ICDDiagnosticCd"/>
		<xsl:if test="count($ICD9Cd) &gt; 0">
			<tr>
				<td align="left" nowrap="nowrap">
					&#160;&#160;
						
							<font size="2" face="Arial">
						<b>
							<xsl:value-of select="'ICD9'"/>:</b>
					</font>
				</td>
				<td align="left" nowrap="nowrap">
					<font size="2" face="Arial">
						<xsl:for-each select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/ICDDiagnosticCd">
							<xsl:value-of select="."/>
							<br/>
						</xsl:for-each>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!--end ICD9 code-->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Cause Of Injury</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/com.iso_CauseofInjuryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="ProdLiab" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$MV01Id]/com.iso_ProdLiabInd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Product Liability</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$ProdLiab"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ProdLiabCds/*[@code=$ProdLiab]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Product Manufacturer</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$MV01Id]/com.iso_ProdMfr"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Product Generic Name</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$MV01Id]/com.iso_GenName"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Product Brand Name</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=	$MV01Id]/com.iso_BrandName"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Product Alleged Harm</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$MV01Id]/com.iso_allegedHarm"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--display CMS information-->
		<xsl:variable name="CMSIncDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/com.iso_CMSIncidentDt"/>
		<xsl:variable name="CMSVenueSt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/Addr/StateProvCd"/>
		<xsl:variable name="CMSNFLT" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/com.iso_NoFLTLimit"/>
		<xsl:variable name="CMSExDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/com.iso_ExhaustDt"/>
		<xsl:variable name="CMSORMInd" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/com.iso_ORMInd"/>
		<xsl:variable name="CMSORMDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/com.iso_ORMDt"/>
		<xsl:variable name="CMSTPOCDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/com.iso_TPOCDt"/>
		<xsl:variable name="CMSTPOCAmt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/com.iso_TPOCAmt"/>
		<xsl:variable name="CMSTPOCStartDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/com.iso_TPOCStartDt"/>
		<xsl:if test="string-length(normalize-space($CMSIncDt)) &gt; 0 or string-length(normalize-space($CMSVenueSt)) &gt; 0 or string-length(normalize-space($CMSNFLT)) &gt; 0 or string-length(normalize-space($CMSExDt)) &gt; 0 or string-length(normalize-space($CMSORMInd)) &gt; 0 or string-length(normalize-space($CMSORMDt)) &gt; 0 or string-length(normalize-space($CMSTPOCDt)) &gt; 0 or string-length(normalize-space($CMSTPOCAmt)) &gt; 0 or string-length(normalize-space($CMSTPOCStartDt)) &gt; 0">
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">CMS Information</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="DeleteFromCMS" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/com.iso_DeleteFromCMS"/>
		<xsl:if test="$DeleteFromCMS= 'Y'">
			<tr>
				<td nowrap="nowrap">
					<b>
						<font face="Arial" size="2">&#160;&#160;* This Claimant Coverage from CMS is deleted.</font>
					</b>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="NotSendCovCMS" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV01Id]/com.iso_NotSendCovCMS"/>
		<xsl:if test="$NotSendCovCMS= 'Y'">
			<tr>
				<td nowrap="nowrap">
					<b>
						<font face="Arial" size="2">&#160;&#160;* This Claimant Coverage will not be sent to CMS.</font>
					</b>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="count($CMSIncDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Date Of Incident</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($CMSIncDt,6,2)" format="01/"/>
					<xsl:number value="substring($CMSIncDt,9,2)" format="01/"/>
					<xsl:number value="substring($CMSIncDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">State Of Venue</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$CMSVenueSt"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:if test="count($CMSNFLT) &gt;0 or count($CMSExDt) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					No Fault Insurance Limit:
					</font>
					</b>
				</td>
				<td align="left">
					<xsl:variable name="NoFlt" select="$CMSNFLT div 100"/>
					<xsl:choose>
						<xsl:when test="$CMSNFLT mod 100 = 0">
							<font size="2" face="Arial">
								<xsl:value-of select='format-number($NoFlt, "$###,###,###.00")'/>
							</font>
						</xsl:when>
						<xsl:otherwise>
							<font size="2" face="Arial">
								<xsl:value-of select='format-number($NoFlt, "$###,###,###.00")'/>
							</font>
						</xsl:otherwise>
					</xsl:choose>
					<xsl:if test="count($CMSExDt) &gt;0">
						<b>
							<font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						Exhaust Date:
						</font>
						</b>
						<font size="2" face="Arial">
							<xsl:number value="substring($CMSExDt,6,2)" format="01/"/>
							<xsl:number value="substring($CMSExDt,9,2)" format="01/"/>
							<xsl:number value="substring($CMSExDt,1,4)" format="0001"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="count($CMSORMInd) &gt;0 or count($CMSORMDt) &gt;0">
			<tr>
				<tr>
					<td align="left" nowrap="nowrap">&#160;&#160;
				<b>
							<font size="2" face="Arial">
					On-Going Responsibility
					 </font>
						</b>
					</td>
				</tr>
				<tr>
					<td align="left" nowrap="nowrap">&#160;&#160;
				<b>
							<font size="2" face="Arial">
					 for Medicals(ORM):
					</font>
						</b>
					</td>
					<td align="left" nowrap="nowrap">
						<font size="2" face="Arial">
							<xsl:if test="$CMSORMInd='N'">NO</xsl:if>
							<xsl:if test="$CMSORMInd='Y'">YES</xsl:if>
						</font>
						<xsl:if test="count($CMSORMDt) &gt;0">
							<b>
								<font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;
						ORM Termination Date:
						</font>
							</b>
							<font size="2" face="Arial">
								<xsl:number value="substring($CMSORMDt,6,2)" format="01/"/>
								<xsl:number value="substring($CMSORMDt,9,2)" format="01/"/>
								<xsl:number value="substring($CMSORMDt,1,4)" format="0001"/>
							</font>
						</xsl:if>
					</td>
				</tr>
			</tr>
		</xsl:if>
		<!-- StartTPOC will display 5 times(MAX)-->
		<xsl:if test="count($CMSTPOCDt) &gt;0 or count($CMSTPOCAmt) &gt;0 or count($CMSTPOCStartDt) &gt;0">
			<xsl:variable name="CMSTPOC" select="$CMS_veh_cov[@itemRef = $MV01Id]"/>
			<xsl:for-each select="$CMSTPOC/com.iso_TPOCDt">
				<xsl:variable name="TPOCid" select="@id"/>
				<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid])) &gt;0">
					<tr>
						<td align="left">
							<b>
								<font size="2" face="Arial">
									<xsl:value-of select="$TPOCid"/>.&#160;Total Payment Obligation
								</font>
							</b>
						</td>
					</tr>
				</xsl:if>
				<tr>
					<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid])) &gt;0">
						<td align="left">&#160;&#160;&#160;
								<b>
								<font size="2" face="Arial">
									 to the Claimant(TPOC) Date:
									</font>
							</b>
						</td>
						<td align="left">
							<font size="2" face="Arial">
								<!--<xsl:value-of select="$CMSTPOC/com.iso_TPOCDt[@id=$TPOCid]"/>-->
								<xsl:number value="substring($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid],6,2)" format="01/"/>
								<xsl:number value="substring($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid],9,2)" format="01/"/>
								<xsl:number value="substring($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid],1,4)" format="0001"/>
							</font>
						</td>
					</xsl:if>
					<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCAmt[@id=$TPOCid])) &gt;0">
						<td nowrap="nowrap">
							<b>
								<font size="2" face="Arial">
									TPOC Amount:
									</font>
							</b>
							<xsl:variable name="TPOCAmt" select="$CMSTPOC/com.iso_TPOCAmt[@id=$TPOCid] div 100"/>
							<xsl:choose>
								<xsl:when test="$TPOCAmt mod 100 = 0">
									<font size="2" face="Arial">
										<xsl:value-of select='format-number($TPOCAmt, "$###,###,###.##")'/>.00
									</font>
								</xsl:when>
								<xsl:otherwise>
									<font size="2" face="Arial">
										<xsl:value-of select='format-number($TPOCAmt, "$###,###,###.##")'/>
									</font>
								</xsl:otherwise>
							</xsl:choose>
						</td>
					</xsl:if>
					<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid])) &gt;0">
						<tr>
							<td align="left">&#160;&#160;&#160;
								<b>
									<font size="2" face="Arial">
											Funding Delayed Beyond
										</font>
								</b>
							</td>
						</tr>
					</xsl:if>
					<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid])) &gt;0">
						<tr>
							<td align="left">&#160;&#160;&#160;
									<b>
									<font size="2" face="Arial">
									TPOC Start Date:
										</font>
								</b>
							</td>
							<td align="left">
								<font size="2" face="Arial">
									<!--<xsl:value-of select="$CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid]"/>-->
									<xsl:number value="substring($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid],6,2)" format="01/"/>
									<xsl:number value="substring($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid],9,2)" format="01/"/>
									<xsl:number value="substring($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid],1,4)" format="0001"/>
								</font>
							</td>
						</tr>
					</xsl:if>
				</tr>
			</xsl:for-each>
		</xsl:if>
		<!-- End TPOC will display 5 times(MAX)-->
		<!--CMS warnings-->
		<xsl:variable name="CDVehInd" select="$ClaimRoot/com.iso_ClaimDirectorInd"/>
		<xsl:variable name="VehCDCMS" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CMS[@itemRef=$MV01Id]"/>
		<xsl:if test="$CDVehInd= 1 and count($VehCDCMS) &gt; 0">
			<tr>
				<td colspan="4" valign="top">
					<font face="arial" size="2" color="red">
						<b>Missing CMS Required Field:</b>
					</font>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<font face="arial" size="2">
						<!--<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageCode]"/>-->
						<xsl:for-each select="$VehCDCMS/com.iso_CMSWarning">
							<!--<xsl:value-of select="."/>-->
							<xsl:variable name="CMSWarning" select="."/>
							<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/CMSWarningCds/*[@code=$CMSWarning]"/>
							<!--<xsl:value-of select="position()!=last()">-->
							<xsl:if test="position()!=last()">
								<xsl:text>, </xsl:text>
							</xsl:if>
						</xsl:for-each>
					</font>
				</td>
			</tr>
		</xsl:if>
		<!-- End CMS Warnings-->
		<!--End CMS Info-->
		<!--
		<xsl:if test="string-length(normalize-space($InvestigationNode/RecoveryInfo/com.iso_TheftVerification)) &gt; 0 ">-->
			<xsl:variable name="MV14PoliceDt" select="$InvestigationNode/RecoveryInfo/com.iso_TheftVerification/com.iso_NCICDt"/>
			<xsl:variable name="MV14PoliceAgency" select="$InvestigationNode/RecoveryInfo/com.iso_TheftVerification/com.iso_PoliceAgency"/>
			<xsl:variable name="MV14OCA" select="$InvestigationNode/RecoveryInfo/com.iso_TheftVerification/com.iso_OCA"/>
			<xsl:variable name="MV14Misc" select="$InvestigationNode/RecoveryInfo/@ItemRef"/>
			<xsl:variable name="MiscText" select="$ClaimRoot/RemarkText[@ItemRef = $MV14Misc or @ItemRef = $MV01Id]"/>
			<!--<xsl:if test="count($MV14PoliceDt) &gt; 0">-->
			<xsl:choose>
				<xsl:when test="count($MV14PoliceDt) &gt; 0">
					<xsl:call-template name="Insert_MV14_Data">
						<!--<xsl:with-param name="Data_Name">Shipping/Invoice Date</xsl:with-param>-->
						<xsl:with-param name="Data_Value">
									Records indicate that on
									<xsl:number value="substring($MV14PoliceDt,6,2)" format="01/"/>
							<xsl:number value="substring($MV14PoliceDt,9,2)" format="01/"/>
							<xsl:number value="substring($MV14PoliceDt,1,4)" format="0001"/> the  
		                  					<xsl:value-of select="$MV14PoliceAgency"/>
		 							    &#160;&#160;&#160;police department received a vehicle theft report for VIN:
		 							 <xsl:value-of select="$VehLossNode/VehInfo/VehIdentificationNumber"/>
		 							 &#160;&#160;&#160;and has assigned to it case number <xsl:value-of select="$MV14OCA"/>.
							</xsl:with-param>
					</xsl:call-template>
				</xsl:when>
				<!--<xsl:when test="count($MiscText) &gt; 0">-->
				<xsl:when test="$MiscText ='NO POLICE AGENCY HAS REPORTED THIS VEHICLE AS STOLEN'">
					<xsl:call-template name="Insert_MV14_Data">
						<xsl:with-param name="Data_Name">Note:</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="$MiscText"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:when>
			</xsl:choose>
			<!--</xsl:if>-->
		<!--</xsl:if>-->
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Vehicle_Shipping Template
*
*			Displays vehicle shipping records.
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Vehicle_Shipping">
		<xsl:param name="VehLossNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:param name="ClaimsPartyId"/>
		<!-- check to see if we have vehicle shipping info, if there is, it is displayed -->
		<xsl:if test="string-length(normalize-space($ClaimRoot/InvestigationInfo/AutoInvestigationInfo/ShippedConditionDesc)) &gt; 0 or string-length(normalize-space($ClaimRoot/InvestigationInfo/AutoInvestigationInfo/EventInfo[EventCd = 'Shipping']/EventDt)) &gt; 0 ">
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Vehicle Shipping Information</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="MV04EventDt" select="$ClaimRoot/InvestigationInfo/AutoInvestigationInfo/EventInfo[EventCd = 'Shipping']/EventDt"/>
			<xsl:if test="count($MV04EventDt) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Shipping/Invoice Date</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:number value="substring($MV04EventDt,6,2)" format="01/"/>
						<xsl:number value="substring($MV04EventDt,9,2)" format="01/"/>
						<xsl:number value="substring($MV04EventDt,1,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:if test="count($ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/VehIdentificationNumber) &gt; 0 ">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">VIN</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/VehIdentificationNumber"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:variable name="VehYear" select="$ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/ModelYear"/>
			<xsl:variable name="VehMake" select="$ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/Manufacturer"/>
			<xsl:variable name="VehModel" select="$ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/Model"/>
			<xsl:if test="count($VehYear) &gt; 0 or count($VehMake) &gt; 0 or count($VehModel) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Vehicle</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$VehYear"/>&#160;<xsl:value-of select="$VehMake"/>&#160;<xsl:value-of select="$VehModel"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<!--
			<xsl:if test="count($ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/ModelYear) &gt; 0 ">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Vehicle Year</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/ModelYear"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:if test="count($ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/Manufacturer) &gt; 0 ">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Vehicle Make</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/Manufacturer"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:if test="count($ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/Model) &gt; 0 ">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Vehicle Model</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/Model"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			-->
			<xsl:if test="count($ClaimRoot/InvestigationInfo/AutoInvestigationInfo/ShippedConditionDesc) &gt; 0 ">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Tag Status</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$ClaimRoot/InvestigationInfo/AutoInvestigationInfo/ShippedConditionDesc"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Vehicle_Recovery Template
*
*			Displays Initiating vehicle recovery records.
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Vehicle_Add_Recovery">
		<xsl:param name="VehLossNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:variable name="RecoveryAgencyRef" select="$InvestigationNode/RecoveryInfo/@RecoveryAgencyRef"/>
		<xsl:variable name="RecoveryAgencyParty" select="$ClaimRoot/ClaimsParty[@id = $RecoveryAgencyRef and ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']"/>
		<xsl:variable name="InvId" select="$InvestigationNode/@ItemRef"/>
		<!-- check to see if we have vehicle recovery info, if there is, it is displayed -->
		<!--	commented on 01/25/2006 <xsl:if test="string-length(normalize-space($InvestigationNode/RecoveryInfo/@ItemRef)) &gt; 0">-->
		<xsl:variable name="RecLoc" select="string-length($InvestigationNode/RecoveryInfo/RecoveryLocDesc)"/>
		<xsl:variable name="VehRef" select="string-length(InvestigationInfo/RecoveryInfo/com.iso_RecoveryVehNumber)"/>
		<xsl:variable name="RecTxt" select="string-length($InvestigationNode/RecoveryInfo/CannedRecoveryCd)"/>
		<xsl:variable name="RecLoc1" select="string-length($ClaimRoot/RecoveryInfo/RecoveryLocDesc)"/>
		<xsl:variable name="VehRef1" select="string-length($ClaimRoot/RecoveryInfo/com.iso_RecoveryVehNumber)"/>
		<xsl:variable name="RecTxt1" select="string-length($ClaimRoot/RecoveryInfo/CannedRecoveryCd)"/>
		<!--<xsl:if test="string-length(normalize-space($InvestigationNode/RecoveryInfo/RecoveryLocDesc)) &gt; 0">-->
		<xsl:if test="($RecLoc > 0) or ($VehRef > 0) or ($RecTxt > 0) or ($RecLoc1 > 0) or ($VehRef1 > 0) or ($RecTxt1 > 0) ">
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Vehicle Additional Recovery Information</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovering Location</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/RecoveryInfo[@ItemRef = $InvId]/RecoveryLocDesc |$InvestigationNode/RecoveryInfo/RecoveryLocDesc"/>
				</xsl:with-param>
			</xsl:call-template>
			<!--
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovery Location Telephone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/InvestigationInfo/RecoveryInfo/Communications/PhoneInfo/PhoneNumber "/>
				</xsl:with-param>
			</xsl:call-template>
			-->
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Vehicle Ref. Number</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/RecoveryInfo[@ItemRef = $InvId]/com.iso_RecoveryVehNumber"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovery Text</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/RecoveryInfo[@ItemRef = $InvId]/CannedRecoveryCd"/>
				</xsl:with-param>
			</xsl:call-template>
			<!--
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Misc. Text</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/RemarkText[@ItemRef = $VehLossNode/@id]"/>
				</xsl:with-param>
			</xsl:call-template>
			-->
			<xsl:call-template name="Insert_MV14_Data">
				<xsl:with-param name="Data_Name">Misc. Text: </xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/RemarkText[@ItemRef = $VehLossNode/@id]"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Vehicle_Salvage Template
*
*			Displays initiating vehicle salvage records.
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Vehicle_Salvage">
		<xsl:param name="VehLossNode"/>
		<xsl:param name="BuyerNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:param name="CMS_veh_cov"/>
		<xsl:variable name="MV08Id1" select="$InvestigationNode/SalvageInfo/@id"/>
		<xsl:variable name="MV08Id" select="$InvestigationNode/SalvageInfo/@BuyerRef"/>
		<xsl:if test="(string-length(normalize-space($MV08Id)) or string-length(normalize-space($MV08Id1))) &gt; 0">
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Vehicle Salvage Information</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="ChkVIN" select="$InvestigationNode/ValidVINInd"/>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">VIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$VehLossNode/VehInfo/VehIdentificationNumber"/>
					<xsl:if test="$ChkVIN =0"> (Fail)</xsl:if>
					<xsl:if test="$ChkVIN =1"> (Pass)</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
			<!--<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">VIN Validation</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$InvestigationNode/ValidVINInd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
			<!--
			<xsl:variable name="ChkVIN" select="$InvestigationNode/ValidVINInd"/>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">VIN Validation</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:if test="$ChkVIN =0">NO</xsl:if>
					<xsl:if test="$ChkVIN =1">YES</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
			-->
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">VIN Missing Indicator</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/VINMissingInd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Engine Missing Indicator</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/EngineMissingInd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Transmission Missing Indicator</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/TransmissionMissingInd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="MV08SalDt" select="$InvestigationNode/SalvageInfo/SalvageDt"/>
			<xsl:if test="count($MV08SalDt) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Date of Salvage</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<!--<xsl:value-of select="$InvestigationNode/SalvageInfo/SalvageDt"/>-->
						<xsl:number value="substring($MV08SalDt,6,2)" format="01/"/>
						<xsl:number value="substring($MV08SalDt,9,2)" format="01/"/>
						<xsl:number value="substring($MV08SalDt,1,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Actual Cash Value Prior to Loss</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/SalvageInfo/ItemValuePriorToLossAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Value Received</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/SalvageInfo/ItemValueReceivedAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Appraised Value</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/SalvageInfo/ItemAppraisedValueAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="OwnerRetainSal" select="$InvestigationNode/SalvageInfo/OwnerRetainingSalvageInd"/>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Owner Retaining Salvage?</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:if test="$OwnerRetainSal=0">NO</xsl:if>
					<xsl:if test="$OwnerRetainSal=1">YES</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
			<!--
			<xsl:if test="string-length(normalize-space($BuyerNode)) &gt; 0">
				<xsl:call-template name="Insert_SmallHeader">
					<xsl:with-param name="Data_Name">Buyer Information</xsl:with-param>
				</xsl:call-template>
			</xsl:if>-->
			<xsl:choose>
				<xsl:when test="string-length(normalize-space($BuyerNode/GeneralPartyInfo/NameInfo/PersonName)) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Name</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="$BuyerNode/GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
							<xsl:if test="string-length($BuyerNode/GeneralPartyInfo/NameInfo/PersonName/OtherGivenName) != 0 ">
							&#160;<xsl:value-of select="$BuyerNode/GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
							</xsl:if>
							<xsl:if test="string-length($BuyerNode/GeneralPartyInfo/NameInfo/PersonName/Surname) != 0 ">
							&#160;<xsl:value-of select="$BuyerNode/GeneralPartyInfo/NameInfo/PersonName/Surname"/>
							</xsl:if>
						</xsl:with-param>
					</xsl:call-template>
					<!--
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Last Name</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="$BuyerNode/GeneralPartyInfo/NameInfo/PersonName/Surname"/>
						</xsl:with-param>
					</xsl:call-template>
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">First Name</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="$BuyerNode/GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
						</xsl:with-param>
					</xsl:call-template>
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Middle Name</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="$BuyerNode/GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
						</xsl:with-param>
					</xsl:call-template>
					-->
				</xsl:when>
				<xsl:otherwise>
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Business Name</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="$BuyerNode/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:otherwise>
			</xsl:choose>
			<xsl:if test="string-length(normalize-space($BuyerNode)) &gt; 0">
				<xsl:variable name="SplitZip" select="$BuyerNode/GeneralPartyInfo/Addr/PostalCode"/>
				<xsl:call-template name="Insert_Addr">
					<xsl:with-param name="Title">Buyers Address</xsl:with-param>
					<xsl:with-param name="Addr1">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/Addr1"/>
					</xsl:with-param>
					<xsl:with-param name="Addr2">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/Addr2"/>
					</xsl:with-param>
					<xsl:with-param name="City">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/City"/>
					</xsl:with-param>
					<xsl:with-param name="State">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/StateProvCd"/>
					</xsl:with-param>
					<xsl:with-param name="ZipCode">
						<!--<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/PostalCode"/>-->
						<xsl:value-of select="substring($SplitZip, 1, 5)"/>
						<xsl:if test="string-length($SplitZip) &gt; 5">-</xsl:if>
						<xsl:value-of select="substring($SplitZip, 6, 9)"/>
					</xsl:with-param>
					<xsl:with-param name="Country">
						<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Addr/CountryCd"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:variable name="BusinessNum" select="$BuyerNode/GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 	'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>
				<xsl:if test="count($BusinessNum) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Business Phone</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<!--<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 	'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>-->
							<xsl:number value="substring($BusinessNum,4,3)" format="(001"/>
							<xsl:number value="substring($BusinessNum,8,3)" format=") 001-"/>
							<xsl:number value="substring($BusinessNum,11,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
			</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Alleged Injury / Property Damage</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/InjuryNatureDesc"/>
				</xsl:with-param>
			</xsl:call-template>
			<!-- ICD9 code-->
			<xsl:variable name="ICD9Cd" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/ICDDiagnosticCd"/>
			<xsl:if test="count($ICD9Cd) &gt; 0">
				<tr>
					<td align="left" nowrap="nowrap">
					&#160;&#160;
						
							<font size="2" face="Arial">
							<b>
								<xsl:value-of select="'ICD9'"/>:</b>
						</font>
					</td>
					<td align="left" nowrap="nowrap">
						<font size="2" face="Arial">
							<xsl:for-each select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef= $MV08Id1]/ICDDiagnosticCd">
								<xsl:value-of select="."/>
								<br/>
							</xsl:for-each>
						</font>
					</td>
				</tr>
			</xsl:if>
			<!--end ICD9 code-->
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Cause Of Injury</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/com.iso_CauseofInjuryCd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="ProdLiab" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$MV08Id1]/com.iso_ProdLiabInd"/>
			<xsl:call-template name="Insert_Data_Using_Code_List">
				<xsl:with-param name="Data_Name">Product Liability</xsl:with-param>
				<xsl:with-param name="Data_Code">
					<xsl:value-of select="$ProdLiab"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Code_Value">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ProdLiabCds/*[@code=$ProdLiab]"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Product Manufacturer</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$MV08Id1]/com.iso_ProdMfr"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Product Generic Name</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$MV08Id1]/com.iso_GenName"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Product Brand Name</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=	$MV08Id1]/com.iso_BrandName"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Product Alleged Harm</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo2[@itemRef=$MV08Id1]/com.iso_allegedHarm"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $MV08Id]"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--display CMS information-->
		<xsl:variable name="CMSIncDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/com.iso_CMSIncidentDt"/>
		<xsl:variable name="CMSVenueSt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/Addr/StateProvCd"/>
		<xsl:variable name="CMSNFLT" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/com.iso_NoFLTLimit"/>
		<xsl:variable name="CMSExDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/com.iso_ExhaustDt"/>
		<xsl:variable name="CMSORMInd" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/com.iso_ORMInd"/>
		<xsl:variable name="CMSORMDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/com.iso_ORMDt"/>
		<xsl:variable name="CMSTPOCDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/com.iso_TPOCDt"/>
		<xsl:variable name="CMSTPOCAmt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/com.iso_TPOCAmt"/>
		<xsl:variable name="CMSTPOCStartDt" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/com.iso_TPOCStartDt"/>
		<xsl:if test="string-length(normalize-space($CMSIncDt)) &gt; 0 or string-length(normalize-space($CMSVenueSt)) &gt; 0 or string-length(normalize-space($CMSNFLT)) &gt; 0 or string-length(normalize-space($CMSExDt)) &gt; 0 or string-length(normalize-space($CMSORMInd)) &gt; 0 or string-length(normalize-space($CMSORMDt)) &gt; 0 or string-length(normalize-space($CMSTPOCDt)) &gt; 0 or string-length(normalize-space($CMSTPOCAmt)) &gt; 0 or string-length(normalize-space($CMSTPOCStartDt)) &gt; 0">
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">CMS Information</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="DeleteFromCMS" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/com.iso_DeleteFromCMS"/>
		<xsl:if test="$DeleteFromCMS= 'Y'">
			<tr>
				<td nowrap="nowrap">
					<b>
						<font face="Arial" size="2">&#160;&#160;* This Claimant Coverage from CMS is deleted.</font>
					</b>
				</td>
			</tr>
		</xsl:if>
		<xsl:variable name="NotSendCovCMS" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1[@itemRef=$MV08Id1]/com.iso_NotSendCovCMS"/>
		<xsl:if test="$NotSendCovCMS= 'Y'">
			<tr>
				<td nowrap="nowrap">
					<b>
						<font face="Arial" size="2">&#160;&#160;* This Claimant Coverage will not be sent to CMS.</font>
					</b>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="count($CMSIncDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Date Of Incident</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($CMSIncDt,6,2)" format="01/"/>
					<xsl:number value="substring($CMSIncDt,9,2)" format="01/"/>
					<xsl:number value="substring($CMSIncDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">State Of Venue</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$CMSVenueSt"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:if test="count($CMSNFLT) &gt;0 or count($CMSExDt) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
				<b>
						<font size="2" face="Arial">
					No Fault Insurance Limit:
					</font>
					</b>
				</td>
				<td align="left">
					<xsl:variable name="NoFlt" select="$CMSNFLT div 100"/>
					<xsl:choose>
						<xsl:when test="$CMSNFLT mod 100 = 0">
							<font size="2" face="Arial">
								<xsl:value-of select='format-number($NoFlt, "$###,###,###.00")'/>
							</font>
						</xsl:when>
						<xsl:otherwise>
							<font size="2" face="Arial">
								<xsl:value-of select='format-number($NoFlt, "$###,###,###.00")'/>
							</font>
						</xsl:otherwise>
					</xsl:choose>
					<xsl:if test="count($CMSExDt) &gt;0">
						<b>
							<font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						Exhaust Date:
						</font>
						</b>
						<font size="2" face="Arial">
							<xsl:number value="substring($CMSExDt,6,2)" format="01/"/>
							<xsl:number value="substring($CMSExDt,9,2)" format="01/"/>
							<xsl:number value="substring($CMSExDt,1,4)" format="0001"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="count($CMSORMInd) &gt;0 or count($CMSORMDt) &gt;0">
			<tr>
				<tr>
					<td align="left" nowrap="nowrap">&#160;&#160;
				<b>
							<font size="2" face="Arial">
					On-Going Responsibility
					 </font>
						</b>
					</td>
				</tr>
				<tr>
					<td align="left" nowrap="nowrap">&#160;&#160;
				<b>
							<font size="2" face="Arial">
					 for Medicals(ORM):
					</font>
						</b>
					</td>
					<td align="left" nowrap="nowrap">
						<font size="2" face="Arial">
							<xsl:if test="$CMSORMInd='N'">NO</xsl:if>
							<xsl:if test="$CMSORMInd='Y'">YES</xsl:if>
						</font>
						<xsl:if test="count($CMSORMDt) &gt;0">
							<b>
								<font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;
						ORM Termination Date:
						</font>
							</b>
							<font size="2" face="Arial">
								<xsl:number value="substring($CMSORMDt,6,2)" format="01/"/>
								<xsl:number value="substring($CMSORMDt,9,2)" format="01/"/>
								<xsl:number value="substring($CMSORMDt,1,4)" format="0001"/>
							</font>
						</xsl:if>
					</td>
				</tr>
			</tr>
		</xsl:if>
		<!-- StartTPOC will display 5 times(MAX)-->
		<xsl:if test="count($CMSTPOCDt) &gt;0 or count($CMSTPOCAmt) &gt;0 or count($CMSTPOCStartDt) &gt;0">
			<xsl:variable name="CMSTPOC" select="$CMS_veh_cov[@itemRef = $MV08Id1]"/>
			<xsl:for-each select="$CMSTPOC/com.iso_TPOCDt">
				<xsl:variable name="TPOCid" select="@id"/>
				<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid])) &gt;0">
					<tr>
						<td align="left">
							<b>
								<font size="2" face="Arial">
									<xsl:value-of select="$TPOCid"/>.&#160;Total Payment Obligation
								</font>
							</b>
						</td>
					</tr>
				</xsl:if>
				<tr>
					<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid])) &gt;0">
						<td align="left">&#160;&#160;&#160;
								<b>
								<font size="2" face="Arial">
									 to the Claimant(TPOC) Date:
									</font>
							</b>
						</td>
						<td align="left">
							<font size="2" face="Arial">
								<!--<xsl:value-of select="$CMSTPOC/com.iso_TPOCDt[@id=$TPOCid]"/>-->
								<xsl:number value="substring($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid],6,2)" format="01/"/>
								<xsl:number value="substring($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid],9,2)" format="01/"/>
								<xsl:number value="substring($CMSTPOC/com.iso_TPOCDt[@id=$TPOCid],1,4)" format="0001"/>
							</font>
						</td>
					</xsl:if>
					<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCAmt[@id=$TPOCid])) &gt;0">
						<td nowrap="nowrap">
							<b>
								<font size="2" face="Arial">
									TPOC Amount:
									</font>
							</b>
							<xsl:variable name="TPOCAmt" select="$CMSTPOC/com.iso_TPOCAmt[@id=$TPOCid] div 100"/>
							<xsl:choose>
								<xsl:when test="$TPOCAmt mod 100 = 0">
									<font size="2" face="Arial">
										<xsl:value-of select='format-number($TPOCAmt, "$###,###,###.##")'/>.00
									</font>
								</xsl:when>
								<xsl:otherwise>
									<font size="2" face="Arial">
										<xsl:value-of select='format-number($TPOCAmt, "$###,###,###.##")'/>
									</font>
								</xsl:otherwise>
							</xsl:choose>
						</td>
					</xsl:if>
					<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid])) &gt;0">
						<tr>
							<td align="left">&#160;&#160;&#160;
								<b>
									<font size="2" face="Arial">
											Funding Delayed Beyond
										</font>
								</b>
							</td>
						</tr>
					</xsl:if>
					<xsl:if test="string-length(normalize-space($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid])) &gt;0">
						<tr>
							<td align="left">&#160;&#160;&#160;
									<b>
									<font size="2" face="Arial">
									TPOC Start Date:
										</font>
								</b>
							</td>
							<td align="left">
								<font size="2" face="Arial">
									<!--<xsl:value-of select="$CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid]"/>-->
									<xsl:number value="substring($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid],6,2)" format="01/"/>
									<xsl:number value="substring($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid],9,2)" format="01/"/>
									<xsl:number value="substring($CMSTPOC/com.iso_TPOCStartDt[@id=$TPOCid],1,4)" format="0001"/>
								</font>
							</td>
						</tr>
					</xsl:if>
				</tr>
			</xsl:for-each>
		</xsl:if>
		<!-- End TPOC will display 5 times(MAX)-->
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Append_DS Template
*
*			Displays Decision Net Information MPR1.
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Append_DS">
		<xsl:variable name="ClaimRoot" select=".."/>
		<xsl:variable name="AppendsRef" select="com.iso_AppendDS/@idref"/>
		<tr>
			<td colspan="5">
				<hr noshade="noshade" size="1"/>
			</td>
		</tr>
		<xsl:if test="string-length(normalize-space(ClaimsParty/com.iso_AppendDS/@idref)) &gt; 0">
			<xsl:for-each select="ClaimsParty/com.iso_AppendDS">
				<xsl:call-template name="Insert_Header">
					<xsl:with-param name="Data_Name">Decision Net Information</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="Insert_MV14_Data">
					<xsl:with-param name="Data_Value">
						<xsl:if test="ADSResponseCd='NM'">No Matches</xsl:if>
						<xsl:if test="ADSResponseCd='ER'">
							<b>Error Occured</b>
						</xsl:if>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:if test="count(GeneralPartyInfo/NameInfo/PersonName/Surname) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Name</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>&#160;
	<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
				<xsl:if test="count(PersonInfo/BirthDt) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Date of Birth</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:number value="substring(PersonInfo/BirthDt,6,2)" format="01/"/>
							<xsl:number value="substring(PersonInfo/BirthDt,9,2)" format="01/"/>
							<xsl:number value="substring(PersonInfo/BirthDt,1,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
				<xsl:if test="count(PersonInfo/com.iso_Age) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Age</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="PersonInfo/com.iso_Age"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
				<xsl:if test="count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">SSN</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:number value="substring(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId,1,3)" format="001-"/>
							<xsl:number value="substring(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId,4,2)" format="01-"/>
							<xsl:number value="substring(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId,6,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
				<xsl:if test="count(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">TIN</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:number value="substring(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId,1,3)" format="001-"/>
							<xsl:number value="substring(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId,4,2)" format="01-"/>
							<xsl:number value="substring(GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId,6,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
				<xsl:call-template name="Insert_Addr">
					<xsl:with-param name="Title">Address</xsl:with-param>
					<xsl:with-param name="Addr1">
						<xsl:value-of select="GeneralPartyInfo/Addr/Addr1"/>
					</xsl:with-param>
					<xsl:with-param name="Addr2">
						<xsl:value-of select="GeneralPartyInfo/Addr/Addr2"/>
					</xsl:with-param>
					<xsl:with-param name="City">
						<xsl:value-of select="GeneralPartyInfo/Addr/City"/>
					</xsl:with-param>
					<xsl:with-param name="State">
						<xsl:value-of select="GeneralPartyInfo/Addr/StateProvCd"/>
					</xsl:with-param>
					<xsl:with-param name="ZipCode">
						<!--<xsl:value-of select="GeneralPartyInfo/Addr/PostalCode"/>-->
						<xsl:value-of select="substring(GeneralPartyInfo/Addr/PostalCode, 1, 5)"/>
						<xsl:if test="string-length(GeneralPartyInfo/Addr/PostalCode) &gt; 5">-</xsl:if>
						<xsl:value-of select="substring(GeneralPartyInfo/Addr/PostalCode, 6, 9)"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:if test="count(GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Home Phone</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:number value="substring(GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber,4,3)" format="(001"/>
							<xsl:number value="substring(GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber,8,3)" format=") 001-"/>
							<xsl:number value="substring(GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber,11,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
				<xsl:if test="count(GeneralPartyInfo/Communications/PhoneInfo/com.iso_PhoneName) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Phone Name</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo/com.iso_PhoneName"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
				<xsl:if test="count(GeneralPartyInfo/Addr/com.iso_FirstDt) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Date First</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:number value="substring(GeneralPartyInfo/Addr/com.iso_FirstDt,1,2)" format="01/"/>
							<xsl:number value="substring(GeneralPartyInfo/Addr/com.iso_FirstDt,3,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
				<xsl:if test="count(GeneralPartyInfo/Addr/com.iso_LastDt) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Date Last</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:number value="substring(GeneralPartyInfo/Addr/com.iso_LastDt,1,2)" format="01/"/>
							<xsl:number value="substring(GeneralPartyInfo/Addr/com.iso_LastDt,3,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
			</xsl:for-each>
		</xsl:if>
	</xsl:template>
	<!--
	*********************************************************************************
	*	 
	*	      Display_ClaimsDirector_Claim_Handling Template
	*
	*			Displays initiating Claim Director Claim Handling Characteristics.
	*	 
	*********************************************************************************
	-->
	<xsl:template name="Display_ClaimsDirector_Claim_Handling">
		<xsl:param name="ClaimRoot"/>
		<br/>
		<TABLE border="0" cellpadding="0" cellspacing="0" width="690">
			<TR>
				<TD width="1%" bgColor="#C5D7DE"/>
				<TD width="1%" bgColor="#C5D7DE"/>
				<TD bgColor="#C5D7DE">
					<FONT size="3" face="Arial">
						<B>Claim Characteristics</B>
					</FONT>
				</TD>
			</TR>
			<TR>
				<TD bgColor="#C5D7DE"/>
				<TD/>
				<TD>
					<TABLE width="100%" border="0" cellspacing="5">
						<TR>
							<TD>
								<TABLE border="0" bgColor="#BBF2E3" cellpadding="0" cellspacing="2" width="100%">
									<TR valign="bottom">
										<TD width="5%" align="center" valign="bottom">
											<B>
												<font size="2" face="Arial">ID</font>
											</B>
										</TD>
										<TD align="left" valign="bottom" width="95%">
											<B>
												<font size="2" face="Arial">Description</font>
											</B>
										</TD>
									</TR>
									<TR valign="top" height="1">
										<TD align="center">
											<!--<img src="images/cd_line.gif" width="40" height="1"/>-->
										</TD>
										<TD>
											<!--<img src="/images/cd_line.gif" width="585" height="1"/>-->
										</TD>
									</TR>
									<tr valign="top" height="1">
										<TD align="center">
											<hr width="20" size="2"/>
										</TD>
										<TD>
											<hr width="612" size="2"/>
										</TD>
									</tr>
									<xsl:for-each select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsHandlingCharacteristics">
										<tr>
											<TD width="8%" align="center" valign="top">
												<font size="2" face="Arial">
													<xsl:value-of select="sum(com.iso_CharacteristicCd)"/>
												</font>
											</TD>
											<TD width="92%">
												<font size="2" face="Arial">
													<xsl:value-of select="com.iso_CharacteristicText"/>
												</font>
											</TD>
										</tr>
									</xsl:for-each>
									<TR>
									</TR>
									<TR>
										<TD colspan="2">&#160;</TD>
									</TR>
								</TABLE>
							</TD>
						</TR>
					</TABLE>
				</TD>
			</TR>
			<TR>
				<TD bgColor="#C5D7DE">&#160;</TD>
				<TD bgColor="#C5D7DE"/>
				<TD/>
			</TR>
		</TABLE>
	</xsl:template>
	<!--
	*********************************************************************************
	*	 
	*	      Display_ClaimsDirector_Claim_Rules
	*
	*			Displays initiating Claim Director Rules.
	*	 
	*********************************************************************************
	-->
	<xsl:template name="Display_ClaimsDirector_Claim_Rules">
		<xsl:param name="ClaimRoot"/>
		<xsl:variable name="MA01Id_title" select="ClaimsOccurrence/@id"/>
		<!--<xsl:if test="string-length($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id_title]) &gt; 0">-->
		<table border="0" cellpadding="0" cellspacing="0" width="100%">
			<td align="left" colspan="0" width="680">
				<td>&#160;</td>
				<TABLE border="0" cellpadding="0" cellspacing="0" width="100%">
					<TR>
						<TD width="1%" bgColor="#C5D7DE"/>
						<TD width="1%" bgColor="#C5D7DE"/>
						<!--<TD bgColor="#C5D7DE" align="left" width="100%">-->
						<TD bgColor="#C5D7DE">
							<TABLE border="0" cellpadding="0" cellspacing="0" width="100%">
								<TR height="26">
									<TD>
										<a name="top"/>
										<font size="3" face="Arial">
											<B>Score Details</B>
										</font>
									</TD>
									<TD>&#160;</TD>
								</TR>
							</TABLE>
						</TD>
					</TR>
					<TR>
						<TD bgColor="#C5D7DE"/>
						<TD/>
						<td>
							<table border="0" width="100%" cellpadding="0" cellspacing="0">
								<xsl:variable name="MA01Id" select="ClaimsOccurrence/@id"/>
								<tr>
									<td nowrap="nowrap">
										<font size="3" face="Arial">
											<B>Claim Rules:
												<!--<xsl:value-of select="sum($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]/com.iso_RuleWeight)"/>-->
												<xsl:variable name="ClaimRuleScore" select="sum($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]/com.iso_RuleWeight)"/>
												<xsl:choose>
													<xsl:when test="$ClaimRuleScore > 999">
														<xsl:value-of select="999"/>
													</xsl:when>
													<xsl:otherwise>
														<xsl:value-of select="$ClaimRuleScore"/>
													</xsl:otherwise>
												</xsl:choose>
											</B>
										</font>
									</td>
								</tr>
								<!--start-->
								<xsl:choose>
									<xsl:when test="sum($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]/com.iso_RuleWeight)  &gt; 0">
										<tr>
											<td>
												<table width="100%" cellpadding="0" cellspacing="0">
													<tr>
														<td>
															<table bgcolor="#E9D1D8" border="0" width="670">
																<tr valign="bottom">
																	<TD colspan="3" valign="bottom">
																		<B>
																			<font size="3" face="Arial">Rules</font>
																		</B>
																	</TD>
																</tr>
																<xsl:variable name="ClaimSingleRule" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]/com.iso_RuleTypeCd"/>
																<xsl:if test="$ClaimSingleRule = 'S'">
																	<TR valign="bottom">
																		<TD width="7%" align="center" valign="bottom">
																			<B>
																				<font size="2" face="Arial">ID</font>
																			</B>
																		</TD>
																		<TD align="left" valign="bottom" width="89%">
																			<B>
																				<font size="2" face="Arial">Description</font>
																			</B>
																		</TD>
																		<TD align="center" valign="bottom" width="5%">
																			<B>
																				<font size="2" face="Arial">Weight</font>
																			</B>
																		</TD>
																	</TR>
																	<tr valign="top" height="1">
																		<TD align="center">
																			<hr width="20" size="2"/>
																		</TD>
																		<TD>
																			<hr width="540" size="2"/>
																		</TD>
																		<TD align="center">
																			<hr width="40" size="2"/>
																		</TD>
																	</tr>
																</xsl:if>
																<xsl:for-each select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]">
																	<xsl:variable name="ClaimSingleRuleCd" select="com.iso_RuleTypeCd"/>
																	<xsl:if test="$ClaimSingleRuleCd = 'S'">
																		<tr valign="top">
																			<TD align="center">
																				<font size="2" face="Arial">
																					<xsl:value-of select="sum(com.iso_RuleCd)"/>
																				</font>
																			</TD>
																			<TD align="left">
																				<font size="2" face="Arial">
																					<xsl:value-of select="com.iso_RuleDesc"/>
																				</font>
																			</TD>
																			<TD align="center">
																				<B>
																					<font size="2" face="Arial">
																						<!--+<xsl:value-of select="sum(com.iso_RuleWeight)"/>-->
																						<xsl:variable name="RuleWeight" select="sum(com.iso_RuleWeight)"/>
																						<xsl:if test="$RuleWeight != '0'">
																							+<xsl:value-of select="$RuleWeight"/>
																						</xsl:if>
																						<xsl:if test="$RuleWeight = '0'">
																							<xsl:value-of select="$RuleWeight"/>
																						</xsl:if>
																					</font>
																				</B>
																			</TD>
																		</tr>
																	</xsl:if>
																</xsl:for-each>
																<xsl:variable name="ClaimComboRule" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]/com.iso_RuleTypeCd"/>
																<xsl:if test="$ClaimComboRule = 'C'">
																	<tr>
																		<td>
																			<br/>
																		</td>
																	</tr>
																	<tr>
																		<TD colspan="3" valign="bottom">
																			<B>
																				<font size="3" face="Arial">Claim Combo Rules</font>
																			</B>
																		</TD>
																	</tr>
																	<TR valign="bottom">
																		<TD width="7%" align="center" valign="bottom">
																			<B>
																				<font size="2" face="Arial">ID</font>
																			</B>
																		</TD>
																		<TD align="left" valign="bottom" width="89%">
																			<B>
																				<font size="2" face="Arial">Description</font>
																			</B>
																		</TD>
																		<TD align="center" valign="bottom" width="5%">
																			<B>
																				<font size="2" face="Arial">Weight</font>
																			</B>
																		</TD>
																	</TR>
																	<tr valign="top" height="1">
																		<TD align="center">
																			<hr width="20" size="2"/>
																		</TD>
																		<TD>
																			<hr width="540" size="2"/>
																		</TD>
																		<TD align="center">
																			<hr width="40" size="2"/>
																		</TD>
																	</tr>
																</xsl:if>
																<xsl:for-each select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]">
																	<xsl:variable name="ClaimComboRuleCd" select="com.iso_RuleTypeCd"/>
																	<xsl:if test="$ClaimComboRuleCd = 'C'">
																		<tr valign="top">
																			<TD align="center">
																				<font size="2" face="Arial">
																					<xsl:value-of select="sum(com.iso_RuleCd)"/>
																				</font>
																			</TD>
																			<TD align="left">
																				<font size="2" face="Arial">
																					<xsl:value-of select="com.iso_RuleDesc"/>
																				</font>
																			</TD>
																			<TD align="center">
																				<B>
																					<font size="2" face="Arial">
																						<!--+<xsl:value-of select="sum(com.iso_RuleWeight)"/>-->
																						<xsl:variable name="RuleWeight" select="sum(com.iso_RuleWeight)"/>
																						<xsl:if test="$RuleWeight != '0'">
																							+<xsl:value-of select="$RuleWeight"/>
																						</xsl:if>
																						<xsl:if test="$RuleWeight = '0'">
																							<xsl:value-of select="$RuleWeight"/>
																						</xsl:if>
																					</font>
																				</B>
																			</TD>
																		</tr>
																	</xsl:if>
																</xsl:for-each>
															</table>
														</td>
													</tr>
												</table>
											</td>
										</tr>
									</xsl:when>
									<xsl:otherwise>
										<tr>
											<td>
												<table width="100%" cellpadding="0" cellspacing="0">
													<tr>
														<td>
															<table bgcolor="#E9D1D8" border="0" width="670">
																<tr valign="bottom">
																	<TD colspan="3" valign="bottom">
																		<font size="3" face="Arial">No claim rules apply to this claim.</font>
																	</TD>
																</tr>
															</table>
														</td>
													</tr>
												</table>
											</td>
										</tr>
									</xsl:otherwise>
								</xsl:choose>
								<!--end-->
								<xsl:variable name="MO01Id_title" select="ClaimsParty/@id"/>
								<xsl:variable name="MK01Id_title" select="ClaimsPartyRelationship/@ClaimsParty1Ref"/>
								<!--<xsl:if test="string-length($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MO01Id_title ][not(@idref = $MK01Id_title)]) &gt; 0">-->
								<xsl:variable name="ChkIPRules" select="string-length($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MO01Id_title ]) "/>
								<xsl:variable name="ChkIPScore" select="string-length($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref = $MO01Id_title ]) "/>
								<!--<xsl:if test="string-length($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MO01Id_title ]) &gt; 0">-->
								<xsl:if test="($ChkIPRules > 0) or ($ChkIPScore > 0 )">
									<xsl:for-each select="ClaimsParty">
										<xsl:variable name="pos" select="position()"/>
										<table border="0" cellpadding="0" cellspacing="0" width="100%">
											<!--<xsl:if test="$pos = 3">
												<TD >&#160;</TD>
											</xsl:if>	-->
											<xsl:if test="$pos = 4">
											</xsl:if>
											<td align="left" colspan="0" width="270">
												<!--<td>&#160;</td>-->
												<!--commented on 07/13/2006<xsl:for-each select="ClaimsParty">-->
												<xsl:variable name="MO01Id" select="@id"/>
												<xsl:variable name="MK01Id" select="ClaimsPartyRelationship/@ClaimsParty1Ref"/>
												<xsl:variable name="MT01Id" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport/@idref"/>
												<xsl:variable name="MX01Id" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules/@idref"/>
												<xsl:if test="($MO01Id = $MX01Id) or($MO01Id = $MT01Id)">
													<!--<TABLE border="0" cellpadding="0" cellspacing="0" width="670" bgcolor="#EAE6DF" >-->
													<TABLE border="0" cellpadding="0" cellspacing="0" width="670" align="right">
														<tr>
															<td>
																<br/>
															</td>
														</tr>
														<TR>
															<TD align="left">
																<font size="3" face="Arial">
																	<b>
																		<xsl:variable name="PartyName" select="GeneralPartyInfo/NameInfo/PersonName"/>
																		<xsl:choose>
																			<xsl:when test="count($PartyName) > 0">
																				<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
																				<xsl:if test="count(GeneralPartyInfo/NameInfo/PersonName/OtherGivenName) > 0 ">
																				&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
																				</xsl:if>
																				<xsl:if test="count(GeneralPartyInfo/NameInfo/PersonName/Surname) > 0 ">
																				&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/> :
																				</xsl:if>
																			</xsl:when>
																			<xsl:otherwise>
																				<xsl:value-of select="GeneralPartyInfo/NameInfo/CommlName/CommercialName"/> :
																			</xsl:otherwise>
																		</xsl:choose>
																	</b>
																	<xsl:for-each select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport">
																		<xsl:if test="@idref = $MO01Id">
																			<b>
																				<!--<xsl:value-of select="com.iso_RawScore"/>-->
																				<xsl:variable name="InScore" select="com.iso_RawScore"/>
																				<xsl:choose>
																					<xsl:when test="$InScore > 999">
																						<xsl:value-of select="999"/>
																					</xsl:when>
																					<xsl:otherwise>
																						<xsl:value-of select="sum($InScore)"/>
																					</xsl:otherwise>
																				</xsl:choose>
																			</b>
																		</xsl:if>
																	</xsl:for-each>
																</font>
															</TD>
														</TR>
														<TR>
															<TD align="left" bgcolor="#EAE6DF">
															&#160;
															<font size="3" face="Arial">
																Involved Party Rules :
															</font>
																<xsl:for-each select="$ClaimRoot/com.iso_ClaimsScoringInfo">
																	<!--<xsl:if test="@idref = $MO01Id">-->
																	<xsl:variable name="kish" select="com.iso_ClaimDirectorRules[@idref = $MO01Id]/com.iso_RuleWeight"/>
																	<xsl:value-of select="sum($kish)"/>
																	<!--<xsl:value-of select="com.iso_RuleWeight"/>-->
																	<!--</xsl:if>-->
																</xsl:for-each>
															</TD>
														</TR>
														<tr>
															<td>
																<table width="100%" cellpadding="0" cellspacing="0">
																	<tr>
																		<td>
																			<table bgcolor="#EAE6DF" border="0" width="670">
																				<!--<xsl:if test="$MO01Id = $MX01Id">-->
																				<xsl:for-each select="$ClaimRoot/com.iso_ClaimsScoringInfo">
																					<xsl:variable name="NoIPRules" select="com.iso_ClaimDirectorRules[@idref = $MO01Id]/com.iso_RuleWeight"/>
																					<xsl:choose>
																						<xsl:when test="sum(com.iso_ClaimDirectorRules[@idref = $MO01Id]/com.iso_RuleWeight) &gt; 0">
																							<xsl:variable name="InComboRuleCd1" select="com.iso_ClaimDirectorRules[@idref = $MO01Id]/com.iso_RuleTypeCd"/>
																							<xsl:if test="$InComboRuleCd1 = 'S'">
																								<!--<xsl:if test="$NoIPRules != '0'">-->
																								<tr valign="bottom">
																									<TD colspan="3" valign="bottom">
																										<B>
																											<font size="3" face="Arial">Rules</font>
																										</B>
																									</TD>
																								</tr>
																								<TR valign="bottom">
																									<TD width="7%" align="center" valign="bottom">
																										<B>
																											<font size="2" face="Arial">ID</font>
																										</B>
																									</TD>
																									<TD align="left" valign="bottom" width="89%">
																										<B>
																											<font size="2" face="Arial">Description</font>
																										</B>
																									</TD>
																									<TD align="center" valign="bottom" width="5%">
																										<B>
																											<font size="2" face="Arial">Weight</font>
																										</B>
																									</TD>
																								</TR>
																								<tr valign="top" height="1">
																									<TD align="center">
																										<hr width="20" size="2"/>
																									</TD>
																									<TD>
																										<hr width="540" size="2"/>
																									</TD>
																									<TD align="center">
																										<hr width="40" size="2"/>
																									</TD>
																								</tr>
																								<!--</xsl:if>-->
																							</xsl:if>
																						</xsl:when>
																						<xsl:otherwise>
																							<tr valign="bottom">
																								<TD colspan="3" valign="middle">
																									<li>
																										<font size="2" face="Arial">
																									No involved party rules apply
																								</font>
																									</li>
																								</TD>
																							</tr>
																						</xsl:otherwise>
																					</xsl:choose>
																				</xsl:for-each>
																				<xsl:for-each select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules">
																					<xsl:if test="@idref = $MO01Id">
																						<xsl:variable name="InComboRuleCd2" select="com.iso_RuleTypeCd"/>
																						<xsl:if test="$InComboRuleCd2 = 'S'">
																							<tr valign="top">
																								<TD align="center">
																									<font size="2" face="Arial">
																										<!--<b>
																										<xsl:value-of select="@idref"/>rules</b>
																									<br/>
																									<b>
																										<xsl:value-of select="$MO01Id"/>party</b>
																									<br/>-->
																										<xsl:value-of select="sum(com.iso_RuleCd)"/>
																									</font>
																								</TD>
																								<TD align="left">
																									<font size="2" face="Arial">
																										<xsl:value-of select="com.iso_RuleDesc"/>
																									</font>
																								</TD>
																								<TD align="center">
																									<B>
																										<font size="2" face="Arial">
																											<!--+<xsl:value-of select="com.iso_RuleWeight"/>-->
																											<xsl:variable name="InWeight" select="sum(com.iso_RuleWeight)"/>
																											<xsl:if test="$InWeight != '0'">
																													+<xsl:value-of select="$InWeight"/>
																											</xsl:if>
																											<xsl:if test="$InWeight = '0'">
																												<xsl:value-of select="$InWeight"/>
																											</xsl:if>
																										</font>
																									</B>
																								</TD>
																							</tr>
																						</xsl:if>
																					</xsl:if>
																				</xsl:for-each>
																				<!--</xsl:if>-->
																				<!--start In combo rule-->
																				<xsl:for-each select="$ClaimRoot/com.iso_ClaimsScoringInfo">
																					<xsl:choose>
																						<xsl:when test="sum(com.iso_ClaimDirectorRules[@idref = $MO01Id]/com.iso_RuleWeight) &gt; 0">
																							<xsl:variable name="InComboRuleCd3" select="com.iso_ClaimDirectorRules[@idref = $MO01Id]/com.iso_RuleTypeCd"/>
																							<xsl:if test="$InComboRuleCd3 = 'C'">
																								<tr>
																									<td>
																										<br/>
																									</td>
																								</tr>
																								<tr valign="bottom">
																									<TD colspan="3" valign="bottom">
																										<B>
																											<font size="3" face="Arial">Involved Party Combo Rules</font>
																										</B>
																									</TD>
																								</tr>
																								<TR valign="bottom">
																									<TD width="7%" align="center" valign="bottom">
																										<B>
																											<font size="2" face="Arial">ID</font>
																										</B>
																									</TD>
																									<TD align="left" valign="bottom" width="89%">
																										<B>
																											<font size="2" face="Arial">Description</font>
																										</B>
																									</TD>
																									<TD align="center" valign="bottom" width="5%">
																										<B>
																											<font size="2" face="Arial">Weight</font>
																										</B>
																									</TD>
																								</TR>
																								<tr valign="top" height="1">
																									<TD align="center">
																										<hr width="20" size="2"/>
																									</TD>
																									<TD>
																										<hr width="540" size="2"/>
																									</TD>
																									<TD align="center">
																										<hr width="40" size="2"/>
																									</TD>
																								</tr>
																							</xsl:if>
																						</xsl:when>
																						<xsl:otherwise>
																								</xsl:otherwise>
																					</xsl:choose>
																				</xsl:for-each>
																				<xsl:for-each select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules">
																					<xsl:if test="@idref = $MO01Id">
																						<xsl:variable name="InComboRuleCd4" select="com.iso_RuleTypeCd"/>
																						<xsl:if test="$InComboRuleCd4 = 'C'">
																							<tr valign="top">
																								<TD align="center">
																									<font size="2" face="Arial">
																										<xsl:value-of select="sum(com.iso_RuleCd)"/>
																									</font>
																								</TD>
																								<TD align="left">
																									<font size="2" face="Arial">
																										<xsl:value-of select="com.iso_RuleDesc"/>
																									</font>
																								</TD>
																								<TD align="center">
																									<B>
																										<font size="2" face="Arial">
																											<xsl:variable name="InWeight" select="sum(com.iso_RuleWeight)"/>
																											<xsl:if test="$InWeight != '0'">
																														+<xsl:value-of select="$InWeight"/>
																											</xsl:if>
																											<xsl:if test="$InWeight = '0'">
																												<xsl:value-of select="$InWeight"/>
																											</xsl:if>
																										</font>
																									</B>
																								</TD>
																							</tr>
																						</xsl:if>
																					</xsl:if>
																				</xsl:for-each>
																				<!--end IN Combo Rules-->
																				<!--start MCD3 05/25/2006 -->
																				<tr>
																					<td width="270">
																						<tr>
																							<td height="20"/>
																						</tr>
																						<tr>
																							<td colspan="2" align="left">&#160;
																									<font size="3" face="Arial">
																										Matching Claims Score:
																										
																										<xsl:for-each select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref = $MO01Id]">
																										<!--<xsl:for-each select="com.iso_ScoredMatch">-->
																										<!--<xsl:value-of select="com.iso_MatchScore"/>-->
																										<xsl:variable name="trans" select="com.iso_ScoredMatch/com.iso_MatchScore"/>
																										<!--<xsl:value-of select="sum($trans)" />-->
																										<xsl:choose>
																											<xsl:when test="sum($trans) > 999">
																												<xsl:value-of select="999"/>
																											</xsl:when>
																											<xsl:otherwise>
																												<xsl:value-of select="sum($trans)"/>
																											</xsl:otherwise>
																										</xsl:choose>
																										<!--</xsl:for-each>-->
																									</xsl:for-each>
																								</font>
																							</td>
																						</tr>
																						<table cellpadding="0" cellspacing="0" bgcolor="#EAE6DF" width="670">
																							<xsl:choose>
																								<xsl:when test="sum($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/NumMatches) &gt; 0">
																									<tr>
																										<td colspan="2" align="left">
																											<li>
																												<font size="2" face="Arial">
																										Elements Searched:
																										<xsl:variable name="cnt" select="count($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd)"/>
																													<xsl:value-of select="$cnt"/>
																													<xsl:variable name="SRCH_NAME_ADDRESS">
																														<xsl:variable name="srch_name" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'NameAddress']"/>
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'NameAddress']"/>-->
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_name]"/>
																													</xsl:variable>
																													<xsl:variable name="SRCH_TAX">
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'TaxIdentity']"/>-->
																														<xsl:variable name="srch_tax" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'TaxIdentity']"/>
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_tax]"/>
																													</xsl:variable>
																													<xsl:variable name="SRCH_VIN">
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'VIN']"/>-->
																														<xsl:variable name="srch_vin" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'VIN']"/>
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_vin]"/>
																													</xsl:variable>
																													<xsl:variable name="SRCH_DRIVERS_LIC">
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'DriversLicense']"/>-->
																														<xsl:variable name="srch_dr_lic" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'DriversLicense']"/>
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_dr_lic]"/>
																													</xsl:variable>
																													<xsl:variable name="SRCH_LIC_PLATE">
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'LicensePlate']"/>-->
																														<xsl:variable name="srch_lic_pl" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'LicensePlate']"/>
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'NameAddress']"/>-->
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_lic_pl]"/>
																													</xsl:variable>
																													<xsl:variable name="SRCH_PH_NUMBER">
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'PhoneNumber']"/>-->
																														<xsl:variable name="srch_phone" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'PhoneNumber']"/>
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'NameAddress']"/>-->
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_phone]"/>
																													</xsl:variable>
																											(<xsl:value-of select="$SRCH_NAME_ADDRESS"/>
																													<xsl:if test="$SRCH_TAX != ''">,</xsl:if>
																													<xsl:value-of select="$SRCH_TAX"/>
																													<xsl:if test="$SRCH_VIN != ''">,</xsl:if>
																													<xsl:value-of select="$SRCH_VIN"/>
																													<xsl:if test="$SRCH_DRIVERS_LIC != ''">,</xsl:if>
																													<xsl:value-of select="$SRCH_DRIVERS_LIC"/>
																													<xsl:if test="$SRCH_LIC_PLATE != ''">,</xsl:if>
																													<xsl:value-of select="$SRCH_LIC_PLATE"/>
																													<xsl:if test="$SRCH_PH_NUMBER != ''">,</xsl:if>
																													<xsl:value-of select="$SRCH_PH_NUMBER"/>)

																									</font>
																											</li>
																										</td>
																										<!--
																									<xsl:call-template name="Insert_Claim_Score_Data">
																										<xsl:with-param name="Data_Name">Elements Searched
																										</xsl:with-param>
																										
																										<xsl:with-param name="Data_Value">
																											<xsl:variable name="SRCH_NAME_ADDRESS">
																												<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'NameAddress']"/>
																											</xsl:variable>
																											<xsl:variable name="SRCH_TAX">
																												<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'TaxIdentity']"/>
																											</xsl:variable>
																											<xsl:variable name="SRCH_VIN">
																												<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'VIN']"/>
																											</xsl:variable>
																											<xsl:variable name="SRCH_DRIVERS_LIC">
																												<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'DriversLicense']"/>
																											</xsl:variable>
																											<xsl:variable name="SRCH_LIC_PLATE">
																												<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'LicensePlate']"/>
																											</xsl:variable>
																											<xsl:variable name="SRCH_PH_NUMBER">
																												<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'PhoneNumber']"/>
																											</xsl:variable>
																											<xsl:value-of select="$SRCH_NAME_ADDRESS"/>
																											<xsl:if test="$SRCH_TAX != ''">,</xsl:if>
																											<xsl:value-of select="$SRCH_TAX"/>
																											<xsl:if test="$SRCH_VIN != ''">,</xsl:if>
																											<xsl:value-of select="$SRCH_VIN"/>
																											<xsl:if test="$SRCH_DRIVERS_LIC != ''">,</xsl:if>
																											<xsl:value-of select="$SRCH_DRIVERS_LIC"/>
																											<xsl:if test="$SRCH_LIC_PLATE != ''">,</xsl:if>
																											<xsl:value-of select="$SRCH_LIC_PLATE"/>
																											<xsl:if test="$SRCH_PH_NUMBER != ''">,</xsl:if>
																											<xsl:value-of select="$SRCH_PH_NUMBER"/>
																											
																										</xsl:with-param>
																									</xsl:call-template>-->
																									</tr>
																									<tr>
																										<td colspan="3" align="center">
																											<table width="98%" bgcolor="white" border="1" bordercolor="#C5D7DE" cellspacing="0" cellpadding="0">
																												<tr>
																													<td>
																														<table width="100%" border="0" cellpadding="2" cellspacing="2">
																															<tr>
																																<td height="30" colspan="6" align="center" valign="bottom">
																																	<font size="3" face="arial">The number of contributing Matching Claims for this Involved Party:
																																	<xsl:value-of select="sum($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/NumMatches)"/>
																																	</font>
																																</td>
																															</tr>
																															<tr>
																																<td colspan="6">
																																	<hr noshade="noshade" size="2" color="#C5D7DE" width="100%"/>
																																</td>
																															</tr>
																															<tr>
																																<td align="center" width="17%">
																																	<font size="2" face="Arial">
																																		<b>All-Claim</b>
																																	</font>
																																</td>
																																<td align="center" width="13%">
																																	<font size="2" face="Arial">
																																		<b>Date of</b>
																																	</font>
																																</td>
																																<td align="center" width="18%">
																																	<font size="2" face="Arial">
																																		<b>Coverage</b>
																																	</font>
																																</td>
																																<td align="center" width="18%">
																																	<font size="2" face="Arial">
																																		<b>Loss Type</b>
																																	</font>
																																</td>
																																<td align="center" width="24%">
																																	<font size="2" face="Arial">
																																		<b>Reason for</b>
																																	</font>
																																</td>
																																<td align="center" width="10%">
																																	<font size="2" face="Arial">
																																		<b>Component</b>
																																	</font>
																																</td>
																															</tr>
																															<tr>
																																<td align="center">
																																	<font size="2" face="Arial">
																																		<b>ID</b>
																																	</font>
																																</td>
																																<td align="center">
																																	<font size="2" face="Arial">
																																		<b>Loss</b>
																																	</font>
																																</td>
																																<td align="center">
																																	<font size="2" face="Arial">
																																		<b>Type</b>
																																	</font>
																																</td>
																																<td align="center">
																																	<font size="2" face="Arial"/>
																																</td>
																																<td align="center">
																																	<font size="2" face="Arial">
																																		<b>Match</b>
																																	</font>
																																</td>
																																<td align="center">
																																	<font size="2" face="Arial">
																																		<b>Score</b>
																																	</font>
																																</td>
																															</tr>
																															<xsl:for-each select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref = $MO01Id]">
																																<xsl:for-each select="com.iso_ScoredMatch">
																																	<tr>
																																		<td align="center" valign="top">
																																			<font size="2" face="Arial">
																																				<xsl:call-template name="Insert_Anchor_Link">
																																					<xsl:with-param name="LinkName">
																																						<xsl:value-of select="ItemIdInfo/AgencyId"/>
																																					</xsl:with-param>
																																					<xsl:with-param name="AnchorName">
																																						<xsl:value-of select="ItemIdInfo/AgencyId"/>
																																					</xsl:with-param>
																																				</xsl:call-template>
																																			</font>
																																		</td>
																																		<td align="center" valign="top">
																																			<font size="2" face="Arial">
																																				<xsl:variable name="MCD3_date" select="LossDt"/>
																																				<xsl:call-template name="Insert_CD_Score">
																																					<xsl:with-param name="Data_Value">
																																						<!--<xsl:value-of select="LossDt"/>-->
																																						<xsl:number value="substring($MCD3_date,6,2)" format="01/"/>
																																						<xsl:number value="substring($MCD3_date,9,2)" format="01/"/>
																																						<xsl:number value="substring($MCD3_date,1,4)" format="0001"/>
																																					</xsl:with-param>
																																				</xsl:call-template>
																																			</font>
																																		</td>
																																		<td align="center" valign="top">
																																			<font size="2" face="Arial">
																																				<xsl:variable name="CoverageType" select="CoverageCd"/>
																																				<xsl:call-template name="Insert_CD_Score">
																																					<xsl:with-param name="Data_Value">
																																						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$CoverageType]"/>
																																					</xsl:with-param>
																																				</xsl:call-template>
																																			</font>
																																		</td>
																																		<td align="center" valign="top">
																																			<font size="2" face="Arial">
																																				<xsl:variable name="LossType" select="LossCauseCd"/>
																																				<xsl:call-template name="Insert_CD_Score">
																																					<xsl:with-param name="Data_Value">
																																						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/LOSS-TYPES/*[@code=$LossType]"/>
																																					</xsl:with-param>
																																				</xsl:call-template>
																																			</font>
																																		</td>
																																		<td align="center" valign="top">
																																			<font size="2" face="Arial">
																																				<xsl:variable name="xx" select="$ClaimRoot/MatchDetails/MatchReasonInfo[@ClaimsPartyRef=$MO01Id]/MatchReasonCd"/>
																																				<xsl:if test="$xx = 'N'">Name</xsl:if>
																																				<xsl:if test="$xx = 'A' and $xx = 'N'">,</xsl:if>
																																				<xsl:if test="$xx = 'A'"> Address</xsl:if>
																																				<xsl:if test="$xx = 'S' and ($xx = 'N' or $xx = 'A')">,</xsl:if>
																																				<xsl:if test="$xx = 'S'"> SSN</xsl:if>
																																				<xsl:if test="$xx = 'R' and ($xx = 'N' or $xx = 'A' or $xx = 'S')">,</xsl:if>
																																				<xsl:if test="$xx = 'R'"> TIN</xsl:if>
																																				<xsl:if test="$xx = 'V' and ($xx = 'N' or $xx = 'A' or $xx = 'S' or $xx = 'T')">,</xsl:if>
																																				<xsl:if test="$xx = 'V'"> VIN</xsl:if>
																																				<xsl:if test="$xx = 'P' and ($xx = 'N' or $xx = 'A' or $xx = 'S' or $xx = 'T' or $xx = 'V')">,</xsl:if>
																																				<xsl:if test="$xx = 'P'"> Phone</xsl:if>
																																				<xsl:if test="$xx = 'D' and ($xx = 'N' or $xx = 'A' or $xx = 'S' or $xx = 'T' or $xx = 'V' or $xx = 'P')">,</xsl:if>
																																				<xsl:if test="$xx = 'D'"> Drivers License</xsl:if>
																																				<xsl:if test="$xx = 'L' and ($xx = 'N' or $xx = 'A' or $xx = 'S' or $xx = 'T' or $xx = 'V' or $xx = 'P' or $xx = 'D')">,</xsl:if>
																																				<xsl:if test="$xx = 'L'"> License Plate Number</xsl:if>
																																				<xsl:if test="$xx = 'LL' and ($xx = 'N' or $xx = 'A' or $xx = 'S' or $xx = 'T' or $xx = 'V' or $xx = 'P' or $xx = 'D' or $xx = 'L')">,</xsl:if>
																																				<xsl:if test="$xx = 'LL'"> Location of Loss</xsl:if>
																																				<xsl:if test="$xx = 'NC' and ($xx = 'N' or $xx = 'A' or $xx = 'S' or $xx = 'T' or $xx = 'V' or $xx = 'P' or $xx = 'D' or $xx = 'L' or $xx = 'LL')">,</xsl:if>
																																				<xsl:if test="$xx = 'NC'"> Name Combination</xsl:if>
																																				<br/>
																																			</font>
																																		</td>
																																		<td align="center" valign="top">
																																			<font size="2" face="Arial">
																																				<xsl:call-template name="Insert_CD_Score">
																																					<xsl:with-param name="Data_Value">
																																						<xsl:value-of select="sum(com.iso_MatchScore)"/>
																																					</xsl:with-param>
																																				</xsl:call-template>
																																			</font>
																																		</td>
																																	</tr>
																																</xsl:for-each>
																															</xsl:for-each>
																														</table>
																													</td>
																												</tr>
																											</table>
																										</td>
																									</tr>
																								</xsl:when>
																								<xsl:otherwise>
																									<tr>
																										<td colspan="3" align="left">
																											<li>
																												<font size="2" face="Arial">			
																													There were no contributing matching claims for this Involved Party
																												</font>
																											</li>
																										</td>
																									</tr>
																									<tr>
																										<td colspan="2" align="left">
																											<li>
																												<font size="2" face="Arial">
																										Elements Searched:
																										<xsl:variable name="cnt" select="count($ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd)"/>
																													<xsl:value-of select="$cnt"/>
																													<xsl:variable name="SRCH_NAME_ADDRESS">
																														<xsl:variable name="srch_name" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'NameAddress']"/>
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'NameAddress']"/>-->
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_name]"/>
																													</xsl:variable>
																													<xsl:variable name="SRCH_TAX">
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'TaxIdentity']"/>-->
																														<xsl:variable name="srch_tax" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'TaxIdentity']"/>
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_tax]"/>
																													</xsl:variable>
																													<xsl:variable name="SRCH_VIN">
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'VIN']"/>-->
																														<xsl:variable name="srch_vin" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'VIN']"/>
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_vin]"/>
																													</xsl:variable>
																													<xsl:variable name="SRCH_DRIVERS_LIC">
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'DriversLicense']"/>-->
																														<xsl:variable name="srch_dr_lic" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'DriversLicense']"/>
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_dr_lic]"/>
																													</xsl:variable>
																													<xsl:variable name="SRCH_LIC_PLATE">
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'LicensePlate']"/>-->
																														<xsl:variable name="srch_lic_pl" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'LicensePlate']"/>
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'NameAddress']"/>-->
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_lic_pl]"/>
																													</xsl:variable>
																													<xsl:variable name="SRCH_PH_NUMBER">
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'PhoneNumber']"/>-->
																														<xsl:variable name="srch_phone" select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'PhoneNumber']"/>
																														<!--<xsl:value-of select="$ClaimRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref=$MO01Id]/com.iso_SearchableElementCd[.= 'NameAddress']"/>-->
																														<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SearchableElementCds/*[@code=$srch_phone]"/>
																													</xsl:variable>
																											(<xsl:value-of select="$SRCH_NAME_ADDRESS"/>
																													<xsl:if test="$SRCH_TAX != ''">,</xsl:if>
																													<xsl:value-of select="$SRCH_TAX"/>
																													<xsl:if test="$SRCH_VIN != ''">,</xsl:if>
																													<xsl:value-of select="$SRCH_VIN"/>
																													<xsl:if test="$SRCH_DRIVERS_LIC != ''">,</xsl:if>
																													<xsl:value-of select="$SRCH_DRIVERS_LIC"/>
																													<xsl:if test="$SRCH_LIC_PLATE != ''">,</xsl:if>
																													<xsl:value-of select="$SRCH_LIC_PLATE"/>
																													<xsl:if test="$SRCH_PH_NUMBER != ''">,</xsl:if>
																													<xsl:value-of select="$SRCH_PH_NUMBER"/>)

																									</font>
																											</li>
																										</td>
																									</tr>
																								</xsl:otherwise>
																							</xsl:choose>
																							<!--end new-->
																							<tr>
																								<td colspan="3">&#160;</td>
																							</tr>
																						</table>
																					</td>
																				</tr>
																				<!--MCD3 end 05/25/2006-->
																			</table>
																		</td>
																	</tr>
																</table>
															</td>
														</tr>
														<!-- MCD3-->
														<!--
													<tr>
														<td width="270">
															<xsl:if test="count(com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport[@idref = $MO01Id ]) &gt; 0">
																<xsl:call-template name="Display_ClaimDirector_Score">
																	<xsl:with-param name="ClaimRoot" select="."/>
																</xsl:call-template>
															</xsl:if>
														</td>
													</tr>
													-->
														<!-- end MCD3-->
														<!--
													<tr>
														<td bgcolor="#C5D7DE">&#160;</td>
														<td bgcolor="#C5D7DE"></td>
														<td></td>
													</tr>
													-->
													</TABLE>
												</xsl:if>
												<!--commented on 07/13/2006</xsl:for-each>-->
											</td>
										</table>
									</xsl:for-each>
								</xsl:if>
							</table>
						</td>
					</TR>
					<tr>
						<td bgcolor="#C5D7DE">&#160;</td>
						<td bgcolor="#C5D7DE"/>
						<td/>
					</tr>
				</TABLE>
			</td>
		</table>
		<!--</xsl:if>-->
		<tr>
			<td>
				<br/>
				<table border="0" cellpadding="0" cellspacing="0" width="685">
					<tr bgcolor="#C5D7DE">
						<td>&#160;</td>
						<td>&#160;</td>
					</tr>
					<tr>
						<td>
							<b>
								<font face="Arial" size="4">
									<xsl:variable name="ReturnReason" select="$ClaimRoot/MatchReportTypeCd"/>
									<!--<xsl:if test="$ReturnReason =  'P'">ISO CLAIMSEARCH REPLACEMENT CLAIM</xsl:if>
									<xsl:if test="$ReturnReason =  'I'">ISO CLAIMSEARCH MATCH REPORT</xsl:if>
									<xsl:if test="$ReturnReason =  'S'">ISO CLAIMSEARCH AUTOMATIC UPDATE</xsl:if>
									<xsl:if test="$ReturnReason =  'V'">ISO CLAIMSEARCH RECOVERY NOTICE</xsl:if>-->
								</font>
							</b>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</xsl:template>
</xsl:stylesheet>
