package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InfoSource.tti;InfoSource.tix;InfoSource.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class InfoSource implements gw.entity.TypeKey {
  /**
   * Call from attorney
   * Call from attorney
   */
  public static final typekey.InfoSource TC_CALLFROMATTORNEY = new typekey.InfoSource("CallFromAttorney");
  
  /**
   * Call from case worker
   * Call from case worker
   */
  public static final typekey.InfoSource TC_CALLFROMCASEWRKR = new typekey.InfoSource("CallFromCaseWrkr");
  
  /**
   * Call from claimant
   * Call from claimant
   */
  public static final typekey.InfoSource TC_CALLFROMCLAIMANT = new typekey.InfoSource("CallFromClaimant");
  
  /**
   * Call from doctor
   * Call from doctor
   */
  public static final typekey.InfoSource TC_CALLFROMDOCTOR = new typekey.InfoSource("CallFromDoctor");
  
  /**
   * Call from employer
   * Call from Employer
   */
  public static final typekey.InfoSource TC_CALLFROMEMPLOYER = new typekey.InfoSource("CallFromEmployer");
  
  /**
   * Call from parent or guardian
   * Call from parent or guardian
   */
  public static final typekey.InfoSource TC_CALLFROMGUARDIAN = new typekey.InfoSource("CallFromGuardian");
  
  /**
   * Call from hospital
   * Call from hospital
   */
  public static final typekey.InfoSource TC_CALLFROMHOSPITAL = new typekey.InfoSource("CallFromHospital");
  
  /**
   * Call from occupational therapist
   * Call from occupational Therapist
   */
  public static final typekey.InfoSource TC_CALLFROMOCCTHERAPIST = new typekey.InfoSource("CallFromOccTherapist");
  
  /**
   * Call from physical therapist
   * Call from physical therapist
   */
  public static final typekey.InfoSource TC_CALLFROMPHYSTHERAPIST = new typekey.InfoSource("CallFromPhysTherapist");
  
  /**
   * Call to attorney
   * Call to attorney
   */
  public static final typekey.InfoSource TC_CALLTOATTORNEY = new typekey.InfoSource("CallToAttorney");
  
  /**
   * Call to case worker
   * Call to case worker
   */
  public static final typekey.InfoSource TC_CALLTOCASEWRKR = new typekey.InfoSource("CallToCaseWrkr");
  
  /**
   * Call to claimant
   * Call to claimant
   */
  public static final typekey.InfoSource TC_CALLTOCLAIMANT = new typekey.InfoSource("CallToClaimant");
  
  /**
   * Call to doctor
   * Call to doctor
   */
  public static final typekey.InfoSource TC_CALLTODOCTOR = new typekey.InfoSource("CallToDoctor");
  
  /**
   * Call to employer
   * Call to employer
   */
  public static final typekey.InfoSource TC_CALLTOEMPLOYER = new typekey.InfoSource("CallToEmployer");
  
  /**
   * Call to parent or guardian
   * Call to parent or guardian
   */
  public static final typekey.InfoSource TC_CALLTOGUARDIAN = new typekey.InfoSource("CallToGuardian");
  
  /**
   * Call to hospital
   * Call to hospital
   */
  public static final typekey.InfoSource TC_CALLTOHOSPITAL = new typekey.InfoSource("CallToHospital");
  
  /**
   * Call to occupational therapist
   * Call to occupational therapist
   */
  public static final typekey.InfoSource TC_CALLTOOCCTHERAPIST = new typekey.InfoSource("CallToOccTherapist");
  
  /**
   * Call to physical therapist
   * Call to physical therapist
   */
  public static final typekey.InfoSource TC_CALLTOPHYSTHERAPIST = new typekey.InfoSource("CallToPhysTherapist");
  
  /**
   * Hospital report
   * Hospital report
   */
  public static final typekey.InfoSource TC_HOSPITALREPORT = new typekey.InfoSource("HospitalReport");
  
  /**
   * Medical certificate
   * Medical certificate
   */
  public static final typekey.InfoSource TC_MEDCERTIFICATE = new typekey.InfoSource("MedCertificate");
  
  /**
   * Medical report
   * Medical report
   */
  public static final typekey.InfoSource TC_MEDREPORT = new typekey.InfoSource("MedReport");
  
  /**
   * Other
   * Contact with party not listed
   */
  public static final typekey.InfoSource TC_OTHER = new typekey.InfoSource("Other");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.InfoSource> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.InfoSource>("InfoSource");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private InfoSource(java.lang.String code)  {
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
  public typekey.InfoSource get() {
    return this;
  }
  
  public static typekey.InfoSource get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.InfoSource> getAllTypeKeys() {
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
  
  public static typekey.InfoSource getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.InfoSource[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.InfoSource[]{});
  }
  
  public static java.util.List<typekey.InfoSource> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.InfoSource getValue() {
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
    com.guidewire._generated.typekey.InfoSourceInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.InfoSource>() {
      public void clearCache(typekey.InfoSource typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.InfoSource typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.InfoSource newInstance(java.lang.String code) {
        return new typekey.InfoSource(code);
      }
      
      
    });
  }
}