package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimSegment.tti;ClaimSegment.tix;ClaimSegment.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class ClaimSegment implements gw.entity.TypeKey {
  /**
   * Auto - glass
   * Auto - glass
   */
  public static final typekey.ClaimSegment TC_AUTO_GLASS = new typekey.ClaimSegment("auto_glass");
  
  /**
   * Auto - high complexity
   * Auto - high complexity
   */
  public static final typekey.ClaimSegment TC_AUTO_HIGH = new typekey.ClaimSegment("auto_high");
  
  /**
   * Auto - low complexity
   * Auto - low complexity
   */
  public static final typekey.ClaimSegment TC_AUTO_LOW = new typekey.ClaimSegment("auto_low");
  
  /**
   * Auto - mid complexity
   * Auto - mid complexity
   */
  public static final typekey.ClaimSegment TC_AUTO_MID = new typekey.ClaimSegment("auto_mid");
  
  /**
   * Contents - high complexity
   * Contents - high complexity
   */
  public static final typekey.ClaimSegment TC_CONTENTS_HIGH = new typekey.ClaimSegment("contents_high");
  
  /**
   * Contents - low complexity
   * Contents - low complexity
   */
  public static final typekey.ClaimSegment TC_CONTENTS_LOW = new typekey.ClaimSegment("contents_low");
  
  /**
   * Injury - high complexity
   * Injury - high complexity
   */
  public static final typekey.ClaimSegment TC_INJURY_HIGH = new typekey.ClaimSegment("injury_high");
  
  /**
   * Injury - low complexity
   * Injury - low complexity
   */
  public static final typekey.ClaimSegment TC_INJURY_LOW = new typekey.ClaimSegment("injury_low");
  
  /**
   * Injury - mid complexity
   * Injury - mid complexity
   */
  public static final typekey.ClaimSegment TC_INJURY_MID = new typekey.ClaimSegment("injury_mid");
  
  /**
   * Liability - high complexity
   * Liability - high complexity
   */
  public static final typekey.ClaimSegment TC_LIAB_HIGH = new typekey.ClaimSegment("liab_high");
  
  /**
   * Liability - low complexity
   * Liability - low complexity
   */
  public static final typekey.ClaimSegment TC_LIAB_LOW = new typekey.ClaimSegment("liab_low");
  
  /**
   * Liability - mid complexity
   * Liability - mid complexity
   */
  public static final typekey.ClaimSegment TC_LIAB_MID = new typekey.ClaimSegment("liab_mid");
  
  /**
   * Property - high complexity
   * Property - high complexity
   */
  public static final typekey.ClaimSegment TC_PROP_HIGH = new typekey.ClaimSegment("prop_high");
  
  /**
   * Property - low complexity
   * Property - low complexity
   */
  public static final typekey.ClaimSegment TC_PROP_LOW = new typekey.ClaimSegment("prop_low");
  
  /**
   * Property - mid complexity
   * Property - mid complexity
   */
  public static final typekey.ClaimSegment TC_PROP_MID = new typekey.ClaimSegment("prop_mid");
  
  /**
   * Travel - high complexity
   * Travel - high complexity
   */
  public static final typekey.ClaimSegment TC_TRAVEL_HIGH = new typekey.ClaimSegment("travel_high");
  
  /**
   * Travel - low complexity
   * Travel - low complexity
   */
  public static final typekey.ClaimSegment TC_TRAVEL_LOW = new typekey.ClaimSegment("travel_low");
  
  /**
   * Travel - mid complexity
   * Travel - mid complexity
   */
  public static final typekey.ClaimSegment TC_TRAVEL_MID = new typekey.ClaimSegment("travel_mid");
  
  /**
   * Unknown
   * Unknown segment, or segment not automatically set by rules
   */
  public static final typekey.ClaimSegment TC_UNKNOWN = new typekey.ClaimSegment("unknown");
  
  /**
   * Workers' Comp - employer's liability
   * Workers' Comp - employer's liability
   */
  public static final typekey.ClaimSegment TC_WC_LIABILITY = new typekey.ClaimSegment("wc_liability");
  
  /**
   * Workers' Comp - indemnity
   * Workers' Comp - indemnity
   */
  public static final typekey.ClaimSegment TC_WC_LOST_TIME = new typekey.ClaimSegment("wc_lost_time");
  
  /**
   * Workers' Comp - med only
   * Workers' Comp - med only
   */
  public static final typekey.ClaimSegment TC_WC_MED_ONLY = new typekey.ClaimSegment("wc_med_only");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.ClaimSegment> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.ClaimSegment>("ClaimSegment");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private ClaimSegment(java.lang.String code)  {
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
  public typekey.ClaimSegment get() {
    return this;
  }
  
  public static typekey.ClaimSegment get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.ClaimSegment> getAllTypeKeys() {
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
  
  public static typekey.ClaimSegment getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.ClaimSegment[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.ClaimSegment[]{});
  }
  
  public static java.util.List<typekey.ClaimSegment> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.ClaimSegment getValue() {
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
    com.guidewire._generated.typekey.ClaimSegmentInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.ClaimSegment>() {
      public void clearCache(typekey.ClaimSegment typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.ClaimSegment typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.ClaimSegment newInstance(java.lang.String code) {
        return new typekey.ClaimSegment(code);
      }
      
      
    });
  }
}