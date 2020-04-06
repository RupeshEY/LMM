package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionLifeCycleState.tti;TransactionLifeCycleState.tix;TransactionLifeCycleState.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class TransactionLifeCycleState implements gw.entity.TypeKey {
  /**
   * Awaiting submission
   * Transaction is waiting to be submitted to the downstream system
   */
  public static final typekey.TransactionLifeCycleState TC_AWAITINGSUBMISSION = new typekey.TransactionLifeCycleState("awaitingsubmission");
  
  /**
   * Committed
   * Transaction has been committed and is no longer editable
   */
  public static final typekey.TransactionLifeCycleState TC_COMMITTED = new typekey.TransactionLifeCycleState("committed");
  
  /**
   * Denied
   * Transaction has been denied
   */
  public static final typekey.TransactionLifeCycleState TC_DENIED = new typekey.TransactionLifeCycleState("denied");
  
  /**
   * Draft
   * Transactions in this state have not yet been completed and submitted for approval
   */
  public static final typekey.TransactionLifeCycleState TC_DRAFT = new typekey.TransactionLifeCycleState("draft");
  
  /**
   * Future dated
   * Valid only for future dated payments
   */
  public static final typekey.TransactionLifeCycleState TC_FUTUREDATED = new typekey.TransactionLifeCycleState("futuredated");
  
  /**
   * New
   * Transactions in this state are brand new, often with no lineitems yet, and not yet in DRAFT state
   */
  public static final typekey.TransactionLifeCycleState TC_NEW = new typekey.TransactionLifeCycleState("new");
  
  /**
   * Pending approval
   * Transaction is moving through the approval process
   */
  public static final typekey.TransactionLifeCycleState TC_PENDINGAPPROVAL = new typekey.TransactionLifeCycleState("pendingapproval");
  
  /**
   * Rejected
   * Transaction has been rejected
   */
  public static final typekey.TransactionLifeCycleState TC_REJECTED = new typekey.TransactionLifeCycleState("rejected");
  
  /**
   * Retired
   * Transaction has been retired
   */
  public static final typekey.TransactionLifeCycleState TC_RETIRED = new typekey.TransactionLifeCycleState("retired");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.TransactionLifeCycleState> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.TransactionLifeCycleState>("TransactionLifeCycleState");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private TransactionLifeCycleState(java.lang.String code)  {
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
  public typekey.TransactionLifeCycleState get() {
    return this;
  }
  
  public static typekey.TransactionLifeCycleState get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.TransactionLifeCycleState> getAllTypeKeys() {
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
  
  public static typekey.TransactionLifeCycleState getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.TransactionLifeCycleState[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.TransactionLifeCycleState[]{});
  }
  
  public static java.util.List<typekey.TransactionLifeCycleState> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.TransactionLifeCycleState getValue() {
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
    com.guidewire._generated.typekey.TransactionLifeCycleStateInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.TransactionLifeCycleState>() {
      public void clearCache(typekey.TransactionLifeCycleState typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.TransactionLifeCycleState typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.TransactionLifeCycleState newInstance(java.lang.String code) {
        return new typekey.TransactionLifeCycleState(code);
      }
      
      
    });
  }
}