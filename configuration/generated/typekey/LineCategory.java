package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LineCategory.tti;LineCategory.tix;LineCategory.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class LineCategory implements gw.entity.TypeKey {
  /**
   * Chiropractor
   * Chiropractor
   */
  public static final typekey.LineCategory TC_CHIRO = new typekey.LineCategory("chiro");
  
  /**
   * Court costs
   * Court costs
   */
  public static final typekey.LineCategory TC_COURTCOSTS = new typekey.LineCategory("CourtCosts");
  
  /**
   * Deductible
   * Deductible
   */
  public static final typekey.LineCategory TC_DEDUCTIBLE = new typekey.LineCategory("deductible");
  
  /**
   * Deposition
   * Deposition
   */
  public static final typekey.LineCategory TC_DEPOSITION = new typekey.LineCategory("Deposition");
  
  /**
   * X-ray/diagnostic
   * X-ray/diagnostic
   */
  public static final typekey.LineCategory TC_DIAGNOSTIC = new typekey.LineCategory("diagnostic");
  
  /**
   * Discovery/Research
   * Discovery/Research
   */
  public static final typekey.LineCategory TC_DISCOVERY = new typekey.LineCategory("Discovery");
  
  /**
   * Doctor
   * Doctor's care
   */
  public static final typekey.LineCategory TC_DOCTOR = new typekey.LineCategory("doctor");
  
  /**
   * Draft Appeal
   * Draft Appeal
   */
  public static final typekey.LineCategory TC_DRAFTAPPEAL = new typekey.LineCategory("DraftAppeal");
  
  /**
   * Prescription drugs
   * Prescription drugs
   */
  public static final typekey.LineCategory TC_DRUGS = new typekey.LineCategory("drugs");
  
  /**
   * Experts (Private, CPA, Reconstruction)
   * Experts (Private, CPA, Reconstruction)
   */
  public static final typekey.LineCategory TC_EXPERTS = new typekey.LineCategory("Experts");
  
  /**
   * File review
   * File review
   */
  public static final typekey.LineCategory TC_FILEREVIEW = new typekey.LineCategory("FileReview");
  
  /**
   * Former Deductible
   * Former Deductible
   */
  public static final typekey.LineCategory TC_FORMERDEDUCTIBLE = new typekey.LineCategory("formerdeductible");
  
  /**
   * Hearing
   * Hearing
   */
  public static final typekey.LineCategory TC_HEARING = new typekey.LineCategory("Hearing");
  
  /**
   * Hospital
   * Hospital
   */
  public static final typekey.LineCategory TC_HOSPITAL = new typekey.LineCategory("hospital");
  
  /**
   * Inspection
   * Inspection
   */
  public static final typekey.LineCategory TC_INSPECTION = new typekey.LineCategory("inspection");
  
  /**
   * Investigation
   * Investigation
   */
  public static final typekey.LineCategory TC_INVESTIGATION = new typekey.LineCategory("Investigation");
  
  /**
   * Labor
   * Labor
   */
  public static final typekey.LineCategory TC_LABOR = new typekey.LineCategory("labor");
  
  /**
   * Meeting
   * Meeting
   */
  public static final typekey.LineCategory TC_MEETING = new typekey.LineCategory("Meeting");
  
  /**
   * Mileage reimbursement
   * Mileage reimbursement
   */
  public static final typekey.LineCategory TC_MILEAGE = new typekey.LineCategory("mileage");
  
  /**
   * Nurse
   * Nursing care
   */
  public static final typekey.LineCategory TC_NURSE = new typekey.LineCategory("nurse");
  
  /**
   * Other
   * Other
   */
  public static final typekey.LineCategory TC_OTHER = new typekey.LineCategory("other");
  
  /**
   * Parts
   * Parts
   */
  public static final typekey.LineCategory TC_PARTS = new typekey.LineCategory("parts");
  
  /**
   * Phone call
   * Phone call
   */
  public static final typekey.LineCategory TC_PHONECALL = new typekey.LineCategory("PhoneCall");
  
  /**
   * Physical therapy
   * Physical therapy
   */
  public static final typekey.LineCategory TC_PT = new typekey.LineCategory("pt");
  
  /**
   * Reimbursed Deductible
   * Reimbursed Deductible
   */
  public static final typekey.LineCategory TC_REIMBURSEDDEDUCTIBLE = new typekey.LineCategory("reimburseddeductible");
  
  /**
   * Review correspondence
   * Review correspondence
   */
  public static final typekey.LineCategory TC_REVIEWCORRESPOND = new typekey.LineCategory("ReviewCorrespond");
  
  /**
   * Towing
   * Towing
   */
  public static final typekey.LineCategory TC_TOWING = new typekey.LineCategory("towing");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.LineCategory> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.LineCategory>("LineCategory");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private LineCategory(java.lang.String code)  {
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
  public typekey.LineCategory get() {
    return this;
  }
  
  public static typekey.LineCategory get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.LineCategory> getAllTypeKeys() {
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
  
  public static typekey.LineCategory getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.LineCategory[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.LineCategory[]{});
  }
  
  public static java.util.List<typekey.LineCategory> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.LineCategory getValue() {
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
    com.guidewire._generated.typekey.LineCategoryInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.LineCategory>() {
      public void clearCache(typekey.LineCategory typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.LineCategory typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.LineCategory newInstance(java.lang.String code) {
        return new typekey.LineCategory(code);
      }
      
      
    });
  }
}