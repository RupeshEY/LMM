package gw.entity

uses gw.api.financials.DeleteCheckMethods
uses gw.api.extension.ExtensionInterfaces

@Export
class DeleteCheckMethodsImpl implements DeleteCheckMethods {
  var _check : Check

  construct( check : Check ) {
    _check = check
  }

  override function delete() {
    _check.unlinkServiceRequestInvoicesForDelete()
    _check.coreDelete()
  }
}