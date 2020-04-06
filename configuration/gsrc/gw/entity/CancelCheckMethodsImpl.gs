package gw.entity
uses gw.api.financials.CancelCheckMethods
uses gw.api.extension.ExtensionInterfaces

@Export
class CancelCheckMethodsImpl implements CancelCheckMethods {

  var _check : Check

  construct( check : Check ) {
    _check = check
  }

  override function voidCheck() {
    _check.unlinkDeductibles()
    _check.unlinkServiceRequestInvoicesForVoid()
    try {
      _check.coreVoidCheck()
    } catch ( e : java.lang.Throwable ) {
      e.printStackTrace()
      throw e
    }
  }

  override function stopCheck() {
    _check.unlinkDeductibles()
    _check.unlinkServiceRequestInvoicesForStop()
    _check.coreStopCheck()
  }

  override function voidAndReissue( oldCheck : Check ) {
    // don't unlink deductibles, since the payments will be copied to the new check
    _check.coreVoidAndReissue( oldCheck )
  }

  override function stopAndReissue( oldCheck : Check ) {
    // don't unlink deductibles, since the payments will be copied to the new check
    _check.coreStopAndReissue( oldCheck )
  }

}
