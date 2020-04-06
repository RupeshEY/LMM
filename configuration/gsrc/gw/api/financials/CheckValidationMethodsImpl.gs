package gw.api.financials
uses gw.api.locale.DisplayKey
uses gw.api.financials.CheckValidationMethods
uses java.util.HashSet
uses gw.api.util.DisplayableException
uses gw.util.BackupWithholdingCalculator

/**
 * These methods can be modified to change the validation performed on Check payees and payments
 * during the Check Wizard.
 */
@Export
class CheckValidationMethodsImpl implements CheckValidationMethods {

  var _check : Check

  construct( check : Check ) {
    _check = check
  }

  override function executePayeeEarlyValidation() {
    for (currentCheck in _check.CheckSet.Checks) {
      currentCheck.validateCheckPayees()
    }
  }

  override function executePaymentEarlyValidation() {
    // add early payment validation conditions here
  }
    
  /**
   * Performs various validation tests on the payees for a check.  These include whether the same payee is used more than once on a check, and whether
   * the check has more than one vendor as a payee.  If any problems are found, a UserDisplayableException with the proper error message is thrown.
   *
   * @param check the Check whose payees should be validated.
   */
  override function validateCheckPayees () {
    var payees = _check.getPayees()
    var payeeSet = new HashSet()
    var vendorsFound = 0
    for (checkPayee in payees) {
      // You cannot have the same Contact more than once on the same Check
      if (payeeSet.contains(checkPayee.getPayee())) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Java.NewPayment.Error.DuplicatePayees"))
      } else {
        payeeSet.add(checkPayee.getPayee())
      }
      // You cannot have more than one vendor on a Check
      if (ContactRole.TC_VENDOR==checkPayee.getPayeeType()) {
        if (vendorsFound == 1) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Java.NewPayment.Error.DuplicateVendor"))
        } else {
          vendorsFound++
        }
      }
      // You cannot have a Claimant payee type for a payee who is not a claimant on the check or exposures
      if(ContactRole.TC_CLAIMANT==checkPayee.getPayeeType()) {
        if (not payeeHasRole(ContactRole.TC_CLAIMANT, checkPayee.getClaimContact())) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Java.NewPayment.Error.IllegalClaimantType"))
        }
      }
      // You cannot have an Insured payee type for a payee who is not the insured on the check or exposures
      if(ContactRole.TC_INSURED==checkPayee.getPayeeType()) {
        if (not payeeHasRole(ContactRole.TC_INSURED, checkPayee.getClaimContact())) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Java.NewPayment.Error.IllegalInsuredType"))
        }
      }
      // if the check is Secondary ( !check.Primary ) and the check payee contact is a Vendor that requires
      // Backup Withholding, then display an error because Backup Withholding only works on the primary check
      if (not checkPayee.Check.Primary)
        if ( BackupWithholdingCalculator.isBackupWithholdingExpected(checkPayee) )
          throw new DisplayableException(DisplayKey.get("Java.NewPayment.Error.SecondaryVendorWithholding"))
    }
  }
  
  private function payeeHasRole (expectedRole : ContactRole, payee : ClaimContact) : boolean {
    var hasRole = false
    var roles = payee.getRoles()
    for (role in roles) {
      if (expectedRole.equals(role.getRole())) {
        hasRole = true
        break
      }
    }
    return hasRole
  }  
}
