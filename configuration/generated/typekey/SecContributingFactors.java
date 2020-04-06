package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SecContributingFactors.tti;SecContributingFactors.tix;SecContributingFactors.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class SecContributingFactors implements gw.entity.TypeKey {
  /**
   * Days on duty
   * Days on duty
   */
  public static final typekey.SecContributingFactors TC_DAYSONDUTY = new typekey.SecContributingFactors("DaysOnDuty");
  
  /**
   * Discovery
   * Discovery
   */
  public static final typekey.SecContributingFactors TC_DISCOVERY = new typekey.SecContributingFactors("Discovery");
  
  /**
   * Food
   * Food
   */
  public static final typekey.SecContributingFactors TC_FOOD = new typekey.SecContributingFactors("Food");
  
  /**
   * Hours on duty
   * Hours on duty
   */
  public static final typekey.SecContributingFactors TC_HOURSONDUTY = new typekey.SecContributingFactors("HoursOnDuty");
  
  /**
   * Housekeeping
   * Housekeeping
   */
  public static final typekey.SecContributingFactors TC_HOUSEKEEPING = new typekey.SecContributingFactors("Housekeeping");
  
  /**
   * Highway type
   * Highway type
   */
  public static final typekey.SecContributingFactors TC_HWYTYPE = new typekey.SecContributingFactors("HwyType");
  
  /**
   * Instructions
   * Instructions
   */
  public static final typekey.SecContributingFactors TC_INSTRUCTIONS = new typekey.SecContributingFactors("Instructions");
  
  /**
   * Legal obligations
   * Legal obligations
   */
  public static final typekey.SecContributingFactors TC_LEGALOBLIG = new typekey.SecContributingFactors("LegalOblig");
  
  /**
   * Light conditions
   * Light conditions
   */
  public static final typekey.SecContributingFactors TC_LIGHTCOND = new typekey.SecContributingFactors("LightCond");
  
  /**
   * Marketing/sales
   * Marketing/sales
   */
  public static final typekey.SecContributingFactors TC_MARKETINGSALES = new typekey.SecContributingFactors("MarketingSales");
  
  /**
   * MPH over limit
   * MPH over limit
   */
  public static final typekey.SecContributingFactors TC_MILESPH = new typekey.SecContributingFactors("Milesph");
  
  /**
   * Non-food
   * Non-food
   */
  public static final typekey.SecContributingFactors TC_NONFOOD = new typekey.SecContributingFactors("NonFood");
  
  /**
   * Not applicable
   * Not applicable
   */
  public static final typekey.SecContributingFactors TC_NOTAPPLIC = new typekey.SecContributingFactors("NotApplic");
  
  /**
   * Object Substance
   * Object Substance
   */
  public static final typekey.SecContributingFactors TC_OBJECTSUB = new typekey.SecContributingFactors("ObjectSub");
  
  /**
   * Physical features
   * Physical features
   */
  public static final typekey.SecContributingFactors TC_PHYSFEATURES = new typekey.SecContributingFactors("PhysFeatures");
  
  /**
   * Protection factors
   * Protection factors
   */
  public static final typekey.SecContributingFactors TC_PROTECTFACT = new typekey.SecContributingFactors("ProtectFact");
  
  /**
   * Road surface condition
   * Road surface condition
   */
  public static final typekey.SecContributingFactors TC_ROADSURFACE = new typekey.SecContributingFactors("RoadSurface");
  
  /**
   * Storage
   * Storage
   */
  public static final typekey.SecContributingFactors TC_STORAGE = new typekey.SecContributingFactors("Storage");
  
  /**
   * Surface area
   * Surface area
   */
  public static final typekey.SecContributingFactors TC_SURFACEAREA = new typekey.SecContributingFactors("SurfaceArea");
  
  /**
   * Use/application
   * Use/application
   */
  public static final typekey.SecContributingFactors TC_USEAPP = new typekey.SecContributingFactors("UseApp");
  
  /**
   * Visibility
   * Visibility
   */
  public static final typekey.SecContributingFactors TC_VISIBILITY = new typekey.SecContributingFactors("Visibility");
  
  /**
   * Warnings
   * Warnings
   */
  public static final typekey.SecContributingFactors TC_WARNINGS = new typekey.SecContributingFactors("Warnings");
  
  /**
   * Weather conditions
   * Weather conditions
   */
  public static final typekey.SecContributingFactors TC_WEATHER = new typekey.SecContributingFactors("Weather");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.SecContributingFactors> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.SecContributingFactors>("SecContributingFactors");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private SecContributingFactors(java.lang.String code)  {
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
  public typekey.SecContributingFactors get() {
    return this;
  }
  
  public static typekey.SecContributingFactors get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.SecContributingFactors> getAllTypeKeys() {
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
  
  public static typekey.SecContributingFactors getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.SecContributingFactors[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.SecContributingFactors[]{});
  }
  
  public static java.util.List<typekey.SecContributingFactors> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.SecContributingFactors getValue() {
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
    com.guidewire._generated.typekey.SecContributingFactorsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.SecContributingFactors>() {
      public void clearCache(typekey.SecContributingFactors typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.SecContributingFactors typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.SecContributingFactors newInstance(java.lang.String code) {
        return new typekey.SecContributingFactors(code);
      }
      
      
    });
  }
}