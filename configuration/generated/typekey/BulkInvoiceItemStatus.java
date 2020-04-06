package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BulkInvoiceItemStatus.tti;BulkInvoiceItemStatus.tix;BulkInvoiceItemStatus.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class BulkInvoiceItemStatus implements gw.entity.TypeKey {
  /**
   * Item approved
   * Bulk invoice item has passed the bulk invoice approval process
   */
  public static final typekey.BulkInvoiceItemStatus TC_APPROVED = new typekey.BulkInvoiceItemStatus("approved");
  
  /**
   * Awaiting submission
   * Bulk invoice item and its check have passed approval and is ready to be escalated once the bulk invoice is ready to be escalated
   */
  public static final typekey.BulkInvoiceItemStatus TC_AWAITINGSUBMISSION = new typekey.BulkInvoiceItemStatus("awaitingsubmission");
  
  /**
   * Check pending approval
   * Bulk invoice item has passed the bulk invoice approval process and is waiting for its check to be approved
   */
  public static final typekey.BulkInvoiceItemStatus TC_CHECKPENDINGAPPROVAL = new typekey.BulkInvoiceItemStatus("checkpendingapproval");
  
  /**
   * Draft
   * Bulk invoice item is possibly committed to the database, but is not yet ready for validation
   */
  public static final typekey.BulkInvoiceItemStatus TC_DRAFT = new typekey.BulkInvoiceItemStatus("draft");
  
  /**
   * In review
   * Bulk invoice item requires action before it can be paid.  This value can be set when approving a bulk invoice.
   */
  public static final typekey.BulkInvoiceItemStatus TC_INREVIEW = new typekey.BulkInvoiceItemStatus("inreview");
  
  /**
   * Not valid
   * Payment/check associated with the bulk invoice item failed validation
   */
  public static final typekey.BulkInvoiceItemStatus TC_NOTVALID = new typekey.BulkInvoiceItemStatus("notvalid");
  
  /**
   * Pending stop
   * Bulk invoice item was stopped, and confirmation of stop is pending
   */
  public static final typekey.BulkInvoiceItemStatus TC_PENDINGSTOP = new typekey.BulkInvoiceItemStatus("pendingstop");
  
  /**
   * Pending transfer
   * Check associated with bulk invoice item was transferred, and acknowledgement of the transfer event message is pending
   */
  public static final typekey.BulkInvoiceItemStatus TC_PENDINGTRANSFER = new typekey.BulkInvoiceItemStatus("pendingtransfer");
  
  /**
   * Pending void
   * Bulk invoice item was voided, and confirmation of void is pending
   */
  public static final typekey.BulkInvoiceItemStatus TC_PENDINGVOID = new typekey.BulkInvoiceItemStatus("pendingvoid");
  
  /**
   * Rejected
   * Bulk invoice item was rejected by the bulk invoice approver
   */
  public static final typekey.BulkInvoiceItemStatus TC_REJECTED = new typekey.BulkInvoiceItemStatus("rejected");
  
  /**
   * Stopped
   * Bulk invoice item was stopped
   */
  public static final typekey.BulkInvoiceItemStatus TC_STOPPED = new typekey.BulkInvoiceItemStatus("stopped");
  
  /**
   * Submitted
   * Bulk invoice item was submitted to the downstream system
   */
  public static final typekey.BulkInvoiceItemStatus TC_SUBMITTED = new typekey.BulkInvoiceItemStatus("submitted");
  
  /**
   * Submitting
   * Bulk invoice item is being submitted to downsteam system
   */
  public static final typekey.BulkInvoiceItemStatus TC_SUBMITTING = new typekey.BulkInvoiceItemStatus("submitting");
  
  /**
   * Transferred
   * Check associated with bulk invoice item was transferred
   */
  public static final typekey.BulkInvoiceItemStatus TC_TRANSFERRED = new typekey.BulkInvoiceItemStatus("transferred");
  
  /**
   * Voided
   * Bulk invoice item was voided
   */
  public static final typekey.BulkInvoiceItemStatus TC_VOIDED = new typekey.BulkInvoiceItemStatus("voided");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.BulkInvoiceItemStatus> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.BulkInvoiceItemStatus>("BulkInvoiceItemStatus");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private BulkInvoiceItemStatus(java.lang.String code)  {
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
  public typekey.BulkInvoiceItemStatus get() {
    return this;
  }
  
  public static typekey.BulkInvoiceItemStatus get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.BulkInvoiceItemStatus> getAllTypeKeys() {
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
  
  public static typekey.BulkInvoiceItemStatus getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.BulkInvoiceItemStatus[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.BulkInvoiceItemStatus[]{});
  }
  
  public static java.util.List<typekey.BulkInvoiceItemStatus> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.BulkInvoiceItemStatus getValue() {
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
    com.guidewire._generated.typekey.BulkInvoiceItemStatusInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.BulkInvoiceItemStatus>() {
      public void clearCache(typekey.BulkInvoiceItemStatus typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.BulkInvoiceItemStatus typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.BulkInvoiceItemStatus newInstance(java.lang.String code) {
        return new typekey.BulkInvoiceItemStatus(code);
      }
      
      
    });
  }
}