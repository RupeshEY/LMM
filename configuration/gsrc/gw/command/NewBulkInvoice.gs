package gw.command
uses gw.api.databuilder.ClaimBuilder
uses gw.api.databuilder.BulkInvoiceItemBuilder
uses gw.api.databuilder.BulkInvoiceBuilder
uses java.math.BigDecimal

@Export
class NewBulkInvoice extends CCBaseCommand {

  function withDefault() {
    BulkInvoiceBuilder.uiReadyBulkInvoice()
                  .withItem( new BulkInvoiceItemBuilder()
                                        .withClaim(ClaimBuilder.uiReadyAuto()
                                                             .withNonConflictingClaimNumber())
                                        .withPaymentType(PaymentType.TC_FINAL)
                                        .withUnspecifiedCostTypeCostCategory()
                                        .withAmount(BigDecimal.valueOf(100.00).ofDefaultCurrency()) )
                  .create(Bundle)
    Bundle.commit()
    pcf.BulkPay.go()
  }

}
