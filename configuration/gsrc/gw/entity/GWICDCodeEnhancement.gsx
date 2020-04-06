package gw.entity

@Export
enhancement GWICDCodeEnhancement : entity.ICDCode {

  /**
   * Returns the Code with the trailing dot removed, if present. The ICD-10 data includes codes that represent
   * categories (for example, "D53."). Some contexts, such as the WHO's ICD-10 website, refer to the codes without
   * the dot.
   */
  property get CodeTrimmed() : String {
    return this.Code.chomp(".")
  }

}
