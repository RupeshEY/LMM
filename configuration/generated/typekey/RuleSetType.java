package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleSetType.tti;RuleSetType.tix;RuleSetType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class RuleSetType implements gw.entity.TypeKey {
  /**
   * Assignment
   * Assignment rules
   */
  public static final typekey.RuleSetType TC_A = new typekey.RuleSetType("A");
  
  /**
   * Approval Routing
   * Used to find the user who must approve an approval batch
   */
  public static final typekey.RuleSetType TC_AP = new typekey.RuleSetType("AP");
  
  /**
   * Archive
   * Archiving rules
   */
  public static final typekey.RuleSetType TC_AR = new typekey.RuleSetType("AR");
  
  /**
   * BulkInvoice Approval
   * Rules for approving a BulkInvoice
   */
  public static final typekey.RuleSetType TC_BAR = new typekey.RuleSetType("BAR");
  
  /**
   * Closed
   * Actions to be taken after closing a claim or exposure
   */
  public static final typekey.RuleSetType TC_C = new typekey.RuleSetType("C");
  
  /**
   * Exception
   * Exception rules
   */
  public static final typekey.RuleSetType TC_E = new typekey.RuleSetType("E");
  
  /**
   * Event Message
   * Rules for generating integration event messages
   */
  public static final typekey.RuleSetType TC_EM = new typekey.RuleSetType("EM");
  
  /**
   * Initial Reserve
   * Rules for generating an initial reserve for a new exposure
   */
  public static final typekey.RuleSetType TC_IR = new typekey.RuleSetType("IR");
  
  /**
   * Loaded
   * Rules executed on a imported claim
   */
  public static final typekey.RuleSetType TC_L = new typekey.RuleSetType("L");
  
  /**
   * Post-setup
   * Rules executed on a new claim after it has been set up
   */
  public static final typekey.RuleSetType TC_PO = new typekey.RuleSetType("PO");
  
  /**
   * Pre-setup
   * Rules executed on a new claim before it has been set up
   */
  public static final typekey.RuleSetType TC_PR = new typekey.RuleSetType("PR");
  
  /**
   * Pre-update
   * Rules execute after validating, but before updating an editable entity
   */
  public static final typekey.RuleSetType TC_PU = new typekey.RuleSetType("PU");
  
  /**
   * Reopened
   * Actions to be taken after reopening a claim or exposure
   */
  public static final typekey.RuleSetType TC_RO = new typekey.RuleSetType("RO");
  
  /**
   * Segmentation
   * Segmentation rules
   */
  public static final typekey.RuleSetType TC_S = new typekey.RuleSetType("S");
  
  /**
   * Transaction Approval
   * Used to determine whether or not a transaction needs approval
   */
  public static final typekey.RuleSetType TC_TAR = new typekey.RuleSetType("TAR");
  
  /**
   * Validation
   * Validation rules
   */
  public static final typekey.RuleSetType TC_V = new typekey.RuleSetType("V");
  
  /**
   * Workplan
   * Workplan rules
   */
  public static final typekey.RuleSetType TC_WP = new typekey.RuleSetType("WP");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.RuleSetType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.RuleSetType>("RuleSetType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private RuleSetType(java.lang.String code)  {
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
  public typekey.RuleSetType get() {
    return this;
  }
  
  public static typekey.RuleSetType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.RuleSetType> getAllTypeKeys() {
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
  
  public static typekey.RuleSetType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.RuleSetType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.RuleSetType[]{});
  }
  
  public static java.util.List<typekey.RuleSetType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.RuleSetType getValue() {
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
    com.guidewire._generated.typekey.RuleSetTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.RuleSetType>() {
      public void clearCache(typekey.RuleSetType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.RuleSetType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.RuleSetType newInstance(java.lang.String code) {
        return new typekey.RuleSetType(code);
      }
      
      
    });
  }
}