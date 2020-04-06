package entity;

/**
 * TmpPIPPrimaryDoctor
 * Temp table used to store the ids of the primary doctor roles to be copied to PIP injury incidents during the 4.0.x-5.0.x upgrade
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpPIPPrimaryDoctor.eti;TmpPIPPrimaryDoctor.eix;TmpPIPPrimaryDoctor.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpPIPPrimaryDoctor")
public class TmpPIPPrimaryDoctor extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpPIPPrimaryDoctor> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpPIPPrimaryDoctor>("entity.TmpPIPPrimaryDoctor");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMCONTACTROLEID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimContactRoleID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCIDENTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncidentID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpPIPPrimaryDoctorInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpPIPPrimaryDoctor()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpPIPPrimaryDoctor(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpPIPPrimaryDoctor(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpPIPPrimaryDoctorInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpPIPPrimaryDoctorInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the ClaimContactRoleID field.
   * The ID of the claim contact role to be copied
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimContactRoleID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMCONTACTROLEID_PROP.get());
  }
  
  /**
   * Gets the value of the IncidentID field.
   * The ID of the incident to which the copied claim contact role will refer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getIncidentID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(INCIDENTID_PROP.get());
  }
  
  /**
   * Sets the value of the ClaimContactRoleID field.
   */
  public void setClaimContactRoleID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CLAIMCONTACTROLEID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IncidentID field.
   */
  public void setIncidentID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(INCIDENTID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpPIPPrimaryDoctorInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpPIPPrimaryDoctor.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the ClaimContactRoleID field.
     * The ID of the claim contact role to be copied
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getClaimContactRoleID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMCONTACTROLEID_PROP.get());
    }
    
    /**
     * Gets the value of the IncidentID field.
     * The ID of the incident to which the copied claim contact role will refer
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getIncidentID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(INCIDENTID_PROP.get());
    }
    
    /**
     * Sets the value of the ClaimContactRoleID field.
     */
    public void setClaimContactRoleID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CLAIMCONTACTROLEID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncidentID field.
     */
    public void setIncidentID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(INCIDENTID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.exposure.entity.TmpPIPPrimaryDoctor", "com.guidewire.cc.domain.exposure.impl.TmpPIPPrimaryDoctorImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpPIPPrimaryDoctor.class, config);
    com.guidewire._generated.entity.TmpPIPPrimaryDoctorInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpPIPPrimaryDoctor, com.guidewire._generated.entity.TmpPIPPrimaryDoctorInternal>() {
      public java.lang.Object getImplementation(entity.TmpPIPPrimaryDoctor bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpPIPPrimaryDoctorInternal getInternalInterface(entity.TmpPIPPrimaryDoctor bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpPIPPrimaryDoctor newEmptyInstance() {
        return new entity.TmpPIPPrimaryDoctor((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}