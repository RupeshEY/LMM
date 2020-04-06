package gw.acc.iplm.enhancements

uses gw.api.financials.CurrencyAmount

enhancement ECFScriptParametersEnhancement: ScriptParameters {

  public static property get ClaimNotify_EEvent_TimeOut_Hours(): Integer {
    return ScriptParameters.getParameterValue("ClaimNotify_EEvent_TimeOut_Hours") as Integer
  }

  public static property get ECFClaimReserveAmountThreshold(): CurrencyAmount {
    return ScriptParameters.getParameterValue("ECFClaimReserveAmountThreshold") as CurrencyAmount
  }
}
