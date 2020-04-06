package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFQueryReason_Ext.tti;ECFQueryReason_Ext.tix;ECFQueryReason_Ext.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class ECFQueryReason_Ext implements gw.entity.TypeKey {
  /**
   * Missing/Unreadable policy or contract documents
   * When any policy-related document has not been loaded, or cannot be read. This would include endorsements.
   */
  public static final typekey.ECFQueryReason_Ext TC_1 = new typekey.ECFQueryReason_Ext("1");
  
  /**
   * Pending market discussion
   * Primarily for CTP claims, where a market meeting has been called of which the outcome will determine the response of the transaction
   */
  public static final typekey.ECFQueryReason_Ext TC_10 = new typekey.ECFQueryReason_Ext("10");
  
  /**
   * Duplicate advice/claims created in error
   * Where the broker has created the transaction in error (e.g. where there is a duplicate ECF UCR, or previously advised on paper)
   */
  public static final typekey.ECFQueryReason_Ext TC_11 = new typekey.ECFQueryReason_Ext("11");
  
  /**
   * Other: Non-fundamental query
   * For all other queries
   */
  public static final typekey.ECFQueryReason_Ext TC_12 = new typekey.ECFQueryReason_Ext("12");
  
  /**
   * Missing/Unreadable claim related documents
   * When any claim-related document has not been loaded, or cannot be read.
   */
  public static final typekey.ECFQueryReason_Ext TC_2 = new typekey.ECFQueryReason_Ext("2");
  
  /**
   * Missing policy data/unsigned premium
   * When any policy data (i.e. data held within the ECF record, not the documentation) is missing – including the Original Signing Number and Date
   */
  public static final typekey.ECFQueryReason_Ext TC_3 = new typekey.ECFQueryReason_Ext("3");
  
  /**
   * Incorrect broker loaded claim details
   * When any broker-loaded claim details are incorrect
   */
  public static final typekey.ECFQueryReason_Ext TC_4 = new typekey.ECFQueryReason_Ext("4");
  
  /**
   * Claim out of scope for ECF
   * When the claim has been defined out scope according to the current version of the SP_P
   */
  public static final typekey.ECFQueryReason_Ext TC_5 = new typekey.ECFQueryReason_Ext("5");
  
  /**
   * Inconsistent financials
   * When there is an issue with the financial figures reconciling with those within documentation that cannot be resolved by a request for further information on the next submission
   */
  public static final typekey.ECFQueryReason_Ext TC_6 = new typekey.ECFQueryReason_Ext("6");
  
  /**
   * Incorrect agreement parties noted
   * Where the Lead has been incorrectly identified by the broker, or a further agreement party has been incorrectly identified by the Lead
   */
  public static final typekey.ECFQueryReason_Ext TC_7 = new typekey.ECFQueryReason_Ext("7");
  
  /**
   * Inadequate/incorrect data for XCS processing
   * To be used by XCS only where there is insufficient or missing information to process the transaction
   */
  public static final typekey.ECFQueryReason_Ext TC_8 = new typekey.ECFQueryReason_Ext("8");
  
  /**
   * Query raised with settlement
   * To be used for Settlement transactions only where the agreement party cannot authorise the payment – may be used in conjunction with any other Query Reason
   */
  public static final typekey.ECFQueryReason_Ext TC_9 = new typekey.ECFQueryReason_Ext("9");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.ECFQueryReason_Ext> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.ECFQueryReason_Ext>("ECFQueryReason_Ext");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private ECFQueryReason_Ext(java.lang.String code)  {
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
  public typekey.ECFQueryReason_Ext get() {
    return this;
  }
  
  public static typekey.ECFQueryReason_Ext get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.ECFQueryReason_Ext> getAllTypeKeys() {
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
  
  public static typekey.ECFQueryReason_Ext getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.ECFQueryReason_Ext[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.ECFQueryReason_Ext[]{});
  }
  
  public static java.util.List<typekey.ECFQueryReason_Ext> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.ECFQueryReason_Ext getValue() {
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
    com.guidewire._generated.typekey.ECFQueryReason_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.ECFQueryReason_Ext>() {
      public void clearCache(typekey.ECFQueryReason_Ext typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.ECFQueryReason_Ext typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.ECFQueryReason_Ext newInstance(java.lang.String code) {
        return new typekey.ECFQueryReason_Ext(code);
      }
      
      
    });
  }
}