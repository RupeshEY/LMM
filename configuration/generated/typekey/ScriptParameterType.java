package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ScriptParameterType.tti;ScriptParameterType.tix;ScriptParameterType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class ScriptParameterType implements gw.entity.TypeKey {
  /**
   * bit
   * bit
   */
  public static final typekey.ScriptParameterType TC_BIT = new typekey.ScriptParameterType("bit");
  
  /**
   * datetime
   * datetime
   */
  public static final typekey.ScriptParameterType TC_DATETIME = new typekey.ScriptParameterType("datetime");
  
  /**
   * decimal
   * decimal
   */
  public static final typekey.ScriptParameterType TC_DECIMAL = new typekey.ScriptParameterType("decimal");
  
  /**
   * group
   * Group
   */
  public static final typekey.ScriptParameterType TC_GROUP = new typekey.ScriptParameterType("group");
  
  /**
   * integer
   * integer
   */
  public static final typekey.ScriptParameterType TC_INTEGER = new typekey.ScriptParameterType("integer");
  
  /**
   * money
   * money
   */
  public static final typekey.ScriptParameterType TC_MONEY = new typekey.ScriptParameterType("money");
  
  /**
   * monthlyfrequency
   * monthlyfrequency
   */
  public static final typekey.ScriptParameterType TC_MONTHLYFREQUENCY = new typekey.ScriptParameterType("monthlyfrequency");
  
  /**
   * nonnegativeinteger
   * nonnegativeinteger
   */
  public static final typekey.ScriptParameterType TC_NONNEGATIVEINTEGER = new typekey.ScriptParameterType("nonnegativeinteger");
  
  /**
   * nonnegativemoney
   * nonnegativemoney
   */
  public static final typekey.ScriptParameterType TC_NONNEGATIVEMONEY = new typekey.ScriptParameterType("nonnegativemoney");
  
  /**
   * percentage
   * percentage
   */
  public static final typekey.ScriptParameterType TC_PERCENTAGE = new typekey.ScriptParameterType("percentage");
  
  /**
   * percentagedec
   * percentagedec
   */
  public static final typekey.ScriptParameterType TC_PERCENTAGEDEC = new typekey.ScriptParameterType("percentagedec");
  
  /**
   * phone
   * phone
   */
  public static final typekey.ScriptParameterType TC_PHONE = new typekey.ScriptParameterType("phone");
  
  /**
   * positiveinteger
   * positiveinteger
   */
  public static final typekey.ScriptParameterType TC_POSITIVEINTEGER = new typekey.ScriptParameterType("positiveinteger");
  
  /**
   * positivemoney
   * positivemoney
   */
  public static final typekey.ScriptParameterType TC_POSITIVEMONEY = new typekey.ScriptParameterType("positivemoney");
  
  /**
   * postalcode
   * postalcode
   */
  public static final typekey.ScriptParameterType TC_POSTALCODE = new typekey.ScriptParameterType("postalcode");
  
  /**
   * risk
   * risk
   */
  public static final typekey.ScriptParameterType TC_RISK = new typekey.ScriptParameterType("risk");
  
  /**
   * speed
   * speed
   */
  public static final typekey.ScriptParameterType TC_SPEED = new typekey.ScriptParameterType("speed");
  
  /**
   * user
   * User
   */
  public static final typekey.ScriptParameterType TC_USER = new typekey.ScriptParameterType("user");
  
  /**
   * varchar
   * varchar
   */
  public static final typekey.ScriptParameterType TC_VARCHAR = new typekey.ScriptParameterType("varchar");
  
  /**
   * weeklyfrequency
   * weeklyfrequency
   */
  public static final typekey.ScriptParameterType TC_WEEKLYFREQUENCY = new typekey.ScriptParameterType("weeklyfrequency");
  
  /**
   * year
   * year
   */
  public static final typekey.ScriptParameterType TC_YEAR = new typekey.ScriptParameterType("year");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.ScriptParameterType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.ScriptParameterType>("ScriptParameterType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private ScriptParameterType(java.lang.String code)  {
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
  public typekey.ScriptParameterType get() {
    return this;
  }
  
  public static typekey.ScriptParameterType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.ScriptParameterType> getAllTypeKeys() {
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
  
  public static typekey.ScriptParameterType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.ScriptParameterType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.ScriptParameterType[]{});
  }
  
  public static java.util.List<typekey.ScriptParameterType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.ScriptParameterType getValue() {
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
    com.guidewire._generated.typekey.ScriptParameterTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.ScriptParameterType>() {
      public void clearCache(typekey.ScriptParameterType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.ScriptParameterType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.ScriptParameterType newInstance(java.lang.String code) {
        return new typekey.ScriptParameterType(code);
      }
      
      
    });
  }
}