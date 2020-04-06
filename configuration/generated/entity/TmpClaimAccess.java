package entity;

/**
 * TmpClaimAccess
 * Tmp table that records information about users and groups that are allowed to access a claim during upgrade.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpClaimAccess.eti;TmpClaimAccess.eix;TmpClaimAccess.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpClaimAccess")
public class TmpClaimAccess extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpClaimAccess> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpClaimAccess>("entity.TmpClaimAccess");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ANYONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Anyone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> GROUPID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "GroupID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PERMISSION_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Permission");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SECURITYZONEID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SecurityZoneID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> USERID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UserID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpClaimAccessInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpClaimAccess()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpClaimAccess(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpClaimAccess(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpClaimAccessInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpClaimAccessInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the ClaimID field.
   * A foreign key to the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMID_PROP.get());
  }
  
  /**
   * Gets the value of the GroupID field.
   * The permitted group.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getGroupID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(GROUPID_PROP.get());
  }
  
  /**
   * Gets the value of the Permission field.
   * The type of permission being granted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimAccessType getPermission() {
    return (typekey.ClaimAccessType)__getInternalInterface().getFieldValue(PERMISSION_PROP.get());
  }
  
  /**
   * Gets the value of the SecurityZoneID field.
   * The permitted security zone.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getSecurityZoneID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(SECURITYZONEID_PROP.get());
  }
  
  /**
   * Gets the value of the UserID field.
   * The permitted user.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getUserID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(USERID_PROP.get());
  }
  
  /**
   * Gets the value of the Anyone field.
   * Whether this permission should be granted to everyone.  If true then GroupID, UserID, and SecurityZoneID should be null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAnyone() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ANYONE_PROP.get());
  }
  
  /**
   * Sets the value of the Anyone field.
   */
  public void setAnyone(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ANYONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimID field.
   */
  public void setClaimID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CLAIMID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GroupID field.
   */
  public void setGroupID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(GROUPID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Permission field.
   */
  public void setPermission(typekey.ClaimAccessType value) {
    __getInternalInterface().setFieldValue(PERMISSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SecurityZoneID field.
   */
  public void setSecurityZoneID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(SECURITYZONEID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UserID field.
   */
  public void setUserID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(USERID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpClaimAccessInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpClaimAccess.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the ClaimID field.
     * A foreign key to the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getClaimID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMID_PROP.get());
    }
    
    /**
     * Gets the value of the GroupID field.
     * The permitted group.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getGroupID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(GROUPID_PROP.get());
    }
    
    /**
     * Gets the value of the Permission field.
     * The type of permission being granted.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimAccessType getPermission() {
      return (typekey.ClaimAccessType)__getInternalInterface().getFieldValue(PERMISSION_PROP.get());
    }
    
    /**
     * Gets the value of the SecurityZoneID field.
     * The permitted security zone.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getSecurityZoneID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(SECURITYZONEID_PROP.get());
    }
    
    /**
     * Gets the value of the UserID field.
     * The permitted user.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getUserID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(USERID_PROP.get());
    }
    
    /**
     * Gets the value of the Anyone field.
     * Whether this permission should be granted to everyone.  If true then GroupID, UserID, and SecurityZoneID should be null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAnyone() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ANYONE_PROP.get());
    }
    
    /**
     * Sets the value of the Anyone field.
     */
    public void setAnyone(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ANYONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimID field.
     */
    public void setClaimID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CLAIMID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GroupID field.
     */
    public void setGroupID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(GROUPID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Permission field.
     */
    public void setPermission(typekey.ClaimAccessType value) {
      __getInternalInterface().setFieldValue(PERMISSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SecurityZoneID field.
     */
    public void setSecurityZoneID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(SECURITYZONEID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UserID field.
     */
    public void setUserID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(USERID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.claim.entity.TmpClaimAccess", "com.guidewire.cc.domain.claim.impl.TmpClaimAccessImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpClaimAccess.class, config);
    com.guidewire._generated.entity.TmpClaimAccessInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpClaimAccess, com.guidewire._generated.entity.TmpClaimAccessInternal>() {
      public java.lang.Object getImplementation(entity.TmpClaimAccess bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpClaimAccessInternal getInternalInterface(entity.TmpClaimAccess bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpClaimAccess newEmptyInstance() {
        return new entity.TmpClaimAccess((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}