package gw.api.financials

uses gw.api.util.AttachableProperty

@Export
class TransactionApprovalRuleParameters {

  public static final var CheckSetRequiresApprovalForDuplicateChecks : AttachableProperty<CheckSet, Boolean> =
          new AttachableProperty<CheckSet, Boolean>(Boolean.FALSE)

}
