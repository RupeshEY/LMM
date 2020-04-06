package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeExecutionTimeType.tti;UpgradeExecutionTimeType.tix;UpgradeExecutionTimeType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class UpgradeExecutionTimeType implements gw.entity.TypeKey {
  /**
   * Bootstrap
   * Bootstrap
   */
  public static final typekey.UpgradeExecutionTimeType TC_BOOTSTRAP = new typekey.UpgradeExecutionTimeType("bootstrap");
  
  /**
   * Check database state
   * Check database state for disabled constraints, etc.
   */
  public static final typekey.UpgradeExecutionTimeType TC_CHECKDBSTATE = new typekey.UpgradeExecutionTimeType("checkdbstate");
  
  /**
   * Clean up
   * Clean up
   */
  public static final typekey.UpgradeExecutionTimeType TC_CLEANUP = new typekey.UpgradeExecutionTimeType("cleanup");
  
  /**
   * Copy contents to shadow tables
   * Copy contents of source tables to shadow tables
   */
  @java.lang.Deprecated
  public static final typekey.UpgradeExecutionTimeType TC_COPYTOSHADOWTABLES = new typekey.UpgradeExecutionTimeType("copytoshadowtables");
  
  /**
   * Customer Post-Upgrade version triggers
   * Execute customer post-upgrade steps defined in IDatamodelUpgrade plugin
   */
  public static final typekey.UpgradeExecutionTimeType TC_CUSTOMPOSTUPGRADE = new typekey.UpgradeExecutionTimeType("custompostupgrade");
  
  /**
   * Customer Pre-Upgrade version triggers
   * Execute customer pre-upgrade steps defined in IDatamodelUpgrade plugin
   */
  public static final typekey.UpgradeExecutionTimeType TC_CUSTOMPREUPGRADE = new typekey.UpgradeExecutionTimeType("custompreupgrade");
  
  /**
   * Customer Version Checks
   * Execute customer checks to determine whether to proceed with upgrade
   */
  public static final typekey.UpgradeExecutionTimeType TC_CUSTOMVERSIONCHECKS = new typekey.UpgradeExecutionTimeType("customversionchecks");
  
  /**
   * Persist database parameters
   * Persist database parameters
   */
  public static final typekey.UpgradeExecutionTimeType TC_DBPARAMETERS = new typekey.UpgradeExecutionTimeType("dbparameters");
  
  /**
   * Capture database space after
   * Capture database space info after upgrade
   */
  public static final typekey.UpgradeExecutionTimeType TC_DBSPACEAFTER = new typekey.UpgradeExecutionTimeType("dbspaceafter");
  
  /**
   * Capture database space before
   * Capture database space info before upgrade
   */
  public static final typekey.UpgradeExecutionTimeType TC_DBSPACEBEFORE = new typekey.UpgradeExecutionTimeType("dbspacebefore");
  
  /**
   * Encrypt or decrypt existing data
   * Encrypt or decrypt existing data
   */
  public static final typekey.UpgradeExecutionTimeType TC_ENCRYPTDECRYPT = new typekey.UpgradeExecutionTimeType("encryptdecrypt");
  
  /**
   * Execute steps
   * Execute steps
   */
  public static final typekey.UpgradeExecutionTimeType TC_EXECUTESTEPS = new typekey.UpgradeExecutionTimeType("executesteps");
  
  /**
   * Generate steps
   * Generate steps
   */
  public static final typekey.UpgradeExecutionTimeType TC_GENSTEPS = new typekey.UpgradeExecutionTimeType("gensteps");
  
  /**
   * Verify no references to orphaned type codes
   * Verify no references to orphaned type codes
   */
  public static final typekey.UpgradeExecutionTimeType TC_ORPHANEDTYPECODES = new typekey.UpgradeExecutionTimeType("orphanedtypecodes");
  
  /**
   * Capture row counts after upgrade
   * Capture row counts after upgrade
   */
  public static final typekey.UpgradeExecutionTimeType TC_POSTROWCOUNTS = new typekey.UpgradeExecutionTimeType("postrowcounts");
  
  /**
   * Capture row counts before upgrade
   * Capture row counts before upgrade
   */
  public static final typekey.UpgradeExecutionTimeType TC_PREROWCOUNTS = new typekey.UpgradeExecutionTimeType("prerowcounts");
  
  /**
   * Capture snapshot of datamodel for archiving
   * Capture snapshot of datamodel for archiving
   */
  public static final typekey.UpgradeExecutionTimeType TC_SNAPSHOTDATAMODEL = new typekey.UpgradeExecutionTimeType("snapshotdatamodel");
  
  /**
   * Sync indexes
   * Sync indexes
   */
  public static final typekey.UpgradeExecutionTimeType TC_SYNCINDEXES = new typekey.UpgradeExecutionTimeType("syncindexes");
  
  /**
   * Verify schema
   * Verify schema
   */
  public static final typekey.UpgradeExecutionTimeType TC_VERIFYSCHEMA = new typekey.UpgradeExecutionTimeType("verifyschema");
  
  /**
   * Version Checks
   * Execute checks to determine whether to proceed with upgrade
   */
  public static final typekey.UpgradeExecutionTimeType TC_VERSIONCHECKS = new typekey.UpgradeExecutionTimeType("versionchecks");
  
  /**
   * VersionTriggers after schema diff
   * VersionTriggers after schema diff
   */
  public static final typekey.UpgradeExecutionTimeType TC_VTAFTERSCHEMADIFF = new typekey.UpgradeExecutionTimeType("vtafterschemadiff");
  
  /**
   * Execute VersionTriggers before schema diff
   * Execute VersionTriggers before schema diff
   */
  public static final typekey.UpgradeExecutionTimeType TC_VTBEFORESCHEMADIFF = new typekey.UpgradeExecutionTimeType("vtbeforeschemadiff");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.UpgradeExecutionTimeType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.UpgradeExecutionTimeType>("UpgradeExecutionTimeType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private UpgradeExecutionTimeType(java.lang.String code)  {
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
  public typekey.UpgradeExecutionTimeType get() {
    return this;
  }
  
  public static typekey.UpgradeExecutionTimeType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.UpgradeExecutionTimeType> getAllTypeKeys() {
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
  
  public static typekey.UpgradeExecutionTimeType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.UpgradeExecutionTimeType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.UpgradeExecutionTimeType[]{});
  }
  
  public static java.util.List<typekey.UpgradeExecutionTimeType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.UpgradeExecutionTimeType getValue() {
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
    com.guidewire._generated.typekey.UpgradeExecutionTimeTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.UpgradeExecutionTimeType>() {
      public void clearCache(typekey.UpgradeExecutionTimeType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.UpgradeExecutionTimeType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.UpgradeExecutionTimeType newInstance(java.lang.String code) {
        return new typekey.UpgradeExecutionTimeType(code);
      }
      
      
    });
  }
}