package entity;

/**
 * ECFMessage_Ext
 * Supertype for all ECF Message entities
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessage_Ext.eti;ECFMessage_Ext.eix;ECFMessage_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class ECFMessage_Ext extends entity.LMMessage_Ext {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ECFMessage_Ext> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ECFMessage_Ext>("entity.ECFMessage_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RESPONSEACKNOWLEDGEMENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ResponseAcknowledgement");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ROLE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Role");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TR");
  
  protected ECFMessage_Ext(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.ECFMessage_ExtInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.ECFMessage_ExtInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ECFMessage_ExtInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the ClaimType field.
   * The three-digit ECF Code specifying the type of Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimTypeCode_Ext getClaimType() {
    return (typekey.ECFClaimTypeCode_Ext)__getInternalInterface().getFieldValue(CLAIMTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredId field.
   * Insured Id come with in the message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDID_PROP.get());
  }
  
  /**
   * Gets the value of the ResponseAcknowledgement field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageResponseAcknowledgement_Ext getResponseAcknowledgement() {
    return (entity.ECFMessageResponseAcknowledgement_Ext)__getInternalInterface().getFieldValue(RESPONSEACKNOWLEDGEMENT_PROP.get());
  }
  
  /**
   * Gets the value of the Role field.
   * The role the receiver had in this message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFParticipantFunction_Ext getRole() {
    return (typekey.ECFParticipantFunction_Ext)__getInternalInterface().getFieldValue(ROLE_PROP.get());
  }
  
  /**
   * Gets the value of the TR field.
   * Transaction reference for the Transaction this message belongs to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTR() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TR_PROP.get());
  }
  
  /**
   * Sets the value of the ClaimType field.
   */
  public void setClaimType(typekey.ECFClaimTypeCode_Ext value) {
    __getInternalInterface().setFieldValue(CLAIMTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredId field.
   */
  public void setInsuredId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ResponseAcknowledgement field.
   */
  public void setResponseAcknowledgement(entity.ECFMessageResponseAcknowledgement_Ext value) {
    __getInternalInterface().setFieldValue(RESPONSEACKNOWLEDGEMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Role field.
   */
  public void setRole(typekey.ECFParticipantFunction_Ext value) {
    __getInternalInterface().setFieldValue(ROLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TR field.
   */
  public void setTR(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TR_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.ECFMessage_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.ECFMessage_Ext, com.guidewire._generated.entity.ECFMessage_ExtInternal>() {
      public java.lang.Object getImplementation(entity.ECFMessage_Ext bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ECFMessage_ExtInternal getInternalInterface(entity.ECFMessage_Ext bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}