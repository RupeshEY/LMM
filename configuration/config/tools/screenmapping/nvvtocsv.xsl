<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="text"/>



<xsl:template match="NVVInfo">
  <xsl:apply-templates select="Items" />
</xsl:template>

  <!--
    Note that white space (and returns) matter here, since we're using text output mode
    This line will appear as the first line in the file, and thus effectively be the column headers
  -->
<xsl:template match="Items">Display Key,Display Label,Table,Field Name,Field Type,Field Length,Absolute Order,Page
<xsl:apply-templates select="Item"/>
</xsl:template>

  <!-- You can add or re-order the elements in the list here to affect the CSV output.  Note that all values are
       in quotes, to protect against possible commas in the input values, and that white space matters in this template because we're
       using the text output mode.  The XML that this transform will operate on already escapes " to "" as required
       when used within CSV elements.

       Currently, the XML output will output the following nodes for each screen item.  To add one to
       the XML output, just use the pattern listed below, i.e. "<xsl:value-of select="./NameKey" />"

       Again, be sure to use the quotes and to separate fields with commans to ensure that the resulting file is parseable.

       These elements will always appear, though they may be empty:

       Name - The display key used for the item
       ResolvedName - The label (pulled from display.properties) that corresponds to that display key
       DisplayValue - The display value, if any, on the item
       CreateEditable - Whether or not the item is create editable (either "true" or "false")
       ModifyEditable - Whether or not the item is modify editable (either "true" or "false")
       Editable - Whether or not the item is either modify editable or create editable (either "true" or "false")
       CustomTag - The name of the custom tag, if any, used by the item
       ItemType - The type of the item (i.e. Item, ListViewItem, CustomTag, etc.)
       Required - Whether or not the item is required (either "true" or "false")
       Order - The order of the item within its section (represented as a float)
       AbsoluteOrder - The absolute order of the item on the screen as an integer, i.e. the order that you'll see items appear
                       on the screen if you read down the first column, then down the second column, etc.
       DefaultValue - The default value of the element, if any
       DefaultValueType - The default value type of the element, if any
       ViewPermissions - Comma-delimited list of SystemPermissionTypes needed to view this element (includes any permissions
                         inherited from containing labels or subviews)
       EditPermissions - Comma-delimited list of SystemPermissionTypes needed to edit this element (includes any permissions
                         inherited from containing labels or subviews)
       Page - The page the item appears on
       IsEditableHook - The value of the "isEditable" hook, if any
       IsRequiredHook - The value of the "isRequired" hook, if any
       IsVisibleHook - The value of the "isVisible" hook, if any
       SaveHook - The value of the "save" hook, if any
       ValidateHook - The value of the "validate" hook, if any


       The following entries apply to the DB table and column/field that an item maps to, and will be empty if
       that information can't be determined or isn't applicable:

       Entity - The name of the entity this field refers to, if known
       DBTable - The DB Table that corresponds to that field, if known
       FieldName - The name of the field this item refers to, if known
       JavaFieldType - The java type of the field, if known
       ADTFieldType - The ADT type of the field, if known
       ADTFieldTypeShort - The ADT type of the field, if known, display just as "Type Key", "Foreign Key", or "Array" rather than the longer strings in ADTFieldType
       ADTFieldLength - The length of the field, if known and applicable
       ADTFieldPrecision - The precision of the field, if known and applicable
       ADTFieldScale - The scale of the field, if known and applicable
       ADTFieldTypeList - The type list for this type key, if known and applicable
       ADTFieldFKEntity - The entity this field is a foreign key to, if known and applicable
       ADTFieldArrayEntity - The entity this field is an array of, if known and applicable
       ValuePath - The path used for the element value, if known


       The following reflection elements will only appear in the XML if the item defines that particular
       type of reflection, and they will appear exactly as they would do in the original nvv definition file,
       i.e. with a "target" attribute referencing the reflected value, a "mapFile" attribute for MappingReflect
       elements, and ReflectCondition child elements for the ConditionalReflect item.

       SimpleReflect
       ConditionalReflect
       MappingReflect
  -->
<xsl:template match="Item">"<xsl:value-of select="./Name" />","<xsl:value-of select="./ResolvedName" />","<xsl:value-of select="./DBTable" />","<xsl:value-of select="./FieldName" />","<xsl:value-of select="./ADTFieldType" />","<xsl:value-of select="ADTFieldLength"/>","<xsl:value-of select="AbsoluteOrder"/>","<xsl:value-of select="Page"/>"
</xsl:template>

  <!-- We need this in here so that the default template doesn't match fields that we don't want in the output -->
<xsl:template match="*"/>

</xsl:stylesheet>