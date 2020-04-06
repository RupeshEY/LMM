package gw.api.databuilder

uses gw.api.financials.CurrencyAmount

uses java.math.BigDecimal

@Export
class ServiceRequestStatementLineItemBuilder extends CCDataBuilder<ServiceRequestStatementLineItem, ServiceRequestStatementLineItemBuilder> {
  construct() {
    super(ServiceRequestStatementLineItem)
  }

  /**
   * Sets the amount for the service request line item. Note that the {@link ServiceRequestStatement} must be set before calling this!
   * @param amount the desired value
   * @return the modified builder
   */
  function withAmount(amount : CurrencyAmount) : ServiceRequestStatementLineItemBuilder {
    set(ServiceRequestStatementLineItem#Amount, amount)
    return this
  }
  
  /**
   * Sets the amount for the service request line item in the default currency. Note that the {@link ServiceRequestStatement} must be set before calling this!
   * @param amount the desired value
   * @return the modified builder
   */
  function withAmount(amount : BigDecimal) : ServiceRequestStatementLineItemBuilder {
    set(ServiceRequestStatementLineItem#Amount, amount.ofDefaultCurrency())
    return this
  }

  /**
   * Sets the category for the service request line item.
   * @param category the desired category
   * @return the modified builder
   */
  function withCategory(category : ServiceRequestStatementLineItemCategory) : ServiceRequestStatementLineItemBuilder {
    set(ServiceRequestStatementLineItem#Category, category)
    return this
  }
  
  /**
   * Sets the description for the service request line item.
   * @param description the desired description
   * @return the modified builder
   */
  function withDescription(description : String) : ServiceRequestStatementLineItemBuilder {
    set(ServiceRequestStatementLineItem#Description, description)
    return this
  }

  /**
   * Sets the service request statement for the line item.
   * @param serviceRequestStatement a value generator that will return the desired value
   * @return the modified builder
   */
  function onServiceRequestStatement(serviceRequestStatement : ServiceRequestStatement) : ServiceRequestStatementLineItemBuilder {
    return onServiceRequestStatement(ExistingBean.wrap(serviceRequestStatement))
  }

  /**
   * Sets the service request statement for the line item.
   * @param serviceRequestStatement a value generator that will return the desired value
   * @return the modified builder
   */
  function onServiceRequestStatement(serviceRequestStatement : ValueGenerator< ServiceRequestStatement >) : ServiceRequestStatementLineItemBuilder {
    set(ServiceRequestStatementLineItem#ServiceRequestStatement, serviceRequestStatement)
    return this
  }
}