package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SpecialtyType.tti;SpecialtyType.tix;SpecialtyType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class SpecialtyType implements gw.entity.TypeKey {
  /**
   * Allergy
   * Allergy
   */
  public static final typekey.SpecialtyType TC_ALLERGY = new typekey.SpecialtyType("allergy");
  
  /**
   * Anesthesiology
   * Anesthesiology
   */
  public static final typekey.SpecialtyType TC_ANESTHESIOLOGY = new typekey.SpecialtyType("anesthesiology");
  
  /**
   * Cardiology
   * Cardiology
   */
  public static final typekey.SpecialtyType TC_CARDIOLOGY = new typekey.SpecialtyType("cardiology");
  
  /**
   * Chiropractic
   * Chiropractic
   */
  public static final typekey.SpecialtyType TC_CHIROPRACTIC = new typekey.SpecialtyType("chiropractic");
  
  /**
   * Dental
   * Dental
   */
  public static final typekey.SpecialtyType TC_DENTAL = new typekey.SpecialtyType("dental");
  
  /**
   * Dermatology
   * Dermatology
   */
  public static final typekey.SpecialtyType TC_DERMATOLOGY = new typekey.SpecialtyType("dermatology");
  
  /**
   * Emergency Medicine
   * Emergency Medicine
   */
  public static final typekey.SpecialtyType TC_EMERGENCYMED = new typekey.SpecialtyType("emergencymed");
  
  /**
   * Endocrinology
   * Endocrinology
   */
  public static final typekey.SpecialtyType TC_ENDOCRINOLOGY = new typekey.SpecialtyType("endocrinology");
  
  /**
   * ENT
   * ENT
   */
  public static final typekey.SpecialtyType TC_ENT = new typekey.SpecialtyType("ent");
  
  /**
   * Family Practice
   * Family Practice
   */
  public static final typekey.SpecialtyType TC_FAMILYPRACTICE = new typekey.SpecialtyType("familypractice");
  
  /**
   * Gastroenterology
   * Gastroenterology
   */
  public static final typekey.SpecialtyType TC_GASTROENTEROLOGY = new typekey.SpecialtyType("gastroenterology");
  
  /**
   * Hematalogy/Oncology
   * Hematalogy/Oncology
   */
  public static final typekey.SpecialtyType TC_HEMATOLOGYONC = new typekey.SpecialtyType("hematologyonc");
  
  /**
   * Hospitalist
   * Hospitalist
   */
  public static final typekey.SpecialtyType TC_HOSPITALIST = new typekey.SpecialtyType("hospitalist");
  
  /**
   * Infectious Disease
   * Infectious Disease
   */
  public static final typekey.SpecialtyType TC_INFECTIOUSDIS = new typekey.SpecialtyType("infectiousdis");
  
  /**
   * Internal Medicine
   * Internal Medicine
   */
  public static final typekey.SpecialtyType TC_INTERNALMED = new typekey.SpecialtyType("internalmed");
  
  /**
   * Med/Peds
   * Med/Peds
   */
  public static final typekey.SpecialtyType TC_MEDPEDS = new typekey.SpecialtyType("medpeds");
  
  /**
   * Nephrology
   * Nephrology
   */
  public static final typekey.SpecialtyType TC_NEPHROLOGY = new typekey.SpecialtyType("nephrology");
  
  /**
   * Neurology
   * Neurology
   */
  public static final typekey.SpecialtyType TC_NEUROLOGY = new typekey.SpecialtyType("neurology");
  
  /**
   * Obstetrics/Gynecology
   * Obstetrics/Gynecology
   */
  public static final typekey.SpecialtyType TC_OBGYN = new typekey.SpecialtyType("obgyn");
  
  /**
   * Occupational Medicine
   * Occupational Medicine
   */
  public static final typekey.SpecialtyType TC_OCCUPATIONALMED = new typekey.SpecialtyType("occupationalmed");
  
  /**
   * Opthalmology
   * Opthalmology
   */
  public static final typekey.SpecialtyType TC_OPTHALMOLOGY = new typekey.SpecialtyType("opthalmology");
  
  /**
   * Orthopedics
   * Orthopedics
   */
  public static final typekey.SpecialtyType TC_ORTHOPEDICS = new typekey.SpecialtyType("orthopedics");
  
  /**
   * Pathology
   * Pathology
   */
  public static final typekey.SpecialtyType TC_PATHOLOGY = new typekey.SpecialtyType("pathology");
  
  /**
   * Physical Medicine/Rehabilitation
   * Physical Medicine/Rehabilitation
   */
  public static final typekey.SpecialtyType TC_PHYSMEDREHAB = new typekey.SpecialtyType("physmedrehab");
  
  /**
   * Plastic Surgery
   * Plastic Surgery
   */
  public static final typekey.SpecialtyType TC_PLASTICSURGERY = new typekey.SpecialtyType("plasticsurgery");
  
  /**
   * Psychiatry
   * Psychiatry
   */
  public static final typekey.SpecialtyType TC_PSYCHIATRY = new typekey.SpecialtyType("psychiatry");
  
  /**
   * Pulmonary/Critical Care
   * Pulmonary/Critical Care
   */
  public static final typekey.SpecialtyType TC_PULMCRITCARE = new typekey.SpecialtyType("pulmcritcare");
  
  /**
   * Surgery
   * Surgery
   */
  public static final typekey.SpecialtyType TC_SURGERY = new typekey.SpecialtyType("surgery");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.SpecialtyType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.SpecialtyType>("SpecialtyType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private SpecialtyType(java.lang.String code)  {
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
  public typekey.SpecialtyType get() {
    return this;
  }
  
  public static typekey.SpecialtyType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.SpecialtyType> getAllTypeKeys() {
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
  
  public static typekey.SpecialtyType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.SpecialtyType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.SpecialtyType[]{});
  }
  
  public static java.util.List<typekey.SpecialtyType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.SpecialtyType getValue() {
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
    com.guidewire._generated.typekey.SpecialtyTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.SpecialtyType>() {
      public void clearCache(typekey.SpecialtyType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.SpecialtyType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.SpecialtyType newInstance(java.lang.String code) {
        return new typekey.SpecialtyType(code);
      }
      
      
    });
  }
}