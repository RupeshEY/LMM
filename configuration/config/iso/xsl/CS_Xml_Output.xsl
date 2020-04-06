<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:iso="http://iso.com" xmlns:msxsl="urn:schemas-microsoft-com:xslt" extension-element-prefixes="iso msxsl">
	<xsl:include href="Display_Initial_Records.xsl"/>
	<xsl:include href="Display_Matching_Records.xsl"/>
	<xsl:include href="Helper_Functions.xsl"/>
	<xsl:variable name="xmlCodeList" select="document('./ClaimsearchCodeList.xml')"/>
	<xsl:variable name="ISORecDt" select="ClaimInvestigationAddRs/ClaimsOccurrence/com.iso_ReceiveDt"/>
	<xsl:variable name="imgBase" select="substring-before(substring-after(processing-instruction('xml-stylesheet'), 'href=&quot;'),'CS_Xml_Output.xsl&quot;')"/>
	<!--
*********************************************************************************
*	 
*	      Match="/" Template
*
*			The whole process starts here by matching the root. 
*	 
*********************************************************************************
-->
	<xsl:template match="/">
		<HTML>
			<head>
				<link rel="stylesheet" href="ISO_CS_XML.css" type="text/css"/>
			</head>
			<BODY>
				<!--old one<TABLE cellpadding="5" cellspacing="0" border="0">-->
				<TABLE border="0" cellpadding="0" cellspacing="0" bgcolor="white" width="680">
					<tr>
						<td align="center" colspan="2">
							<img src="{$imgBase}cs_head.gif" alt="ISO Claimsearch"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<!-- old one<table cellpadding="0" cellspacing="0" border="0">-->
							<table BORDER="0" rows="2" cols="1" CELLSPACING="5" CELLPADDING="0" WIDTH="680">
								<tr>
									<td>
										<p>
											<font size="4" face="Arial">
												<b>
													<!--<xsl:variable name="ISORecDt" select="ClaimInvestigationAddRs/ClaimsOccurrence/com.iso_ReceiveDt"/>-->
													<xsl:variable name="CDRpt1" select="count(ClaimInvestigationAddRs/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport) &gt; 0"/>
													<xsl:variable name="CDRpt2" select="count(ClaimInvestigationAddRs/com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules) &gt; 0"/>
													<xsl:variable name="SumHeader" select="count(ClaimInvestigationAddRs/MatchDetails/com.iso_SumReasonInfo) &gt; 0"/>
													<xsl:variable name="KeyHeader" select="count(ClaimInvestigationAddRs/com.iso_KeyReasonInfo) &gt; 0"/>
													<xsl:choose>
														<!--<xsl:when test="count(ClaimInvestigationAddRs/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport) &gt; 0">-->
														<xsl:when test="$CDRpt1 or $CDRpt2">
														CLAIMDIRECTOR RESULT REPORT
													</xsl:when>
														<!--
													<xsl:when test="$SumHeader or $KeyHeader">
														ISO CLAIMSEARCH MATCH REPORT SUMMARY
													</xsl:when>
														<xsl:otherwise>
															<xsl:variable name="MatchReportTypeCd">
																<xsl:value-of select="ClaimInvestigationAddRs//MatchReportTypeCd"/>
															</xsl:variable>
															<xsl:if test="$MatchReportTypeCd =  'P'">ISO CLAIMSEARCH REPLACEMENT CLAIM</xsl:if>
															<xsl:if test="$MatchReportTypeCd =  'I'">ISO CLAIMSEARCH MATCH REPORT</xsl:if>
															<xsl:if test="$MatchReportTypeCd =  'R'">ISO CLAIMSEARCH RESEARCH MATCH REPORT</xsl:if>
															<xsl:if test="$MatchReportTypeCd =  'S'">ISO CLAIMSEARCH AUTOMATIC UPDATE</xsl:if>
															<xsl:if test="$MatchReportTypeCd =  'V'">ISO CLAIMSEARCH RECOVERY NOTICE</xsl:if>
															<xsl:if test="$MatchReportTypeCd =  'Q'">ISO CLAIMSEARCH AUTOMATIC IMPOUND UPDATE</xsl:if>
														</xsl:otherwise>
													-->
														<xsl:otherwise>
														ISO CLAIMSEARCH MATCH REPORT SUMMARY
													</xsl:otherwise>
													</xsl:choose>
												</b>
											</font>
										</p>
										<p/>
									</td>
								</tr>
								<tr>
									<td colspan="1">
										<xsl:variable name="FileNumber" select="ClaimInvestigationAddRs/ClaimsOccurrence/ItemIdInfo/AgencyId"/>
										<xsl:variable name="CDInd" select="ClaimInvestigationAddRs/com.iso_ClaimDirectorInd"/>
										<xsl:variable name="ReturnCd">
											<xsl:value-of select="ClaimInvestigationAddRs/MatchReportTypeCd"/>
										</xsl:variable>
										<!--Replacement claim-->
										<xsl:if test="$ReturnCd =  'P'">
											<xsl:choose>
												<xsl:when test="$CDInd = 1">
													<!--<xsl:if test="$CDInd = 1">-->
													<font size="2" face="Arial">
														<p>
														A claim report identified by ClaimSearch identification number <xsl:value-of select="$FileNumber"/> was received by ISO ClaimSearch on <xsl:number value="substring($ISORecDt,6,2)" format="01/"/>
															<xsl:number value="substring($ISORecDt,9,2)" format="01/"/>
															<xsl:number value="substring($ISORecDt,1,4)" format="0001"/>
														as a Replacement of a previously submitted claim. Submission of this replacement claim initiated a search of the ClaimSearch database.
														 The claim(s) listed below appear(s) to be similar to the claim
														 <xsl:choose>
																<xsl:when test="(ClaimInvestigationAddRs/com.iso_ClaimsScoringInfo/com.iso_ExceededLifeOfClaimInd) = 1">
																submitted.A ClaimDirector score was requested when this claim was submitted to ISO. However, this claim has exceeded the ""life of claim"" scoring limit.
																The allowable number of scores per claim in ClaimDirector is six (first score plus five re-scores).  Any submissions requesting scores beyond the limit
																will not be scored, but will be handled as regular claim reports and will be searched in the database and not scored.
																<p>
																	Reasonable procedures have been adopted to maximize the accuracy of this report. Independent investigations should be performed to
																	evaluate the relevant data provided.
																</p>
																</xsl:when>
																<xsl:otherwise>
																submitted and were used to develop the ClaimDirector score.
																<p>
																To simplify your evaluation of these matches, ClaimDirector scores all prior non-duplicate claims and provides a total summary score. 
																The ClaimDirector match report below includes all scored claims up to a maximum of 25.
																</p>
																	<p>
																	Reasonable procedures have been adopted to maximize the accuracy of this report. Independent investigations should be performed to
																	evaluate the relevant data provided.
																</p>
																</xsl:otherwise>
															</xsl:choose>
														</p>
													</font>
													<!--</xsl:if>-->
												</xsl:when>
												<xsl:otherwise>
													<font size="2" face="Arial">
														<p>
														A claim report identified by ClaimSearch identification number <xsl:value-of select="$FileNumber"/> was received by ISO ClaimSearch on <xsl:number value="substring($ISORecDt,6,2)" format="01/"/>
															<xsl:number value="substring($ISORecDt,9,2)" format="01/"/>
															<xsl:number value="substring($ISORecDt,1,4)" format="0001"/> as a Replacement of a previously submitted claim.
													 Submission of this replacement claim initiated a search of the ClaimSearch database. The claim(s) listed below appear(s) to be similar to the claim submitted.														 
													 Reasonable procedures have been adopted to maximize the accuracy of this report. Independent investigations should be performed to
																	evaluate the relevant data provided.
														</p>
													</font>
												</xsl:otherwise>
											</xsl:choose>
										</xsl:if>
										<!--Intiating Claim -->
										<xsl:if test="$ReturnCd =  'I'">
											<xsl:choose>
												<xsl:when test="$CDInd = 1">
													<font size="2" face="Arial">
														<p>
														A claim report identified by ClaimSearch identification number <xsl:value-of select="$FileNumber"/> was received by ISO ClaimSearch on <xsl:number value="substring($ISORecDt,6,2)" format="01/"/>
															<xsl:number value="substring($ISORecDt,9,2)" format="01/"/>
															<xsl:number value="substring($ISORecDt,1,4)" format="0001"/>. Submission of this claim report initiated a search for similar claims.
														 The claim(s) listed below appear(s) to be similar to the claim
														 	<xsl:choose>
																<xsl:when test="(ClaimInvestigationAddRs/com.iso_ClaimsScoringInfo/com.iso_ExceededLifeOfClaimInd) = 1">
																	submitted.A ClaimDirector score was requested when this claim was submitted to ISO. However, this claim has exceeded the ""life of claim"" scoring limit.
																	The allowable number of scores per claim in ClaimDirector is six (first score plus five re-scores).  Any submissions requesting scores beyond the limit
																	will not be scored, but will be handled as regular claim reports and will be searched in the database and not scored.
																	<p>
																		Reasonable procedures have been adopted to maximize the accuracy of this report. Independent investigations should be performed to
																		evaluate the relevant data provided.
																	</p>
																</xsl:when>
																<xsl:otherwise>
																	submitted and were used to develop the ClaimDirector score.
																	<p>
																	To simplify your evaluation of these matches, ClaimDirector scores all prior non-duplicate claims and provides a total summary score. 
																	The ClaimDirector match report below includes all scored claims up to a maximum of 25.
																	</p>
																	<p>
																		Reasonable procedures have been adopted to maximize the accuracy of this report. Independent investigations should be performed to
																		evaluate the relevant data provided.
																	</p>
																</xsl:otherwise>
															</xsl:choose>
														</p>
													</font>
													<!--</xsl:if>-->
												</xsl:when>
												<xsl:otherwise>
													<font size="2" face="Arial">
														<p>
														A claim report identified by ClaimSearch identification number <xsl:value-of select="$FileNumber"/> was received by ISO ClaimSearch on <xsl:number value="substring($ISORecDt,6,2)" format="01/"/>
															<xsl:number value="substring($ISORecDt,9,2)" format="01/"/>
															<xsl:number value="substring($ISORecDt,1,4)" format="0001"/>. Submission of this claim report initiated a search for similar claims.
														 The claim(s) listed below appear(s) to be similar to the claim
																submitted. Reasonable procedures have been adopted to maximize the accuracy of this report. Independent investigations should be performed to
																	evaluate the relevant data provided.
														</p>
													</font>
												</xsl:otherwise>
											</xsl:choose>
										</xsl:if>
										<!--Automatic update-->
										<xsl:if test="$ReturnCd =  'S'">
											<font size="2" face="Arial">
												<p>
													A claim report identified by ClaimSearch identification number <xsl:value-of select="$FileNumber"/> which matched a claim report previously sent by your company was received
													by ISO ClaimSearch on <xsl:number value="substring($ISORecDt,6,2)" format="01/"/>
													<xsl:number value="substring($ISORecDt,9,2)" format="01/"/>
													<xsl:number value="substring($ISORecDt,1,4)" format="0001"/>. As an added service, we are providing you with a copy of this AUTOMATIC UPDATE claim report.
													Reasonable procedures have been adopted to maximize the accuracy of this report. Independent investigations 
													should be performed to evaluate the relevant data provided.
												</p>
											</font>
										</xsl:if>
										<!--AUTOMATIC IMPOUND UPDATE-->
										<xsl:if test="$ReturnCd =  'Q'">
											<font size="2" face="Arial">
												<p>
													A vehicle impound report identified by ClaimSearch identification number <xsl:value-of select="$FileNumber"/> which matched a claim report previously sent by your company was received by ISO ClaimSearch on <xsl:number value="substring($ISORecDt,6,2)" format="01/"/>
													<xsl:number value="substring($ISORecDt,9,2)" format="01/"/>
													<xsl:number value="substring($ISORecDt,1,4)" format="0001"/>.
													 As an added service, we are providing you with a copy of this AUTOMATIC IMPOUND UPDATE report.
													 Reasonable procedures have been adopted to maximize the accuracy of this report. Independent investigations 
													should be performed to evaluate the relevant data provided.
												</p>
											</font>
										</xsl:if>
										<!--Recovery Notice-->
										<xsl:if test="$ReturnCd =  'V'">
											<font size="2" face="Arial">
												<p>
													A claim report identified by ClaimSearch identification number <xsl:value-of select="$FileNumber"/> was received by 
													ISO ClaimSearch on <xsl:number value="substring($ISORecDt,6,2)" format="01/"/>
													<xsl:number value="substring($ISORecDt,9,2)" format="01/"/>
													<xsl:number value="substring($ISORecDt,1,4)" format="0001"/>. ClaimSearch received a Recovery Notification on the vehicle reported in your Initiating Claim.
													The RECOVERY NOTICE is provided in this report. Reasonable procedures have been adopted to maximize the accuracy of this report.
													Independent investigations should be performed to evaluate the relevant data provided.
												</p>
											</font>
										</xsl:if>
										<!--commented 06/26/2006.added CD changes.
										<xsl:choose>
											<xsl:when test="count(ClaimInvestigationAddRs/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport) &gt; 0">
												<font size="2" face="Arial">
													<p>
												A claim report identified by ClaimSearch identification number <xsl:value-of select="$FileNumber"/> was received by ISO ClaimSearch.  Submission of this claim report initiated a search for similar claims.  The claims listed below appear to be similar to the claim submitted.  
											</p>
													<p>To simplify your evaluation of these matches, ClaimDirector scores all prior non-duplicate claims and provides a total summary score. The ClaimDirector match report below includes all scored claims up to a maximum of 25.</p>
													<p>Reasonable procedures have been adopted to maximize the accuracy of this report.  Independent investigations should be performed to evaluate the relevant data provided.
											</p>
												</font>
											</xsl:when>
											<xsl:otherwise>
												<font size="2" face="Arial">
													<p>
												A claim report identified by ClaimSearch identification number <xsl:value-of select="$FileNumber"/> was recieved by ISO ClaimSearch.  Submission of this claim report initiated a search for similar claims.  The claims listed below appear to be similar to the claim submitted.  
											Reasonable procedures have been adopted to maximize the accuracy of this report.  Independent investigations should be performed to evaluate the relevant data provided.
											</p>
												</font>
											</xsl:otherwise>
										</xsl:choose>
										end 06/26/2006-->
										<font size="2" face="Arial">
											<p>
					If you have any questions concerning your report, please contact Customer Support at (800) 888-4476.
					</p>
										</font>
										<p/>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<xsl:choose>
						<xsl:when test="count(ClaimInvestigationAddRs/MsgStatus[MsgStatusCd = 'Rejected']) &gt; 0">
							<tr>
								<td colspan="2">
									<font color="" size="3">
										<b>Message was rejected for the following reasons:</b>
									</font>
								</td>
							</tr>
							<xsl:for-each select="ClaimInvestigationAddRs/MsgStatus[MsgStatusCd = 'Rejected']">
								<tr>
									<td>
										<xsl:value-of select="MsgStatusDesc"/>
									</td>
								</tr>
							</xsl:for-each>
						</xsl:when>
						<xsl:otherwise>
							<tr>
								<!--<xsl:apply-templates select="ACORD"/>
								<xsl:apply-templates select="ClaimsSvcRs"/>-->
								<xsl:apply-templates select="ClaimInvestigationAddRs"/>
							</tr>
						</xsl:otherwise>
					</xsl:choose>
					<br/>
					<div align="center">
						<font color="gray" face="arial" size="1">ISO Stylesheet Version: 5.4.2 Release Date: 11-20-2012
					</font>
					</div>
				</TABLE>
			</BODY>
		</HTML>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Match="ACORD" Template
*
*			Calls the ClaimSvcRs template, this allows the XML to 
*			either start from the ACORD root or ClaimsSvcRs root.  
*	 
*********************************************************************************
-->
	<xsl:template match="ACORD">
		<xsl:apply-templates select="ClaimsSvcRs"/>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Match="ClaimsSvcRs" Template
*
*			Calls the ClaimInvestigationAddRstemplate, this allows the XML to 
*			either start from the ACORD root or ClaimsSvcRs root.  
*	 
*********************************************************************************
-->
	<xsl:template match="ClaimsSvcRs">
		<xsl:apply-templates select="ClaimInvestigationAddRs"/>
	</xsl:template>
	<!--

*********************************************************************************
*	 
*	      Match="ClaimsSvcRs" Template
*
*			Calls the ClaimSvcRs template, this allows the XML to 
*			either start from the ACORD root or ClaimsSvcRs root.  
*	 
*********************************************************************************
-->
	<xsl:template match="ClaimInvestigationAddRs">
		<!--<xsl:call-template name="MatchCount"/>-->
		<!--<xsl:for-each select="ClaimInvestigationAddRs">-->
		<xsl:variable name="ClaimInvestRoot" select="."/>
		<xsl:variable name="TmsScored" select="com.iso_ClaimsScoringInfo/com.iso_NumberTimesScored"/>
		<xsl:variable name="CDScore1" select="count(com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport) &gt; 0"/>
		<xsl:variable name="CDScore2" select="count(com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules) &gt; 0"/>
		<tr>
			<!--<xsl:if test="count(com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport) &gt; 0">-->
			<xsl:if test="($CDScore1) or ($CDScore2)">
				<!-- start commented on 03/14/2006
				<td align="left" colspan="0">
					<TABLE border="0" cellpadding="0" cellspacing="0" width="100%">
						<TR>
							<TD width="1%" bgColor="#C5D7DE"/>
							<TD width="1%" bgColor="#C5D7DE"/>
							<TD bgColor="#C5D7DE">
								<font size="3" face="Arial">
									<B>Score Summary</B>
								</font>
							</TD>
							<table>
								<td height="10"/>
							</table>
							<table>
								<th>
									<td width="380">
										<b>
											<li>
												<font size="2" face="Arial">
									ClaimDirector Number of Times Scored:
								</font>
											</li>
										</b>
									</td>
								</th>
								<td width="580">
									<xsl:call-template name="Insert_CD_Score">
										<xsl:with-param name="Data_Value">
											<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_NumberTimesScored"/>
										</xsl:with-param>
									</xsl:call-template>
								</td>
							</table>
					&#160;
				</TR>
						<TR>
							<TD bgColor="#C5D7DE"/>
						</TR>
					</TABLE>
					<table bgColor="White" cellpadding="2" cellspacing="0">
						<TR>
							<TD valign="top" bgColor="#C5D7DE">
					</TD>
						</TR>
						<td>
							<b>
								<font face="Arial" size="5"/>
								<xsl:call-template name="Insert_Header">
									<xsl:with-param name="Data_Name">ClaimDirector Score</xsl:with-param>
								</xsl:call-template>
								<xsl:call-template name="Insert_Score_Header">
									<xsl:with-param name="Data_Value">
										<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorScore"/>
									</xsl:with-param>
								</xsl:call-template>
							</b>
						</td>
						<TR height="2">
							<TD valign="bottom" bgColor="#C5D7DE" width="680"/>
						</TR>
					</table>
				</td>
				end commented on 03/14/2006-->
				<!--start new cd scoring changes 11/17/2005-->
				<table border="0" cellpadding="0" cellspacing="0" width="70%">
					<tr>
						<xsl:if test="$TmsScored =  '01'">
							<b>
								<FONT size="2" face="Arial">
Note: This claim has been scored 1 time.</FONT>
							</b>
						</xsl:if>
						<xsl:if test="$TmsScored &gt;  '1'">
							<b>
								<FONT size="2" face="Arial">

						Note: This claim has been scored </FONT>
							</b>
							<xsl:variable name="TimesScored" select="sum(com.iso_ClaimsScoringInfo/com.iso_NumberTimesScored)"/>
							<b>
								<FONT size="2" face="Arial">
									<xsl:value-of select="$TimesScored"/>
								</FONT>
							</b>
							<b>
								<FONT size="2" face="Arial"> times.</FONT>
							</b>
						</xsl:if>
					</tr>
					<tr>
						<xsl:variable name="EmailSent" select="com.iso_ClaimsScoringInfo/com.iso_EmailSentInd"/>
						<xsl:if test="$EmailSent ='Y'">
							<b>
								<font size="2" face="Arial">
									A score for this claim meets the notification threshold; notice has been sent.
								</font>
							</b>
						</xsl:if>
					</tr>
					<br/>
					<TR height="26">
						<TD width="1%" bgColor="#C5D7DE"/>
						<TD width="1%" bgColor="#C5D7DE"/>
						<TD bgColor="#C5D7DE">
							<FONT size="3" face="Arial">
								<B>Score Summary</B>
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
										<TABLE border="0" bgColor="#F4E8D9" width="100%" cellpadding="0" cellspacing="0">
											<TR>
												<TD width="39%" align="center">
													<TABLE border="0" bgColor="White" width="90%" cellpadding="2" cellspacing="2">
														<TR height="3">
															<TD valign="top" bgColor="#C5D7DE"/>
														</TR>
														<TR height="26">
															<TD align="center" valign="center">
																<font size="4" face="Arial">
																	<B>ClaimDirector</B>
																</font>
															</TD>
														</TR>
														<TR height="26">
															<TD align="center" valign="center">
																<font size="4" face="Arial">
																	<B>Score:</B>
																</font>
															</TD>
														</TR>
														<TR height="36">
															<TD align="center" valign="center">
																<font size="3" face="Arial">
																	<B>
																		<xsl:call-template name="Insert_Score_Header">
																			<xsl:with-param name="Data_Value">
																				<!--<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorScore"/>-->
																				<xsl:variable name="TotScore" select="com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorScore"/>
																				<xsl:value-of select="sum($TotScore)"/>
																			</xsl:with-param>
																		</xsl:call-template>
																	</B>
																</font>
															</TD>
														</TR>
														<TR height="3">
															<TD valign="top" bgColor="#C5D7DE"/>
														</TR>
													</TABLE>
												</TD>
												<TD width="1%">
													<TABLE height="100" cellpadding="0" cellspacing="0" border="0">
														<TR>
															<TD height="5" width="2"/>
														</TR>
														<TR>
															<TD bgcolor="#C5D7DE" height="100" width="2"/>
														</TR>
														<TR>
															<TD height="5" width="2"/>
														</TR>
													</TABLE>
												</TD>
												<TD width="60%" align="center">
													<TABLE border="0" width="90%" cellpadding="0" cellspacing="2">
														<tr>
															<td width="60%">&#160;</td>
															<td width="20%" align="right">
																<u>
																	<font size="2" face="Arial">
																		<B>Raw</B>
																	</font>
																</u>
															</td>
															<td>&#160;</td>
															<td width="20%" align="right">
																<u>
																	<font size="2" face="Arial">
																		<B>Adjusted</B>
																	</font>
																</u>
															</td>
														</tr>
														<tr height="1">
															<td/>
															<td align="right">
																<!--<img src="" width="25" height="1"/>-->
															</td>
															<td align="right">
																<!--<img src="" width="50" height="1"/>-->
															</td>
														</tr>
														<!-- commented 0n 05/31/2006
														<tr>
															<td nowrap="">
																<font size="2" face="Arial">Claim Rules</font>
															</td>
															<td align="right">
																<xsl:variable name="MA01Id" select="ClaimsOccurrence/@id"/>
																<font size="2" face="Arial">
																	<xsl:value-of select="sum(com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]/com.iso_RuleWeight)"/>
																</font>
															</td>
															<td align="right">
																<font size="2" face="Arial">
																	<xsl:value-of select="sum(com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]/com.iso_RuleWeight)"/>
																</font>
															</td>
														</tr>
														moved the claim rules to below section 05/31/2006-->
														<tr>
															<!--<td nowrap="">-->
															<td nowrap="">
																<font size="2" face="Arial">Claim Rules</font>
															</td>
															<td align="right">
																<font size="2" face="Arial">
																	<!--<xsl:value-of select="sum(com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]/com.iso_RuleWeight)"/>-->
																	<xsl:variable name="MA01Id" select="ClaimsOccurrence/@id"/>
																	<xsl:variable name="ClaimRawScore" select="sum(com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]/com.iso_RuleWeight)"/>
																	<xsl:choose>
																		<xsl:when test="$ClaimRawScore > 999">
																			<xsl:value-of select="999"/>
																		</xsl:when>
																		<xsl:otherwise>
																			<xsl:value-of select="$ClaimRawScore"/>
																		</xsl:otherwise>
																	</xsl:choose>
																</font>
																<!--
																<xsl:call-template name="Insert_CD_Raw_Adjust_Score">
																	<xsl:with-param name="Data_Value">
																		<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport/com.iso_RawScore"/>
																	</xsl:with-param>
																</xsl:call-template>
																-->
															</td>
															<td>&#160;</td>
															<td align="right">
																<font size="2" face="Arial">
																	<!--<xsl:value-of select="sum(com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA01Id]/com.iso_RuleWeight)"/>-->
																	<xsl:variable name="MA101Id" select="ClaimsOccurrence/@id"/>
																	<xsl:variable name="ClaimAdjScore" select="sum(com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules[@idref = $MA101Id]/com.iso_RuleWeight)"/>
																	<xsl:choose>
																		<xsl:when test="$ClaimAdjScore > 999">
																			<xsl:value-of select="999"/>
																		</xsl:when>
																		<xsl:otherwise>
																			<xsl:value-of select="$ClaimAdjScore"/>
																		</xsl:otherwise>
																	</xsl:choose>
																</font>
																<!--
																<xsl:call-template name="Insert_CD_Raw_Adjust_Score">
																	<xsl:with-param name="Data_Value">
																		<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport/com.iso_AdjustedScore"/>
																	</xsl:with-param>
																</xsl:call-template>
																-->
															</td>
															<!-- start 05262006-->
															<xsl:for-each select="ClaimsParty">
																<xsl:variable name="MO01Id" select="@id"/>
																<xsl:variable name="MT01Id" select="$ClaimInvestRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport/@idref"/>
																<xsl:if test="$MO01Id = $MT01Id">
																	<tr>
																		<td nowrap="nowrap">
																			<font size="2" face="Arial">
																				<!--
																	<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>&#160;
																	<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>&#160;
																	<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>&#160;
																	-->
																				<xsl:variable name="ScoreName" select="GeneralPartyInfo/NameInfo/PersonName"/>
																				<xsl:choose>
																					<xsl:when test="count($ScoreName) > 0 ">
																						<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/GivenName"/>
																						<xsl:if test="count(GeneralPartyInfo/NameInfo/PersonName/OtherGivenName) > 0 ">
																				&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/OtherGivenName"/>
																						</xsl:if>
																						<xsl:if test="count(GeneralPartyInfo/NameInfo/PersonName/Surname) > 0 ">
																				&#160;<xsl:value-of select="GeneralPartyInfo/NameInfo/PersonName/Surname"/>
																						</xsl:if>
																					</xsl:when>
																					<xsl:otherwise>
																						<xsl:value-of select="GeneralPartyInfo/NameInfo/CommlName/CommercialName"/>
																					</xsl:otherwise>
																				</xsl:choose>
																			</font>
																		</td>
																		<xsl:for-each select="$ClaimInvestRoot/com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport">
																			<xsl:if test="@idref = $MO01Id">
																				<td align="right">
																					<font size="2" face="Arial">
																						<xsl:call-template name="Insert_CD_Raw_Adjust_Score">
																							<xsl:with-param name="Data_Value">
																								<!--<xsl:value-of select="sum(com.iso_RawScore)"/>-->
																								<xsl:variable name="InRawScore" select="sum(com.iso_RawScore)"/>
																								<xsl:choose>
																									<xsl:when test="$InRawScore > 999">
																										<xsl:value-of select="999"/>
																									</xsl:when>
																									<xsl:otherwise>
																										<xsl:value-of select="$InRawScore"/>
																									</xsl:otherwise>
																								</xsl:choose>
																							</xsl:with-param>
																						</xsl:call-template>
																					</font>
																				</td>
																				<td>&#160;</td>
																				<td align="right">
																					<font size="2" face="Arial">
																						<xsl:call-template name="Insert_CD_Raw_Adjust_Score">
																							<xsl:with-param name="Data_Value">
																								<!--<xsl:value-of select="sum(com.iso_AdjustedScore)"/>-->
																								<xsl:variable name="InAdjScore" select="sum(com.iso_AdjustedScore)"/>
																								<xsl:choose>
																									<xsl:when test="$InAdjScore > 999">
																										<xsl:value-of select="999"/>
																									</xsl:when>
																									<xsl:otherwise>
																										<xsl:value-of select="$InAdjScore"/>
																									</xsl:otherwise>
																								</xsl:choose>
																							</xsl:with-param>
																						</xsl:call-template>
																					</font>
																				</td>
																			</xsl:if>
																		</xsl:for-each>
																	</tr>
																</xsl:if>
															</xsl:for-each>
															<!-- end 05/26/2006-->
															<!--
															<td align="right">
																<xsl:call-template name="Insert_CD_Raw_Adjust_Score">
																	<xsl:with-param name="Data_Value">
																		<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport/com.iso_RawScore"/>
																	</xsl:with-param>
																</xsl:call-template>
															</td>
															<td align="right">
																<xsl:call-template name="Insert_CD_Raw_Adjust_Score">
																	<xsl:with-param name="Data_Value">
																		<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport/com.iso_AdjustedScore"/>
																	</xsl:with-param>
																</xsl:call-template>
															</td>
															-->
														</tr>
														<!--    rsScore.MoveNext
  Wend-->
														<tr>
															<td width="60%">&#160;</td>
															<td width="20%" align="right">
																
															</td>
															<td>&#160;</td>
															<td width="20%" align="right">
																<hr width="30" size="2"/>
															</td>
														</tr>
														<TR height="1">
															<TD/>
															<TD/>
															<TD align="center">
																<!--<img src="" width="30" height="1"/>-->
															</TD>
														</TR>
														<tr>
															<td>&#160;</td>
															<td colspan="2" align="right">
																<font size="2" face="Arial">Score:</font>
															</td>
															<td align="right">
																<font size="2" face="Arial">
																	<xsl:value-of select="sum(com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorScore)"/>
																	<!--
																	<xsl:call-template name="Insert_Score_Header">
																		<xsl:with-param name="Data_Value">
																			<xsl:value-of select="com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorScore"/>
																		</xsl:with-param>
																	</xsl:call-template>
																	-->
																</font>
															</td>
														</tr>
													</TABLE>
												</TD>
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
				</table>
				<TD>&#160;</TD>
				<!--new changes11/172005 cD scoring end-->
			</xsl:if>
		</tr>
		<table>
			<tr>
				<td>
					<xsl:if test="count(com.iso_ClaimsScoringInfo/com.iso_ClaimsHandlingCharacteristics) &gt; 0">
						<xsl:call-template name="Display_ClaimsDirector_Claim_Handling">
							<xsl:with-param name="ClaimRoot" select="."/>
						</xsl:call-template>
						<!--commented on 03/14/2006
						<table width="100%" >
							<tr>
								<td  align="right">
								<font size="2" face="Arial">
									<xsl:variable name="FileNumber" select="com.iso_ClaimsScoringInfo/com.iso_ClaimsHandlingCharacteristics"/>
									<xsl:call-template name="Insert_Anchor">
										<xsl:with-param name="AnchorName" select="$FileNumber"/>
									</xsl:call-template>
									<xsl:call-template name="Insert_Anchor_Link">
										<xsl:with-param name="LinkName">
											<xsl:text>Display rule weights</xsl:text>
										</xsl:with-param>
										<xsl:with-param name="AnchorName">
											<xsl:text>Display rule weights</xsl:text>
										</xsl:with-param>
									</xsl:call-template>
								</font>
								</td>
							</tr>
						</table>	-->
					</xsl:if>
				</td>
			</tr>
		</table>
		<table>
			<tr>
				<td align="left">
					<xsl:variable name="CDRules" select="count(com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules)"/>
					<xsl:variable name="CDScore" select="count(com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport)"/>
					<!--<xsl:if test="count(com.iso_ClaimsScoringInfo/com.iso_ClaimDirectorRules) &gt; 0">-->
					<xsl:if test="($CDRules &gt; 0) or ($CDScore &gt; 0)">
						<xsl:call-template name="Display_ClaimsDirector_Claim_Rules">
							<xsl:with-param name="ClaimRoot" select="."/>
						</xsl:call-template>
					</xsl:if>
				</td>
			</tr>
		</table>
		<!--commented on 04/06/2006
		<table>
			<tr>
				<td width="270">
					<xsl:if test="count(com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport) &gt; 0">
						<xsl:call-template name="Display_ClaimDirector_Score">
							<xsl:with-param name="ClaimRoot" select="."/>
						</xsl:call-template>
					</xsl:if>
				</td>
			</tr>
		</table>
		end comments 04/06/2006-->
		<!--CCOR
		<table>
			<tr>
				<td align="center">
					<xsl:if test="count(com.iso_ClaimsScoringInfo/com.iso_ClaimsScoreReport) = 0">
						<xsl:call-template name="Display_Matching_Record_Links">
							<xsl:with-param name="RootNode" select="MatchDetails"/>
						</xsl:call-template>
					</xsl:if>
				</td>
			</tr>
		</table>
		<td>&#160;</td>
		-->
		<!--start CCOR-->
		<xsl:variable name="SumHeader1" select="MatchDetails/com.iso_SumReasonInfo"/>
		<xsl:variable name="KeyHeader1" select="com.iso_KeyReasonInfo"/>
		<xsl:variable name="CDInd1" select="com.iso_ClaimDirectorInd"/>
		<!--<xsl:if test="count($SumHeader1) &gt; 0 or count($KeyHeader1) &gt; 0">-->
		<!--<xsl:if test="count($SumHeader1) = 0 and count($KeyHeader1) = 0 and count($CDInd1) = 0">-->
		<xsl:if test=" count($CDInd1) = 0">
			<table border="0" width="670" cellpadding="5" cellspacing="0">
				<tr>
					<td>
						<table border="0" width="670" cellpadding="0" cellspacing="0">
							<tr>
								<td>
									<font face="arial">
										<b>INITIATING CLAIM INFORMATION</b>
									</font>
								</td>
							</tr>
							<tr>
								<td>
									<table border="0" width="670" cellpadding="0" cellspacing="0">
										<tr>
											<td width="105" nowrap="nowrap">
												<font face="arial" size="2">
													<b>Claim Number:</b>
												</font>
											</td>
											<td width="250" align="left" nowrap="nowrap">
												<font face="arial" size="2">
													<xsl:value-of select="ClaimsOccurrence/ItemIdInfo/InsurerId"/>
												</font>
											</td>
											<td width="105" nowrap="nowrap">
												<font face="arial" size="2">
													<b>Date of Loss:</b>
												</font>
											</td>
											<td align="left" nowrap="nowrap">
												<xsl:variable name="FormatDt" select="ClaimsOccurrence/LossDt"/>
												<xsl:if test="count($FormatDt) &gt; 0">
													<font face="arial" size="2">
														<xsl:number value="substring($FormatDt,6,2)" format="01/"/>
														<xsl:number value="substring($FormatDt,9,2)" format="01/"/>
														<xsl:number value="substring($FormatDt,1,4)" format="0001"/>&#160;
															</font>
												</xsl:if>
											</td>
										</tr>
										<tr>
											<td width="125" nowrap="nowrap">
												<font face="arial" size="2">
													<b>Policy Number:</b>
												</font>
											</td>
											<td width="250" align="left" nowrap="nowrap">
												<font face="arial" size="2">
													<xsl:value-of select="Policy/PolicyNumber"/>
												</font>
											</td>
											<td width="125" nowrap="nowrap">
												<font face="arial" size="2">
													<b>ISO File Number:</b>
												</font>
											</td>
											<td align="left" nowrap="nowrap">
												<xsl:variable name="SumisoNum" select="ClaimsOccurrence/ItemIdInfo/AgencyId"/>
												<xsl:call-template name="Insert_Anchor_Link">
													<xsl:with-param name="LinkName">
														<xsl:value-of select="$SumisoNum"/>
													</xsl:with-param>
													<xsl:with-param name="AnchorName">
														<xsl:text>InitiatingClaim</xsl:text>
													</xsl:with-param>
												</xsl:call-template>
											</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td>
									<table border="0" width="650" cellpadding="0" cellspacing="0">
										<hr>
											<tr>
												<td colspan="5">
													<xsl:call-template name="Insert_Anchor">
														<xsl:with-param name="AnchorName">SUMMARY FOR EACH SEARCHABLE PARTY</xsl:with-param>
													</xsl:call-template>
													<font size="4" face="Arial">
														<b>
															<xsl:text>SUMMARY FOR EACH SEARCHABLE PARTY</xsl:text>
														</b>
													</font>
													<!--<b>SUMMARY FOR EACH SEARCHABLE PARTY</b>-->
													<xsl:for-each select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'CL' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'CI' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'CD' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'CP' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'ID' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'IP' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'IE' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'IN' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'OW' or 		ClaimsPartyInfo/ClaimsPartyRoleCd = 'PT' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'TN' or ClaimsPartyInfo/ClaimsPartyRoleCd = 		'WT' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'CE' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'GM']">
														<xsl:variable name="MO01Id" select="@id"/>
														<xsl:variable name="MV01Id1" select="../AutoLossInfo/@id"/>
														<xsl:variable name="DMId" select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO01Id and ClaimsPartyRole2Cd = 'DeathMaster']/@ClaimsParty2Ref"/>
														<xsl:call-template name="Display_sum_Involved_Party">
															<xsl:with-param name="DeathMasterNode" select="../ClaimsParty[@id = $DMId]"/>
														</xsl:call-template>
														<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO01Id and ClaimsPartyRole2Cd = 	'Alias']">
															<xsl:variable name="AliasId" select="@ClaimsParty2Ref"/>
															<!--
																<xsl:for-each select="../ClaimsParty[@id = $AliasId]">
																	<xsl:call-template name="Display_Alias">
																		<xsl:with-param name="DeathMasterNode" select="../ClaimsParty[@id = $DMId]"/>
																	</xsl:call-template>
																</xsl:for-each>
																-->
														</xsl:for-each>
														<!--<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO01Id and (ClaimsPartyRole2Cd = 'CO' or ClaimsPartyRole2Cd = 'CT' or ClaimsPartyRole2Cd = 'EM' or ClaimsPartyRole2Cd = 'BS' or ClaimsPartyRole2Cd = 'BO' or ClaimsPartyRole2Cd = 'IO' or ClaimsPartyRole2Cd = 'IR' or ClaimsPartyRole2Cd = 'IA' or ClaimsPartyRole2Cd = 'MD' or ClaimsPartyRole2Cd = 'MC' or ClaimsPartyRole2Cd = 'MA' or ClaimsPartyRole2Cd = 'MO' or ClaimsPartyRole2Cd = 'MN' or ClaimsPartyRole2Cd = 'ML' or ClaimsPartyRole2Cd = 'MT' or ClaimsPartyRole2Cd = 'MS' or ClaimsPartyRole2Cd = 'MG' or ClaimsPartyRole2Cd = 'MH' or ClaimsPartyRole2Cd = 'MZ' or ClaimsPartyRole2Cd = 'MM' or ClaimsPartyRole2Cd = 'MX' or ClaimsPartyRole2Cd = 'LR' or ClaimsPartyRole2Cd = 'LM' or ClaimsPartyRole2Cd = 'LO' or ClaimsPartyRole2Cd = 'IY' or ClaimsPartyRole2Cd = 'IB' or ClaimsPartyRole2Cd = 'IS' or ClaimsPartyRole2Cd = 'II' or ClaimsPartyRole2Cd = 'MR' or ClaimsPartyRole2Cd = 'OS' or ClaimsPartyRole2Cd = 'PH' or ClaimsPartyRole2Cd = 'PS' or ClaimsPartyRole2Cd = 'MY' or ClaimsPartyRole2Cd = 'FM' or ClaimsPartyRole2Cd = 'SM' or ClaimsPartyRole2Cd = 'NP' or ClaimsPartyRole2Cd = 'OP' or 	ClaimsPartyRole2Cd = 'LP' or ClaimsPartyRole2Cd = 'PA' or ClaimsPartyRole2Cd = 'LI' or ClaimsPartyRole2Cd = 'BE' or ClaimsPartyRole2Cd = 'TW' or ClaimsPartyRole2Cd = 'LC' or ClaimsPartyRole2Cd = 'LW'  or ClaimsPartyRole2Cd = 'ME' or ClaimsPartyRole2Cd = 'MF' or ClaimsPartyRole2Cd = 'MK')]">-->
														<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO01Id and (ClaimsPartyRole2Cd = 'CO'  or ClaimsPartyRole2Cd = 'FM' or ClaimsPartyRole2Cd = 'SM' or 	ClaimsPartyRole2Cd = 'LP' )]">
															<xsl:variable name="SPId" select="@ClaimsParty2Ref"/>
															<xsl:for-each select="../ClaimsParty[@id = $SPId]">
																<xsl:call-template name="Display_sum_service_provider"/>
																<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $SPId and ClaimsPartyRole2Cd = 		'Alias']">
																	<xsl:variable name="AliasId" select="@ClaimsParty2Ref"/>
																	<xsl:for-each select="../ClaimsParty[@id = $AliasId]">
																		<!--<xsl:call-template name="Display_Alias"/>-->
																	</xsl:for-each>
																</xsl:for-each>
															</xsl:for-each>
														</xsl:for-each>
													</xsl:for-each>
												</td>
											</tr>
										</hr>
									</table>
									<HR size="2" color="BLACK" width="670" align="left"/>
									<!--
											<table>
											<tr><td>&#160;</td></tr>
											<tr><td colspan="5"><b> </b></td></tr>
											<tr><td colspan="5">No matches for this party</td></tr>
											<tr><td>&#160;</td></tr>
											<tr><td>
												<table border="0" width="650" cellpadding="0" cellspacing="0">
													<tr>
														<td width="100" nowrap="nowrap"><b>Coverage:</b></td>
														<td width="250" align="left" nowrap="nowrap"> coverage type</td>
														<td width="100" nowrap="nowrap"><b>Loss Type:</b></td>
														<td align="left" nowrap="nowrap">loss type</td>
													</tr>
													</table>
												</td></tr>
												<tr><td>&#160;</td></tr>
												<tr><td>
													<table width="650" border="1" cellpadding="3" cellspacing="0" style="border: 1px solid #d0d0d0;">
														<tr>
															<td colspan="11" ><img src="cs_headlines.gif" width="650" height="140" /></td>
														</tr>
														<tr>
															<td width="140"  align="center"><font face="Veradane"><b># of Matches</b></font></td>
															<td width="32" class="cell_border" align="center">1</td>
															  <td width="32" class="cell_border" align="center">2</td>
															  <td width="32" class="cell_border" align="center">3</td>
															  <td width="32" class="cell_border" align="center">4</td>
															  <td width="32" class="cell_border" align="center">5</td>
															  <td width="32" class="cell_border" align="center">6</td>
															  <td width="32" class="cell_border" align="center">6</td>
															  <td width="32" class="cell_border" align="center">6</td>
															  <td width="32" class="cell_border" align="center">6</td>
															  <td width="222" rowspan=" 1 " valign="top" class="cell_border" align="left">
															  </td>
														 </tr>
														 <tr>
															<td class="cell_border" align="center">9B0041655</td>
														     <td class="cell_border" align="center">&#160;A</td>
														     <td class="cell_border" align="center">&#160;B</td>
														     <td class="cell_border" align="center">&#160;C</td>
														     <td class="cell_border" align="center">&#160;D</td>
															<td class="cell_border" align="center">&#160;E</td>
															<td class="cell_border" align="center">&#160;F</td>
															<td class="cell_border" align="center">&#160;G</td>
															<td class="cell_border" align="center">&#160;H</td>
															<td class="cell_border" align="center">&#160;I</td>
														  </tr>
														 
														</table>
													</td></tr>
										</table>	-->
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</xsl:if>
		<!--End CCOR-->
		<td colspan="1">
			<xsl:call-template name="Display_Initiating_Claim"/>
			<xsl:for-each select="$ClaimInvestRoot/MatchDetails">
				<xsl:call-template name="Display_Matching_Claims">
					<xsl:with-param name="ClaimInvestAR_Node" select="$ClaimInvestRoot"/>
				</xsl:call-template>
			</xsl:for-each>
		</td>
		<!--</xsl:for-each>-->
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Name="Display_Initiating_Claim" Template
*
*			Builds the Initiating Claim  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Initiating_Claim">
		<!--<table cellpadding="2" cellspacing="0" border="0" bgcolor="6699CD">-->
		<table cellpadding="2" cellspacing="0" border="0" width="670">
			<xsl:variable name="SumHeader4" select="count(MatchDetails/com.iso_SumReasonInfo) &gt; 0"/>
			<xsl:variable name="KeyHeader4" select="count(com.iso_KeyReasonInfo) &gt; 0"/>
			<!--<xsl:if test="$SumHeader4 or $KeyHeader4">-->
			<tr>
				<td>&#160;</td>
			</tr>
			<tr>
				<td nowrap="nowrap">
					<font size="4" face="Arial">
						<b>
							<xsl:variable name="MatchReportTypeCd">
								<xsl:value-of select="MatchReportTypeCd"/>
							</xsl:variable>
							<xsl:if test="$MatchReportTypeCd =  'P'">ISO CLAIMSEARCH REPLACEMENT CLAIM DETAILS</xsl:if>
							<xsl:if test="$MatchReportTypeCd =  'I'">ISO CLAIMSEARCH MATCH REPORT DETAILS</xsl:if>
							<xsl:if test="$MatchReportTypeCd =  'R'">ISO CLAIMSEARCH RESEARCH MATCH REPORT DETAILS</xsl:if>
							<xsl:if test="$MatchReportTypeCd =  'S'">ISO CLAIMSEARCH AUTOMATIC UPDATE DETAILS</xsl:if>
							<xsl:if test="$MatchReportTypeCd =  'V'">ISO CLAIMSEARCH RECOVERY NOTICE DETAILS</xsl:if>
							<xsl:if test="$MatchReportTypeCd =  'Q'">ISO CLAIMSEARCH AUTOMATIC IMPOUND UPDATE DETAILS</xsl:if>
						</b>
					</font>
				</td>
			</tr>
			<tr>
				<td>&#160;</td>
			</tr>
			<!--</xsl:if>-->
		</table>
		<table cellpadding="2" cellspacing="0" border="0" width="670">
			<xsl:choose>
				<xsl:when test="count(MsgStatus[MsgStatusCd = 'Rejected'])&gt; 0"/>
				<xsl:otherwise>
					<tr>
						<td nowrap="nowrap">
							<xsl:call-template name="Insert_Anchor">
								<xsl:with-param name="AnchorName">InitiatingClaim</xsl:with-param>
							</xsl:call-template>
							<p>
								<font size="4" face="Arial">
									<b>
										<xsl:text>Initiating Claim</xsl:text>
									</b>
								</font>
							</p>
						</td>
						<td align="right" nowrap="nowrap">
							<p>
								<font size="4" face="Arial">
									<b>
										<xsl:text>File Number: </xsl:text>
									</b>
									<xsl:variable name="FileNumber" select="ClaimsOccurrence/ItemIdInfo/AgencyId"/>
									<xsl:value-of select="$FileNumber"/>
								</font>
							</p>
						</td>
					</tr>
					<xsl:call-template name="Display_General_Info"/>
					<xsl:for-each select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'CL' or ClaimsPartyInfo/ClaimsPartyRoleCd 	= 	'CI' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'CD' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'CP' or 		ClaimsPartyInfo/ClaimsPartyRoleCd = 'ID' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'IP' or ClaimsPartyInfo/ClaimsPartyRoleCd = 		'IE' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'IN' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'OW' or 		ClaimsPartyInfo/ClaimsPartyRoleCd = 'PT' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'TN' or ClaimsPartyInfo/ClaimsPartyRoleCd = 		'WT' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'CE' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'GM']">
						<xsl:variable name="MO01Id" select="@id"/>
						<xsl:variable name="DMId" select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO01Id and 		ClaimsPartyRole2Cd = 'DeathMaster']/@ClaimsParty2Ref"/>
						<xsl:call-template name="Display_Involved_Party">
							<xsl:with-param name="DeathMasterNode" select="../ClaimsParty[@id = $DMId]"/>
						</xsl:call-template>
						<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO01Id and ClaimsPartyRole2Cd = 	'Alias']">
							<xsl:variable name="AliasId" select="@ClaimsParty2Ref"/>
							<xsl:for-each select="../ClaimsParty[@id = $AliasId]">
								<xsl:call-template name="Display_Alias">
									<xsl:with-param name="DeathMasterNode" select="../ClaimsParty[@id = $DMId]"/>
								</xsl:call-template>
							</xsl:for-each>
						</xsl:for-each>
						<!--This will check for the service providers for this claims party-->
						<!-- commented on 08/03/2006 added LW,ME,MF,MK. removed 'LA'-->
						<!--<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO01Id and (ClaimsPartyRole2Cd = 'CO' or ClaimsPartyRole2Cd = 'CT' or ClaimsPartyRole2Cd = 'EM' or ClaimsPartyRole2Cd = 'BS' or ClaimsPartyRole2Cd = 'BO' or ClaimsPartyRole2Cd = 'IO' or ClaimsPartyRole2Cd = 'IR' or ClaimsPartyRole2Cd = 'IA' or ClaimsPartyRole2Cd = 'MD' or ClaimsPartyRole2Cd = 'MC' or ClaimsPartyRole2Cd = 'MA' or ClaimsPartyRole2Cd = 'MO' or ClaimsPartyRole2Cd = 'MN' or ClaimsPartyRole2Cd = 'ML' or ClaimsPartyRole2Cd = 'MT' or ClaimsPartyRole2Cd = 'MS' or ClaimsPartyRole2Cd = 'MG' or ClaimsPartyRole2Cd = 'MH' or ClaimsPartyRole2Cd = 'MZ' or ClaimsPartyRole2Cd = 'MM' or ClaimsPartyRole2Cd = 'MX' or ClaimsPartyRole2Cd = 'LR' or ClaimsPartyRole2Cd = 'LM' or ClaimsPartyRole2Cd = 'LO' or ClaimsPartyRole2Cd = 'IY' or ClaimsPartyRole2Cd = 'IB' or ClaimsPartyRole2Cd = 'IS' or ClaimsPartyRole2Cd = 'II' or ClaimsPartyRole2Cd = 'MR' or ClaimsPartyRole2Cd = 'OS' or ClaimsPartyRole2Cd = 'PH' or ClaimsPartyRole2Cd = 'PS' or ClaimsPartyRole2Cd = 'MY' or ClaimsPartyRole2Cd = 'FM' or ClaimsPartyRole2Cd = 'SM' or ClaimsPartyRole2Cd = 'NP' or ClaimsPartyRole2Cd = 'OP' or 	ClaimsPartyRole2Cd = 'LP' or ClaimsPartyRole2Cd = 'PA' or ClaimsPartyRole2Cd = 'LA' or ClaimsPartyRole2Cd = 'LI' or ClaimsPartyRole2Cd = 'BE' or ClaimsPartyRole2Cd = 'TW' or ClaimsPartyRole2Cd = 'LC')]">-->
						<!-- GAURAV : Added OR to the list-->
						<!-- GAURAV : Added GU, PW to the list.-->
						<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO01Id and (ClaimsPartyRole2Cd = 'CO' or ClaimsPartyRole2Cd = 'CT' or ClaimsPartyRole2Cd = 'EM' or ClaimsPartyRole2Cd = 'BS' or ClaimsPartyRole2Cd = 'BO' or ClaimsPartyRole2Cd = 'IO' or ClaimsPartyRole2Cd = 'IR' or ClaimsPartyRole2Cd = 'IA' or ClaimsPartyRole2Cd = 'MD' or ClaimsPartyRole2Cd = 'MC' or ClaimsPartyRole2Cd = 'MA' or ClaimsPartyRole2Cd = 'MO' or ClaimsPartyRole2Cd = 'MN' or ClaimsPartyRole2Cd = 'ML' or ClaimsPartyRole2Cd = 'MT' or ClaimsPartyRole2Cd = 'MS' or ClaimsPartyRole2Cd = 'MG' or ClaimsPartyRole2Cd = 'MH' or ClaimsPartyRole2Cd = 'MZ' or ClaimsPartyRole2Cd = 'MM' or ClaimsPartyRole2Cd = 'MX' or ClaimsPartyRole2Cd = 'LR' or ClaimsPartyRole2Cd = 'LM' or ClaimsPartyRole2Cd = 'LO' or ClaimsPartyRole2Cd = 'IY' or ClaimsPartyRole2Cd = 'IB' or ClaimsPartyRole2Cd = 'IS' or ClaimsPartyRole2Cd = 'II' or ClaimsPartyRole2Cd = 'MR' or ClaimsPartyRole2Cd = 'OS' or ClaimsPartyRole2Cd = 'PH' or ClaimsPartyRole2Cd = 'PS' or ClaimsPartyRole2Cd = 'MY' or ClaimsPartyRole2Cd = 'FM' or ClaimsPartyRole2Cd = 'SM' or ClaimsPartyRole2Cd = 'NP' or ClaimsPartyRole2Cd = 'OP' or 	ClaimsPartyRole2Cd = 'LP' or ClaimsPartyRole2Cd = 'PA' or ClaimsPartyRole2Cd = 'LI' or ClaimsPartyRole2Cd = 'BE' or ClaimsPartyRole2Cd = 'TW' or ClaimsPartyRole2Cd = 'LC' or ClaimsPartyRole2Cd = 'LW'  or ClaimsPartyRole2Cd = 'ME' or ClaimsPartyRole2Cd = 'MF' or ClaimsPartyRole2Cd = 'MK' or ClaimsPartyRole2Cd = 'OR' or ClaimsPartyRole2Cd = 'GU' or ClaimsPartyRole2Cd = 'PW')]">
							<xsl:variable name="SPId" select="@ClaimsParty2Ref"/>
							<xsl:for-each select="../ClaimsParty[@id = $SPId]">
								<xsl:call-template name="Display_Service_Provider"/>
								<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $SPId and ClaimsPartyRole2Cd = 		'Alias']">
									<xsl:variable name="AliasId" select="@ClaimsParty2Ref"/>
									<xsl:for-each select="../ClaimsParty[@id = $AliasId]">
										<xsl:call-template name="Display_Alias"/>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:for-each>
						</xsl:for-each>
						<!-- BEGIN GAURAV : CODE FOR MACL -->
						<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO01Id and (ClaimsPartyRole2Cd = 'FA' or ClaimsPartyRole2Cd = 'ES' or ClaimsPartyRole2Cd = 'OC')]">
							<xsl:variable name="MACLId" select="@ClaimsParty2Ref"/>
							<xsl:for-each select="../ClaimsParty[@id = $MACLId]">
								<xsl:call-template name="Display_Additional_Claimant_Information"/>
								<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MACLId and ClaimsPartyRole2Cd = 	'Alias']">
									<xsl:variable name="AliasId" select="@ClaimsParty2Ref"/>
									<xsl:for-each select="../ClaimsParty[@id = $AliasId]">
										<xsl:call-template name="Display_Alias">
											<xsl:with-param name="MACL_Node" select="../ClaimsParty[@id = $MACLId]"/>
										</xsl:call-template>
									</xsl:for-each>
								</xsl:for-each>
								<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MACLId and (ClaimsPartyRole2Cd = 'CO' or ClaimsPartyRole2Cd = 'CT' or ClaimsPartyRole2Cd = 'EM' or ClaimsPartyRole2Cd = 'BS' or ClaimsPartyRole2Cd = 'BO' or ClaimsPartyRole2Cd = 'IO' or ClaimsPartyRole2Cd = 'IR' or ClaimsPartyRole2Cd = 'IA' or ClaimsPartyRole2Cd = 'MD' or ClaimsPartyRole2Cd = 'MC' or ClaimsPartyRole2Cd = 'MA' or ClaimsPartyRole2Cd = 'MO' or ClaimsPartyRole2Cd = 'MN' or ClaimsPartyRole2Cd = 'ML' or ClaimsPartyRole2Cd = 'MT' or ClaimsPartyRole2Cd = 'MS' or ClaimsPartyRole2Cd = 'MG' or ClaimsPartyRole2Cd = 'MH' or ClaimsPartyRole2Cd = 'MZ' or ClaimsPartyRole2Cd = 'MM' or ClaimsPartyRole2Cd = 'MX' or ClaimsPartyRole2Cd = 'LR' or ClaimsPartyRole2Cd = 'LM' or ClaimsPartyRole2Cd = 'LO' or ClaimsPartyRole2Cd = 'IY' or ClaimsPartyRole2Cd = 'IB' or ClaimsPartyRole2Cd = 'IS' or ClaimsPartyRole2Cd = 'II' or ClaimsPartyRole2Cd = 'MR' or ClaimsPartyRole2Cd = 'OS' or ClaimsPartyRole2Cd = 'PH' or ClaimsPartyRole2Cd = 'PS' or ClaimsPartyRole2Cd = 'MY' or ClaimsPartyRole2Cd = 'FM' or ClaimsPartyRole2Cd = 'SM' or ClaimsPartyRole2Cd = 'NP' or ClaimsPartyRole2Cd = 'OP' or 	ClaimsPartyRole2Cd = 'LP' or ClaimsPartyRole2Cd = 'PA' or ClaimsPartyRole2Cd = 'LI' or ClaimsPartyRole2Cd = 'BE' or ClaimsPartyRole2Cd = 'TW' or ClaimsPartyRole2Cd = 'LC' or ClaimsPartyRole2Cd = 'LW'  or ClaimsPartyRole2Cd = 'ME' or ClaimsPartyRole2Cd = 'MF' or ClaimsPartyRole2Cd = 'MK' or ClaimsPartyRole2Cd = 'OR' or ClaimsPartyRole2Cd = 'GU' or ClaimsPartyRole2Cd = 'PW')]">
									<xsl:variable name="SPId" select="@ClaimsParty2Ref"/>
									<xsl:for-each select="../ClaimsParty[@id = $SPId]">
										<xsl:call-template name="Display_Service_Provider"/>
										<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $SPId and ClaimsPartyRole2Cd = 'Alias']">
											<xsl:variable name="AliasId" select="@ClaimsParty2Ref"/>
											<xsl:for-each select="../ClaimsParty[@id = $AliasId]">
												<xsl:call-template name="Display_Alias"/>
											</xsl:for-each>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:for-each>
						</xsl:for-each>
						<!-- END GAURAV : CODE FOR MACL -->
						<xsl:if test="count(ClaimsInjuredInfo) &gt; 0">
							<xsl:call-template name="Build_Casualty_Info">
								<xsl:with-param name="ClaimsPartyId" select="$MO01Id"/>
							</xsl:call-template>
						</xsl:if>
						<xsl:if test="count(../AutoLossInfo[contains(@ClaimsPartyRefs, $MO01Id)]) &gt; 0">
							<xsl:call-template name="Build_Vehicle_Info">
								<xsl:with-param name="ClaimsPartyId" select="$MO01Id"/>
							</xsl:call-template>
						</xsl:if>
						<xsl:if test="count(../PropertyLossInfo[contains(@ClaimsPartyRefs, $MO01Id)]) &gt; 0">
							<xsl:call-template name="Build_Property_Info">
								<xsl:with-param name="ClaimsPartyId" select="$MO01Id"/>
							</xsl:call-template>
						</xsl:if>
						<!-- property Loss Info and seperated from watercraft-->
						<xsl:if test="../PropertyLossInfo[contains(@ClaimsPartyRefs, $MO01Id)]">
							<xsl:call-template name="Build_PropertyLoss_Info">
								<xsl:with-param name="ClaimsPartyId" select="$MO01Id"/>
							</xsl:call-template>
						</xsl:if>
					</xsl:for-each>
				</xsl:otherwise>
			</xsl:choose>
			<xsl:call-template name="Build_Append">
				<xsl:with-param name="ClaimRoot" select="ClaimsParty"/>
			</xsl:call-template>
		</table>
		<!--<table>
		<HR size="2" color="BLACK" width="680"></HR>
		</table>-->
		<xsl:if test="string-length(normalize-space(ClaimsOccurrence/com.iso_StatementOfDisputeInd)) &gt; 0 ">
			<xsl:variable name="MA01_SOD" select="ClaimsOccurrence/com.iso_StatementOfDisputeInd"/>
			<xsl:call-template name="Insert_SOD_Data">
				<xsl:with-param name="Data_Value">
					<!--<xsl:value-of select="ClaimsOccurrence/com.iso_MoldInd"/>-->
					<xsl:if test="$MA01_SOD='Y'">There is a citizen dispute on this claim. For more information, please contact  ISO ClaimSearch Customer Service at 800-888-4476, Option 2, 2.</xsl:if>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<tr>
			<td height="20">
				<xsl:call-template name="Insert_Anchor_Link">
					<xsl:with-param name="LinkName">
						<xsl:text>back</xsl:text>
					</xsl:with-param>
				</xsl:call-template>
			</td>
		</tr>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Build_Append
*
*			Builds Decision Net information  displays them.
*	 
*********************************************************************************
-->
	<xsl:template name="Build_Append">
		<xsl:variable name="ClaimRoot" select=".."/>
		<xsl:call-template name="Display_Append_DS">
			<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
		</xsl:call-template>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Build_Casualty_Info
*
*			Builds initiating casualty records then displays them.
*	 
*********************************************************************************
-->
	<xsl:template name="Build_Casualty_Info">
		<xsl:param name="ClaimsPartyId"/>
		<xsl:variable name="MC01Id" select="ClaimsInjuredInfo/@id"/>
		<xsl:variable name="ClaimsInjuredInfo" select="ClaimsInjuredInfo"/>
		<xsl:variable name="ClaimRoot" select=".."/>
		<xsl:variable name="CMS_cov" select="../com.iso_AddCovInfo/com.iso_CovInfo1"/>
		<xsl:choose>
			<!-- first see if we have an adjuster -->
			<xsl:when test="count($ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MC01Id]) &gt; 0">
				<xsl:for-each select="$ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MC01Id]">
					<xsl:variable name="Adjuster" select="."/>
					<xsl:variable name="CoverageCode" select="CoverageCd"/>
					<xsl:choose>
						<!-- See if we have payment info -->
						<xsl:when test="count($ClaimRoot/ClaimsPayment[@idref = $MC01Id][not(PaymentTypeCd)]	[ClaimsPaymentCovInfo/CoverageCd = $CoverageCode][@idref = $ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MC01Id]])  &gt; 0">
							<!-- use ClaimsPayment pointing to this casualty -->
							<xsl:for-each select="$ClaimRoot/ClaimsPayment[@idref = $MC01Id][not(PaymentTypeCd)]		[ClaimsPaymentCovInfo/CoverageCd = $CoverageCode]">
								<xsl:call-template name="Display_Casualy_Info">
									<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
									<xsl:with-param name="ClaimsPayNode" select="."/>
									<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="CMS_cov" select="$CMS_cov"/>
								</xsl:call-template>
							</xsl:for-each>
						</xsl:when>
						<xsl:when test="count($ClaimRoot/ClaimsPayment[@ClaimsPartyRefs = $ClaimsPartyId][not(PaymentTypeCd)]		[ClaimsPaymentCovInfo/CoverageCd = $CoverageCode])  &gt; 0">
							<!-- Use default ClaimsPayment info -->
							<xsl:for-each select="$ClaimRoot/ClaimsPayment[@ClaimsPartyRefs = $ClaimsPartyId][not(PaymentTypeCd)]		[ClaimsPaymentCovInfo/CoverageCd = $CoverageCode]">
								<xsl:call-template name="Display_Casualy_Info">
									<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
									<xsl:with-param name="ClaimsPayNode" select="."/>
									<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="CMS_cov" select="$CMS_cov"/>
								</xsl:call-template>
							</xsl:for-each>
						</xsl:when>
						<xsl:otherwise>
							<!-- Don't use ClaimsPayment info -->
							<xsl:call-template name="Display_Casualy_Info">
								<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
								<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
								<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
								<xsl:with-param name="CMS_cov" select="$CMS_cov"/>
							</xsl:call-template>
						</xsl:otherwise>
					</xsl:choose>
				</xsl:for-each>
			</xsl:when>
			<xsl:when test="count($ClaimRoot/ClaimsPayment[@idref = $MC01Id][not(PaymentTypeCd)]) &gt; 0">
				<!-- don't have an adjuster -->
				<xsl:for-each select="$ClaimRoot/ClaimsPayment[@idref = $MC01Id][not(PaymentTypeCd)]">
					<xsl:call-template name="Display_Casualy_Info">
						<xsl:with-param name="ClaimsPayNode" select="."/>
						<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="CMS_cov" select="$CMS_cov"/>
					</xsl:call-template>
				</xsl:for-each>
			</xsl:when>
			<xsl:when test="count($ClaimRoot/ClaimsPayment[@ClaimsPartyRefs = $ClaimsPartyId][not(PaymentTypeCd)])  &gt; 0">
				<!-- Use default ClaimsPayment info -->
				<xsl:for-each select="$ClaimRoot/ClaimsPayment[@ClaimsPartyRefs = $ClaimsPartyId][not(PaymentTypeCd)]">
					<xsl:call-template name="Display_Casualy_Info">
						<xsl:with-param name="ClaimsPayNode" select="."/>
						<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="CMS_cov" select="$CMS_cov"/>
					</xsl:call-template>
				</xsl:for-each>
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="Display_Casualy_Info">
					<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
					<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
					<xsl:with-param name="CMS_cov" select="$CMS_cov"/>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Build_MP
*
*			Builds initiating property records then displays them.
*	 
*********************************************************************************
-->
	<xsl:template name="Build_Property_Info">
		<xsl:param name="ClaimsPartyId"/>
		<xsl:variable name="ClaimRoot" select=".."/>
		<xsl:variable name="PropLossNode" select="$ClaimRoot/PropertyLossInfo[contains(@ClaimsPartyRefs, $ClaimsPartyId)]"/>
		<xsl:variable name="MPId" select="$PropLossNode/@id"/>
		<xsl:variable name="BuyerId" select="$ClaimRoot/InvestigationInfo/SalvageInfo/@BuyerRef"/>
		<xsl:choose>
			<xsl:when test="count($PropLossNode/Watercraft) &gt; 0 or count($PropLossNode/ItemInfo) &gt; 0">
				<xsl:variable name="WaterCraftId" select="$PropLossNode/Watercraft/@id"/>
				<xsl:variable name="MobileId" select="$PropLossNode/ItemInfo/@id"/>
				<xsl:variable name="Adjuster" select="$ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MPId or @AssignmentRef = $WaterCraftId or @AssignmentRef = $MobileId]"/>
				<xsl:variable name="CoverageCode" select="$Adjuster/CoverageCd"/>
				<!--WaterCraftId = <xsl:value-of select="$WaterCraftId"/>-->
				<xsl:call-template name="Display_Water_Mobile_Property">
					<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
					<xsl:with-param name="ClaimsPartyId" select="$ClaimsPartyId"/>
					<xsl:with-param name="InvestigationNode" select="$ClaimRoot/InvestigationInfo[RecoveryInfo][@ItemRef = $WaterCraftId or @ItemRef = $MobileId or @ItemRef = $MPId]"/>
					<xsl:with-param name="ClaimsPayNode" select="$ClaimRoot/ClaimsPayment[@idref = $WaterCraftId or @idref = $MobileId or @idref = $MPId][not(PaymentTypeCd)][ClaimsPaymentCovInfo/CoverageCd = $CoverageCode]"/>
					<xsl:with-param name="ClaimsPartyNode" select="$ClaimRoot/ClaimsParty[@id=$ClaimsPartyId]"/>
					<xsl:with-param name="PropLossNode" select="$PropLossNode"/>
					<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
				</xsl:call-template>
				<xsl:call-template name="Display_Water_Mobile_Salvage">
					<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
					<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
					<xsl:with-param name="PropLossNode" select="$PropLossNode"/>
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:variable name="Adjuster" select="$ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MPId]"/>
				<xsl:variable name="CoverageCode" select="$Adjuster/CoverageCd"/>
				<xsl:call-template name="Display_Property">
					<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
					<xsl:with-param name="ClaimsPayNode" select="$ClaimRoot/ClaimsPayment[@idref = $MPId][not(PaymentTypeCd)][ClaimsPaymentCovInfo/CoverageCd = $CoverageCode]"/>
					<xsl:with-param name="ClaimsPartyNode" select="$ClaimRoot/ClaimsParty[@id=$ClaimsPartyId]"/>
					<xsl:with-param name="PropLossNode" select="$PropLossNode"/>
					<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template name="Build_PropertyLoss_Info">
		<xsl:param name="ClaimsPartyId"/>
		<xsl:variable name="ClaimRoot" select=".."/>
		<xsl:variable name="PropLossNode" select="$ClaimRoot/PropertyLossInfo[contains(@ClaimsPartyRefs, $ClaimsPartyId)]"/>
		<xsl:variable name="MPId" select="$PropLossNode/@id"/>
		<xsl:variable name="BuyerId" select="$ClaimRoot/InvestigationInfo/SalvageInfo/@BuyerRef"/>
		<!--copied from Build_Property_Info '"/>-->
		<xsl:variable name="Adjuster" select="$ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MPId]"/>
		<xsl:variable name="CoverageCode" select="$Adjuster/CoverageCd"/>
		<xsl:if test="count($PropLossNode/Watercraft[not(@id)]) &gt; 0 or count($PropLossNode/ItemInfoWatercraft[not(@id)]) &gt; 0">
			<xsl:call-template name="Display_Property">
				<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
				<xsl:with-param name="ClaimsPayNode" select="$ClaimRoot/ClaimsPayment[@idref = $MPId][not(PaymentTypeCd)]	[ClaimsPaymentCovInfo/CoverageCd = $CoverageCode]"/>
				<xsl:with-param name="ClaimsPartyNode" select="$ClaimRoot/ClaimsParty[@id=$ClaimsPartyId]"/>
				<xsl:with-param name="PropLossNode" select="$PropLossNode"/>
				<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Build_Vehicle_Info
*
*			Builds initiating casualty records then displays them.
*	 
*********************************************************************************
-->
	<xsl:template name="Build_Vehicle_Info">
		<xsl:param name="ClaimsPartyId"/>
		<xsl:variable name="ClaimRoot" select=".."/>
		<xsl:variable name="CMS_veh_cov" select="$ClaimRoot/com.iso_AddCovInfo/com.iso_CovInfo1"/>
		<xsl:for-each select="$ClaimRoot/AutoLossInfo[contains(@ClaimsPartyRefs, $ClaimsPartyId)]">
			<xsl:variable name="MV01Id" select="@id"/>
			<xsl:variable name="AutoLossNode" select="."/>
			<xsl:variable name="InvestigationNode" select="$ClaimRoot/InvestigationInfo[@ItemRef = $MV01Id]"/>
			<xsl:variable name="BuyerId" select="$InvestigationNode/SalvageInfo/@BuyerRef"/>
			<xsl:variable name="VinId" select="$ClaimRoot/AutoLossInfo[contains(@ClaimsPartyRefs, $ClaimsPartyId)]/VehInfo/VehIdentificationNumber"/>
			<xsl:variable name="VinId1" select="$ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/VehIdentificationNumber"/>
			<!-- Additonal Recovery Info -->
			<xsl:variable name="RecoveryNode" select="$ClaimRoot/RecoveryInfo[@ItemRef = $MV01Id]"/>
			<!-- End Additonal Recovery Info -->
			<xsl:choose>
				<xsl:when test="count($ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MV01Id]) &gt; 0">
					<xsl:for-each select="$ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MV01Id]">
						<xsl:variable name="Adjuster" select="."/>
						<xsl:variable name="CoverageCode" select="CoverageCd"/>
						<xsl:choose>
							<xsl:when test="count($ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)][ClaimsPaymentCovInfo/CoverageCd = 	$CoverageCode]) &gt; 0">
								<xsl:for-each select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)]	[ClaimsPaymentCovInfo/CoverageCd 	= 	$CoverageCode]">
									<xsl:call-template name="Display_Vehicle_Info">
										<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
										<xsl:with-param name="ClaimsPayNode" select="."/>
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
										<xsl:with-param name="CMS_veh_cov" select="$CMS_veh_cov"/>
									</xsl:call-template>
									<xsl:if test="$VinId = $VinId1">
										<xsl:call-template name="Display_Vehicle_Shipping">
											<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
											<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
											<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
										</xsl:call-template>
									</xsl:if>
									<xsl:call-template name="Display_Vehicle_Salvage">
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
										<xsl:with-param name="CMS_veh_cov" select="$CMS_veh_cov"/>
									</xsl:call-template>
									<xsl:call-template name="Display_Vehicle_Add_Recovery">
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
										<xsl:with-param name="RecoveryNode" select="$RecoveryNode"/>
									</xsl:call-template>
									<!-- GAURAV : MV15 CODE -->
									<xsl:if test="count($ClaimRoot/InvestigationInfo/com.iso_VehRecall[contains(@ItemRef, $MV01Id)]) &gt; 0">
										<xsl:call-template name="Insert_Header">
											<xsl:with-param name="Data_Name">Vehicle Recall Information</xsl:with-param>
										</xsl:call-template>
										<xsl:for-each select="$ClaimRoot/InvestigationInfo/com.iso_VehRecall[contains(@ItemRef, $MV01Id)]">
											<xsl:variable name="VehRecId" select="@id"/>
											<xsl:variable name="VehRecNode" select="."/>
											<xsl:call-template name="Display_Vehicle_Recall_Info">
												<xsl:with-param name="VehRecNode" select="$VehRecNode"/>
											</xsl:call-template>
										</xsl:for-each>
									</xsl:if>
									<!-- GAURAV : MV15 CODE -->
									<!-- GAURAV : NMVTIS CODE -->
										<xsl:if test="count($ClaimRoot/InvestigationInfo[@ItemRef = $MV01Id]/com.iso_SFNMVTIS[contains(@ItemRef, $MV01Id)]) &gt; 0">									
											<xsl:for-each select="$ClaimRoot/InvestigationInfo[@ItemRef = $MV01Id]/com.iso_SFNMVTIS[@ItemRef = $MV01Id]">				
												<xsl:variable name="NMVTISNode" select="."/>
												<xsl:call-template name="Display_NMVTIS_Info">
													<xsl:with-param name="NMVTISNode" select="$NMVTISNode"/>
												</xsl:call-template>
											</xsl:for-each>
										</xsl:if>
									<!-- GAURAV : NMVTIS CODE -->
								</xsl:for-each>
							</xsl:when>
							<xsl:otherwise>
								<xsl:call-template name="Display_Vehicle_Info">
									<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									<xsl:with-param name="CMS_veh_cov" select="$CMS_veh_cov"/>
								</xsl:call-template>
								<xsl:if test="$VinId = $VinId1">
									<xsl:call-template name="Display_Vehicle_Shipping">
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									</xsl:call-template>
								</xsl:if>
								<xsl:call-template name="Display_Vehicle_Salvage">
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									<xsl:with-param name="CMS_veh_cov" select="$CMS_veh_cov"/>
								</xsl:call-template>
								<xsl:call-template name="Display_Vehicle_Add_Recovery">
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									<xsl:with-param name="RecoveryNode" select="$RecoveryNode"/>
								</xsl:call-template>
								<!-- GAURAV : MV15 CODE -->
								<xsl:if test="count($ClaimRoot/InvestigationInfo/com.iso_VehRecall[contains(@ItemRef, $MV01Id)]) &gt; 0">
									<xsl:call-template name="Insert_Header">
										<xsl:with-param name="Data_Name">Vehicle Recall Information</xsl:with-param>
									</xsl:call-template>
									<xsl:for-each select="$ClaimRoot/InvestigationInfo/com.iso_VehRecall[contains(@ItemRef, $MV01Id)]">
										<xsl:variable name="VehRecId" select="@id"/>
										<xsl:variable name="VehRecNode" select="."/>
										<xsl:call-template name="Display_Vehicle_Recall_Info">
											<xsl:with-param name="VehRecNode" select="$VehRecNode"/>
										</xsl:call-template>
									</xsl:for-each>
								</xsl:if>
								<!-- GAURAV : MV15 CODE -->
								<!-- GAURAV : NMVTIS CODE -->
									<xsl:if test="count($ClaimRoot/InvestigationInfo[@ItemRef = $MV01Id]/com.iso_SFNMVTIS[contains(@ItemRef, $MV01Id)]) &gt; 0">									
										<xsl:for-each select="$ClaimRoot/InvestigationInfo[@ItemRef = $MV01Id]/com.iso_SFNMVTIS[@ItemRef = $MV01Id]">				
											<xsl:variable name="NMVTISNode" select="."/>
											<xsl:call-template name="Display_NMVTIS_Info">
												<xsl:with-param name="NMVTISNode" select="$NMVTISNode"/>
											</xsl:call-template>
										</xsl:for-each>
									</xsl:if>
								<!-- GAURAV : NMVTIS CODE -->
							</xsl:otherwise>
						</xsl:choose>
					</xsl:for-each>
				</xsl:when>
				<xsl:when test="count($ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)]) &gt; 0">
					<xsl:for-each select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)]">
						<xsl:call-template name="Display_Vehicle_Info">
							<xsl:with-param name="ClaimsPayNode" select="."/>
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
							<xsl:with-param name="CMS_veh_cov" select="$CMS_veh_cov"/>
						</xsl:call-template>
						<xsl:if test="$VinId = $VinId1">
							<xsl:call-template name="Display_Vehicle_Shipping">
								<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
								<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
								<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
							</xsl:call-template>
						</xsl:if>
						<xsl:call-template name="Display_Vehicle_Salvage">
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
							<xsl:with-param name="CMS_veh_cov" select="$CMS_veh_cov"/>
						</xsl:call-template>
						<xsl:call-template name="Display_Vehicle_Add_Recovery">
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
							<xsl:with-param name="RecoveryNode" select="$RecoveryNode"/>
						</xsl:call-template>
						<!-- GAURAV : MV15 CODE -->
						<xsl:if test="count($ClaimRoot/InvestigationInfo/com.iso_VehRecall[contains(@ItemRef, $MV01Id)]) &gt; 0">
							<xsl:call-template name="Insert_Header">
								<xsl:with-param name="Data_Name">Vehicle Recall Information</xsl:with-param>
							</xsl:call-template>
							<xsl:for-each select="$ClaimRoot/InvestigationInfo/com.iso_VehRecall[contains(@ItemRef, $MV01Id)]">
								<xsl:variable name="VehRecId" select="@id"/>
								<xsl:variable name="VehRecNode" select="."/>
								<xsl:call-template name="Display_Vehicle_Recall_Info">
									<xsl:with-param name="VehRecNode" select="$VehRecNode"/>
								</xsl:call-template>
							</xsl:for-each>
						</xsl:if>
						<!-- GAURAV : MV15 CODE -->
						<!-- GAURAV : NMVTIS CODE -->
							<xsl:if test="count($ClaimRoot/InvestigationInfo[@ItemRef = $MV01Id]/com.iso_SFNMVTIS[contains(@ItemRef, $MV01Id)]) &gt; 0">									
								<xsl:for-each select="$ClaimRoot/InvestigationInfo[@ItemRef = $MV01Id]/com.iso_SFNMVTIS[@ItemRef = $MV01Id]">				
									<xsl:variable name="NMVTISNode" select="."/>
									<xsl:call-template name="Display_NMVTIS_Info">
										<xsl:with-param name="NMVTISNode" select="$NMVTISNode"/>
									</xsl:call-template>
								</xsl:for-each>
							</xsl:if>
						<!-- GAURAV : NMVTIS CODE -->
					</xsl:for-each>
				</xsl:when>
				<xsl:otherwise>
					<xsl:call-template name="Display_Vehicle_Info">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						<xsl:with-param name="CMS_veh_cov" select="$CMS_veh_cov"/>
					</xsl:call-template>
					<xsl:if test="$VinId = $VinId1">
						<xsl:call-template name="Display_Vehicle_Shipping">
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						</xsl:call-template>
					</xsl:if>
					<xsl:call-template name="Display_Vehicle_Salvage">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						<xsl:with-param name="CMS_veh_cov" select="$CMS_veh_cov"/>
					</xsl:call-template>
					<xsl:call-template name="Display_Vehicle_Add_Recovery">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						<xsl:with-param name="RecoveryNode" select="$RecoveryNode"/>
					</xsl:call-template>
					<!-- GAURAV : MV15 CODE -->
					<xsl:if test="count($ClaimRoot/InvestigationInfo/com.iso_VehRecall[contains(@ItemRef, $MV01Id)]) &gt; 0">
						<xsl:call-template name="Insert_Header">
							<xsl:with-param name="Data_Name">Vehicle Recall Information</xsl:with-param>
						</xsl:call-template>
						<xsl:for-each select="$ClaimRoot/InvestigationInfo/com.iso_VehRecall[contains(@ItemRef, $MV01Id)]">
							<xsl:variable name="VehRecId" select="@id"/>
							<xsl:variable name="VehRecNode" select="."/>
							<xsl:call-template name="Display_Vehicle_Recall_Info">
								<xsl:with-param name="VehRecNode" select="$VehRecNode"/>
							</xsl:call-template>
						</xsl:for-each>
					</xsl:if>
					<!-- GAURAV : MV15 CODE -->
					<!-- GAURAV : NMVTIS CODE -->
						<xsl:if test="count($ClaimRoot/InvestigationInfo[@ItemRef = $MV01Id]/com.iso_SFNMVTIS[contains(@ItemRef, $MV01Id)]) &gt; 0">									
							<xsl:for-each select="$ClaimRoot/InvestigationInfo[@ItemRef = $MV01Id]/com.iso_SFNMVTIS[@ItemRef = $MV01Id]">				
								<xsl:variable name="NMVTISNode" select="."/>
								<xsl:call-template name="Display_NMVTIS_Info">
									<xsl:with-param name="NMVTISNode" select="$NMVTISNode"/>
								</xsl:call-template>
							</xsl:for-each>
						</xsl:if>
					<!-- GAURAV : NMVTIS CODE -->
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>
	<!--CCOR_vehicle-->
	<!--
*********************************************************************************
*	 
*	      Build_Sum_Vehicle_Info
*
*			Builds Coverage,Loss for Auto on Summary Record
*	 
*********************************************************************************
-->
	<xsl:template name="Build_Sum_Vehicle_Info">
		<xsl:param name="ClaimsPartyId"/>
		<xsl:variable name="ClaimRoot" select=".."/>
		<xsl:for-each select="$ClaimRoot/AutoLossInfo[contains(@ClaimsPartyRefs, $ClaimsPartyId)]">
			<xsl:variable name="MV01Id" select="@id"/>
			<xsl:variable name="AutoLossNode" select="."/>
			<xsl:variable name="InvestigationNode" select="$ClaimRoot/InvestigationInfo[@ItemRef = $MV01Id]"/>
			<xsl:variable name="BuyerId" select="$InvestigationNode/SalvageInfo/@BuyerRef"/>
			<xsl:variable name="VinId" select="$ClaimRoot/AutoLossInfo[contains(@ClaimsPartyRefs, $ClaimsPartyId)]/VehInfo/VehIdentificationNumber"/>
			<xsl:variable name="VinId1" select="$ClaimRoot/AutoLossInfo[not(@ClaimsPartyRefs)]/VehInfo/VehIdentificationNumber"/>
			<!-- Additonal Recovery Info -->
			<xsl:variable name="RecoveryNode" select="$ClaimRoot/RecoveryInfo"/>
			<!-- End Additonal Recovery Info -->
			<xsl:choose>
				<xsl:when test="count($ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MV01Id]) &gt; 0">
					<xsl:for-each select="$ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MV01Id]">
						<xsl:variable name="Adjuster" select="."/>
						<xsl:variable name="CoverageCode" select="CoverageCd"/>
						<xsl:choose>
							<xsl:when test="count($ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)][ClaimsPaymentCovInfo/CoverageCd = 	$CoverageCode]) &gt; 0">
								<xsl:for-each select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)]	[ClaimsPaymentCovInfo/CoverageCd 	= 	$CoverageCode]">
									<xsl:call-template name="Display_Sum_Vehicle_Info">
										<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
										<xsl:with-param name="ClaimsPayNode" select="."/>
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									</xsl:call-template>
									<!--
									<xsl:if test="$VinId = $VinId1">
										<xsl:call-template name="Display_Vehicle_Shipping">
											<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
											<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
											<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
										</xsl:call-template>
									</xsl:if>
									<xsl:call-template name="Display_Vehicle_Salvage">
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									</xsl:call-template>
									<xsl:call-template name="Display_Vehicle_Add_Recovery">
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
										<xsl:with-param name="RecoveryNode" select="$RecoveryNode"/>
									</xsl:call-template>
									-->
								</xsl:for-each>
							</xsl:when>
							<xsl:otherwise>
								<xsl:call-template name="Display_Sum_Vehicle_Info">
									<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
								</xsl:call-template>
								<!--
								<xsl:if test="$VinId = $VinId1">
									<xsl:call-template name="Display_Vehicle_Shipping">
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									</xsl:call-template>
								</xsl:if>
								<xsl:call-template name="Display_Vehicle_Salvage">
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
								</xsl:call-template>
								<xsl:call-template name="Display_Vehicle_Add_Recovery">
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									<xsl:with-param name="RecoveryNode" select="$RecoveryNode"/>
								</xsl:call-template>
								-->
							</xsl:otherwise>
						</xsl:choose>
					</xsl:for-each>
				</xsl:when>
				<xsl:when test="count($ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)]) &gt; 0">
					<xsl:for-each select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)]">
						<xsl:call-template name="Display_Sum_Vehicle_Info">
							<xsl:with-param name="ClaimsPayNode" select="."/>
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						</xsl:call-template>
						<!--
						<xsl:if test="$VinId = $VinId1">
							<xsl:call-template name="Display_Vehicle_Shipping">
								<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
								<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
								<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
							</xsl:call-template>
						</xsl:if>
						<xsl:call-template name="Display_Vehicle_Salvage">
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						</xsl:call-template>
						<xsl:call-template name="Display_Vehicle_Add_Recovery">
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
							<xsl:with-param name="RecoveryNode" select="$RecoveryNode"/>
						</xsl:call-template>
						-->
					</xsl:for-each>
				</xsl:when>
				<xsl:otherwise>
					<xsl:call-template name="Display_Sum_Vehicle_Info">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
					</xsl:call-template>
					<!--
					<xsl:if test="$VinId = $VinId1">
						<xsl:call-template name="Display_Vehicle_Shipping">
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						</xsl:call-template>
					</xsl:if>
					<xsl:call-template name="Display_Vehicle_Salvage">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
					</xsl:call-template>
					<xsl:call-template name="Display_Vehicle_Add_Recovery">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						<xsl:with-param name="RecoveryNode" select="$RecoveryNode"/>
					</xsl:call-template>
					-->
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>
	<!--end CCOR_Vehicle-->
	<!--
*********************************************************************************
*	 
*	      replace-string Template
*
*			Recursively replaces the $replace string with the $with string 
*			in the $text string
*	 
*********************************************************************************

 <xsl:template name="replace-string">
 	<xsl:param name="text"/>
 	<xsl:param name="replace"/>
 	<xsl:param name="with"/>
 	<xsl:choose>
		<xsl:when test="contains($text,$replace)">
 			<xsl:value-of select="substring-before($text,$replace)"/>
 			<xsl:value-of select="$with"/>
 			<xsl:call-template name="replace-string">
 				<xsl:with-param name="text" select="substring-after($text,$replace)"/>
 				<xsl:with-param name="replace" select="$replace"/>
 				<xsl:with-param name="with" select="$with"/>
 			</xsl:call-template>
 		</xsl:when>
		<xsl:otherwise>
 			<xsl:value-of select="$text"/>
 		</xsl:otherwise>
 	</xsl:choose>
 </xsl:template>
-->
	<!--
*********************************************************************************
*	 
*	      Name="Display_Matching_Claims" Template
*
*			Builds the Matching Claims  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_Matching_Claims">
		<xsl:param name="ClaimInvestAR_Node"/>
		<table>
			<HR size="2" color="BLACK" width="670"/>
		</table>
		<br/>
		<br/>
		<table cellpadding="2" cellspacing="0" border="0" bgcolor="#EFEFEF" width="670">
			<tr>
				<td height="20">
					<xsl:variable name="FileNumber" select="ClaimsOccurrence/ItemIdInfo/AgencyId"/>
					<xsl:call-template name="Insert_Anchor">
						<xsl:with-param name="AnchorName" select="$FileNumber"/>
					</xsl:call-template>
					<xsl:call-template name="Insert_Anchor_Link">
						<xsl:with-param name="LinkName">
							<xsl:text>back</xsl:text>
						</xsl:with-param>
						<xsl:with-param name="AnchorName">
							<xsl:text>SUMMARY FOR EACH SEARCHABLE PARTY</xsl:text>
							<!--<xsl:text>InitiatingClaim</xsl:text>-->
						</xsl:with-param>
					</xsl:call-template>
				</td>
			</tr>
			<tr>
				<td nowrap="nowrap">
					<p>
						<font size="4" face="Arial">
							<b>
								<xsl:text>Matching Claim</xsl:text>
							</b>
						</font>
					</p>
				</td>
				<td align="right">
					<p>
						<font size="4" face="Arial">
							<b>
								<xsl:text>File Number: </xsl:text>
							</b>
							<xsl:variable name="FileNumber1" select="ClaimsOccurrence/ItemIdInfo/AgencyId"/>
							<xsl:value-of select="$FileNumber1"/>
						</font>
					</p>
				</td>
			</tr>
			<xsl:variable name="MA03_NICBRef" select="ClaimsOccurrence/com.iso_NICBReferralInd"/>
			<xsl:if test="count($MA03_NICBRef) &gt; 0">
				<xsl:call-template name="Insert_Data2">
					<xsl:with-param name="Data_Value">
						<!--<xsl:value-of select="ClaimsOccurrence/com.iso_MoldInd"/>-->
						<xsl:if test="$MA03_NICBRef='Y'">This claim was referred to the NICB</xsl:if>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:call-template name="Display_MatchSummary">
				<xsl:with-param name="MatchRoot" select="."/>
			</xsl:call-template>
			<xsl:call-template name="Display_Matching_Vehicle_Export"/>
			<xsl:call-template name="Display_Matching_Vehicle_Impound"/>
			<xsl:call-template name="Display_Matching_General_Info"/>
			<!-- Get each involved party and display their info -->
			<xsl:for-each select="ClaimsParty[ClaimsPartyInfo/ClaimsPartyRoleCd = 'CL' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'CI' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'CD' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'CP' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'ID' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'IP' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'IE' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'IN' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'OW' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'PT' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'TN' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'WT' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'CE' or ClaimsPartyInfo/ClaimsPartyRoleCd = 'GM']">
				<xsl:variable name="MO02Id" select="@id"/>
				<xsl:variable name="DMId" select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO02Id and ClaimsPartyRole2Cd = 'DeathMaster']/@ClaimsParty2Ref"/>
				<xsl:call-template name="Display_Matching_Involved_Party">
					<xsl:with-param name="DeathMasterNode" select="../ClaimsParty[@id = $DMId]"/>
				</xsl:call-template>
				<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO02Id and ClaimsPartyRole2Cd = 'Alias']">
					<xsl:variable name="AliasId" select="@ClaimsParty2Ref"/>
					<xsl:for-each select="../ClaimsParty[@id = $AliasId]">
						<xsl:call-template name="Display_Matching_Alias">
							<xsl:with-param name="DeathMasterNode" select="../ClaimsParty[@id = $DMId]"/>
						</xsl:call-template>
					</xsl:for-each>
				</xsl:for-each>
				<!--	This will check for the service providers for this involved party-->
				<!-- commented on 08/03/2006 added LW,ME,MF,MK. removed 'LA'-->
				<!--<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO02Id and (ClaimsPartyRole2Cd = 'CO' or ClaimsPartyRole2Cd = 'CT' or ClaimsPartyRole2Cd = 'EM' or ClaimsPartyRole2Cd = 'BS' or ClaimsPartyRole2Cd = 'BO' or ClaimsPartyRole2Cd = 'IO' or ClaimsPartyRole2Cd = 'IR' or ClaimsPartyRole2Cd = 'IA' or ClaimsPartyRole2Cd = 'MD' or ClaimsPartyRole2Cd = 'MC' or ClaimsPartyRole2Cd = 'MA' or ClaimsPartyRole2Cd = 'MO' or ClaimsPartyRole2Cd = 'MN' or ClaimsPartyRole2Cd = 'ML' or ClaimsPartyRole2Cd = 'MT' or ClaimsPartyRole2Cd = 'MS' or ClaimsPartyRole2Cd = 'MG' or ClaimsPartyRole2Cd = 'MH' or ClaimsPartyRole2Cd = 'MZ' or ClaimsPartyRole2Cd = 'MM' or ClaimsPartyRole2Cd = 'MX' or ClaimsPartyRole2Cd = 'LR' or ClaimsPartyRole2Cd = 'LM' or ClaimsPartyRole2Cd = 'LO' or ClaimsPartyRole2Cd = 'IY' or ClaimsPartyRole2Cd = 'IB' or ClaimsPartyRole2Cd = 'IS' or ClaimsPartyRole2Cd = 'II' or ClaimsPartyRole2Cd = 'MR' or ClaimsPartyRole2Cd = 'OS' or ClaimsPartyRole2Cd = 'PH' or ClaimsPartyRole2Cd = 'PS' or ClaimsPartyRole2Cd = 'MY' or ClaimsPartyRole2Cd = 'FM' or ClaimsPartyRole2Cd = 'SM' or ClaimsPartyRole2Cd = 'NP' or ClaimsPartyRole2Cd = 'OP' or ClaimsPartyRole2Cd = 'LP' or ClaimsPartyRole2Cd = 'PA' or ClaimsPartyRole2Cd = 'LA' or ClaimsPartyRole2Cd = 'LI' or ClaimsPartyRole2Cd = 'BE' or ClaimsPartyRole2Cd = 'TW' or ClaimsPartyRole2Cd = 'LC')]">-->
				<!-- GAURAV : Added OR to the list.-->
				<!-- GAURAV : Added GU, PW to the list.-->
				<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $MO02Id and (ClaimsPartyRole2Cd = 'CO' or ClaimsPartyRole2Cd = 'CT' or ClaimsPartyRole2Cd = 'EM' or ClaimsPartyRole2Cd = 'BS' or ClaimsPartyRole2Cd = 'BO' or ClaimsPartyRole2Cd = 'IO' or ClaimsPartyRole2Cd = 'IR' or ClaimsPartyRole2Cd = 'IA' or ClaimsPartyRole2Cd = 'MD' or ClaimsPartyRole2Cd = 'MC' or ClaimsPartyRole2Cd = 'MA' or ClaimsPartyRole2Cd = 'MO' or ClaimsPartyRole2Cd = 'MN' or ClaimsPartyRole2Cd = 'ML' or ClaimsPartyRole2Cd = 'MT' or ClaimsPartyRole2Cd = 'MS' or ClaimsPartyRole2Cd = 'MG' or ClaimsPartyRole2Cd = 'MH' or ClaimsPartyRole2Cd = 'MZ' or ClaimsPartyRole2Cd = 'MM' or ClaimsPartyRole2Cd = 'MX' or ClaimsPartyRole2Cd = 'LR' or ClaimsPartyRole2Cd = 'LM' or ClaimsPartyRole2Cd = 'LO' or ClaimsPartyRole2Cd = 'IY' or ClaimsPartyRole2Cd = 'IB' or ClaimsPartyRole2Cd = 'IS' or ClaimsPartyRole2Cd = 'II' or ClaimsPartyRole2Cd = 'MR' or ClaimsPartyRole2Cd = 'OS' or ClaimsPartyRole2Cd = 'PH' or ClaimsPartyRole2Cd = 'PS' or ClaimsPartyRole2Cd = 'MY' or ClaimsPartyRole2Cd = 'FM' or ClaimsPartyRole2Cd = 'SM' or ClaimsPartyRole2Cd = 'NP' or ClaimsPartyRole2Cd = 'OP' or ClaimsPartyRole2Cd = 'LP' or ClaimsPartyRole2Cd = 'PA' or ClaimsPartyRole2Cd = 'LI' or ClaimsPartyRole2Cd = 'BE' or ClaimsPartyRole2Cd = 'TW' or ClaimsPartyRole2Cd = 'LC' or ClaimsPartyRole2Cd = 'LW'  or ClaimsPartyRole2Cd = 'ME' or ClaimsPartyRole2Cd = 'MF' or ClaimsPartyRole2Cd = 'MK' or ClaimsPartyRole2Cd = 'OR' or ClaimsPartyRole2Cd = 'GU' or ClaimsPartyRole2Cd = 'PW')]">
					<xsl:variable name="SPId" select="@ClaimsParty2Ref"/>
					<xsl:for-each select="../ClaimsParty[@id = $SPId]">
						<xsl:call-template name="Display_Matching_Service_Provider"/>
						<xsl:for-each select="../ClaimsPartyRelationship[@ClaimsParty1Ref = $SPId and ClaimsPartyRole2Cd = 'Alias']">
							<xsl:variable name="AliasId" select="@ClaimsParty2Ref"/>
							<xsl:for-each select="../ClaimsParty[@id = $AliasId]">
								<xsl:call-template name="Display_Matching_Alias"/>
							</xsl:for-each>
						</xsl:for-each>
					</xsl:for-each>
				</xsl:for-each>
				<xsl:if test="count(ClaimsInjuredInfo) &gt; 0">
					<!-- Get Casualy info -->
					<xsl:call-template name="Build_Matching_Casualty_Info">
						<xsl:with-param name="ClaimsPartyId" select="$MO02Id"/>
					</xsl:call-template>
				</xsl:if>
				<xsl:if test="count(../AutoLossInfo[contains(@ClaimsPartyRefs, $MO02Id)]) &gt; 0">
					<!-- Get Auto loss info -->
					<xsl:call-template name="Build_Matching_Vehicle_Info">
						<xsl:with-param name="ClaimsPartyId" select="$MO02Id"/>
					</xsl:call-template>
				</xsl:if>
				<xsl:if test="count(../PropertyLossInfo[contains(@ClaimsPartyRefs, $MO02Id)]) &gt; 0">
					<!-- Get property loss info -->
					<xsl:call-template name="Build_Matching_Property_Info">
						<xsl:with-param name="ClaimsPartyId" select="$MO02Id"/>
					</xsl:call-template>
				</xsl:if>
				<xsl:if test="count(../PropertyLossInfo[contains(@ClaimsPartyRefs, $MO02Id)]) &gt; 0">
					<!-- Get property loss info -->
					<xsl:call-template name="Build_Matching_PropertyLoss_Info">
						<xsl:with-param name="ClaimsPartyId" select="$MO02Id"/>
					</xsl:call-template>
				</xsl:if>
			</xsl:for-each>
		</table>
		<table cellpadding="2" cellspacing="0" border="0" bgcolor="#EFEFEF" width="670">
			<tr>
				<td>
					<xsl:if test="string-length(normalize-space(ClaimsOccurrence/com.iso_StatementOfDisputeInd)) &gt; 0 ">
						<xsl:variable name="MA03_SOD" select="ClaimsOccurrence/com.iso_StatementOfDisputeInd"/>
						<xsl:call-template name="Insert_SOD_Data">
							<xsl:with-param name="Data_Value">
								<!--<xsl:value-of select="ClaimsOccurrence/com.iso_MoldInd"/>-->
								<xsl:if test="$MA03_SOD='Y'">There is a citizen dispute on this claim. For more information, please contact ISO ClaimSearch Customer Service at 800-888-4476, Option 2, 2.</xsl:if>
							</xsl:with-param>
						</xsl:call-template>
					</xsl:if>
				</td>
			</tr>
		</table>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Build_Matching_Casualty_Info
*
*			Builds matching casualty records then displays them.
*	 
*********************************************************************************
-->
	<xsl:template name="Build_Matching_Casualty_Info">
		<xsl:param name="ClaimsPartyId"/>
		<xsl:variable name="MC01Id" select="ClaimsInjuredInfo/@id"/>
		<xsl:variable name="ClaimsInjuredInfo" select="ClaimsInjuredInfo"/>
		<xsl:variable name="ClaimRoot" select=".."/>
		<xsl:choose>
			<!-- first see if we have an adjuster -->
			<xsl:when test="count($ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MC01Id]) &gt; 0">
				<xsl:for-each select="$ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MC01Id]">
					<xsl:variable name="Adjuster" select="."/>
					<xsl:variable name="CoverageCode" select="CoverageCd"/>
					<xsl:choose>
						<!-- See if we have payment info -->
						<xsl:when test="count($ClaimRoot/ClaimsPayment[@idref = $MC01Id][not(PaymentTypeCd)]	[ClaimsPaymentCovInfo/CoverageCd = $CoverageCode])  &gt; 0">
							<!-- use ClaimsPayment pointing to this casualty -->
							<xsl:for-each select="$ClaimRoot/ClaimsPayment[@idref = $MC01Id][not(PaymentTypeCd)]		[ClaimsPaymentCovInfo/CoverageCd = $CoverageCode]">
								<xsl:call-template name="Display_Matching_Casualty_Info">
									<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
									<xsl:with-param name="ClaimsPayNode" select="."/>
									<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
								</xsl:call-template>
							</xsl:for-each>
						</xsl:when>
						<xsl:when test="count($ClaimRoot/ClaimsPayment[@ClaimsPartyRefs = $ClaimsPartyId][not(PaymentTypeCd)]		[ClaimsPaymentCovInfo/CoverageCd = $CoverageCode])  &gt; 0">
							<!-- Use default ClaimsPayment info -->
							<xsl:for-each select="$ClaimRoot/ClaimsPayment[@ClaimsPartyRefs = $ClaimsPartyId][not(PaymentTypeCd)]		[ClaimsPaymentCovInfo/CoverageCd = $CoverageCode]">
								<xsl:call-template name="Display_Matching_Casualty_Info">
									<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
									<xsl:with-param name="ClaimsPayNode" select="."/>
									<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
								</xsl:call-template>
							</xsl:for-each>
						</xsl:when>
						<xsl:otherwise>
							<!-- Don't use ClaimsPayment info -->
							<xsl:call-template name="Display_Matching_Casualty_Info">
								<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
								<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
								<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							</xsl:call-template>
						</xsl:otherwise>
					</xsl:choose>
				</xsl:for-each>
			</xsl:when>
			<xsl:when test="count($ClaimRoot/ClaimsPayment[@idref = $MC01Id][not(PaymentTypeCd)]) &gt; 0">
				<!-- don't have an adjuster, just get claim payment info -->
				<xsl:for-each select="$ClaimRoot/ClaimsPayment[@idref = $MC01Id][not(PaymentTypeCd)]">
					<!-- use ClaimsPayment pointing to this casualty -->
					<xsl:call-template name="Display_Matching_Casualty_Info">
						<xsl:with-param name="ClaimsPayNode" select="."/>
						<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
					</xsl:call-template>
				</xsl:for-each>
			</xsl:when>
			<xsl:when test="count($ClaimRoot/ClaimsPayment[@ClaimsPartyRefs = $ClaimsPartyId][not(PaymentTypeCd)])  &gt; 0">
				<!-- Use default ClaimsPayment info -->
				<xsl:for-each select="$ClaimRoot/ClaimsPayment[@ClaimsPartyRefs = $ClaimsPartyId][not(PaymentTypeCd)]">
					<xsl:call-template name="Display_Matching_Casualty_Info">
						<xsl:with-param name="ClaimsPayNode" select="."/>
						<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
					</xsl:call-template>
				</xsl:for-each>
			</xsl:when>
			<xsl:otherwise>
				<!-- no payments or adjusters for this casualty -->
				<xsl:call-template name="Display_Matching_Casualty_Info">
					<xsl:with-param name="ClaimsInjNode" select="$ClaimsInjuredInfo"/>
					<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Build_Matching_Property_Info
*
*			Builds matching property records then displays them.
*	 
*********************************************************************************
-->
	<xsl:template name="Build_Matching_Property_Info">
		<xsl:param name="ClaimsPartyId"/>
		<xsl:variable name="ClaimRoot" select=".."/>
		<xsl:variable name="PropLossNode" select="$ClaimRoot/PropertyLossInfo[contains(@ClaimsPartyRefs, $ClaimsPartyId)]"/>
		<xsl:variable name="MPId" select="$PropLossNode/@id"/>
		<xsl:variable name="BuyerId" select="$ClaimRoot/InvestigationInfo/SalvageInfo/@BuyerRef"/>
		<xsl:choose>
			<!-- see if we are building a property loss or a boat/mobile vehicle loss -->
			<xsl:when test="count($PropLossNode/Watercraft) &gt; 0 or count($PropLossNode/ItemInfo) &gt; 0">
				<xsl:variable name="WaterCraftId" select="$PropLossNode/Watercraft/@id"/>
				<xsl:variable name="MobileId" select="$PropLossNode/ItemInfo/@id"/>
				<xsl:variable name="Adjuster" select="$ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $WaterCraftId or @AssignmentRef = $MobileId or @AssignmentRef = $MPId]"/>
				<xsl:variable name="CoverageCode" select="$Adjuster/CoverageCd"/>
				<!--WaterCraftId = <xsl:value-of select="$WaterCraftId"/>-->
				<xsl:call-template name="Display_Matching_Boat_Mobile_Property">
					<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
					<xsl:with-param name="ClaimsPartyId" select="$ClaimsPartyId"/>
					<xsl:with-param name="InvestigationNode" select="$ClaimRoot/InvestigationInfo[RecoveryInfo][@ItemRef = $WaterCraftId or @ItemRef = $MobileId or @ItemRef = $MPId]"/>
					<xsl:with-param name="ClaimsPayNode" select="$ClaimRoot/ClaimsPayment[@idref = $WaterCraftId or @idref = $MobileId or @idref = $MPId][not(PaymentTypeCd)][ClaimsPaymentCovInfo/CoverageCd = $CoverageCode]"/>
					<xsl:with-param name="ClaimsPartyNode" select="$ClaimRoot/ClaimsParty[@id=$ClaimsPartyId]"/>
					<xsl:with-param name="PropLossNode" select="$PropLossNode"/>
					<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
				</xsl:call-template>
				<xsl:call-template name="Display_Matching_Water_Mobile_Salvage">
					<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
					<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
					<xsl:with-param name="PropLossNode" select="$PropLossNode"/>
				</xsl:call-template>
			</xsl:when>
			
			<xsl:otherwise>
				<xsl:variable name="Adjuster" select="$ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MPId]"/>
				<xsl:variable name="CoverageCode" select="$Adjuster/CoverageCd"/>
				<xsl:call-template name="Display_Matching_Property_Info">
					<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
					<xsl:with-param name="ClaimsPayNode" select="$ClaimRoot/ClaimsPayment[@idref = $MPId][not(PaymentTypeCd)][ClaimsPaymentCovInfo/CoverageCd = $CoverageCode]"/>
					<xsl:with-param name="ClaimsPartyNode" select="$ClaimRoot/ClaimsParty[@id=$ClaimsPartyId]"/>
					<xsl:with-param name="PropLossNode" select="$PropLossNode"/>
					<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
				</xsl:call-template>
			</xsl:otherwise>
			
		</xsl:choose>
	</xsl:template>
	<xsl:template name="Build_Matching_PropertyLoss_Info">
		<xsl:param name="ClaimsPartyId"/>
		<xsl:variable name="ClaimRoot" select=".."/>
		<xsl:variable name="PropLossNode" select="$ClaimRoot/PropertyLossInfo[contains(@ClaimsPartyRefs, $ClaimsPartyId)]"/>
		<xsl:variable name="MPId" select="$PropLossNode/@id"/>
		<xsl:variable name="Adjuster" select="$ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MPId]"/>
		<xsl:variable name="CoverageCode" select="$Adjuster/CoverageCd"/>
		<xsl:if test="count($PropLossNode/Watercraft[not(@id)]) &gt; 0 or count($PropLossNode/ItemInfoWatercraft[not(@id)]) &gt; 0">
			<xsl:call-template name="Display_Matching_Property_Info">
				<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
				<xsl:with-param name="ClaimsPayNode" select="$ClaimRoot/ClaimsPayment[@idref = $MPId][not(PaymentTypeCd)]	[ClaimsPaymentCovInfo/CoverageCd = $CoverageCode]"/>
				<xsl:with-param name="ClaimsPartyNode" select="$ClaimRoot/ClaimsParty[@id=$ClaimsPartyId]"/>
				<xsl:with-param name="PropLossNode" select="$PropLossNode"/>
				<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Build_Matching_Vehicle_Info
*
*			Builds matching vehicle records then displays them.
*	 
*********************************************************************************
-->
	<xsl:template name="Build_Matching_Vehicle_Info">
		<xsl:param name="ClaimsPartyId"/>
		<xsl:variable name="ClaimRoot" select=".."/>
		<xsl:for-each select="$ClaimRoot/AutoLossInfo[contains(@ClaimsPartyRefs, $ClaimsPartyId)]">
			<xsl:variable name="MV01Id" select="@id"/>
			<xsl:variable name="AutoLossNode" select="."/>
			<xsl:variable name="InvestigationNode" select="$ClaimRoot/InvestigationInfo[@ItemRef = $MV01Id]"/>
			<xsl:variable name="BuyerId" select="$InvestigationNode/SalvageInfo/@BuyerRef"/>
			<xsl:choose>
				<xsl:when test="count($ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MV01Id]) &gt; 0">
					<xsl:for-each select="$ClaimRoot/AdjusterParty/AdjusterPartyInfo[@AssignmentRef = $MV01Id]">
						<xsl:variable name="Adjuster" select="."/>
						<xsl:variable name="CoverageCode" select="CoverageCd"/>
						<xsl:choose>
							<xsl:when test="count($ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)][ClaimsPaymentCovInfo/CoverageCd = 	$CoverageCode]) &gt; 0">
								<xsl:for-each select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)]	[ClaimsPaymentCovInfo/CoverageCd 	= 	$CoverageCode]">
									<xsl:call-template name="Display_Matching_Vehicle_Info">
										<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
										<xsl:with-param name="ClaimsPayNode" select="."/>
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									</xsl:call-template>
									<xsl:call-template name="Display_Matching_Vehicle_Recovery">
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									</xsl:call-template>
									<xsl:call-template name="Display_Matching_Vehicle_Shipping">
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									</xsl:call-template>
									<xsl:call-template name="Display_Matching_Vehicle_Impound">
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									</xsl:call-template>
									<xsl:call-template name="Display_Matching_Vehicle_Export">
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									</xsl:call-template>
									<xsl:call-template name="Display_Matching_Vehicle_Salvage">
										<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
										<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
										<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
										<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
									</xsl:call-template>
								</xsl:for-each>
							</xsl:when>
							<xsl:otherwise>
								<xsl:call-template name="Display_Matching_Vehicle_Info">
									<xsl:with-param name="AdjusterNode" select="$Adjuster"/>
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
								</xsl:call-template>
								<xsl:call-template name="Display_Matching_Vehicle_Recovery">
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
								</xsl:call-template>
								<xsl:call-template name="Display_Matching_Vehicle_Shipping">
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
								</xsl:call-template>
								<xsl:call-template name="Display_Matching_Vehicle_Impound">
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
								</xsl:call-template>
								<xsl:call-template name="Display_Matching_Vehicle_Export">
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
								</xsl:call-template>
								<xsl:call-template name="Display_Matching_Vehicle_Salvage">
									<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
									<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
									<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
									<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
								</xsl:call-template>
							</xsl:otherwise>
						</xsl:choose>
					</xsl:for-each>
				</xsl:when>
				<xsl:when test="count($ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)]) &gt; 0">
					<xsl:for-each select="$ClaimRoot/ClaimsPayment[@idref = $MV01Id][not(PaymentTypeCd)]">
						<xsl:call-template name="Display_Matching_Vehicle_Info">
							<xsl:with-param name="ClaimsPayNode" select="."/>
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						</xsl:call-template>
						<xsl:call-template name="Display_Matching_Vehicle_Recovery">
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						</xsl:call-template>
						<xsl:call-template name="Display_Matching_Vehicle_Shipping">
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						</xsl:call-template>
						<xsl:call-template name="Display_Matching_Vehicle_Impound">
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						</xsl:call-template>
						<xsl:call-template name="Display_Matching_Vehicle_Export">
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						</xsl:call-template>
						<xsl:call-template name="Display_Matching_Vehicle_Salvage">
							<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
							<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
							<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
							<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
						</xsl:call-template>
					</xsl:for-each>
				</xsl:when>
				<xsl:otherwise>
					<xsl:call-template name="Display_Matching_Vehicle_Info">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="ClaimPartyNode" select="$ClaimRoot/ClaimsParty[@id = $ClaimsPartyId]"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
					</xsl:call-template>
					<xsl:call-template name="Display_Matching_Vehicle_Recovery">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
					</xsl:call-template>
					<xsl:call-template name="Display_Matching_Vehicle_Shipping">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
					</xsl:call-template>
					<xsl:call-template name="Display_Matching_Vehicle_Impound">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
					</xsl:call-template>
					<xsl:call-template name="Display_Matching_Vehicle_Export">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
					</xsl:call-template>
					<xsl:call-template name="Display_Matching_Vehicle_Salvage">
						<xsl:with-param name="VehLossNode" select="$AutoLossNode"/>
						<xsl:with-param name="BuyerNode" select="$ClaimRoot/ClaimsParty[@id = $BuyerId]"/>
						<xsl:with-param name="ClaimRoot" select="$ClaimRoot"/>
						<xsl:with-param name="InvestigationNode" select="$InvestigationNode"/>
					</xsl:call-template>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      MatchCount Template
*
*			Determines the number of matches found and the basis for the 
*			match(es) and formats the row for the screen.
*	 
*********************************************************************************
-->
	<xsl:template name="MatchCount">
		<tr>
			<td colspan="4" align="left" class="bodytext-bold">
				<font size="4">
					<b>
						<xsl:attribute name="width"><xsl:value-of select="500"/></xsl:attribute>
						<xsl:choose>
							<xsl:when test="count(ClaimInvestigationAddRs/MatchDetails) = 0">
								<xsl:text>No Matches Found</xsl:text>
								<br/>
							</xsl:when>
							<xsl:when test="count(ClaimInvestigationAddRs/MatchDetails) = 1">
								<xsl:value-of select="count(ClaimInvestigationAddRs/MatchDetails)"/>
								<xsl:text/>
								<xsl:text>Match Found</xsl:text>
								<br/>
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="count(ClaimInvestigationAddRs/MatchDetails)"/>
								<xsl:text/>
								<xsl:text>Matches Found</xsl:text>
								<br/>
							</xsl:otherwise>
						</xsl:choose>
					</b>
				</font>
			</td>
		</tr>
	</xsl:template>
</xsl:stylesheet>
