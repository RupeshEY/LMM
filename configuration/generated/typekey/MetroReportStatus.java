package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MetroReportStatus.tti;MetroReportStatus.tix;MetroReportStatus.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class MetroReportStatus implements gw.entity.TypeKey {
  /**
   * Accepted
   * The Report Order File is sent and accepted by Metro
   */
  public static final typekey.MetroReportStatus TC_ACCEPTED = new typekey.MetroReportStatus("accepted");
  
  /**
   * Closed
   * The Report is Closed
   */
  public static final typekey.MetroReportStatus TC_CLOSED = new typekey.MetroReportStatus("closed");
  
  /**
   * Deferred
   * An image was returned with a notice that the data source will take some additional time to provide the requested information
   */
  public static final typekey.MetroReportStatus TC_DEFERRED = new typekey.MetroReportStatus("deferred");
  
  /**
   * DownloadingReport
   * The system is in the process of downloading the report
   */
  public static final typekey.MetroReportStatus TC_DOWNLOADINGREPORT = new typekey.MetroReportStatus("downloadingreport");
  
  /**
   * Duplicate
   * The Report request failed due to a duplicate request
   */
  public static final typekey.MetroReportStatus TC_DUPLICATE = new typekey.MetroReportStatus("duplicate");
  
  /**
   * Error
   * The Report request has errors
   */
  public static final typekey.MetroReportStatus TC_ERROR = new typekey.MetroReportStatus("error");
  
  /**
   * HasReport
   * The Report is ready on the external server
   */
  public static final typekey.MetroReportStatus TC_HASREPORT = new typekey.MetroReportStatus("hasreport");
  
  /**
   * Hold
   * The order is awaiting additional information from the customer
   */
  public static final typekey.MetroReportStatus TC_HOLD = new typekey.MetroReportStatus("hold");
  
  /**
   * InquiryFailed
   * The inquiry request is failed based on the result sent back from Metro
   */
  public static final typekey.MetroReportStatus TC_INQUIRYFAILED = new typekey.MetroReportStatus("inquiryfailed");
  
  /**
   * InsufficientData
   * Some of the required fields are missing
   */
  public static final typekey.MetroReportStatus TC_INSUFFICIENTDATA = new typekey.MetroReportStatus("insufficientdata");
  
  /**
   * New
   * The initial status of the report request
   */
  public static final typekey.MetroReportStatus TC_NEW = new typekey.MetroReportStatus("new");
  
  /**
   * OrderFailed
   * The order request is failed based on the result sent back from Metro
   */
  public static final typekey.MetroReportStatus TC_ORDERFAILED = new typekey.MetroReportStatus("orderfailed");
  
  /**
   * Pending
   * The order was received and in process
   */
  public static final typekey.MetroReportStatus TC_PENDING = new typekey.MetroReportStatus("pending");
  
  /**
   * Received
   * The Report is received (download) to our server
   */
  public static final typekey.MetroReportStatus TC_RECEIVED = new typekey.MetroReportStatus("received");
  
  /**
   * SendingInquiry
   * The Report Inquiry File is sent and waiting for the response from Metro
   */
  public static final typekey.MetroReportStatus TC_SENDINGINQUIRY = new typekey.MetroReportStatus("sendinginquiry");
  
  /**
   * SendingOrder
   * The request is sent and waiting for the response from Metro
   */
  public static final typekey.MetroReportStatus TC_SENDINGORDER = new typekey.MetroReportStatus("sendingorder");
  
  /**
   * Validated
   * The request is validated and ready to be sent out
   */
  public static final typekey.MetroReportStatus TC_VALIDATED = new typekey.MetroReportStatus("validated");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.MetroReportStatus> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.MetroReportStatus>("MetroReportStatus");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private MetroReportStatus(java.lang.String code)  {
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
  public typekey.MetroReportStatus get() {
    return this;
  }
  
  public static typekey.MetroReportStatus get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.MetroReportStatus> getAllTypeKeys() {
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
  
  public static typekey.MetroReportStatus getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.MetroReportStatus[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.MetroReportStatus[]{});
  }
  
  public static java.util.List<typekey.MetroReportStatus> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.MetroReportStatus getValue() {
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
    com.guidewire._generated.typekey.MetroReportStatusInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.MetroReportStatus>() {
      public void clearCache(typekey.MetroReportStatus typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.MetroReportStatus typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.MetroReportStatus newInstance(java.lang.String code) {
        return new typekey.MetroReportStatus(code);
      }
      
      
    });
  }
}