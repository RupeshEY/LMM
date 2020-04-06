package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ComponentType.tti;ComponentType.tix;ComponentType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class ComponentType implements gw.entity.TypeKey {
  /**
   * ApprovalEngine
   * Approval Engine
   */
  public static final typekey.ComponentType TC_APPROVAL = new typekey.ComponentType("approval");
  
  /**
   * AssignmentEngine
   * Assignment Engine
   */
  public static final typekey.ComponentType TC_ASSIGNENG = new typekey.ComponentType("assigneng");
  
  /**
   * AuthenticationManager
   * Manages users and passwords in the product database
   */
  public static final typekey.ComponentType TC_AUTH = new typekey.ComponentType("auth");
  
  /**
   * BusinessCalendar
   * Business calendar for use in statistics calculations
   */
  public static final typekey.ComponentType TC_BUSINESSCALENDAR = new typekey.ComponentType("businesscalendar");
  
  /**
   * Cache
   * Server cache
   */
  public static final typekey.ComponentType TC_CACHE = new typekey.ComponentType("cache");
  
  /**
   * DBClock
   * Database Clock
   */
  public static final typekey.ComponentType TC_CLOCK = new typekey.ComponentType("clock");
  
  /**
   * ClusterChannel
   * Cluster communication channel
   */
  public static final typekey.ComponentType TC_CLUSTERCHANNEL = new typekey.ComponentType("clusterchannel");
  
  /**
   * Configuration
   * Configuration component
   */
  public static final typekey.ComponentType TC_CONFIGURATION = new typekey.ComponentType("configuration");
  
  /**
   * Database
   * Database
   */
  public static final typekey.ComponentType TC_DB = new typekey.ComponentType("db");
  
  /**
   * DeductionEngine
   * Deduction Engine
   */
  public static final typekey.ComponentType TC_DEDUCTION = new typekey.ComponentType("deduction");
  
  /**
   * EscalationManager
   * Escalation Manager
   */
  public static final typekey.ComponentType TC_ESCALATION = new typekey.ComponentType("escalation");
  
  /**
   * EventCenter
   * Handles sending of remote events
   */
  public static final typekey.ComponentType TC_EVENTCENTER = new typekey.ComponentType("eventcenter");
  
  /**
   * EventDispatcher
   * Receives sync events and generates messages
   */
  public static final typekey.ComponentType TC_EVENTDISPATCHER = new typekey.ComponentType("eventdispatcher");
  
  /**
   * Filesystem
   * Filesystem
   */
  public static final typekey.ComponentType TC_FS = new typekey.ComponentType("fs");
  
  /**
   * JMXAgent
   * Manages an MBeanServer and JMX adaptors
   */
  public static final typekey.ComponentType TC_JMXAGENT = new typekey.ComponentType("jmxagent");
  
  /**
   * EntityLifecycleManager
   * Manages entity lifecycle rulesets
   */
  public static final typekey.ComponentType TC_LIFECYCLEMGR = new typekey.ComponentType("lifecyclemgr");
  
  /**
   * NotificationEngine
   * Notification Engine
   */
  public static final typekey.ComponentType TC_NOTIFICATION = new typekey.ComponentType("notification");
  
  /**
   * QPlexor
   * Manages sync messages and acknowledgements
   */
  public static final typekey.ComponentType TC_QPLEXOR = new typekey.ComponentType("qplexor");
  
  /**
   * RuleEngine
   * Rule Engine
   */
  public static final typekey.ComponentType TC_RULEENG = new typekey.ComponentType("ruleeng");
  
  /**
   * Scheduler
   * Schedules tasks to be executed in the future
   */
  public static final typekey.ComponentType TC_SCHEDULER = new typekey.ComponentType("scheduler");
  
  /**
   * SearchEngine
   * Search Engine
   */
  public static final typekey.ComponentType TC_SEARCHENG = new typekey.ComponentType("searcheng");
  
  /**
   * SegmentationEngine
   * Segmentation Engine
   */
  public static final typekey.ComponentType TC_SEGMENTENG = new typekey.ComponentType("segmenteng");
  
  /**
   * SessionManager
   * Session Manager
   */
  public static final typekey.ComponentType TC_SESSION = new typekey.ComponentType("session");
  
  /**
   * StateMachine
   * State Machine
   */
  public static final typekey.ComponentType TC_STATEMACH = new typekey.ComponentType("statemach");
  
  /**
   * StatisticsCalculator
   * Calculates statistics on a scheduled basis
   */
  public static final typekey.ComponentType TC_STATISTICS = new typekey.ComponentType("statistics");
  
  /**
   * TransactionManager
   * Transaction Manager
   */
  public static final typekey.ComponentType TC_TM = new typekey.ComponentType("tm");
  
  /**
   * ValidationManager
   * Validation Manager
   */
  public static final typekey.ComponentType TC_VALIDATION = new typekey.ComponentType("validation");
  
  /**
   * VelocitySupport
   * Velocity template support
   */
  public static final typekey.ComponentType TC_VELOCITY = new typekey.ComponentType("velocity");
  
  /**
   * WorkplanGenerator
   * Workplan Generator
   */
  public static final typekey.ComponentType TC_WORKPLAN = new typekey.ComponentType("workplan");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.ComponentType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.ComponentType>("ComponentType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private ComponentType(java.lang.String code)  {
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
  public typekey.ComponentType get() {
    return this;
  }
  
  public static typekey.ComponentType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.ComponentType> getAllTypeKeys() {
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
  
  public static typekey.ComponentType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.ComponentType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.ComponentType[]{});
  }
  
  public static java.util.List<typekey.ComponentType> getTypeKeys(boolean includeRetired) {
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
  
  public typekey.ComponentType getValue() {
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
    com.guidewire._generated.typekey.ComponentTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.ComponentType>() {
      public void clearCache(typekey.ComponentType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.ComponentType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.ComponentType newInstance(java.lang.String code) {
        return new typekey.ComponentType(code);
      }
      
      
    });
  }
}