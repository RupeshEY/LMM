package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadErrorType.tti;LoadErrorType.tix;LoadErrorType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class LoadErrorType implements gw.entity.TypeKey {
  /**
   * Abstract data type
   * Rows found in staging table with values that violate rules of an abstract data type
   */
  public static final typekey.LoadErrorType TC_ABSTRACTDATATYPE = new typekey.LoadErrorType("abstractdatatype");
  
  /**
   * Invalid assignable
   * Rows found in staging table that violate rules for assignable objects
   */
  public static final typekey.LoadErrorType TC_BADASSIGNABLE = new typekey.LoadErrorType("badassignable");
  
  /**
   * Check constraint
   * Rows found in staging table that violate a check constraint
   */
  public static final typekey.LoadErrorType TC_CHECKCONSTRAINT = new typekey.LoadErrorType("checkconstraint");
  
  /**
   * Consistent children failure within staging tables
   * Consistent children failure found within staging tables
   */
  public static final typekey.LoadErrorType TC_CONSISTCHILDREN1 = new typekey.LoadErrorType("consistchildren1");
  
  /**
   * Consistent children failure between staging and sourcetables
   * Consistent children failure found between staging and source tables
   */
  public static final typekey.LoadErrorType TC_CONSISTCHILDREN2 = new typekey.LoadErrorType("consistchildren2");
  
  /**
   * Date time ordering
   * Rows found in staging table that violate a date time ordering
   */
  public static final typekey.LoadErrorType TC_DTORDERING = new typekey.LoadErrorType("dtordering");
  
  /**
   * Non-nullable edge foreign key
   * Not exactly one row found in table for non-nullable edge foreign key relationships
   */
  public static final typekey.LoadErrorType TC_EDGEFOREIGNKEY = new typekey.LoadErrorType("edgeforeignkey");
  
  /**
   * Invalid foreign key
   * Rows found in table with invalid values for a foreign key column
   */
  public static final typekey.LoadErrorType TC_FOREIGNKEY = new typekey.LoadErrorType("foreignkey");
  
  /**
   * Invalid foreign key to non-admin row
   * Rows found in table with foreign key references to existing row in a non-admin table when only existing rows in admin tables can be referenced
   */
  public static final typekey.LoadErrorType TC_FOREIGNKEYNONADMIN = new typekey.LoadErrorType("foreignkeynonadmin");
  
  /**
   * Foreign references incorrect subtype
   * Rows found in table with foreign key references to incorrect subtype
   */
  public static final typekey.LoadErrorType TC_FOREIGNKEYSUB = new typekey.LoadErrorType("foreignkeysub");
  
  /**
   * MonetaryAmount inconsistent
   * One or the other of the amount and currency column for a monetary amount contains null when the other does not.
   */
  public static final typekey.LoadErrorType TC_MONETARYAMOUNT = new typekey.LoadErrorType("monetaryamount");
  
  /**
   * Verify query returns 0 rows
   * Rows found in staging table by query that should return 0 rows
   */
  public static final typekey.LoadErrorType TC_NOMATCHLVQUERY = new typekey.LoadErrorType("nomatchlvquery");
  
  /**
   * Null in non-nullable column
   * Rows found in table with null values for one or more non-nullable columns in the source table
   */
  public static final typekey.LoadErrorType TC_NONULL = new typekey.LoadErrorType("nonull");
  
  /**
   * Null in non-nullable column for subtype
   * Rows found in table with null values for one or more non-nullable columns for the subtype in the source table
   */
  public static final typekey.LoadErrorType TC_NONULLSUBTYPE = new typekey.LoadErrorType("nonullsubtype");
  
  /**
   * Nullable one-to-one
   * More than one row found in table for nullable one-to-one relationships
   */
  public static final typekey.LoadErrorType TC_NULLABLEONETOONE = new typekey.LoadErrorType("nullableonetoone");
  
  /**
   * Non-nullable one-to-one
   * Not exactly one row found in table for non-nullable one-to-one relationships
   */
  public static final typekey.LoadErrorType TC_ONETOONE = new typekey.LoadErrorType("onetoone");
  
  /**
   * PostPopulateExecutor failure
   * PostPopulateExecutors failures detected after populating source tables
   */
  public static final typekey.LoadErrorType TC_PPEERROR = new typekey.LoadErrorType("ppeerror");
  
  /**
   * Illegal reference to already referenced existing row
   * Rows found in table with foreign key references to an existing row in a source table that is already referenced from other existing rows, when such references are not allowed
   */
  public static final typekey.LoadErrorType TC_REFTOEXISTINGREFFEDROW = new typekey.LoadErrorType("reftoexistingreffedrow");
  
  /**
   * Illegal reference to existing row
   * Rows found in table with foreign key references to an existing row in a source table when such references are not allowed
   */
  public static final typekey.LoadErrorType TC_REFTOEXISTINGROW = new typekey.LoadErrorType("reftoexistingrow");
  
  /**
   * Required match
   * Rows found in staging table with required referencing rows in array table
   */
  public static final typekey.LoadErrorType TC_REQUIREDMATCH = new typekey.LoadErrorType("requiredmatch");
  
  /**
   * Subtype
   * Rows found in table with invalid values for a subtype column
   */
  public static final typekey.LoadErrorType TC_SUBTYPE = new typekey.LoadErrorType("subtype");
  
  /**
   * Non-nulls in subtype-specific columns
   * Rows found in table with non-null values for one or more subtype-specific columns for a different subtype
   */
  public static final typekey.LoadErrorType TC_SUBTYPESPEC = new typekey.LoadErrorType("subtypespec");
  
  /**
   * Invalid typekey
   * Rows found in table with invalid values for a typekey column
   */
  public static final typekey.LoadErrorType TC_TYPEKEY = new typekey.LoadErrorType("typekey");
  
  /**
   * Verify typekey in set
   * Rows found in table include typekey values that are invalid when loading via the staging tables
   */
  public static final typekey.LoadErrorType TC_TYPEKEYINSET = new typekey.LoadErrorType("typekeyinset");
  
  /**
   * Verify typekey not in set
   * Rows found in table include typekey values that are invalid when loading via the staging tables
   */
  public static final typekey.LoadErrorType TC_TYPEKEYNOTINSET = new typekey.LoadErrorType("typekeynotinset");
  
  /**
   * Unique constraint within staging table
   * Rows found in staging table that violate a unique constraint
   */
  public static final typekey.LoadErrorType TC_UNIQCONSTRAINT1 = new typekey.LoadErrorType("uniqconstraint1");
  
  /**
   * Unique constraint between source and staging table
   * Rows found in staging table that match rows in source table on all columns of a unique index
   */
  public static final typekey.LoadErrorType TC_UNIQCONSTRAINT2 = new typekey.LoadErrorType("uniqconstraint2");
  
  /**
   * 0-length varchar
   * Rows found in table with 0-length strings in varchar columns
   */
  public static final typekey.LoadErrorType TC_ZEROLENGTHSTRING = new typekey.LoadErrorType("zerolengthstring");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.LoadErrorType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.LoadErrorType>("LoadErrorType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private LoadErrorType(java.lang.String code)  {
    _typeKeyImplManager  =  com.guidewire.commons.typelist.TypeKeyImplManager.newInstance(this, code);
  }
  
  public int compareTo(gw.entity.TypeKey arg0) {
    return _typeKeyImplManager.getTypeKeyImpl().compareTo(arg0);
  }
  
  /**
   * 
   * @deprecated Use this object instead.
   */
  @java.lang.Deprecated
  public typekey.LoadErrorType get() {
    return this;
  }
  
  public static typekey.LoadErrorType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.LoadErrorType> getAllTypeKeys() {
    return TYPE.get().getTypeKeys(true);
  }
  
  /**
   * Returns the list of categories that this key belongs to
   * @return the categories that this key belongs to
   */
  public gw.entity.TypeKey[] getCategories() {
    return _typeKeyImplManager.getTypeKeyImpl().getCategories();
  }
  
  public java.lang.String getCode() {
    return _typeKeyImplManager.getCode();
  }
  
  /**
   * Returns the description for this typekey for the current locale.
   * @return the description for this typekey
   */
  public java.lang.String getDescription() {
    return _typeKeyImplManager.getTypeKeyImpl().getDescription();
  }
  
  /**
   * Returns the description of this typekey for the given locale.
   * @param locale the locale to use to get the description
   * @return a description for this typekey for the given locale
   */
  public java.lang.String getDescription(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getDescription(locale);
  }
  
  public java.lang.String getDisplayName() {
    return _typeKeyImplManager.getTypeKeyImpl().getDisplayName();
  }
  
  /**
   * Returns the name of this typekey for the given locale.
   * @param locale 
   */
  public java.lang.String getDisplayName(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getDisplayName(locale);
  }
  
  /**
   * Gets the entity type associated with this typekey, if any. Returns null if this is not a subtype typekey.
   */
  public gw.entity.IEntityType getEntityType() {
    return _typeKeyImplManager.getTypeKeyImpl().getEntityType();
  }
  
  /**
   * Returns the owning type for this key.
   * @return 
   */
  public gw.entity.ITypeList getIntrinsicType() {
    return _typeKeyImplManager.getTypeKeyImpl().getIntrinsicType();
  }
  
  /**
   * A string containing the typelist name.
   */
  public java.lang.String getListName() {
    return _typeKeyImplManager.getTypeKeyImpl().getListName();
  }
  
  /**
   * Returns the value of the "name" attribute for this typekey.
   * @return the name of this typekey
   * @deprecated Use {@link #getDisplayName()} or {@link #getUnlocalizedName()} instead, as appropriate.
   */
  @java.lang.Deprecated
  public java.lang.String getName() {
    return _typeKeyImplManager.getTypeKeyImpl().getName();
  }
  
  public int getOrdinal() {
    return _typeKeyImplManager.getTypeKeyImpl().getOrdinal();
  }
  
  /**
   * Returns the priority for this type key
   * @return the priority for this type key
   */
  public int getPriority() {
    return _typeKeyImplManager.getTypeKeyImpl().getPriority();
  }
  
  /**
   * Returns the sort order for this type key in the specified language.
   * @param locale 
   * @return the sort order for this type key
   */
  public int getSortOrder(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getSortOrder(locale);
  }
  
  public static typekey.LoadErrorType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.LoadErrorType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.LoadErrorType[]{});
  }
  
  public static java.util.List<typekey.LoadErrorType> getTypeKeys(boolean includeRetired) {
    return TYPE.get().getTypeKeys(includeRetired);
  }
  
  /**
   * Returns the (non-localized) description of this typekey. Generally should not be used by application code. To get a
   * displayable string, use {@link #getDescription()} instead.
   * @return the non-localized description of this typekey
   */
  public java.lang.String getUnlocalizedDescription() {
    return _typeKeyImplManager.getTypeKeyImpl().getUnlocalizedDescription();
  }
  
  /**
   * Returns the (non-localized) name of this typekey. Generally should not be used by application code. To get a
   * displayable string, use {@link #getDisplayName()} instead. To get a unique string identifier for this typekey,
   * use {@link #getCode()} instead.
   * @return the non-localized name of this typekey
   */
  public java.lang.String getUnlocalizedName() {
    return _typeKeyImplManager.getTypeKeyImpl().getUnlocalizedName();
  }
  
  public typekey.LoadErrorType getValue() {
    return this;
  }
  
  /**
   * Checks to see if this typekey has a category corresponding to the given
   * typekey.  For a match to be found, this typekey has to have a category
   * with the same typelist and code as the given typekey.
   * @param categoryToCheck 
   * @return 
   */
  public boolean hasCategory(gw.entity.TypeKey categoryToCheck) {
    return _typeKeyImplManager.getTypeKeyImpl().hasCategory(categoryToCheck);
  }
  
  /**
   * A boolean that indicates a type code is for internal use by Guidewire software. Internal type codes cannot be
   * removed or modified.
   */
  public boolean isInternal() {
    return _typeKeyImplManager.getTypeKeyImpl().isInternal();
  }
  
  /**
   * Returns true if this type key is retired.  Retired type keys will not show up in the UI.
   * @return true if this type key is retired false if not.
   */
  public boolean isRetired() {
    return _typeKeyImplManager.getTypeKeyImpl().isRetired();
  }
  
  private java.lang.Object readObject(java.io.ObjectInputStream in) throws java.io.InvalidObjectException {
    throw new java.io.InvalidObjectException("Proxy required");
  }
  
  public java.lang.String toString() {
    return getDisplayName();
  }
  
  private java.lang.Object writeReplace() {
    return new com.guidewire.commons.typelist.TypeKeySerializationProxy(this);
  }
  
  static {
    com.guidewire._generated.typekey.LoadErrorTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.LoadErrorType>() {
      public void clearCache(typekey.LoadErrorType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.LoadErrorType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.LoadErrorType newInstance(java.lang.String code) {
        return new typekey.LoadErrorType(code);
      }
      
      
    });
  }
}