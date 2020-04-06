package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MetroReportType.tti;MetroReportType.tix;MetroReportType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class MetroReportType implements gw.entity.TypeKey {
  /**
   * Auto Accident
   * Auto Accident
   */
  public static final typekey.MetroReportType TC_A = new typekey.MetroReportType("A");
  
  /**
   * Auto Theft
   * Auto Theft
   */
  public static final typekey.MetroReportType TC_B = new typekey.MetroReportType("B");
  
  /**
   * Auto Theft Recovery
   * Auto Theft Recovery
   */
  public static final typekey.MetroReportType TC_C = new typekey.MetroReportType("C");
  
  /**
   * Driving History
   * Driving History
   */
  public static final typekey.MetroReportType TC_D = new typekey.MetroReportType("D");
  
  /**
   * Coroner Reports
   * Coroner Reports
   */
  public static final typekey.MetroReportType TC_E = new typekey.MetroReportType("E");
  
  /**
   * Fire Home
   * Fire Home
   */
  public static final typekey.MetroReportType TC_F = new typekey.MetroReportType("F");
  
  /**
   * Burglary
   * Burglary
   */
  public static final typekey.MetroReportType TC_G = new typekey.MetroReportType("G");
  
  /**
   * Death Certificate
   * Death Certificate
   */
  public static final typekey.MetroReportType TC_H = new typekey.MetroReportType("H");
  
  /**
   * Incident
   * Incident
   */
  public static final typekey.MetroReportType TC_I = new typekey.MetroReportType("I");
  
  /**
   * Locate Defendant/Witness
   * Locate Defendant/Witness
   */
  public static final typekey.MetroReportType TC_J = new typekey.MetroReportType("J");
  
  /**
   * EMS/Rescue Squad
   * EMS/Rescue Squad
   */
  public static final typekey.MetroReportType TC_K = new typekey.MetroReportType("K");
  
  /**
   * Supplemental/Addendum
   * Supplemental/Addendum
   */
  public static final typekey.MetroReportType TC_L = new typekey.MetroReportType("L");
  
  /**
   * MV-104 (NY Only)
   * MV-104 (NY Only)
   */
  public static final typekey.MetroReportType TC_M = new typekey.MetroReportType("M");
  
  /**
   * OSHA
   * OSHA
   */
  public static final typekey.MetroReportType TC_N = new typekey.MetroReportType("N");
  
  /**
   * Other
   * Other
   */
  public static final typekey.MetroReportType TC_O = new typekey.MetroReportType("O");
  
  /**
   * Activities Fixed Rate
   * Activities Fixed Rate
   */
  public static final typekey.MetroReportType TC_P = new typekey.MetroReportType("P");
  
  /**
   * Property and Judgments
   * Property and Judgments
   */
  public static final typekey.MetroReportType TC_Q = new typekey.MetroReportType("Q");
  
  /**
   * Registration Check/DMV
   * Registration Check/DMV
   */
  public static final typekey.MetroReportType TC_R = new typekey.MetroReportType("R");
  
  /**
   * Insurance Check
   * Insurance Check
   */
  public static final typekey.MetroReportType TC_S = new typekey.MetroReportType("S");
  
  /**
   * Title History
   * Title History
   */
  public static final typekey.MetroReportType TC_T = new typekey.MetroReportType("T");
  
  /**
   * Subrogation Financial/Assets
   * Subrogation Financial/Assets
   */
  public static final typekey.MetroReportType TC_U = new typekey.MetroReportType("U");
  
  /**
   * Vandalism/Auto
   * Vandalism/Auto
   */
  public static final typekey.MetroReportType TC_V = new typekey.MetroReportType("V");
  
  /**
   * Weather Report
   * Weather Report
   */
  public static final typekey.MetroReportType TC_W = new typekey.MetroReportType("W");
  
  /**
   * Fire-Auto
   * Fire-Auto
   */
  public static final typekey.MetroReportType TC_X = new typekey.MetroReportType("X");
  
  /**
   * Photo
   * Photo
   */
  public static final typekey.MetroReportType TC_Y = new typekey.MetroReportType("Y");
  
  /**
   * Disposition of Charges
   * Disposition of Charges
   */
  public static final typekey.MetroReportType TC_Z = new typekey.MetroReportType("Z");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.MetroReportType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.MetroReportType>("MetroReportType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private MetroReportType(java.lang.String code)  {
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
  public typekey.MetroReportType get() {
    return this;
  }
  
  public static typekey.MetroReportType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.MetroReportType> getAllTypeKeys() {
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
  
  public static typekey.MetroReportType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.MetroReportType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.MetroReportType[]{});
  }
  
  public static java.util.List<typekey.MetroReportType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.MetroReportType getValue() {
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
    com.guidewire._generated.typekey.MetroReportTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.MetroReportType>() {
      public void clearCache(typekey.MetroReportType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.MetroReportType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.MetroReportType newInstance(java.lang.String code) {
        return new typekey.MetroReportType(code);
      }
      
      
    });
  }
}