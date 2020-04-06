<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="text"/>

<!--
    Note that white space (and returns) matter here, since we're using text output mode
    This line will appear as the first line in the file, and thus effectively be the column headers
  -->
<xsl:template match="AllNVVs">NVV Name,Display Key,Display Name,Value Path,Table,Field Name,Field Type,Field Length,Typelist
<xsl:apply-templates select="NVVInfo" />
</xsl:template>


<xsl:template match="NVVInfo">
  <xsl:apply-templates select="Items" />
</xsl:template>


<xsl:template match="Items">
  <xsl:apply-templates select="Item"/>
</xsl:template>

  <!-- You can add or re-order the elements in the list here to affect the CSV output.  See comments in nvvtocsv.xsl for a list of all the possible fields
  -->
<xsl:template match="Item">"<xsl:value-of select="ancestor::NVVInfo/Name" />","<xsl:value-of select="./Name" />","<xsl:value-of select="./ResolvedName" />","<xsl:value-of select="./ValuePath" />","<xsl:value-of select="./DBTable" />","<xsl:value-of select="./FieldName" />","<xsl:value-of select="./ADTFieldTypeShort" />","<xsl:value-of select="ADTFieldLength"/>","<xsl:value-of select="ADTFieldTypeList"/>"
</xsl:template>

  <!-- We need this in here so that the default template doesn't match fields that we don't want in the output -->
<xsl:template match="*"/>

</xsl:stylesheet>