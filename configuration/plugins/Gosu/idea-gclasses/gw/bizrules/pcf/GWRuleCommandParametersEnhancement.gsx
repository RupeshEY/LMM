package gw.bizrules.pcf

enhancement GWRuleCommandParametersEnhancement: entity.RuleCommandParameter[] {
  public property get ParameterMap(): Map<String, RuleCommandParameter> {
    var map = new HashMap<String, RuleCommandParameter>()
    this.each(\p -> map.put(p.ParameterName, p))
    return map
  }
}
