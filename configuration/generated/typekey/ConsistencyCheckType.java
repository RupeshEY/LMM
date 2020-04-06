package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ConsistencyCheckType.tti;ConsistencyCheckType.tix;ConsistencyCheckType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class ConsistencyCheckType implements gw.entity.TypeKey {
  /**
   * 0 length string check
   * Verifies no 0 length strings within varchar column
   */
  public static final typekey.ConsistencyCheckType TC_0LENGTHSTRINGCHECK = new typekey.ConsistencyCheckType("0lengthstringcheck");
  
  /**
   * ADT values check
   * Verifies values are valid for abstract data types
   */
  public static final typekey.ConsistencyCheckType TC_ADTVALUESCHECK = new typekey.ConsistencyCheckType("adtvaluescheck");
  
  /**
   * Application-specific check
   * Verifies application-specific relationships in the database
   */
  public static final typekey.ConsistencyCheckType TC_APPSPECIFICCHECK = new typekey.ConsistencyCheckType("appspecificcheck");
  
  /**
   * Array required match
   * Verifies that every row in the container has a nonempty array
   */
  public static final typekey.ConsistencyCheckType TC_ARRAYREQUIREDMATCH = new typekey.ConsistencyCheckType("arrayrequiredmatch");
  
  /**
   * Assignment check
   * Verifies that the database is consistent relative to assignment
   */
  public static final typekey.ConsistencyCheckType TC_ASSIGNMENTCHECK = new typekey.ConsistencyCheckType("assignmentcheck");
  
  /**
   * Bean version check
   * Verifies that the database is consistent relative to bean versions
   */
  public static final typekey.ConsistencyCheckType TC_BEANVERSIONCHECK = new typekey.ConsistencyCheckType("beanversioncheck");
  
  /**
   * Linguistic search denorm check
   * Verifies that the linguistic search denorm columns are in sync with the associated source columns
   */
  public static final typekey.ConsistencyCheckType TC_CASEINSENSITIVECHECK = new typekey.ConsistencyCheckType("caseinsensitivecheck");
  
  /**
   * Check constraint check
   * Verifies data is valid relative to check constraints
   */
  public static final typekey.ConsistencyCheckType TC_CHECKCONSTRAINTCHECK = new typekey.ConsistencyCheckType("checkconstraintcheck");
  
  /**
   * Consistent children
   * Verifies that the consistent children property holds
   */
  public static final typekey.ConsistencyCheckType TC_CONSISTENTCHILDREN = new typekey.ConsistencyCheckType("consistentchildren");
  
  /**
   * Custom check
   * Custom consistency check declared in a data model file
   */
  public static final typekey.ConsistencyCheckType TC_CUSTOMCHECK = new typekey.ConsistencyCheckType("customcheck");
  
  /**
   * Datetime ordering check
   * Verifies data is valid relative to datetime orderings
   */
  public static final typekey.ConsistencyCheckType TC_DATETIMEORDERINGCHECK = new typekey.ConsistencyCheckType("datetimeorderingcheck");
  
  /**
   * Edge foreign key non-null check
   * Verifies that non-nullable edge foreign key relationships have one referring entity
   */
  public static final typekey.ConsistencyCheckType TC_EDGEFKNONNULLCHECK = new typekey.ConsistencyCheckType("edgefknonnullcheck");
  
  /**
   * Effdated registry check
   * Verifies that an effdated table appears in the effdated registry of all referenced branches
   */
  public static final typekey.ConsistencyCheckType TC_EFFDATEDREGISTRYCHECK = new typekey.ConsistencyCheckType("effdatedregistrycheck");
  
  /**
   * financials check
   * Verifies ClaimCenter financials
   */
  public static final typekey.ConsistencyCheckType TC_FINANCIALSCHECK = new typekey.ConsistencyCheckType("financialscheck");
  
  /**
   * Foreign key check
   * Verifies foreign key references when RI is not enforced in the database
   */
  public static final typekey.ConsistencyCheckType TC_FKCHECK = new typekey.ConsistencyCheckType("fkcheck");
  
  /**
   * Foreign key subtype check
   * Verifies foreign key reference to a subtype is to correct subtype
   */
  public static final typekey.ConsistencyCheckType TC_FKSUBTYPECHECK = new typekey.ConsistencyCheckType("fksubtypecheck");
  
  /**
   * Join table check
   * Verifies data is valid relative to jointable declarations
   */
  public static final typekey.ConsistencyCheckType TC_JOINTABLECHECK = new typekey.ConsistencyCheckType("jointablecheck");
  
  /**
   * Localized column check
   * Verifies required localized columns have values for all languages
   */
  public static final typekey.ConsistencyCheckType TC_LOCALIZEDCOLUMNCHECK = new typekey.ConsistencyCheckType("localizedcolumncheck");
  
  /**
   * Max key check
   * Verifies data in max key table is in synch with table
   */
  public static final typekey.ConsistencyCheckType TC_MAXKEYCHECK = new typekey.ConsistencyCheckType("maxkeycheck");
  
  /**
   * One-to-one check
   * Verifies that one-to-one relationships have at most one referring entity
   */
  public static final typekey.ConsistencyCheckType TC_ONETOONECHECK = new typekey.ConsistencyCheckType("onetoonecheck");
  
  /**
   * One-to-one non-null check
   * Verifies that non-nullable one-to-one relationships have one referring entity
   */
  public static final typekey.ConsistencyCheckType TC_ONETOONENONNULLCHECK = new typekey.ConsistencyCheckType("onetoonenonnullcheck");
  
  /**
   * Revisioning check
   * Verifies that the database is consistent relative to revisioning
   */
  public static final typekey.ConsistencyCheckType TC_REVISIONINGCHECK = new typekey.ConsistencyCheckType("revisioningcheck");
  
  /**
   * Search denorm check
   * Verifies that the search denorm columns are in sync with the associated source columns
   */
  public static final typekey.ConsistencyCheckType TC_SEARCHDENORMCHECK = new typekey.ConsistencyCheckType("searchdenormcheck");
  
  /**
   * Subtype column check
   * Verifies subtype column contains valid values
   */
  public static final typekey.ConsistencyCheckType TC_SUBTYPECOLUMNCHECK = new typekey.ConsistencyCheckType("subtypecolumncheck");
  
  /**
   * Subtype non-null check
   * Verifies non-nullable subtype-specific columns have non-null values for subtype rows
   */
  public static final typekey.ConsistencyCheckType TC_SUBTYPENONNULLCHECK = new typekey.ConsistencyCheckType("subtypenonnullcheck");
  
  /**
   * Subtype-specific column check
   * Verifies subtype-specific columns are null when row is a different subtype
   */
  public static final typekey.ConsistencyCheckType TC_SUBTYPESPECIFICCHECK = new typekey.ConsistencyCheckType("subtypespecificcheck");
  
  /**
   * Typekey check
   * Verifies typekey column contains valid values
   */
  public static final typekey.ConsistencyCheckType TC_TYPEKEYCHECK = new typekey.ConsistencyCheckType("typekeycheck");
  
  /**
   * Typelist table check
   * Verifies values in typelist table and data model are in sync
   */
  public static final typekey.ConsistencyCheckType TC_TYPELISTTABLECHECK = new typekey.ConsistencyCheckType("typelisttablecheck");
  
  /**
   * Upgrade warning check
   * Verifies that data will pass associated version check at the beginning of the upgrade to a subsequent version of the product
   */
  public static final typekey.ConsistencyCheckType TC_UPGRADEWARNINGCHECK = new typekey.ConsistencyCheckType("upgradewarningcheck");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.ConsistencyCheckType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.ConsistencyCheckType>("ConsistencyCheckType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private ConsistencyCheckType(java.lang.String code)  {
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
  public typekey.ConsistencyCheckType get() {
    return this;
  }
  
  public static typekey.ConsistencyCheckType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.ConsistencyCheckType> getAllTypeKeys() {
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
  
  public static typekey.ConsistencyCheckType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.ConsistencyCheckType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.ConsistencyCheckType[]{});
  }
  
  public static java.util.List<typekey.ConsistencyCheckType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.ConsistencyCheckType getValue() {
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
    com.guidewire._generated.typekey.ConsistencyCheckTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.ConsistencyCheckType>() {
      public void clearCache(typekey.ConsistencyCheckType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.ConsistencyCheckType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.ConsistencyCheckType newInstance(java.lang.String code) {
        return new typekey.ConsistencyCheckType(code);
      }
      
      
    });
  }
}