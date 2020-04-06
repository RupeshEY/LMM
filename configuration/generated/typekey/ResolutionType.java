package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ResolutionType.tti;ResolutionType.tix;ResolutionType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class ResolutionType implements gw.entity.TypeKey {
  /**
   * Award
   * Award
   */
  public static final typekey.ResolutionType TC_AA = new typekey.ResolutionType("AA");
  
  /**
   * Appeal dismissed
   * Appeal dismissed
   */
  public static final typekey.ResolutionType TC_AD = new typekey.ResolutionType("AD");
  
  /**
   * Appeal lost
   * Appeal lost
   */
  public static final typekey.ResolutionType TC_AL = new typekey.ResolutionType("AL");
  
  /**
   * Appeal moot
   * Appeal moot
   */
  public static final typekey.ResolutionType TC_AM = new typekey.ResolutionType("AM");
  
  /**
   * Appealed
   * Appealed
   */
  public static final typekey.ResolutionType TC_AP = new typekey.ResolutionType("AP");
  
  /**
   * Appeal
   * Appeal
   */
  @java.lang.Deprecated
  public static final typekey.ResolutionType TC_APPEAL = new typekey.ResolutionType("Appeal");
  
  /**
   * Appeal remanded
   * Appeal remanded
   */
  public static final typekey.ResolutionType TC_AR = new typekey.ResolutionType("AR");
  
  /**
   * Appeal withdrawn
   * Appeal withdrawn
   */
  public static final typekey.ResolutionType TC_AW = new typekey.ResolutionType("AW");
  
  /**
   * Appeal won
   * Appeal won
   */
  public static final typekey.ResolutionType TC_AWO = new typekey.ResolutionType("AWO");
  
  /**
   * Coverage acknowledged
   * Coverage acknowledged
   */
  public static final typekey.ResolutionType TC_CA = new typekey.ResolutionType("CA");
  
  /**
   * Coverage denied
   * Coverage denied
   */
  public static final typekey.ResolutionType TC_CD = new typekey.ResolutionType("CD");
  
  /**
   * Conflict
   * Conflict
   */
  public static final typekey.ResolutionType TC_CN = new typekey.ResolutionType("CN");
  
  /**
   * Consolidation
   * Consolidation
   */
  public static final typekey.ResolutionType TC_CO = new typekey.ResolutionType("CO");
  
  /**
   * Change of venue
   * Change of venue
   */
  public static final typekey.ResolutionType TC_CV = new typekey.ResolutionType("CV");
  
  /**
   * Default judgment
   * Default judgment
   */
  public static final typekey.ResolutionType TC_DJ = new typekey.ResolutionType("DJ");
  
  /**
   * Dismissed
   * Dismissed
   */
  public static final typekey.ResolutionType TC_DM = new typekey.ResolutionType("DM");
  
  /**
   * Discontinued
   * Discontinued
   */
  public static final typekey.ResolutionType TC_DS = new typekey.ResolutionType("DS");
  
  /**
   * Defense tendered
   * Defense tendered
   */
  public static final typekey.ResolutionType TC_DT = new typekey.ResolutionType("DT");
  
  /**
   * Directed verdict-defendant
   * Directed verdict-defendant
   */
  public static final typekey.ResolutionType TC_DVD = new typekey.ResolutionType("DVD");
  
  /**
   * Directed verdict-plaintiff
   * Directed verdict-plaintiff
   */
  public static final typekey.ResolutionType TC_DVP = new typekey.ResolutionType("DVP");
  
  /**
   * Judgment
   * Judgment
   */
  @java.lang.Deprecated
  public static final typekey.ResolutionType TC_JUDGMENT = new typekey.ResolutionType("Judgment");
  
  /**
   * Petition/motion denied
   * Petition/motion denied
   */
  public static final typekey.ResolutionType TC_PMD = new typekey.ResolutionType("PMD");
  
  /**
   * Petition/motion granted
   * Petition/motion granted
   */
  public static final typekey.ResolutionType TC_PMG = new typekey.ResolutionType("PMG");
  
  /**
   * Petition/motion withdrawn
   * Petition/motion withdrawn
   */
  public static final typekey.ResolutionType TC_PMW = new typekey.ResolutionType("PMW");
  
  /**
   * Settled-ADR
   * Settled-ADR
   */
  public static final typekey.ResolutionType TC_SA = new typekey.ResolutionType("SA");
  
  /**
   * Settled-appraisal award
   * Settled-appraisal award
   */
  public static final typekey.ResolutionType TC_SAA = new typekey.ResolutionType("SAA");
  
  /**
   * Settlement
   * Settlement
   */
  @java.lang.Deprecated
  public static final typekey.ResolutionType TC_SETTLEMENT = new typekey.ResolutionType("Settlement");
  
  /**
   * Summary judgment
   * Summary judgment
   */
  public static final typekey.ResolutionType TC_SJ = new typekey.ResolutionType("SJ");
  
  /**
   * Settled-other
   * Settled-other
   */
  public static final typekey.ResolutionType TC_SO = new typekey.ResolutionType("SO");
  
  /**
   * Settled-regular
   * Settled-regular
   */
  public static final typekey.ResolutionType TC_SR = new typekey.ResolutionType("SR");
  
  /**
   * Settled-structured
   * Settled-structured
   */
  public static final typekey.ResolutionType TC_SS = new typekey.ResolutionType("SS");
  
  /**
   * Verdict for defendant
   * Verdict for defendant
   */
  public static final typekey.ResolutionType TC_VD = new typekey.ResolutionType("VD");
  
  /**
   * Voided defense/matter
   * Voided defense/matter
   */
  public static final typekey.ResolutionType TC_VO = new typekey.ResolutionType("VO");
  
  /**
   * Verdict for plaintiff
   * Verdict for plaintiff
   */
  public static final typekey.ResolutionType TC_VP = new typekey.ResolutionType("VP");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.ResolutionType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.ResolutionType>("ResolutionType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private ResolutionType(java.lang.String code)  {
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
  public typekey.ResolutionType get() {
    return this;
  }
  
  public static typekey.ResolutionType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.ResolutionType> getAllTypeKeys() {
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
  
  public static typekey.ResolutionType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.ResolutionType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.ResolutionType[]{});
  }
  
  public static java.util.List<typekey.ResolutionType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.ResolutionType getValue() {
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
    com.guidewire._generated.typekey.ResolutionTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.ResolutionType>() {
      public void clearCache(typekey.ResolutionType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.ResolutionType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.ResolutionType newInstance(java.lang.String code) {
        return new typekey.ResolutionType(code);
      }
      
      
    });
  }
}