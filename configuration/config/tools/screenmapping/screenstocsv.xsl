<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="text"/>



<xsl:template match="Screen">
  <xsl:apply-templates select="ScreenItems" />
</xsl:template>

<xsl:template match="ScreenItems">
  <xsl:apply-templates select="ScreenItem" />
</xsl:template>

  <!-- You can add or re-order the elements in the list here to affect the CSV output.  Note that any value with " in it will probably
       Kill the XML parsing, so you'll probably want to be wary of using the display key label item.  Also, note that all values are
       in quotes, to protect against possible commas in the input values, and that white space matters in this template because we're
       using the text output mode.

       Currently, the XML output will output the following nodes for each screen item.  To add one to
       the XML output, just use the pattern listed below, i.e. "<xsl:value-of select="./NameKey" />"

       Again, be sure to use the quotes and to separate fields with commans to ensure that the resulting file is parseable.

       NameKey -  The display key used for the name of the items.  If an item appears on multiple pages with different display keys,
                  this will be a fairly arbitrary one out of that set
       AltNameKeys - A comma-separated list of other name keys used for the item.  Will be empty if the item only appears
                     under one key
       NameValue - The resolved label for NameKey.  If any of the resolved labels contain the " or > characters, it will probably
                   kill the CSV output
       Entity - The name of the entity the item refers to, if known
       DBTable - The name of the table the item refers to, if known
       FieldName - The entity field/database column the item refers to, if known
       ValuePath - The value path used by the item, if known
       CreateEditable - Whether or not the item is create editable on at least one NVV
       ModifyEditable - Whether or not the item is modify editable on at least one NVV
       Editable - Whether or not the item is create editable or modify editable on at least one NVV
       NVVNames - A comma-separated list of nvvs that the item appars on
  -->
<xsl:template match="ScreenItem">"<xsl:value-of select="./NameKey" />","<xsl:value-of select="./DBTable" />","<xsl:value-of select="./FieldName" />"
</xsl:template>

  <!-- We need this in here so that the default template doesn't match fields that we don't want in the output -->
<xsl:template match="*"/>

</xsl:stylesheet>