package libraries

@Export
enhancement PolicyUI : entity.Policy
{
  /*
   * Used by the EditableVehicleCoveragesLV list view to decide whether PIP specific fields should
   * be available
   */
  function isPIPCoverageType(type : CoverageType) : boolean {
    return type == TC_PAPIP_AR
      || type == TC_PAPIP_DC
      || type == TC_PAPIP_DE
      || type == TC_PAPIP_FL
      || type == TC_PAPIP_HI
      || type == TC_PAPIP_KS
      || type == TC_PAPIP_KY
      || type == TC_PAPIP_MA
      || type == TC_PAPIP_MD
      || type == TC_PAPIP_MI
      || type == TC_PAPIP_MN
      || type == TC_PAPIP_ND
      || type == TC_PAPIP_NJ
      || type == TC_PAPIP_NY
      || type == TC_PAPIP_OR
      || type == TC_PAPIP_PA
      || type == TC_PAPIP_TX
      || type == TC_PAPIP_UT
      || type == TC_PAPIP_WA
      || type == TC_CAPIP_DE
      || type == TC_CAPIP_FL
      || type == TC_CAPIP_HI
      || type == TC_CAPIP_KS
      || type == TC_CAPIP_KY
      || type == TC_CAPIP_MA
      || type == TC_CAPIP_MD
      || type == TC_CAPIP_MI
      || type == TC_CAPIP_MN
      || type == TC_CAPIP_ND
      || type == TC_CAPIP_NJ
      || type == TC_CAPIP_NY
      || type == TC_CAPIP_OR
      || type == TC_CAPIP_PA
      || type == TC_CAPIP_TX
      || type == TC_CAPIP_UT
      || type == TC_CAPIP_WA
      || type == TC_CA_PIP_AR
      || type == TC_CA_PIP_DC
  }

  /*
   * The following methods are used to categorize a variety of state-specific PIP coverages into a smaller number 
   * of simple groups so that various rules and UI pages can ask whether the current coverage provides death benefits 
   * or lost wages, for example.
   */
  function coversPIPBasics(type : CoverageType) : boolean {
    return isPIPCoverageType(type)
  }
  
  function coversPIPWageLoss(type : CoverageType) : boolean {
    return type == TC_PAPIP_AR
      || type == TC_PAPIP_DC
      || type == TC_PAPIP_DE
      || type == TC_PAPIP_FL
      || type == TC_PAPIP_HI
      || type == TC_PAPIP_KS
      || type == TC_PAPIP_KY
      || type == TC_PAPIP_MA
      || type == TC_PAPIP_MD
      || type == TC_PAPIP_MI
      || type == TC_PAPIP_MN
      || type == TC_PAPIP_ND
      || type == TC_PAPIP_NY
      || type == TC_PAPIP_OR
      || type == TC_PAPIP_PA
      || type == TC_PAPIP_UT
      || type == TC_PAPIP_WA
      || type == TC_CAPIP_DE
      || type == TC_CAPIP_FL
      || type == TC_CAPIP_HI
      || type == TC_CAPIP_KS
      || type == TC_CAPIP_KY
      || type == TC_CAPIP_MA
      || type == TC_CAPIP_MD
      || type == TC_CAPIP_MI
      || type == TC_CAPIP_MN
      || type == TC_CAPIP_ND
      || type == TC_CAPIP_NY
      || type == TC_CAPIP_OR
      || type == TC_CAPIP_PA
      || type == TC_CAPIP_UT
      || type == TC_CAPIP_WA
      || type == TC_CA_PIP_AR
      || type == TC_CA_PIP_DC
  }
  
  function coversPIPExtraMedical(type : CoverageType) : boolean {
    return type == TC_PAPIP_AR
      || type == TC_PAPIP_DC
      || type == TC_PAPIP_DE
      || type == TC_PAPIP_FL
      || type == TC_PAPIP_HI
      || type == TC_PAPIP_KS
      || type == TC_PAPIP_KY
      || type == TC_PAPIP_MA
      || type == TC_PAPIP_MD
      || type == TC_PAPIP_MI
      || type == TC_PAPIP_MN
      || type == TC_PAPIP_ND
      || type == TC_PAPIP_NJ
      || type == TC_PAPIP_NY
      || type == TC_PAPIP_OR
      || type == TC_PAPIP_PA
      || type == TC_PAPIP_TX
      || type == TC_PAPIP_UT
      || type == TC_PAPIP_WA
      || type == TC_CAPIP_DE
      || type == TC_CAPIP_FL
      || type == TC_CAPIP_HI
      || type == TC_CAPIP_KS
      || type == TC_CAPIP_KY
      || type == TC_CAPIP_MA
      || type == TC_CAPIP_MD
      || type == TC_CAPIP_MI
      || type == TC_CAPIP_MN
      || type == TC_CAPIP_ND
      || type == TC_CAPIP_NJ
      || type == TC_CAPIP_NY
      || type == TC_CAPIP_OR
      || type == TC_CAPIP_PA
      || type == TC_CAPIP_TX
      || type == TC_CAPIP_UT
      || type == TC_CAPIP_WA
      || type == TC_CA_PIP_AR
      || type == TC_CA_PIP_DC
  }
  
  function coversPIPAddlServices(type : CoverageType) : boolean {
    return type == TC_PAPIP_DE
      || type == TC_PAPIP_KS
      || type == TC_PAPIP_MA
      || type == TC_PAPIP_MD
      || type == TC_PAPIP_MI
      || type == TC_PAPIP_MN
      || type == TC_PAPIP_ND
      || type == TC_PAPIP_NY
      || type == TC_PAPIP_OR
      || type == TC_PAPIP_WA
      || type == TC_CAPIP_DE
      || type == TC_CAPIP_KS
      || type == TC_CAPIP_MA
      || type == TC_CAPIP_MD
      || type == TC_CAPIP_MI
      || type == TC_CAPIP_MN
      || type == TC_CAPIP_ND
      || type == TC_CAPIP_NY
      || type == TC_CAPIP_OR
      || type == TC_CAPIP_WA
  }
  
  function coversPIPDeathBenefits(type : CoverageType) : boolean {
    return type == TC_PAPIP_AR
      || type == TC_PAPIP_FL
      || type == TC_PAPIP_HI
      || type == TC_PAPIP_NJ
      || type == TC_PAPIP_NY
      || type == TC_PAPIP_PA
      || type == TC_CAPIP_FL
      || type == TC_CAPIP_HI
      || type == TC_CAPIP_NJ
      || type == TC_CAPIP_NY
      || type == TC_CAPIP_PA
      || type == TC_CA_PIP_AR
  }
  
  function coversPIPFuneralExpenses(type : CoverageType) : boolean {
    return type == TC_PAPIP_DC
      || type == TC_PAPIP_DE
      || type == TC_PAPIP_HI
      || type == TC_PAPIP_KS
      || type == TC_PAPIP_KY
      || type == TC_PAPIP_MA
      || type == TC_PAPIP_MI
      || type == TC_PAPIP_MN
      || type == TC_PAPIP_NJ
      || type == TC_PAPIP_OR
      || type == TC_PAPIP_PA
      || type == TC_PAPIP_UT
      || type == TC_PAPIP_WA
      || type == TC_CAPIP_DE
      || type == TC_CAPIP_HI
      || type == TC_CAPIP_KS
      || type == TC_CAPIP_KY
      || type == TC_CAPIP_MA
      || type == TC_CAPIP_MI
      || type == TC_CAPIP_MN
      || type == TC_CAPIP_NJ
      || type == TC_CAPIP_OR
      || type == TC_CAPIP_PA
      || type == TC_CAPIP_UT
      || type == TC_CAPIP_WA
      || type == TC_CA_PIP_DC
  }
  
}