package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LMMessageTypeString_Ext.tti;LMMessageTypeString_Ext.tix;LMMessageTypeString_Ext.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class LMMessageTypeString_Ext implements gw.entity.TypeKey {
  /**
   * Claim Notify request
   */
  public static final typekey.LMMessageTypeString_Ext TC_ECFMESSAGECLAIMNOTIFYRQ_EXT = new typekey.LMMessageTypeString_Ext("ECFMessageClaimNotifyRq_Ext");
  
  /**
   * Claim Response request
   */
  public static final typekey.LMMessageTypeString_Ext TC_ECFMESSAGECLAIMRESPONSERQ_EXT = new typekey.LMMessageTypeString_Ext("ECFMessageClaimResponseRq_Ext");
  
  /**
   * Claim Response response
   */
  public static final typekey.LMMessageTypeString_Ext TC_ECFMESSAGECLAIMRESPONSERS_EXT = new typekey.LMMessageTypeString_Ext("ECFMessageClaimResponseRs_Ext");
  
  /**
   * Claim Retrieve request
   */
  public static final typekey.LMMessageTypeString_Ext TC_ECFMESSAGECLAIMRETRIEVERQ_EXT = new typekey.LMMessageTypeString_Ext("ECFMessageClaimRetrieveRq_Ext");
  
  /**
   * Claim Retrieve response
   */
  public static final typekey.LMMessageTypeString_Ext TC_ECFMESSAGECLAIMRETRIEVERS_EXT = new typekey.LMMessageTypeString_Ext("ECFMessageClaimRetrieveRs_Ext");
  
  /**
   * Document Download request
   */
  public static final typekey.LMMessageTypeString_Ext TC_ECFMESSAGEDOCUMENTDOWNLOADRQ_EXT = new typekey.LMMessageTypeString_Ext("ECFMessageDocumentDownloadRq_Ext");
  
  /**
   * Document Download response
   */
  public static final typekey.LMMessageTypeString_Ext TC_ECFMESSAGEDOCUMENTDOWNLOADRS_EXT = new typekey.LMMessageTypeString_Ext("ECFMessageDocumentDownloadRs_Ext");
  
  /**
   * Document Search request
   */
  public static final typekey.LMMessageTypeString_Ext TC_ECFMESSAGEDOCUMENTSEARCHRQ_EXT = new typekey.LMMessageTypeString_Ext("ECFMessageDocumentSearchRq_Ext");
  
  /**
   * Document Search response
   */
  public static final typekey.LMMessageTypeString_Ext TC_ECFMESSAGEDOCUMENTSEARCHRS_EXT = new typekey.LMMessageTypeString_Ext("ECFMessageDocumentSearchRs_Ext");
  
  /**
   * Document Upload request
   */
  public static final typekey.LMMessageTypeString_Ext TC_ECFMESSAGEDOCUMENTUPLOADRQ_EXT = new typekey.LMMessageTypeString_Ext("ECFMessageDocumentUploadRq_Ext");
  
  /**
   * Document Upload response
   */
  public static final typekey.LMMessageTypeString_Ext TC_ECFMESSAGEDOCUMENTUPLOADRS_EXT = new typekey.LMMessageTypeString_Ext("ECFMessageDocumentUploadRs_Ext");
  
  /**
   * SCM message
   */
  public static final typekey.LMMessageTypeString_Ext TC_LMMESSAGELLOYDSSCM_EXT = new typekey.LMMessageTypeString_Ext("LMMessageLloydsSCM_Ext");
  
  /**
   * Document Download receipt
   */
  public static final typekey.LMMessageTypeString_Ext TC_REPOSITORYDOWNLOADRECEIPT = new typekey.LMMessageTypeString_Ext("RepositoryDownloadReceipt");
  
  /**
   * Document Search receipt
   */
  public static final typekey.LMMessageTypeString_Ext TC_REPOSITORYSEARCHRECEIPT = new typekey.LMMessageTypeString_Ext("RepositorySearchReceipt");
  
  /**
   * Document Upload receipt
   */
  public static final typekey.LMMessageTypeString_Ext TC_REPOSITORYUPLOADRECEIPT = new typekey.LMMessageTypeString_Ext("RepositoryUploadReceipt");
  
  /**
   * Respond Error Notify
   */
  public static final typekey.LMMessageTypeString_Ext TC_RESPONDERRORNOTIFY = new typekey.LMMessageTypeString_Ext("RespondErrorNotify");
  
  /**
   * Transaction Error Notify
   */
  public static final typekey.LMMessageTypeString_Ext TC_TRANSACTIONERRORNOTIFY = new typekey.LMMessageTypeString_Ext("TransactionErrorNotify");
  
  /**
   * Unknown
   * Unknown message type
   */
  public static final typekey.LMMessageTypeString_Ext TC_UNKNOWN = new typekey.LMMessageTypeString_Ext("Unknown");
  
  public static final gw.entity.ITypeFilter<typekey.LMMessageTypeString_Ext> TF_CLAIMNOTIFY = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.LMMessageTypeString_Ext>("LMMessageTypeString_Ext", "ClaimNotify");
  
  public static final gw.entity.ITypeFilter<typekey.LMMessageTypeString_Ext> TF_CLAIMRESPONSE = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.LMMessageTypeString_Ext>("LMMessageTypeString_Ext", "ClaimResponse");
  
  public static final gw.entity.ITypeFilter<typekey.LMMessageTypeString_Ext> TF_CLAIMRETRIEVE = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.LMMessageTypeString_Ext>("LMMessageTypeString_Ext", "ClaimRetrieve");
  
  public static final gw.entity.ITypeFilter<typekey.LMMessageTypeString_Ext> TF_DOCUMENTDOWNLOAD = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.LMMessageTypeString_Ext>("LMMessageTypeString_Ext", "DocumentDownload");
  
  public static final gw.entity.ITypeFilter<typekey.LMMessageTypeString_Ext> TF_DOCUMENTSEARCH = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.LMMessageTypeString_Ext>("LMMessageTypeString_Ext", "DocumentSearch");
  
  public static final gw.entity.ITypeFilter<typekey.LMMessageTypeString_Ext> TF_DOCUMENTUPLOAD = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.LMMessageTypeString_Ext>("LMMessageTypeString_Ext", "DocumentUpload");
  
  public static final gw.entity.ITypeFilter<typekey.LMMessageTypeString_Ext> TF_INBOUND = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.LMMessageTypeString_Ext>("LMMessageTypeString_Ext", "Inbound");
  
  public static final gw.entity.ITypeFilter<typekey.LMMessageTypeString_Ext> TF_OUTBOUND = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.LMMessageTypeString_Ext>("LMMessageTypeString_Ext", "Outbound");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.LMMessageTypeString_Ext> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.LMMessageTypeString_Ext>("LMMessageTypeString_Ext");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private LMMessageTypeString_Ext(java.lang.String code)  {
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
  public typekey.LMMessageTypeString_Ext get() {
    return this;
  }
  
  public static typekey.LMMessageTypeString_Ext get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.LMMessageTypeString_Ext> getAllTypeKeys() {
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
  
  public static typekey.LMMessageTypeString_Ext getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.LMMessageTypeString_Ext[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.LMMessageTypeString_Ext[]{});
  }
  
  public static java.util.List<typekey.LMMessageTypeString_Ext> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.LMMessageTypeString_Ext getValue() {
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
    com.guidewire._generated.typekey.LMMessageTypeString_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.LMMessageTypeString_Ext>() {
      public void clearCache(typekey.LMMessageTypeString_Ext typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.LMMessageTypeString_Ext typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.LMMessageTypeString_Ext newInstance(java.lang.String code) {
        return new typekey.LMMessageTypeString_Ext(code);
      }
      
      
    });
  }
}