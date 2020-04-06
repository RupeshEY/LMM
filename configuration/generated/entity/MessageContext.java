package entity;

/**
 * MessageContext
 * 
 *         Non-persistent entity which provides convenience methods for creating integration {@link Message} entities.
 *         <code>MessageContext</code> also provides additional information for use by the event fired rules when constructing a message.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MessageContext.eti;MessageContext.eix;MessageContext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "MessageContext")
public class MessageContext extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MessageContext> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MessageContext>("entity.MessageContext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.MessageContextInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public MessageContext()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public MessageContext(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected MessageContext(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.MessageContextInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.MessageContextInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  public entity.Message createMessage(entity.Message msg) {
    return ((com.guidewire.cc.domain.messaging.impl.MessageContextCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.messaging.impl.MessageContextCoreExtMethods")).createMessage(msg);
  }
  
  public entity.Message createMessage(java.lang.String payLoad) {
    return ((com.guidewire.cc.domain.messaging.impl.MessageContextCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.messaging.impl.MessageContextCoreExtMethods")).createMessage(payLoad);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the current user.
   */
  public entity.User getCurrentUser() {
    return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getCurrentUser();
  }
  
  /**
   * Returns the ID of the destination to which any messages created
   * will be sent.
   */
  public int getDestID() {
    return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getDestID();
  }
  
  /**
   * Gets the event name of this event.
   */
  public java.lang.String getEventName() {
    return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getEventName();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the array of pending messages.
   */
  public entity.Message[] getPendingMessages() {
    return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getPendingMessages();
  }
  
  /**
   * Gets the profiler.
   */
  public com.guidewire.pl.system.integration.messaging.events.ProfilerWrapper getProfiler() {
    return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getProfiler();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the root object of this event, namely, the object that generated
   * the event.
   */
  public java.lang.Object getRoot() {
    return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getRoot();
  }
  
  /**
   * Gets the session marker. The session marker can be used to store
   * and retrieve session variables for later reference by a different rule
   * within the same session.  This should not be confused with
   * Message.putEntityByName() and Message.getEntityByName() which allow
   * entities to be attached to the message for lookup at send and reply time.
   */
  public gw.pl.messaging.SessionTool getSessionMarker() {
    return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getSessionMarker();
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
  }
  
  /**
   * 
   * @return True if the object was created by importation from an external system,
   *         False if it was created internally. Note that this refers to the currently
   *         instantiated object, not the data it represents
   */
  public boolean isNewlyImported() {
    return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
  }
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
  }
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove() {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch() {
    ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.MessageContextInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.MessageContext.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.Message createMessage(entity.Message msg) {
      return ((com.guidewire.cc.domain.messaging.impl.MessageContextCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.messaging.impl.MessageContextCoreExtMethods")).createMessage(msg);
    }
    
    public entity.Message createMessage(java.lang.String payLoad) {
      return ((com.guidewire.cc.domain.messaging.impl.MessageContextCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.messaging.impl.MessageContextCoreExtMethods")).createMessage(payLoad);
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the current user.
     */
    public entity.User getCurrentUser() {
      return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getCurrentUser();
    }
    
    /**
     * Returns the ID of the destination to which any messages created
     * will be sent.
     */
    public int getDestID() {
      return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getDestID();
    }
    
    /**
     * Gets the event name of this event.
     */
    public java.lang.String getEventName() {
      return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getEventName();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    public gw.pl.persistence.core.Bundle getMessageBundle() {
      return ((com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods")).getMessageBundle();
    }
    
    public java.lang.String getMessageEventName(com.guidewire.pl.system.integration.messaging.events.EventDescriptor event) {
      return ((com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods")).getMessageEventName(event);
    }
    
    public java.util.List getMessages() {
      return ((com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods")).getMessages();
    }
    
    /**
     * Gets the array of pending messages.
     */
    public entity.Message[] getPendingMessages() {
      return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getPendingMessages();
    }
    
    /**
     * Gets the profiler.
     */
    public com.guidewire.pl.system.integration.messaging.events.ProfilerWrapper getProfiler() {
      return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getProfiler();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the root object of this event, namely, the object that generated
     * the event.
     */
    public java.lang.Object getRoot() {
      return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getRoot();
    }
    
    /**
     * Gets the session marker. The session marker can be used to store
     * and retrieve session variables for later reference by a different rule
     * within the same session.  This should not be confused with
     * Message.putEntityByName() and Message.getEntityByName() which allow
     * entities to be attached to the message for lookup at send and reply time.
     */
    public gw.pl.messaging.SessionTool getSessionMarker() {
      return ((com.guidewire.pl.domain.messaging.MessageContextPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageContextPublicMethods")).getSessionMarker();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
    }
    
    /**
     * 
     * @return True if the object was created by importation from an external system,
     *         False if it was created internally. Note that this refers to the currently
     *         instantiated object, not the data it represents
     */
    public boolean isNewlyImported() {
      return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * Refreshes this bean with the latest database version.
     * <p/>
     * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
     * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
     * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
     * updated.
     */
    public entity.KeyableBean refresh() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
    }
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
    }
    
    /**
     * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
     * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
     * <p>
     * WARNING: This method is designed for simple custom entities which are normally not
     * associated with other entities. Undesirable results may occur when used on out-of-box entities.
     */
    public void remove() {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    public void setCurrentUser(entity.User user) {
      ((com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods")).setCurrentUser(user);
    }
    
    public void setDestID(int destID) {
      ((com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods")).setDestID(destID);
    }
    
    public void setEventDescriptor(com.guidewire.pl.system.integration.messaging.events.EventDescriptor event) {
      ((com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods")).setEventDescriptor(event);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    public void setMessageBundle(gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods")).setMessageBundle(bundle);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    public void setPendingMessages(entity.Message[] pending) {
      ((com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods")).setPendingMessages(pending);
    }
    
    public void setProfiler(com.guidewire.pl.system.integration.messaging.events.ProfilerWrapper profiler) {
      ((com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods")).setProfiler(profiler);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    public void setRoot(java.lang.Object root) {
      ((com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods")).setRoot(root);
    }
    
    public void setSessionMarker(com.guidewire.pl.system.integration.messaging.events.SessionMarker sessionMarker) {
      ((com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods")).setSessionMarker(sessionMarker);
    }
    
    /**
     * Set's the version of the bean to the next value (i.e. the bean version original value+1)
     * Multiple calls to this method on the same bean will result in the same value being used
     * for the version (i.e. it is idempotent).
     * 
     * Calling this method will force the bean to be written to the database and participate fully
     * in the commit cycle e.g. pre-update rules will be run, etc.
     */
    public void touch() {
      ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.messaging.impl.MessageContextCoreExtMethods", "com.guidewire.cc.domain.messaging.impl.MessageContextCoreExtMethodsImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.messaging.MessageContextPublicMethods", "com.guidewire.pl.domain.messaging.impl.MessageContextImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.MessageContextInternalMethods", "com.guidewire.pl.domain.messaging.impl.MessageContextImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.MessageContext.class, config);
    com.guidewire._generated.entity.MessageContextInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.MessageContext, com.guidewire._generated.entity.MessageContextInternal>() {
      public java.lang.Object getImplementation(entity.MessageContext bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.MessageContextInternal getInternalInterface(entity.MessageContext bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.MessageContext newEmptyInstance() {
        return new entity.MessageContext((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}