package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MajorPerils.tti;MajorPerils.tix;MajorPerils.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class MajorPerils implements gw.entity.TypeKey {
  /**
   * Building basic group 1
   * Building basic group 1
   */
  public static final typekey.MajorPerils TC_BLDG_1 = new typekey.MajorPerils("bldg_1");
  
  /**
   * Building Basic Group 2
   * Building Basic Group 2
   */
  public static final typekey.MajorPerils TC_BLDG_2 = new typekey.MajorPerils("bldg_2");
  
  /**
   * Auto bodily injury
   * Auto bodily injury
   */
  public static final typekey.MajorPerils TC_BODILY_INJURY = new typekey.MajorPerils("bodily_injury");
  
  /**
   * Businessowners
   * Businessowners
   */
  public static final typekey.MajorPerils TC_BUSINESSOWNERS = new typekey.MajorPerils("businessowners");
  
  /**
   * Collision
   * Collision
   */
  public static final typekey.MajorPerils TC_COLLISION = new typekey.MajorPerils("collision");
  
  /**
   * Comprehensive
   * Comprehensive
   */
  public static final typekey.MajorPerils TC_COMPREHENSIVE = new typekey.MajorPerils("comprehensive");
  
  /**
   * Contents basic group 1
   * Contents basic group 1
   */
  public static final typekey.MajorPerils TC_CONTENTS_1 = new typekey.MajorPerils("contents_1");
  
  /**
   * Contents basic group 2
   * Contents basic group 2
   */
  public static final typekey.MajorPerils TC_CONTENTS_2 = new typekey.MajorPerils("contents_2");
  
  /**
   * Earthquake building
   * Earthquake building
   */
  public static final typekey.MajorPerils TC_EARTHQUAKE_BLDG = new typekey.MajorPerils("earthquake_bldg");
  
  /**
   * Earthquake contents
   * Earthquake contents
   */
  public static final typekey.MajorPerils TC_EARTHQUAKE_CONT = new typekey.MajorPerils("earthquake_cont");
  
  /**
   * Farmowners
   * Farmowners
   */
  public static final typekey.MajorPerils TC_FARMOWNERS = new typekey.MajorPerils("farmowners");
  
  /**
   * Glass
   * Glass
   */
  public static final typekey.MajorPerils TC_GLASS = new typekey.MajorPerils("glass");
  
  /**
   * General liability (personal umbrella)
   * General liability (personal umbrella)
   */
  public static final typekey.MajorPerils TC_GL_PERS = new typekey.MajorPerils("gl_pers");
  
  /**
   * General liability - CPP  and GL
   * General liability - CPP  and GL
   */
  public static final typekey.MajorPerils TC_GL_STD = new typekey.MajorPerils("gl_std");
  
  /**
   * Homeowners
   * Homeowners
   */
  public static final typekey.MajorPerils TC_HOMEOWNERS = new typekey.MajorPerils("homeowners");
  
  /**
   * Inland marine all other
   * Inland marine watercraft
   */
  public static final typekey.MajorPerils TC_IM_OTHER = new typekey.MajorPerils("im_other");
  
  /**
   * Inland marine watercraft
   * Inland marine watercraft
   */
  public static final typekey.MajorPerils TC_IM_WATERCRAFT = new typekey.MajorPerils("im_watercraft");
  
  /**
   * Medical payments
   * Medical payments
   */
  public static final typekey.MajorPerils TC_MED_PAY = new typekey.MajorPerils("med_pay");
  
  /**
   * Mobile homeowners
   * Mobile homeowners
   */
  public static final typekey.MajorPerils TC_MOBILE_HOMEOWNS = new typekey.MajorPerils("mobile_homeowns");
  
  /**
   * Auto no-fault
   * Auto no-fault
   */
  public static final typekey.MajorPerils TC_PERS_NOFAULT = new typekey.MajorPerils("pers_nofault");
  
  /**
   * Personal injury protection
   * Personal injury protection
   */
  public static final typekey.MajorPerils TC_PIP = new typekey.MajorPerils("pip");
  
  /**
   * Property damage
   * Property damage
   */
  public static final typekey.MajorPerils TC_PROP_DAMAGE = new typekey.MajorPerils("prop_damage");
  
  /**
   * Rental reimbursement
   * Rental reimbursement
   */
  public static final typekey.MajorPerils TC_RENTAL = new typekey.MajorPerils("rental");
  
  /**
   * Under-insured motorist BI 
   * Under-insured motorist BI 
   */
  public static final typekey.MajorPerils TC_UNDER_INSURED_BI = new typekey.MajorPerils("under_insured_bi");
  
  /**
   * Uninsured motorist BI
   * Uninsured motorist BI
   */
  public static final typekey.MajorPerils TC_UNINSURED_BI = new typekey.MajorPerils("uninsured_bi");
  
  /**
   * Watercraft liability
   * Watercraft liability
   */
  public static final typekey.MajorPerils TC_WATERCRAFT_LIAB = new typekey.MajorPerils("watercraft_liab");
  
  /**
   * Workers' compensation
   * Workers' compensation
   */
  public static final typekey.MajorPerils TC_WC = new typekey.MajorPerils("wc");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.MajorPerils> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.MajorPerils>("MajorPerils");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private MajorPerils(java.lang.String code)  {
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
  public typekey.MajorPerils get() {
    return this;
  }
  
  public static typekey.MajorPerils get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.MajorPerils> getAllTypeKeys() {
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
  
  public static typekey.MajorPerils getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.MajorPerils[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.MajorPerils[]{});
  }
  
  public static java.util.List<typekey.MajorPerils> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.MajorPerils getValue() {
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
    com.guidewire._generated.typekey.MajorPerilsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.MajorPerils>() {
      public void clearCache(typekey.MajorPerils typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.MajorPerils typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.MajorPerils newInstance(java.lang.String code) {
        return new typekey.MajorPerils(code);
      }
      
      
    });
  }
}