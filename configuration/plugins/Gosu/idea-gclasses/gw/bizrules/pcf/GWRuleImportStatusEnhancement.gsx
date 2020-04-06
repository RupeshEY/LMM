package gw.bizrules.pcf

enhancement GWRuleImportStatusEnhancement: typekey.RuleImportStatus {
  property get Final(): boolean {
    return RuleImportStatus.TF_FINALSTATUS.TypeKeys.contains(this)
  }

  property get Conflict(): boolean {
    return this == TC_CONFLICT || this == TC_RESOLVEDCONFLICT
  }
}