package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFResponseCode_Ext.tti;ECFResponseCode_Ext.tix;ECFResponseCode_Ext.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class ECFResponseCode_Ext implements gw.entity.TypeKey {
  /**
   * ACC: Company has no technical objections to the claim, but has an outstanding accounting issue with the reinsured. No signing will be issued for the company concerned until the response is changed to YES or CES (which are the only change responses allowed)
   * Company has no technical objections to the claim, but has an outstanding accounting issue with the reinsured. No signing will be issued for the company concerned until the response is changed to YES or CES (which are the only change responses allowed)
   */
  public static final typekey.ECFResponseCode_Ext TC_ACC = new typekey.ECFResponseCode_Ext("ACC");
  
  /**
   * Agree / Pay
   * Agree / Pay
   */
  public static final typekey.ECFResponseCode_Ext TC_AGREE_PAY = new typekey.ECFResponseCode_Ext("AGREE-PAY");
  
  /**
   * Authorise
   * Authorise
   */
  public static final typekey.ECFResponseCode_Ext TC_AUT = new typekey.ECFResponseCode_Ext("AUT");
  
  /**
   * CAA: Claims Advice Accepted
   * Claims Advice Accepted
   */
  public static final typekey.ECFResponseCode_Ext TC_CAA = new typekey.ECFResponseCode_Ext("CAA");
  
  /**
   * Cancel
   * Cancel
   */
  public static final typekey.ECFResponseCode_Ext TC_CAN = new typekey.ECFResponseCode_Ext("CAN");
  
  /**
   * CES: Yes response above will be automatically changed to CES if the responding company sets the immediate partial collection indicator to Y
   * Yes response above will be automatically changed to CES if the responding company sets the immediate partial collection indicator to Y
   */
  public static final typekey.ECFResponseCode_Ext TC_CES = new typekey.ECFResponseCode_Ext("CES");
  
  /**
   * Circulate
   * Circulate
   */
  public static final typekey.ECFResponseCode_Ext TC_CIR = new typekey.ECFResponseCode_Ext("CIR");
  
  /**
   * COM: Fully authorised and signed. Generated when all claim signings are generated for all members on a LIRMA claim transaction. Created after all SGN's
   * Fully authorised and signed. Generated when all claim signings are generated for all members on a LIRMA claim transaction. Created after all SGN's
   */
  public static final typekey.ECFResponseCode_Ext TC_COM = new typekey.ECFResponseCode_Ext("COM");
  
  /**
   * Delegate
   * Delegate
   */
  public static final typekey.ECFResponseCode_Ext TC_DELEGATE = new typekey.ECFResponseCode_Ext("DELEGATE");
  
  /**
   * DIS: DIS Insurer is in dispute over this claim
   * DIS Insurer is in dispute over this claim
   */
  public static final typekey.ECFResponseCode_Ext TC_DIS = new typekey.ECFResponseCode_Ext("DIS");
  
  /**
   * FIL: Broker requested to supply File or relevant correspondence to participant
   * Broker requested to supply File or relevant correspondence to participant
   */
  public static final typekey.ECFResponseCode_Ext TC_FIL = new typekey.ECFResponseCode_Ext("FIL");
  
  /**
   * INF: Broker requested to supply further information to participants. Companies making this response will be required to complete the “request” narrative.
   * Broker requested to supply further information to participants. Companies making this response will be required to complete the “request” narrative.
   */
  public static final typekey.ECFResponseCode_Ext TC_INF = new typekey.ECFResponseCode_Ext("INF");
  
  /**
   * NO: Insurer is in dispute
   * Insurer is in dispute
   */
  public static final typekey.ECFResponseCode_Ext TC_NO = new typekey.ECFResponseCode_Ext("NO");
  
  /**
   * Pend
   * Pend
   */
  public static final typekey.ECFResponseCode_Ext TC_PEN = new typekey.ECFResponseCode_Ext("PEN");
  
  /**
   * Query / Return
   * Query / Return
   */
  public static final typekey.ECFResponseCode_Ext TC_QUERY_RETURN = new typekey.ECFResponseCode_Ext("QUERY-RETURN");
  
  /**
   * Reject
   * Reject
   */
  public static final typekey.ECFResponseCode_Ext TC_REJ = new typekey.ECFResponseCode_Ext("REJ");
  
  /**
   * Seen / Action
   * Seen / Action
   */
  public static final typekey.ECFResponseCode_Ext TC_SEEN_ACTION = new typekey.ECFResponseCode_Ext("SEEN-ACTION");
  
  /**
   * Service / Action
   * Service / Action
   */
  public static final typekey.ECFResponseCode_Ext TC_SERVICE_ACTION = new typekey.ECFResponseCode_Ext("SERVICE-ACTION");
  
  /**
   * SGN: Fully authorised and signed. Generated when Claim signing is generated and transaction is moved to status 40
   * Fully authorised and signed. Generated when Claim signing is generated and transaction is moved to status 40
   */
  public static final typekey.ECFResponseCode_Ext TC_SGN = new typekey.ECFResponseCode_Ext("SGN");
  
  /**
   * Lead is moving a claim into VCS
   * Lead is moving a claim into VCS
   */
  public static final typekey.ECFResponseCode_Ext TC_VCS_ENTRY = new typekey.ECFResponseCode_Ext("VCS-ENTRY");
  
  /**
   * Crawfords is moving a claim out of VCS
   * Crawfords is moving a claim out of VCS
   */
  public static final typekey.ECFResponseCode_Ext TC_VCS_EXIT_CFORD = new typekey.ECFResponseCode_Ext("VCS-EXIT-CFORD");
  
  /**
   * XCS is moving a claim out of VCS
   * XCS is moving a claim out of VCS
   */
  public static final typekey.ECFResponseCode_Ext TC_VCS_EXIT_XCS = new typekey.ECFResponseCode_Ext("VCS-EXIT-XCS");
  
  /**
   * YES: Claim settlement agreed.
   * Claim settlement agreed
   */
  public static final typekey.ECFResponseCode_Ext TC_YES = new typekey.ECFResponseCode_Ext("YES");
  
  public static final gw.entity.ITypeFilter<typekey.ECFResponseCode_Ext> TF_AGREEMENT = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext", "Agreement");
  
  public static final gw.entity.ITypeFilter<typekey.ECFResponseCode_Ext> TF_FINAL = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext", "Final");
  
  public static final gw.entity.ITypeFilter<typekey.ECFResponseCode_Ext> TF_ILU = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext", "ILU");
  
  public static final gw.entity.ITypeFilter<typekey.ECFResponseCode_Ext> TF_LIRMALEAD = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext", "LirmaLead");
  
  public static final gw.entity.ITypeFilter<typekey.ECFResponseCode_Ext> TF_LIRMALEADCIRCULATED = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext", "LirmaLeadCirculated");
  
  public static final gw.entity.ITypeFilter<typekey.ECFResponseCode_Ext> TF_LIRMASAPADVICE = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext", "LirmaSAPAdvice");
  
  public static final gw.entity.ITypeFilter<typekey.ECFResponseCode_Ext> TF_LIRMASAPSETTLEMENT = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext", "LirmaSAPSettlement");
  
  public static final gw.entity.ITypeFilter<typekey.ECFResponseCode_Ext> TF_LLOYDSLEADADVICE = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext", "LloydsLeadAdvice");
  
  public static final gw.entity.ITypeFilter<typekey.ECFResponseCode_Ext> TF_LLOYDSLEADSETTLEMENT = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext", "LloydsLeadSettlement");
  
  public static final gw.entity.ITypeFilter<typekey.ECFResponseCode_Ext> TF_LLOYDSSAPADVICE = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext", "LloydsSAPAdvice");
  
  public static final gw.entity.ITypeFilter<typekey.ECFResponseCode_Ext> TF_LLOYDSSAPSETTLEMENT = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext", "LloydsSAPSettlement");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.ECFResponseCode_Ext> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.ECFResponseCode_Ext>("ECFResponseCode_Ext");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private ECFResponseCode_Ext(java.lang.String code)  {
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
  public typekey.ECFResponseCode_Ext get() {
    return this;
  }
  
  public static typekey.ECFResponseCode_Ext get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.ECFResponseCode_Ext> getAllTypeKeys() {
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
  
  public static typekey.ECFResponseCode_Ext getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.ECFResponseCode_Ext[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.ECFResponseCode_Ext[]{});
  }
  
  public static java.util.List<typekey.ECFResponseCode_Ext> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.ECFResponseCode_Ext getValue() {
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
    com.guidewire._generated.typekey.ECFResponseCode_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.ECFResponseCode_Ext>() {
      public void clearCache(typekey.ECFResponseCode_Ext typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.ECFResponseCode_Ext typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.ECFResponseCode_Ext newInstance(java.lang.String code) {
        return new typekey.ECFResponseCode_Ext(code);
      }
      
      
    });
  }
}