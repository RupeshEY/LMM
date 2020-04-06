package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FinancialsCalculationType.tti;FinancialsCalculationType.tix;FinancialsCalculationType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class FinancialsCalculationType implements gw.entity.TypeKey {
  /**
   * AvailableReserves
   * Financials calculation for available reserves.
   */
  public static final typekey.FinancialsCalculationType TC_AVAILABLERESERVES = new typekey.FinancialsCalculationType("availablereserves");
  
  /**
   * FuturePayments
   * Financials calculation for future payments.
   */
  public static final typekey.FinancialsCalculationType TC_FUTUREPAYMENTS = new typekey.FinancialsCalculationType("futurepayments");
  
  /**
   * GrossTotalIncurred
   * Financials calculation for gross total incurred.
   */
  public static final typekey.FinancialsCalculationType TC_GROSSTOTALINCURRED = new typekey.FinancialsCalculationType("grosstotalincurred");
  
  /**
   * OpenRecoveryReserves
   * Financials calculation for open recover reserves.
   */
  public static final typekey.FinancialsCalculationType TC_OPENRECOVERYRESERVES = new typekey.FinancialsCalculationType("openrecoveryreserves");
  
  /**
   * OpenReserves
   * Financials calculation for open reserves.
   */
  public static final typekey.FinancialsCalculationType TC_OPENRESERVES = new typekey.FinancialsCalculationType("openreserves");
  
  /**
   * PendingApprovalErodingPayments
   * Financials calculation for pending approval eroding payments.
   */
  public static final typekey.FinancialsCalculationType TC_PENDAPPERODPAYMNTS = new typekey.FinancialsCalculationType("pendapperodpaymnts");
  
  /**
   * PendingApprovalNonErodingPayments
   * Financials calculation for pending approval noneroding payments.
   */
  public static final typekey.FinancialsCalculationType TC_PENDAPPNONERODPAYMNTS = new typekey.FinancialsCalculationType("pendappnonerodpaymnts");
  
  /**
   * PendingApprovalPayments
   * Financials calculation for pending approval payments.
   */
  public static final typekey.FinancialsCalculationType TC_PENDAPPPAYMENTS = new typekey.FinancialsCalculationType("pendapppayments");
  
  /**
   * PendingApprovalReserves
   * Financials calculation for pending approval reserves.
   */
  public static final typekey.FinancialsCalculationType TC_PENDAPPRESERVES = new typekey.FinancialsCalculationType("pendappreserves");
  
  /**
   * RemainingReserves
   * Financials calculation for remaining reserves.
   */
  public static final typekey.FinancialsCalculationType TC_REMAININGRESERVES = new typekey.FinancialsCalculationType("remainingreserves");
  
  /**
   * TotalIncurredNet
   * Financials calculation for total incurred net.
   */
  public static final typekey.FinancialsCalculationType TC_TOTALINCURREDNET = new typekey.FinancialsCalculationType("totalincurrednet");
  
  /**
   * TotalPayments
   * Financials calculation for total payments.
   */
  public static final typekey.FinancialsCalculationType TC_TOTALPAYMENTS = new typekey.FinancialsCalculationType("totalpayments");
  
  /**
   * TotalRecoveries
   * Financials calculation for total recoveries.
   */
  public static final typekey.FinancialsCalculationType TC_TOTALRECOVERIES = new typekey.FinancialsCalculationType("totalrecoveries");
  
  /**
   * TotalRecoveryReserves
   * Financials calculation for total recovery reserves.
   */
  public static final typekey.FinancialsCalculationType TC_TOTALRECOVERYRESERVES = new typekey.FinancialsCalculationType("totalrecoveryreserves");
  
  /**
   * TotalReserves
   * Financials calculation for total reserves.
   */
  public static final typekey.FinancialsCalculationType TC_TOTALRESERVES = new typekey.FinancialsCalculationType("totalreserves");
  
  /**
   * TotalIncurredNetMinusOpenRecoveryReserves
   * Financials calculation for total incurred net minus open recovery reserves.
   */
  public static final typekey.FinancialsCalculationType TC_TOTINCNETMINOPNRECRES = new typekey.FinancialsCalculationType("totincnetminopnrecres");
  
  /**
   * TotalPaymentsWithPending
   * Financials calculation for total payments with pending.
   */
  public static final typekey.FinancialsCalculationType TC_TOTPAYMNTWITHPENDING = new typekey.FinancialsCalculationType("totpaymntwithpending");
  
  /**
   * TotalReservesWithPending
   * Financials calculation for total reserves with pending
   */
  public static final typekey.FinancialsCalculationType TC_TOTRESWITHPENDING = new typekey.FinancialsCalculationType("totreswithpending");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.FinancialsCalculationType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.FinancialsCalculationType>("FinancialsCalculationType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private FinancialsCalculationType(java.lang.String code)  {
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
  public typekey.FinancialsCalculationType get() {
    return this;
  }
  
  public static typekey.FinancialsCalculationType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.FinancialsCalculationType> getAllTypeKeys() {
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
  
  public static typekey.FinancialsCalculationType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.FinancialsCalculationType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.FinancialsCalculationType[]{});
  }
  
  public static java.util.List<typekey.FinancialsCalculationType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.FinancialsCalculationType getValue() {
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
    com.guidewire._generated.typekey.FinancialsCalculationTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.FinancialsCalculationType>() {
      public void clearCache(typekey.FinancialsCalculationType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.FinancialsCalculationType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.FinancialsCalculationType newInstance(java.lang.String code) {
        return new typekey.FinancialsCalculationType(code);
      }
      
      
    });
  }
}