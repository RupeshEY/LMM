package gw.bizrules.pcf

@Export
enhancement CCExpressionFragmentEnhancement: ExpressionFragment {
  public property get IntegerValue(): Integer {
    var text = (this as CodeExpressionFragment).CodeText
    return text!=null?Integer.valueOf(text):null
  }
  public property get BooleanValue(): Boolean {
    var text = (this as CodeExpressionFragment).CodeText
    return text!=null?Boolean.valueOf(text):null
  }
}
