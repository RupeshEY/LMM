package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleImportStatus.tti;RuleImportStatus.tix;RuleImportStatus.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class RuleImportStatus implements gw.entity.TypeKey {
  /**
   * Versions Conflict
   * The rule was modified on both systems
   */
  public static final typekey.RuleImportStatus TC_CONFLICT = new typekey.RuleImportStatus("Conflict");
  
  /**
   * Rule Deployment
   * The rule was deployed on a different system
   */
  public static final typekey.RuleImportStatus TC_DEPLOYED = new typekey.RuleImportStatus("Deployed");
  
  /**
   * Discarded
   * The import was discarded
   */
  public static final typekey.RuleImportStatus TC_DISCARDED = new typekey.RuleImportStatus("Discarded");
  
  /**
   * Edited Version
   * The rule was modified on both systems, and a new edited version was created
   */
  public static final typekey.RuleImportStatus TC_EDITEDRESOLVEDCONFLICT = new typekey.RuleImportStatus("EditedResolvedConflict");
  
  /**
   * Kept Existing Version
   * The rule was modified on both systems, the conflict was resolved and the rule was kept the same
   */
  public static final typekey.RuleImportStatus TC_EXISTINGCONFLICT = new typekey.RuleImportStatus("ExistingConflict");
  
  /**
   * Replaced with New Version
   * The new rule version was imported
   */
  public static final typekey.RuleImportStatus TC_IMPORTED = new typekey.RuleImportStatus("Imported");
  
  /**
   * Replaced with Importing Version
   * The rule was modified on both systems, the conflict was resolved and the rule was imported
   */
  public static final typekey.RuleImportStatus TC_IMPORTEDCONFLICT = new typekey.RuleImportStatus("ImportedConflict");
  
  /**
   * Existing Version Deployed
   * The rule was deployed on a different system and imported to this system
   */
  public static final typekey.RuleImportStatus TC_IMPORTEDDEPLOYED = new typekey.RuleImportStatus("ImportedDeployed");
  
  /**
   * Applied Edited Version
   * The rule was modified on both systems, the conflict was resolved and a new draft was imported for resolution
   */
  public static final typekey.RuleImportStatus TC_IMPORTEDEDITEDCONFLICT = new typekey.RuleImportStatus("ImportedEditedConflict");
  
  /**
   * Imported New Rule
   * The new rule was imported
   */
  public static final typekey.RuleImportStatus TC_IMPORTEDNEW = new typekey.RuleImportStatus("ImportedNew");
  
  /**
   * New Rule
   * The rule is new
   */
  public static final typekey.RuleImportStatus TC_NEW = new typekey.RuleImportStatus("New");
  
  /**
   * No Change
   * No action is required because the imported rule version already exists
   */
  public static final typekey.RuleImportStatus TC_NOACTION = new typekey.RuleImportStatus("NoAction");
  
  /**
   * New Version
   * The rule was modified only on remote system
   */
  public static final typekey.RuleImportStatus TC_NOCONFLICT = new typekey.RuleImportStatus("NoConflict");
  
  /**
   * Versions Conflict
   * The rule was modified on both systems and the conflict has been resolved
   */
  public static final typekey.RuleImportStatus TC_RESOLVEDCONFLICT = new typekey.RuleImportStatus("ResolvedConflict");
  
  public static final gw.entity.ITypeFilter<typekey.RuleImportStatus> TF_FINALSTATUS = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.RuleImportStatus>("RuleImportStatus", "FinalStatus");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.RuleImportStatus> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.RuleImportStatus>("RuleImportStatus");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private RuleImportStatus(java.lang.String code)  {
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
  public typekey.RuleImportStatus get() {
    return this;
  }
  
  public static typekey.RuleImportStatus get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.RuleImportStatus> getAllTypeKeys() {
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
  
  public static typekey.RuleImportStatus getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.RuleImportStatus[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.RuleImportStatus[]{});
  }
  
  public static java.util.List<typekey.RuleImportStatus> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.RuleImportStatus getValue() {
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
    com.guidewire._generated.typekey.RuleImportStatusInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.RuleImportStatus>() {
      public void clearCache(typekey.RuleImportStatus typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.RuleImportStatus typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.RuleImportStatus newInstance(java.lang.String code) {
        return new typekey.RuleImportStatus(code);
      }
      
      
    });
  }
}