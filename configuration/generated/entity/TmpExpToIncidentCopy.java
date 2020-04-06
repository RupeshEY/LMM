package entity;

/**
 * TmpExpToIncidentCopy
 * Temp table used to copy a variety of injury related fields from the cc_incident table to the cc_exposure table
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpExpToIncidentCopy.eti;TmpExpToIncidentCopy.eix;TmpExpToIncidentCopy.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpExpToIncidentCopy")
public class TmpExpToIncidentCopy extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpExpToIncidentCopy> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpExpToIncidentCopy>("entity.TmpExpToIncidentCopy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DETAILEDINJURYTYPETMP_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DetailedInjuryTypeTmp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> GENERALINJURYTYPETMP_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "GeneralInjuryTypeTmp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMPAIRMENTTMP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ImpairmentTmp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCIDENTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncidentID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSTWAGESTMP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LostWagesTmp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> MEDICALTRTMNTTYPETMP_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MedicaltrtmntTypeTmp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SEVERITYTMP_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SeverityTmp");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpExpToIncidentCopyInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpExpToIncidentCopy()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpExpToIncidentCopy(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpExpToIncidentCopy(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpExpToIncidentCopyInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpExpToIncidentCopyInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the DetailedInjuryTypeTmp field.
   * The DetailedInjuryType value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DetailedInjuryType getDetailedInjuryTypeTmp() {
    return (typekey.DetailedInjuryType)__getInternalInterface().getFieldValue(DETAILEDINJURYTYPETMP_PROP.get());
  }
  
  /**
   * Gets the value of the GeneralInjuryTypeTmp field.
   * The GeneralInjuryType value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InjuryType getGeneralInjuryTypeTmp() {
    return (typekey.InjuryType)__getInternalInterface().getFieldValue(GENERALINJURYTYPETMP_PROP.get());
  }
  
  /**
   * Gets the value of the ImpairmentTmp field.
   * The Impairment value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getImpairmentTmp() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(IMPAIRMENTTMP_PROP.get());
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
   * Gets the value of the MedicaltrtmntTypeTmp field.
   * The MedicalTreatmentType value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MedicalTreatmentType getMedicaltrtmntTypeTmp() {
    return (typekey.MedicalTreatmentType)__getInternalInterface().getFieldValue(MEDICALTRTMNTTYPETMP_PROP.get());
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
   * Gets the value of the LostWagesTmp field.
   * The LostWages value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLostWagesTmp() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOSTWAGESTMP_PROP.get());
  }
  
  /**
   * Sets the value of the DetailedInjuryTypeTmp field.
   */
  public void setDetailedInjuryTypeTmp(typekey.DetailedInjuryType value) {
    __getInternalInterface().setFieldValue(DETAILEDINJURYTYPETMP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GeneralInjuryTypeTmp field.
   */
  public void setGeneralInjuryTypeTmp(typekey.InjuryType value) {
    __getInternalInterface().setFieldValue(GENERALINJURYTYPETMP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ImpairmentTmp field.
   */
  public void setImpairmentTmp(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(IMPAIRMENTTMP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IncidentID field.
   */
  public void setIncidentID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(INCIDENTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LostWagesTmp field.
   */
  public void setLostWagesTmp(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(LOSTWAGESTMP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MedicaltrtmntTypeTmp field.
   */
  public void setMedicaltrtmntTypeTmp(typekey.MedicalTreatmentType value) {
    __getInternalInterface().setFieldValue(MEDICALTRTMNTTYPETMP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SeverityTmp field.
   */
  public void setSeverityTmp(typekey.SeverityType value) {
    __getInternalInterface().setFieldValue(SEVERITYTMP_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpExpToIncidentCopyInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpExpToIncidentCopy.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the DetailedInjuryTypeTmp field.
     * The DetailedInjuryType value to copy from cc_exposure to cc_incident
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DetailedInjuryType getDetailedInjuryTypeTmp() {
      return (typekey.DetailedInjuryType)__getInternalInterface().getFieldValue(DETAILEDINJURYTYPETMP_PROP.get());
    }
    
    /**
     * Gets the value of the GeneralInjuryTypeTmp field.
     * The GeneralInjuryType value to copy from cc_exposure to cc_incident
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.InjuryType getGeneralInjuryTypeTmp() {
      return (typekey.InjuryType)__getInternalInterface().getFieldValue(GENERALINJURYTYPETMP_PROP.get());
    }
    
    /**
     * Gets the value of the ImpairmentTmp field.
     * The Impairment value to copy from cc_exposure to cc_incident
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getImpairmentTmp() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(IMPAIRMENTTMP_PROP.get());
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
     * Gets the value of the MedicaltrtmntTypeTmp field.
     * The MedicalTreatmentType value to copy from cc_exposure to cc_incident
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MedicalTreatmentType getMedicaltrtmntTypeTmp() {
      return (typekey.MedicalTreatmentType)__getInternalInterface().getFieldValue(MEDICALTRTMNTTYPETMP_PROP.get());
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
     * Gets the value of the LostWagesTmp field.
     * The LostWages value to copy from cc_exposure to cc_incident
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isLostWagesTmp() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOSTWAGESTMP_PROP.get());
    }
    
    /**
     * Sets the value of the DetailedInjuryTypeTmp field.
     */
    public void setDetailedInjuryTypeTmp(typekey.DetailedInjuryType value) {
      __getInternalInterface().setFieldValue(DETAILEDINJURYTYPETMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GeneralInjuryTypeTmp field.
     */
    public void setGeneralInjuryTypeTmp(typekey.InjuryType value) {
      __getInternalInterface().setFieldValue(GENERALINJURYTYPETMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ImpairmentTmp field.
     */
    public void setImpairmentTmp(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(IMPAIRMENTTMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncidentID field.
     */
    public void setIncidentID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(INCIDENTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LostWagesTmp field.
     */
    public void setLostWagesTmp(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(LOSTWAGESTMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MedicaltrtmntTypeTmp field.
     */
    public void setMedicaltrtmntTypeTmp(typekey.MedicalTreatmentType value) {
      __getInternalInterface().setFieldValue(MEDICALTRTMNTTYPETMP_PROP.get(), value);
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
    config.put("gw.cc.exposure.entity.TmpExpToIncidentCopy", "com.guidewire.cc.domain.exposure.impl.TmpExpToIncidentCopyImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpExpToIncidentCopy.class, config);
    com.guidewire._generated.entity.TmpExpToIncidentCopyInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpExpToIncidentCopy, com.guidewire._generated.entity.TmpExpToIncidentCopyInternal>() {
      public java.lang.Object getImplementation(entity.TmpExpToIncidentCopy bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpExpToIncidentCopyInternal getInternalInterface(entity.TmpExpToIncidentCopy bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpExpToIncidentCopy newEmptyInstance() {
        return new entity.TmpExpToIncidentCopy((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}