package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "VehicleStyle.tti;VehicleStyle.tix;VehicleStyle.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class VehicleStyle implements gw.entity.TypeKey {
  /**
   * ATV
   * ATV
   */
  public static final typekey.VehicleStyle TC_ATV = new typekey.VehicleStyle("ATV");
  
  /**
   * Boat
   * Boat
   */
  public static final typekey.VehicleStyle TC_BOAT = new typekey.VehicleStyle("boat");
  
  /**
   * Bus
   * Bus
   */
  public static final typekey.VehicleStyle TC_BUS = new typekey.VehicleStyle("bus");
  
  /**
   * Car transporter
   * Car transporter
   */
  public static final typekey.VehicleStyle TC_CAR_TRANSPORTER = new typekey.VehicleStyle("car_transporter");
  
  /**
   * Cement mixer
   * Cement mixer
   */
  public static final typekey.VehicleStyle TC_CEMENT_MIXER = new typekey.VehicleStyle("cement_mixer");
  
  /**
   * Construction vehicle
   * Construction vehicle
   */
  public static final typekey.VehicleStyle TC_CONSTRUCTION_VEHICLE = new typekey.VehicleStyle("construction_vehicle");
  
  /**
   * Crane
   * Crane
   */
  public static final typekey.VehicleStyle TC_CRANE = new typekey.VehicleStyle("crane");
  
  /**
   * Dump truck
   * Dump truck
   */
  public static final typekey.VehicleStyle TC_DUMP_TRUCK = new typekey.VehicleStyle("dump_truck");
  
  /**
   * Garbage truck
   * Garbage truck
   */
  public static final typekey.VehicleStyle TC_GARBAGE_TRUCK = new typekey.VehicleStyle("garbage_truck");
  
  /**
   * Mobile home
   * Mobile home
   */
  public static final typekey.VehicleStyle TC_MOBILE_HOME = new typekey.VehicleStyle("mobile_home");
  
  /**
   * Motorcycle
   * Motorcycle
   */
  public static final typekey.VehicleStyle TC_MOTORCYCLE = new typekey.VehicleStyle("motorcycle");
  
  /**
   * Other
   * Other
   */
  public static final typekey.VehicleStyle TC_OTHER = new typekey.VehicleStyle("other");
  
  /**
   * Passenger car
   * Passenger car
   */
  public static final typekey.VehicleStyle TC_PASSENGERCAR = new typekey.VehicleStyle("passengercar");
  
  /**
   * Pickup
   * Pickup
   */
  public static final typekey.VehicleStyle TC_PICK_UP = new typekey.VehicleStyle("pick_up");
  
  /**
   * RV
   * RV
   */
  public static final typekey.VehicleStyle TC_RV = new typekey.VehicleStyle("rv");
  
  /**
   * Snowmobile
   * Snowmobile
   */
  public static final typekey.VehicleStyle TC_SNOWMOBILE = new typekey.VehicleStyle("snowmobile");
  
  /**
   * Straight truck
   * Straight truck
   */
  public static final typekey.VehicleStyle TC_STRAIGHT_TRUCK = new typekey.VehicleStyle("straight_truck");
  
  /**
   * Tractor only
   * Tractor only
   */
  public static final typekey.VehicleStyle TC_TRACTOR_ONLY = new typekey.VehicleStyle("tractor_only");
  
  /**
   * Tractor trailer
   * Tractor trailer
   */
  public static final typekey.VehicleStyle TC_TRACTOR_TRAILER = new typekey.VehicleStyle("tractor_trailer");
  
  /**
   * Trailer
   * Trailer
   */
  public static final typekey.VehicleStyle TC_TRAILER = new typekey.VehicleStyle("trailer");
  
  /**
   * Van
   * Van
   */
  public static final typekey.VehicleStyle TC_VAN = new typekey.VehicleStyle("van");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.VehicleStyle> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.VehicleStyle>("VehicleStyle");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private VehicleStyle(java.lang.String code)  {
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
  public typekey.VehicleStyle get() {
    return this;
  }
  
  public static typekey.VehicleStyle get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.VehicleStyle> getAllTypeKeys() {
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
  
  public static typekey.VehicleStyle getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.VehicleStyle[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.VehicleStyle[]{});
  }
  
  public static java.util.List<typekey.VehicleStyle> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.VehicleStyle getValue() {
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
    com.guidewire._generated.typekey.VehicleStyleInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.VehicleStyle>() {
      public void clearCache(typekey.VehicleStyle typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.VehicleStyle typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.VehicleStyle newInstance(java.lang.String code) {
        return new typekey.VehicleStyle(code);
      }
      
      
    });
  }
}