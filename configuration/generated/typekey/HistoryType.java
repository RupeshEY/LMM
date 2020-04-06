package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "HistoryType.tti;HistoryType.tix;HistoryType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class HistoryType implements gw.entity.TypeKey {
  /**
   * Approval or Rejection
   * A referral was approved/rejected
   */
  public static final typekey.HistoryType TC_APPROVAL = new typekey.HistoryType("approval");
  
  /**
   * Archived
   * Claim was archived
   */
  public static final typekey.HistoryType TC_ARCHIVED = new typekey.HistoryType("archived");
  
  /**
   * Assigned
   * Claim, exposure or subrogation was assigned
   */
  public static final typekey.HistoryType TC_ASSIGNMENT = new typekey.HistoryType("assignment");
  
  /**
   * Catastrophe warning
   * Catastrophe warning
   */
  public static final typekey.HistoryType TC_CATASTROPHE = new typekey.HistoryType("catastrophe");
  
  /**
   * Check deleted
   * A check was deleted
   */
  public static final typekey.HistoryType TC_CHECKDELETED = new typekey.HistoryType("checkdeleted");
  
  /**
   * Check stopped
   * A check was stopped
   */
  public static final typekey.HistoryType TC_CHECKSTOPPED = new typekey.HistoryType("checkstopped");
  
  /**
   * Check transferred
   * A check was transferred to another claim
   */
  public static final typekey.HistoryType TC_CHECKTRANSFERRED = new typekey.HistoryType("checktransferred");
  
  /**
   * Check voided
   * A check was voided
   */
  public static final typekey.HistoryType TC_CHECKVOIDED = new typekey.HistoryType("checkvoided");
  
  /**
   * Closed
   * Claim, exposure, or subrogation was closed
   */
  public static final typekey.HistoryType TC_CLOSED = new typekey.HistoryType("closed");
  
  /**
   * Custom
   * A custom history event happened; see CustomType for details
   */
  public static final typekey.HistoryType TC_CUSTOM = new typekey.HistoryType("custom");
  
  /**
   * Activity due date changed
   * Due date on an activity was changed
   */
  public static final typekey.HistoryType TC_DELAYED = new typekey.HistoryType("delayed");
  
  /**
   * Activity escalation date moved
   * The escalation date on an activity was changed
   */
  public static final typekey.HistoryType TC_ESCALATIONMVD = new typekey.HistoryType("escalationmvd");
  
  /**
   * Flagged
   * Claim flagged indicator status was changed
   */
  public static final typekey.HistoryType TC_FLAGGED = new typekey.HistoryType("flagged");
  
  /**
   * Imported
   * Claim or exposure was imported
   */
  public static final typekey.HistoryType TC_IMPORT = new typekey.HistoryType("import");
  
  /**
   * Litigated
   * Claim was litigated
   */
  public static final typekey.HistoryType TC_LITIGATED = new typekey.HistoryType("litigated");
  
  /**
   * Opened
   * A new claim or exposure was opened
   */
  public static final typekey.HistoryType TC_OPENED = new typekey.HistoryType("opened");
  
  /**
   * Policy edited
   * The policy was edited, and thus marked unverified
   */
  public static final typekey.HistoryType TC_POLICYEDITED = new typekey.HistoryType("policyedited");
  
  /**
   * Policy selected or refreshed
   * A different policy was selected for the claim, or the existing policy was refreshed
   */
  public static final typekey.HistoryType TC_POLICYSELECTED = new typekey.HistoryType("policyselected");
  
  /**
   * Referred
   * Subrogation was referred
   */
  public static final typekey.HistoryType TC_REFERRED = new typekey.HistoryType("referred");
  
  /**
   * Reopened
   * Claim or exposure was reopened
   */
  public static final typekey.HistoryType TC_REOPENED = new typekey.HistoryType("reopened");
  
  /**
   * Retrieved
   * Archived claim was retrieved
   */
  public static final typekey.HistoryType TC_RESTORED = new typekey.HistoryType("restored");
  
  /**
   * Viewed
   * Claim or exposure was viewed by a user
   */
  public static final typekey.HistoryType TC_VIEWING = new typekey.HistoryType("viewing");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.HistoryType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.HistoryType>("HistoryType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private HistoryType(java.lang.String code)  {
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
  public typekey.HistoryType get() {
    return this;
  }
  
  public static typekey.HistoryType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.HistoryType> getAllTypeKeys() {
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
  
  public static typekey.HistoryType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.HistoryType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.HistoryType[]{});
  }
  
  public static java.util.List<typekey.HistoryType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.HistoryType getValue() {
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
    com.guidewire._generated.typekey.HistoryTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.HistoryType>() {
      public void clearCache(typekey.HistoryType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.HistoryType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.HistoryType newInstance(java.lang.String code) {
        return new typekey.HistoryType(code);
      }
      
      
    });
  }
}