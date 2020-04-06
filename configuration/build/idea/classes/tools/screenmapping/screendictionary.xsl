<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" version="4.0" indent="yes"/>

  <xsl:template match="Screen">
    <html>
      <head>
        <title>
          <xsl:value-of select="./Name"/>
        </title>
        <LINK REL="StyleSheet" HREF="screendictionary.css" TYPE="text/css"/>
      </head>
      <body>
        <span class="pagetitle">
          <xsl:value-of select="./Name"/>
        </span>
        <xsl:apply-templates select="ScreenItems"/>
      </body>
    </html>
  </xsl:template>

  <xsl:template match="ScreenItems">
    <xsl:apply-templates select="ScreenItem"/>
  </xsl:template>

  <xsl:template match="ScreenItem">
    <p class="item">
      <span class="itemtitle"><xsl:value-of select="./NameKey"/></span>
      <xsl:if test="string-length(./AltNameKeys) > 0"><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>(also appearing as <xsl:value-of select="./AltNameKeys"/>)</xsl:if>
      <br/>
      <xsl:if test="./Editable = 'true'">
        Edits
      </xsl:if>
      <xsl:if test="./Editable != 'true'">
        Maps to
      </xsl:if>
      <xsl:if test="string-length(./FieldName) > 0">
        <span class="fieldname"><xsl:value-of select="./FieldName"/></span> on <span class="entity"><xsl:value-of select="./Entity"/></span> (<span class="dbtable"><xsl:value-of select="./DBTable"/></span>), referenced as <span class="valuepath"><xsl:value-of select="./ValuePath"/></span><br/>
      </xsl:if>
      <xsl:if test="string-length(./ValuePath) > 0 and string-length(./FieldName) = 0">
       an <font color="red">unknown field</font> as <span class="valuepath"><xsl:value-of select="./ValuePath"/></span><br/>
      </xsl:if>
      <xsl:if test="string-length(./ValuePath) = 0 and string-length(./FieldName) = 0">
        <font color="red">unknown field</font><br/>
      </xsl:if>
      Appears on <xsl:value-of select="./NVVNames"/><br/>
    </p>
    <br/>
  </xsl:template>

</xsl:stylesheet>