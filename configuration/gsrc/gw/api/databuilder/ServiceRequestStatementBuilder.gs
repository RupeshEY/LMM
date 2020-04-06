package gw.api.databuilder

uses gw.api.databuilder.populator.AbstractBeanPopulator
uses gw.api.financials.CurrencyAmount
uses gw.entity.IEntityType

uses java.math.BigDecimal
uses java.util.Date

@Export
class ServiceRequestStatementBuilder<T extends ServiceRequestStatement, B extends ServiceRequestStatementBuilder<T, B>> extends CCDataBuilder<T, B> {

  private static final var AMOUNT_POPULATOR_KEY = new Object()

  /**
   * Sets:
   * <ul>
   * <li>Description - a non-null string
   * <li>Amount - $100 (USD)
   * <li>StatementCreationTime - now
   * </ul>
   */
  construct(type : IEntityType) {
    super(type)
    set(T#Description, "new statement")
    set(T#StatementCreationTime, Date.CurrentDate)

    addAmountPopulator(new CurrencyAmount(100, Currency.TC_USD))
  }

  /**
   * Sets the creation datetime for the service request statement.
   * @param datetime the desired value
   * @return the modified builder
   */
  function withStatementCreationTime(datetime : Date) : B {
    set(T#StatementCreationTime, datetime)
    return thisAsB()
  }

  /**
   * Sets the service request for the quote.
   * @param serviceRequest the desired value
   * @return the modified builder
   */
  function onServiceRequest(serviceRequest : ServiceRequest) : B {
    return onServiceRequest(ExistingBean.wrap(serviceRequest))
  }

  /**
   * Sets the service request for the quote.
   * @param serviceRequest a value generator that will return the desired value
   * @return the modified builder
   */
  function onServiceRequest(serviceRequest : ValueGenerator< ServiceRequest >) : B {
    set(T#ServiceRequest, serviceRequest)
    return thisAsB()
  }
  
   /**
   * Sets the description for the service request quote.
   * @param description the desired value
   * @return the modified builder
   */
  function withDescription(description : String) : B {
    set(T#Description, description)
    return thisAsB()
  }
  
  /**
   * Sets the reference number for the service request statement.
   * @param refNumber the desired value
   * @return the modified builder
   */
  function withReferenceNumber(refNumber : String) : B {
    set(T#ReferenceNumber, refNumber)
    return thisAsB()
  }

  private function addAmountPopulator(amount : CurrencyAmount) {
    addPopulator(AMOUNT_POPULATOR_KEY, new AbstractBeanPopulator<T>({}) {
      override function execute(statement : T, values : Object[]) {
        new ServiceRequestStatementLineItemBuilder()
            .onServiceRequestStatement(statement)
            .withAmount(amount)
            .create(statement.Bundle)
      }
    })
  }

  /**
   * Sets the amount for the service request quote. It creates a single line item with the supplied amount. This
   * method is provided for backwards compatibility; the preferred way is for the caller to add the line items
   * themselves using withLineItem(). Note that this method removes any existing line items so as to guarantee that the
   * the resulting ServiceRequestStatement.Amount is equal to the argument supplied here. Thus any particular client
   * should either use this method or withLineItem, and not both.
   * @param amount the desired value
   * @return the modified builder
   */
  function withAmount(amount: CurrencyAmount): B {
    removePopulator(ServiceRequestStatement#LineItems.PropertyInfo)
    addAmountPopulator(amount)
    return thisAsB()
  }

  /**
   * Add a {@link ServiceRequestStatementLineItem} to the service request statement. This method will remove any amount that
   * was set through withAmount(), thus any particular client should either use this method or withAmount(), and not
   * both.
   * @param lineItem the ServiceRequestStatementLineItem to add
   * @return the modified builder
   */
  function withLineItem(lineItem: ServiceRequestStatementLineItem): B {
    return withLineItem(ExistingBean.wrap(lineItem))
  }

  /**
   * Add a {@link ServiceRequestStatementLineItem} to the service request statement
   * @param lineItem a value generator that will return the {@link ServiceRequestStatementLineItem} to add
   * @return the modified builder
   */
  function withLineItem(lineItem : ValueGenerator< ServiceRequestStatementLineItem >): B {
    removePopulator(AMOUNT_POPULATOR_KEY);
    addArrayElement(T#LineItems, lineItem)
    return thisAsB()
  }

  /**
   * Create a {@link ServiceRequestStatementLineItem} using the supplied parameters and add it to this service request statement
   * @param amount
   * @return the modified builder
   */
  function withLineItem(amount: CurrencyAmount): B {
    var lineItem = addNewLineItem(amount)
    return thisAsB()
  }

  /**
   * Create a {@link ServiceRequestStatementLineItem} using the supplied parameters and add it to this service request statement.
   * The {@link ServiceRequestStatemtentLineItemBuilder} will convert this to a currency.
   * @param amount
   * @return the modified builder
   */
  function withLineItem(amount: BigDecimal): B {
    var lineItem = addNewLineItem(amount)
    return thisAsB()
  }

  /**
   * Create a {@link ServiceRequestStatementLineItem} using the supplied parameters and add it to this service request statement
   * @param amount
   * @param category
   * @param description
   * @return the modified builder
   */
  function withLineItem(amount: CurrencyAmount, category: ServiceRequestStatementLineItemCategory, description: String): B {
    var lineItem = addNewLineItem(amount)
        .withCategory(category)
        .withDescription(description)

    return thisAsB()
  }

  /**
   * Create a {@link ServiceRequestStatementLineItem} using the supplied parameters and add it to this service request statement
   * The {@link ServiceRequestStatemtentLineItemBuilder} will convert this to a currency.
   * @param amount
   * @param category
   * @param description
   * @return the modified builder
   */
  function withLineItem(amount: BigDecimal, category: ServiceRequestStatementLineItemCategory, description: String): B {
    var lineItem = addNewLineItem(amount)
        .withCategory(category)
        .withDescription(description)

    return thisAsB()
  }

  /**
   * Create a new {@link ServiceRequestStatementLineItem} on this statement
   * @param amount
   * @param category
   * @param description
   * @return the new line item
   */
  protected function addNewLineItem(): ServiceRequestStatementLineItemBuilder {
    return new ServiceRequestStatementLineItemBuilder().onServiceRequestStatement(this)
  }

  /**
   * Create a new {@link ServiceRequestStatementLineItem} on this statement
   * @param amount
   * @return the new line item
   */
  protected function addNewLineItem(amount: CurrencyAmount): ServiceRequestStatementLineItemBuilder {
    return addNewLineItem().withAmount(amount)
  }

  /**
   * Create a new {@link ServiceRequestStatementLineItem} on this statement. The line item builder will convert this to a currency.
   * The {@link ServiceRequestStatemtentLineItemBuilder} will convert this to a currency.
   *
   * @param amount
   * @return the new line item
   */
  protected function addNewLineItem(amount: BigDecimal): ServiceRequestStatementLineItemBuilder {
    return addNewLineItem().withAmount(amount)
  }

  /**
   * Adds the document to the service request quote
   * @param document to be linked to the service request quote
   * @return the modified builder
   */
  function withDocument(document : Document) : B {
    return withDocument(ExistingBean.wrap(document))
  }
  
  /**
   * Add a document to the service request quote
   * @param document a value generator that will return the document to add
   * @return the modified builder
   */
  function withDocument(document : ValueGenerator < Document >): B {
    addPopulator(new AbstractBeanPopulator<T> ({document}){
      override function execute(bean : T, vals : Object[]) {
        var serviceRequestStatement = bean as ServiceRequestStatement
        serviceRequestStatement.linkDocument(vals.single() as Document)
      }
    })
    return thisAsB()
  }

  /**
  * Add a declined reason for the statement
   * @param declinedReasons the reason for being declined
   * @return the modified builder
  */

  function withDeclinedReason(declinedReasons : String) : B {
    set(T#DeclinedReason, declinedReasons)
    return thisAsB()
  }

}
