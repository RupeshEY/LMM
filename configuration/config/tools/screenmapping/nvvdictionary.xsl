<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" version="4.0" indent="yes"/>

  <xsl:template match="NVVInfo">
    <html>
      <head>
        <title>
          <xsl:value-of select="./Name"/>
        </title>
        <LINK REL="StyleSheet" HREF="nvvdictionary.css" TYPE="text/css"/>
      </head>
      <body>
        <table cellpadding="3" cellspacing="0" border="0" height="30" width="100%">
          <tr>
            <td class="titlebox" height="30">
              <span class="pagetitle"><xsl:value-of select="./Name"/></span>
              <br/>
              <span class="desc"><xsl:value-of select="./Entity"/></span>
              <br/>
            </td>
          </tr>
        </table>
        <xsl:apply-templates select="Items"/>
      </body>
    </html>
  </xsl:template>

  <xsl:template match="Items">
    <xsl:apply-templates select="Item"/>
  </xsl:template>

  <!--
     For a full list of the nodes that appear under Item, see the comment in nvvtocsv.xsl 
  -->

  <xsl:template match="Item">
    <p class="item">
      <span class="itemtitle"><xsl:value-of select="./Name"/></span><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>("<xsl:value-of select="./ResolvedName"/>")
      <br/>
      <xsl:if test="./Editable = 'true'">
        Edits
      </xsl:if>
      <xsl:if test="./Editable != 'true'">
        Displays
      </xsl:if>
      <xsl:if test="string-length(./FieldName) > 0">
        <span class="fieldname">
          <xsl:value-of select="./FieldName"/>
        </span> on
        <span class="entity">
          <xsl:value-of select="./Entity"/>
        </span> (
        <span class="dbtable">
          <xsl:value-of select="./DBTable"/>
        </span>), referenced as
        <span class="valuepath">
          <xsl:value-of select="./ValuePath"/>
        </span>
        <br/>
      </xsl:if>
      <xsl:if test="string-length(./ValuePath) > 0 and string-length(./FieldName) = 0">
       an
        <font color="red">unknown field</font> as
        <span class="valuepath">
          <xsl:value-of select="./ValuePath"/>
        </span>
        <br/>
      </xsl:if>
      <xsl:if test="string-length(./ValuePath) = 0 and string-length(./FieldName) = 0">
       an
        <font color="red">unknown field</font>
        <br/>
      </xsl:if>
    </p>
    <br/>
  </xsl:template>

</xsl:stylesheet>