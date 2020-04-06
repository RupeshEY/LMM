package gw.plugin.bulkinvoice.impl;

uses gw.plugin.financials.IBulkInvoiceValidationPlugin

@Export
/**
 * A convenience plugin, primarily for simulating invalid Invoices in Tests. Considers an Invoice as invalid if it's
 * InvoiceNumber contains the word "fail" in it. Also populates the Invoice with two BIValidationAlerts, with their
 * AlertType is set to BIValidationAlertType.TC_UNSPECIFIED. Also, the first alert will have it's AlertMsg set to
 * the value of the class constant FIRST_VALIDATION_ALERT_MSG, and the second one will have it's set to the value of
 * class constant SECOND_VALIDATION_ALERT_MSG.
*/
class SampleBulkInvoiceValidationPlugin implements IBulkInvoiceValidationPlugin {

  public static final var FIRST_VALIDATION_ALERT_MSG : String = "1st Failure"
  public static final var SECOND_VALIDATION_ALERT_MSG : String = "2nd Failure"

  public override function validateBulkInvoice(bulkInvoice : BulkInvoice) : BIValidationAlert[] {
    var validationAlerts : BIValidationAlert[] = {}

    // As a convenience for testing, we'll generate two validation alerts if the InvoiceNumber contains the word "fail"
    if (bulkInvoice.InvoiceNumber != null  and  bulkInvoice.InvoiceNumber.containsIgnoreCase("fail")) {
      var alert1 = new BIValidationAlert()
      // The BIValidationAlertType typelist is extendable
      alert1.AlertType = BIValidationAlertType.TC_UNSPECIFIED
      // This message will be displayed in the UI, and so should be meaningful to the user
      alert1.AlertMsg = FIRST_VALIDATION_ALERT_MSG

      var alert2 = new BIValidationAlert()
      alert2.AlertType = null
      alert2.AlertMsg = SECOND_VALIDATION_ALERT_MSG

      validationAlerts = { alert1, alert2 }
    }

    return validationAlerts
  }

}
