package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFAckLevelCode_Ext.tti;ECFAckLevelCode_Ext.tix;ECFAckLevelCode_Ext.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class ECFAckLevelCode_Ext implements gw.entity.TypeKey {
  /**
   * Fail - Claim Not Found
   * Fail - Claim Not Found
   */
  public static final typekey.ECFAckLevelCode_Ext TC_CLAIMNOTFOUND = new typekey.ECFAckLevelCode_Ext("ClaimNotFound");
  
  /**
   * Carrier not registered to invoke the service
   * Carrier not registered to invoke the service
   */
  public static final typekey.ECFAckLevelCode_Ext TC_NOTREGISTERED = new typekey.ECFAckLevelCode_Ext("NotRegistered");
  
  /**
   * Fail - Your organisation is conflicted on this UCR
   * Fail - Your organisation is conflicted on this UCR
   */
  public static final typekey.ECFAckLevelCode_Ext TC_ORGCONFLICTED = new typekey.ECFAckLevelCode_Ext("OrgConflicted");
  
  /**
   * Partial Response - CLASS Unavailable/Unable to retrieve CLASS data
   * Partial Response - CLASS Unavailable/Unable to retrieve CLASS data
   */
  public static final typekey.ECFAckLevelCode_Ext TC_PARTIALRESPONSECLASS = new typekey.ECFAckLevelCode_Ext("PartialResponseCLASS");
  
  /**
   * Partial Response - IMR Unavailable/Unable to retrieve IMR data
   * Partial Response - IMR Unavailable/Unable to retrieve IMR data
   */
  public static final typekey.ECFAckLevelCode_Ext TC_PARTIALRESPONSEIMR = new typekey.ECFAckLevelCode_Ext("PartialResponseIMR");
  
  /**
   * Fail - Request Invalid
   * Fail - Request Invalid
   */
  public static final typekey.ECFAckLevelCode_Ext TC_REQUESTINVALID = new typekey.ECFAckLevelCode_Ext("RequestInvalid");
  
  /**
   * Request has been queued
   * Request has been queued
   */
  public static final typekey.ECFAckLevelCode_Ext TC_REQUESTQUEUED = new typekey.ECFAckLevelCode_Ext("RequestQueued");
  
  /**
   * Fail - Sender Claim Combination Invalid
   * Fail - Sender Claim Combination Invalid
   */
  public static final typekey.ECFAckLevelCode_Ext TC_SENDERINVALID = new typekey.ECFAckLevelCode_Ext("SenderInvalid");
  
  /**
   * Success
   * Success
   */
  public static final typekey.ECFAckLevelCode_Ext TC_SUCCESS = new typekey.ECFAckLevelCode_Ext("Success");
  
  /**
   * Fail - Unable to Retrieve Claim Transaction
   * Fail - Unable to Retrieve Claim Transaction
   */
  public static final typekey.ECFAckLevelCode_Ext TC_UNABLETORETRIEVECLAIM = new typekey.ECFAckLevelCode_Ext("UnableToRetrieveClaim");
  
  /**
   * Central Systems Unavailable
   * Central Systems Unavailable
   */
  public static final typekey.ECFAckLevelCode_Ext TC_UNAVAILABLE = new typekey.ECFAckLevelCode_Ext("Unavailable");
  
  /**
   * Unknown
   */
  public static final typekey.ECFAckLevelCode_Ext TC_UNKNOWN = new typekey.ECFAckLevelCode_Ext("Unknown");
  
  public static final gw.entity.ITypeFilter<typekey.ECFAckLevelCode_Ext> TF_ACKNOWLEDGED = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFAckLevelCode_Ext>("ECFAckLevelCode_Ext", "acknowledged");
  
  public static final gw.entity.ITypeFilter<typekey.ECFAckLevelCode_Ext> TF_NOCLAIMDATA = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFAckLevelCode_Ext>("ECFAckLevelCode_Ext", "NoClaimData");
  
  public static final gw.entity.ITypeFilter<typekey.ECFAckLevelCode_Ext> TF_REJECTED = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFAckLevelCode_Ext>("ECFAckLevelCode_Ext", "rejected");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.ECFAckLevelCode_Ext> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.ECFAckLevelCode_Ext>("ECFAckLevelCode_Ext");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private ECFAckLevelCode_Ext(java.lang.String code)  {
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
  public typekey.ECFAckLevelCode_Ext get() {
    return this;
  }
  
  public static typekey.ECFAckLevelCode_Ext get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.ECFAckLevelCode_Ext> getAllTypeKeys() {
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
  
  public static typekey.ECFAckLevelCode_Ext getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.ECFAckLevelCode_Ext[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.ECFAckLevelCode_Ext[]{});
  }
  
  public static java.util.List<typekey.ECFAckLevelCode_Ext> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.ECFAckLevelCode_Ext getValue() {
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
    com.guidewire._generated.typekey.ECFAckLevelCode_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.ECFAckLevelCode_Ext>() {
      public void clearCache(typekey.ECFAckLevelCode_Ext typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.ECFAckLevelCode_Ext typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.ECFAckLevelCode_Ext newInstance(java.lang.String code) {
        return new typekey.ECFAckLevelCode_Ext(code);
      }
      
      
    });
  }
}