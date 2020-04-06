package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageType_Ext.tti;ECFMessageType_Ext.tix;ECFMessageType_Ext.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class ECFMessageType_Ext implements gw.entity.TypeKey {
  /**
   * ClaimNotify
   * ClaimNotifyEventRq message type
   */
  public static final typekey.ECFMessageType_Ext TC_CLAIMNOTIFY = new typekey.ECFMessageType_Ext("ClaimNotify");
  
  /**
   * ClaimRespond
   * ClaimResponseRq and ClaimResponseRs message type
   */
  public static final typekey.ECFMessageType_Ext TC_CLAIMRESPOND = new typekey.ECFMessageType_Ext("ClaimRespond");
  
  /**
   * LloydsSyndicateClaim
   * Syndicate Claim Message (SCM) message type. Applies to Lloyd's.
   */
  public static final typekey.ECFMessageType_Ext TC_LLOYDSSYNDICATECLAIM = new typekey.ECFMessageType_Ext("LloydsSyndicateClaim");
  
  /**
   * RepositoryDownload
   * IMR RepositoryDownloadRequest and RepositoryDownloadResponse message type
   */
  public static final typekey.ECFMessageType_Ext TC_REPOSITORYDOWNLOAD = new typekey.ECFMessageType_Ext("RepositoryDownload");
  
  /**
   * RepositoryDownloadReceipt
   * Document Download Request Receipt
   */
  public static final typekey.ECFMessageType_Ext TC_REPOSITORYDOWNLOADRECEIPT = new typekey.ECFMessageType_Ext("RepositoryDownloadReceipt");
  
  /**
   * RepositorySearch
   * IMR RepositorySearchRequest and RepositorySearchResponse message type
   */
  public static final typekey.ECFMessageType_Ext TC_REPOSITORYSEARCH = new typekey.ECFMessageType_Ext("RepositorySearch");
  
  /**
   * RepositorySearchReceipt
   * Document Search Request Receipt
   */
  public static final typekey.ECFMessageType_Ext TC_REPOSITORYSEARCHRECEIPT = new typekey.ECFMessageType_Ext("RepositorySearchReceipt");
  
  /**
   * RepositoryUpload
   * IMR RepositoryUploadRequest and RepositoryUploadResponse message type
   */
  public static final typekey.ECFMessageType_Ext TC_REPOSITORYUPLOAD = new typekey.ECFMessageType_Ext("RepositoryUpload");
  
  /**
   * RepositoryUploadReceipt
   * Document Upload Request Receipt
   */
  public static final typekey.ECFMessageType_Ext TC_REPOSITORYUPLOADRECEIPT = new typekey.ECFMessageType_Ext("RepositoryUploadReceipt");
  
  /**
   * RespondErrorNotify
   * ClaimNotifyEventRq with MsgTypeCd of RespondErrorNotify - Errors in a Claim Response
   */
  public static final typekey.ECFMessageType_Ext TC_RESPONDERRORNOTIFY = new typekey.ECFMessageType_Ext("RespondErrorNotify");
  
  /**
   * RetrieveClaim
   * RetrieveClaimRq and RetrieveClaimRs message type
   */
  public static final typekey.ECFMessageType_Ext TC_RETRIEVECLAIM = new typekey.ECFMessageType_Ext("RetrieveClaim");
  
  /**
   * TransactionErrorNotify
   * ClaimNotifyEventRq with Errors generated in Transaction on ECF2
   */
  public static final typekey.ECFMessageType_Ext TC_TRANSACTIONERRORNOTIFY = new typekey.ECFMessageType_Ext("TransactionErrorNotify");
  
  public static final gw.entity.ITypeFilter<typekey.ECFMessageType_Ext> TF_CLAIMMOVEMENT = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFMessageType_Ext>("ECFMessageType_Ext", "ClaimMovement");
  
  public static final gw.entity.ITypeFilter<typekey.ECFMessageType_Ext> TF_ECFWRITEBACK = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFMessageType_Ext>("ECFMessageType_Ext", "ECFWriteback");
  
  public static final gw.entity.ITypeFilter<typekey.ECFMessageType_Ext> TF_IMR = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFMessageType_Ext>("ECFMessageType_Ext", "IMR");
  
  public static final gw.entity.ITypeFilter<typekey.ECFMessageType_Ext> TF_SUBMESSAGE = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFMessageType_Ext>("ECFMessageType_Ext", "SubMessage");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.ECFMessageType_Ext> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.ECFMessageType_Ext>("ECFMessageType_Ext");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private ECFMessageType_Ext(java.lang.String code)  {
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
  public typekey.ECFMessageType_Ext get() {
    return this;
  }
  
  public static typekey.ECFMessageType_Ext get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.ECFMessageType_Ext> getAllTypeKeys() {
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
  
  public static typekey.ECFMessageType_Ext getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.ECFMessageType_Ext[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.ECFMessageType_Ext[]{});
  }
  
  public static java.util.List<typekey.ECFMessageType_Ext> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.ECFMessageType_Ext getValue() {
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
    com.guidewire._generated.typekey.ECFMessageType_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.ECFMessageType_Ext>() {
      public void clearCache(typekey.ECFMessageType_Ext typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.ECFMessageType_Ext typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.ECFMessageType_Ext newInstance(java.lang.String code) {
        return new typekey.ECFMessageType_Ext(code);
      }
      
      
    });
  }
}