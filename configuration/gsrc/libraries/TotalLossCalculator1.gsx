package libraries

@Export
enhancement TotalLossCalculator1 : entity.Exposure {

  function totalLossCalculatorPreUpdate() { 	
    // only applies to Auto LOB
    if (this.Claim.LossType == LossType.TC_AUTO && this.VehicleIncident != null) {
      this.VehicleIncident.TotalLossCalculatorPreUpdate();
    }
  }
}