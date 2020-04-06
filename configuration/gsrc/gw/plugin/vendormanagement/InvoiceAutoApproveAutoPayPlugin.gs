package gw.plugin.vendormanagement

uses java.util.List

/**
 * Used to handle the automatic approval and payments of ServiceRequestInvoices.
 */
@Export
class InvoiceAutoApproveAutoPayPlugin implements IInvoiceAutoProcessingPlugin {

  /**
   * @return An ordered list of {@link gw.plugin.vendormanagement.InvoiceAutomaticStateTransitionHelper}s to be applied
   * to an Invoice.
   */
  override property get StateTransitionHelpers(): List<InvoiceAutomaticStateTransitionHelper> {
    return {
      InvoiceAutoApprovalHelper.Instance,
      InvoiceAutoPaymentHelper.Instance
    }
  }

}
