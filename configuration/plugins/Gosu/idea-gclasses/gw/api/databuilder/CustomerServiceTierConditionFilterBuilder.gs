package gw.api.databuilder

@Export
public class CustomerServiceTierConditionFilterBuilder extends ConditionFilterBuilder<CustomerServiceTierConditionFilter, CustomerServiceTierConditionFilterBuilder>{

  public construct() {
    super(CustomerServiceTierConditionFilter)
  }
  
  
  public function withCustomerServiceTier(cst : CustomerServiceTier) : CustomerServiceTierConditionFilterBuilder {
    set(CustomerServiceTierConditionFilter.Type.TypeInfo.getProperty("CustomerServiceTier"), cst)
    return this
  }

}
