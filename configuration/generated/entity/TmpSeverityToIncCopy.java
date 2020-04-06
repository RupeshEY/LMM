package entity;

/**
 * TmpSeverityToIncCopy
 * Temp table used to set the severity value for non-injury incidents during the 4.0.x-5.0.x upgrade
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpSeverityToIncCopy.eti;TmpSeverityToIncCopy.eix;TmpSeverityToIncCopy.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpSeverityToIncCopy")
public class TmpSeverityToIncCopy extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpSeverityToIncCopy> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpSeverityToIncCopy>("entity.TmpSeverityToIncCopy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCIDENTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncidentID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SEVERITYTMP_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SeverityTmp");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpSeverityToIncCopyInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpSeverityToIncCopy()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpSeverityToIncCopy(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpSeverityToIncCopy(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpSeverityToIncCopyInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpSeverityToIncCopyInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the IncidentID field.
   * The ID of the incident to be updated by a join to this temp table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getIncidentID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(INCIDENTID_PROP.get());
  }
  
  /**
   * Gets the value of the SeverityTmp field.
   * The SeverityType value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SeverityType getSeverityTmp() {
    return (typekey.SeverityType)__getInternalInterface().getFieldValue(SEVERITYTMP_PROP.get());
  }
  
  /**
   * Sets the value of the IncidentID field.
   */
  public void setIncidentID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(INCIDENTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SeverityTmp field.
   */
  public void setSeverityTmp(typekey.SeverityType value) {
    __getInternalInterface().setFieldValue(SEVERITYTMP_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpSeverityToIncCopyInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpSeverityToIncCopy.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the IncidentID field.
     * The ID of the incident to be updated by a join to this temp table
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getIncidentID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(INCIDENTID_PROP.get());
    }
    
    /**
     * Gets the value of the SeverityTmp field.
     * The SeverityType value to copy from cc_exposure to cc_incident
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SeverityType getSeverityTmp() {
      return (typekey.SeverityType)__getInternalInterface().getFieldValue(SEVERITYTMP_PROP.get());
    }
    
    /**
     * Sets the value of the IncidentID field.
     */
    public void setIncidentID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(INCIDENTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SeverityTmp field.
     */
    public void setSeverityTmp(typekey.SeverityType value) {
      __getInternalInterface().setFieldValue(SEVERITYTMP_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.exposure.entity.TmpSeverityToIncCopy", "com.guidewire.cc.domain.exposure.impl.TmpSeverityToIncCopyImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpSeverityToIncCopy.class, config);
    com.guidewire._generated.entity.TmpSeverityToIncCopyInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpSeverityToIncCopy, com.guidewire._generated.entity.TmpSeverityToIncCopyInternal>() {
      public java.lang.Object getImplementation(entity.TmpSeverityToIncCopy bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpSeverityToIncCopyInternal getInternalInterface(entity.TmpSeverityToIncCopy bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpSeverityToIncCopy newEmptyInstance() {
        return new entity.TmpSeverityToIncCopy((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}