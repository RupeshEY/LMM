package entity;

/**
 * TmpNewTAcctJoinTbl
 * table used to do a cartesian join to produce the 2 new taccounts for rejection of transactions in Nozomi
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpNewTAcctJoinTbl.eti;TmpNewTAcctJoinTbl.eix;TmpNewTAcctJoinTbl.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpNewTAcctJoinTbl")
public class TmpNewTAcctJoinTbl extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpNewTAcctJoinTbl> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpNewTAcctJoinTbl>("entity.TmpNewTAcctJoinTbl");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TACCOUNTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TAccountType");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpNewTAcctJoinTblInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpNewTAcctJoinTbl()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpNewTAcctJoinTbl(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpNewTAcctJoinTbl(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpNewTAcctJoinTblInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpNewTAcctJoinTblInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the TAccountType field.
   * Either the new Recoveries or new CommittedErodingPmts TAccountType
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TAccountType getTAccountType() {
    return (typekey.TAccountType)__getInternalInterface().getFieldValue(TACCOUNTTYPE_PROP.get());
  }
  
  /**
   * Sets the value of the TAccountType field.
   */
  public void setTAccountType(typekey.TAccountType value) {
    __getInternalInterface().setFieldValue(TACCOUNTTYPE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpNewTAcctJoinTblInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpNewTAcctJoinTbl.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the TAccountType field.
     * Either the new Recoveries or new CommittedErodingPmts TAccountType
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TAccountType getTAccountType() {
      return (typekey.TAccountType)__getInternalInterface().getFieldValue(TACCOUNTTYPE_PROP.get());
    }
    
    /**
     * Sets the value of the TAccountType field.
     */
    public void setTAccountType(typekey.TAccountType value) {
      __getInternalInterface().setFieldValue(TACCOUNTTYPE_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.taccount.entity.TmpNewTAcctJoinTbl", "com.guidewire.cc.domain.financials.taccount.impl.TmpNewTAcctJoinTblImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpNewTAcctJoinTbl.class, config);
    com.guidewire._generated.entity.TmpNewTAcctJoinTblInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpNewTAcctJoinTbl, com.guidewire._generated.entity.TmpNewTAcctJoinTblInternal>() {
      public java.lang.Object getImplementation(entity.TmpNewTAcctJoinTbl bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpNewTAcctJoinTblInternal getInternalInterface(entity.TmpNewTAcctJoinTbl bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpNewTAcctJoinTbl newEmptyInstance() {
        return new entity.TmpNewTAcctJoinTbl((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}