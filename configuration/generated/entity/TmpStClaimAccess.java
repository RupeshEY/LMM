package entity;

/**
 * TmpStClaimAccess
 * Tmp table that records information about users and groups that are allowed to access a claim.  Used for staging table population of new claims.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpStClaimAccess.eti;TmpStClaimAccess.eix;TmpStClaimAccess.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpStClaimAccess")
public class TmpStClaimAccess extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpStClaimAccess> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpStClaimAccess>("entity.TmpStClaimAccess");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ANYONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Anyone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> GROUPID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "GroupID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERMISSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Permission");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SECURITYZONEID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SecurityZoneID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> USERID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UserID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpStClaimAccessInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpStClaimAccess()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpStClaimAccess(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpStClaimAccess(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpStClaimAccessInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpStClaimAccessInternal __getInternalInterface() {
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
  public java.lang.String getClaimID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMID_PROP.get());
  }
  
  /**
   * Gets the value of the GroupID field.
   * The permitted group.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getGroupID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(GROUPID_PROP.get());
  }
  
  /**
   * Gets the value of the Permission field.
   * The type of permission being granted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPermission() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PERMISSION_PROP.get());
  }
  
  /**
   * Gets the value of the SecurityZoneID field.
   * The permitted security zone.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSecurityZoneID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SECURITYZONEID_PROP.get());
  }
  
  /**
   * Gets the value of the UserID field.
   * The permitted user.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUserID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(USERID_PROP.get());
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
  public void setClaimID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GroupID field.
   */
  public void setGroupID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(GROUPID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Permission field.
   */
  public void setPermission(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PERMISSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SecurityZoneID field.
   */
  public void setSecurityZoneID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SECURITYZONEID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UserID field.
   */
  public void setUserID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(USERID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpStClaimAccessInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpStClaimAccess.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the ClaimID field.
     * A foreign key to the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMID_PROP.get());
    }
    
    /**
     * Gets the value of the GroupID field.
     * The permitted group.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getGroupID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(GROUPID_PROP.get());
    }
    
    /**
     * Gets the value of the Permission field.
     * The type of permission being granted.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPermission() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PERMISSION_PROP.get());
    }
    
    /**
     * Gets the value of the SecurityZoneID field.
     * The permitted security zone.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSecurityZoneID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SECURITYZONEID_PROP.get());
    }
    
    /**
     * Gets the value of the UserID field.
     * The permitted user.  Exactly one of GroupID, UserID, and SecurityZoneID should be non-null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUserID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(USERID_PROP.get());
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
    public void setClaimID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GroupID field.
     */
    public void setGroupID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(GROUPID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Permission field.
     */
    public void setPermission(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PERMISSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SecurityZoneID field.
     */
    public void setSecurityZoneID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SECURITYZONEID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UserID field.
     */
    public void setUserID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(USERID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.claim.entity.TmpStClaimAccess", "com.guidewire.cc.domain.claim.impl.TmpStClaimAccessImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpStClaimAccess.class, config);
    com.guidewire._generated.entity.TmpStClaimAccessInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpStClaimAccess, com.guidewire._generated.entity.TmpStClaimAccessInternal>() {
      public java.lang.Object getImplementation(entity.TmpStClaimAccess bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpStClaimAccessInternal getInternalInterface(entity.TmpStClaimAccess bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpStClaimAccess newEmptyInstance() {
        return new entity.TmpStClaimAccess((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}