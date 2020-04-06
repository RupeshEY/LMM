package gw.entity

uses gw.api.util.Math

/**
 * Enhancement on the User entity which adds several methods related to Weighted Workload Assignment.
 */
@Export
enhancement GWUserWorkloadEnhancement : entity.User {

  /**
   * Returns the total workload for a user, calculated in real time. The total workload is the sum of all workloads of the user
   * in all groups.  The value is zero if this user is ineligible.  Total Workload is always a non-negative, non-null value.  Because this
   * method calculates the total user weight in real time, it uses considerably more resources than the virtual property TotalUserWorkload.
   *
   */
  public function calculateTotalUserWorkload() : int {
    var result = 0    
    if (canHaveWorkload()) {
      for (gu in this.GroupUsers) {
        result += Math.Nz(gu.calculateWorkload())
      }    
    }
    return result
  }

  
  /**
   * Virtual property which returns the total workload for a user, based on previously calculated workload. The total workload is the sum of all workloads
   * of the user in all groups.  The value is zero if this user is ineligible.  Total Workload is always a non-negative, non-null value.
   * 
   */
  public property get TotalUserWorkload() : int {
    var result = 0
    if (canHaveWorkload()) {
      for (gu in this.GroupUsers) {
        if (gu.GroupUserWorkload != null) {
          result += Math.Nz(gu.GroupUserWorkload.Workload)
        }
      }
    }
    return result
  }

  /**
   * Returns true if the User's state makes them eligible to have weighted workload. A user
   * is eligible if and only if they are Active
   */
  public function canHaveWorkload() : boolean {
    return this.Credential.Active
  }
}

