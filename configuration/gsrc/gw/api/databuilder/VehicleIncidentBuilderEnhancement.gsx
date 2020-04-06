package gw.api.databuilder
uses java.util.Date

@Export
enhancement VehicleIncidentBuilderEnhancement : VehicleIncidentBuilder {

  public function withSpeed(speed : int) : VehicleIncidentBuilder {
    this.set(VehicleIncident#Speed, speed)
    return this
  }  
  
  public function withCollisionPoint(collisionPoint : CollisionPoint) : VehicleIncidentBuilder {
    this.set(VehicleIncident#CollisionPoint, collisionPoint)
    return this
  }
  
  public function withDateSalvageAssigned(dateSalvageAssigned : Date) : VehicleIncidentBuilder {
    this.set(VehicleIncident#DateSalvageAssigned, dateSalvageAssigned)
    return this
  }
  
  public function withDriverRelation(driverRelation : PersonRelationType) : VehicleIncidentBuilder {
    this.set(VehicleIncident#DriverRelation, driverRelation)
    return this
  }

  function withVehicleLossParty(vehicleLossParty : LossPartyType) : VehicleIncidentBuilder {
    this.set(VehicleIncident#VehicleLossParty, vehicleLossParty)
    return this
  }

  public function withOwnersPermission(ownersPermission : Boolean) : VehicleIncidentBuilder {
    this.set(VehicleIncident#OwnersPermission, ownersPermission)
    return this
  }

  public function withRecoveryDate(recoveryDate : Date) : VehicleIncidentBuilder {
    this.set(VehicleIncident#RecovDate,recoveryDate)
    return this
  }

  public function withTotalLoss(totalLoss : Boolean) : VehicleIncidentBuilder {
    this.set(VehicleIncident#TotalLoss, totalLoss)
    return this
  }

  public function withVehicleDirection(vehicleDirection : VehicleDirection) : VehicleIncidentBuilder {
    this.set(VehicleIncident#VehicleDirection, vehicleDirection)
    return this
  }
  
  public function withVehicleUseReason(vehicleUseReason : ReasonForUse) : VehicleIncidentBuilder {
    this.set(VehicleIncident#VehicleUseReason, vehicleUseReason)
    return this
  }

  public function withRecovCondType(recovCondType : RecovCondType) : VehicleIncidentBuilder { 
    this.set(VehicleIncident#RecovCondType, recovCondType)
    return this
  }
}
