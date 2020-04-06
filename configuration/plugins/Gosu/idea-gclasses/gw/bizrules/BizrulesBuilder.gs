package gw.bizrules

uses java.lang.IllegalStateException

/**
 * Abstract class that is the base of Bizrules builders for Activity Rules
 */
@Export
abstract class BizrulesBuilder {

  /**
   * Method to check if the rule passes bizrules validations
   * @param head ActivityRuleHead signifying a rule that needs to be validated
   */
  protected static function isRuleValid(head : ActivityRuleHead) {
    if (!head.getHeadVersion().getRule().isValid()) {
      throw new IllegalStateException("Bizrules " + head.getHeadVersion().getRule().getName() + " is not valid")
    }
  }
}