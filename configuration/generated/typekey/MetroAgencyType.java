package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MetroAgencyType.tti;MetroAgencyType.tix;MetroAgencyType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class MetroAgencyType implements gw.entity.TypeKey {
  /**
   * Bureau of Vital Stats
   * Bureau of Vital Stats
   */
  public static final typekey.MetroAgencyType TC_BVS = new typekey.MetroAgencyType("BVS");
  
  /**
   * Coroner
   * Coroner
   */
  public static final typekey.MetroAgencyType TC_CORON = new typekey.MetroAgencyType("CORON");
  
  /**
   * County Fire
   * County Fire Department
   */
  public static final typekey.MetroAgencyType TC_CO_FD = new typekey.MetroAgencyType("CO_FD");
  
  /**
   * County Police
   * County Police
   */
  public static final typekey.MetroAgencyType TC_CO_PD = new typekey.MetroAgencyType("CO_PD");
  
  /**
   * County Sheriff
   * County Sheriff
   */
  public static final typekey.MetroAgencyType TC_CO_SO = new typekey.MetroAgencyType("CO_SO");
  
  /**
   * Dept of Motor Veh.
   * Dept of Motor Veh.
   */
  public static final typekey.MetroAgencyType TC_DMV = new typekey.MetroAgencyType("DMV");
  
  /**
   * Dept of Public Safety
   * Dept of Public Safety
   */
  public static final typekey.MetroAgencyType TC_DPS = new typekey.MetroAgencyType("DPS");
  
  /**
   * Emergency Med Serv
   * Emergency Med Serv
   */
  public static final typekey.MetroAgencyType TC_EMS = new typekey.MetroAgencyType("EMS");
  
  /**
   * Fire Dept
   * Fire Department
   */
  public static final typekey.MetroAgencyType TC_FD = new typekey.MetroAgencyType("FD");
  
  /**
   * Highway Patrol/State Police
   * Highway Patrol/State Police
   */
  public static final typekey.MetroAgencyType TC_HP = new typekey.MetroAgencyType("HP");
  
  /**
   * Military Police
   * Military Police
   */
  public static final typekey.MetroAgencyType TC_MP = new typekey.MetroAgencyType("MP");
  
  /**
   * Police Department
   * Police Department
   */
  public static final typekey.MetroAgencyType TC_PD = new typekey.MetroAgencyType("PD");
  
  /**
   * Private Security
   * Private Security
   */
  public static final typekey.MetroAgencyType TC_SEC = new typekey.MetroAgencyType("SEC");
  
  /**
   * Township Fire Dept
   * Township Fire Department
   */
  public static final typekey.MetroAgencyType TC_TWP_FD = new typekey.MetroAgencyType("TWP_FD");
  
  /**
   * Township Police
   * Township Police
   */
  public static final typekey.MetroAgencyType TC_TWP_PD = new typekey.MetroAgencyType("TWP_PD");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.MetroAgencyType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.MetroAgencyType>("MetroAgencyType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private MetroAgencyType(java.lang.String code)  {
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
  public typekey.MetroAgencyType get() {
    return this;
  }
  
  public static typekey.MetroAgencyType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.MetroAgencyType> getAllTypeKeys() {
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
  
  public static typekey.MetroAgencyType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.MetroAgencyType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.MetroAgencyType[]{});
  }
  
  public static java.util.List<typekey.MetroAgencyType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.MetroAgencyType getValue() {
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
    com.guidewire._generated.typekey.MetroAgencyTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.MetroAgencyType>() {
      public void clearCache(typekey.MetroAgencyType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.MetroAgencyType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.MetroAgencyType newInstance(java.lang.String code) {
        return new typekey.MetroAgencyType(code);
      }
      
      
    });
  }
}