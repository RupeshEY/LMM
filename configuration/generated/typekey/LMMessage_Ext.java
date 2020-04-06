package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LMMessage_Ext.tti;LMMessage_Ext.tix;LMMessage_Ext.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class LMMessage_Ext implements gw.entity.TypeKey {
  /**
   * ECFDocumentMessage_Ext
   * ECFDocumentMessage_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFDOCUMENTMESSAGE_EXT = new typekey.LMMessage_Ext("ECFDocumentMessage_Ext");
  
  /**
   * ECFMessageClaimData_Ext
   * ECFMessageClaimData_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGECLAIMDATA_EXT = new typekey.LMMessage_Ext("ECFMessageClaimData_Ext");
  
  /**
   * ECFMessageClaimNotifyRq_Ext
   * ECFMessageClaimNotifyRq_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGECLAIMNOTIFYRQ_EXT = new typekey.LMMessage_Ext("ECFMessageClaimNotifyRq_Ext");
  
  /**
   * ECFMessageClaimResponseRq_Ext
   * ECFMessageClaimResponseRq_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGECLAIMRESPONSERQ_EXT = new typekey.LMMessage_Ext("ECFMessageClaimResponseRq_Ext");
  
  /**
   * ECFMessageClaimResponseRs_Ext
   * ECFMessageClaimResponseRs_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGECLAIMRESPONSERS_EXT = new typekey.LMMessage_Ext("ECFMessageClaimResponseRs_Ext");
  
  /**
   * ECFMessageClaimRetrieveRq_Ext
   * ECFMessageClaimRetrieveRq_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGECLAIMRETRIEVERQ_EXT = new typekey.LMMessage_Ext("ECFMessageClaimRetrieveRq_Ext");
  
  /**
   * ECFMessageClaimRetrieveRs_Ext
   * ECFMessageClaimRetrieveRs_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGECLAIMRETRIEVERS_EXT = new typekey.LMMessage_Ext("ECFMessageClaimRetrieveRs_Ext");
  
  /**
   * ECFMessageDocumentDownloadRq_Ext
   * ECFMessageDocumentDownloadRq_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGEDOCUMENTDOWNLOADRQ_EXT = new typekey.LMMessage_Ext("ECFMessageDocumentDownloadRq_Ext");
  
  /**
   * ECFMessageDocumentDownloadRs_Ext
   * ECFMessageDocumentDownloadRs_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGEDOCUMENTDOWNLOADRS_EXT = new typekey.LMMessage_Ext("ECFMessageDocumentDownloadRs_Ext");
  
  /**
   * ECFMessageDocumentPostRs_Ext
   * ECFMessageDocumentPostRs_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGEDOCUMENTPOSTRS_EXT = new typekey.LMMessage_Ext("ECFMessageDocumentPostRs_Ext");
  
  /**
   * ECFMessageDocumentSearchRq_Ext
   * ECFMessageDocumentSearchRq_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGEDOCUMENTSEARCHRQ_EXT = new typekey.LMMessage_Ext("ECFMessageDocumentSearchRq_Ext");
  
  /**
   * ECFMessageDocumentSearchRs_Ext
   * ECFMessageDocumentSearchRs_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGEDOCUMENTSEARCHRS_EXT = new typekey.LMMessage_Ext("ECFMessageDocumentSearchRs_Ext");
  
  /**
   * ECFMessageDocumentUploadRq_Ext
   * ECFMessageDocumentUploadRq_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGEDOCUMENTUPLOADRQ_EXT = new typekey.LMMessage_Ext("ECFMessageDocumentUploadRq_Ext");
  
  /**
   * ECFMessageDocumentUploadRs_Ext
   * ECFMessageDocumentUploadRs_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGEDOCUMENTUPLOADRS_EXT = new typekey.LMMessage_Ext("ECFMessageDocumentUploadRs_Ext");
  
  /**
   * ECFMessage_Ext
   * ECFMessage_Ext
   */
  public static final typekey.LMMessage_Ext TC_ECFMESSAGE_EXT = new typekey.LMMessage_Ext("ECFMessage_Ext");
  
  /**
   * LMMessageLloydsSCM_Ext
   * LMMessageLloydsSCM_Ext
   */
  public static final typekey.LMMessage_Ext TC_LMMESSAGELLOYDSSCM_EXT = new typekey.LMMessage_Ext("LMMessageLloydsSCM_Ext");
  
  /**
   * LMMessage_Ext
   * LMMessage_Ext
   */
  public static final typekey.LMMessage_Ext TC_LMMESSAGE_EXT = new typekey.LMMessage_Ext("LMMessage_Ext");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.LMMessage_Ext> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.LMMessage_Ext>("LMMessage_Ext");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private LMMessage_Ext(java.lang.String code)  {
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
  public typekey.LMMessage_Ext get() {
    return this;
  }
  
  public static typekey.LMMessage_Ext get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.LMMessage_Ext> getAllTypeKeys() {
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
   * 
   * @deprecated Use {@link #getEntityType} instead
   */
  @java.lang.Deprecated
  public gw.entity.IEntityType getEntityIntrinsicType() {
    return getEntityType();
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
  
  public static typekey.LMMessage_Ext getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.LMMessage_Ext[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.LMMessage_Ext[]{});
  }
  
  public static java.util.List<typekey.LMMessage_Ext> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.LMMessage_Ext getValue() {
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
    com.guidewire._generated.typekey.LMMessage_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.LMMessage_Ext>() {
      public void clearCache(typekey.LMMessage_Ext typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.LMMessage_Ext typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.LMMessage_Ext newInstance(java.lang.String code) {
        return new typekey.LMMessage_Ext(code);
      }
      
      
    });
  }
}