package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MedicalTreatmentType.tti;MedicalTreatmentType.tix;MedicalTreatmentType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class MedicalTreatmentType implements gw.entity.TypeKey {
  /**
   * Acupuncture
   * Acupuncture
   */
  public static final typekey.MedicalTreatmentType TC_ACUP = new typekey.MedicalTreatmentType("acup");
  
  /**
   * Chiropractor
   * Chiropractor
   */
  public static final typekey.MedicalTreatmentType TC_CHIR = new typekey.MedicalTreatmentType("chir");
  
  /**
   * Psych counseling
   * Psych counseling
   */
  public static final typekey.MedicalTreatmentType TC_COUNSEL = new typekey.MedicalTreatmentType("counsel");
  
  /**
   * Emergency care
   * Emergency care
   */
  public static final typekey.MedicalTreatmentType TC_EMER_CARE = new typekey.MedicalTreatmentType("emer_care");
  
  /**
   * ER treated & released
   * ER treated & released
   */
  public static final typekey.MedicalTreatmentType TC_ER = new typekey.MedicalTreatmentType("er");
  
  /**
   * Hospitalized
   * Hospitalized
   */
  public static final typekey.MedicalTreatmentType TC_HOSPITAL = new typekey.MedicalTreatmentType("hospital");
  
  /**
   * Injections
   * Injections
   */
  public static final typekey.MedicalTreatmentType TC_INJECT = new typekey.MedicalTreatmentType("inject");
  
  /**
   * Major surgery
   * Major surgery
   */
  public static final typekey.MedicalTreatmentType TC_MAJOR_SURGERY = new typekey.MedicalTreatmentType("major_surgery");
  
  /**
   * Minor surgery
   * Minor surgery
   */
  public static final typekey.MedicalTreatmentType TC_MINOR_SURGERY = new typekey.MedicalTreatmentType("minor_surgery");
  
  /**
   * MRI
   * MRI
   */
  public static final typekey.MedicalTreatmentType TC_MRI = new typekey.MedicalTreatmentType("mri");
  
  /**
   * Multiple doctors
   * Multiple doctors
   */
  @java.lang.Deprecated
  public static final typekey.MedicalTreatmentType TC_MULT_DOCTORS = new typekey.MedicalTreatmentType("mult_doctors");
  
  /**
   * Multiple treatments
   * Multiple treatments
   */
  public static final typekey.MedicalTreatmentType TC_MULT_TREATMENTS = new typekey.MedicalTreatmentType("mult_treatments");
  
  /**
   * Neurologic
   * Neurologic
   */
  public static final typekey.MedicalTreatmentType TC_NEURO = new typekey.MedicalTreatmentType("neuro");
  
  /**
   * No treatment
   * No treatment
   */
  @java.lang.Deprecated
  public static final typekey.MedicalTreatmentType TC_NONE = new typekey.MedicalTreatmentType("none");
  
  /**
   * Only one doctor
   * Only one doctor
   */
  @java.lang.Deprecated
  public static final typekey.MedicalTreatmentType TC_ONE_DOCTOR = new typekey.MedicalTreatmentType("one_doctor");
  
  /**
   * Orthopedic
   * Orthopedic
   */
  public static final typekey.MedicalTreatmentType TC_ORTHO = new typekey.MedicalTreatmentType("ortho");
  
  /**
   * Other
   * Other
   */
  public static final typekey.MedicalTreatmentType TC_OTH = new typekey.MedicalTreatmentType("oth");
  
  /**
   * Primary care physician
   * Primary care physician
   */
  public static final typekey.MedicalTreatmentType TC_PCP = new typekey.MedicalTreatmentType("pcp");
  
  /**
   * Physical therapy
   * Physical therapy
   */
  public static final typekey.MedicalTreatmentType TC_PT = new typekey.MedicalTreatmentType("pt");
  
  /**
   * Rehab
   * Rehab
   */
  public static final typekey.MedicalTreatmentType TC_REHAB = new typekey.MedicalTreatmentType("rehab");
  
  /**
   * X-ray
   * X-ray
   */
  public static final typekey.MedicalTreatmentType TC_XRAY = new typekey.MedicalTreatmentType("xray");
  
  public static final gw.entity.ITypeFilter<typekey.MedicalTreatmentType> TF_WC = new com.guidewire.commons.entity.type2.TypeFilterImpl<typekey.MedicalTreatmentType>("MedicalTreatmentType", "wc");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.MedicalTreatmentType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.MedicalTreatmentType>("MedicalTreatmentType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private MedicalTreatmentType(java.lang.String code)  {
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
  public typekey.MedicalTreatmentType get() {
    return this;
  }
  
  public static typekey.MedicalTreatmentType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.MedicalTreatmentType> getAllTypeKeys() {
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
  
  public static typekey.MedicalTreatmentType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.MedicalTreatmentType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.MedicalTreatmentType[]{});
  }
  
  public static java.util.List<typekey.MedicalTreatmentType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.MedicalTreatmentType getValue() {
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
    com.guidewire._generated.typekey.MedicalTreatmentTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.MedicalTreatmentType>() {
      public void clearCache(typekey.MedicalTreatmentType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.MedicalTreatmentType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.MedicalTreatmentType newInstance(java.lang.String code) {
        return new typekey.MedicalTreatmentType(code);
      }
      
      
    });
  }
}