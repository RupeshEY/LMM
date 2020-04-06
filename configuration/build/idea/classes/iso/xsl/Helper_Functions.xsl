<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<!--
*********************************************************************************
*	 
*	      Insert_PropertyLoss Template
*
*			Display the Property Loss records
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_PropLost">
		<xsl:param name="Display_Name"/>
		<xsl:param name="Display_Value"/>
		<xsl:if test="string-length($Display_Value) > 0">
			<!--<xsl:if test="string-length($Context) > 0">-->
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name"/>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$Display_Name"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!--start CCOR-->
	<!--
*********************************************************************************
*	 
*	      Insert_sum_Data Template
*
*			Adds the row and cell if the Data Value is not null
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Sum_Data">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Value"/>
		<xsl:param name="Data_Code_Value"/>
		<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">
			<tr>
				<td align="left">
					<font size="2" face="Arial">
						<b>
							<xsl:value-of select="$Data_Value"/>
							<xsl:value-of select="$Data_Code_Value"/>
						</b>
					</font>
				</td>
			</tr>
		</xsl:if>
	</xsl:template>
	<!-- 
*********************************************************************************
*	 
*	      Insert_Header_Using_Code_List Template
*
*			Adds a Header
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_sum_Header_Using_Code_List">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Code"/>
		<xsl:param name="Data_Code_Value"/>
		<xsl:choose>
			<xsl:when test="string-length(normalize-space($Data_Code_Value)) &gt; 0">
				<xsl:call-template name="Insert_Header">
					<xsl:with-param name="Data_Name">
						<xsl:value-of select="$Data_Name"/>:
						</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$Data_Code_Value"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="Insert_Header">
					<xsl:with-param name="Data_Name">
						<font face="Arial">
							<xsl:value-of select="$Data_Name"/>
						</font>
					</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$Data_Code"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!--end CCOR-->
	<!--
*********************************************************************************
*	 
*	      Insert_Data Template
*
*			Adds the row and cell if the Data Value is not null
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Data">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Value"/>
		<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">
			<tr>
				<td align="left" nowrap="nowrap">
				&#160;&#160;
					<xsl:if test="string-length(normalize-space($Data_Name)) &gt; 0">
						<font size="2" face="Arial">
							<b>
								<xsl:value-of select="$Data_Name"/>:</b>
						</font>
					</xsl:if>
				</td>
				<td align="left" nowrap="nowrap">
					<font size="2" face="Arial">
						<xsl:value-of select="$Data_Value"/>
					</font>
				</td>
			</tr>
		</xsl:if>
	</xsl:template>
	<xsl:template name="Insert_inception">
		<xsl:param name="Title"/>
		<xsl:param name="Title1"/>
		<xsl:param name="Addr1"/>
		<xsl:param name="Addr2"/>
		<xsl:param name="City"/>
		<xsl:param name="State"/>
		<xsl:param name="ZipCode"/>
		<xsl:param name="Country"/>
		<xsl:param name="incept"/>
		<xsl:param name="expir"/>
		<xsl:if test="string-length(string(normalize-space($incept))) &gt; 0">
			<tr>
				<td nowrap="nowrap">
				&#160;&#160;
					<b>
						<font size="2" face="Arial">
							<xsl:value-of select="$Title"/>:</font>
					</b>
					<font size="2" face="Arial">
						<xsl:value-of select="$incept"/>
					</font>
				</td>
				<td nowrap="nowrap">
					<b>
						<font size="2" face="Arial">
							<xsl:value-of select="$Title1"/>:</font>
					</b>
				</td>
				<td>
					<font size="2" face="Arial">
						<xsl:value-of select="$expir"/>
					</font>
				</td>
			</tr>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_Simple_Data_Label Template
*
*			Adds the row and cell if the Data Value is not null
*
*			GAURAV : Insert Simple Data LABEL
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Simple_Data_Label">
		<xsl:param name="Data_Name"/>
		<font size="2" face="Arial">
			<b>
				<xsl:value-of select="$Data_Name"/>:</b>
		</font>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_Simple_Data_Value Template
*
*			Adds the row and cell if the Data Value is not null
*
*			GAURAV : Insert Simple Data VALUE
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Simple_Data_Value">
		<xsl:param name="Data_Value"/>
		<font size="2" face="Arial">
			<xsl:value-of select="$Data_Value"/>
		</font>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_Simple_Data Template
*
*			Adds the row and cell if the Data Value is not null
*
*			GAURAV : Insert Simple Data
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Simple_Data">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Value"/>
		<font size="2" face="Arial">
			<b>
				<xsl:value-of select="$Data_Name"/>:</b>
		</font>
			&#160;&#160;
			<font size="2" face="Arial">
			<xsl:value-of select="$Data_Value"/>
		</font>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_Data Template
*
*			Adds the row and cell if the Data Value is not null
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Data1">
		<xsl:param name="Data_Name"/>
		<!--		<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">-->
		<tr>
			<td align="left">
				&#160;&#160;
<!--					<xsl:if test="string-length(normalize-space($Data_Name)) &gt; 0">-->
				<font size="2" face="Arial">
					<b>
						<xsl:value-of select="$Data_Name"/>:</b>
				</font>
				<!--			</xsl:if>-->
			</td>
		</tr>
		<!--		</xsl:if>-->
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_Data Template
*
*			Adds the row and cell if the Data Value is not null
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Data2">
		<xsl:param name="Data_Value"/>
		<tr>
			<td align="left">
				&#160;&#160;
				</td>
			<td align="left">
				<font size="2" face="Arial">
					<b>
						<xsl:value-of select="$Data_Value"/>
					</b>
				</font>
			</td>
		</tr>
	</xsl:template>
		<!--
*********************************************************************************
*	 
*	      Insert_PropSchdInd Template
*
*			Adds the row and cell if the Data Value is not null
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_PropSchdInd">
		<xsl:param name="Data_Value"/>
		<tr>
			<td align="left">
				<font size="2" face="Arial">
					<b>
						<xsl:value-of select="$Data_Value"/>
					</b>
				</font>
			</td>
		</tr>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_MV14 Template
*
*			Adds the row and cell if the Data Value is not null
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_MV14_Data">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Value"/>
		<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">
			<tr>
				<td align="left">
				&#160;&#160;
					<xsl:if test="string-length(normalize-space($Data_Name)) &gt; 0">
						<font size="2" face="Arial">
							<b>
								<xsl:value-of select="$Data_Name"/>
							</b>
						</font>
					</xsl:if>
				</td>
				<td align="left">
					<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">
						<font size="2" face="Arial">
							<xsl:value-of select="$Data_Value"/>
						</font>
					</xsl:if>
				</td>
			</tr>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_SOD Template
*
*			Adds the row and cell if the Data Value is not null
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_SOD_Data">
		<xsl:param name="Data_Value"/>
		<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">
			<table width="500">
				<tr>
					<td align="left">
				&#160;&#160;
					<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">
							<font size="2" face="Arial">
								<b>
									<xsl:value-of select="$Data_Value"/>
								</b>
							</font>
						</xsl:if>
					</td>
				</tr>
			</table>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_MCD#Data Template
*
*			Adds the row and cell if the Data Value is not null
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_CD_Score">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Value"/>
		<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">
			<xsl:value-of select="$Data_Value"/>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_raw and adjust score#Data Template
*
*			Adds the row and cell if the Data Value is not null
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_CD_Raw_Adjust_Score">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Value"/>
		<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">
			<xsl:if test="string-length(normalize-space($Data_Name)) &gt; 0">
				<font size="2" face="Arial">
					<b>
						<xsl:value-of select="$Data_Name"/>:</b>
				</font>
			</xsl:if>
			<font size="2" face="Arial">
				<xsl:value-of select="$Data_Value"/>
			</font>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_Description_Data Template
*
*			Adds the row and cell if the Data Value is not null
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Description_Data">
		<xsl:param name="Data_Value"/>
		<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">
			<tr>
				<td align="left" colspan="2">
					<li>
						<font size="2" face="Arial">
							<xsl:value-of select="$Data_Value"/>
						</font>
					</li>
				</td>
			</tr>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_CDSCore_Data Template
*
*			Adds the row and cell if the Data Value is not null
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Claim_Score_Data">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Value"/>
		<xsl:choose>
			<xsl:when test="string-length(normalize-space($Data_Value)) &gt; 0">
				<tr>
					<td align="left">
						<xsl:if test="string-length(normalize-space($Data_Name)) &gt; 0">
							<font size="2" face="Arial">
								<li>
									<!--<b>-->
									<xsl:value-of select="$Data_Name"/>:<!--</b>-->
								</li>
							</font>
						</xsl:if>
					</td>
					<td align="left">
						<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">
							<font size="2" face="Arial">
						(<xsl:value-of select="$Data_Value"/>)
					</font>
						</xsl:if>
					</td>
				</tr>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_Data_And_Check_For_More_Matches Template
*
*			Adds the row and cell if the Data Value is not null, it will also 
*			check to see if there are more matches for this data element
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Data_And_Check_For_More_Matches">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Value"/>
		<xsl:param name="Data_Value_ID"/>
		<xsl:variable name="ClaimRoot" select="/ClaimInvestigationAddRs"/>
		<xsl:if test="string-length(normalize-space($Data_Value)) &gt; 0">
			<xsl:call-template name="Insert_Data">
				<xsl:with-param name="Data_Name">
					<xsl:value-of select="$Data_Name"/>
				</xsl:with-param>
				<xsl:with-param name="Data_Value">
					<xsl:value-of select="$Data_Value"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_Data_Using_Code_List Template
*
*			Adds the row and cell if the Data Value is not null, it will also 
*			gets the value for the code
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Data_Using_Code_List">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Code"/>
		<xsl:param name="Data_Code_Value"/>
		<!--<xsl:variable name="xmlCodeList" select="document('./ClaimsearchCodeList.xml')" />
		<xsl:variable name="CodeValue" select='$xmlCodeList/ClaimsearchCodes/{$Data_Code_List_Name}/*[@code=$Data_Code]'/>
		
		<xsl:variable name="CodeValue" select="$xmlCodeList/ClaimsearchCodes"></xsl:variable> -->
		<xsl:choose>
			<xsl:when test="string-length(normalize-space($Data_Code_Value)) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">
						<xsl:value-of select="$Data_Name"/>
					</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$Data_Code_Value"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<!-- if we can't find the code value for it use the code actual value -->
			<xsl:otherwise>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">
						<xsl:value-of select="$Data_Name"/>
					</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$Data_Code"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!-- 
*********************************************************************************
*	 
*	      Insert_Header Template
*
*			Adds a Header
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Header">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Value"/>
		<tr>
			<td height="20"/>
		</tr>
		<tr>
			<xsl:choose>
				<xsl:when test="string-length(normalize-space($Data_Value)) &gt; 0">
					<td align="left">
						<font size="3" face="Arial">
							<b>
								<xsl:value-of select="$Data_Name"/>
							</b>
						</font>
					</td>
					<td align="left">
						<font size="3" face="Arial">
							<b>
								<xsl:value-of select="$Data_Value"/>
							</b>
						</font>
					</td>
				</xsl:when>
				<xsl:otherwise>
					<td colspan="2" align="left">
						<font size="3" face="Arial">
							<b>
								<xsl:value-of select="$Data_Name"/>:</b>
						</font>
					</td>
				</xsl:otherwise>
			</xsl:choose>
		</tr>
	</xsl:template>
	<!-- 
*********************************************************************************
*	 
*	      Insert_Header Template
*
*			Adds a Header
*	 
*********************************************************************************
-->
	<!--commented on 03/14/2006
	<xsl:template name="Insert_Score_Header">
		<xsl:param name="Data_Value"/>
		<tr>
			<td colspan="1"/>
		</tr>
		<tr>
			<xsl:choose>
				<xsl:when test="string-length(normalize-space($Data_Value)) &gt; 0">
					<td>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
						<font size="3" face="Arial">
							<b>
								<xsl:value-of select="$Data_Value"/>
							</b>
						</font>
					</td>
				</xsl:when>
			</xsl:choose>
		</tr>
	</xsl:template>
	-->
	<xsl:template name="Insert_Score_Header">
		<xsl:param name="Data_Value"/>
		<xsl:choose>
			<xsl:when test="string-length(normalize-space($Data_Value)) &gt; 0">
				<font size="5" face="Arial">
					<b>
						<xsl:value-of select="$Data_Value"/>
					</b>
				</font>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	<!-- 
*********************************************************************************
*	 
*	      Insert_Header_Using_Code_List Template
*
*			Adds a Header
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Header_Using_Code_List">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Code"/>
		<xsl:param name="Data_Code_Value"/>
		<xsl:choose>
			<xsl:when test="string-length(normalize-space($Data_Code_Value)) &gt; 0">
				<xsl:call-template name="Insert_Header">
					<xsl:with-param name="Data_Name">
						<xsl:value-of select="$Data_Name"/>:
						</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$Data_Code_Value"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="Insert_Header">
					<xsl:with-param name="Data_Name">
						<font face="Arial">
							<xsl:value-of select="$Data_Name"/>
						</font>
					</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$Data_Code"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_SmallHeaderTemplate
*
*			Adds a small header
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_SmallHeader">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Value"/>
		<tr>
			<xsl:choose>
				<xsl:when test="string-length(normalize-space($Data_Value)) &gt; 0">
					<td align="left" valign="top">
						<font size="3" face="Arial">
							<b>
								<xsl:value-of select="$Data_Name"/>:</b>
						</font>
					</td>
					<td align="left">
						<font size="3" face="Arial">
							<b>
								<xsl:value-of select="$Data_Value"/>
							</b>
						</font>
					</td>
				</xsl:when>
				<xsl:otherwise>
					<td colspan="2" align="left">
						<font size="3" face="Arial">
							<b>
								<xsl:value-of select="$Data_Name"/>:</b>
						</font>
					</td>
				</xsl:otherwise>
			</xsl:choose>
		</tr>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Name="Display_MatchSummary" Template
*
*			Builds the match summary records  
*	 
*********************************************************************************
-->
	<xsl:template name="Display_MatchSummary">
		<xsl:param name="MatchRoot"/>
		<xsl:choose>
			<xsl:when test="count($MatchRoot/MatchReasonInfo) &gt; 0">
				<tr>
					<td align="left" valign="top">
					&#160;&#160;
						<font size="2" face="Arial">
							<b>
								Reason(s) for match:</b>
						</font>
					</td>
					<td>
						<font size="2" face="Arial">
							<b>
								<xsl:for-each select="$MatchRoot/MatchReasonInfo/MatchReasonCd">
									<xsl:variable name="xx" select="."/>
									<xsl:choose>
										<xsl:when test="string-length(normalize-space($xmlCodeList/ClaimsearchCodes/MatchReasonCds/*[@code=$xx])) &gt; 0">
											<xsl:value-of select="$xmlCodeList/ClaimsearchCodes/MatchReasonCds/*[@code=$xx]"/>
										</xsl:when>
										<!-- if we can't find the code value for it use the code actual value -->
										<xsl:otherwise>
											<xsl:value-of select="$xx"/>
										</xsl:otherwise>
									</xsl:choose>
									<br/>
								</xsl:for-each>
							</b>
						</font>
					</td>
				</tr>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_Addr Template
*
*			Inserts Address's in a certain format
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Addr">
		<xsl:param name="Title"/>
		<xsl:param name="Addr1"/>
		<xsl:param name="Addr2"/>
		<xsl:param name="City"/>
		<xsl:param name="State"/>
		<xsl:param name="ZipCode"/>
		<xsl:param name="Country"/>
		<xsl:if test="string-length(string(normalize-space($Addr1))) &gt; 0">
			<tr>
				<td align="left">
				&#160;&#160;
					<b>
						<font size="2" face="Arial">
							<xsl:value-of select="$Title"/>:</font>
					</b>
				</td>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:value-of select="$Addr1"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:if test="string-length(string(normalize-space($Addr2)))!=0">
			<tr>
				<td align="left"/>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:value-of select="$Addr2"/>
					</font>
				</td>
			</tr>
		</xsl:if>
		<xsl:choose>
			<xsl:when test="string-length(string(normalize-space($City)))!=0">
				<tr>
					<td align="left">
				&#160;&#160;
					<!-- If the title wasn't already displayed then display it -->
						<xsl:if test="string-length(string(normalize-space($Addr1))) = 0">
							<b>
								<font size="2" face="Arial">
									<xsl:value-of select="$Title"/>:</font>
							</b>
						</xsl:if>
					</td>
					<td align="left">
						<font size="2" face="Arial">
							<xsl:value-of select="$City"/>,
					</font>
						<xsl:if test="string-length(string(normalize-space($State)))!=0 or string-length(string(normalize-space($ZipCode)))!=0">
							<font size="2" face="Arial">
								<xsl:value-of select="$State"/>
								<xsl:text>  </xsl:text>
								<xsl:value-of select="$ZipCode"/>
							</font>
						</xsl:if>
					</td>
				</tr>
			</xsl:when>
			<xsl:when test="string-length(string(normalize-space($State)))!=0">
				<tr>
					<td align="left">
				&#160;&#160;
					<!-- If the title wasn't already displayed then display it -->
						<xsl:if test="string-length(string(normalize-space($Addr1))) = 0">
							<b>
								<font size="2" face="Arial">
									<xsl:value-of select="$Title"/>:</font>
							</b>
						</xsl:if>
					</td>
					<td align="left">
						<font size="2" face="Arial">
							<xsl:value-of select="$City"/>,
					</font>
						<xsl:if test="string-length(string(normalize-space($State)))!=0 or string-length(string(normalize-space($ZipCode)))!=0">
							<font size="2" face="Arial">
								<xsl:value-of select="$State"/>
							</font>
							<xsl:text>  </xsl:text>
							<font size="2" face="Arial">
								<xsl:value-of select="$ZipCode"/>
							</font>
						</xsl:if>
					</td>
				</tr>
			</xsl:when>
			<xsl:when test="string-length(string(normalize-space($ZipCode)))!=0">
				<tr>
					<td align="left">
				&#160;&#160;
					<!-- If the title wasn't already displayed then display it -->
						<xsl:if test="string-length(string(normalize-space($Addr1))) = 0">
							<b>
								<font size="2" face="Arial">
									<xsl:value-of select="$Title"/>:</font>
							</b>
						</xsl:if>
					</td>
					<td align="left">
						<font size="2" face="Arial">
							<xsl:value-of select="$City"/>,
					</font>
						<xsl:if test="string-length(string(normalize-space($State)))!=0 or string-length(string(normalize-space($ZipCode)))!=0">
							<font size="2" face="Arial">
								<xsl:value-of select="$State"/>
								<xsl:text>  </xsl:text>
								<xsl:value-of select="$ZipCode"/>
							</font>
						</xsl:if>
					</td>
				</tr>
			</xsl:when>
		</xsl:choose>
		<xsl:if test="string-length(string(normalize-space($Country)))!=0">
			<tr>
				<td align="left"/>
				<td align="left">
					<font size="2" face="Arial">
						<xsl:value-of select="$Country"/>
					</font>
				</td>
			</tr>
		</xsl:if>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_AdjusterTemplate
*
*			Inserts adjuster fields
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Adjuster">
		<xsl:param name="CoverageType"/>
		<xsl:param name="LossType"/>
		<xsl:param name="AdjustingCompany"/>
		<xsl:param name="AdjusterFirstName"/>
		<xsl:param name="AdjusterMiddleName"/>
		<xsl:param name="AdjusterLastName"/>
		<xsl:param name="AdjusterPhone"/>
		<xsl:param name="CoverageType_Value"/>
		<xsl:param name="LossType_Value"/>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Coverage Type</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$CoverageType"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$CoverageType_Value"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data_Using_Code_List">
			<xsl:with-param name="Data_Name">Loss Type</xsl:with-param>
			<xsl:with-param name="Data_Code">
				<xsl:value-of select="$LossType"/>
			</xsl:with-param>
			<xsl:with-param name="Data_Code_Value">
				<xsl:value-of select="$LossType_Value"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Adjuster Company</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$AdjustingCompany"/>
			</xsl:with-param>
		</xsl:call-template>
		<xsl:choose>
			<xsl:when test="string-length(string(normalize-space($AdjusterLastName))) &gt; 0 and string-length(string(normalize-space($AdjusterFirstName))) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Adjuster</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$AdjusterLastName"/>
						<xsl:text> , </xsl:text>
						<xsl:value-of select="$AdjusterFirstName"/>
						<xsl:text>  </xsl:text>
						<xsl:value-of select="$AdjusterMiddleName"/>
						<xsl:text>  </xsl:text>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Name">Adjuster</xsl:with-param>
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="concat($AdjusterLastName,' ',$AdjusterFirstName,' ',$AdjusterMiddleName)"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
		<xsl:call-template name="Insert_Data">
			<xsl:with-param name="Data_Name">Adjuster Phone</xsl:with-param>
			<xsl:with-param name="Data_Value">
				<xsl:value-of select="$AdjusterPhone"/>
			</xsl:with-param>
		</xsl:call-template>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_AnchorTemplate
*
*			Inserts an anchor
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Anchor">
		<xsl:param name="AnchorName"/>
		<a>
			<xsl:attribute name="name"><xsl:value-of select="$AnchorName"/></xsl:attribute>
		</a>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_Anchor_Link Template
*
*			Inserts an link to an anchor
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Anchor_Link">
		<xsl:param name="LinkName"/>
		<xsl:param name="AnchorName"/>
		<a>
			<xsl:attribute name="href">#<xsl:value-of select="$AnchorName"/></xsl:attribute>
			<xsl:value-of select="$LinkName"/>
		</a>
	</xsl:template>
	<!--
*********************************************************************************
*	 
*	      Insert_More_Matches Template
*
*			Inserts More Matches statement if their are more matches
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_More_Matches">
		<xsl:param name="Match_Desc"/>
		<tr>
			<td/>
			<td>
				<font size="2" face="Arial">
					<xsl:text>*** More matches on this </xsl:text>
					<xsl:value-of select="$Match_Desc"/>
					<xsl:text> outside this report ***</xsl:text>
				</font>
			</td>
		</tr>
	</xsl:template>
	<!--Multiple VIN 02/24/2009-->
	<!-- 
*********************************************************************************
*	 
*	      Insert_Header Template
*
*			Adds a Header
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Recovery_Header">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Value"/>
		<tr>
			<td height="20"/>
		</tr>
		<tr>
			<xsl:choose>
				<xsl:when test="string-length(normalize-space($Data_Value)) &gt; 0">
					<td align="left" nowrap="nowrap">
						<font size="3" face="Arial">
							<b>
								<xsl:value-of select="$Data_Name"/>
							</b>
						</font>
					</td>
					<td align="justify">
						<font size="3" face="Arial" color="red">
							<b>
								<i>
									<xsl:value-of select="$Data_Value"/>
								</i>
							</b>
						</font>
					</td>
				</xsl:when>
				<xsl:otherwise>
					<td colspan="2" align="left" nowrap="nowrap">
						<font size="3" face="Arial">
							<b>
								<xsl:value-of select="$Data_Name"/>
							</b>
						</font>
					</td>
				</xsl:otherwise>
			</xsl:choose>
		</tr>
	</xsl:template>
	<!-- end Multiple VIN-->
	<!--test051409-->
	<!--
*********************************************************************************
*	 
*	      Insert_Data_Using_CMS_Code_List Template
*
*			Adds the row and cell if the Data Value is not null, it will also 
*			gets the value for the code
*	 
*********************************************************************************
-->
	<xsl:template name="Insert_Data_CMS_Code_List">
		<xsl:param name="Data_Name"/>
		<xsl:param name="Data_Code"/>
		<xsl:param name="Data_Code_Value"/>
		<xsl:choose>
			<xsl:when test="string-length(normalize-space($Data_Code_Value)) &gt; 0">
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$Data_Code_Value"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			<!-- if we can't find the code value for it use the code actual value -->
			<xsl:otherwise>
				<xsl:call-template name="Insert_Data">
					<xsl:with-param name="Data_Value">
						<xsl:value-of select="$Data_Code"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!--end051409-->
</xsl:stylesheet>
