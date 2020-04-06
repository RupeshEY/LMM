package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InsuranceSubLine.tti;InsuranceSubLine.tix;InsuranceSubLine.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class InsuranceSubLine implements gw.entity.TypeKey {
  /**
   * Assigned risk
   * Assigned risk
   */
  public static final typekey.InsuranceSubLine TC_ASSIGNED_RISK = new typekey.InsuranceSubLine("assigned_risk");
  
  /**
   * Auto non-standard
   * Auto non-standard
   */
  public static final typekey.InsuranceSubLine TC_AUTO_NON_STD = new typekey.InsuranceSubLine("auto_non_std");
  
  /**
   * Auto standard
   * Auto standard
   */
  public static final typekey.InsuranceSubLine TC_AUTO_STD = new typekey.InsuranceSubLine("auto_std");
  
  /**
   * Basic group 1 causes of loss
   * Basic group 1 causes of loss
   */
  public static final typekey.InsuranceSubLine TC_BASIC_1 = new typekey.InsuranceSubLine("basic_1");
  
  /**
   * Basic group 2 causes of loss
   * Basic group 2 causes of loss
   */
  public static final typekey.InsuranceSubLine TC_BASIC_2 = new typekey.InsuranceSubLine("basic_2");
  
  /**
   * Businessowners - non simplified
   * Businessowners - non simplified
   */
  public static final typekey.InsuranceSubLine TC_BO_NONSIMPLIFIED = new typekey.InsuranceSubLine("bo_nonsimplified");
  
  /**
   * Businessowners - simplified
   * Businessowners - simplified
   */
  public static final typekey.InsuranceSubLine TC_BO_SIMPLIFIED = new typekey.InsuranceSubLine("bo_simplified");
  
  /**
   * Farmowners
   * Farmowners
   */
  public static final typekey.InsuranceSubLine TC_FARMOWNERS = new typekey.InsuranceSubLine("farmowners");
  
  /**
   * Federal Employers' Liability Act
   * Federal Employers' Liability Act
   */
  public static final typekey.InsuranceSubLine TC_FELA = new typekey.InsuranceSubLine("fela");
  
  /**
   * Glass
   * Glass
   */
  public static final typekey.InsuranceSubLine TC_GLASS = new typekey.InsuranceSubLine("glass");
  
  /**
   * All other general liability
   * All other general liability
   */
  public static final typekey.InsuranceSubLine TC_GL_OTHER = new typekey.InsuranceSubLine("gl_other");
  
  /**
   * Homeowners
   * Homeowners
   */
  public static final typekey.InsuranceSubLine TC_HOMEOWNERS = new typekey.InsuranceSubLine("homeowners");
  
  /**
   * Homeowners with replacement cost
   * Homeowners with replacement cost
   */
  public static final typekey.InsuranceSubLine TC_HOMEOWNERS_RC = new typekey.InsuranceSubLine("homeowners_rc");
  
  /**
   * Inland marine
   * Inland marine
   */
  public static final typekey.InsuranceSubLine TC_INLAND_MARINE = new typekey.InsuranceSubLine("inland_marine");
  
  /**
   * Jones Act/Maritime
   * Jones Act/Maritime
   */
  public static final typekey.InsuranceSubLine TC_JONES = new typekey.InsuranceSubLine("jones");
  
  /**
   * Medical payments
   * Medical payments
   */
  public static final typekey.InsuranceSubLine TC_MED_PAY = new typekey.InsuranceSubLine("med_pay");
  
  /**
   * Mobile homeowners
   * Mobile homeowners
   */
  public static final typekey.InsuranceSubLine TC_MOBILE_HOMEOWNS = new typekey.InsuranceSubLine("mobile_homeowns");
  
  /**
   * Owners and contractors
   * Owners and contractors
   */
  public static final typekey.InsuranceSubLine TC_OWNERS_CONTRACTS = new typekey.InsuranceSubLine("owners_contracts");
  
  /**
   * Personal auto liability
   * Personal auto liability
   */
  public static final typekey.InsuranceSubLine TC_PERS_AUTO_LIAB = new typekey.InsuranceSubLine("pers_auto_liab");
  
  /**
   * Personal auto no-fault
   * Personal auto no-fault
   */
  public static final typekey.InsuranceSubLine TC_PERS_AUTO_NOFLT = new typekey.InsuranceSubLine("pers_auto_noflt");
  
  /**
   * Personal auto physical damage
   * Personal auto physical damage
   */
  public static final typekey.InsuranceSubLine TC_PERS_AUTO_PHYS = new typekey.InsuranceSubLine("pers_auto_phys");
  
  /**
   * Personal liability
   * Personal liability
   */
  public static final typekey.InsuranceSubLine TC_PERS_LIABILITY = new typekey.InsuranceSubLine("pers_liability");
  
  /**
   * Premises/operations liability
   * Premises/operations liability
   */
  public static final typekey.InsuranceSubLine TC_PREMISES = new typekey.InsuranceSubLine("premises");
  
  /**
   * Professional liability
   * Professional liability
   */
  public static final typekey.InsuranceSubLine TC_PROF_LIABILITY = new typekey.InsuranceSubLine("prof_liability");
  
  /**
   * Underinsured motorists
   * Underinsured motorists
   */
  public static final typekey.InsuranceSubLine TC_UNDERINSURED = new typekey.InsuranceSubLine("underinsured");
  
  /**
   * Uninsured motorists
   * Uninsured motorists
   */
  public static final typekey.InsuranceSubLine TC_UNINSURED = new typekey.InsuranceSubLine("uninsured");
  
  /**
   * Workers' compensation
   * Workers' compensation
   */
  public static final typekey.InsuranceSubLine TC_WC_STD = new typekey.InsuranceSubLine("wc_std");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.InsuranceSubLine> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.InsuranceSubLine>("InsuranceSubLine");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private InsuranceSubLine(java.lang.String code)  {
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
  public typekey.InsuranceSubLine get() {
    return this;
  }
  
  public static typekey.InsuranceSubLine get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.InsuranceSubLine> getAllTypeKeys() {
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
  
  public static typekey.InsuranceSubLine getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.InsuranceSubLine[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.InsuranceSubLine[]{});
  }
  
  public static java.util.List<typekey.InsuranceSubLine> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.InsuranceSubLine getValue() {
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
    com.guidewire._generated.typekey.InsuranceSubLineInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.InsuranceSubLine>() {
      public void clearCache(typekey.InsuranceSubLine typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.InsuranceSubLine typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.InsuranceSubLine newInstance(java.lang.String code) {
        return new typekey.InsuranceSubLine(code);
      }
      
      
    });
  }
}