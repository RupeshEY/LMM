package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadStepType.tti;LoadStepType.tix;LoadStepType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class LoadStepType implements gw.entity.TypeKey {
  /**
   * ConsistencyChecker executed
   * Custom consistency checks executed after populating staging tables
   */
  public static final typekey.LoadStepType TC_CONSISTENCYCHECKED = new typekey.LoadStepType("consistencychecked");
  
  /**
   * Error table cleared
   * Error table cleared
   */
  public static final typekey.LoadStepType TC_ERRORCLEARED = new typekey.LoadStepType("errorcleared");
  
  /**
   * DB statistics updated with estimates for source tables
   * DB statistics updated with estimates for source tables
   */
  public static final typekey.LoadStepType TC_ESTIMATEDBSTATISTICS = new typekey.LoadStepType("estimatedbstatistics");
  
  /**
   * Excluded rows deleted
   * Excluded rows deleted from staging tables
   */
  public static final typekey.LoadStepType TC_EXCLUDEDDELETED = new typekey.LoadStepType("excludeddeleted");
  
  /**
   * Exclusion table cleared
   * Exclusion table cleared
   */
  public static final typekey.LoadStepType TC_EXCLUSIONCLEARED = new typekey.LoadStepType("exclusioncleared");
  
  /**
   * Exclusion table populated
   * Exclusion table populated with failed rows from error table
   */
  public static final typekey.LoadStepType TC_EXCLUSIONPOP = new typekey.LoadStepType("exclusionpop");
  
  /**
   * IDs generated for staging tables
   * IDs generated for staging tables
   */
  public static final typekey.LoadStepType TC_IDSGENERATED = new typekey.LoadStepType("idsgenerated");
  
  /**
   * INSERT SELECTs executed
   * INSERT SELECTs from staging to source tables executed
   */
  public static final typekey.LoadStepType TC_INSERTSELECTS = new typekey.LoadStepType("insertselects");
  
  /**
   * Integrity of staging tables checked
   * Integrity of staging tables checked (Entire phase)
   */
  public static final typekey.LoadStepType TC_INTEGRITYCHECKED = new typekey.LoadStepType("integritychecked");
  
  /**
   * Integrity check queries executed
   * Integrity check queries checks executed
   */
  public static final typekey.LoadStepType TC_INTEGRITYEXECUTED = new typekey.LoadStepType("integrityexecuted");
  
  /**
   * LoaderCallback after execution of insert/selects
   * LoaderCallbacks executed after insert/selects into source tables
   */
  public static final typekey.LoadStepType TC_LCAFTERINSERTSELECT = new typekey.LoadStepType("lcafterinsertselect");
  
  /**
   * LoaderCallback before id generation
   * LoaderCallbacks executed before id generation
   */
  public static final typekey.LoadStepType TC_LCBEFOREIDGENERATION = new typekey.LoadStepType("lcbeforeidgeneration");
  
  /**
   * LoaderCallback before execution of insert/selects
   * LoaderCallbacks executed before insert/selects into source tables
   */
  public static final typekey.LoadStepType TC_LCBEFOREINSERTSELECT = new typekey.LoadStepType("lcbeforeinsertselect");
  
  /**
   * Non-excluded rows deleted
   * Non-excluded rows deleted from staging tables
   */
  public static final typekey.LoadStepType TC_NONEXCLUDEDDELETED = new typekey.LoadStepType("nonexcludeddeleted");
  
  /**
   * Overwritten staging tables and columns cleared
   * Overwritten staging tables and columns cleared
   */
  public static final typekey.LoadStepType TC_OVERWRITTENCLEARED = new typekey.LoadStepType("overwrittencleared");
  
  /**
   * PostPopulatorExecutors executed
   * PostPopulatorExecutors executed after populating staging tables
   */
  public static final typekey.LoadStepType TC_PPESEXECUTED = new typekey.LoadStepType("ppesexecuted");
  
  /**
   * Row numbers generated for staging tables
   * Row numbers generated for staging tables
   */
  public static final typekey.LoadStepType TC_ROWNUMSGENERATED = new typekey.LoadStepType("rownumsgenerated");
  
  /**
   * Source tables loaded
   * Source tables loaded from staging tables (Entire phase)
   */
  public static final typekey.LoadStepType TC_SOURCELOADED = new typekey.LoadStepType("sourceloaded");
  
  /**
   * Staging tables cleared
   * Staging tables cleared
   */
  public static final typekey.LoadStepType TC_STAGINGCLEARED = new typekey.LoadStepType("stagingcleared");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.LoadStepType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.LoadStepType>("LoadStepType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private LoadStepType(java.lang.String code)  {
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
  public typekey.LoadStepType get() {
    return this;
  }
  
  public static typekey.LoadStepType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.LoadStepType> getAllTypeKeys() {
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
  
  public static typekey.LoadStepType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.LoadStepType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.LoadStepType[]{});
  }
  
  public static java.util.List<typekey.LoadStepType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.LoadStepType getValue() {
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
    com.guidewire._generated.typekey.LoadStepTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.LoadStepType>() {
      public void clearCache(typekey.LoadStepType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.LoadStepType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.LoadStepType newInstance(java.lang.String code) {
        return new typekey.LoadStepType(code);
      }
      
      
    });
  }
}