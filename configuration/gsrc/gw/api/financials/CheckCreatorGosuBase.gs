package gw.api.financials

/**
 * Overrides the main CheckCreator methods, to perform modifications to the new check from Gosu.
 * The files ClaimCheckCreatorProviderImpl.gs and ExposureCheckCreatorProviderImpl.gs return this
 * class by default.
 * <p>
 * CheckCreator.createAndPrepareForCommit() cannot be overriden. It just calls the createCheck()
 * and prepareForCommit() methods.
 */
@Export
class CheckCreatorGosuBase extends CheckCreator {

  construct() {
  }

  /**
   * Creates the check defined by the current state of the CheckCreator. Use the methods that begin
   * "with...()" to specify the data to use when creating the Check and subsidiary entities.
   * After the Check is created by calling this method, the Check entity and its sub-objects may be modified.
   * As always, you must thoroughly test the results when modifying entities in this way.
   * <p>
   * After calling createCheck() and performing any modifications to the resulting Check, you must
   * call prepareForCommit() to submit the check for approval and update Taccounts.
   * <p>
   * This method override must call the super.createCheck() method.
   * <p>
   * Also, copies the EFTData from the primary CheckPayee to the Check.  Failing that,
   * copies the EFTData from the most recently created or update EFTData record.
   *
   * @return new check, which is also stored inside the CheckCreator for the subsequent call to prepareForCommit()
   */
  override function createCheck() : Check {
    var check = super.createCheck()
    if (this.PrimaryCheckPayee.Payee.EFTRecords.hasMatch(\ eft ->eft.IsPrimary))
      check.EFTData = this.PrimaryCheckPayee.Payee.EFTRecords.singleWhere(\ eft ->eft.IsPrimary)
    else if (this.PrimaryCheckPayee.Payee.EFTRecords.HasElements)
      check.EFTData = this.PrimaryCheckPayee.Payee.EFTRecords.maxBy(\ eft ->eft.UpdateTime)
    return check
  }

  /**
   * Prepares the previously created check for commit to the database. Call this
   * method after calling createCheck(), and after performing any modifications to the check,
   * such as adding additional Payments or TransactionLineItems.
   * This methods submits the check for approval and updates Taccounts.
   * <p>
   * <b>After calling this method, the check may not be modified, except for extension fields.</b>
   * 
   * @return newCheck
   */
  override function prepareForCommit() : Check {
    return super.prepareForCommit()
  }

}
