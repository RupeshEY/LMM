package entity;

/**
 * ECFDocumentMessage_Ext
 * ECF Messages which require a Foriegn Key to a Document entity
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFDocumentMessage_Ext.eti;ECFDocumentMessage_Ext.eix;ECFDocumentMessage_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class ECFDocumentMessage_Ext extends entity.ECFMessage_Ext {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ECFDocumentMessage_Ext> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ECFDocumentMessage_Ext>("entity.ECFDocumentMessage_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DOCUMENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Document");
  
  protected ECFDocumentMessage_Ext(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.ECFDocumentMessage_ExtInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.ECFDocumentMessage_ExtInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ECFDocumentMessage_ExtInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the Document field.
   * The Document which relates to this message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Document getDocument() {
    return (entity.Document)__getInternalInterface().getFieldValue(DOCUMENT_PROP.get());
  }
  
  /**
   * Sets the value of the Document field.
   */
  public void setDocument(entity.Document value) {
    __getInternalInterface().setFieldValue(DOCUMENT_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.ECFDocumentMessage_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.ECFDocumentMessage_Ext, com.guidewire._generated.entity.ECFDocumentMessage_ExtInternal>() {
      public java.lang.Object getImplementation(entity.ECFDocumentMessage_Ext bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ECFDocumentMessage_ExtInternal getInternalInterface(entity.ECFDocumentMessage_Ext bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}