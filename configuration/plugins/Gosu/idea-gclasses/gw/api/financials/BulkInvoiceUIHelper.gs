package gw.api.financials

/**
 * This class provides helpful methods for all the pages related to BulkInvoice.
 */
@Export
class BulkInvoiceUIHelper {

  /**
  * Callback that gets invoked just before submitting a BulkInvoice. This OOTB implementation updates the RequestingUser
  * of the BulkInvoice to the currently logged in user, if they are determined to be different. This is to handle the
  * cases where one user creates the BulkInvoice and another one (say, an admin) submits it.
  */
  static function beforeSubmit(bulkInvoice : BulkInvoice) {
    var currentUser = User.util.CurrentUser
    if (currentUser != bulkInvoice.RequestingUser) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
        bundle.add(bulkInvoice).RequestingUser = currentUser
      })
    }
  }

}