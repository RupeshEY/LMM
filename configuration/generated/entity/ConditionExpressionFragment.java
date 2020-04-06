package entity;

/**
 * ConditionExpressionFragment
 * ExpressionFragment for the case when the expression is a RuleCondition, e.g. the expression for a RuleCommandParameter
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ConditionExpressionFragment.eti;ConditionExpressionFragment.eix;ConditionExpressionFragment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class ConditionExpressionFragment extends entity.ExpressionFragment {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ConditionExpressionFragment> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ConditionExpressionFragment>("entity.ConditionExpressionFragment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDITIONALSYMBOLNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AdditionalSymbolName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RULECONDITION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RuleCondition");
  
  protected ConditionExpressionFragment(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.ConditionExpressionFragmentInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.ConditionExpressionFragmentInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ConditionExpressionFragmentInternal)super.__getInternalInterface();
  }
  
  public void ensureNoSymbolConflicts(gw.bizrules.context.provider.RuleContextDefinitionProvider arg0) {
    ((com.guidewire.bizrules.domain.ConditionExpressionFragmentDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.ConditionExpressionFragmentDomainMethods")).ensureNoSymbolConflicts(arg0);
  }
  
  /**
   * Gets the value of the AdditionalSymbolName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAdditionalSymbolName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDITIONALSYMBOLNAME_PROP.get());
  }
  
  public gw.lang.reflect.IType getAdditionalSymbolType() {
    return ((com.guidewire.bizrules.domain.ConditionExpressionFragmentDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.ConditionExpressionFragmentDomainMethods")).getAdditionalSymbolType();
  }
  
  /**
   * Gets the value of the RuleCondition field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCondition getRuleCondition() {
    return (entity.RuleCondition)__getInternalInterface().getFieldValue(RULECONDITION_PROP.get());
  }
  
  /**
   * Sets the value of the AdditionalSymbolName field.
   */
  public void setAdditionalSymbolName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADDITIONALSYMBOLNAME_PROP.get(), value);
  }
  
  public void setAdditionalSymbolType(gw.lang.reflect.IType arg0) {
    ((com.guidewire.bizrules.domain.ConditionExpressionFragmentDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.ConditionExpressionFragmentDomainMethods")).setAdditionalSymbolType(arg0);
  }
  
  /**
   * Sets the value of the RuleCondition field.
   */
  public void setRuleCondition(entity.RuleCondition value) {
    __getInternalInterface().setFieldValue(RULECONDITION_PROP.get(), value);
  }
  
  public void updateAdditionalSymbolBasedOnType(gw.lang.reflect.IType arg0, gw.bizrules.context.provider.RuleContextDefinitionProvider arg1) {
    ((com.guidewire.bizrules.domain.ConditionExpressionFragmentDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.ConditionExpressionFragmentDomainMethods")).updateAdditionalSymbolBasedOnType(arg0, arg1);
  }
  
  static {
    com.guidewire._generated.entity.ConditionExpressionFragmentInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.ConditionExpressionFragment, com.guidewire._generated.entity.ConditionExpressionFragmentInternal>() {
      public java.lang.Object getImplementation(entity.ConditionExpressionFragment bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ConditionExpressionFragmentInternal getInternalInterface(entity.ConditionExpressionFragment bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}