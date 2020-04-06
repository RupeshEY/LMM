package gw.bizrules.domain

enhancement GWRuleVersionEnhancement: RuleVersion {
  /**
   * Whether this version of a {@link Rule} is in {@link RuleStatus#TC_DRAFT
   * draft} {@link RuleVersion#getStatus() status}.
   */
  property get Draft(): boolean {
    return this.Status == TC_DRAFT
  }
}
