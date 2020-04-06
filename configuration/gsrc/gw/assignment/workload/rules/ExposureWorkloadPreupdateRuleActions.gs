package gw.assignment.workload.rules

/**
 * Exposure Preupdate rule actions for workload weight assignment calculation and syncronization.
 * This class and its methods should not be used outside of Rules.
 */
@Export
public class ExposureWorkloadPreupdateRuleActions extends WorkloadPreupdateRuleActionsBase {

  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
  public construct(exposure : Exposure) {
    super(exposure)
  }


  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the representation of the Exposure being updated as it would appear in logs.
   */
  public static function getExposureNameForLogging(exposure : Exposure) : String{
     return exposure.DisplayName
  }


  /**
   * Recalculates and synchronizes User workload after a given Exposure has been closed.
   * 
   * @param Exposure that has been closed.
   */
  public static function updateUserWorkloadOnExposureClose(exposure : Exposure) {
    new ExposureWorkloadPreupdateRuleActions(exposure).updateUserWorkload()
  }


  /**
   * Recalculates and synchronizes User workload after a given Exposure has been reassigned.
   * The previously assignee's workload will also be recalculated and resynced.
   * 
   * @param Exposure that has been closed.
   */
  public static function updateUserWorkloadOnExposureReassignment(exposure : Exposure) {
    new ExposureWorkloadPreupdateRuleActions(exposure).updateUserWorkloadOnReassignment()
  }


  /**
   * Recalculates and synchronizes User workload after a given Exposure has been reopened.
   * 
   * @param Exposure that has been reopened.
   */
  public static function updateUserWorkloadOnExposureReopen(exposure : Exposure) {
    new ExposureWorkloadPreupdateRuleActions(exposure).updateUserWorkload()
  }


  /**
   * Recalculates and synchronizes User workload after an Exposure has been created.
   * 
   * @param The new Exposure.
   */
  public static function updateUserWorkloadOnNewExposure(exposure : Exposure) {
    new ExposureWorkloadPreupdateRuleActions(exposure).syncWorkload()
  }


  /**
   * Recalculates and synchronizes User workload after a given Exposure's attributes has been modified.
   * 
   * @param Exposure that has been modified.
   */
  public static function updateUserWorkloadOnExposureModification(exposure : Exposure) {
    new ExposureWorkloadPreupdateRuleActions(exposure).updateUserWorkload()
  }


  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Protected Methods
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  protected override function calculateWeight() : int {
    return (WeightedAssignable as Exposure).calculateWeight()
  }


  protected override property get WeightedAssignableLogIdentifier() : String {
    return getExposureNameForLogging(WeightedAssignable as Exposure)
  }


  protected override function syncWorkload() : int {
    var exposure = (WeightedAssignable as Exposure)
    var workload = exposure.syncWorkload()
    exposure.Claim.syncWorkload()
    return workload
  }
}
