package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionStatus.tti;TransactionStatus.tix;TransactionStatus.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class TransactionStatus implements gw.entity.TypeKey {
  /**
   * Awaiting submission
   * Awaiting for the send date to arrive, at which point the status will change to Submitting (applicable only to payments)
   */
  public static final typekey.TransactionStatus TC_AWAITINGSUBMISSION = new typekey.TransactionStatus("awaitingsubmission");
  
  /**
   * Cleared
   * Check has cleared
   */
  public static final typekey.TransactionStatus TC_CLEARED = new typekey.TransactionStatus("cleared");
  
  /**
   * Denied
   * Denied by the downstream system
   */
  public static final typekey.TransactionStatus TC_DENIED = new typekey.TransactionStatus("denied");
  
  /**
   * Draft
   * Draft; not yet submitted to a back-end accounting system
   */
  public static final typekey.TransactionStatus TC_DRAFT = new typekey.TransactionStatus("draft");
  
  /**
   * Issued
   * Check has been issued
   */
  public static final typekey.TransactionStatus TC_ISSUED = new typekey.TransactionStatus("issued");
  
  /**
   * Notifying
   * In the process of notifying the accounting system of a new manual check
   */
  public static final typekey.TransactionStatus TC_NOTIFYING = new typekey.TransactionStatus("notifying");
  
  /**
   * Pending approval
   * Pending approval
   */
  public static final typekey.TransactionStatus TC_PENDINGAPPROVAL = new typekey.TransactionStatus("pendingapproval");
  
  /**
   * Pending recode
   * Transaction that is pending recode
   */
  public static final typekey.TransactionStatus TC_PENDINGRECODE = new typekey.TransactionStatus("pendingrecode");
  
  /**
   * Pending stop
   * A stop payment request is pending (applicable only to payments)
   */
  public static final typekey.TransactionStatus TC_PENDINGSTOP = new typekey.TransactionStatus("pendingstop");
  
  /**
   * Pending transfer
   * Transaction that is pending transfer from one claim to another claim
   */
  public static final typekey.TransactionStatus TC_PENDINGTRANSFER = new typekey.TransactionStatus("pendingtransfer");
  
  /**
   * Pending void
   * A void transaction request is pending (applicable only to payments and recoveries)
   */
  public static final typekey.TransactionStatus TC_PENDINGVOID = new typekey.TransactionStatus("pendingvoid");
  
  /**
   * Recoded
   * Transaction that is recoded
   */
  public static final typekey.TransactionStatus TC_RECODED = new typekey.TransactionStatus("recoded");
  
  /**
   * Rejected
   * Rejected by the user assigned to approve the transaction
   */
  public static final typekey.TransactionStatus TC_REJECTED = new typekey.TransactionStatus("rejected");
  
  /**
   * Requested
   * Requested of the accounting system (applicable only to checks)
   */
  public static final typekey.TransactionStatus TC_REQUESTED = new typekey.TransactionStatus("requested");
  
  /**
   * Requesting
   * In the process of being requested from the accounting system (applicable only to checks)
   */
  public static final typekey.TransactionStatus TC_REQUESTING = new typekey.TransactionStatus("requesting");
  
  /**
   * Stopped
   * A stop payment has been issued for this payment's check (applicable only to payments)
   */
  public static final typekey.TransactionStatus TC_STOPPED = new typekey.TransactionStatus("stopped");
  
  /**
   * Submitted
   * Submitted to the accounting system
   */
  public static final typekey.TransactionStatus TC_SUBMITTED = new typekey.TransactionStatus("submitted");
  
  /**
   * Submitting
   * In the process of being submitted to the accounting system
   */
  public static final typekey.TransactionStatus TC_SUBMITTING = new typekey.TransactionStatus("submitting");
  
  /**
   * Transferred
   * Transaction that is transferred from one claim to another claim
   */
  public static final typekey.TransactionStatus TC_TRANSFERRED = new typekey.TransactionStatus("transferred");
  
  /**
   * Voided
   * The transaction is voided (applicable only to payments and recoveries)
   */
  public static final typekey.TransactionStatus TC_VOIDED = new typekey.TransactionStatus("voided");
  
  public static final gw.entity.ITypeFilter<typekey.TransactionStatus> TF_CHECK = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.TransactionStatus>("TransactionStatus", "check");
  
  public static final gw.entity.ITypeFilter<typekey.TransactionStatus> TF_RECOVERY = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.TransactionStatus>("TransactionStatus", "recovery");
  
  public static final gw.entity.ITypeFilter<typekey.TransactionStatus> TF_TRANSACTION = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.TransactionStatus>("TransactionStatus", "transaction");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.TransactionStatus> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.TransactionStatus>("TransactionStatus");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private TransactionStatus(java.lang.String code)  {
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
  public typekey.TransactionStatus get() {
    return this;
  }
  
  public static typekey.TransactionStatus get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.TransactionStatus> getAllTypeKeys() {
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
  
  public static typekey.TransactionStatus getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.TransactionStatus[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.TransactionStatus[]{});
  }
  
  public static java.util.List<typekey.TransactionStatus> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.TransactionStatus getValue() {
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
    com.guidewire._generated.typekey.TransactionStatusInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.TransactionStatus>() {
      public void clearCache(typekey.TransactionStatus typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.TransactionStatus typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.TransactionStatus newInstance(java.lang.String code) {
        return new typekey.TransactionStatus(code);
      }
      
      
    });
  }
}