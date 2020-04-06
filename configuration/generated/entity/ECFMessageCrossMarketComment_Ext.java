package entity;

/**
 * ECFMessageCrossMarketComment_Ext
 * Cross market comment
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageCrossMarketComment_Ext.eti;ECFMessageCrossMarketComment_Ext.eix;ECFMessageCrossMarketComment_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class ECFMessageCrossMarketComment_Ext extends entity.ECFMessageComment_Ext {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ECFMessageCrossMarketComment_Ext> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ECFMessageCrossMarketComment_Ext>("entity.ECFMessageCrossMarketComment_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> BUREAUAGENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "BureauAgency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SYNDICATENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SyndicateName");
  
  protected ECFMessageCrossMarketComment_Ext(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.ECFMessageCrossMarketComment_ExtInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.ECFMessageCrossMarketComment_ExtInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ECFMessageCrossMarketComment_ExtInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the BureauAgency field.
   * The bureau that the cross market comments are related to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFBureauType_Ext getBureauAgency() {
    return (typekey.ECFBureauType_Ext)__getInternalInterface().getFieldValue(BUREAUAGENCY_PROP.get());
  }
  
  /**
   * Gets the value of the SyndicateName field.
   * The name of the agreement party who has made the comment on the mixed bureau claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSyndicateName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SYNDICATENAME_PROP.get());
  }
  
  /**
   * Sets the value of the BureauAgency field.
   */
  public void setBureauAgency(typekey.ECFBureauType_Ext value) {
    __getInternalInterface().setFieldValue(BUREAUAGENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SyndicateName field.
   */
  public void setSyndicateName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SYNDICATENAME_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.ECFMessageCrossMarketComment_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.ECFMessageCrossMarketComment_Ext, com.guidewire._generated.entity.ECFMessageCrossMarketComment_ExtInternal>() {
      public java.lang.Object getImplementation(entity.ECFMessageCrossMarketComment_Ext bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ECFMessageCrossMarketComment_ExtInternal getInternalInterface(entity.ECFMessageCrossMarketComment_Ext bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}