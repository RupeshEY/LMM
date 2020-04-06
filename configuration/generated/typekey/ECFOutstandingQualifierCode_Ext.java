package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFOutstandingQualifierCode_Ext.tti;ECFOutstandingQualifierCode_Ext.tix;ECFOutstandingQualifierCode_Ext.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class ECFOutstandingQualifierCode_Ext implements gw.entity.TypeKey {
  /**
   * C - Claim is closed
   * Claim is closed
   */
  public static final typekey.ECFOutstandingQualifierCode_Ext TC_C = new typekey.ECFOutstandingQualifierCode_Ext("C");
  
  /**
   * D - See Loss Details
   * See Loss Details
   */
  public static final typekey.ECFOutstandingQualifierCode_Ext TC_D = new typekey.ECFOutstandingQualifierCode_Ext("D");
  
  /**
   * F - Fees expected
   * Fees expected
   */
  public static final typekey.ECFOutstandingQualifierCode_Ext TC_F = new typekey.ECFOutstandingQualifierCode_Ext("F");
  
  /**
   * L - No (Outstanding amount exists because this claim is a part of a Block advice already included within another claim)
   * No (Outstanding amount exists because this claim is a part of a Block advice already included within another claim)
   */
  public static final typekey.ECFOutstandingQualifierCode_Ext TC_L = new typekey.ECFOutstandingQualifierCode_Ext("L");
  
  /**
   * N - Amount is Nil
   * Amount is Nil
   */
  public static final typekey.ECFOutstandingQualifierCode_Ext TC_N = new typekey.ECFOutstandingQualifierCode_Ext("N");
  
  /**
   * P - Advice is Precautionary
   * Advice is Precautionary
   */
  public static final typekey.ECFOutstandingQualifierCode_Ext TC_P = new typekey.ECFOutstandingQualifierCode_Ext("P");
  
  /**
   * R - Recovery is expected
   * Recovery is expected
   */
  public static final typekey.ECFOutstandingQualifierCode_Ext TC_R = new typekey.ECFOutstandingQualifierCode_Ext("R");
  
  /**
   * S - Subrogation is expected
   * Subrogation is expected
   */
  public static final typekey.ECFOutstandingQualifierCode_Ext TC_S = new typekey.ECFOutstandingQualifierCode_Ext("S");
  
  /**
   * T - Amount to be advised
   * Amount to be advised
   */
  public static final typekey.ECFOutstandingQualifierCode_Ext TC_T = new typekey.ECFOutstandingQualifierCode_Ext("T");
  
  /**
   * U - Uber Precautionary
   * Uber Precautionary
   */
  public static final typekey.ECFOutstandingQualifierCode_Ext TC_U = new typekey.ECFOutstandingQualifierCode_Ext("U");
  
  /**
   * V - Salvage is expected
   * Salvage is expected
   */
  public static final typekey.ECFOutstandingQualifierCode_Ext TC_V = new typekey.ECFOutstandingQualifierCode_Ext("V");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.ECFOutstandingQualifierCode_Ext> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.ECFOutstandingQualifierCode_Ext>("ECFOutstandingQualifierCode_Ext");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private ECFOutstandingQualifierCode_Ext(java.lang.String code)  {
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
  public typekey.ECFOutstandingQualifierCode_Ext get() {
    return this;
  }
  
  public static typekey.ECFOutstandingQualifierCode_Ext get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.ECFOutstandingQualifierCode_Ext> getAllTypeKeys() {
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
  
  public static typekey.ECFOutstandingQualifierCode_Ext getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.ECFOutstandingQualifierCode_Ext[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.ECFOutstandingQualifierCode_Ext[]{});
  }
  
  public static java.util.List<typekey.ECFOutstandingQualifierCode_Ext> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.ECFOutstandingQualifierCode_Ext getValue() {
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
    com.guidewire._generated.typekey.ECFOutstandingQualifierCode_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.ECFOutstandingQualifierCode_Ext>() {
      public void clearCache(typekey.ECFOutstandingQualifierCode_Ext typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.ECFOutstandingQualifierCode_Ext typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.ECFOutstandingQualifierCode_Ext newInstance(java.lang.String code) {
        return new typekey.ECFOutstandingQualifierCode_Ext(code);
      }
      
      
    });
  }
}