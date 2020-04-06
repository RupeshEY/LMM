package entity;

/**
 * NonProportionalRIAgreement
 * Non-proportional reinsurance agreement.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "NonProportionalRIAgreement.eti;NonProportionalRIAgreement.eix;NonProportionalRIAgreement.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class NonProportionalRIAgreement extends entity.RIAgreement {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.NonProportionalRIAgreement> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.NonProportionalRIAgreement>("entity.NonProportionalRIAgreement");
  
  protected NonProportionalRIAgreement(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.NonProportionalRIAgreementInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.NonProportionalRIAgreementInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.NonProportionalRIAgreementInternal)super.__getInternalInterface();
  }
  
  static {
    com.guidewire._generated.entity.NonProportionalRIAgreementInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.NonProportionalRIAgreement, com.guidewire._generated.entity.NonProportionalRIAgreementInternal>() {
      public java.lang.Object getImplementation(entity.NonProportionalRIAgreement bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.NonProportionalRIAgreementInternal getInternalInterface(entity.NonProportionalRIAgreement bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}