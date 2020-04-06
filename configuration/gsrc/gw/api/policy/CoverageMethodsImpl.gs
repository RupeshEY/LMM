package gw.api.policy

@Export
class CoverageMethodsImpl implements CoverageMethods {

  var _coverage : Coverage

  construct(coverage : Coverage) {
    this._coverage = coverage
  }

  override function allowCurrencyChange(): boolean {

    // If no Currency has been set on this Coverage yet, or if it has no Deductible set on it, we allow the Currency
    // to be changed.
    if(_coverage.Currency == null or _coverage.ClaimDeductible == null) {
      return true
    }

    // If the Deductible has already been paid out, we don't want to allow the Coverage Currency to be changed.
    return not _coverage.ClaimDeductible.Paid
  }

}