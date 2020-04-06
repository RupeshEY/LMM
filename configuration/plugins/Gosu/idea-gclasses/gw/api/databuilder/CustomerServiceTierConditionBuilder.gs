package gw.api.databuilder

@Export
public class CustomerServiceTierConditionBuilder extends ClassificationConditionBuilder<CustomerServiceTierCondition, CustomerServiceTierConditionBuilder>{

  public construct() {
    super(CustomerServiceTierCondition)
  }

  public static function anyCustomerServiceTier() : CustomerServiceTierConditionBuilder {
    return new CustomerServiceTierConditionBuilder().withIncludeAll(true)
  }
  
  public static function filterOn(cst : CustomerServiceTier) : CustomerServiceTierConditionBuilder {
    return new CustomerServiceTierConditionBuilder().withIncludeAll(false)
                    .withConditionFilter(new CustomerServiceTierConditionFilterBuilder().withCustomerServiceTier(cst))
  }
  
  public function withConditionFilter(filter : ValueGenerator< CustomerServiceTierConditionFilter >) : CustomerServiceTierConditionBuilder {
    addArrayElement(CustomerServiceTierCondition.Type.TypeInfo.getProperty("ConditionFilters"), filter)
    return this
  }

}
