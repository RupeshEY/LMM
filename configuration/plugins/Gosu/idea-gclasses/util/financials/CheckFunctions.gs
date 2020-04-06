package util.financials;

@Export
class CheckFunctions
{
  construct()
  {
  }

  /**
   * @deprecated use check.handleOnPickForPayee(Check.FirstPayee)
   */
  public static function handleOnPickForPrimaryPayee(chk : Check) {
    chk.handleOnPickForPayee(chk.FirstPayee)
  }

  /**
   * @deprecated use check.handleOnPickForPayee(checkPayee)
   */
  public static function handleOnPickForJointPayees(chk: Check, checkPayee : CheckPayee) {
    chk.handleOnPickForPayee(checkPayee)
  }
}
