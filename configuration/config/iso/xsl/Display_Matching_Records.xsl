<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format">
<!--
*********************************************************************************
*	 
*	      Name="Display_Matching_Record_ShortCuts" Template
*
*			Displays links to the matching records
*	 
*********************************************************************************
-->

	<xsl:template name="Display_Matching_Record_Links">
		<xsl:param name="RootNode"/>
		<font size="4" face="Arial">
		<b>Matching Records:</b><br></br>
		</font>
		<xsl:for-each select="$RootNode">
			<xsl:variable name="ClaimNumber" select="ClaimsOccurrence/ItemIdInfo/AgencyId"/>
			<xsl:call-template name="Insert_Anchor_Link">
				<xsl:with-param name="LinkName">
					<xsl:value-of select="$ClaimNumber"></xsl:value-of>			
				</xsl:with-param>
				<xsl:with-param name="AnchorName">
					<xsl:value-of select="$ClaimNumber"></xsl:value-of>			
				</xsl:with-param>
			</xsl:call-template>
			<br></br>		
		</xsl:for-each>		
	</xsl:template>

<!--
*********************************************************************************
*	 
*	      Name="Display_Matching_General_Info" Template
*
*			Builds the matching common elements records  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_General_Info">
		<xsl:variable name="RouteRef" select="ClaimsOccurrence/@id"/>
		<xsl:variable name="PFReported2Ref" select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'Emergency']/@id"/>
		<xsl:variable name="InsReported2Ref" select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/@id"/>
		<xsl:variable name="VehClaimRecord" select="InvestigationInfo/AppraiserActivityInfo/AppraiserActivityCd"/>
	
		<xsl:choose>
			<xsl:when test="$VehClaimRecord = 'E' or $VehClaimRecord = 'A' or $VehClaimRecord = 'V'">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">File Number</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="ClaimsOccurrence/ItemIdInfo/AgencyId"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:variable name="Coverage" select="Policy/Loss/CoverageCd"/>
				<xsl:call-template name="Insert_Data_Using_Code_List">
					<xsl:with-param name="Data_Name">Coverage</xsl:with-param>
					<xsl:with-param name="Data_Code">
						<xsl:value-of select="$Coverage"/>
					</xsl:with-param>
					<xsl:with-param name="Data_Code_Value">
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$Coverage]"/>
					</xsl:with-param>
				</xsl:call-template>		
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Claim Number</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="ClaimsOccurrence/ItemIdInfo/InsurerId"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Policy Number</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="Policy/PolicyNumber"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:variable name="ActType" select="InvestigationInfo/AppraiserActivityInfo/AppraiserActivityCd"/>
				<xsl:call-template name="Insert_Data_Using_Code_List">
					<xsl:with-param name="Data_Name">Activity Type</xsl:with-param>
					<xsl:with-param name="Data_Code">
						<xsl:value-of select="$ActType"/>
					</xsl:with-param>
					<xsl:with-param name="Data_Code_Value">
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/AppraiserActivityTypeCds/*[@code=$ActType]"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:variable name="AppraiseDt" select="InvestigationInfo/AppraiserActivityInfo/AppraiserActivityDt"/>
				<xsl:if test="count($AppraiseDt) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Activity Date</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:number value="substring($AppraiseDt,6,2)" format="01/"/>
							<xsl:number value="substring($AppraiseDt,9,2)" format="01/"/>
							<xsl:number value="substring($AppraiseDt,1,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Insurance Company</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:variable name="InsPhone1" select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>
				<xsl:if test="count($InsPhone1) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Contact Phone</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<xsl:number value="substring($InsPhone1,4,3)" format="(001"/><xsl:number value="substring($InsPhone1,8,3)" format=") 001-"/><xsl:number value="substring($InsPhone1,11,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
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
				<xsl:variable name="PointOfImpact" select="AutoLossInfo/ImpactPointCd"/>
				<xsl:call-template name="Insert_Data_Using_Code_List">
					<xsl:with-param name="Data_Name">Point of Impact</xsl:with-param>
					<xsl:with-param name="Data_Code">
						<xsl:value-of select="$PointOfImpact"/>
					</xsl:with-param>
					<xsl:with-param name="Data_Code_Value">
						<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/PointOfImpactCds/*[@code=$PointOfImpact]"/>
					</xsl:with-param>
				</xsl:call-template>	
				<xsl:variable name="ChkVIN" select="InvestigationInfo/ValidVINInd"/>
				<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
					<xsl:with-param name="Data_Name">VIN</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="AutoLossInfo/VehInfo/VehIdentificationNumber"/>
						<xsl:if test="$ChkVIN =0 "> (Fail)</xsl:if>
						<xsl:if test="$ChkVIN =1 "> (Pass)</xsl:if>
					</xsl:with-param>
				</xsl:call-template>
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = AutoLossInfo/VehInfo/VehIdentificationNumber/@id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'VIN'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->	
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Vehicle</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="AutoLossInfo/VehInfo/ModelYear"/>&#160;<xsl:value-of select="AutoLossInfo/VehInfo/Manufacturer"/>&#160;<xsl:value-of select="AutoLossInfo/VehInfo/Model"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Odometer</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="AutoLossInfo/VehInfo/PersVehInfo/OdometerReading/NumUnits"/>
					</xsl:with-param>
				</xsl:call-template>

			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Insuring Company</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Claim Number</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="ClaimsOccurrence/ItemIdInfo/InsurerId"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:variable name="MA03LossDt" select="ClaimsOccurrence/LossDt"/>
			<xsl:if test="count($MA03LossDt) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Date/Time of Loss</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:number value="substring($MA03LossDt,6,2)" format="01/"/>
						<xsl:number value="substring($MA03LossDt,9,2)" format="01/"/>
						<xsl:number value="substring($MA03LossDt,1,4)" format="0001"/>&#160;
						<xsl:value-of select="ClaimsOccurrence/LossTime"/>
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
				<!--
				<xsl:variable name="MA03IncepDt" select="Policy/ContractTerm/EffectiveDt"/>
			<xsl:if test="count($MA03IncepDt) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Inception Date</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:number value="substring($MA03IncepDt,6,2)" format="01/"/>
						<xsl:number value="substring($MA03IncepDt,9,2)" format="01/"/>
						<xsl:number value="substring($MA03IncepDt,1,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:variable name="MA03ExpDt" select="Policy/ContractTerm/ExpirationDt"/>
			<xsl:if test="count($MA03ExpDt) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Expiration Date</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:number value="substring($MA03ExpDt,6,2)" format="01/"/>
						<xsl:number value="substring($MA03ExpDt,9,2)" format="01/"/>
						<xsl:number value="substring($MA03ExpDt,1,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			-->
			<xsl:variable name="MA03IncepDt" select="Policy/ContractTerm/EffectiveDt"/>
			<xsl:variable name="MA03ExpDt" select="Policy/ContractTerm/ExpirationDt"/>
			<xsl:if test="count($MA03IncepDt) &gt; 0">
				<tr>
						
						<td align="left">&#160;&#160;
						<b><font size="2" face="Arial">
							Inception Date:
							</font></b>
						</td>
						<td align="left" >
						<font size="2" face="Arial">
						<xsl:number value="substring($MA03IncepDt,6,2)" format="01/"/>
						<xsl:number value="substring($MA03IncepDt,9,2)" format="01/"/>
						<xsl:number value="substring($MA03IncepDt,1,4)" format="0001"/>
						</font>
						<xsl:if test="count($MA03ExpDt) &gt; 0">
							<b><font size="2" face="Arial">
							&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Expiration Date:
							</font></b>
							<font size="2" face="Arial">
							<xsl:number value="substring($MA03ExpDt,6,2)" format="01/"/>
							<xsl:number value="substring($MA03ExpDt,9,2)" format="01/"/>
							<xsl:number value="substring($MA03ExpDt,1,4)" format="0001"/>	
							</font>
						</xsl:if>
						</td>
					</tr>
				</xsl:if>	
				<xsl:variable name="RenewalInd" select="ClaimsOccurrence/PolicyRenewalInd"/>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Policy Renewed?</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<!--<xsl:value-of select="ClaimsOccurrence/PolicyRenewalInd"/>-->
						<xsl:if test="$RenewalInd=0">NO</xsl:if>
						<xsl:if test="$RenewalInd=1">YES</xsl:if>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:variable name="AssignRisk" select="Policy/AssignedRiskInd"/>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Assigned Risk?</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<!--<xsl:value-of select="Policy/AssignedRiskInd"/>-->
						<xsl:if test="$AssignRisk=0">NO</xsl:if>
						<xsl:if test="$AssignRisk=1">YES</xsl:if>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:variable name="SplitZip" select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/Addr/PostalCode"/>		<xsl:call-template name="Insert_Addr">
					<xsl:with-param name="Title">Insuring Co. Address</xsl:with-param>
					<xsl:with-param name="Addr1">
						<xsl:value-of select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/Addr/Addr1"/>
					</xsl:with-param>
					<xsl:with-param name="Addr2">
						<xsl:value-of select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/Addr/Addr2"/>
					</xsl:with-param>
					<xsl:with-param name="City">
						<xsl:value-of select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/Addr/City"/>
					</xsl:with-param>
					<xsl:with-param name="State">
						<xsl:value-of select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/Addr/StateProvCd"/>
					</xsl:with-param>
					<xsl:with-param name="ZipCode">
						<!--<xsl:value-of select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/Addr/PostalCode"/>-->
						<xsl:value-of select="substring($SplitZip, 1, 5)"/>
						<xsl:if test="string-length($SplitZip) &gt; 5">-</xsl:if>
						<xsl:value-of select="substring($SplitZip, 6, 9)"/>
					</xsl:with-param>
					<xsl:with-param name="Country">
						<xsl:value-of select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/Addr/CountryCd"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:variable name="InsPhone" select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>
				<xsl:if test="count($InsPhone) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Insuring Co. Phone</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<!--<xsl:value-of select="Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 'CarrierInsurer']/GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>-->
							<!--Phone Format(000)000-0000 -->
							<xsl:number value="substring($InsPhone,4,3)" format="(001"/><xsl:number value="substring($InsPhone,8,3)" format=") 001-"/><xsl:number value="substring($InsPhone,11,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
				<xsl:variable name="MA03ReportDt" select="ClaimsOccurrence/ClaimsReported[@ReportedToRef = $InsReported2Ref]/ReportedDt"/>
			<xsl:if test="count($MA03ReportDt) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Company Received Date</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<!--<xsl:value-of select="ClaimsOccurrence/ClaimsReported[@ReportedToRef = $InsReported2Ref]/ReportedDt"/>-->
						<xsl:number value="substring($MA03ReportDt,6,2)" format="01/"/>
						<xsl:number value="substring($MA03ReportDt,9,2)" format="01/"/>
						<xsl:number value="substring($MA03ReportDt,1,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Loss Description</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="ClaimsOccurrence/IncidentDesc"/>
					</xsl:with-param>
				</xsl:call-template>
				<!--
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Agency Notified</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'Emergency']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name"> Report Case No.</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="ClaimsOccurrence/ClaimsReported[@ReportedToRef = $PFReported2Ref]/ReportNumber"/>
					</xsl:with-param>
				</xsl:call-template>
				-->
			<xsl:if test="count(ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'Emergency']/GeneralPartyInfo/NameInfo/CommlName/CommercialName) &gt;0">
				<tr>
					<td align="left">&#160;&#160;
					<b><font size="2" face="Arial">
						Agency Notified:
						</font></b>
					</td>
					<td align="left" >
						<font size="2" face="Arial">
						<xsl:value-of select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'Emergency']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
						</font>
						<xsl:if test="count(ClaimsOccurrence/ClaimsReported[@ReportedToRef = $PFReported2Ref]/ReportNumber) &gt;0">
							<b><font size="2" face="Arial">
							&#160;&#160;&#160;&#160;Report Case No.:
							</font></b>
					
							<font size="2" face="Arial">
							<xsl:value-of select="ClaimsOccurrence/ClaimsReported[@ReportedToRef = $PFReported2Ref]/ReportNumber"/>
							</font>
						</xsl:if>
					</td>
				</tr>	
			</xsl:if>	
				<!--
				<xsl:variable name="CATInd"  select="ClaimsOccurrence/CatastropheLossInd"/>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">CAT Related?</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:if test="$CATInd=0">NO</xsl:if>
						<xsl:if test="$CATInd=1">YES</xsl:if>
					</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">CAT #</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="ClaimsOccurrence/Catastrophe/CatastropheCd"/>
					</xsl:with-param>
				</xsl:call-template>
				-->
				<xsl:variable name="CAT" select="ClaimsOccurrence/CatastropheLossInd"/>
				<xsl:if test="count($CAT) &gt;0">
					<tr>
						<td align="left">&#160;&#160;
						<b><font size="2" face="Arial">
							CAT Related?:
							</font></b>
						</td>
						<td align="left" >
							<font size="2" face="Arial">
								<xsl:if test="$CAT=0">NO</xsl:if>
								<xsl:if test="$CAT=1">YES</xsl:if>
							</font>
							
							<xsl:if test="count(ClaimsOccurrence/Catastrophe/CatastropheCd) &gt; 0">
								<b><font size="2" face="Arial">
								&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;CAT Number:
								</font></b>
								<font size="2" face="Arial">
									<xsl:value-of select="ClaimsOccurrence/Catastrophe/CatastropheCd"/>
								</font>
							</xsl:if>
						</td>
					</tr>			
				</xsl:if>

				<xsl:variable name="FundInd"  select="WorkCompLossInfo/SecondInjuryFundInd"/>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">8 F Fund Claim?</xsl:with-param>
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
				<xsl:call-template name="Display_Matching_Additional_General_Info"/>
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
				<xsl:variable name="physicaladdr" select="Policy/MiscParty/com.iso_SIUInfo/GeneralPartyInfo/Addr[AddrTypeCd='PhysicalRisk']" />
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
				<xsl:variable name="mailingaddr" select="Policy/MiscParty/com.iso_SIUInfo/GeneralPartyInfo/Addr[AddrTypeCd='MailingAddress']" />
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
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
		<!--
*********************************************************************************
*	 
*	      Name="Display_Matching_Additional_General_Info" Template
*
*			Builds the matching common elements Records  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Additional_General_Info">
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
				<!--<xsl:value-of select="ClaimsOccurrence/Addr/PostalCode"/>-->
				<xsl:value-of select="substring($SplitZip, 1, 5)"/>
				<xsl:if test="string-length($SplitZip) &gt; 5">-</xsl:if>
				<xsl:value-of select="substring($SplitZip, 6, 9)"/>
			</xsl:with-param>
			<xsl:with-param name="Country">
				<xsl:value-of select="ClaimsOccurrence/Addr/CountryCd"/>
			</xsl:with-param>
		</xsl:call-template>

	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Name="Display_Matching_Involved_Party" Template
*
*			Builds the matching parties to the loss Records  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Involved_Party">
		<xsl:param name="DeathMasterNode"/>
		<xsl:variable name="CPId" select="@id"/>
		<xsl:variable name="ClaimsPartyRoleCd" select="ClaimsPartyInfo/ClaimsPartyRoleCd"/>
		<tr><td colspan="5"><hr  noshade="noshade" size="1"></hr></td></tr>
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

				<!--
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name"> Name</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>&#160;
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>&#160;
						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>
					</xsl:with-param>
				</xsl:call-template>
				-->
				<!--displaying first,middle and last name in one line please see above code
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
		<xsl:variable name="MO02BirthDt"  select="PersonInfo/BirthDt"/>
	<xsl:if test="count($MO02BirthDt) &gt; 0">
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">DOB</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="PersonInfo/BirthDt"/>-->
				<xsl:number value="substring($MO02BirthDt,6,2)" format="01/"/>
				<xsl:number value="substring($MO02BirthDt,9,2)" format="01/"/>
				<xsl:number value="substring($MO02BirthDt,1,4)" format="0001"/>
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

		<xsl:variable name="HomeNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>
		<xsl:if test="count($HomeNum) &gt; 0">
			<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
				<xsl:with-param name="Data_Name">Home Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>-->
					<!--Format phone Number(000)000-0000)-->
					<xsl:number value="substring($HomeNum,4,3)" format="(001"/><xsl:number value="substring($HomeNum,8,3)" format=") 001-"/><xsl:number value="substring($HomeNum,11,4)" format="0001"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Value_ID">
					<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber/@id"/>
				</xsl:with-param>
			</xsl:call-template>
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber/@id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'Home Phone'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->	
		</xsl:if>
		<xsl:variable name="BusinessNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>
		<xsl:if test="count($BusinessNum) &gt; 0">
			<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
				<xsl:with-param name="Data_Name">Business Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>-->
					<!--Format phone number (000)000-0000-->
					<xsl:number value="substring($BusinessNum,4,3)" format="(001"/><xsl:number value="substring($BusinessNum,8,3)" format=") 001-"/><xsl:number value="substring($BusinessNum,11,4)" format="0001"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Value_ID">
					<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber/@id"/>
				</xsl:with-param>
			</xsl:call-template>
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber/@id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'Business Phone'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->	
		</xsl:if>
		<xsl:variable name="CellNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>
		<xsl:if test="count($CellNum) &gt; 0">
			<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
				<xsl:with-param name="Data_Name">Cellular Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>-->
					<!--Format phone number (000)000-0000-->
					<xsl:number value="substring($CellNum,4,3)" format="(001"/><xsl:number value="substring($CellNum,8,3)" format=") 001-"/><xsl:number value="substring($CellNum,11,4)" format="0001"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Value_ID">
					<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber/@id"/>
				</xsl:with-param>
			</xsl:call-template>
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber/@id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'Cell Phone'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->	
		</xsl:if>
		<!--
		<xsl:variable name="PagerNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Pager']/PhoneNumber"/>
		<xsl:if test="count($PagerNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Pager</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($PagerNum,4,3)" format="(001"/><xsl:number value="substring($PagerNum,8,3)" format=") 001-"/><xsl:number value="substring($PagerNum,11,4)" format="0001"/>
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
				<b><font size="2" face="Arial">
					Pager:
					</font></b>
				</td>
				<td align="left" colspan="1" >
				<font size="2" face="Arial">
					<xsl:number value="substring($PagerNum,4,3)" format="(001"/>
					<xsl:number value="substring($PagerNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($PagerNum,11,4)" format="0001"/>
				</font>
				<b><font size="2" face="Arial">
				&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
				&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;PIN:
				</font></b>
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
			<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
				<xsl:with-param name="Data_Name">SSN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($SSNNum,1,3)" format="001-"/><xsl:number value="substring($SSNNum,4,2)" format="01-"/><xsl:number value="substring($SSNNum,6,4)" format="0001"/>
					(<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SSNValidationCds/*[@code=$SSNValidationCd]"/>)
				</xsl:with-param>
				<xsl:with-param name="Data_Value_ID">
					<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/@id"/>
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
					<b><font size="2" face="Arial">
						SSN:
						</font></b>
					</td>
					<td align="left" >
					<font size="2" face="Arial">
					<xsl:choose>
						<xsl:when test="$MaskSSN != 00000">
							<xsl:number value="substring($SSNNum,1,3)" format="001-"/>
							<xsl:number value="substring($SSNNum,4,2)" format="01-"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="format-number(substring($SSNNum,1,3), 'XXX-')" /> 
							<xsl:value-of select="format-number(substring($SSNNum,4,2), 'XX-')" /> 
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
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/@id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'SSN'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->				
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
		<xsl:variable name="MO02DeathDt" select="$DeathMasterNode/ClaimsInjuredInfo/EventInfo[EventCd = 'Death']/EventDt"/>
	<xsl:if test="count($MO02DeathDt) &gt; 0">
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Date of Death</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:number value="substring($MO02DeathDt,6,2)" format="01/"/>
				<xsl:number value="substring($MO02DeathDt,9,2)" format="01/"/>
				<xsl:number value="substring($MO02DeathDt,1,4)" format="0001"/>
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
			<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
				<xsl:with-param name="Data_Name">TIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($TINNum,1,2)" format="01-"/>
					<xsl:number value="substring($TINNum,3,7)" format="0000001"/>
					(<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TINValidationCds/*[@code=$TINValidationCd]"/>)
				</xsl:with-param>
				<xsl:with-param name="Data_Value_ID">
					<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/@id"/>
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
				<b><font size="2" face="Arial">
					TIN:
					</font></b>
				</td>
				<td align="left" >
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
		<!-- GAURAV : Added to Insert More Matches-->
			<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/@id">
				<xsl:call-template name="Insert_More_Matches">
					<xsl:with-param name="Match_Desc">
						<xsl:value-of select="'TIN'"/>
					</xsl:with-param>
				</xsl:call-template>				
			</xsl:if>
		<!-- GAURAV : Added to Insert More Matches-->	
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
					<b><font size="2" face="Arial">
						Drivers License:
						</font></b>
					</td>
					<td align="left" colspan="1" >
					<font size="2" face="Arial">
						<xsl:value-of select="$DriverLicNum"/>
					</font>
					<xsl:if test="count($DriverSt) &gt; 0">
						<b><font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;State:
						</font></b>
						<font size="2" face="Arial">
						<xsl:value-of select="$DriverSt"/>
						</font>
					</xsl:if>
					</td>
				</tr>			
			</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Med./Prof. License</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/NonTaxIdentity[NonTaxIdTypeCd = 'ProfLicense']/NonTaxId"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Occupation</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="PersonInfo/OccupationDesc"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="../RemarkText[@idref = $CPId]"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--start Investigation details(MEX2)-->
		<xsl:variable name="SIUInvolved" select="../../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_SIUInvolved"/>
		<xsl:variable name="SIUNotPaid" select="../../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_ClaimNotPaid"/>
		<xsl:variable name="SIUEnforceAction" select="../../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_EnforcementActionSubject"/>
		<xsl:variable name="SIUFraudBureau" select="../../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_CriteriaForFraudBureau"/>
		<xsl:variable name="SIUNICBAlert" select="../../com.iso_SIUParty[@ClaimsPartyRef = $CPId]/com.iso_NICBAlert"/>
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
		<!-- End Investigation details(MEX2)-->
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Name="Display_Matching_Alias" Template
*
*			Builds the matching AKA/Prior Address Records  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Alias">
		<xsl:param name="DeathMasterNode" select="EmptyNode"/>
		<xsl:variable name="CPId" select="@id"/>
		<xsl:call-template name="Insert_Header">
			<xsl:with-param name="Data_Name">Also Known As (AKA)</xsl:with-param>
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
		<xsl:variable name="MK02BirthDt" select="PersonInfo/BirthDt"/>
	<xsl:if test="count($MK02BirthDt) &gt; 0">
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">DOB</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="PersonInfo/BirthDt"/>-->
				<xsl:number value="substring($MK02BirthDt,6,2)" format="01/"/>
				<xsl:number value="substring($MK02BirthDt,9,2)" format="01/"/>
				<xsl:number value="substring($MK02BirthDt,1,4)" format="0001"/>
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
		<xsl:variable name="SSNNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId"/>
		<xsl:variable name="SSNValidationCd" select="PartyInvestigationInfo/SSNValidationCd"/>
		<xsl:if test="count($SSNNum) &gt; 0">
			<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
				<xsl:with-param name="Data_Name">SSN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($SSNNum,1,3)" format="001-"/><xsl:number value="substring($SSNNum,4,2)" format="01-"/><xsl:number value="substring($SSNNum,6,4)" format="0001"/>
					(<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/SSNValidationCds/*[@code=$SSNValidationCd]"/>)
				</xsl:with-param>
				<xsl:with-param name="Data_Value_ID">
					<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/@id"/>
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
					<b><font size="2" face="Arial">
						SSN:
						</font></b>
					</td>
					<td align="left" >
					<font size="2" face="Arial">
					<xsl:choose>
						<xsl:when test="$MaskSSN != 00000">
							<xsl:number value="substring($SSNNum,1,3)" format="001-"/>
							<xsl:number value="substring($SSNNum,4,2)" format="01-"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="format-number(substring($SSNNum,1,3), 'XXX-')" /> 
							<xsl:value-of select="format-number(substring($SSNNum,4,2), 'XX-')" /> 
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
		<!--
		<xsl:variable name="TINNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/TaxId"/>
		<xsl:variable name="TINValidationCd" select="PartyInvestigationInfo/TINValidationCd"/>
		<xsl:if test="count($TINNum) &gt; 0">
			<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
				<xsl:with-param name="Data_Name">TIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($TINNum,1,2)" format="01-"/>
					<xsl:number value="substring($TINNum,3,7)" format="0000001"/>
					(<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/TINValidationCds/*[@code=$TINValidationCd]"/>)
				</xsl:with-param>
				<xsl:with-param name="Data_Value_ID">
					<xsl:value-of select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'TIN']/@id"/>
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
				<b><font size="2" face="Arial">
					TIN:
					</font></b>
				</td>
				<td align="left" >
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
		
		<xsl:variable name="AKA_HomeNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>
		<xsl:if test="count($AKA_HomeNum) &gt; 0">
			<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
				<xsl:with-param name="Data_Name">Home Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>-->
					<xsl:number value="substring($AKA_HomeNum,4,3)" format="(001"/><xsl:number value="substring($AKA_HomeNum,8,3)" format=") 001-"/><xsl:number value="substring($AKA_HomeNum,11,4)" format="0001"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Value_ID">
					<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber/@id"/>
				</xsl:with-param>
			</xsl:call-template>
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber/@id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'Home Phone'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->
		</xsl:if>
		<xsl:variable name="AKA_Business_Num" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>
		<xsl:if test="count($AKA_Business_Num) &gt; 0">
			<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
				<xsl:with-param name="Data_Name">Business Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>-->
					<xsl:number value="substring($AKA_Business_Num,4,3)" format="(001"/><xsl:number value="substring($AKA_Business_Num,8,3)" format=") 001-"/><xsl:number value="substring($AKA_Business_Num,11,4)" format="0001"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Value_ID">
					<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber/@id"/>
				</xsl:with-param>
			</xsl:call-template>
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber/@id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'Business Phone'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->	
		</xsl:if>
		<xsl:variable name="AKA_CellNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>
		<xsl:if test="count($AKA_CellNum) &gt; 0">
			<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
				<xsl:with-param name="Data_Name">Cellular Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>-->
					<xsl:number value="substring($AKA_CellNum,4,3)" format="(001"/><xsl:number value="substring($AKA_CellNum,8,3)" format=") 001-"/><xsl:number value="substring($AKA_CellNum,11,4)" format="0001"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Value_ID">
					<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber/@id"/>
				</xsl:with-param>
			</xsl:call-template>
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber/@id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'Cell Phone'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->	
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Name="Display_Matching_Service_Provider" Template
*
*			Builds the matching service provider Records  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Service_Provider">
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
		<xsl:variable name="MSP2BirthDt" select="PersonInfo/BirthDt"/>
	<xsl:if test="count($MSP2BirthDt) &gt; 0">
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">DOB</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="PersonInfo/BirthDt"/>-->
				<xsl:number value="substring($MSP2BirthDt,6,2)" format="01/"/>
				<xsl:number value="substring($MSP2BirthDt,9,2)" format="01/"/>
				<xsl:number value="substring($MSP2BirthDt,1,4)" format="0001"/>
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
		<xsl:variable name="SSNNum" select="GeneralPartyInfo/NameInfo/TaxIdentity[TaxIdTypeCd = 'SSN']/TaxId"/>
		<xsl:variable name="SSNValidationCd" select="PartyInvestigationInfo/SSNValidationCd"/>
		<xsl:if test="count($SSNNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">SSN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($SSNNum,1,3)" format="001-"/><xsl:number value="substring($SSNNum,4,2)" format="01-"/><xsl:number value="substring($SSNNum,6,4)" format="0001"/>
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
					<b><font size="2" face="Arial">
						SSN:
						</font></b>
					</td>
					<td align="left" >
					<font size="2" face="Arial">
					<xsl:choose>
						<xsl:when test="$MaskSSN != 00000">
							<xsl:number value="substring($SSNNum,1,3)" format="001-"/>
							<xsl:number value="substring($SSNNum,4,2)" format="01-"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="format-number(substring($SSNNum,1,3), 'XXX-')" /> 
							<xsl:value-of select="format-number(substring($SSNNum,4,2), 'XX-')" /> 
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
				<b><font size="2" face="Arial">
					TIN:
					</font></b>
				</td>
				<td align="left" >
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
					<b><font size="2" face="Arial">
						Drivers License:
						</font></b>
					</td>
					<td align="left" colspan="1" >
					<font size="2" face="Arial">
						<xsl:value-of select="$DriverLicNum"/>
					</font>
					<xsl:if test="count($DriverSt) &gt; 0">
						<b><font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;State:
						</font></b>
						<font size="2" face="Arial">
						<xsl:value-of select="$DriverSt"/>
						</font>
					</xsl:if>
					</td>
				</tr>			
			</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Med./Prof. License</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="GeneralPartyInfo/NameInfo/NonTaxIdentity[NonTaxIdTypeCd = 'ProfLicense']/NonTaxId"/>
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
				<!--<xsl:value-of select="GeneralPartyInfo/Addr/PostalCode"/>-->
				<xsl:value-of select="substring($SplitZip, 1, 5)"/>
				<xsl:if test="string-length($SplitZip) &gt; 5">-</xsl:if>
				<xsl:value-of select="substring($SplitZip, 6, 9)"/>
			</xsl:with-param>
			<xsl:with-param name="Country">
				<xsl:value-of select="GeneralPartyInfo/Addr/CountryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="SP_HomeNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>
		<xsl:if test="count($SP_HomeNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Home Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Home']/PhoneNumber"/>-->
					<xsl:number value="substring($SP_HomeNum,4,3)" format="(001"/><xsl:number value="substring($SP_HomeNum,8,3)" format=") 001-"/><xsl:number value="substring($SP_HomeNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="SP_BusinessNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>
		<xsl:if test="count($SP_BusinessNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Business Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and CommunicationUseCd = 'Business']/PhoneNumber"/>-->
					<xsl:number value="substring($SP_BusinessNum,4,3)" format="(001"/><xsl:number value="substring($SP_BusinessNum,8,3)" format=") 001-"/><xsl:number value="substring($SP_BusinessNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="SP_CellNum"  select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>
		<xsl:if test="count($SP_CellNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Cellular Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Cell']/PhoneNumber"/>-->
					<xsl:number value="substring($SP_CellNum,4,3)" format="(001"/><xsl:number value="substring($SP_CellNum,8,3)" format=") 001-"/><xsl:number value="substring($SP_CellNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<!--
		<xsl:variable name="PagerNum" select="GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Pager']/PhoneNumber"/>
		<xsl:if test="count($PagerNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Pager Number</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($PagerNum,4,3)" format="(001"/><xsl:number value="substring($PagerNum,8,3)" format=") 001-"/><xsl:number value="substring($PagerNum,11,4)" format="0001"/>
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
				<b><font size="2" face="Arial">
					Pager:
					</font></b>
				</td>
				<td align="left" colspan="1" >
				<font size="2" face="Arial">
					<xsl:number value="substring($PagerNum,4,3)" format="(001"/>
					<xsl:number value="substring($PagerNum,8,3)" format=") 001-"/>
					<xsl:number value="substring($PagerNum,11,4)" format="0001"/>
				</font>
				<b><font size="2" face="Arial">
				&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
				&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;PIN:
				</font></b>
				<font size="2" face="Arial">
				<xsl:value-of select="substring($PagerNum, 16,7)"/>
				</font>
				</td>
			</tr>			
		</xsl:if>
		<!--Investigation Details-->
		<xsl:variable name="SIUInvolved" select="../../com.iso_SIUParty[@ClaimsParty2Ref = $CPId]/com.iso_SIUInvolved"/>
		<xsl:variable name="SIUNotPaid" select="../../com.iso_SIUParty[@ClaimsParty2Ref = $CPId]/com.iso_ClaimNotPaid"/>
		<xsl:variable name="SIUEnforceAction" select="../../com.iso_SIUParty[@ClaimsParty2Ref = $CPId]/com.iso_EnforcementActionSubject"/>
		<xsl:variable name="SIUFraudBureau" select="../../com.iso_SIUParty[@ClaimsParty2Ref = $CPId]/com.iso_CriteriaForFraudBureau"/>
		<xsl:variable name="SIUNICBAlert" select="../../com.iso_SIUParty[@ClaimsParty2Ref = $CPId]/com.iso_NICBAlert"/>
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
*	      Display_Matching_Casualty_Info Template
*
*			Builds the matching casualy Records  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Casualty_Info">
		<xsl:param name="ClaimsInjNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="AdjusterNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="ClaimsPayNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:variable name="MC01Id" select="$ClaimsInjNode/@id"/>
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
		<xsl:variable name="ClaimStatusCd" select="$ClaimsPayNode/ClaimsPaymentCovInfo/ClaimStatusCd"/>
		<xsl:if test="count($ClaimStatusCd) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
				<b><font size="2" face="Arial">
					Claim Status:
					</font></b>
				</td>
				<td align="left" >
					<font size="2" face="Arial">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ClaimStatusCds/*[@code=$ClaimStatusCd]"/>
					</font>
				</td>
			</tr>	
		</xsl:if>

		<xsl:variable name="MC02ClosedDt" select="$ClaimsInjNode/../ClaimsPartyInfo/ClosedDt[contains(@idref,$MC01Id)]"/>
		<xsl:if test="count($MC02ClosedDt) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
					<b>
						<font size="2" face="Arial">Date Claim Closed:</font>
					</b>
				</td>
				<td align="left">					
					<font size="2" face="Arial">
						<xsl:number value="substring($MC02ClosedDt,6,2)" format="01/"/>
						<xsl:number value="substring($MC02ClosedDt,9,2)" format="01/"/>
						<xsl:number value="substring($MC02ClosedDt,1,4)" format="0001"/>
					</font>
				</td>
			</tr>
		</xsl:if>
<!--*********************************** GAURAV : Updated for Date Claim Closed *********************************** -->

		<xsl:if test="string-length(normalize-space($AdjusterNode)) &gt; 0">
			<xsl:variable name="CoverageType" select="$AdjusterNode/CoverageCd"/>
			<xsl:variable name="LossType" select="$AdjusterNode/LossCauseCd"/>
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
						<xsl:number value="substring($AdjNum,4,3)" format="(001"/><xsl:number value="substring($AdjNum,8,3)" format=") 001-"/><xsl:number value="substring($AdjNum,11,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Alleged Injury / Property Damage</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimsInjNode/ClaimsInjury/InjuryNatureDesc"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="PartOfBodyCd" select="$ClaimsInjNode/ClaimsInjury/BodyPartCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Part of Body</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$PartOfBodyCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/BodyPartCds/*[@code=$PartOfBodyCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Nature of Injury</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimsInjNode/ICDDiagnosticCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Tort Threshold</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/LitigationInfo/ThresholdTypeCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="TortThresholdTypeCd" select="ClaimRoot/LitigationInfo/ThresholdTypeCd"/>
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
				<xsl:value-of select="$ClaimRoot/LitigationInfo/ThresholdStateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--<xsl:variable name="MC02SuitInd" select="$ClaimsInjNode/../ClaimsPartyInfo/SuitFiledInd"/>-->
		<xsl:variable name="MC02SuitInd" select="$ClaimsInjNode/../ClaimsPartyInfo/SuitFiledInd[@idref=$MC01Id]"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Suit filed?</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="$ClaimsInjNode/../ClaimsPartyInfo/SuitFiledInd"/>-->
				<xsl:if test="$MC02SuitInd=0">NO</xsl:if>
				<xsl:if test="$MC02SuitInd=1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MC02EstLoss" select="$ClaimRoot/ClaimsOccurrence/ProbableIncurredAmt[contains(@idref,$MC01Id)]/Amt"/><!--GAURAV : Updated Est. Loss Amt for idref. -->
		<xsl:if test="count($MC02EstLoss) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Estimated Loss</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$ClaimRoot/ClaimsOccurrence/ProbableIncurredAmt/Amt"/>-->
					<xsl:value-of select="format-number($MC02EstLoss, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="MC02ResAmt" select="$ClaimRoot/ClaimsPayment[@idref = $MC01Id][PaymentTypeCd = 'LossResv']/TotalPaymentAmt/Amt"/>
		<xsl:if test="count($MC02ResAmt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Reserve Amount</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$ClaimRoot/ClaimsPayment[@idref = $MC01Id][PaymentTypeCd = 'LossResv']/TotalPaymentAmt/Amt"/>-->
					<xsl:value-of select="format-number($MC02ResAmt, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		
		<!--
		<xsl:variable name="MC02SettleAmt" select="$ClaimsPayNode/TotalPaymentAmt/Amt"/>
		<xsl:if test="count($MC02SettleAmt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Settlement Amount</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="format-number($MC02SettleAmt, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		-->
		<xsl:variable name="MC02SettleAmt" select="$ClaimRoot/ClaimsPayment[@idref = $MC01Id][not(PaymentTypeCd = 'LossResv')]/TotalPaymentAmt/Amt"/>
		<xsl:if test="$MC02SettleAmt &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Settlement Amount</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="format-number($MC02SettleAmt, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>	
			
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $MC01Id]"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:variable name="MC02StartDt" select="$ClaimsInjNode/TimeLostPeriod/EffectiveDt"/>
		<xsl:if test="count($MC02StartDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Loss Time Start Date</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($MC02StartDt,6,2)" format="01/"/>
					<xsl:number value="substring($MC02StartDt,9,2)" format="01/"/>
					<xsl:number value="substring($MC02StartDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="MC02EndDt" select="$ClaimsInjNode/TimeLostPeriod/ExpirationDt"/>
		<xsl:if test="count($MC02EndDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Loss Time End Date</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($MC02EndDt,6,2)" format="01/"/>
					<xsl:number value="substring($MC02EndDt,9,2)" format="01/"/>
					<xsl:number value="substring($MC02EndDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		-->
		<xsl:variable name="MC02StartDt" select="$ClaimsInjNode/TimeLostPeriod/EffectiveDt"/>
		<xsl:variable name="MC02EndDt" select="$ClaimsInjNode/TimeLostPeriod/ExpirationDt"/>
		<xsl:if test="count($MC02StartDt) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
				<b><font size="2" face="Arial">
					Loss Time Start Date:
					</font></b>
				</td>
				<td align="left" >
					<font size="2" face="Arial">
					<xsl:number value="substring($MC02StartDt,6,2)" format="01/"/>
					<xsl:number value="substring($MC02StartDt,9,2)" format="01/"/>
					<xsl:number value="substring($MC02StartDt,1,4)" format="0001"/>
					</font>
					<xsl:if test="count($MC02EndDt) &gt;0">
						<b><font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						Loss Time End Date:
						</font></b>
						<font size="2" face="Arial">
							<xsl:number value="substring($MC02EndDt,6,2)" format="01/"/>
							<xsl:number value="substring($MC02EndDt,9,2)" format="01/"/>
							<xsl:number value="substring($MC02EndDt,1,4)" format="0001"/>
						</font>
					</xsl:if>
				</td>
			</tr>	
		</xsl:if>	
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Total Lost Days</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimsInjNode/TimeLostPeriod/DurationPeriod/NumUnits"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Court Filed</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/LitigationInfo/CourtName"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MC02CourtDt" select="$ClaimRoot/LitigationInfo/EventInfo[EventCd = 'SuitFiled']/EventDt"/>
	<xsl:if test="count($MC02CourtDt) &gt; 0">
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Court Filed Date</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/LitigationInfo/EventInfo[EventCd = 'SuitFiled']/EventDt"/>
				<xsl:number value="substring($MC02CourtDt,6,2)" format="01/"/>
				<xsl:number value="substring($MC02CourtDt,9,2)" format="01/"/>
				<xsl:number value="substring($MC02CourtDt,1,4)" format="0001"/>
			</xsl:with-param>
		</xsl:call-template>
	</xsl:if>
	-->
	<xsl:variable name="MC02CourtFiled" select="$ClaimRoot/LitigationInfo/CourtName"/>
		<xsl:variable name="MC02CourtDt" select="$ClaimRoot/LitigationInfo/EventInfo[EventCd = 'SuitFiled']/EventDt"/>
		<xsl:if test="count($MC02CourtFiled) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
				<b><font size="2" face="Arial">
					Court Filed:
					</font></b>
				</td>
				<td align="left" >
					<font size="2" face="Arial">
					<xsl:value-of select="$MC02CourtFiled"/>
					</font>
					<xsl:if test="count($MC02CourtDt) &gt;0">
						<b><font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						Court Filed Date:
						</font></b>
						<font size="2" face="Arial">
							<xsl:number value="substring($MC02CourtDt,6,2)" format="01/"/>
							<xsl:number value="substring($MC02CourtDt,9,2)" format="01/"/>
							<xsl:number value="substring($MC02CourtDt,1,4)" format="0001"/>
						</font>
					</xsl:if>
				</td>
			</tr>	
		</xsl:if>	
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_MP02 Template
*
*			Builds the matching property; building Records  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Property_Info">
		<xsl:param name="PropLossNode"/>
		<xsl:param name="ClaimsPartyNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="AdjusterNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="ClaimsPayNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:variable name="MP01Id" select="$PropLossNode/@id"/>
		<xsl:variable name="ChkMP02" select="$PropLossNode/ClaimsSubjectInsuranceInfo/SubjectInsuranceCd"/>
		<xsl:if test="count($ChkMP02) &gt;0">
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
				<b><font size="2" face="Arial">
					Claim Status:
					</font></b>
				</td>
				<td align="left" >
					<font size="2" face="Arial">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ClaimStatusCds/*[@code=$ClaimStatusCd]"/>
					</font>
				</td>
			</tr>	
		</xsl:if>

		<xsl:variable name="MP02DtClose" select="$ClaimsPartyNode/ClaimsPartyInfo/ClosedDt[contains(@idref,$MP01Id)]"/>
		<xsl:if test="count($MP02DtClose) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
					<b>
						<font size="2" face="Arial">Date Claim Closed:</font>
					</b>
				</td>
				<td align="left">					
					<font size="2" face="Arial">
						<xsl:number value="substring($MP02DtClose,6,2)" format="01/"/>
						<xsl:number value="substring($MP02DtClose,9,2)" format="01/"/>
						<xsl:number value="substring($MP02DtClose,1,4)" format="0001"/>
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
		<xsl:variable name="Adj_PhoneNum" select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>
		<xsl:if test="count($Adj_PhoneNum) &gt; 0">
			<xsl:call-template name="Insert_Adjuster">
				<xsl:with-param name="AdjusterPhone">
					<!--<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>-->
					<xsl:number value="substring($Adj_PhoneNum,4,3)" format="(001"/><xsl:number value="substring($Adj_PhoneNum,8,3)" format=") 001-"/><xsl:number value="substring($Adj_PhoneNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Mortgage  Loan Number</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimsPartyNode/ClaimsPartyInfo/AccountNumberId[@idref=$MP01Id]"/>
			</xsl:with-param>
		</xsl:call-template>
		<!--<xsl:variable name="SuiteInd" select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd"/>-->
		<xsl:variable name="SuiteInd" select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd[@idref=$MP01Id]"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Suit Indicator</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd"/>-->
				<xsl:if test="$SuiteInd=0">NO</xsl:if>
				<xsl:if test="$SuiteInd=1">YES</xsl:if>
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

		<!--<xsl:call-template name="Insert_PropLost">
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
		</xsl:call-template>-->
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
			<!--start08/07 -->
			<tr><td align="left" nowrap="nowrap" colspan="5">
			<table border="1" cellspacing="1" cellpadding="1"  bgcolor="#EFEFEF">
				<tr>
					
					<td align="center" nowrap="nowrap" width="100">&#160;</td>
					<td align="center" nowrap="nowrap"><font face="Arial" size="2"><b>Building</b></font></td>
					<td align="center" nowrap="nowrap"><font face="Arial" size="2"><b>Contents</b></font></td>
					<td align="center" nowrap="nowrap"><font face="Arial" size="2"><b>Occupancy</b></font></td>
					<td align="center" nowrap="nowrap"><font face="Arial" size="2"><b>Stock</b></font></td>
					<td align="center" nowrap="nowrap"><font face="Arial" size="2"><b>Other/Scheduled</b></font></td>
				</tr>
				<tr>
					<td align="left" nowrap="nowrap"><font face="Arial" size="2"><b>Policy</b></font></td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/InsuranceAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="PolicyBldAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/InsuranceAmt/Amt"/>
								<xsl:value-of select="format-number($PolicyBldAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/InsuranceAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/InsuranceAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="PolicyContAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/InsuranceAmt/Amt"/>
								<xsl:value-of select="format-number($PolicyContAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/InsuranceAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/InsuranceAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="PolicyOccAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/InsuranceAmt/Amt"/>
								<xsl:value-of select="format-number($PolicyOccAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/InsuranceAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/InsuranceAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="PolicyStckAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/InsuranceAmt/Amt"/>
								<xsl:value-of select="format-number($PolicyStckAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/InsuranceAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/InsuranceAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="PolicyOTAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/InsuranceAmt/Amt"/>
								<xsl:value-of select="format-number($PolicyOTAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/InsuranceAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
				</tr>
				<tr>
					<td align="left" nowrap="nowrap"><font face="Arial" size="2"><b>Estimated Loss</b></font></td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ProbableIncurredAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="LossBldAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ProbableIncurredAmt/Amt"/>
								<xsl:value-of select="format-number($LossBldAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ProbableIncurredAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ProbableIncurredAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="LossContAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ProbableIncurredAmt/Amt"/>
								<xsl:value-of select="format-number($LossContAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ProbableIncurredAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ProbableIncurredAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="LossOccAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ProbableIncurredAmt/Amt"/>
								<xsl:value-of select="format-number($LossOccAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ProbableIncurredAmt/Amt"/>-->
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
								<xsl:variable name="LossStckAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ProbableIncurredAmt/Amt"/>
								<xsl:value-of select="format-number($LossStckAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/ProbableIncurredAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ProbableIncurredAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="LossOTAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ProbableIncurredAmt/Amt"/>
								<xsl:value-of select="format-number($LossOTAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ProbableIncurredAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
				</tr>
				<tr>
					<td align="left" nowrap="nowrap"><font face="Arial" size="2"><b>Reserve</b></font></td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="ResBldAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
								<xsl:value-of select="format-number($ResBldAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="ResContAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
								<xsl:value-of select="format-number($ResContAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="ResOccAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
								<xsl:value-of select="format-number($ResOccAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="ResStckAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
								<xsl:value-of select="format-number($ResStckAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="ResOTAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
								<xsl:value-of select="format-number($ResOTAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'LossResv']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
				</tr>
				<tr>
					<td align="left" nowrap="nowrap"><font face="Arial" size="2"><b>Paid</b></font></td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="PaidBldAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
								<xsl:value-of select="format-number($PaidBldAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="PaidContAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
								<xsl:value-of select="format-number($PaidContAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="PaidOccAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
								<xsl:value-of select="format-number($PaidOccAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="PaidStckAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK' or SubjectInsuranceCd =	'Stock']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
								<xsl:value-of select="format-number($PaidStckAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					<td align="center" nowrap="nowrap">
						<xsl:choose>
							<xsl:when test="string-length($PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt) = 0">
								<xsl:value-of select="'--'"/>
							</xsl:when>
							<xsl:otherwise>
								<font face="Arial" size="2">
								<xsl:variable name="PaidOTAmt" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>
								<xsl:value-of select="format-number($PaidOTAmt, '###,###')"/>
								<!--<xsl:value-of select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/ClaimsPayment[PaymentTypeCd = 'Payment']/ClaimsPaymentCovInfo/PaymentAmt/Amt"/>-->
								</font>
							</xsl:otherwise>
						</xsl:choose>
					</td>
				</tr>
			</table>
			</td></tr>
			<!--end 08/07-->
			
		</xsl:if>
		<!--
		<xsl:variable name="PolicyBldgTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'BLDG']/InsuranceAmt/Amt"/>
		<xsl:variable name="PolicyCntTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'C']/InsuranceAmt/Amt"/>
		<xsl:variable name="PolicyOccTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'UseOccupancy']/InsuranceAmt/Amt"/>
		<xsl:variable name="PolicyStockTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'STOCK']/InsuranceAmt/Amt"/>
		<xsl:variable name="PolicyOtherTitle" select="$PropLossNode/ClaimsSubjectInsuranceInfo[SubjectInsuranceCd = 'OT']/InsuranceAmt/Amt"/>
		<xsl:if test="string-length(normalize-space($PolicyBldgTitle)) &gt; 0 or string-length(normalize-space($PolicyCntTitle)) &gt; 0 or string-length(normalize-space($PolicyOccTitle)) &gt; 0 or string-length(normalize-space($PolicyStockTitle)) &gt; 0 or string-length(normalize-space($PolicyOtherTitle)) &gt; 0 ">
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
		</xsl:if>
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
		</xsl:if>-->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Routing  Info</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $MP01Id]"/>
			</xsl:with-param>
		</xsl:call-template>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_MP04 Template
*
*			Display the matching boat, mobile equipment records
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Boat_Mobile_Property">
		<xsl:param name="PropLossNode"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:param name="ClaimsPartyNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="AdjusterNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="ClaimsPayNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:variable name="WaterCraftId" select="$PropLossNode/Watercraft/@id"/>
		<xsl:variable name="MobileId" select="$PropLossNode/ItemInfo/@id"/><!--Investigation Node = <xsl:value-of select="$InvestigationNode"/>-->
		<xsl:variable name="PropLossInfoId" select="$PropLossNode/@id"/>
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
		<xsl:variable name="Boat_PhoneNum" select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>
		<xsl:if test="count($Boat_PhoneNum) &gt; 0">
			<xsl:call-template name="Insert_Adjuster">
				<xsl:with-param name="AdjusterPhone">
					<!--<xsl:value-of select="$AdjusterNode/../GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>-->
					<xsl:number value="substring($Boat_PhoneNum,4,3)" format="(001"/><xsl:number value="substring($Boat_PhoneNum,8,3)" format=") 001-"/><xsl:number value="substring($Boat_PhoneNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="SuiteInd" select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Suit Indicator</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd"/>-->
				<xsl:if test="$SuiteInd=0">NO</xsl:if>
				<xsl:if test="$SuiteInd=1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $WaterCraftId or @idref = $MobileId]"/>
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
		<xsl:variable name="BoatMfg" select="$PropLossNode/Watercraft/ItemDefinition	[ItemTypeCd = 'Watercraft']/Manufacturer" />
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
			<xsl:with-param name="Data_Name">Boat Length</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/Length/NumUnits"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Primary Propulsion</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/PropulsionTypeCd"/>
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
		<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
			<xsl:with-param name="Data_Name">HIN</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/SerialIdNumber"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Value_ID">
				<xsl:value-of select="$PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/SerialIdNumber/@id"/>
			</xsl:with-param>
		</xsl:call-template>
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = PropLossNode/Watercraft/ItemDefinition[ItemTypeCd = 'Watercraft']/SerialIdNumber/@id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'HIN'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->	
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
		<xsl:if test="count($PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']) &gt; 0">
			<xsl:call-template name="Insert_SmallHeader">
				<xsl:with-param name="Data_Name">Mobile Equipment Information</xsl:with-param>
				<xsl:with-param name="Data_Value"/>
			</xsl:call-template>
		</xsl:if>	
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
		<xsl:variable name="ChkVIN" select="$InvestigationNode/ValidVINInd"/>
		<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
			<xsl:with-param name="Data_Name">VIN</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/SerialIdNumber"/>
				<xsl:if test="$ChkVIN =0 "> (Fail)</xsl:if>
				<xsl:if test="$ChkVIN =1 "> (Pass)</xsl:if>
			</xsl:with-param>
			<xsl:with-param name="Data_Value_ID">
				<xsl:value-of select="$PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/SerialIdNumber/id"/>
			</xsl:with-param>
		</xsl:call-template>
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = PropLossNode/ItemInfo/ItemDefinition[ItemTypeCd = 'MoblEquip']/SerialIdNumber/id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'VIN'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->	
		<!--
		<xsl:call-template name="Insert_Data">
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
				<xsl:if test="$ChkVIN =0 ">NO</xsl:if>
				<xsl:if test="$ChkVIN =1 ">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		-->
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
		<xsl:variable name="TheftType" select="$InvestigationNode/com.iso_TheftTypeInd"/>
		<xsl:if test="count($TheftType) &gt; 0">
			<xsl:call-template name="Insert_SmallHeader">
				<xsl:with-param name="Data_Name">Theft Information</xsl:with-param>
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
		</xsl:if>		
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Matching_Vehicle_InfoTemplate
*
*			Display the matching vehicle claim records
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Vehicle_Info">
		<xsl:param name="VehLossNode"/>
		<xsl:param name="ClaimPartyNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:param name="ClaimsPartyId"/>
		<xsl:param name="AdjusterNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="ClaimsPayNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:variable name="MV01Id" select="$VehLossNode/@id"/>
		<xsl:call-template name="Insert_Header">
			<xsl:with-param name="Data_Name">Vehicle Coverage Information</xsl:with-param>
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
		<xsl:variable name="ClaimStatusCd" select="$ClaimRoot/ClaimsPayment/ClaimsPaymentCovInfo/ClaimStatusCd"/>
		<xsl:if test="count($ClaimStatusCd) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
				<b><font size="2" face="Arial">
					Claim Status:
					</font></b>
				</td>
				<td align="left" >
					<font size="2" face="Arial">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ClaimStatusCds/*[@code=$ClaimStatusCd]"/>
					</font>
				</td>
			</tr>	
		</xsl:if>
		
		<xsl:variable name="MV02CloseDt" select="$ClaimPartyNode/ClaimsPartyInfo/ClosedDt[contains(@idref,$MV01Id)]"/>
		<xsl:if test="count($MV02CloseDt) &gt;0">
			<tr>
				<td align="left">&#160;&#160;
					<b>
						<font size="2" face="Arial">Date Claim Closed:</font>
					</b>
				</td>
				<td align="left">					
					<font size="2" face="Arial">
						<xsl:number value="substring($MV02CloseDt,6,2)" format="01/"/>
						<xsl:number value="substring($MV02CloseDt,9,2)" format="01/"/>
						<xsl:number value="substring($MV02CloseDt,1,4)" format="0001"/>
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
					<xsl:number value="substring($AdjNum,4,3)" format="(001"/><xsl:number value="substring($AdjNum,8,3)" format=") 001-"/><xsl:number value="substring($AdjNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="ChkVIN" select="$InvestigationNode/ValidVINInd"/>
		<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
			<xsl:with-param name="Data_Name">VIN</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/VehIdentificationNumber"/>
				<xsl:if test="$ChkVIN =0 "> (Fail)</xsl:if>
				<xsl:if test="$ChkVIN =1 "> (Pass)</xsl:if>
			</xsl:with-param>
			<xsl:with-param name="Data_Value_ID">
				<xsl:value-of select="$VehLossNode/VehInfo/VehIdentificationNumber/@id"/>
			</xsl:with-param>
		</xsl:call-template>
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = VehLossNode/VehInfo/VehIdentificationNumber/@id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'VIN'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->	
		<xsl:variable name="MV02EDR" select="$VehLossNode/com.iso_EDRInd"/>
		<xsl:if test="string-length(normalize-space($MV02EDR)) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Event Data Recorder</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:if test="$MV02EDR=0">NO</xsl:if>
					<xsl:if test="$MV02EDR &gt; 0">YES</xsl:if>
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
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Vehicle Type</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/VehTypeCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
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
		<!--
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Vehicle Color</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/ColorCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<xsl:variable name="VehColorCd" select="$VehLossNode/VehInfo/ColorCd"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Vehicle Color</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$VehColorCd"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/ColorCds/*[@code=$VehColorCd]"/>
			</xsl:with-param>
		</xsl:call-template>
		
		<!--
		<xsl:variable name="ChkVIN" select="$InvestigationNode/ValidVINInd"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">VIN Validation</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:if test="$ChkVIN =0 ">NO</xsl:if>
				<xsl:if test="$ChkVIN =1 ">YES</xsl:if>
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
			<xsl:with-param name="Data_Name">License Type</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/Registration/RegistrationTypeCd"/>
			</xsl:with-param>
		</xsl:call-template>
		-->
		<!--
		<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
			<xsl:with-param name="Data_Name">License Plate</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/Registration/RegistrationNumber"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Value_ID">
				<xsl:value-of select="$VehLossNode/VehInfo/Registration/RegistrationNumber/@id"/>
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
				<b><font size="2" face="Arial">
					License Plate:
					</font></b>
				</td>
				<td align="left" colspan="1" >
				<font size="2" face="Arial">
					<xsl:value-of select="$LicNum"/>
				</font>
				<xsl:if test="count($LicSt) &gt; 0">
					<b><font size="2" face="Arial">
					&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
					&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
					License Plate State:
					</font></b>
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
		<xsl:variable name="SuiteInd" select="$ClaimPartyNode/ClaimsPartyInfo/SuitFiledInd[@idref=$MV01Id]"/>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Suit Indicator</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<!--<xsl:value-of select="$ClaimsPartyNode/ClaimsPartyInfo/SuitFiledInd"/>-->
				<xsl:if test="$SuiteInd=0">NO</xsl:if>
				<xsl:if test="$SuiteInd=1">YES</xsl:if>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="MV02EstLoss" select="$ClaimRoot/ClaimsOccurrence/ProbableIncurredAmt[contains(@idref,$MV01Id)]/Amt"/> <!--GAURAV : Updated Est. Loss Amt for idref. -->
		<xsl:if test="count($MV02EstLoss) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Estimated Loss</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$ClaimRoot/ClaimsOccurrence/ProbableIncurredAmt/Amt"/>-->
					<xsl:value-of select="format-number($MV02EstLoss, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="MV02ResLoss" select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id and PaymentTypeCd = 'LossResv']/TotalPaymentAmt/Amt"/>
		<xsl:if test="count($MV02ResLoss) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Reserve Amount</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id and PaymentTypeCd = 'LossResv']/TotalPaymentAmt/Amt"/>-->
					<xsl:value-of select="format-number($MV02ResLoss, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		
		<!--
		<xsl:variable name="MV02SettleLoss" select="$ClaimsPayNode/TotalPaymentAmt/Amt"/>
		<xsl:if test="count($MV02SettleLoss) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Settlement Amount</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="format-number($MV02SettleLoss, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		-->
		<xsl:variable name="MV02SettleLoss" select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id]/TotalPaymentAmt/Amt"/>
		<xsl:if test="$MV02SettleLoss &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Settlement Amount</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="format-number($MV02SettleLoss, '###,###')"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>			
		
	<!-- commented on 03/14/2006
	<xsl:variable name="MV02RecoveryDt" select="$InvestigationNode/RecoveryInfo/RecoveryDt"/>
	<xsl:if test="string-length(normalize-space($MV02RecoveryDt)) &gt; 0">
		<xsl:call-template name="Insert_SmallHeader">
			<xsl:with-param name="Data_Name">Theft Recovery Information</xsl:with-param>
		</xsl:call-template>
	</xsl:if>
	<xsl:if test="count($MV02RecoveryDt) &gt; 0">
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Date of Recovery</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:number value="substring($MV02RecoveryDt,6,2)" format="01/"/>
				<xsl:number value="substring($MV02RecoveryDt,9,2)" format="01/"/>
				<xsl:number value="substring($MV02RecoveryDt,1,4)" format="0001"/>
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
				<xsl:value-of select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']/GeneralPartyInfo/Addr/City"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Recovery Location State</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']/GeneralPartyInfo/Addr/StateProvCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Recovery Location Country</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$InvestigationNode/RecoveryInfo/Addr/CountryCd"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="Rec_PhoneNum" select="$InvestigationNode/RecoveryInfo/Communications/PhoneInfo/PhoneNumber"/>
		<xsl:if test="count($Rec_PhoneNum) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovery Location Phone</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:number value="substring($Rec_PhoneNum,4,3)" format="(001"/><xsl:number value="substring($Rec_PhoneNum,8,3)" format=") 001-"/><xsl:number value="substring($Rec_PhoneNum,11,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:variable name="RecoveryCond" select="$InvestigationNode/RecoveryInfo/RecoveryStatusCd[not(@codelistref)]"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Condition of Recovered Vehicle</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$RecoveryCond"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/RecoveryConditionCds/*[@code=$RecoveryCond]"/>
			</xsl:with-param>
		</xsl:call-template>	
		<xsl:variable name="RecoveryClass" select="$InvestigationNode/RecoveryInfo/RecoveryStatusCd[@codelistref]"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Recovery Classification</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$RecoveryClass"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/RecoveryClassificationCds/*[@code=$RecoveryClass]"/>
			</xsl:with-param>
		</xsl:call-template>	
		end theft recory-->
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Routing Info</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $MV01Id]"/>
			</xsl:with-param>
		</xsl:call-template>
	</xsl:template>
		<!--
*********************************************************************************
*	 
*	      Display_Matching_Vehicle_Recovery Template
*
*			Displays matching vehicle recovery records.
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Vehicle_Recovery">
		<xsl:param name="VehLossNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:variable name="RecoveryAgencyRef" select="$InvestigationNode/RecoveryInfo/@RecoveryAgencyRef"/>
		<xsl:variable name="RecoveryAgencyParty" select="$ClaimRoot/ClaimsParty[@id = $RecoveryAgencyRef and ClaimsPartyInfo/ClaimsPartyRoleCd = 'RecoveringAgency']"/>

<!-- check to see if we have vehicle recovery info, if there is, it is displayed -->
		<xsl:if test="string-length(normalize-space($InvestigationNode/RecoveryInfo/@ItemRef)) &gt; 0">
			
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Vehicle Recovery Information</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Claim Number</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/ClaimsOccurrence/ItemIdInfo/InsurerId"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="ChkVIN" select="$InvestigationNode/ValidVINInd"/>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">VIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$VehLossNode/VehInfo/VehIdentificationNumber"/>
					<xsl:if test="$ChkVIN =0 "> (Fail)</xsl:if>
					<xsl:if test="$ChkVIN =1 "> (Pass)</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
			<!--
			<xsl:call-template name="Insert_Data">
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
					<xsl:if test="$ChkVIN =0 ">NO</xsl:if>
					<xsl:if test="$ChkVIN =1 ">YES</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
			-->
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Vehicle</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$VehLossNode/VehInfo/ModelYear"/>&#160;
					<xsl:value-of select="$VehLossNode/VehInfo/Manufacturer"/>&#160;
					<xsl:value-of select="$VehLossNode/VehInfo/Model"/>
				</xsl:with-param>
			</xsl:call-template>
			<!--
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
			<xsl:variable name="MV03TheftDt" select="$InvestigationNode/AutoInvestigationInfo/EventInfo[EventCd = 'Theft']/EventDt"/>
		<xsl:if test="count($MV03TheftDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Date of Theft</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$VehLossNode/AutoInvestigationInfo/EventInfo[EventCd = 'Theft']/EventDt"/>-->
					<xsl:number value="substring($MV03TheftDt,6,2)" format="01/"/>
					<xsl:number value="substring($MV03TheftDt,9,2)" format="01/"/>
					<xsl:number value="substring($MV03TheftDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
			<xsl:variable name="MV03RecoveryDt" select="$InvestigationNode/RecoveryInfo/RecoveryDt"/>
		<xsl:if test="count($MV03RecoveryDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Date of Recovery</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$InvestigationNode/RecoveryInfo/RecoveryDt"/>-->
					<xsl:number value="substring($MV03RecoveryDt,6,2)" format="01/"/>
					<xsl:number value="substring($MV03RecoveryDt,9,2)" format="01/"/>
					<xsl:number value="substring($MV03RecoveryDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovering Agency</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$RecoveryAgencyParty/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Agency City</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$RecoveryAgencyParty/GeneralPartyInfo/Addr/City"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Agency State</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$RecoveryAgencyParty/GeneralPartyInfo/Addr/StateProvCd"/>
				</xsl:with-param>
			</xsl:call-template>
			<!--commented 0n 03/14/2006
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovering Location</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/RecoveryInfo/RecoveryLocDesc"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovering Location Country</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/RecoveryInfo/Addr/CountryCd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="Rec_PhoneNum" select="$InvestigationNode/InvestigationInfo/RecoveryInfo/Communications/PhoneInfo/PhoneNumber "/>
			<xsl:if test="count($Rec_PhoneNum) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Location Phone</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:number value="substring($Rec_PhoneNum,4,3)" format="(001"/><xsl:number value="substring($Rec_PhoneNum,8,3)" format=") 001-"/><xsl:number value="substring($Rec_PhoneNum,11,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Vehicle Ref. Number</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$VehLossNode/InventoryNumberId"/>
				</xsl:with-param>
			</xsl:call-template>
			-->
			<!--
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Recovered Vehicle Condition</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/RecoveryInfo/RecoveryStatusCd"/>
				</xsl:with-param>
			</xsl:call-template>
			-->
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
			<xsl:variable name="RecoveryCond" select="$InvestigationNode/RecoveryInfo/RecoveryStatusCd[not(@codelistref)]"/>
			<xsl:call-template name="Insert_Data_Using_Code_List">
				<xsl:with-param name="Data_Name">Recovered Vehicle Condition</xsl:with-param>
				<xsl:with-param name="Data_Code">
					<xsl:value-of select="$RecoveryCond"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Code_Value">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/RecoveryConditionCds/*[@code=$RecoveryCond]"/>
				</xsl:with-param>
			</xsl:call-template>	

			<!--
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Canned Recovery Code</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/RecoveryInfo/RecoveryStatusCd"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Miscellaneous Text</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $VehLossNode/@id]"/>
				</xsl:with-param>
			</xsl:call-template>
			-->
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Matching_Vehicle_Shipping Template
*
*			Displays matching vehicle shipping records.
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Vehicle_Shipping">
		<xsl:param name="VehLossNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="InvestigationNode"/>

<!-- check to see if we have vehicle shipping info, if there is, it is displayed -->
		<xsl:if test="string-length(normalize-space($InvestigationNode/AutoInvestigationInfo/ShippedConditionDesc)) &gt; 0 or string-length(normalize-space($InvestigationNode/AutoInvestigationInfo/EventInfo[EventCd = 'Shipping']/EventDt)) &gt; 0 ">
	
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Vehicle Export Information</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="MV04EventDt" select="$InvestigationNode/AutoInvestigationInfo/EventInfo[EventCd = 'Shipping']/EventDt"/>
	<xsl:if test="count($MV04EventDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Shipping/Invoice Date</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$InvestigationNode/AutoInvestigationInfo/EventInfo[EventCd = 'Shipping']/EventDt"/>-->
					<xsl:number value="substring($MV04EventDt,6,2)" format="01/"/>
					<xsl:number value="substring($MV04EventDt,9,2)" format="01/"/>
					<xsl:number value="substring($MV04EventDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">VIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$VehLossNode/VehInfo/VehIdentificationNumber"/>
				</xsl:with-param>
			</xsl:call-template>
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
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Tag Status</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InvestigationNode/AutoInvestigationInfo/ShippedConditionDesc"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Matching_Vehicle_Impound Template
*
*			Displays matching vehicle impound records.
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Vehicle_Impound">
		<xsl:param name="VehLossNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:variable name="MV01Id" select="AutoLossInfo/@id"/>
		<!-- check to see if we have vehicle impound info, if there is, it is displayed -->
		<xsl:if test="InvestigationInfo/AutoInvestigationInfo/EventInfo/EventCd = 'Impound'">
			<!--
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Vehicle Impound  Information</xsl:with-param>
			</xsl:call-template>
		
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">ClaimSearch Identifier</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="ClaimsOccurrence/ItemIdInfo/AgencyId"/>
				</xsl:with-param>
			</xsl:call-template>
			-->
			<xsl:variable name="MA03ImpoundDt" select="InvestigationInfo/AutoInvestigationInfo/EventInfo[EventCd = 'Impound']/EventDt"/>
			<xsl:if test="count($MA03ImpoundDt) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Impound Date</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<!--<xsl:value-of select="$InvestigationNode/AutoInvestigationInfo/EventInfo[EventCd = 'Impound']/EventDt"/>-->
						<xsl:number value="substring($MA03ImpoundDt,6,2)" format="01/"/>
						<xsl:number value="substring($MA03ImpoundDt,9,2)" format="01/"/>
						<xsl:number value="substring($MA03ImpoundDt,1,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:variable name="ChkVIN" select="InvestigationInfo/ValidVINInd"/>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">VIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="AutoLossInfo/VehInfo/VehIdentificationNumber"/>
					<xsl:if test="$ChkVIN =0 "> (Fail)</xsl:if>
					<xsl:if test="$ChkVIN =1 "> (Pass)</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Vehicle</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="AutoLossInfo/VehInfo/ModelYear"/>&#160;<xsl:value-of select="AutoLossInfo/VehInfo/Manufacturer"/>&#160;<xsl:value-of select="AutoLossInfo/VehInfo/Model"/>
				</xsl:with-param>
			</xsl:call-template>
			<!--
			<xsl:call-template name="Insert_Data">
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
					<xsl:if test="$ChkVIN =0 ">NO</xsl:if>
					<xsl:if test="$ChkVIN =1 ">YES</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
			-->
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
				<xsl:with-param name="Data_Name">License Plate</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="AutoLossInfo/VehInfo/Registration/RegistrationNumber"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">License Plate State</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="AutoLossInfo/VehInfo/Registration/StateProvCd"/>
				</xsl:with-param>
			</xsl:call-template>
			-->
		<xsl:variable name="LicNum" select="AutoLossInfo/VehInfo/Registration/RegistrationNumber"/>
		<xsl:variable name="LicSt" select="AutoLossInfo/VehInfo/Registration/StateProvCd"/>
		<xsl:if test="count($LicNum) &gt; 0">
			<tr>
				<td align="left" colspan="1">&#160;&#160;
				<b><font size="2" face="Arial">
					License Plate:
					</font></b>
				</td>
				<td align="left" colspan="1" >
				<font size="2" face="Arial">
					<xsl:value-of select="$LicNum"/>
				</font>
				<xsl:if test="count($LicSt) &gt; 0">
					<b><font size="2" face="Arial">
					&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
					&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
					License Plate State:
					</font></b>
					<font size="2" face="Arial">
					<xsl:value-of select="$LicSt"/>
					</font>
				</xsl:if>
				</td>
			</tr>			
		</xsl:if>

			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Impound Location</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 	'ImpoundFac']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="Loc_PhoneNum" select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 	'ImpoundFac']/GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>
			<xsl:if test="count($Loc_PhoneNum) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Location Phone</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<!--<xsl:value-of select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 	'ImpoundFac']/GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>-->
						<xsl:number value="substring($Loc_PhoneNum,4,3)" format="(001"/>
						<xsl:number value="substring($Loc_PhoneNum,8,3)" format=") 001-"/>
						<xsl:number value="substring($Loc_PhoneNum,11,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Impound Agency</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 	'ImpoundAgcy']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="AgencyNum" select="/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 	'ImpoundAgcy']/GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>
			<xsl:if test="count($AgencyNum) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Impound Agency Phone</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<!--<xsl:value-of select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 	'ImpoundAgcy']/GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>-->
						<xsl:number value="substring($AgencyNum,4,3)" format="(001"/>
						<xsl:number value="substring($AgencyNum,8,3)" format=") 001-"/>
						<xsl:number value="substring($AgencyNum,11,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Reference Number</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="AutoLossInfo/InventoryNumberId"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Miscellaneous Text</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="RemarkText[@idref = $MV01Id]"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Police Agency Case Number</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="InvestigationInfo/AutoInvestigationInfo/com.iso_PoliceReportNo"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Additional Impound Information</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="InvestigationInfo/AutoInvestigationInfo/com.iso_ImpoundInfo"/>
				</xsl:with-param>
			</xsl:call-template>

		</xsl:if>
	</xsl:template>
	
	<!--
*********************************************************************************
*	 
*	      Display_Matching_Vehicle_Export Template
*
*			Displays matching vehicle export records.
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Vehicle_Export">
		<xsl:param name="VehLossNode"/>
		<!--<xsl:param name="ClaimRoot"/>-->
		<xsl:param name="InvestigationNode"/>
		<!--<xsl:variable name="PortOfOriginRef" select="InvestigationInfo/AutoInvestigationInfo/@PortOriginRef"/>-->
		<xsl:variable name="PortOfOriginRefid" select="InvestigationInfo/AutoInvestigationInfo/@PortOriginRef"/>
<xsl:variable name="PortOfOriginRef" select="InvestigationInfo/AutoInvestigationInfo/EventInfo/EventCd"/>
<!-- check to see if we have vehicle export info, if there is, it is displayed -->
		<!--<xsl:if test="string-length(normalize-space($PortOfOriginRef)) &gt; 0">-->
		<xsl:if test="$PortOfOriginRef = 'Export'">
			<!--
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Vehicle Export Information</xsl:with-param>
			</xsl:call-template>
			-->
			<!--
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">ClaimSearch Identifier</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="ClaimsOccurrence/ItemIdInfo/AgencyId"/>
				</xsl:with-param>
			</xsl:call-template>
			-->
			<xsl:variable name="MV06ExportDt" select="InvestigationInfo/AutoInvestigationInfo/EventInfo[EventCd='Export']/EventDt"/>
		<xsl:if test="count($MV06ExportDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Export Date</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$InvestigationNode/AutoInvestigationInfo/EventInfo[EventCd='Export']/EventDt"/>-->
					<xsl:number value="substring($MV06ExportDt,6,2)" format="01/"/>
					<xsl:number value="substring($MV06ExportDt,9,2)" format="01/"/>
					<xsl:number value="substring($MV06ExportDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Port Name</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="ClaimsParty[@id = $PortOfOriginRefid and ClaimsPartyInfo/ClaimsPartyRoleCd = 'PortOrigin']"/>-->
					<xsl:value-of select="ClaimsParty[@id = $PortOfOriginRefid]/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Destination</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="InvestigationInfo/AutoInvestigationInfo/DeliveryDestinationDesc"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">VIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="AutoLossInfo/VehInfo/VehIdentificationNumber"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Vehicle</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="AutoLossInfo/VehInfo/ModelYear"/>&#160;<xsl:value-of select="AutoLossInfo/VehInfo/Manufacturer"/>&#160;<xsl:value-of select="AutoLossInfo/VehInfo/Model"/>
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
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Matching_Vehicle_Claim Template
*
*			Displays matching vehicle Claim records.
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Vehicle_Claim">
		<xsl:param name="VehLossNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:variable name="AppraiserRef" select="$InvestigationNode/AppraiserActivityInfo"/>
		<xsl:variable name="InsuredRef" select="$ClaimRoot/ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'IN']"/>

		<!-- check to see if we have vehicle export info, if there is, it is displayed -->
		<xsl:if test="string-length(normalize-space($AppraiserRef)) &gt; 0">

			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Vehicle Claim Information</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">ClaimSearch Identifier</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/ClaimsOccurrence/ItemIdInfo/AgencyId"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Activity Type</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$AppraiserRef/AppraiserActivityDt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="MV07ActivityDt" select="$AppraiserRef/AppraiserActivityCd"/>
		<xsl:if test="count($MV07ActivityDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Activity Date</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$AppraiserRef/AppraiserActivityCd"/>-->
					<xsl:number value="substring($MV07ActivityDt,6,2)" format="01/"/>
					<xsl:number value="substring($MV07ActivityDt,9,2)" format="01/"/>
					<xsl:number value="substring($MV07ActivityDt,1,4)" format="0001"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Insuring Company</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 	'CarrierInsurer']/GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="Veh_ContactNum" select="$ClaimRoot/Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 	'CarrierInsurer']/GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>
			<xsl:if test="count($Veh_ContactNum) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Contact Phone</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<!--<xsl:value-of select="$ClaimRoot/Policy/MiscParty[MiscPartyInfo/MiscPartyRoleCd= 	'CarrierInsurer']/GeneralPartyInfo/Communications/PhoneInfo/PhoneNumber"/>-->
						<xsl:number value="substring($Veh_ContactNum,4,3)" format="(001"/><xsl:number value="substring($Veh_ContactNum,8,3)" format=") 001-"/><xsl:number value="substring($Veh_ContactNum,11,4)" format="0001"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Policy Number</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/Policy/PolicyNumber"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="PolicyTypeCd" select="$ClaimRoot/Policy/LOBCd"/>
			<xsl:call-template name="Insert_Data_Using_Code_List">
				<xsl:with-param name="Data_Name">Policy Type</xsl:with-param>
				<xsl:with-param name="Data_Code">
					<xsl:value-of select="$PolicyTypeCd"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Code_Value">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/POLICY-TYPES/*[@code=$PolicyTypeCd]"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Claim Number</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/ClaimsOccurrence/ItemIdInfo/InsurerId"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="Coverage" select="$ClaimRoot/Policy/Loss/CoverageCd"/>
			<xsl:call-template name="Insert_Data_Using_Code_List">
				<xsl:with-param name="Data_Name">Coverage Type</xsl:with-param>
				<xsl:with-param name="Data_Code">
					<xsl:value-of select="$Coverage"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Code_Value">
					<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/COVERAGE-TYPES/*[@code=$Coverage]"/>
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
			<xsl:variable name="ChkVIN" select="$InvestigationNode/ValidVINInd"/>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">VIN</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$VehLossNode/VehInfo/VehIdentificationNumber"/>
					<xsl:if test="$ChkVIN =0 "> (Fail)</xsl:if>
					<xsl:if test="$ChkVIN =1 "> (Pass)</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Vehicle</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$VehLossNode/VehInfo/ModelYear"/>&#160;<xsl:value-of select="$VehLossNode/VehInfo/Manufacturer"/>&#160;<xsl:value-of select="$VehLossNode/VehInfo/Model"/>
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
					<xsl:if test="$ChkVIN =0 ">NO</xsl:if>
					<xsl:if test="$ChkVIN =1 ">YES</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
		-->
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
					<b><font size="2" face="Arial">
						License Plate:
						</font></b>
					</td>
					<td align="left" colspan="1" >
					<font size="2" face="Arial">
						<xsl:value-of select="$LicNum"/>
					</font>
					<xsl:if test="count($LicSt) &gt; 0">
						<b><font size="2" face="Arial">
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						License Plate State:
						</font></b>
						<font size="2" face="Arial">
						<xsl:value-of select="$LicSt"/>
						</font>
					</xsl:if>
					</td>
				</tr>			
			</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Vehicle Odometer Reading</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$VehLossNode/VehInfo/PersVehInfo/OdometerReading/NumUnits"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Claim Amount</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$AppraiserRef/AppraisedValueAmt/Amt"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Insured Last Name</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InsuredRef/GeneralPartyInfo/NameInfo/PersonName/Surname"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Insured First Name</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InsuredRef/GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Insured Middle Name</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$InsuredRef/GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>

	</xsl:template>	
<!--
*********************************************************************************
*	 
*	      Display_Matching_Vehicle_Salvage Template
*
*			Displays matching vehicle salvage records.
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Vehicle_Salvage">
		<xsl:param name="VehLossNode"/>
		<xsl:param name="BuyerNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="InvestigationNode"/>
		<xsl:variable name="MV08Id" select="$ClaimRoot/InvestigationInfo/SalvageInfo/@BuyerRef"/>
		
		<xsl:if test="string-length(normalize-space($MV08Id)) &gt; 0">
	
			<xsl:call-template name="Insert_Header">
				<xsl:with-param name="Data_Name">Vehicle Salvage Information</xsl:with-param>
			</xsl:call-template>
			<xsl:variable name="ChkVIN" select="$InvestigationNode/ValidVINInd"/>
			<xsl:call-template name="Insert_Data_And_Check_For_More_Matches">
			<xsl:with-param name="Data_Name">VIN</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$VehLossNode/VehInfo/VehIdentificationNumber"/>
				<xsl:if test="$ChkVIN =0 "> (Fail)</xsl:if>
				<xsl:if test="$ChkVIN =1 "> (Pass)</xsl:if>
			</xsl:with-param>
			<xsl:with-param name="Data_Value_ID">
				<xsl:value-of select="$VehLossNode/VehInfo/VehIdentificationNumber/@id"/>
			</xsl:with-param>
		</xsl:call-template>
			<!-- GAURAV : Added to Insert More Matches-->
				<xsl:if test="../../MatchInfo/AdditionalMatchInfo/@idref = VehLossNode/VehInfo/VehIdentificationNumber/@id">
					<xsl:call-template name="Insert_More_Matches">
						<xsl:with-param name="Match_Desc">
							<xsl:value-of select="'VIN'"/>
						</xsl:with-param>
					</xsl:call-template>				
				</xsl:if>
			<!-- GAURAV : Added to Insert More Matches-->	
		<!--
		<xsl:call-template name="Insert_Data">
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
					<xsl:if test="$ChkVIN =0 ">NO</xsl:if>
					<xsl:if test="$ChkVIN =1 ">YES</xsl:if>
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
			<xsl:variable name="MV09SalDt" select="$InvestigationNode/SalvageInfo/SalvageDt"/>
		<xsl:if test="count($MV09SalDt) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Date of Salvage</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="$InvestigationNode/SalvageInfo/SalvageDt"/>-->
					<xsl:number value="substring($MV09SalDt,6,2)" format="01/"/>
					<xsl:number value="substring($MV09SalDt,9,2)" format="01/"/>
					<xsl:number value="substring($MV09SalDt,1,4)" format="0001"/>
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
			<xsl:if test="string-length(normalize-space($BuyerNode)) &gt; 0">
				<xsl:call-template name="Insert_SmallHeader">
					<xsl:with-param name="Data_Name">Buyer Information</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
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
				<xsl:variable name="Veh_BusinessNum" select="$BuyerNode/GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and 	CommunicationUseCd = 'Business']/PhoneNumber"/>
				<xsl:if test="count($Veh_BusinessNum) &gt; 0">
					<xsl:call-template name="Insert_Data">
						<xsl:with-param name="Data_Name">Business Phone</xsl:with-param>
						<xsl:with-param name="Data_Value">
							<!--<xsl:value-of select="$BuyerNode/GeneralPartyInfo/Communications/PhoneInfo[PhoneTypeCd = 'Phone' and 	CommunicationUseCd = 'Business']/PhoneNumber"/>-->
							<xsl:number value="substring($Veh_BusinessNum,4,3)" format="(001"/><xsl:number value="substring($Veh_BusinessNum,8,3)" format=") 001-"/><xsl:number value="substring($Veh_BusinessNum,11,4)" format="0001"/>
						</xsl:with-param>
					</xsl:call-template>
				</xsl:if>
			</xsl:if>
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">Routing  Info</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$ClaimRoot/RemarkText[@idref = $MV08Id]"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Display_Matching_Water_Mobile_Salvage Template
*
*			Display matching boat/mobile equipment Salvage records
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Water_Mobile_Salvage">
		<xsl:param name="PropLossNode"/>
		
		<xsl:param name="ClaimsPartyNode"/>
		<xsl:param name="BuyerNode"/>
		<xsl:param name="ClaimRoot"/>
		<xsl:param name="AdjusterNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:param name="ClaimsPayNode" select="$ClaimRoot/DefaultEmptyNode"/>
		<xsl:variable name="WaterCraftId" select="$PropLossNode/Watercraft/@id"/>
		<xsl:variable name="MobileId" select="$PropLossNode/ItemInfo/@id"/>
		<xsl:variable name="MP09Id" select="InvestigationInfo/SalvageInfo/@id"/>
		<xsl:variable name="MP09SalDt" select="$ClaimRoot/InvestigationInfo/SalvageInfo/SalvageDt"/>
	<xsl:if test="count($MP09SalDt) &gt; 0">
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
		
	<xsl:if test="count($MP09SalDt) &gt; 0">
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Date of Salvage</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:number value="substring($MP09SalDt,6,2)" format="01/"/>
				<xsl:number value="substring($MP09SalDt,9,2)" format="01/"/>
				<xsl:number value="substring($MP09SalDt,1,4)" format="0001"/>
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
						<xsl:number value="substring($BusinessNum,4,3)" format="(001"/><xsl:number value="substring($BusinessNum,8,3)" format=") 001-"/><xsl:number value="substring($BusinessNum,11,4)" format="0001"/>
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
	
</xsl:stylesheet>
