package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFTransactionStatus_Ext.tti;ECFTransactionStatus_Ext.tix;ECFTransactionStatus_Ext.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class ECFTransactionStatus_Ext implements gw.entity.TypeKey {
  /**
   * 10-AWAITING/QUERIED
   * Awaiting Action/Queried (Queried is just for Lloyds)
   */
  public static final typekey.ECFTransactionStatus_Ext TC_10_AWAITING_QUERIED = new typekey.ECFTransactionStatus_Ext("10-AWAITING-QUERIED");
  
  /**
   * 12-PENDED/ REJECTED
   * Pended/Rejected by a Lead (ILU)
   */
  public static final typekey.ECFTransactionStatus_Ext TC_12_PENDED_REJECTED = new typekey.ECFTransactionStatus_Ext("12-PENDED-REJECTED");
  
  /**
   * 12-REJ
   * Rejected (LIRMA only)
   */
  public static final typekey.ECFTransactionStatus_Ext TC_12_REJ = new typekey.ECFTransactionStatus_Ext("12-REJ");
  
  /**
   * 14-PART-AUT
   * Part Authorised - authorised by the lead only (Lloyd's only)
   */
  public static final typekey.ECFTransactionStatus_Ext TC_14_PART_AUT = new typekey.ECFTransactionStatus_Ext("14-PART-AUT");
  
  /**
   * 15-PART-AUT
   * Part Authorised - authorised by the lead and XCS (Lloyd's and ILU)
   */
  public static final typekey.ECFTransactionStatus_Ext TC_15_PART_AUT = new typekey.ECFTransactionStatus_Ext("15-PART-AUT");
  
  /**
   * 16-COND QUERIED
   * Part Authorised - authorised by the lead and XCS (Lloyd's and ILU)One or more of the other co-leads / agreement parties have not made a response or the current co-lead’s response is inconsistent with responses made by other co-leads / agreement parties in the group.
   */
  public static final typekey.ECFTransactionStatus_Ext TC_16_COND_QUERIED = new typekey.ECFTransactionStatus_Ext("16-COND-QUERIED");
  
  /**
   * 17-COND AUTHORISED
   * All agreement parties on the claim have made a consistent response on their respective co-lead transactions, regardless of the nature of that response
   */
  public static final typekey.ECFTransactionStatus_Ext TC_17_COND_AUTHORISED = new typekey.ECFTransactionStatus_Ext("17-COND-AUTHORISED");
  
  /**
   * 20-CIRCULATED
   * Circulated (Only LIRMA)
   */
  public static final typekey.ECFTransactionStatus_Ext TC_20_CIRCULATED = new typekey.ECFTransactionStatus_Ext("20-CIRCULATED");
  
  /**
   * 24-RIP REQD
   * Awaiting Reinstatement (fully authorised) – ILU only
   */
  public static final typekey.ECFTransactionStatus_Ext TC_24_RIP_REQD = new typekey.ECFTransactionStatus_Ext("24-RIP-REQD");
  
  /**
   * 25-RIP PREV
   * Awaiting Reinstatement on previous transaction (fully authorised) – ILU only
   */
  public static final typekey.ECFTransactionStatus_Ext TC_25_RIP_PREV = new typekey.ECFTransactionStatus_Ext("25-RIP-PREV");
  
  /**
   * 26-HELD CPA
   * Awaiting CPA Release – ILU only
   */
  public static final typekey.ECFTransactionStatus_Ext TC_26_HELD_CPA = new typekey.ECFTransactionStatus_Ext("26-HELD-CPA");
  
  /**
   * 27-HELD CPA
   * Awaiting CPA Release on previous transaction – ILU only
   */
  public static final typekey.ECFTransactionStatus_Ext TC_27_HELD_CPA = new typekey.ECFTransactionStatus_Ext("27-HELD-CPA");
  
  /**
   * 3
   * Txn in error
   */
  public static final typekey.ECFTransactionStatus_Ext TC_3 = new typekey.ECFTransactionStatus_Ext("3");
  
  /**
   * 30-AUTHORSD
   * Fully Authorised – Awaiting Signing (ILU)
   */
  public static final typekey.ECFTransactionStatus_Ext TC_30_AUTHORSD = new typekey.ECFTransactionStatus_Ext("30-AUTHORSD");
  
  /**
   * 31-ADV BDWN
   * Fully Authorised Lloyds advising transaction – Awaiting processing by Xchanging technician
   */
  public static final typekey.ECFTransactionStatus_Ext TC_31_ADV_BDWN = new typekey.ECFTransactionStatus_Ext("31-ADV-BDWN");
  
  /**
   * 32-SET BDWN
   * Fully Authorised Lloyds settlement transaction – Awaiting processing by Xchanging technician
   */
  public static final typekey.ECFTransactionStatus_Ext TC_32_SET_BDWN = new typekey.ECFTransactionStatus_Ext("32-SET-BDWN");
  
  /**
   * 33-PROCESS
   * Fully Authorised – Breakdown Incomplete (Lloyd's)
   */
  public static final typekey.ECFTransactionStatus_Ext TC_33_PROCESS = new typekey.ECFTransactionStatus_Ext("33-PROCESS");
  
  /**
   * 36-RELEASED
   * Fully Authorised – Breakdown Complete (Lloyd's)
   */
  public static final typekey.ECFTransactionStatus_Ext TC_36_RELEASED = new typekey.ECFTransactionStatus_Ext("36-RELEASED");
  
  /**
   * 4
   * Awaiting update of earlier txn
   */
  public static final typekey.ECFTransactionStatus_Ext TC_4 = new typekey.ECFTransactionStatus_Ext("4");
  
  /**
   * 40-COMPLETE
   * Fully Authorised and Signed/Complete
   */
  public static final typekey.ECFTransactionStatus_Ext TC_40_COMPLETE = new typekey.ECFTransactionStatus_Ext("40-COMPLETE");
  
  /**
   * 45-CANCEL’D
   * Cancelled (LIRMA only)
   */
  public static final typekey.ECFTransactionStatus_Ext TC_45_CANCELD = new typekey.ECFTransactionStatus_Ext("45-CANCELD");
  
  /**
   * 8-PURGED
   * Purged
   */
  public static final typekey.ECFTransactionStatus_Ext TC_8_PURGED = new typekey.ECFTransactionStatus_Ext("8-PURGED");
  
  /**
   * 9-MKT-CHK
   * Awaiting market check
   */
  public static final typekey.ECFTransactionStatus_Ext TC_9_MKT_CHK = new typekey.ECFTransactionStatus_Ext("9-MKT-CHK");
  
  /**
   * DELETED
   * Transaction was deleted on ECF2
   */
  public static final typekey.ECFTransactionStatus_Ext TC_DELETED = new typekey.ECFTransactionStatus_Ext("DELETED");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.ECFTransactionStatus_Ext> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.ECFTransactionStatus_Ext>("ECFTransactionStatus_Ext");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private ECFTransactionStatus_Ext(java.lang.String code)  {
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
  public typekey.ECFTransactionStatus_Ext get() {
    return this;
  }
  
  public static typekey.ECFTransactionStatus_Ext get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.ECFTransactionStatus_Ext> getAllTypeKeys() {
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
  
  public static typekey.ECFTransactionStatus_Ext getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.ECFTransactionStatus_Ext[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.ECFTransactionStatus_Ext[]{});
  }
  
  public static java.util.List<typekey.ECFTransactionStatus_Ext> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.ECFTransactionStatus_Ext getValue() {
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
    com.guidewire._generated.typekey.ECFTransactionStatus_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.ECFTransactionStatus_Ext>() {
      public void clearCache(typekey.ECFTransactionStatus_Ext typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.ECFTransactionStatus_Ext typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.ECFTransactionStatus_Ext newInstance(java.lang.String code) {
        return new typekey.ECFTransactionStatus_Ext(code);
      }
      
      
    });
  }
}