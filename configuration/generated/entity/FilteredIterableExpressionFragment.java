package entity;

/**
 * FilteredIterableExpressionFragment
 * Abstract expression fragment representing an expression with an iterable that has its elements filtered down by a condition
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FilteredIterableExpressionFragment.eti;FilteredIterableExpressionFragment.eix;FilteredIterableExpressionFragment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class FilteredIterableExpressionFragment extends entity.ConditionExpressionFragment {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.FilteredIterableExpressionFragment> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.FilteredIterableExpressionFragment>("entity.FilteredIterableExpressionFragment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ITERABLEEXPRESSIONJOIN_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "IterableExpressionJoin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ITERABLEEXPRESSIONJOINARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "IterableExpressionJoinArray");
  
  protected FilteredIterableExpressionFragment(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.FilteredIterableExpressionFragmentInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.FilteredIterableExpressionFragmentInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.FilteredIterableExpressionFragmentInternal)super.__getInternalInterface();
  }
  
  public entity.ExpressionFragment getIterableExpression() {
    return ((com.guidewire.bizrules.domain.FilteredIterableExpressionFragmentDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.FilteredIterableExpressionFragmentDomainMethods")).getIterableExpression();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FilteredIterableExpressionFragmentJoin getIterableExpressionJoin() {
    return (entity.FilteredIterableExpressionFragmentJoin)__getInternalInterface().getFieldValue(ITERABLEEXPRESSIONJOIN_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FilteredIterableExpressionFragmentJoin[] getIterableExpressionJoinArray() {
    return (entity.FilteredIterableExpressionFragmentJoin[])__getInternalInterface().getFieldValue(ITERABLEEXPRESSIONJOINARRAY_PROP.get());
  }
  
  public void setIterableExpression(entity.ExpressionFragment arg0) {
    ((com.guidewire.bizrules.domain.FilteredIterableExpressionFragmentDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.FilteredIterableExpressionFragmentDomainMethods")).setIterableExpression(arg0);
  }
  
  /**
   * Sets the value of the IterableExpressionJoin field.
   */
  private void setIterableExpressionJoin(entity.FilteredIterableExpressionFragmentJoin value) {
    __getInternalInterface().setFieldValue(ITERABLEEXPRESSIONJOIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IterableExpressionJoinArray field.
   */
  private void setIterableExpressionJoinArray(entity.FilteredIterableExpressionFragmentJoin[] value) {
    __getInternalInterface().setFieldValue(ITERABLEEXPRESSIONJOINARRAY_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.FilteredIterableExpressionFragmentInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.FilteredIterableExpressionFragment, com.guidewire._generated.entity.FilteredIterableExpressionFragmentInternal>() {
      public java.lang.Object getImplementation(entity.FilteredIterableExpressionFragment bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.FilteredIterableExpressionFragmentInternal getInternalInterface(entity.FilteredIterableExpressionFragment bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}