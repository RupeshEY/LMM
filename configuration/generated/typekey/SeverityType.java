package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SeverityType.tti;SeverityType.tix;SeverityType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class SeverityType implements gw.entity.TypeKey {
  /**
   * Contract medical
   * Contract medical
   */
  public static final typekey.SeverityType TC_CONTRACT_MEDICAL = new typekey.SeverityType("contract-medical");
  
  /**
   * Death
   * Fatal
   */
  public static final typekey.SeverityType TC_FATAL = new typekey.SeverityType("fatal");
  
  /**
   * Major (not drivable)
   * Major (not drivable)
   */
  public static final typekey.SeverityType TC_MAJOR_AUTO = new typekey.SeverityType("major-auto");
  
  /**
   * Major
   * Major
   */
  public static final typekey.SeverityType TC_MAJOR_GEN = new typekey.SeverityType("major-gen");
  
  /**
   * Major (hospitalization)
   * Major (hospitalization)
   */
  public static final typekey.SeverityType TC_MAJOR_INJURY = new typekey.SeverityType("major-injury");
  
  /**
   * Major (not usable)
   * Major (not usable)
   */
  public static final typekey.SeverityType TC_MAJOR_PROP = new typekey.SeverityType("major-prop");
  
  /**
   * Became medical only
   * Became medical only
   */
  public static final typekey.SeverityType TC_MEDICAL_ONLY = new typekey.SeverityType("medical_only");
  
  /**
   * Minor
   * Minor
   */
  public static final typekey.SeverityType TC_MINOR = new typekey.SeverityType("minor");
  
  /**
   * Moderate (drivable)
   * Moderate (drivable)
   */
  public static final typekey.SeverityType TC_MODERATE_AUTO = new typekey.SeverityType("moderate-auto");
  
  /**
   * Moderate
   * Moderate
   */
  public static final typekey.SeverityType TC_MODERATE_GEN = new typekey.SeverityType("moderate-gen");
  
  /**
   * Moderate (usable)
   * Moderate (usable)
   */
  public static final typekey.SeverityType TC_MODERATE_PROP = new typekey.SeverityType("moderate-prop");
  
  /**
   * Permanent disability
   * Permanent disability
   */
  public static final typekey.SeverityType TC_PD = new typekey.SeverityType("pd");
  
  /**
   * Permanent total
   * Permanent total
   */
  public static final typekey.SeverityType TC_PERM_TOTAL = new typekey.SeverityType("perm-total");
  
  /**
   * Possible total loss
   * Possible total loss
   */
  public static final typekey.SeverityType TC_SEVERE_AUTO = new typekey.SeverityType("severe-auto");
  
  /**
   * Severe
   * Severe
   */
  public static final typekey.SeverityType TC_SEVERE_GEN = new typekey.SeverityType("severe-gen");
  
  /**
   * Life-threatening
   * Life-threatening
   */
  public static final typekey.SeverityType TC_SEVERE_INJURY = new typekey.SeverityType("severe-injury");
  
  /**
   * Temporary disability
   * Temporary disability
   */
  public static final typekey.SeverityType TC_TD = new typekey.SeverityType("td");
  
  /**
   * Temporary
   * Temporary
   */
  public static final typekey.SeverityType TC_TEMPORARY = new typekey.SeverityType("temporary");
  
  /**
   * Employer liability
   * Employer liability
   */
  public static final typekey.SeverityType TC_WC_ELL = new typekey.SeverityType("wc-ell");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.SeverityType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.SeverityType>("SeverityType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private SeverityType(java.lang.String code)  {
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
  public typekey.SeverityType get() {
    return this;
  }
  
  public static typekey.SeverityType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.SeverityType> getAllTypeKeys() {
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
  
  public static typekey.SeverityType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.SeverityType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.SeverityType[]{});
  }
  
  public static java.util.List<typekey.SeverityType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.SeverityType getValue() {
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
    com.guidewire._generated.typekey.SeverityTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.SeverityType>() {
      public void clearCache(typekey.SeverityType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.SeverityType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.SeverityType newInstance(java.lang.String code) {
        return new typekey.SeverityType(code);
      }
      
      
    });
  }
}