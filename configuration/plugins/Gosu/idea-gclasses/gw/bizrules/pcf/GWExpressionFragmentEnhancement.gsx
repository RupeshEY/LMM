package gw.bizrules.pcf

uses entity.ExpressionFragment
uses gw.api.locale.DisplayKey

enhancement GWExpressionFragmentEnhancement: ExpressionFragment {
  // TODO: make sure GosuTextBuilder.DisplayText is really the text we need in all [corner] cases
  public property get DisplayText(): String {
    var text = com.guidewire._generated.entity.ExpressionFragmentInternalAccess.FRIEND_ACCESSOR.access().getInternalInterface(this).DisplayText
    if (this typeis CodeExpressionFragment) {
      return DisplayKey.get("BizRules.FormulaPrefix", text)
    }
    return text
  }
}
