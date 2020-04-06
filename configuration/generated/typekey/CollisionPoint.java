package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CollisionPoint.tti;CollisionPoint.tix;CollisionPoint.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class CollisionPoint implements gw.entity.TypeKey {
  /**
   * Right fender - side & wheel area
   * Right fender - side & wheel area
   */
  public static final typekey.CollisionPoint TC_01 = new typekey.CollisionPoint("01");
  
  /**
   * Right fender - front (headlamp area)
   * Right fender - front (headlamp area)
   */
  public static final typekey.CollisionPoint TC_02 = new typekey.CollisionPoint("02");
  
  /**
   * Front bumper, grille, hood & radiator
   * Front bumper, grille, hood & radiator
   */
  public static final typekey.CollisionPoint TC_03 = new typekey.CollisionPoint("03");
  
  /**
   * Left fender - front (headlamp area)
   * Left fender - front (headlamp area)
   */
  public static final typekey.CollisionPoint TC_04 = new typekey.CollisionPoint("04");
  
  /**
   * Left fender - side & wheel area
   * Left fender - side & wheel area
   */
  public static final typekey.CollisionPoint TC_05 = new typekey.CollisionPoint("05");
  
  /**
   * Left front door
   * Left front door
   */
  public static final typekey.CollisionPoint TC_06 = new typekey.CollisionPoint("06");
  
  /**
   * Left rear door
   * Left rear door
   */
  public static final typekey.CollisionPoint TC_07 = new typekey.CollisionPoint("07");
  
  /**
   * Left quarter panel
   * Left Quarter panel
   */
  public static final typekey.CollisionPoint TC_08 = new typekey.CollisionPoint("08");
  
  /**
   * Rear bumper, rear body panel, trunk lid/ liftgate
   * Rear bumper, rear body panel, trunk lid/liftgate
   */
  public static final typekey.CollisionPoint TC_09 = new typekey.CollisionPoint("09");
  
  /**
   * Right quarter panel
   * Right quarter panel
   */
  public static final typekey.CollisionPoint TC_10 = new typekey.CollisionPoint("10");
  
  /**
   * Right rear door
   * Right rear door
   */
  public static final typekey.CollisionPoint TC_11 = new typekey.CollisionPoint("11");
  
  /**
   * Right front door
   * Right front door
   */
  public static final typekey.CollisionPoint TC_12 = new typekey.CollisionPoint("12");
  
  /**
   * Roof panel
   * Roof panel
   */
  public static final typekey.CollisionPoint TC_13 = new typekey.CollisionPoint("13");
  
  /**
   * Point of impact unknown (collision loss)
   * Point of impact unknown (collision loss)
   */
  public static final typekey.CollisionPoint TC_14 = new typekey.CollisionPoint("14");
  
  /**
   * Total loss
   * Total loss
   */
  public static final typekey.CollisionPoint TC_15 = new typekey.CollisionPoint("15");
  
  /**
   * Non-collision (comprehensive loss)
   * Non-collision (comprehensive loss)
   */
  public static final typekey.CollisionPoint TC_16 = new typekey.CollisionPoint("16");
  
  /**
   * Undercarriage
   * Undercarriage
   */
  public static final typekey.CollisionPoint TC_17 = new typekey.CollisionPoint("17");
  
  /**
   * Front
   * Front
   */
  @java.lang.Deprecated
  public static final typekey.CollisionPoint TC_FRONT = new typekey.CollisionPoint("front");
  
  /**
   * Left front
   * Left front
   */
  @java.lang.Deprecated
  public static final typekey.CollisionPoint TC_LEFTFRONT = new typekey.CollisionPoint("leftfront");
  
  /**
   * Left rear
   * Left rear
   */
  @java.lang.Deprecated
  public static final typekey.CollisionPoint TC_LEFTREAR = new typekey.CollisionPoint("leftrear");
  
  /**
   * Left side
   * Left side
   */
  @java.lang.Deprecated
  public static final typekey.CollisionPoint TC_LEFTSIDE = new typekey.CollisionPoint("leftside");
  
  /**
   * Rear
   * Rear
   */
  @java.lang.Deprecated
  public static final typekey.CollisionPoint TC_REAR = new typekey.CollisionPoint("rear");
  
  /**
   * Right front
   * Right front
   */
  @java.lang.Deprecated
  public static final typekey.CollisionPoint TC_RIGHTFRONT = new typekey.CollisionPoint("rightfront");
  
  /**
   * Right rear
   * Right rear
   */
  @java.lang.Deprecated
  public static final typekey.CollisionPoint TC_RIGHTREAR = new typekey.CollisionPoint("rightrear");
  
  /**
   * Right side
   * Right side
   */
  @java.lang.Deprecated
  public static final typekey.CollisionPoint TC_RIGHTSIDE = new typekey.CollisionPoint("rightside");
  
  /**
   * Top / roof
   * Top / roof
   */
  @java.lang.Deprecated
  public static final typekey.CollisionPoint TC_TOP = new typekey.CollisionPoint("top");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.CollisionPoint> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.CollisionPoint>("CollisionPoint");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private CollisionPoint(java.lang.String code)  {
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
  public typekey.CollisionPoint get() {
    return this;
  }
  
  public static typekey.CollisionPoint get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.CollisionPoint> getAllTypeKeys() {
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
  
  public static typekey.CollisionPoint getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.CollisionPoint[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.CollisionPoint[]{});
  }
  
  public static java.util.List<typekey.CollisionPoint> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.CollisionPoint getValue() {
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
    com.guidewire._generated.typekey.CollisionPointInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.CollisionPoint>() {
      public void clearCache(typekey.CollisionPoint typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.CollisionPoint typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.CollisionPoint newInstance(java.lang.String code) {
        return new typekey.CollisionPoint(code);
      }
      
      
    });
  }
}