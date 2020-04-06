package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BulkInvoiceStatus.tti;BulkInvoiceStatus.tix;BulkInvoiceStatus.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class BulkInvoiceStatus implements gw.entity.TypeKey {
  /**
   * Awaiting submission
   * Awaiting submission to the downstream system
   */
  public static final typekey.BulkInvoiceStatus TC_AWAITINGSUBMISSION = new typekey.BulkInvoiceStatus("awaitingsubmission");
  
  /**
   * Cleared
   * Bulk invoice's associated bulk check has been cleared
   */
  public static final typekey.BulkInvoiceStatus TC_CLEARED = new typekey.BulkInvoiceStatus("cleared");
  
  /**
   * Draft
   * Bulk invoice is possibly committed to DB, but not yet ready for validation
   */
  public static final typekey.BulkInvoiceStatus TC_DRAFT = new typekey.BulkInvoiceStatus("draft");
  
  /**
   * In review
   * Bulk invoice is under review
   */
  public static final typekey.BulkInvoiceStatus TC_INREVIEW = new typekey.BulkInvoiceStatus("inreview");
  
  /**
   * Invalid bulk invoice items
   * One or more approved items on the bulk invoice failed validation or had some problem with the associated check
   */
  public static final typekey.BulkInvoiceStatus TC_INVALIDITEMS = new typekey.BulkInvoiceStatus("invaliditems");
  
  /**
   * Issued
   * Bulk invoice's associated bulk check has been issued
   */
  public static final typekey.BulkInvoiceStatus TC_ISSUED = new typekey.BulkInvoiceStatus("issued");
  
  /**
   * On hold
   * Bulk invoice was put on hold by downstream system
   */
  public static final typekey.BulkInvoiceStatus TC_ONHOLD = new typekey.BulkInvoiceStatus("onhold");
  
  /**
   * Pending bulk invoice item validation
   * Individual bulk invoice items are being validated
   */
  public static final typekey.BulkInvoiceStatus TC_PENDINGITEMVALIDATION = new typekey.BulkInvoiceStatus("pendingitemvalidation");
  
  /**
   * Pending stop
   * Bulk invoice was stopped, and confirmation of stop is pending
   */
  public static final typekey.BulkInvoiceStatus TC_PENDINGSTOP = new typekey.BulkInvoiceStatus("pendingstop");
  
  /**
   * Pending void
   * Bulk invoice was voided, and confirmation of void is pending
   */
  public static final typekey.BulkInvoiceStatus TC_PENDINGVOID = new typekey.BulkInvoiceStatus("pendingvoid");
  
  /**
   * Rejected
   * Bulk invoice rejected by assigned approver
   */
  public static final typekey.BulkInvoiceStatus TC_REJECTED = new typekey.BulkInvoiceStatus("rejected");
  
  /**
   * Requested
   * Sent to downstream system and acknowledged
   */
  public static final typekey.BulkInvoiceStatus TC_REQUESTED = new typekey.BulkInvoiceStatus("requested");
  
  /**
   * Requesting
   * Queued for submission to the downstream system
   */
  public static final typekey.BulkInvoiceStatus TC_REQUESTING = new typekey.BulkInvoiceStatus("requesting");
  
  /**
   * Stopped
   * Bulk invoice was stopped
   */
  public static final typekey.BulkInvoiceStatus TC_STOPPED = new typekey.BulkInvoiceStatus("stopped");
  
  /**
   * Voided
   * Bulk invoice was voided
   */
  public static final typekey.BulkInvoiceStatus TC_VOIDED = new typekey.BulkInvoiceStatus("voided");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.BulkInvoiceStatus> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.BulkInvoiceStatus>("BulkInvoiceStatus");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private BulkInvoiceStatus(java.lang.String code)  {
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
  public typekey.BulkInvoiceStatus get() {
    return this;
  }
  
  public static typekey.BulkInvoiceStatus get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.BulkInvoiceStatus> getAllTypeKeys() {
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
  
  public static typekey.BulkInvoiceStatus getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.BulkInvoiceStatus[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.BulkInvoiceStatus[]{});
  }
  
  public static java.util.List<typekey.BulkInvoiceStatus> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.BulkInvoiceStatus getValue() {
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
    com.guidewire._generated.typekey.BulkInvoiceStatusInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.BulkInvoiceStatus>() {
      public void clearCache(typekey.BulkInvoiceStatus typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.BulkInvoiceStatus typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.BulkInvoiceStatus newInstance(java.lang.String code) {
        return new typekey.BulkInvoiceStatus(code);
      }
      
      
    });
  }
}