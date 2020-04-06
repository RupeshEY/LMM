package gw.api.financials

@Export
class DeductibleUnlinkMethodsImpl implements DeductibleUnlinkMethods {

  var _deductible : Deductible

  construct( deductible : Deductible ) {
    _deductible = deductible
  }

  override function unlinkTransactionLineItems() {
    for (tli in _deductible.TransactionLineItems) {
      if (tli.LineCategory == LineCategory.TC_DEDUCTIBLE) {
        tli.LineCategory = LineCategory.TC_FORMERDEDUCTIBLE
      }
      tli.Deductible = null
    }
    _deductible.Paid = false
  }
}
