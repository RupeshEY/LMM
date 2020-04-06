package entity;

/**
 * ProportionalRIAgreement
 * Proportional reinsurance agreement.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ProportionalRIAgreement.eti;ProportionalRIAgreement.eix;ProportionalRIAgreement.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class ProportionalRIAgreement extends entity.RIAgreement {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ProportionalRIAgreement> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ProportionalRIAgreement>("entity.ProportionalRIAgreement");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROPORTIONALSHARE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProportionalShare");
  
  protected ProportionalRIAgreement(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.ProportionalRIAgreementInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.ProportionalRIAgreementInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ProportionalRIAgreementInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the ProportionalShare field.
   * Proportional Share
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getProportionalShare() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PROPORTIONALSHARE_PROP.get());
  }
  
  /**
   * Sets the value of the ProportionalShare field.
   */
  public void setProportionalShare(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PROPORTIONALSHARE_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.ProportionalRIAgreementInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.ProportionalRIAgreement, com.guidewire._generated.entity.ProportionalRIAgreementInternal>() {
      public java.lang.Object getImplementation(entity.ProportionalRIAgreement bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ProportionalRIAgreementInternal getInternalInterface(entity.ProportionalRIAgreement bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}