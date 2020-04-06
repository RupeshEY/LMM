package gw.bizrules.domain

enhancement GWRuleImportTaskEntryEnhancement: RuleImportTaskEntry {
  /**
   * Whether the {@link RuleImportTaskEntry#getExistingVersion() existing rule
   * version} of this import task is in {@link RuleStatus#TC_DRAFT draft}
   * status.
   */
  property get ExistingVersionDraft(): boolean {
    return this.ExistingVersion.Draft
  }
}
