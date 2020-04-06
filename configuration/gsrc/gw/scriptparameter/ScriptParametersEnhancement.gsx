package gw.scriptparameter

uses java.lang.Integer

@Export
enhancement ScriptParametersEnhancement: ScriptParameters {

  public static property get InitialReserve_AutoMediumVehicleDamageInspection(): Integer {
    return ScriptParameters.getParameterValue("InitialReserve_AutoMediumVehicleDamageInspection") as Integer;
  }

  public static property get InitialReserve_AutoMajorVehicleDamageBody(): Integer {
    return ScriptParameters.getParameterValue("InitialReserve_AutoMajorVehicleDamageBody") as Integer;
  }

  public static property get InitialReserve_AutoMinorVehicleDamageBody(): Integer {
    return ScriptParameters.getParameterValue("InitialReserve_AutoMinorVehicleDamageBody") as Integer;
  }

  public static property get InitialReserve_AutoMediumVehicleDamageBody(): Integer {
    return ScriptParameters.getParameterValue("InitialReserve_AutoMediumVehicleDamageBody") as Integer;
  }

  public static property get InitialReserve_AutoMajorVehicleDamageInspection(): Integer {
    return ScriptParameters.getParameterValue("InitialReserve_AutoMajorVehicleDamageInspection") as Integer;
  }

  public static property get InitialReserve_AutoGlassVehicleDamage(): Integer {
    return ScriptParameters.getParameterValue("InitialReserve_AutoGlassVehicleDamage") as Integer;
  }

  public static property get SpecialInvestigation_CreateActivityForSupervisorThreshold(): Integer {
    return ScriptParameters.getParameterValue("SpecialInvestigation_CreateActivityForSupervisorThreshold") as Integer;
  }

  public static property get InitialReserve_TravelBaggageLoss(): Integer {
    return ScriptParameters.getParameterValue("InitialReserve_TravelBaggageLoss") as Integer;
  }

  public static property get UtilizeMatterBudget(): Boolean {
    return ScriptParameters.getParameterValue("UtilizeMatterBudget") as Boolean;
  }
}
